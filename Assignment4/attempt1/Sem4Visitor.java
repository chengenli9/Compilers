package visitor;

import syntaxtree.*;

import java.util.*;

import errorMsg.*;
// The purpose of this class is to do type-checking and related
// actions.  These include:
// - evaluate the type for each expression, 
//   filling in the 'type' link for each
// - ensure that each expression follows MiniJava's type rules (e.g.,
//   that the arguments to '*' are both integer, the argument to
//   '.length' is an array, etc.)
// - ensure that each method-call follows Java's type rules:
//   - there exists a method for the given class (or a superclass)
//     for the receiver's object type
//   - the method has the correct number of parameters
//   - the types of each actual parameter is compatible with that
//     of its corresponding formal parameter
// - ensure that for each instance variable access (e.g., abc.foo),
//   there is an instance variable defined for the given class (or
//   in a superclass
//   - sets the 'varDec' link in the InstVarAccess to refer to the
//     method
// - ensure that the RHS expression in each assignment statement is
//   type-compatible with its corresponding LHS
//   - also checks that the LHS an lvalue
// - ensure that if a method with a given name is defined in both
//   a subclass and a superclass, that they have the same parameters
//   (with identical types) and the same return type
// - ensure that the declared return-type of a method is compatible
//   with its "return" expression
// - ensuring that the type of the control expression for an if- or
//   while-statement is boolean
public class Sem4Visitor extends Visitor
{
    ClassDecl currentClass;
    IDType currentType;
    IDType superType;
    ErrorMsg errorMsg;

    // Constants for types we'll need
    BoolType Bool;
    IntType Int;
    VoidType Void;
    NullType Null;
    ErrorType Error;
    IDType ObjectType;
    IDType StringType;

    HashMap<String,ClassDecl> classEnv;

    public Sem4Visitor(HashMap<String,ClassDecl> env, ErrorMsg e)
    {
        errorMsg = e;
        classEnv = env;
        currentClass = null;

        Bool = new BoolType(-1);
        Int  = new IntType(-1);
        Null = new NullType(-1);
        Void = new VoidType(-1);
        Error = new ErrorType(-1);
        StringType = new IDType(-1, "String");
        ObjectType = new IDType(-1, "Object");
        StringType.link = classEnv.get("String");
        ObjectType.link = classEnv.get("Object");
    }


    @Override
    public Object visit(IntLit i)
    {
        i.type = Int;
        return Int;
    }

    @Override
    public Object visit(StringLit s)
    {
        s.type = StringType;
        return StringType;
    }

    @Override
    public Object visit(True t)
    {
        t.type = Bool;
        return Bool;
    }

    @Override
    public Object visit(False f)
    {
        f.type = Bool;
        return Bool;
    }

    @Override
    public Object visit(Null n)
    {        
        n.type = Null;
        return Null;
    }
    
    @Override
    public Object visit(IDExp i)
    {
        i.type = i.link.type;
        return i.type;
    }

    @Override
    public Object visit(This t)
    {
        t.type = currentType;
        return currentType;
    }

    @Override
    public Object visit(Super s)
    {
        s.type = superType;
        return superType;
    }

    private void checkType(Type t, int pos) {
        if (!t.isInt()) {
            errorMsg.error(pos, CompError.TypeMismatch(t, Int));
        }
    }

    public Object visit(Plus p)
    {
        Type t1 = (Type)p.left.accept(this);
        Type t2 = (Type)p.right.accept(this);
        checkType(t1, p.pos);
        checkType(t2, p.pos);
        p.type = Int;
        return Int;
    }

    public Object visit(Minus m)
    {
        Type t1 = (Type)m.left.accept(this);
        Type t2 = (Type)m.right.accept(this);
        checkType(t1, m.pos);
        checkType(t2, m.pos);
        m.type = Int;
        return Int;
    }

    public Object visit(Times t)
    {
        Type t1 = (Type)t.left.accept(this);
        Type t2 = (Type)t.right.accept(this);
        checkType(t1, t.pos);
        checkType(t2, t.pos);
        t.type = Int;
        return Int;
    }

    public Object visit(Divide d)
    {
        Type t1 = (Type)d.left.accept(this);
        Type t2 = (Type)d.right.accept(this);
        checkType(t1, d.pos);
        checkType(t2, d.pos);
        d.type = Int;
        return Int;
    }

    public Object visit(Remainder r) 
    {
        Type t1 = (Type)r.left.accept(this);
        Type t2 = (Type)r.right.accept(this);
        checkType(t1, r.pos);
        checkType(t2, r.pos);
        r.type = Int;
        return Int;
    }

    @Override
    public Object visit(And a)
    {
        Type t1 = (Type)a.left.accept(this);
        Type t2 = (Type)a.right.accept(this);
        if (!t1.isBoolean()) {
            errorMsg.error(a.left.pos, CompError.TypeMismatch(t1, Bool));
        }
        if (!t2.isBoolean()) {
            errorMsg.error(a.right.pos, CompError.TypeMismatch(t2, Bool));
        }
        a.type = Bool;
        return Bool;
    }

    @Override
    public Object visit(Or o)
    {
        Type t1 = (Type)o.left.accept(this);
        Type t2 = (Type)o.right.accept(this);
        if (!t1.isBoolean()) {
            errorMsg.error(o.left.pos, CompError.TypeMismatch(t1, Bool));
        }
        if (!t2.isBoolean()) {
            errorMsg.error(o.right.pos, CompError.TypeMismatch(t2, Bool));
        }
        o.type = Bool;
        return Bool;
    }

    @Override
    public Object visit(LessThan l)
    {
        Type t1 = (Type)l.left.accept(this);
        Type t2 = (Type)l.right.accept(this);
        if (!t1.isInt()) {
            errorMsg.error(l.pos, CompError.TypeMismatch(t1, Int));
        }
        if (!t2.isInt()) {
            errorMsg.error(l.pos, CompError.TypeMismatch(t2, Int));
        }
        l.type = Bool;
        return Bool;
    }

    @Override
    public Object visit(GreaterThan g)
    {
        Type t1 = (Type)g.left.accept(this);
        Type t2 = (Type)g.right.accept(this);
        if (!t1.isInt()) {
            errorMsg.error(g.pos, CompError.TypeMismatch(t1, Int));
        }
        if (!t2.isInt()) {
            errorMsg.error(g.pos, CompError.TypeMismatch(t2, Int));
        }
        g.type = Bool;
        return Bool;
    }

    @Override
    public Object visit(Equals e)
    {
        Type t1 = (Type)e.left.accept(this);
        Type t2 = (Type)e.right.accept(this);
        if (!compatible(t1, t2)) {
            errorMsg.error(e.pos, CompError.IncompatibleType(t1, t2));
        }
        e.type = Bool;
        return Bool;
    }

    private boolean compatible(Type t1, Type t2) {
        return subtype(t1, t2) || subtype(t2, t1);
    }

    private boolean subtype(Type s, Type t) {
        if (s.isError() || t.isError()) return true;
        if (s.isNull() && !t.isVoid()) return true;
        if (s.isInt() && t.isInt()) return true;
        if (s.isBoolean() && t.isBoolean()) return true;
        if (s.isVoid() && t.isVoid()) return true;
        if (s.isArray() && t.isArray()) {
            return subtype(((ArrayType)s).baseType, ((ArrayType)t).baseType);
        }
        if (s.isArray() && t.isObject()) return true;
        if (s.isID() && t.isID()) {
            IDType is = (IDType)s;
            IDType it = (IDType)t;
            if (is.link == null || it.link == null) return false;
            ClassDecl cs = is.link;
            while (cs != null) {
                if (cs == it.link) return true;
                cs = cs.superLink;
            }
            return false;
        }
        return false;
    }

    @Override
    public Object visit(Not n)
    {
        Type t = (Type)n.exp.accept(this);
        if (!t.isBoolean()) {
            errorMsg.error(n.pos, CompError.IncompatibleType(t, Bool));
        }
        n.type = Bool;
        return Bool;
    }

    @Override
    public Object visit(ArrayLength a)
    {
        Type t = (Type)a.exp.accept(this);
        if (!t.isArray()) {
            errorMsg.error(a.pos, CompError.ArrayType());
        }
        a.type = Int;
        return Int;
    }

    @Override
    public Object visit(ArrayLookup a)
    {
        Type arr = (Type)a.arrExp.accept(this);
        Type idx = (Type)a.idxExp.accept(this);
        if (!arr.isArray()) {
            errorMsg.error(a.pos, CompError.ArrayType());
        }
        if (!idx.isInt()) {
            errorMsg.error(a.pos, CompError.IncompatibleType(idx, Int));
        }
        if (arr.isArray()) {
            ArrayType at = (ArrayType)arr;
            a.type = at.baseType;
        } else {
            a.type = Error;
        }
        return a.type;
    }

    @Override
    public Object visit(NewArray n)
    {
        Type t = (Type)n.sizeExp.accept(this);
        if (!t.isInt()) {
            errorMsg.error(n.pos, CompError.IncompatibleType(t, Int));
        }
        ArrayType arr = new ArrayType(n.pos, n.objType);
        n.type = arr;
        return arr;
    }

    @Override
    public Object visit(NewObject n)
    {
        IDType id = n.objType;
        if (id.link == null) {
            // assume error already reported or something
        }
        n.type = id;
        return id;
    }

    @Override
    public Object visit(InstanceOf i)
    {
        Type t1 = (Type)i.exp.accept(this);
        Type t2 = i.checkType;
        if (!compatible(t1, t2)) {
            errorMsg.error(i.pos, CompError.IncompatibleType(t1, t2));
        }
        i.type = Bool;
        return Bool;
    }

    @Override
    public Object visit(Cast c)
    {
        Type t1 = (Type)c.exp.accept(this);
        Type t2 = c.castType;
        if (!compatible(t1, t2)) {
            errorMsg.error(c.pos, CompError.IncompatibleType(t1, t2));
        }
        c.type = t2;
        return t2;
    }

    @Override
    public Object visit(FieldAccess f)
    {
        Type t = (Type)f.exp.accept(this);
        if (!t.isID()) {
            errorMsg.error(f.pos, CompError.UndefinedField(f.varName, t));
            f.type = Error;
            return Error;
        }
        IDType id = (IDType)t;
        ClassDecl cd = id.link;
        FieldDecl fd = null;
        while (cd != null) {
            fd = cd.fieldEnv.get(f.varName);
            if (fd != null) break;
            cd = cd.superLink;
        }
        if (fd == null) {
            errorMsg.error(f.pos, CompError.UndefinedField(f.varName, t));
            f.type = Error;
            return Error;
        }
        f.varDec = fd;
        f.type = fd.type;
        return fd.type;
    }

    @Override
    public Object visit(Call c)
    {
        Type rec = (Type)c.obj.accept(this);
        if (!rec.isID()) {
            errorMsg.error(c.pos, CompError.UndefinedMethod(c.methName, rec));
            c.type = Error;
            return Error;
        }
        IDType id = (IDType)rec;
        ClassDecl cd = id.link;
        MethodDecl md = null;
        while (cd != null) {
            md = cd.methodEnv.get(c.methName);
            if (md != null) break;
            cd = cd.superLink;
        }
        if (md == null) {
            errorMsg.error(c.pos, CompError.UndefinedMethod(c.methName, rec));
            c.type = Error;
            return Error;
        }
        c.methodLink = md;
        // check args
        if (c.args.size() != md.params.size()) {
            errorMsg.error(c.pos, CompError.ParameterMismatch(c.methName, c.args.size(), md.params.size()));
        } else {
            for (int i = 0; i < c.args.size(); i++) {
                Type arg = (Type)c.args.elementAt(i).accept(this);
                Type param = md.params.elementAt(i).type;
                if (!subtype(arg, param)) {
                    errorMsg.error(c.pos, CompError.IncompatibleType(arg, param));
                }
            }
        }
        c.type = md instanceof MethodDeclNonVoid ? ((MethodDeclNonVoid)md).rtnType : Void;
        return c.type;
    }

    @Override
    public Object visit(ClassDecl cd)
    {
        currentClass = cd;
        currentType = new IDType(cd.pos, cd.name);
        currentType.link = cd;
        superType = cd.superLink != null ? new IDType(cd.superLink.pos, cd.superLink.name) : ObjectType;
        if (superType != ObjectType) superType.link = cd.superLink;
        // visit decls
        cd.decls.accept(this);
        return null;
    }

    @Override
    public Object visit(MethodDecl md)
    {
        // check override
        if (currentClass.superLink != null) {
            MethodDecl superMd = currentClass.superLink.methodEnv.get(md.name);
            if (superMd != null) {
                md.superMethod = superMd;
                // check params
                if (md.params.size() != superMd.params.size()) {
                    errorMsg.error(md.pos, CompError.NumArgsOverride());
                } else {
                    for (int i = 0; i < md.params.size(); i++) {
                        Type t1 = md.params.elementAt(i).type;
                        Type t2 = superMd.params.elementAt(i).type;
                        if (!t1.equals(t2)) {
                            errorMsg.error(md.pos, CompError.ArgTypeOverride());
                            break;
                        }
                    }
                }
                // check return
                Type rt1 = md instanceof MethodDeclNonVoid ? ((MethodDeclNonVoid)md).rtnType : Void;
                Type rt2 = superMd instanceof MethodDeclNonVoid ? ((MethodDeclNonVoid)superMd).rtnType : Void;
                if (!rt1.equals(rt2)) {
                    errorMsg.error(md.pos, CompError.ReturnOverride());
                }
            }
        }
        // visit params and stmts
        md.params.accept(this);
        md.stmts.accept(this);
        return null;
    }

    @Override
    public Object visit(MethodDeclNonVoid md)
    {
        visit((MethodDecl)md);
        // check return exp
        Type rt = (Type)md.rtnExp.accept(this);
        if (!subtype(rt, md.rtnType)) {
            errorMsg.error(md.pos, CompError.Subtype(rt, md.rtnType));
        }
        return null;
    }

    @Override
    public Object visit(MethodDeclVoid md)
    {
        visit((MethodDecl)md);
        return null;
    }

    @Override
    public Object visit(If i)
    {
        Type t = (Type)i.exp.accept(this);
        if (!t.isBoolean()) {
            errorMsg.error(i.pos, CompError.TypeMismatch(t, Bool));
        }
        i.trueStmt.accept(this);
        i.falseStmt.accept(this);
        return null;
    }

    @Override
    public Object visit(While w)
    {
        Type t = (Type)w.exp.accept(this);
        if (!t.isBoolean()) {
            errorMsg.error(w.pos, CompError.TypeMismatch(t, Bool));
        }
        w.body.accept(this);
        return null;
    }

    private boolean isAssignableValue(Exp e) {
        return e instanceof IDExp || e instanceof FieldAccess || e instanceof ArrayLookup || e instanceof This || e instanceof Super;
    }


    @Override
    public Object visit(Assign a)
    {
        Type lhs = (Type)a.lhs.accept(this);
        Type rhs = (Type)a.rhs.accept(this);
        
        if (!isAssignableValue(a.lhs)) {
            errorMsg.error(a.lhs.pos, CompError.Assignment());
        }

        if (!subtype(rhs, lhs)) {
            errorMsg.error(a.pos, CompError.Subtype(rhs, lhs));
        }
        return null;
    }

    @Override
    public Object visit(LocalDeclStmt l)
    {
        Type rhs = (Type)l.localVarDecl.initExp.accept(this);
        if (!subtype(rhs, l.localVarDecl.type)) {
            errorMsg.error(l.pos, CompError.Subtype(rhs, l.localVarDecl.type));
        }
        return null;
    }

    @Override
    public Object visit(Block b)
    {
        b.stmts.accept(this);
        return null;
    }

}

