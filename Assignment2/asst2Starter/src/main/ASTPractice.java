package main;

import syntaxtree.*;
import visitor.*;

public class ASTPractice
{
    public static void main(String[] args)
    {
        /////////////////////////////
        // Make the code
        /////////////////////////////
        StmtList stmts = new StmtList();
        Exp three = new IntLit(0, 3);
        Exp two = new IntLit(0, 2);
        Exp one = new IntLit(0, 1);
        Exp zero = new IntLit(0, 0);
        Exp hundred = new IntLit(0, 100);



        // int y = 3 + 3
        stmts.append(new LocalDeclStmt(0, 
                      new LocalVarDecl(0, new IntType(0), "y", new Plus(0, three, three))));

        
        // if statement 
        IDExp y = new IDExp(0, "y");
        Exp cond = new GreaterThan(0, y, two);
        Stmt thenBranch = new Assign(0, y, new Plus(0, y, one));
        Stmt elseBranch = new Block(0, new StmtList());
        stmts.append(new If(0, cond, thenBranch, elseBranch));
                    

        // for (int i = 0; i < 100, i++) 
        // {
        //       int x = i;
        // }
        // 
        // while loop version
        // { // wrap in the block so i only exists in the block 
        //    int i = 0
        //    while (i < 100) {
        //       int x = i;
        //       i = i + 1;
        //    }
        // }
        // StmtList blockStmts = new StmtList();
        // IDExp i = new IDExp(0, "i");
        // int i = 0;
        stmts.append(new LocalDeclStmt(0, 
                      new LocalVarDecl(0, new IntType(0), "i", zero)));

        

        



        /////////////////////////////
        // create Methods
        /////////////////////////////
        DeclList decls = new DeclList();
        decls.append(new MethodDeclVoid(0, "main", new VarDeclList(), stmts));

        /////////////////////////////
        // create Classes
        /////////////////////////////
        ClassDeclList classes = new ClassDeclList();
        classes.append(new ClassDecl(0, "Test", "Object", decls));

        AstNode ast = new Program(0, classes);
        ast.accept(new PrettyPrintVisitor(System.out));
        ast.accept(new TreeDrawerVisitor(System.out));
    }

    
}
