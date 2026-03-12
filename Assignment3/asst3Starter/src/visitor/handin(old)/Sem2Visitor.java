// Author: Chengen Li

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
    public Object visit(Program p) 
    {
        p.classDecls.accept(this);

        // Check for inheritanceCycle
        HashSet<ClassDecl> visited = new HashSet<>();
        for (ClassDecl classDecl : classEnv.values()) {
            if (!visited.contains(classDecl)) {
                HashSet<ClassDecl> path = new HashSet<>();
                ClassDecl current = classDecl;
                while (current != null) {
                    if (path.contains(current)) {
                        errorMsg.error(current.pos, CompError.InheritanceCycle(current.name));
                        break;
                    }
                    path.add(current);
                    visited.add(current);
                    current = current.superLink;
                }
            }
        }

        return null;
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

        // Visit nested declarations
        n.decls.accept(this);
        
        return null;
    }

}
