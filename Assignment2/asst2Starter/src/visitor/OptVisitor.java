package visitor;

import syntaxtree.*;

public class OptVisitor extends Visitor
{

    private boolean _foundSomething;

    private Exp optimize(Exp e)
    {
        return (Exp)e.accept(this);
    }

    private Stmt optimize(Stmt s)
    {
        return (Stmt)s.accept(this);
    }

    private boolean isEmptyBlock(Stmt s)
    {
        return s instanceof Block &&
               ((Block)s).stmts.size() > 0;
    }

    public OptVisitor()
    {
        _foundSomething = false;
    }

    public void reset()
    {
        _foundSomething = false;
    }

    public boolean foundSomething()
    {
        return _foundSomething;
    }


    ////////////////////////////////////////////////////
    // Program
    ////////////////////////////////////////////////////

    public Object visit(MethodDeclNonVoid n)
    {
        visit((MethodDecl)n);
        n.rtnExp = optimize(n.rtnExp);
        return null;
    }

    public Object visit(LocalVarDecl n)
    {
        n.initExp = optimize(n.initExp);
        return null;
    }

    ////////////////////////////////////////////////////
    // Stmts
    ////////////////////////////////////////////////////

    public Object visit(Assign n)
    {
        n.lhs = optimize(n.lhs);
        n.rhs = optimize(n.rhs);
        return n;
    }

    public Object visit(Block n)
    {
        n.stmts.accept(this);
        return n;
    }

    public Object visit(CallStmt n)
    {
        // this one is more specific,
        // but I can't optimize a call expression away.
        n.callExp = (Call)optimize(n.callExp);
        return n;
    }

    public Object visit(LocalDeclStmt n)
    {
        n.localVarDecl.accept(this);
        return n;
    }

    public Object visit(If n)
    {
        n.exp = optimize(n.exp);
        n.trueStmt = optimize(n.trueStmt);
        n.falseStmt = optimize(n.falseStmt);
        if (n.exp instanceof True) {
            return n.trueStmt;
        }
        return n;
    }

    public Object visit(While n)
    {
        n.exp = optimize(n.exp);
        n.body = optimize(n.body);
        return n;
    }

    public Object visit(Break n)
    {
        return n;
    }

    public Object visit(Switch n)
    {
        n.exp = optimize(n.exp);
        n.stmts.accept(this);
        return n;
    }

    public Object visit(Case n)
    {
        n.exp = optimize(n.exp);
        return n;
    }

    public Object visit(Default n)
    {
        return n;
    }

    ////////////////////////////////////////////////////
    // Expressions
    ////////////////////////////////////////////////////


    public Object visit(ArrayLookup n)
    {
        n.arrExp = optimize(n.arrExp);
        n.idxExp = optimize(n.idxExp);
        return n;
    }

    public Object visit(Cast n)
    {
        n.castType.accept(this);
        n.exp = optimize(n.exp);
        return n;
    }

    public Object visit(Call n)
    {
        n.args.accept(this);
        n.obj = optimize(n.obj);
        return n;
    }

    public Object visit(FieldAccess n)
    {
        n.exp = optimize(n.exp);
        return n;
    }

    public Object visit(InstanceOf n)
    {
        n.exp = optimize(n.exp);
        n.checkType.accept(this);
        return n;
    }

    public Object visit(NewArray n)
    {
        n.objType.accept(this);
        n.sizeExp = optimize(n.sizeExp);
        return n;
    }

    public Object visit(NewObject n)
    {
        n.objType.accept(this);
        return n;
    }


    ////////////////////////////////////////////////////
    // Unary Expressions
    ////////////////////////////////////////////////////

    public Object visit(Not n)
    {
        n.exp = optimize(n.exp);
        return n;
    }
    public Object visit(ArrayLength n)
    {
        n.exp = optimize(n.exp);
        return n;
    }

    ////////////////////////////////////////////////////
    // Binary Expressions
    ////////////////////////////////////////////////////

    public Object visit(And n)
    {
        n.left = optimize(n.left);
        n.right = optimize(n.right);
        return n;
    }
    public Object visit(Equals n)
    {
        n.left = optimize(n.left);
        n.right = optimize(n.right);
        return n;
    }
    public Object visit(LessThan n)
    {
        n.left = optimize(n.left);
        n.right = optimize(n.right);
        return n;
    }
    public Object visit(GreaterThan n)
    {
        n.left = optimize(n.left);
        n.right = optimize(n.right);
        return n;
    }
    public Object visit(Minus n)
    {
        n.left = optimize(n.left);
        n.right = optimize(n.right);
        return n;
    }
    public Object visit(Or n)
    {
        n.left = optimize(n.left);
        n.right = optimize(n.right);
        return n;
    }
    public Object visit(Plus n)
    {
        n.left = optimize(n.left);
        n.right = optimize(n.right);
        // constant folding 
        if (n.left instanceof IntLit left) {
            if (n.right instanceof IntLit right) {
                return new IntLit(n.pos, left.val + right.val);
            }
        }
        return n;
    }
    public Object visit(Times n)
    {
        n.left = optimize(n.left);
        n.right = optimize(n.right);
        return n;
    }
    public Object visit(Divide n)
    {
        n.left = optimize(n.left);
        n.right = optimize(n.right);
        return n;
    }
    public Object visit(Remainder n)
    {
        n.left = optimize(n.left);
        n.right = optimize(n.right);
        return n;
    }

    ////////////////////////////////////////////////////
    // Leaf Expressions
    ////////////////////////////////////////////////////

    public Object visit(False n)     { return n; }
    public Object visit(Null n)      { return n; }
    public Object visit(Super n)     { return n; }
    public Object visit(This n)      { return n; }
    public Object visit(True n)      { return n; }
    public Object visit(IDExp n)     { return n; }
    public Object visit(IntLit n)    { return n; }
    public Object visit(StringLit n) { return n; }

    ////////////////////////////////////////////////////
    // Lists
    ////////////////////////////////////////////////////

    public Object visit(StmtList lst)
    {
        for(int i = 0; i < lst.size(); i++)
        {
            Stmt s = lst.get(i);
            if (isEmptyBlock(s)) {
                lst.remove(i);
            } else {
                lst.set(i, optimize(s));
            }
          
        }
        return null;
    }
    public Object visit(ExpList lst)
    {
        for(int i = 0; i < lst.size(); i++)
        {
            Exp e = lst.get(i);
            lst.set(i, optimize(e));
        }
        return null;
    }
}