// package visitor;

// import errorMsg.*;
// import java.io.*;
// import syntaxtree.*;

// public class CG3Visitor extends Visitor
// {
//     // The purpose here is to generate assembly for each Node
//     // in the AST.

//     // For this part we are generating code for a small subset of MiniJava. This is just
//     // to show that you have a running code generator. It is worth 20% of the grade
//     // for assignment 5.
//     // You need to be able to generate code for
//     // • Classes
//     // • void Methods
//     // • variable declarations
//     // • Integer/Boolean/String Literals
//     // • Arithmetic operators (+,-,*)
//     // • void method calls
//     // • this and super

//     // IO stream to which we will emit code
//     CodeStream code;

//     // current stack height
//     int stack;

//     public CG3Visitor(ErrorMsg e, PrintStream out)
//     {
//         code = new CodeStream(out, e);
//         code.setVisitor3(this);
//         stack = 0;
//     }

//     public void fakeMainStmt()
//     {
//         code.emit("  li $s6, 1");
//         code.emit("  li $s7, 0");
//         code.emit("  jal newObject");
//         code.emit("  la $t0, CLASS_Main"); // put Main object on the stack
//         code.emit("  sw $t0, -12($s7)");
//         code.emit("  addu $sp,$sp,4");
//         code.emit("  move $s2, $s7");
//         code.emit("  subu $sp, $sp, 4");
//         code.emit("  sw $s2, ($sp)");
//         code.emit("  jal mth_main_Main");
//         code.emit("  addu $sp, $sp, 4");
//     }

//     @Override
//     public Object visit(Program n)
//     {
//         code.emit(".text");
//         code.emit(".globl main");
//         code.emit("main:");
//         code.emit("  jal vm_init");

//         //Put code for mainStmt here:
//         //For now, I'll just make code that calls Main_main
//         //but you'll need to replace this.
//         fakeMainStmt();
//         //n.mainStmt.accept(this);

//         //exit the program
//         code.emit("  li $v0, 10");
//         code.emit("  syscall");

//         // This is a fake main method until you get MethodDeclVoid working.
//         // When that's working you should remove these two lines.
//         // code.emit("mth_main_Main:");
//         // code.emit("  jr $ra");

//         // emit code for all the methods in all the class declarations
//         n.classDecls.accept(this);

//         // flush the output and return
//         code.flush();
//         return null;
//     }

//     // =================================
//     // Helpers
//     // =================================

//     public void push(Type t, String reg)
//     {
//         if (t.isInt())
//         {
//             code.emit(" subu $sp, $sp, 8");
//             code.emit(" sw " + reg + ", ($sp)");
//             stack += 8;
//         }
//         else
//         {
//             code.emit(" subu $sp, $sp, 4");
//             code.emit(" sw " + reg + ", ($sp)");
//             stack += 4;
//         }
//     }

//     public void pop(Type t, String reg)
//     {
//         if (t.isInt())
//         {
//             code.emit(" lw " + reg + ", ($sp)");
//             code.emit(" addu $sp, $sp, 8");
//             stack -= 8;
//         }
//         else
//         {
//             code.emit(" lw " + reg + ", ($sp)");
//             code.emit(" addu $sp, $sp, 4");
//             stack -= 4;
//         }
//     }

//     public void popSize(int size) 
//     {
//         code.emit(" addu $sp, $sp, "+size);
//         stack -= size;
//     }

//     public void swap(int pSize, String reg)
//     {
//         code.emit(" lw $t0, "+pSize+"($sp)");
//         code.emit(" sw "+reg+", "+pSize+"($sp)");
//         code.emit(" move "+reg+", $t0");
//     }

//     public void npe(String reg) 
//     {
//         code.emit(" beq "+reg+", $zero, nullPtrException");
//     }

//     public void oob(String reg1, String reg2) 
//     {
//         npe(reg1);
//         code.emit(" lw $t3, -4("+reg1+")");
//         code.emit(" bgeu "+reg2+", $t3, arrayIndexOutOfBounds");
//     }

//     public void arrayLoad(String reg0, String reg1, String reg2) 
//     {
//         code.emit(" sll "+reg0+", "+reg2+", 2");
//         code.emit(" addu "+reg0+", "+reg0+", "+reg1);
//     }

//     // =================================
//     // Classes
//     // =================================
//     @Override
//     public Object visit(ClassDecl n)
//     {
//         n.decls.accept(this);
//         return null;
//     }

    

//     // =================================
//     // variable Declarations
//     // =================================
//     @Override
//     public Object visit(LocalVarDecl n)
//     {
//         n.initExp.accept(this);

//         // push the value onto the stack
//         code.emit(n, "  subu $sp, $sp, 4");
//         code.emit(n, "  sw $t0, ($sp)");

//         stack += 4;

//         n.offset = stack;

//         return null;
//     }

//     // =================================
//     // Integer/Boolean/String Literals
//     // =================================
//     @Override
//     public Object visit(IntLit n)
//     {
//         code.comment(n, "begin");
//         code.emit("  li $t0, " + n.val);
//         push(n.type, "$t0");
//         code.comment(n, "end");
//         return null;
//     }

//     @Override
//     public Object visit(StringLit n)
//     {
//         code.comment(n, "begin");
//         code.emit(" la $t0, strLit_"+n.uniqueId);
//         push(n.type, "$t0");
//         code.comment(n, "end");
//         return null;
//     }

//     @Override
//     public Object visit(IDExp n)  
//     {
//         code.comment(n, "begin");
//         VarDecl decl = n.link;
//         int sp = (stack - decl.offset) * 4;
//         code.emit(n, " lw $t0, "+sp+"($sp)");
//         code.comment(n, "end");
//         return null; 
//     }

//     @Override
//     public Object visit(True n)
//     {
//         code.comment(n, "begin");
//         code.emit("  li $t0, 1");
//         push(n.type, "$t0");
//         code.comment(n, "end");
//         return null;
//     }

//     @Override
//     public Object visit(False n)
//     {
//         code.comment(n, "begin");
//         code.emit("  li $t0, 0");
//         push(n.type, "$t0");
//         code.comment(n, "end");
//         return null;
//     }

//     // =================================
//     // operators (+,-,*,/,%,=,<,>,&&,||)
//     // =================================
//     @Override
//     public Object visit(Plus n)
//     {
//         code.comment(n, "begin");

//         visit((BinExp)n);
//         pop(n.left.type, "$t1");
//         pop(n.right.type, "$t0");
//         code.emit("  add $t0, $t1, $t2");
//         push(n.type, "$t0");

//         code.comment(n, "end");

//         return null;
//     }

//     @Override
//     public Object visit(Minus n)
//     {
//         code.comment(n, "begin");

//         visit((BinExp)n);
//         pop(n.left.type, "$t1");
//         pop(n.right.type, "$t0");
//         code.emit("  sub $t0, $t1, $t2");
//         push(n.type, "$t0");

//         code.comment(n, "end");

//         return null;
//     }

//     @Override 
//     public Object visit(Times n)
//     {
//         code.comment(n, "begin");

//         visit((BinExp)n);
//         pop(n.left.type, "$t1");
//         pop(n.right.type, "$t0");
//         code.emit("  mul $t0, $t1, $t2");
//         push(n.type, "$t0");

//         code.comment(n, "end");
//         return null;
//     }

//     @Override
//     public Object visit(Divide n)
//     {
//         code.comment(n, "begin");   

//         visit((BinExp)n);
//         code.emit("jal divide");

//         code.comment(n, "end");
//         return null;
//     }

//     @Override
//     public Object visit(Remainder n)
//     {
//         code.comment(n, "begin");   

//         visit((BinExp)n);
//         code.emit("jal remainder");

//         code.comment(n, "end");
//         return null;
//     }

//     @Override
//     public Object visit(Equals n)
//     {
//         code.comment(n, "begin");
//         visit((BinExp)n);

//         pop(n.right.type, "$t2");
//         pop(n.left.type, "$t1");
//         code.emit("    seq $t0, $t1, $t2");

//         push(n.type, "$t0");
//         code.comment(n, "end");
//         return null;
//     }

//     @Override
//     public Object visit(LessThan n) 
//     {
//         code.comment(n, "begin");

//         visit((BinExp)n);
//         pop(n.right.type, "$t2");
//         pop(n.left.type, "$t1");
//         code.emit("    slt $t0, $t1, $t2");
//         push(n.type, "$t0");
//         code.comment(n, "end");

//         return null; 
//     }

//     @Override
//     public Object visit(GreaterThan n) 
//     {
//         code.comment(n, "begin");
//         visit((BinExp)n);
//         pop(n.right.type, "$t2");
//         pop(n.left.type, "$t1");
//         code.emit("    sgt $t0, $t1, $t2");
//         push(n.type, "$t0");
//         code.comment(n, "end");
//         return null; 
//     }

//     @Override
//     public Object visit(Or n)          
//     { 
//         n.left.accept(this);
//         code.emit("    lw $t0, ($sp)");
//         code.emit("    beq $t0, $zero, skip_"+n.uniqueId);
//         pop(n.left.type, "$t0");
//         n.right.accept(this);
//         code.emit("skip_"+n.uniqueId+":");
//         code.comment(n, "end");
//         return null; 
//     }


//     // =================================
//     // methods and calls
//     // =================================
//     @Override
//     public Object visit(MethodDecl n) {
//         super.visit(n);
//         return null;
//     }

//     @Override
//     public Object visit(MethodDeclVoid n)
//     {
//         code.emit(".globl "+"mth_"+n.name+"_"+n.classDecl.name);
//         code.emit("mth_"+n.name+"_"+n.classDecl.name+":");
//         push(new VoidType(-1), "$ra");

//         stack = 0;

//         // load this into $s2
//         code.emit(" lw $s2, 4($sp)");

//         visit((MethodDecl)n);

//         // pop off local variables 
//         popSize(stack);
//         pop(new VoidType(-1), "$ra");
//         code.emit(" jr $ra");

//         return null;
//     }

//     @Override
//     public Object visit(MethodDeclNonVoid n)
//     {
//         code.emit(".globl "+"mth_"+n.name+"_"+n.classDecl.name);
//         code.emit("mth_"+n.name+"_"+n.classDecl.name+":");
//         push(n.rtnType, "$ra");

//         stack = 0;

//         // load this into $s2
//         code.emit(" lw $s2, 4($sp)");

//         n.rtnType.accept(this);
//         visit((MethodDecl)n);
//         n.rtnExp.accept(this);
//         pop(n.rtnType, "$t0");

//         // pop off local variables 
//         popSize(stack);
//         pop(new VoidType(-1), "$ra");
//         code.emit(" jr $ra");

//         return null;
//     }

//     @Override
//     public Object visit(Call c)
//     {
//         code.comment(c, "begin");
//         c.obj.accept(this);
//         c.args.accept(this);


//         //check if super
//         if (c.obj instanceof Super) {
//             code.emit(" jal mth_"+c.methName+"_"+c.methodLink.classDecl.name);
//             if (!c.type.isVoid()) {
//                 push(c.type, "$t0");
//             }
//         } 
//         else {
//             npe("$s2");
//             code.emit(" lw $t0, -12($s2)");
//             code.emit(" lw $t0, "+c.methodLink.vtableOffset*4+"($t0)");
//             code.emit(" jalr $t0 # "+c.methodLink.name);
//             popSize(c.methodLink.paramSize);
//             pop(new VoidType(-1), "$s2");
//             if (!c.type.isVoid()) {
//                 push(c.type, "$t0");
//             }
//         }

//         code.comment(c, "end");


//         return null;
//     }

//     @Override
//     public Object visit(CallStmt c)
//     {
//         code.comment(c, "begin");
        
//         c.callExp.accept(this);
//         pop(c.callExp.type, "$t0"); 

//         code.comment(c, "end");
//         return null;
//     }

//     @Override
//     public Object visit(If n) 
//     {
//         code.comment(n, "begin");
//         n.exp.accept(this);
//         pop(n.exp.type, "$t0");
//         code.emit("    beq $t0, $zero, if_else_"+n.uniqueId);
//         n.trueStmt.accept(this);
//         code.emit("    j if_done_"+n.uniqueId);
//         code.emit("  if_else_"+n.uniqueId+":");
//         n.falseStmt.accept(this);
//         code.emit("  if_done_"+n.uniqueId+":");
//         code.comment(n, "end");
//         return null;
//     }

//     @Override
//     public Object visit(While n)
//     {
//         code.comment(n, "begin");
//         n.stackHeight = stack;
//         code.emit("    j while_cond_"+n.uniqueId);
//         code.emit("  while_top_"+n.uniqueId+":");
//         n.body.accept(this);
//         code.emit("  while_cond_"+n.uniqueId+":");
//         n.exp.accept(this);
//         pop(n.exp.type, "$t0");
//         code.emit("    bne $t0, $zero, while_top_"+n.uniqueId);
//         code.emit("  break_target_"+n.uniqueId+":");
//         code.comment(n, "end");
//         return null;
//     }

//     @Override
//     public Object visit(Break n)
//     {
//         code.comment(n, "begin");
//         popSize(stack - n.breakLink.stackHeight);
//         code.emit("    j break_target_"+n.breakLink.uniqueId);
//         code.comment(n, "end");
//         return null;
//     }

//     @Override
//     public Object visit(Block n) 
//     {
//         code.comment(n, "begin");
//         int topStack = stack;
//         n.stmts.accept(this);
//         if((stack - topStack) > 0) {
//             popSize(stack - topStack);
//         }
//         code.comment(n, "end");
//         return null;
//     }




//     // =================================
//     // this and super
//     // =================================

//     @Override
//     public Object visit(Super n)
//     {
//         code.comment(n, "begin");
//         push(n.type, "$s2");
//         code.comment(n, "end");
//         return null;
//     }

//     @Override 
//     public Object visit(This n)
//     {
//         code.comment(n, "begin");
//         push(n.type, "$s2");
//         code.comment(n, "end");
//         return null;
//     }

//     @Override
//     public Object visit(Null n) 
//     {
//         code.comment(n, "begin");
//         push(n.type, "$zero");
//         code.comment(n, "end");
//         return null;
//     }

    


// }
