package visitor;

import syntaxtree.*;
import errorMsg.ErrorMsg;

public class DumbVisitor extends Visitor
{

    private ErrorMsg _err;
    private String methodName;

    public DumbVisitor(ErrorMsg err)
    {
        _err = err;
    }

    public void vent()
    {
        _err.printMessages();
    }

    @Override
    public Object visit(If i)
    {
        i.exp.accept(this);  // visit(i.exp)
        i.trueStmt.accept(this);
        if(i.exp instanceof False)
        {
            _err.info(i.pos, "DUMB: You made an if that can't ever run!");
        }
        if(emptyBlock(i))
        {
            i.falseStmt.accept(this);
        }
        return null;
    }

    private boolean emptyBlock(Stmt s)
    {
        if( s instanceof Block)
        {
            return ((Block)s).stmts.isEmpty();
        }
        else
        {
            return false;
        }
    }
    
    @Override
    public Object visit(While w)
    {
        w.exp.accept(this);
        w.body.accept(this);
        if(w.exp instanceof True)
        {
            _err.info(w.pos, "DUMB: While loop runs forever!");
        } else if(w.exp instanceof False) {
            _err.info(w.pos, "DUMB: While loop never runs!");
            }
        return null;
    }

    @Override
    public Object visit(Block b)
    {
        b.stmts.accept(this);
        //if(b.stmts.isEmpty())
        if(emptyBlock(b))
        {
            _err.info(b.pos, "Pointless Statment: Warning pointless!");
        }
        return null;
    }

    @Override
    public Object visit(Plus p)
    {
        p.left.accept(this);
        p.right.accept(this);
        if(p.left instanceof IntLit && p.right instanceof IntLit)
        {
            _err.info(p.pos, "DUMB: addition of literal values");
        }
        return null;
    }

    @Override
    public Object visit(Call c)
    {
        c.obj.accept(this);
        c.args.accept(this);
        if(c.methName.equals(methodName))
        {
            _err.info(c.pos, "WARNING: RECURSION IS HARD!");
        }
        return null;
    }

    public Object visit(MethodDecl n)
    {
        methodName = n.name;
        n.params.accept(this);
        n.stmts.accept(this);
        return null;
    }
}