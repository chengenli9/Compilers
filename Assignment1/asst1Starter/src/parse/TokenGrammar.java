
package parse;
import java.util.List;

// enhancements in assignment:
// - none

import errorMsg.*;

public class TokenGrammar implements wrangLR.runtime.MessageObject
{

    public TokenGrammar(ErrorMsg em)
    {
        errorMsg = em;
    }
    private ErrorMsg errorMsg;

    public void error(int pos, CompError err)
    {
        errorMsg.error(pos, err);
    }

    public void warning(int pos, CompWarning warn)
    {
        errorMsg.warning(pos, warn);
    }


    public void reportTok(int pos, String s)
    {
        errorMsg.token(pos, s);
    }

    // These 2 methods are needed by WrangLR
    // DO NOT USE THEM! They will not pass tests
    public void warning(int pos, String warn)
    {
        errorMsg.info(pos, warn);
    }
    public void error(int pos, String err)
    {
        errorMsg.info(pos, err);
    }


    //////////////////////////////////////////////////////////////////////
    //////// Syntactic-level grammar, which simply recognizes any sequence
    //////// of tokens, and  prints each one
    //////////////////////////////////////////////////////////////////////

    // start-production
    //: start ::= white* token*

    // productions that recognize and print each type of token
    //: token ::= # `boolean =>
    public void sawBoolean(int pos)
    {
        reportTok(pos, "`boolean");
    }
    //: token ::= # `class =>
    public void sawClass(int pos)
    {
        reportTok(pos, "`class");
    }
    //: token ::= # `extends =>
    public void sawExtends(int pos)
    {
        reportTok(pos, "`extends");
    }
    //: token ::= # `void =>
    public void sawVoid(int pos)
    {
        reportTok(pos, "`void");
    }
    //: token ::= # `int =>
    public void sawInt(int pos)
    {
        reportTok(pos, "`int");
    }
    //: token ::= # `while =>
    public void sawWhile(int pos)
    {
        reportTok(pos, "`while");
    }
    //: token ::= # `if =>
    public void sawIf(int pos)
    {
        reportTok(pos, "`if");
    }
    //: token ::= # `else =>
    public void sawElse(int pos)
    {
        reportTok(pos, "`else");
    }
    //: token ::= # `for =>
    public void sawFor(int pos)
    {
        reportTok(pos, "`for");
    }
    //: token ::= # `break =>
    public void sawBreak(int pos)
    {
        reportTok(pos, "`break");
    }
    //: token ::= # `this =>
    public void sawThis(int pos)
    {
        reportTok(pos, "`this");
    }
    //: token ::= # `false =>
    public void sawFalse(int pos)
    {
        reportTok(pos, "`false");
    }
    //: token ::= # `true =>
    public void sawTrue(int pos)
    {
        reportTok(pos, "`true");
    }
    //: token ::= # `super =>
    public void sawSuper(int pos)
    {
        reportTok(pos, "`super");
    }
    //: token ::= # `null =>
    public void sawNull(int pos)
    {
        reportTok(pos, "`null");
    }
    //: token ::= # `return =>
    public void sawReturn(int pos)
    {
        reportTok(pos, "`return");
    }
    //: token ::= # `instanceof =>
    public void sawInstanceof(int pos)
    {
        reportTok(pos, "`instanceof");
    }
    //: token ::= # `new =>
    public void sawNew(int pos)
    {
        reportTok(pos, "`new");
    }
    //: token ::= # `abstract =>
    public void sawAbstract(int pos)
    {
        reportTok(pos, "`abstract");
    }
    //: token ::= # `assert =>
    public void sawAssert(int pos)
    {
        reportTok(pos, "`assert");
    }
    //: token ::= # `byte =>
    public void sawByte(int pos)
    {
        reportTok(pos, "`byte");
    }
    //: token ::= # `case =>
    public void sawCase(int pos)
    {
        reportTok(pos, "`case");
    }
    //: token ::= # `catch =>
    public void sawCatch(int pos)
    {
        reportTok(pos, "`catch");
    }
    //: token ::= # `char =>
    public void sawChar(int pos)
    {
        reportTok(pos, "`char");
    }
    //: token ::= # `const =>
    public void sawConst(int pos)
    {
        reportTok(pos, "`const");
    }
    //: token ::= # `continue =>
    public void sawContinue(int pos)
    {
        reportTok(pos, "`continue");
    }
    //: token ::= # `default =>
    public void sawDefault(int pos)
    {
        reportTok(pos, "`default");
    }
    //: token ::= # `do =>
    public void sawDo(int pos)
    {
        reportTok(pos, "`do");
    }
    //: token ::= # `double =>
    public void sawDouble(int pos)
    {
        reportTok(pos, "`double");
    }
    //: token ::= # `enum =>
    public void sawEnum(int pos)
    {
        reportTok(pos, "`enum");
    }
    //: token ::= # `final =>
    public void sawFinal(int pos)
    {
        reportTok(pos, "`final");
    }
    //: token ::= # `finally =>
    public void sawFinally(int pos)
    {
        reportTok(pos, "`finally");
    }
    //: token ::= # `float =>
    public void sawFloat(int pos)
    {
        reportTok(pos, "`float");
    }
    //: token ::= # `goto =>
    public void sawGoto(int pos)
    {
        reportTok(pos, "`goto");
    }
    //: token ::= # `implements =>
    public void sawImplements(int pos)
    {
        reportTok(pos, "`implements");
    }
    //: token ::= # `import =>
    public void sawImport(int pos)
    {
        reportTok(pos, "`import");
    }
    //: token ::= # `interface =>
    public void sawInterface(int pos)
    {
        reportTok(pos, "`interface");
    }
    //: token ::= # `long =>
    public void sawLong(int pos)
    {
        reportTok(pos, "`long");
    }
    //: token ::= # `native =>
    public void sawNative(int pos)
    {
        reportTok(pos, "`native");
    }
    //: token ::= # `package =>
    public void sawPackage(int pos)
    {
        reportTok(pos, "`package");
    }
    //: token ::= # `private =>
    public void sawPrivate(int pos)
    {
        reportTok(pos, "`private");
    }
    //: token ::= # `protected =>
    public void sawProtected(int pos)
    {
        reportTok(pos, "`protected");
    }
    //: token ::= # `public =>
    public void sawPublic(int pos)
    {
        reportTok(pos, "`public");
    }
    //: token ::= # `short =>
    public void sawShort(int pos)
    {
        reportTok(pos, "`short");
    }
    //: token ::= # `static =>
    public void sawStatic(int pos)
    {
        reportTok(pos, "`static");
    }
    //: token ::= # `strictfp =>
    public void sawStrictfp(int pos)
    {
        reportTok(pos, "`strictfp");
    }
    //: token ::= # `switch =>
    public void sawSwitch(int pos)
    {
        reportTok(pos, "`switch");
    }
    //: token ::= # `synchronized =>
    public void sawSynchronized(int pos)
    {
        reportTok(pos, "`synchronized");
    }
    //: token ::= # `throw =>
    public void sawThrow(int pos)
    {
        reportTok(pos, "`throw");
    }
    //: token ::= # `throws =>
    public void sawThrows(int pos)
    {
        reportTok(pos, "`throws");
    }
    //: token ::= # `transient =>
    public void sawTransient(int pos)
    {
        reportTok(pos, "`transient");
    }
    //: token ::= # `try =>
    public void sawTry(int pos)
    {
        reportTok(pos, "`try");
    }
    //: token ::= # `volatile =>
    public void sawVolatile(int pos)
    {
        reportTok(pos, "`volatile");
    }

    //: token ::= # `! =>
    public void sawNot(int pos)
    {
        reportTok(pos, "`!");
    }
    //: token ::= # `!= =>
    public void sawNotEqual(int pos)
    {
        reportTok(pos, "`!=");
    }
    //: token ::= # `% =>
    public void sawRemainder(int pos)
    {
        reportTok(pos, "`%");
    }
    //: token ::= # `&& =>
    public void sawAnd(int pos)
    {
        reportTok(pos, "`&&");
    }
    //: token ::= # `* =>
    public void sawTimes(int pos)
    {
        reportTok(pos, "`*");
    }
    //: token ::= # `( =>
    public void sawLpar(int pos)
    {
        reportTok(pos, "`(");
    }
    //: token ::= # `) =>
    public void sawRpar(int pos)
    {
        reportTok(pos, "`)");
    }
    //: token ::= # `{ =>
    public void sawLbrace(int pos)
    {
        reportTok(pos, "`{");
    }
    //: token ::= # `} =>
    public void sawRbrace(int pos)
    {
        reportTok(pos, "`}");
    }
    //: token ::= # `- =>
    public void sawMinus(int pos)
    {
        reportTok(pos, "`-");
    }
    //: token ::= # `+ =>
    public void sawPlus(int pos)
    {
        reportTok(pos, "`+");
    }
    //: token ::= # `= =>
    public void sawAssign(int pos)
    {
        reportTok(pos, "`=");
    }
    //: token ::= # `== =>
    public void sawEqual(int pos)
    {
        reportTok(pos, "`==");
    }
    //: token ::= # `[ =>
    public void sawLbrack(int pos)
    {
        reportTok(pos, "`[");
    }
    //: token ::= # `] =>
    public void sawRbrack(int pos)
    {
        reportTok(pos, "`]");
    }
    //: token ::= # `|| =>
    public void sawOr(int pos)
    {
        reportTok(pos, "`||");
    }
    //: token ::= # `< =>
    public void sawLess(int pos)
    {
        reportTok(pos, "`<");
    }
    //: token ::= # `<= =>
    public void sawLessEq(int pos)
    {
        reportTok(pos, "`<=");
    }
    //: token ::= # `, =>
    public void sawComma(int pos)
    {
        reportTok(pos, "`,");
    }
    //: token ::= # `> =>
    public void sawGreater(int pos)
    {
        reportTok(pos, "`>");
    }
    //: token ::= # `>= =>
    public void sawGreaterEq(int pos)
    {
        reportTok(pos, "`>=");
    }
    //: token ::= # `. =>
    public void sawDot(int pos)
    {
        reportTok(pos, "`.");
    }
    //: token ::= # `; =>
    public void sawSemi(int pos)
    {
        reportTok(pos, "`;");
    }
    //: token ::= # `++ =>
    public void sawPlusPlus(int pos)
    {
        reportTok(pos, "`++");
    }
    //: token ::= # `-- =>
    public void sawMinusMinus(int pos)
    {
        reportTok(pos, "`--");
    }
    //: token ::= # `/ =>
    public void sawSlash(int pos)
    {
        reportTok(pos, "`/");
    }
    //: token ::= # `: =>
    public void sawColon(int pos)
    {
        reportTok(pos, "`:");
    }

    //: token ::= # ID =>
    public void identifier(int pos, String s)
    {
        reportTok(pos, "identifier: "+s);
    }

    //: token ::= # INT_LITERAL =>
    public void intLit(int pos, int n)
    {
        reportTok(pos, "integer literal: "+n);
    }

    //: token ::= # STRING_LITERAL =>
    public void stringLit(int pos, String s)
    {
        reportTok(pos, "string literal: "+s);
    }

    //: token ::= # CHAR_LITERAL =>
    public void charLit(int pos, int n)
    {
        reportTok(pos, "character literal with ASCII value: "+n);
    }

    //////////////////////////////////////////
    /// Your modifications should start here
    //////////////////////////////////////////

    //================================================================
    // the actual tokens
    //================================================================

    // reserved words
    //: `class ::= "class" !idChar white*
    //: reserved ::= `class
    //: `else ::= "else" !idChar white*
    //: reserved ::= `else

    //special-token characters
    //: `!= ::= "!=" white*
    //: `+ ::= "+" !"+" white*


    // a numeric literal
    //: INT_LITERAL ::= # digit++ white* =>
    public int convertToInt(int pos, List<Character> s)
    {
        try
        {
            return Integer.parseInt(s.toString());
        }
        catch (NumberFormatException nfx)
        {
            error(pos, CompError.OutOfRange(s.toString())); 
            return 0;
        }
    }

    //================================================================
    // character patterns -- "helper symbols"
    //================================================================

    // a character that can be a non-first character in an identifier
    //: idChar ::= letter => pass
    //: idChar ::= digit => pass
    //: idChar ::= "_" => pass

    //: letter ::= {"a".."z" "A".."Z"} => pass

    //: digit ::= {"0".."9"} => pass

    //================================================================
    // whitespace
    //================================================================

    // whitespace
    //: white ::= {" " 9 12} // space or tab or form feed
    //: white ::= eol

    // to handle the common end-of-line sequences on different types
    // of systems, we treat the sequence CR+LF as an end of line.
    // Otherwise, we treat CR or LF appearing separately each as an
    // end of line.
    //: eol ::= {10} registerNewline
    //: eol ::= {13} {10} registerNewline
    //: eol ::= {13} !{10} registerNewline

    // empty symbol which registers a new line at the position reduced
    //: registerNewline ::= # =>
    public void registerNewline(int pos)
    {
        errorMsg.newline(pos-1);
    }

    // Potentially useful definitions
    // printable is any character than shows up when you type
    //: printable ::= {" ".."~"} => pass

    // The end of file is when we don't match any character.
    // eof is the end of file.  It does not match any character.
    //: eof ::= !{0..255} => void

    //////////// DUMMY TOKEN AND WHITESPACE DEFINITIONS ////////////
    // Once you create a real definition for one of the below, it will
    // reduce the number of states of you remove (or comment out) the
    // dummy definition.
    ////////////////////////////////////////////////////////////////
    
    // ============ Comment Handling =============
    //: oneLineComment :: "//" printable** eol

    //: blockCommentStart ::= "/*"
    //: blockCommentEnd ::= "*/"

    //: invalidCommentContent ::= blockCommentStart
    //: invalidcommentContent ::= blockCommentEnd


    


    //: `! ::= "!" !"=" white*
    //: `% ::= "%" white* 
    //: `&& ::= "&&" white* 
    //: `* ::= "*" white* 
    //: `( ::= "(" white* 
    //: `) ::= ")" white* 
    //: `{ ::= "{" white* 
    //: `} ::= "}" white* 
    //: `- ::= "-" !"-" white* 
    //: `= ::= "=" white* 
    //: `== ::= "==" white* 
    //: `[ ::= "[" white* 
    //: `] ::= "]" white* 
    //: `|| ::= "||" white* 
    //: `< ::= "<" !"=" white* 
    //: `<= ::= "<=" white* 
    //: `, ::= "," white* 
    //: `> ::= ">" !"=" white* 
    //: `>= ::= ">=" white* 
    //: `: ::= ":" white* 
    //: `. ::= "." white* 
    //: `; ::= ";" white* 
    //: `++ ::= "++" white* 
    //: `-- ::= "--" white* 
    //: `/ ::= !"*" "/" !{"*" "/"} white* 

    //: `boolean ::= "boolean" !idChar white* => void
    //: reserved ::= `boolean
    //: `extends ::= "extends" !idChar white* => void
    //: reserved ::= `extends
    //: `void ::= "void" !idChar white* => void
    //: reserved ::= `void
    //: `int ::= "int" !idChar white* => void
    //: reserved ::= `int
    //: `while ::= "while" !idChar white* => void
    //: reserved ::= `while
    //: `if ::= "if" !idChar white* => void
    //: reserved ::= `if
    //: `for ::= "for" !idChar white* => void
    //: reserved ::= `for
    //: `break ::= "break" !idChar white* => void
    //: reserved ::= `break
    //: `this ::= "this" !idChar white* => void
    //: reserved ::= `this
    //: `false ::= "false" !idChar white* => void
    //: reserved ::= `false
    //: `true ::= "true" !idChar white* => void
    //: reserved ::= `true
    //: `super ::= "super" !idChar white* => void
    //: reserved ::= `super
    //: `null ::= "null" !idChar white* => void
    //: reserved ::= `null
    //: `return ::= "return" !idChar white* => void
    //: reserved ::= `return
    //: `instanceof ::=  "instanceof" !idChar White* => void
    //: reserved ::= `instanceof
    //: `new ::= "new" !idChar white* => void
    //: reserved ::= `new
    //: `abstract ::= "abstract" !idChar white* => void
    //: reserved ::= `abstract
    //: `assert ::= "assert" !idChar white* => void
    //: reserved ::= `assert
    //: `byte ::= "byte" !idChar white* => void
    //: reserved ::= `byte
    //: `case ::= "case" !idChar white* => void
    //: reserved ::= `case
    //: `catch ::= "catch" !idChar white* => void
    //: reserved ::= `catch
    //: `char ::= "char" !idChar white* => void
    //: reserved ::= `char
    //: `const ::= "const" !idChar white* => void
    //: reserved ::= `const
    //: `continue ::= "continue" !idChar white* => void
    //: reserved ::= `continue
    //: `default ::= "default" !idChar white* => void
    //: reserved ::= `default
    //: `do ::= "do" !idChar white* => void
    //: reserved ::= `do
    //: `double ::= "double" !idChar white* => void
    //: reserved ::= `double
    //: `enum ::= "enum" !idChar white* => void
    //: reserved ::= `enum
    //: `final ::= "final" !idChar white* => void
    //: reserved ::= `final
    //: `finally ::= "finally" !idChar white* => void
    //: reserved ::= `finally
    //: `float ::= "float" !idChar white* => void
    //: reserved ::= `float
    //: `goto ::= "goto" !idChar white* => void
    //: reserved ::= `goto
    //: `implements ::= "implements" !idChar white* => void
    //: reserved ::= `implements
    //: `import ::= "import" !idChar white* => void
    //: reserved ::= `import
    //: `interface ::= "interface" !idChar white* => void
    //: reserved ::= `interafce
    //: `long ::= "long" !idChar white* => void
    //: reserved ::= `long
    //: `native ::= "native" !idChar white* => void
    //: reserved ::= `native
    //: `package ::= "package" !idChar white* => void
    //: reserved ::= `package
    //: `private ::= "private" !idChar white* => void
    //: reserved ::= `private
    //: `protected ::= "protected" !idChar white* => void
    //: reserved ::= `protected
    //: `public ::= "public" !idChar white* => void
    //: reserved ::= `public
    //: `short ::= "short" !idChar white* => void
    //: reserved ::= `short
    //: `static ::= "static" !idChar white* => void
    //: reserved ::= `static
    //: `strictfp ::= "strictfp" !idChar white* => void
    //: reserved ::= `strictfp
    //: `switch ::= "switch" !idChar white* => void
    //: reserved ::= `switch
    //: `synchronized ::= "synchronized" !idChar white* => void
    //: reserved ::= `synchronized
    //: `throw ::= "throw" !idChar white* => void
    //: reserved ::= `throw
    //: `throws ::= "throws" !idChar white* => void
    //: reserved ::= `throws
    //: `transient ::= "transient" !idChar white* => void
    //: reserved ::= `transient
    //: `try ::= "try" !idChar white* => void
    //: reserved ::= `try
    //: `volatile ::= "volatile" !idChar white* => void
    //: reserved ::= `volatile

    //: ID ::= !rerserved letter++ idChar* white* => text
    //: STRING_LITERAL ::= !{255} {255} => text
    //: CHARACTER_LITERAL ::= !{255} {255} => int return0(char)
    
    public int return0(char dummy) { return 0; }

}
