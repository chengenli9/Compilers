package visitor;

import errorMsg.*;
import java.io.*;
import syntaxtree.*;

public class CG3Visitor extends Visitor
{
    // The purpose here is to generate assembly for each Node
    // in the AST.

    // For this part we are generating code for a small subset of MiniJava. This is just
    // to show that you have a running code generator. It is worth 20% of the grade
    // for assignment 5.
    // You need to be able to generate code for
    // • Classes
    // • void Methods
    // • variable declarations
    // • Integer/Boolean/String Literals
    // • Arithmetic operators (+,-,*)
    // • void method calls
    // • this and super

    // IO stream to which we will emit code
    CodeStream code;

    // current stack height
    int stack;

    public CG3Visitor(ErrorMsg e, PrintStream out)
    {
        code = new CodeStream(out, e);
        code.setVisitor3(this);
        stack = 0;
    }

    // public void fakeMainStmt()
    // {
    //     code.emit("  li $s6, 1");
    //     code.emit("  li $s7, 0");
    //     code.emit("  newObject");
    //     code.emit("  la $t0, CLASS_Main"); // put Main object on the stack
    //     code.emit("  sw $t0, -12($s7)");
    //     code.emit("  addu $sp,$sp,4");
    //     code.emit("  move $s2, $s7");
    //     code.emit("  jal mth_main_Main");
    // }

    @Override
    public Object visit(Program n)
    {
        code.emit(".text");
        code.emit(".globl main");
        code.emit("main:");
        code.emit("  jal vm_init");

        //Put code for mainStmt here:
        //For now, I'll just make code that calls Main_main
        //but you'll need to replace this.
        // fakeMainStmt();
        n.mainStmt.accept(this);

        //exit the program
        code.emit("  li $v0, 10");
        code.emit("  syscall");

        // This is a fake main method until you get MethodDeclVoid working.
        // When that's working you should remove these two lines.
        // code.emit("mth_main_Main:");
        // code.emit("  jr $ra");

        // emit code for all the methods in all the class declarations
        n.classDecls.accept(this);

        // flush the output and return
        code.flush();
        return null;
    }

    // =================================
    // Helpers
    // =================================

    public void push(Type t, String reg)
    {
        if (t.isInt() || t.isBoolean())
        {
            code.emit(" subu $sp, $sp, 8");
            code.emit(" sw $s5, 4($sp)"); // garbage collector pointer
            code.emit(" sw " + reg + ", ($sp)");
            stack += 8;
        }
        else
        {
            code.emit(" subu $sp, $sp, 4");
            code.emit(" sw " + reg + ", ($sp)");
            stack += 4;
        }
    }

    public void pop(Type t, String reg)
    {
        if (t.isInt() || t.isBoolean())
        {
            code.emit(" lw " + reg + ", ($sp)");
            code.emit(" lw $s5, 4($sp)"); // garbage collector pointer
            code.emit(" addu $sp, $sp, 8");
            stack -= 8;
        }
        else
        {
            code.emit(" lw " + reg + ", ($sp)");
            code.emit(" addu $sp, $sp, 4");
            stack -= 4;
        }
    }

    public void resizeStack(int size) 
    {
        code.emit(" addu $sp, $sp, "+size);
        stack -= size;
    }

    // =================================
    // Classes
    // =================================

    // =================================
    // variable Declarations
    // =================================

    // =================================
    // Integer/Boolean/String Literals
    // =================================
    @Override
    public Object visit(IntLit n)
    {
        code.comment(n, "begin");
        code.emit("  li $t0, " + n.val);
        push(n.type, "$t0");
        code.comment(n, "end");
        return null;
    }

    @Override
    public Object visit(StringLit n)
    {
        code.comment(n, "begin");
        code.emit(" la $t0, strLit_"+n.uniqueCgRep);
        code.comment(n, "end");
        return null;
    }

    @Override
    public Object visit(True n)
    {
        code.comment(n, "begin");
        code.emit("  li $t0, 1");
        push(n.type, "$t0");
        code.comment(n, "end");
        return null;
    }

    @Override
    public Object visit(False n)
    {
        code.comment(n, "begin");
        code.emit("  li $t0, 0");
        push(n.type, "$t0");
        code.comment(n, "end");
        return null;
    }

    // =================================
    // Arithmetic operators (+,-,*)
    // =================================
    @Override
    public Object visit(Plus n)
    {
        code.comment(n, "begin");

        visit((BinExp)n);
        pop(n.left.type, "$t1");
        pop(n.right.type, "$t0");
        code.emit("  add $t0, $t0, $t1");
        push(n.type, "$t0");

        code.comment(n, "end");

        return null;
    }

    @Override
    public Object visit(Minus n)
    {
        code.comment(n, "begin");

        visit((BinExp)n);
        pop(n.left.type, "$t1");
        pop(n.right.type, "$t0");
        code.emit("  sub $t0, $t0, $t1");
        push(n.type, "$t0");

        code.comment(n, "end");

        return null;
    }

    @Override 
    public Object visit(Times n)
    {
        code.comment(n, "begin");

        visit((BinExp)n);
        pop(n.left.type, "$t1");
        pop(n.right.type, "$t0");
        code.emit("  mul $t0, $t0, $t1");
        push(n.type, "$t0");

        code.comment(n, "end");
        return null;
    }

    @Override
    public Object visit(Divide n)
    {
        code.comment(n, "begin");   

        visit((BinExp)n);
        code.emit("jal divide");

        code.comment(n, "end");
        return null;
    }

    @Override
    public Object visit(Remainder n)
    {
        code.comment(n, "begin");   

        visit((BinExp)n);
        code.emit("jal remainder");

        code.comment(n, "end");
        return null;
    }

    



    // =================================
    // void method calls
    // =================================

    @Override
    public Object visit(MethodDeclVoid n)
    {
        code.emit(".globl "+"mth_"+n.name+"_"+n.classDecl.name);
        code.emit("mth_"+n.name+"_"+n.classDecl.name+":");
        push(new VoidType(-1), "$ra");

        stack = 0;

        visit((MethodDecl)n);

        // pop off local variables 
        resizeStack(stack);
        pop(new VoidType(-1), "$ra");
        code.emit(" jr $ra");

        return null;
    }

    @Override
    public Object visit(MethodDeclNonVoid n)
    {
        code.emit(".globl "+"mth_"+n.name+"_"+n.classDecl.name);
        code.emit("mth_"+n.name+"_"+n.classDecl.name+":");
        push(n.rtnType, "$ra");

        stack = 0;

        n.rtnType.accept(this);
        visit((MethodDecl)n);
        n.rtnExp.accept(this);
        pop(n.rtnType, "$t0");

        // pop off local variables 
        resizeStack(stack);
        pop(new VoidType(-1), "$ra");
        code.emit(" jr $ra");

        return null;
    }

    // TODO
    @Override
    public Object visit(Call c)
    {
        code.comment(c, "begin");
        c.obj.accept(this);
        c.args.accept(this);

        // check if super


        return null;
    }

    // =================================
    // this and super
    // =================================

    @Override
    public Object visit(Super n)
    {
        code.comment(n, "begin");
        push(n.type, "$s2");
        code.comment(n, "end");
        return null;
    }

    @Override 
    public Object visit(This n)
    {
        code.comment(n, "begin");
        push(n.type, "$s2");
        code.comment(n, "end");
        return null;
    }
}
