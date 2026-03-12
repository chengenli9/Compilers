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
    }

    @Override
    public Object visit(Program p)
    {
        p.classDecls.accept(this);
        p.mainStmt.accept(this);
        return null;
    }

    @Override
    public Object visit(ClassDecl n)
    {
        currentClass = n;
        n.decls.accept(this);
        return null;
    }

    @Override
    public Object visit(MethodDeclVoid n)
    {
        // Push a new local variable environment for this method
        HashMap<String, VarDecl> savedEnv = localEnv;
        localEnv = new HashMap<String, VarDecl>();

        // Add formal parameters to the environment
        // Check for duplicate parameter names
        for (Object obj : n.params) {
            ParamDecl param = (ParamDecl) obj;
            if (localEnv.containsKey(param.name)) {
                errorMsg.error(param.pos, CompError.DuplicateVariable(param.name));
            } else {
                localEnv.put(param.name, param);
            }
            // Visit the parameter's type
            param.type.accept(this);
        }

        // Visit the method body
        n.stmts.accept(this);

        // Restore the previous environment
        localEnv = savedEnv;
        return null;
    }

    @Override
    public Object visit(MethodDeclNonVoid n)
    {
        // Push a new local variable environment for this method
        HashMap<String, VarDecl> savedEnv = localEnv;
        localEnv = new HashMap<String, VarDecl>();

        // Add formal parameters to the environment
        // Check for duplicate parameter names
        for (Object obj : n.params) {
            ParamDecl param = (ParamDecl) obj;
            if (localEnv.containsKey(param.name)) {
                errorMsg.error(param.pos, CompError.DuplicateVariable(param.name));
            } else {
                localEnv.put(param.name, param);
            }
            // Visit the parameter's type
            param.type.accept(this);
        }

        // Visit the method body
        n.stmts.accept(this);

        // Visit the return type and return expression
        n.rtnType.accept(this);
        n.rtnExp.accept(this);

        // Restore the previous environment
        localEnv = savedEnv;
        return null;
    }

    @Override
    public Object visit(LocalVarDecl n)
    {
        // Check for duplicate local variable names
        if (localEnv.containsKey(n.name)) {
            errorMsg.error(n.pos, CompError.DuplicateVariable(n.name));
        } else {
            localEnv.put(n.name, n);
        }

        // Visit the type
        n.type.accept(this);

        // Visit the initializer expression
        n.initExp.accept(this);

        return null;
    }

    @Override
    public Object visit(LocalDeclStmt n)
    {
        n.localVarDecl.accept(this);
        return null;
    }

    @Override
    public Object visit(Block n)
    {
        // For block, we don't create a new environment just for the block
        // Local variable declarations within a block are managed by LocalDeclStmt
        n.stmts.accept(this);
        return null;
    }

    @Override
    public Object visit(While n)
    {
        // Push the while statement onto the break target stack
        breakTargetStack.push(n);

        // Visit the test expression
        n.exp.accept(this);

        // Visit the body
        n.body.accept(this);

        // Pop the while statement from the break target stack
        breakTargetStack.pop();

        return null;
    }

    @Override
    public Object visit(Switch n)
    {
        // Push the switch statement onto the break target stack
        breakTargetStack.push(n);

        // Visit the switch expression
        n.exp.accept(this);

        // Visit the statements in the switch body
        n.stmts.accept(this);

        // Pop the switch statement from the break target stack
        breakTargetStack.pop();

        return null;
    }

    @Override
    public Object visit(Case n)
    {
        // Visit the case expression
        n.exp.accept(this);
        return null;
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
    public Object visit(IDExp n)
    {
        // Look up the variable in the local environment
        VarDecl varDecl = localEnv.get(n.name);
        
        if (varDecl == null) {
            // Variable not found - report undefined variable error
            errorMsg.error(n.pos, CompError.UndefinedVariable(n.name));
        } else {
            // Link the IDExp to its declaration
            n.link = varDecl;
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
        }

        return null;
    }

}
