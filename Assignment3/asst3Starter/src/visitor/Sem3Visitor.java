// Author: Chengen Li
package visitor;

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
        init = new HashSet<>();
        unusedLocals = new HashMap<>();
        unusedClasses = new HashSet<>();
        
        
    }

    // populate unused classes set, visit everything and warn leftover unused
    @Override
    public Object visit(Program n) {
        unusedClasses.clear();
        for (Map.Entry<String,ClassDecl> e : classEnv.entrySet())
        {
            ClassDecl cd = e.getValue();
            if (cd != null && cd.pos >= 0)
            {
                unusedClasses.add(e.getKey());
            }
        }
        

        n.classDecls.accept(this);
        n.mainStmt.accept(this);

        unnusedClassesWarning();
        return null;
    }

    // helper for warning unused classes at end of traversal
    private void unnusedClassesWarning() {
        for (String id : unusedClasses) {
            ClassDecl cd = classEnv.get(id);
            if (cd != null) {
                errorMsg.warning(cd.pos, CompWarning.UnusedClass(id));
            }
        }
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
        resetScope();
        n.params.accept(this);
        n.stmts.accept(this);

        unusedVarsWarning();
        return null;
    }

    // Reset scope for new non-void method and warn unused vars at end
    @Override
    public Object visit(MethodDeclNonVoid n) {
        resetScope();
        n.rtnType.accept(this);
        n.rtnExp.accept(this);
        n.params.accept(this);
        n.stmts.accept(this);
        
        unusedVarsWarning();
        return null;
    }

    // Reset scope for constructor and warn unused vars at end
    private void resetScope() {
        localEnv = new HashMap<>();
        init = new HashSet<>();
        unusedLocals = new HashMap<>();
    }

    // report any vars still in unused set
    // private void warnUnusedVars() {
    //     for (Map.Entry<String,Integer> entry : unusedLocals.entrySet()) 
    //     {
    //         errorMsg.warning(entry.getValue(), CompWarning.UnusedVariable(entry.getKey()));
    //     }
    // }
    // different way of warnUnsedVars
    private void unusedVarsWarning() {
        for (String var : unusedLocals.keySet()) {
            errorMsg.warning(unusedLocals.get(var), CompWarning.UnusedVariable(var));
        }
    }

    // Register param in local scope, mark initialized and track usage
    @Override
    public Object visit(ParamDecl n) 
    {
        n.type.accept(this);
        if (localEnv.containsKey(n.name)) 
        {
            errorMsg.error(n.pos, CompError.DuplicateVariable(n.name));
        }
        else 
        {
            localEnv.put(n.name, n);
            init.add(n.name);
            unusedLocals.put(n.name, n.pos);
        }
        return null;
    }

    // Handle block scoping by saving and restoring 
    @Override
    public Object visit(Block n) {
        HashMap<String, VarDecl> localEnv = new HashMap<>(this.localEnv);
        HashSet<String> init = new HashSet<>(this.init);

        n.stmts.accept(this);

        this.localEnv = localEnv;
        this.init = init;

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
        else 
        {
            // in scope but not yet initialized
            localEnv.put(n.name, n);
            unusedLocals.put(n.name, n.pos);
            n.initExp.accept(this);
            n.type.accept(this);
            init.add(n.name);
        }
        return null;
    }

    // Traverse the chain and look for field by name
    private VarDecl checkField(String name, ClassDecl classDecl) {
        while (classDecl != null) {
            FieldDecl fieldDecl = classDecl.fieldEnv.get(name);
            if (fieldDecl != null) {
                return fieldDecl;
            }
            classDecl = classDecl.superLink;
        }
        return null;
    }

    // resolve variable: check locals first, then fields up hierarchy
    @Override
    public Object visit(IDExp n) {
        VarDecl varDecl = localEnv.get(n.name);
        if (varDecl != null) {
            //local found, check if initialized
            if (!init.contains(n.name) && varDecl instanceof LocalVarDecl) {
                errorMsg.error(n.pos, CompError.UninitializedVariable(n.name));
            }
            n.link = varDecl;
            unusedLocals.remove(n.name);
            return null;

            
        }
        // check fields up class hierarchy
        varDecl = checkField(n.name, currentClass);
        if (varDecl != null) {
            n.link = varDecl;
            return null;
        }
        errorMsg.error(n.pos, CompError.UndefinedVariable(n.name));
        return null;
    }
    

    // Resolve type name to class decl and mark class as used
    @Override
    public Object visit(IDType n) {
        ClassDecl decl = classEnv.get(n.name);
        if (decl == null) {

            errorMsg.error(n.pos, CompError.UndefinedClass(n.name));
        }
        else 
        {
            n.link = decl;
            unusedClasses.remove(n.name);        
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
        else 
        {
            n.breakLink = breakTargetStack.peek();
        }
        return null;
    }

    // Handle switch scoping and track vars declared in current chunk
    @Override
    public Object visit(Switch n) 
    {
        n.exp.accept(this);
        breakTargetStack.push(n);

        HashMap<String, VarDecl> savedEnv = new HashMap<>(localEnv);
        HashSet<String> savedInit = new HashSet<>(init);
        ArrayList<String> chunkVars = new ArrayList<>();

        for (Stmt stmt : n.stmts) {
            if (stmt instanceof Label) {
                ((Label) stmt).enclosingSwitch = n;
            }

            stmt.accept(this);

            if (stmt instanceof LocalDeclStmt) {
                chunkVars.add(((LocalDeclStmt) stmt).localVarDecl.name);
            }

            if (stmt instanceof Break) {
                flushSwitchChunkVariables(chunkVars);
            }
        }

        // restore scope after switch
        localEnv = savedEnv;
        init = savedInit;
        breakTargetStack.pop();
        return null;
    }

    // Helper to flush variables declared within a switch chunk
    private void flushSwitchChunkVariables(List<String> chunkVars) {
        for (String var : chunkVars) {
            Integer pos = unusedLocals.get(var);
            if (pos != null) {
                errorMsg.warning(pos, CompWarning.UnusedVariable(var));
                unusedLocals.remove(var);
            }
            localEnv.remove(var);
            init.remove(var);
        }
        chunkVars.clear();
    }

}
