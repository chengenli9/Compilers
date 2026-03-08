package visitor;

import errorMsg.*;
import java.util.*;
import syntaxtree.*;

// the purpose of this class is to
// - link each ClassDecl to the ClassDecl for its superclass 
//    (via its 'superLink')
// - link each ClassDecl to each of its subclasses 
//    (via the 'subclasses' instance variable)
// - ensure that there are no cycles in the inheritance hierarchy
// - ensure that no class has 'String' or 'RunMain' as its superclass
public class Sem2Visitor extends Visitor
{

    HashMap<String,ClassDecl> classEnv;
    ErrorMsg errorMsg;

    public Sem2Visitor(HashMap<String,ClassDecl> env, ErrorMsg e)
    {
        errorMsg = e;
        classEnv = env;
    }

    @Override 
    public Object visit(ClassDecl n)
    {
        // Check if superclass is String or RunMain
        if (n.superName.equals("String") || n.superName.equals("RunMain")) {
            errorMsg.error(n.pos, CompError.IllegalSuperclass(n.superName));
            return null;
        }
        
        // Look up superclass
        ClassDecl superclass = classEnv.get(n.superName);
        if (superclass == null) {
            errorMsg.error(n.pos, CompError.UndefinedSuperclass(n.superName));
            return null;
        }
        
        n.superLink = superclass;
        superclass.subclasses.add(n);

        // Check for inheritance cycles
        ClassDecl current = superclass;
        while (current != null) {
            if (current == n) {
                errorMsg.error(n.pos, CompError.InheritanceCycle(n.name));
                return null;
            }
            current = current.superLink;
        }
        
        // Visit nested declarations
        n.decls.accept(this);
        
        return null;
    }

    

}
