package visitor;

import syntaxtree.*;

import java.util.*;

import errorMsg.*;
import java.io.*;

//the purpose here is to annotate things with their offsets:
// - formal parameters, with respect to the (callee) frame
// - instance variables, with respect to their slot in the object
// - methods, with respect to their slot in the v-table
// - (Optionally) generate all v-tables.
public class CG1Visitor extends Visitor
{

    // This variable will determine if we print out the offsets
    // You can turn this to false when you're sure you're generating them
    // correctly, but this can be very helpful for debugging.
    boolean PRINT_OFFSETS = true;

    // IO stream to emit code.
    CodeStream code;

    //used to track the object class, since that's
    //the root of the inheritance tree.
    private ClassDecl object;

    //current class we're visiting.
    private ClassDecl currentClass;

    ////////////////////////////////////////////////////////////
    // This is used for doing your own VMT generation.
    // Otherwise you don't need it.
    ////////////////////////////////////////////////////////////
    // to collect the array types that are referenced in the code
    private HashSet<ArrayType> arrayTypes;

    public CG1Visitor(ErrorMsg e, PrintStream out, ClassDecl Object)
    {
        code = new CodeStream(out, e);
        object = Object;
        arrayTypes = new HashSet<ArrayType>();
    }

    public Object visit(Program p)
    {
        // comment the following line out if 
        // you are doing your own vtable generation:
        VtableGenerator.generate(p, code);

        setOffsets(object);

        printOffsets(p);

        return null;
    }

    /**
     * Print out all of the Method and Field offsets for each class in the program.
     * If PRINT_OFFSETS is set to false, then this doesn't do anything.
     */
    void printOffsets(Program p)
    {
        if(PRINT_OFFSETS)
        {
            for(ClassDecl c : p.classDecls)
            {
                for(Decl d : c.decls)
                {
                    if(d instanceof FieldDecl v)
                    {
                        System.out.println("field " + c.name + "." + v.name + 
                                           " offset = " + v.offset);
                    }
                    else if(d instanceof MethodDecl m)
                    {
                        for(VarDecl v : m.params)
                        {
                            System.out.println(m.name + " parameter " + v.name + 
                                               " offset = " + v.offset);
                        }
                    }
                }
            }
        }
    }

    /* We can't use the standard visitor pattern for setting offsets.
     * We need to do a preorder traversal of the inheritance tree!
     * We'll start by setting the offsets for Object.
     * You need to continue the traversal with all of the subclasses.
     */
    private void setOffsets(ClassDecl c)
    {
        int numDataFields = 0;
        int numObjFields = 0;
        
        // Count fields from parent class
        if(c.superLink != null)
        {
            numDataFields = c.superLink.numDataFields;
            numObjFields = c.superLink.numObjFields;
        }
        
        // Assign offsets to fields in this class
        for(Decl d : c.decls)
        {
            if(d instanceof FieldDecl v)
            {
                if(v.type.isInt() || v.type.isBoolean())
                {
                    // Data field: assign negative offset
                    // Offsets: -16, -20, -24, -28
                    numDataFields++;
                    v.offset = -(4 * (numDataFields + 3));
                }
                else
                {
                    // Object field: assign positive offset (0, 4, 8, 12)
                    v.offset = 4 * numObjFields;
                    numObjFields++;
                }
            }
        }
        
        // Store the total counts in the class
        c.numDataFields = numDataFields;
        c.numObjFields = numObjFields;
        
        // Assign offsets to method parameters
        for(Decl d : c.decls)
        {
            if(d instanceof MethodDecl m)
            {
                // Parameters are stored on stack in order
                // First parameter (this) at offset 4, others at higher offsets
                if(m.params != null && !m.params.isEmpty())
                {
                    int paramOffset = 4;
                    
                    // Iterate in order (from first to last parameter)
                    for(int i = 0; i < m.params.size(); i++)
                    {
                        VarDecl param = m.params.get(i);
                        param.offset = paramOffset;
                        
                        // Move to next parameter
                        if(param.type.isInt())
                        {
                            paramOffset += 8;  
                        }
                        else
                        {
                            paramOffset += 4;  
                        }
                    }
                }
            }
        }
        
        // Recursively set offsets for all subclasses
        if(c.subclasses != null)
        {
            for(ClassDecl subclass : c.subclasses)
            {
                setOffsets(subclass);
            }
        }
    }
   


    /////////////////////////////////////////////////////////////
    //
    // helper methods for generating VMTs
    //
    /////////////////////////////////////////////////////////////

    /**
     * emits the name of the class as a sequence of bytes.
     * This is used by the default implementation of toString(),
     * So, we need it as part of the VMT.
     */
    public void emitPrintName(AstNode n, String name)
    {
        // emit padding bytes for string
        for(int i = name.length()%4; 0 < i && i < 4; i++)
        {
            code.emit(n, "  .byte 0");
        }

        //print out the first character with the first bit set to 1
        //This allows the toString method to know that
        //we've reached the first character of the string.
        code.emit(n, "  .byte "+ ((int)name.charAt(0) | 0x80) +
                     " # '"+name.charAt(0)+"' with high bit set");
        for(char c : name.substring(1).toCharArray())
        {
            code.emit(n, "  .byte "+(int)c+ " # '"+c+"'");
        }
    }

    /**
     * Emit VMT for arrays.
     * Since arrays can't override methods, 
     * they have the same VMT as Object.
     */
    public void emitArrayTypeVtables()
    {
        // emit object arrays before int and bool arrays (if they exists)
        // because the garbage collector
        // needs to know if it's a data array.
        ArrayType iarr = null;
        ArrayType barr = null;
        for(ArrayType at : arrayTypes)
        {
            if(at.baseType.isInt())
            {
                iarr = at;
            }
            else if(at.baseType.isBoolean())
            {
                barr = at;
            }
            else
            {
                emitArray(at);
            }
        }
        code.emit(new IntType(-1), "dataArrayVTableStart:");
        if(iarr != null)
        {
            emitArray(iarr);
        }
        if(barr != null)
        {
            emitArray(barr);
        }
    }

    public void emitArray(ArrayType at)
    {
        emitPrintName(at, at.typeName());
        code.emit(at, "CLASS_"+at.vtableName()+":");
        code.emit(at, "  .word mth_Object_hashCode");
        code.emit(at, "  .word mth_Object_equals");
        code.emit(at, "  .word mth_Object_toString");
        code.emit(at, "END_CLASS_"+at.vtableName()+":");
    }


}

