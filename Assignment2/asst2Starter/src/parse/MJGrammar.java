// author: Chengen Li

package parse;
import java.util.List;
import errorMsg.*;
import syntaxtree.*;
import wrangLR.runtime.MessageObject;
import wrangLR.runtime.FilePosObject;

public class MJGrammar implements MessageObject, FilePosObject
{

    // constructor
    // @param em error-message object
    public MJGrammar(ErrorMsg em)
    {
        errorMsg = em;
        topObject = null;
    }

    // error message object
    private ErrorMsg errorMsg;

    // object to be returned by the parser
    private Program topObject;

    // These 2 methods are needed by WrangLR
    // DO NOT USE THEM! They will not pass tests
    // We don't need any errors or warnings in this assignment.
    public void warning(int pos, String msg)
    {
        errorMsg.info(pos, msg);
    }

    public void error(int pos, String msg)
    {
        errorMsg.error(pos, msg);
    }

    // method for converting file position to line/char position
    // @param pos the file position
    // @return the string that denotes the file position
    public String filePosString(int pos)
    {
        return errorMsg.lineAndChar(pos);
    }

    // method that registers a newline
    // @param pos the file position of the newline character
    public void registerNewline(int pos)
    {
        errorMsg.newline(pos-1);
    }

    // returns the object produced by the parse
    // @return the top-level object produced by the parser
    public Program parseResult()
    {
        return topObject;
    }

    //===============================================================
    // start symbol
    //===============================================================

    //: <start> ::= ws* <program> =>
    public void topLevel(Program obj)
    {
        topObject = obj;
    }

    //================================================================
    // top-level constructs
    //================================================================

    //: <program> ::= # <class decl>+ =>
    public Program createProgram(int pos, List<ClassDecl> vec)
    {
        return new Program(pos, new ClassDeclList(vec));
    }

    // Extends
    //: <extends ID> ::= `extends ID => pass
    //: <class decl> ::= `class # ID <extends ID>? `{ <decl in class>* `} =>
    public ClassDecl createClassDecl(int pos, String name, String extds, List<Decl> vec)
    {
        if (extds == null) {
            return new ClassDecl(pos, name, "Object", new DeclList(vec));
        }
        return new ClassDecl(pos, name, extds, new DeclList(vec));
    }

    
    //: <decl in class> ::= <field decl> => pass
    //: <decl in class> ::= <method decl> => pass

    //================================================================
    // method declaration
    //================================================================

    //: <method decl> ::= `public `void # ID `( <paramList>? `) `{ <stmt>* `} =>
    public Decl createMethodDeclVoid(int pos, String name, VarDeclList paramList, List<Stmt> stmts)
    {
        if (paramList == null) {
            return new MethodDeclVoid(pos, name, new VarDeclList(new VarDeclList()),
                                  new StmtList(stmts));
        } 

        return new MethodDeclVoid(pos, name, paramList, new StmtList(stmts));
    }

    //: <method decl> ::= `public <type> # ID `( <paramList>? `) `{ <stmt>*  `return <expr>`; `} => 
    public Decl createMethodDeclNonVoid(Type t, int pos, String id, VarDeclList paramList, List<Stmt> stmts, Exp e) 
    {
        if (paramList == null) {
            return new MethodDeclNonVoid(
                pos,
                t,
                id,
                new VarDeclList(new VarDeclList()), 
                new StmtList(stmts),
                e
            );
        }

        return new MethodDeclNonVoid(
                pos,
                t,
                id,
                paramList, 
                new StmtList(stmts),
                e
            );
    }
    
    //: <param> ::= <type> # ID => 
    public VarDecl newParam(Type t, int pos, String id) 
    {
        return new ParamDecl(pos, t, id);
    }
    //: <extra param> ::= `, <type> # ID => 
    public VarDecl newExtraParam(Type t, int pos, String id) 
    {
        return new ParamDecl(pos, t, id);
    }

    //: <paramList> ::= <param> <extra param>* =>
    public VarDeclList newParamList(VarDecl p, List<VarDecl> params) 
    {
        params.add(0, p);
        return new VarDeclList(params);
    }

    //================================================================
    // Types Declaration
    //================================================================

    //: <type> ::= # `int =>
    public Type intType(int pos)
    {
        return new IntType(pos);
    }
    //: <type> ::= # `boolean =>
    public Type booleanType(int pos)
    {
        return new BoolType(pos);
    }
    //: <type> ::= # ID =>
    public Type idType(int pos, String name)
    {
        return new IDType(pos, name);
    }
    //: <type> ::= # <type> <empty bracket pair> =>
    public Type newArrayType(int pos, Type t, Object dummy)
    {
        return new ArrayType(pos, t);
    }

    //: <empty bracket pair> ::= `[ `] => null

    //================================================================
    // statement-level constructs
    //================================================================

    //: <stmt> ::= # <callExpr> `; => 
    public Stmt newCallStmt(int pos, Exp callExpr) {
        return new CallStmt(pos, (Call)callExpr);
    }

    //: <stmt> ::= # `break `; => 
    public Stmt newBreak(int pos) {
        return new Break(pos);
    }

    //: <stmt> ::= <assign> `; => pass


    //: <stmt> ::= # `; => 
    public Stmt emptyStmt(int pos) {
        return new Block(pos, new StmtList());
    }

    //: <stmt> ::= # `{ <stmtDecl>* `} =>
    public Stmt newBlock(int pos, List<Stmt> sl)
    {
        return new Block(pos, new StmtList(sl));
    }

    //: <stmt> ::= <local var decl> `; => pass

    //====== If statement ======
    //: <stmt> ::= # `if `( <expr> `) <stmt> # !`else => 
    public Stmt newIf(int pos, Exp cond, Stmt trueBranch, int elsePos) {
        return new If(pos, cond, trueBranch, new Block(elsePos, new StmtList()));
    }

    //: <stmt> ::= # `if `( <expr> `) <stmt> # `else <stmt> => 
    public Stmt newIfElse(int pos, Exp cond, Stmt trueBranch, int elsePos, Stmt elseBranch) {
        return new If(pos, cond, trueBranch, elseBranch); 
    }

    //====== While Statement ======
    //: <stmt> ::= # `while `( <expr> `) <stmt> => 
    public Stmt newWhile(int pos, Exp cond, Stmt trueBranch) {
        return new While(pos, cond, trueBranch);
    }

    //====== For Loop ======
    //
    //  for ( (type ID = exp | assign | callExp)? ; exp? ; (assign | callExp)? ) stmt
    //
    //: <stmt> ::= # `for `( <forInit>? `; <expr>? `; <forUpdate>? `) <stmt> => 
    public Stmt newFor(int pos, Stmt init, Exp cond, Stmt update, Stmt body) {
        StmtList whileBody = new StmtList();
        whileBody.add(body);
        whileBody.add(update);

        Stmt whileBlock = newWhile(pos, cond, newBlock(pos, whileBody));
        StmtList blockStmts = new StmtList();
        blockStmts.add(init);
        blockStmts.add(whileBlock);

        return newBlock(pos, blockStmts);
    
    }


    //: <forInit> ::= <local var decl> => pass
    //: <forInit> ::= <assign> => pass
    //: <forInit> ::= # <callExpr> => 
    public Stmt forLoopInit(int pos, Exp e) {
        return new CallStmt(pos, (Call)e);
    }

    //: <forUpdate> ::= <assign> => pass
    //: <forUpdate> ::= # <callExpr> => 
    public Stmt forLoppUpdate(int pos, Exp e) {
        return new CallStmt(pos, (Call)e);
    }

    //: <stmtDecl> ::= <stmt> => pass

    //: <stmt> ::= # `switch `( <expr> `) `{ <switchContent>* `} =>
    public Stmt newSwitch(int pos, Exp cond, List<Stmt> content) {
        return new Switch(pos, cond, new StmtList(content));
    }

    //: <switchContent> ::= <stmtDecl> => pass
    //: <switchContent> ::= `case # <expr> `: => 
    public Stmt newCase(int pos, Exp e) {
        return new Case(pos, e);
    }
    //: <switchContent> ::= # `default `: => 
    public Stmt newDefault(int pos) {
        return new Default(pos);
    }


    //================================================================
    // Assignments
    //================================================================


    //: <assign> ::= <expr1> # `= <expr> =>
    public Stmt assign(Exp lhs, int pos, Exp rhs)
    {
        return new Assign(pos, lhs, rhs);
    }

    //: <assign> ::= # `++ ID => 
    public Stmt prefixPlus(int pos, String name) {
        IDExp lhs = new IDExp(pos, name);
        Exp rhs = new Plus(pos, lhs, new IntLit(pos, 1));
        return new Assign(pos, lhs, rhs);
    }

    //: <assign> ::= # ID `++ =>
    public Stmt posfixPlus(int pos, String name) {
        IDExp lhs = new IDExp(pos, name);
        Exp rhs = new Plus(pos, lhs, new IntLit(pos, 1));
        return new Assign(pos, lhs, rhs);
    }

    //: <assign> ::= # `-- ID => 
    public Stmt prefixMinus(int pos, String name) {
        IDExp lhs = new IDExp(pos, name);
        Exp rhs = new Minus(pos, lhs, new IntLit(pos, 1));
        return new Assign(pos, lhs, rhs);
    }

     //: <assign> ::= # ID `-- => 
    public Stmt posfixMinus(int pos, String name) {
        IDExp lhs = new IDExp(pos, name);
        Exp rhs = new Minus(pos, lhs, new IntLit(pos, 1));
        return new Assign(pos, lhs, rhs);
    }

    //: <field decl> ::= <type> # ID `; =>
    public Decl fieldDecl(Type t, int pos, String name) {
	    return new FieldDecl(pos, t, name);
    }

    //: <local var decl> ::= <type> # ID `= <expr> =>
    public Stmt localVarDecl(Type t, int pos, String name, Exp init)
    {
        return new LocalDeclStmt(pos, new LocalVarDecl(pos, t, name, init));
    }


    //================================================================
    // expressions
    //================================================================

    //: <expr> ::= <expr8> => pass
    //: <expr8> ::= <expr7> => pass
    //: <expr7> ::= <expr6> => pass
    //: <expr6> ::= <expr5> => pass


    // these precedence levels have not been filled in at all, so there
    // are only pass-through productions

    //============= expr7 ==============
    //: <expr8> ::= <expr8> # `|| <expr7> =>
    public Exp newOr(Exp e1, int pos, Exp e2) {
        return new Or(pos, e1, e2);
    }

    //============= expr7 ==============
    //: <expr7> ::= <expr7> # `&& <expr6> =>
    public Exp newAnd(Exp e1, int pos, Exp e2) {
        return new And(pos, e1, e2);
    }

    //============= expr6 ==============
    //: <expr6> ::= <expr6> # `!= <expr5> =>
    public Exp newNotEq(Exp e1, int pos, Exp e2) {
        return newUnaryNot(pos, new Equals(pos, e1, e2));
    }

    //: <expr6> ::= <expr6> # `== <expr5> =>
    public Exp newEq(Exp e1, int pos, Exp e2) {
        return new Equals(pos, e1, e2);
    }
    

    //============= expr5 ==============

    // Less than '<'
    //: <expr5> ::= <expr5> # `< <expr4> =>
    public Exp newLessThan(Exp e1, int pos, Exp e2) {
        return new LessThan(pos, e1, e2);
    }

    // Greater than '>'
    //: <expr5> ::= <expr5> # `> <expr4> =>
    public Exp newGreaterThan(Exp e1, int pos, Exp e2) {
        return new GreaterThan(pos, e1, e2);
    }

    // Greater than or Equal '>='
    //: <expr5> ::= <expr5> # `>= <expr4> =>
    public Exp newGreaterThanOrEq(Exp e1, int pos, Exp e2) {
        return new Not(pos, new LessThan(pos, e1, e2));
    }

    // Less than or Equal '<='
    //: <expr5> ::= <expr5> # `<= <expr4> =>
    public Exp newLessThanOrEq(Exp e1, int pos, Exp e2) {
        return new Not(pos, new GreaterThan(pos, e1, e2));
    }

    // instanceof 
    //: <expr5> ::= <expr5> # `instanceof ID =>
    public Exp newInstanceof(Exp e, int pos, String id) {
        return new InstanceOf(pos, e, new IDType(pos, id));
    }

    //: <expr5> ::= <expr4> => pass



    // these remaining precedence levels have been filled in to some extent,
    // but most or all of them have need to be expanded

    // ============ expr4 ============
    //: <expr4> ::= <expr4> # `+ <expr3> =>
    public Exp newPlus(Exp e1, int pos, Exp e2)
    {
        return new Plus(pos, e1, e2);
    }

    //: <expr4> ::= <expr4> # `- <expr3> =>
    public Exp newMinus(Exp e1, int pos, Exp e2)
    {
        return new Minus(pos, e1, e2);
    }

    //: <expr4> ::= <expr3> => pass

    // ============ expr3 ============

    //: <expr3> ::= <expr3> # `* <expr2> =>
    public Exp newTimes(Exp e1, int pos, Exp e2)
    {
        return new Times(pos, e1, e2);
    }

    //: <expr3> ::= <expr3> # `/ <expr2> => 
    public Exp newDivide(Exp e1, int pos, Exp e2) {
        return new Divide(pos, e1, e2);
    }

    //: <expr3> ::= <expr3> # `% <expr2> => 
    public Exp newMod(Exp e1, int pos, Exp e2) {
        return new Remainder(pos, e1, e2);
    }

    //: <expr3> ::= <expr2> => pass

    // ============ expr2 ============

    //: <expr2> ::= <cast expr> => pass
    //: <expr2> ::= <unary expr> => pass

    //: <cast expr> ::= # `( <type> `) <cast expr> =>
    public Exp newCast(int pos, Type t, Exp e)
    {
        return new Cast(pos, t, e);
    }
    //: <cast expr> ::= # `( <type> `) <expr1> => Exp newCast(int, Type, Exp)

    //: <unary expr> ::= # `- <unary expr> =>
    public Exp newUnaryMinus(int pos, Exp e)
    {
        return new Minus(pos, new IntLit(pos, 0), e);
    }

    //: <unary expr> ::= # `+ <unary expr> =>
    public Exp newUnaryPlus(int pos, Exp e)
    {
        return new Plus(pos, new IntLit(pos, 0), e);
    }

    //: <unary expr> ::= # `! <unary expr> => 
    public Exp newUnaryNot(int pos, Exp e) 
    {
        return new Not(pos, e);
    }

    //: <unary expr> ::= <expr1> => pass

    // ============ expr1 ============

    //: <expr1> ::= # ID  =>
    public Exp newIDExp(int pos, String name)
    {
        return new IDExp(pos, name);
    }
    //: <expr1> ::= <expr1> !<empty bracket pair> # `[ <expr> `] =>
    public Exp newArrayLookup(Exp e1, int pos, Exp e2)
    {
        return new ArrayLookup(pos, e1, e2);
    }

    //: <expr1> ::= # INTLIT =>
    public Exp newIntLit(int pos, int n)
    {
        return new IntLit(pos, n);
    }
    //: <expr1> ::= # CHARLIT => 
    public Exp newCharLit(int pos, int n)
    {
        return new IntLit(pos, n);
    }

    //: <expr1> ::= # STRINGLIT => 
    public Exp newStringLit(int pos, String s) 
    {
        return new StringLit(pos, s);
    }

    //: <expr1> ::= # `true => 
    public Exp newTrue(int pos) { return new True(pos); }

    //: <expr1> ::= # `false => 
    public Exp newFalse(int pos) {return new False(pos);}

    //: <expr1> ::= # `null => 
    public Exp newNull(int pos) {return new Null(pos);}

    //: <expr1> ::= # `this => 
    public Exp newThis(int pos) { return new This(pos);}

    //: <expr1> ::= # <expr1> `. ID => 
    public Exp newInstVarAccess(int pos, Exp e, String id) {return new FieldAccess(pos, e, id); }

    //: <expr1> ::= # `new # ID `( `) =>
    public Exp newObject(int pos1, int pos2, String id) {
        return new NewObject(pos1, new IDType(pos2, id));
    }

    //: <expr1> ::= `new <type> !<empty bracket pair> # `[ <expr> `] <empty bracket pair>** => 
    public Exp newCreateArray(Type t, int pos, Exp e, List<Object> objects) {
        ArrayType arr = new ArrayType(pos, t);
        for (Object object: objects) {
            arr = new ArrayType(pos, arr);
        }
        return new NewArray(pos, arr, e);
    }

    //: <expr1> ::= !<cast expr> `( <expr> `) => pass

    //: <expr1> ::= <callExpr> => pass
   


    //====== Call expressions ======
    //: <callExpr> ::= # ID `( <exprList>? `) => 
    public Exp newCallExpr(int pos, String name, ExpList es) {
        if (es == null) {
            es = new ExpList();
        }
        return new Call(pos, new This(pos), name, es);
    } 

    //: <callExpr> ::= <expr1> # `. ID `( <exprList>? `) => 
    public Exp newCallExpr2(Exp e, int pos, String id, ExpList es) {
        if (es == null) {
            es = new ExpList();
        }
        return new Call(pos, e, id, es);
    }

    //: <callExpr> ::= # `super `. ID `( <exprList>? `) => 
    public Exp newSuperCallExpr(int pos, String id, ExpList es) {
        if (es == null) {
            es = new ExpList();
        }
        return new Call(pos, new Super(pos), id, es);
    }


    //: <exprList> ::= # <expr> <extraExpr>* => 
    public ExpList newExpList(int pos, Exp e, List<Exp> es) {
        es.add(0, e);
        return new ExpList(es);
    }
    //: <extraExpr> ::= `, <expr> => pass
    

    //================================================================
    // Lexical grammar for filtered language begins here: DO NOT
    // MODIFY ANYTHING BELOW THIS, UNLESS YOU REPLACE IT WITH YOUR
    // ENTIRE LEXICAL GRAMMAR, and set the constant FILTER_GRAMMAR
    // (defined near the top of this file) to false.
    //================================================================

    //: letter ::= {"a".."z" "A".."Z"} => pass
    //: letter128 ::= {225..250 193..218} =>
    public char sub128(char orig)
    {
        return (char)(orig-128);
    }
    //: digit ::= {"0".."9"} => pass
    //: digit128 ::= {176..185} => char sub128(char)
    //: any ::= {0..127} => pass
    //: any128 ::= {128..255} => char sub128(char)
    //: ws ::= " "
    //: ws ::= {10} registerNewline
    //: registerNewline ::= # => void registerNewline(int)
    //: `boolean ::= "#bo" ws*
    //: `class ::= "#cl" ws*
    //: `extends ::= "#ex" ws*
    //: `void ::= "#vo" ws*
    //: `int ::= "#it" ws*
    //: `while ::= "#wh" ws*
    //: `if ::= '#+' ws*
    //: `else ::= "#el" ws*
    //: `for ::= "#fo" ws*
    //: `break ::= "#br" ws*
    //: `this ::= "#th" ws*
    //: `false ::= '#fa' ws*
    //: `true ::= "#tr" ws*
    //: `super ::= "#su" ws*
    //: `null ::= "#nu" ws*
    //: `return ::= "#re" ws*
    //: `instanceof ::= "#in" ws*
    //: `new ::= "#ne" ws*
    //: `case ::= "#ce" ws*
    //: `default ::= "#de" ws*
    //: `do ::= "#-" ws*
    //: `public ::= "#pu" ws*
    //: `switch ::= "#sw" ws*

    //: `! ::=  "!" ws* => void
    //: `!= ::=  "@!" ws* => void
    //: `% ::= "%" ws* => void
    //: `&& ::= "@&" ws* => void
    //: `* ::= "*" ws* => void
    //: `( ::= "(" ws* => void
    //: `) ::= ")" ws* => void
    //: `{ ::= "{" ws* => void
    //: `} ::= "}" ws* => void
    //: `- ::= "-" ws* => void
    //: `+ ::= "+" ws* => void
    //: `= ::= "=" ws* => void
    //: `== ::= "@=" ws* => void
    //: `[ ::= "[" ws* => void
    //: `] ::= "]" ws* => void
    //: `|| ::= "@|" ws* => void
    //: `< ::= "<" ws* => void
    //: `<= ::= "@<" ws* => void
    //: `, ::= "," ws* => void
    //: `> ::= ">"  !'=' ws* => void
    //: `>= ::= "@>" ws* => void
    //: `: ::= ":" ws* => void
    //: `. ::= "." ws* => void
    //: `; ::= ";" ws* => void
    //: `++ ::= "@+" ws* => void
    //: `-- ::= "@-" ws* => void
    //: `/ ::= "/" ws* => void


    //: ID ::= letter128 ws* => text
    //: ID ::= letter idChar* idChar128 ws* => text

    //: INTLIT ::= {"1".."9"} digit* digit128 ws* =>
    public int convertToInt(char c, List<Character> mid, char last)
    {
        return Integer.parseInt(""+c+mid+last);
    }
    //: INTLIT ::= digit128 ws* =>
    public int convertToInt(char c)
    {
        return Integer.parseInt(""+c);
    }
    //: INTLIT ::= "0" hexDigit* hexDigit128 ws* =>
    public int convert16ToInt(char c, List<Character> mid, char last)
    {
        return Integer.parseInt(""+c+mid+last, 16);
    }
    //: STRINGLIT ::= '@"' ws* =>
    public String emptyString(char x, char xx)
    {
        return "";
    }
    //: STRINGLIT ::= '"' any* any128 ws* =>
    public String string(char x, List<Character> mid, char last)
    {
        return ""+mid+last;
    }
    //: CHARLIT ::= "'" any ws* =>
    public int charVal(char x, char val)
    {
        return val;
    }

    //: idChar ::= letter => pass
    //: idChar ::= digit => pass
    //: idChar ::= "_" => pass
    //: idChar128 ::= letter128 => pass
    //: idChar128 ::= digit128 => pass
    //: idChar128 ::= {223} =>
    public char underscore(char x)
    {
        return '_';
    }
    //: hexDigit ::= {"0".."9" "A".."Z" "a".."z"} => pass
    //: hexDigit128 ::= {176..185 225..230 193..198} => char sub128(char)

}
