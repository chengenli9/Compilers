// author: Chengen Li
// version: 3/24/2026 11:10 PM

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

    //================================================================
    // Leaf expressions
    //================================================================
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

    //================================================================
    // Binary Operators
    //================================================================


    // helper method for checking binary expressions with expected type
    private Type binaryCompare(BinExp n, Type expected) {
        Type t1 = (Type)n.left.accept(this);
        Type t2 = (Type)n.right.accept(this);
        if (!t1.equals(expected)) {
            errorMsg.error(n.left.pos, CompError.TypeMismatch(t1, expected));
        }
        if (!t2.equals(expected)) {
            errorMsg.error(n.right.pos, CompError.TypeMismatch(t2, expected));
        }
        n.type = expected;
        return expected;
    }

    @Override
    public Object visit(Plus p)
    {
        return binaryCompare(p, Int);
    }

    @Override
    public Object visit(Minus m)
    {
        return binaryCompare(m, Int);
    }
    @Override
    public Object visit(Times t)
    {
        return binaryCompare(t, Int);
    }
    @Override
    public Object visit(Divide d)
    {
        return binaryCompare(d, Int);
    }
    @Override
    public Object visit(Remainder r) 
    {
        return binaryCompare(r, Int);
    }
    
    @Override
    public Object visit(And a)
    {
        return binaryCompare(a, Bool);
    }

    @Override
    public Object visit(Or o)
    {
        return binaryCompare(o, Bool);
    }

    @Override
    public Object visit(LessThan l)
    {
        Type t1 = (Type)l.left.accept(this);
        Type t2 = (Type)l.right.accept(this);
        if (!t1.isInt()) {
            errorMsg.error(l.left.pos, CompError.TypeMismatch(t1, Int));
        }
        if (!t2.isInt()) {
            errorMsg.error(l.right.pos, CompError.TypeMismatch(t2, Int));
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
            errorMsg.error(g.left.pos, CompError.TypeMismatch(t1, Int));
        }
        if (!t2.isInt()) {
            errorMsg.error(g.right.pos, CompError.TypeMismatch(t2, Int));
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

    // helper method for checking type compatibility (for == and instanceof)
    private boolean compatible(Type t1, Type t2) {
        return subtype(t1, t2) || subtype(t2, t1);
    }

    private boolean subtype(Type s, Type t) {
        if (s.isError() || t.isError()) return true;
        if (s.isNull() && !t.isVoid()) return true;
        if (s.isInt() && t.isInt()) return true;
        if (s.isBoolean() && t.isBoolean()) return true;
        if (s.isVoid() && t.isVoid()) return true;

        // array and array have to match base type
        if (s.isArray() && t.isArray()) {
            return subtype(((ArrayType)s).baseType, ((ArrayType)t).baseType);
        }
        // array is compatible with Object
        if (s.isArray() && t.isObject()) return true;

        // for class types, check if s is a subclass of t
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

    // ===============================================================
    // Unary Operators
    // ===============================================================
    @Override
    public Object visit(Not n)
    {
        Type t = (Type)n.exp.accept(this);

        if (!t.isBoolean()) {
            errorMsg.error(n.pos, CompError.TypeMismatch(t, Bool));
        }
        n.type = Bool;
        return Bool;
    }

    //================================================================
    // Arrays
    //================================================================

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
        n.objType.accept(this);
        Type sizeType = (Type)n.sizeExp.accept(this);

        if (sizeType == null) {
            sizeType = Error;
        }
        // give an error if size is not an int or error
        if (!sizeType.isError() && !sizeType.isInt()) {
            errorMsg.error(n.sizeExp.pos, CompError.TypeMismatch(sizeType, Int));
        }

        n.type = new ArrayType(n.pos, n.objType);
        return n.type;
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

        // check that t is a class type
        if (!t.isID()) {
            errorMsg.error(f.pos, CompError.UndefinedField(f.varName, t));
            f.type = Error;
            return Error;
        }

        IDType id = (IDType)t;
        ClassDecl cd = id.link;
        FieldDecl fd = null;

        // look for field in class and superclasses
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
        // set call type based on method return type
        c.type = md instanceof MethodDeclNonVoid ? ((MethodDeclNonVoid)md).rtnType : Void;
        return c.type;
    }

    // ================================================================
    // Declarations 
    // ================================================================
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
                // check return type
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

    // ================================================================
    // Statements
    // ================================================================

    @Override
    public Object visit(If n)
    {
        Type t = (Type)n.exp.accept(this);
        if (!t.isBoolean() && !t.isError() && !t.isNull()) {
            errorMsg.error(n.pos, CompError.TypeMismatch(t, Bool));
        }
        n.trueStmt.accept(this);
        n.falseStmt.accept(this);
        return null;
    }

    @Override
    public Object visit(While w)
    {
        Type t = (Type)w.exp.accept(this);
        if (!t.isBoolean() && !t.isError() && !t.isNull()) {
            errorMsg.error(w.pos, CompError.TypeMismatch(t, Bool));
        }
        w.body.accept(this);
        return null;
    }

    // helper method to check if an expression is an lvalue
    private boolean isLValue(Exp e) {
        return e instanceof IDExp || e instanceof FieldAccess || e instanceof ArrayLookup || e instanceof This || e instanceof Super;
    }


    @Override
    public Object visit(Assign a)
    {
        Type lhs = (Type)a.lhs.accept(this);
        Type rhs = (Type)a.rhs.accept(this);
        
        // check that lhs is assignable / an lvalue
        if (!isLValue(a.lhs)) {
            errorMsg.error(a.lhs.pos, CompError.Assignment());
        }

        // check that rhs is subtype of lhs
        if (!lhs.isNull() && !rhs.isNull() && !subtype(rhs, lhs)) {
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

