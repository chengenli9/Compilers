package main;

import syntaxtree.*;
import visitor.*;

public class Dumber
{
    public static void main(String[] args)
    {
        VarDeclList v2 = new VarDeclList();
        ExpList v6 = new ExpList();
        v6.add(new Plus(285,new IntLit(283,2),new IntLit(287,3)));
        StmtList v5 = new StmtList();
        v5.add(new CallStmt(277,new Call(277,new This(277),"print",v6)));
        StmtList v7 = new StmtList();
        ExpList v8 = new ExpList();
        v8.add(new IDExp(325,"x"));
        StmtList v4 = new StmtList();
        v4.add(new If(237,new False(240),new Block(259,v5),new Block(317,v7)));
        v4.add(new CallStmt(317,new Call(317,new This(317),"println",v8)));
        StmtList v9 = new StmtList();
        StmtList v10 = new StmtList();
        StmtList v11 = new StmtList();
        StmtList v12 = new StmtList();
        StmtList v13 = new StmtList();
        ExpList v15 = new ExpList();
        v15.add(new StringLit(399,"k is true"));
        StmtList v14 = new StmtList();
        v14.add(new CallStmt(391,new Call(391,new FieldAccess(386,new IDExp(380,"System"),"out"),"println",v15)));
        StmtList v16 = new StmtList();
        StmtList v17 = new StmtList();
        StmtList v18 = new StmtList();
        StmtList v21 = new StmtList();
        v21.add(new Assign(632,new IDExp(630,"r"),new Plus(636,new IDExp(634,"r"),new IntLit(638,1))));
        StmtList v20 = new StmtList();
        v20.add(new If(581,new Equals(586,new IntLit(584,2),new IntLit(589,4)),new Block(608,v21),new Assign(702,new IDExp(700,"x"),new Plus(706,new IntLit(704,5),new IntLit(708,2)))));
        StmtList v19 = new StmtList();
        v19.add(new While(538,new False(544),new Block(563,v20)));
        ExpList v25 = new ExpList();
        v25.add(new This(887));
        StmtList v24 = new StmtList();
        v24.add(new CallStmt(879,new Call(879,new FieldAccess(874,new IDExp(868,"System"),"out"),"println",v25)));
        v24.add(new LocalDeclStmt(920,new LocalVarDecl(920,new ArrayType(914,new IntType(914)),"Array",new NewArray(928,new IntType(932),new IntLit(936,4)))));
        StmtList v23 = new StmtList();
        v23.add(new While(818,new True(824),new Block(846,v24)));
        StmtList v26 = new StmtList();
        StmtList v22 = new StmtList();
        v22.add(new If(779,new True(782),new Block(800,v23),new Block(980,v26)));
        StmtList v3 = new StmtList();
        v3.add(new LocalDeclStmt(55,new LocalVarDecl(55,new IntType(51),"x",new Plus(61,new IntLit(59,1),new IntLit(63,2)))));
        v3.add(new LocalDeclStmt(78,new LocalVarDecl(78,new IntType(74),"y",new Plus(88,new Plus(84,new IntLit(82,1),new IntLit(86,2)),new IntLit(90,3)))));
        v3.add(new LocalDeclStmt(109,new LocalVarDecl(109,new BoolType(101),"z",new GreaterThan(115,new IntLit(113,3),new IntLit(117,4)))));
        v3.add(new LocalDeclStmt(132,new LocalVarDecl(132,new IntType(128),"w",new Times(138,new IntLit(136,2),new IntLit(140,4)))));
        v3.add(new LocalDeclStmt(159,new LocalVarDecl(159,new BoolType(151),"k",new And(168,new True(163),new False(171)))));
        v3.add(new LocalDeclStmt(190,new LocalVarDecl(190,new IntType(186),"r",new IDExp(194,"r"))));
        v3.add(new If(206,new True(209),new Block(223,v4),new Block(338,v9)));
        v3.add(new Block(338,v10));
        v3.add(new Block(339,v11));
        v3.add(new Block(340,v12));
        v3.add(new Block(341,v13));
        v3.add(new If(352,new IDExp(355,"k"),new Block(366,v14),new Block(432,v16)));
        v3.add(new If(432,new GreaterThan(437,new IDExp(435,"x"),new IDExp(439,"y")),new Block(450,v17),new Block(483,v18)));
        v3.add(new While(504,new True(510),new Block(524,v19)));
        v3.add(new While(744,new False(750),new Block(765,v22)));
        VarDeclList v27 = new VarDeclList();
        ExpList v30 = new ExpList();
        StmtList v29 = new StmtList();
        v29.add(new LocalDeclStmt(1070,new LocalVarDecl(1070,new IntType(1066),"x",new Call(1079,new This(1074),"foo",v30))));
        StmtList v31 = new StmtList();
        StmtList v28 = new StmtList();
        v28.add(new If(1024,new GreaterThan(1034,new FieldAccess(1031,new This(1027),"x"),new FieldAccess(1040,new This(1036),"y")),new Block(1052,v29),new Block(1104,v31)));
        DeclList v1 = new DeclList();
        v1.add(new MethodDeclVoid(30,"main",v2,v3));
        v1.add(new MethodDeclNonVoid(1004,new IntType(1000),"foo",v27,v28,new Plus(1113,new IntLit(1111,2),new Divide(1122,new Times(1117,new IntLit(1115,3),new IntLit(1119,10)),new IntLit(1124,2)))));
        DeclList v32 = new DeclList();
        VarDeclList v34 = new VarDeclList();
        StmtList v35 = new StmtList();
        DeclList v33 = new DeclList();
        v33.add(new MethodDeclNonVoid(1192,new IntType(1188),"bark",v34,v35,new IntLit(1207,0)));
        ClassDeclList v0 = new ClassDeclList();
        v0.add(new ClassDecl(7,"Dumb","Object",v1));
        v0.add(new ClassDecl(1142,"Cow","Object",v32));
        v0.add(new ClassDecl(1157,"Dog","Dog",v33));
        AstNode ast = new Program(1,v0);

        System.out.println("Before: ");
        ast.accept(new PrettyPrintVisitor(System.out));

        OptVisitor opt = new OptVisitor();
        ast.accept(opt);

        System.out.println("\n\nAfter: ");
        ast.accept(new PrettyPrintVisitor(System.out));

    }
}
