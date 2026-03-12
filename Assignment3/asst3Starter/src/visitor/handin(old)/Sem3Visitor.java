package visitor.handin_old;

import syntaxtree.*;
import java.util.*;
import errorMsg.*;
// The purpose of this class is to:
// - link each variable reference to its corresponding VarDecl
//    (via its 'link' field)
//   - undefined variable names are reported
// - link each type reference to its corresponding ClassDecl
//   - undefined type names are reported
// - link each Break expression to its enclosing While or Case statement
//   - a break that is not inside any while loop or case is reported
// - report conflicting local variable names (including formal parameter names)
// - ensure that no instance variable has the name 'length'
public class Sem3Visitor extends Visitor
{
    // current class we're visiting
    ClassDecl currentClass;

    // environment for names of classes
    HashMap<String, ClassDecl> classEnv;

    // environment for names of variables
    HashMap<String, VarDecl> localEnv;

    // set of initialized variables
    HashSet<String> init;

    // set of unused classes
    HashSet<String> unusedClasses;

    // set of unused local variables
    // We use a hashmap so we can store the position where we found it for the error message.
    HashMap<String,Integer> unusedLocals;

    // stack of while/switch
    Stack<BreakTarget> breakTargetStack;

    //error message object
    ErrorMsg errorMsg;

    // constructor
    public Sem3Visitor(HashMap<String,ClassDecl> env, ErrorMsg e)
    {
        errorMsg         = e;
        currentClass     = null;
        classEnv         = env;
        localEnv         = new HashMap<String,VarDecl>();
        breakTargetStack = new Stack<BreakTarget>();
        unusedLocals     = new HashMap<>();
        unusedClasses    = new HashSet<>();
        init             = new HashSet<>();
    }

    // populate unused classes set, visit everything and warn leftover unused
    @Override
    public Object visit(Program n) {
        unusedClasses.addAll(classEnv.keySet());
        // remove predefined classes
        unusedClasses.remove("Object");
        unusedClasses.remove("String");
        unusedClasses.remove("Lib");
        unusedClasses.remove("RunMain");

        n.classDecls.accept(this);
        n.mainStmt.accept(this);

        // warn unused classes after full traversal
        for (String name : unusedClasses) {
            ClassDecl cd = classEnv.get(name);
            if (cd != null) {
                errorMsg.warning(cd.pos, CompWarning.UnusedClass(name));
            }
        }
        return null;
    }

    // Set current class and mark superclass as used
    @Override
    public Object visit(ClassDecl n) {
        currentClass = n;
        unusedClasses.remove(n.superName);
        n.decls.accept(this);
        return null;
    }

    // Reset scope for new void method and warn unused vars at end
    @Override
    public Object visit(MethodDeclVoid n) {
        localEnv = new HashMap<>();
        init = new HashSet<>();
        unusedLocals = new HashMap<>();
        n.params.accept(this);
        n.stmts.accept(this);
        warnUnusedVars();
        return null;
    }

    // Reset scope for new non-void method and warn unused vars at end
    @Override
    public Object visit(MethodDeclNonVoid n) {
        localEnv = new HashMap<>();
        init = new HashSet<>();
        unusedLocals = new HashMap<>();
        n.rtnType.accept(this);
        n.params.accept(this);
        n.stmts.accept(this);
        n.rtnExp.accept(this);
        warnUnusedVars();
        return null;
    }

    // report any vars still in unused set
    private void warnUnusedVars() {
        for (Map.Entry<String,Integer> entry : unusedLocals.entrySet()) {
            errorMsg.warning(entry.getValue(), CompWarning.UnusedVariable(entry.getKey()));
        }
    }

    // Register param in local scope, mark initialized and track usage
    @Override
    public Object visit(ParamDecl n) {
        n.type.accept(this);
        if (localEnv.containsKey(n.name)) {
            errorMsg.error(n.pos, CompError.DuplicateVariable(n.name));
        }
        else {
            localEnv.put(n.name, n);
            init.add(n.name);
            unusedLocals.put(n.name, n.pos);
        }
        return null;
    }

    // Save/restore scope around block for proper scoping
    @Override
    public Object visit(Block n) {
        HashMap<String, VarDecl> savedEnv = new HashMap<>(localEnv);
        HashSet<String> savedInit = new HashSet<>(init);
        n.stmts.accept(this);
        localEnv = savedEnv;
        init = savedInit;
        return null;
    }

    // Add var to scope before visiting init expr so self-refs
    // Resolve to this local and trigger uninitialized error
    @Override
    public Object visit(LocalVarDecl n) {
        if (localEnv.containsKey(n.name)) {
            errorMsg.error(n.pos, CompError.DuplicateVariable(n.name));
            n.initExp.accept(this);
            n.type.accept(this);
        }
        else {
            // in scope but not yet initialized
            localEnv.put(n.name, n);
            unusedLocals.put(n.name, n.pos);
            n.initExp.accept(this);
            n.type.accept(this);
            init.add(n.name);
        }
        return null;
    }

    // resolve variable: check locals first, then fields up hierarchy
    @Override
    public Object visit(IDExp n) {
        VarDecl decl = localEnv.get(n.name);
        if (decl != null) {
            // local found, check if initialized
            if (!init.contains(n.name)) {
                errorMsg.error(n.pos, CompError.UninitializedVariable(n.name));
            }
            n.link = decl;
            unusedLocals.remove(n.name);
            return null;
        }
        // check fields up class hierarchy
        decl = lookupField(n.name, currentClass);
        if (decl != null) {
            n.link = decl;
            return null;
        }
        errorMsg.error(n.pos, CompError.UndefinedVariable(n.name));
        return null;
    }
    // Traverse the chain and look for field by name
    private VarDecl lookupField(String name, ClassDecl cd) {
        while (cd != null) {
            FieldDecl fd = cd.fieldEnv.get(name);
            if (fd != null) {
                return fd;
            }
            cd = cd.superLink;
        }
        return null;
    }

    // Resolve type name to class decl and mark class as used
    @Override
    public Object visit(IDType n) {
        ClassDecl decl = classEnv.get(n.name);
        if (decl != null) {
            n.link = decl;
            unusedClasses.remove(n.name);
        }
        else {
            errorMsg.error(n.pos, CompError.UndefinedClass(n.name));
        }
        return null;
    }

    // Push while as break target and pop after body
    @Override
    public Object visit(While n) {
        n.exp.accept(this);
        breakTargetStack.push(n);
        n.body.accept(this);
        breakTargetStack.pop();
        return null;
    }

    // Link break to enclosing while/switch and error if none
    @Override
    public Object visit(Break n) {
        if (breakTargetStack.isEmpty()) {
            errorMsg.error(n.pos, CompError.TopLevelBreak());
        }
        else {
            n.breakLink = breakTargetStack.peek();
        }
        return null;
    }

    // Handle switch scoping and track vars declared in current chunk
    @Override
    public Object visit(Switch n) {
        n.exp.accept(this);
        breakTargetStack.push(n);

        HashMap<String, VarDecl> savedEnv = new HashMap<>(localEnv);
        HashSet<String> savedInit = new HashSet<>(init);
        ArrayList<String> chunkVars = new ArrayList<>();

        for (int i = 0; i < n.stmts.size(); i++) {
            Stmt stmt = n.stmts.get(i);
            if (stmt instanceof Label) {
                ((Label) stmt).enclosingSwitch = n;
            }
            stmt.accept(this);
            // track vars declared in this chunk
            if (stmt instanceof LocalDeclStmt) {
                chunkVars.add(((LocalDeclStmt) stmt).localVarDecl.name);
            }
            // warn about unused chunk vars
            if (stmt instanceof Break) {
                for (String var : chunkVars) {
                    if (unusedLocals.containsKey(var)) {
                        errorMsg.warning(unusedLocals.get(var), CompWarning.UnusedVariable(var));
                        unusedLocals.remove(var);
                    }
                    localEnv.remove(var);
                    init.remove(var);
                }
                chunkVars.clear();
            }
        }

        // restore scope after switch
        localEnv = savedEnv;
        init = savedInit;
        breakTargetStack.pop();
        return null;
    }

}
