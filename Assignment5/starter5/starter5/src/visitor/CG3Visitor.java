// fresh file because I am cooked

package visitor;

import syntaxtree.*;
import errorMsg.*;
import java.io.*;
import java.util.List;

public class CG3Visitor extends Visitor
{
    // The purpose here is to generate assembly for each Node
    // in the AST.

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

    // =========================================================
    // Helpers
    // =========================================================

    // Push an integer (8 bytes: value word + GC tag word)
    void pushInt(String reg)
    {
        code.emit("  subu $sp, $sp, 8");
        code.emit("  sw $zero, 4($sp)");  // GC tag (zeroed)
        code.emit("  sw " + reg + ", ($sp)");
        stack += 8;
    }

    // Push an object/pointer/boolean (4 bytes)
    void pushObj(String reg)
    {
        code.emit("  subu $sp, $sp, 4");
        code.emit("  sw " + reg + ", ($sp)");
        stack += 4;
    }

    // Push based on type
    void push(Type t, String reg)
    {
        if (t.isInt()) pushInt(reg);
        else pushObj(reg);
    }

    // Pop an integer (8 bytes), loading value into reg
    void popInt(String reg)
    {
        code.emit("  lw " + reg + ", ($sp)");
        code.emit("  addu $sp, $sp, 8");
        stack -= 8;
    }

    // Pop an object/pointer (4 bytes), loading into reg
    void popObj(String reg)
    {
        code.emit("  lw " + reg + ", ($sp)");
        code.emit("  addu $sp, $sp, 4");
        stack -= 4;
    }

    // Pop based on type
    void pop(Type t, String reg)
    {
        if (t.isInt()) popInt(reg);
        else popObj(reg);
    }

    // Pop (discard) exactly `size` bytes
    void popSize(int size)
    {
        if (size > 0)
        {
            code.emit("  addu $sp, $sp, " + size);
            stack -= size;
        }
    }

    // =========================================================
    // Program entry
    // =========================================================

    // Emit bootstrap code to create a Main object and call main().
    // $s2 is set to the new Main object before the call.
    public void fakeMainStmt()
    {
        code.emit("  li $s6, 1");         // 1 data slot (for VMT pointer)
        code.emit("  li $s7, 0");         // 0 object fields
        code.emit("  jal newObject");     // allocate Main object; $s7 = new obj
        code.emit("  la $t0, CLASS_Main");
        code.emit("  sw $t0, -12($s7)"); // install VMT
        code.emit("  addu $sp, $sp, 4"); // pop the object reference newObject left on stack
        code.emit("  move $s2, $s7");    // $s2 = new Main object (this)
        code.emit("  jal mth_main_Main");// call main(); $s2 already set, no extra push needed
    }

    @Override
    public Object visit(Program n)
    {
        code.emit(".text");
        code.emit(".globl main");
        code.emit("main:");
        code.emit("  jal vm_init");

        fakeMainStmt();

        //exit the program
        code.emit("  li $v0, 10");
        code.emit("  syscall");

        // Emit code for all user-defined class methods
        n.classDecls.accept(this);

        code.flush();
        return null;
    }

    // =========================================================
    // Declarations
    // =========================================================

    @Override
    public Object visit(ClassDecl n)
    {
        n.decls.accept(this);
        return null;
    }

    @Override
    public Object visit(MethodDeclVoid n)
    {
        code.emit(".globl mth_" + n.name + "_" + n.classDecl.name);
        code.emit("mth_" + n.name + "_" + n.classDecl.name + ":");

        // Save return address
        code.emit("  subu $sp, $sp, 4");
        code.emit("  sw $ra, ($sp)");

        // Reset frame-local stack height counter
        stack = 0;

        // Generate code for the method body
        n.stmts.accept(this);

        // Pop all locals declared during this method
        popSize(stack);

        // Restore return address and return
        code.emit("  lw $ra, ($sp)");
        code.emit("  addu $sp, $sp, 4");
        code.emit("  jr $ra");

        return null;
    }

    @Override
    public Object visit(LocalDeclStmt n)
    {
        n.localVarDecl.accept(this);
        return null;
    }

    // Declare a local variable: evaluate initExp (which pushes the value),
    // then record the variable's stack offset as -(current stack height).
    // The formula for access later: offset + currentHeight = (H - h) where
    // h = height at declaration and H = current height, giving the correct
    // byte distance from $sp to the variable.
    @Override
    public Object visit(LocalVarDecl n)
    {
        n.initExp.accept(this);   // pushes the initial value onto the stack
        n.offset = -stack;        // record offset so that (offset + stack) = 0 now
        return null;
    }

    // =========================================================
    // Statements
    // =========================================================

    @Override
    public Object visit(CallStmt n)
    {
        n.callExp.accept(this);
        // Call always pushes a return value (even for void); discard it here
        pop(n.callExp.type, "$t0");
        return null;
    }

    @Override
    public Object visit(Block n)
    {
        int startStack = stack;
        n.stmts.accept(this);
        popSize(stack - startStack);
        return null;
    }

    @Override
    public Object visit(If n)
    {
        n.exp.accept(this);
        pop(n.exp.type, "$t0");
        code.emit("  beq $t0, $zero, if_else_" + n.uniqueId);
        n.trueStmt.accept(this);
        code.emit("  j if_done_" + n.uniqueId);
        code.emit("if_else_" + n.uniqueId + ":");
        n.falseStmt.accept(this);
        code.emit("if_done_" + n.uniqueId + ":");
        return null;
    }

    @Override
    public Object visit(While n)
    {
        n.stackHeight = stack;
        code.emit("while_cond_" + n.uniqueId + ":");
        n.exp.accept(this);
        pop(n.exp.type, "$t0");
        code.emit("  beq $t0, $zero, break_target_" + n.uniqueId);
        n.body.accept(this);
        code.emit("  j while_cond_" + n.uniqueId);
        code.emit("break_target_" + n.uniqueId + ":");
        return null;
    }

    @Override
    public Object visit(Break n)
    {
        popSize(stack - n.breakLink.stackHeight);
        code.emit("  j break_target_" + n.breakLink.uniqueId);
        return null;
    }

    @Override
    public Object visit(NewObject n)
    {
        ClassDecl cd = n.objType.link;
        code.emit("  li $s6, " + (cd.numDataFields + 1));
        code.emit("  li $s7, " + cd.numObjFields);
        code.emit("  jal newObject");
        code.emit("  la $t0, CLASS_" + cd.name);
        code.emit("  sw $t0, -12($s7)");
        // newObject already pushed the 4-byte reference onto the stack
        stack += 4;
        return null;
    }


    // =========================================================
    // Assignment
    // =========================================================

    // Assign
    @Override
    public Object visit(Assign n)
    {
        if (n.lhs instanceof IDExp)
        {
            IDExp idLhs = (IDExp) n.lhs;
            VarDecl decl = idLhs.link;
            n.rhs.accept(this);
            pop(n.rhs.type, "$t0");
            if (decl instanceof FieldDecl)
            {
                // this.v = e
                code.emit("  sw $t0, " + decl.offset + "($s2)");
            }
            else
            {
                // local variable or parameter
                code.emit("  sw $t0, " + (decl.offset + stack) + "($sp)");
            }
        }
        else if (n.lhs instanceof FieldAccess)
        {
            FieldAccess fa = (FieldAccess) n.lhs;
            fa.exp.accept(this);         // push object ref
            n.rhs.accept(this);          // push rhs value
            pop(n.rhs.type, "$t0");      // $t0 = rhs
            popObj("$t1");               // $t1 = object ref
            code.emit("  beq $t1, $zero, nullPtrException");
            code.emit("  sw $t0, " + fa.varDec.offset + "($t1)");
        }
        else if (n.lhs instanceof ArrayLookup)
        {
            ArrayLookup al = (ArrayLookup) n.lhs;
            al.arrExp.accept(this);              // push array ref
            al.idxExp.accept(this);              // push index
            n.rhs.accept(this);                  // push rhs value
            pop(n.rhs.type, "$t0");              // $t0 = rhs
            pop(al.idxExp.type, "$t1");          // $t1 = index
            popObj("$t2");                        // $t2 = array ref
            // oob $t2, $t1
            code.emit("  beq $t2, $zero, nullPtrException");
            code.emit("  lw $t3, -4($t2)");
            code.emit("  bgeu $t1, $t3, arrayIndexOutOfBounds");
            // arrLoad $t1, $t2, $t1  =>  $t1 = $t2 + 4*$t1
            code.emit("  sll $t1, $t1, 2");
            code.emit("  addu $t1, $t1, $t2");
            code.emit("  sw $t0, ($t1)");
        }
        return null;
    }

    // =========================================================
    // Expressions: literals
    // =========================================================

    @Override
    public Object visit(IntLit n)
    {
        code.emit("  li $t0, " + n.val);
        pushInt("$t0");
        return null;
    }

    @Override
    public Object visit(StringLit n)
    {
        code.emit("  la $t0, strLit_" + n.uniqueId);
        pushObj("$t0");
        return null;
    }

    // =========================================================
    // Expressions: variable access
    // =========================================================

    // Access a variable. If it is a field (instance variable), load from
    // the object in $s2. Otherwise load from the stack using the offset
    // formula: (n.link.offset + stack) bytes from current $sp.
    @Override
    public Object visit(IDExp n)
    {
        VarDecl decl = n.link;
        if (decl instanceof FieldDecl)
        {
            // Instance variable: object is in $s2
            code.emit("  lw $t0, " + decl.offset + "($s2)");
        }
        else
        {
            // Local variable or parameter
            int offset = decl.offset + stack;
            code.emit("  lw $t0, " + offset + "($sp)");
        }
        push(n.type, "$t0");
        return null;
    }

    // =========================================================
    // Expressions: Leaves
    // =========================================================

    @Override
    public Object visit(This n)
    {
        pushObj("$s2");
        return null;
    }

    @Override
    public Object visit(Super n)
    {
        pushObj("$s2");
        return null;
    }

    @Override
    public Object visit(Null n)
    {
        code.emit("  li $t0, 0");
        push(n.type, "$t0");
        return null;
    }

    @Override
    public Object visit(True n)
    {
        code.emit("  li $t0, 1");
        push(n.type, "$t0");
        return null;
    }

    @Override
    public Object visit(False n)
    {
        code.emit("  li $t0, 0");
        push(n.type, "$t0");
        return null;
    }


    // =========================================================
    // Expressions: Other
    // =========================================================

    // array lookup
    @Override
    public Object visit(ArrayLookup n)
    {
        n.idxExp.accept(this);  
        n.arrExp.accept(this);  
        popObj("$t0");          
        pop(n.idxExp.type, "$t1"); // $t1 = index
        // oob $t0, $t1
        code.emit("  beq $t0, $zero, nullPtrException");
        code.emit("  lw $t3, -4($t0)");
        code.emit("  bgeu $t1, $t3, arrayIndexOutOfBounds");
        // arrLoad $t1, $t0, $t1  =>  $t1 = $t0 + 4*$t1
        code.emit("  sll $t1, $t1, 2");
        code.emit("  addu $t1, $t1, $t0");
        code.emit("  lw $t0, ($t1)");
        push(n.type, "$t0");
        return null;
    }
    
    // field variable access
    @Override
    public Object visit(FieldAccess n)
    {
        n.exp.accept(this);     // push object ref
        popObj("$t0");          // $t0 = object ref
        code.emit("  beq $t0, $zero, nullPtrException");
        code.emit("  lw $t0, " + n.varDec.offset + "($t0)");
        push(n.type, "$t0");
        return null;
    }

    // new array
    @Override
    public Object visit(NewArray n)
    {
        n.sizeExp.accept(this);          
        code.emit("  li $s6, 1");
        popInt("$s7"); // $s7 = size; pop 8 bytes
        code.emit("  jal newObject");
        ArrayType at = (ArrayType) n.type;
        code.emit("  la $t0, CLASS_" + at.vtableName());
        code.emit("  sw $t0, -12($s7)");
        // newObject already pushed the 4-byte reference onto the stack
        stack += 4;
        return null;
    }

    // array length
    @Override
    public Object visit(ArrayLength n)
    {
        n.exp.accept(this);     // push array ref
        popObj("$t0");          // $t0 = array ref
        code.emit("  beq $t0, $zero, nullPtrException");
        code.emit("  lw $t0, -4($t0)");
        pushInt("$t0");
        return null;
    }

    // not
    @Override
    public Object visit(Not n)
    {
        n.exp.accept(this);                // push boolean (4 bytes)
        code.emit("  lw $t0, ($sp)");
        code.emit("  xor $t0, $t0, 1");
        code.emit("  sw $t0, ($sp)");      // modify top-of-stack in place
        return null;
    }


    // cast
    @Override
    public Object visit(Cast n)
    {
        n.exp.accept(this);
        code.emit("  la $t0, CLASS_" + n.castType.vtableName());
        code.emit("  la $t1, END_CLASS_" + n.castType.vtableName());
        code.emit("  jal checkCast");
        // checkCast leaves the (verified) object on the stack unchanged
        return null;
    }

    // instanceOf
    @Override
    public Object visit(InstanceOf n)
    {
        n.exp.accept(this);
        code.emit("  la $t0, CLASS_" + n.checkType.vtableName());
        code.emit("  la $t1, END_CLASS_" + n.checkType.vtableName());
        code.emit("  jal instanceOf");
        // instanceOf replaces the object on the stack with a boolean (same 4 bytes)
        return null;
    }

    // =========================================================
    // Expressions: arithmetic
    // =========================================================

    @Override
    public Object visit(Plus n)
    {
        n.left.accept(this);
        n.right.accept(this);
        pop(n.right.type, "$t2");
        pop(n.left.type, "$t1");
        code.emit("  addu $t0, $t1, $t2");
        push(n.type, "$t0");
        return null;
    }

    @Override
    public Object visit(Minus n)
    {
        n.left.accept(this);
        n.right.accept(this);
        pop(n.right.type, "$t2");
        pop(n.left.type, "$t1");
        code.emit("  subu $t0, $t1, $t2");
        push(n.type, "$t0");
        return null;
    }

    @Override
    public Object visit(Times n)
    {
        n.left.accept(this);
        n.right.accept(this);
        pop(n.right.type, "$t2");
        pop(n.left.type, "$t1");
        code.emit("  mul $t0, $t1, $t2");
        push(n.type, "$t0");
        return null;
    }

    @Override 
    public Object visit(Divide n)
    {
        n.left.accept(this);
        n.right.accept(this);
        code.emit("  jal divide");
        return null;
    }

    @Override
    public Object visit(Remainder n)
    {
        n.left.accept(this);
        n.right.accept(this);
        code.emit("  jal remainder");
        return null;
    }

    @Override 
    public Object visit(Equals n)
    {
        n.left.accept(this);
        n.right.accept(this);
        pop(n.right.type, "$t2");
        pop(n.left.type, "$t1");
        code.emit("  seq $t0, $t1, $t2");
        push(n.type, "$t0");
        return null;
    }

    @Override
    public Object visit(LessThan n)
    {
        n.left.accept(this);
        n.right.accept(this);
        pop(n.right.type, "$t2");
        pop(n.left.type, "$t1");
        code.emit("  slt $t0, $t1, $t2");
        push(n.type, "$t0");
        return null;
    }

    @Override
    public Object visit(GreaterThan n)
    {
        n.left.accept(this);
        n.right.accept(this);
        pop(n.right.type, "$t2");
        pop(n.left.type, "$t1");
        code.emit("  sgt $t0, $t1, $t2");
        push(n.type, "$t0");
        return null;
    }

    @Override
    public Object visit(Or n)
    {
        n.left.accept(this);
        code.emit("  lw $t0, ($sp)");
        code.emit("  beq $t0, $zero, skip_" + n.uniqueId);
        pop(n.left.type, "$t0"); 
        n.right.accept(this);
        code.emit("skip_" + n.uniqueId + ":");
        return null;
    }

    @Override
    public Object visit(And n)
    {
        n.left.accept(this);
        code.emit("  lw $t0, ($sp)");
        code.emit("  beq $t0, $zero, skip_" + n.uniqueId);
        pop(n.left.type, "$t0");
        n.right.accept(this);
        code.emit("skip_" + n.uniqueId + ":");
        return null;
    }




    // =========================================================
    // Method calls
    // =========================================================

    // Generate code for a method call expression e.f(e1, ..., en).
    // Calling convention:
    //   1. Push receiver (e)
    //   2. Push each argument
    //   3. Swap $s2 with receiver slot (paramSize bytes above stack top)
    //   4. Call the method (static jal for super, dynamic jalr for others)
    //   5. Pop arguments (paramSize bytes)
    //   6. Pop (restore) old $s2
    //   7. Push return value ($t0) -- always, even for void
    @Override
    public Object visit(Call n)
    {
        // Step 1: push receiver
        n.obj.accept(this);

        // Step 2: push arguments
        n.args.accept(this);

        int paramSize = n.methodLink.paramSize;

        // Step 3: swap $s2 with the receiver (at paramSize offset from top)
        code.emit("  lw $t0, " + paramSize + "($sp)");
        code.emit("  sw $s2, " + paramSize + "($sp)");
        code.emit("  move $s2, $t0");

        // Step 4: call
        if (n.obj instanceof Super)
        {
            // Static dispatch: call the method directly by its compiled label
            code.emit("  jal mth_" + n.methName + "_" + n.methodLink.classDecl.name);
        }
        else
        {
            // Dynamic dispatch via vtable
            code.emit("  beq $s2, $zero, nullPtrException");
            code.emit("  lw $t0, -12($s2)");
            code.emit("  lw $t0, " + (n.methodLink.vtableOffset * 4) + "($t0)");
            code.emit("  jalr $t0");
        }

        // Step 5: pop arguments
        popSize(paramSize);

        // Step 6: restore old $s2 (was saved in receiver slot by swap)
        popObj("$s2");

        // Step 7: push return value (always; CallStmt will discard it for void)
        push(n.type, "$t0");

        return null;
    }
}

