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
        init          = new HashSet<String>();
        breakTargetStack = new Stack<BreakTarget>();
        unusedLocals = new HashMap<String,Integer>();
        unusedClasses = new HashSet<String>();
    }


    @Override
    public Object visit(Program p)
    {
        // add all classEnv entries to unusedClasses
        for (String className : classEnv.keySet()) 
        {
            unusedClasses.add(className);
        }

        unusedClasses.remove("Object");
        unusedClasses.remove("String");
        unusedClasses.remove("Lib");
        unusedClasses.remove("RunMain");

        p.classDecls.accept(this);
        p.mainStmt.accept(this);

        // warnings for uused classes
        for (String className : unusedClasses) 
        {
            ClassDecl c = classEnv.get(className);
            if (c != null) 
            {
                errorMsg.warning(c.pos, CompWarning.UnusedClass(className));
            }
        }
        return null;
    }

    @Override
    public Object visit(ClassDecl n)
    {
        currentClass = n;
        // Remove this class from the set of unused classes
        unusedClasses.remove(n.superName); 

        n.decls.accept(this);
        return null;
    }

    private void resetMethodScope() 
    {
        localEnv = new HashMap<>();
        init = new HashSet<>();
        unusedLocals = new HashMap<>();
    }

    @Override
    public Object visit(MethodDeclVoid n)
    {
        // Reset for void method
        resetMethodScope();

        n.params.accept(this);
        n.stmts.accept(this);

        // warn for unused local variables
        for (String varName : unusedLocals.keySet()) 
        {
            int pos = unusedLocals.get(varName);
            errorMsg.warning(pos, CompWarning.UnusedVariable(varName));
        }

        return null;
    }

    @Override
    public Object visit(MethodDeclNonVoid n)
    {
        // Reset for non-void method
        resetMethodScope();

        n.rtnType.accept(this);
        n.params.accept(this);
        n.stmts.accept(this);
        n.rtnExp.accept(this);

        // warn for unused local variables
        for (String varName : unusedLocals.keySet()) 
        {
            int pos = unusedLocals.get(varName);
            errorMsg.warning(pos, CompWarning.UnusedVariable(varName));
        }

        return null;
    }

    @Override
    public Object visit(LocalVarDecl n)
    {
        // Check for duplicate variable name in the method
        if (localEnv.containsKey(n.name)) 
        {
            errorMsg.error(n.pos, CompError.DuplicateVariable(n.name));
        }
        else 
        {
            localEnv.put(n.name, n);
            unusedLocals.put(n.name, n.pos);
        }
        n.initExp.accept(this);
        return null;
    }

    // @Override
    // public Object visit(LocalDeclStmt n)
    // {
    //     boolean isDuplicate = localEnv.containsKey(n.name);

    //     if (isDuplicate) {
    //         errorMsg.error(n.pos, CompError.DuplicateVariable(n.name));
    //     } else {
    //         localEnv.put(n.name, n);
    //         unusedLocals.put(n.name, n.pos);
    //     }
    //     n.initExp.accept(this);
    //     n.type.accept(this);

    //     if (!isDuplicate) {
    //         init.add(n.name);
    //     }
    //     return null;
    // }

    @Override
    public Object visit(ParamDecl n) {
        
        if (localEnv.containsKey(n.name)) {
            errorMsg.error(n.pos, CompError.DuplicateVariable(n.name));
        }
        else {
            localEnv.put(n.name, n);
            init.add(n.name);
            unusedLocals.put(n.name, n.pos);
        }
        n.type.accept(this);
        return null;
    }
    

    @Override
    public Object visit(Block n)
    {
        HashSet<String> savedInit = new HashSet<>(init);

        HashMap<String, VarDecl> savedEnv = new HashMap<>(localEnv);
        
        n.stmts.accept(this);
        localEnv = savedEnv;
        init = savedInit;
        return null;
    }

    @Override
    public Object visit(While n)
    {
        n.exp.accept(this);
        breakTargetStack.push(n);
        n.body.accept(this);
        breakTargetStack.pop();
        return null;
    }

    @Override
    public Object visit(Switch n)
    {
        n.exp.accept(this);
        breakTargetStack.push(n);
 
        HashMap<String, VarDecl> savedEnv  = new HashMap<>(localEnv);
        HashSet<String>          savedInit = new HashSet<>(init);
        ArrayList<String>        chunkVars = new ArrayList<>();
 
        for (Stmt stmt : n.stmts) {
            if (stmt instanceof Label) {
                ((Label) stmt).enclosingSwitch = n;
            }
            stmt.accept(this);
            if (stmt instanceof LocalDeclStmt) {
                chunkVars.add(((LocalDeclStmt) stmt).localVarDecl.name);
            }
            if (stmt instanceof Break) {
                flushChunkVars(chunkVars);
                chunkVars.clear();
            }
        }
 
        localEnv = savedEnv;
        init     = savedInit;
        breakTargetStack.pop();
        return null;
    }

    private void flushChunkVars(ArrayList<String> chunkVars) {
        for (String var : chunkVars) {
            if (unusedLocals.containsKey(var)) {
                errorMsg.warning(unusedLocals.get(var), CompWarning.UnusedVariable(var));
                unusedLocals.remove(var);
            }
            localEnv.remove(var);
            init.remove(var);
        }
    }

    

    @Override
    public Object visit(Break n)
    {
        // Check if the break is inside a while or switch
        if (breakTargetStack.isEmpty()) {
            errorMsg.error(n.pos, CompError.TopLevelBreak());
        } else {
            // Link the break to its enclosing while or switch
            n.breakLink = breakTargetStack.peek();
        }
        return null;
    }

    @Override
    public Object visit(IDExp n) {
        if (resolveLocal(n) || resolveField(n)) return null;
        errorMsg.error(n.pos, CompError.UndefinedVariable(n.name));
        return null;
    }
 
    private boolean resolveLocal(IDExp n) {
        VarDecl decl = localEnv.get(n.name);
        if (decl == null) return false;
        if (!init.contains(n.name)) {
            errorMsg.error(n.pos, CompError.UninitializedVariable(n.name));
        }
        n.link = decl;
        unusedLocals.remove(n.name);
        return true;
    }
 
    private boolean resolveField(IDExp n) {
        VarDecl decl = lookupField(n.name, currentClass);
        if (decl == null) return false;
        n.link = decl;
        return true;
    }
 
    private VarDecl lookupField(String name, ClassDecl cd) {
        for (ClassDecl cur = cd; cur != null; cur = cur.superLink) {
            FieldDecl fd = cur.fieldEnv.get(name);
            if (fd != null) return fd;
        }
        return null;
    }

    @Override
    public Object visit(IDType n)
    {
        // Look up the type in the class environment
        ClassDecl classDecl = classEnv.get(n.name);
        
        if (classDecl == null) {
            // Type not found - report undefined class error
            errorMsg.error(n.pos, CompError.UndefinedClass(n.name));
        } else {
            // Link the IDType to its class declaration
            n.link = classDecl;
            unusedClasses.remove(n.name); 
        }

        return null;
    }

}
