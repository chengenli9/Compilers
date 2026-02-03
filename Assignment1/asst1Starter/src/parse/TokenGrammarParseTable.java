package
parse
;
import
java
.
util
.
List
;
import
errorMsg
.
*
;
public class TokenGrammarParseTable implements wrangLR.runtime.ParseTable {
public int getEofSym() { return 180; }
public int getNttSym() { return 181; }
private String[] symNameTable = {
"$$start",
"start",
"white*",
"$$0",
"token",
"`boolean",
"`class",
"`extends",
"`void",
"`int",
"`while",
"`if",
"`else",
"`for",
"`break",
"`this",
"`false",
"`true",
"`super",
"`null",
"`return",
"`instanceof",
"`new",
"`abstract",
"`assert",
"`byte",
"`case",
"`catch",
"`char",
"`const",
"`continue",
"`default",
"`do",
"`double",
"`enum",
"`final",
"`finally",
"`float",
"`goto",
"`implements",
"`import",
"`interface",
"`long",
"`native",
"`package",
"`private",
"`protected",
"`public",
"`short",
"`static",
"`strictfp",
"`switch",
"`synchronized",
"`throw",
"`throws",
"`transient",
"`try",
"`volatile",
"`!",
"`!=",
"`%",
"`&&",
"`*",
"`(",
"`)",
"`{",
"`}",
"`-",
"`+",
"`=",
"`==",
"`[",
"`]",
"`||",
"`<",
"`<=",
"`,",
"`>",
"`>=",
"`.",
"`;",
"`++",
"`--",
"`/",
"`:",
"ID",
"INT_LITERAL",
"STRING_LITERAL",
"CHAR_LITERAL",
"\"c\"",
"\"l\"",
"\"a\"",
"\"s\"",
"idChar",
"reserved",
"\"e\"",
"\"!\"",
"\"=\"",
"\"+\"",
"\"0\"",
"digit++",
"digit",
"\"x\"",
"\"X\"",
"hex",
"letter",
"\"_\"",
"\"d\"",
"\"g\"",
"\"m\"",
"\"p\"",
"\"v\"",
"\"y\"",
"\"f\"",
"\"i\"",
"{\"A\"..\"W\" \"Y\"..\"Z\"}",
"\"o\"",
"\"r\"",
"\"u\"",
"{\"j\" \"q\"}",
"\"b\"",
"\"h\"",
"\"k\"",
"\"n\"",
"\"t\"",
"\"w\"",
"\"z\"",
"{\"1\"..\"9\"}",
"white",
"12",
"\" \"",
"9",
"eol",
"comment",
"oneLineComment",
"blockComment",
"\"/\"",
"printable**",
"printable",
"\"*\"",
"blockCommentContent*",
"blockCommentContent",
"\"[\"",
"\"-\"",
"\"<\"",
"\"|\"",
"{\"?\"..\"@\"}",
"\"&\"",
"\")\"",
"\",\"",
"\"]\"",
"{\"#\"..\"$\"}",
"\";\"",
"\">\"",
"\"{\"",
"\"%\"",
"\"(\"",
"\"\\\"",
"\".\"",
"\":\"",
"\"}\"",
"{\"^\" \"`\" \"~\"}",
"\"\'\"",
"\'\"\'",
"10",
"13",
"stringPrintable",
"recognizeEscapeChar",
"charPrintable",
"letter++",
"idChar**",
"$$1",
"stringPrintable*",
"$$2",
"escapeChars",
"token*",
"printable*",
"digit+",
"idChar*",
"letter+",
"$",
"$NT",
};
public String symName(int n) {
 return n >= 0 && n < symNameTable.length ? symNameTable[n] : "??";
}
private TokenGrammar actionObject;
public int[][] getParseTable() { return parseTable; }
public int numSymbols() { return 182;}
private static final int MIN_REDUCTION = 1652;
public int minReduction() { return MIN_REDUCTION;}
private static final int MAX_ACCEPT_REDUCTION = MIN_REDUCTION+1;
public int maxAcceptReduction() { return MAX_ACCEPT_REDUCTION; }
private final int[][] parseTable;
public void error(int pos, String msg){
 if (((Object)actionObject) instanceof wrangLR.runtime.MessageObject)
 ((wrangLR.runtime.MessageObject)(Object)actionObject).error(pos,msg);
 else System.err.println("file position "+pos+": "+msg);}
public void warning(int pos, String msg){
 if (((Object)actionObject) instanceof wrangLR.runtime.MessageObject)
 ((wrangLR.runtime.MessageObject)(Object)actionObject).warning(pos,msg);
 else System.err.println("file position "+pos+"(warning): "+msg);}
public String filePosString(int pos){
 if (((Object)actionObject) instanceof wrangLR.runtime.FilePosObject)
 return ((wrangLR.runtime.FilePosObject)(Object)actionObject).filePosString(pos);
 else return ""+pos;}
public boolean parse(java.io.InputStream is) {
	return new wrangLR.runtime.BaseParser(this).parse(is);
}
public boolean parse(java.io.InputStream is, int verboseLevel, boolean verboseReductions) {
	return new wrangLR.runtime.BaseParser(this,verboseLevel,verboseReductions).parse(is);
}
private class Initter1{
public int doInit(int startIdx) {
  for (int i = 0; i < myParseTable.length; i++) {
    parseTable[i+startIdx] = myParseTable[i];
  }
  return myParseTable.length;
}
private final int[][] myParseTable = {
{ // state 0
0x80000000|1642, // match move
0x80000000|415, // no-match move
// T-test match for "0":
99,
  }
,
{ // state 1
  }
,
{ // state 2
0x80000000|1385, // match move
0x80000000|529, // no-match move
0x80000000|1258, // NT-test-match state for reserved
  }
,
{ // state 3
0x80000000|1396, // match move
0x80000000|220, // no-match move
// T-test match for "0":
99,
  }
,
{ // state 4
MIN_REDUCTION+2, // (default reduction)
  }
,
{ // state 5
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+247, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
972, // `!
312, // `!=
1102, // `%
1560, // `&&
293, // `*
647, // `(
123, // `)
1355, // `{
95, // `}
413, // `-
1444, // `+
67, // `=
1322, // `==
109, // `[
551, // `]
1370, // `||
168, // `<
53, // `<=
1559, // `,
604, // `>
1435, // `>=
1247, // `.
1490, // `;
111, // `++
50, // `--
152, // `/
385, // `:
872, // ID
161, // INT_LITERAL
485, // STRING_LITERAL
769, // CHAR_LITERAL
513, // "c"
513, // "l"
513, // "a"
513, // "s"
-1, // idChar
-1, // reserved
513, // "e"
637, // "!"
1360, // "="
1616, // "+"
305, // "0"
566, // digit++
961, // digit
513, // "x"
513, // "X"
-1, // hex
1361, // letter
-1, // "_"
513, // "d"
513, // "g"
513, // "m"
513, // "p"
513, // "v"
513, // "y"
513, // "f"
513, // "i"
513, // {"A".."W" "Y".."Z"}
513, // "o"
513, // "r"
513, // "u"
513, // {"j" "q"}
513, // "b"
513, // "h"
513, // "k"
513, // "n"
513, // "t"
513, // "w"
513, // "z"
305, // {"1".."9"}
1304, // white
1602, // {12}
1602, // " "
1602, // {9}
381, // eol
1433, // comment
565, // oneLineComment
26, // blockComment
1572, // "/"
-1, // printable**
-1, // printable
1638, // "*"
-1, // blockCommentContent*
-1, // blockCommentContent
582, // "["
295, // "-"
174, // "<"
182, // "|"
-1, // {"?".."@"}
164, // "&"
1357, // ")"
155, // ","
369, // "]"
-1, // {"#".."$"}
387, // ";"
1173, // ">"
1611, // "{"
978, // "%"
1273, // "("
-1, // "\"
319, // "."
246, // ":"
984, // "}"
-1, // {"^" "`" "~"}
995, // "'"
1482, // '"'
418, // {10}
1458, // {13}
-1, // stringPrintable
-1, // recognizeEscapeChar
-1, // charPrintable
792, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
-1, // escapeChars
-1, // token*
-1, // printable*
466, // digit+
-1, // idChar*
883, // letter+
MIN_REDUCTION+247, // $
-1, // $NT
  }
,
{ // state 6
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+286, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
972, // `!
312, // `!=
1102, // `%
1560, // `&&
293, // `*
647, // `(
123, // `)
1355, // `{
95, // `}
413, // `-
1444, // `+
67, // `=
1322, // `==
109, // `[
551, // `]
1370, // `||
168, // `<
53, // `<=
1559, // `,
604, // `>
1435, // `>=
1247, // `.
1490, // `;
111, // `++
50, // `--
152, // `/
385, // `:
872, // ID
161, // INT_LITERAL
485, // STRING_LITERAL
769, // CHAR_LITERAL
513, // "c"
513, // "l"
513, // "a"
513, // "s"
-1, // idChar
-1, // reserved
513, // "e"
637, // "!"
1360, // "="
1616, // "+"
305, // "0"
566, // digit++
961, // digit
513, // "x"
513, // "X"
-1, // hex
1361, // letter
-1, // "_"
513, // "d"
513, // "g"
513, // "m"
513, // "p"
513, // "v"
513, // "y"
513, // "f"
513, // "i"
513, // {"A".."W" "Y".."Z"}
513, // "o"
513, // "r"
513, // "u"
513, // {"j" "q"}
513, // "b"
513, // "h"
513, // "k"
513, // "n"
513, // "t"
513, // "w"
513, // "z"
305, // {"1".."9"}
1304, // white
1602, // {12}
1602, // " "
1602, // {9}
381, // eol
1433, // comment
565, // oneLineComment
26, // blockComment
1572, // "/"
-1, // printable**
-1, // printable
1638, // "*"
-1, // blockCommentContent*
-1, // blockCommentContent
582, // "["
295, // "-"
174, // "<"
182, // "|"
-1, // {"?".."@"}
164, // "&"
1357, // ")"
155, // ","
369, // "]"
-1, // {"#".."$"}
387, // ";"
1173, // ">"
1611, // "{"
978, // "%"
1273, // "("
-1, // "\"
319, // "."
246, // ":"
984, // "}"
-1, // {"^" "`" "~"}
995, // "'"
1482, // '"'
418, // {10}
1458, // {13}
-1, // stringPrintable
-1, // recognizeEscapeChar
-1, // charPrintable
792, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
-1, // escapeChars
-1, // token*
-1, // printable*
466, // digit+
-1, // idChar*
883, // letter+
MIN_REDUCTION+286, // $
-1, // $NT
  }
,
{ // state 7
181,MIN_REDUCTION+315, // $NT
  }
,
{ // state 8
2,331, // white*
128,376, // white
132,381, // eol
133,1433, // comment
134,565, // oneLineComment
135,26, // blockComment
MIN_REDUCTION+160, // (default reduction)
  }
,
{ // state 9
128,1304, // white
132,381, // eol
133,1433, // comment
134,565, // oneLineComment
135,26, // blockComment
MIN_REDUCTION+271, // (default reduction)
  }
,
{ // state 10
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+262, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
972, // `!
312, // `!=
1102, // `%
1560, // `&&
293, // `*
647, // `(
123, // `)
1355, // `{
95, // `}
413, // `-
1444, // `+
67, // `=
1322, // `==
109, // `[
551, // `]
1370, // `||
168, // `<
53, // `<=
1559, // `,
604, // `>
1435, // `>=
1247, // `.
1490, // `;
111, // `++
50, // `--
152, // `/
385, // `:
872, // ID
161, // INT_LITERAL
485, // STRING_LITERAL
769, // CHAR_LITERAL
513, // "c"
513, // "l"
513, // "a"
513, // "s"
-1, // idChar
-1, // reserved
513, // "e"
637, // "!"
1360, // "="
1616, // "+"
305, // "0"
566, // digit++
961, // digit
513, // "x"
513, // "X"
-1, // hex
1361, // letter
-1, // "_"
513, // "d"
513, // "g"
513, // "m"
513, // "p"
513, // "v"
513, // "y"
513, // "f"
513, // "i"
513, // {"A".."W" "Y".."Z"}
513, // "o"
513, // "r"
513, // "u"
513, // {"j" "q"}
513, // "b"
513, // "h"
513, // "k"
513, // "n"
513, // "t"
513, // "w"
513, // "z"
305, // {"1".."9"}
1304, // white
1602, // {12}
1602, // " "
1602, // {9}
381, // eol
1433, // comment
565, // oneLineComment
26, // blockComment
1572, // "/"
-1, // printable**
-1, // printable
1638, // "*"
-1, // blockCommentContent*
-1, // blockCommentContent
582, // "["
295, // "-"
174, // "<"
182, // "|"
-1, // {"?".."@"}
164, // "&"
1357, // ")"
155, // ","
369, // "]"
-1, // {"#".."$"}
387, // ";"
1173, // ">"
1611, // "{"
978, // "%"
1273, // "("
-1, // "\"
319, // "."
246, // ":"
984, // "}"
-1, // {"^" "`" "~"}
995, // "'"
1482, // '"'
418, // {10}
1458, // {13}
-1, // stringPrintable
-1, // recognizeEscapeChar
-1, // charPrintable
792, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
-1, // escapeChars
-1, // token*
-1, // printable*
466, // digit+
-1, // idChar*
883, // letter+
MIN_REDUCTION+262, // $
-1, // $NT
  }
,
{ // state 11
0x80000000|1130, // match move
0x80000000|784, // no-match move
0x80000000|1258, // NT-test-match state for reserved
  }
,
{ // state 12
0x80000000|1155, // match move
0x80000000|279, // no-match move
// T-test match for "0":
99,
  }
,
{ // state 13
MIN_REDUCTION+325, // (default reduction)
  }
,
{ // state 14
0x80000000|987, // match move
0x80000000|162, // no-match move
0x80000000|1258, // NT-test-match state for reserved
  }
,
{ // state 15
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+139, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
972, // `!
312, // `!=
1102, // `%
1560, // `&&
293, // `*
647, // `(
123, // `)
1355, // `{
95, // `}
413, // `-
1444, // `+
67, // `=
1322, // `==
109, // `[
551, // `]
1370, // `||
168, // `<
53, // `<=
1559, // `,
604, // `>
1435, // `>=
1247, // `.
1490, // `;
111, // `++
50, // `--
152, // `/
385, // `:
872, // ID
161, // INT_LITERAL
485, // STRING_LITERAL
769, // CHAR_LITERAL
513, // "c"
513, // "l"
513, // "a"
513, // "s"
-1, // idChar
-1, // reserved
513, // "e"
637, // "!"
1360, // "="
1616, // "+"
305, // "0"
566, // digit++
961, // digit
513, // "x"
513, // "X"
-1, // hex
1361, // letter
-1, // "_"
513, // "d"
513, // "g"
513, // "m"
513, // "p"
513, // "v"
513, // "y"
513, // "f"
513, // "i"
513, // {"A".."W" "Y".."Z"}
513, // "o"
513, // "r"
513, // "u"
513, // {"j" "q"}
513, // "b"
513, // "h"
513, // "k"
513, // "n"
513, // "t"
513, // "w"
513, // "z"
305, // {"1".."9"}
1304, // white
1602, // {12}
1602, // " "
1602, // {9}
381, // eol
1433, // comment
565, // oneLineComment
26, // blockComment
1572, // "/"
-1, // printable**
-1, // printable
1638, // "*"
-1, // blockCommentContent*
-1, // blockCommentContent
582, // "["
295, // "-"
174, // "<"
182, // "|"
-1, // {"?".."@"}
164, // "&"
1357, // ")"
155, // ","
369, // "]"
-1, // {"#".."$"}
387, // ";"
1173, // ">"
1611, // "{"
978, // "%"
1273, // "("
-1, // "\"
319, // "."
246, // ":"
984, // "}"
-1, // {"^" "`" "~"}
995, // "'"
1482, // '"'
418, // {10}
1458, // {13}
-1, // stringPrintable
-1, // recognizeEscapeChar
-1, // charPrintable
792, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
-1, // escapeChars
-1, // token*
-1, // printable*
466, // digit+
-1, // idChar*
883, // letter+
MIN_REDUCTION+139, // $
-1, // $NT
  }
,
{ // state 16
MIN_REDUCTION+271, // (default reduction)
  }
,
{ // state 17
0x80000000|1, // match move
0x80000000|799, // no-match move
0x80000000|36, // NT-test-match state for idChar
  }
,
{ // state 18
181,MIN_REDUCTION+213, // $NT
  }
,
{ // state 19
0x80000000|1228, // match move
0x80000000|1535, // no-match move
0x80000000|1258, // NT-test-match state for reserved
  }
,
{ // state 20
0x80000000|113, // match move
0x80000000|738, // no-match move
0x80000000|1258, // NT-test-match state for reserved
  }
,
{ // state 21
90,17, // "l"
  }
,
{ // state 22
0x80000000|464, // match move
0x80000000|186, // no-match move
// T-test match for "0":
99,
  }
,
{ // state 23
181,MIN_REDUCTION+210, // $NT
  }
,
{ // state 24
0x80000000|779, // match move
0x80000000|195, // no-match move
// T-test match for "0":
99,
  }
,
{ // state 25
0x80000000|1224, // match move
0x80000000|1429, // no-match move
0x80000000|1258, // NT-test-match state for reserved
  }
,
{ // state 26
MIN_REDUCTION+117, // (default reduction)
  }
,
{ // state 27
MIN_REDUCTION+26, // (default reduction)
  }
,
{ // state 28
181,MIN_REDUCTION+297, // $NT
  }
,
{ // state 29
108,696, // "g"
  }
,
{ // state 30
128,1304, // white
132,381, // eol
133,1433, // comment
134,565, // oneLineComment
135,26, // blockComment
MIN_REDUCTION+304, // (default reduction)
  }
,
{ // state 31
92,661, // "s"
124,634, // "t"
  }
,
{ // state 32
90,1413, // "l"
  }
,
{ // state 33
112,1231, // "y"
118,1136, // "u"
121,1589, // "h"
124,163, // "t"
125,1528, // "w"
  }
,
{ // state 34
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+183, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
972, // `!
312, // `!=
1102, // `%
1560, // `&&
293, // `*
647, // `(
123, // `)
1355, // `{
95, // `}
413, // `-
1444, // `+
67, // `=
1322, // `==
109, // `[
551, // `]
1370, // `||
168, // `<
53, // `<=
1559, // `,
604, // `>
1435, // `>=
1247, // `.
1490, // `;
111, // `++
50, // `--
152, // `/
385, // `:
872, // ID
161, // INT_LITERAL
485, // STRING_LITERAL
769, // CHAR_LITERAL
513, // "c"
513, // "l"
513, // "a"
513, // "s"
-1, // idChar
-1, // reserved
513, // "e"
637, // "!"
1360, // "="
1616, // "+"
305, // "0"
566, // digit++
961, // digit
513, // "x"
513, // "X"
-1, // hex
1361, // letter
-1, // "_"
513, // "d"
513, // "g"
513, // "m"
513, // "p"
513, // "v"
513, // "y"
513, // "f"
513, // "i"
513, // {"A".."W" "Y".."Z"}
513, // "o"
513, // "r"
513, // "u"
513, // {"j" "q"}
513, // "b"
513, // "h"
513, // "k"
513, // "n"
513, // "t"
513, // "w"
513, // "z"
305, // {"1".."9"}
1304, // white
1602, // {12}
1602, // " "
1602, // {9}
381, // eol
1433, // comment
565, // oneLineComment
26, // blockComment
1572, // "/"
-1, // printable**
-1, // printable
1638, // "*"
-1, // blockCommentContent*
-1, // blockCommentContent
582, // "["
295, // "-"
174, // "<"
182, // "|"
-1, // {"?".."@"}
164, // "&"
1357, // ")"
155, // ","
369, // "]"
-1, // {"#".."$"}
387, // ";"
1173, // ">"
1611, // "{"
978, // "%"
1273, // "("
-1, // "\"
319, // "."
246, // ":"
984, // "}"
-1, // {"^" "`" "~"}
995, // "'"
1482, // '"'
418, // {10}
1458, // {13}
-1, // stringPrintable
-1, // recognizeEscapeChar
-1, // charPrintable
792, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
-1, // escapeChars
-1, // token*
-1, // printable*
466, // digit+
-1, // idChar*
883, // letter+
MIN_REDUCTION+183, // $
-1, // $NT
  }
,
{ // state 35
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+244, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
972, // `!
312, // `!=
1102, // `%
1560, // `&&
293, // `*
647, // `(
123, // `)
1355, // `{
95, // `}
413, // `-
1444, // `+
67, // `=
1322, // `==
109, // `[
551, // `]
1370, // `||
168, // `<
53, // `<=
1559, // `,
604, // `>
1435, // `>=
1247, // `.
1490, // `;
111, // `++
50, // `--
152, // `/
385, // `:
872, // ID
161, // INT_LITERAL
485, // STRING_LITERAL
769, // CHAR_LITERAL
513, // "c"
513, // "l"
513, // "a"
513, // "s"
-1, // idChar
-1, // reserved
513, // "e"
637, // "!"
1360, // "="
1616, // "+"
305, // "0"
566, // digit++
961, // digit
513, // "x"
513, // "X"
-1, // hex
1361, // letter
-1, // "_"
513, // "d"
513, // "g"
513, // "m"
513, // "p"
513, // "v"
513, // "y"
513, // "f"
513, // "i"
513, // {"A".."W" "Y".."Z"}
513, // "o"
513, // "r"
513, // "u"
513, // {"j" "q"}
513, // "b"
513, // "h"
513, // "k"
513, // "n"
513, // "t"
513, // "w"
513, // "z"
305, // {"1".."9"}
1304, // white
1602, // {12}
1602, // " "
1602, // {9}
381, // eol
1433, // comment
565, // oneLineComment
26, // blockComment
1572, // "/"
-1, // printable**
-1, // printable
1638, // "*"
-1, // blockCommentContent*
-1, // blockCommentContent
582, // "["
295, // "-"
174, // "<"
182, // "|"
-1, // {"?".."@"}
164, // "&"
1357, // ")"
155, // ","
369, // "]"
-1, // {"#".."$"}
387, // ";"
1173, // ">"
1611, // "{"
978, // "%"
1273, // "("
-1, // "\"
319, // "."
246, // ":"
984, // "}"
-1, // {"^" "`" "~"}
995, // "'"
1482, // '"'
418, // {10}
1458, // {13}
-1, // stringPrintable
-1, // recognizeEscapeChar
-1, // charPrintable
792, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
-1, // escapeChars
-1, // token*
-1, // printable*
466, // digit+
-1, // idChar*
883, // letter+
MIN_REDUCTION+244, // $
-1, // $NT
  }
,
{ // state 36
89,702, // "c"
90,702, // "l"
91,702, // "a"
92,702, // "s"
95,702, // "e"
99,285, // "0"
101,277, // digit
102,702, // "x"
103,702, // "X"
105,1605, // letter
106,171, // "_"
107,702, // "d"
108,702, // "g"
109,702, // "m"
110,702, // "p"
111,702, // "v"
112,702, // "y"
113,702, // "f"
114,702, // "i"
115,702, // {"A".."W" "Y".."Z"}
116,702, // "o"
117,702, // "r"
118,702, // "u"
119,702, // {"j" "q"}
120,702, // "b"
121,702, // "h"
122,702, // "k"
123,702, // "n"
124,702, // "t"
125,702, // "w"
126,702, // "z"
127,285, // {"1".."9"}
  }
,
{ // state 37
0x80000000|1509, // match move
0x80000000|15, // no-match move
0x80000000|1258, // NT-test-match state for reserved
  }
,
{ // state 38
MIN_REDUCTION+369, // (default reduction)
  }
,
{ // state 39
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+211, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
972, // `!
312, // `!=
1102, // `%
1560, // `&&
293, // `*
647, // `(
123, // `)
1355, // `{
95, // `}
413, // `-
1444, // `+
67, // `=
1322, // `==
109, // `[
551, // `]
1370, // `||
168, // `<
53, // `<=
1559, // `,
604, // `>
1435, // `>=
1247, // `.
1490, // `;
111, // `++
50, // `--
152, // `/
385, // `:
872, // ID
161, // INT_LITERAL
485, // STRING_LITERAL
769, // CHAR_LITERAL
513, // "c"
513, // "l"
513, // "a"
513, // "s"
-1, // idChar
-1, // reserved
513, // "e"
637, // "!"
1360, // "="
1616, // "+"
305, // "0"
566, // digit++
961, // digit
513, // "x"
513, // "X"
-1, // hex
1361, // letter
-1, // "_"
513, // "d"
513, // "g"
513, // "m"
513, // "p"
513, // "v"
513, // "y"
513, // "f"
513, // "i"
513, // {"A".."W" "Y".."Z"}
513, // "o"
513, // "r"
513, // "u"
513, // {"j" "q"}
513, // "b"
513, // "h"
513, // "k"
513, // "n"
513, // "t"
513, // "w"
513, // "z"
305, // {"1".."9"}
1304, // white
1602, // {12}
1602, // " "
1602, // {9}
381, // eol
1433, // comment
565, // oneLineComment
26, // blockComment
1572, // "/"
-1, // printable**
-1, // printable
1638, // "*"
-1, // blockCommentContent*
-1, // blockCommentContent
582, // "["
295, // "-"
174, // "<"
182, // "|"
-1, // {"?".."@"}
164, // "&"
1357, // ")"
155, // ","
369, // "]"
-1, // {"#".."$"}
387, // ";"
1173, // ">"
1611, // "{"
978, // "%"
1273, // "("
-1, // "\"
319, // "."
246, // ":"
984, // "}"
-1, // {"^" "`" "~"}
995, // "'"
1482, // '"'
418, // {10}
1458, // {13}
-1, // stringPrintable
-1, // recognizeEscapeChar
-1, // charPrintable
792, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
-1, // escapeChars
-1, // token*
-1, // printable*
466, // digit+
-1, // idChar*
883, // letter+
MIN_REDUCTION+211, // $
-1, // $NT
  }
,
{ // state 40
181,MIN_REDUCTION+207, // $NT
  }
,
{ // state 41
2,952, // white*
MIN_REDUCTION+100, // (default reduction)
  }
,
{ // state 42
0x80000000|402, // match move
0x80000000|546, // no-match move
0x80000000|1258, // NT-test-match state for reserved
  }
,
{ // state 43
181,MIN_REDUCTION+189, // $NT
  }
,
{ // state 44
MIN_REDUCTION+277, // (default reduction)
  }
,
{ // state 45
90,1380, // "l"
  }
,
{ // state 46
MIN_REDUCTION+128, // (default reduction)
  }
,
{ // state 47
2,1313, // white*
128,376, // white
132,381, // eol
133,1433, // comment
134,565, // oneLineComment
135,26, // blockComment
MIN_REDUCTION+184, // (default reduction)
  }
,
{ // state 48
1,447, // start
2,72, // white*
3,514, // $$0
4,666, // token
5,1392, // `boolean
6,1186, // `class
7,1576, // `extends
8,798, // `void
9,1167, // `int
10,267, // `while
11,1537, // `if
12,316, // `else
13,440, // `for
14,165, // `break
15,280, // `this
16,1368, // `false
17,1106, // `true
18,953, // `super
19,489, // `null
20,1163, // `return
21,630, // `instanceof
22,976, // `new
23,1330, // `abstract
24,1402, // `assert
25,1567, // `byte
26,27, // `case
27,833, // `catch
28,982, // `char
29,1324, // `const
30,141, // `continue
31,115, // `default
32,1035, // `do
33,140, // `double
34,308, // `enum
35,662, // `final
36,1021, // `finally
37,1158, // `float
38,765, // `goto
39,1302, // `implements
40,768, // `import
41,1514, // `interface
42,1633, // `long
43,812, // `native
44,1233, // `package
45,245, // `private
46,339, // `protected
47,1254, // `public
48,516, // `short
49,412, // `static
50,1491, // `strictfp
51,832, // `switch
52,397, // `synchronized
53,201, // `throw
54,1108, // `throws
55,417, // `transient
56,631, // `try
57,927, // `volatile
175,1278, // token*
  }
,
{ // state 49
MIN_REDUCTION+147, // (default reduction)
  }
,
{ // state 50
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 51
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+167, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
972, // `!
312, // `!=
1102, // `%
1560, // `&&
293, // `*
647, // `(
123, // `)
1355, // `{
95, // `}
413, // `-
1444, // `+
67, // `=
1322, // `==
109, // `[
551, // `]
1370, // `||
168, // `<
53, // `<=
1559, // `,
604, // `>
1435, // `>=
1247, // `.
1490, // `;
111, // `++
50, // `--
152, // `/
385, // `:
872, // ID
161, // INT_LITERAL
485, // STRING_LITERAL
769, // CHAR_LITERAL
513, // "c"
513, // "l"
513, // "a"
513, // "s"
-1, // idChar
-1, // reserved
513, // "e"
637, // "!"
1360, // "="
1616, // "+"
305, // "0"
566, // digit++
961, // digit
513, // "x"
513, // "X"
-1, // hex
1361, // letter
-1, // "_"
513, // "d"
513, // "g"
513, // "m"
513, // "p"
513, // "v"
513, // "y"
513, // "f"
513, // "i"
513, // {"A".."W" "Y".."Z"}
513, // "o"
513, // "r"
513, // "u"
513, // {"j" "q"}
513, // "b"
513, // "h"
513, // "k"
513, // "n"
513, // "t"
513, // "w"
513, // "z"
305, // {"1".."9"}
1304, // white
1602, // {12}
1602, // " "
1602, // {9}
381, // eol
1433, // comment
565, // oneLineComment
26, // blockComment
1572, // "/"
-1, // printable**
-1, // printable
1638, // "*"
-1, // blockCommentContent*
-1, // blockCommentContent
582, // "["
295, // "-"
174, // "<"
182, // "|"
-1, // {"?".."@"}
164, // "&"
1357, // ")"
155, // ","
369, // "]"
-1, // {"#".."$"}
387, // ";"
1173, // ">"
1611, // "{"
978, // "%"
1273, // "("
-1, // "\"
319, // "."
246, // ":"
984, // "}"
-1, // {"^" "`" "~"}
995, // "'"
1482, // '"'
418, // {10}
1458, // {13}
-1, // stringPrintable
-1, // recognizeEscapeChar
-1, // charPrintable
792, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
-1, // escapeChars
-1, // token*
-1, // printable*
466, // digit+
-1, // idChar*
883, // letter+
MIN_REDUCTION+167, // $
-1, // $NT
  }
,
{ // state 52
89,1505, // "c"
90,1505, // "l"
91,1505, // "a"
92,1505, // "s"
93,62, // idChar
95,1505, // "e"
99,865, // "0"
101,310, // digit
102,1505, // "x"
103,1505, // "X"
105,989, // letter
106,1019, // "_"
107,1505, // "d"
108,1505, // "g"
109,1505, // "m"
110,1505, // "p"
111,1505, // "v"
112,1505, // "y"
113,1505, // "f"
114,1505, // "i"
115,1505, // {"A".."W" "Y".."Z"}
116,1505, // "o"
117,1505, // "r"
118,1505, // "u"
119,1505, // {"j" "q"}
120,1505, // "b"
121,1505, // "h"
122,1505, // "k"
123,1505, // "n"
124,1505, // "t"
125,1505, // "w"
126,1505, // "z"
127,865, // {"1".."9"}
  }
,
{ // state 53
MIN_REDUCTION+75, // (default reduction)
  }
,
{ // state 54
99,285, // "0"
127,285, // {"1".."9"}
  }
,
{ // state 55
0x80000000|694, // match move
0x80000000|1515, // no-match move
0x80000000|1258, // NT-test-match state for reserved
  }
,
{ // state 56
181,MIN_REDUCTION+309, // $NT
  }
,
{ // state 57
0x80000000|1487, // match move
0x80000000|166, // no-match move
// T-test match for "0":
99,
  }
,
{ // state 58
124,1350, // "t"
  }
,
{ // state 59
0x80000000|456, // match move
0x80000000|2, // no-match move
// T-test match for "0":
99,
  }
,
{ // state 60
128,1304, // white
132,381, // eol
133,1433, // comment
134,565, // oneLineComment
135,26, // blockComment
MIN_REDUCTION+141, // (default reduction)
  }
,
{ // state 61
116,616, // "o"
  }
,
{ // state 62
0x80000000|709, // match move
0x80000000|1008, // no-match move
0x80000000|36, // NT-test-match state for idChar
  }
,
{ // state 63
110,1218, // "p"
  }
,
{ // state 64
2,1000, // white*
128,376, // white
132,381, // eol
133,1433, // comment
134,565, // oneLineComment
135,26, // blockComment
MIN_REDUCTION+174, // (default reduction)
  }
,
{ // state 65
128,1304, // white
132,381, // eol
133,1433, // comment
134,565, // oneLineComment
135,26, // blockComment
MIN_REDUCTION+256, // (default reduction)
  }
,
{ // state 66
114,731, // "i"
  }
,
{ // state 67
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 68
128,1304, // white
132,381, // eol
133,1433, // comment
134,565, // oneLineComment
135,26, // blockComment
MIN_REDUCTION+378, // (default reduction)
  }
,
{ // state 69
2,1421, // white*
128,376, // white
132,381, // eol
133,1433, // comment
134,565, // oneLineComment
135,26, // blockComment
MIN_REDUCTION+146, // (default reduction)
  }
,
{ // state 70
0x80000000|1234, // match move
0x80000000|914, // no-match move
// T-test match for "0":
99,
  }
,
{ // state 71
2,635, // white*
128,1336, // white
129,674, // {12}
130,674, // " "
131,674, // {9}
132,889, // eol
133,775, // comment
134,943, // oneLineComment
135,641, // blockComment
136,1598, // "/"
164,926, // {10}
165,676, // {13}
181,MIN_REDUCTION+278, // $NT
  }
,
{ // state 72
0x80000000|711, // match move
0x80000000|14, // no-match move
// T-test match for "0":
99,
  }
,
{ // state 73
114,1452, // "i"
117,61, // "r"
  }
,
{ // state 74
123,431, // "n"
  }
,
{ // state 75
116,258, // "o"
  }
,
{ // state 76
0x80000000|1, // match move
0x80000000|885, // no-match move
0x80000000|36, // NT-test-match state for idChar
  }
,
{ // state 77
128,1304, // white
132,381, // eol
133,1433, // comment
134,565, // oneLineComment
135,26, // blockComment
MIN_REDUCTION+226, // (default reduction)
  }
,
{ // state 78
108,745, // "g"
  }
,
{ // state 79
89,1172, // "c"
  }
,
{ // state 80
112,806, // "y"
118,1530, // "u"
121,651, // "h"
124,1536, // "t"
125,744, // "w"
  }
,
{ // state 81
124,192, // "t"
  }
,
{ // state 82
0x80000000|929, // match move
0x80000000|1166, // no-match move
0x80000000|1258, // NT-test-match state for reserved
  }
,
{ // state 83
0x80000000|1, // match move
0x80000000|278, // no-match move
0x80000000|36, // NT-test-match state for idChar
  }
,
{ // state 84
0x80000000|1469, // match move
0x80000000|1471, // no-match move
// T-test match for "0":
99,
  }
,
{ // state 85
0x80000000|1125, // match move
0x80000000|433, // no-match move
0x80000000|1258, // NT-test-match state for reserved
  }
,
{ // state 86
0x80000000|890, // match move
0x80000000|1648, // no-match move
0x80000000|1258, // NT-test-match state for reserved
  }
,
{ // state 87
181,MIN_REDUCTION+258, // $NT
  }
,
{ // state 88
95,315, // "e"
  }
,
{ // state 89
124,901, // "t"
  }
,
{ // state 90
123,781, // "n"
  }
,
{ // state 91
0x80000000|1, // match move
0x80000000|954, // no-match move
0x80000000|36, // NT-test-match state for idChar
  }
,
{ // state 92
89,1080, // "c"
  }
,
{ // state 93
128,1304, // white
132,381, // eol
133,1433, // comment
134,565, // oneLineComment
135,26, // blockComment
MIN_REDUCTION+99, // (default reduction)
  }
,
{ // state 94
2,211, // white*
128,1336, // white
129,674, // {12}
130,674, // " "
131,674, // {9}
132,889, // eol
133,775, // comment
134,943, // oneLineComment
135,641, // blockComment
136,1598, // "/"
164,926, // {10}
165,676, // {13}
181,MIN_REDUCTION+335, // $NT
  }
,
{ // state 95
MIN_REDUCTION+66, // (default reduction)
  }
,
{ // state 96
MIN_REDUCTION+167, // (default reduction)
  }
,
{ // state 97
128,620, // white
129,674, // {12}
130,674, // " "
131,674, // {9}
132,889, // eol
133,775, // comment
134,943, // oneLineComment
135,641, // blockComment
136,1598, // "/"
164,926, // {10}
165,676, // {13}
181,MIN_REDUCTION+259, // $NT
  }
,
{ // state 98
113,1550, // "f"
  }
,
{ // state 99
181,MIN_REDUCTION+267, // $NT
  }
,
{ // state 100
91,739, // "a"
  }
,
{ // state 101
181,MIN_REDUCTION+91, // $NT
  }
,
{ // state 102
-1, // $$start
-1, // start
1501, // white*
-1, // $$0
MIN_REDUCTION+148, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
972, // `!
312, // `!=
1102, // `%
1560, // `&&
293, // `*
647, // `(
123, // `)
1355, // `{
95, // `}
413, // `-
1444, // `+
67, // `=
1322, // `==
109, // `[
551, // `]
1370, // `||
168, // `<
53, // `<=
1559, // `,
604, // `>
1435, // `>=
1247, // `.
1490, // `;
111, // `++
50, // `--
152, // `/
385, // `:
872, // ID
161, // INT_LITERAL
485, // STRING_LITERAL
769, // CHAR_LITERAL
513, // "c"
513, // "l"
513, // "a"
513, // "s"
-1, // idChar
-1, // reserved
513, // "e"
637, // "!"
1360, // "="
1616, // "+"
305, // "0"
566, // digit++
961, // digit
513, // "x"
513, // "X"
-1, // hex
1361, // letter
-1, // "_"
513, // "d"
513, // "g"
513, // "m"
513, // "p"
513, // "v"
513, // "y"
513, // "f"
513, // "i"
513, // {"A".."W" "Y".."Z"}
513, // "o"
513, // "r"
513, // "u"
513, // {"j" "q"}
513, // "b"
513, // "h"
513, // "k"
513, // "n"
513, // "t"
513, // "w"
513, // "z"
305, // {"1".."9"}
376, // white
1602, // {12}
1602, // " "
1602, // {9}
381, // eol
1433, // comment
565, // oneLineComment
26, // blockComment
1572, // "/"
-1, // printable**
-1, // printable
1638, // "*"
-1, // blockCommentContent*
-1, // blockCommentContent
582, // "["
295, // "-"
174, // "<"
182, // "|"
-1, // {"?".."@"}
164, // "&"
1357, // ")"
155, // ","
369, // "]"
-1, // {"#".."$"}
387, // ";"
1173, // ">"
1611, // "{"
978, // "%"
1273, // "("
-1, // "\"
319, // "."
246, // ":"
984, // "}"
-1, // {"^" "`" "~"}
995, // "'"
1482, // '"'
418, // {10}
1458, // {13}
-1, // stringPrintable
-1, // recognizeEscapeChar
-1, // charPrintable
792, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
-1, // escapeChars
-1, // token*
-1, // printable*
466, // digit+
-1, // idChar*
883, // letter+
MIN_REDUCTION+148, // $
-1, // $NT
  }
,
{ // state 103
117,1180, // "r"
121,897, // "h"
  }
,
{ // state 104
0x80000000|1, // match move
0x80000000|1476, // no-match move
// T-test match for {"*" "/"}:
136,
139,
  }
,
{ // state 105
0x80000000|1078, // match move
0x80000000|480, // no-match move
0x80000000|1258, // NT-test-match state for reserved
  }
,
{ // state 106
128,1304, // white
132,381, // eol
133,1433, // comment
134,565, // oneLineComment
135,26, // blockComment
MIN_REDUCTION+319, // (default reduction)
  }
,
{ // state 107
124,1112, // "t"
  }
,
{ // state 108
125,1022, // "w"
  }
,
{ // state 109
MIN_REDUCTION+71, // (default reduction)
  }
,
{ // state 110
MIN_REDUCTION+127, // (default reduction)
  }
,
{ // state 111
MIN_REDUCTION+81, // (default reduction)
  }
,
{ // state 112
132,1003, // eol
137,1213, // printable**
164,926, // {10}
165,676, // {13}
176,225, // printable*
  }
,
{ // state 113
MIN_REDUCTION+331, // (default reduction)
  }
,
{ // state 114
MIN_REDUCTION+208, // (default reduction)
  }
,
{ // state 115
MIN_REDUCTION+31, // (default reduction)
  }
,
{ // state 116
120,532, // "b"
  }
,
{ // state 117
2,1004, // white*
128,1336, // white
129,674, // {12}
130,674, // " "
131,674, // {9}
132,889, // eol
133,775, // comment
134,943, // oneLineComment
135,641, // blockComment
136,1598, // "/"
164,926, // {10}
165,676, // {13}
181,MIN_REDUCTION+326, // $NT
  }
,
{ // state 118
123,1316, // "n"
  }
,
{ // state 119
MIN_REDUCTION+350, // (default reduction)
  }
,
{ // state 120
128,1304, // white
132,381, // eol
133,1433, // comment
134,565, // oneLineComment
135,26, // blockComment
MIN_REDUCTION+217, // (default reduction)
  }
,
{ // state 121
0x80000000|706, // match move
0x80000000|1582, // no-match move
0x80000000|54, // NT-test-match state for digit
  }
,
{ // state 122
117,557, // "r"
  }
,
{ // state 123
MIN_REDUCTION+64, // (default reduction)
  }
,
{ // state 124
MIN_REDUCTION+244, // (default reduction)
  }
,
{ // state 125
99,327, // "0"
101,558, // digit
127,327, // {"1".."9"}
  }
,
{ // state 126
128,620, // white
129,674, // {12}
130,674, // " "
131,674, // {9}
132,889, // eol
133,775, // comment
134,943, // oneLineComment
135,641, // blockComment
136,1598, // "/"
164,926, // {10}
165,676, // {13}
181,MIN_REDUCTION+328, // $NT
  }
,
{ // state 127
113,421, // "f"
  }
,
{ // state 128
-1, // $$start
-1, // start
450, // white*
-1, // $$0
MIN_REDUCTION+296, // token
1392, // `boolean
1186, // `class
1576, // `extends
798, // `void
1167, // `int
267, // `while
1537, // `if
316, // `else
440, // `for
165, // `break
280, // `this
1368, // `false
1106, // `true
953, // `super
489, // `null
1163, // `return
630, // `instanceof
976, // `new
1330, // `abstract
1402, // `assert
1567, // `byte
27, // `case
833, // `catch
982, // `char
1324, // `const
141, // `continue
115, // `default
1035, // `do
140, // `double
308, // `enum
662, // `final
1021, // `finally
1158, // `float
765, // `goto
1302, // `implements
768, // `import
1514, // `interface
1633, // `long
812, // `native
1233, // `package
245, // `private
339, // `protected
1254, // `public
516, // `short
412, // `static
1491, // `strictfp
832, // `switch
397, // `synchronized
201, // `throw
1108, // `throws
417, // `transient
631, // `try
927, // `volatile
972, // `!
312, // `!=
1102, // `%
1560, // `&&
293, // `*
647, // `(
123, // `)
1355, // `{
95, // `}
413, // `-
1444, // `+
67, // `=
1322, // `==
109, // `[
551, // `]
1370, // `||
168, // `<
53, // `<=
1559, // `,
604, // `>
1435, // `>=
1247, // `.
1490, // `;
111, // `++
50, // `--
152, // `/
385, // `:
-1, // ID
161, // INT_LITERAL
485, // STRING_LITERAL
769, // CHAR_LITERAL
MIN_REDUCTION+296, // "c"
MIN_REDUCTION+296, // "l"
MIN_REDUCTION+296, // "a"
MIN_REDUCTION+296, // "s"
-1, // idChar
-1, // reserved
MIN_REDUCTION+296, // "e"
637, // "!"
1360, // "="
1616, // "+"
MIN_REDUCTION+296, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+296, // "x"
MIN_REDUCTION+296, // "X"
-1, // hex
-1, // letter
-1, // "_"
MIN_REDUCTION+296, // "d"
MIN_REDUCTION+296, // "g"
MIN_REDUCTION+296, // "m"
MIN_REDUCTION+296, // "p"
MIN_REDUCTION+296, // "v"
MIN_REDUCTION+296, // "y"
MIN_REDUCTION+296, // "f"
MIN_REDUCTION+296, // "i"
MIN_REDUCTION+296, // {"A".."W" "Y".."Z"}
MIN_REDUCTION+296, // "o"
MIN_REDUCTION+296, // "r"
MIN_REDUCTION+296, // "u"
MIN_REDUCTION+296, // {"j" "q"}
MIN_REDUCTION+296, // "b"
MIN_REDUCTION+296, // "h"
MIN_REDUCTION+296, // "k"
MIN_REDUCTION+296, // "n"
MIN_REDUCTION+296, // "t"
MIN_REDUCTION+296, // "w"
MIN_REDUCTION+296, // "z"
MIN_REDUCTION+296, // {"1".."9"}
376, // white
1602, // {12}
1602, // " "
1602, // {9}
381, // eol
1433, // comment
565, // oneLineComment
26, // blockComment
1572, // "/"
-1, // printable**
-1, // printable
1638, // "*"
-1, // blockCommentContent*
-1, // blockCommentContent
582, // "["
295, // "-"
174, // "<"
182, // "|"
-1, // {"?".."@"}
164, // "&"
1357, // ")"
155, // ","
369, // "]"
-1, // {"#".."$"}
387, // ";"
1173, // ">"
1611, // "{"
978, // "%"
1273, // "("
-1, // "\"
319, // "."
246, // ":"
984, // "}"
-1, // {"^" "`" "~"}
995, // "'"
1482, // '"'
418, // {10}
1458, // {13}
-1, // stringPrintable
-1, // recognizeEscapeChar
-1, // charPrintable
-1, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
-1, // escapeChars
-1, // token*
-1, // printable*
-1, // digit+
-1, // idChar*
-1, // letter+
MIN_REDUCTION+296, // $
-1, // $NT
  }
,
{ // state 129
2,169, // white*
128,1336, // white
129,674, // {12}
130,674, // " "
131,674, // {9}
132,889, // eol
133,775, // comment
134,943, // oneLineComment
135,641, // blockComment
136,1598, // "/"
164,926, // {10}
165,676, // {13}
181,MIN_REDUCTION+311, // $NT
  }
,
{ // state 130
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+175, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
972, // `!
312, // `!=
1102, // `%
1560, // `&&
293, // `*
647, // `(
123, // `)
1355, // `{
95, // `}
413, // `-
1444, // `+
67, // `=
1322, // `==
109, // `[
551, // `]
1370, // `||
168, // `<
53, // `<=
1559, // `,
604, // `>
1435, // `>=
1247, // `.
1490, // `;
111, // `++
50, // `--
152, // `/
385, // `:
872, // ID
161, // INT_LITERAL
485, // STRING_LITERAL
769, // CHAR_LITERAL
513, // "c"
513, // "l"
513, // "a"
513, // "s"
-1, // idChar
-1, // reserved
513, // "e"
637, // "!"
1360, // "="
1616, // "+"
305, // "0"
566, // digit++
961, // digit
513, // "x"
513, // "X"
-1, // hex
1361, // letter
-1, // "_"
513, // "d"
513, // "g"
513, // "m"
513, // "p"
513, // "v"
513, // "y"
513, // "f"
513, // "i"
513, // {"A".."W" "Y".."Z"}
513, // "o"
513, // "r"
513, // "u"
513, // {"j" "q"}
513, // "b"
513, // "h"
513, // "k"
513, // "n"
513, // "t"
513, // "w"
513, // "z"
305, // {"1".."9"}
1304, // white
1602, // {12}
1602, // " "
1602, // {9}
381, // eol
1433, // comment
565, // oneLineComment
26, // blockComment
1572, // "/"
-1, // printable**
-1, // printable
1638, // "*"
-1, // blockCommentContent*
-1, // blockCommentContent
582, // "["
295, // "-"
174, // "<"
182, // "|"
-1, // {"?".."@"}
164, // "&"
1357, // ")"
155, // ","
369, // "]"
-1, // {"#".."$"}
387, // ";"
1173, // ">"
1611, // "{"
978, // "%"
1273, // "("
-1, // "\"
319, // "."
246, // ":"
984, // "}"
-1, // {"^" "`" "~"}
995, // "'"
1482, // '"'
418, // {10}
1458, // {13}
-1, // stringPrintable
-1, // recognizeEscapeChar
-1, // charPrintable
792, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
-1, // escapeChars
-1, // token*
-1, // printable*
466, // digit+
-1, // idChar*
883, // letter+
MIN_REDUCTION+175, // $
-1, // $NT
  }
,
{ // state 131
90,148, // "l"
  }
,
{ // state 132
-1, // $$start
-1, // start
1300, // white*
-1, // $$0
MIN_REDUCTION+341, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
972, // `!
312, // `!=
1102, // `%
1560, // `&&
293, // `*
647, // `(
123, // `)
1355, // `{
95, // `}
413, // `-
1444, // `+
67, // `=
1322, // `==
109, // `[
551, // `]
1370, // `||
168, // `<
53, // `<=
1559, // `,
604, // `>
1435, // `>=
1247, // `.
1490, // `;
111, // `++
50, // `--
152, // `/
385, // `:
872, // ID
161, // INT_LITERAL
485, // STRING_LITERAL
769, // CHAR_LITERAL
513, // "c"
513, // "l"
513, // "a"
513, // "s"
-1, // idChar
-1, // reserved
513, // "e"
637, // "!"
1360, // "="
1616, // "+"
305, // "0"
566, // digit++
961, // digit
513, // "x"
513, // "X"
-1, // hex
1361, // letter
-1, // "_"
513, // "d"
513, // "g"
513, // "m"
513, // "p"
513, // "v"
513, // "y"
513, // "f"
513, // "i"
513, // {"A".."W" "Y".."Z"}
513, // "o"
513, // "r"
513, // "u"
513, // {"j" "q"}
513, // "b"
513, // "h"
513, // "k"
513, // "n"
513, // "t"
513, // "w"
513, // "z"
305, // {"1".."9"}
376, // white
1602, // {12}
1602, // " "
1602, // {9}
381, // eol
1433, // comment
565, // oneLineComment
26, // blockComment
1572, // "/"
-1, // printable**
-1, // printable
1638, // "*"
-1, // blockCommentContent*
-1, // blockCommentContent
582, // "["
295, // "-"
174, // "<"
182, // "|"
-1, // {"?".."@"}
164, // "&"
1357, // ")"
155, // ","
369, // "]"
-1, // {"#".."$"}
387, // ";"
1173, // ">"
1611, // "{"
978, // "%"
1273, // "("
-1, // "\"
319, // "."
246, // ":"
984, // "}"
-1, // {"^" "`" "~"}
995, // "'"
1482, // '"'
418, // {10}
1458, // {13}
-1, // stringPrintable
-1, // recognizeEscapeChar
-1, // charPrintable
792, // letter++
-1, // idChar**
1473, // $$1
-1, // stringPrintable*
-1, // $$2
-1, // escapeChars
-1, // token*
-1, // printable*
466, // digit+
-1, // idChar*
883, // letter+
MIN_REDUCTION+341, // $
-1, // $NT
  }
,
{ // state 133
95,1047, // "e"
  }
,
{ // state 134
2,1011, // white*
128,1336, // white
129,674, // {12}
130,674, // " "
131,674, // {9}
132,889, // eol
133,775, // comment
134,943, // oneLineComment
135,641, // blockComment
136,1598, // "/"
164,926, // {10}
165,676, // {13}
181,MIN_REDUCTION+203, // $NT
  }
,
{ // state 135
110,1088, // "p"
  }
,
{ // state 136
MIN_REDUCTION+111, // (default reduction)
  }
,
{ // state 137
181,MIN_REDUCTION+303, // $NT
  }
,
{ // state 138
MIN_REDUCTION+101, // (default reduction)
  }
,
{ // state 139
123,805, // "n"
  }
,
{ // state 140
MIN_REDUCTION+33, // (default reduction)
  }
,
{ // state 141
MIN_REDUCTION+30, // (default reduction)
  }
,
{ // state 142
0x80000000|1205, // match move
0x80000000|585, // no-match move
// T-test match for "0":
99,
  }
,
{ // state 143
2,389, // white*
128,1336, // white
129,674, // {12}
130,674, // " "
131,674, // {9}
132,889, // eol
133,775, // comment
134,943, // oneLineComment
135,641, // blockComment
136,1598, // "/"
164,926, // {10}
165,676, // {13}
181,MIN_REDUCTION+221, // $NT
  }
,
{ // state 144
0x80000000|1, // match move
0x80000000|906, // no-match move
0x80000000|36, // NT-test-match state for idChar
  }
,
{ // state 145
108,257, // "g"
  }
,
{ // state 146
117,1622, // "r"
  }
,
{ // state 147
-1, // $$start
-1, // start
720, // white*
-1, // $$0
MIN_REDUCTION+156, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
972, // `!
312, // `!=
1102, // `%
1560, // `&&
293, // `*
647, // `(
123, // `)
1355, // `{
95, // `}
413, // `-
1444, // `+
-1, // `=
-1, // `==
109, // `[
551, // `]
1370, // `||
168, // `<
53, // `<=
1559, // `,
604, // `>
1435, // `>=
1247, // `.
1490, // `;
111, // `++
50, // `--
152, // `/
385, // `:
872, // ID
161, // INT_LITERAL
485, // STRING_LITERAL
769, // CHAR_LITERAL
513, // "c"
513, // "l"
513, // "a"
513, // "s"
-1, // idChar
-1, // reserved
513, // "e"
637, // "!"
MIN_REDUCTION+156, // "="
1616, // "+"
305, // "0"
566, // digit++
961, // digit
513, // "x"
513, // "X"
-1, // hex
1361, // letter
-1, // "_"
513, // "d"
513, // "g"
513, // "m"
513, // "p"
513, // "v"
513, // "y"
513, // "f"
513, // "i"
513, // {"A".."W" "Y".."Z"}
513, // "o"
513, // "r"
513, // "u"
513, // {"j" "q"}
513, // "b"
513, // "h"
513, // "k"
513, // "n"
513, // "t"
513, // "w"
513, // "z"
305, // {"1".."9"}
376, // white
1602, // {12}
1602, // " "
1602, // {9}
381, // eol
1433, // comment
565, // oneLineComment
26, // blockComment
1572, // "/"
-1, // printable**
-1, // printable
1638, // "*"
-1, // blockCommentContent*
-1, // blockCommentContent
582, // "["
295, // "-"
174, // "<"
182, // "|"
-1, // {"?".."@"}
164, // "&"
1357, // ")"
155, // ","
369, // "]"
-1, // {"#".."$"}
387, // ";"
1173, // ">"
1611, // "{"
978, // "%"
1273, // "("
-1, // "\"
319, // "."
246, // ":"
984, // "}"
-1, // {"^" "`" "~"}
995, // "'"
1482, // '"'
418, // {10}
1458, // {13}
-1, // stringPrintable
-1, // recognizeEscapeChar
-1, // charPrintable
792, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
-1, // escapeChars
-1, // token*
-1, // printable*
466, // digit+
-1, // idChar*
883, // letter+
MIN_REDUCTION+156, // $
-1, // $NT
  }
,
{ // state 148
112,483, // "y"
  }
,
{ // state 149
91,403, // "a"
  }
,
{ // state 150
0x80000000|843, // match move
0x80000000|941, // no-match move
// T-test match for "0":
99,
  }
,
{ // state 151
2,878, // white*
128,1336, // white
129,674, // {12}
130,674, // " "
131,674, // {9}
132,889, // eol
133,775, // comment
134,943, // oneLineComment
135,641, // blockComment
136,1598, // "/"
164,926, // {10}
165,676, // {13}
181,MIN_REDUCTION+320, // $NT
  }
,
{ // state 152
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 153
0x80000000|658, // match move
0x80000000|1445, // no-match move
// T-test match for "0":
99,
  }
,
{ // state 154
128,1304, // white
132,381, // eol
133,1433, // comment
134,565, // oneLineComment
135,26, // blockComment
MIN_REDUCTION+322, // (default reduction)
  }
,
{ // state 155
0x80000000|1054, // match move
0x80000000|1100, // no-match move
// T-test match for "0":
99,
  }
,
{ // state 156
0x80000000|521, // match move
0x80000000|1309, // no-match move
0x80000000|1258, // NT-test-match state for reserved
  }
,
{ // state 157
128,620, // white
129,674, // {12}
130,674, // " "
131,674, // {9}
132,889, // eol
133,775, // comment
134,943, // oneLineComment
135,641, // blockComment
136,1598, // "/"
164,926, // {10}
165,676, // {13}
181,MIN_REDUCTION+89, // $NT
  }
,
{ // state 158
MIN_REDUCTION+111, // (default reduction)
  }
,
{ // state 159
112,240, // "y"
116,1099, // "o"
117,705, // "r"
  }
,
{ // state 160
91,1126, // "a"
  }
,
{ // state 161
MIN_REDUCTION+86, // (default reduction)
  }
,
{ // state 162
-1, // $$start
-1, // start
-1, // white*
4, // $$0
666, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
972, // `!
312, // `!=
1102, // `%
1560, // `&&
293, // `*
647, // `(
123, // `)
1355, // `{
95, // `}
413, // `-
1444, // `+
67, // `=
1322, // `==
109, // `[
551, // `]
1370, // `||
168, // `<
53, // `<=
1559, // `,
604, // `>
1435, // `>=
1247, // `.
1490, // `;
111, // `++
50, // `--
152, // `/
385, // `:
872, // ID
161, // INT_LITERAL
485, // STRING_LITERAL
769, // CHAR_LITERAL
513, // "c"
513, // "l"
513, // "a"
513, // "s"
-1, // idChar
-1, // reserved
513, // "e"
637, // "!"
1360, // "="
1616, // "+"
305, // "0"
566, // digit++
961, // digit
513, // "x"
513, // "X"
-1, // hex
1361, // letter
-1, // "_"
513, // "d"
513, // "g"
513, // "m"
513, // "p"
513, // "v"
513, // "y"
513, // "f"
513, // "i"
513, // {"A".."W" "Y".."Z"}
513, // "o"
513, // "r"
513, // "u"
513, // {"j" "q"}
513, // "b"
513, // "h"
513, // "k"
513, // "n"
513, // "t"
513, // "w"
513, // "z"
305, // {"1".."9"}
562, // white
1168, // {12}
1168, // " "
1168, // {9}
1446, // eol
1070, // comment
1306, // oneLineComment
839, // blockComment
1009, // "/"
-1, // printable**
-1, // printable
1638, // "*"
-1, // blockCommentContent*
-1, // blockCommentContent
582, // "["
295, // "-"
174, // "<"
182, // "|"
-1, // {"?".."@"}
164, // "&"
1357, // ")"
155, // ","
369, // "]"
-1, // {"#".."$"}
387, // ";"
1173, // ">"
1611, // "{"
978, // "%"
1273, // "("
-1, // "\"
319, // "."
246, // ":"
984, // "}"
-1, // {"^" "`" "~"}
995, // "'"
1482, // '"'
356, // {10}
688, // {13}
-1, // stringPrintable
-1, // recognizeEscapeChar
-1, // charPrintable
792, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
-1, // escapeChars
1278, // token*
-1, // printable*
466, // digit+
-1, // idChar*
883, // letter+
MIN_REDUCTION+3, // $
-1, // $NT
  }
,
{ // state 163
91,577, // "a"
117,66, // "r"
  }
,
{ // state 164
147,870, // "&"
  }
,
{ // state 165
MIN_REDUCTION+14, // (default reduction)
  }
,
{ // state 166
0x80000000|898, // match move
0x80000000|1119, // no-match move
0x80000000|1258, // NT-test-match state for reserved
  }
,
{ // state 167
91,354, // "a"
  }
,
{ // state 168
MIN_REDUCTION+74, // (default reduction)
  }
,
{ // state 169
128,620, // white
129,674, // {12}
130,674, // " "
131,674, // {9}
132,889, // eol
133,775, // comment
134,943, // oneLineComment
135,641, // blockComment
136,1598, // "/"
164,926, // {10}
165,676, // {13}
181,MIN_REDUCTION+310, // $NT
  }
,
{ // state 170
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+232, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
972, // `!
312, // `!=
1102, // `%
1560, // `&&
293, // `*
647, // `(
123, // `)
1355, // `{
95, // `}
413, // `-
1444, // `+
67, // `=
1322, // `==
109, // `[
551, // `]
1370, // `||
168, // `<
53, // `<=
1559, // `,
604, // `>
1435, // `>=
1247, // `.
1490, // `;
111, // `++
50, // `--
152, // `/
385, // `:
872, // ID
161, // INT_LITERAL
485, // STRING_LITERAL
769, // CHAR_LITERAL
513, // "c"
513, // "l"
513, // "a"
513, // "s"
-1, // idChar
-1, // reserved
513, // "e"
637, // "!"
1360, // "="
1616, // "+"
305, // "0"
566, // digit++
961, // digit
513, // "x"
513, // "X"
-1, // hex
1361, // letter
-1, // "_"
513, // "d"
513, // "g"
513, // "m"
513, // "p"
513, // "v"
513, // "y"
513, // "f"
513, // "i"
513, // {"A".."W" "Y".."Z"}
513, // "o"
513, // "r"
513, // "u"
513, // {"j" "q"}
513, // "b"
513, // "h"
513, // "k"
513, // "n"
513, // "t"
513, // "w"
513, // "z"
305, // {"1".."9"}
1304, // white
1602, // {12}
1602, // " "
1602, // {9}
381, // eol
1433, // comment
565, // oneLineComment
26, // blockComment
1572, // "/"
-1, // printable**
-1, // printable
1638, // "*"
-1, // blockCommentContent*
-1, // blockCommentContent
582, // "["
295, // "-"
174, // "<"
182, // "|"
-1, // {"?".."@"}
164, // "&"
1357, // ")"
155, // ","
369, // "]"
-1, // {"#".."$"}
387, // ";"
1173, // ">"
1611, // "{"
978, // "%"
1273, // "("
-1, // "\"
319, // "."
246, // ":"
984, // "}"
-1, // {"^" "`" "~"}
995, // "'"
1482, // '"'
418, // {10}
1458, // {13}
-1, // stringPrintable
-1, // recognizeEscapeChar
-1, // charPrintable
792, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
-1, // escapeChars
-1, // token*
-1, // printable*
466, // digit+
-1, // idChar*
883, // letter+
MIN_REDUCTION+232, // $
-1, // $NT
  }
,
{ // state 171
181,MIN_REDUCTION+110, // $NT
  }
,
{ // state 172
128,620, // white
129,674, // {12}
130,674, // " "
131,674, // {9}
132,889, // eol
133,775, // comment
134,943, // oneLineComment
135,641, // blockComment
136,1598, // "/"
164,926, // {10}
165,676, // {13}
181,MIN_REDUCTION+208, // $NT
  }
,
{ // state 173
0x80000000|1412, // match move
0x80000000|454, // no-match move
// T-test match for "0":
99,
  }
,
{ // state 174
0x80000000|923, // match move
0x80000000|451, // no-match move
// T-test match for "=":
97,
  }
,
{ // state 175
MIN_REDUCTION+112, // (default reduction)
  }
,
{ // state 176
MIN_REDUCTION+286, // (default reduction)
  }
,
{ // state 177
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+277, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
972, // `!
312, // `!=
1102, // `%
1560, // `&&
293, // `*
647, // `(
123, // `)
1355, // `{
95, // `}
413, // `-
1444, // `+
67, // `=
1322, // `==
109, // `[
551, // `]
1370, // `||
168, // `<
53, // `<=
1559, // `,
604, // `>
1435, // `>=
1247, // `.
1490, // `;
111, // `++
50, // `--
152, // `/
385, // `:
872, // ID
161, // INT_LITERAL
485, // STRING_LITERAL
769, // CHAR_LITERAL
513, // "c"
513, // "l"
513, // "a"
513, // "s"
-1, // idChar
-1, // reserved
513, // "e"
637, // "!"
1360, // "="
1616, // "+"
305, // "0"
566, // digit++
961, // digit
513, // "x"
513, // "X"
-1, // hex
1361, // letter
-1, // "_"
513, // "d"
513, // "g"
513, // "m"
513, // "p"
513, // "v"
513, // "y"
513, // "f"
513, // "i"
513, // {"A".."W" "Y".."Z"}
513, // "o"
513, // "r"
513, // "u"
513, // {"j" "q"}
513, // "b"
513, // "h"
513, // "k"
513, // "n"
513, // "t"
513, // "w"
513, // "z"
305, // {"1".."9"}
1304, // white
1602, // {12}
1602, // " "
1602, // {9}
381, // eol
1433, // comment
565, // oneLineComment
26, // blockComment
1572, // "/"
-1, // printable**
-1, // printable
1638, // "*"
-1, // blockCommentContent*
-1, // blockCommentContent
582, // "["
295, // "-"
174, // "<"
182, // "|"
-1, // {"?".."@"}
164, // "&"
1357, // ")"
155, // ","
369, // "]"
-1, // {"#".."$"}
387, // ";"
1173, // ">"
1611, // "{"
978, // "%"
1273, // "("
-1, // "\"
319, // "."
246, // ":"
984, // "}"
-1, // {"^" "`" "~"}
995, // "'"
1482, // '"'
418, // {10}
1458, // {13}
-1, // stringPrintable
-1, // recognizeEscapeChar
-1, // charPrintable
792, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
-1, // escapeChars
-1, // token*
-1, // printable*
466, // digit+
-1, // idChar*
883, // letter+
MIN_REDUCTION+277, // $
-1, // $NT
  }
,
{ // state 178
-1, // $$start
-1, // start
465, // white*
-1, // $$0
MIN_REDUCTION+221, // token
1392, // `boolean
1186, // `class
1576, // `extends
798, // `void
1167, // `int
267, // `while
1537, // `if
316, // `else
440, // `for
165, // `break
280, // `this
1368, // `false
1106, // `true
953, // `super
489, // `null
1163, // `return
630, // `instanceof
976, // `new
1330, // `abstract
1402, // `assert
1567, // `byte
27, // `case
833, // `catch
982, // `char
1324, // `const
141, // `continue
115, // `default
1035, // `do
140, // `double
308, // `enum
662, // `final
1021, // `finally
1158, // `float
765, // `goto
1302, // `implements
768, // `import
1514, // `interface
1633, // `long
812, // `native
1233, // `package
245, // `private
339, // `protected
1254, // `public
516, // `short
412, // `static
1491, // `strictfp
832, // `switch
397, // `synchronized
201, // `throw
1108, // `throws
417, // `transient
631, // `try
927, // `volatile
972, // `!
312, // `!=
1102, // `%
1560, // `&&
293, // `*
647, // `(
123, // `)
1355, // `{
95, // `}
413, // `-
1444, // `+
67, // `=
1322, // `==
109, // `[
551, // `]
1370, // `||
168, // `<
53, // `<=
1559, // `,
604, // `>
1435, // `>=
1247, // `.
1490, // `;
111, // `++
50, // `--
152, // `/
385, // `:
-1, // ID
161, // INT_LITERAL
485, // STRING_LITERAL
769, // CHAR_LITERAL
MIN_REDUCTION+221, // "c"
MIN_REDUCTION+221, // "l"
MIN_REDUCTION+221, // "a"
MIN_REDUCTION+221, // "s"
-1, // idChar
-1, // reserved
MIN_REDUCTION+221, // "e"
637, // "!"
1360, // "="
1616, // "+"
MIN_REDUCTION+221, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+221, // "x"
MIN_REDUCTION+221, // "X"
-1, // hex
-1, // letter
-1, // "_"
MIN_REDUCTION+221, // "d"
MIN_REDUCTION+221, // "g"
MIN_REDUCTION+221, // "m"
MIN_REDUCTION+221, // "p"
MIN_REDUCTION+221, // "v"
MIN_REDUCTION+221, // "y"
MIN_REDUCTION+221, // "f"
MIN_REDUCTION+221, // "i"
MIN_REDUCTION+221, // {"A".."W" "Y".."Z"}
MIN_REDUCTION+221, // "o"
MIN_REDUCTION+221, // "r"
MIN_REDUCTION+221, // "u"
MIN_REDUCTION+221, // {"j" "q"}
MIN_REDUCTION+221, // "b"
MIN_REDUCTION+221, // "h"
MIN_REDUCTION+221, // "k"
MIN_REDUCTION+221, // "n"
MIN_REDUCTION+221, // "t"
MIN_REDUCTION+221, // "w"
MIN_REDUCTION+221, // "z"
MIN_REDUCTION+221, // {"1".."9"}
376, // white
1602, // {12}
1602, // " "
1602, // {9}
381, // eol
1433, // comment
565, // oneLineComment
26, // blockComment
1572, // "/"
-1, // printable**
-1, // printable
1638, // "*"
-1, // blockCommentContent*
-1, // blockCommentContent
582, // "["
295, // "-"
174, // "<"
182, // "|"
-1, // {"?".."@"}
164, // "&"
1357, // ")"
155, // ","
369, // "]"
-1, // {"#".."$"}
387, // ";"
1173, // ">"
1611, // "{"
978, // "%"
1273, // "("
-1, // "\"
319, // "."
246, // ":"
984, // "}"
-1, // {"^" "`" "~"}
995, // "'"
1482, // '"'
418, // {10}
1458, // {13}
-1, // stringPrintable
-1, // recognizeEscapeChar
-1, // charPrintable
-1, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
-1, // escapeChars
-1, // token*
-1, // printable*
-1, // digit+
-1, // idChar*
-1, // letter+
MIN_REDUCTION+221, // $
-1, // $NT
  }
,
{ // state 179
90,1065, // "l"
  }
,
{ // state 180
95,1297, // "e"
  }
,
{ // state 181
117,527, // "r"
  }
,
{ // state 182
145,1569, // "|"
  }
,
{ // state 183
120,751, // "b"
  }
,
{ // state 184
91,29, // "a"
  }
,
{ // state 185
0x80000000|239, // match move
0x80000000|1204, // no-match move
// T-test match for "0":
99,
  }
,
{ // state 186
0x80000000|352, // match move
0x80000000|1462, // no-match move
0x80000000|1258, // NT-test-match state for reserved
  }
,
{ // state 187
124,197, // "t"
  }
,
{ // state 188
117,699, // "r"
  }
,
{ // state 189
4,MIN_REDUCTION+370, // token
96,MIN_REDUCTION+370, // "!"
97,MIN_REDUCTION+370, // "="
98,MIN_REDUCTION+370, // "+"
129,MIN_REDUCTION+370, // {12}
130,MIN_REDUCTION+370, // " "
131,MIN_REDUCTION+370, // {9}
136,MIN_REDUCTION+370, // "/"
139,MIN_REDUCTION+370, // "*"
142,MIN_REDUCTION+370, // "["
143,MIN_REDUCTION+370, // "-"
144,MIN_REDUCTION+370, // "<"
145,MIN_REDUCTION+370, // "|"
147,MIN_REDUCTION+370, // "&"
148,MIN_REDUCTION+370, // ")"
149,MIN_REDUCTION+370, // ","
150,MIN_REDUCTION+370, // "]"
152,MIN_REDUCTION+370, // ";"
153,MIN_REDUCTION+370, // ">"
154,MIN_REDUCTION+370, // "{"
155,MIN_REDUCTION+370, // "%"
156,MIN_REDUCTION+370, // "("
158,MIN_REDUCTION+370, // "."
159,MIN_REDUCTION+370, // ":"
160,MIN_REDUCTION+370, // "}"
162,MIN_REDUCTION+370, // "'"
163,MIN_REDUCTION+370, // '"'
164,MIN_REDUCTION+370, // {10}
165,MIN_REDUCTION+370, // {13}
171,MIN_REDUCTION+370, // $$1
180,MIN_REDUCTION+370, // $
MIN_REDUCTION+370, // (default reduction)
  }
,
{ // state 190
2,1439, // white*
128,1336, // white
129,674, // {12}
130,674, // " "
131,674, // {9}
132,889, // eol
133,775, // comment
134,943, // oneLineComment
135,641, // blockComment
136,1598, // "/"
164,926, // {10}
165,676, // {13}
181,MIN_REDUCTION+230, // $NT
  }
,
{ // state 191
-1, // $$start
-1, // start
952, // white*
-1, // $$0
MIN_REDUCTION+100, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
972, // `!
312, // `!=
1102, // `%
1560, // `&&
293, // `*
647, // `(
123, // `)
1355, // `{
95, // `}
413, // `-
1444, // `+
67, // `=
1322, // `==
109, // `[
551, // `]
1370, // `||
168, // `<
53, // `<=
1559, // `,
604, // `>
1435, // `>=
1247, // `.
1490, // `;
111, // `++
50, // `--
152, // `/
385, // `:
872, // ID
161, // INT_LITERAL
485, // STRING_LITERAL
769, // CHAR_LITERAL
513, // "c"
513, // "l"
513, // "a"
513, // "s"
-1, // idChar
-1, // reserved
513, // "e"
637, // "!"
1360, // "="
1616, // "+"
305, // "0"
566, // digit++
961, // digit
513, // "x"
513, // "X"
-1, // hex
1361, // letter
-1, // "_"
513, // "d"
513, // "g"
513, // "m"
513, // "p"
513, // "v"
513, // "y"
513, // "f"
513, // "i"
513, // {"A".."W" "Y".."Z"}
513, // "o"
513, // "r"
513, // "u"
513, // {"j" "q"}
513, // "b"
513, // "h"
513, // "k"
513, // "n"
513, // "t"
513, // "w"
513, // "z"
305, // {"1".."9"}
376, // white
1602, // {12}
1602, // " "
1602, // {9}
381, // eol
1433, // comment
565, // oneLineComment
26, // blockComment
1572, // "/"
-1, // printable**
-1, // printable
1638, // "*"
-1, // blockCommentContent*
-1, // blockCommentContent
582, // "["
295, // "-"
174, // "<"
182, // "|"
-1, // {"?".."@"}
164, // "&"
1357, // ")"
155, // ","
369, // "]"
-1, // {"#".."$"}
387, // ";"
1173, // ">"
1611, // "{"
978, // "%"
1273, // "("
-1, // "\"
319, // "."
246, // ":"
984, // "}"
-1, // {"^" "`" "~"}
995, // "'"
1482, // '"'
418, // {10}
1458, // {13}
-1, // stringPrintable
-1, // recognizeEscapeChar
-1, // charPrintable
792, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
-1, // escapeChars
-1, // token*
-1, // printable*
466, // digit+
-1, // idChar*
883, // letter+
MIN_REDUCTION+100, // $
-1, // $NT
  }
,
{ // state 192
114,1194, // "i"
  }
,
{ // state 193
117,816, // "r"
  }
,
{ // state 194
92,509, // "s"
120,438, // "b"
  }
,
{ // state 195
0x80000000|1242, // match move
0x80000000|575, // no-match move
0x80000000|1258, // NT-test-match state for reserved
  }
,
{ // state 196
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+147, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
972, // `!
312, // `!=
1102, // `%
1560, // `&&
293, // `*
647, // `(
123, // `)
1355, // `{
95, // `}
413, // `-
1444, // `+
67, // `=
1322, // `==
109, // `[
551, // `]
1370, // `||
168, // `<
53, // `<=
1559, // `,
604, // `>
1435, // `>=
1247, // `.
1490, // `;
111, // `++
50, // `--
152, // `/
385, // `:
872, // ID
161, // INT_LITERAL
485, // STRING_LITERAL
769, // CHAR_LITERAL
513, // "c"
513, // "l"
513, // "a"
513, // "s"
-1, // idChar
-1, // reserved
513, // "e"
637, // "!"
1360, // "="
1616, // "+"
305, // "0"
566, // digit++
961, // digit
513, // "x"
513, // "X"
-1, // hex
1361, // letter
-1, // "_"
513, // "d"
513, // "g"
513, // "m"
513, // "p"
513, // "v"
513, // "y"
513, // "f"
513, // "i"
513, // {"A".."W" "Y".."Z"}
513, // "o"
513, // "r"
513, // "u"
513, // {"j" "q"}
513, // "b"
513, // "h"
513, // "k"
513, // "n"
513, // "t"
513, // "w"
513, // "z"
305, // {"1".."9"}
1304, // white
1602, // {12}
1602, // " "
1602, // {9}
381, // eol
1433, // comment
565, // oneLineComment
26, // blockComment
1572, // "/"
-1, // printable**
-1, // printable
1638, // "*"
-1, // blockCommentContent*
-1, // blockCommentContent
582, // "["
295, // "-"
174, // "<"
182, // "|"
-1, // {"?".."@"}
164, // "&"
1357, // ")"
155, // ","
369, // "]"
-1, // {"#".."$"}
387, // ";"
1173, // ">"
1611, // "{"
978, // "%"
1273, // "("
-1, // "\"
319, // "."
246, // ":"
984, // "}"
-1, // {"^" "`" "~"}
995, // "'"
1482, // '"'
418, // {10}
1458, // {13}
-1, // stringPrintable
-1, // recognizeEscapeChar
-1, // charPrintable
792, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
-1, // escapeChars
-1, // token*
-1, // printable*
466, // digit+
-1, // idChar*
883, // letter+
MIN_REDUCTION+147, // $
-1, // $NT
  }
,
{ // state 197
0x80000000|1, // match move
0x80000000|379, // no-match move
0x80000000|36, // NT-test-match state for idChar
  }
,
{ // state 198
114,247, // "i"
  }
,
{ // state 199
120,580, // "b"
  }
,
{ // state 200
116,390, // "o"
  }
,
{ // state 201
MIN_REDUCTION+53, // (default reduction)
  }
,
{ // state 202
2,1307, // white*
128,1336, // white
129,674, // {12}
130,674, // " "
131,674, // {9}
132,889, // eol
133,775, // comment
134,943, // oneLineComment
135,641, // blockComment
136,1598, // "/"
164,926, // {10}
165,676, // {13}
181,MIN_REDUCTION+245, // $NT
  }
,
{ // state 203
0x80000000|542, // match move
0x80000000|1064, // no-match move
0x80000000|1258, // NT-test-match state for reserved
  }
,
{ // state 204
0x80000000|547, // match move
0x80000000|1268, // no-match move
0x80000000|1258, // NT-test-match state for reserved
  }
,
{ // state 205
117,905, // "r"
121,73, // "h"
  }
,
{ // state 206
0x80000000|1, // match move
0x80000000|128, // no-match move
0x80000000|36, // NT-test-match state for idChar
  }
,
{ // state 207
-1, // $$start
-1, // start
1000, // white*
-1, // $$0
MIN_REDUCTION+174, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
972, // `!
312, // `!=
1102, // `%
1560, // `&&
293, // `*
647, // `(
123, // `)
1355, // `{
95, // `}
413, // `-
1444, // `+
67, // `=
1322, // `==
109, // `[
551, // `]
1370, // `||
168, // `<
53, // `<=
1559, // `,
604, // `>
1435, // `>=
1247, // `.
1490, // `;
111, // `++
50, // `--
152, // `/
385, // `:
872, // ID
161, // INT_LITERAL
485, // STRING_LITERAL
769, // CHAR_LITERAL
513, // "c"
513, // "l"
513, // "a"
513, // "s"
-1, // idChar
-1, // reserved
513, // "e"
637, // "!"
1360, // "="
1616, // "+"
305, // "0"
566, // digit++
961, // digit
513, // "x"
513, // "X"
-1, // hex
1361, // letter
-1, // "_"
513, // "d"
513, // "g"
513, // "m"
513, // "p"
513, // "v"
513, // "y"
513, // "f"
513, // "i"
513, // {"A".."W" "Y".."Z"}
513, // "o"
513, // "r"
513, // "u"
513, // {"j" "q"}
513, // "b"
513, // "h"
513, // "k"
513, // "n"
513, // "t"
513, // "w"
513, // "z"
305, // {"1".."9"}
376, // white
1602, // {12}
1602, // " "
1602, // {9}
381, // eol
1433, // comment
565, // oneLineComment
26, // blockComment
1572, // "/"
-1, // printable**
-1, // printable
1638, // "*"
-1, // blockCommentContent*
-1, // blockCommentContent
582, // "["
295, // "-"
174, // "<"
182, // "|"
-1, // {"?".."@"}
164, // "&"
1357, // ")"
155, // ","
369, // "]"
-1, // {"#".."$"}
387, // ";"
1173, // ">"
1611, // "{"
978, // "%"
1273, // "("
-1, // "\"
319, // "."
246, // ":"
984, // "}"
-1, // {"^" "`" "~"}
995, // "'"
1482, // '"'
418, // {10}
1458, // {13}
-1, // stringPrintable
-1, // recognizeEscapeChar
-1, // charPrintable
792, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
-1, // escapeChars
-1, // token*
-1, // printable*
466, // digit+
-1, // idChar*
883, // letter+
MIN_REDUCTION+174, // $
-1, // $NT
  }
,
{ // state 208
-1, // $$start
-1, // start
1585, // white*
-1, // $$0
MIN_REDUCTION+302, // token
1392, // `boolean
1186, // `class
1576, // `extends
798, // `void
1167, // `int
267, // `while
1537, // `if
316, // `else
440, // `for
165, // `break
280, // `this
1368, // `false
1106, // `true
953, // `super
489, // `null
1163, // `return
630, // `instanceof
976, // `new
1330, // `abstract
1402, // `assert
1567, // `byte
27, // `case
833, // `catch
982, // `char
1324, // `const
141, // `continue
115, // `default
1035, // `do
140, // `double
308, // `enum
662, // `final
1021, // `finally
1158, // `float
765, // `goto
1302, // `implements
768, // `import
1514, // `interface
1633, // `long
812, // `native
1233, // `package
245, // `private
339, // `protected
1254, // `public
516, // `short
412, // `static
1491, // `strictfp
832, // `switch
397, // `synchronized
201, // `throw
1108, // `throws
417, // `transient
631, // `try
927, // `volatile
972, // `!
312, // `!=
1102, // `%
1560, // `&&
293, // `*
647, // `(
123, // `)
1355, // `{
95, // `}
413, // `-
1444, // `+
67, // `=
1322, // `==
109, // `[
551, // `]
1370, // `||
168, // `<
53, // `<=
1559, // `,
604, // `>
1435, // `>=
1247, // `.
1490, // `;
111, // `++
50, // `--
152, // `/
385, // `:
-1, // ID
161, // INT_LITERAL
485, // STRING_LITERAL
769, // CHAR_LITERAL
MIN_REDUCTION+302, // "c"
MIN_REDUCTION+302, // "l"
MIN_REDUCTION+302, // "a"
MIN_REDUCTION+302, // "s"
-1, // idChar
-1, // reserved
MIN_REDUCTION+302, // "e"
637, // "!"
1360, // "="
1616, // "+"
MIN_REDUCTION+302, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+302, // "x"
MIN_REDUCTION+302, // "X"
-1, // hex
-1, // letter
-1, // "_"
MIN_REDUCTION+302, // "d"
MIN_REDUCTION+302, // "g"
MIN_REDUCTION+302, // "m"
MIN_REDUCTION+302, // "p"
MIN_REDUCTION+302, // "v"
MIN_REDUCTION+302, // "y"
MIN_REDUCTION+302, // "f"
MIN_REDUCTION+302, // "i"
MIN_REDUCTION+302, // {"A".."W" "Y".."Z"}
MIN_REDUCTION+302, // "o"
MIN_REDUCTION+302, // "r"
MIN_REDUCTION+302, // "u"
MIN_REDUCTION+302, // {"j" "q"}
MIN_REDUCTION+302, // "b"
MIN_REDUCTION+302, // "h"
MIN_REDUCTION+302, // "k"
MIN_REDUCTION+302, // "n"
MIN_REDUCTION+302, // "t"
MIN_REDUCTION+302, // "w"
MIN_REDUCTION+302, // "z"
MIN_REDUCTION+302, // {"1".."9"}
376, // white
1602, // {12}
1602, // " "
1602, // {9}
381, // eol
1433, // comment
565, // oneLineComment
26, // blockComment
1572, // "/"
-1, // printable**
-1, // printable
1638, // "*"
-1, // blockCommentContent*
-1, // blockCommentContent
582, // "["
295, // "-"
174, // "<"
182, // "|"
-1, // {"?".."@"}
164, // "&"
1357, // ")"
155, // ","
369, // "]"
-1, // {"#".."$"}
387, // ";"
1173, // ">"
1611, // "{"
978, // "%"
1273, // "("
-1, // "\"
319, // "."
246, // ":"
984, // "}"
-1, // {"^" "`" "~"}
995, // "'"
1482, // '"'
418, // {10}
1458, // {13}
-1, // stringPrintable
-1, // recognizeEscapeChar
-1, // charPrintable
-1, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
-1, // escapeChars
-1, // token*
-1, // printable*
-1, // digit+
-1, // idChar*
-1, // letter+
MIN_REDUCTION+302, // $
-1, // $NT
  }
};
}
private class Initter2{
public int doInit(int startIdx) {
  for (int i = 0; i < myParseTable.length; i++) {
    parseTable[i+startIdx] = myParseTable[i];
  }
  return myParseTable.length;
}
private final int[][] myParseTable = {
{ // state 209
107,1464, // "d"
  }
,
{ // state 210
0x80000000|1, // match move
0x80000000|1159, // no-match move
0x80000000|36, // NT-test-match state for idChar
  }
,
{ // state 211
128,620, // white
129,674, // {12}
130,674, // " "
131,674, // {9}
132,889, // eol
133,775, // comment
134,943, // oneLineComment
135,641, // blockComment
136,1598, // "/"
164,926, // {10}
165,676, // {13}
181,MIN_REDUCTION+334, // $NT
  }
,
{ // state 212
0x80000000|1, // match move
0x80000000|340, // no-match move
0x80000000|36, // NT-test-match state for idChar
  }
,
{ // state 213
0x80000000|1084, // match move
0x80000000|583, // no-match move
0x80000000|1258, // NT-test-match state for reserved
  }
,
{ // state 214
MIN_REDUCTION+169, // (default reduction)
  }
,
{ // state 215
2,1389, // white*
128,1336, // white
129,674, // {12}
130,674, // " "
131,674, // {9}
132,889, // eol
133,775, // comment
134,943, // oneLineComment
135,641, // blockComment
136,1598, // "/"
164,926, // {10}
165,676, // {13}
181,MIN_REDUCTION+200, // $NT
  }
,
{ // state 216
121,725, // "h"
  }
,
{ // state 217
91,1522, // "a"
  }
,
{ // state 218
MIN_REDUCTION+127, // (default reduction)
  }
,
{ // state 219
-1, // $$start
-1, // start
392, // white*
-1, // $$0
MIN_REDUCTION+335, // token
1392, // `boolean
1186, // `class
1576, // `extends
798, // `void
1167, // `int
267, // `while
1537, // `if
316, // `else
440, // `for
165, // `break
280, // `this
1368, // `false
1106, // `true
953, // `super
489, // `null
1163, // `return
630, // `instanceof
976, // `new
1330, // `abstract
1402, // `assert
1567, // `byte
27, // `case
833, // `catch
982, // `char
1324, // `const
141, // `continue
115, // `default
1035, // `do
140, // `double
308, // `enum
662, // `final
1021, // `finally
1158, // `float
765, // `goto
1302, // `implements
768, // `import
1514, // `interface
1633, // `long
812, // `native
1233, // `package
245, // `private
339, // `protected
1254, // `public
516, // `short
412, // `static
1491, // `strictfp
832, // `switch
397, // `synchronized
201, // `throw
1108, // `throws
417, // `transient
631, // `try
927, // `volatile
972, // `!
312, // `!=
1102, // `%
1560, // `&&
293, // `*
647, // `(
123, // `)
1355, // `{
95, // `}
413, // `-
1444, // `+
67, // `=
1322, // `==
109, // `[
551, // `]
1370, // `||
168, // `<
53, // `<=
1559, // `,
604, // `>
1435, // `>=
1247, // `.
1490, // `;
111, // `++
50, // `--
152, // `/
385, // `:
-1, // ID
161, // INT_LITERAL
485, // STRING_LITERAL
769, // CHAR_LITERAL
MIN_REDUCTION+335, // "c"
MIN_REDUCTION+335, // "l"
MIN_REDUCTION+335, // "a"
MIN_REDUCTION+335, // "s"
-1, // idChar
-1, // reserved
MIN_REDUCTION+335, // "e"
637, // "!"
1360, // "="
1616, // "+"
MIN_REDUCTION+335, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+335, // "x"
MIN_REDUCTION+335, // "X"
-1, // hex
-1, // letter
-1, // "_"
MIN_REDUCTION+335, // "d"
MIN_REDUCTION+335, // "g"
MIN_REDUCTION+335, // "m"
MIN_REDUCTION+335, // "p"
MIN_REDUCTION+335, // "v"
MIN_REDUCTION+335, // "y"
MIN_REDUCTION+335, // "f"
MIN_REDUCTION+335, // "i"
MIN_REDUCTION+335, // {"A".."W" "Y".."Z"}
MIN_REDUCTION+335, // "o"
MIN_REDUCTION+335, // "r"
MIN_REDUCTION+335, // "u"
MIN_REDUCTION+335, // {"j" "q"}
MIN_REDUCTION+335, // "b"
MIN_REDUCTION+335, // "h"
MIN_REDUCTION+335, // "k"
MIN_REDUCTION+335, // "n"
MIN_REDUCTION+335, // "t"
MIN_REDUCTION+335, // "w"
MIN_REDUCTION+335, // "z"
MIN_REDUCTION+335, // {"1".."9"}
376, // white
1602, // {12}
1602, // " "
1602, // {9}
381, // eol
1433, // comment
565, // oneLineComment
26, // blockComment
1572, // "/"
-1, // printable**
-1, // printable
1638, // "*"
-1, // blockCommentContent*
-1, // blockCommentContent
582, // "["
295, // "-"
174, // "<"
182, // "|"
-1, // {"?".."@"}
164, // "&"
1357, // ")"
155, // ","
369, // "]"
-1, // {"#".."$"}
387, // ";"
1173, // ">"
1611, // "{"
978, // "%"
1273, // "("
-1, // "\"
319, // "."
246, // ":"
984, // "}"
-1, // {"^" "`" "~"}
995, // "'"
1482, // '"'
418, // {10}
1458, // {13}
-1, // stringPrintable
-1, // recognizeEscapeChar
-1, // charPrintable
-1, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
-1, // escapeChars
-1, // token*
-1, // printable*
-1, // digit+
-1, // idChar*
-1, // letter+
MIN_REDUCTION+335, // $
-1, // $NT
  }
,
{ // state 220
0x80000000|1209, // match move
0x80000000|455, // no-match move
0x80000000|1258, // NT-test-match state for reserved
  }
,
{ // state 221
2,939, // white*
128,1336, // white
129,674, // {12}
130,674, // " "
131,674, // {9}
132,889, // eol
133,775, // comment
134,943, // oneLineComment
135,641, // blockComment
136,1598, // "/"
164,926, // {10}
165,676, // {13}
181,MIN_REDUCTION+284, // $NT
  }
,
{ // state 222
-1, // $$start
-1, // start
153, // white*
-1, // $$0
MIN_REDUCTION+178, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
972, // `!
312, // `!=
1102, // `%
1560, // `&&
293, // `*
647, // `(
123, // `)
1355, // `{
95, // `}
413, // `-
1444, // `+
67, // `=
1322, // `==
109, // `[
551, // `]
1370, // `||
168, // `<
53, // `<=
1559, // `,
604, // `>
1435, // `>=
1247, // `.
1490, // `;
111, // `++
50, // `--
152, // `/
385, // `:
872, // ID
161, // INT_LITERAL
485, // STRING_LITERAL
769, // CHAR_LITERAL
513, // "c"
513, // "l"
513, // "a"
513, // "s"
-1, // idChar
-1, // reserved
513, // "e"
637, // "!"
1360, // "="
1616, // "+"
305, // "0"
566, // digit++
961, // digit
513, // "x"
513, // "X"
-1, // hex
1361, // letter
-1, // "_"
513, // "d"
513, // "g"
513, // "m"
513, // "p"
513, // "v"
513, // "y"
513, // "f"
513, // "i"
513, // {"A".."W" "Y".."Z"}
513, // "o"
513, // "r"
513, // "u"
513, // {"j" "q"}
513, // "b"
513, // "h"
513, // "k"
513, // "n"
513, // "t"
513, // "w"
513, // "z"
305, // {"1".."9"}
376, // white
1602, // {12}
1602, // " "
1602, // {9}
381, // eol
1433, // comment
565, // oneLineComment
26, // blockComment
1572, // "/"
-1, // printable**
-1, // printable
1638, // "*"
-1, // blockCommentContent*
-1, // blockCommentContent
582, // "["
295, // "-"
174, // "<"
182, // "|"
-1, // {"?".."@"}
164, // "&"
1357, // ")"
155, // ","
369, // "]"
-1, // {"#".."$"}
387, // ";"
1173, // ">"
1611, // "{"
978, // "%"
1273, // "("
-1, // "\"
319, // "."
246, // ":"
984, // "}"
-1, // {"^" "`" "~"}
995, // "'"
1482, // '"'
418, // {10}
1458, // {13}
-1, // stringPrintable
-1, // recognizeEscapeChar
-1, // charPrintable
792, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
-1, // escapeChars
-1, // token*
-1, // printable*
466, // digit+
-1, // idChar*
883, // letter+
MIN_REDUCTION+178, // $
-1, // $NT
  }
,
{ // state 223
0x80000000|1, // match move
0x80000000|321, // no-match move
0x80000000|36, // NT-test-match state for idChar
  }
,
{ // state 224
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+226, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
972, // `!
312, // `!=
1102, // `%
1560, // `&&
293, // `*
647, // `(
123, // `)
1355, // `{
95, // `}
413, // `-
1444, // `+
67, // `=
1322, // `==
109, // `[
551, // `]
1370, // `||
168, // `<
53, // `<=
1559, // `,
604, // `>
1435, // `>=
1247, // `.
1490, // `;
111, // `++
50, // `--
152, // `/
385, // `:
872, // ID
161, // INT_LITERAL
485, // STRING_LITERAL
769, // CHAR_LITERAL
513, // "c"
513, // "l"
513, // "a"
513, // "s"
-1, // idChar
-1, // reserved
513, // "e"
637, // "!"
1360, // "="
1616, // "+"
305, // "0"
566, // digit++
961, // digit
513, // "x"
513, // "X"
-1, // hex
1361, // letter
-1, // "_"
513, // "d"
513, // "g"
513, // "m"
513, // "p"
513, // "v"
513, // "y"
513, // "f"
513, // "i"
513, // {"A".."W" "Y".."Z"}
513, // "o"
513, // "r"
513, // "u"
513, // {"j" "q"}
513, // "b"
513, // "h"
513, // "k"
513, // "n"
513, // "t"
513, // "w"
513, // "z"
305, // {"1".."9"}
1304, // white
1602, // {12}
1602, // " "
1602, // {9}
381, // eol
1433, // comment
565, // oneLineComment
26, // blockComment
1572, // "/"
-1, // printable**
-1, // printable
1638, // "*"
-1, // blockCommentContent*
-1, // blockCommentContent
582, // "["
295, // "-"
174, // "<"
182, // "|"
-1, // {"?".."@"}
164, // "&"
1357, // ")"
155, // ","
369, // "]"
-1, // {"#".."$"}
387, // ";"
1173, // ">"
1611, // "{"
978, // "%"
1273, // "("
-1, // "\"
319, // "."
246, // ":"
984, // "}"
-1, // {"^" "`" "~"}
995, // "'"
1482, // '"'
418, // {10}
1458, // {13}
-1, // stringPrintable
-1, // recognizeEscapeChar
-1, // charPrintable
792, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
-1, // escapeChars
-1, // token*
-1, // printable*
466, // digit+
-1, // idChar*
883, // letter+
MIN_REDUCTION+226, // $
-1, // $NT
  }
,
{ // state 225
0x80000000|288, // match move
0x80000000|714, // no-match move
0x80000000|824, // NT-test-match state for printable
  }
,
{ // state 226
128,620, // white
129,674, // {12}
130,674, // " "
131,674, // {9}
132,889, // eol
133,775, // comment
134,943, // oneLineComment
135,641, // blockComment
136,1598, // "/"
164,926, // {10}
165,676, // {13}
181,MIN_REDUCTION+313, // $NT
  }
,
{ // state 227
0x80000000|1438, // match move
0x80000000|1374, // no-match move
// T-test match for "0":
99,
  }
,
{ // state 228
0x80000000|1, // match move
0x80000000|325, // no-match move
0x80000000|36, // NT-test-match state for idChar
  }
,
{ // state 229
MIN_REDUCTION+175, // (default reduction)
  }
,
{ // state 230
2,1148, // white*
128,376, // white
132,381, // eol
133,1433, // comment
134,565, // oneLineComment
135,26, // blockComment
MIN_REDUCTION+140, // (default reduction)
  }
,
{ // state 231
MIN_REDUCTION+211, // (default reduction)
  }
,
{ // state 232
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+256, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
972, // `!
312, // `!=
1102, // `%
1560, // `&&
293, // `*
647, // `(
123, // `)
1355, // `{
95, // `}
413, // `-
1444, // `+
67, // `=
1322, // `==
109, // `[
551, // `]
1370, // `||
168, // `<
53, // `<=
1559, // `,
604, // `>
1435, // `>=
1247, // `.
1490, // `;
111, // `++
50, // `--
152, // `/
385, // `:
872, // ID
161, // INT_LITERAL
485, // STRING_LITERAL
769, // CHAR_LITERAL
513, // "c"
513, // "l"
513, // "a"
513, // "s"
-1, // idChar
-1, // reserved
513, // "e"
637, // "!"
1360, // "="
1616, // "+"
305, // "0"
566, // digit++
961, // digit
513, // "x"
513, // "X"
-1, // hex
1361, // letter
-1, // "_"
513, // "d"
513, // "g"
513, // "m"
513, // "p"
513, // "v"
513, // "y"
513, // "f"
513, // "i"
513, // {"A".."W" "Y".."Z"}
513, // "o"
513, // "r"
513, // "u"
513, // {"j" "q"}
513, // "b"
513, // "h"
513, // "k"
513, // "n"
513, // "t"
513, // "w"
513, // "z"
305, // {"1".."9"}
1304, // white
1602, // {12}
1602, // " "
1602, // {9}
381, // eol
1433, // comment
565, // oneLineComment
26, // blockComment
1572, // "/"
-1, // printable**
-1, // printable
1638, // "*"
-1, // blockCommentContent*
-1, // blockCommentContent
582, // "["
295, // "-"
174, // "<"
182, // "|"
-1, // {"?".."@"}
164, // "&"
1357, // ")"
155, // ","
369, // "]"
-1, // {"#".."$"}
387, // ";"
1173, // ">"
1611, // "{"
978, // "%"
1273, // "("
-1, // "\"
319, // "."
246, // ":"
984, // "}"
-1, // {"^" "`" "~"}
995, // "'"
1482, // '"'
418, // {10}
1458, // {13}
-1, // stringPrintable
-1, // recognizeEscapeChar
-1, // charPrintable
792, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
-1, // escapeChars
-1, // token*
-1, // printable*
466, // digit+
-1, // idChar*
883, // letter+
MIN_REDUCTION+256, // $
-1, // $NT
  }
,
{ // state 233
0x80000000|823, // match move
0x80000000|1089, // no-match move
0x80000000|1258, // NT-test-match state for reserved
  }
,
{ // state 234
92,1093, // "s"
124,1641, // "t"
  }
,
{ // state 235
0x80000000|652, // match move
0x80000000|5, // no-match move
0x80000000|1258, // NT-test-match state for reserved
  }
,
{ // state 236
MIN_REDUCTION+262, // (default reduction)
  }
,
{ // state 237
MIN_REDUCTION+122, // (default reduction)
  }
,
{ // state 238
95,502, // "e"
  }
,
{ // state 239
128,1304, // white
132,381, // eol
133,1433, // comment
134,565, // oneLineComment
135,26, // blockComment
MIN_REDUCTION+137, // (default reduction)
  }
,
{ // state 240
124,346, // "t"
  }
,
{ // state 241
0x80000000|963, // match move
0x80000000|1014, // no-match move
// T-test match for "0":
99,
  }
,
{ // state 242
92,917, // "s"
  }
,
{ // state 243
-1, // $$start
-1, // start
1255, // white*
-1, // $$0
MIN_REDUCTION+311, // token
1392, // `boolean
1186, // `class
1576, // `extends
798, // `void
1167, // `int
267, // `while
1537, // `if
316, // `else
440, // `for
165, // `break
280, // `this
1368, // `false
1106, // `true
953, // `super
489, // `null
1163, // `return
630, // `instanceof
976, // `new
1330, // `abstract
1402, // `assert
1567, // `byte
27, // `case
833, // `catch
982, // `char
1324, // `const
141, // `continue
115, // `default
1035, // `do
140, // `double
308, // `enum
662, // `final
1021, // `finally
1158, // `float
765, // `goto
1302, // `implements
768, // `import
1514, // `interface
1633, // `long
812, // `native
1233, // `package
245, // `private
339, // `protected
1254, // `public
516, // `short
412, // `static
1491, // `strictfp
832, // `switch
397, // `synchronized
201, // `throw
1108, // `throws
417, // `transient
631, // `try
927, // `volatile
972, // `!
312, // `!=
1102, // `%
1560, // `&&
293, // `*
647, // `(
123, // `)
1355, // `{
95, // `}
413, // `-
1444, // `+
67, // `=
1322, // `==
109, // `[
551, // `]
1370, // `||
168, // `<
53, // `<=
1559, // `,
604, // `>
1435, // `>=
1247, // `.
1490, // `;
111, // `++
50, // `--
152, // `/
385, // `:
-1, // ID
161, // INT_LITERAL
485, // STRING_LITERAL
769, // CHAR_LITERAL
MIN_REDUCTION+311, // "c"
MIN_REDUCTION+311, // "l"
MIN_REDUCTION+311, // "a"
MIN_REDUCTION+311, // "s"
-1, // idChar
-1, // reserved
MIN_REDUCTION+311, // "e"
637, // "!"
1360, // "="
1616, // "+"
MIN_REDUCTION+311, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+311, // "x"
MIN_REDUCTION+311, // "X"
-1, // hex
-1, // letter
-1, // "_"
MIN_REDUCTION+311, // "d"
MIN_REDUCTION+311, // "g"
MIN_REDUCTION+311, // "m"
MIN_REDUCTION+311, // "p"
MIN_REDUCTION+311, // "v"
MIN_REDUCTION+311, // "y"
MIN_REDUCTION+311, // "f"
MIN_REDUCTION+311, // "i"
MIN_REDUCTION+311, // {"A".."W" "Y".."Z"}
MIN_REDUCTION+311, // "o"
MIN_REDUCTION+311, // "r"
MIN_REDUCTION+311, // "u"
MIN_REDUCTION+311, // {"j" "q"}
MIN_REDUCTION+311, // "b"
MIN_REDUCTION+311, // "h"
MIN_REDUCTION+311, // "k"
MIN_REDUCTION+311, // "n"
MIN_REDUCTION+311, // "t"
MIN_REDUCTION+311, // "w"
MIN_REDUCTION+311, // "z"
MIN_REDUCTION+311, // {"1".."9"}
376, // white
1602, // {12}
1602, // " "
1602, // {9}
381, // eol
1433, // comment
565, // oneLineComment
26, // blockComment
1572, // "/"
-1, // printable**
-1, // printable
1638, // "*"
-1, // blockCommentContent*
-1, // blockCommentContent
582, // "["
295, // "-"
174, // "<"
182, // "|"
-1, // {"?".."@"}
164, // "&"
1357, // ")"
155, // ","
369, // "]"
-1, // {"#".."$"}
387, // ";"
1173, // ">"
1611, // "{"
978, // "%"
1273, // "("
-1, // "\"
319, // "."
246, // ":"
984, // "}"
-1, // {"^" "`" "~"}
995, // "'"
1482, // '"'
418, // {10}
1458, // {13}
-1, // stringPrintable
-1, // recognizeEscapeChar
-1, // charPrintable
-1, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
-1, // escapeChars
-1, // token*
-1, // printable*
-1, // digit+
-1, // idChar*
-1, // letter+
MIN_REDUCTION+311, // $
-1, // $NT
  }
,
{ // state 244
0x80000000|1, // match move
0x80000000|907, // no-match move
0x80000000|36, // NT-test-match state for idChar
  }
,
{ // state 245
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 246
0x80000000|668, // match move
0x80000000|82, // no-match move
// T-test match for "0":
99,
  }
,
{ // state 247
89,867, // "c"
  }
,
{ // state 248
0x80000000|1450, // match move
0x80000000|132, // no-match move
0x80000000|1258, // NT-test-match state for reserved
  }
,
{ // state 249
123,536, // "n"
  }
,
{ // state 250
89,349, // "c"
  }
,
{ // state 251
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+235, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
972, // `!
312, // `!=
1102, // `%
1560, // `&&
293, // `*
647, // `(
123, // `)
1355, // `{
95, // `}
413, // `-
1444, // `+
67, // `=
1322, // `==
109, // `[
551, // `]
1370, // `||
168, // `<
53, // `<=
1559, // `,
604, // `>
1435, // `>=
1247, // `.
1490, // `;
111, // `++
50, // `--
152, // `/
385, // `:
872, // ID
161, // INT_LITERAL
485, // STRING_LITERAL
769, // CHAR_LITERAL
513, // "c"
513, // "l"
513, // "a"
513, // "s"
-1, // idChar
-1, // reserved
513, // "e"
637, // "!"
1360, // "="
1616, // "+"
305, // "0"
566, // digit++
961, // digit
513, // "x"
513, // "X"
-1, // hex
1361, // letter
-1, // "_"
513, // "d"
513, // "g"
513, // "m"
513, // "p"
513, // "v"
513, // "y"
513, // "f"
513, // "i"
513, // {"A".."W" "Y".."Z"}
513, // "o"
513, // "r"
513, // "u"
513, // {"j" "q"}
513, // "b"
513, // "h"
513, // "k"
513, // "n"
513, // "t"
513, // "w"
513, // "z"
305, // {"1".."9"}
1304, // white
1602, // {12}
1602, // " "
1602, // {9}
381, // eol
1433, // comment
565, // oneLineComment
26, // blockComment
1572, // "/"
-1, // printable**
-1, // printable
1638, // "*"
-1, // blockCommentContent*
-1, // blockCommentContent
582, // "["
295, // "-"
174, // "<"
182, // "|"
-1, // {"?".."@"}
164, // "&"
1357, // ")"
155, // ","
369, // "]"
-1, // {"#".."$"}
387, // ";"
1173, // ">"
1611, // "{"
978, // "%"
1273, // "("
-1, // "\"
319, // "."
246, // ":"
984, // "}"
-1, // {"^" "`" "~"}
995, // "'"
1482, // '"'
418, // {10}
1458, // {13}
-1, // stringPrintable
-1, // recognizeEscapeChar
-1, // charPrintable
792, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
-1, // escapeChars
-1, // token*
-1, // printable*
466, // digit+
-1, // idChar*
883, // letter+
MIN_REDUCTION+235, // $
-1, // $NT
  }
,
{ // state 252
124,1451, // "t"
  }
,
{ // state 253
123,712, // "n"
  }
,
{ // state 254
136,1431, // "/"
139,1086, // "*"
  }
,
{ // state 255
MIN_REDUCTION+352, // (default reduction)
  }
,
{ // state 256
92,606, // "s"
  }
,
{ // state 257
0x80000000|1, // match move
0x80000000|1123, // no-match move
0x80000000|36, // NT-test-match state for idChar
  }
,
{ // state 258
124,1338, // "t"
  }
,
{ // state 259
128,1304, // white
132,381, // eol
133,1433, // comment
134,565, // oneLineComment
135,26, // blockComment
MIN_REDUCTION+241, // (default reduction)
  }
,
{ // state 260
95,1434, // "e"
  }
,
{ // state 261
181,MIN_REDUCTION+333, // $NT
  }
,
{ // state 262
112,1645, // "y"
116,1184, // "o"
117,718, // "r"
  }
,
{ // state 263
95,212, // "e"
  }
,
{ // state 264
0x80000000|469, // match move
0x80000000|1637, // no-match move
0x80000000|1258, // NT-test-match state for reserved
  }
,
{ // state 265
99,327, // "0"
100,602, // digit++
101,121, // digit
127,327, // {"1".."9"}
177,314, // digit+
  }
,
{ // state 266
121,1477, // "h"
  }
,
{ // state 267
MIN_REDUCTION+10, // (default reduction)
  }
,
{ // state 268
0x80000000|1143, // match move
0x80000000|874, // no-match move
0x80000000|1258, // NT-test-match state for reserved
  }
,
{ // state 269
0x80000000|1540, // match move
0x80000000|924, // no-match move
// T-test match for "0":
99,
  }
,
{ // state 270
128,620, // white
129,674, // {12}
130,674, // " "
131,674, // {9}
132,889, // eol
133,775, // comment
134,943, // oneLineComment
135,641, // blockComment
136,1598, // "/"
164,926, // {10}
165,676, // {13}
181,MIN_REDUCTION+205, // $NT
  }
,
{ // state 271
0x80000000|1343, // match move
0x80000000|654, // no-match move
0x80000000|1258, // NT-test-match state for reserved
  }
,
{ // state 272
89,948, // "c"
  }
,
{ // state 273
2,986, // white*
128,1336, // white
129,674, // {12}
130,674, // " "
131,674, // {9}
132,889, // eol
133,775, // comment
134,943, // oneLineComment
135,641, // blockComment
136,1598, // "/"
164,926, // {10}
165,676, // {13}
181,MIN_REDUCTION+212, // $NT
  }
,
{ // state 274
128,1304, // white
132,381, // eol
133,1433, // comment
134,565, // oneLineComment
135,26, // blockComment
MIN_REDUCTION+295, // (default reduction)
  }
,
{ // state 275
181,MIN_REDUCTION+126, // $NT
MIN_REDUCTION+126, // (default reduction)
  }
,
{ // state 276
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+151, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
972, // `!
312, // `!=
1102, // `%
1560, // `&&
293, // `*
647, // `(
123, // `)
1355, // `{
95, // `}
413, // `-
1444, // `+
67, // `=
1322, // `==
109, // `[
551, // `]
1370, // `||
168, // `<
53, // `<=
1559, // `,
604, // `>
1435, // `>=
1247, // `.
1490, // `;
111, // `++
50, // `--
152, // `/
385, // `:
872, // ID
161, // INT_LITERAL
485, // STRING_LITERAL
769, // CHAR_LITERAL
513, // "c"
513, // "l"
513, // "a"
513, // "s"
-1, // idChar
-1, // reserved
513, // "e"
637, // "!"
1360, // "="
1616, // "+"
305, // "0"
566, // digit++
961, // digit
513, // "x"
513, // "X"
-1, // hex
1361, // letter
-1, // "_"
513, // "d"
513, // "g"
513, // "m"
513, // "p"
513, // "v"
513, // "y"
513, // "f"
513, // "i"
513, // {"A".."W" "Y".."Z"}
513, // "o"
513, // "r"
513, // "u"
513, // {"j" "q"}
513, // "b"
513, // "h"
513, // "k"
513, // "n"
513, // "t"
513, // "w"
513, // "z"
305, // {"1".."9"}
1304, // white
1602, // {12}
1602, // " "
1602, // {9}
381, // eol
1433, // comment
565, // oneLineComment
26, // blockComment
1572, // "/"
-1, // printable**
-1, // printable
1638, // "*"
-1, // blockCommentContent*
-1, // blockCommentContent
582, // "["
295, // "-"
174, // "<"
182, // "|"
-1, // {"?".."@"}
164, // "&"
1357, // ")"
155, // ","
369, // "]"
-1, // {"#".."$"}
387, // ";"
1173, // ">"
1611, // "{"
978, // "%"
1273, // "("
-1, // "\"
319, // "."
246, // ":"
984, // "}"
-1, // {"^" "`" "~"}
995, // "'"
1482, // '"'
418, // {10}
1458, // {13}
-1, // stringPrintable
-1, // recognizeEscapeChar
-1, // charPrintable
792, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
-1, // escapeChars
-1, // token*
-1, // printable*
466, // digit+
-1, // idChar*
883, // letter+
MIN_REDUCTION+151, // $
-1, // $NT
  }
,
{ // state 277
181,MIN_REDUCTION+109, // $NT
  }
,
{ // state 278
-1, // $$start
-1, // start
84, // white*
-1, // $$0
MIN_REDUCTION+215, // token
1392, // `boolean
1186, // `class
1576, // `extends
798, // `void
1167, // `int
267, // `while
1537, // `if
316, // `else
440, // `for
165, // `break
280, // `this
1368, // `false
1106, // `true
953, // `super
489, // `null
1163, // `return
630, // `instanceof
976, // `new
1330, // `abstract
1402, // `assert
1567, // `byte
27, // `case
833, // `catch
982, // `char
1324, // `const
141, // `continue
115, // `default
1035, // `do
140, // `double
308, // `enum
662, // `final
1021, // `finally
1158, // `float
765, // `goto
1302, // `implements
768, // `import
1514, // `interface
1633, // `long
812, // `native
1233, // `package
245, // `private
339, // `protected
1254, // `public
516, // `short
412, // `static
1491, // `strictfp
832, // `switch
397, // `synchronized
201, // `throw
1108, // `throws
417, // `transient
631, // `try
927, // `volatile
972, // `!
312, // `!=
1102, // `%
1560, // `&&
293, // `*
647, // `(
123, // `)
1355, // `{
95, // `}
413, // `-
1444, // `+
67, // `=
1322, // `==
109, // `[
551, // `]
1370, // `||
168, // `<
53, // `<=
1559, // `,
604, // `>
1435, // `>=
1247, // `.
1490, // `;
111, // `++
50, // `--
152, // `/
385, // `:
-1, // ID
161, // INT_LITERAL
485, // STRING_LITERAL
769, // CHAR_LITERAL
MIN_REDUCTION+215, // "c"
MIN_REDUCTION+215, // "l"
MIN_REDUCTION+215, // "a"
MIN_REDUCTION+215, // "s"
-1, // idChar
-1, // reserved
MIN_REDUCTION+215, // "e"
637, // "!"
1360, // "="
1616, // "+"
MIN_REDUCTION+215, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+215, // "x"
MIN_REDUCTION+215, // "X"
-1, // hex
-1, // letter
-1, // "_"
MIN_REDUCTION+215, // "d"
MIN_REDUCTION+215, // "g"
MIN_REDUCTION+215, // "m"
MIN_REDUCTION+215, // "p"
MIN_REDUCTION+215, // "v"
MIN_REDUCTION+215, // "y"
MIN_REDUCTION+215, // "f"
MIN_REDUCTION+215, // "i"
MIN_REDUCTION+215, // {"A".."W" "Y".."Z"}
MIN_REDUCTION+215, // "o"
MIN_REDUCTION+215, // "r"
MIN_REDUCTION+215, // "u"
MIN_REDUCTION+215, // {"j" "q"}
MIN_REDUCTION+215, // "b"
MIN_REDUCTION+215, // "h"
MIN_REDUCTION+215, // "k"
MIN_REDUCTION+215, // "n"
MIN_REDUCTION+215, // "t"
MIN_REDUCTION+215, // "w"
MIN_REDUCTION+215, // "z"
MIN_REDUCTION+215, // {"1".."9"}
376, // white
1602, // {12}
1602, // " "
1602, // {9}
381, // eol
1433, // comment
565, // oneLineComment
26, // blockComment
1572, // "/"
-1, // printable**
-1, // printable
1638, // "*"
-1, // blockCommentContent*
-1, // blockCommentContent
582, // "["
295, // "-"
174, // "<"
182, // "|"
-1, // {"?".."@"}
164, // "&"
1357, // ")"
155, // ","
369, // "]"
-1, // {"#".."$"}
387, // ";"
1173, // ">"
1611, // "{"
978, // "%"
1273, // "("
-1, // "\"
319, // "."
246, // ":"
984, // "}"
-1, // {"^" "`" "~"}
995, // "'"
1482, // '"'
418, // {10}
1458, // {13}
-1, // stringPrintable
-1, // recognizeEscapeChar
-1, // charPrintable
-1, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
-1, // escapeChars
-1, // token*
-1, // printable*
-1, // digit+
-1, // idChar*
-1, // letter+
MIN_REDUCTION+215, // $
-1, // $NT
  }
,
{ // state 279
0x80000000|852, // match move
0x80000000|920, // no-match move
0x80000000|1258, // NT-test-match state for reserved
  }
,
{ // state 280
MIN_REDUCTION+15, // (default reduction)
  }
,
{ // state 281
-1, // $$start
-1, // start
290, // white*
-1, // $$0
MIN_REDUCTION+326, // token
1392, // `boolean
1186, // `class
1576, // `extends
798, // `void
1167, // `int
267, // `while
1537, // `if
316, // `else
440, // `for
165, // `break
280, // `this
1368, // `false
1106, // `true
953, // `super
489, // `null
1163, // `return
630, // `instanceof
976, // `new
1330, // `abstract
1402, // `assert
1567, // `byte
27, // `case
833, // `catch
982, // `char
1324, // `const
141, // `continue
115, // `default
1035, // `do
140, // `double
308, // `enum
662, // `final
1021, // `finally
1158, // `float
765, // `goto
1302, // `implements
768, // `import
1514, // `interface
1633, // `long
812, // `native
1233, // `package
245, // `private
339, // `protected
1254, // `public
516, // `short
412, // `static
1491, // `strictfp
832, // `switch
397, // `synchronized
201, // `throw
1108, // `throws
417, // `transient
631, // `try
927, // `volatile
972, // `!
312, // `!=
1102, // `%
1560, // `&&
293, // `*
647, // `(
123, // `)
1355, // `{
95, // `}
413, // `-
1444, // `+
67, // `=
1322, // `==
109, // `[
551, // `]
1370, // `||
168, // `<
53, // `<=
1559, // `,
604, // `>
1435, // `>=
1247, // `.
1490, // `;
111, // `++
50, // `--
152, // `/
385, // `:
-1, // ID
161, // INT_LITERAL
485, // STRING_LITERAL
769, // CHAR_LITERAL
MIN_REDUCTION+326, // "c"
MIN_REDUCTION+326, // "l"
MIN_REDUCTION+326, // "a"
MIN_REDUCTION+326, // "s"
-1, // idChar
-1, // reserved
MIN_REDUCTION+326, // "e"
637, // "!"
1360, // "="
1616, // "+"
MIN_REDUCTION+326, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+326, // "x"
MIN_REDUCTION+326, // "X"
-1, // hex
-1, // letter
-1, // "_"
MIN_REDUCTION+326, // "d"
MIN_REDUCTION+326, // "g"
MIN_REDUCTION+326, // "m"
MIN_REDUCTION+326, // "p"
MIN_REDUCTION+326, // "v"
MIN_REDUCTION+326, // "y"
MIN_REDUCTION+326, // "f"
MIN_REDUCTION+326, // "i"
MIN_REDUCTION+326, // {"A".."W" "Y".."Z"}
MIN_REDUCTION+326, // "o"
MIN_REDUCTION+326, // "r"
MIN_REDUCTION+326, // "u"
MIN_REDUCTION+326, // {"j" "q"}
MIN_REDUCTION+326, // "b"
MIN_REDUCTION+326, // "h"
MIN_REDUCTION+326, // "k"
MIN_REDUCTION+326, // "n"
MIN_REDUCTION+326, // "t"
MIN_REDUCTION+326, // "w"
MIN_REDUCTION+326, // "z"
MIN_REDUCTION+326, // {"1".."9"}
376, // white
1602, // {12}
1602, // " "
1602, // {9}
381, // eol
1433, // comment
565, // oneLineComment
26, // blockComment
1572, // "/"
-1, // printable**
-1, // printable
1638, // "*"
-1, // blockCommentContent*
-1, // blockCommentContent
582, // "["
295, // "-"
174, // "<"
182, // "|"
-1, // {"?".."@"}
164, // "&"
1357, // ")"
155, // ","
369, // "]"
-1, // {"#".."$"}
387, // ";"
1173, // ">"
1611, // "{"
978, // "%"
1273, // "("
-1, // "\"
319, // "."
246, // ":"
984, // "}"
-1, // {"^" "`" "~"}
995, // "'"
1482, // '"'
418, // {10}
1458, // {13}
-1, // stringPrintable
-1, // recognizeEscapeChar
-1, // charPrintable
-1, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
-1, // escapeChars
-1, // token*
-1, // printable*
-1, // digit+
-1, // idChar*
-1, // letter+
MIN_REDUCTION+326, // $
-1, // $NT
  }
,
{ // state 282
125,1424, // "w"
  }
,
{ // state 283
1,447, // start
2,72, // white*
3,514, // $$0
4,666, // token
5,1392, // `boolean
6,1186, // `class
7,1576, // `extends
8,798, // `void
9,1167, // `int
10,267, // `while
11,1537, // `if
12,316, // `else
13,440, // `for
14,165, // `break
15,280, // `this
16,1368, // `false
17,1106, // `true
18,953, // `super
19,489, // `null
20,1163, // `return
21,630, // `instanceof
22,976, // `new
23,1330, // `abstract
24,1402, // `assert
25,1567, // `byte
26,27, // `case
27,833, // `catch
28,982, // `char
29,1324, // `const
30,141, // `continue
31,115, // `default
32,1035, // `do
33,140, // `double
34,308, // `enum
35,662, // `final
36,1021, // `finally
37,1158, // `float
38,765, // `goto
39,1302, // `implements
40,768, // `import
41,1514, // `interface
42,1633, // `long
43,812, // `native
44,1233, // `package
45,245, // `private
46,339, // `protected
47,1254, // `public
48,516, // `short
49,412, // `static
50,1491, // `strictfp
51,832, // `switch
52,397, // `synchronized
53,201, // `throw
54,1108, // `throws
55,417, // `transient
56,631, // `try
57,927, // `volatile
89,966, // "c"
90,1448, // "l"
91,1274, // "a"
92,80, // "s"
95,1075, // "e"
107,1178, // "d"
108,1593, // "g"
110,545, // "p"
111,446, // "v"
113,1332, // "f"
114,494, // "i"
117,180, // "r"
120,262, // "b"
123,1266, // "n"
124,205, // "t"
125,1162, // "w"
175,1278, // token*
180,MIN_REDUCTION+1, // $
  }
,
{ // state 284
2,97, // white*
128,1336, // white
129,674, // {12}
130,674, // " "
131,674, // {9}
132,889, // eol
133,775, // comment
134,943, // oneLineComment
135,641, // blockComment
136,1598, // "/"
164,926, // {10}
165,676, // {13}
181,MIN_REDUCTION+260, // $NT
  }
,
{ // state 285
181,MIN_REDUCTION+112, // $NT
  }
,
{ // state 286
123,1264, // "n"
  }
,
{ // state 287
181,MIN_REDUCTION+339, // $NT
  }
,
{ // state 288
89,821, // "c"
90,821, // "l"
91,821, // "a"
92,821, // "s"
95,821, // "e"
96,821, // "!"
97,821, // "="
98,821, // "+"
99,821, // "0"
102,821, // "x"
103,821, // "X"
106,821, // "_"
107,821, // "d"
108,821, // "g"
109,821, // "m"
110,821, // "p"
111,821, // "v"
112,821, // "y"
113,821, // "f"
114,821, // "i"
115,821, // {"A".."W" "Y".."Z"}
116,821, // "o"
117,821, // "r"
118,821, // "u"
119,821, // {"j" "q"}
120,821, // "b"
121,821, // "h"
122,821, // "k"
123,821, // "n"
124,821, // "t"
125,821, // "w"
126,821, // "z"
127,821, // {"1".."9"}
130,821, // " "
136,821, // "/"
138,518, // printable
139,821, // "*"
142,821, // "["
143,821, // "-"
144,821, // "<"
145,821, // "|"
146,821, // {"?".."@"}
147,821, // "&"
148,821, // ")"
149,821, // ","
150,821, // "]"
151,821, // {"#".."$"}
152,821, // ";"
153,821, // ">"
154,821, // "{"
155,821, // "%"
156,821, // "("
157,821, // "\"
158,821, // "."
159,821, // ":"
160,821, // "}"
161,821, // {"^" "`" "~"}
162,821, // "'"
163,821, // '"'
  }
,
{ // state 289
128,620, // white
129,674, // {12}
130,674, // " "
131,674, // {9}
132,889, // eol
133,775, // comment
134,943, // oneLineComment
135,641, // blockComment
136,1598, // "/"
164,926, // {10}
165,676, // {13}
181,MIN_REDUCTION+241, // $NT
  }
,
{ // state 290
0x80000000|1494, // match move
0x80000000|1485, // no-match move
// T-test match for "0":
99,
  }
,
{ // state 291
0x80000000|1260, // match move
0x80000000|117, // no-match move
0x80000000|36, // NT-test-match state for idChar
  }
,
{ // state 292
117,118, // "r"
  }
,
{ // state 293
MIN_REDUCTION+62, // (default reduction)
  }
,
{ // state 294
MIN_REDUCTION+112, // (default reduction)
  }
,
{ // state 295
0x80000000|1561, // match move
0x80000000|241, // no-match move
// T-test match for "-":
143,
  }
,
{ // state 296
2,1506, // white*
128,1336, // white
129,674, // {12}
130,674, // " "
131,674, // {9}
132,889, // eol
133,775, // comment
134,943, // oneLineComment
135,641, // blockComment
136,1598, // "/"
164,926, // {10}
165,676, // {13}
181,MIN_REDUCTION+302, // $NT
  }
,
{ // state 297
0x80000000|1116, // match move
0x80000000|330, // no-match move
// T-test match for "0":
99,
  }
,
{ // state 298
2,584, // white*
128,1336, // white
129,674, // {12}
130,674, // " "
131,674, // {9}
132,889, // eol
133,775, // comment
134,943, // oneLineComment
135,641, // blockComment
136,1598, // "/"
164,926, // {10}
165,676, // {13}
181,MIN_REDUCTION+239, // $NT
  }
,
{ // state 299
MIN_REDUCTION+310, // (default reduction)
  }
,
{ // state 300
MIN_REDUCTION+241, // (default reduction)
  }
,
{ // state 301
0x80000000|1140, // match move
0x80000000|382, // no-match move
// T-test match for "0":
99,
  }
,
{ // state 302
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 303
MIN_REDUCTION+125, // (default reduction)
  }
,
{ // state 304
MIN_REDUCTION+157, // (default reduction)
  }
,
{ // state 305
0x80000000|932, // match move
0x80000000|894, // no-match move
0x80000000|54, // NT-test-match state for digit
  }
,
{ // state 306
2,1398, // white*
128,1336, // white
129,674, // {12}
130,674, // " "
131,674, // {9}
132,889, // eol
133,775, // comment
134,943, // oneLineComment
135,641, // blockComment
136,1598, // "/"
164,926, // {10}
165,676, // {13}
181,MIN_REDUCTION+236, // $NT
  }
,
{ // state 307
117,1253, // "r"
  }
,
{ // state 308
MIN_REDUCTION+34, // (default reduction)
  }
,
{ // state 309
MIN_REDUCTION+118, // (default reduction)
  }
,
{ // state 310
0x80000000|881, // match move
0x80000000|1331, // no-match move
0x80000000|36, // NT-test-match state for idChar
  }
,
{ // state 311
107,1340, // "d"
  }
,
{ // state 312
MIN_REDUCTION+59, // (default reduction)
  }
,
{ // state 313
0x80000000|1, // match move
0x80000000|219, // no-match move
0x80000000|36, // NT-test-match state for idChar
  }
,
{ // state 314
0x80000000|125, // match move
0x80000000|849, // no-match move
0x80000000|54, // NT-test-match state for digit
  }
,
{ // state 315
0x80000000|1, // match move
0x80000000|864, // no-match move
0x80000000|36, // NT-test-match state for idChar
  }
,
{ // state 316
MIN_REDUCTION+12, // (default reduction)
  }
,
{ // state 317
0x80000000|859, // match move
0x80000000|1051, // no-match move
// T-test match for "0":
99,
  }
,
{ // state 318
116,139, // "o"
  }
,
{ // state 319
0x80000000|1053, // match move
0x80000000|398, // no-match move
// T-test match for "0":
99,
  }
,
{ // state 320
128,1304, // white
132,381, // eol
133,1433, // comment
134,565, // oneLineComment
135,26, // blockComment
MIN_REDUCTION+283, // (default reduction)
  }
,
{ // state 321
-1, // $$start
-1, // start
1170, // white*
-1, // $$0
MIN_REDUCTION+284, // token
1392, // `boolean
1186, // `class
1576, // `extends
798, // `void
1167, // `int
267, // `while
1537, // `if
316, // `else
440, // `for
165, // `break
280, // `this
1368, // `false
1106, // `true
953, // `super
489, // `null
1163, // `return
630, // `instanceof
976, // `new
1330, // `abstract
1402, // `assert
1567, // `byte
27, // `case
833, // `catch
982, // `char
1324, // `const
141, // `continue
115, // `default
1035, // `do
140, // `double
308, // `enum
662, // `final
1021, // `finally
1158, // `float
765, // `goto
1302, // `implements
768, // `import
1514, // `interface
1633, // `long
812, // `native
1233, // `package
245, // `private
339, // `protected
1254, // `public
516, // `short
412, // `static
1491, // `strictfp
832, // `switch
397, // `synchronized
201, // `throw
1108, // `throws
417, // `transient
631, // `try
927, // `volatile
972, // `!
312, // `!=
1102, // `%
1560, // `&&
293, // `*
647, // `(
123, // `)
1355, // `{
95, // `}
413, // `-
1444, // `+
67, // `=
1322, // `==
109, // `[
551, // `]
1370, // `||
168, // `<
53, // `<=
1559, // `,
604, // `>
1435, // `>=
1247, // `.
1490, // `;
111, // `++
50, // `--
152, // `/
385, // `:
-1, // ID
161, // INT_LITERAL
485, // STRING_LITERAL
769, // CHAR_LITERAL
MIN_REDUCTION+284, // "c"
MIN_REDUCTION+284, // "l"
MIN_REDUCTION+284, // "a"
MIN_REDUCTION+284, // "s"
-1, // idChar
-1, // reserved
MIN_REDUCTION+284, // "e"
637, // "!"
1360, // "="
1616, // "+"
MIN_REDUCTION+284, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+284, // "x"
MIN_REDUCTION+284, // "X"
-1, // hex
-1, // letter
-1, // "_"
MIN_REDUCTION+284, // "d"
MIN_REDUCTION+284, // "g"
MIN_REDUCTION+284, // "m"
MIN_REDUCTION+284, // "p"
MIN_REDUCTION+284, // "v"
MIN_REDUCTION+284, // "y"
MIN_REDUCTION+284, // "f"
MIN_REDUCTION+284, // "i"
MIN_REDUCTION+284, // {"A".."W" "Y".."Z"}
MIN_REDUCTION+284, // "o"
MIN_REDUCTION+284, // "r"
MIN_REDUCTION+284, // "u"
MIN_REDUCTION+284, // {"j" "q"}
MIN_REDUCTION+284, // "b"
MIN_REDUCTION+284, // "h"
MIN_REDUCTION+284, // "k"
MIN_REDUCTION+284, // "n"
MIN_REDUCTION+284, // "t"
MIN_REDUCTION+284, // "w"
MIN_REDUCTION+284, // "z"
MIN_REDUCTION+284, // {"1".."9"}
376, // white
1602, // {12}
1602, // " "
1602, // {9}
381, // eol
1433, // comment
565, // oneLineComment
26, // blockComment
1572, // "/"
-1, // printable**
-1, // printable
1638, // "*"
-1, // blockCommentContent*
-1, // blockCommentContent
582, // "["
295, // "-"
174, // "<"
182, // "|"
-1, // {"?".."@"}
164, // "&"
1357, // ")"
155, // ","
369, // "]"
-1, // {"#".."$"}
387, // ";"
1173, // ">"
1611, // "{"
978, // "%"
1273, // "("
-1, // "\"
319, // "."
246, // ":"
984, // "}"
-1, // {"^" "`" "~"}
995, // "'"
1482, // '"'
418, // {10}
1458, // {13}
-1, // stringPrintable
-1, // recognizeEscapeChar
-1, // charPrintable
-1, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
-1, // escapeChars
-1, // token*
-1, // printable*
-1, // digit+
-1, // idChar*
-1, // letter+
MIN_REDUCTION+284, // $
-1, // $NT
  }
,
{ // state 322
0x80000000|1432, // match move
0x80000000|875, // no-match move
0x80000000|54, // NT-test-match state for digit
  }
,
{ // state 323
MIN_REDUCTION+295, // (default reduction)
  }
,
{ // state 324
MIN_REDUCTION+373, // (default reduction)
  }
,
{ // state 325
-1, // $$start
-1, // start
1394, // white*
-1, // $$0
MIN_REDUCTION+266, // token
1392, // `boolean
1186, // `class
1576, // `extends
798, // `void
1167, // `int
267, // `while
1537, // `if
316, // `else
440, // `for
165, // `break
280, // `this
1368, // `false
1106, // `true
953, // `super
489, // `null
1163, // `return
630, // `instanceof
976, // `new
1330, // `abstract
1402, // `assert
1567, // `byte
27, // `case
833, // `catch
982, // `char
1324, // `const
141, // `continue
115, // `default
1035, // `do
140, // `double
308, // `enum
662, // `final
1021, // `finally
1158, // `float
765, // `goto
1302, // `implements
768, // `import
1514, // `interface
1633, // `long
812, // `native
1233, // `package
245, // `private
339, // `protected
1254, // `public
516, // `short
412, // `static
1491, // `strictfp
832, // `switch
397, // `synchronized
201, // `throw
1108, // `throws
417, // `transient
631, // `try
927, // `volatile
972, // `!
312, // `!=
1102, // `%
1560, // `&&
293, // `*
647, // `(
123, // `)
1355, // `{
95, // `}
413, // `-
1444, // `+
67, // `=
1322, // `==
109, // `[
551, // `]
1370, // `||
168, // `<
53, // `<=
1559, // `,
604, // `>
1435, // `>=
1247, // `.
1490, // `;
111, // `++
50, // `--
152, // `/
385, // `:
-1, // ID
161, // INT_LITERAL
485, // STRING_LITERAL
769, // CHAR_LITERAL
MIN_REDUCTION+266, // "c"
MIN_REDUCTION+266, // "l"
MIN_REDUCTION+266, // "a"
MIN_REDUCTION+266, // "s"
-1, // idChar
-1, // reserved
MIN_REDUCTION+266, // "e"
637, // "!"
1360, // "="
1616, // "+"
MIN_REDUCTION+266, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+266, // "x"
MIN_REDUCTION+266, // "X"
-1, // hex
-1, // letter
-1, // "_"
MIN_REDUCTION+266, // "d"
MIN_REDUCTION+266, // "g"
MIN_REDUCTION+266, // "m"
MIN_REDUCTION+266, // "p"
MIN_REDUCTION+266, // "v"
MIN_REDUCTION+266, // "y"
MIN_REDUCTION+266, // "f"
MIN_REDUCTION+266, // "i"
MIN_REDUCTION+266, // {"A".."W" "Y".."Z"}
MIN_REDUCTION+266, // "o"
MIN_REDUCTION+266, // "r"
MIN_REDUCTION+266, // "u"
MIN_REDUCTION+266, // {"j" "q"}
MIN_REDUCTION+266, // "b"
MIN_REDUCTION+266, // "h"
MIN_REDUCTION+266, // "k"
MIN_REDUCTION+266, // "n"
MIN_REDUCTION+266, // "t"
MIN_REDUCTION+266, // "w"
MIN_REDUCTION+266, // "z"
MIN_REDUCTION+266, // {"1".."9"}
376, // white
1602, // {12}
1602, // " "
1602, // {9}
381, // eol
1433, // comment
565, // oneLineComment
26, // blockComment
1572, // "/"
-1, // printable**
-1, // printable
1638, // "*"
-1, // blockCommentContent*
-1, // blockCommentContent
582, // "["
295, // "-"
174, // "<"
182, // "|"
-1, // {"?".."@"}
164, // "&"
1357, // ")"
155, // ","
369, // "]"
-1, // {"#".."$"}
387, // ";"
1173, // ">"
1611, // "{"
978, // "%"
1273, // "("
-1, // "\"
319, // "."
246, // ":"
984, // "}"
-1, // {"^" "`" "~"}
995, // "'"
1482, // '"'
418, // {10}
1458, // {13}
-1, // stringPrintable
-1, // recognizeEscapeChar
-1, // charPrintable
-1, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
-1, // escapeChars
-1, // token*
-1, // printable*
-1, // digit+
-1, // idChar*
-1, // letter+
MIN_REDUCTION+266, // $
-1, // $NT
  }
,
{ // state 326
90,1525, // "l"
  }
,
{ // state 327
0x80000000|932, // match move
0x80000000|175, // no-match move
0x80000000|54, // NT-test-match state for digit
  }
,
{ // state 328
0x80000000|947, // match move
0x80000000|1563, // no-match move
// T-test match for "0":
99,
  }
,
{ // state 329
90,1378, // "l"
114,1292, // "i"
  }
,
{ // state 330
0x80000000|304, // match move
0x80000000|777, // no-match move
0x80000000|1258, // NT-test-match state for reserved
  }
,
{ // state 331
0x80000000|377, // match move
0x80000000|264, // no-match move
// T-test match for "0":
99,
  }
,
{ // state 332
91,773, // "a"
  }
,
{ // state 333
0x80000000|444, // match move
0x80000000|207, // no-match move
0x80000000|1258, // NT-test-match state for reserved
  }
,
{ // state 334
4,1037, // token
5,1392, // `boolean
6,1186, // `class
7,1576, // `extends
8,798, // `void
9,1167, // `int
10,267, // `while
11,1537, // `if
12,316, // `else
13,440, // `for
14,165, // `break
15,280, // `this
16,1368, // `false
17,1106, // `true
18,953, // `super
19,489, // `null
20,1163, // `return
21,630, // `instanceof
22,976, // `new
23,1330, // `abstract
24,1402, // `assert
25,1567, // `byte
26,27, // `case
27,833, // `catch
28,982, // `char
29,1324, // `const
30,141, // `continue
31,115, // `default
32,1035, // `do
33,140, // `double
34,308, // `enum
35,662, // `final
36,1021, // `finally
37,1158, // `float
38,765, // `goto
39,1302, // `implements
40,768, // `import
41,1514, // `interface
42,1633, // `long
43,812, // `native
44,1233, // `package
45,245, // `private
46,339, // `protected
47,1254, // `public
48,516, // `short
49,412, // `static
50,1491, // `strictfp
51,832, // `switch
52,397, // `synchronized
53,201, // `throw
54,1108, // `throws
55,417, // `transient
56,631, // `try
57,927, // `volatile
89,966, // "c"
90,1448, // "l"
91,1274, // "a"
92,80, // "s"
95,1075, // "e"
107,1178, // "d"
108,1593, // "g"
110,545, // "p"
111,446, // "v"
113,1332, // "f"
114,494, // "i"
117,180, // "r"
120,262, // "b"
123,1266, // "n"
124,205, // "t"
125,1162, // "w"
MIN_REDUCTION+376, // (default reduction)
  }
,
{ // state 335
128,1304, // white
132,381, // eol
133,1433, // comment
134,565, // oneLineComment
135,26, // blockComment
MIN_REDUCTION+147, // (default reduction)
  }
,
{ // state 336
95,605, // "e"
  }
,
{ // state 337
MIN_REDUCTION+190, // (default reduction)
  }
,
{ // state 338
124,1249, // "t"
  }
,
{ // state 339
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 340
-1, // $$start
-1, // start
692, // white*
-1, // $$0
MIN_REDUCTION+242, // token
1392, // `boolean
1186, // `class
1576, // `extends
798, // `void
1167, // `int
267, // `while
1537, // `if
316, // `else
440, // `for
165, // `break
280, // `this
1368, // `false
1106, // `true
953, // `super
489, // `null
1163, // `return
630, // `instanceof
976, // `new
1330, // `abstract
1402, // `assert
1567, // `byte
27, // `case
833, // `catch
982, // `char
1324, // `const
141, // `continue
115, // `default
1035, // `do
140, // `double
308, // `enum
662, // `final
1021, // `finally
1158, // `float
765, // `goto
1302, // `implements
768, // `import
1514, // `interface
1633, // `long
812, // `native
1233, // `package
245, // `private
339, // `protected
1254, // `public
516, // `short
412, // `static
1491, // `strictfp
832, // `switch
397, // `synchronized
201, // `throw
1108, // `throws
417, // `transient
631, // `try
927, // `volatile
972, // `!
312, // `!=
1102, // `%
1560, // `&&
293, // `*
647, // `(
123, // `)
1355, // `{
95, // `}
413, // `-
1444, // `+
67, // `=
1322, // `==
109, // `[
551, // `]
1370, // `||
168, // `<
53, // `<=
1559, // `,
604, // `>
1435, // `>=
1247, // `.
1490, // `;
111, // `++
50, // `--
152, // `/
385, // `:
-1, // ID
161, // INT_LITERAL
485, // STRING_LITERAL
769, // CHAR_LITERAL
MIN_REDUCTION+242, // "c"
MIN_REDUCTION+242, // "l"
MIN_REDUCTION+242, // "a"
MIN_REDUCTION+242, // "s"
-1, // idChar
-1, // reserved
MIN_REDUCTION+242, // "e"
637, // "!"
1360, // "="
1616, // "+"
MIN_REDUCTION+242, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+242, // "x"
MIN_REDUCTION+242, // "X"
-1, // hex
-1, // letter
-1, // "_"
MIN_REDUCTION+242, // "d"
MIN_REDUCTION+242, // "g"
MIN_REDUCTION+242, // "m"
MIN_REDUCTION+242, // "p"
MIN_REDUCTION+242, // "v"
MIN_REDUCTION+242, // "y"
MIN_REDUCTION+242, // "f"
MIN_REDUCTION+242, // "i"
MIN_REDUCTION+242, // {"A".."W" "Y".."Z"}
MIN_REDUCTION+242, // "o"
MIN_REDUCTION+242, // "r"
MIN_REDUCTION+242, // "u"
MIN_REDUCTION+242, // {"j" "q"}
MIN_REDUCTION+242, // "b"
MIN_REDUCTION+242, // "h"
MIN_REDUCTION+242, // "k"
MIN_REDUCTION+242, // "n"
MIN_REDUCTION+242, // "t"
MIN_REDUCTION+242, // "w"
MIN_REDUCTION+242, // "z"
MIN_REDUCTION+242, // {"1".."9"}
376, // white
1602, // {12}
1602, // " "
1602, // {9}
381, // eol
1433, // comment
565, // oneLineComment
26, // blockComment
1572, // "/"
-1, // printable**
-1, // printable
1638, // "*"
-1, // blockCommentContent*
-1, // blockCommentContent
582, // "["
295, // "-"
174, // "<"
182, // "|"
-1, // {"?".."@"}
164, // "&"
1357, // ")"
155, // ","
369, // "]"
-1, // {"#".."$"}
387, // ";"
1173, // ">"
1611, // "{"
978, // "%"
1273, // "("
-1, // "\"
319, // "."
246, // ":"
984, // "}"
-1, // {"^" "`" "~"}
995, // "'"
1482, // '"'
418, // {10}
1458, // {13}
-1, // stringPrintable
-1, // recognizeEscapeChar
-1, // charPrintable
-1, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
-1, // escapeChars
-1, // token*
-1, // printable*
-1, // digit+
-1, // idChar*
-1, // letter+
MIN_REDUCTION+242, // $
-1, // $NT
  }
,
{ // state 341
0x80000000|735, // match move
0x80000000|147, // no-match move
0x80000000|1258, // NT-test-match state for reserved
  }
,
{ // state 342
91,1288, // "a"
  }
,
{ // state 343
128,1304, // white
132,381, // eol
133,1433, // comment
134,565, // oneLineComment
135,26, // blockComment
MIN_REDUCTION+202, // (default reduction)
  }
,
{ // state 344
MIN_REDUCTION+354, // (default reduction)
  }
,
{ // state 345
91,89, // "a"
  }
,
{ // state 346
95,1577, // "e"
  }
,
{ // state 347
95,90, // "e"
  }
,
{ // state 348
123,145, // "n"
  }
,
{ // state 349
121,144, // "h"
  }
,
{ // state 350
128,1304, // white
132,381, // eol
133,1433, // comment
134,565, // oneLineComment
135,26, // blockComment
MIN_REDUCTION+171, // (default reduction)
  }
,
{ // state 351
2,1153, // white*
128,1336, // white
129,674, // {12}
130,674, // " "
131,674, // {9}
132,889, // eol
133,775, // comment
134,943, // oneLineComment
135,641, // blockComment
136,1598, // "/"
164,926, // {10}
165,676, // {13}
181,MIN_REDUCTION+317, // $NT
  }
,
{ // state 352
2,297, // white*
MIN_REDUCTION+158, // (default reduction)
  }
,
{ // state 353
MIN_REDUCTION+229, // (default reduction)
  }
,
{ // state 354
89,549, // "c"
  }
,
{ // state 355
128,1304, // white
132,381, // eol
133,1433, // comment
134,565, // oneLineComment
135,26, // blockComment
MIN_REDUCTION+328, // (default reduction)
  }
,
{ // state 356
MIN_REDUCTION+125, // (default reduction)
  }
,
{ // state 357
2,270, // white*
128,1336, // white
129,674, // {12}
130,674, // " "
131,674, // {9}
132,889, // eol
133,775, // comment
134,943, // oneLineComment
135,641, // blockComment
136,1598, // "/"
164,926, // {10}
165,676, // {13}
181,MIN_REDUCTION+206, // $NT
  }
,
{ // state 358
0x80000000|621, // match move
0x80000000|1261, // no-match move
0x80000000|1258, // NT-test-match state for reserved
  }
,
{ // state 359
181,MIN_REDUCTION+321, // $NT
  }
,
{ // state 360
0x80000000|642, // match move
0x80000000|1263, // no-match move
0x80000000|1258, // NT-test-match state for reserved
  }
,
{ // state 361
0x80000000|1, // match move
0x80000000|393, // no-match move
0x80000000|36, // NT-test-match state for idChar
  }
,
{ // state 362
2,1501, // white*
MIN_REDUCTION+148, // (default reduction)
  }
,
{ // state 363
109,1036, // "m"
  }
,
{ // state 364
-1, // $$start
-1, // start
301, // white*
-1, // $$0
MIN_REDUCTION+200, // token
1392, // `boolean
1186, // `class
1576, // `extends
798, // `void
1167, // `int
267, // `while
1537, // `if
316, // `else
440, // `for
165, // `break
280, // `this
1368, // `false
1106, // `true
953, // `super
489, // `null
1163, // `return
630, // `instanceof
976, // `new
1330, // `abstract
1402, // `assert
1567, // `byte
27, // `case
833, // `catch
982, // `char
1324, // `const
141, // `continue
115, // `default
1035, // `do
140, // `double
308, // `enum
662, // `final
1021, // `finally
1158, // `float
765, // `goto
1302, // `implements
768, // `import
1514, // `interface
1633, // `long
812, // `native
1233, // `package
245, // `private
339, // `protected
1254, // `public
516, // `short
412, // `static
1491, // `strictfp
832, // `switch
397, // `synchronized
201, // `throw
1108, // `throws
417, // `transient
631, // `try
927, // `volatile
972, // `!
312, // `!=
1102, // `%
1560, // `&&
293, // `*
647, // `(
123, // `)
1355, // `{
95, // `}
413, // `-
1444, // `+
67, // `=
1322, // `==
109, // `[
551, // `]
1370, // `||
168, // `<
53, // `<=
1559, // `,
604, // `>
1435, // `>=
1247, // `.
1490, // `;
111, // `++
50, // `--
152, // `/
385, // `:
-1, // ID
161, // INT_LITERAL
485, // STRING_LITERAL
769, // CHAR_LITERAL
MIN_REDUCTION+200, // "c"
MIN_REDUCTION+200, // "l"
MIN_REDUCTION+200, // "a"
MIN_REDUCTION+200, // "s"
-1, // idChar
-1, // reserved
MIN_REDUCTION+200, // "e"
637, // "!"
1360, // "="
1616, // "+"
MIN_REDUCTION+200, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+200, // "x"
MIN_REDUCTION+200, // "X"
-1, // hex
-1, // letter
-1, // "_"
MIN_REDUCTION+200, // "d"
MIN_REDUCTION+200, // "g"
MIN_REDUCTION+200, // "m"
MIN_REDUCTION+200, // "p"
MIN_REDUCTION+200, // "v"
MIN_REDUCTION+200, // "y"
MIN_REDUCTION+200, // "f"
MIN_REDUCTION+200, // "i"
MIN_REDUCTION+200, // {"A".."W" "Y".."Z"}
MIN_REDUCTION+200, // "o"
MIN_REDUCTION+200, // "r"
MIN_REDUCTION+200, // "u"
MIN_REDUCTION+200, // {"j" "q"}
MIN_REDUCTION+200, // "b"
MIN_REDUCTION+200, // "h"
MIN_REDUCTION+200, // "k"
MIN_REDUCTION+200, // "n"
MIN_REDUCTION+200, // "t"
MIN_REDUCTION+200, // "w"
MIN_REDUCTION+200, // "z"
MIN_REDUCTION+200, // {"1".."9"}
376, // white
1602, // {12}
1602, // " "
1602, // {9}
381, // eol
1433, // comment
565, // oneLineComment
26, // blockComment
1572, // "/"
-1, // printable**
-1, // printable
1638, // "*"
-1, // blockCommentContent*
-1, // blockCommentContent
582, // "["
295, // "-"
174, // "<"
182, // "|"
-1, // {"?".."@"}
164, // "&"
1357, // ")"
155, // ","
369, // "]"
-1, // {"#".."$"}
387, // ";"
1173, // ">"
1611, // "{"
978, // "%"
1273, // "("
-1, // "\"
319, // "."
246, // ":"
984, // "}"
-1, // {"^" "`" "~"}
995, // "'"
1482, // '"'
418, // {10}
1458, // {13}
-1, // stringPrintable
-1, // recognizeEscapeChar
-1, // charPrintable
-1, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
-1, // escapeChars
-1, // token*
-1, // printable*
-1, // digit+
-1, // idChar*
-1, // letter+
MIN_REDUCTION+200, // $
-1, // $NT
  }
,
{ // state 365
181,MIN_REDUCTION+300, // $NT
  }
,
{ // state 366
124,1449, // "t"
  }
,
{ // state 367
107,790, // "d"
  }
,
{ // state 368
128,1304, // white
132,381, // eol
133,1433, // comment
134,565, // oneLineComment
135,26, // blockComment
MIN_REDUCTION+185, // (default reduction)
  }
,
{ // state 369
0x80000000|391, // match move
0x80000000|633, // no-match move
// T-test match for "0":
99,
  }
,
{ // state 370
92,88, // "s"
  }
,
{ // state 371
0x80000000|355, // match move
0x80000000|600, // no-match move
// T-test match for "0":
99,
  }
,
{ // state 372
2,1066, // white*
128,1336, // white
129,674, // {12}
130,674, // " "
131,674, // {9}
132,889, // eol
133,775, // comment
134,943, // oneLineComment
135,641, // blockComment
136,1598, // "/"
164,926, // {10}
165,676, // {13}
181,MIN_REDUCTION+233, // $NT
  }
,
{ // state 373
0x80000000|176, // match move
0x80000000|6, // no-match move
0x80000000|1258, // NT-test-match state for reserved
  }
,
{ // state 374
MIN_REDUCTION+280, // (default reduction)
  }
,
{ // state 375
92,701, // "s"
  }
,
{ // state 376
MIN_REDUCTION+362, // (default reduction)
  }
,
{ // state 377
128,1304, // white
132,381, // eol
133,1433, // comment
134,565, // oneLineComment
135,26, // blockComment
MIN_REDUCTION+159, // (default reduction)
  }
,
{ // state 378
MIN_REDUCTION+137, // (default reduction)
  }
,
{ // state 379
-1, // $$start
-1, // start
1554, // white*
-1, // $$0
MIN_REDUCTION+278, // token
1392, // `boolean
1186, // `class
1576, // `extends
798, // `void
1167, // `int
267, // `while
1537, // `if
316, // `else
440, // `for
165, // `break
280, // `this
1368, // `false
1106, // `true
953, // `super
489, // `null
1163, // `return
630, // `instanceof
976, // `new
1330, // `abstract
1402, // `assert
1567, // `byte
27, // `case
833, // `catch
982, // `char
1324, // `const
141, // `continue
115, // `default
1035, // `do
140, // `double
308, // `enum
662, // `final
1021, // `finally
1158, // `float
765, // `goto
1302, // `implements
768, // `import
1514, // `interface
1633, // `long
812, // `native
1233, // `package
245, // `private
339, // `protected
1254, // `public
516, // `short
412, // `static
1491, // `strictfp
832, // `switch
397, // `synchronized
201, // `throw
1108, // `throws
417, // `transient
631, // `try
927, // `volatile
972, // `!
312, // `!=
1102, // `%
1560, // `&&
293, // `*
647, // `(
123, // `)
1355, // `{
95, // `}
413, // `-
1444, // `+
67, // `=
1322, // `==
109, // `[
551, // `]
1370, // `||
168, // `<
53, // `<=
1559, // `,
604, // `>
1435, // `>=
1247, // `.
1490, // `;
111, // `++
50, // `--
152, // `/
385, // `:
-1, // ID
161, // INT_LITERAL
485, // STRING_LITERAL
769, // CHAR_LITERAL
MIN_REDUCTION+278, // "c"
MIN_REDUCTION+278, // "l"
MIN_REDUCTION+278, // "a"
MIN_REDUCTION+278, // "s"
-1, // idChar
-1, // reserved
MIN_REDUCTION+278, // "e"
637, // "!"
1360, // "="
1616, // "+"
MIN_REDUCTION+278, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+278, // "x"
MIN_REDUCTION+278, // "X"
-1, // hex
-1, // letter
-1, // "_"
MIN_REDUCTION+278, // "d"
MIN_REDUCTION+278, // "g"
MIN_REDUCTION+278, // "m"
MIN_REDUCTION+278, // "p"
MIN_REDUCTION+278, // "v"
MIN_REDUCTION+278, // "y"
MIN_REDUCTION+278, // "f"
MIN_REDUCTION+278, // "i"
MIN_REDUCTION+278, // {"A".."W" "Y".."Z"}
MIN_REDUCTION+278, // "o"
MIN_REDUCTION+278, // "r"
MIN_REDUCTION+278, // "u"
MIN_REDUCTION+278, // {"j" "q"}
MIN_REDUCTION+278, // "b"
MIN_REDUCTION+278, // "h"
MIN_REDUCTION+278, // "k"
MIN_REDUCTION+278, // "n"
MIN_REDUCTION+278, // "t"
MIN_REDUCTION+278, // "w"
MIN_REDUCTION+278, // "z"
MIN_REDUCTION+278, // {"1".."9"}
376, // white
1602, // {12}
1602, // " "
1602, // {9}
381, // eol
1433, // comment
565, // oneLineComment
26, // blockComment
1572, // "/"
-1, // printable**
-1, // printable
1638, // "*"
-1, // blockCommentContent*
-1, // blockCommentContent
582, // "["
295, // "-"
174, // "<"
182, // "|"
-1, // {"?".."@"}
164, // "&"
1357, // ")"
155, // ","
369, // "]"
-1, // {"#".."$"}
387, // ";"
1173, // ">"
1611, // "{"
978, // "%"
1273, // "("
-1, // "\"
319, // "."
246, // ":"
984, // "}"
-1, // {"^" "`" "~"}
995, // "'"
1482, // '"'
418, // {10}
1458, // {13}
-1, // stringPrintable
-1, // recognizeEscapeChar
-1, // charPrintable
-1, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
-1, // escapeChars
-1, // token*
-1, // printable*
-1, // digit+
-1, // idChar*
-1, // letter+
MIN_REDUCTION+278, // $
-1, // $NT
  }
,
{ // state 380
128,620, // white
129,674, // {12}
130,674, // " "
131,674, // {9}
132,889, // eol
133,775, // comment
134,943, // oneLineComment
135,641, // blockComment
136,1598, // "/"
164,926, // {10}
165,676, // {13}
181,MIN_REDUCTION+280, // $NT
  }
,
{ // state 381
MIN_REDUCTION+114, // (default reduction)
  }
,
{ // state 382
0x80000000|979, // match move
0x80000000|700, // no-match move
0x80000000|1258, // NT-test-match state for reserved
  }
,
{ // state 383
95,1369, // "e"
  }
,
{ // state 384
2,185, // white*
128,376, // white
132,381, // eol
133,1433, // comment
134,565, // oneLineComment
135,26, // blockComment
MIN_REDUCTION+138, // (default reduction)
  }
,
{ // state 385
MIN_REDUCTION+84, // (default reduction)
  }
,
{ // state 386
2,471, // white*
128,376, // white
132,381, // eol
133,1433, // comment
134,565, // oneLineComment
135,26, // blockComment
MIN_REDUCTION+142, // (default reduction)
  }
,
{ // state 387
0x80000000|887, // match move
0x80000000|358, // no-match move
// T-test match for "0":
99,
  }
,
{ // state 388
MIN_REDUCTION+352, // (default reduction)
  }
,
{ // state 389
128,620, // white
129,674, // {12}
130,674, // " "
131,674, // {9}
132,889, // eol
133,775, // comment
134,943, // oneLineComment
135,641, // blockComment
136,1598, // "/"
164,926, // {10}
165,676, // {13}
181,MIN_REDUCTION+220, // $NT
  }
,
{ // state 390
113,1071, // "f"
  }
,
{ // state 391
2,142, // white*
128,376, // white
132,381, // eol
133,1433, // comment
134,565, // oneLineComment
135,26, // blockComment
MIN_REDUCTION+162, // (default reduction)
  }
,
{ // state 392
0x80000000|1061, // match move
0x80000000|1246, // no-match move
// T-test match for "0":
99,
  }
,
{ // state 393
-1, // $$start
-1, // start
990, // white*
-1, // $$0
MIN_REDUCTION+188, // token
1392, // `boolean
1186, // `class
1576, // `extends
798, // `void
1167, // `int
267, // `while
1537, // `if
316, // `else
440, // `for
165, // `break
280, // `this
1368, // `false
1106, // `true
953, // `super
489, // `null
1163, // `return
630, // `instanceof
976, // `new
1330, // `abstract
1402, // `assert
1567, // `byte
27, // `case
833, // `catch
982, // `char
1324, // `const
141, // `continue
115, // `default
1035, // `do
140, // `double
308, // `enum
662, // `final
1021, // `finally
1158, // `float
765, // `goto
1302, // `implements
768, // `import
1514, // `interface
1633, // `long
812, // `native
1233, // `package
245, // `private
339, // `protected
1254, // `public
516, // `short
412, // `static
1491, // `strictfp
832, // `switch
397, // `synchronized
201, // `throw
1108, // `throws
417, // `transient
631, // `try
927, // `volatile
972, // `!
312, // `!=
1102, // `%
1560, // `&&
293, // `*
647, // `(
123, // `)
1355, // `{
95, // `}
413, // `-
1444, // `+
67, // `=
1322, // `==
109, // `[
551, // `]
1370, // `||
168, // `<
53, // `<=
1559, // `,
604, // `>
1435, // `>=
1247, // `.
1490, // `;
111, // `++
50, // `--
152, // `/
385, // `:
-1, // ID
161, // INT_LITERAL
485, // STRING_LITERAL
769, // CHAR_LITERAL
MIN_REDUCTION+188, // "c"
MIN_REDUCTION+188, // "l"
MIN_REDUCTION+188, // "a"
MIN_REDUCTION+188, // "s"
-1, // idChar
-1, // reserved
MIN_REDUCTION+188, // "e"
637, // "!"
1360, // "="
1616, // "+"
MIN_REDUCTION+188, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+188, // "x"
MIN_REDUCTION+188, // "X"
-1, // hex
-1, // letter
-1, // "_"
MIN_REDUCTION+188, // "d"
MIN_REDUCTION+188, // "g"
MIN_REDUCTION+188, // "m"
MIN_REDUCTION+188, // "p"
MIN_REDUCTION+188, // "v"
MIN_REDUCTION+188, // "y"
MIN_REDUCTION+188, // "f"
MIN_REDUCTION+188, // "i"
MIN_REDUCTION+188, // {"A".."W" "Y".."Z"}
MIN_REDUCTION+188, // "o"
MIN_REDUCTION+188, // "r"
MIN_REDUCTION+188, // "u"
MIN_REDUCTION+188, // {"j" "q"}
MIN_REDUCTION+188, // "b"
MIN_REDUCTION+188, // "h"
MIN_REDUCTION+188, // "k"
MIN_REDUCTION+188, // "n"
MIN_REDUCTION+188, // "t"
MIN_REDUCTION+188, // "w"
MIN_REDUCTION+188, // "z"
MIN_REDUCTION+188, // {"1".."9"}
376, // white
1602, // {12}
1602, // " "
1602, // {9}
381, // eol
1433, // comment
565, // oneLineComment
26, // blockComment
1572, // "/"
-1, // printable**
-1, // printable
1638, // "*"
-1, // blockCommentContent*
-1, // blockCommentContent
582, // "["
295, // "-"
174, // "<"
182, // "|"
-1, // {"?".."@"}
164, // "&"
1357, // ")"
155, // ","
369, // "]"
-1, // {"#".."$"}
387, // ";"
1173, // ">"
1611, // "{"
978, // "%"
1273, // "("
-1, // "\"
319, // "."
246, // ":"
984, // "}"
-1, // {"^" "`" "~"}
995, // "'"
1482, // '"'
418, // {10}
1458, // {13}
-1, // stringPrintable
-1, // recognizeEscapeChar
-1, // charPrintable
-1, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
-1, // escapeChars
-1, // token*
-1, // printable*
-1, // digit+
-1, // idChar*
-1, // letter+
MIN_REDUCTION+188, // $
-1, // $NT
  }
,
{ // state 394
0x80000000|1475, // match move
0x80000000|1601, // no-match move
// T-test match for "/":
136,
  }
,
{ // state 395
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+181, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
972, // `!
312, // `!=
1102, // `%
1560, // `&&
293, // `*
647, // `(
123, // `)
1355, // `{
95, // `}
413, // `-
1444, // `+
67, // `=
1322, // `==
109, // `[
551, // `]
1370, // `||
168, // `<
53, // `<=
1559, // `,
604, // `>
1435, // `>=
1247, // `.
1490, // `;
111, // `++
50, // `--
152, // `/
385, // `:
872, // ID
161, // INT_LITERAL
485, // STRING_LITERAL
769, // CHAR_LITERAL
513, // "c"
513, // "l"
513, // "a"
513, // "s"
-1, // idChar
-1, // reserved
513, // "e"
637, // "!"
1360, // "="
1616, // "+"
305, // "0"
566, // digit++
961, // digit
513, // "x"
513, // "X"
-1, // hex
1361, // letter
-1, // "_"
513, // "d"
513, // "g"
513, // "m"
513, // "p"
513, // "v"
513, // "y"
513, // "f"
513, // "i"
513, // {"A".."W" "Y".."Z"}
513, // "o"
513, // "r"
513, // "u"
513, // {"j" "q"}
513, // "b"
513, // "h"
513, // "k"
513, // "n"
513, // "t"
513, // "w"
513, // "z"
305, // {"1".."9"}
1304, // white
1602, // {12}
1602, // " "
1602, // {9}
381, // eol
1433, // comment
565, // oneLineComment
26, // blockComment
1572, // "/"
-1, // printable**
-1, // printable
1638, // "*"
-1, // blockCommentContent*
-1, // blockCommentContent
582, // "["
295, // "-"
174, // "<"
182, // "|"
-1, // {"?".."@"}
164, // "&"
1357, // ")"
155, // ","
369, // "]"
-1, // {"#".."$"}
387, // ";"
1173, // ">"
1611, // "{"
978, // "%"
1273, // "("
-1, // "\"
319, // "."
246, // ":"
984, // "}"
-1, // {"^" "`" "~"}
995, // "'"
1482, // '"'
418, // {10}
1458, // {13}
-1, // stringPrintable
-1, // recognizeEscapeChar
-1, // charPrintable
792, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
-1, // escapeChars
-1, // token*
-1, // printable*
466, // digit+
-1, // idChar*
883, // letter+
MIN_REDUCTION+181, // $
-1, // $NT
  }
,
{ // state 396
128,620, // white
129,674, // {12}
130,674, // " "
131,674, // {9}
132,889, // eol
133,775, // comment
134,943, // oneLineComment
135,641, // blockComment
136,1598, // "/"
164,926, // {10}
165,676, // {13}
181,MIN_REDUCTION+256, // $NT
  }
,
{ // state 397
MIN_REDUCTION+52, // (default reduction)
  }
,
{ // state 398
0x80000000|1239, // match move
0x80000000|222, // no-match move
0x80000000|1258, // NT-test-match state for reserved
  }
,
{ // state 399
124,1044, // "t"
  }
,
{ // state 400
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+289, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
972, // `!
312, // `!=
1102, // `%
1560, // `&&
293, // `*
647, // `(
123, // `)
1355, // `{
95, // `}
413, // `-
1444, // `+
67, // `=
1322, // `==
109, // `[
551, // `]
1370, // `||
168, // `<
53, // `<=
1559, // `,
604, // `>
1435, // `>=
1247, // `.
1490, // `;
111, // `++
50, // `--
152, // `/
385, // `:
872, // ID
161, // INT_LITERAL
485, // STRING_LITERAL
769, // CHAR_LITERAL
513, // "c"
513, // "l"
513, // "a"
513, // "s"
-1, // idChar
-1, // reserved
513, // "e"
637, // "!"
1360, // "="
1616, // "+"
305, // "0"
566, // digit++
961, // digit
513, // "x"
513, // "X"
-1, // hex
1361, // letter
-1, // "_"
513, // "d"
513, // "g"
513, // "m"
513, // "p"
513, // "v"
513, // "y"
513, // "f"
513, // "i"
513, // {"A".."W" "Y".."Z"}
513, // "o"
513, // "r"
513, // "u"
513, // {"j" "q"}
513, // "b"
513, // "h"
513, // "k"
513, // "n"
513, // "t"
513, // "w"
513, // "z"
305, // {"1".."9"}
1304, // white
1602, // {12}
1602, // " "
1602, // {9}
381, // eol
1433, // comment
565, // oneLineComment
26, // blockComment
1572, // "/"
-1, // printable**
-1, // printable
1638, // "*"
-1, // blockCommentContent*
-1, // blockCommentContent
582, // "["
295, // "-"
174, // "<"
182, // "|"
-1, // {"?".."@"}
164, // "&"
1357, // ")"
155, // ","
369, // "]"
-1, // {"#".."$"}
387, // ";"
1173, // ">"
1611, // "{"
978, // "%"
1273, // "("
-1, // "\"
319, // "."
246, // ":"
984, // "}"
-1, // {"^" "`" "~"}
995, // "'"
1482, // '"'
418, // {10}
1458, // {13}
-1, // stringPrintable
-1, // recognizeEscapeChar
-1, // charPrintable
792, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
-1, // escapeChars
-1, // token*
-1, // printable*
466, // digit+
-1, // idChar*
883, // letter+
MIN_REDUCTION+289, // $
-1, // $NT
  }
,
{ // state 401
0x80000000|1, // match move
0x80000000|1379, // no-match move
0x80000000|36, // NT-test-match state for idChar
  }
,
{ // state 402
MIN_REDUCTION+185, // (default reduction)
  }
,
{ // state 403
123,691, // "n"
  }
,
{ // state 404
0x80000000|1216, // match move
0x80000000|1640, // no-match move
0x80000000|410, // NT-test-match state for letter
  }
,
{ // state 405
118,326, // "u"
  }
,
{ // state 406
181,MIN_REDUCTION+312, // $NT
  }
,
{ // state 407
2,331, // white*
MIN_REDUCTION+160, // (default reduction)
  }
,
{ // state 408
0x80000000|1, // match move
0x80000000|357, // no-match move
0x80000000|36, // NT-test-match state for idChar
  }
,
{ // state 409
MIN_REDUCTION+120, // (default reduction)
  }
,
{ // state 410
89,702, // "c"
90,702, // "l"
91,702, // "a"
92,702, // "s"
95,702, // "e"
102,702, // "x"
103,702, // "X"
107,702, // "d"
108,702, // "g"
109,702, // "m"
110,702, // "p"
111,702, // "v"
112,702, // "y"
113,702, // "f"
114,702, // "i"
115,702, // {"A".."W" "Y".."Z"}
116,702, // "o"
117,702, // "r"
118,702, // "u"
119,702, // {"j" "q"}
120,702, // "b"
121,702, // "h"
122,702, // "k"
123,702, // "n"
124,702, // "t"
125,702, // "w"
126,702, // "z"
  }
,
{ // state 411
0x80000000|1183, // match move
0x80000000|1555, // no-match move
0x80000000|1258, // NT-test-match state for reserved
  }
,
{ // state 412
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 413
MIN_REDUCTION+67, // (default reduction)
  }
,
{ // state 414
-1, // $$start
-1, // start
759, // white*
-1, // $$0
MIN_REDUCTION+347, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
972, // `!
312, // `!=
1102, // `%
1560, // `&&
293, // `*
647, // `(
123, // `)
1355, // `{
95, // `}
413, // `-
1444, // `+
67, // `=
1322, // `==
109, // `[
551, // `]
1370, // `||
168, // `<
53, // `<=
1559, // `,
604, // `>
1435, // `>=
1247, // `.
1490, // `;
111, // `++
50, // `--
152, // `/
385, // `:
872, // ID
161, // INT_LITERAL
485, // STRING_LITERAL
769, // CHAR_LITERAL
513, // "c"
513, // "l"
513, // "a"
513, // "s"
-1, // idChar
-1, // reserved
513, // "e"
637, // "!"
1360, // "="
1616, // "+"
305, // "0"
566, // digit++
961, // digit
513, // "x"
513, // "X"
-1, // hex
1361, // letter
-1, // "_"
513, // "d"
513, // "g"
513, // "m"
513, // "p"
513, // "v"
513, // "y"
513, // "f"
513, // "i"
513, // {"A".."W" "Y".."Z"}
513, // "o"
513, // "r"
513, // "u"
513, // {"j" "q"}
513, // "b"
513, // "h"
513, // "k"
513, // "n"
513, // "t"
513, // "w"
513, // "z"
305, // {"1".."9"}
376, // white
1602, // {12}
1602, // " "
1602, // {9}
381, // eol
1433, // comment
565, // oneLineComment
26, // blockComment
1572, // "/"
-1, // printable**
-1, // printable
1638, // "*"
-1, // blockCommentContent*
-1, // blockCommentContent
582, // "["
295, // "-"
174, // "<"
182, // "|"
-1, // {"?".."@"}
164, // "&"
1357, // ")"
155, // ","
369, // "]"
-1, // {"#".."$"}
387, // ";"
1173, // ">"
1611, // "{"
978, // "%"
1273, // "("
-1, // "\"
319, // "."
246, // ":"
984, // "}"
-1, // {"^" "`" "~"}
995, // "'"
1482, // '"'
418, // {10}
1458, // {13}
-1, // stringPrintable
-1, // recognizeEscapeChar
-1, // charPrintable
792, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
-1, // escapeChars
-1, // token*
-1, // printable*
466, // digit+
-1, // idChar*
883, // letter+
MIN_REDUCTION+347, // $
-1, // $NT
  }
,
{ // state 415
0x80000000|283, // match move
0x80000000|1646, // no-match move
0x80000000|1258, // NT-test-match state for reserved
  }
,
{ // state 416
0x80000000|350, // match move
0x80000000|596, // no-match move
// T-test match for "0":
99,
  }
,
{ // state 417
MIN_REDUCTION+55, // (default reduction)
  }
,
{ // state 418
MIN_REDUCTION+125, // (default reduction)
  }
,
{ // state 419
132,309, // eol
164,418, // {10}
165,1458, // {13}
  }
,
{ // state 420
0x80000000|1, // match move
0x80000000|1282, // no-match move
0x80000000|36, // NT-test-match state for idChar
  }
,
{ // state 421
110,1043, // "p"
  }
,
{ // state 422
0x80000000|1154, // match move
0x80000000|827, // no-match move
0x80000000|1258, // NT-test-match state for reserved
  }
,
{ // state 423
0x80000000|407, // match move
0x80000000|973, // no-match move
0x80000000|1258, // NT-test-match state for reserved
  }
,
{ // state 424
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+283, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
972, // `!
312, // `!=
1102, // `%
1560, // `&&
293, // `*
647, // `(
123, // `)
1355, // `{
95, // `}
413, // `-
1444, // `+
67, // `=
1322, // `==
109, // `[
551, // `]
1370, // `||
168, // `<
53, // `<=
1559, // `,
604, // `>
1435, // `>=
1247, // `.
1490, // `;
111, // `++
50, // `--
152, // `/
385, // `:
872, // ID
161, // INT_LITERAL
485, // STRING_LITERAL
769, // CHAR_LITERAL
513, // "c"
513, // "l"
513, // "a"
513, // "s"
-1, // idChar
-1, // reserved
513, // "e"
637, // "!"
1360, // "="
1616, // "+"
305, // "0"
566, // digit++
961, // digit
513, // "x"
513, // "X"
-1, // hex
1361, // letter
-1, // "_"
513, // "d"
513, // "g"
513, // "m"
513, // "p"
513, // "v"
513, // "y"
513, // "f"
513, // "i"
513, // {"A".."W" "Y".."Z"}
513, // "o"
513, // "r"
513, // "u"
513, // {"j" "q"}
513, // "b"
513, // "h"
513, // "k"
513, // "n"
513, // "t"
513, // "w"
513, // "z"
305, // {"1".."9"}
1304, // white
1602, // {12}
1602, // " "
1602, // {9}
381, // eol
1433, // comment
565, // oneLineComment
26, // blockComment
1572, // "/"
-1, // printable**
-1, // printable
1638, // "*"
-1, // blockCommentContent*
-1, // blockCommentContent
582, // "["
295, // "-"
174, // "<"
182, // "|"
-1, // {"?".."@"}
164, // "&"
1357, // ")"
155, // ","
369, // "]"
-1, // {"#".."$"}
387, // ";"
1173, // ">"
1611, // "{"
978, // "%"
1273, // "("
-1, // "\"
319, // "."
246, // ":"
984, // "}"
-1, // {"^" "`" "~"}
995, // "'"
1482, // '"'
418, // {10}
1458, // {13}
-1, // stringPrintable
-1, // recognizeEscapeChar
-1, // charPrintable
792, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
-1, // escapeChars
-1, // token*
-1, // printable*
466, // digit+
-1, // idChar*
883, // letter+
MIN_REDUCTION+283, // $
-1, // $NT
  }
,
{ // state 425
121,967, // "h"
  }
,
{ // state 426
126,1060, // "z"
  }
,
{ // state 427
181,MIN_REDUCTION+285, // $NT
  }
,
{ // state 428
0x80000000|1492, // match move
0x80000000|1076, // no-match move
// T-test match for "0":
99,
  }
,
{ // state 429
128,1304, // white
132,381, // eol
133,1433, // comment
134,565, // oneLineComment
135,26, // blockComment
MIN_REDUCTION+313, // (default reduction)
  }
,
{ // state 430
0x80000000|1, // match move
0x80000000|500, // no-match move
0x80000000|410, // NT-test-match state for letter
  }
,
{ // state 431
114,959, // "i"
  }
,
{ // state 432
123,31, // "n"
  }
,
{ // state 433
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+155, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
972, // `!
312, // `!=
1102, // `%
1560, // `&&
293, // `*
647, // `(
123, // `)
1355, // `{
95, // `}
413, // `-
1444, // `+
67, // `=
1322, // `==
109, // `[
551, // `]
1370, // `||
168, // `<
53, // `<=
1559, // `,
604, // `>
1435, // `>=
1247, // `.
1490, // `;
111, // `++
50, // `--
152, // `/
385, // `:
872, // ID
161, // INT_LITERAL
485, // STRING_LITERAL
769, // CHAR_LITERAL
513, // "c"
513, // "l"
513, // "a"
513, // "s"
-1, // idChar
-1, // reserved
513, // "e"
637, // "!"
1360, // "="
1616, // "+"
305, // "0"
566, // digit++
961, // digit
513, // "x"
513, // "X"
-1, // hex
1361, // letter
-1, // "_"
513, // "d"
513, // "g"
513, // "m"
513, // "p"
513, // "v"
513, // "y"
513, // "f"
513, // "i"
513, // {"A".."W" "Y".."Z"}
513, // "o"
513, // "r"
513, // "u"
513, // {"j" "q"}
513, // "b"
513, // "h"
513, // "k"
513, // "n"
513, // "t"
513, // "w"
513, // "z"
305, // {"1".."9"}
1304, // white
1602, // {12}
1602, // " "
1602, // {9}
381, // eol
1433, // comment
565, // oneLineComment
26, // blockComment
1572, // "/"
-1, // printable**
-1, // printable
1638, // "*"
-1, // blockCommentContent*
-1, // blockCommentContent
582, // "["
295, // "-"
174, // "<"
182, // "|"
-1, // {"?".."@"}
164, // "&"
1357, // ")"
155, // ","
369, // "]"
-1, // {"#".."$"}
387, // ";"
1173, // ">"
1611, // "{"
978, // "%"
1273, // "("
-1, // "\"
319, // "."
246, // ":"
984, // "}"
-1, // {"^" "`" "~"}
995, // "'"
1482, // '"'
418, // {10}
1458, // {13}
-1, // stringPrintable
-1, // recognizeEscapeChar
-1, // charPrintable
792, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
-1, // escapeChars
-1, // token*
-1, // printable*
466, // digit+
-1, // idChar*
883, // letter+
MIN_REDUCTION+155, // $
-1, // $NT
  }
};
}
private class Initter3{
public int doInit(int startIdx) {
  for (int i = 0; i < myParseTable.length; i++) {
    parseTable[i+startIdx] = myParseTable[i];
  }
  return myParseTable.length;
}
private final int[][] myParseTable = {
{ // state 434
0x80000000|540, // match move
0x80000000|1604, // no-match move
0x80000000|1258, // NT-test-match state for reserved
  }
,
{ // state 435
124,1087, // "t"
  }
,
{ // state 436
0x80000000|1, // match move
0x80000000|1349, // no-match move
0x80000000|36, // NT-test-match state for idChar
  }
,
{ // state 437
128,1304, // white
132,381, // eol
133,1433, // comment
134,565, // oneLineComment
135,26, // blockComment
MIN_REDUCTION+149, // (default reduction)
  }
,
{ // state 438
92,1007, // "s"
  }
,
{ // state 439
0x80000000|1, // match move
0x80000000|298, // no-match move
0x80000000|36, // NT-test-match state for idChar
  }
,
{ // state 440
MIN_REDUCTION+13, // (default reduction)
  }
,
{ // state 441
-1, // $$start
-1, // start
1120, // white*
-1, // $$0
MIN_REDUCTION+209, // token
1392, // `boolean
1186, // `class
1576, // `extends
798, // `void
1167, // `int
267, // `while
1537, // `if
316, // `else
440, // `for
165, // `break
280, // `this
1368, // `false
1106, // `true
953, // `super
489, // `null
1163, // `return
630, // `instanceof
976, // `new
1330, // `abstract
1402, // `assert
1567, // `byte
27, // `case
833, // `catch
982, // `char
1324, // `const
141, // `continue
115, // `default
1035, // `do
140, // `double
308, // `enum
662, // `final
1021, // `finally
1158, // `float
765, // `goto
1302, // `implements
768, // `import
1514, // `interface
1633, // `long
812, // `native
1233, // `package
245, // `private
339, // `protected
1254, // `public
516, // `short
412, // `static
1491, // `strictfp
832, // `switch
397, // `synchronized
201, // `throw
1108, // `throws
417, // `transient
631, // `try
927, // `volatile
972, // `!
312, // `!=
1102, // `%
1560, // `&&
293, // `*
647, // `(
123, // `)
1355, // `{
95, // `}
413, // `-
1444, // `+
67, // `=
1322, // `==
109, // `[
551, // `]
1370, // `||
168, // `<
53, // `<=
1559, // `,
604, // `>
1435, // `>=
1247, // `.
1490, // `;
111, // `++
50, // `--
152, // `/
385, // `:
-1, // ID
161, // INT_LITERAL
485, // STRING_LITERAL
769, // CHAR_LITERAL
MIN_REDUCTION+209, // "c"
MIN_REDUCTION+209, // "l"
MIN_REDUCTION+209, // "a"
MIN_REDUCTION+209, // "s"
-1, // idChar
-1, // reserved
MIN_REDUCTION+209, // "e"
637, // "!"
1360, // "="
1616, // "+"
MIN_REDUCTION+209, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+209, // "x"
MIN_REDUCTION+209, // "X"
-1, // hex
-1, // letter
-1, // "_"
MIN_REDUCTION+209, // "d"
MIN_REDUCTION+209, // "g"
MIN_REDUCTION+209, // "m"
MIN_REDUCTION+209, // "p"
MIN_REDUCTION+209, // "v"
MIN_REDUCTION+209, // "y"
MIN_REDUCTION+209, // "f"
MIN_REDUCTION+209, // "i"
MIN_REDUCTION+209, // {"A".."W" "Y".."Z"}
MIN_REDUCTION+209, // "o"
MIN_REDUCTION+209, // "r"
MIN_REDUCTION+209, // "u"
MIN_REDUCTION+209, // {"j" "q"}
MIN_REDUCTION+209, // "b"
MIN_REDUCTION+209, // "h"
MIN_REDUCTION+209, // "k"
MIN_REDUCTION+209, // "n"
MIN_REDUCTION+209, // "t"
MIN_REDUCTION+209, // "w"
MIN_REDUCTION+209, // "z"
MIN_REDUCTION+209, // {"1".."9"}
376, // white
1602, // {12}
1602, // " "
1602, // {9}
381, // eol
1433, // comment
565, // oneLineComment
26, // blockComment
1572, // "/"
-1, // printable**
-1, // printable
1638, // "*"
-1, // blockCommentContent*
-1, // blockCommentContent
582, // "["
295, // "-"
174, // "<"
182, // "|"
-1, // {"?".."@"}
164, // "&"
1357, // ")"
155, // ","
369, // "]"
-1, // {"#".."$"}
387, // ";"
1173, // ">"
1611, // "{"
978, // "%"
1273, // "("
-1, // "\"
319, // "."
246, // ":"
984, // "}"
-1, // {"^" "`" "~"}
995, // "'"
1482, // '"'
418, // {10}
1458, // {13}
-1, // stringPrintable
-1, // recognizeEscapeChar
-1, // charPrintable
-1, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
-1, // escapeChars
-1, // token*
-1, // printable*
-1, // digit+
-1, // idChar*
-1, // letter+
MIN_REDUCTION+209, // $
-1, // $NT
  }
,
{ // state 442
95,804, // "e"
  }
,
{ // state 443
128,1304, // white
132,381, // eol
133,1433, // comment
134,565, // oneLineComment
135,26, // blockComment
MIN_REDUCTION+262, // (default reduction)
  }
,
{ // state 444
2,1000, // white*
MIN_REDUCTION+174, // (default reduction)
  }
,
{ // state 445
128,1304, // white
132,381, // eol
133,1433, // comment
134,565, // oneLineComment
135,26, // blockComment
MIN_REDUCTION+280, // (default reduction)
  }
,
{ // state 446
116,329, // "o"
  }
,
{ // state 447
180,MIN_REDUCTION+0, // $
  }
,
{ // state 448
MIN_REDUCTION+111, // (default reduction)
  }
,
{ // state 449
2,1152, // white*
128,1336, // white
129,674, // {12}
130,674, // " "
131,674, // {9}
132,889, // eol
133,775, // comment
134,943, // oneLineComment
135,641, // blockComment
136,1598, // "/"
164,926, // {10}
165,676, // {13}
181,MIN_REDUCTION+287, // $NT
  }
,
{ // state 450
0x80000000|274, // match move
0x80000000|462, // no-match move
// T-test match for "0":
99,
  }
,
{ // state 451
0x80000000|904, // match move
0x80000000|1359, // no-match move
// T-test match for "0":
99,
  }
,
{ // state 452
MIN_REDUCTION+274, // (default reduction)
  }
,
{ // state 453
128,1304, // white
132,381, // eol
133,1433, // comment
134,565, // oneLineComment
135,26, // blockComment
MIN_REDUCTION+155, // (default reduction)
  }
,
{ // state 454
0x80000000|1257, // match move
0x80000000|1376, // no-match move
0x80000000|1258, // NT-test-match state for reserved
  }
,
{ // state 455
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+250, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
972, // `!
312, // `!=
1102, // `%
1560, // `&&
293, // `*
647, // `(
123, // `)
1355, // `{
95, // `}
413, // `-
1444, // `+
67, // `=
1322, // `==
109, // `[
551, // `]
1370, // `||
168, // `<
53, // `<=
1559, // `,
604, // `>
1435, // `>=
1247, // `.
1490, // `;
111, // `++
50, // `--
152, // `/
385, // `:
872, // ID
161, // INT_LITERAL
485, // STRING_LITERAL
769, // CHAR_LITERAL
513, // "c"
513, // "l"
513, // "a"
513, // "s"
-1, // idChar
-1, // reserved
513, // "e"
637, // "!"
1360, // "="
1616, // "+"
305, // "0"
566, // digit++
961, // digit
513, // "x"
513, // "X"
-1, // hex
1361, // letter
-1, // "_"
513, // "d"
513, // "g"
513, // "m"
513, // "p"
513, // "v"
513, // "y"
513, // "f"
513, // "i"
513, // {"A".."W" "Y".."Z"}
513, // "o"
513, // "r"
513, // "u"
513, // {"j" "q"}
513, // "b"
513, // "h"
513, // "k"
513, // "n"
513, // "t"
513, // "w"
513, // "z"
305, // {"1".."9"}
1304, // white
1602, // {12}
1602, // " "
1602, // {9}
381, // eol
1433, // comment
565, // oneLineComment
26, // blockComment
1572, // "/"
-1, // printable**
-1, // printable
1638, // "*"
-1, // blockCommentContent*
-1, // blockCommentContent
582, // "["
295, // "-"
174, // "<"
182, // "|"
-1, // {"?".."@"}
164, // "&"
1357, // ")"
155, // ","
369, // "]"
-1, // {"#".."$"}
387, // ";"
1173, // ">"
1611, // "{"
978, // "%"
1273, // "("
-1, // "\"
319, // "."
246, // ":"
984, // "}"
-1, // {"^" "`" "~"}
995, // "'"
1482, // '"'
418, // {10}
1458, // {13}
-1, // stringPrintable
-1, // recognizeEscapeChar
-1, // charPrintable
792, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
-1, // escapeChars
-1, // token*
-1, // printable*
466, // digit+
-1, // idChar*
883, // letter+
MIN_REDUCTION+250, // $
-1, // $NT
  }
,
{ // state 456
128,1304, // white
132,381, // eol
133,1433, // comment
134,565, // oneLineComment
135,26, // blockComment
MIN_REDUCTION+337, // (default reduction)
  }
,
{ // state 457
MIN_REDUCTION+118, // (default reduction)
  }
,
{ // state 458
MIN_REDUCTION+120, // (default reduction)
  }
,
{ // state 459
-1, // $$start
-1, // start
227, // white*
-1, // $$0
MIN_REDUCTION+275, // token
1392, // `boolean
1186, // `class
1576, // `extends
798, // `void
1167, // `int
267, // `while
1537, // `if
316, // `else
440, // `for
165, // `break
280, // `this
1368, // `false
1106, // `true
953, // `super
489, // `null
1163, // `return
630, // `instanceof
976, // `new
1330, // `abstract
1402, // `assert
1567, // `byte
27, // `case
833, // `catch
982, // `char
1324, // `const
141, // `continue
115, // `default
1035, // `do
140, // `double
308, // `enum
662, // `final
1021, // `finally
1158, // `float
765, // `goto
1302, // `implements
768, // `import
1514, // `interface
1633, // `long
812, // `native
1233, // `package
245, // `private
339, // `protected
1254, // `public
516, // `short
412, // `static
1491, // `strictfp
832, // `switch
397, // `synchronized
201, // `throw
1108, // `throws
417, // `transient
631, // `try
927, // `volatile
972, // `!
312, // `!=
1102, // `%
1560, // `&&
293, // `*
647, // `(
123, // `)
1355, // `{
95, // `}
413, // `-
1444, // `+
67, // `=
1322, // `==
109, // `[
551, // `]
1370, // `||
168, // `<
53, // `<=
1559, // `,
604, // `>
1435, // `>=
1247, // `.
1490, // `;
111, // `++
50, // `--
152, // `/
385, // `:
-1, // ID
161, // INT_LITERAL
485, // STRING_LITERAL
769, // CHAR_LITERAL
MIN_REDUCTION+275, // "c"
MIN_REDUCTION+275, // "l"
MIN_REDUCTION+275, // "a"
MIN_REDUCTION+275, // "s"
-1, // idChar
-1, // reserved
MIN_REDUCTION+275, // "e"
637, // "!"
1360, // "="
1616, // "+"
MIN_REDUCTION+275, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+275, // "x"
MIN_REDUCTION+275, // "X"
-1, // hex
-1, // letter
-1, // "_"
MIN_REDUCTION+275, // "d"
MIN_REDUCTION+275, // "g"
MIN_REDUCTION+275, // "m"
MIN_REDUCTION+275, // "p"
MIN_REDUCTION+275, // "v"
MIN_REDUCTION+275, // "y"
MIN_REDUCTION+275, // "f"
MIN_REDUCTION+275, // "i"
MIN_REDUCTION+275, // {"A".."W" "Y".."Z"}
MIN_REDUCTION+275, // "o"
MIN_REDUCTION+275, // "r"
MIN_REDUCTION+275, // "u"
MIN_REDUCTION+275, // {"j" "q"}
MIN_REDUCTION+275, // "b"
MIN_REDUCTION+275, // "h"
MIN_REDUCTION+275, // "k"
MIN_REDUCTION+275, // "n"
MIN_REDUCTION+275, // "t"
MIN_REDUCTION+275, // "w"
MIN_REDUCTION+275, // "z"
MIN_REDUCTION+275, // {"1".."9"}
376, // white
1602, // {12}
1602, // " "
1602, // {9}
381, // eol
1433, // comment
565, // oneLineComment
26, // blockComment
1572, // "/"
-1, // printable**
-1, // printable
1638, // "*"
-1, // blockCommentContent*
-1, // blockCommentContent
582, // "["
295, // "-"
174, // "<"
182, // "|"
-1, // {"?".."@"}
164, // "&"
1357, // ")"
155, // ","
369, // "]"
-1, // {"#".."$"}
387, // ";"
1173, // ">"
1611, // "{"
978, // "%"
1273, // "("
-1, // "\"
319, // "."
246, // ":"
984, // "}"
-1, // {"^" "`" "~"}
995, // "'"
1482, // '"'
418, // {10}
1458, // {13}
-1, // stringPrintable
-1, // recognizeEscapeChar
-1, // charPrintable
-1, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
-1, // escapeChars
-1, // token*
-1, // printable*
-1, // digit+
-1, // idChar*
-1, // letter+
MIN_REDUCTION+275, // $
-1, // $NT
  }
,
{ // state 460
181,MIN_REDUCTION+240, // $NT
  }
,
{ // state 461
0x80000000|854, // match move
0x80000000|281, // no-match move
0x80000000|36, // NT-test-match state for idChar
  }
,
{ // state 462
0x80000000|323, // match move
0x80000000|1244, // no-match move
0x80000000|1258, // NT-test-match state for reserved
  }
,
{ // state 463
-1, // $$start
-1, // start
1625, // white*
-1, // $$0
MIN_REDUCTION+290, // token
1392, // `boolean
1186, // `class
1576, // `extends
798, // `void
1167, // `int
267, // `while
1537, // `if
316, // `else
440, // `for
165, // `break
280, // `this
1368, // `false
1106, // `true
953, // `super
489, // `null
1163, // `return
630, // `instanceof
976, // `new
1330, // `abstract
1402, // `assert
1567, // `byte
27, // `case
833, // `catch
982, // `char
1324, // `const
141, // `continue
115, // `default
1035, // `do
140, // `double
308, // `enum
662, // `final
1021, // `finally
1158, // `float
765, // `goto
1302, // `implements
768, // `import
1514, // `interface
1633, // `long
812, // `native
1233, // `package
245, // `private
339, // `protected
1254, // `public
516, // `short
412, // `static
1491, // `strictfp
832, // `switch
397, // `synchronized
201, // `throw
1108, // `throws
417, // `transient
631, // `try
927, // `volatile
972, // `!
312, // `!=
1102, // `%
1560, // `&&
293, // `*
647, // `(
123, // `)
1355, // `{
95, // `}
413, // `-
1444, // `+
67, // `=
1322, // `==
109, // `[
551, // `]
1370, // `||
168, // `<
53, // `<=
1559, // `,
604, // `>
1435, // `>=
1247, // `.
1490, // `;
111, // `++
50, // `--
152, // `/
385, // `:
-1, // ID
161, // INT_LITERAL
485, // STRING_LITERAL
769, // CHAR_LITERAL
MIN_REDUCTION+290, // "c"
MIN_REDUCTION+290, // "l"
MIN_REDUCTION+290, // "a"
MIN_REDUCTION+290, // "s"
-1, // idChar
-1, // reserved
MIN_REDUCTION+290, // "e"
637, // "!"
1360, // "="
1616, // "+"
MIN_REDUCTION+290, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+290, // "x"
MIN_REDUCTION+290, // "X"
-1, // hex
-1, // letter
-1, // "_"
MIN_REDUCTION+290, // "d"
MIN_REDUCTION+290, // "g"
MIN_REDUCTION+290, // "m"
MIN_REDUCTION+290, // "p"
MIN_REDUCTION+290, // "v"
MIN_REDUCTION+290, // "y"
MIN_REDUCTION+290, // "f"
MIN_REDUCTION+290, // "i"
MIN_REDUCTION+290, // {"A".."W" "Y".."Z"}
MIN_REDUCTION+290, // "o"
MIN_REDUCTION+290, // "r"
MIN_REDUCTION+290, // "u"
MIN_REDUCTION+290, // {"j" "q"}
MIN_REDUCTION+290, // "b"
MIN_REDUCTION+290, // "h"
MIN_REDUCTION+290, // "k"
MIN_REDUCTION+290, // "n"
MIN_REDUCTION+290, // "t"
MIN_REDUCTION+290, // "w"
MIN_REDUCTION+290, // "z"
MIN_REDUCTION+290, // {"1".."9"}
376, // white
1602, // {12}
1602, // " "
1602, // {9}
381, // eol
1433, // comment
565, // oneLineComment
26, // blockComment
1572, // "/"
-1, // printable**
-1, // printable
1638, // "*"
-1, // blockCommentContent*
-1, // blockCommentContent
582, // "["
295, // "-"
174, // "<"
182, // "|"
-1, // {"?".."@"}
164, // "&"
1357, // ")"
155, // ","
369, // "]"
-1, // {"#".."$"}
387, // ";"
1173, // ">"
1611, // "{"
978, // "%"
1273, // "("
-1, // "\"
319, // "."
246, // ":"
984, // "}"
-1, // {"^" "`" "~"}
995, // "'"
1482, // '"'
418, // {10}
1458, // {13}
-1, // stringPrintable
-1, // recognizeEscapeChar
-1, // charPrintable
-1, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
-1, // escapeChars
-1, // token*
-1, // printable*
-1, // digit+
-1, // idChar*
-1, // letter+
MIN_REDUCTION+290, // $
-1, // $NT
  }
,
{ // state 464
2,297, // white*
128,376, // white
132,381, // eol
133,1433, // comment
134,565, // oneLineComment
135,26, // blockComment
MIN_REDUCTION+158, // (default reduction)
  }
,
{ // state 465
0x80000000|1040, // match move
0x80000000|1334, // no-match move
// T-test match for "0":
99,
  }
,
{ // state 466
0x80000000|1188, // match move
0x80000000|1195, // no-match move
0x80000000|54, // NT-test-match state for digit
  }
,
{ // state 467
MIN_REDUCTION+353, // (default reduction)
  }
,
{ // state 468
117,749, // "r"
  }
,
{ // state 469
MIN_REDUCTION+159, // (default reduction)
  }
,
{ // state 470
181,MIN_REDUCTION+127, // $NT
MIN_REDUCTION+127, // (default reduction)
  }
,
{ // state 471
0x80000000|60, // match move
0x80000000|1098, // no-match move
// T-test match for "0":
99,
  }
,
{ // state 472
0x80000000|530, // match move
0x80000000|1132, // no-match move
0x80000000|410, // NT-test-match state for letter
  }
,
{ // state 473
MIN_REDUCTION+128, // (default reduction)
  }
,
{ // state 474
98,1345, // "+"
  }
,
{ // state 475
0x80000000|334, // match move
0x80000000|803, // no-match move
0x80000000|1258, // NT-test-match state for reserved
  }
,
{ // state 476
2,1175, // white*
128,1336, // white
129,674, // {12}
130,674, // " "
131,674, // {9}
132,889, // eol
133,775, // comment
134,943, // oneLineComment
135,641, // blockComment
136,1598, // "/"
164,926, // {10}
165,676, // {13}
181,MIN_REDUCTION+227, // $NT
  }
,
{ // state 477
MIN_REDUCTION+369, // (default reduction)
  }
,
{ // state 478
181,MIN_REDUCTION+219, // $NT
  }
,
{ // state 479
MIN_REDUCTION+365, // (default reduction)
  }
,
{ // state 480
-1, // $$start
-1, // start
1148, // white*
-1, // $$0
MIN_REDUCTION+140, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
972, // `!
312, // `!=
1102, // `%
1560, // `&&
293, // `*
647, // `(
123, // `)
1355, // `{
95, // `}
413, // `-
1444, // `+
67, // `=
1322, // `==
109, // `[
551, // `]
1370, // `||
168, // `<
53, // `<=
1559, // `,
604, // `>
1435, // `>=
1247, // `.
1490, // `;
111, // `++
50, // `--
152, // `/
385, // `:
872, // ID
161, // INT_LITERAL
485, // STRING_LITERAL
769, // CHAR_LITERAL
513, // "c"
513, // "l"
513, // "a"
513, // "s"
-1, // idChar
-1, // reserved
513, // "e"
637, // "!"
1360, // "="
1616, // "+"
305, // "0"
566, // digit++
961, // digit
513, // "x"
513, // "X"
-1, // hex
1361, // letter
-1, // "_"
513, // "d"
513, // "g"
513, // "m"
513, // "p"
513, // "v"
513, // "y"
513, // "f"
513, // "i"
513, // {"A".."W" "Y".."Z"}
513, // "o"
513, // "r"
513, // "u"
513, // {"j" "q"}
513, // "b"
513, // "h"
513, // "k"
513, // "n"
513, // "t"
513, // "w"
513, // "z"
305, // {"1".."9"}
376, // white
1602, // {12}
1602, // " "
1602, // {9}
381, // eol
1433, // comment
565, // oneLineComment
26, // blockComment
1572, // "/"
-1, // printable**
-1, // printable
1638, // "*"
-1, // blockCommentContent*
-1, // blockCommentContent
582, // "["
295, // "-"
174, // "<"
182, // "|"
-1, // {"?".."@"}
164, // "&"
1357, // ")"
155, // ","
369, // "]"
-1, // {"#".."$"}
387, // ";"
1173, // ">"
1611, // "{"
978, // "%"
1273, // "("
-1, // "\"
319, // "."
246, // ":"
984, // "}"
-1, // {"^" "`" "~"}
995, // "'"
1482, // '"'
418, // {10}
1458, // {13}
-1, // stringPrintable
-1, // recognizeEscapeChar
-1, // charPrintable
792, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
-1, // escapeChars
-1, // token*
-1, // printable*
466, // digit+
-1, // idChar*
883, // letter+
MIN_REDUCTION+140, // $
-1, // $NT
  }
,
{ // state 481
MIN_REDUCTION+126, // (default reduction)
  }
,
{ // state 482
128,1304, // white
132,381, // eol
133,1433, // comment
134,565, // oneLineComment
135,26, // blockComment
MIN_REDUCTION+196, // (default reduction)
  }
,
{ // state 483
0x80000000|1, // match move
0x80000000|459, // no-match move
0x80000000|36, // NT-test-match state for idChar
  }
,
{ // state 484
181,MIN_REDUCTION+225, // $NT
  }
,
{ // state 485
MIN_REDUCTION+87, // (default reduction)
  }
,
{ // state 486
181,MIN_REDUCTION+261, // $NT
  }
,
{ // state 487
118,292, // "u"
  }
,
{ // state 488
0x80000000|1, // match move
0x80000000|463, // no-match move
0x80000000|36, // NT-test-match state for idChar
  }
,
{ // state 489
MIN_REDUCTION+19, // (default reduction)
  }
,
{ // state 490
MIN_REDUCTION+145, // (default reduction)
  }
,
{ // state 491
0x80000000|1534, // match move
0x80000000|856, // no-match move
0x80000000|1258, // NT-test-match state for reserved
  }
,
{ // state 492
2,380, // white*
128,1336, // white
129,674, // {12}
130,674, // " "
131,674, // {9}
132,889, // eol
133,775, // comment
134,943, // oneLineComment
135,641, // blockComment
136,1598, // "/"
164,926, // {10}
165,676, // {13}
181,MIN_REDUCTION+281, // $NT
  }
,
{ // state 493
128,1304, // white
132,381, // eol
133,1433, // comment
134,565, // oneLineComment
135,26, // blockComment
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 494
109,135, // "m"
113,1311, // "f"
123,1046, // "n"
  }
,
{ // state 495
MIN_REDUCTION+181, // (default reduction)
  }
,
{ // state 496
MIN_REDUCTION+348, // (default reduction)
  }
,
{ // state 497
MIN_REDUCTION+119, // (default reduction)
  }
,
{ // state 498
90,796, // "l"
  }
,
{ // state 499
128,620, // white
129,674, // {12}
130,674, // " "
131,674, // {9}
132,889, // eol
133,775, // comment
134,943, // oneLineComment
135,641, // blockComment
136,1598, // "/"
164,926, // {10}
165,676, // {13}
181,MIN_REDUCTION+217, // $NT
  }
,
{ // state 500
106,MIN_REDUCTION+111, // "_"
170,MIN_REDUCTION+111, // idChar**
MIN_REDUCTION+111, // (default reduction)
  }
,
{ // state 501
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+377, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
972, // `!
312, // `!=
1102, // `%
1560, // `&&
293, // `*
647, // `(
123, // `)
1355, // `{
95, // `}
413, // `-
1444, // `+
67, // `=
1322, // `==
109, // `[
551, // `]
1370, // `||
168, // `<
53, // `<=
1559, // `,
604, // `>
1435, // `>=
1247, // `.
1490, // `;
111, // `++
50, // `--
152, // `/
385, // `:
872, // ID
161, // INT_LITERAL
485, // STRING_LITERAL
769, // CHAR_LITERAL
513, // "c"
513, // "l"
513, // "a"
513, // "s"
-1, // idChar
-1, // reserved
513, // "e"
637, // "!"
1360, // "="
1616, // "+"
305, // "0"
566, // digit++
961, // digit
513, // "x"
513, // "X"
-1, // hex
1361, // letter
-1, // "_"
513, // "d"
513, // "g"
513, // "m"
513, // "p"
513, // "v"
513, // "y"
513, // "f"
513, // "i"
513, // {"A".."W" "Y".."Z"}
513, // "o"
513, // "r"
513, // "u"
513, // {"j" "q"}
513, // "b"
513, // "h"
513, // "k"
513, // "n"
513, // "t"
513, // "w"
513, // "z"
305, // {"1".."9"}
1304, // white
1602, // {12}
1602, // " "
1602, // {9}
381, // eol
1433, // comment
565, // oneLineComment
26, // blockComment
1572, // "/"
-1, // printable**
-1, // printable
1638, // "*"
-1, // blockCommentContent*
-1, // blockCommentContent
582, // "["
295, // "-"
174, // "<"
182, // "|"
-1, // {"?".."@"}
164, // "&"
1357, // ")"
155, // ","
369, // "]"
-1, // {"#".."$"}
387, // ";"
1173, // ">"
1611, // "{"
978, // "%"
1273, // "("
-1, // "\"
319, // "."
246, // ":"
984, // "}"
-1, // {"^" "`" "~"}
995, // "'"
1482, // '"'
418, // {10}
1458, // {13}
-1, // stringPrintable
-1, // recognizeEscapeChar
-1, // charPrintable
792, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
-1, // escapeChars
-1, // token*
-1, // printable*
466, // digit+
-1, // idChar*
883, // letter+
MIN_REDUCTION+377, // $
-1, // $NT
  }
,
{ // state 502
0x80000000|1, // match move
0x80000000|1400, // no-match move
0x80000000|36, // NT-test-match state for idChar
  }
,
{ // state 503
2,1529, // white*
128,1336, // white
129,674, // {12}
130,674, // " "
131,674, // {9}
132,889, // eol
133,775, // comment
134,943, // oneLineComment
135,641, // blockComment
136,1598, // "/"
164,926, // {10}
165,676, // {13}
181,MIN_REDUCTION+251, // $NT
  }
,
{ // state 504
0x80000000|1, // match move
0x80000000|1103, // no-match move
0x80000000|36, // NT-test-match state for idChar
  }
,
{ // state 505
MIN_REDUCTION+130, // (default reduction)
  }
,
{ // state 506
89,1505, // "c"
90,1505, // "l"
91,1505, // "a"
92,1505, // "s"
93,617, // idChar
95,1505, // "e"
99,865, // "0"
101,310, // digit
102,1505, // "x"
103,1505, // "X"
105,989, // letter
106,1019, // "_"
107,1505, // "d"
108,1505, // "g"
109,1505, // "m"
110,1505, // "p"
111,1505, // "v"
112,1505, // "y"
113,1505, // "f"
114,1505, // "i"
115,1505, // {"A".."W" "Y".."Z"}
116,1505, // "o"
117,1505, // "r"
118,1505, // "u"
119,1505, // {"j" "q"}
120,1505, // "b"
121,1505, // "h"
122,1505, // "k"
123,1505, // "n"
124,1505, // "t"
125,1505, // "w"
126,1505, // "z"
127,865, // {"1".."9"}
170,1049, // idChar**
178,1157, // idChar*
  }
,
{ // state 507
0x80000000|65, // match move
0x80000000|1145, // no-match move
// T-test match for "0":
99,
  }
,
{ // state 508
92,569, // "s"
124,523, // "t"
  }
,
{ // state 509
92,682, // "s"
  }
,
{ // state 510
128,1304, // white
132,381, // eol
133,1433, // comment
134,565, // oneLineComment
135,26, // blockComment
MIN_REDUCTION+208, // (default reduction)
  }
,
{ // state 511
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+229, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
972, // `!
312, // `!=
1102, // `%
1560, // `&&
293, // `*
647, // `(
123, // `)
1355, // `{
95, // `}
413, // `-
1444, // `+
67, // `=
1322, // `==
109, // `[
551, // `]
1370, // `||
168, // `<
53, // `<=
1559, // `,
604, // `>
1435, // `>=
1247, // `.
1490, // `;
111, // `++
50, // `--
152, // `/
385, // `:
872, // ID
161, // INT_LITERAL
485, // STRING_LITERAL
769, // CHAR_LITERAL
513, // "c"
513, // "l"
513, // "a"
513, // "s"
-1, // idChar
-1, // reserved
513, // "e"
637, // "!"
1360, // "="
1616, // "+"
305, // "0"
566, // digit++
961, // digit
513, // "x"
513, // "X"
-1, // hex
1361, // letter
-1, // "_"
513, // "d"
513, // "g"
513, // "m"
513, // "p"
513, // "v"
513, // "y"
513, // "f"
513, // "i"
513, // {"A".."W" "Y".."Z"}
513, // "o"
513, // "r"
513, // "u"
513, // {"j" "q"}
513, // "b"
513, // "h"
513, // "k"
513, // "n"
513, // "t"
513, // "w"
513, // "z"
305, // {"1".."9"}
1304, // white
1602, // {12}
1602, // " "
1602, // {9}
381, // eol
1433, // comment
565, // oneLineComment
26, // blockComment
1572, // "/"
-1, // printable**
-1, // printable
1638, // "*"
-1, // blockCommentContent*
-1, // blockCommentContent
582, // "["
295, // "-"
174, // "<"
182, // "|"
-1, // {"?".."@"}
164, // "&"
1357, // ")"
155, // ","
369, // "]"
-1, // {"#".."$"}
387, // ";"
1173, // ">"
1611, // "{"
978, // "%"
1273, // "("
-1, // "\"
319, // "."
246, // ":"
984, // "}"
-1, // {"^" "`" "~"}
995, // "'"
1482, // '"'
418, // {10}
1458, // {13}
-1, // stringPrintable
-1, // recognizeEscapeChar
-1, // charPrintable
792, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
-1, // escapeChars
-1, // token*
-1, // printable*
466, // digit+
-1, // idChar*
883, // letter+
MIN_REDUCTION+229, // $
-1, // $NT
  }
,
{ // state 512
116,348, // "o"
  }
,
{ // state 513
0x80000000|916, // match move
0x80000000|430, // no-match move
0x80000000|36, // NT-test-match state for idChar
  }
,
{ // state 514
MIN_REDUCTION+4, // (default reduction)
  }
,
{ // state 515
114,133, // "i"
  }
,
{ // state 516
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 517
0x80000000|1551, // match move
0x80000000|324, // no-match move
0x80000000|824, // NT-test-match state for printable
  }
,
{ // state 518
0x80000000|847, // match move
0x80000000|627, // no-match move
0x80000000|824, // NT-test-match state for printable
  }
,
{ // state 519
128,620, // white
129,674, // {12}
130,674, // " "
131,674, // {9}
132,889, // eol
133,775, // comment
134,943, // oneLineComment
135,641, // blockComment
136,1598, // "/"
164,926, // {10}
165,676, // {13}
181,MIN_REDUCTION+337, // $NT
  }
,
{ // state 520
114,179, // "i"
  }
,
{ // state 521
MIN_REDUCTION+253, // (default reduction)
  }
,
{ // state 522
125,291, // "w"
  }
,
{ // state 523
0x80000000|1222, // match move
0x80000000|534, // no-match move
0x80000000|36, // NT-test-match state for idChar
  }
,
{ // state 524
114,882, // "i"
  }
,
{ // state 525
-1, // $$start
-1, // start
1373, // white*
-1, // $$0
MIN_REDUCTION+320, // token
1392, // `boolean
1186, // `class
1576, // `extends
798, // `void
1167, // `int
267, // `while
1537, // `if
316, // `else
440, // `for
165, // `break
280, // `this
1368, // `false
1106, // `true
953, // `super
489, // `null
1163, // `return
630, // `instanceof
976, // `new
1330, // `abstract
1402, // `assert
1567, // `byte
27, // `case
833, // `catch
982, // `char
1324, // `const
141, // `continue
115, // `default
1035, // `do
140, // `double
308, // `enum
662, // `final
1021, // `finally
1158, // `float
765, // `goto
1302, // `implements
768, // `import
1514, // `interface
1633, // `long
812, // `native
1233, // `package
245, // `private
339, // `protected
1254, // `public
516, // `short
412, // `static
1491, // `strictfp
832, // `switch
397, // `synchronized
201, // `throw
1108, // `throws
417, // `transient
631, // `try
927, // `volatile
972, // `!
312, // `!=
1102, // `%
1560, // `&&
293, // `*
647, // `(
123, // `)
1355, // `{
95, // `}
413, // `-
1444, // `+
67, // `=
1322, // `==
109, // `[
551, // `]
1370, // `||
168, // `<
53, // `<=
1559, // `,
604, // `>
1435, // `>=
1247, // `.
1490, // `;
111, // `++
50, // `--
152, // `/
385, // `:
-1, // ID
161, // INT_LITERAL
485, // STRING_LITERAL
769, // CHAR_LITERAL
MIN_REDUCTION+320, // "c"
MIN_REDUCTION+320, // "l"
MIN_REDUCTION+320, // "a"
MIN_REDUCTION+320, // "s"
-1, // idChar
-1, // reserved
MIN_REDUCTION+320, // "e"
637, // "!"
1360, // "="
1616, // "+"
MIN_REDUCTION+320, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+320, // "x"
MIN_REDUCTION+320, // "X"
-1, // hex
-1, // letter
-1, // "_"
MIN_REDUCTION+320, // "d"
MIN_REDUCTION+320, // "g"
MIN_REDUCTION+320, // "m"
MIN_REDUCTION+320, // "p"
MIN_REDUCTION+320, // "v"
MIN_REDUCTION+320, // "y"
MIN_REDUCTION+320, // "f"
MIN_REDUCTION+320, // "i"
MIN_REDUCTION+320, // {"A".."W" "Y".."Z"}
MIN_REDUCTION+320, // "o"
MIN_REDUCTION+320, // "r"
MIN_REDUCTION+320, // "u"
MIN_REDUCTION+320, // {"j" "q"}
MIN_REDUCTION+320, // "b"
MIN_REDUCTION+320, // "h"
MIN_REDUCTION+320, // "k"
MIN_REDUCTION+320, // "n"
MIN_REDUCTION+320, // "t"
MIN_REDUCTION+320, // "w"
MIN_REDUCTION+320, // "z"
MIN_REDUCTION+320, // {"1".."9"}
376, // white
1602, // {12}
1602, // " "
1602, // {9}
381, // eol
1433, // comment
565, // oneLineComment
26, // blockComment
1572, // "/"
-1, // printable**
-1, // printable
1638, // "*"
-1, // blockCommentContent*
-1, // blockCommentContent
582, // "["
295, // "-"
174, // "<"
182, // "|"
-1, // {"?".."@"}
164, // "&"
1357, // ")"
155, // ","
369, // "]"
-1, // {"#".."$"}
387, // ";"
1173, // ">"
1611, // "{"
978, // "%"
1273, // "("
-1, // "\"
319, // "."
246, // ":"
984, // "}"
-1, // {"^" "`" "~"}
995, // "'"
1482, // '"'
418, // {10}
1458, // {13}
-1, // stringPrintable
-1, // recognizeEscapeChar
-1, // charPrintable
-1, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
-1, // escapeChars
-1, // token*
-1, // printable*
-1, // digit+
-1, // idChar*
-1, // letter+
MIN_REDUCTION+320, // $
-1, // $NT
  }
,
{ // state 526
122,636, // "k"
  }
,
{ // state 527
91,1048, // "a"
  }
,
{ // state 528
111,938, // "v"
  }
,
{ // state 529
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+337, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
972, // `!
312, // `!=
1102, // `%
1560, // `&&
293, // `*
647, // `(
123, // `)
1355, // `{
95, // `}
413, // `-
1444, // `+
67, // `=
1322, // `==
109, // `[
551, // `]
1370, // `||
168, // `<
53, // `<=
1559, // `,
604, // `>
1435, // `>=
1247, // `.
1490, // `;
111, // `++
50, // `--
152, // `/
385, // `:
872, // ID
161, // INT_LITERAL
485, // STRING_LITERAL
769, // CHAR_LITERAL
513, // "c"
513, // "l"
513, // "a"
513, // "s"
-1, // idChar
-1, // reserved
513, // "e"
637, // "!"
1360, // "="
1616, // "+"
305, // "0"
566, // digit++
961, // digit
513, // "x"
513, // "X"
-1, // hex
1361, // letter
-1, // "_"
513, // "d"
513, // "g"
513, // "m"
513, // "p"
513, // "v"
513, // "y"
513, // "f"
513, // "i"
513, // {"A".."W" "Y".."Z"}
513, // "o"
513, // "r"
513, // "u"
513, // {"j" "q"}
513, // "b"
513, // "h"
513, // "k"
513, // "n"
513, // "t"
513, // "w"
513, // "z"
305, // {"1".."9"}
1304, // white
1602, // {12}
1602, // " "
1602, // {9}
381, // eol
1433, // comment
565, // oneLineComment
26, // blockComment
1572, // "/"
-1, // printable**
-1, // printable
1638, // "*"
-1, // blockCommentContent*
-1, // blockCommentContent
582, // "["
295, // "-"
174, // "<"
182, // "|"
-1, // {"?".."@"}
164, // "&"
1357, // ")"
155, // ","
369, // "]"
-1, // {"#".."$"}
387, // ";"
1173, // ">"
1611, // "{"
978, // "%"
1273, // "("
-1, // "\"
319, // "."
246, // ":"
984, // "}"
-1, // {"^" "`" "~"}
995, // "'"
1482, // '"'
418, // {10}
1458, // {13}
-1, // stringPrintable
-1, // recognizeEscapeChar
-1, // charPrintable
792, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
-1, // escapeChars
-1, // token*
-1, // printable*
466, // digit+
-1, // idChar*
883, // letter+
MIN_REDUCTION+337, // $
-1, // $NT
  }
,
{ // state 530
MIN_REDUCTION+370, // (default reduction)
  }
,
{ // state 531
0x80000000|1137, // match move
0x80000000|1384, // no-match move
// T-test match for "0":
99,
  }
,
{ // state 532
90,1016, // "l"
  }
,
{ // state 533
2,226, // white*
128,1336, // white
129,674, // {12}
130,674, // " "
131,674, // {9}
132,889, // eol
133,775, // comment
134,943, // oneLineComment
135,641, // blockComment
136,1598, // "/"
164,926, // {10}
165,676, // {13}
181,MIN_REDUCTION+314, // $NT
  }
,
{ // state 534
2,794, // white*
128,1336, // white
129,674, // {12}
130,674, // " "
131,674, // {9}
132,889, // eol
133,775, // comment
134,943, // oneLineComment
135,641, // blockComment
136,1598, // "/"
164,926, // {10}
165,676, // {13}
181,MIN_REDUCTION+197, // $NT
  }
,
{ // state 535
89,1513, // "c"
90,1513, // "l"
91,1513, // "a"
92,1513, // "s"
95,1513, // "e"
96,1513, // "!"
97,1513, // "="
98,1513, // "+"
99,1513, // "0"
102,1513, // "x"
103,1513, // "X"
106,1513, // "_"
107,1513, // "d"
108,1513, // "g"
109,1513, // "m"
110,1513, // "p"
111,1513, // "v"
112,1513, // "y"
113,1513, // "f"
114,1513, // "i"
115,1513, // {"A".."W" "Y".."Z"}
116,1513, // "o"
117,1513, // "r"
118,1513, // "u"
119,1513, // {"j" "q"}
120,1513, // "b"
121,1513, // "h"
122,1513, // "k"
123,1513, // "n"
124,1513, // "t"
125,1513, // "w"
126,1513, // "z"
127,1513, // {"1".."9"}
130,1513, // " "
131,1513, // {9}
132,237, // eol
136,1513, // "/"
139,394, // "*"
140,556, // blockCommentContent*
141,1510, // blockCommentContent
142,1513, // "["
143,1513, // "-"
144,1513, // "<"
145,1513, // "|"
146,1513, // {"?".."@"}
147,1513, // "&"
148,1513, // ")"
149,1513, // ","
150,1513, // "]"
151,1513, // {"#".."$"}
152,1513, // ";"
153,1513, // ">"
154,1513, // "{"
155,1513, // "%"
156,1513, // "("
157,1513, // "\"
158,1513, // "."
159,1513, // ":"
160,1513, // "}"
161,1513, // {"^" "`" "~"}
162,1513, // "'"
163,1513, // '"'
164,303, // {10}
165,1001, // {13}
  }
,
{ // state 536
108,1196, // "g"
  }
,
{ // state 537
181,MIN_REDUCTION+294, // $NT
  }
,
{ // state 538
MIN_REDUCTION+235, // (default reduction)
  }
,
{ // state 539
95,79, // "e"
  }
,
{ // state 540
MIN_REDUCTION+202, // (default reduction)
  }
,
{ // state 541
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+208, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
972, // `!
312, // `!=
1102, // `%
1560, // `&&
293, // `*
647, // `(
123, // `)
1355, // `{
95, // `}
413, // `-
1444, // `+
67, // `=
1322, // `==
109, // `[
551, // `]
1370, // `||
168, // `<
53, // `<=
1559, // `,
604, // `>
1435, // `>=
1247, // `.
1490, // `;
111, // `++
50, // `--
152, // `/
385, // `:
872, // ID
161, // INT_LITERAL
485, // STRING_LITERAL
769, // CHAR_LITERAL
513, // "c"
513, // "l"
513, // "a"
513, // "s"
-1, // idChar
-1, // reserved
513, // "e"
637, // "!"
1360, // "="
1616, // "+"
305, // "0"
566, // digit++
961, // digit
513, // "x"
513, // "X"
-1, // hex
1361, // letter
-1, // "_"
513, // "d"
513, // "g"
513, // "m"
513, // "p"
513, // "v"
513, // "y"
513, // "f"
513, // "i"
513, // {"A".."W" "Y".."Z"}
513, // "o"
513, // "r"
513, // "u"
513, // {"j" "q"}
513, // "b"
513, // "h"
513, // "k"
513, // "n"
513, // "t"
513, // "w"
513, // "z"
305, // {"1".."9"}
1304, // white
1602, // {12}
1602, // " "
1602, // {9}
381, // eol
1433, // comment
565, // oneLineComment
26, // blockComment
1572, // "/"
-1, // printable**
-1, // printable
1638, // "*"
-1, // blockCommentContent*
-1, // blockCommentContent
582, // "["
295, // "-"
174, // "<"
182, // "|"
-1, // {"?".."@"}
164, // "&"
1357, // ")"
155, // ","
369, // "]"
-1, // {"#".."$"}
387, // ";"
1173, // ">"
1611, // "{"
978, // "%"
1273, // "("
-1, // "\"
319, // "."
246, // ":"
984, // "}"
-1, // {"^" "`" "~"}
995, // "'"
1482, // '"'
418, // {10}
1458, // {13}
-1, // stringPrintable
-1, // recognizeEscapeChar
-1, // charPrintable
792, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
-1, // escapeChars
-1, // token*
-1, // printable*
466, // digit+
-1, // idChar*
883, // letter+
MIN_REDUCTION+208, // $
-1, // $NT
  }
,
{ // state 542
MIN_REDUCTION+153, // (default reduction)
  }
,
{ // state 543
0x80000000|880, // match move
0x80000000|1090, // no-match move
// T-test match for "0":
99,
  }
,
{ // state 544
-1, // $$start
-1, // start
328, // white*
-1, // $$0
MIN_REDUCTION+269, // token
1392, // `boolean
1186, // `class
1576, // `extends
798, // `void
1167, // `int
267, // `while
1537, // `if
316, // `else
440, // `for
165, // `break
280, // `this
1368, // `false
1106, // `true
953, // `super
489, // `null
1163, // `return
630, // `instanceof
976, // `new
1330, // `abstract
1402, // `assert
1567, // `byte
27, // `case
833, // `catch
982, // `char
1324, // `const
141, // `continue
115, // `default
1035, // `do
140, // `double
308, // `enum
662, // `final
1021, // `finally
1158, // `float
765, // `goto
1302, // `implements
768, // `import
1514, // `interface
1633, // `long
812, // `native
1233, // `package
245, // `private
339, // `protected
1254, // `public
516, // `short
412, // `static
1491, // `strictfp
832, // `switch
397, // `synchronized
201, // `throw
1108, // `throws
417, // `transient
631, // `try
927, // `volatile
972, // `!
312, // `!=
1102, // `%
1560, // `&&
293, // `*
647, // `(
123, // `)
1355, // `{
95, // `}
413, // `-
1444, // `+
67, // `=
1322, // `==
109, // `[
551, // `]
1370, // `||
168, // `<
53, // `<=
1559, // `,
604, // `>
1435, // `>=
1247, // `.
1490, // `;
111, // `++
50, // `--
152, // `/
385, // `:
-1, // ID
161, // INT_LITERAL
485, // STRING_LITERAL
769, // CHAR_LITERAL
MIN_REDUCTION+269, // "c"
MIN_REDUCTION+269, // "l"
MIN_REDUCTION+269, // "a"
MIN_REDUCTION+269, // "s"
-1, // idChar
-1, // reserved
MIN_REDUCTION+269, // "e"
637, // "!"
1360, // "="
1616, // "+"
MIN_REDUCTION+269, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+269, // "x"
MIN_REDUCTION+269, // "X"
-1, // hex
-1, // letter
-1, // "_"
MIN_REDUCTION+269, // "d"
MIN_REDUCTION+269, // "g"
MIN_REDUCTION+269, // "m"
MIN_REDUCTION+269, // "p"
MIN_REDUCTION+269, // "v"
MIN_REDUCTION+269, // "y"
MIN_REDUCTION+269, // "f"
MIN_REDUCTION+269, // "i"
MIN_REDUCTION+269, // {"A".."W" "Y".."Z"}
MIN_REDUCTION+269, // "o"
MIN_REDUCTION+269, // "r"
MIN_REDUCTION+269, // "u"
MIN_REDUCTION+269, // {"j" "q"}
MIN_REDUCTION+269, // "b"
MIN_REDUCTION+269, // "h"
MIN_REDUCTION+269, // "k"
MIN_REDUCTION+269, // "n"
MIN_REDUCTION+269, // "t"
MIN_REDUCTION+269, // "w"
MIN_REDUCTION+269, // "z"
MIN_REDUCTION+269, // {"1".."9"}
376, // white
1602, // {12}
1602, // " "
1602, // {9}
381, // eol
1433, // comment
565, // oneLineComment
26, // blockComment
1572, // "/"
-1, // printable**
-1, // printable
1638, // "*"
-1, // blockCommentContent*
-1, // blockCommentContent
582, // "["
295, // "-"
174, // "<"
182, // "|"
-1, // {"?".."@"}
164, // "&"
1357, // ")"
155, // ","
369, // "]"
-1, // {"#".."$"}
387, // ";"
1173, // ">"
1611, // "{"
978, // "%"
1273, // "("
-1, // "\"
319, // "."
246, // ":"
984, // "}"
-1, // {"^" "`" "~"}
995, // "'"
1482, // '"'
418, // {10}
1458, // {13}
-1, // stringPrintable
-1, // recognizeEscapeChar
-1, // charPrintable
-1, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
-1, // escapeChars
-1, // token*
-1, // printable*
-1, // digit+
-1, // idChar*
-1, // letter+
MIN_REDUCTION+269, // $
-1, // $NT
  }
,
{ // state 545
91,272, // "a"
117,587, // "r"
118,116, // "u"
  }
,
{ // state 546
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+185, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
972, // `!
312, // `!=
1102, // `%
1560, // `&&
293, // `*
647, // `(
123, // `)
1355, // `{
95, // `}
413, // `-
1444, // `+
67, // `=
1322, // `==
109, // `[
551, // `]
1370, // `||
168, // `<
53, // `<=
1559, // `,
604, // `>
1435, // `>=
1247, // `.
1490, // `;
111, // `++
50, // `--
152, // `/
385, // `:
872, // ID
161, // INT_LITERAL
485, // STRING_LITERAL
769, // CHAR_LITERAL
513, // "c"
513, // "l"
513, // "a"
513, // "s"
-1, // idChar
-1, // reserved
513, // "e"
637, // "!"
1360, // "="
1616, // "+"
305, // "0"
566, // digit++
961, // digit
513, // "x"
513, // "X"
-1, // hex
1361, // letter
-1, // "_"
513, // "d"
513, // "g"
513, // "m"
513, // "p"
513, // "v"
513, // "y"
513, // "f"
513, // "i"
513, // {"A".."W" "Y".."Z"}
513, // "o"
513, // "r"
513, // "u"
513, // {"j" "q"}
513, // "b"
513, // "h"
513, // "k"
513, // "n"
513, // "t"
513, // "w"
513, // "z"
305, // {"1".."9"}
1304, // white
1602, // {12}
1602, // " "
1602, // {9}
381, // eol
1433, // comment
565, // oneLineComment
26, // blockComment
1572, // "/"
-1, // printable**
-1, // printable
1638, // "*"
-1, // blockCommentContent*
-1, // blockCommentContent
582, // "["
295, // "-"
174, // "<"
182, // "|"
-1, // {"?".."@"}
164, // "&"
1357, // ")"
155, // ","
369, // "]"
-1, // {"#".."$"}
387, // ";"
1173, // ">"
1611, // "{"
978, // "%"
1273, // "("
-1, // "\"
319, // "."
246, // ":"
984, // "}"
-1, // {"^" "`" "~"}
995, // "'"
1482, // '"'
418, // {10}
1458, // {13}
-1, // stringPrintable
-1, // recognizeEscapeChar
-1, // charPrintable
792, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
-1, // escapeChars
-1, // token*
-1, // printable*
466, // digit+
-1, // idChar*
883, // letter+
MIN_REDUCTION+185, // $
-1, // $NT
  }
,
{ // state 547
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 548
124,1203, // "t"
  }
,
{ // state 549
95,1614, // "e"
  }
,
{ // state 550
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+346, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
972, // `!
312, // `!=
1102, // `%
1560, // `&&
293, // `*
647, // `(
123, // `)
1355, // `{
95, // `}
413, // `-
1444, // `+
67, // `=
1322, // `==
109, // `[
551, // `]
1370, // `||
168, // `<
53, // `<=
1559, // `,
604, // `>
1435, // `>=
1247, // `.
1490, // `;
111, // `++
50, // `--
152, // `/
385, // `:
872, // ID
161, // INT_LITERAL
485, // STRING_LITERAL
769, // CHAR_LITERAL
513, // "c"
513, // "l"
513, // "a"
513, // "s"
-1, // idChar
-1, // reserved
513, // "e"
637, // "!"
1360, // "="
1616, // "+"
305, // "0"
566, // digit++
961, // digit
513, // "x"
513, // "X"
-1, // hex
1361, // letter
-1, // "_"
513, // "d"
513, // "g"
513, // "m"
513, // "p"
513, // "v"
513, // "y"
513, // "f"
513, // "i"
513, // {"A".."W" "Y".."Z"}
513, // "o"
513, // "r"
513, // "u"
513, // {"j" "q"}
513, // "b"
513, // "h"
513, // "k"
513, // "n"
513, // "t"
513, // "w"
513, // "z"
305, // {"1".."9"}
1304, // white
1602, // {12}
1602, // " "
1602, // {9}
381, // eol
1433, // comment
565, // oneLineComment
26, // blockComment
1572, // "/"
-1, // printable**
-1, // printable
1638, // "*"
-1, // blockCommentContent*
-1, // blockCommentContent
582, // "["
295, // "-"
174, // "<"
182, // "|"
-1, // {"?".."@"}
164, // "&"
1357, // ")"
155, // ","
369, // "]"
-1, // {"#".."$"}
387, // ";"
1173, // ">"
1611, // "{"
978, // "%"
1273, // "("
-1, // "\"
319, // "."
246, // ":"
984, // "}"
-1, // {"^" "`" "~"}
995, // "'"
1482, // '"'
418, // {10}
1458, // {13}
-1, // stringPrintable
-1, // recognizeEscapeChar
-1, // charPrintable
792, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
-1, // escapeChars
-1, // token*
-1, // printable*
466, // digit+
-1, // idChar*
883, // letter+
MIN_REDUCTION+346, // $
-1, // $NT
  }
,
{ // state 551
MIN_REDUCTION+72, // (default reduction)
  }
,
{ // state 552
MIN_REDUCTION+119, // (default reduction)
  }
,
{ // state 553
2,628, // white*
MIN_REDUCTION+166, // (default reduction)
  }
,
{ // state 554
0x80000000|1207, // match move
0x80000000|590, // no-match move
// T-test match for "0":
99,
  }
,
{ // state 555
95,1081, // "e"
  }
,
{ // state 556
89,1513, // "c"
90,1513, // "l"
91,1513, // "a"
92,1513, // "s"
95,1513, // "e"
96,1513, // "!"
97,1513, // "="
98,1513, // "+"
99,1513, // "0"
102,1513, // "x"
103,1513, // "X"
106,1513, // "_"
107,1513, // "d"
108,1513, // "g"
109,1513, // "m"
110,1513, // "p"
111,1513, // "v"
112,1513, // "y"
113,1513, // "f"
114,1513, // "i"
115,1513, // {"A".."W" "Y".."Z"}
116,1513, // "o"
117,1513, // "r"
118,1513, // "u"
119,1513, // {"j" "q"}
120,1513, // "b"
121,1513, // "h"
122,1513, // "k"
123,1513, // "n"
124,1513, // "t"
125,1513, // "w"
126,1513, // "z"
127,1513, // {"1".."9"}
130,1513, // " "
131,1513, // {9}
132,237, // eol
136,1513, // "/"
139,743, // "*"
141,1627, // blockCommentContent
142,1513, // "["
143,1513, // "-"
144,1513, // "<"
145,1513, // "|"
146,1513, // {"?".."@"}
147,1513, // "&"
148,1513, // ")"
149,1513, // ","
150,1513, // "]"
151,1513, // {"#".."$"}
152,1513, // ";"
153,1513, // ">"
154,1513, // "{"
155,1513, // "%"
156,1513, // "("
157,1513, // "\"
158,1513, // "."
159,1513, // ":"
160,1513, // "}"
161,1513, // {"^" "`" "~"}
162,1513, // "'"
163,1513, // '"'
164,303, // {10}
165,1001, // {13}
  }
,
{ // state 557
124,871, // "t"
  }
,
{ // state 558
0x80000000|571, // match move
0x80000000|38, // no-match move
0x80000000|54, // NT-test-match state for digit
  }
,
{ // state 559
0x80000000|1443, // match move
0x80000000|1601, // no-match move
// T-test match for "/":
136,
  }
,
{ // state 560
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+99, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
972, // `!
312, // `!=
1102, // `%
1560, // `&&
293, // `*
647, // `(
123, // `)
1355, // `{
95, // `}
413, // `-
1444, // `+
67, // `=
1322, // `==
109, // `[
551, // `]
1370, // `||
168, // `<
53, // `<=
1559, // `,
604, // `>
1435, // `>=
1247, // `.
1490, // `;
111, // `++
50, // `--
152, // `/
385, // `:
872, // ID
161, // INT_LITERAL
485, // STRING_LITERAL
769, // CHAR_LITERAL
513, // "c"
513, // "l"
513, // "a"
513, // "s"
-1, // idChar
-1, // reserved
513, // "e"
637, // "!"
1360, // "="
1616, // "+"
305, // "0"
566, // digit++
961, // digit
513, // "x"
513, // "X"
-1, // hex
1361, // letter
-1, // "_"
513, // "d"
513, // "g"
513, // "m"
513, // "p"
513, // "v"
513, // "y"
513, // "f"
513, // "i"
513, // {"A".."W" "Y".."Z"}
513, // "o"
513, // "r"
513, // "u"
513, // {"j" "q"}
513, // "b"
513, // "h"
513, // "k"
513, // "n"
513, // "t"
513, // "w"
513, // "z"
305, // {"1".."9"}
1304, // white
1602, // {12}
1602, // " "
1602, // {9}
381, // eol
1433, // comment
565, // oneLineComment
26, // blockComment
1572, // "/"
-1, // printable**
-1, // printable
1638, // "*"
-1, // blockCommentContent*
-1, // blockCommentContent
582, // "["
295, // "-"
174, // "<"
182, // "|"
-1, // {"?".."@"}
164, // "&"
1357, // ")"
155, // ","
369, // "]"
-1, // {"#".."$"}
387, // ";"
1173, // ">"
1611, // "{"
978, // "%"
1273, // "("
-1, // "\"
319, // "."
246, // ":"
984, // "}"
-1, // {"^" "`" "~"}
995, // "'"
1482, // '"'
418, // {10}
1458, // {13}
-1, // stringPrintable
-1, // recognizeEscapeChar
-1, // charPrintable
792, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
-1, // escapeChars
-1, // token*
-1, // printable*
466, // digit+
-1, // idChar*
883, // letter+
MIN_REDUCTION+99, // $
-1, // $NT
  }
,
{ // state 561
128,620, // white
129,674, // {12}
130,674, // " "
131,674, // {9}
132,889, // eol
133,775, // comment
134,943, // oneLineComment
135,641, // blockComment
136,1598, // "/"
164,926, // {10}
165,676, // {13}
181,MIN_REDUCTION+331, // $NT
  }
,
{ // state 562
MIN_REDUCTION+361, // (default reduction)
  }
,
{ // state 563
0x80000000|974, // match move
0x80000000|625, // no-match move
0x80000000|1258, // NT-test-match state for reserved
  }
,
{ // state 564
128,1304, // white
132,381, // eol
133,1433, // comment
134,565, // oneLineComment
135,26, // blockComment
MIN_REDUCTION+247, // (default reduction)
  }
,
{ // state 565
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 566
0x80000000|1495, // match move
0x80000000|1549, // no-match move
// T-test match for "0":
99,
  }
,
{ // state 567
181,MIN_REDUCTION+228, // $NT
  }
,
{ // state 568
2,1517, // white*
128,1336, // white
129,674, // {12}
130,674, // " "
131,674, // {9}
132,889, // eol
133,775, // comment
134,943, // oneLineComment
135,641, // blockComment
136,1598, // "/"
164,926, // {10}
165,676, // {13}
181,MIN_REDUCTION+305, // $NT
  }
,
{ // state 569
124,1131, // "t"
  }
,
{ // state 570
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+92, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
972, // `!
312, // `!=
1102, // `%
1560, // `&&
293, // `*
647, // `(
123, // `)
1355, // `{
95, // `}
413, // `-
1444, // `+
67, // `=
1322, // `==
109, // `[
551, // `]
1370, // `||
168, // `<
53, // `<=
1559, // `,
604, // `>
1435, // `>=
1247, // `.
1490, // `;
111, // `++
50, // `--
152, // `/
385, // `:
872, // ID
161, // INT_LITERAL
485, // STRING_LITERAL
769, // CHAR_LITERAL
513, // "c"
513, // "l"
513, // "a"
513, // "s"
-1, // idChar
-1, // reserved
513, // "e"
637, // "!"
1360, // "="
1616, // "+"
305, // "0"
566, // digit++
961, // digit
513, // "x"
513, // "X"
-1, // hex
1361, // letter
-1, // "_"
513, // "d"
513, // "g"
513, // "m"
513, // "p"
513, // "v"
513, // "y"
513, // "f"
513, // "i"
513, // {"A".."W" "Y".."Z"}
513, // "o"
513, // "r"
513, // "u"
513, // {"j" "q"}
513, // "b"
513, // "h"
513, // "k"
513, // "n"
513, // "t"
513, // "w"
513, // "z"
305, // {"1".."9"}
1304, // white
1602, // {12}
1602, // " "
1602, // {9}
381, // eol
1433, // comment
565, // oneLineComment
26, // blockComment
1572, // "/"
-1, // printable**
-1, // printable
1638, // "*"
-1, // blockCommentContent*
-1, // blockCommentContent
582, // "["
295, // "-"
174, // "<"
182, // "|"
-1, // {"?".."@"}
164, // "&"
1357, // ")"
155, // ","
369, // "]"
-1, // {"#".."$"}
387, // ";"
1173, // ">"
1611, // "{"
978, // "%"
1273, // "("
-1, // "\"
319, // "."
246, // ":"
984, // "}"
-1, // {"^" "`" "~"}
995, // "'"
1482, // '"'
418, // {10}
1458, // {13}
-1, // stringPrintable
-1, // recognizeEscapeChar
-1, // charPrintable
792, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
-1, // escapeChars
-1, // token*
-1, // printable*
466, // digit+
-1, // idChar*
883, // letter+
MIN_REDUCTION+92, // $
-1, // $NT
  }
,
{ // state 571
MIN_REDUCTION+369, // (default reduction)
  }
,
{ // state 572
MIN_REDUCTION+151, // (default reduction)
  }
,
{ // state 573
132,497, // eol
137,1393, // printable**
164,356, // {10}
165,688, // {13}
176,225, // printable*
  }
,
{ // state 574
113,467, // "f"
117,344, // "r"
123,862, // "n"
124,388, // "t"
157,496, // "\"
162,119, // "'"
163,946, // '"'
  }
,
{ // state 575
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+238, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
972, // `!
312, // `!=
1102, // `%
1560, // `&&
293, // `*
647, // `(
123, // `)
1355, // `{
95, // `}
413, // `-
1444, // `+
67, // `=
1322, // `==
109, // `[
551, // `]
1370, // `||
168, // `<
53, // `<=
1559, // `,
604, // `>
1435, // `>=
1247, // `.
1490, // `;
111, // `++
50, // `--
152, // `/
385, // `:
872, // ID
161, // INT_LITERAL
485, // STRING_LITERAL
769, // CHAR_LITERAL
513, // "c"
513, // "l"
513, // "a"
513, // "s"
-1, // idChar
-1, // reserved
513, // "e"
637, // "!"
1360, // "="
1616, // "+"
305, // "0"
566, // digit++
961, // digit
513, // "x"
513, // "X"
-1, // hex
1361, // letter
-1, // "_"
513, // "d"
513, // "g"
513, // "m"
513, // "p"
513, // "v"
513, // "y"
513, // "f"
513, // "i"
513, // {"A".."W" "Y".."Z"}
513, // "o"
513, // "r"
513, // "u"
513, // {"j" "q"}
513, // "b"
513, // "h"
513, // "k"
513, // "n"
513, // "t"
513, // "w"
513, // "z"
305, // {"1".."9"}
1304, // white
1602, // {12}
1602, // " "
1602, // {9}
381, // eol
1433, // comment
565, // oneLineComment
26, // blockComment
1572, // "/"
-1, // printable**
-1, // printable
1638, // "*"
-1, // blockCommentContent*
-1, // blockCommentContent
582, // "["
295, // "-"
174, // "<"
182, // "|"
-1, // {"?".."@"}
164, // "&"
1357, // ")"
155, // ","
369, // "]"
-1, // {"#".."$"}
387, // ";"
1173, // ">"
1611, // "{"
978, // "%"
1273, // "("
-1, // "\"
319, // "."
246, // ":"
984, // "}"
-1, // {"^" "`" "~"}
995, // "'"
1482, // '"'
418, // {10}
1458, // {13}
-1, // stringPrintable
-1, // recognizeEscapeChar
-1, // charPrintable
792, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
-1, // escapeChars
-1, // token*
-1, // printable*
466, // digit+
-1, // idChar*
883, // letter+
MIN_REDUCTION+238, // $
-1, // $NT
  }
,
{ // state 576
95,206, // "e"
  }
,
{ // state 577
124,1128, // "t"
  }
,
{ // state 578
2,1406, // white*
128,1336, // white
129,674, // {12}
130,674, // " "
131,674, // {9}
132,889, // eol
133,775, // comment
134,943, // oneLineComment
135,641, // blockComment
136,1598, // "/"
164,926, // {10}
165,676, // {13}
181,MIN_REDUCTION+194, // $NT
  }
,
{ // state 579
MIN_REDUCTION+375, // (default reduction)
  }
,
{ // state 580
90,750, // "l"
  }
,
{ // state 581
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+171, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
972, // `!
312, // `!=
1102, // `%
1560, // `&&
293, // `*
647, // `(
123, // `)
1355, // `{
95, // `}
413, // `-
1444, // `+
67, // `=
1322, // `==
109, // `[
551, // `]
1370, // `||
168, // `<
53, // `<=
1559, // `,
604, // `>
1435, // `>=
1247, // `.
1490, // `;
111, // `++
50, // `--
152, // `/
385, // `:
872, // ID
161, // INT_LITERAL
485, // STRING_LITERAL
769, // CHAR_LITERAL
513, // "c"
513, // "l"
513, // "a"
513, // "s"
-1, // idChar
-1, // reserved
513, // "e"
637, // "!"
1360, // "="
1616, // "+"
305, // "0"
566, // digit++
961, // digit
513, // "x"
513, // "X"
-1, // hex
1361, // letter
-1, // "_"
513, // "d"
513, // "g"
513, // "m"
513, // "p"
513, // "v"
513, // "y"
513, // "f"
513, // "i"
513, // {"A".."W" "Y".."Z"}
513, // "o"
513, // "r"
513, // "u"
513, // {"j" "q"}
513, // "b"
513, // "h"
513, // "k"
513, // "n"
513, // "t"
513, // "w"
513, // "z"
305, // {"1".."9"}
1304, // white
1602, // {12}
1602, // " "
1602, // {9}
381, // eol
1433, // comment
565, // oneLineComment
26, // blockComment
1572, // "/"
-1, // printable**
-1, // printable
1638, // "*"
-1, // blockCommentContent*
-1, // blockCommentContent
582, // "["
295, // "-"
174, // "<"
182, // "|"
-1, // {"?".."@"}
164, // "&"
1357, // ")"
155, // ","
369, // "]"
-1, // {"#".."$"}
387, // ";"
1173, // ">"
1611, // "{"
978, // "%"
1273, // "("
-1, // "\"
319, // "."
246, // ":"
984, // "}"
-1, // {"^" "`" "~"}
995, // "'"
1482, // '"'
418, // {10}
1458, // {13}
-1, // stringPrintable
-1, // recognizeEscapeChar
-1, // charPrintable
792, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
-1, // escapeChars
-1, // token*
-1, // printable*
466, // digit+
-1, // idChar*
883, // letter+
MIN_REDUCTION+171, // $
-1, // $NT
  }
,
{ // state 582
0x80000000|8, // match move
0x80000000|423, // no-match move
// T-test match for "0":
99,
  }
,
{ // state 583
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+196, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
972, // `!
312, // `!=
1102, // `%
1560, // `&&
293, // `*
647, // `(
123, // `)
1355, // `{
95, // `}
413, // `-
1444, // `+
67, // `=
1322, // `==
109, // `[
551, // `]
1370, // `||
168, // `<
53, // `<=
1559, // `,
604, // `>
1435, // `>=
1247, // `.
1490, // `;
111, // `++
50, // `--
152, // `/
385, // `:
872, // ID
161, // INT_LITERAL
485, // STRING_LITERAL
769, // CHAR_LITERAL
513, // "c"
513, // "l"
513, // "a"
513, // "s"
-1, // idChar
-1, // reserved
513, // "e"
637, // "!"
1360, // "="
1616, // "+"
305, // "0"
566, // digit++
961, // digit
513, // "x"
513, // "X"
-1, // hex
1361, // letter
-1, // "_"
513, // "d"
513, // "g"
513, // "m"
513, // "p"
513, // "v"
513, // "y"
513, // "f"
513, // "i"
513, // {"A".."W" "Y".."Z"}
513, // "o"
513, // "r"
513, // "u"
513, // {"j" "q"}
513, // "b"
513, // "h"
513, // "k"
513, // "n"
513, // "t"
513, // "w"
513, // "z"
305, // {"1".."9"}
1304, // white
1602, // {12}
1602, // " "
1602, // {9}
381, // eol
1433, // comment
565, // oneLineComment
26, // blockComment
1572, // "/"
-1, // printable**
-1, // printable
1638, // "*"
-1, // blockCommentContent*
-1, // blockCommentContent
582, // "["
295, // "-"
174, // "<"
182, // "|"
-1, // {"?".."@"}
164, // "&"
1357, // ")"
155, // ","
369, // "]"
-1, // {"#".."$"}
387, // ";"
1173, // ">"
1611, // "{"
978, // "%"
1273, // "("
-1, // "\"
319, // "."
246, // ":"
984, // "}"
-1, // {"^" "`" "~"}
995, // "'"
1482, // '"'
418, // {10}
1458, // {13}
-1, // stringPrintable
-1, // recognizeEscapeChar
-1, // charPrintable
792, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
-1, // escapeChars
-1, // token*
-1, // printable*
466, // digit+
-1, // idChar*
883, // letter+
MIN_REDUCTION+196, // $
-1, // $NT
  }
,
{ // state 584
128,620, // white
129,674, // {12}
130,674, // " "
131,674, // {9}
132,889, // eol
133,775, // comment
134,943, // oneLineComment
135,641, // blockComment
136,1598, // "/"
164,926, // {10}
165,676, // {13}
181,MIN_REDUCTION+238, // $NT
  }
,
{ // state 585
0x80000000|1294, // match move
0x80000000|629, // no-match move
0x80000000|1258, // NT-test-match state for reserved
  }
,
{ // state 586
128,1304, // white
132,381, // eol
133,1433, // comment
134,565, // oneLineComment
135,26, // blockComment
MIN_REDUCTION+223, // (default reduction)
  }
,
{ // state 587
114,528, // "i"
116,934, // "o"
  }
,
{ // state 588
90,370, // "l"
102,435, // "x"
123,1541, // "n"
  }
,
{ // state 589
89,266, // "c"
  }
,
{ // state 590
0x80000000|231, // match move
0x80000000|39, // no-match move
0x80000000|1258, // NT-test-match state for reserved
  }
,
{ // state 591
128,1304, // white
132,381, // eol
133,1433, // comment
134,565, // oneLineComment
135,26, // blockComment
MIN_REDUCTION+253, // (default reduction)
  }
,
{ // state 592
2,1542, // white*
128,376, // white
132,381, // eol
133,1433, // comment
134,565, // oneLineComment
135,26, // blockComment
MIN_REDUCTION+152, // (default reduction)
  }
,
{ // state 593
0x80000000|1592, // match move
0x80000000|844, // no-match move
0x80000000|1258, // NT-test-match state for reserved
  }
,
{ // state 594
92,624, // "s"
  }
,
{ // state 595
89,1513, // "c"
90,1513, // "l"
91,1513, // "a"
92,1513, // "s"
95,1513, // "e"
96,1513, // "!"
97,1513, // "="
98,1513, // "+"
99,1513, // "0"
102,1513, // "x"
103,1513, // "X"
106,1513, // "_"
107,1513, // "d"
108,1513, // "g"
109,1513, // "m"
110,1513, // "p"
111,1513, // "v"
112,1513, // "y"
113,1513, // "f"
114,1513, // "i"
115,1513, // {"A".."W" "Y".."Z"}
116,1513, // "o"
117,1513, // "r"
118,1513, // "u"
119,1513, // {"j" "q"}
120,1513, // "b"
121,1513, // "h"
122,1513, // "k"
123,1513, // "n"
124,1513, // "t"
125,1513, // "w"
126,1513, // "z"
127,1513, // {"1".."9"}
130,1513, // " "
131,1513, // {9}
132,237, // eol
136,1513, // "/"
139,766, // "*"
141,1627, // blockCommentContent
142,1513, // "["
143,1513, // "-"
144,1513, // "<"
145,1513, // "|"
146,1513, // {"?".."@"}
147,1513, // "&"
148,1513, // ")"
149,1513, // ","
150,1513, // "]"
151,1513, // {"#".."$"}
152,1513, // ";"
153,1513, // ">"
154,1513, // "{"
155,1513, // "%"
156,1513, // "("
157,1513, // "\"
158,1513, // "."
159,1513, // ":"
160,1513, // "}"
161,1513, // {"^" "`" "~"}
162,1513, // "'"
163,1513, // '"'
164,303, // {10}
165,1001, // {13}
  }
,
{ // state 596
0x80000000|1034, // match move
0x80000000|581, // no-match move
0x80000000|1258, // NT-test-match state for reserved
  }
,
{ // state 597
0x80000000|1, // match move
0x80000000|958, // no-match move
0x80000000|410, // NT-test-match state for letter
  }
,
{ // state 598
MIN_REDUCTION+307, // (default reduction)
  }
,
{ // state 599
181,MIN_REDUCTION+327, // $NT
  }
,
{ // state 600
0x80000000|665, // match move
0x80000000|819, // no-match move
0x80000000|1258, // NT-test-match state for reserved
  }
,
{ // state 601
90,1403, // "l"
91,1010, // "a"
114,1252, // "i"
116,1548, // "o"
  }
,
{ // state 602
MIN_REDUCTION+105, // (default reduction)
  }
,
{ // state 603
90,260, // "l"
  }
,
{ // state 604
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 605
123,1002, // "n"
  }
,
{ // state 606
95,1493, // "e"
  }
,
{ // state 607
116,1150, // "o"
  }
,
{ // state 608
118,363, // "u"
  }
,
{ // state 609
0x80000000|1052, // match move
0x80000000|838, // no-match move
0x80000000|1258, // NT-test-match state for reserved
  }
,
{ // state 610
0x80000000|586, // match move
0x80000000|593, // no-match move
// T-test match for "0":
99,
  }
,
{ // state 611
109,63, // "m"
113,1024, // "f"
123,508, // "n"
  }
,
{ // state 612
-1, // $$start
-1, // start
746, // white*
-1, // $$0
MIN_REDUCTION+323, // token
1392, // `boolean
1186, // `class
1576, // `extends
798, // `void
1167, // `int
267, // `while
1537, // `if
316, // `else
440, // `for
165, // `break
280, // `this
1368, // `false
1106, // `true
953, // `super
489, // `null
1163, // `return
630, // `instanceof
976, // `new
1330, // `abstract
1402, // `assert
1567, // `byte
27, // `case
833, // `catch
982, // `char
1324, // `const
141, // `continue
115, // `default
1035, // `do
140, // `double
308, // `enum
662, // `final
1021, // `finally
1158, // `float
765, // `goto
1302, // `implements
768, // `import
1514, // `interface
1633, // `long
812, // `native
1233, // `package
245, // `private
339, // `protected
1254, // `public
516, // `short
412, // `static
1491, // `strictfp
832, // `switch
397, // `synchronized
201, // `throw
1108, // `throws
417, // `transient
631, // `try
927, // `volatile
972, // `!
312, // `!=
1102, // `%
1560, // `&&
293, // `*
647, // `(
123, // `)
1355, // `{
95, // `}
413, // `-
1444, // `+
67, // `=
1322, // `==
109, // `[
551, // `]
1370, // `||
168, // `<
53, // `<=
1559, // `,
604, // `>
1435, // `>=
1247, // `.
1490, // `;
111, // `++
50, // `--
152, // `/
385, // `:
-1, // ID
161, // INT_LITERAL
485, // STRING_LITERAL
769, // CHAR_LITERAL
MIN_REDUCTION+323, // "c"
MIN_REDUCTION+323, // "l"
MIN_REDUCTION+323, // "a"
MIN_REDUCTION+323, // "s"
-1, // idChar
-1, // reserved
MIN_REDUCTION+323, // "e"
637, // "!"
1360, // "="
1616, // "+"
MIN_REDUCTION+323, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+323, // "x"
MIN_REDUCTION+323, // "X"
-1, // hex
-1, // letter
-1, // "_"
MIN_REDUCTION+323, // "d"
MIN_REDUCTION+323, // "g"
MIN_REDUCTION+323, // "m"
MIN_REDUCTION+323, // "p"
MIN_REDUCTION+323, // "v"
MIN_REDUCTION+323, // "y"
MIN_REDUCTION+323, // "f"
MIN_REDUCTION+323, // "i"
MIN_REDUCTION+323, // {"A".."W" "Y".."Z"}
MIN_REDUCTION+323, // "o"
MIN_REDUCTION+323, // "r"
MIN_REDUCTION+323, // "u"
MIN_REDUCTION+323, // {"j" "q"}
MIN_REDUCTION+323, // "b"
MIN_REDUCTION+323, // "h"
MIN_REDUCTION+323, // "k"
MIN_REDUCTION+323, // "n"
MIN_REDUCTION+323, // "t"
MIN_REDUCTION+323, // "w"
MIN_REDUCTION+323, // "z"
MIN_REDUCTION+323, // {"1".."9"}
376, // white
1602, // {12}
1602, // " "
1602, // {9}
381, // eol
1433, // comment
565, // oneLineComment
26, // blockComment
1572, // "/"
-1, // printable**
-1, // printable
1638, // "*"
-1, // blockCommentContent*
-1, // blockCommentContent
582, // "["
295, // "-"
174, // "<"
182, // "|"
-1, // {"?".."@"}
164, // "&"
1357, // ")"
155, // ","
369, // "]"
-1, // {"#".."$"}
387, // ";"
1173, // ">"
1611, // "{"
978, // "%"
1273, // "("
-1, // "\"
319, // "."
246, // ":"
984, // "}"
-1, // {"^" "`" "~"}
995, // "'"
1482, // '"'
418, // {10}
1458, // {13}
-1, // stringPrintable
-1, // recognizeEscapeChar
-1, // charPrintable
-1, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
-1, // escapeChars
-1, // token*
-1, // printable*
-1, // digit+
-1, // idChar*
-1, // letter+
MIN_REDUCTION+323, // $
-1, // $NT
  }
,
{ // state 613
0x80000000|1, // match move
0x80000000|525, // no-match move
0x80000000|36, // NT-test-match state for idChar
  }
,
{ // state 614
164,481, // {10}
  }
,
{ // state 615
117,1275, // "r"
  }
,
{ // state 616
125,461, // "w"
  }
,
{ // state 617
0x80000000|1619, // match move
0x80000000|579, // no-match move
0x80000000|36, // NT-test-match state for idChar
  }
,
{ // state 618
91,242, // "a"
  }
,
{ // state 619
0x80000000|1, // match move
0x80000000|178, // no-match move
0x80000000|36, // NT-test-match state for idChar
  }
,
{ // state 620
181,MIN_REDUCTION+361, // $NT
MIN_REDUCTION+361, // (default reduction)
  }
,
{ // state 621
2,940, // white*
MIN_REDUCTION+180, // (default reduction)
  }
,
{ // state 622
-1, // $$start
-1, // start
428, // white*
-1, // $$0
MIN_REDUCTION+168, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
972, // `!
312, // `!=
1102, // `%
1560, // `&&
293, // `*
647, // `(
123, // `)
1355, // `{
95, // `}
413, // `-
1444, // `+
67, // `=
1322, // `==
109, // `[
551, // `]
1370, // `||
168, // `<
53, // `<=
1559, // `,
604, // `>
1435, // `>=
1247, // `.
1490, // `;
111, // `++
50, // `--
152, // `/
385, // `:
872, // ID
161, // INT_LITERAL
485, // STRING_LITERAL
769, // CHAR_LITERAL
513, // "c"
513, // "l"
513, // "a"
513, // "s"
-1, // idChar
-1, // reserved
513, // "e"
637, // "!"
1360, // "="
1616, // "+"
305, // "0"
566, // digit++
961, // digit
513, // "x"
513, // "X"
-1, // hex
1361, // letter
-1, // "_"
513, // "d"
513, // "g"
513, // "m"
513, // "p"
513, // "v"
513, // "y"
513, // "f"
513, // "i"
513, // {"A".."W" "Y".."Z"}
513, // "o"
513, // "r"
513, // "u"
513, // {"j" "q"}
513, // "b"
513, // "h"
513, // "k"
513, // "n"
513, // "t"
513, // "w"
513, // "z"
305, // {"1".."9"}
376, // white
1602, // {12}
1602, // " "
1602, // {9}
381, // eol
1433, // comment
565, // oneLineComment
26, // blockComment
1572, // "/"
-1, // printable**
-1, // printable
1638, // "*"
-1, // blockCommentContent*
-1, // blockCommentContent
582, // "["
295, // "-"
174, // "<"
182, // "|"
-1, // {"?".."@"}
164, // "&"
1357, // ")"
155, // ","
369, // "]"
-1, // {"#".."$"}
387, // ";"
1173, // ">"
1611, // "{"
978, // "%"
1273, // "("
-1, // "\"
319, // "."
246, // ":"
984, // "}"
-1, // {"^" "`" "~"}
995, // "'"
1482, // '"'
418, // {10}
1458, // {13}
-1, // stringPrintable
-1, // recognizeEscapeChar
-1, // charPrintable
792, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
-1, // escapeChars
-1, // token*
-1, // printable*
466, // digit+
-1, // idChar*
883, // letter+
MIN_REDUCTION+168, // $
-1, // $NT
  }
,
{ // state 623
0x80000000|1, // match move
0x80000000|719, // no-match move
0x80000000|36, // NT-test-match state for idChar
  }
,
{ // state 624
0x80000000|1, // match move
0x80000000|919, // no-match move
0x80000000|36, // NT-test-match state for idChar
  }
,
{ // state 625
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+298, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
972, // `!
312, // `!=
1102, // `%
1560, // `&&
293, // `*
647, // `(
123, // `)
1355, // `{
95, // `}
413, // `-
1444, // `+
67, // `=
1322, // `==
109, // `[
551, // `]
1370, // `||
168, // `<
53, // `<=
1559, // `,
604, // `>
1435, // `>=
1247, // `.
1490, // `;
111, // `++
50, // `--
152, // `/
385, // `:
872, // ID
161, // INT_LITERAL
485, // STRING_LITERAL
769, // CHAR_LITERAL
513, // "c"
513, // "l"
513, // "a"
513, // "s"
-1, // idChar
-1, // reserved
513, // "e"
637, // "!"
1360, // "="
1616, // "+"
305, // "0"
566, // digit++
961, // digit
513, // "x"
513, // "X"
-1, // hex
1361, // letter
-1, // "_"
513, // "d"
513, // "g"
513, // "m"
513, // "p"
513, // "v"
513, // "y"
513, // "f"
513, // "i"
513, // {"A".."W" "Y".."Z"}
513, // "o"
513, // "r"
513, // "u"
513, // {"j" "q"}
513, // "b"
513, // "h"
513, // "k"
513, // "n"
513, // "t"
513, // "w"
513, // "z"
305, // {"1".."9"}
1304, // white
1602, // {12}
1602, // " "
1602, // {9}
381, // eol
1433, // comment
565, // oneLineComment
26, // blockComment
1572, // "/"
-1, // printable**
-1, // printable
1638, // "*"
-1, // blockCommentContent*
-1, // blockCommentContent
582, // "["
295, // "-"
174, // "<"
182, // "|"
-1, // {"?".."@"}
164, // "&"
1357, // ")"
155, // ","
369, // "]"
-1, // {"#".."$"}
387, // ";"
1173, // ">"
1611, // "{"
978, // "%"
1273, // "("
-1, // "\"
319, // "."
246, // ":"
984, // "}"
-1, // {"^" "`" "~"}
995, // "'"
1482, // '"'
418, // {10}
1458, // {13}
-1, // stringPrintable
-1, // recognizeEscapeChar
-1, // charPrintable
792, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
-1, // escapeChars
-1, // token*
-1, // printable*
466, // digit+
-1, // idChar*
883, // letter+
MIN_REDUCTION+298, // $
-1, // $NT
  }
};
}
private class Initter4{
public int doInit(int startIdx) {
  for (int i = 0; i < myParseTable.length; i++) {
    parseTable[i+startIdx] = myParseTable[i];
  }
  return myParseTable.length;
}
private final int[][] myParseTable = {
{ // state 626
-1, // $$start
-1, // start
3, // white*
-1, // $$0
MIN_REDUCTION+251, // token
1392, // `boolean
1186, // `class
1576, // `extends
798, // `void
1167, // `int
267, // `while
1537, // `if
316, // `else
440, // `for
165, // `break
280, // `this
1368, // `false
1106, // `true
953, // `super
489, // `null
1163, // `return
630, // `instanceof
976, // `new
1330, // `abstract
1402, // `assert
1567, // `byte
27, // `case
833, // `catch
982, // `char
1324, // `const
141, // `continue
115, // `default
1035, // `do
140, // `double
308, // `enum
662, // `final
1021, // `finally
1158, // `float
765, // `goto
1302, // `implements
768, // `import
1514, // `interface
1633, // `long
812, // `native
1233, // `package
245, // `private
339, // `protected
1254, // `public
516, // `short
412, // `static
1491, // `strictfp
832, // `switch
397, // `synchronized
201, // `throw
1108, // `throws
417, // `transient
631, // `try
927, // `volatile
972, // `!
312, // `!=
1102, // `%
1560, // `&&
293, // `*
647, // `(
123, // `)
1355, // `{
95, // `}
413, // `-
1444, // `+
67, // `=
1322, // `==
109, // `[
551, // `]
1370, // `||
168, // `<
53, // `<=
1559, // `,
604, // `>
1435, // `>=
1247, // `.
1490, // `;
111, // `++
50, // `--
152, // `/
385, // `:
-1, // ID
161, // INT_LITERAL
485, // STRING_LITERAL
769, // CHAR_LITERAL
MIN_REDUCTION+251, // "c"
MIN_REDUCTION+251, // "l"
MIN_REDUCTION+251, // "a"
MIN_REDUCTION+251, // "s"
-1, // idChar
-1, // reserved
MIN_REDUCTION+251, // "e"
637, // "!"
1360, // "="
1616, // "+"
MIN_REDUCTION+251, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+251, // "x"
MIN_REDUCTION+251, // "X"
-1, // hex
-1, // letter
-1, // "_"
MIN_REDUCTION+251, // "d"
MIN_REDUCTION+251, // "g"
MIN_REDUCTION+251, // "m"
MIN_REDUCTION+251, // "p"
MIN_REDUCTION+251, // "v"
MIN_REDUCTION+251, // "y"
MIN_REDUCTION+251, // "f"
MIN_REDUCTION+251, // "i"
MIN_REDUCTION+251, // {"A".."W" "Y".."Z"}
MIN_REDUCTION+251, // "o"
MIN_REDUCTION+251, // "r"
MIN_REDUCTION+251, // "u"
MIN_REDUCTION+251, // {"j" "q"}
MIN_REDUCTION+251, // "b"
MIN_REDUCTION+251, // "h"
MIN_REDUCTION+251, // "k"
MIN_REDUCTION+251, // "n"
MIN_REDUCTION+251, // "t"
MIN_REDUCTION+251, // "w"
MIN_REDUCTION+251, // "z"
MIN_REDUCTION+251, // {"1".."9"}
376, // white
1602, // {12}
1602, // " "
1602, // {9}
381, // eol
1433, // comment
565, // oneLineComment
26, // blockComment
1572, // "/"
-1, // printable**
-1, // printable
1638, // "*"
-1, // blockCommentContent*
-1, // blockCommentContent
582, // "["
295, // "-"
174, // "<"
182, // "|"
-1, // {"?".."@"}
164, // "&"
1357, // ")"
155, // ","
369, // "]"
-1, // {"#".."$"}
387, // ";"
1173, // ">"
1611, // "{"
978, // "%"
1273, // "("
-1, // "\"
319, // "."
246, // ":"
984, // "}"
-1, // {"^" "`" "~"}
995, // "'"
1482, // '"'
418, // {10}
1458, // {13}
-1, // stringPrintable
-1, // recognizeEscapeChar
-1, // charPrintable
-1, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
-1, // escapeChars
-1, // token*
-1, // printable*
-1, // digit+
-1, // idChar*
-1, // letter+
MIN_REDUCTION+251, // $
-1, // $NT
  }
,
{ // state 627
MIN_REDUCTION+372, // (default reduction)
  }
,
{ // state 628
0x80000000|1096, // match move
0x80000000|802, // no-match move
// T-test match for "0":
99,
  }
,
{ // state 629
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+161, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
972, // `!
312, // `!=
1102, // `%
1560, // `&&
293, // `*
647, // `(
123, // `)
1355, // `{
95, // `}
413, // `-
1444, // `+
67, // `=
1322, // `==
109, // `[
551, // `]
1370, // `||
168, // `<
53, // `<=
1559, // `,
604, // `>
1435, // `>=
1247, // `.
1490, // `;
111, // `++
50, // `--
152, // `/
385, // `:
872, // ID
161, // INT_LITERAL
485, // STRING_LITERAL
769, // CHAR_LITERAL
513, // "c"
513, // "l"
513, // "a"
513, // "s"
-1, // idChar
-1, // reserved
513, // "e"
637, // "!"
1360, // "="
1616, // "+"
305, // "0"
566, // digit++
961, // digit
513, // "x"
513, // "X"
-1, // hex
1361, // letter
-1, // "_"
513, // "d"
513, // "g"
513, // "m"
513, // "p"
513, // "v"
513, // "y"
513, // "f"
513, // "i"
513, // {"A".."W" "Y".."Z"}
513, // "o"
513, // "r"
513, // "u"
513, // {"j" "q"}
513, // "b"
513, // "h"
513, // "k"
513, // "n"
513, // "t"
513, // "w"
513, // "z"
305, // {"1".."9"}
1304, // white
1602, // {12}
1602, // " "
1602, // {9}
381, // eol
1433, // comment
565, // oneLineComment
26, // blockComment
1572, // "/"
-1, // printable**
-1, // printable
1638, // "*"
-1, // blockCommentContent*
-1, // blockCommentContent
582, // "["
295, // "-"
174, // "<"
182, // "|"
-1, // {"?".."@"}
164, // "&"
1357, // ")"
155, // ","
369, // "]"
-1, // {"#".."$"}
387, // ";"
1173, // ">"
1611, // "{"
978, // "%"
1273, // "("
-1, // "\"
319, // "."
246, // ":"
984, // "}"
-1, // {"^" "`" "~"}
995, // "'"
1482, // '"'
418, // {10}
1458, // {13}
-1, // stringPrintable
-1, // recognizeEscapeChar
-1, // charPrintable
792, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
-1, // escapeChars
-1, // token*
-1, // printable*
466, // digit+
-1, // idChar*
883, // letter+
MIN_REDUCTION+161, // $
-1, // $NT
  }
,
{ // state 630
MIN_REDUCTION+21, // (default reduction)
  }
,
{ // state 631
MIN_REDUCTION+56, // (default reduction)
  }
,
{ // state 632
181,MIN_REDUCTION+231, // $NT
  }
,
{ // state 633
0x80000000|1025, // match move
0x80000000|957, // no-match move
0x80000000|1258, // NT-test-match state for reserved
  }
,
{ // state 634
114,869, // "i"
  }
,
{ // state 635
128,620, // white
129,674, // {12}
130,674, // " "
131,674, // {9}
132,889, // eol
133,775, // comment
134,943, // oneLineComment
135,641, // blockComment
136,1598, // "/"
164,926, // {10}
165,676, // {13}
181,MIN_REDUCTION+277, // $NT
  }
,
{ // state 636
0x80000000|1, // match move
0x80000000|1486, // no-match move
0x80000000|36, // NT-test-match state for idChar
  }
,
{ // state 637
0x80000000|707, // match move
0x80000000|1083, // no-match move
// T-test match for "=":
97,
  }
,
{ // state 638
0x80000000|1, // match move
0x80000000|129, // no-match move
0x80000000|36, // NT-test-match state for idChar
  }
,
{ // state 639
92,1164, // "s"
  }
,
{ // state 640
124,487, // "t"
  }
,
{ // state 641
181,MIN_REDUCTION+117, // $NT
MIN_REDUCTION+117, // (default reduction)
  }
,
{ // state 642
MIN_REDUCTION+179, // (default reduction)
  }
,
{ // state 643
0x80000000|236, // match move
0x80000000|10, // no-match move
0x80000000|1258, // NT-test-match state for reserved
  }
,
{ // state 644
181,MIN_REDUCTION+201, // $NT
  }
,
{ // state 645
0x80000000|1177, // match move
0x80000000|808, // no-match move
0x80000000|1258, // NT-test-match state for reserved
  }
,
{ // state 646
0x80000000|1, // match move
0x80000000|748, // no-match move
0x80000000|36, // NT-test-match state for idChar
  }
,
{ // state 647
MIN_REDUCTION+63, // (default reduction)
  }
,
{ // state 648
MIN_REDUCTION+183, // (default reduction)
  }
,
{ // state 649
181,MIN_REDUCTION+204, // $NT
  }
,
{ // state 650
91,1581, // "a"
117,734, // "r"
118,183, // "u"
  }
,
{ // state 651
116,1127, // "o"
  }
,
{ // state 652
MIN_REDUCTION+247, // (default reduction)
  }
,
{ // state 653
95,1032, // "e"
  }
,
{ // state 654
-1, // $$start
-1, // start
185, // white*
-1, // $$0
MIN_REDUCTION+138, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
972, // `!
312, // `!=
1102, // `%
1560, // `&&
293, // `*
647, // `(
123, // `)
1355, // `{
95, // `}
413, // `-
1444, // `+
-1, // `=
-1, // `==
109, // `[
551, // `]
1370, // `||
168, // `<
53, // `<=
1559, // `,
604, // `>
1435, // `>=
1247, // `.
1490, // `;
111, // `++
50, // `--
152, // `/
385, // `:
872, // ID
161, // INT_LITERAL
485, // STRING_LITERAL
769, // CHAR_LITERAL
513, // "c"
513, // "l"
513, // "a"
513, // "s"
-1, // idChar
-1, // reserved
513, // "e"
637, // "!"
MIN_REDUCTION+138, // "="
1616, // "+"
305, // "0"
566, // digit++
961, // digit
513, // "x"
513, // "X"
-1, // hex
1361, // letter
-1, // "_"
513, // "d"
513, // "g"
513, // "m"
513, // "p"
513, // "v"
513, // "y"
513, // "f"
513, // "i"
513, // {"A".."W" "Y".."Z"}
513, // "o"
513, // "r"
513, // "u"
513, // {"j" "q"}
513, // "b"
513, // "h"
513, // "k"
513, // "n"
513, // "t"
513, // "w"
513, // "z"
305, // {"1".."9"}
376, // white
1602, // {12}
1602, // " "
1602, // {9}
381, // eol
1433, // comment
565, // oneLineComment
26, // blockComment
1572, // "/"
-1, // printable**
-1, // printable
1638, // "*"
-1, // blockCommentContent*
-1, // blockCommentContent
582, // "["
295, // "-"
174, // "<"
182, // "|"
-1, // {"?".."@"}
164, // "&"
1357, // ")"
155, // ","
369, // "]"
-1, // {"#".."$"}
387, // ";"
1173, // ">"
1611, // "{"
978, // "%"
1273, // "("
-1, // "\"
319, // "."
246, // ":"
984, // "}"
-1, // {"^" "`" "~"}
995, // "'"
1482, // '"'
418, // {10}
1458, // {13}
-1, // stringPrintable
-1, // recognizeEscapeChar
-1, // charPrintable
792, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
-1, // escapeChars
-1, // token*
-1, // printable*
466, // digit+
-1, // idChar*
883, // letter+
MIN_REDUCTION+138, // $
-1, // $NT
  }
,
{ // state 655
MIN_REDUCTION+368, // (default reduction)
  }
,
{ // state 656
0x80000000|49, // match move
0x80000000|196, // no-match move
0x80000000|1258, // NT-test-match state for reserved
  }
,
{ // state 657
MIN_REDUCTION+362, // (default reduction)
  }
,
{ // state 658
128,1304, // white
132,381, // eol
133,1433, // comment
134,565, // oneLineComment
135,26, // blockComment
MIN_REDUCTION+177, // (default reduction)
  }
,
{ // state 659
MIN_REDUCTION+121, // (default reduction)
  }
,
{ // state 660
0x80000000|1, // match move
0x80000000|1353, // no-match move
0x80000000|36, // NT-test-match state for idChar
  }
,
{ // state 661
124,420, // "t"
  }
,
{ // state 662
MIN_REDUCTION+35, // (default reduction)
  }
,
{ // state 663
2,737, // white*
128,1336, // white
129,674, // {12}
130,674, // " "
131,674, // {9}
132,889, // eol
133,775, // comment
134,943, // oneLineComment
135,641, // blockComment
136,1598, // "/"
164,926, // {10}
165,676, // {13}
181,MIN_REDUCTION+299, // $NT
  }
,
{ // state 664
95,228, // "e"
  }
,
{ // state 665
MIN_REDUCTION+328, // (default reduction)
  }
,
{ // state 666
MIN_REDUCTION+357, // (default reduction)
  }
,
{ // state 667
181,MIN_REDUCTION+324, // $NT
  }
,
{ // state 668
2,888, // white*
128,376, // white
132,381, // eol
133,1433, // comment
134,565, // oneLineComment
135,26, // blockComment
MIN_REDUCTION+176, // (default reduction)
  }
,
{ // state 669
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+304, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
972, // `!
312, // `!=
1102, // `%
1560, // `&&
293, // `*
647, // `(
123, // `)
1355, // `{
95, // `}
413, // `-
1444, // `+
67, // `=
1322, // `==
109, // `[
551, // `]
1370, // `||
168, // `<
53, // `<=
1559, // `,
604, // `>
1435, // `>=
1247, // `.
1490, // `;
111, // `++
50, // `--
152, // `/
385, // `:
872, // ID
161, // INT_LITERAL
485, // STRING_LITERAL
769, // CHAR_LITERAL
513, // "c"
513, // "l"
513, // "a"
513, // "s"
-1, // idChar
-1, // reserved
513, // "e"
637, // "!"
1360, // "="
1616, // "+"
305, // "0"
566, // digit++
961, // digit
513, // "x"
513, // "X"
-1, // hex
1361, // letter
-1, // "_"
513, // "d"
513, // "g"
513, // "m"
513, // "p"
513, // "v"
513, // "y"
513, // "f"
513, // "i"
513, // {"A".."W" "Y".."Z"}
513, // "o"
513, // "r"
513, // "u"
513, // {"j" "q"}
513, // "b"
513, // "h"
513, // "k"
513, // "n"
513, // "t"
513, // "w"
513, // "z"
305, // {"1".."9"}
1304, // white
1602, // {12}
1602, // " "
1602, // {9}
381, // eol
1433, // comment
565, // oneLineComment
26, // blockComment
1572, // "/"
-1, // printable**
-1, // printable
1638, // "*"
-1, // blockCommentContent*
-1, // blockCommentContent
582, // "["
295, // "-"
174, // "<"
182, // "|"
-1, // {"?".."@"}
164, // "&"
1357, // ")"
155, // ","
369, // "]"
-1, // {"#".."$"}
387, // ";"
1173, // ">"
1611, // "{"
978, // "%"
1273, // "("
-1, // "\"
319, // "."
246, // ":"
984, // "}"
-1, // {"^" "`" "~"}
995, // "'"
1482, // '"'
418, // {10}
1458, // {13}
-1, // stringPrintable
-1, // recognizeEscapeChar
-1, // charPrintable
792, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
-1, // escapeChars
-1, // token*
-1, // printable*
466, // digit+
-1, // idChar*
883, // letter+
MIN_REDUCTION+304, // $
-1, // $NT
  }
,
{ // state 670
114,1223, // "i"
  }
,
{ // state 671
128,1304, // white
132,381, // eol
133,1433, // comment
134,565, // oneLineComment
135,26, // blockComment
MIN_REDUCTION+346, // (default reduction)
  }
,
{ // state 672
-1, // $$start
-1, // start
1542, // white*
-1, // $$0
MIN_REDUCTION+152, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
972, // `!
312, // `!=
1102, // `%
1560, // `&&
293, // `*
647, // `(
123, // `)
1355, // `{
95, // `}
413, // `-
1444, // `+
67, // `=
1322, // `==
109, // `[
551, // `]
1370, // `||
168, // `<
53, // `<=
1559, // `,
604, // `>
1435, // `>=
1247, // `.
1490, // `;
111, // `++
50, // `--
152, // `/
385, // `:
872, // ID
161, // INT_LITERAL
485, // STRING_LITERAL
769, // CHAR_LITERAL
513, // "c"
513, // "l"
513, // "a"
513, // "s"
-1, // idChar
-1, // reserved
513, // "e"
637, // "!"
1360, // "="
1616, // "+"
305, // "0"
566, // digit++
961, // digit
513, // "x"
513, // "X"
-1, // hex
1361, // letter
-1, // "_"
513, // "d"
513, // "g"
513, // "m"
513, // "p"
513, // "v"
513, // "y"
513, // "f"
513, // "i"
513, // {"A".."W" "Y".."Z"}
513, // "o"
513, // "r"
513, // "u"
513, // {"j" "q"}
513, // "b"
513, // "h"
513, // "k"
513, // "n"
513, // "t"
513, // "w"
513, // "z"
305, // {"1".."9"}
376, // white
1602, // {12}
1602, // " "
1602, // {9}
381, // eol
1433, // comment
565, // oneLineComment
26, // blockComment
1572, // "/"
-1, // printable**
-1, // printable
1638, // "*"
-1, // blockCommentContent*
-1, // blockCommentContent
582, // "["
295, // "-"
174, // "<"
182, // "|"
-1, // {"?".."@"}
164, // "&"
1357, // ")"
155, // ","
369, // "]"
-1, // {"#".."$"}
387, // ";"
1173, // ">"
1611, // "{"
978, // "%"
1273, // "("
-1, // "\"
319, // "."
246, // ":"
984, // "}"
-1, // {"^" "`" "~"}
995, // "'"
1482, // '"'
418, // {10}
1458, // {13}
-1, // stringPrintable
-1, // recognizeEscapeChar
-1, // charPrintable
792, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
-1, // escapeChars
-1, // token*
-1, // printable*
466, // digit+
-1, // idChar*
883, // letter+
MIN_REDUCTION+152, // $
-1, // $NT
  }
,
{ // state 673
0x80000000|683, // match move
0x80000000|1613, // no-match move
// T-test match for "0":
99,
  }
,
{ // state 674
181,MIN_REDUCTION+113, // $NT
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 675
MIN_REDUCTION+355, // (default reduction)
  }
,
{ // state 676
0x80000000|918, // match move
0x80000000|470, // no-match move
// T-test match for 10:
164,
  }
,
{ // state 677
181,MIN_REDUCTION+216, // $NT
  }
,
{ // state 678
0x80000000|1, // match move
0x80000000|1520, // no-match move
0x80000000|36, // NT-test-match state for idChar
  }
,
{ // state 679
128,1304, // white
132,381, // eol
133,1433, // comment
134,565, // oneLineComment
135,26, // blockComment
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 680
181,MIN_REDUCTION+336, // $NT
  }
,
{ // state 681
0x80000000|362, // match move
0x80000000|102, // no-match move
0x80000000|1258, // NT-test-match state for reserved
  }
,
{ // state 682
95,774, // "e"
  }
,
{ // state 683
128,1304, // white
132,381, // eol
133,1433, // comment
134,565, // oneLineComment
135,26, // blockComment
MIN_REDUCTION+181, // (default reduction)
  }
,
{ // state 684
0x80000000|564, // match move
0x80000000|235, // no-match move
// T-test match for "0":
99,
  }
,
{ // state 685
124,866, // "t"
  }
,
{ // state 686
162,1617, // "'"
  }
,
{ // state 687
0x80000000|1, // match move
0x80000000|857, // no-match move
0x80000000|36, // NT-test-match state for idChar
  }
,
{ // state 688
0x80000000|614, // match move
0x80000000|908, // no-match move
// T-test match for 10:
164,
  }
,
{ // state 689
181,MIN_REDUCTION+243, // $NT
  }
,
{ // state 690
MIN_REDUCTION+232, // (default reduction)
  }
,
{ // state 691
0x80000000|1, // match move
0x80000000|884, // no-match move
0x80000000|36, // NT-test-match state for idChar
  }
,
{ // state 692
0x80000000|259, // match move
0x80000000|785, // no-match move
// T-test match for "0":
99,
  }
,
{ // state 693
0x80000000|493, // match move
0x80000000|204, // no-match move
// T-test match for "0":
99,
  }
,
{ // state 694
2,416, // white*
MIN_REDUCTION+172, // (default reduction)
  }
,
{ // state 695
MIN_REDUCTION+371, // (default reduction)
  }
,
{ // state 696
95,1305, // "e"
  }
,
{ // state 697
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+101, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
972, // `!
312, // `!=
1102, // `%
1560, // `&&
293, // `*
647, // `(
123, // `)
1355, // `{
95, // `}
413, // `-
1444, // `+
67, // `=
1322, // `==
109, // `[
551, // `]
1370, // `||
168, // `<
53, // `<=
1559, // `,
604, // `>
1435, // `>=
1247, // `.
1490, // `;
111, // `++
50, // `--
152, // `/
385, // `:
872, // ID
161, // INT_LITERAL
485, // STRING_LITERAL
769, // CHAR_LITERAL
513, // "c"
513, // "l"
513, // "a"
513, // "s"
-1, // idChar
-1, // reserved
513, // "e"
637, // "!"
1360, // "="
1616, // "+"
305, // "0"
566, // digit++
961, // digit
513, // "x"
513, // "X"
-1, // hex
1361, // letter
-1, // "_"
513, // "d"
513, // "g"
513, // "m"
513, // "p"
513, // "v"
513, // "y"
513, // "f"
513, // "i"
513, // {"A".."W" "Y".."Z"}
513, // "o"
513, // "r"
513, // "u"
513, // {"j" "q"}
513, // "b"
513, // "h"
513, // "k"
513, // "n"
513, // "t"
513, // "w"
513, // "z"
305, // {"1".."9"}
1304, // white
1602, // {12}
1602, // " "
1602, // {9}
381, // eol
1433, // comment
565, // oneLineComment
26, // blockComment
1572, // "/"
-1, // printable**
-1, // printable
1638, // "*"
-1, // blockCommentContent*
-1, // blockCommentContent
582, // "["
295, // "-"
174, // "<"
182, // "|"
-1, // {"?".."@"}
164, // "&"
1357, // ")"
155, // ","
369, // "]"
-1, // {"#".."$"}
387, // ";"
1173, // ">"
1611, // "{"
978, // "%"
1273, // "("
-1, // "\"
319, // "."
246, // ":"
984, // "}"
-1, // {"^" "`" "~"}
995, // "'"
1482, // '"'
418, // {10}
1458, // {13}
-1, // stringPrintable
-1, // recognizeEscapeChar
-1, // charPrintable
792, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
-1, // escapeChars
-1, // token*
-1, // printable*
466, // digit+
-1, // idChar*
883, // letter+
MIN_REDUCTION+101, // $
-1, // $NT
  }
,
{ // state 698
2,561, // white*
128,1336, // white
129,674, // {12}
130,674, // " "
131,674, // {9}
132,889, // eol
133,775, // comment
134,943, // oneLineComment
135,641, // blockComment
136,1598, // "/"
164,926, // {10}
165,676, // {13}
181,MIN_REDUCTION+332, // $NT
  }
,
{ // state 699
123,1069, // "n"
  }
,
{ // state 700
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+199, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
972, // `!
312, // `!=
1102, // `%
1560, // `&&
293, // `*
647, // `(
123, // `)
1355, // `{
95, // `}
413, // `-
1444, // `+
67, // `=
1322, // `==
109, // `[
551, // `]
1370, // `||
168, // `<
53, // `<=
1559, // `,
604, // `>
1435, // `>=
1247, // `.
1490, // `;
111, // `++
50, // `--
152, // `/
385, // `:
872, // ID
161, // INT_LITERAL
485, // STRING_LITERAL
769, // CHAR_LITERAL
513, // "c"
513, // "l"
513, // "a"
513, // "s"
-1, // idChar
-1, // reserved
513, // "e"
637, // "!"
1360, // "="
1616, // "+"
305, // "0"
566, // digit++
961, // digit
513, // "x"
513, // "X"
-1, // hex
1361, // letter
-1, // "_"
513, // "d"
513, // "g"
513, // "m"
513, // "p"
513, // "v"
513, // "y"
513, // "f"
513, // "i"
513, // {"A".."W" "Y".."Z"}
513, // "o"
513, // "r"
513, // "u"
513, // {"j" "q"}
513, // "b"
513, // "h"
513, // "k"
513, // "n"
513, // "t"
513, // "w"
513, // "z"
305, // {"1".."9"}
1304, // white
1602, // {12}
1602, // " "
1602, // {9}
381, // eol
1433, // comment
565, // oneLineComment
26, // blockComment
1572, // "/"
-1, // printable**
-1, // printable
1638, // "*"
-1, // blockCommentContent*
-1, // blockCommentContent
582, // "["
295, // "-"
174, // "<"
182, // "|"
-1, // {"?".."@"}
164, // "&"
1357, // ")"
155, // ","
369, // "]"
-1, // {"#".."$"}
387, // ";"
1173, // ">"
1611, // "{"
978, // "%"
1273, // "("
-1, // "\"
319, // "."
246, // ":"
984, // "}"
-1, // {"^" "`" "~"}
995, // "'"
1482, // '"'
418, // {10}
1458, // {13}
-1, // stringPrintable
-1, // recognizeEscapeChar
-1, // charPrintable
792, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
-1, // escapeChars
-1, // token*
-1, // printable*
466, // digit+
-1, // idChar*
883, // letter+
MIN_REDUCTION+199, // $
-1, // $NT
  }
,
{ // state 701
95,83, // "e"
  }
,
{ // state 702
181,MIN_REDUCTION+111, // $NT
  }
,
{ // state 703
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+137, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
972, // `!
312, // `!=
1102, // `%
1560, // `&&
293, // `*
647, // `(
123, // `)
1355, // `{
95, // `}
413, // `-
1444, // `+
67, // `=
1322, // `==
109, // `[
551, // `]
1370, // `||
168, // `<
53, // `<=
1559, // `,
604, // `>
1435, // `>=
1247, // `.
1490, // `;
111, // `++
50, // `--
152, // `/
385, // `:
872, // ID
161, // INT_LITERAL
485, // STRING_LITERAL
769, // CHAR_LITERAL
513, // "c"
513, // "l"
513, // "a"
513, // "s"
-1, // idChar
-1, // reserved
513, // "e"
637, // "!"
1360, // "="
1616, // "+"
305, // "0"
566, // digit++
961, // digit
513, // "x"
513, // "X"
-1, // hex
1361, // letter
-1, // "_"
513, // "d"
513, // "g"
513, // "m"
513, // "p"
513, // "v"
513, // "y"
513, // "f"
513, // "i"
513, // {"A".."W" "Y".."Z"}
513, // "o"
513, // "r"
513, // "u"
513, // {"j" "q"}
513, // "b"
513, // "h"
513, // "k"
513, // "n"
513, // "t"
513, // "w"
513, // "z"
305, // {"1".."9"}
1304, // white
1602, // {12}
1602, // " "
1602, // {9}
381, // eol
1433, // comment
565, // oneLineComment
26, // blockComment
1572, // "/"
-1, // printable**
-1, // printable
1638, // "*"
-1, // blockCommentContent*
-1, // blockCommentContent
582, // "["
295, // "-"
174, // "<"
182, // "|"
-1, // {"?".."@"}
164, // "&"
1357, // ")"
155, // ","
369, // "]"
-1, // {"#".."$"}
387, // ";"
1173, // ">"
1611, // "{"
978, // "%"
1273, // "("
-1, // "\"
319, // "."
246, // ":"
984, // "}"
-1, // {"^" "`" "~"}
995, // "'"
1482, // '"'
418, // {10}
1458, // {13}
-1, // stringPrintable
-1, // recognizeEscapeChar
-1, // charPrintable
792, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
-1, // escapeChars
-1, // token*
-1, // printable*
466, // digit+
-1, // idChar*
883, // letter+
MIN_REDUCTION+137, // $
-1, // $NT
  }
,
{ // state 704
-1, // $$start
-1, // start
684, // white*
-1, // $$0
MIN_REDUCTION+248, // token
1392, // `boolean
1186, // `class
1576, // `extends
798, // `void
1167, // `int
267, // `while
1537, // `if
316, // `else
440, // `for
165, // `break
280, // `this
1368, // `false
1106, // `true
953, // `super
489, // `null
1163, // `return
630, // `instanceof
976, // `new
1330, // `abstract
1402, // `assert
1567, // `byte
27, // `case
833, // `catch
982, // `char
1324, // `const
141, // `continue
115, // `default
1035, // `do
140, // `double
308, // `enum
662, // `final
1021, // `finally
1158, // `float
765, // `goto
1302, // `implements
768, // `import
1514, // `interface
1633, // `long
812, // `native
1233, // `package
245, // `private
339, // `protected
1254, // `public
516, // `short
412, // `static
1491, // `strictfp
832, // `switch
397, // `synchronized
201, // `throw
1108, // `throws
417, // `transient
631, // `try
927, // `volatile
972, // `!
312, // `!=
1102, // `%
1560, // `&&
293, // `*
647, // `(
123, // `)
1355, // `{
95, // `}
413, // `-
1444, // `+
67, // `=
1322, // `==
109, // `[
551, // `]
1370, // `||
168, // `<
53, // `<=
1559, // `,
604, // `>
1435, // `>=
1247, // `.
1490, // `;
111, // `++
50, // `--
152, // `/
385, // `:
-1, // ID
161, // INT_LITERAL
485, // STRING_LITERAL
769, // CHAR_LITERAL
MIN_REDUCTION+248, // "c"
MIN_REDUCTION+248, // "l"
MIN_REDUCTION+248, // "a"
MIN_REDUCTION+248, // "s"
-1, // idChar
-1, // reserved
MIN_REDUCTION+248, // "e"
637, // "!"
1360, // "="
1616, // "+"
MIN_REDUCTION+248, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+248, // "x"
MIN_REDUCTION+248, // "X"
-1, // hex
-1, // letter
-1, // "_"
MIN_REDUCTION+248, // "d"
MIN_REDUCTION+248, // "g"
MIN_REDUCTION+248, // "m"
MIN_REDUCTION+248, // "p"
MIN_REDUCTION+248, // "v"
MIN_REDUCTION+248, // "y"
MIN_REDUCTION+248, // "f"
MIN_REDUCTION+248, // "i"
MIN_REDUCTION+248, // {"A".."W" "Y".."Z"}
MIN_REDUCTION+248, // "o"
MIN_REDUCTION+248, // "r"
MIN_REDUCTION+248, // "u"
MIN_REDUCTION+248, // {"j" "q"}
MIN_REDUCTION+248, // "b"
MIN_REDUCTION+248, // "h"
MIN_REDUCTION+248, // "k"
MIN_REDUCTION+248, // "n"
MIN_REDUCTION+248, // "t"
MIN_REDUCTION+248, // "w"
MIN_REDUCTION+248, // "z"
MIN_REDUCTION+248, // {"1".."9"}
376, // white
1602, // {12}
1602, // " "
1602, // {9}
381, // eol
1433, // comment
565, // oneLineComment
26, // blockComment
1572, // "/"
-1, // printable**
-1, // printable
1638, // "*"
-1, // blockCommentContent*
-1, // blockCommentContent
582, // "["
295, // "-"
174, // "<"
182, // "|"
-1, // {"?".."@"}
164, // "&"
1357, // ")"
155, // ","
369, // "]"
-1, // {"#".."$"}
387, // ";"
1173, // ">"
1611, // "{"
978, // "%"
1273, // "("
-1, // "\"
319, // "."
246, // ":"
984, // "}"
-1, // {"^" "`" "~"}
995, // "'"
1482, // '"'
418, // {10}
1458, // {13}
-1, // stringPrintable
-1, // recognizeEscapeChar
-1, // charPrintable
-1, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
-1, // escapeChars
-1, // token*
-1, // printable*
-1, // digit+
-1, // idChar*
-1, // letter+
MIN_REDUCTION+248, // $
-1, // $NT
  }
,
{ // state 705
95,753, // "e"
  }
,
{ // state 706
MIN_REDUCTION+368, // (default reduction)
  }
,
{ // state 707
97,1287, // "="
  }
,
{ // state 708
0x80000000|445, // match move
0x80000000|786, // no-match move
// T-test match for "0":
99,
  }
,
{ // state 709
MIN_REDUCTION+374, // (default reduction)
  }
,
{ // state 710
128,1304, // white
132,381, // eol
133,1433, // comment
134,565, // oneLineComment
135,26, // blockComment
MIN_REDUCTION+173, // (default reduction)
  }
,
{ // state 711
0x80000000|1104, // match move
0x80000000|757, // no-match move
0x80000000|1258, // NT-test-match state for reserved
  }
,
{ // state 712
89,1190, // "c"
  }
,
{ // state 713
MIN_REDUCTION+173, // (default reduction)
  }
,
{ // state 714
MIN_REDUCTION+358, // (default reduction)
  }
,
{ // state 715
181,MIN_REDUCTION+198, // $NT
  }
,
{ // state 716
2,1478, // white*
128,1336, // white
129,674, // {12}
130,674, // " "
131,674, // {9}
132,889, // eol
133,775, // comment
134,943, // oneLineComment
135,641, // blockComment
136,1598, // "/"
164,926, // {10}
165,676, // {13}
181,MIN_REDUCTION+263, // $NT
  }
,
{ // state 717
0x80000000|68, // match move
0x80000000|1129, // no-match move
// T-test match for "0":
99,
  }
,
{ // state 718
95,217, // "e"
  }
,
{ // state 719
-1, // $$start
-1, // start
1303, // white*
-1, // $$0
MIN_REDUCTION+218, // token
1392, // `boolean
1186, // `class
1576, // `extends
798, // `void
1167, // `int
267, // `while
1537, // `if
316, // `else
440, // `for
165, // `break
280, // `this
1368, // `false
1106, // `true
953, // `super
489, // `null
1163, // `return
630, // `instanceof
976, // `new
1330, // `abstract
1402, // `assert
1567, // `byte
27, // `case
833, // `catch
982, // `char
1324, // `const
141, // `continue
115, // `default
1035, // `do
140, // `double
308, // `enum
662, // `final
1021, // `finally
1158, // `float
765, // `goto
1302, // `implements
768, // `import
1514, // `interface
1633, // `long
812, // `native
1233, // `package
245, // `private
339, // `protected
1254, // `public
516, // `short
412, // `static
1491, // `strictfp
832, // `switch
397, // `synchronized
201, // `throw
1108, // `throws
417, // `transient
631, // `try
927, // `volatile
972, // `!
312, // `!=
1102, // `%
1560, // `&&
293, // `*
647, // `(
123, // `)
1355, // `{
95, // `}
413, // `-
1444, // `+
67, // `=
1322, // `==
109, // `[
551, // `]
1370, // `||
168, // `<
53, // `<=
1559, // `,
604, // `>
1435, // `>=
1247, // `.
1490, // `;
111, // `++
50, // `--
152, // `/
385, // `:
-1, // ID
161, // INT_LITERAL
485, // STRING_LITERAL
769, // CHAR_LITERAL
MIN_REDUCTION+218, // "c"
MIN_REDUCTION+218, // "l"
MIN_REDUCTION+218, // "a"
MIN_REDUCTION+218, // "s"
-1, // idChar
-1, // reserved
MIN_REDUCTION+218, // "e"
637, // "!"
1360, // "="
1616, // "+"
MIN_REDUCTION+218, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+218, // "x"
MIN_REDUCTION+218, // "X"
-1, // hex
-1, // letter
-1, // "_"
MIN_REDUCTION+218, // "d"
MIN_REDUCTION+218, // "g"
MIN_REDUCTION+218, // "m"
MIN_REDUCTION+218, // "p"
MIN_REDUCTION+218, // "v"
MIN_REDUCTION+218, // "y"
MIN_REDUCTION+218, // "f"
MIN_REDUCTION+218, // "i"
MIN_REDUCTION+218, // {"A".."W" "Y".."Z"}
MIN_REDUCTION+218, // "o"
MIN_REDUCTION+218, // "r"
MIN_REDUCTION+218, // "u"
MIN_REDUCTION+218, // {"j" "q"}
MIN_REDUCTION+218, // "b"
MIN_REDUCTION+218, // "h"
MIN_REDUCTION+218, // "k"
MIN_REDUCTION+218, // "n"
MIN_REDUCTION+218, // "t"
MIN_REDUCTION+218, // "w"
MIN_REDUCTION+218, // "z"
MIN_REDUCTION+218, // {"1".."9"}
376, // white
1602, // {12}
1602, // " "
1602, // {9}
381, // eol
1433, // comment
565, // oneLineComment
26, // blockComment
1572, // "/"
-1, // printable**
-1, // printable
1638, // "*"
-1, // blockCommentContent*
-1, // blockCommentContent
582, // "["
295, // "-"
174, // "<"
182, // "|"
-1, // {"?".."@"}
164, // "&"
1357, // ")"
155, // ","
369, // "]"
-1, // {"#".."$"}
387, // ";"
1173, // ">"
1611, // "{"
978, // "%"
1273, // "("
-1, // "\"
319, // "."
246, // ":"
984, // "}"
-1, // {"^" "`" "~"}
995, // "'"
1482, // '"'
418, // {10}
1458, // {13}
-1, // stringPrintable
-1, // recognizeEscapeChar
-1, // charPrintable
-1, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
-1, // escapeChars
-1, // token*
-1, // printable*
-1, // digit+
-1, // idChar*
-1, // letter+
MIN_REDUCTION+218, // $
-1, // $NT
  }
,
{ // state 720
0x80000000|453, // match move
0x80000000|85, // no-match move
// T-test match for "0":
99,
  }
,
{ // state 721
0x80000000|1508, // match move
0x80000000|1609, // no-match move
// T-test match for "0":
99,
  }
,
{ // state 722
95,1062, // "e"
  }
,
{ // state 723
181,MIN_REDUCTION+252, // $NT
  }
,
{ // state 724
90,555, // "l"
  }
,
{ // state 725
0x80000000|1, // match move
0x80000000|704, // no-match move
0x80000000|36, // NT-test-match state for idChar
  }
,
{ // state 726
0x80000000|429, // match move
0x80000000|609, // no-match move
// T-test match for "0":
99,
  }
,
{ // state 727
128,1304, // white
132,381, // eol
133,1433, // comment
134,565, // oneLineComment
135,26, // blockComment
MIN_REDUCTION+232, // (default reduction)
  }
,
{ // state 728
89,821, // "c"
90,821, // "l"
91,821, // "a"
92,821, // "s"
95,821, // "e"
96,821, // "!"
97,821, // "="
98,821, // "+"
99,821, // "0"
102,821, // "x"
103,821, // "X"
106,821, // "_"
107,821, // "d"
108,821, // "g"
109,821, // "m"
110,821, // "p"
111,821, // "v"
112,821, // "y"
113,821, // "f"
114,821, // "i"
115,821, // {"A".."W" "Y".."Z"}
116,821, // "o"
117,821, // "r"
118,821, // "u"
119,821, // {"j" "q"}
120,821, // "b"
121,821, // "h"
122,821, // "k"
123,821, // "n"
124,821, // "t"
125,821, // "w"
126,821, // "z"
127,821, // {"1".."9"}
130,821, // " "
136,821, // "/"
137,419, // printable**
138,517, // printable
139,821, // "*"
142,821, // "["
143,821, // "-"
144,821, // "<"
145,821, // "|"
146,821, // {"?".."@"}
147,821, // "&"
148,821, // ")"
149,821, // ","
150,821, // "]"
151,821, // {"#".."$"}
152,821, // ";"
153,821, // ">"
154,821, // "{"
155,821, // "%"
156,821, // "("
157,821, // "\"
158,821, // "."
159,821, // ":"
160,821, // "}"
161,821, // {"^" "`" "~"}
162,821, // "'"
163,821, // '"'
176,225, // printable*
  }
,
{ // state 729
0x80000000|1, // match move
0x80000000|1628, // no-match move
0x80000000|36, // NT-test-match state for idChar
  }
,
{ // state 730
MIN_REDUCTION+132, // (default reduction)
  }
,
{ // state 731
89,548, // "c"
  }
,
{ // state 732
-1, // $$start
-1, // start
1313, // white*
-1, // $$0
MIN_REDUCTION+184, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
972, // `!
312, // `!=
1102, // `%
1560, // `&&
293, // `*
647, // `(
123, // `)
1355, // `{
95, // `}
413, // `-
1444, // `+
67, // `=
1322, // `==
109, // `[
551, // `]
1370, // `||
168, // `<
53, // `<=
1559, // `,
604, // `>
1435, // `>=
1247, // `.
1490, // `;
111, // `++
50, // `--
152, // `/
385, // `:
872, // ID
161, // INT_LITERAL
485, // STRING_LITERAL
769, // CHAR_LITERAL
513, // "c"
513, // "l"
513, // "a"
513, // "s"
-1, // idChar
-1, // reserved
513, // "e"
637, // "!"
1360, // "="
1616, // "+"
305, // "0"
566, // digit++
961, // digit
513, // "x"
513, // "X"
-1, // hex
1361, // letter
-1, // "_"
513, // "d"
513, // "g"
513, // "m"
513, // "p"
513, // "v"
513, // "y"
513, // "f"
513, // "i"
513, // {"A".."W" "Y".."Z"}
513, // "o"
513, // "r"
513, // "u"
513, // {"j" "q"}
513, // "b"
513, // "h"
513, // "k"
513, // "n"
513, // "t"
513, // "w"
513, // "z"
305, // {"1".."9"}
376, // white
1602, // {12}
1602, // " "
1602, // {9}
381, // eol
1433, // comment
565, // oneLineComment
26, // blockComment
1572, // "/"
-1, // printable**
-1, // printable
1638, // "*"
-1, // blockCommentContent*
-1, // blockCommentContent
582, // "["
295, // "-"
174, // "<"
182, // "|"
-1, // {"?".."@"}
164, // "&"
1357, // ")"
155, // ","
369, // "]"
-1, // {"#".."$"}
387, // ";"
1173, // ">"
1611, // "{"
978, // "%"
1273, // "("
-1, // "\"
319, // "."
246, // ":"
984, // "}"
-1, // {"^" "`" "~"}
995, // "'"
1482, // '"'
418, // {10}
1458, // {13}
-1, // stringPrintable
-1, // recognizeEscapeChar
-1, // charPrintable
792, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
-1, // escapeChars
-1, // token*
-1, // printable*
466, // digit+
-1, // idChar*
883, // letter+
MIN_REDUCTION+184, // $
-1, // $NT
  }
,
{ // state 733
MIN_REDUCTION+136, // (default reduction)
  }
,
{ // state 734
114,1639, // "i"
116,399, // "o"
  }
,
{ // state 735
2,720, // white*
MIN_REDUCTION+156, // (default reduction)
  }
,
{ // state 736
0x80000000|1267, // match move
0x80000000|224, // no-match move
0x80000000|1258, // NT-test-match state for reserved
  }
,
{ // state 737
128,620, // white
129,674, // {12}
130,674, // " "
131,674, // {9}
132,889, // eol
133,775, // comment
134,943, // oneLineComment
135,641, // blockComment
136,1598, // "/"
164,926, // {10}
165,676, // {13}
181,MIN_REDUCTION+298, // $NT
  }
,
{ // state 738
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+331, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
972, // `!
312, // `!=
1102, // `%
1560, // `&&
293, // `*
647, // `(
123, // `)
1355, // `{
95, // `}
413, // `-
1444, // `+
67, // `=
1322, // `==
109, // `[
551, // `]
1370, // `||
168, // `<
53, // `<=
1559, // `,
604, // `>
1435, // `>=
1247, // `.
1490, // `;
111, // `++
50, // `--
152, // `/
385, // `:
872, // ID
161, // INT_LITERAL
485, // STRING_LITERAL
769, // CHAR_LITERAL
513, // "c"
513, // "l"
513, // "a"
513, // "s"
-1, // idChar
-1, // reserved
513, // "e"
637, // "!"
1360, // "="
1616, // "+"
305, // "0"
566, // digit++
961, // digit
513, // "x"
513, // "X"
-1, // hex
1361, // letter
-1, // "_"
513, // "d"
513, // "g"
513, // "m"
513, // "p"
513, // "v"
513, // "y"
513, // "f"
513, // "i"
513, // {"A".."W" "Y".."Z"}
513, // "o"
513, // "r"
513, // "u"
513, // {"j" "q"}
513, // "b"
513, // "h"
513, // "k"
513, // "n"
513, // "t"
513, // "w"
513, // "z"
305, // {"1".."9"}
1304, // white
1602, // {12}
1602, // " "
1602, // {9}
381, // eol
1433, // comment
565, // oneLineComment
26, // blockComment
1572, // "/"
-1, // printable**
-1, // printable
1638, // "*"
-1, // blockCommentContent*
-1, // blockCommentContent
582, // "["
295, // "-"
174, // "<"
182, // "|"
-1, // {"?".."@"}
164, // "&"
1357, // ")"
155, // ","
369, // "]"
-1, // {"#".."$"}
387, // ";"
1173, // ">"
1611, // "{"
978, // "%"
1273, // "("
-1, // "\"
319, // "."
246, // ":"
984, // "}"
-1, // {"^" "`" "~"}
995, // "'"
1482, // '"'
418, // {10}
1458, // {13}
-1, // stringPrintable
-1, // recognizeEscapeChar
-1, // charPrintable
792, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
-1, // escapeChars
-1, // token*
-1, // printable*
466, // digit+
-1, // idChar*
883, // letter+
MIN_REDUCTION+331, // $
-1, // $NT
  }
,
{ // state 739
92,594, // "s"
  }
,
{ // state 740
97,1115, // "="
  }
,
{ // state 741
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+165, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
972, // `!
312, // `!=
1102, // `%
1560, // `&&
293, // `*
647, // `(
123, // `)
1355, // `{
95, // `}
413, // `-
1444, // `+
67, // `=
1322, // `==
109, // `[
551, // `]
1370, // `||
168, // `<
53, // `<=
1559, // `,
604, // `>
1435, // `>=
1247, // `.
1490, // `;
111, // `++
50, // `--
152, // `/
385, // `:
872, // ID
161, // INT_LITERAL
485, // STRING_LITERAL
769, // CHAR_LITERAL
513, // "c"
513, // "l"
513, // "a"
513, // "s"
-1, // idChar
-1, // reserved
513, // "e"
637, // "!"
1360, // "="
1616, // "+"
305, // "0"
566, // digit++
961, // digit
513, // "x"
513, // "X"
-1, // hex
1361, // letter
-1, // "_"
513, // "d"
513, // "g"
513, // "m"
513, // "p"
513, // "v"
513, // "y"
513, // "f"
513, // "i"
513, // {"A".."W" "Y".."Z"}
513, // "o"
513, // "r"
513, // "u"
513, // {"j" "q"}
513, // "b"
513, // "h"
513, // "k"
513, // "n"
513, // "t"
513, // "w"
513, // "z"
305, // {"1".."9"}
1304, // white
1602, // {12}
1602, // " "
1602, // {9}
381, // eol
1433, // comment
565, // oneLineComment
26, // blockComment
1572, // "/"
-1, // printable**
-1, // printable
1638, // "*"
-1, // blockCommentContent*
-1, // blockCommentContent
582, // "["
295, // "-"
174, // "<"
182, // "|"
-1, // {"?".."@"}
164, // "&"
1357, // ")"
155, // ","
369, // "]"
-1, // {"#".."$"}
387, // ";"
1173, // ">"
1611, // "{"
978, // "%"
1273, // "("
-1, // "\"
319, // "."
246, // ":"
984, // "}"
-1, // {"^" "`" "~"}
995, // "'"
1482, // '"'
418, // {10}
1458, // {13}
-1, // stringPrintable
-1, // recognizeEscapeChar
-1, // charPrintable
792, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
-1, // escapeChars
-1, // token*
-1, // printable*
466, // digit+
-1, // idChar*
883, // letter+
MIN_REDUCTION+165, // $
-1, // $NT
  }
,
{ // state 742
2,693, // white*
MIN_REDUCTION+96, // (default reduction)
  }
,
{ // state 743
0x80000000|1624, // match move
0x80000000|1601, // no-match move
// T-test match for "/":
136,
  }
,
{ // state 744
114,366, // "i"
  }
,
{ // state 745
95,646, // "e"
  }
,
{ // state 746
0x80000000|154, // match move
0x80000000|813, // no-match move
// T-test match for "0":
99,
  }
,
{ // state 747
2,717, // white*
128,376, // white
132,381, // eol
133,1433, // comment
134,565, // oneLineComment
135,26, // blockComment
MIN_REDUCTION+379, // (default reduction)
  }
,
{ // state 748
-1, // $$start
-1, // start
962, // white*
-1, // $$0
MIN_REDUCTION+299, // token
1392, // `boolean
1186, // `class
1576, // `extends
798, // `void
1167, // `int
267, // `while
1537, // `if
316, // `else
440, // `for
165, // `break
280, // `this
1368, // `false
1106, // `true
953, // `super
489, // `null
1163, // `return
630, // `instanceof
976, // `new
1330, // `abstract
1402, // `assert
1567, // `byte
27, // `case
833, // `catch
982, // `char
1324, // `const
141, // `continue
115, // `default
1035, // `do
140, // `double
308, // `enum
662, // `final
1021, // `finally
1158, // `float
765, // `goto
1302, // `implements
768, // `import
1514, // `interface
1633, // `long
812, // `native
1233, // `package
245, // `private
339, // `protected
1254, // `public
516, // `short
412, // `static
1491, // `strictfp
832, // `switch
397, // `synchronized
201, // `throw
1108, // `throws
417, // `transient
631, // `try
927, // `volatile
972, // `!
312, // `!=
1102, // `%
1560, // `&&
293, // `*
647, // `(
123, // `)
1355, // `{
95, // `}
413, // `-
1444, // `+
67, // `=
1322, // `==
109, // `[
551, // `]
1370, // `||
168, // `<
53, // `<=
1559, // `,
604, // `>
1435, // `>=
1247, // `.
1490, // `;
111, // `++
50, // `--
152, // `/
385, // `:
-1, // ID
161, // INT_LITERAL
485, // STRING_LITERAL
769, // CHAR_LITERAL
MIN_REDUCTION+299, // "c"
MIN_REDUCTION+299, // "l"
MIN_REDUCTION+299, // "a"
MIN_REDUCTION+299, // "s"
-1, // idChar
-1, // reserved
MIN_REDUCTION+299, // "e"
637, // "!"
1360, // "="
1616, // "+"
MIN_REDUCTION+299, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+299, // "x"
MIN_REDUCTION+299, // "X"
-1, // hex
-1, // letter
-1, // "_"
MIN_REDUCTION+299, // "d"
MIN_REDUCTION+299, // "g"
MIN_REDUCTION+299, // "m"
MIN_REDUCTION+299, // "p"
MIN_REDUCTION+299, // "v"
MIN_REDUCTION+299, // "y"
MIN_REDUCTION+299, // "f"
MIN_REDUCTION+299, // "i"
MIN_REDUCTION+299, // {"A".."W" "Y".."Z"}
MIN_REDUCTION+299, // "o"
MIN_REDUCTION+299, // "r"
MIN_REDUCTION+299, // "u"
MIN_REDUCTION+299, // {"j" "q"}
MIN_REDUCTION+299, // "b"
MIN_REDUCTION+299, // "h"
MIN_REDUCTION+299, // "k"
MIN_REDUCTION+299, // "n"
MIN_REDUCTION+299, // "t"
MIN_REDUCTION+299, // "w"
MIN_REDUCTION+299, // "z"
MIN_REDUCTION+299, // {"1".."9"}
376, // white
1602, // {12}
1602, // " "
1602, // {9}
381, // eol
1433, // comment
565, // oneLineComment
26, // blockComment
1572, // "/"
-1, // printable**
-1, // printable
1638, // "*"
-1, // blockCommentContent*
-1, // blockCommentContent
582, // "["
295, // "-"
174, // "<"
182, // "|"
-1, // {"?".."@"}
164, // "&"
1357, // ")"
155, // ","
369, // "]"
-1, // {"#".."$"}
387, // ";"
1173, // ">"
1611, // "{"
978, // "%"
1273, // "("
-1, // "\"
319, // "."
246, // ":"
984, // "}"
-1, // {"^" "`" "~"}
995, // "'"
1482, // '"'
418, // {10}
1458, // {13}
-1, // stringPrintable
-1, // recognizeEscapeChar
-1, // charPrintable
-1, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
-1, // escapeChars
-1, // token*
-1, // printable*
-1, // digit+
-1, // idChar*
-1, // letter+
MIN_REDUCTION+299, // $
-1, // $NT
  }
,
{ // state 749
0x80000000|1, // match move
0x80000000|626, // no-match move
0x80000000|36, // NT-test-match state for idChar
  }
,
{ // state 750
95,1570, // "e"
  }
,
{ // state 751
90,524, // "l"
  }
,
{ // state 752
128,1304, // white
132,381, // eol
133,1433, // comment
134,565, // oneLineComment
135,26, // blockComment
MIN_REDUCTION+143, // (default reduction)
  }
,
{ // state 753
91,526, // "a"
  }
,
{ // state 754
128,620, // white
129,674, // {12}
130,674, // " "
131,674, // {9}
132,889, // eol
133,775, // comment
134,943, // oneLineComment
135,641, // blockComment
136,1598, // "/"
164,926, // {10}
165,676, // {13}
181,MIN_REDUCTION+265, // $NT
  }
,
{ // state 755
2,754, // white*
128,1336, // white
129,674, // {12}
130,674, // " "
131,674, // {9}
132,889, // eol
133,775, // comment
134,943, // oneLineComment
135,641, // blockComment
136,1598, // "/"
164,926, // {10}
165,676, // {13}
181,MIN_REDUCTION+266, // $NT
  }
,
{ // state 756
128,620, // white
129,674, // {12}
130,674, // " "
131,674, // {9}
132,889, // eol
133,775, // comment
134,943, // oneLineComment
135,641, // blockComment
136,1598, // "/"
164,926, // {10}
165,676, // {13}
181,MIN_REDUCTION+253, // $NT
  }
,
{ // state 757
3,4, // $$0
4,666, // token
58,972, // `!
59,312, // `!=
60,1102, // `%
61,1560, // `&&
62,293, // `*
63,647, // `(
64,123, // `)
65,1355, // `{
66,95, // `}
67,413, // `-
68,1444, // `+
69,67, // `=
70,1322, // `==
71,109, // `[
72,551, // `]
73,1370, // `||
74,168, // `<
75,53, // `<=
76,1559, // `,
77,604, // `>
78,1435, // `>=
79,1247, // `.
80,1490, // `;
81,111, // `++
82,50, // `--
83,152, // `/
84,385, // `:
85,872, // ID
86,161, // INT_LITERAL
87,485, // STRING_LITERAL
88,769, // CHAR_LITERAL
99,322, // "0"
105,1361, // letter
128,562, // white
132,1446, // eol
133,1070, // comment
134,1306, // oneLineComment
135,839, // blockComment
169,792, // letter++
175,1278, // token*
179,883, // letter+
  }
,
{ // state 758
164,1299, // {10}
  }
,
{ // state 759
0x80000000|671, // match move
0x80000000|1240, // no-match move
// T-test match for "0":
99,
  }
,
{ // state 760
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+190, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
972, // `!
312, // `!=
1102, // `%
1560, // `&&
293, // `*
647, // `(
123, // `)
1355, // `{
95, // `}
413, // `-
1444, // `+
67, // `=
1322, // `==
109, // `[
551, // `]
1370, // `||
168, // `<
53, // `<=
1559, // `,
604, // `>
1435, // `>=
1247, // `.
1490, // `;
111, // `++
50, // `--
152, // `/
385, // `:
872, // ID
161, // INT_LITERAL
485, // STRING_LITERAL
769, // CHAR_LITERAL
513, // "c"
513, // "l"
513, // "a"
513, // "s"
-1, // idChar
-1, // reserved
513, // "e"
637, // "!"
1360, // "="
1616, // "+"
305, // "0"
566, // digit++
961, // digit
513, // "x"
513, // "X"
-1, // hex
1361, // letter
-1, // "_"
513, // "d"
513, // "g"
513, // "m"
513, // "p"
513, // "v"
513, // "y"
513, // "f"
513, // "i"
513, // {"A".."W" "Y".."Z"}
513, // "o"
513, // "r"
513, // "u"
513, // {"j" "q"}
513, // "b"
513, // "h"
513, // "k"
513, // "n"
513, // "t"
513, // "w"
513, // "z"
305, // {"1".."9"}
1304, // white
1602, // {12}
1602, // " "
1602, // {9}
381, // eol
1433, // comment
565, // oneLineComment
26, // blockComment
1572, // "/"
-1, // printable**
-1, // printable
1638, // "*"
-1, // blockCommentContent*
-1, // blockCommentContent
582, // "["
295, // "-"
174, // "<"
182, // "|"
-1, // {"?".."@"}
164, // "&"
1357, // ")"
155, // ","
369, // "]"
-1, // {"#".."$"}
387, // ";"
1173, // ">"
1611, // "{"
978, // "%"
1273, // "("
-1, // "\"
319, // "."
246, // ":"
984, // "}"
-1, // {"^" "`" "~"}
995, // "'"
1482, // '"'
418, // {10}
1458, // {13}
-1, // stringPrintable
-1, // recognizeEscapeChar
-1, // charPrintable
792, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
-1, // escapeChars
-1, // token*
-1, // printable*
466, // digit+
-1, // idChar*
883, // letter+
MIN_REDUCTION+190, // $
-1, // $NT
  }
,
{ // state 761
-1, // $$start
-1, // start
1437, // white*
-1, // $$0
MIN_REDUCTION+254, // token
1392, // `boolean
1186, // `class
1576, // `extends
798, // `void
1167, // `int
267, // `while
1537, // `if
316, // `else
440, // `for
165, // `break
280, // `this
1368, // `false
1106, // `true
953, // `super
489, // `null
1163, // `return
630, // `instanceof
976, // `new
1330, // `abstract
1402, // `assert
1567, // `byte
27, // `case
833, // `catch
982, // `char
1324, // `const
141, // `continue
115, // `default
1035, // `do
140, // `double
308, // `enum
662, // `final
1021, // `finally
1158, // `float
765, // `goto
1302, // `implements
768, // `import
1514, // `interface
1633, // `long
812, // `native
1233, // `package
245, // `private
339, // `protected
1254, // `public
516, // `short
412, // `static
1491, // `strictfp
832, // `switch
397, // `synchronized
201, // `throw
1108, // `throws
417, // `transient
631, // `try
927, // `volatile
972, // `!
312, // `!=
1102, // `%
1560, // `&&
293, // `*
647, // `(
123, // `)
1355, // `{
95, // `}
413, // `-
1444, // `+
67, // `=
1322, // `==
109, // `[
551, // `]
1370, // `||
168, // `<
53, // `<=
1559, // `,
604, // `>
1435, // `>=
1247, // `.
1490, // `;
111, // `++
50, // `--
152, // `/
385, // `:
-1, // ID
161, // INT_LITERAL
485, // STRING_LITERAL
769, // CHAR_LITERAL
MIN_REDUCTION+254, // "c"
MIN_REDUCTION+254, // "l"
MIN_REDUCTION+254, // "a"
MIN_REDUCTION+254, // "s"
-1, // idChar
-1, // reserved
MIN_REDUCTION+254, // "e"
637, // "!"
1360, // "="
1616, // "+"
MIN_REDUCTION+254, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+254, // "x"
MIN_REDUCTION+254, // "X"
-1, // hex
-1, // letter
-1, // "_"
MIN_REDUCTION+254, // "d"
MIN_REDUCTION+254, // "g"
MIN_REDUCTION+254, // "m"
MIN_REDUCTION+254, // "p"
MIN_REDUCTION+254, // "v"
MIN_REDUCTION+254, // "y"
MIN_REDUCTION+254, // "f"
MIN_REDUCTION+254, // "i"
MIN_REDUCTION+254, // {"A".."W" "Y".."Z"}
MIN_REDUCTION+254, // "o"
MIN_REDUCTION+254, // "r"
MIN_REDUCTION+254, // "u"
MIN_REDUCTION+254, // {"j" "q"}
MIN_REDUCTION+254, // "b"
MIN_REDUCTION+254, // "h"
MIN_REDUCTION+254, // "k"
MIN_REDUCTION+254, // "n"
MIN_REDUCTION+254, // "t"
MIN_REDUCTION+254, // "w"
MIN_REDUCTION+254, // "z"
MIN_REDUCTION+254, // {"1".."9"}
376, // white
1602, // {12}
1602, // " "
1602, // {9}
381, // eol
1433, // comment
565, // oneLineComment
26, // blockComment
1572, // "/"
-1, // printable**
-1, // printable
1638, // "*"
-1, // blockCommentContent*
-1, // blockCommentContent
582, // "["
295, // "-"
174, // "<"
182, // "|"
-1, // {"?".."@"}
164, // "&"
1357, // ")"
155, // ","
369, // "]"
-1, // {"#".."$"}
387, // ";"
1173, // ">"
1611, // "{"
978, // "%"
1273, // "("
-1, // "\"
319, // "."
246, // ":"
984, // "}"
-1, // {"^" "`" "~"}
995, // "'"
1482, // '"'
418, // {10}
1458, // {13}
-1, // stringPrintable
-1, // recognizeEscapeChar
-1, // charPrintable
-1, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
-1, // escapeChars
-1, // token*
-1, // printable*
-1, // digit+
-1, // idChar*
-1, // letter+
MIN_REDUCTION+254, // $
-1, // $NT
  }
,
{ // state 762
2,289, // white*
128,1336, // white
129,674, // {12}
130,674, // " "
131,674, // {9}
132,889, // eol
133,775, // comment
134,943, // oneLineComment
135,641, // blockComment
136,1598, // "/"
164,926, // {10}
165,676, // {13}
181,MIN_REDUCTION+242, // $NT
  }
,
{ // state 763
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+177, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
972, // `!
312, // `!=
1102, // `%
1560, // `&&
293, // `*
647, // `(
123, // `)
1355, // `{
95, // `}
413, // `-
1444, // `+
67, // `=
1322, // `==
109, // `[
551, // `]
1370, // `||
168, // `<
53, // `<=
1559, // `,
604, // `>
1435, // `>=
1247, // `.
1490, // `;
111, // `++
50, // `--
152, // `/
385, // `:
872, // ID
161, // INT_LITERAL
485, // STRING_LITERAL
769, // CHAR_LITERAL
513, // "c"
513, // "l"
513, // "a"
513, // "s"
-1, // idChar
-1, // reserved
513, // "e"
637, // "!"
1360, // "="
1616, // "+"
305, // "0"
566, // digit++
961, // digit
513, // "x"
513, // "X"
-1, // hex
1361, // letter
-1, // "_"
513, // "d"
513, // "g"
513, // "m"
513, // "p"
513, // "v"
513, // "y"
513, // "f"
513, // "i"
513, // {"A".."W" "Y".."Z"}
513, // "o"
513, // "r"
513, // "u"
513, // {"j" "q"}
513, // "b"
513, // "h"
513, // "k"
513, // "n"
513, // "t"
513, // "w"
513, // "z"
305, // {"1".."9"}
1304, // white
1602, // {12}
1602, // " "
1602, // {9}
381, // eol
1433, // comment
565, // oneLineComment
26, // blockComment
1572, // "/"
-1, // printable**
-1, // printable
1638, // "*"
-1, // blockCommentContent*
-1, // blockCommentContent
582, // "["
295, // "-"
174, // "<"
182, // "|"
-1, // {"?".."@"}
164, // "&"
1357, // ")"
155, // ","
369, // "]"
-1, // {"#".."$"}
387, // ";"
1173, // ">"
1611, // "{"
978, // "%"
1273, // "("
-1, // "\"
319, // "."
246, // ":"
984, // "}"
-1, // {"^" "`" "~"}
995, // "'"
1482, // '"'
418, // {10}
1458, // {13}
-1, // stringPrintable
-1, // recognizeEscapeChar
-1, // charPrintable
792, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
-1, // escapeChars
-1, // token*
-1, // printable*
466, // digit+
-1, // idChar*
883, // letter+
MIN_REDUCTION+177, // $
-1, // $NT
  }
,
{ // state 764
0x80000000|1, // match move
0x80000000|441, // no-match move
0x80000000|36, // NT-test-match state for idChar
  }
,
{ // state 765
MIN_REDUCTION+38, // (default reduction)
  }
,
{ // state 766
0x80000000|1552, // match move
0x80000000|1601, // no-match move
// T-test match for "/":
136,
  }
,
{ // state 767
0x80000000|1139, // match move
0x80000000|791, // no-match move
0x80000000|1258, // NT-test-match state for reserved
  }
,
{ // state 768
MIN_REDUCTION+40, // (default reduction)
  }
,
{ // state 769
MIN_REDUCTION+88, // (default reduction)
  }
,
{ // state 770
117,619, // "r"
  }
,
{ // state 771
90,988, // "l"
  }
,
{ // state 772
95,307, // "e"
  }
,
{ // state 773
90,782, // "l"
  }
,
{ // state 774
117,997, // "r"
  }
,
{ // state 775
181,MIN_REDUCTION+115, // $NT
MIN_REDUCTION+115, // (default reduction)
  }
,
{ // state 776
2,1300, // white*
128,376, // white
132,381, // eol
133,1433, // comment
134,565, // oneLineComment
135,26, // blockComment
171,1473, // $$1
MIN_REDUCTION+341, // (default reduction)
  }
,
{ // state 777
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+157, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
972, // `!
312, // `!=
1102, // `%
1560, // `&&
293, // `*
647, // `(
123, // `)
1355, // `{
95, // `}
413, // `-
1444, // `+
67, // `=
1322, // `==
109, // `[
551, // `]
1370, // `||
168, // `<
53, // `<=
1559, // `,
604, // `>
1435, // `>=
1247, // `.
1490, // `;
111, // `++
50, // `--
152, // `/
385, // `:
872, // ID
161, // INT_LITERAL
485, // STRING_LITERAL
769, // CHAR_LITERAL
513, // "c"
513, // "l"
513, // "a"
513, // "s"
-1, // idChar
-1, // reserved
513, // "e"
637, // "!"
1360, // "="
1616, // "+"
305, // "0"
566, // digit++
961, // digit
513, // "x"
513, // "X"
-1, // hex
1361, // letter
-1, // "_"
513, // "d"
513, // "g"
513, // "m"
513, // "p"
513, // "v"
513, // "y"
513, // "f"
513, // "i"
513, // {"A".."W" "Y".."Z"}
513, // "o"
513, // "r"
513, // "u"
513, // {"j" "q"}
513, // "b"
513, // "h"
513, // "k"
513, // "n"
513, // "t"
513, // "w"
513, // "z"
305, // {"1".."9"}
1304, // white
1602, // {12}
1602, // " "
1602, // {9}
381, // eol
1433, // comment
565, // oneLineComment
26, // blockComment
1572, // "/"
-1, // printable**
-1, // printable
1638, // "*"
-1, // blockCommentContent*
-1, // blockCommentContent
582, // "["
295, // "-"
174, // "<"
182, // "|"
-1, // {"?".."@"}
164, // "&"
1357, // ")"
155, // ","
369, // "]"
-1, // {"#".."$"}
387, // ";"
1173, // ">"
1611, // "{"
978, // "%"
1273, // "("
-1, // "\"
319, // "."
246, // ":"
984, // "}"
-1, // {"^" "`" "~"}
995, // "'"
1482, // '"'
418, // {10}
1458, // {13}
-1, // stringPrintable
-1, // recognizeEscapeChar
-1, // charPrintable
792, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
-1, // escapeChars
-1, // token*
-1, // printable*
466, // digit+
-1, // idChar*
883, // letter+
MIN_REDUCTION+157, // $
-1, // $NT
  }
,
{ // state 778
181,MIN_REDUCTION+330, // $NT
  }
,
{ // state 779
128,1304, // white
132,381, // eol
133,1433, // comment
134,565, // oneLineComment
135,26, // blockComment
MIN_REDUCTION+238, // (default reduction)
  }
,
{ // state 780
91,468, // "a"
  }
,
{ // state 781
124,639, // "t"
  }
,
{ // state 782
0x80000000|771, // match move
0x80000000|1236, // no-match move
0x80000000|36, // NT-test-match state for idChar
  }
,
{ // state 783
MIN_REDUCTION+345, // (default reduction)
  }
,
{ // state 784
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+143, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
972, // `!
312, // `!=
1102, // `%
1560, // `&&
293, // `*
647, // `(
123, // `)
1355, // `{
95, // `}
413, // `-
1444, // `+
67, // `=
1322, // `==
109, // `[
551, // `]
1370, // `||
168, // `<
53, // `<=
1559, // `,
604, // `>
1435, // `>=
1247, // `.
1490, // `;
111, // `++
50, // `--
152, // `/
385, // `:
872, // ID
161, // INT_LITERAL
485, // STRING_LITERAL
769, // CHAR_LITERAL
513, // "c"
513, // "l"
513, // "a"
513, // "s"
-1, // idChar
-1, // reserved
513, // "e"
637, // "!"
1360, // "="
1616, // "+"
305, // "0"
566, // digit++
961, // digit
513, // "x"
513, // "X"
-1, // hex
1361, // letter
-1, // "_"
513, // "d"
513, // "g"
513, // "m"
513, // "p"
513, // "v"
513, // "y"
513, // "f"
513, // "i"
513, // {"A".."W" "Y".."Z"}
513, // "o"
513, // "r"
513, // "u"
513, // {"j" "q"}
513, // "b"
513, // "h"
513, // "k"
513, // "n"
513, // "t"
513, // "w"
513, // "z"
305, // {"1".."9"}
1304, // white
1602, // {12}
1602, // " "
1602, // {9}
381, // eol
1433, // comment
565, // oneLineComment
26, // blockComment
1572, // "/"
-1, // printable**
-1, // printable
1638, // "*"
-1, // blockCommentContent*
-1, // blockCommentContent
582, // "["
295, // "-"
174, // "<"
182, // "|"
-1, // {"?".."@"}
164, // "&"
1357, // ")"
155, // ","
369, // "]"
-1, // {"#".."$"}
387, // ";"
1173, // ">"
1611, // "{"
978, // "%"
1273, // "("
-1, // "\"
319, // "."
246, // ":"
984, // "}"
-1, // {"^" "`" "~"}
995, // "'"
1482, // '"'
418, // {10}
1458, // {13}
-1, // stringPrintable
-1, // recognizeEscapeChar
-1, // charPrintable
792, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
-1, // escapeChars
-1, // token*
-1, // printable*
466, // digit+
-1, // idChar*
883, // letter+
MIN_REDUCTION+143, // $
-1, // $NT
  }
,
{ // state 785
0x80000000|300, // match move
0x80000000|1489, // no-match move
0x80000000|1258, // NT-test-match state for reserved
  }
,
{ // state 786
0x80000000|374, // match move
0x80000000|1456, // no-match move
0x80000000|1258, // NT-test-match state for reserved
  }
,
{ // state 787
181,MIN_REDUCTION+282, // $NT
  }
,
{ // state 788
2,1586, // white*
128,1336, // white
129,674, // {12}
130,674, // " "
131,674, // {9}
132,889, // eol
133,775, // comment
134,943, // oneLineComment
135,641, // blockComment
136,1598, // "/"
164,926, // {10}
165,676, // {13}
181,MIN_REDUCTION+290, // $NT
  }
,
{ // state 789
MIN_REDUCTION+133, // (default reduction)
  }
,
{ // state 790
0x80000000|1, // match move
0x80000000|612, // no-match move
0x80000000|36, // NT-test-match state for idChar
  }
,
{ // state 791
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+265, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
972, // `!
312, // `!=
1102, // `%
1560, // `&&
293, // `*
647, // `(
123, // `)
1355, // `{
95, // `}
413, // `-
1444, // `+
67, // `=
1322, // `==
109, // `[
551, // `]
1370, // `||
168, // `<
53, // `<=
1559, // `,
604, // `>
1435, // `>=
1247, // `.
1490, // `;
111, // `++
50, // `--
152, // `/
385, // `:
872, // ID
161, // INT_LITERAL
485, // STRING_LITERAL
769, // CHAR_LITERAL
513, // "c"
513, // "l"
513, // "a"
513, // "s"
-1, // idChar
-1, // reserved
513, // "e"
637, // "!"
1360, // "="
1616, // "+"
305, // "0"
566, // digit++
961, // digit
513, // "x"
513, // "X"
-1, // hex
1361, // letter
-1, // "_"
513, // "d"
513, // "g"
513, // "m"
513, // "p"
513, // "v"
513, // "y"
513, // "f"
513, // "i"
513, // {"A".."W" "Y".."Z"}
513, // "o"
513, // "r"
513, // "u"
513, // {"j" "q"}
513, // "b"
513, // "h"
513, // "k"
513, // "n"
513, // "t"
513, // "w"
513, // "z"
305, // {"1".."9"}
1304, // white
1602, // {12}
1602, // " "
1602, // {9}
381, // eol
1433, // comment
565, // oneLineComment
26, // blockComment
1572, // "/"
-1, // printable**
-1, // printable
1638, // "*"
-1, // blockCommentContent*
-1, // blockCommentContent
582, // "["
295, // "-"
174, // "<"
182, // "|"
-1, // {"?".."@"}
164, // "&"
1357, // ")"
155, // ","
369, // "]"
-1, // {"#".."$"}
387, // ";"
1173, // ">"
1611, // "{"
978, // "%"
1273, // "("
-1, // "\"
319, // "."
246, // ":"
984, // "}"
-1, // {"^" "`" "~"}
995, // "'"
1482, // '"'
418, // {10}
1458, // {13}
-1, // stringPrintable
-1, // recognizeEscapeChar
-1, // charPrintable
792, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
-1, // escapeChars
-1, // token*
-1, // printable*
466, // digit+
-1, // idChar*
883, // letter+
MIN_REDUCTION+265, // $
-1, // $NT
  }
,
{ // state 792
0x80000000|506, // match move
0x80000000|1422, // no-match move
0x80000000|36, // NT-test-match state for idChar
  }
,
{ // state 793
MIN_REDUCTION+371, // (default reduction)
  }
,
{ // state 794
128,620, // white
129,674, // {12}
130,674, // " "
131,674, // {9}
132,889, // eol
133,775, // comment
134,943, // oneLineComment
135,641, // blockComment
136,1598, // "/"
164,926, // {10}
165,676, // {13}
181,MIN_REDUCTION+196, // $NT
  }
,
{ // state 795
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+325, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
972, // `!
312, // `!=
1102, // `%
1560, // `&&
293, // `*
647, // `(
123, // `)
1355, // `{
95, // `}
413, // `-
1444, // `+
67, // `=
1322, // `==
109, // `[
551, // `]
1370, // `||
168, // `<
53, // `<=
1559, // `,
604, // `>
1435, // `>=
1247, // `.
1490, // `;
111, // `++
50, // `--
152, // `/
385, // `:
872, // ID
161, // INT_LITERAL
485, // STRING_LITERAL
769, // CHAR_LITERAL
513, // "c"
513, // "l"
513, // "a"
513, // "s"
-1, // idChar
-1, // reserved
513, // "e"
637, // "!"
1360, // "="
1616, // "+"
305, // "0"
566, // digit++
961, // digit
513, // "x"
513, // "X"
-1, // hex
1361, // letter
-1, // "_"
513, // "d"
513, // "g"
513, // "m"
513, // "p"
513, // "v"
513, // "y"
513, // "f"
513, // "i"
513, // {"A".."W" "Y".."Z"}
513, // "o"
513, // "r"
513, // "u"
513, // {"j" "q"}
513, // "b"
513, // "h"
513, // "k"
513, // "n"
513, // "t"
513, // "w"
513, // "z"
305, // {"1".."9"}
1304, // white
1602, // {12}
1602, // " "
1602, // {9}
381, // eol
1433, // comment
565, // oneLineComment
26, // blockComment
1572, // "/"
-1, // printable**
-1, // printable
1638, // "*"
-1, // blockCommentContent*
-1, // blockCommentContent
582, // "["
295, // "-"
174, // "<"
182, // "|"
-1, // {"?".."@"}
164, // "&"
1357, // ")"
155, // ","
369, // "]"
-1, // {"#".."$"}
387, // ";"
1173, // ">"
1611, // "{"
978, // "%"
1273, // "("
-1, // "\"
319, // "."
246, // ":"
984, // "}"
-1, // {"^" "`" "~"}
995, // "'"
1482, // '"'
418, // {10}
1458, // {13}
-1, // stringPrintable
-1, // recognizeEscapeChar
-1, // charPrintable
792, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
-1, // escapeChars
-1, // token*
-1, // printable*
466, // digit+
-1, // idChar*
883, // letter+
MIN_REDUCTION+325, // $
-1, // $NT
  }
,
{ // state 796
95,149, // "e"
  }
,
{ // state 797
117,834, // "r"
  }
,
{ // state 798
MIN_REDUCTION+8, // (default reduction)
  }
,
{ // state 799
-1, // $$start
-1, // start
610, // white*
-1, // $$0
MIN_REDUCTION+224, // token
1392, // `boolean
1186, // `class
1576, // `extends
798, // `void
1167, // `int
267, // `while
1537, // `if
316, // `else
440, // `for
165, // `break
280, // `this
1368, // `false
1106, // `true
953, // `super
489, // `null
1163, // `return
630, // `instanceof
976, // `new
1330, // `abstract
1402, // `assert
1567, // `byte
27, // `case
833, // `catch
982, // `char
1324, // `const
141, // `continue
115, // `default
1035, // `do
140, // `double
308, // `enum
662, // `final
1021, // `finally
1158, // `float
765, // `goto
1302, // `implements
768, // `import
1514, // `interface
1633, // `long
812, // `native
1233, // `package
245, // `private
339, // `protected
1254, // `public
516, // `short
412, // `static
1491, // `strictfp
832, // `switch
397, // `synchronized
201, // `throw
1108, // `throws
417, // `transient
631, // `try
927, // `volatile
972, // `!
312, // `!=
1102, // `%
1560, // `&&
293, // `*
647, // `(
123, // `)
1355, // `{
95, // `}
413, // `-
1444, // `+
67, // `=
1322, // `==
109, // `[
551, // `]
1370, // `||
168, // `<
53, // `<=
1559, // `,
604, // `>
1435, // `>=
1247, // `.
1490, // `;
111, // `++
50, // `--
152, // `/
385, // `:
-1, // ID
161, // INT_LITERAL
485, // STRING_LITERAL
769, // CHAR_LITERAL
MIN_REDUCTION+224, // "c"
MIN_REDUCTION+224, // "l"
MIN_REDUCTION+224, // "a"
MIN_REDUCTION+224, // "s"
-1, // idChar
-1, // reserved
MIN_REDUCTION+224, // "e"
637, // "!"
1360, // "="
1616, // "+"
MIN_REDUCTION+224, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+224, // "x"
MIN_REDUCTION+224, // "X"
-1, // hex
-1, // letter
-1, // "_"
MIN_REDUCTION+224, // "d"
MIN_REDUCTION+224, // "g"
MIN_REDUCTION+224, // "m"
MIN_REDUCTION+224, // "p"
MIN_REDUCTION+224, // "v"
MIN_REDUCTION+224, // "y"
MIN_REDUCTION+224, // "f"
MIN_REDUCTION+224, // "i"
MIN_REDUCTION+224, // {"A".."W" "Y".."Z"}
MIN_REDUCTION+224, // "o"
MIN_REDUCTION+224, // "r"
MIN_REDUCTION+224, // "u"
MIN_REDUCTION+224, // {"j" "q"}
MIN_REDUCTION+224, // "b"
MIN_REDUCTION+224, // "h"
MIN_REDUCTION+224, // "k"
MIN_REDUCTION+224, // "n"
MIN_REDUCTION+224, // "t"
MIN_REDUCTION+224, // "w"
MIN_REDUCTION+224, // "z"
MIN_REDUCTION+224, // {"1".."9"}
376, // white
1602, // {12}
1602, // " "
1602, // {9}
381, // eol
1433, // comment
565, // oneLineComment
26, // blockComment
1572, // "/"
-1, // printable**
-1, // printable
1638, // "*"
-1, // blockCommentContent*
-1, // blockCommentContent
582, // "["
295, // "-"
174, // "<"
182, // "|"
-1, // {"?".."@"}
164, // "&"
1357, // ")"
155, // ","
369, // "]"
-1, // {"#".."$"}
387, // ";"
1173, // ">"
1611, // "{"
978, // "%"
1273, // "("
-1, // "\"
319, // "."
246, // ":"
984, // "}"
-1, // {"^" "`" "~"}
995, // "'"
1482, // '"'
418, // {10}
1458, // {13}
-1, // stringPrintable
-1, // recognizeEscapeChar
-1, // charPrintable
-1, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
-1, // escapeChars
-1, // token*
-1, // printable*
-1, // digit+
-1, // idChar*
-1, // letter+
MIN_REDUCTION+224, // $
-1, // $NT
  }
,
{ // state 800
114,45, // "i"
  }
,
{ // state 801
128,1304, // white
132,381, // eol
133,1433, // comment
134,565, // oneLineComment
135,26, // blockComment
MIN_REDUCTION+259, // (default reduction)
  }
,
{ // state 802
0x80000000|1269, // match move
0x80000000|741, // no-match move
0x80000000|1258, // NT-test-match state for reserved
  }
,
{ // state 803
4,1037, // token
58,972, // `!
59,312, // `!=
60,1102, // `%
61,1560, // `&&
62,293, // `*
63,647, // `(
64,123, // `)
65,1355, // `{
66,95, // `}
67,413, // `-
68,1444, // `+
69,67, // `=
70,1322, // `==
71,109, // `[
72,551, // `]
73,1370, // `||
74,168, // `<
75,53, // `<=
76,1559, // `,
77,604, // `>
78,1435, // `>=
79,1247, // `.
80,1490, // `;
81,111, // `++
82,50, // `--
83,152, // `/
84,385, // `:
85,872, // ID
86,161, // INT_LITERAL
87,485, // STRING_LITERAL
88,769, // CHAR_LITERAL
89,513, // "c"
90,513, // "l"
91,513, // "a"
92,513, // "s"
95,513, // "e"
96,637, // "!"
97,1360, // "="
98,1616, // "+"
99,305, // "0"
100,566, // digit++
101,961, // digit
102,513, // "x"
103,513, // "X"
105,1361, // letter
107,513, // "d"
108,513, // "g"
109,513, // "m"
110,513, // "p"
111,513, // "v"
112,513, // "y"
113,513, // "f"
114,513, // "i"
115,513, // {"A".."W" "Y".."Z"}
116,513, // "o"
117,513, // "r"
118,513, // "u"
119,513, // {"j" "q"}
120,513, // "b"
121,513, // "h"
122,513, // "k"
123,513, // "n"
124,513, // "t"
125,513, // "w"
126,513, // "z"
127,305, // {"1".."9"}
136,104, // "/"
139,1638, // "*"
142,582, // "["
143,295, // "-"
144,174, // "<"
145,182, // "|"
147,164, // "&"
148,1357, // ")"
149,155, // ","
150,369, // "]"
152,387, // ";"
153,1173, // ">"
154,1611, // "{"
155,978, // "%"
156,1273, // "("
158,319, // "."
159,246, // ":"
160,984, // "}"
162,995, // "'"
163,1482, // '"'
169,792, // letter++
177,466, // digit+
179,883, // letter+
MIN_REDUCTION+376, // (default reduction)
  }
};
}
private class Initter5{
public int doInit(int startIdx) {
  for (int i = 0; i < myParseTable.length; i++) {
    parseTable[i+startIdx] = myParseTable[i];
  }
  return myParseTable.length;
}
private final int[][] myParseTable = {
{ // state 804
123,1039, // "n"
  }
,
{ // state 805
114,426, // "i"
  }
,
{ // state 806
123,589, // "n"
  }
,
{ // state 807
0x80000000|1, // match move
0x80000000|1618, // no-match move
0x80000000|36, // NT-test-match state for idChar
  }
,
{ // state 808
-1, // $$start
-1, // start
1421, // white*
-1, // $$0
MIN_REDUCTION+146, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
972, // `!
312, // `!=
1102, // `%
1560, // `&&
293, // `*
647, // `(
123, // `)
1355, // `{
95, // `}
413, // `-
1444, // `+
67, // `=
1322, // `==
109, // `[
551, // `]
1370, // `||
168, // `<
53, // `<=
1559, // `,
604, // `>
1435, // `>=
1247, // `.
1490, // `;
111, // `++
50, // `--
152, // `/
385, // `:
872, // ID
161, // INT_LITERAL
485, // STRING_LITERAL
769, // CHAR_LITERAL
513, // "c"
513, // "l"
513, // "a"
513, // "s"
-1, // idChar
-1, // reserved
513, // "e"
637, // "!"
1360, // "="
1616, // "+"
305, // "0"
566, // digit++
961, // digit
513, // "x"
513, // "X"
-1, // hex
1361, // letter
-1, // "_"
513, // "d"
513, // "g"
513, // "m"
513, // "p"
513, // "v"
513, // "y"
513, // "f"
513, // "i"
513, // {"A".."W" "Y".."Z"}
513, // "o"
513, // "r"
513, // "u"
513, // {"j" "q"}
513, // "b"
513, // "h"
513, // "k"
513, // "n"
513, // "t"
513, // "w"
513, // "z"
305, // {"1".."9"}
376, // white
1602, // {12}
1602, // " "
1602, // {9}
381, // eol
1433, // comment
565, // oneLineComment
26, // blockComment
1572, // "/"
-1, // printable**
-1, // printable
1638, // "*"
-1, // blockCommentContent*
-1, // blockCommentContent
582, // "["
295, // "-"
174, // "<"
182, // "|"
-1, // {"?".."@"}
164, // "&"
1357, // ")"
155, // ","
369, // "]"
-1, // {"#".."$"}
387, // ";"
1173, // ">"
1611, // "{"
978, // "%"
1273, // "("
-1, // "\"
319, // "."
246, // ":"
984, // "}"
-1, // {"^" "`" "~"}
995, // "'"
1482, // '"'
418, // {10}
1458, // {13}
-1, // stringPrintable
-1, // recognizeEscapeChar
-1, // charPrintable
792, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
-1, // escapeChars
-1, // token*
-1, // printable*
466, // digit+
-1, // idChar*
883, // letter+
MIN_REDUCTION+146, // $
-1, // $NT
  }
,
{ // state 809
95,640, // "e"
  }
,
{ // state 810
0x80000000|229, // match move
0x80000000|130, // no-match move
0x80000000|1258, // NT-test-match state for reserved
  }
,
{ // state 811
MIN_REDUCTION+103, // (default reduction)
  }
,
{ // state 812
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 813
0x80000000|1250, // match move
0x80000000|1418, // no-match move
0x80000000|1258, // NT-test-match state for reserved
  }
,
{ // state 814
97,22, // "="
  }
,
{ // state 815
2,1467, // white*
128,376, // white
132,381, // eol
133,1433, // comment
134,565, // oneLineComment
135,26, // blockComment
MIN_REDUCTION+150, // (default reduction)
  }
,
{ // state 816
0x80000000|1, // match move
0x80000000|949, // no-match move
0x80000000|36, // NT-test-match state for idChar
  }
,
{ // state 817
91,615, // "a"
  }
,
{ // state 818
89,1519, // "c"
  }
,
{ // state 819
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+328, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
972, // `!
312, // `!=
1102, // `%
1560, // `&&
293, // `*
647, // `(
123, // `)
1355, // `{
95, // `}
413, // `-
1444, // `+
67, // `=
1322, // `==
109, // `[
551, // `]
1370, // `||
168, // `<
53, // `<=
1559, // `,
604, // `>
1435, // `>=
1247, // `.
1490, // `;
111, // `++
50, // `--
152, // `/
385, // `:
872, // ID
161, // INT_LITERAL
485, // STRING_LITERAL
769, // CHAR_LITERAL
513, // "c"
513, // "l"
513, // "a"
513, // "s"
-1, // idChar
-1, // reserved
513, // "e"
637, // "!"
1360, // "="
1616, // "+"
305, // "0"
566, // digit++
961, // digit
513, // "x"
513, // "X"
-1, // hex
1361, // letter
-1, // "_"
513, // "d"
513, // "g"
513, // "m"
513, // "p"
513, // "v"
513, // "y"
513, // "f"
513, // "i"
513, // {"A".."W" "Y".."Z"}
513, // "o"
513, // "r"
513, // "u"
513, // {"j" "q"}
513, // "b"
513, // "h"
513, // "k"
513, // "n"
513, // "t"
513, // "w"
513, // "z"
305, // {"1".."9"}
1304, // white
1602, // {12}
1602, // " "
1602, // {9}
381, // eol
1433, // comment
565, // oneLineComment
26, // blockComment
1572, // "/"
-1, // printable**
-1, // printable
1638, // "*"
-1, // blockCommentContent*
-1, // blockCommentContent
582, // "["
295, // "-"
174, // "<"
182, // "|"
-1, // {"?".."@"}
164, // "&"
1357, // ")"
155, // ","
369, // "]"
-1, // {"#".."$"}
387, // ";"
1173, // ">"
1611, // "{"
978, // "%"
1273, // "("
-1, // "\"
319, // "."
246, // ":"
984, // "}"
-1, // {"^" "`" "~"}
995, // "'"
1482, // '"'
418, // {10}
1458, // {13}
-1, // stringPrintable
-1, // recognizeEscapeChar
-1, // charPrintable
792, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
-1, // escapeChars
-1, // token*
-1, // printable*
466, // digit+
-1, // idChar*
883, // letter+
MIN_REDUCTION+328, // $
-1, // $NT
  }
,
{ // state 820
0x80000000|1, // match move
0x80000000|928, // no-match move
0x80000000|36, // NT-test-match state for idChar
  }
,
{ // state 821
0x80000000|473, // match move
0x80000000|46, // no-match move
0x80000000|824, // NT-test-match state for printable
  }
,
{ // state 822
123,361, // "n"
  }
,
{ // state 823
2,717, // white*
MIN_REDUCTION+379, // (default reduction)
  }
,
{ // state 824
89,1015, // "c"
90,1015, // "l"
91,1015, // "a"
92,1015, // "s"
95,1015, // "e"
96,1015, // "!"
97,1015, // "="
98,1015, // "+"
99,1015, // "0"
102,1015, // "x"
103,1015, // "X"
106,1015, // "_"
107,1015, // "d"
108,1015, // "g"
109,1015, // "m"
110,1015, // "p"
111,1015, // "v"
112,1015, // "y"
113,1015, // "f"
114,1015, // "i"
115,1015, // {"A".."W" "Y".."Z"}
116,1015, // "o"
117,1015, // "r"
118,1015, // "u"
119,1015, // {"j" "q"}
120,1015, // "b"
121,1015, // "h"
122,1015, // "k"
123,1015, // "n"
124,1015, // "t"
125,1015, // "w"
126,1015, // "z"
127,1015, // {"1".."9"}
130,1015, // " "
136,1015, // "/"
139,1015, // "*"
142,1015, // "["
143,1015, // "-"
144,1015, // "<"
145,1015, // "|"
146,1015, // {"?".."@"}
147,1015, // "&"
148,1015, // ")"
149,1015, // ","
150,1015, // "]"
151,1015, // {"#".."$"}
152,1015, // ";"
153,1015, // ">"
154,1015, // "{"
155,1015, // "%"
156,1015, // "("
157,1015, // "\"
158,1015, // "."
159,1015, // ":"
160,1015, // "}"
161,1015, // {"^" "`" "~"}
162,1015, // "'"
163,1015, // '"'
  }
,
{ // state 825
128,620, // white
129,674, // {12}
130,674, // " "
131,674, // {9}
132,889, // eol
133,775, // comment
134,943, // oneLineComment
135,641, // blockComment
136,1598, // "/"
164,926, // {10}
165,676, // {13}
181,MIN_REDUCTION+187, // $NT
  }
,
{ // state 826
90,1397, // "l"
  }
,
{ // state 827
-1, // $$start
-1, // start
673, // white*
-1, // $$0
MIN_REDUCTION+182, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
972, // `!
312, // `!=
1102, // `%
1560, // `&&
293, // `*
647, // `(
123, // `)
1355, // `{
95, // `}
413, // `-
1444, // `+
67, // `=
1322, // `==
109, // `[
551, // `]
1370, // `||
168, // `<
53, // `<=
1559, // `,
604, // `>
1435, // `>=
1247, // `.
1490, // `;
111, // `++
50, // `--
152, // `/
385, // `:
872, // ID
161, // INT_LITERAL
485, // STRING_LITERAL
769, // CHAR_LITERAL
513, // "c"
513, // "l"
513, // "a"
513, // "s"
-1, // idChar
-1, // reserved
513, // "e"
637, // "!"
1360, // "="
1616, // "+"
305, // "0"
566, // digit++
961, // digit
513, // "x"
513, // "X"
-1, // hex
1361, // letter
-1, // "_"
513, // "d"
513, // "g"
513, // "m"
513, // "p"
513, // "v"
513, // "y"
513, // "f"
513, // "i"
513, // {"A".."W" "Y".."Z"}
513, // "o"
513, // "r"
513, // "u"
513, // {"j" "q"}
513, // "b"
513, // "h"
513, // "k"
513, // "n"
513, // "t"
513, // "w"
513, // "z"
305, // {"1".."9"}
376, // white
1602, // {12}
1602, // " "
1602, // {9}
381, // eol
1433, // comment
565, // oneLineComment
26, // blockComment
1572, // "/"
-1, // printable**
-1, // printable
1638, // "*"
-1, // blockCommentContent*
-1, // blockCommentContent
582, // "["
295, // "-"
174, // "<"
182, // "|"
-1, // {"?".."@"}
164, // "&"
1357, // ")"
155, // ","
369, // "]"
-1, // {"#".."$"}
387, // ";"
1173, // ">"
1611, // "{"
978, // "%"
1273, // "("
-1, // "\"
319, // "."
246, // ":"
984, // "}"
-1, // {"^" "`" "~"}
995, // "'"
1482, // '"'
418, // {10}
1458, // {13}
-1, // stringPrintable
-1, // recognizeEscapeChar
-1, // charPrintable
792, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
-1, // escapeChars
-1, // token*
-1, // printable*
466, // digit+
-1, // idChar*
883, // letter+
MIN_REDUCTION+182, // $
-1, // $NT
  }
,
{ // state 828
2,1542, // white*
MIN_REDUCTION+152, // (default reduction)
  }
,
{ // state 829
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+220, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
972, // `!
312, // `!=
1102, // `%
1560, // `&&
293, // `*
647, // `(
123, // `)
1355, // `{
95, // `}
413, // `-
1444, // `+
67, // `=
1322, // `==
109, // `[
551, // `]
1370, // `||
168, // `<
53, // `<=
1559, // `,
604, // `>
1435, // `>=
1247, // `.
1490, // `;
111, // `++
50, // `--
152, // `/
385, // `:
872, // ID
161, // INT_LITERAL
485, // STRING_LITERAL
769, // CHAR_LITERAL
513, // "c"
513, // "l"
513, // "a"
513, // "s"
-1, // idChar
-1, // reserved
513, // "e"
637, // "!"
1360, // "="
1616, // "+"
305, // "0"
566, // digit++
961, // digit
513, // "x"
513, // "X"
-1, // hex
1361, // letter
-1, // "_"
513, // "d"
513, // "g"
513, // "m"
513, // "p"
513, // "v"
513, // "y"
513, // "f"
513, // "i"
513, // {"A".."W" "Y".."Z"}
513, // "o"
513, // "r"
513, // "u"
513, // {"j" "q"}
513, // "b"
513, // "h"
513, // "k"
513, // "n"
513, // "t"
513, // "w"
513, // "z"
305, // {"1".."9"}
1304, // white
1602, // {12}
1602, // " "
1602, // {9}
381, // eol
1433, // comment
565, // oneLineComment
26, // blockComment
1572, // "/"
-1, // printable**
-1, // printable
1638, // "*"
-1, // blockCommentContent*
-1, // blockCommentContent
582, // "["
295, // "-"
174, // "<"
182, // "|"
-1, // {"?".."@"}
164, // "&"
1357, // ")"
155, // ","
369, // "]"
-1, // {"#".."$"}
387, // ";"
1173, // ">"
1611, // "{"
978, // "%"
1273, // "("
-1, // "\"
319, // "."
246, // ":"
984, // "}"
-1, // {"^" "`" "~"}
995, // "'"
1482, // '"'
418, // {10}
1458, // {13}
-1, // stringPrintable
-1, // recognizeEscapeChar
-1, // charPrintable
792, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
-1, // escapeChars
-1, // token*
-1, // printable*
466, // digit+
-1, // idChar*
883, // letter+
MIN_REDUCTION+220, // $
-1, // $NT
  }
,
{ // state 830
92,515, // "s"
  }
,
{ // state 831
2,720, // white*
128,376, // white
132,381, // eol
133,1433, // comment
134,565, // oneLineComment
135,26, // blockComment
MIN_REDUCTION+156, // (default reduction)
  }
,
{ // state 832
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 833
MIN_REDUCTION+27, // (default reduction)
  }
,
{ // state 834
113,1284, // "f"
  }
,
{ // state 835
0x80000000|840, // match move
0x80000000|112, // no-match move
0x80000000|824, // NT-test-match state for printable
  }
,
{ // state 836
0x80000000|1328, // match move
0x80000000|373, // no-match move
// T-test match for "0":
99,
  }
,
{ // state 837
124,442, // "t"
  }
,
{ // state 838
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+313, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
972, // `!
312, // `!=
1102, // `%
1560, // `&&
293, // `*
647, // `(
123, // `)
1355, // `{
95, // `}
413, // `-
1444, // `+
67, // `=
1322, // `==
109, // `[
551, // `]
1370, // `||
168, // `<
53, // `<=
1559, // `,
604, // `>
1435, // `>=
1247, // `.
1490, // `;
111, // `++
50, // `--
152, // `/
385, // `:
872, // ID
161, // INT_LITERAL
485, // STRING_LITERAL
769, // CHAR_LITERAL
513, // "c"
513, // "l"
513, // "a"
513, // "s"
-1, // idChar
-1, // reserved
513, // "e"
637, // "!"
1360, // "="
1616, // "+"
305, // "0"
566, // digit++
961, // digit
513, // "x"
513, // "X"
-1, // hex
1361, // letter
-1, // "_"
513, // "d"
513, // "g"
513, // "m"
513, // "p"
513, // "v"
513, // "y"
513, // "f"
513, // "i"
513, // {"A".."W" "Y".."Z"}
513, // "o"
513, // "r"
513, // "u"
513, // {"j" "q"}
513, // "b"
513, // "h"
513, // "k"
513, // "n"
513, // "t"
513, // "w"
513, // "z"
305, // {"1".."9"}
1304, // white
1602, // {12}
1602, // " "
1602, // {9}
381, // eol
1433, // comment
565, // oneLineComment
26, // blockComment
1572, // "/"
-1, // printable**
-1, // printable
1638, // "*"
-1, // blockCommentContent*
-1, // blockCommentContent
582, // "["
295, // "-"
174, // "<"
182, // "|"
-1, // {"?".."@"}
164, // "&"
1357, // ")"
155, // ","
369, // "]"
-1, // {"#".."$"}
387, // ";"
1173, // ">"
1611, // "{"
978, // "%"
1273, // "("
-1, // "\"
319, // "."
246, // ":"
984, // "}"
-1, // {"^" "`" "~"}
995, // "'"
1482, // '"'
418, // {10}
1458, // {13}
-1, // stringPrintable
-1, // recognizeEscapeChar
-1, // charPrintable
792, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
-1, // escapeChars
-1, // token*
-1, // printable*
466, // digit+
-1, // idChar*
883, // letter+
MIN_REDUCTION+313, // $
-1, // $NT
  }
,
{ // state 839
MIN_REDUCTION+117, // (default reduction)
  }
,
{ // state 840
89,821, // "c"
90,821, // "l"
91,821, // "a"
92,821, // "s"
95,821, // "e"
96,821, // "!"
97,821, // "="
98,821, // "+"
99,821, // "0"
102,821, // "x"
103,821, // "X"
106,821, // "_"
107,821, // "d"
108,821, // "g"
109,821, // "m"
110,821, // "p"
111,821, // "v"
112,821, // "y"
113,821, // "f"
114,821, // "i"
115,821, // {"A".."W" "Y".."Z"}
116,821, // "o"
117,821, // "r"
118,821, // "u"
119,821, // {"j" "q"}
120,821, // "b"
121,821, // "h"
122,821, // "k"
123,821, // "n"
124,821, // "t"
125,821, // "w"
126,821, // "z"
127,821, // {"1".."9"}
130,821, // " "
136,821, // "/"
137,1213, // printable**
138,517, // printable
139,821, // "*"
142,821, // "["
143,821, // "-"
144,821, // "<"
145,821, // "|"
146,821, // {"?".."@"}
147,821, // "&"
148,821, // ")"
149,821, // ","
150,821, // "]"
151,821, // {"#".."$"}
152,821, // ";"
153,821, // ">"
154,821, // "{"
155,821, // "%"
156,821, // "("
157,821, // "\"
158,821, // "."
159,821, // ":"
160,821, // "}"
161,821, // {"^" "`" "~"}
162,821, // "'"
163,821, // '"'
176,225, // printable*
  }
,
{ // state 841
118,1238, // "u"
  }
,
{ // state 842
MIN_REDUCTION+348, // (default reduction)
  }
,
{ // state 843
128,1304, // white
132,381, // eol
133,1433, // comment
134,565, // oneLineComment
135,26, // blockComment
MIN_REDUCTION+193, // (default reduction)
  }
,
{ // state 844
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+223, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
972, // `!
312, // `!=
1102, // `%
1560, // `&&
293, // `*
647, // `(
123, // `)
1355, // `{
95, // `}
413, // `-
1444, // `+
67, // `=
1322, // `==
109, // `[
551, // `]
1370, // `||
168, // `<
53, // `<=
1559, // `,
604, // `>
1435, // `>=
1247, // `.
1490, // `;
111, // `++
50, // `--
152, // `/
385, // `:
872, // ID
161, // INT_LITERAL
485, // STRING_LITERAL
769, // CHAR_LITERAL
513, // "c"
513, // "l"
513, // "a"
513, // "s"
-1, // idChar
-1, // reserved
513, // "e"
637, // "!"
1360, // "="
1616, // "+"
305, // "0"
566, // digit++
961, // digit
513, // "x"
513, // "X"
-1, // hex
1361, // letter
-1, // "_"
513, // "d"
513, // "g"
513, // "m"
513, // "p"
513, // "v"
513, // "y"
513, // "f"
513, // "i"
513, // {"A".."W" "Y".."Z"}
513, // "o"
513, // "r"
513, // "u"
513, // {"j" "q"}
513, // "b"
513, // "h"
513, // "k"
513, // "n"
513, // "t"
513, // "w"
513, // "z"
305, // {"1".."9"}
1304, // white
1602, // {12}
1602, // " "
1602, // {9}
381, // eol
1433, // comment
565, // oneLineComment
26, // blockComment
1572, // "/"
-1, // printable**
-1, // printable
1638, // "*"
-1, // blockCommentContent*
-1, // blockCommentContent
582, // "["
295, // "-"
174, // "<"
182, // "|"
-1, // {"?".."@"}
164, // "&"
1357, // ")"
155, // ","
369, // "]"
-1, // {"#".."$"}
387, // ";"
1173, // ">"
1611, // "{"
978, // "%"
1273, // "("
-1, // "\"
319, // "."
246, // ":"
984, // "}"
-1, // {"^" "`" "~"}
995, // "'"
1482, // '"'
418, // {10}
1458, // {13}
-1, // stringPrintable
-1, // recognizeEscapeChar
-1, // charPrintable
792, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
-1, // escapeChars
-1, // token*
-1, // printable*
466, // digit+
-1, // idChar*
883, // letter+
MIN_REDUCTION+223, // $
-1, // $NT
  }
,
{ // state 845
-1, // $$start
-1, // start
902, // white*
-1, // $$0
MIN_REDUCTION+227, // token
1392, // `boolean
1186, // `class
1576, // `extends
798, // `void
1167, // `int
267, // `while
1537, // `if
316, // `else
440, // `for
165, // `break
280, // `this
1368, // `false
1106, // `true
953, // `super
489, // `null
1163, // `return
630, // `instanceof
976, // `new
1330, // `abstract
1402, // `assert
1567, // `byte
27, // `case
833, // `catch
982, // `char
1324, // `const
141, // `continue
115, // `default
1035, // `do
140, // `double
308, // `enum
662, // `final
1021, // `finally
1158, // `float
765, // `goto
1302, // `implements
768, // `import
1514, // `interface
1633, // `long
812, // `native
1233, // `package
245, // `private
339, // `protected
1254, // `public
516, // `short
412, // `static
1491, // `strictfp
832, // `switch
397, // `synchronized
201, // `throw
1108, // `throws
417, // `transient
631, // `try
927, // `volatile
972, // `!
312, // `!=
1102, // `%
1560, // `&&
293, // `*
647, // `(
123, // `)
1355, // `{
95, // `}
413, // `-
1444, // `+
67, // `=
1322, // `==
109, // `[
551, // `]
1370, // `||
168, // `<
53, // `<=
1559, // `,
604, // `>
1435, // `>=
1247, // `.
1490, // `;
111, // `++
50, // `--
152, // `/
385, // `:
-1, // ID
161, // INT_LITERAL
485, // STRING_LITERAL
769, // CHAR_LITERAL
MIN_REDUCTION+227, // "c"
MIN_REDUCTION+227, // "l"
MIN_REDUCTION+227, // "a"
MIN_REDUCTION+227, // "s"
-1, // idChar
-1, // reserved
MIN_REDUCTION+227, // "e"
637, // "!"
1360, // "="
1616, // "+"
MIN_REDUCTION+227, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+227, // "x"
MIN_REDUCTION+227, // "X"
-1, // hex
-1, // letter
-1, // "_"
MIN_REDUCTION+227, // "d"
MIN_REDUCTION+227, // "g"
MIN_REDUCTION+227, // "m"
MIN_REDUCTION+227, // "p"
MIN_REDUCTION+227, // "v"
MIN_REDUCTION+227, // "y"
MIN_REDUCTION+227, // "f"
MIN_REDUCTION+227, // "i"
MIN_REDUCTION+227, // {"A".."W" "Y".."Z"}
MIN_REDUCTION+227, // "o"
MIN_REDUCTION+227, // "r"
MIN_REDUCTION+227, // "u"
MIN_REDUCTION+227, // {"j" "q"}
MIN_REDUCTION+227, // "b"
MIN_REDUCTION+227, // "h"
MIN_REDUCTION+227, // "k"
MIN_REDUCTION+227, // "n"
MIN_REDUCTION+227, // "t"
MIN_REDUCTION+227, // "w"
MIN_REDUCTION+227, // "z"
MIN_REDUCTION+227, // {"1".."9"}
376, // white
1602, // {12}
1602, // " "
1602, // {9}
381, // eol
1433, // comment
565, // oneLineComment
26, // blockComment
1572, // "/"
-1, // printable**
-1, // printable
1638, // "*"
-1, // blockCommentContent*
-1, // blockCommentContent
582, // "["
295, // "-"
174, // "<"
182, // "|"
-1, // {"?".."@"}
164, // "&"
1357, // ")"
155, // ","
369, // "]"
-1, // {"#".."$"}
387, // ";"
1173, // ">"
1611, // "{"
978, // "%"
1273, // "("
-1, // "\"
319, // "."
246, // ":"
984, // "}"
-1, // {"^" "`" "~"}
995, // "'"
1482, // '"'
418, // {10}
1458, // {13}
-1, // stringPrintable
-1, // recognizeEscapeChar
-1, // charPrintable
-1, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
-1, // escapeChars
-1, // token*
-1, // printable*
-1, // digit+
-1, // idChar*
-1, // letter+
MIN_REDUCTION+227, // $
-1, // $NT
  }
,
{ // state 846
-1, // $$start
-1, // start
1315, // white*
-1, // $$0
MIN_REDUCTION+164, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
972, // `!
312, // `!=
1102, // `%
1560, // `&&
293, // `*
647, // `(
123, // `)
1355, // `{
95, // `}
413, // `-
1444, // `+
67, // `=
1322, // `==
109, // `[
551, // `]
1370, // `||
168, // `<
53, // `<=
1559, // `,
604, // `>
1435, // `>=
1247, // `.
1490, // `;
111, // `++
50, // `--
152, // `/
385, // `:
872, // ID
161, // INT_LITERAL
485, // STRING_LITERAL
769, // CHAR_LITERAL
513, // "c"
513, // "l"
513, // "a"
513, // "s"
-1, // idChar
-1, // reserved
513, // "e"
637, // "!"
1360, // "="
1616, // "+"
305, // "0"
566, // digit++
961, // digit
513, // "x"
513, // "X"
-1, // hex
1361, // letter
-1, // "_"
513, // "d"
513, // "g"
513, // "m"
513, // "p"
513, // "v"
513, // "y"
513, // "f"
513, // "i"
513, // {"A".."W" "Y".."Z"}
513, // "o"
513, // "r"
513, // "u"
513, // {"j" "q"}
513, // "b"
513, // "h"
513, // "k"
513, // "n"
513, // "t"
513, // "w"
513, // "z"
305, // {"1".."9"}
376, // white
1602, // {12}
1602, // " "
1602, // {9}
381, // eol
1433, // comment
565, // oneLineComment
26, // blockComment
1572, // "/"
-1, // printable**
-1, // printable
1638, // "*"
-1, // blockCommentContent*
-1, // blockCommentContent
582, // "["
295, // "-"
174, // "<"
182, // "|"
-1, // {"?".."@"}
164, // "&"
1357, // ")"
155, // ","
369, // "]"
-1, // {"#".."$"}
387, // ";"
1173, // ">"
1611, // "{"
978, // "%"
1273, // "("
-1, // "\"
319, // "."
246, // ":"
984, // "}"
-1, // {"^" "`" "~"}
995, // "'"
1482, // '"'
418, // {10}
1458, // {13}
-1, // stringPrintable
-1, // recognizeEscapeChar
-1, // charPrintable
792, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
-1, // escapeChars
-1, // token*
-1, // printable*
466, // digit+
-1, // idChar*
883, // letter+
MIN_REDUCTION+164, // $
-1, // $NT
  }
,
{ // state 847
MIN_REDUCTION+372, // (default reduction)
  }
,
{ // state 848
2,1333, // white*
MIN_REDUCTION+154, // (default reduction)
  }
,
{ // state 849
MIN_REDUCTION+359, // (default reduction)
  }
,
{ // state 850
0x80000000|801, // match move
0x80000000|975, // no-match move
// T-test match for "0":
99,
  }
,
{ // state 851
0x80000000|1295, // match move
0x80000000|19, // no-match move
// T-test match for "0":
99,
  }
,
{ // state 852
MIN_REDUCTION+316, // (default reduction)
  }
,
{ // state 853
123,1580, // "n"
  }
,
{ // state 854
92,1556, // "s"
  }
,
{ // state 855
0x80000000|1082, // match move
0x80000000|732, // no-match move
0x80000000|1258, // NT-test-match state for reserved
  }
,
{ // state 856
-1, // $$start
-1, // start
1467, // white*
-1, // $$0
MIN_REDUCTION+150, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
972, // `!
312, // `!=
1102, // `%
1560, // `&&
293, // `*
647, // `(
123, // `)
1355, // `{
95, // `}
413, // `-
1444, // `+
67, // `=
1322, // `==
109, // `[
551, // `]
1370, // `||
168, // `<
53, // `<=
1559, // `,
604, // `>
1435, // `>=
1247, // `.
1490, // `;
111, // `++
50, // `--
152, // `/
385, // `:
872, // ID
161, // INT_LITERAL
485, // STRING_LITERAL
769, // CHAR_LITERAL
513, // "c"
513, // "l"
513, // "a"
513, // "s"
-1, // idChar
-1, // reserved
513, // "e"
637, // "!"
1360, // "="
1616, // "+"
305, // "0"
566, // digit++
961, // digit
513, // "x"
513, // "X"
-1, // hex
1361, // letter
-1, // "_"
513, // "d"
513, // "g"
513, // "m"
513, // "p"
513, // "v"
513, // "y"
513, // "f"
513, // "i"
513, // {"A".."W" "Y".."Z"}
513, // "o"
513, // "r"
513, // "u"
513, // {"j" "q"}
513, // "b"
513, // "h"
513, // "k"
513, // "n"
513, // "t"
513, // "w"
513, // "z"
305, // {"1".."9"}
376, // white
1602, // {12}
1602, // " "
1602, // {9}
381, // eol
1433, // comment
565, // oneLineComment
26, // blockComment
1572, // "/"
-1, // printable**
-1, // printable
1638, // "*"
-1, // blockCommentContent*
-1, // blockCommentContent
582, // "["
295, // "-"
174, // "<"
182, // "|"
-1, // {"?".."@"}
164, // "&"
1357, // ")"
155, // ","
369, // "]"
-1, // {"#".."$"}
387, // ";"
1173, // ">"
1611, // "{"
978, // "%"
1273, // "("
-1, // "\"
319, // "."
246, // ":"
984, // "}"
-1, // {"^" "`" "~"}
995, // "'"
1482, // '"'
418, // {10}
1458, // {13}
-1, // stringPrintable
-1, // recognizeEscapeChar
-1, // charPrintable
792, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
-1, // escapeChars
-1, // token*
-1, // printable*
466, // digit+
-1, // idChar*
883, // letter+
MIN_REDUCTION+150, // $
-1, // $NT
  }
,
{ // state 857
-1, // $$start
-1, // start
150, // white*
-1, // $$0
MIN_REDUCTION+194, // token
1392, // `boolean
1186, // `class
1576, // `extends
798, // `void
1167, // `int
267, // `while
1537, // `if
316, // `else
440, // `for
165, // `break
280, // `this
1368, // `false
1106, // `true
953, // `super
489, // `null
1163, // `return
630, // `instanceof
976, // `new
1330, // `abstract
1402, // `assert
1567, // `byte
27, // `case
833, // `catch
982, // `char
1324, // `const
141, // `continue
115, // `default
1035, // `do
140, // `double
308, // `enum
662, // `final
1021, // `finally
1158, // `float
765, // `goto
1302, // `implements
768, // `import
1514, // `interface
1633, // `long
812, // `native
1233, // `package
245, // `private
339, // `protected
1254, // `public
516, // `short
412, // `static
1491, // `strictfp
832, // `switch
397, // `synchronized
201, // `throw
1108, // `throws
417, // `transient
631, // `try
927, // `volatile
972, // `!
312, // `!=
1102, // `%
1560, // `&&
293, // `*
647, // `(
123, // `)
1355, // `{
95, // `}
413, // `-
1444, // `+
67, // `=
1322, // `==
109, // `[
551, // `]
1370, // `||
168, // `<
53, // `<=
1559, // `,
604, // `>
1435, // `>=
1247, // `.
1490, // `;
111, // `++
50, // `--
152, // `/
385, // `:
-1, // ID
161, // INT_LITERAL
485, // STRING_LITERAL
769, // CHAR_LITERAL
MIN_REDUCTION+194, // "c"
MIN_REDUCTION+194, // "l"
MIN_REDUCTION+194, // "a"
MIN_REDUCTION+194, // "s"
-1, // idChar
-1, // reserved
MIN_REDUCTION+194, // "e"
637, // "!"
1360, // "="
1616, // "+"
MIN_REDUCTION+194, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+194, // "x"
MIN_REDUCTION+194, // "X"
-1, // hex
-1, // letter
-1, // "_"
MIN_REDUCTION+194, // "d"
MIN_REDUCTION+194, // "g"
MIN_REDUCTION+194, // "m"
MIN_REDUCTION+194, // "p"
MIN_REDUCTION+194, // "v"
MIN_REDUCTION+194, // "y"
MIN_REDUCTION+194, // "f"
MIN_REDUCTION+194, // "i"
MIN_REDUCTION+194, // {"A".."W" "Y".."Z"}
MIN_REDUCTION+194, // "o"
MIN_REDUCTION+194, // "r"
MIN_REDUCTION+194, // "u"
MIN_REDUCTION+194, // {"j" "q"}
MIN_REDUCTION+194, // "b"
MIN_REDUCTION+194, // "h"
MIN_REDUCTION+194, // "k"
MIN_REDUCTION+194, // "n"
MIN_REDUCTION+194, // "t"
MIN_REDUCTION+194, // "w"
MIN_REDUCTION+194, // "z"
MIN_REDUCTION+194, // {"1".."9"}
376, // white
1602, // {12}
1602, // " "
1602, // {9}
381, // eol
1433, // comment
565, // oneLineComment
26, // blockComment
1572, // "/"
-1, // printable**
-1, // printable
1638, // "*"
-1, // blockCommentContent*
-1, // blockCommentContent
582, // "["
295, // "-"
174, // "<"
182, // "|"
-1, // {"?".."@"}
164, // "&"
1357, // ")"
155, // ","
369, // "]"
-1, // {"#".."$"}
387, // ";"
1173, // ">"
1611, // "{"
978, // "%"
1273, // "("
-1, // "\"
319, // "."
246, // ":"
984, // "}"
-1, // {"^" "`" "~"}
995, // "'"
1482, // '"'
418, // {10}
1458, // {13}
-1, // stringPrintable
-1, // recognizeEscapeChar
-1, // charPrintable
-1, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
-1, // escapeChars
-1, // token*
-1, // printable*
-1, // digit+
-1, // idChar*
-1, // letter+
MIN_REDUCTION+194, // $
-1, // $NT
  }
,
{ // state 858
128,1304, // white
132,381, // eol
133,1433, // comment
134,565, // oneLineComment
135,26, // blockComment
MIN_REDUCTION+235, // (default reduction)
  }
,
{ // state 859
128,1304, // white
132,381, // eol
133,1433, // comment
134,565, // oneLineComment
135,26, // blockComment
MIN_REDUCTION+190, // (default reduction)
  }
,
{ // state 860
0x80000000|1191, // match move
0x80000000|1460, // no-match move
0x80000000|1258, // NT-test-match state for reserved
  }
,
{ // state 861
2,693, // white*
128,376, // white
132,381, // eol
133,1433, // comment
134,565, // oneLineComment
135,26, // blockComment
MIN_REDUCTION+96, // (default reduction)
  }
,
{ // state 862
MIN_REDUCTION+351, // (default reduction)
  }
,
{ // state 863
0x80000000|1504, // match move
0x80000000|400, // no-match move
0x80000000|1258, // NT-test-match state for reserved
  }
,
{ // state 864
2,1470, // white*
128,1336, // white
129,674, // {12}
130,674, // " "
131,674, // {9}
132,889, // eol
133,775, // comment
134,943, // oneLineComment
135,641, // blockComment
136,1598, // "/"
164,926, // {10}
165,676, // {13}
181,MIN_REDUCTION+93, // $NT
  }
,
{ // state 865
0x80000000|1354, // match move
0x80000000|294, // no-match move
0x80000000|36, // NT-test-match state for idChar
  }
,
{ // state 866
0x80000000|1, // match move
0x80000000|761, // no-match move
0x80000000|36, // NT-test-match state for idChar
  }
,
{ // state 867
0x80000000|1, // match move
0x80000000|1499, // no-match move
0x80000000|36, // NT-test-match state for idChar
  }
,
{ // state 868
92,1408, // "s"
  }
,
{ // state 869
123,1133, // "n"
  }
,
{ // state 870
0x80000000|386, // match move
0x80000000|1230, // no-match move
// T-test match for "0":
99,
  }
,
{ // state 871
0x80000000|1, // match move
0x80000000|1161, // no-match move
0x80000000|36, // NT-test-match state for idChar
  }
,
{ // state 872
MIN_REDUCTION+85, // (default reduction)
  }
,
{ // state 873
MIN_REDUCTION+342, // (default reduction)
  }
,
{ // state 874
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+205, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
972, // `!
312, // `!=
1102, // `%
1560, // `&&
293, // `*
647, // `(
123, // `)
1355, // `{
95, // `}
413, // `-
1444, // `+
67, // `=
1322, // `==
109, // `[
551, // `]
1370, // `||
168, // `<
53, // `<=
1559, // `,
604, // `>
1435, // `>=
1247, // `.
1490, // `;
111, // `++
50, // `--
152, // `/
385, // `:
872, // ID
161, // INT_LITERAL
485, // STRING_LITERAL
769, // CHAR_LITERAL
513, // "c"
513, // "l"
513, // "a"
513, // "s"
-1, // idChar
-1, // reserved
513, // "e"
637, // "!"
1360, // "="
1616, // "+"
305, // "0"
566, // digit++
961, // digit
513, // "x"
513, // "X"
-1, // hex
1361, // letter
-1, // "_"
513, // "d"
513, // "g"
513, // "m"
513, // "p"
513, // "v"
513, // "y"
513, // "f"
513, // "i"
513, // {"A".."W" "Y".."Z"}
513, // "o"
513, // "r"
513, // "u"
513, // {"j" "q"}
513, // "b"
513, // "h"
513, // "k"
513, // "n"
513, // "t"
513, // "w"
513, // "z"
305, // {"1".."9"}
1304, // white
1602, // {12}
1602, // " "
1602, // {9}
381, // eol
1433, // comment
565, // oneLineComment
26, // blockComment
1572, // "/"
-1, // printable**
-1, // printable
1638, // "*"
-1, // blockCommentContent*
-1, // blockCommentContent
582, // "["
295, // "-"
174, // "<"
182, // "|"
-1, // {"?".."@"}
164, // "&"
1357, // ")"
155, // ","
369, // "]"
-1, // {"#".."$"}
387, // ";"
1173, // ">"
1611, // "{"
978, // "%"
1273, // "("
-1, // "\"
319, // "."
246, // ":"
984, // "}"
-1, // {"^" "`" "~"}
995, // "'"
1482, // '"'
418, // {10}
1458, // {13}
-1, // stringPrintable
-1, // recognizeEscapeChar
-1, // charPrintable
792, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
-1, // escapeChars
-1, // token*
-1, // printable*
466, // digit+
-1, // idChar*
883, // letter+
MIN_REDUCTION+205, // $
-1, // $NT
  }
,
{ // state 875
0x80000000|1386, // match move
0x80000000|1171, // no-match move
// T-test match for {"X" "x"}:
102,
103,
  }
,
{ // state 876
-1, // $$start
-1, // start
173, // white*
-1, // $$0
MIN_REDUCTION+107, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
972, // `!
312, // `!=
1102, // `%
1560, // `&&
293, // `*
647, // `(
123, // `)
1355, // `{
95, // `}
413, // `-
1444, // `+
67, // `=
1322, // `==
109, // `[
551, // `]
1370, // `||
168, // `<
53, // `<=
1559, // `,
604, // `>
1435, // `>=
1247, // `.
1490, // `;
111, // `++
50, // `--
152, // `/
385, // `:
872, // ID
161, // INT_LITERAL
485, // STRING_LITERAL
769, // CHAR_LITERAL
513, // "c"
513, // "l"
513, // "a"
513, // "s"
-1, // idChar
-1, // reserved
513, // "e"
637, // "!"
1360, // "="
1616, // "+"
305, // "0"
566, // digit++
961, // digit
513, // "x"
513, // "X"
-1, // hex
1361, // letter
-1, // "_"
513, // "d"
513, // "g"
513, // "m"
513, // "p"
513, // "v"
513, // "y"
513, // "f"
513, // "i"
513, // {"A".."W" "Y".."Z"}
513, // "o"
513, // "r"
513, // "u"
513, // {"j" "q"}
513, // "b"
513, // "h"
513, // "k"
513, // "n"
513, // "t"
513, // "w"
513, // "z"
305, // {"1".."9"}
376, // white
1602, // {12}
1602, // " "
1602, // {9}
381, // eol
1433, // comment
565, // oneLineComment
26, // blockComment
1572, // "/"
-1, // printable**
-1, // printable
1638, // "*"
-1, // blockCommentContent*
-1, // blockCommentContent
582, // "["
295, // "-"
174, // "<"
182, // "|"
-1, // {"?".."@"}
164, // "&"
1357, // ")"
155, // ","
369, // "]"
-1, // {"#".."$"}
387, // ";"
1173, // ">"
1611, // "{"
978, // "%"
1273, // "("
-1, // "\"
319, // "."
246, // ":"
984, // "}"
-1, // {"^" "`" "~"}
995, // "'"
1482, // '"'
418, // {10}
1458, // {13}
-1, // stringPrintable
-1, // recognizeEscapeChar
-1, // charPrintable
792, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
-1, // escapeChars
-1, // token*
-1, // printable*
466, // digit+
-1, // idChar*
883, // letter+
MIN_REDUCTION+107, // $
-1, // $NT
  }
,
{ // state 877
124,800, // "t"
  }
,
{ // state 878
128,620, // white
129,674, // {12}
130,674, // " "
131,674, // {9}
132,889, // eol
133,775, // comment
134,943, // oneLineComment
135,641, // blockComment
136,1598, // "/"
164,926, // {10}
165,676, // {13}
181,MIN_REDUCTION+319, // $NT
  }
,
{ // state 879
123,160, // "n"
  }
,
{ // state 880
128,1304, // white
132,381, // eol
133,1433, // comment
134,565, // oneLineComment
135,26, // blockComment
MIN_REDUCTION+307, // (default reduction)
  }
,
{ // state 881
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 882
89,401, // "c"
  }
,
{ // state 883
0x80000000|404, // match move
0x80000000|910, // no-match move
0x80000000|36, // NT-test-match state for idChar
  }
,
{ // state 884
2,825, // white*
128,1336, // white
129,674, // {12}
130,674, // " "
131,674, // {9}
132,889, // eol
133,775, // comment
134,943, // oneLineComment
135,641, // blockComment
136,1598, // "/"
164,926, // {10}
165,676, // {13}
181,MIN_REDUCTION+188, // $NT
  }
,
{ // state 885
2,1029, // white*
128,1336, // white
129,674, // {12}
130,674, // " "
131,674, // {9}
132,889, // eol
133,775, // comment
134,943, // oneLineComment
135,641, // blockComment
136,1598, // "/"
164,926, // {10}
165,676, // {13}
181,MIN_REDUCTION+224, // $NT
  }
,
{ // state 886
107,660, // "d"
  }
,
{ // state 887
2,940, // white*
128,376, // white
132,381, // eol
133,1433, // comment
134,565, // oneLineComment
135,26, // blockComment
MIN_REDUCTION+180, // (default reduction)
  }
,
{ // state 888
0x80000000|893, // match move
0x80000000|810, // no-match move
// T-test match for "0":
99,
  }
,
{ // state 889
181,MIN_REDUCTION+114, // $NT
MIN_REDUCTION+114, // (default reduction)
  }
,
{ // state 890
4,1037, // token
5,1392, // `boolean
6,1186, // `class
7,1576, // `extends
8,798, // `void
9,1167, // `int
10,267, // `while
11,1537, // `if
12,316, // `else
13,440, // `for
14,165, // `break
15,280, // `this
16,1368, // `false
17,1106, // `true
18,953, // `super
19,489, // `null
20,1163, // `return
21,630, // `instanceof
22,976, // `new
23,1330, // `abstract
24,1402, // `assert
25,1567, // `byte
26,27, // `case
27,833, // `catch
28,982, // `char
29,1324, // `const
30,141, // `continue
31,115, // `default
32,1035, // `do
33,140, // `double
34,308, // `enum
35,662, // `final
36,1021, // `finally
37,1158, // `float
38,765, // `goto
39,1302, // `implements
40,768, // `import
41,1514, // `interface
42,1633, // `long
43,812, // `native
44,1233, // `package
45,245, // `private
46,339, // `protected
47,1254, // `public
48,516, // `short
49,412, // `static
50,1491, // `strictfp
51,832, // `switch
52,397, // `synchronized
53,201, // `throw
54,1108, // `throws
55,417, // `transient
56,631, // `try
57,927, // `volatile
  }
,
{ // state 891
181,MIN_REDUCTION+288, // $NT
  }
,
{ // state 892
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 893
128,1304, // white
132,381, // eol
133,1433, // comment
134,565, // oneLineComment
135,26, // blockComment
MIN_REDUCTION+175, // (default reduction)
  }
,
{ // state 894
MIN_REDUCTION+112, // (default reduction)
  }
,
{ // state 895
91,405, // "a"
  }
,
{ // state 896
0x80000000|690, // match move
0x80000000|170, // no-match move
0x80000000|1258, // NT-test-match state for reserved
  }
,
{ // state 897
114,913, // "i"
117,900, // "r"
  }
,
{ // state 898
2,1215, // white*
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 899
111,576, // "v"
  }
,
{ // state 900
116,522, // "o"
  }
,
{ // state 901
0x80000000|1, // match move
0x80000000|71, // no-match move
0x80000000|36, // NT-test-match state for idChar
  }
,
{ // state 902
0x80000000|77, // match move
0x80000000|736, // no-match move
// T-test match for "0":
99,
  }
,
{ // state 903
89,MIN_REDUCTION+367, // "c"
90,MIN_REDUCTION+367, // "l"
91,MIN_REDUCTION+367, // "a"
92,MIN_REDUCTION+367, // "s"
95,MIN_REDUCTION+367, // "e"
99,MIN_REDUCTION+367, // "0"
102,MIN_REDUCTION+367, // "x"
103,MIN_REDUCTION+367, // "X"
106,MIN_REDUCTION+367, // "_"
107,MIN_REDUCTION+367, // "d"
108,MIN_REDUCTION+367, // "g"
109,MIN_REDUCTION+367, // "m"
110,MIN_REDUCTION+367, // "p"
111,MIN_REDUCTION+367, // "v"
112,MIN_REDUCTION+367, // "y"
113,MIN_REDUCTION+367, // "f"
114,MIN_REDUCTION+367, // "i"
115,MIN_REDUCTION+367, // {"A".."W" "Y".."Z"}
116,MIN_REDUCTION+367, // "o"
117,MIN_REDUCTION+367, // "r"
118,MIN_REDUCTION+367, // "u"
119,MIN_REDUCTION+367, // {"j" "q"}
120,MIN_REDUCTION+367, // "b"
121,MIN_REDUCTION+367, // "h"
122,MIN_REDUCTION+367, // "k"
123,MIN_REDUCTION+367, // "n"
124,MIN_REDUCTION+367, // "t"
125,MIN_REDUCTION+367, // "w"
126,MIN_REDUCTION+367, // "z"
127,MIN_REDUCTION+367, // {"1".."9"}
170,MIN_REDUCTION+367, // idChar**
MIN_REDUCTION+367, // (default reduction)
  }
,
{ // state 904
2,628, // white*
128,376, // white
132,381, // eol
133,1433, // comment
134,565, // oneLineComment
135,26, // blockComment
MIN_REDUCTION+166, // (default reduction)
  }
,
{ // state 905
91,1606, // "a"
112,313, // "y"
118,1539, // "u"
  }
,
{ // state 906
2,1117, // white*
128,1336, // white
129,674, // {12}
130,674, // " "
131,674, // {9}
132,889, // eol
133,775, // comment
134,943, // oneLineComment
135,641, // blockComment
136,1598, // "/"
164,926, // {10}
165,676, // {13}
181,MIN_REDUCTION+248, // $NT
  }
,
{ // state 907
2,126, // white*
128,1336, // white
129,674, // {12}
130,674, // " "
131,674, // {9}
132,889, // eol
133,775, // comment
134,943, // oneLineComment
135,641, // blockComment
136,1598, // "/"
164,926, // {10}
165,676, // {13}
181,MIN_REDUCTION+329, // $NT
  }
,
{ // state 908
MIN_REDUCTION+127, // (default reduction)
  }
,
{ // state 909
0x80000000|1, // match move
0x80000000|143, // no-match move
0x80000000|36, // NT-test-match state for idChar
  }
,
{ // state 910
0x80000000|1, // match move
0x80000000|903, // no-match move
0x80000000|410, // NT-test-match state for letter
  }
,
{ // state 911
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+141, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
972, // `!
312, // `!=
1102, // `%
1560, // `&&
293, // `*
647, // `(
123, // `)
1355, // `{
95, // `}
413, // `-
1444, // `+
67, // `=
1322, // `==
109, // `[
551, // `]
1370, // `||
168, // `<
53, // `<=
1559, // `,
604, // `>
1435, // `>=
1247, // `.
1490, // `;
111, // `++
50, // `--
152, // `/
385, // `:
872, // ID
161, // INT_LITERAL
485, // STRING_LITERAL
769, // CHAR_LITERAL
513, // "c"
513, // "l"
513, // "a"
513, // "s"
-1, // idChar
-1, // reserved
513, // "e"
637, // "!"
1360, // "="
1616, // "+"
305, // "0"
566, // digit++
961, // digit
513, // "x"
513, // "X"
-1, // hex
1361, // letter
-1, // "_"
513, // "d"
513, // "g"
513, // "m"
513, // "p"
513, // "v"
513, // "y"
513, // "f"
513, // "i"
513, // {"A".."W" "Y".."Z"}
513, // "o"
513, // "r"
513, // "u"
513, // {"j" "q"}
513, // "b"
513, // "h"
513, // "k"
513, // "n"
513, // "t"
513, // "w"
513, // "z"
305, // {"1".."9"}
1304, // white
1602, // {12}
1602, // " "
1602, // {9}
381, // eol
1433, // comment
565, // oneLineComment
26, // blockComment
1572, // "/"
-1, // printable**
-1, // printable
1638, // "*"
-1, // blockCommentContent*
-1, // blockCommentContent
582, // "["
295, // "-"
174, // "<"
182, // "|"
-1, // {"?".."@"}
164, // "&"
1357, // ")"
155, // ","
369, // "]"
-1, // {"#".."$"}
387, // ";"
1173, // ">"
1611, // "{"
978, // "%"
1273, // "("
-1, // "\"
319, // "."
246, // ":"
984, // "}"
-1, // {"^" "`" "~"}
995, // "'"
1482, // '"'
418, // {10}
1458, // {13}
-1, // stringPrintable
-1, // recognizeEscapeChar
-1, // charPrintable
792, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
-1, // escapeChars
-1, // token*
-1, // printable*
466, // digit+
-1, // idChar*
883, // letter+
MIN_REDUCTION+141, // $
-1, // $NT
  }
,
{ // state 912
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 913
92,1105, // "s"
  }
,
{ // state 914
0x80000000|1339, // match move
0x80000000|876, // no-match move
0x80000000|1258, // NT-test-match state for reserved
  }
,
{ // state 915
0x80000000|1, // match move
0x80000000|1017, // no-match move
0x80000000|36, // NT-test-match state for idChar
  }
,
{ // state 916
0x80000000|1151, // match move
0x80000000|448, // no-match move
0x80000000|410, // NT-test-match state for letter
  }
,
{ // state 917
92,1401, // "s"
  }
,
{ // state 918
164,275, // {10}
  }
,
{ // state 919
2,157, // white*
128,1336, // white
129,674, // {12}
130,674, // " "
131,674, // {9}
132,889, // eol
133,775, // comment
134,943, // oneLineComment
135,641, // blockComment
136,1598, // "/"
164,926, // {10}
165,676, // {13}
181,MIN_REDUCTION+90, // $NT
  }
,
{ // state 920
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+316, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
972, // `!
312, // `!=
1102, // `%
1560, // `&&
293, // `*
647, // `(
123, // `)
1355, // `{
95, // `}
413, // `-
1444, // `+
67, // `=
1322, // `==
109, // `[
551, // `]
1370, // `||
168, // `<
53, // `<=
1559, // `,
604, // `>
1435, // `>=
1247, // `.
1490, // `;
111, // `++
50, // `--
152, // `/
385, // `:
872, // ID
161, // INT_LITERAL
485, // STRING_LITERAL
769, // CHAR_LITERAL
513, // "c"
513, // "l"
513, // "a"
513, // "s"
-1, // idChar
-1, // reserved
513, // "e"
637, // "!"
1360, // "="
1616, // "+"
305, // "0"
566, // digit++
961, // digit
513, // "x"
513, // "X"
-1, // hex
1361, // letter
-1, // "_"
513, // "d"
513, // "g"
513, // "m"
513, // "p"
513, // "v"
513, // "y"
513, // "f"
513, // "i"
513, // {"A".."W" "Y".."Z"}
513, // "o"
513, // "r"
513, // "u"
513, // {"j" "q"}
513, // "b"
513, // "h"
513, // "k"
513, // "n"
513, // "t"
513, // "w"
513, // "z"
305, // {"1".."9"}
1304, // white
1602, // {12}
1602, // " "
1602, // {9}
381, // eol
1433, // comment
565, // oneLineComment
26, // blockComment
1572, // "/"
-1, // printable**
-1, // printable
1638, // "*"
-1, // blockCommentContent*
-1, // blockCommentContent
582, // "["
295, // "-"
174, // "<"
182, // "|"
-1, // {"?".."@"}
164, // "&"
1357, // ")"
155, // ","
369, // "]"
-1, // {"#".."$"}
387, // ";"
1173, // ">"
1611, // "{"
978, // "%"
1273, // "("
-1, // "\"
319, // "."
246, // ":"
984, // "}"
-1, // {"^" "`" "~"}
995, // "'"
1482, // '"'
418, // {10}
1458, // {13}
-1, // stringPrintable
-1, // recognizeEscapeChar
-1, // charPrintable
792, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
-1, // escapeChars
-1, // token*
-1, // printable*
466, // digit+
-1, // idChar*
883, // letter+
MIN_REDUCTION+316, // $
-1, // $NT
  }
,
{ // state 921
2,1501, // white*
128,376, // white
132,381, // eol
133,1433, // comment
134,565, // oneLineComment
135,26, // blockComment
MIN_REDUCTION+148, // (default reduction)
  }
,
{ // state 922
0x80000000|1, // match move
0x80000000|151, // no-match move
0x80000000|36, // NT-test-match state for idChar
  }
,
{ // state 923
97,531, // "="
  }
,
{ // state 924
0x80000000|124, // match move
0x80000000|35, // no-match move
0x80000000|1258, // NT-test-match state for reserved
  }
,
{ // state 925
0x80000000|1430, // match move
0x80000000|1329, // no-match move
0x80000000|1258, // NT-test-match state for reserved
  }
,
{ // state 926
181,MIN_REDUCTION+125, // $NT
MIN_REDUCTION+125, // (default reduction)
  }
,
{ // state 927
MIN_REDUCTION+57, // (default reduction)
  }
,
{ // state 928
-1, // $$start
-1, // start
543, // white*
-1, // $$0
MIN_REDUCTION+308, // token
1392, // `boolean
1186, // `class
1576, // `extends
798, // `void
1167, // `int
267, // `while
1537, // `if
316, // `else
440, // `for
165, // `break
280, // `this
1368, // `false
1106, // `true
953, // `super
489, // `null
1163, // `return
630, // `instanceof
976, // `new
1330, // `abstract
1402, // `assert
1567, // `byte
27, // `case
833, // `catch
982, // `char
1324, // `const
141, // `continue
115, // `default
1035, // `do
140, // `double
308, // `enum
662, // `final
1021, // `finally
1158, // `float
765, // `goto
1302, // `implements
768, // `import
1514, // `interface
1633, // `long
812, // `native
1233, // `package
245, // `private
339, // `protected
1254, // `public
516, // `short
412, // `static
1491, // `strictfp
832, // `switch
397, // `synchronized
201, // `throw
1108, // `throws
417, // `transient
631, // `try
927, // `volatile
972, // `!
312, // `!=
1102, // `%
1560, // `&&
293, // `*
647, // `(
123, // `)
1355, // `{
95, // `}
413, // `-
1444, // `+
67, // `=
1322, // `==
109, // `[
551, // `]
1370, // `||
168, // `<
53, // `<=
1559, // `,
604, // `>
1435, // `>=
1247, // `.
1490, // `;
111, // `++
50, // `--
152, // `/
385, // `:
-1, // ID
161, // INT_LITERAL
485, // STRING_LITERAL
769, // CHAR_LITERAL
MIN_REDUCTION+308, // "c"
MIN_REDUCTION+308, // "l"
MIN_REDUCTION+308, // "a"
MIN_REDUCTION+308, // "s"
-1, // idChar
-1, // reserved
MIN_REDUCTION+308, // "e"
637, // "!"
1360, // "="
1616, // "+"
MIN_REDUCTION+308, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+308, // "x"
MIN_REDUCTION+308, // "X"
-1, // hex
-1, // letter
-1, // "_"
MIN_REDUCTION+308, // "d"
MIN_REDUCTION+308, // "g"
MIN_REDUCTION+308, // "m"
MIN_REDUCTION+308, // "p"
MIN_REDUCTION+308, // "v"
MIN_REDUCTION+308, // "y"
MIN_REDUCTION+308, // "f"
MIN_REDUCTION+308, // "i"
MIN_REDUCTION+308, // {"A".."W" "Y".."Z"}
MIN_REDUCTION+308, // "o"
MIN_REDUCTION+308, // "r"
MIN_REDUCTION+308, // "u"
MIN_REDUCTION+308, // {"j" "q"}
MIN_REDUCTION+308, // "b"
MIN_REDUCTION+308, // "h"
MIN_REDUCTION+308, // "k"
MIN_REDUCTION+308, // "n"
MIN_REDUCTION+308, // "t"
MIN_REDUCTION+308, // "w"
MIN_REDUCTION+308, // "z"
MIN_REDUCTION+308, // {"1".."9"}
376, // white
1602, // {12}
1602, // " "
1602, // {9}
381, // eol
1433, // comment
565, // oneLineComment
26, // blockComment
1572, // "/"
-1, // printable**
-1, // printable
1638, // "*"
-1, // blockCommentContent*
-1, // blockCommentContent
582, // "["
295, // "-"
174, // "<"
182, // "|"
-1, // {"?".."@"}
164, // "&"
1357, // ")"
155, // ","
369, // "]"
-1, // {"#".."$"}
387, // ";"
1173, // ">"
1611, // "{"
978, // "%"
1273, // "("
-1, // "\"
319, // "."
246, // ":"
984, // "}"
-1, // {"^" "`" "~"}
995, // "'"
1482, // '"'
418, // {10}
1458, // {13}
-1, // stringPrintable
-1, // recognizeEscapeChar
-1, // charPrintable
-1, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
-1, // escapeChars
-1, // token*
-1, // printable*
-1, // digit+
-1, // idChar*
-1, // letter+
MIN_REDUCTION+308, // $
-1, // $NT
  }
,
{ // state 929
2,888, // white*
MIN_REDUCTION+176, // (default reduction)
  }
,
{ // state 930
128,1304, // white
132,381, // eol
133,1433, // comment
134,565, // oneLineComment
135,26, // blockComment
MIN_REDUCTION+377, // (default reduction)
  }
,
{ // state 931
128,620, // white
129,674, // {12}
130,674, // " "
131,674, // {9}
132,889, // eol
133,775, // comment
134,943, // oneLineComment
135,641, // blockComment
136,1598, // "/"
164,926, // {10}
165,676, // {13}
181,MIN_REDUCTION+271, // $NT
  }
,
{ // state 932
MIN_REDUCTION+112, // (default reduction)
  }
,
{ // state 933
123,1488, // "n"
  }
,
{ // state 934
124,539, // "t"
  }
,
{ // state 935
MIN_REDUCTION+334, // (default reduction)
  }
,
{ // state 936
0x80000000|1, // match move
0x80000000|1453, // no-match move
0x80000000|36, // NT-test-match state for idChar
  }
,
{ // state 937
121,1124, // "h"
  }
,
{ // state 938
91,1441, // "a"
  }
,
{ // state 939
128,620, // white
129,674, // {12}
130,674, // " "
131,674, // {9}
132,889, // eol
133,775, // comment
134,943, // oneLineComment
135,641, // blockComment
136,1598, // "/"
164,926, // {10}
165,676, // {13}
181,MIN_REDUCTION+283, // $NT
  }
,
{ // state 940
0x80000000|1317, // match move
0x80000000|360, // no-match move
// T-test match for "0":
99,
  }
,
{ // state 941
0x80000000|1362, // match move
0x80000000|985, // no-match move
0x80000000|1258, // NT-test-match state for reserved
  }
,
{ // state 942
123,1644, // "n"
  }
,
{ // state 943
181,MIN_REDUCTION+116, // $NT
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 944
2,721, // white*
MIN_REDUCTION+102, // (default reduction)
  }
,
{ // state 945
0x80000000|1241, // match move
0x80000000|669, // no-match move
0x80000000|1258, // NT-test-match state for reserved
  }
,
{ // state 946
MIN_REDUCTION+349, // (default reduction)
  }
,
{ // state 947
128,1304, // white
132,381, // eol
133,1433, // comment
134,565, // oneLineComment
135,26, // blockComment
MIN_REDUCTION+268, // (default reduction)
  }
,
{ // state 948
122,1248, // "k"
  }
,
{ // state 949
-1, // $$start
-1, // start
1135, // white*
-1, // $$0
MIN_REDUCTION+206, // token
1392, // `boolean
1186, // `class
1576, // `extends
798, // `void
1167, // `int
267, // `while
1537, // `if
316, // `else
440, // `for
165, // `break
280, // `this
1368, // `false
1106, // `true
953, // `super
489, // `null
1163, // `return
630, // `instanceof
976, // `new
1330, // `abstract
1402, // `assert
1567, // `byte
27, // `case
833, // `catch
982, // `char
1324, // `const
141, // `continue
115, // `default
1035, // `do
140, // `double
308, // `enum
662, // `final
1021, // `finally
1158, // `float
765, // `goto
1302, // `implements
768, // `import
1514, // `interface
1633, // `long
812, // `native
1233, // `package
245, // `private
339, // `protected
1254, // `public
516, // `short
412, // `static
1491, // `strictfp
832, // `switch
397, // `synchronized
201, // `throw
1108, // `throws
417, // `transient
631, // `try
927, // `volatile
972, // `!
312, // `!=
1102, // `%
1560, // `&&
293, // `*
647, // `(
123, // `)
1355, // `{
95, // `}
413, // `-
1444, // `+
67, // `=
1322, // `==
109, // `[
551, // `]
1370, // `||
168, // `<
53, // `<=
1559, // `,
604, // `>
1435, // `>=
1247, // `.
1490, // `;
111, // `++
50, // `--
152, // `/
385, // `:
-1, // ID
161, // INT_LITERAL
485, // STRING_LITERAL
769, // CHAR_LITERAL
MIN_REDUCTION+206, // "c"
MIN_REDUCTION+206, // "l"
MIN_REDUCTION+206, // "a"
MIN_REDUCTION+206, // "s"
-1, // idChar
-1, // reserved
MIN_REDUCTION+206, // "e"
637, // "!"
1360, // "="
1616, // "+"
MIN_REDUCTION+206, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+206, // "x"
MIN_REDUCTION+206, // "X"
-1, // hex
-1, // letter
-1, // "_"
MIN_REDUCTION+206, // "d"
MIN_REDUCTION+206, // "g"
MIN_REDUCTION+206, // "m"
MIN_REDUCTION+206, // "p"
MIN_REDUCTION+206, // "v"
MIN_REDUCTION+206, // "y"
MIN_REDUCTION+206, // "f"
MIN_REDUCTION+206, // "i"
MIN_REDUCTION+206, // {"A".."W" "Y".."Z"}
MIN_REDUCTION+206, // "o"
MIN_REDUCTION+206, // "r"
MIN_REDUCTION+206, // "u"
MIN_REDUCTION+206, // {"j" "q"}
MIN_REDUCTION+206, // "b"
MIN_REDUCTION+206, // "h"
MIN_REDUCTION+206, // "k"
MIN_REDUCTION+206, // "n"
MIN_REDUCTION+206, // "t"
MIN_REDUCTION+206, // "w"
MIN_REDUCTION+206, // "z"
MIN_REDUCTION+206, // {"1".."9"}
376, // white
1602, // {12}
1602, // " "
1602, // {9}
381, // eol
1433, // comment
565, // oneLineComment
26, // blockComment
1572, // "/"
-1, // printable**
-1, // printable
1638, // "*"
-1, // blockCommentContent*
-1, // blockCommentContent
582, // "["
295, // "-"
174, // "<"
182, // "|"
-1, // {"?".."@"}
164, // "&"
1357, // ")"
155, // ","
369, // "]"
-1, // {"#".."$"}
387, // ";"
1173, // ">"
1611, // "{"
978, // "%"
1273, // "("
-1, // "\"
319, // "."
246, // ":"
984, // "}"
-1, // {"^" "`" "~"}
995, // "'"
1482, // '"'
418, // {10}
1458, // {13}
-1, // stringPrintable
-1, // recognizeEscapeChar
-1, // charPrintable
-1, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
-1, // escapeChars
-1, // token*
-1, // printable*
-1, // digit+
-1, // idChar*
-1, // letter+
MIN_REDUCTION+206, // $
-1, // $NT
  }
,
{ // state 950
89,1276, // "c"
  }
,
{ // state 951
128,1304, // white
132,381, // eol
133,1433, // comment
134,565, // oneLineComment
135,26, // blockComment
MIN_REDUCTION+289, // (default reduction)
  }
,
{ // state 952
0x80000000|93, // match move
0x80000000|1375, // no-match move
// T-test match for "0":
99,
  }
,
{ // state 953
MIN_REDUCTION+18, // (default reduction)
  }
,
{ // state 954
2,1141, // white*
128,1336, // white
129,674, // {12}
130,674, // " "
131,674, // {9}
132,889, // eol
133,775, // comment
134,943, // oneLineComment
135,641, // blockComment
136,1598, // "/"
164,926, // {10}
165,676, // {13}
181,MIN_REDUCTION+296, // $NT
  }
,
{ // state 955
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+173, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
972, // `!
312, // `!=
1102, // `%
1560, // `&&
293, // `*
647, // `(
123, // `)
1355, // `{
95, // `}
413, // `-
1444, // `+
67, // `=
1322, // `==
109, // `[
551, // `]
1370, // `||
168, // `<
53, // `<=
1559, // `,
604, // `>
1435, // `>=
1247, // `.
1490, // `;
111, // `++
50, // `--
152, // `/
385, // `:
872, // ID
161, // INT_LITERAL
485, // STRING_LITERAL
769, // CHAR_LITERAL
513, // "c"
513, // "l"
513, // "a"
513, // "s"
-1, // idChar
-1, // reserved
513, // "e"
637, // "!"
1360, // "="
1616, // "+"
305, // "0"
566, // digit++
961, // digit
513, // "x"
513, // "X"
-1, // hex
1361, // letter
-1, // "_"
513, // "d"
513, // "g"
513, // "m"
513, // "p"
513, // "v"
513, // "y"
513, // "f"
513, // "i"
513, // {"A".."W" "Y".."Z"}
513, // "o"
513, // "r"
513, // "u"
513, // {"j" "q"}
513, // "b"
513, // "h"
513, // "k"
513, // "n"
513, // "t"
513, // "w"
513, // "z"
305, // {"1".."9"}
1304, // white
1602, // {12}
1602, // " "
1602, // {9}
381, // eol
1433, // comment
565, // oneLineComment
26, // blockComment
1572, // "/"
-1, // printable**
-1, // printable
1638, // "*"
-1, // blockCommentContent*
-1, // blockCommentContent
582, // "["
295, // "-"
174, // "<"
182, // "|"
-1, // {"?".."@"}
164, // "&"
1357, // ")"
155, // ","
369, // "]"
-1, // {"#".."$"}
387, // ";"
1173, // ">"
1611, // "{"
978, // "%"
1273, // "("
-1, // "\"
319, // "."
246, // ":"
984, // "}"
-1, // {"^" "`" "~"}
995, // "'"
1482, // '"'
418, // {10}
1458, // {13}
-1, // stringPrintable
-1, // recognizeEscapeChar
-1, // charPrintable
792, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
-1, // escapeChars
-1, // token*
-1, // printable*
466, // digit+
-1, // idChar*
883, // letter+
MIN_REDUCTION+173, // $
-1, // $NT
  }
,
{ // state 956
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+259, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
972, // `!
312, // `!=
1102, // `%
1560, // `&&
293, // `*
647, // `(
123, // `)
1355, // `{
95, // `}
413, // `-
1444, // `+
67, // `=
1322, // `==
109, // `[
551, // `]
1370, // `||
168, // `<
53, // `<=
1559, // `,
604, // `>
1435, // `>=
1247, // `.
1490, // `;
111, // `++
50, // `--
152, // `/
385, // `:
872, // ID
161, // INT_LITERAL
485, // STRING_LITERAL
769, // CHAR_LITERAL
513, // "c"
513, // "l"
513, // "a"
513, // "s"
-1, // idChar
-1, // reserved
513, // "e"
637, // "!"
1360, // "="
1616, // "+"
305, // "0"
566, // digit++
961, // digit
513, // "x"
513, // "X"
-1, // hex
1361, // letter
-1, // "_"
513, // "d"
513, // "g"
513, // "m"
513, // "p"
513, // "v"
513, // "y"
513, // "f"
513, // "i"
513, // {"A".."W" "Y".."Z"}
513, // "o"
513, // "r"
513, // "u"
513, // {"j" "q"}
513, // "b"
513, // "h"
513, // "k"
513, // "n"
513, // "t"
513, // "w"
513, // "z"
305, // {"1".."9"}
1304, // white
1602, // {12}
1602, // " "
1602, // {9}
381, // eol
1433, // comment
565, // oneLineComment
26, // blockComment
1572, // "/"
-1, // printable**
-1, // printable
1638, // "*"
-1, // blockCommentContent*
-1, // blockCommentContent
582, // "["
295, // "-"
174, // "<"
182, // "|"
-1, // {"?".."@"}
164, // "&"
1357, // ")"
155, // ","
369, // "]"
-1, // {"#".."$"}
387, // ";"
1173, // ">"
1611, // "{"
978, // "%"
1273, // "("
-1, // "\"
319, // "."
246, // ":"
984, // "}"
-1, // {"^" "`" "~"}
995, // "'"
1482, // '"'
418, // {10}
1458, // {13}
-1, // stringPrintable
-1, // recognizeEscapeChar
-1, // charPrintable
792, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
-1, // escapeChars
-1, // token*
-1, // printable*
466, // digit+
-1, // idChar*
883, // letter+
MIN_REDUCTION+259, // $
-1, // $NT
  }
,
{ // state 957
-1, // $$start
-1, // start
142, // white*
-1, // $$0
MIN_REDUCTION+162, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
972, // `!
312, // `!=
1102, // `%
1560, // `&&
293, // `*
647, // `(
123, // `)
1355, // `{
95, // `}
413, // `-
1444, // `+
67, // `=
1322, // `==
109, // `[
551, // `]
1370, // `||
168, // `<
53, // `<=
1559, // `,
604, // `>
1435, // `>=
1247, // `.
1490, // `;
111, // `++
50, // `--
152, // `/
385, // `:
872, // ID
161, // INT_LITERAL
485, // STRING_LITERAL
769, // CHAR_LITERAL
513, // "c"
513, // "l"
513, // "a"
513, // "s"
-1, // idChar
-1, // reserved
513, // "e"
637, // "!"
1360, // "="
1616, // "+"
305, // "0"
566, // digit++
961, // digit
513, // "x"
513, // "X"
-1, // hex
1361, // letter
-1, // "_"
513, // "d"
513, // "g"
513, // "m"
513, // "p"
513, // "v"
513, // "y"
513, // "f"
513, // "i"
513, // {"A".."W" "Y".."Z"}
513, // "o"
513, // "r"
513, // "u"
513, // {"j" "q"}
513, // "b"
513, // "h"
513, // "k"
513, // "n"
513, // "t"
513, // "w"
513, // "z"
305, // {"1".."9"}
376, // white
1602, // {12}
1602, // " "
1602, // {9}
381, // eol
1433, // comment
565, // oneLineComment
26, // blockComment
1572, // "/"
-1, // printable**
-1, // printable
1638, // "*"
-1, // blockCommentContent*
-1, // blockCommentContent
582, // "["
295, // "-"
174, // "<"
182, // "|"
-1, // {"?".."@"}
164, // "&"
1357, // ")"
155, // ","
369, // "]"
-1, // {"#".."$"}
387, // ";"
1173, // ">"
1611, // "{"
978, // "%"
1273, // "("
-1, // "\"
319, // "."
246, // ":"
984, // "}"
-1, // {"^" "`" "~"}
995, // "'"
1482, // '"'
418, // {10}
1458, // {13}
-1, // stringPrintable
-1, // recognizeEscapeChar
-1, // charPrintable
792, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
-1, // escapeChars
-1, // token*
-1, // printable*
466, // digit+
-1, // idChar*
883, // letter+
MIN_REDUCTION+162, // $
-1, // $NT
  }
,
{ // state 958
106,MIN_REDUCTION+371, // "_"
170,MIN_REDUCTION+371, // idChar**
MIN_REDUCTION+371, // (default reduction)
  }
,
{ // state 959
126,1545, // "z"
  }
,
{ // state 960
MIN_REDUCTION+354, // (default reduction)
  }
,
{ // state 961
0x80000000|706, // match move
0x80000000|655, // no-match move
0x80000000|54, // NT-test-match state for digit
  }
,
{ // state 962
0x80000000|992, // match move
0x80000000|563, // no-match move
// T-test match for "0":
99,
  }
,
{ // state 963
2,1333, // white*
128,376, // white
132,381, // eol
133,1433, // comment
134,565, // oneLineComment
135,26, // blockComment
MIN_REDUCTION+154, // (default reduction)
  }
,
{ // state 964
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+378, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
972, // `!
312, // `!=
1102, // `%
1560, // `&&
293, // `*
647, // `(
123, // `)
1355, // `{
95, // `}
413, // `-
1444, // `+
67, // `=
1322, // `==
109, // `[
551, // `]
1370, // `||
168, // `<
53, // `<=
1559, // `,
604, // `>
1435, // `>=
1247, // `.
1490, // `;
111, // `++
50, // `--
152, // `/
385, // `:
872, // ID
161, // INT_LITERAL
485, // STRING_LITERAL
769, // CHAR_LITERAL
513, // "c"
513, // "l"
513, // "a"
513, // "s"
-1, // idChar
-1, // reserved
513, // "e"
637, // "!"
1360, // "="
1616, // "+"
305, // "0"
566, // digit++
961, // digit
513, // "x"
513, // "X"
-1, // hex
1361, // letter
-1, // "_"
513, // "d"
513, // "g"
513, // "m"
513, // "p"
513, // "v"
513, // "y"
513, // "f"
513, // "i"
513, // {"A".."W" "Y".."Z"}
513, // "o"
513, // "r"
513, // "u"
513, // {"j" "q"}
513, // "b"
513, // "h"
513, // "k"
513, // "n"
513, // "t"
513, // "w"
513, // "z"
305, // {"1".."9"}
1304, // white
1602, // {12}
1602, // " "
1602, // {9}
381, // eol
1433, // comment
565, // oneLineComment
26, // blockComment
1572, // "/"
-1, // printable**
-1, // printable
1638, // "*"
-1, // blockCommentContent*
-1, // blockCommentContent
582, // "["
295, // "-"
174, // "<"
182, // "|"
-1, // {"?".."@"}
164, // "&"
1357, // ")"
155, // ","
369, // "]"
-1, // {"#".."$"}
387, // ";"
1173, // ">"
1611, // "{"
978, // "%"
1273, // "("
-1, // "\"
319, // "."
246, // ":"
984, // "}"
-1, // {"^" "`" "~"}
995, // "'"
1482, // '"'
418, // {10}
1458, // {13}
-1, // stringPrintable
-1, // recognizeEscapeChar
-1, // charPrintable
792, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
-1, // escapeChars
-1, // token*
-1, // printable*
466, // digit+
-1, // idChar*
883, // letter+
MIN_REDUCTION+378, // $
-1, // $NT
  }
,
{ // state 965
0x80000000|1507, // match move
0x80000000|414, // no-match move
0x80000000|1258, // NT-test-match state for reserved
  }
,
{ // state 966
90,618, // "l"
91,234, // "a"
116,942, // "o"
121,780, // "h"
  }
,
{ // state 967
114,724, // "i"
  }
,
{ // state 968
0x80000000|1414, // match move
0x80000000|1077, // no-match move
0x80000000|36, // NT-test-match state for idChar
  }
,
{ // state 969
114,1636, // "i"
  }
,
{ // state 970
2,471, // white*
MIN_REDUCTION+142, // (default reduction)
  }
,
{ // state 971
128,620, // white
129,674, // {12}
130,674, // " "
131,674, // {9}
132,889, // eol
133,775, // comment
134,943, // oneLineComment
135,641, // blockComment
136,1598, // "/"
164,926, // {10}
165,676, // {13}
181,MIN_REDUCTION+307, // $NT
  }
,
{ // state 972
MIN_REDUCTION+58, // (default reduction)
  }
,
{ // state 973
-1, // $$start
-1, // start
331, // white*
-1, // $$0
MIN_REDUCTION+160, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
972, // `!
312, // `!=
1102, // `%
1560, // `&&
293, // `*
647, // `(
123, // `)
1355, // `{
95, // `}
413, // `-
1444, // `+
67, // `=
1322, // `==
109, // `[
551, // `]
1370, // `||
168, // `<
53, // `<=
1559, // `,
604, // `>
1435, // `>=
1247, // `.
1490, // `;
111, // `++
50, // `--
152, // `/
385, // `:
872, // ID
161, // INT_LITERAL
485, // STRING_LITERAL
769, // CHAR_LITERAL
513, // "c"
513, // "l"
513, // "a"
513, // "s"
-1, // idChar
-1, // reserved
513, // "e"
637, // "!"
1360, // "="
1616, // "+"
305, // "0"
566, // digit++
961, // digit
513, // "x"
513, // "X"
-1, // hex
1361, // letter
-1, // "_"
513, // "d"
513, // "g"
513, // "m"
513, // "p"
513, // "v"
513, // "y"
513, // "f"
513, // "i"
513, // {"A".."W" "Y".."Z"}
513, // "o"
513, // "r"
513, // "u"
513, // {"j" "q"}
513, // "b"
513, // "h"
513, // "k"
513, // "n"
513, // "t"
513, // "w"
513, // "z"
305, // {"1".."9"}
376, // white
1602, // {12}
1602, // " "
1602, // {9}
381, // eol
1433, // comment
565, // oneLineComment
26, // blockComment
1572, // "/"
-1, // printable**
-1, // printable
1638, // "*"
-1, // blockCommentContent*
-1, // blockCommentContent
582, // "["
295, // "-"
174, // "<"
182, // "|"
-1, // {"?".."@"}
164, // "&"
1357, // ")"
155, // ","
369, // "]"
-1, // {"#".."$"}
387, // ";"
1173, // ">"
1611, // "{"
978, // "%"
1273, // "("
-1, // "\"
319, // "."
246, // ":"
984, // "}"
-1, // {"^" "`" "~"}
995, // "'"
1482, // '"'
418, // {10}
1458, // {13}
-1, // stringPrintable
-1, // recognizeEscapeChar
-1, // charPrintable
792, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
-1, // escapeChars
-1, // token*
-1, // printable*
466, // digit+
-1, // idChar*
883, // letter+
MIN_REDUCTION+160, // $
-1, // $NT
  }
,
{ // state 974
MIN_REDUCTION+298, // (default reduction)
  }
,
{ // state 975
0x80000000|1538, // match move
0x80000000|956, // no-match move
0x80000000|1258, // NT-test-match state for reserved
  }
,
{ // state 976
MIN_REDUCTION+22, // (default reduction)
  }
,
{ // state 977
91,253, // "a"
  }
,
{ // state 978
0x80000000|230, // match move
0x80000000|105, // no-match move
// T-test match for "0":
99,
  }
};
}
private class Initter6{
public int doInit(int startIdx) {
  for (int i = 0; i < myParseTable.length; i++) {
    parseTable[i+startIdx] = myParseTable[i];
  }
  return myParseTable.length;
}
private final int[][] myParseTable = {
{ // state 979
MIN_REDUCTION+199, // (default reduction)
  }
,
{ // state 980
MIN_REDUCTION+360, // (default reduction)
  }
,
{ // state 981
116,1502, // "o"
  }
,
{ // state 982
MIN_REDUCTION+28, // (default reduction)
  }
,
{ // state 983
117,1584, // "r"
  }
,
{ // state 984
0x80000000|592, // match move
0x80000000|1020, // no-match move
// T-test match for "0":
99,
  }
,
{ // state 985
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+193, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
972, // `!
312, // `!=
1102, // `%
1560, // `&&
293, // `*
647, // `(
123, // `)
1355, // `{
95, // `}
413, // `-
1444, // `+
67, // `=
1322, // `==
109, // `[
551, // `]
1370, // `||
168, // `<
53, // `<=
1559, // `,
604, // `>
1435, // `>=
1247, // `.
1490, // `;
111, // `++
50, // `--
152, // `/
385, // `:
872, // ID
161, // INT_LITERAL
485, // STRING_LITERAL
769, // CHAR_LITERAL
513, // "c"
513, // "l"
513, // "a"
513, // "s"
-1, // idChar
-1, // reserved
513, // "e"
637, // "!"
1360, // "="
1616, // "+"
305, // "0"
566, // digit++
961, // digit
513, // "x"
513, // "X"
-1, // hex
1361, // letter
-1, // "_"
513, // "d"
513, // "g"
513, // "m"
513, // "p"
513, // "v"
513, // "y"
513, // "f"
513, // "i"
513, // {"A".."W" "Y".."Z"}
513, // "o"
513, // "r"
513, // "u"
513, // {"j" "q"}
513, // "b"
513, // "h"
513, // "k"
513, // "n"
513, // "t"
513, // "w"
513, // "z"
305, // {"1".."9"}
1304, // white
1602, // {12}
1602, // " "
1602, // {9}
381, // eol
1433, // comment
565, // oneLineComment
26, // blockComment
1572, // "/"
-1, // printable**
-1, // printable
1638, // "*"
-1, // blockCommentContent*
-1, // blockCommentContent
582, // "["
295, // "-"
174, // "<"
182, // "|"
-1, // {"?".."@"}
164, // "&"
1357, // ")"
155, // ","
369, // "]"
-1, // {"#".."$"}
387, // ";"
1173, // ">"
1611, // "{"
978, // "%"
1273, // "("
-1, // "\"
319, // "."
246, // ":"
984, // "}"
-1, // {"^" "`" "~"}
995, // "'"
1482, // '"'
418, // {10}
1458, // {13}
-1, // stringPrintable
-1, // recognizeEscapeChar
-1, // charPrintable
792, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
-1, // escapeChars
-1, // token*
-1, // printable*
466, // digit+
-1, // idChar*
883, // letter+
MIN_REDUCTION+193, // $
-1, // $NT
  }
,
{ // state 986
128,620, // white
129,674, // {12}
130,674, // " "
131,674, // {9}
132,889, // eol
133,775, // comment
134,943, // oneLineComment
135,641, // blockComment
136,1598, // "/"
164,926, // {10}
165,676, // {13}
181,MIN_REDUCTION+211, // $NT
  }
,
{ // state 987
3,4, // $$0
4,666, // token
5,1392, // `boolean
6,1186, // `class
7,1576, // `extends
8,798, // `void
9,1167, // `int
10,267, // `while
11,1537, // `if
12,316, // `else
13,440, // `for
14,165, // `break
15,280, // `this
16,1368, // `false
17,1106, // `true
18,953, // `super
19,489, // `null
20,1163, // `return
21,630, // `instanceof
22,976, // `new
23,1330, // `abstract
24,1402, // `assert
25,1567, // `byte
26,27, // `case
27,833, // `catch
28,982, // `char
29,1324, // `const
30,141, // `continue
31,115, // `default
32,1035, // `do
33,140, // `double
34,308, // `enum
35,662, // `final
36,1021, // `finally
37,1158, // `float
38,765, // `goto
39,1302, // `implements
40,768, // `import
41,1514, // `interface
42,1633, // `long
43,812, // `native
44,1233, // `package
45,245, // `private
46,339, // `protected
47,1254, // `public
48,516, // `short
49,412, // `static
50,1491, // `strictfp
51,832, // `switch
52,397, // `synchronized
53,201, // `throw
54,1108, // `throws
55,417, // `transient
56,631, // `try
57,927, // `volatile
89,966, // "c"
90,1448, // "l"
91,1274, // "a"
92,80, // "s"
95,1075, // "e"
107,1178, // "d"
108,1593, // "g"
110,545, // "p"
111,446, // "v"
113,1332, // "f"
114,494, // "i"
117,180, // "r"
120,262, // "b"
123,1266, // "n"
124,205, // "t"
125,1162, // "w"
175,1278, // token*
MIN_REDUCTION+3, // (default reduction)
  }
,
{ // state 988
112,678, // "y"
  }
,
{ // state 989
0x80000000|1436, // match move
0x80000000|912, // no-match move
0x80000000|36, // NT-test-match state for idChar
  }
,
{ // state 990
0x80000000|1503, // match move
0x80000000|1647, // no-match move
// T-test match for "0":
99,
  }
,
{ // state 991
90,664, // "l"
  }
,
{ // state 992
128,1304, // white
132,381, // eol
133,1433, // comment
134,565, // oneLineComment
135,26, // blockComment
MIN_REDUCTION+298, // (default reduction)
  }
,
{ // state 993
181,MIN_REDUCTION+273, // $NT
  }
,
{ // state 994
95,91, // "e"
  }
,
{ // state 995
89,1290, // "c"
90,1290, // "l"
91,1290, // "a"
92,1290, // "s"
95,1290, // "e"
96,789, // "!"
97,1574, // "="
98,1574, // "+"
99,1574, // "0"
102,1290, // "x"
103,1574, // "X"
106,1290, // "_"
107,1290, // "d"
108,1290, // "g"
109,1290, // "m"
110,1290, // "p"
111,1290, // "v"
112,1290, // "y"
113,1290, // "f"
114,1290, // "i"
115,1574, // {"A".."W" "Y".."Z"}
116,1290, // "o"
117,1290, // "r"
118,1290, // "u"
119,1290, // {"j" "q"}
120,1290, // "b"
121,1290, // "h"
122,1290, // "k"
123,1290, // "n"
124,1290, // "t"
125,1290, // "w"
126,1290, // "z"
127,1574, // {"1".."9"}
130,789, // " "
136,1574, // "/"
139,1574, // "*"
142,1574, // "["
143,1574, // "-"
144,1574, // "<"
145,1290, // "|"
146,1574, // {"?".."@"}
147,789, // "&"
148,1574, // ")"
149,1574, // ","
150,1290, // "]"
151,789, // {"#".."$"}
152,1574, // ";"
153,1574, // ">"
154,1290, // "{"
155,789, // "%"
156,1574, // "("
157,574, // "\"
158,1574, // "."
159,1574, // ":"
160,1290, // "}"
161,1290, // {"^" "`" "~"}
163,789, // '"'
167,733, // recognizeEscapeChar
168,686, // charPrintable
174,998, // escapeChars
  }
,
{ // state 996
-1, // $$start
-1, // start
1210, // white*
-1, // $$0
MIN_REDUCTION+272, // token
1392, // `boolean
1186, // `class
1576, // `extends
798, // `void
1167, // `int
267, // `while
1537, // `if
316, // `else
440, // `for
165, // `break
280, // `this
1368, // `false
1106, // `true
953, // `super
489, // `null
1163, // `return
630, // `instanceof
976, // `new
1330, // `abstract
1402, // `assert
1567, // `byte
27, // `case
833, // `catch
982, // `char
1324, // `const
141, // `continue
115, // `default
1035, // `do
140, // `double
308, // `enum
662, // `final
1021, // `finally
1158, // `float
765, // `goto
1302, // `implements
768, // `import
1514, // `interface
1633, // `long
812, // `native
1233, // `package
245, // `private
339, // `protected
1254, // `public
516, // `short
412, // `static
1491, // `strictfp
832, // `switch
397, // `synchronized
201, // `throw
1108, // `throws
417, // `transient
631, // `try
927, // `volatile
972, // `!
312, // `!=
1102, // `%
1560, // `&&
293, // `*
647, // `(
123, // `)
1355, // `{
95, // `}
413, // `-
1444, // `+
67, // `=
1322, // `==
109, // `[
551, // `]
1370, // `||
168, // `<
53, // `<=
1559, // `,
604, // `>
1435, // `>=
1247, // `.
1490, // `;
111, // `++
50, // `--
152, // `/
385, // `:
-1, // ID
161, // INT_LITERAL
485, // STRING_LITERAL
769, // CHAR_LITERAL
MIN_REDUCTION+272, // "c"
MIN_REDUCTION+272, // "l"
MIN_REDUCTION+272, // "a"
MIN_REDUCTION+272, // "s"
-1, // idChar
-1, // reserved
MIN_REDUCTION+272, // "e"
637, // "!"
1360, // "="
1616, // "+"
MIN_REDUCTION+272, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+272, // "x"
MIN_REDUCTION+272, // "X"
-1, // hex
-1, // letter
-1, // "_"
MIN_REDUCTION+272, // "d"
MIN_REDUCTION+272, // "g"
MIN_REDUCTION+272, // "m"
MIN_REDUCTION+272, // "p"
MIN_REDUCTION+272, // "v"
MIN_REDUCTION+272, // "y"
MIN_REDUCTION+272, // "f"
MIN_REDUCTION+272, // "i"
MIN_REDUCTION+272, // {"A".."W" "Y".."Z"}
MIN_REDUCTION+272, // "o"
MIN_REDUCTION+272, // "r"
MIN_REDUCTION+272, // "u"
MIN_REDUCTION+272, // {"j" "q"}
MIN_REDUCTION+272, // "b"
MIN_REDUCTION+272, // "h"
MIN_REDUCTION+272, // "k"
MIN_REDUCTION+272, // "n"
MIN_REDUCTION+272, // "t"
MIN_REDUCTION+272, // "w"
MIN_REDUCTION+272, // "z"
MIN_REDUCTION+272, // {"1".."9"}
376, // white
1602, // {12}
1602, // " "
1602, // {9}
381, // eol
1433, // comment
565, // oneLineComment
26, // blockComment
1572, // "/"
-1, // printable**
-1, // printable
1638, // "*"
-1, // blockCommentContent*
-1, // blockCommentContent
582, // "["
295, // "-"
174, // "<"
182, // "|"
-1, // {"?".."@"}
164, // "&"
1357, // ")"
155, // ","
369, // "]"
-1, // {"#".."$"}
387, // ";"
1173, // ">"
1611, // "{"
978, // "%"
1273, // "("
-1, // "\"
319, // "."
246, // ":"
984, // "}"
-1, // {"^" "`" "~"}
995, // "'"
1482, // '"'
418, // {10}
1458, // {13}
-1, // stringPrintable
-1, // recognizeEscapeChar
-1, // charPrintable
-1, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
-1, // escapeChars
-1, // token*
-1, // printable*
-1, // digit+
-1, // idChar*
-1, // letter+
MIN_REDUCTION+272, // $
-1, // $NT
  }
,
{ // state 997
124,439, // "t"
  }
,
{ // state 998
MIN_REDUCTION+355, // (default reduction)
  }
,
{ // state 999
181,MIN_REDUCTION+276, // $NT
  }
,
{ // state 1000
0x80000000|710, // match move
0x80000000|1214, // no-match move
// T-test match for "0":
99,
  }
,
{ // state 1001
0x80000000|758, // match move
0x80000000|218, // no-match move
// T-test match for 10:
164,
  }
,
{ // state 1002
124,1301, // "t"
  }
,
{ // state 1003
181,MIN_REDUCTION+119, // $NT
MIN_REDUCTION+119, // (default reduction)
  }
,
{ // state 1004
128,620, // white
129,674, // {12}
130,674, // " "
131,674, // {9}
132,889, // eol
133,775, // comment
134,943, // oneLineComment
135,641, // blockComment
136,1598, // "/"
164,926, // {10}
165,676, // {13}
181,MIN_REDUCTION+325, // $NT
  }
,
{ // state 1005
MIN_REDUCTION+346, // (default reduction)
  }
,
{ // state 1006
181,MIN_REDUCTION+279, // $NT
  }
,
{ // state 1007
124,983, // "t"
  }
,
{ // state 1008
MIN_REDUCTION+374, // (default reduction)
  }
,
{ // state 1009
0x80000000|254, // match move
0x80000000|1476, // no-match move
// T-test match for {"*" "/"}:
136,
139,
  }
,
{ // state 1010
90,868, // "l"
  }
,
{ // state 1011
128,620, // white
129,674, // {12}
130,674, // " "
131,674, // {9}
132,889, // eol
133,775, // comment
134,943, // oneLineComment
135,641, // blockComment
136,1598, // "/"
164,926, // {10}
165,676, // {13}
181,MIN_REDUCTION+202, // $NT
  }
,
{ // state 1012
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 1013
181,MIN_REDUCTION+246, // $NT
  }
,
{ // state 1014
0x80000000|848, // match move
0x80000000|1461, // no-match move
0x80000000|1258, // NT-test-match state for reserved
  }
,
{ // state 1015
181,MIN_REDUCTION+128, // $NT
  }
,
{ // state 1016
114,1610, // "i"
  }
,
{ // state 1017
-1, // $$start
-1, // start
317, // white*
-1, // $$0
MIN_REDUCTION+191, // token
1392, // `boolean
1186, // `class
1576, // `extends
798, // `void
1167, // `int
267, // `while
1537, // `if
316, // `else
440, // `for
165, // `break
280, // `this
1368, // `false
1106, // `true
953, // `super
489, // `null
1163, // `return
630, // `instanceof
976, // `new
1330, // `abstract
1402, // `assert
1567, // `byte
27, // `case
833, // `catch
982, // `char
1324, // `const
141, // `continue
115, // `default
1035, // `do
140, // `double
308, // `enum
662, // `final
1021, // `finally
1158, // `float
765, // `goto
1302, // `implements
768, // `import
1514, // `interface
1633, // `long
812, // `native
1233, // `package
245, // `private
339, // `protected
1254, // `public
516, // `short
412, // `static
1491, // `strictfp
832, // `switch
397, // `synchronized
201, // `throw
1108, // `throws
417, // `transient
631, // `try
927, // `volatile
972, // `!
312, // `!=
1102, // `%
1560, // `&&
293, // `*
647, // `(
123, // `)
1355, // `{
95, // `}
413, // `-
1444, // `+
67, // `=
1322, // `==
109, // `[
551, // `]
1370, // `||
168, // `<
53, // `<=
1559, // `,
604, // `>
1435, // `>=
1247, // `.
1490, // `;
111, // `++
50, // `--
152, // `/
385, // `:
-1, // ID
161, // INT_LITERAL
485, // STRING_LITERAL
769, // CHAR_LITERAL
MIN_REDUCTION+191, // "c"
MIN_REDUCTION+191, // "l"
MIN_REDUCTION+191, // "a"
MIN_REDUCTION+191, // "s"
-1, // idChar
-1, // reserved
MIN_REDUCTION+191, // "e"
637, // "!"
1360, // "="
1616, // "+"
MIN_REDUCTION+191, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+191, // "x"
MIN_REDUCTION+191, // "X"
-1, // hex
-1, // letter
-1, // "_"
MIN_REDUCTION+191, // "d"
MIN_REDUCTION+191, // "g"
MIN_REDUCTION+191, // "m"
MIN_REDUCTION+191, // "p"
MIN_REDUCTION+191, // "v"
MIN_REDUCTION+191, // "y"
MIN_REDUCTION+191, // "f"
MIN_REDUCTION+191, // "i"
MIN_REDUCTION+191, // {"A".."W" "Y".."Z"}
MIN_REDUCTION+191, // "o"
MIN_REDUCTION+191, // "r"
MIN_REDUCTION+191, // "u"
MIN_REDUCTION+191, // {"j" "q"}
MIN_REDUCTION+191, // "b"
MIN_REDUCTION+191, // "h"
MIN_REDUCTION+191, // "k"
MIN_REDUCTION+191, // "n"
MIN_REDUCTION+191, // "t"
MIN_REDUCTION+191, // "w"
MIN_REDUCTION+191, // "z"
MIN_REDUCTION+191, // {"1".."9"}
376, // white
1602, // {12}
1602, // " "
1602, // {9}
381, // eol
1433, // comment
565, // oneLineComment
26, // blockComment
1572, // "/"
-1, // printable**
-1, // printable
1638, // "*"
-1, // blockCommentContent*
-1, // blockCommentContent
582, // "["
295, // "-"
174, // "<"
182, // "|"
-1, // {"?".."@"}
164, // "&"
1357, // ")"
155, // ","
369, // "]"
-1, // {"#".."$"}
387, // ";"
1173, // ">"
1611, // "{"
978, // "%"
1273, // "("
-1, // "\"
319, // "."
246, // ":"
984, // "}"
-1, // {"^" "`" "~"}
995, // "'"
1482, // '"'
418, // {10}
1458, // {13}
-1, // stringPrintable
-1, // recognizeEscapeChar
-1, // charPrintable
-1, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
-1, // escapeChars
-1, // token*
-1, // printable*
-1, // digit+
-1, // idChar*
-1, // letter+
MIN_REDUCTION+191, // $
-1, // $NT
  }
,
{ // state 1018
2,673, // white*
128,376, // white
132,381, // eol
133,1433, // comment
134,565, // oneLineComment
135,26, // blockComment
MIN_REDUCTION+182, // (default reduction)
  }
,
{ // state 1019
0x80000000|1483, // match move
0x80000000|1484, // no-match move
0x80000000|36, // NT-test-match state for idChar
  }
,
{ // state 1020
0x80000000|828, // match move
0x80000000|672, // no-match move
0x80000000|1258, // NT-test-match state for reserved
  }
,
{ // state 1021
MIN_REDUCTION+36, // (default reduction)
  }
,
{ // state 1022
0x80000000|1, // match move
0x80000000|372, // no-match move
0x80000000|36, // NT-test-match state for idChar
  }
,
{ // state 1023
92,772, // "s"
  }
,
{ // state 1024
0x80000000|1, // match move
0x80000000|134, // no-match move
0x80000000|36, // NT-test-match state for idChar
  }
,
{ // state 1025
2,142, // white*
MIN_REDUCTION+162, // (default reduction)
  }
,
{ // state 1026
2,1568, // white*
MIN_REDUCTION+170, // (default reduction)
  }
,
{ // state 1027
128,620, // white
129,674, // {12}
130,674, // " "
131,674, // {9}
132,889, // eol
133,775, // comment
134,943, // oneLineComment
135,641, // blockComment
136,1598, // "/"
164,926, // {10}
165,676, // {13}
181,MIN_REDUCTION+274, // $NT
  }
,
{ // state 1028
128,620, // white
129,674, // {12}
130,674, // " "
131,674, // {9}
132,889, // eol
133,775, // comment
134,943, // oneLineComment
135,641, // blockComment
136,1598, // "/"
164,926, // {10}
165,676, // {13}
181,MIN_REDUCTION+322, // $NT
  }
,
{ // state 1029
128,620, // white
129,674, // {12}
130,674, // " "
131,674, // {9}
132,889, // eol
133,775, // comment
134,943, // oneLineComment
135,641, // blockComment
136,1598, // "/"
164,926, // {10}
165,676, // {13}
181,MIN_REDUCTION+223, // $NT
  }
,
{ // state 1030
124,638, // "t"
  }
,
{ // state 1031
110,1229, // "p"
  }
,
{ // state 1032
0x80000000|1, // match move
0x80000000|1147, // no-match move
0x80000000|36, // NT-test-match state for idChar
  }
,
{ // state 1033
0x80000000|343, // match move
0x80000000|434, // no-match move
// T-test match for "0":
99,
  }
,
{ // state 1034
MIN_REDUCTION+171, // (default reduction)
  }
,
{ // state 1035
MIN_REDUCTION+32, // (default reduction)
  }
,
{ // state 1036
0x80000000|1, // match move
0x80000000|544, // no-match move
0x80000000|36, // NT-test-match state for idChar
  }
,
{ // state 1037
MIN_REDUCTION+356, // (default reduction)
  }
,
{ // state 1038
90,1221, // "l"
  }
,
{ // state 1039
107,1481, // "d"
  }
,
{ // state 1040
128,1304, // white
132,381, // eol
133,1433, // comment
134,565, // oneLineComment
135,26, // blockComment
MIN_REDUCTION+220, // (default reduction)
  }
,
{ // state 1041
-1, // $$start
-1, // start
59, // white*
-1, // $$0
MIN_REDUCTION+338, // token
1392, // `boolean
1186, // `class
1576, // `extends
798, // `void
1167, // `int
267, // `while
1537, // `if
316, // `else
440, // `for
165, // `break
280, // `this
1368, // `false
1106, // `true
953, // `super
489, // `null
1163, // `return
630, // `instanceof
976, // `new
1330, // `abstract
1402, // `assert
1567, // `byte
27, // `case
833, // `catch
982, // `char
1324, // `const
141, // `continue
115, // `default
1035, // `do
140, // `double
308, // `enum
662, // `final
1021, // `finally
1158, // `float
765, // `goto
1302, // `implements
768, // `import
1514, // `interface
1633, // `long
812, // `native
1233, // `package
245, // `private
339, // `protected
1254, // `public
516, // `short
412, // `static
1491, // `strictfp
832, // `switch
397, // `synchronized
201, // `throw
1108, // `throws
417, // `transient
631, // `try
927, // `volatile
972, // `!
312, // `!=
1102, // `%
1560, // `&&
293, // `*
647, // `(
123, // `)
1355, // `{
95, // `}
413, // `-
1444, // `+
67, // `=
1322, // `==
109, // `[
551, // `]
1370, // `||
168, // `<
53, // `<=
1559, // `,
604, // `>
1435, // `>=
1247, // `.
1490, // `;
111, // `++
50, // `--
152, // `/
385, // `:
-1, // ID
161, // INT_LITERAL
485, // STRING_LITERAL
769, // CHAR_LITERAL
MIN_REDUCTION+338, // "c"
MIN_REDUCTION+338, // "l"
MIN_REDUCTION+338, // "a"
MIN_REDUCTION+338, // "s"
-1, // idChar
-1, // reserved
MIN_REDUCTION+338, // "e"
637, // "!"
1360, // "="
1616, // "+"
MIN_REDUCTION+338, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+338, // "x"
MIN_REDUCTION+338, // "X"
-1, // hex
-1, // letter
-1, // "_"
MIN_REDUCTION+338, // "d"
MIN_REDUCTION+338, // "g"
MIN_REDUCTION+338, // "m"
MIN_REDUCTION+338, // "p"
MIN_REDUCTION+338, // "v"
MIN_REDUCTION+338, // "y"
MIN_REDUCTION+338, // "f"
MIN_REDUCTION+338, // "i"
MIN_REDUCTION+338, // {"A".."W" "Y".."Z"}
MIN_REDUCTION+338, // "o"
MIN_REDUCTION+338, // "r"
MIN_REDUCTION+338, // "u"
MIN_REDUCTION+338, // {"j" "q"}
MIN_REDUCTION+338, // "b"
MIN_REDUCTION+338, // "h"
MIN_REDUCTION+338, // "k"
MIN_REDUCTION+338, // "n"
MIN_REDUCTION+338, // "t"
MIN_REDUCTION+338, // "w"
MIN_REDUCTION+338, // "z"
MIN_REDUCTION+338, // {"1".."9"}
376, // white
1602, // {12}
1602, // " "
1602, // {9}
381, // eol
1433, // comment
565, // oneLineComment
26, // blockComment
1572, // "/"
-1, // printable**
-1, // printable
1638, // "*"
-1, // blockCommentContent*
-1, // blockCommentContent
582, // "["
295, // "-"
174, // "<"
182, // "|"
-1, // {"?".."@"}
164, // "&"
1357, // ")"
155, // ","
369, // "]"
-1, // {"#".."$"}
387, // ";"
1173, // ">"
1611, // "{"
978, // "%"
1273, // "("
-1, // "\"
319, // "."
246, // ":"
984, // "}"
-1, // {"^" "`" "~"}
995, // "'"
1482, // '"'
418, // {10}
1458, // {13}
-1, // stringPrintable
-1, // recognizeEscapeChar
-1, // charPrintable
-1, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
-1, // escapeChars
-1, // token*
-1, // printable*
-1, // digit+
-1, // idChar*
-1, // letter+
MIN_REDUCTION+338, // $
-1, // $NT
  }
,
{ // state 1042
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+149, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
972, // `!
312, // `!=
1102, // `%
1560, // `&&
293, // `*
647, // `(
123, // `)
1355, // `{
95, // `}
413, // `-
1444, // `+
67, // `=
1322, // `==
109, // `[
551, // `]
1370, // `||
168, // `<
53, // `<=
1559, // `,
604, // `>
1435, // `>=
1247, // `.
1490, // `;
111, // `++
50, // `--
152, // `/
385, // `:
872, // ID
161, // INT_LITERAL
485, // STRING_LITERAL
769, // CHAR_LITERAL
513, // "c"
513, // "l"
513, // "a"
513, // "s"
-1, // idChar
-1, // reserved
513, // "e"
637, // "!"
1360, // "="
1616, // "+"
305, // "0"
566, // digit++
961, // digit
513, // "x"
513, // "X"
-1, // hex
1361, // letter
-1, // "_"
513, // "d"
513, // "g"
513, // "m"
513, // "p"
513, // "v"
513, // "y"
513, // "f"
513, // "i"
513, // {"A".."W" "Y".."Z"}
513, // "o"
513, // "r"
513, // "u"
513, // {"j" "q"}
513, // "b"
513, // "h"
513, // "k"
513, // "n"
513, // "t"
513, // "w"
513, // "z"
305, // {"1".."9"}
1304, // white
1602, // {12}
1602, // " "
1602, // {9}
381, // eol
1433, // comment
565, // oneLineComment
26, // blockComment
1572, // "/"
-1, // printable**
-1, // printable
1638, // "*"
-1, // blockCommentContent*
-1, // blockCommentContent
582, // "["
295, // "-"
174, // "<"
182, // "|"
-1, // {"?".."@"}
164, // "&"
1357, // ")"
155, // ","
369, // "]"
-1, // {"#".."$"}
387, // ";"
1173, // ">"
1611, // "{"
978, // "%"
1273, // "("
-1, // "\"
319, // "."
246, // ":"
984, // "}"
-1, // {"^" "`" "~"}
995, // "'"
1482, // '"'
418, // {10}
1458, // {13}
-1, // stringPrintable
-1, // recognizeEscapeChar
-1, // charPrintable
792, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
-1, // escapeChars
-1, // token*
-1, // printable*
466, // digit+
-1, // idChar*
883, // letter+
MIN_REDUCTION+149, // $
-1, // $NT
  }
,
{ // state 1043
0x80000000|1, // match move
0x80000000|1346, // no-match move
0x80000000|36, // NT-test-match state for idChar
  }
,
{ // state 1044
95,818, // "e"
  }
,
{ // state 1045
-1, // $$start
-1, // start
708, // white*
-1, // $$0
MIN_REDUCTION+281, // token
1392, // `boolean
1186, // `class
1576, // `extends
798, // `void
1167, // `int
267, // `while
1537, // `if
316, // `else
440, // `for
165, // `break
280, // `this
1368, // `false
1106, // `true
953, // `super
489, // `null
1163, // `return
630, // `instanceof
976, // `new
1330, // `abstract
1402, // `assert
1567, // `byte
27, // `case
833, // `catch
982, // `char
1324, // `const
141, // `continue
115, // `default
1035, // `do
140, // `double
308, // `enum
662, // `final
1021, // `finally
1158, // `float
765, // `goto
1302, // `implements
768, // `import
1514, // `interface
1633, // `long
812, // `native
1233, // `package
245, // `private
339, // `protected
1254, // `public
516, // `short
412, // `static
1491, // `strictfp
832, // `switch
397, // `synchronized
201, // `throw
1108, // `throws
417, // `transient
631, // `try
927, // `volatile
972, // `!
312, // `!=
1102, // `%
1560, // `&&
293, // `*
647, // `(
123, // `)
1355, // `{
95, // `}
413, // `-
1444, // `+
67, // `=
1322, // `==
109, // `[
551, // `]
1370, // `||
168, // `<
53, // `<=
1559, // `,
604, // `>
1435, // `>=
1247, // `.
1490, // `;
111, // `++
50, // `--
152, // `/
385, // `:
-1, // ID
161, // INT_LITERAL
485, // STRING_LITERAL
769, // CHAR_LITERAL
MIN_REDUCTION+281, // "c"
MIN_REDUCTION+281, // "l"
MIN_REDUCTION+281, // "a"
MIN_REDUCTION+281, // "s"
-1, // idChar
-1, // reserved
MIN_REDUCTION+281, // "e"
637, // "!"
1360, // "="
1616, // "+"
MIN_REDUCTION+281, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+281, // "x"
MIN_REDUCTION+281, // "X"
-1, // hex
-1, // letter
-1, // "_"
MIN_REDUCTION+281, // "d"
MIN_REDUCTION+281, // "g"
MIN_REDUCTION+281, // "m"
MIN_REDUCTION+281, // "p"
MIN_REDUCTION+281, // "v"
MIN_REDUCTION+281, // "y"
MIN_REDUCTION+281, // "f"
MIN_REDUCTION+281, // "i"
MIN_REDUCTION+281, // {"A".."W" "Y".."Z"}
MIN_REDUCTION+281, // "o"
MIN_REDUCTION+281, // "r"
MIN_REDUCTION+281, // "u"
MIN_REDUCTION+281, // {"j" "q"}
MIN_REDUCTION+281, // "b"
MIN_REDUCTION+281, // "h"
MIN_REDUCTION+281, // "k"
MIN_REDUCTION+281, // "n"
MIN_REDUCTION+281, // "t"
MIN_REDUCTION+281, // "w"
MIN_REDUCTION+281, // "z"
MIN_REDUCTION+281, // {"1".."9"}
376, // white
1602, // {12}
1602, // " "
1602, // {9}
381, // eol
1433, // comment
565, // oneLineComment
26, // blockComment
1572, // "/"
-1, // printable**
-1, // printable
1638, // "*"
-1, // blockCommentContent*
-1, // blockCommentContent
582, // "["
295, // "-"
174, // "<"
182, // "|"
-1, // {"?".."@"}
164, // "&"
1357, // ")"
155, // ","
369, // "]"
-1, // {"#".."$"}
387, // ";"
1173, // ">"
1611, // "{"
978, // "%"
1273, // "("
-1, // "\"
319, // "."
246, // ":"
984, // "}"
-1, // {"^" "`" "~"}
995, // "'"
1482, // '"'
418, // {10}
1458, // {13}
-1, // stringPrintable
-1, // recognizeEscapeChar
-1, // charPrintable
-1, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
-1, // escapeChars
-1, // token*
-1, // printable*
-1, // digit+
-1, // idChar*
-1, // letter+
MIN_REDUCTION+281, // $
-1, // $NT
  }
,
{ // state 1046
92,1352, // "s"
124,968, // "t"
  }
,
{ // state 1047
123,1566, // "n"
  }
,
{ // state 1048
89,1599, // "c"
  }
,
{ // state 1049
0x80000000|776, // match move
0x80000000|248, // no-match move
// T-test match for "0":
99,
  }
,
{ // state 1050
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+187, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
972, // `!
312, // `!=
1102, // `%
1560, // `&&
293, // `*
647, // `(
123, // `)
1355, // `{
95, // `}
413, // `-
1444, // `+
67, // `=
1322, // `==
109, // `[
551, // `]
1370, // `||
168, // `<
53, // `<=
1559, // `,
604, // `>
1435, // `>=
1247, // `.
1490, // `;
111, // `++
50, // `--
152, // `/
385, // `:
872, // ID
161, // INT_LITERAL
485, // STRING_LITERAL
769, // CHAR_LITERAL
513, // "c"
513, // "l"
513, // "a"
513, // "s"
-1, // idChar
-1, // reserved
513, // "e"
637, // "!"
1360, // "="
1616, // "+"
305, // "0"
566, // digit++
961, // digit
513, // "x"
513, // "X"
-1, // hex
1361, // letter
-1, // "_"
513, // "d"
513, // "g"
513, // "m"
513, // "p"
513, // "v"
513, // "y"
513, // "f"
513, // "i"
513, // {"A".."W" "Y".."Z"}
513, // "o"
513, // "r"
513, // "u"
513, // {"j" "q"}
513, // "b"
513, // "h"
513, // "k"
513, // "n"
513, // "t"
513, // "w"
513, // "z"
305, // {"1".."9"}
1304, // white
1602, // {12}
1602, // " "
1602, // {9}
381, // eol
1433, // comment
565, // oneLineComment
26, // blockComment
1572, // "/"
-1, // printable**
-1, // printable
1638, // "*"
-1, // blockCommentContent*
-1, // blockCommentContent
582, // "["
295, // "-"
174, // "<"
182, // "|"
-1, // {"?".."@"}
164, // "&"
1357, // ")"
155, // ","
369, // "]"
-1, // {"#".."$"}
387, // ";"
1173, // ">"
1611, // "{"
978, // "%"
1273, // "("
-1, // "\"
319, // "."
246, // ":"
984, // "}"
-1, // {"^" "`" "~"}
995, // "'"
1482, // '"'
418, // {10}
1458, // {13}
-1, // stringPrintable
-1, // recognizeEscapeChar
-1, // charPrintable
792, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
-1, // escapeChars
-1, // token*
-1, // printable*
466, // digit+
-1, // idChar*
883, // letter+
MIN_REDUCTION+187, // $
-1, // $NT
  }
,
{ // state 1051
0x80000000|337, // match move
0x80000000|760, // no-match move
0x80000000|1258, // NT-test-match state for reserved
  }
,
{ // state 1052
MIN_REDUCTION+313, // (default reduction)
  }
,
{ // state 1053
2,153, // white*
128,376, // white
132,381, // eol
133,1433, // comment
134,565, // oneLineComment
135,26, // blockComment
MIN_REDUCTION+178, // (default reduction)
  }
,
{ // state 1054
2,1568, // white*
128,376, // white
132,381, // eol
133,1433, // comment
134,565, // oneLineComment
135,26, // blockComment
MIN_REDUCTION+170, // (default reduction)
  }
,
{ // state 1055
90,342, // "l"
114,1101, // "i"
  }
,
{ // state 1056
-1, // $$start
-1, // start
851, // white*
-1, // $$0
MIN_REDUCTION+293, // token
1392, // `boolean
1186, // `class
1576, // `extends
798, // `void
1167, // `int
267, // `while
1537, // `if
316, // `else
440, // `for
165, // `break
280, // `this
1368, // `false
1106, // `true
953, // `super
489, // `null
1163, // `return
630, // `instanceof
976, // `new
1330, // `abstract
1402, // `assert
1567, // `byte
27, // `case
833, // `catch
982, // `char
1324, // `const
141, // `continue
115, // `default
1035, // `do
140, // `double
308, // `enum
662, // `final
1021, // `finally
1158, // `float
765, // `goto
1302, // `implements
768, // `import
1514, // `interface
1633, // `long
812, // `native
1233, // `package
245, // `private
339, // `protected
1254, // `public
516, // `short
412, // `static
1491, // `strictfp
832, // `switch
397, // `synchronized
201, // `throw
1108, // `throws
417, // `transient
631, // `try
927, // `volatile
972, // `!
312, // `!=
1102, // `%
1560, // `&&
293, // `*
647, // `(
123, // `)
1355, // `{
95, // `}
413, // `-
1444, // `+
67, // `=
1322, // `==
109, // `[
551, // `]
1370, // `||
168, // `<
53, // `<=
1559, // `,
604, // `>
1435, // `>=
1247, // `.
1490, // `;
111, // `++
50, // `--
152, // `/
385, // `:
-1, // ID
161, // INT_LITERAL
485, // STRING_LITERAL
769, // CHAR_LITERAL
MIN_REDUCTION+293, // "c"
MIN_REDUCTION+293, // "l"
MIN_REDUCTION+293, // "a"
MIN_REDUCTION+293, // "s"
-1, // idChar
-1, // reserved
MIN_REDUCTION+293, // "e"
637, // "!"
1360, // "="
1616, // "+"
MIN_REDUCTION+293, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+293, // "x"
MIN_REDUCTION+293, // "X"
-1, // hex
-1, // letter
-1, // "_"
MIN_REDUCTION+293, // "d"
MIN_REDUCTION+293, // "g"
MIN_REDUCTION+293, // "m"
MIN_REDUCTION+293, // "p"
MIN_REDUCTION+293, // "v"
MIN_REDUCTION+293, // "y"
MIN_REDUCTION+293, // "f"
MIN_REDUCTION+293, // "i"
MIN_REDUCTION+293, // {"A".."W" "Y".."Z"}
MIN_REDUCTION+293, // "o"
MIN_REDUCTION+293, // "r"
MIN_REDUCTION+293, // "u"
MIN_REDUCTION+293, // {"j" "q"}
MIN_REDUCTION+293, // "b"
MIN_REDUCTION+293, // "h"
MIN_REDUCTION+293, // "k"
MIN_REDUCTION+293, // "n"
MIN_REDUCTION+293, // "t"
MIN_REDUCTION+293, // "w"
MIN_REDUCTION+293, // "z"
MIN_REDUCTION+293, // {"1".."9"}
376, // white
1602, // {12}
1602, // " "
1602, // {9}
381, // eol
1433, // comment
565, // oneLineComment
26, // blockComment
1572, // "/"
-1, // printable**
-1, // printable
1638, // "*"
-1, // blockCommentContent*
-1, // blockCommentContent
582, // "["
295, // "-"
174, // "<"
182, // "|"
-1, // {"?".."@"}
164, // "&"
1357, // ")"
155, // ","
369, // "]"
-1, // {"#".."$"}
387, // ";"
1173, // ">"
1611, // "{"
978, // "%"
1273, // "("
-1, // "\"
319, // "."
246, // ":"
984, // "}"
-1, // {"^" "`" "~"}
995, // "'"
1482, // '"'
418, // {10}
1458, // {13}
-1, // stringPrintable
-1, // recognizeEscapeChar
-1, // charPrintable
-1, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
-1, // escapeChars
-1, // token*
-1, // printable*
-1, // digit+
-1, // idChar*
-1, // letter+
MIN_REDUCTION+293, // $
-1, // $NT
  }
,
{ // state 1057
0x80000000|793, // match move
0x80000000|695, // no-match move
0x80000000|410, // NT-test-match state for letter
  }
,
{ // state 1058
89,1513, // "c"
90,1513, // "l"
91,1513, // "a"
92,1513, // "s"
95,1513, // "e"
96,1513, // "!"
97,1513, // "="
98,1513, // "+"
99,1513, // "0"
102,1513, // "x"
103,1513, // "X"
106,1513, // "_"
107,1513, // "d"
108,1513, // "g"
109,1513, // "m"
110,1513, // "p"
111,1513, // "v"
112,1513, // "y"
113,1513, // "f"
114,1513, // "i"
115,1513, // {"A".."W" "Y".."Z"}
116,1513, // "o"
117,1513, // "r"
118,1513, // "u"
119,1513, // {"j" "q"}
120,1513, // "b"
121,1513, // "h"
122,1513, // "k"
123,1513, // "n"
124,1513, // "t"
125,1513, // "w"
126,1513, // "z"
127,1513, // {"1".."9"}
130,1513, // " "
131,1513, // {9}
132,237, // eol
136,1513, // "/"
139,1558, // "*"
140,1527, // blockCommentContent*
141,1510, // blockCommentContent
142,1513, // "["
143,1513, // "-"
144,1513, // "<"
145,1513, // "|"
146,1513, // {"?".."@"}
147,1513, // "&"
148,1513, // ")"
149,1513, // ","
150,1513, // "]"
151,1513, // {"#".."$"}
152,1513, // ";"
153,1513, // ">"
154,1513, // "{"
155,1513, // "%"
156,1513, // "("
157,1513, // "\"
158,1513, // "."
159,1513, // ":"
160,1513, // "}"
161,1513, // {"^" "`" "~"}
162,1513, // "'"
163,1513, // '"'
164,303, // {10}
165,1001, // {13}
  }
,
{ // state 1059
89,1323, // "c"
90,1323, // "l"
91,1323, // "a"
92,1323, // "s"
95,1323, // "e"
96,1342, // "!"
97,505, // "="
98,505, // "+"
99,505, // "0"
102,1323, // "x"
103,505, // "X"
106,1323, // "_"
107,1323, // "d"
108,1323, // "g"
109,1323, // "m"
110,1323, // "p"
111,1323, // "v"
112,1323, // "y"
113,1323, // "f"
114,1323, // "i"
115,505, // {"A".."W" "Y".."Z"}
116,1323, // "o"
117,1323, // "r"
118,1323, // "u"
119,1323, // {"j" "q"}
120,1323, // "b"
121,1323, // "h"
122,1323, // "k"
123,1323, // "n"
124,1323, // "t"
125,1323, // "w"
126,1323, // "z"
127,505, // {"1".."9"}
130,1342, // " "
136,505, // "/"
139,505, // "*"
142,505, // "["
143,505, // "-"
144,505, // "<"
145,1323, // "|"
146,505, // {"?".."@"}
147,505, // "&"
148,505, // ")"
149,505, // ","
150,1323, // "]"
151,505, // {"#".."$"}
152,505, // ";"
153,505, // ">"
154,1323, // "{"
155,505, // "%"
156,505, // "("
157,1201, // "\"
158,505, // "."
159,505, // ":"
160,1323, // "}"
161,1323, // {"^" "`" "~"}
162,505, // "'"
163,1631, // '"'
166,479, // stringPrintable
167,730, // recognizeEscapeChar
173,1283, // $$2
174,675, // escapeChars
  }
,
{ // state 1060
95,886, // "e"
  }
,
{ // state 1061
128,1304, // white
132,381, // eol
133,1433, // comment
134,565, // oneLineComment
135,26, // blockComment
MIN_REDUCTION+334, // (default reduction)
  }
,
{ // state 1062
0x80000000|1, // match move
0x80000000|202, // no-match move
0x80000000|36, // NT-test-match state for idChar
  }
,
{ // state 1063
0x80000000|1, // match move
0x80000000|94, // no-match move
0x80000000|36, // NT-test-match state for idChar
  }
,
{ // state 1064
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+153, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
972, // `!
312, // `!=
1102, // `%
1560, // `&&
293, // `*
647, // `(
123, // `)
1355, // `{
95, // `}
413, // `-
1444, // `+
67, // `=
1322, // `==
109, // `[
551, // `]
1370, // `||
168, // `<
53, // `<=
1559, // `,
604, // `>
1435, // `>=
1247, // `.
1490, // `;
111, // `++
50, // `--
152, // `/
385, // `:
872, // ID
161, // INT_LITERAL
485, // STRING_LITERAL
769, // CHAR_LITERAL
513, // "c"
513, // "l"
513, // "a"
513, // "s"
-1, // idChar
-1, // reserved
513, // "e"
637, // "!"
1360, // "="
1616, // "+"
305, // "0"
566, // digit++
961, // digit
513, // "x"
513, // "X"
-1, // hex
1361, // letter
-1, // "_"
513, // "d"
513, // "g"
513, // "m"
513, // "p"
513, // "v"
513, // "y"
513, // "f"
513, // "i"
513, // {"A".."W" "Y".."Z"}
513, // "o"
513, // "r"
513, // "u"
513, // {"j" "q"}
513, // "b"
513, // "h"
513, // "k"
513, // "n"
513, // "t"
513, // "w"
513, // "z"
305, // {"1".."9"}
1304, // white
1602, // {12}
1602, // " "
1602, // {9}
381, // eol
1433, // comment
565, // oneLineComment
26, // blockComment
1572, // "/"
-1, // printable**
-1, // printable
1638, // "*"
-1, // blockCommentContent*
-1, // blockCommentContent
582, // "["
295, // "-"
174, // "<"
182, // "|"
-1, // {"?".."@"}
164, // "&"
1357, // ")"
155, // ","
369, // "]"
-1, // {"#".."$"}
387, // ";"
1173, // ">"
1611, // "{"
978, // "%"
1273, // "("
-1, // "\"
319, // "."
246, // ":"
984, // "}"
-1, // {"^" "`" "~"}
995, // "'"
1482, // '"'
418, // {10}
1458, // {13}
-1, // stringPrintable
-1, // recognizeEscapeChar
-1, // charPrintable
792, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
-1, // escapeChars
-1, // token*
-1, // printable*
466, // digit+
-1, // idChar*
883, // letter+
MIN_REDUCTION+153, // $
-1, // $NT
  }
,
{ // state 1065
95,1208, // "e"
  }
,
{ // state 1066
128,620, // white
129,674, // {12}
130,674, // " "
131,674, // {9}
132,889, // eol
133,775, // comment
134,943, // oneLineComment
135,641, // blockComment
136,1598, // "/"
164,926, // {10}
165,676, // {13}
181,MIN_REDUCTION+232, // $NT
  }
,
{ // state 1067
0x80000000|841, // match move
0x80000000|1111, // no-match move
0x80000000|36, // NT-test-match state for idChar
  }
,
{ // state 1068
0x80000000|679, // match move
0x80000000|1235, // no-match move
// T-test match for "0":
99,
  }
,
{ // state 1069
0x80000000|1, // match move
0x80000000|845, // no-match move
0x80000000|36, // NT-test-match state for idChar
  }
,
{ // state 1070
MIN_REDUCTION+115, // (default reduction)
  }
,
{ // state 1071
0x80000000|1, // match move
0x80000000|190, // no-match move
0x80000000|36, // NT-test-match state for idChar
  }
,
{ // state 1072
2,1315, // white*
128,376, // white
132,381, // eol
133,1433, // comment
134,565, // oneLineComment
135,26, // blockComment
MIN_REDUCTION+164, // (default reduction)
  }
,
{ // state 1073
136,409, // "/"
  }
,
{ // state 1074
128,1304, // white
132,381, // eol
133,1433, // comment
134,565, // oneLineComment
135,26, // blockComment
MIN_REDUCTION+265, // (default reduction)
  }
,
{ // state 1075
90,256, // "l"
102,837, // "x"
123,608, // "n"
  }
,
{ // state 1076
0x80000000|96, // match move
0x80000000|51, // no-match move
0x80000000|1258, // NT-test-match state for reserved
  }
,
{ // state 1077
-1, // $$start
-1, // start
1512, // white*
-1, // $$0
MIN_REDUCTION+197, // token
1392, // `boolean
1186, // `class
1576, // `extends
798, // `void
1167, // `int
267, // `while
1537, // `if
316, // `else
440, // `for
165, // `break
280, // `this
1368, // `false
1106, // `true
953, // `super
489, // `null
1163, // `return
630, // `instanceof
976, // `new
1330, // `abstract
1402, // `assert
1567, // `byte
27, // `case
833, // `catch
982, // `char
1324, // `const
141, // `continue
115, // `default
1035, // `do
140, // `double
308, // `enum
662, // `final
1021, // `finally
1158, // `float
765, // `goto
1302, // `implements
768, // `import
1514, // `interface
1633, // `long
812, // `native
1233, // `package
245, // `private
339, // `protected
1254, // `public
516, // `short
412, // `static
1491, // `strictfp
832, // `switch
397, // `synchronized
201, // `throw
1108, // `throws
417, // `transient
631, // `try
927, // `volatile
972, // `!
312, // `!=
1102, // `%
1560, // `&&
293, // `*
647, // `(
123, // `)
1355, // `{
95, // `}
413, // `-
1444, // `+
67, // `=
1322, // `==
109, // `[
551, // `]
1370, // `||
168, // `<
53, // `<=
1559, // `,
604, // `>
1435, // `>=
1247, // `.
1490, // `;
111, // `++
50, // `--
152, // `/
385, // `:
-1, // ID
161, // INT_LITERAL
485, // STRING_LITERAL
769, // CHAR_LITERAL
MIN_REDUCTION+197, // "c"
MIN_REDUCTION+197, // "l"
MIN_REDUCTION+197, // "a"
MIN_REDUCTION+197, // "s"
-1, // idChar
-1, // reserved
MIN_REDUCTION+197, // "e"
637, // "!"
1360, // "="
1616, // "+"
MIN_REDUCTION+197, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+197, // "x"
MIN_REDUCTION+197, // "X"
-1, // hex
-1, // letter
-1, // "_"
MIN_REDUCTION+197, // "d"
MIN_REDUCTION+197, // "g"
MIN_REDUCTION+197, // "m"
MIN_REDUCTION+197, // "p"
MIN_REDUCTION+197, // "v"
MIN_REDUCTION+197, // "y"
MIN_REDUCTION+197, // "f"
MIN_REDUCTION+197, // "i"
MIN_REDUCTION+197, // {"A".."W" "Y".."Z"}
MIN_REDUCTION+197, // "o"
MIN_REDUCTION+197, // "r"
MIN_REDUCTION+197, // "u"
MIN_REDUCTION+197, // {"j" "q"}
MIN_REDUCTION+197, // "b"
MIN_REDUCTION+197, // "h"
MIN_REDUCTION+197, // "k"
MIN_REDUCTION+197, // "n"
MIN_REDUCTION+197, // "t"
MIN_REDUCTION+197, // "w"
MIN_REDUCTION+197, // "z"
MIN_REDUCTION+197, // {"1".."9"}
376, // white
1602, // {12}
1602, // " "
1602, // {9}
381, // eol
1433, // comment
565, // oneLineComment
26, // blockComment
1572, // "/"
-1, // printable**
-1, // printable
1638, // "*"
-1, // blockCommentContent*
-1, // blockCommentContent
582, // "["
295, // "-"
174, // "<"
182, // "|"
-1, // {"?".."@"}
164, // "&"
1357, // ")"
155, // ","
369, // "]"
-1, // {"#".."$"}
387, // ";"
1173, // ">"
1611, // "{"
978, // "%"
1273, // "("
-1, // "\"
319, // "."
246, // ":"
984, // "}"
-1, // {"^" "`" "~"}
995, // "'"
1482, // '"'
418, // {10}
1458, // {13}
-1, // stringPrintable
-1, // recognizeEscapeChar
-1, // charPrintable
-1, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
-1, // escapeChars
-1, // token*
-1, // printable*
-1, // digit+
-1, // idChar*
-1, // letter+
MIN_REDUCTION+197, // $
-1, // $NT
  }
,
{ // state 1078
2,1148, // white*
MIN_REDUCTION+140, // (default reduction)
  }
,
{ // state 1079
128,620, // white
129,674, // {12}
130,674, // " "
131,674, // {9}
132,889, // eol
133,775, // comment
134,943, // oneLineComment
135,641, // blockComment
136,1598, // "/"
164,926, // {10}
165,676, // {13}
181,MIN_REDUCTION+268, // $NT
  }
,
{ // state 1080
95,488, // "e"
  }
,
{ // state 1081
0x80000000|1, // match move
0x80000000|215, // no-match move
0x80000000|36, // NT-test-match state for idChar
  }
,
{ // state 1082
2,1313, // white*
MIN_REDUCTION+184, // (default reduction)
  }
,
{ // state 1083
0x80000000|384, // match move
0x80000000|271, // no-match move
// T-test match for "0":
99,
  }
,
{ // state 1084
MIN_REDUCTION+196, // (default reduction)
  }
,
{ // state 1085
MIN_REDUCTION+268, // (default reduction)
  }
,
{ // state 1086
89,1513, // "c"
90,1513, // "l"
91,1513, // "a"
92,1513, // "s"
95,1513, // "e"
96,1513, // "!"
97,1513, // "="
98,1513, // "+"
99,1513, // "0"
102,1513, // "x"
103,1513, // "X"
106,1513, // "_"
107,1513, // "d"
108,1513, // "g"
109,1513, // "m"
110,1513, // "p"
111,1513, // "v"
112,1513, // "y"
113,1513, // "f"
114,1513, // "i"
115,1513, // {"A".."W" "Y".."Z"}
116,1513, // "o"
117,1513, // "r"
118,1513, // "u"
119,1513, // {"j" "q"}
120,1513, // "b"
121,1513, // "h"
122,1513, // "k"
123,1513, // "n"
124,1513, // "t"
125,1513, // "w"
126,1513, // "z"
127,1513, // {"1".."9"}
130,1513, // " "
131,1513, // {9}
132,237, // eol
136,1513, // "/"
139,559, // "*"
140,595, // blockCommentContent*
141,1510, // blockCommentContent
142,1513, // "["
143,1513, // "-"
144,1513, // "<"
145,1513, // "|"
146,1513, // {"?".."@"}
147,1513, // "&"
148,1513, // ")"
149,1513, // ","
150,1513, // "]"
151,1513, // {"#".."$"}
152,1513, // ";"
153,1513, // ">"
154,1513, // "{"
155,1513, // "%"
156,1513, // "("
157,1513, // "\"
158,1513, // "."
159,1513, // ":"
160,1513, // "}"
161,1513, // {"^" "`" "~"}
162,1513, // "'"
163,1513, // '"'
164,303, // {10}
165,1001, // {13}
  }
,
{ // state 1087
95,853, // "e"
  }
,
{ // state 1088
90,1318, // "l"
116,122, // "o"
  }
,
{ // state 1089
-1, // $$start
-1, // start
717, // white*
-1, // $$0
MIN_REDUCTION+379, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
972, // `!
312, // `!=
1102, // `%
1560, // `&&
293, // `*
647, // `(
123, // `)
1355, // `{
95, // `}
413, // `-
1444, // `+
67, // `=
1322, // `==
109, // `[
551, // `]
1370, // `||
168, // `<
53, // `<=
1559, // `,
604, // `>
1435, // `>=
1247, // `.
1490, // `;
111, // `++
50, // `--
152, // `/
385, // `:
872, // ID
161, // INT_LITERAL
485, // STRING_LITERAL
769, // CHAR_LITERAL
513, // "c"
513, // "l"
513, // "a"
513, // "s"
-1, // idChar
-1, // reserved
513, // "e"
637, // "!"
1360, // "="
1616, // "+"
305, // "0"
566, // digit++
961, // digit
513, // "x"
513, // "X"
-1, // hex
1361, // letter
-1, // "_"
513, // "d"
513, // "g"
513, // "m"
513, // "p"
513, // "v"
513, // "y"
513, // "f"
513, // "i"
513, // {"A".."W" "Y".."Z"}
513, // "o"
513, // "r"
513, // "u"
513, // {"j" "q"}
513, // "b"
513, // "h"
513, // "k"
513, // "n"
513, // "t"
513, // "w"
513, // "z"
305, // {"1".."9"}
376, // white
1602, // {12}
1602, // " "
1602, // {9}
381, // eol
1433, // comment
565, // oneLineComment
26, // blockComment
1572, // "/"
-1, // printable**
-1, // printable
1638, // "*"
-1, // blockCommentContent*
-1, // blockCommentContent
582, // "["
295, // "-"
174, // "<"
182, // "|"
-1, // {"?".."@"}
164, // "&"
1357, // ")"
155, // ","
369, // "]"
-1, // {"#".."$"}
387, // ";"
1173, // ">"
1611, // "{"
978, // "%"
1273, // "("
-1, // "\"
319, // "."
246, // ":"
984, // "}"
-1, // {"^" "`" "~"}
995, // "'"
1482, // '"'
418, // {10}
1458, // {13}
-1, // stringPrintable
-1, // recognizeEscapeChar
-1, // charPrintable
792, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
-1, // escapeChars
-1, // token*
-1, // printable*
466, // digit+
-1, // idChar*
883, // letter+
MIN_REDUCTION+379, // $
-1, // $NT
  }
,
{ // state 1090
0x80000000|598, // match move
0x80000000|1518, // no-match move
0x80000000|1258, // NT-test-match state for reserved
  }
,
{ // state 1091
0x80000000|1, // match move
0x80000000|284, // no-match move
0x80000000|36, // NT-test-match state for idChar
  }
,
{ // state 1092
181,MIN_REDUCTION+264, // $NT
  }
,
{ // state 1093
95,1365, // "e"
  }
,
{ // state 1094
0x80000000|131, // match move
0x80000000|996, // no-match move
0x80000000|36, // NT-test-match state for idChar
  }
,
{ // state 1095
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+217, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
972, // `!
312, // `!=
1102, // `%
1560, // `&&
293, // `*
647, // `(
123, // `)
1355, // `{
95, // `}
413, // `-
1444, // `+
67, // `=
1322, // `==
109, // `[
551, // `]
1370, // `||
168, // `<
53, // `<=
1559, // `,
604, // `>
1435, // `>=
1247, // `.
1490, // `;
111, // `++
50, // `--
152, // `/
385, // `:
872, // ID
161, // INT_LITERAL
485, // STRING_LITERAL
769, // CHAR_LITERAL
513, // "c"
513, // "l"
513, // "a"
513, // "s"
-1, // idChar
-1, // reserved
513, // "e"
637, // "!"
1360, // "="
1616, // "+"
305, // "0"
566, // digit++
961, // digit
513, // "x"
513, // "X"
-1, // hex
1361, // letter
-1, // "_"
513, // "d"
513, // "g"
513, // "m"
513, // "p"
513, // "v"
513, // "y"
513, // "f"
513, // "i"
513, // {"A".."W" "Y".."Z"}
513, // "o"
513, // "r"
513, // "u"
513, // {"j" "q"}
513, // "b"
513, // "h"
513, // "k"
513, // "n"
513, // "t"
513, // "w"
513, // "z"
305, // {"1".."9"}
1304, // white
1602, // {12}
1602, // " "
1602, // {9}
381, // eol
1433, // comment
565, // oneLineComment
26, // blockComment
1572, // "/"
-1, // printable**
-1, // printable
1638, // "*"
-1, // blockCommentContent*
-1, // blockCommentContent
582, // "["
295, // "-"
174, // "<"
182, // "|"
-1, // {"?".."@"}
164, // "&"
1357, // ")"
155, // ","
369, // "]"
-1, // {"#".."$"}
387, // ";"
1173, // ">"
1611, // "{"
978, // "%"
1273, // "("
-1, // "\"
319, // "."
246, // ":"
984, // "}"
-1, // {"^" "`" "~"}
995, // "'"
1482, // '"'
418, // {10}
1458, // {13}
-1, // stringPrintable
-1, // recognizeEscapeChar
-1, // charPrintable
792, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
-1, // escapeChars
-1, // token*
-1, // printable*
466, // digit+
-1, // idChar*
883, // letter+
MIN_REDUCTION+217, // $
-1, // $NT
  }
,
{ // state 1096
128,1304, // white
132,381, // eol
133,1433, // comment
134,565, // oneLineComment
135,26, // blockComment
MIN_REDUCTION+165, // (default reduction)
  }
,
{ // state 1097
95,1217, // "e"
  }
,
{ // state 1098
0x80000000|1595, // match move
0x80000000|911, // no-match move
0x80000000|1258, // NT-test-match state for reserved
  }
,
{ // state 1099
116,498, // "o"
  }
,
{ // state 1100
0x80000000|1026, // match move
0x80000000|1416, // no-match move
0x80000000|1258, // NT-test-match state for reserved
  }
,
{ // state 1101
107,1356, // "d"
  }
,
{ // state 1102
MIN_REDUCTION+60, // (default reduction)
  }
,
{ // state 1103
2,396, // white*
128,1336, // white
129,674, // {12}
130,674, // " "
131,674, // {9}
132,889, // eol
133,775, // comment
134,943, // oneLineComment
135,641, // blockComment
136,1598, // "/"
164,926, // {10}
165,676, // {13}
181,MIN_REDUCTION+257, // $NT
  }
,
{ // state 1104
3,4, // $$0
4,666, // token
5,1392, // `boolean
6,1186, // `class
7,1576, // `extends
8,798, // `void
9,1167, // `int
10,267, // `while
11,1537, // `if
12,316, // `else
13,440, // `for
14,165, // `break
15,280, // `this
16,1368, // `false
17,1106, // `true
18,953, // `super
19,489, // `null
20,1163, // `return
21,630, // `instanceof
22,976, // `new
23,1330, // `abstract
24,1402, // `assert
25,1567, // `byte
26,27, // `case
27,833, // `catch
28,982, // `char
29,1324, // `const
30,141, // `continue
31,115, // `default
32,1035, // `do
33,140, // `double
34,308, // `enum
35,662, // `final
36,1021, // `finally
37,1158, // `float
38,765, // `goto
39,1302, // `implements
40,768, // `import
41,1514, // `interface
42,1633, // `long
43,812, // `native
44,1233, // `package
45,245, // `private
46,339, // `protected
47,1254, // `public
48,516, // `short
49,412, // `static
50,1491, // `strictfp
51,832, // `switch
52,397, // `synchronized
53,201, // `throw
54,1108, // `throws
55,417, // `transient
56,631, // `try
57,927, // `volatile
175,1278, // token*
  }
,
{ // state 1105
0x80000000|1, // match move
0x80000000|273, // no-match move
0x80000000|36, // NT-test-match state for idChar
  }
,
{ // state 1106
MIN_REDUCTION+17, // (default reduction)
  }
,
{ // state 1107
128,1304, // white
132,381, // eol
133,1433, // comment
134,565, // oneLineComment
135,26, // blockComment
MIN_REDUCTION+277, // (default reduction)
  }
,
{ // state 1108
MIN_REDUCTION+54, // (default reduction)
  }
,
{ // state 1109
181,MIN_REDUCTION+222, // $NT
  }
,
{ // state 1110
2,416, // white*
128,376, // white
132,381, // eol
133,1433, // comment
134,565, // oneLineComment
135,26, // blockComment
MIN_REDUCTION+172, // (default reduction)
  }
,
{ // state 1111
-1, // $$start
-1, // start
1417, // white*
-1, // $$0
MIN_REDUCTION+263, // token
1392, // `boolean
1186, // `class
1576, // `extends
798, // `void
1167, // `int
267, // `while
1537, // `if
316, // `else
440, // `for
165, // `break
280, // `this
1368, // `false
1106, // `true
953, // `super
489, // `null
1163, // `return
630, // `instanceof
976, // `new
1330, // `abstract
1402, // `assert
1567, // `byte
27, // `case
833, // `catch
982, // `char
1324, // `const
141, // `continue
115, // `default
1035, // `do
140, // `double
308, // `enum
662, // `final
1021, // `finally
1158, // `float
765, // `goto
1302, // `implements
768, // `import
1514, // `interface
1633, // `long
812, // `native
1233, // `package
245, // `private
339, // `protected
1254, // `public
516, // `short
412, // `static
1491, // `strictfp
832, // `switch
397, // `synchronized
201, // `throw
1108, // `throws
417, // `transient
631, // `try
927, // `volatile
972, // `!
312, // `!=
1102, // `%
1560, // `&&
293, // `*
647, // `(
123, // `)
1355, // `{
95, // `}
413, // `-
1444, // `+
67, // `=
1322, // `==
109, // `[
551, // `]
1370, // `||
168, // `<
53, // `<=
1559, // `,
604, // `>
1435, // `>=
1247, // `.
1490, // `;
111, // `++
50, // `--
152, // `/
385, // `:
-1, // ID
161, // INT_LITERAL
485, // STRING_LITERAL
769, // CHAR_LITERAL
MIN_REDUCTION+263, // "c"
MIN_REDUCTION+263, // "l"
MIN_REDUCTION+263, // "a"
MIN_REDUCTION+263, // "s"
-1, // idChar
-1, // reserved
MIN_REDUCTION+263, // "e"
637, // "!"
1360, // "="
1616, // "+"
MIN_REDUCTION+263, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+263, // "x"
MIN_REDUCTION+263, // "X"
-1, // hex
-1, // letter
-1, // "_"
MIN_REDUCTION+263, // "d"
MIN_REDUCTION+263, // "g"
MIN_REDUCTION+263, // "m"
MIN_REDUCTION+263, // "p"
MIN_REDUCTION+263, // "v"
MIN_REDUCTION+263, // "y"
MIN_REDUCTION+263, // "f"
MIN_REDUCTION+263, // "i"
MIN_REDUCTION+263, // {"A".."W" "Y".."Z"}
MIN_REDUCTION+263, // "o"
MIN_REDUCTION+263, // "r"
MIN_REDUCTION+263, // "u"
MIN_REDUCTION+263, // {"j" "q"}
MIN_REDUCTION+263, // "b"
MIN_REDUCTION+263, // "h"
MIN_REDUCTION+263, // "k"
MIN_REDUCTION+263, // "n"
MIN_REDUCTION+263, // "t"
MIN_REDUCTION+263, // "w"
MIN_REDUCTION+263, // "z"
MIN_REDUCTION+263, // {"1".."9"}
376, // white
1602, // {12}
1602, // " "
1602, // {9}
381, // eol
1433, // comment
565, // oneLineComment
26, // blockComment
1572, // "/"
-1, // printable**
-1, // printable
1638, // "*"
-1, // blockCommentContent*
-1, // blockCommentContent
582, // "["
295, // "-"
174, // "<"
182, // "|"
-1, // {"?".."@"}
164, // "&"
1357, // ")"
155, // ","
369, // "]"
-1, // {"#".."$"}
387, // ";"
1173, // ">"
1611, // "{"
978, // "%"
1273, // "("
-1, // "\"
319, // "."
246, // ":"
984, // "}"
-1, // {"^" "`" "~"}
995, // "'"
1482, // '"'
418, // {10}
1458, // {13}
-1, // stringPrintable
-1, // recognizeEscapeChar
-1, // charPrintable
-1, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
-1, // escapeChars
-1, // token*
-1, // printable*
-1, // digit+
-1, // idChar*
-1, // letter+
MIN_REDUCTION+263, // $
-1, // $NT
  }
,
{ // state 1112
0x80000000|1, // match move
0x80000000|306, // no-match move
0x80000000|36, // NT-test-match state for idChar
  }
,
{ // state 1113
MIN_REDUCTION+353, // (default reduction)
  }
,
{ // state 1114
136,1226, // "/"
  }
,
{ // state 1115
0x80000000|64, // match move
0x80000000|333, // no-match move
// T-test match for "0":
99,
  }
,
{ // state 1116
128,1304, // white
132,381, // eol
133,1433, // comment
134,565, // oneLineComment
135,26, // blockComment
MIN_REDUCTION+157, // (default reduction)
  }
,
{ // state 1117
128,620, // white
129,674, // {12}
130,674, // " "
131,674, // {9}
132,889, // eol
133,775, // comment
134,943, // oneLineComment
135,641, // blockComment
136,1598, // "/"
164,926, // {10}
165,676, // {13}
181,MIN_REDUCTION+247, // $NT
  }
,
{ // state 1118
124,1097, // "t"
  }
,
{ // state 1119
-1, // $$start
-1, // start
1215, // white*
-1, // $$0
MIN_REDUCTION+98, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
972, // `!
312, // `!=
1102, // `%
1560, // `&&
293, // `*
647, // `(
123, // `)
1355, // `{
95, // `}
413, // `-
-1, // `+
67, // `=
1322, // `==
109, // `[
551, // `]
1370, // `||
168, // `<
53, // `<=
1559, // `,
604, // `>
1435, // `>=
1247, // `.
1490, // `;
-1, // `++
50, // `--
152, // `/
385, // `:
872, // ID
161, // INT_LITERAL
485, // STRING_LITERAL
769, // CHAR_LITERAL
513, // "c"
513, // "l"
513, // "a"
513, // "s"
-1, // idChar
-1, // reserved
513, // "e"
637, // "!"
1360, // "="
MIN_REDUCTION+98, // "+"
305, // "0"
566, // digit++
961, // digit
513, // "x"
513, // "X"
-1, // hex
1361, // letter
-1, // "_"
513, // "d"
513, // "g"
513, // "m"
513, // "p"
513, // "v"
513, // "y"
513, // "f"
513, // "i"
513, // {"A".."W" "Y".."Z"}
513, // "o"
513, // "r"
513, // "u"
513, // {"j" "q"}
513, // "b"
513, // "h"
513, // "k"
513, // "n"
513, // "t"
513, // "w"
513, // "z"
305, // {"1".."9"}
376, // white
1602, // {12}
1602, // " "
1602, // {9}
381, // eol
1433, // comment
565, // oneLineComment
26, // blockComment
1572, // "/"
-1, // printable**
-1, // printable
1638, // "*"
-1, // blockCommentContent*
-1, // blockCommentContent
582, // "["
295, // "-"
174, // "<"
182, // "|"
-1, // {"?".."@"}
164, // "&"
1357, // ")"
155, // ","
369, // "]"
-1, // {"#".."$"}
387, // ";"
1173, // ">"
1611, // "{"
978, // "%"
1273, // "("
-1, // "\"
319, // "."
246, // ":"
984, // "}"
-1, // {"^" "`" "~"}
995, // "'"
1482, // '"'
418, // {10}
1458, // {13}
-1, // stringPrintable
-1, // recognizeEscapeChar
-1, // charPrintable
792, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
-1, // escapeChars
-1, // token*
-1, // printable*
466, // digit+
-1, // idChar*
883, // letter+
MIN_REDUCTION+98, // $
-1, // $NT
  }
,
{ // state 1120
0x80000000|510, // match move
0x80000000|1405, // no-match move
// T-test match for "0":
99,
  }
,
{ // state 1121
181,MIN_REDUCTION+192, // $NT
  }
,
{ // state 1122
1,447, // start
2,72, // white*
3,514, // $$0
4,666, // token
58,972, // `!
59,312, // `!=
60,1102, // `%
61,1560, // `&&
62,293, // `*
63,647, // `(
64,123, // `)
65,1355, // `{
66,95, // `}
67,413, // `-
68,1444, // `+
69,67, // `=
70,1322, // `==
71,109, // `[
72,551, // `]
73,1370, // `||
74,168, // `<
75,53, // `<=
76,1559, // `,
77,604, // `>
78,1435, // `>=
79,1247, // `.
80,1490, // `;
81,111, // `++
82,50, // `--
83,152, // `/
84,385, // `:
85,872, // ID
86,161, // INT_LITERAL
87,485, // STRING_LITERAL
88,769, // CHAR_LITERAL
99,322, // "0"
105,1361, // letter
128,657, // white
132,1446, // eol
133,1070, // comment
134,1306, // oneLineComment
135,839, // blockComment
169,792, // letter++
175,1278, // token*
179,883, // letter+
  }
,
{ // state 1123
2,1192, // white*
128,1336, // white
129,674, // {12}
130,674, // " "
131,674, // {9}
132,889, // eol
133,775, // comment
134,943, // oneLineComment
135,641, // blockComment
136,1598, // "/"
164,926, // {10}
165,676, // {13}
181,MIN_REDUCTION+293, // $NT
  }
,
{ // state 1124
117,318, // "r"
  }
,
{ // state 1125
MIN_REDUCTION+155, // (default reduction)
  }
,
{ // state 1126
90,1094, // "l"
  }
,
{ // state 1127
117,1629, // "r"
  }
,
{ // state 1128
114,950, // "i"
  }
,
{ // state 1129
0x80000000|1138, // match move
0x80000000|964, // no-match move
0x80000000|1258, // NT-test-match state for reserved
  }
,
{ // state 1130
MIN_REDUCTION+143, // (default reduction)
  }
,
{ // state 1131
91,933, // "a"
  }
,
{ // state 1132
MIN_REDUCTION+370, // (default reduction)
  }
,
{ // state 1133
118,1390, // "u"
  }
,
{ // state 1134
-1, // $$start
-1, // start
471, // white*
-1, // $$0
MIN_REDUCTION+142, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
972, // `!
312, // `!=
1102, // `%
1560, // `&&
293, // `*
647, // `(
123, // `)
1355, // `{
95, // `}
413, // `-
1444, // `+
67, // `=
1322, // `==
109, // `[
551, // `]
1370, // `||
168, // `<
53, // `<=
1559, // `,
604, // `>
1435, // `>=
1247, // `.
1490, // `;
111, // `++
50, // `--
152, // `/
385, // `:
872, // ID
161, // INT_LITERAL
485, // STRING_LITERAL
769, // CHAR_LITERAL
513, // "c"
513, // "l"
513, // "a"
513, // "s"
-1, // idChar
-1, // reserved
513, // "e"
637, // "!"
1360, // "="
1616, // "+"
305, // "0"
566, // digit++
961, // digit
513, // "x"
513, // "X"
-1, // hex
1361, // letter
-1, // "_"
513, // "d"
513, // "g"
513, // "m"
513, // "p"
513, // "v"
513, // "y"
513, // "f"
513, // "i"
513, // {"A".."W" "Y".."Z"}
513, // "o"
513, // "r"
513, // "u"
513, // {"j" "q"}
513, // "b"
513, // "h"
513, // "k"
513, // "n"
513, // "t"
513, // "w"
513, // "z"
305, // {"1".."9"}
376, // white
1602, // {12}
1602, // " "
1602, // {9}
381, // eol
1433, // comment
565, // oneLineComment
26, // blockComment
1572, // "/"
-1, // printable**
-1, // printable
1638, // "*"
-1, // blockCommentContent*
-1, // blockCommentContent
582, // "["
295, // "-"
174, // "<"
182, // "|"
-1, // {"?".."@"}
164, // "&"
1357, // ")"
155, // ","
369, // "]"
-1, // {"#".."$"}
387, // ";"
1173, // ">"
1611, // "{"
978, // "%"
1273, // "("
-1, // "\"
319, // "."
246, // ":"
984, // "}"
-1, // {"^" "`" "~"}
995, // "'"
1482, // '"'
418, // {10}
1458, // {13}
-1, // stringPrintable
-1, // recognizeEscapeChar
-1, // charPrintable
792, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
-1, // escapeChars
-1, // token*
-1, // printable*
466, // digit+
-1, // idChar*
883, // letter+
MIN_REDUCTION+142, // $
-1, // $NT
  }
,
{ // state 1135
0x80000000|1626, // match move
0x80000000|268, // no-match move
// T-test match for "0":
99,
  }
,
{ // state 1136
110,1327, // "p"
  }
,
{ // state 1137
2,428, // white*
128,376, // white
132,381, // eol
133,1433, // comment
134,565, // oneLineComment
135,26, // blockComment
MIN_REDUCTION+168, // (default reduction)
  }
,
{ // state 1138
MIN_REDUCTION+378, // (default reduction)
  }
,
{ // state 1139
MIN_REDUCTION+265, // (default reduction)
  }
,
{ // state 1140
128,1304, // white
132,381, // eol
133,1433, // comment
134,565, // oneLineComment
135,26, // blockComment
MIN_REDUCTION+199, // (default reduction)
  }
,
{ // state 1141
128,620, // white
129,674, // {12}
130,674, // " "
131,674, // {9}
132,889, // eol
133,775, // comment
134,943, // oneLineComment
135,641, // blockComment
136,1598, // "/"
164,926, // {10}
165,676, // {13}
181,MIN_REDUCTION+295, // $NT
  }
,
{ // state 1142
95,770, // "e"
  }
,
{ // state 1143
MIN_REDUCTION+205, // (default reduction)
  }
,
{ // state 1144
-1, // $$start
-1, // start
721, // white*
-1, // $$0
MIN_REDUCTION+102, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
972, // `!
312, // `!=
1102, // `%
1560, // `&&
293, // `*
647, // `(
123, // `)
1355, // `{
95, // `}
413, // `-
1444, // `+
67, // `=
1322, // `==
109, // `[
551, // `]
1370, // `||
168, // `<
53, // `<=
1559, // `,
604, // `>
1435, // `>=
1247, // `.
1490, // `;
111, // `++
50, // `--
152, // `/
385, // `:
872, // ID
161, // INT_LITERAL
485, // STRING_LITERAL
769, // CHAR_LITERAL
513, // "c"
513, // "l"
513, // "a"
513, // "s"
-1, // idChar
-1, // reserved
513, // "e"
637, // "!"
1360, // "="
1616, // "+"
MIN_REDUCTION+102, // "0"
-1, // digit++
-1, // digit
513, // "x"
513, // "X"
-1, // hex
1361, // letter
-1, // "_"
513, // "d"
513, // "g"
513, // "m"
513, // "p"
513, // "v"
513, // "y"
513, // "f"
513, // "i"
513, // {"A".."W" "Y".."Z"}
513, // "o"
513, // "r"
513, // "u"
513, // {"j" "q"}
513, // "b"
513, // "h"
513, // "k"
513, // "n"
513, // "t"
513, // "w"
513, // "z"
MIN_REDUCTION+102, // {"1".."9"}
376, // white
1602, // {12}
1602, // " "
1602, // {9}
381, // eol
1433, // comment
565, // oneLineComment
26, // blockComment
1572, // "/"
-1, // printable**
-1, // printable
1638, // "*"
-1, // blockCommentContent*
-1, // blockCommentContent
582, // "["
295, // "-"
174, // "<"
182, // "|"
-1, // {"?".."@"}
164, // "&"
1357, // ")"
155, // ","
369, // "]"
-1, // {"#".."$"}
387, // ";"
1173, // ">"
1611, // "{"
978, // "%"
1273, // "("
-1, // "\"
319, // "."
246, // ":"
984, // "}"
-1, // {"^" "`" "~"}
995, // "'"
1482, // '"'
418, // {10}
1458, // {13}
-1, // stringPrintable
-1, // recognizeEscapeChar
-1, // charPrintable
792, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
-1, // escapeChars
-1, // token*
-1, // printable*
-1, // digit+
-1, // idChar*
883, // letter+
MIN_REDUCTION+102, // $
-1, // $NT
  }
,
{ // state 1145
0x80000000|1588, // match move
0x80000000|232, // no-match move
0x80000000|1258, // NT-test-match state for reserved
  }
,
{ // state 1146
89,821, // "c"
90,821, // "l"
91,821, // "a"
92,821, // "s"
95,821, // "e"
96,821, // "!"
97,821, // "="
98,821, // "+"
99,821, // "0"
102,821, // "x"
103,821, // "X"
106,821, // "_"
107,821, // "d"
108,821, // "g"
109,821, // "m"
110,821, // "p"
111,821, // "v"
112,821, // "y"
113,821, // "f"
114,821, // "i"
115,821, // {"A".."W" "Y".."Z"}
116,821, // "o"
117,821, // "r"
118,821, // "u"
119,821, // {"j" "q"}
120,821, // "b"
121,821, // "h"
122,821, // "k"
123,821, // "n"
124,821, // "t"
125,821, // "w"
126,821, // "z"
127,821, // {"1".."9"}
130,821, // " "
136,821, // "/"
137,1393, // printable**
138,517, // printable
139,821, // "*"
142,821, // "["
143,821, // "-"
144,821, // "<"
145,821, // "|"
146,821, // {"?".."@"}
147,821, // "&"
148,821, // ")"
149,821, // ","
150,821, // "]"
151,821, // {"#".."$"}
152,821, // ";"
153,821, // ">"
154,821, // "{"
155,821, // "%"
156,821, // "("
157,821, // "\"
158,821, // "."
159,821, // ":"
160,821, // "}"
161,821, // {"^" "`" "~"}
162,821, // "'"
163,821, // '"'
176,225, // printable*
  }
,
{ // state 1147
-1, // $$start
-1, // start
507, // white*
-1, // $$0
MIN_REDUCTION+257, // token
1392, // `boolean
1186, // `class
1576, // `extends
798, // `void
1167, // `int
267, // `while
1537, // `if
316, // `else
440, // `for
165, // `break
280, // `this
1368, // `false
1106, // `true
953, // `super
489, // `null
1163, // `return
630, // `instanceof
976, // `new
1330, // `abstract
1402, // `assert
1567, // `byte
27, // `case
833, // `catch
982, // `char
1324, // `const
141, // `continue
115, // `default
1035, // `do
140, // `double
308, // `enum
662, // `final
1021, // `finally
1158, // `float
765, // `goto
1302, // `implements
768, // `import
1514, // `interface
1633, // `long
812, // `native
1233, // `package
245, // `private
339, // `protected
1254, // `public
516, // `short
412, // `static
1491, // `strictfp
832, // `switch
397, // `synchronized
201, // `throw
1108, // `throws
417, // `transient
631, // `try
927, // `volatile
972, // `!
312, // `!=
1102, // `%
1560, // `&&
293, // `*
647, // `(
123, // `)
1355, // `{
95, // `}
413, // `-
1444, // `+
67, // `=
1322, // `==
109, // `[
551, // `]
1370, // `||
168, // `<
53, // `<=
1559, // `,
604, // `>
1435, // `>=
1247, // `.
1490, // `;
111, // `++
50, // `--
152, // `/
385, // `:
-1, // ID
161, // INT_LITERAL
485, // STRING_LITERAL
769, // CHAR_LITERAL
MIN_REDUCTION+257, // "c"
MIN_REDUCTION+257, // "l"
MIN_REDUCTION+257, // "a"
MIN_REDUCTION+257, // "s"
-1, // idChar
-1, // reserved
MIN_REDUCTION+257, // "e"
637, // "!"
1360, // "="
1616, // "+"
MIN_REDUCTION+257, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+257, // "x"
MIN_REDUCTION+257, // "X"
-1, // hex
-1, // letter
-1, // "_"
MIN_REDUCTION+257, // "d"
MIN_REDUCTION+257, // "g"
MIN_REDUCTION+257, // "m"
MIN_REDUCTION+257, // "p"
MIN_REDUCTION+257, // "v"
MIN_REDUCTION+257, // "y"
MIN_REDUCTION+257, // "f"
MIN_REDUCTION+257, // "i"
MIN_REDUCTION+257, // {"A".."W" "Y".."Z"}
MIN_REDUCTION+257, // "o"
MIN_REDUCTION+257, // "r"
MIN_REDUCTION+257, // "u"
MIN_REDUCTION+257, // {"j" "q"}
MIN_REDUCTION+257, // "b"
MIN_REDUCTION+257, // "h"
MIN_REDUCTION+257, // "k"
MIN_REDUCTION+257, // "n"
MIN_REDUCTION+257, // "t"
MIN_REDUCTION+257, // "w"
MIN_REDUCTION+257, // "z"
MIN_REDUCTION+257, // {"1".."9"}
376, // white
1602, // {12}
1602, // " "
1602, // {9}
381, // eol
1433, // comment
565, // oneLineComment
26, // blockComment
1572, // "/"
-1, // printable**
-1, // printable
1638, // "*"
-1, // blockCommentContent*
-1, // blockCommentContent
582, // "["
295, // "-"
174, // "<"
182, // "|"
-1, // {"?".."@"}
164, // "&"
1357, // ")"
155, // ","
369, // "]"
-1, // {"#".."$"}
387, // ";"
1173, // ">"
1611, // "{"
978, // "%"
1273, // "("
-1, // "\"
319, // "."
246, // ":"
984, // "}"
-1, // {"^" "`" "~"}
995, // "'"
1482, // '"'
418, // {10}
1458, // {13}
-1, // stringPrintable
-1, // recognizeEscapeChar
-1, // charPrintable
-1, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
-1, // escapeChars
-1, // token*
-1, // printable*
-1, // digit+
-1, // idChar*
-1, // letter+
MIN_REDUCTION+257, // $
-1, // $NT
  }
,
{ // state 1148
0x80000000|1182, // match move
0x80000000|37, // no-match move
// T-test match for "0":
99,
  }
,
{ // state 1149
181,MIN_REDUCTION+255, // $NT
  }
,
{ // state 1150
0x80000000|1, // match move
0x80000000|1045, // no-match move
0x80000000|36, // NT-test-match state for idChar
  }
,
{ // state 1151
MIN_REDUCTION+111, // (default reduction)
  }
,
{ // state 1152
128,620, // white
129,674, // {12}
130,674, // " "
131,674, // {9}
132,889, // eol
133,775, // comment
134,943, // oneLineComment
135,641, // blockComment
136,1598, // "/"
164,926, // {10}
165,676, // {13}
181,MIN_REDUCTION+286, // $NT
  }
,
{ // state 1153
128,620, // white
129,674, // {12}
130,674, // " "
131,674, // {9}
132,889, // eol
133,775, // comment
134,943, // oneLineComment
135,641, // blockComment
136,1598, // "/"
164,926, // {10}
165,676, // {13}
181,MIN_REDUCTION+316, // $NT
  }
,
{ // state 1154
2,673, // white*
MIN_REDUCTION+182, // (default reduction)
  }
,
{ // state 1155
128,1304, // white
132,381, // eol
133,1433, // comment
134,565, // oneLineComment
135,26, // blockComment
MIN_REDUCTION+316, // (default reduction)
  }
,
{ // state 1156
0x80000000|1160, // match move
0x80000000|424, // no-match move
0x80000000|1258, // NT-test-match state for reserved
  }
,
{ // state 1157
0x80000000|52, // match move
0x80000000|980, // no-match move
0x80000000|36, // NT-test-match state for idChar
  }
,
{ // state 1158
MIN_REDUCTION+37, // (default reduction)
  }
,
{ // state 1159
2,519, // white*
128,1336, // white
129,674, // {12}
130,674, // " "
131,674, // {9}
132,889, // eol
133,775, // comment
134,943, // oneLineComment
135,641, // blockComment
136,1598, // "/"
164,926, // {10}
165,676, // {13}
181,MIN_REDUCTION+338, // $NT
  }
,
{ // state 1160
MIN_REDUCTION+283, // (default reduction)
  }
,
{ // state 1161
-1, // $$start
-1, // start
836, // white*
-1, // $$0
MIN_REDUCTION+287, // token
1392, // `boolean
1186, // `class
1576, // `extends
798, // `void
1167, // `int
267, // `while
1537, // `if
316, // `else
440, // `for
165, // `break
280, // `this
1368, // `false
1106, // `true
953, // `super
489, // `null
1163, // `return
630, // `instanceof
976, // `new
1330, // `abstract
1402, // `assert
1567, // `byte
27, // `case
833, // `catch
982, // `char
1324, // `const
141, // `continue
115, // `default
1035, // `do
140, // `double
308, // `enum
662, // `final
1021, // `finally
1158, // `float
765, // `goto
1302, // `implements
768, // `import
1514, // `interface
1633, // `long
812, // `native
1233, // `package
245, // `private
339, // `protected
1254, // `public
516, // `short
412, // `static
1491, // `strictfp
832, // `switch
397, // `synchronized
201, // `throw
1108, // `throws
417, // `transient
631, // `try
927, // `volatile
972, // `!
312, // `!=
1102, // `%
1560, // `&&
293, // `*
647, // `(
123, // `)
1355, // `{
95, // `}
413, // `-
1444, // `+
67, // `=
1322, // `==
109, // `[
551, // `]
1370, // `||
168, // `<
53, // `<=
1559, // `,
604, // `>
1435, // `>=
1247, // `.
1490, // `;
111, // `++
50, // `--
152, // `/
385, // `:
-1, // ID
161, // INT_LITERAL
485, // STRING_LITERAL
769, // CHAR_LITERAL
MIN_REDUCTION+287, // "c"
MIN_REDUCTION+287, // "l"
MIN_REDUCTION+287, // "a"
MIN_REDUCTION+287, // "s"
-1, // idChar
-1, // reserved
MIN_REDUCTION+287, // "e"
637, // "!"
1360, // "="
1616, // "+"
MIN_REDUCTION+287, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+287, // "x"
MIN_REDUCTION+287, // "X"
-1, // hex
-1, // letter
-1, // "_"
MIN_REDUCTION+287, // "d"
MIN_REDUCTION+287, // "g"
MIN_REDUCTION+287, // "m"
MIN_REDUCTION+287, // "p"
MIN_REDUCTION+287, // "v"
MIN_REDUCTION+287, // "y"
MIN_REDUCTION+287, // "f"
MIN_REDUCTION+287, // "i"
MIN_REDUCTION+287, // {"A".."W" "Y".."Z"}
MIN_REDUCTION+287, // "o"
MIN_REDUCTION+287, // "r"
MIN_REDUCTION+287, // "u"
MIN_REDUCTION+287, // {"j" "q"}
MIN_REDUCTION+287, // "b"
MIN_REDUCTION+287, // "h"
MIN_REDUCTION+287, // "k"
MIN_REDUCTION+287, // "n"
MIN_REDUCTION+287, // "t"
MIN_REDUCTION+287, // "w"
MIN_REDUCTION+287, // "z"
MIN_REDUCTION+287, // {"1".."9"}
376, // white
1602, // {12}
1602, // " "
1602, // {9}
381, // eol
1433, // comment
565, // oneLineComment
26, // blockComment
1572, // "/"
-1, // printable**
-1, // printable
1638, // "*"
-1, // blockCommentContent*
-1, // blockCommentContent
582, // "["
295, // "-"
174, // "<"
182, // "|"
-1, // {"?".."@"}
164, // "&"
1357, // ")"
155, // ","
369, // "]"
-1, // {"#".."$"}
387, // ";"
1173, // ">"
1611, // "{"
978, // "%"
1273, // "("
-1, // "\"
319, // "."
246, // ":"
984, // "}"
-1, // {"^" "`" "~"}
995, // "'"
1482, // '"'
418, // {10}
1458, // {13}
-1, // stringPrintable
-1, // recognizeEscapeChar
-1, // charPrintable
-1, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
-1, // escapeChars
-1, // token*
-1, // printable*
-1, // digit+
-1, // idChar*
-1, // letter+
MIN_REDUCTION+287, // $
-1, // $NT
  }
};
}
private class Initter7{
public int doInit(int startIdx) {
  for (int i = 0; i < myParseTable.length; i++) {
    parseTable[i+startIdx] = myParseTable[i];
  }
  return myParseTable.length;
}
private final int[][] myParseTable = {
{ // state 1162
121,520, // "h"
  }
,
{ // state 1163
MIN_REDUCTION+20, // (default reduction)
  }
,
{ // state 1164
0x80000000|1, // match move
0x80000000|221, // no-match move
0x80000000|36, // NT-test-match state for idChar
  }
,
{ // state 1165
-1, // $$start
-1, // start
1419, // white*
-1, // $$0
MIN_REDUCTION+332, // token
1392, // `boolean
1186, // `class
1576, // `extends
798, // `void
1167, // `int
267, // `while
1537, // `if
316, // `else
440, // `for
165, // `break
280, // `this
1368, // `false
1106, // `true
953, // `super
489, // `null
1163, // `return
630, // `instanceof
976, // `new
1330, // `abstract
1402, // `assert
1567, // `byte
27, // `case
833, // `catch
982, // `char
1324, // `const
141, // `continue
115, // `default
1035, // `do
140, // `double
308, // `enum
662, // `final
1021, // `finally
1158, // `float
765, // `goto
1302, // `implements
768, // `import
1514, // `interface
1633, // `long
812, // `native
1233, // `package
245, // `private
339, // `protected
1254, // `public
516, // `short
412, // `static
1491, // `strictfp
832, // `switch
397, // `synchronized
201, // `throw
1108, // `throws
417, // `transient
631, // `try
927, // `volatile
972, // `!
312, // `!=
1102, // `%
1560, // `&&
293, // `*
647, // `(
123, // `)
1355, // `{
95, // `}
413, // `-
1444, // `+
67, // `=
1322, // `==
109, // `[
551, // `]
1370, // `||
168, // `<
53, // `<=
1559, // `,
604, // `>
1435, // `>=
1247, // `.
1490, // `;
111, // `++
50, // `--
152, // `/
385, // `:
-1, // ID
161, // INT_LITERAL
485, // STRING_LITERAL
769, // CHAR_LITERAL
MIN_REDUCTION+332, // "c"
MIN_REDUCTION+332, // "l"
MIN_REDUCTION+332, // "a"
MIN_REDUCTION+332, // "s"
-1, // idChar
-1, // reserved
MIN_REDUCTION+332, // "e"
637, // "!"
1360, // "="
1616, // "+"
MIN_REDUCTION+332, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+332, // "x"
MIN_REDUCTION+332, // "X"
-1, // hex
-1, // letter
-1, // "_"
MIN_REDUCTION+332, // "d"
MIN_REDUCTION+332, // "g"
MIN_REDUCTION+332, // "m"
MIN_REDUCTION+332, // "p"
MIN_REDUCTION+332, // "v"
MIN_REDUCTION+332, // "y"
MIN_REDUCTION+332, // "f"
MIN_REDUCTION+332, // "i"
MIN_REDUCTION+332, // {"A".."W" "Y".."Z"}
MIN_REDUCTION+332, // "o"
MIN_REDUCTION+332, // "r"
MIN_REDUCTION+332, // "u"
MIN_REDUCTION+332, // {"j" "q"}
MIN_REDUCTION+332, // "b"
MIN_REDUCTION+332, // "h"
MIN_REDUCTION+332, // "k"
MIN_REDUCTION+332, // "n"
MIN_REDUCTION+332, // "t"
MIN_REDUCTION+332, // "w"
MIN_REDUCTION+332, // "z"
MIN_REDUCTION+332, // {"1".."9"}
376, // white
1602, // {12}
1602, // " "
1602, // {9}
381, // eol
1433, // comment
565, // oneLineComment
26, // blockComment
1572, // "/"
-1, // printable**
-1, // printable
1638, // "*"
-1, // blockCommentContent*
-1, // blockCommentContent
582, // "["
295, // "-"
174, // "<"
182, // "|"
-1, // {"?".."@"}
164, // "&"
1357, // ")"
155, // ","
369, // "]"
-1, // {"#".."$"}
387, // ";"
1173, // ">"
1611, // "{"
978, // "%"
1273, // "("
-1, // "\"
319, // "."
246, // ":"
984, // "}"
-1, // {"^" "`" "~"}
995, // "'"
1482, // '"'
418, // {10}
1458, // {13}
-1, // stringPrintable
-1, // recognizeEscapeChar
-1, // charPrintable
-1, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
-1, // escapeChars
-1, // token*
-1, // printable*
-1, // digit+
-1, // idChar*
-1, // letter+
MIN_REDUCTION+332, // $
-1, // $NT
  }
,
{ // state 1166
-1, // $$start
-1, // start
888, // white*
-1, // $$0
MIN_REDUCTION+176, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
972, // `!
312, // `!=
1102, // `%
1560, // `&&
293, // `*
647, // `(
123, // `)
1355, // `{
95, // `}
413, // `-
1444, // `+
67, // `=
1322, // `==
109, // `[
551, // `]
1370, // `||
168, // `<
53, // `<=
1559, // `,
604, // `>
1435, // `>=
1247, // `.
1490, // `;
111, // `++
50, // `--
152, // `/
385, // `:
872, // ID
161, // INT_LITERAL
485, // STRING_LITERAL
769, // CHAR_LITERAL
513, // "c"
513, // "l"
513, // "a"
513, // "s"
-1, // idChar
-1, // reserved
513, // "e"
637, // "!"
1360, // "="
1616, // "+"
305, // "0"
566, // digit++
961, // digit
513, // "x"
513, // "X"
-1, // hex
1361, // letter
-1, // "_"
513, // "d"
513, // "g"
513, // "m"
513, // "p"
513, // "v"
513, // "y"
513, // "f"
513, // "i"
513, // {"A".."W" "Y".."Z"}
513, // "o"
513, // "r"
513, // "u"
513, // {"j" "q"}
513, // "b"
513, // "h"
513, // "k"
513, // "n"
513, // "t"
513, // "w"
513, // "z"
305, // {"1".."9"}
376, // white
1602, // {12}
1602, // " "
1602, // {9}
381, // eol
1433, // comment
565, // oneLineComment
26, // blockComment
1572, // "/"
-1, // printable**
-1, // printable
1638, // "*"
-1, // blockCommentContent*
-1, // blockCommentContent
582, // "["
295, // "-"
174, // "<"
182, // "|"
-1, // {"?".."@"}
164, // "&"
1357, // ")"
155, // ","
369, // "]"
-1, // {"#".."$"}
387, // ";"
1173, // ">"
1611, // "{"
978, // "%"
1273, // "("
-1, // "\"
319, // "."
246, // ":"
984, // "}"
-1, // {"^" "`" "~"}
995, // "'"
1482, // '"'
418, // {10}
1458, // {13}
-1, // stringPrintable
-1, // recognizeEscapeChar
-1, // charPrintable
792, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
-1, // escapeChars
-1, // token*
-1, // printable*
466, // digit+
-1, // idChar*
883, // letter+
MIN_REDUCTION+176, // $
-1, // $NT
  }
,
{ // state 1167
MIN_REDUCTION+9, // (default reduction)
  }
,
{ // state 1168
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 1169
MIN_REDUCTION+177, // (default reduction)
  }
,
{ // state 1170
0x80000000|320, // match move
0x80000000|1156, // no-match move
// T-test match for "0":
99,
  }
,
{ // state 1171
0x80000000|944, // match move
0x80000000|1144, // no-match move
0x80000000|1258, // NT-test-match state for reserved
  }
,
{ // state 1172
124,1587, // "t"
  }
,
{ // state 1173
0x80000000|740, // match move
0x80000000|1531, // no-match move
// T-test match for "=":
97,
  }
,
{ // state 1174
116,74, // "o"
  }
,
{ // state 1175
128,620, // white
129,674, // {12}
130,674, // " "
131,674, // {9}
132,889, // eol
133,775, // comment
134,943, // oneLineComment
135,641, // blockComment
136,1598, // "/"
164,926, // {10}
165,676, // {13}
181,MIN_REDUCTION+226, // $NT
  }
,
{ // state 1176
128,1304, // white
132,381, // eol
133,1433, // comment
134,565, // oneLineComment
135,26, // blockComment
MIN_REDUCTION+301, // (default reduction)
  }
,
{ // state 1177
2,1421, // white*
MIN_REDUCTION+146, // (default reduction)
  }
,
{ // state 1178
95,1364, // "e"
116,1067, // "o"
  }
,
{ // state 1179
-1, // $$start
-1, // start
628, // white*
-1, // $$0
MIN_REDUCTION+166, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
972, // `!
312, // `!=
1102, // `%
1560, // `&&
293, // `*
647, // `(
123, // `)
1355, // `{
95, // `}
413, // `-
1444, // `+
-1, // `=
-1, // `==
109, // `[
551, // `]
1370, // `||
168, // `<
53, // `<=
1559, // `,
604, // `>
1435, // `>=
1247, // `.
1490, // `;
111, // `++
50, // `--
152, // `/
385, // `:
872, // ID
161, // INT_LITERAL
485, // STRING_LITERAL
769, // CHAR_LITERAL
513, // "c"
513, // "l"
513, // "a"
513, // "s"
-1, // idChar
-1, // reserved
513, // "e"
637, // "!"
MIN_REDUCTION+166, // "="
1616, // "+"
305, // "0"
566, // digit++
961, // digit
513, // "x"
513, // "X"
-1, // hex
1361, // letter
-1, // "_"
513, // "d"
513, // "g"
513, // "m"
513, // "p"
513, // "v"
513, // "y"
513, // "f"
513, // "i"
513, // {"A".."W" "Y".."Z"}
513, // "o"
513, // "r"
513, // "u"
513, // {"j" "q"}
513, // "b"
513, // "h"
513, // "k"
513, // "n"
513, // "t"
513, // "w"
513, // "z"
305, // {"1".."9"}
376, // white
1602, // {12}
1602, // " "
1602, // {9}
381, // eol
1433, // comment
565, // oneLineComment
26, // blockComment
1572, // "/"
-1, // printable**
-1, // printable
1638, // "*"
-1, // blockCommentContent*
-1, // blockCommentContent
582, // "["
295, // "-"
174, // "<"
182, // "|"
-1, // {"?".."@"}
164, // "&"
1357, // ")"
155, // ","
369, // "]"
-1, // {"#".."$"}
387, // ";"
1173, // ">"
1611, // "{"
978, // "%"
1273, // "("
-1, // "\"
319, // "."
246, // ":"
984, // "}"
-1, // {"^" "`" "~"}
995, // "'"
1482, // '"'
418, // {10}
1458, // {13}
-1, // stringPrintable
-1, // recognizeEscapeChar
-1, // charPrintable
792, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
-1, // escapeChars
-1, // token*
-1, // printable*
466, // digit+
-1, // idChar*
883, // letter+
MIN_REDUCTION+166, // $
-1, // $NT
  }
,
{ // state 1180
91,286, // "a"
112,1063, // "y"
118,238, // "u"
  }
,
{ // state 1181
181,MIN_REDUCTION+195, // $NT
  }
,
{ // state 1182
128,1304, // white
132,381, // eol
133,1433, // comment
134,565, // oneLineComment
135,26, // blockComment
MIN_REDUCTION+139, // (default reduction)
  }
,
{ // state 1183
MIN_REDUCTION+301, // (default reduction)
  }
,
{ // state 1184
116,603, // "o"
  }
,
{ // state 1185
0x80000000|728, // match move
0x80000000|1546, // no-match move
0x80000000|824, // NT-test-match state for printable
  }
,
{ // state 1186
MIN_REDUCTION+6, // (default reduction)
  }
,
{ // state 1187
181,MIN_REDUCTION+94, // $NT
  }
,
{ // state 1188
99,305, // "0"
101,1293, // digit
127,305, // {"1".."9"}
  }
,
{ // state 1189
113,1259, // "f"
  }
,
{ // state 1190
95,1335, // "e"
  }
,
{ // state 1191
MIN_REDUCTION+97, // (default reduction)
  }
,
{ // state 1192
128,620, // white
129,674, // {12}
130,674, // " "
131,674, // {9}
132,889, // eol
133,775, // comment
134,943, // oneLineComment
135,641, // blockComment
136,1598, // "/"
164,926, // {10}
165,676, // {13}
181,MIN_REDUCTION+292, // $NT
  }
,
{ // state 1193
0x80000000|368, // match move
0x80000000|42, // no-match move
// T-test match for "0":
99,
  }
,
{ // state 1194
111,994, // "v"
  }
,
{ // state 1195
MIN_REDUCTION+359, // (default reduction)
  }
,
{ // state 1196
0x80000000|1, // match move
0x80000000|1056, // no-match move
0x80000000|36, // NT-test-match state for idChar
  }
,
{ // state 1197
0x80000000|1, // match move
0x80000000|1041, // no-match move
0x80000000|36, // NT-test-match state for idChar
  }
,
{ // state 1198
124,607, // "t"
  }
,
{ // state 1199
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+214, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
972, // `!
312, // `!=
1102, // `%
1560, // `&&
293, // `*
647, // `(
123, // `)
1355, // `{
95, // `}
413, // `-
1444, // `+
67, // `=
1322, // `==
109, // `[
551, // `]
1370, // `||
168, // `<
53, // `<=
1559, // `,
604, // `>
1435, // `>=
1247, // `.
1490, // `;
111, // `++
50, // `--
152, // `/
385, // `:
872, // ID
161, // INT_LITERAL
485, // STRING_LITERAL
769, // CHAR_LITERAL
513, // "c"
513, // "l"
513, // "a"
513, // "s"
-1, // idChar
-1, // reserved
513, // "e"
637, // "!"
1360, // "="
1616, // "+"
305, // "0"
566, // digit++
961, // digit
513, // "x"
513, // "X"
-1, // hex
1361, // letter
-1, // "_"
513, // "d"
513, // "g"
513, // "m"
513, // "p"
513, // "v"
513, // "y"
513, // "f"
513, // "i"
513, // {"A".."W" "Y".."Z"}
513, // "o"
513, // "r"
513, // "u"
513, // {"j" "q"}
513, // "b"
513, // "h"
513, // "k"
513, // "n"
513, // "t"
513, // "w"
513, // "z"
305, // {"1".."9"}
1304, // white
1602, // {12}
1602, // " "
1602, // {9}
381, // eol
1433, // comment
565, // oneLineComment
26, // blockComment
1572, // "/"
-1, // printable**
-1, // printable
1638, // "*"
-1, // blockCommentContent*
-1, // blockCommentContent
582, // "["
295, // "-"
174, // "<"
182, // "|"
-1, // {"?".."@"}
164, // "&"
1357, // ")"
155, // ","
369, // "]"
-1, // {"#".."$"}
387, // ";"
1173, // ">"
1611, // "{"
978, // "%"
1273, // "("
-1, // "\"
319, // "."
246, // ":"
984, // "}"
-1, // {"^" "`" "~"}
995, // "'"
1482, // '"'
418, // {10}
1458, // {13}
-1, // stringPrintable
-1, // recognizeEscapeChar
-1, // charPrintable
792, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
-1, // escapeChars
-1, // token*
-1, // printable*
466, // digit+
-1, // idChar*
883, // letter+
MIN_REDUCTION+214, // $
-1, // $NT
  }
,
{ // state 1200
0x80000000|1, // match move
0x80000000|1212, // no-match move
0x80000000|36, // NT-test-match state for idChar
  }
,
{ // state 1201
113,1113, // "f"
117,960, // "r"
123,1575, // "n"
124,255, // "t"
157,842, // "\"
162,1578, // "'"
163,1399, // '"'
  }
,
{ // state 1202
0x80000000|44, // match move
0x80000000|177, // no-match move
0x80000000|1258, // NT-test-match state for reserved
  }
,
{ // state 1203
113,1031, // "f"
  }
,
{ // state 1204
0x80000000|378, // match move
0x80000000|703, // no-match move
0x80000000|1258, // NT-test-match state for reserved
  }
,
{ // state 1205
128,1304, // white
132,381, // eol
133,1433, // comment
134,565, // oneLineComment
135,26, // blockComment
MIN_REDUCTION+161, // (default reduction)
  }
,
{ // state 1206
118,653, // "u"
  }
,
{ // state 1207
128,1304, // white
132,381, // eol
133,1433, // comment
134,565, // oneLineComment
135,26, // blockComment
MIN_REDUCTION+211, // (default reduction)
  }
,
{ // state 1208
0x80000000|1, // match move
0x80000000|364, // no-match move
0x80000000|36, // NT-test-match state for idChar
  }
,
{ // state 1209
MIN_REDUCTION+250, // (default reduction)
  }
,
{ // state 1210
0x80000000|9, // match move
0x80000000|1532, // no-match move
// T-test match for "0":
99,
  }
,
{ // state 1211
128,1304, // white
132,381, // eol
133,1433, // comment
134,565, // oneLineComment
135,26, // blockComment
MIN_REDUCTION+153, // (default reduction)
  }
,
{ // state 1212
-1, // $$start
-1, // start
1351, // white*
-1, // $$0
MIN_REDUCTION+236, // token
1392, // `boolean
1186, // `class
1576, // `extends
798, // `void
1167, // `int
267, // `while
1537, // `if
316, // `else
440, // `for
165, // `break
280, // `this
1368, // `false
1106, // `true
953, // `super
489, // `null
1163, // `return
630, // `instanceof
976, // `new
1330, // `abstract
1402, // `assert
1567, // `byte
27, // `case
833, // `catch
982, // `char
1324, // `const
141, // `continue
115, // `default
1035, // `do
140, // `double
308, // `enum
662, // `final
1021, // `finally
1158, // `float
765, // `goto
1302, // `implements
768, // `import
1514, // `interface
1633, // `long
812, // `native
1233, // `package
245, // `private
339, // `protected
1254, // `public
516, // `short
412, // `static
1491, // `strictfp
832, // `switch
397, // `synchronized
201, // `throw
1108, // `throws
417, // `transient
631, // `try
927, // `volatile
972, // `!
312, // `!=
1102, // `%
1560, // `&&
293, // `*
647, // `(
123, // `)
1355, // `{
95, // `}
413, // `-
1444, // `+
67, // `=
1322, // `==
109, // `[
551, // `]
1370, // `||
168, // `<
53, // `<=
1559, // `,
604, // `>
1435, // `>=
1247, // `.
1490, // `;
111, // `++
50, // `--
152, // `/
385, // `:
-1, // ID
161, // INT_LITERAL
485, // STRING_LITERAL
769, // CHAR_LITERAL
MIN_REDUCTION+236, // "c"
MIN_REDUCTION+236, // "l"
MIN_REDUCTION+236, // "a"
MIN_REDUCTION+236, // "s"
-1, // idChar
-1, // reserved
MIN_REDUCTION+236, // "e"
637, // "!"
1360, // "="
1616, // "+"
MIN_REDUCTION+236, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+236, // "x"
MIN_REDUCTION+236, // "X"
-1, // hex
-1, // letter
-1, // "_"
MIN_REDUCTION+236, // "d"
MIN_REDUCTION+236, // "g"
MIN_REDUCTION+236, // "m"
MIN_REDUCTION+236, // "p"
MIN_REDUCTION+236, // "v"
MIN_REDUCTION+236, // "y"
MIN_REDUCTION+236, // "f"
MIN_REDUCTION+236, // "i"
MIN_REDUCTION+236, // {"A".."W" "Y".."Z"}
MIN_REDUCTION+236, // "o"
MIN_REDUCTION+236, // "r"
MIN_REDUCTION+236, // "u"
MIN_REDUCTION+236, // {"j" "q"}
MIN_REDUCTION+236, // "b"
MIN_REDUCTION+236, // "h"
MIN_REDUCTION+236, // "k"
MIN_REDUCTION+236, // "n"
MIN_REDUCTION+236, // "t"
MIN_REDUCTION+236, // "w"
MIN_REDUCTION+236, // "z"
MIN_REDUCTION+236, // {"1".."9"}
376, // white
1602, // {12}
1602, // " "
1602, // {9}
381, // eol
1433, // comment
565, // oneLineComment
26, // blockComment
1572, // "/"
-1, // printable**
-1, // printable
1638, // "*"
-1, // blockCommentContent*
-1, // blockCommentContent
582, // "["
295, // "-"
174, // "<"
182, // "|"
-1, // {"?".."@"}
164, // "&"
1357, // ")"
155, // ","
369, // "]"
-1, // {"#".."$"}
387, // ";"
1173, // ">"
1611, // "{"
978, // "%"
1273, // "("
-1, // "\"
319, // "."
246, // ":"
984, // "}"
-1, // {"^" "`" "~"}
995, // "'"
1482, // '"'
418, // {10}
1458, // {13}
-1, // stringPrintable
-1, // recognizeEscapeChar
-1, // charPrintable
-1, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
-1, // escapeChars
-1, // token*
-1, // printable*
-1, // digit+
-1, // idChar*
-1, // letter+
MIN_REDUCTION+236, // $
-1, // $NT
  }
,
{ // state 1213
132,1498, // eol
164,926, // {10}
165,676, // {13}
  }
,
{ // state 1214
0x80000000|713, // match move
0x80000000|955, // no-match move
0x80000000|1258, // NT-test-match state for reserved
  }
,
{ // state 1215
0x80000000|1564, // match move
0x80000000|860, // no-match move
// T-test match for "0":
99,
  }
,
{ // state 1216
89,513, // "c"
90,513, // "l"
91,513, // "a"
92,513, // "s"
95,513, // "e"
102,513, // "x"
103,513, // "X"
105,1326, // letter
107,513, // "d"
108,513, // "g"
109,513, // "m"
110,513, // "p"
111,513, // "v"
112,513, // "y"
113,513, // "f"
114,513, // "i"
115,513, // {"A".."W" "Y".."Z"}
116,513, // "o"
117,513, // "r"
118,513, // "u"
119,513, // {"j" "q"}
120,513, // "b"
121,513, // "h"
122,513, // "k"
123,513, // "n"
124,513, // "t"
125,513, // "w"
126,513, // "z"
  }
,
{ // state 1217
0x80000000|1, // match move
0x80000000|296, // no-match move
0x80000000|36, // NT-test-match state for idChar
  }
,
{ // state 1218
90,1466, // "l"
116,146, // "o"
  }
,
{ // state 1219
128,620, // white
129,674, // {12}
130,674, // " "
131,674, // {9}
132,889, // eol
133,775, // comment
134,943, // oneLineComment
135,641, // blockComment
136,1598, // "/"
164,926, // {10}
165,676, // {13}
181,MIN_REDUCTION+214, // $NT
  }
,
{ // state 1220
0x80000000|727, // match move
0x80000000|896, // no-match move
// T-test match for "0":
99,
  }
,
{ // state 1221
90,76, // "l"
  }
,
{ // state 1222
95,1497, // "e"
  }
,
{ // state 1223
89,1562, // "c"
  }
,
{ // state 1224
2,1440, // white*
MIN_REDUCTION+144, // (default reduction)
  }
,
{ // state 1225
0x80000000|538, // match move
0x80000000|251, // no-match move
0x80000000|1258, // NT-test-match state for reserved
  }
,
{ // state 1226
MIN_REDUCTION+121, // (default reduction)
  }
,
{ // state 1227
121,922, // "h"
  }
,
{ // state 1228
MIN_REDUCTION+292, // (default reduction)
  }
,
{ // state 1229
0x80000000|1, // match move
0x80000000|351, // no-match move
0x80000000|36, // NT-test-match state for idChar
  }
,
{ // state 1230
0x80000000|970, // match move
0x80000000|1134, // no-match move
0x80000000|1258, // NT-test-match state for reserved
  }
,
{ // state 1231
123,1612, // "n"
  }
,
{ // state 1232
124,181, // "t"
  }
,
{ // state 1233
MIN_REDUCTION+44, // (default reduction)
  }
,
{ // state 1234
2,173, // white*
128,376, // white
132,381, // eol
133,1433, // comment
134,565, // oneLineComment
135,26, // blockComment
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 1235
0x80000000|1012, // match move
0x80000000|1395, // no-match move
0x80000000|1258, // NT-test-match state for reserved
  }
,
{ // state 1236
2,931, // white*
128,1336, // white
129,674, // {12}
130,674, // " "
131,674, // {9}
132,889, // eol
133,775, // comment
134,943, // oneLineComment
135,641, // blockComment
136,1598, // "/"
164,926, // {10}
165,676, // {13}
181,MIN_REDUCTION+272, // $NT
  }
,
{ // state 1237
0x80000000|648, // match move
0x80000000|34, // no-match move
0x80000000|1258, // NT-test-match state for reserved
  }
,
{ // state 1238
120,991, // "b"
  }
,
{ // state 1239
2,153, // white*
MIN_REDUCTION+178, // (default reduction)
  }
,
{ // state 1240
0x80000000|1005, // match move
0x80000000|550, // no-match move
0x80000000|1258, // NT-test-match state for reserved
  }
,
{ // state 1241
MIN_REDUCTION+304, // (default reduction)
  }
,
{ // state 1242
MIN_REDUCTION+238, // (default reduction)
  }
,
{ // state 1243
0x80000000|1, // match move
0x80000000|449, // no-match move
0x80000000|36, // NT-test-match state for idChar
  }
,
{ // state 1244
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+295, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
972, // `!
312, // `!=
1102, // `%
1560, // `&&
293, // `*
647, // `(
123, // `)
1355, // `{
95, // `}
413, // `-
1444, // `+
67, // `=
1322, // `==
109, // `[
551, // `]
1370, // `||
168, // `<
53, // `<=
1559, // `,
604, // `>
1435, // `>=
1247, // `.
1490, // `;
111, // `++
50, // `--
152, // `/
385, // `:
872, // ID
161, // INT_LITERAL
485, // STRING_LITERAL
769, // CHAR_LITERAL
513, // "c"
513, // "l"
513, // "a"
513, // "s"
-1, // idChar
-1, // reserved
513, // "e"
637, // "!"
1360, // "="
1616, // "+"
305, // "0"
566, // digit++
961, // digit
513, // "x"
513, // "X"
-1, // hex
1361, // letter
-1, // "_"
513, // "d"
513, // "g"
513, // "m"
513, // "p"
513, // "v"
513, // "y"
513, // "f"
513, // "i"
513, // {"A".."W" "Y".."Z"}
513, // "o"
513, // "r"
513, // "u"
513, // {"j" "q"}
513, // "b"
513, // "h"
513, // "k"
513, // "n"
513, // "t"
513, // "w"
513, // "z"
305, // {"1".."9"}
1304, // white
1602, // {12}
1602, // " "
1602, // {9}
381, // eol
1433, // comment
565, // oneLineComment
26, // blockComment
1572, // "/"
-1, // printable**
-1, // printable
1638, // "*"
-1, // blockCommentContent*
-1, // blockCommentContent
582, // "["
295, // "-"
174, // "<"
182, // "|"
-1, // {"?".."@"}
164, // "&"
1357, // ")"
155, // ","
369, // "]"
-1, // {"#".."$"}
387, // ";"
1173, // ">"
1611, // "{"
978, // "%"
1273, // "("
-1, // "\"
319, // "."
246, // ":"
984, // "}"
-1, // {"^" "`" "~"}
995, // "'"
1482, // '"'
418, // {10}
1458, // {13}
-1, // stringPrintable
-1, // recognizeEscapeChar
-1, // charPrintable
792, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
-1, // escapeChars
-1, // token*
-1, // printable*
466, // digit+
-1, // idChar*
883, // letter+
MIN_REDUCTION+295, // $
-1, // $NT
  }
,
{ // state 1245
0x80000000|299, // match move
0x80000000|1596, // no-match move
0x80000000|1258, // NT-test-match state for reserved
  }
,
{ // state 1246
0x80000000|935, // match move
0x80000000|1372, // no-match move
0x80000000|1258, // NT-test-match state for reserved
  }
,
{ // state 1247
MIN_REDUCTION+79, // (default reduction)
  }
,
{ // state 1248
91,78, // "a"
  }
,
{ // state 1249
114,899, // "i"
  }
,
{ // state 1250
MIN_REDUCTION+322, // (default reduction)
  }
,
{ // state 1251
0x80000000|1, // match move
0x80000000|243, // no-match move
0x80000000|36, // NT-test-match state for idChar
  }
,
{ // state 1252
123,332, // "n"
  }
,
{ // state 1253
124,936, // "t"
  }
,
{ // state 1254
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 1255
0x80000000|1523, // match move
0x80000000|1245, // no-match move
// T-test match for "0":
99,
  }
,
{ // state 1256
95,200, // "e"
  }
,
{ // state 1257
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 1258
5,43, // `boolean
6,101, // `class
7,1121, // `extends
8,1181, // `void
9,715, // `int
10,644, // `while
11,649, // `if
12,1187, // `else
13,40, // `for
14,23, // `break
15,18, // `this
16,677, // `false
17,478, // `true
18,1109, // `super
19,484, // `null
20,567, // `return
21,632, // `instanceof
22,1630, // `new
23,1348, // `abstract
24,460, // `assert
25,689, // `byte
26,1013, // `case
27,1615, // `catch
28,723, // `char
29,1149, // `const
30,87, // `continue
31,486, // `default
32,1092, // `do
33,99, // `double
34,1427, // `enum
35,993, // `final
36,999, // `finally
37,1006, // `float
38,787, // `goto
39,427, // `implements
40,891, // `import
41,1457, // `interface
42,537, // `long
43,28, // `native
44,365, // `package
45,137, // `private
46,1479, // `protected
47,56, // `public
48,406, // `short
49,7, // `static
50,1341, // `strictfp
51,359, // `switch
52,667, // `synchronized
53,599, // `throw
54,778, // `throws
55,261, // `transient
56,680, // `try
57,287, // `volatile
89,1423, // "c"
90,512, // "l"
91,194, // "a"
92,33, // "s"
95,588, // "e"
107,1279, // "d"
108,75, // "g"
110,650, // "p"
111,1623, // "v"
113,601, // "f"
114,611, // "i"
117,809, // "r"
120,159, // "b"
123,1463, // "n"
124,103, // "t"
125,425, // "w"
  }
,
{ // state 1259
91,1533, // "a"
  }
,
{ // state 1260
92,244, // "s"
  }
,
{ // state 1261
-1, // $$start
-1, // start
940, // white*
-1, // $$0
MIN_REDUCTION+180, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
972, // `!
312, // `!=
1102, // `%
1560, // `&&
293, // `*
647, // `(
123, // `)
1355, // `{
95, // `}
413, // `-
1444, // `+
67, // `=
1322, // `==
109, // `[
551, // `]
1370, // `||
168, // `<
53, // `<=
1559, // `,
604, // `>
1435, // `>=
1247, // `.
1490, // `;
111, // `++
50, // `--
152, // `/
385, // `:
872, // ID
161, // INT_LITERAL
485, // STRING_LITERAL
769, // CHAR_LITERAL
513, // "c"
513, // "l"
513, // "a"
513, // "s"
-1, // idChar
-1, // reserved
513, // "e"
637, // "!"
1360, // "="
1616, // "+"
305, // "0"
566, // digit++
961, // digit
513, // "x"
513, // "X"
-1, // hex
1361, // letter
-1, // "_"
513, // "d"
513, // "g"
513, // "m"
513, // "p"
513, // "v"
513, // "y"
513, // "f"
513, // "i"
513, // {"A".."W" "Y".."Z"}
513, // "o"
513, // "r"
513, // "u"
513, // {"j" "q"}
513, // "b"
513, // "h"
513, // "k"
513, // "n"
513, // "t"
513, // "w"
513, // "z"
305, // {"1".."9"}
376, // white
1602, // {12}
1602, // " "
1602, // {9}
381, // eol
1433, // comment
565, // oneLineComment
26, // blockComment
1572, // "/"
-1, // printable**
-1, // printable
1638, // "*"
-1, // blockCommentContent*
-1, // blockCommentContent
582, // "["
295, // "-"
174, // "<"
182, // "|"
-1, // {"?".."@"}
164, // "&"
1357, // ")"
155, // ","
369, // "]"
-1, // {"#".."$"}
387, // ";"
1173, // ">"
1611, // "{"
978, // "%"
1273, // "("
-1, // "\"
319, // "."
246, // ":"
984, // "}"
-1, // {"^" "`" "~"}
995, // "'"
1482, // '"'
418, // {10}
1458, // {13}
-1, // stringPrintable
-1, // recognizeEscapeChar
-1, // charPrintable
792, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
-1, // escapeChars
-1, // token*
-1, // printable*
466, // digit+
-1, // idChar*
883, // letter+
MIN_REDUCTION+180, // $
-1, // $NT
  }
,
{ // state 1262
0x80000000|1, // match move
0x80000000|1165, // no-match move
0x80000000|36, // NT-test-match state for idChar
  }
,
{ // state 1263
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+179, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
972, // `!
312, // `!=
1102, // `%
1560, // `&&
293, // `*
647, // `(
123, // `)
1355, // `{
95, // `}
413, // `-
1444, // `+
67, // `=
1322, // `==
109, // `[
551, // `]
1370, // `||
168, // `<
53, // `<=
1559, // `,
604, // `>
1435, // `>=
1247, // `.
1490, // `;
111, // `++
50, // `--
152, // `/
385, // `:
872, // ID
161, // INT_LITERAL
485, // STRING_LITERAL
769, // CHAR_LITERAL
513, // "c"
513, // "l"
513, // "a"
513, // "s"
-1, // idChar
-1, // reserved
513, // "e"
637, // "!"
1360, // "="
1616, // "+"
305, // "0"
566, // digit++
961, // digit
513, // "x"
513, // "X"
-1, // hex
1361, // letter
-1, // "_"
513, // "d"
513, // "g"
513, // "m"
513, // "p"
513, // "v"
513, // "y"
513, // "f"
513, // "i"
513, // {"A".."W" "Y".."Z"}
513, // "o"
513, // "r"
513, // "u"
513, // {"j" "q"}
513, // "b"
513, // "h"
513, // "k"
513, // "n"
513, // "t"
513, // "w"
513, // "z"
305, // {"1".."9"}
1304, // white
1602, // {12}
1602, // " "
1602, // {9}
381, // eol
1433, // comment
565, // oneLineComment
26, // blockComment
1572, // "/"
-1, // printable**
-1, // printable
1638, // "*"
-1, // blockCommentContent*
-1, // blockCommentContent
582, // "["
295, // "-"
174, // "<"
182, // "|"
-1, // {"?".."@"}
164, // "&"
1357, // ")"
155, // ","
369, // "]"
-1, // {"#".."$"}
387, // ";"
1173, // ">"
1611, // "{"
978, // "%"
1273, // "("
-1, // "\"
319, // "."
246, // ":"
984, // "}"
-1, // {"^" "`" "~"}
995, // "'"
1482, // '"'
418, // {10}
1458, // {13}
-1, // stringPrintable
-1, // recognizeEscapeChar
-1, // charPrintable
792, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
-1, // escapeChars
-1, // token*
-1, // printable*
466, // digit+
-1, // idChar*
883, // letter+
MIN_REDUCTION+179, // $
-1, // $NT
  }
,
{ // state 1264
92,969, // "s"
  }
,
{ // state 1265
MIN_REDUCTION+163, // (default reduction)
  }
,
{ // state 1266
91,338, // "a"
95,282, // "e"
118,1280, // "u"
  }
,
{ // state 1267
MIN_REDUCTION+226, // (default reduction)
  }
,
{ // state 1268
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+95, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
972, // `!
312, // `!=
1102, // `%
1560, // `&&
293, // `*
647, // `(
123, // `)
1355, // `{
95, // `}
413, // `-
1444, // `+
67, // `=
1322, // `==
109, // `[
551, // `]
1370, // `||
168, // `<
53, // `<=
1559, // `,
604, // `>
1435, // `>=
1247, // `.
1490, // `;
111, // `++
50, // `--
152, // `/
385, // `:
872, // ID
161, // INT_LITERAL
485, // STRING_LITERAL
769, // CHAR_LITERAL
513, // "c"
513, // "l"
513, // "a"
513, // "s"
-1, // idChar
-1, // reserved
513, // "e"
637, // "!"
1360, // "="
1616, // "+"
305, // "0"
566, // digit++
961, // digit
513, // "x"
513, // "X"
-1, // hex
1361, // letter
-1, // "_"
513, // "d"
513, // "g"
513, // "m"
513, // "p"
513, // "v"
513, // "y"
513, // "f"
513, // "i"
513, // {"A".."W" "Y".."Z"}
513, // "o"
513, // "r"
513, // "u"
513, // {"j" "q"}
513, // "b"
513, // "h"
513, // "k"
513, // "n"
513, // "t"
513, // "w"
513, // "z"
305, // {"1".."9"}
1304, // white
1602, // {12}
1602, // " "
1602, // {9}
381, // eol
1433, // comment
565, // oneLineComment
26, // blockComment
1572, // "/"
-1, // printable**
-1, // printable
1638, // "*"
-1, // blockCommentContent*
-1, // blockCommentContent
582, // "["
295, // "-"
174, // "<"
182, // "|"
-1, // {"?".."@"}
164, // "&"
1357, // ")"
155, // ","
369, // "]"
-1, // {"#".."$"}
387, // ";"
1173, // ">"
1611, // "{"
978, // "%"
1273, // "("
-1, // "\"
319, // "."
246, // ":"
984, // "}"
-1, // {"^" "`" "~"}
995, // "'"
1482, // '"'
418, // {10}
1458, // {13}
-1, // stringPrintable
-1, // recognizeEscapeChar
-1, // charPrintable
792, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
-1, // escapeChars
-1, // token*
-1, // printable*
466, // digit+
-1, // idChar*
883, // letter+
MIN_REDUCTION+95, // $
-1, // $NT
  }
,
{ // state 1269
MIN_REDUCTION+165, // (default reduction)
  }
,
{ // state 1270
90,375, // "l"
  }
,
{ // state 1271
-1, // $$start
-1, // start
1472, // white*
-1, // $$0
MIN_REDUCTION+230, // token
1392, // `boolean
1186, // `class
1576, // `extends
798, // `void
1167, // `int
267, // `while
1537, // `if
316, // `else
440, // `for
165, // `break
280, // `this
1368, // `false
1106, // `true
953, // `super
489, // `null
1163, // `return
630, // `instanceof
976, // `new
1330, // `abstract
1402, // `assert
1567, // `byte
27, // `case
833, // `catch
982, // `char
1324, // `const
141, // `continue
115, // `default
1035, // `do
140, // `double
308, // `enum
662, // `final
1021, // `finally
1158, // `float
765, // `goto
1302, // `implements
768, // `import
1514, // `interface
1633, // `long
812, // `native
1233, // `package
245, // `private
339, // `protected
1254, // `public
516, // `short
412, // `static
1491, // `strictfp
832, // `switch
397, // `synchronized
201, // `throw
1108, // `throws
417, // `transient
631, // `try
927, // `volatile
972, // `!
312, // `!=
1102, // `%
1560, // `&&
293, // `*
647, // `(
123, // `)
1355, // `{
95, // `}
413, // `-
1444, // `+
67, // `=
1322, // `==
109, // `[
551, // `]
1370, // `||
168, // `<
53, // `<=
1559, // `,
604, // `>
1435, // `>=
1247, // `.
1490, // `;
111, // `++
50, // `--
152, // `/
385, // `:
-1, // ID
161, // INT_LITERAL
485, // STRING_LITERAL
769, // CHAR_LITERAL
MIN_REDUCTION+230, // "c"
MIN_REDUCTION+230, // "l"
MIN_REDUCTION+230, // "a"
MIN_REDUCTION+230, // "s"
-1, // idChar
-1, // reserved
MIN_REDUCTION+230, // "e"
637, // "!"
1360, // "="
1616, // "+"
MIN_REDUCTION+230, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+230, // "x"
MIN_REDUCTION+230, // "X"
-1, // hex
-1, // letter
-1, // "_"
MIN_REDUCTION+230, // "d"
MIN_REDUCTION+230, // "g"
MIN_REDUCTION+230, // "m"
MIN_REDUCTION+230, // "p"
MIN_REDUCTION+230, // "v"
MIN_REDUCTION+230, // "y"
MIN_REDUCTION+230, // "f"
MIN_REDUCTION+230, // "i"
MIN_REDUCTION+230, // {"A".."W" "Y".."Z"}
MIN_REDUCTION+230, // "o"
MIN_REDUCTION+230, // "r"
MIN_REDUCTION+230, // "u"
MIN_REDUCTION+230, // {"j" "q"}
MIN_REDUCTION+230, // "b"
MIN_REDUCTION+230, // "h"
MIN_REDUCTION+230, // "k"
MIN_REDUCTION+230, // "n"
MIN_REDUCTION+230, // "t"
MIN_REDUCTION+230, // "w"
MIN_REDUCTION+230, // "z"
MIN_REDUCTION+230, // {"1".."9"}
376, // white
1602, // {12}
1602, // " "
1602, // {9}
381, // eol
1433, // comment
565, // oneLineComment
26, // blockComment
1572, // "/"
-1, // printable**
-1, // printable
1638, // "*"
-1, // blockCommentContent*
-1, // blockCommentContent
582, // "["
295, // "-"
174, // "<"
182, // "|"
-1, // {"?".."@"}
164, // "&"
1357, // ")"
155, // ","
369, // "]"
-1, // {"#".."$"}
387, // ";"
1173, // ">"
1611, // "{"
978, // "%"
1273, // "("
-1, // "\"
319, // "."
246, // ":"
984, // "}"
-1, // {"^" "`" "~"}
995, // "'"
1482, // '"'
418, // {10}
1458, // {13}
-1, // stringPrintable
-1, // recognizeEscapeChar
-1, // charPrintable
-1, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
-1, // escapeChars
-1, // token*
-1, // printable*
-1, // digit+
-1, // idChar*
-1, // letter+
MIN_REDUCTION+230, // $
-1, // $NT
  }
,
{ // state 1272
118,199, // "u"
  }
,
{ // state 1273
0x80000000|69, // match move
0x80000000|645, // no-match move
// T-test match for "0":
99,
  }
,
{ // state 1274
92,1023, // "s"
120,1583, // "b"
  }
,
{ // state 1275
0x80000000|1, // match move
0x80000000|503, // no-match move
0x80000000|36, // NT-test-match state for idChar
  }
,
{ // state 1276
0x80000000|1, // match move
0x80000000|533, // no-match move
0x80000000|36, // NT-test-match state for idChar
  }
,
{ // state 1277
113,167, // "f"
  }
,
{ // state 1278
0x80000000|86, // match move
0x80000000|475, // no-match move
// T-test match for "0":
99,
  }
,
{ // state 1279
95,1189, // "e"
116,1310, // "o"
  }
,
{ // state 1280
90,21, // "l"
  }
,
{ // state 1281
0x80000000|1, // match move
0x80000000|1594, // no-match move
0x80000000|36, // NT-test-match state for idChar
  }
,
{ // state 1282
2,756, // white*
128,1336, // white
129,674, // {12}
130,674, // " "
131,674, // {9}
132,889, // eol
133,775, // comment
134,943, // oneLineComment
135,641, // blockComment
136,1598, // "/"
164,926, // {10}
165,676, // {13}
181,MIN_REDUCTION+254, // $NT
  }
,
{ // state 1283
MIN_REDUCTION+344, // (default reduction)
  }
,
{ // state 1284
91,92, // "a"
  }
,
{ // state 1285
117,1030, // "r"
  }
,
{ // state 1286
2,428, // white*
MIN_REDUCTION+168, // (default reduction)
  }
,
{ // state 1287
0x80000000|861, // match move
0x80000000|1296, // no-match move
// T-test match for "0":
99,
  }
,
{ // state 1288
124,1447, // "t"
  }
,
{ // state 1289
181,MIN_REDUCTION+120, // $NT
MIN_REDUCTION+120, // (default reduction)
  }
,
{ // state 1290
MIN_REDUCTION+135, // (default reduction)
  }
,
{ // state 1291
MIN_REDUCTION+377, // (default reduction)
  }
,
{ // state 1292
107,687, // "d"
  }
,
{ // state 1293
0x80000000|571, // match move
0x80000000|477, // no-match move
0x80000000|54, // NT-test-match state for digit
  }
,
{ // state 1294
MIN_REDUCTION+161, // (default reduction)
  }
,
{ // state 1295
128,1304, // white
132,381, // eol
133,1433, // comment
134,565, // oneLineComment
135,26, // blockComment
MIN_REDUCTION+292, // (default reduction)
  }
,
{ // state 1296
0x80000000|742, // match move
0x80000000|1474, // no-match move
0x80000000|1258, // NT-test-match state for reserved
  }
,
{ // state 1297
124,1591, // "t"
  }
,
{ // state 1298
0x80000000|47, // match move
0x80000000|855, // no-match move
// T-test match for "0":
99,
  }
,
{ // state 1299
MIN_REDUCTION+126, // (default reduction)
  }
,
{ // state 1300
0x80000000|930, // match move
0x80000000|1608, // no-match move
// T-test match for "0":
99,
  }
,
{ // state 1301
92,223, // "s"
  }
,
{ // state 1302
MIN_REDUCTION+39, // (default reduction)
  }
,
{ // state 1303
0x80000000|120, // match move
0x80000000|1387, // no-match move
// T-test match for "0":
99,
  }
,
{ // state 1304
MIN_REDUCTION+361, // (default reduction)
  }
,
{ // state 1305
0x80000000|1, // match move
0x80000000|663, // no-match move
0x80000000|36, // NT-test-match state for idChar
  }
,
{ // state 1306
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 1307
128,620, // white
129,674, // {12}
130,674, // " "
131,674, // {9}
132,889, // eol
133,775, // comment
134,943, // oneLineComment
135,641, // blockComment
136,1598, // "/"
164,926, // {10}
165,676, // {13}
181,MIN_REDUCTION+244, // $NT
  }
,
{ // state 1308
0x80000000|30, // match move
0x80000000|945, // no-match move
// T-test match for "0":
99,
  }
,
{ // state 1309
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+253, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
972, // `!
312, // `!=
1102, // `%
1560, // `&&
293, // `*
647, // `(
123, // `)
1355, // `{
95, // `}
413, // `-
1444, // `+
67, // `=
1322, // `==
109, // `[
551, // `]
1370, // `||
168, // `<
53, // `<=
1559, // `,
604, // `>
1435, // `>=
1247, // `.
1490, // `;
111, // `++
50, // `--
152, // `/
385, // `:
872, // ID
161, // INT_LITERAL
485, // STRING_LITERAL
769, // CHAR_LITERAL
513, // "c"
513, // "l"
513, // "a"
513, // "s"
-1, // idChar
-1, // reserved
513, // "e"
637, // "!"
1360, // "="
1616, // "+"
305, // "0"
566, // digit++
961, // digit
513, // "x"
513, // "X"
-1, // hex
1361, // letter
-1, // "_"
513, // "d"
513, // "g"
513, // "m"
513, // "p"
513, // "v"
513, // "y"
513, // "f"
513, // "i"
513, // {"A".."W" "Y".."Z"}
513, // "o"
513, // "r"
513, // "u"
513, // {"j" "q"}
513, // "b"
513, // "h"
513, // "k"
513, // "n"
513, // "t"
513, // "w"
513, // "z"
305, // {"1".."9"}
1304, // white
1602, // {12}
1602, // " "
1602, // {9}
381, // eol
1433, // comment
565, // oneLineComment
26, // blockComment
1572, // "/"
-1, // printable**
-1, // printable
1638, // "*"
-1, // blockCommentContent*
-1, // blockCommentContent
582, // "["
295, // "-"
174, // "<"
182, // "|"
-1, // {"?".."@"}
164, // "&"
1357, // ")"
155, // ","
369, // "]"
-1, // {"#".."$"}
387, // ";"
1173, // ">"
1611, // "{"
978, // "%"
1273, // "("
-1, // "\"
319, // "."
246, // ":"
984, // "}"
-1, // {"^" "`" "~"}
995, // "'"
1482, // '"'
418, // {10}
1458, // {13}
-1, // stringPrintable
-1, // recognizeEscapeChar
-1, // charPrintable
792, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
-1, // escapeChars
-1, // token*
-1, // printable*
466, // digit+
-1, // idChar*
883, // letter+
MIN_REDUCTION+253, // $
-1, // $NT
  }
,
{ // state 1310
0x80000000|1272, // match move
0x80000000|716, // no-match move
0x80000000|36, // NT-test-match state for idChar
  }
,
{ // state 1311
0x80000000|1, // match move
0x80000000|1337, // no-match move
0x80000000|36, // NT-test-match state for idChar
  }
,
{ // state 1312
-1, // $$start
-1, // start
269, // white*
-1, // $$0
MIN_REDUCTION+245, // token
1392, // `boolean
1186, // `class
1576, // `extends
798, // `void
1167, // `int
267, // `while
1537, // `if
316, // `else
440, // `for
165, // `break
280, // `this
1368, // `false
1106, // `true
953, // `super
489, // `null
1163, // `return
630, // `instanceof
976, // `new
1330, // `abstract
1402, // `assert
1567, // `byte
27, // `case
833, // `catch
982, // `char
1324, // `const
141, // `continue
115, // `default
1035, // `do
140, // `double
308, // `enum
662, // `final
1021, // `finally
1158, // `float
765, // `goto
1302, // `implements
768, // `import
1514, // `interface
1633, // `long
812, // `native
1233, // `package
245, // `private
339, // `protected
1254, // `public
516, // `short
412, // `static
1491, // `strictfp
832, // `switch
397, // `synchronized
201, // `throw
1108, // `throws
417, // `transient
631, // `try
927, // `volatile
972, // `!
312, // `!=
1102, // `%
1560, // `&&
293, // `*
647, // `(
123, // `)
1355, // `{
95, // `}
413, // `-
1444, // `+
67, // `=
1322, // `==
109, // `[
551, // `]
1370, // `||
168, // `<
53, // `<=
1559, // `,
604, // `>
1435, // `>=
1247, // `.
1490, // `;
111, // `++
50, // `--
152, // `/
385, // `:
-1, // ID
161, // INT_LITERAL
485, // STRING_LITERAL
769, // CHAR_LITERAL
MIN_REDUCTION+245, // "c"
MIN_REDUCTION+245, // "l"
MIN_REDUCTION+245, // "a"
MIN_REDUCTION+245, // "s"
-1, // idChar
-1, // reserved
MIN_REDUCTION+245, // "e"
637, // "!"
1360, // "="
1616, // "+"
MIN_REDUCTION+245, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+245, // "x"
MIN_REDUCTION+245, // "X"
-1, // hex
-1, // letter
-1, // "_"
MIN_REDUCTION+245, // "d"
MIN_REDUCTION+245, // "g"
MIN_REDUCTION+245, // "m"
MIN_REDUCTION+245, // "p"
MIN_REDUCTION+245, // "v"
MIN_REDUCTION+245, // "y"
MIN_REDUCTION+245, // "f"
MIN_REDUCTION+245, // "i"
MIN_REDUCTION+245, // {"A".."W" "Y".."Z"}
MIN_REDUCTION+245, // "o"
MIN_REDUCTION+245, // "r"
MIN_REDUCTION+245, // "u"
MIN_REDUCTION+245, // {"j" "q"}
MIN_REDUCTION+245, // "b"
MIN_REDUCTION+245, // "h"
MIN_REDUCTION+245, // "k"
MIN_REDUCTION+245, // "n"
MIN_REDUCTION+245, // "t"
MIN_REDUCTION+245, // "w"
MIN_REDUCTION+245, // "z"
MIN_REDUCTION+245, // {"1".."9"}
376, // white
1602, // {12}
1602, // " "
1602, // {9}
381, // eol
1433, // comment
565, // oneLineComment
26, // blockComment
1572, // "/"
-1, // printable**
-1, // printable
1638, // "*"
-1, // blockCommentContent*
-1, // blockCommentContent
582, // "["
295, // "-"
174, // "<"
182, // "|"
-1, // {"?".."@"}
164, // "&"
1357, // ")"
155, // ","
369, // "]"
-1, // {"#".."$"}
387, // ";"
1173, // ">"
1611, // "{"
978, // "%"
1273, // "("
-1, // "\"
319, // "."
246, // ":"
984, // "}"
-1, // {"^" "`" "~"}
995, // "'"
1482, // '"'
418, // {10}
1458, // {13}
-1, // stringPrintable
-1, // recognizeEscapeChar
-1, // charPrintable
-1, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
-1, // escapeChars
-1, // token*
-1, // printable*
-1, // digit+
-1, // idChar*
-1, // letter+
MIN_REDUCTION+245, // $
-1, // $NT
  }
,
{ // state 1313
0x80000000|1600, // match move
0x80000000|1237, // no-match move
// T-test match for "0":
99,
  }
,
{ // state 1314
128,1304, // white
132,381, // eol
133,1433, // comment
134,565, // oneLineComment
135,26, // blockComment
MIN_REDUCTION+331, // (default reduction)
  }
,
{ // state 1315
0x80000000|1420, // match move
0x80000000|1521, // no-match move
// T-test match for "0":
99,
  }
,
{ // state 1316
0x80000000|1, // match move
0x80000000|476, // no-match move
0x80000000|36, // NT-test-match state for idChar
  }
,
{ // state 1317
128,1304, // white
132,381, // eol
133,1433, // comment
134,565, // oneLineComment
135,26, // blockComment
MIN_REDUCTION+179, // (default reduction)
  }
,
{ // state 1318
95,1634, // "e"
  }
,
{ // state 1319
0x80000000|831, // match move
0x80000000|341, // no-match move
// T-test match for "0":
99,
  }
,
{ // state 1320
109,347, // "m"
  }
,
{ // state 1321
128,1304, // white
132,381, // eol
133,1433, // comment
134,565, // oneLineComment
135,26, // blockComment
MIN_REDUCTION+169, // (default reduction)
  }
,
{ // state 1322
MIN_REDUCTION+70, // (default reduction)
  }
,
{ // state 1323
MIN_REDUCTION+131, // (default reduction)
  }
,
{ // state 1324
MIN_REDUCTION+29, // (default reduction)
  }
,
{ // state 1325
0x80000000|1073, // match move
0x80000000|1601, // no-match move
// T-test match for "/":
136,
  }
,
{ // state 1326
0x80000000|1057, // match move
0x80000000|597, // no-match move
0x80000000|36, // NT-test-match state for idChar
  }
,
{ // state 1327
95,1468, // "e"
  }
,
{ // state 1328
128,1304, // white
132,381, // eol
133,1433, // comment
134,565, // oneLineComment
135,26, // blockComment
MIN_REDUCTION+286, // (default reduction)
  }
,
{ // state 1329
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+319, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
972, // `!
312, // `!=
1102, // `%
1560, // `&&
293, // `*
647, // `(
123, // `)
1355, // `{
95, // `}
413, // `-
1444, // `+
67, // `=
1322, // `==
109, // `[
551, // `]
1370, // `||
168, // `<
53, // `<=
1559, // `,
604, // `>
1435, // `>=
1247, // `.
1490, // `;
111, // `++
50, // `--
152, // `/
385, // `:
872, // ID
161, // INT_LITERAL
485, // STRING_LITERAL
769, // CHAR_LITERAL
513, // "c"
513, // "l"
513, // "a"
513, // "s"
-1, // idChar
-1, // reserved
513, // "e"
637, // "!"
1360, // "="
1616, // "+"
305, // "0"
566, // digit++
961, // digit
513, // "x"
513, // "X"
-1, // hex
1361, // letter
-1, // "_"
513, // "d"
513, // "g"
513, // "m"
513, // "p"
513, // "v"
513, // "y"
513, // "f"
513, // "i"
513, // {"A".."W" "Y".."Z"}
513, // "o"
513, // "r"
513, // "u"
513, // {"j" "q"}
513, // "b"
513, // "h"
513, // "k"
513, // "n"
513, // "t"
513, // "w"
513, // "z"
305, // {"1".."9"}
1304, // white
1602, // {12}
1602, // " "
1602, // {9}
381, // eol
1433, // comment
565, // oneLineComment
26, // blockComment
1572, // "/"
-1, // printable**
-1, // printable
1638, // "*"
-1, // blockCommentContent*
-1, // blockCommentContent
582, // "["
295, // "-"
174, // "<"
182, // "|"
-1, // {"?".."@"}
164, // "&"
1357, // ")"
155, // ","
369, // "]"
-1, // {"#".."$"}
387, // ";"
1173, // ">"
1611, // "{"
978, // "%"
1273, // "("
-1, // "\"
319, // "."
246, // ":"
984, // "}"
-1, // {"^" "`" "~"}
995, // "'"
1482, // '"'
418, // {10}
1458, // {13}
-1, // stringPrintable
-1, // recognizeEscapeChar
-1, // charPrintable
792, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
-1, // escapeChars
-1, // token*
-1, // printable*
466, // digit+
-1, // idChar*
883, // letter+
MIN_REDUCTION+319, // $
-1, // $NT
  }
,
{ // state 1330
MIN_REDUCTION+23, // (default reduction)
  }
,
{ // state 1331
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 1332
90,981, // "l"
91,1270, // "a"
114,879, // "i"
116,193, // "o"
  }
,
{ // state 1333
0x80000000|1211, // match move
0x80000000|203, // no-match move
// T-test match for "0":
99,
  }
,
{ // state 1334
0x80000000|1607, // match move
0x80000000|829, // no-match move
0x80000000|1258, // NT-test-match state for reserved
  }
,
{ // state 1335
116,98, // "o"
  }
,
{ // state 1336
181,MIN_REDUCTION+362, // $NT
MIN_REDUCTION+362, // (default reduction)
  }
,
{ // state 1337
-1, // $$start
-1, // start
1033, // white*
-1, // $$0
MIN_REDUCTION+203, // token
1392, // `boolean
1186, // `class
1576, // `extends
798, // `void
1167, // `int
267, // `while
1537, // `if
316, // `else
440, // `for
165, // `break
280, // `this
1368, // `false
1106, // `true
953, // `super
489, // `null
1163, // `return
630, // `instanceof
976, // `new
1330, // `abstract
1402, // `assert
1567, // `byte
27, // `case
833, // `catch
982, // `char
1324, // `const
141, // `continue
115, // `default
1035, // `do
140, // `double
308, // `enum
662, // `final
1021, // `finally
1158, // `float
765, // `goto
1302, // `implements
768, // `import
1514, // `interface
1633, // `long
812, // `native
1233, // `package
245, // `private
339, // `protected
1254, // `public
516, // `short
412, // `static
1491, // `strictfp
832, // `switch
397, // `synchronized
201, // `throw
1108, // `throws
417, // `transient
631, // `try
927, // `volatile
972, // `!
312, // `!=
1102, // `%
1560, // `&&
293, // `*
647, // `(
123, // `)
1355, // `{
95, // `}
413, // `-
1444, // `+
67, // `=
1322, // `==
109, // `[
551, // `]
1370, // `||
168, // `<
53, // `<=
1559, // `,
604, // `>
1435, // `>=
1247, // `.
1490, // `;
111, // `++
50, // `--
152, // `/
385, // `:
-1, // ID
161, // INT_LITERAL
485, // STRING_LITERAL
769, // CHAR_LITERAL
MIN_REDUCTION+203, // "c"
MIN_REDUCTION+203, // "l"
MIN_REDUCTION+203, // "a"
MIN_REDUCTION+203, // "s"
-1, // idChar
-1, // reserved
MIN_REDUCTION+203, // "e"
637, // "!"
1360, // "="
1616, // "+"
MIN_REDUCTION+203, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+203, // "x"
MIN_REDUCTION+203, // "X"
-1, // hex
-1, // letter
-1, // "_"
MIN_REDUCTION+203, // "d"
MIN_REDUCTION+203, // "g"
MIN_REDUCTION+203, // "m"
MIN_REDUCTION+203, // "p"
MIN_REDUCTION+203, // "v"
MIN_REDUCTION+203, // "y"
MIN_REDUCTION+203, // "f"
MIN_REDUCTION+203, // "i"
MIN_REDUCTION+203, // {"A".."W" "Y".."Z"}
MIN_REDUCTION+203, // "o"
MIN_REDUCTION+203, // "r"
MIN_REDUCTION+203, // "u"
MIN_REDUCTION+203, // {"j" "q"}
MIN_REDUCTION+203, // "b"
MIN_REDUCTION+203, // "h"
MIN_REDUCTION+203, // "k"
MIN_REDUCTION+203, // "n"
MIN_REDUCTION+203, // "t"
MIN_REDUCTION+203, // "w"
MIN_REDUCTION+203, // "z"
MIN_REDUCTION+203, // {"1".."9"}
376, // white
1602, // {12}
1602, // " "
1602, // {9}
381, // eol
1433, // comment
565, // oneLineComment
26, // blockComment
1572, // "/"
-1, // printable**
-1, // printable
1638, // "*"
-1, // blockCommentContent*
-1, // blockCommentContent
582, // "["
295, // "-"
174, // "<"
182, // "|"
-1, // {"?".."@"}
164, // "&"
1357, // ")"
155, // ","
369, // "]"
-1, // {"#".."$"}
387, // ";"
1173, // ">"
1611, // "{"
978, // "%"
1273, // "("
-1, // "\"
319, // "."
246, // ":"
984, // "}"
-1, // {"^" "`" "~"}
995, // "'"
1482, // '"'
418, // {10}
1458, // {13}
-1, // stringPrintable
-1, // recognizeEscapeChar
-1, // charPrintable
-1, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
-1, // escapeChars
-1, // token*
-1, // printable*
-1, // digit+
-1, // idChar*
-1, // letter+
MIN_REDUCTION+203, // $
-1, // $NT
  }
,
{ // state 1338
116,1496, // "o"
  }
,
{ // state 1339
2,173, // white*
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 1340
0x80000000|1, // match move
0x80000000|568, // no-match move
0x80000000|36, // NT-test-match state for idChar
  }
,
{ // state 1341
181,MIN_REDUCTION+318, // $NT
  }
,
{ // state 1342
MIN_REDUCTION+129, // (default reduction)
  }
,
{ // state 1343
2,185, // white*
MIN_REDUCTION+138, // (default reduction)
  }
,
{ // state 1344
0x80000000|490, // match move
0x80000000|1597, // no-match move
0x80000000|1258, // NT-test-match state for reserved
  }
,
{ // state 1345
0x80000000|1018, // match move
0x80000000|422, // no-match move
// T-test match for "0":
99,
  }
,
{ // state 1346
-1, // $$start
-1, // start
12, // white*
-1, // $$0
MIN_REDUCTION+317, // token
1392, // `boolean
1186, // `class
1576, // `extends
798, // `void
1167, // `int
267, // `while
1537, // `if
316, // `else
440, // `for
165, // `break
280, // `this
1368, // `false
1106, // `true
953, // `super
489, // `null
1163, // `return
630, // `instanceof
976, // `new
1330, // `abstract
1402, // `assert
1567, // `byte
27, // `case
833, // `catch
982, // `char
1324, // `const
141, // `continue
115, // `default
1035, // `do
140, // `double
308, // `enum
662, // `final
1021, // `finally
1158, // `float
765, // `goto
1302, // `implements
768, // `import
1514, // `interface
1633, // `long
812, // `native
1233, // `package
245, // `private
339, // `protected
1254, // `public
516, // `short
412, // `static
1491, // `strictfp
832, // `switch
397, // `synchronized
201, // `throw
1108, // `throws
417, // `transient
631, // `try
927, // `volatile
972, // `!
312, // `!=
1102, // `%
1560, // `&&
293, // `*
647, // `(
123, // `)
1355, // `{
95, // `}
413, // `-
1444, // `+
67, // `=
1322, // `==
109, // `[
551, // `]
1370, // `||
168, // `<
53, // `<=
1559, // `,
604, // `>
1435, // `>=
1247, // `.
1490, // `;
111, // `++
50, // `--
152, // `/
385, // `:
-1, // ID
161, // INT_LITERAL
485, // STRING_LITERAL
769, // CHAR_LITERAL
MIN_REDUCTION+317, // "c"
MIN_REDUCTION+317, // "l"
MIN_REDUCTION+317, // "a"
MIN_REDUCTION+317, // "s"
-1, // idChar
-1, // reserved
MIN_REDUCTION+317, // "e"
637, // "!"
1360, // "="
1616, // "+"
MIN_REDUCTION+317, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+317, // "x"
MIN_REDUCTION+317, // "X"
-1, // hex
-1, // letter
-1, // "_"
MIN_REDUCTION+317, // "d"
MIN_REDUCTION+317, // "g"
MIN_REDUCTION+317, // "m"
MIN_REDUCTION+317, // "p"
MIN_REDUCTION+317, // "v"
MIN_REDUCTION+317, // "y"
MIN_REDUCTION+317, // "f"
MIN_REDUCTION+317, // "i"
MIN_REDUCTION+317, // {"A".."W" "Y".."Z"}
MIN_REDUCTION+317, // "o"
MIN_REDUCTION+317, // "r"
MIN_REDUCTION+317, // "u"
MIN_REDUCTION+317, // {"j" "q"}
MIN_REDUCTION+317, // "b"
MIN_REDUCTION+317, // "h"
MIN_REDUCTION+317, // "k"
MIN_REDUCTION+317, // "n"
MIN_REDUCTION+317, // "t"
MIN_REDUCTION+317, // "w"
MIN_REDUCTION+317, // "z"
MIN_REDUCTION+317, // {"1".."9"}
376, // white
1602, // {12}
1602, // " "
1602, // {9}
381, // eol
1433, // comment
565, // oneLineComment
26, // blockComment
1572, // "/"
-1, // printable**
-1, // printable
1638, // "*"
-1, // blockCommentContent*
-1, // blockCommentContent
582, // "["
295, // "-"
174, // "<"
182, // "|"
-1, // {"?".."@"}
164, // "&"
1357, // ")"
155, // ","
369, // "]"
-1, // {"#".."$"}
387, // ";"
1173, // ">"
1611, // "{"
978, // "%"
1273, // "("
-1, // "\"
319, // "."
246, // ":"
984, // "}"
-1, // {"^" "`" "~"}
995, // "'"
1482, // '"'
418, // {10}
1458, // {13}
-1, // stringPrintable
-1, // recognizeEscapeChar
-1, // charPrintable
-1, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
-1, // escapeChars
-1, // token*
-1, // printable*
-1, // digit+
-1, // idChar*
-1, // letter+
MIN_REDUCTION+317, // $
-1, // $NT
  }
,
{ // state 1347
89,107, // "c"
  }
,
{ // state 1348
181,MIN_REDUCTION+237, // $NT
  }
,
{ // state 1349
2,1404, // white*
128,1336, // white
129,674, // {12}
130,674, // " "
131,674, // {9}
132,889, // eol
133,775, // comment
134,943, // oneLineComment
135,641, // blockComment
136,1598, // "/"
164,926, // {10}
165,676, // {13}
181,MIN_REDUCTION+191, // $NT
  }
,
{ // state 1350
89,1227, // "c"
  }
,
{ // state 1351
0x80000000|858, // match move
0x80000000|1225, // no-match move
// T-test match for "0":
99,
  }
,
{ // state 1352
124,977, // "t"
  }
,
{ // state 1353
2,1028, // white*
128,1336, // white
129,674, // {12}
130,674, // " "
131,674, // {9}
132,889, // eol
133,775, // comment
134,943, // oneLineComment
135,641, // blockComment
136,1598, // "/"
164,926, // {10}
165,676, // {13}
181,MIN_REDUCTION+323, // $NT
  }
,
{ // state 1354
MIN_REDUCTION+112, // (default reduction)
  }
,
{ // state 1355
MIN_REDUCTION+65, // (default reduction)
  }
,
{ // state 1356
0x80000000|1, // match move
0x80000000|578, // no-match move
0x80000000|36, // NT-test-match state for idChar
  }
,
{ // state 1357
0x80000000|921, // match move
0x80000000|681, // no-match move
// T-test match for "0":
99,
  }
,
{ // state 1358
0x80000000|1, // match move
0x80000000|189, // no-match move
0x80000000|410, // NT-test-match state for letter
  }
,
{ // state 1359
0x80000000|553, // match move
0x80000000|1179, // no-match move
0x80000000|1258, // NT-test-match state for reserved
  }
,
{ // state 1360
0x80000000|814, // match move
0x80000000|1319, // no-match move
// T-test match for "=":
97,
  }
,
{ // state 1361
0x80000000|472, // match move
0x80000000|1358, // no-match move
0x80000000|36, // NT-test-match state for idChar
  }
,
{ // state 1362
MIN_REDUCTION+193, // (default reduction)
  }
,
{ // state 1363
0x80000000|353, // match move
0x80000000|511, // no-match move
0x80000000|1258, // NT-test-match state for reserved
  }
,
{ // state 1364
113,895, // "f"
  }
,
{ // state 1365
0x80000000|1, // match move
0x80000000|1312, // no-match move
0x80000000|36, // NT-test-match state for idChar
  }
,
{ // state 1366
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+268, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
972, // `!
312, // `!=
1102, // `%
1560, // `&&
293, // `*
647, // `(
123, // `)
1355, // `{
95, // `}
413, // `-
1444, // `+
67, // `=
1322, // `==
109, // `[
551, // `]
1370, // `||
168, // `<
53, // `<=
1559, // `,
604, // `>
1435, // `>=
1247, // `.
1490, // `;
111, // `++
50, // `--
152, // `/
385, // `:
872, // ID
161, // INT_LITERAL
485, // STRING_LITERAL
769, // CHAR_LITERAL
513, // "c"
513, // "l"
513, // "a"
513, // "s"
-1, // idChar
-1, // reserved
513, // "e"
637, // "!"
1360, // "="
1616, // "+"
305, // "0"
566, // digit++
961, // digit
513, // "x"
513, // "X"
-1, // hex
1361, // letter
-1, // "_"
513, // "d"
513, // "g"
513, // "m"
513, // "p"
513, // "v"
513, // "y"
513, // "f"
513, // "i"
513, // {"A".."W" "Y".."Z"}
513, // "o"
513, // "r"
513, // "u"
513, // {"j" "q"}
513, // "b"
513, // "h"
513, // "k"
513, // "n"
513, // "t"
513, // "w"
513, // "z"
305, // {"1".."9"}
1304, // white
1602, // {12}
1602, // " "
1602, // {9}
381, // eol
1433, // comment
565, // oneLineComment
26, // blockComment
1572, // "/"
-1, // printable**
-1, // printable
1638, // "*"
-1, // blockCommentContent*
-1, // blockCommentContent
582, // "["
295, // "-"
174, // "<"
182, // "|"
-1, // {"?".."@"}
164, // "&"
1357, // ")"
155, // ","
369, // "]"
-1, // {"#".."$"}
387, // ";"
1173, // ">"
1611, // "{"
978, // "%"
1273, // "("
-1, // "\"
319, // "."
246, // ":"
984, // "}"
-1, // {"^" "`" "~"}
995, // "'"
1482, // '"'
418, // {10}
1458, // {13}
-1, // stringPrintable
-1, // recognizeEscapeChar
-1, // charPrintable
792, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
-1, // escapeChars
-1, // token*
-1, // printable*
466, // digit+
-1, // idChar*
883, // letter+
MIN_REDUCTION+268, // $
-1, // $NT
  }
,
{ // state 1367
MIN_REDUCTION+126, // (default reduction)
  }
,
{ // state 1368
MIN_REDUCTION+16, // (default reduction)
  }
,
{ // state 1369
0x80000000|1, // match move
0x80000000|208, // no-match move
0x80000000|36, // NT-test-match state for idChar
  }
,
{ // state 1370
MIN_REDUCTION+73, // (default reduction)
  }
,
{ // state 1371
91,1118, // "a"
  }
,
{ // state 1372
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+334, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
972, // `!
312, // `!=
1102, // `%
1560, // `&&
293, // `*
647, // `(
123, // `)
1355, // `{
95, // `}
413, // `-
1444, // `+
67, // `=
1322, // `==
109, // `[
551, // `]
1370, // `||
168, // `<
53, // `<=
1559, // `,
604, // `>
1435, // `>=
1247, // `.
1490, // `;
111, // `++
50, // `--
152, // `/
385, // `:
872, // ID
161, // INT_LITERAL
485, // STRING_LITERAL
769, // CHAR_LITERAL
513, // "c"
513, // "l"
513, // "a"
513, // "s"
-1, // idChar
-1, // reserved
513, // "e"
637, // "!"
1360, // "="
1616, // "+"
305, // "0"
566, // digit++
961, // digit
513, // "x"
513, // "X"
-1, // hex
1361, // letter
-1, // "_"
513, // "d"
513, // "g"
513, // "m"
513, // "p"
513, // "v"
513, // "y"
513, // "f"
513, // "i"
513, // {"A".."W" "Y".."Z"}
513, // "o"
513, // "r"
513, // "u"
513, // {"j" "q"}
513, // "b"
513, // "h"
513, // "k"
513, // "n"
513, // "t"
513, // "w"
513, // "z"
305, // {"1".."9"}
1304, // white
1602, // {12}
1602, // " "
1602, // {9}
381, // eol
1433, // comment
565, // oneLineComment
26, // blockComment
1572, // "/"
-1, // printable**
-1, // printable
1638, // "*"
-1, // blockCommentContent*
-1, // blockCommentContent
582, // "["
295, // "-"
174, // "<"
182, // "|"
-1, // {"?".."@"}
164, // "&"
1357, // ")"
155, // ","
369, // "]"
-1, // {"#".."$"}
387, // ";"
1173, // ">"
1611, // "{"
978, // "%"
1273, // "("
-1, // "\"
319, // "."
246, // ":"
984, // "}"
-1, // {"^" "`" "~"}
995, // "'"
1482, // '"'
418, // {10}
1458, // {13}
-1, // stringPrintable
-1, // recognizeEscapeChar
-1, // charPrintable
792, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
-1, // escapeChars
-1, // token*
-1, // printable*
466, // digit+
-1, // idChar*
883, // letter+
MIN_REDUCTION+334, // $
-1, // $NT
  }
,
{ // state 1373
0x80000000|106, // match move
0x80000000|925, // no-match move
// T-test match for "0":
99,
  }
,
{ // state 1374
0x80000000|452, // match move
0x80000000|1454, // no-match move
0x80000000|1258, // NT-test-match state for reserved
  }
,
{ // state 1375
0x80000000|1544, // match move
0x80000000|560, // no-match move
0x80000000|1258, // NT-test-match state for reserved
  }
,
{ // state 1376
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+106, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
972, // `!
312, // `!=
1102, // `%
1560, // `&&
293, // `*
647, // `(
123, // `)
1355, // `{
95, // `}
413, // `-
1444, // `+
67, // `=
1322, // `==
109, // `[
551, // `]
1370, // `||
168, // `<
53, // `<=
1559, // `,
604, // `>
1435, // `>=
1247, // `.
1490, // `;
111, // `++
50, // `--
152, // `/
385, // `:
872, // ID
161, // INT_LITERAL
485, // STRING_LITERAL
769, // CHAR_LITERAL
513, // "c"
513, // "l"
513, // "a"
513, // "s"
-1, // idChar
-1, // reserved
513, // "e"
637, // "!"
1360, // "="
1616, // "+"
305, // "0"
566, // digit++
961, // digit
513, // "x"
513, // "X"
-1, // hex
1361, // letter
-1, // "_"
513, // "d"
513, // "g"
513, // "m"
513, // "p"
513, // "v"
513, // "y"
513, // "f"
513, // "i"
513, // {"A".."W" "Y".."Z"}
513, // "o"
513, // "r"
513, // "u"
513, // {"j" "q"}
513, // "b"
513, // "h"
513, // "k"
513, // "n"
513, // "t"
513, // "w"
513, // "z"
305, // {"1".."9"}
1304, // white
1602, // {12}
1602, // " "
1602, // {9}
381, // eol
1433, // comment
565, // oneLineComment
26, // blockComment
1572, // "/"
-1, // printable**
-1, // printable
1638, // "*"
-1, // blockCommentContent*
-1, // blockCommentContent
582, // "["
295, // "-"
174, // "<"
182, // "|"
-1, // {"?".."@"}
164, // "&"
1357, // ")"
155, // ","
369, // "]"
-1, // {"#".."$"}
387, // ";"
1173, // ">"
1611, // "{"
978, // "%"
1273, // "("
-1, // "\"
319, // "."
246, // ":"
984, // "}"
-1, // {"^" "`" "~"}
995, // "'"
1482, // '"'
418, // {10}
1458, // {13}
-1, // stringPrintable
-1, // recognizeEscapeChar
-1, // charPrintable
792, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
-1, // escapeChars
-1, // token*
-1, // printable*
466, // digit+
-1, // idChar*
883, // letter+
MIN_REDUCTION+106, // $
-1, // $NT
  }
,
{ // state 1377
121,613, // "h"
  }
,
{ // state 1378
91,877, // "a"
  }
,
{ // state 1379
2,971, // white*
128,1336, // white
129,674, // {12}
130,674, // " "
131,674, // {9}
132,889, // eol
133,775, // comment
134,943, // oneLineComment
135,641, // blockComment
136,1598, // "/"
164,926, // {10}
165,676, // {13}
181,MIN_REDUCTION+308, // $NT
  }
,
{ // state 1380
95,1197, // "e"
  }
,
{ // state 1381
95,311, // "e"
  }
,
{ // state 1382
123,252, // "n"
  }
,
{ // state 1383
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+163, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
972, // `!
312, // `!=
1102, // `%
1560, // `&&
293, // `*
647, // `(
123, // `)
1355, // `{
95, // `}
413, // `-
1444, // `+
67, // `=
1322, // `==
109, // `[
551, // `]
1370, // `||
168, // `<
53, // `<=
1559, // `,
604, // `>
1435, // `>=
1247, // `.
1490, // `;
111, // `++
50, // `--
152, // `/
385, // `:
872, // ID
161, // INT_LITERAL
485, // STRING_LITERAL
769, // CHAR_LITERAL
513, // "c"
513, // "l"
513, // "a"
513, // "s"
-1, // idChar
-1, // reserved
513, // "e"
637, // "!"
1360, // "="
1616, // "+"
305, // "0"
566, // digit++
961, // digit
513, // "x"
513, // "X"
-1, // hex
1361, // letter
-1, // "_"
513, // "d"
513, // "g"
513, // "m"
513, // "p"
513, // "v"
513, // "y"
513, // "f"
513, // "i"
513, // {"A".."W" "Y".."Z"}
513, // "o"
513, // "r"
513, // "u"
513, // {"j" "q"}
513, // "b"
513, // "h"
513, // "k"
513, // "n"
513, // "t"
513, // "w"
513, // "z"
305, // {"1".."9"}
1304, // white
1602, // {12}
1602, // " "
1602, // {9}
381, // eol
1433, // comment
565, // oneLineComment
26, // blockComment
1572, // "/"
-1, // printable**
-1, // printable
1638, // "*"
-1, // blockCommentContent*
-1, // blockCommentContent
582, // "["
295, // "-"
174, // "<"
182, // "|"
-1, // {"?".."@"}
164, // "&"
1357, // ")"
155, // ","
369, // "]"
-1, // {"#".."$"}
387, // ";"
1173, // ">"
1611, // "{"
978, // "%"
1273, // "("
-1, // "\"
319, // "."
246, // ":"
984, // "}"
-1, // {"^" "`" "~"}
995, // "'"
1482, // '"'
418, // {10}
1458, // {13}
-1, // stringPrintable
-1, // recognizeEscapeChar
-1, // charPrintable
792, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
-1, // escapeChars
-1, // token*
-1, // printable*
466, // digit+
-1, // idChar*
883, // letter+
MIN_REDUCTION+163, // $
-1, // $NT
  }
,
{ // state 1384
0x80000000|1286, // match move
0x80000000|622, // no-match move
0x80000000|1258, // NT-test-match state for reserved
  }
,
{ // state 1385
MIN_REDUCTION+337, // (default reduction)
  }
,
{ // state 1386
102,811, // "x"
103,892, // "X"
104,265, // hex
  }
,
{ // state 1387
0x80000000|1632, // match move
0x80000000|1095, // no-match move
0x80000000|1258, // NT-test-match state for reserved
  }
,
{ // state 1388
114,1557, // "i"
  }
,
{ // state 1389
128,620, // white
129,674, // {12}
130,674, // " "
131,674, // {9}
132,889, // eol
133,775, // comment
134,943, // oneLineComment
135,641, // blockComment
136,1598, // "/"
164,926, // {10}
165,676, // {13}
181,MIN_REDUCTION+199, // $NT
  }
,
{ // state 1390
95,504, // "e"
  }
,
{ // state 1391
0x80000000|302, // match move
0x80000000|570, // no-match move
0x80000000|1258, // NT-test-match state for reserved
  }
,
{ // state 1392
MIN_REDUCTION+5, // (default reduction)
  }
,
{ // state 1393
132,457, // eol
164,356, // {10}
165,688, // {13}
  }
,
{ // state 1394
0x80000000|1074, // match move
0x80000000|767, // no-match move
// T-test match for "0":
99,
  }
,
{ // state 1395
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+89, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
972, // `!
312, // `!=
1102, // `%
1560, // `&&
293, // `*
647, // `(
123, // `)
1355, // `{
95, // `}
413, // `-
1444, // `+
67, // `=
1322, // `==
109, // `[
551, // `]
1370, // `||
168, // `<
53, // `<=
1559, // `,
604, // `>
1435, // `>=
1247, // `.
1490, // `;
111, // `++
50, // `--
152, // `/
385, // `:
872, // ID
161, // INT_LITERAL
485, // STRING_LITERAL
769, // CHAR_LITERAL
513, // "c"
513, // "l"
513, // "a"
513, // "s"
-1, // idChar
-1, // reserved
513, // "e"
637, // "!"
1360, // "="
1616, // "+"
305, // "0"
566, // digit++
961, // digit
513, // "x"
513, // "X"
-1, // hex
1361, // letter
-1, // "_"
513, // "d"
513, // "g"
513, // "m"
513, // "p"
513, // "v"
513, // "y"
513, // "f"
513, // "i"
513, // {"A".."W" "Y".."Z"}
513, // "o"
513, // "r"
513, // "u"
513, // {"j" "q"}
513, // "b"
513, // "h"
513, // "k"
513, // "n"
513, // "t"
513, // "w"
513, // "z"
305, // {"1".."9"}
1304, // white
1602, // {12}
1602, // " "
1602, // {9}
381, // eol
1433, // comment
565, // oneLineComment
26, // blockComment
1572, // "/"
-1, // printable**
-1, // printable
1638, // "*"
-1, // blockCommentContent*
-1, // blockCommentContent
582, // "["
295, // "-"
174, // "<"
182, // "|"
-1, // {"?".."@"}
164, // "&"
1357, // ")"
155, // ","
369, // "]"
-1, // {"#".."$"}
387, // ";"
1173, // ">"
1611, // "{"
978, // "%"
1273, // "("
-1, // "\"
319, // "."
246, // ":"
984, // "}"
-1, // {"^" "`" "~"}
995, // "'"
1482, // '"'
418, // {10}
1458, // {13}
-1, // stringPrintable
-1, // recognizeEscapeChar
-1, // charPrintable
792, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
-1, // escapeChars
-1, // token*
-1, // printable*
466, // digit+
-1, // idChar*
883, // letter+
MIN_REDUCTION+89, // $
-1, // $NT
  }
,
{ // state 1396
128,1304, // white
132,381, // eol
133,1433, // comment
134,565, // oneLineComment
135,26, // blockComment
MIN_REDUCTION+250, // (default reduction)
  }
,
{ // state 1397
95,210, // "e"
  }
,
{ // state 1398
128,620, // white
129,674, // {12}
130,674, // " "
131,674, // {9}
132,889, // eol
133,775, // comment
134,943, // oneLineComment
135,641, // blockComment
136,1598, // "/"
164,926, // {10}
165,676, // {13}
181,MIN_REDUCTION+235, // $NT
  }
,
{ // state 1399
MIN_REDUCTION+349, // (default reduction)
  }
,
{ // state 1400
2,499, // white*
128,1336, // white
129,674, // {12}
130,674, // " "
131,674, // {9}
132,889, // eol
133,775, // comment
134,943, // oneLineComment
135,641, // blockComment
136,1598, // "/"
164,926, // {10}
165,676, // {13}
181,MIN_REDUCTION+218, // $NT
  }
,
{ // state 1401
0x80000000|1, // match move
0x80000000|1407, // no-match move
0x80000000|36, // NT-test-match state for idChar
  }
,
{ // state 1402
MIN_REDUCTION+24, // (default reduction)
  }
,
{ // state 1403
116,345, // "o"
  }
,
{ // state 1404
128,620, // white
129,674, // {12}
130,674, // " "
131,674, // {9}
132,889, // eol
133,775, // comment
134,943, // oneLineComment
135,641, // blockComment
136,1598, // "/"
164,926, // {10}
165,676, // {13}
181,MIN_REDUCTION+190, // $NT
  }
,
{ // state 1405
0x80000000|114, // match move
0x80000000|541, // no-match move
0x80000000|1258, // NT-test-match state for reserved
  }
,
{ // state 1406
128,620, // white
129,674, // {12}
130,674, // " "
131,674, // {9}
132,889, // eol
133,775, // comment
134,943, // oneLineComment
135,641, // blockComment
136,1598, // "/"
164,926, // {10}
165,676, // {13}
181,MIN_REDUCTION+193, // $NT
  }
,
{ // state 1407
-1, // $$start
-1, // start
1068, // white*
-1, // $$0
MIN_REDUCTION+90, // token
1392, // `boolean
1186, // `class
1576, // `extends
798, // `void
1167, // `int
267, // `while
1537, // `if
316, // `else
440, // `for
165, // `break
280, // `this
1368, // `false
1106, // `true
953, // `super
489, // `null
1163, // `return
630, // `instanceof
976, // `new
1330, // `abstract
1402, // `assert
1567, // `byte
27, // `case
833, // `catch
982, // `char
1324, // `const
141, // `continue
115, // `default
1035, // `do
140, // `double
308, // `enum
662, // `final
1021, // `finally
1158, // `float
765, // `goto
1302, // `implements
768, // `import
1514, // `interface
1633, // `long
812, // `native
1233, // `package
245, // `private
339, // `protected
1254, // `public
516, // `short
412, // `static
1491, // `strictfp
832, // `switch
397, // `synchronized
201, // `throw
1108, // `throws
417, // `transient
631, // `try
927, // `volatile
972, // `!
312, // `!=
1102, // `%
1560, // `&&
293, // `*
647, // `(
123, // `)
1355, // `{
95, // `}
413, // `-
1444, // `+
67, // `=
1322, // `==
109, // `[
551, // `]
1370, // `||
168, // `<
53, // `<=
1559, // `,
604, // `>
1435, // `>=
1247, // `.
1490, // `;
111, // `++
50, // `--
152, // `/
385, // `:
-1, // ID
161, // INT_LITERAL
485, // STRING_LITERAL
769, // CHAR_LITERAL
MIN_REDUCTION+90, // "c"
MIN_REDUCTION+90, // "l"
MIN_REDUCTION+90, // "a"
MIN_REDUCTION+90, // "s"
-1, // idChar
-1, // reserved
MIN_REDUCTION+90, // "e"
637, // "!"
1360, // "="
1616, // "+"
MIN_REDUCTION+90, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+90, // "x"
MIN_REDUCTION+90, // "X"
-1, // hex
-1, // letter
-1, // "_"
MIN_REDUCTION+90, // "d"
MIN_REDUCTION+90, // "g"
MIN_REDUCTION+90, // "m"
MIN_REDUCTION+90, // "p"
MIN_REDUCTION+90, // "v"
MIN_REDUCTION+90, // "y"
MIN_REDUCTION+90, // "f"
MIN_REDUCTION+90, // "i"
MIN_REDUCTION+90, // {"A".."W" "Y".."Z"}
MIN_REDUCTION+90, // "o"
MIN_REDUCTION+90, // "r"
MIN_REDUCTION+90, // "u"
MIN_REDUCTION+90, // {"j" "q"}
MIN_REDUCTION+90, // "b"
MIN_REDUCTION+90, // "h"
MIN_REDUCTION+90, // "k"
MIN_REDUCTION+90, // "n"
MIN_REDUCTION+90, // "t"
MIN_REDUCTION+90, // "w"
MIN_REDUCTION+90, // "z"
MIN_REDUCTION+90, // {"1".."9"}
376, // white
1602, // {12}
1602, // " "
1602, // {9}
381, // eol
1433, // comment
565, // oneLineComment
26, // blockComment
1572, // "/"
-1, // printable**
-1, // printable
1638, // "*"
-1, // blockCommentContent*
-1, // blockCommentContent
582, // "["
295, // "-"
174, // "<"
182, // "|"
-1, // {"?".."@"}
164, // "&"
1357, // ")"
155, // ","
369, // "]"
-1, // {"#".."$"}
387, // ";"
1173, // ">"
1611, // "{"
978, // "%"
1273, // "("
-1, // "\"
319, // "."
246, // ":"
984, // "}"
-1, // {"^" "`" "~"}
995, // "'"
1482, // '"'
418, // {10}
1458, // {13}
-1, // stringPrintable
-1, // recognizeEscapeChar
-1, // charPrintable
-1, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
-1, // escapeChars
-1, // token*
-1, // printable*
-1, // digit+
-1, // idChar*
-1, // letter+
MIN_REDUCTION+90, // $
-1, // $NT
  }
,
{ // state 1408
95,807, // "e"
  }
,
{ // state 1409
MIN_REDUCTION+149, // (default reduction)
  }
,
{ // state 1410
2,759, // white*
128,376, // white
132,381, // eol
133,1433, // comment
134,565, // oneLineComment
135,26, // blockComment
MIN_REDUCTION+347, // (default reduction)
  }
,
{ // state 1411
2,1440, // white*
128,376, // white
132,381, // eol
133,1433, // comment
134,565, // oneLineComment
135,26, // blockComment
MIN_REDUCTION+144, // (default reduction)
  }
};
}
private class Initter8{
public int doInit(int startIdx) {
  for (int i = 0; i < myParseTable.length; i++) {
    parseTable[i+startIdx] = myParseTable[i];
  }
  return myParseTable.length;
}
private final int[][] myParseTable = {
{ // state 1412
128,1304, // white
132,381, // eol
133,1433, // comment
134,565, // oneLineComment
135,26, // blockComment
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 1413
124,1091, // "t"
  }
,
{ // state 1414
95,797, // "e"
  }
,
{ // state 1415
136,1185, // "/"
139,1058, // "*"
  }
,
{ // state 1416
-1, // $$start
-1, // start
1568, // white*
-1, // $$0
MIN_REDUCTION+170, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
972, // `!
312, // `!=
1102, // `%
1560, // `&&
293, // `*
647, // `(
123, // `)
1355, // `{
95, // `}
413, // `-
1444, // `+
67, // `=
1322, // `==
109, // `[
551, // `]
1370, // `||
168, // `<
53, // `<=
1559, // `,
604, // `>
1435, // `>=
1247, // `.
1490, // `;
111, // `++
50, // `--
152, // `/
385, // `:
872, // ID
161, // INT_LITERAL
485, // STRING_LITERAL
769, // CHAR_LITERAL
513, // "c"
513, // "l"
513, // "a"
513, // "s"
-1, // idChar
-1, // reserved
513, // "e"
637, // "!"
1360, // "="
1616, // "+"
305, // "0"
566, // digit++
961, // digit
513, // "x"
513, // "X"
-1, // hex
1361, // letter
-1, // "_"
513, // "d"
513, // "g"
513, // "m"
513, // "p"
513, // "v"
513, // "y"
513, // "f"
513, // "i"
513, // {"A".."W" "Y".."Z"}
513, // "o"
513, // "r"
513, // "u"
513, // {"j" "q"}
513, // "b"
513, // "h"
513, // "k"
513, // "n"
513, // "t"
513, // "w"
513, // "z"
305, // {"1".."9"}
376, // white
1602, // {12}
1602, // " "
1602, // {9}
381, // eol
1433, // comment
565, // oneLineComment
26, // blockComment
1572, // "/"
-1, // printable**
-1, // printable
1638, // "*"
-1, // blockCommentContent*
-1, // blockCommentContent
582, // "["
295, // "-"
174, // "<"
182, // "|"
-1, // {"?".."@"}
164, // "&"
1357, // ")"
155, // ","
369, // "]"
-1, // {"#".."$"}
387, // ";"
1173, // ">"
1611, // "{"
978, // "%"
1273, // "("
-1, // "\"
319, // "."
246, // ":"
984, // "}"
-1, // {"^" "`" "~"}
995, // "'"
1482, // '"'
418, // {10}
1458, // {13}
-1, // stringPrintable
-1, // recognizeEscapeChar
-1, // charPrintable
792, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
-1, // escapeChars
-1, // token*
-1, // printable*
466, // digit+
-1, // idChar*
883, // letter+
MIN_REDUCTION+170, // $
-1, // $NT
  }
,
{ // state 1417
0x80000000|443, // match move
0x80000000|643, // no-match move
// T-test match for "0":
99,
  }
,
{ // state 1418
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+322, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
972, // `!
312, // `!=
1102, // `%
1560, // `&&
293, // `*
647, // `(
123, // `)
1355, // `{
95, // `}
413, // `-
1444, // `+
67, // `=
1322, // `==
109, // `[
551, // `]
1370, // `||
168, // `<
53, // `<=
1559, // `,
604, // `>
1435, // `>=
1247, // `.
1490, // `;
111, // `++
50, // `--
152, // `/
385, // `:
872, // ID
161, // INT_LITERAL
485, // STRING_LITERAL
769, // CHAR_LITERAL
513, // "c"
513, // "l"
513, // "a"
513, // "s"
-1, // idChar
-1, // reserved
513, // "e"
637, // "!"
1360, // "="
1616, // "+"
305, // "0"
566, // digit++
961, // digit
513, // "x"
513, // "X"
-1, // hex
1361, // letter
-1, // "_"
513, // "d"
513, // "g"
513, // "m"
513, // "p"
513, // "v"
513, // "y"
513, // "f"
513, // "i"
513, // {"A".."W" "Y".."Z"}
513, // "o"
513, // "r"
513, // "u"
513, // {"j" "q"}
513, // "b"
513, // "h"
513, // "k"
513, // "n"
513, // "t"
513, // "w"
513, // "z"
305, // {"1".."9"}
1304, // white
1602, // {12}
1602, // " "
1602, // {9}
381, // eol
1433, // comment
565, // oneLineComment
26, // blockComment
1572, // "/"
-1, // printable**
-1, // printable
1638, // "*"
-1, // blockCommentContent*
-1, // blockCommentContent
582, // "["
295, // "-"
174, // "<"
182, // "|"
-1, // {"?".."@"}
164, // "&"
1357, // ")"
155, // ","
369, // "]"
-1, // {"#".."$"}
387, // ";"
1173, // ">"
1611, // "{"
978, // "%"
1273, // "("
-1, // "\"
319, // "."
246, // ":"
984, // "}"
-1, // {"^" "`" "~"}
995, // "'"
1482, // '"'
418, // {10}
1458, // {13}
-1, // stringPrintable
-1, // recognizeEscapeChar
-1, // charPrintable
792, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
-1, // escapeChars
-1, // token*
-1, // printable*
466, // digit+
-1, // idChar*
883, // letter+
MIN_REDUCTION+322, // $
-1, // $NT
  }
,
{ // state 1419
0x80000000|1314, // match move
0x80000000|20, // no-match move
// T-test match for "0":
99,
  }
,
{ // state 1420
128,1304, // white
132,381, // eol
133,1433, // comment
134,565, // oneLineComment
135,26, // blockComment
MIN_REDUCTION+163, // (default reduction)
  }
,
{ // state 1421
0x80000000|1455, // match move
0x80000000|1344, // no-match move
// T-test match for "0":
99,
  }
,
{ // state 1422
-1, // $$start
-1, // start
1300, // white*
-1, // $$0
MIN_REDUCTION+343, // token
1392, // `boolean
1186, // `class
1576, // `extends
798, // `void
1167, // `int
267, // `while
1537, // `if
316, // `else
440, // `for
165, // `break
280, // `this
1368, // `false
1106, // `true
953, // `super
489, // `null
1163, // `return
630, // `instanceof
976, // `new
1330, // `abstract
1402, // `assert
1567, // `byte
27, // `case
833, // `catch
982, // `char
1324, // `const
141, // `continue
115, // `default
1035, // `do
140, // `double
308, // `enum
662, // `final
1021, // `finally
1158, // `float
765, // `goto
1302, // `implements
768, // `import
1514, // `interface
1633, // `long
812, // `native
1233, // `package
245, // `private
339, // `protected
1254, // `public
516, // `short
412, // `static
1491, // `strictfp
832, // `switch
397, // `synchronized
201, // `throw
1108, // `throws
417, // `transient
631, // `try
927, // `volatile
972, // `!
312, // `!=
1102, // `%
1560, // `&&
293, // `*
647, // `(
123, // `)
1355, // `{
95, // `}
413, // `-
1444, // `+
67, // `=
1322, // `==
109, // `[
551, // `]
1370, // `||
168, // `<
53, // `<=
1559, // `,
604, // `>
1435, // `>=
1247, // `.
1490, // `;
111, // `++
50, // `--
152, // `/
385, // `:
-1, // ID
161, // INT_LITERAL
485, // STRING_LITERAL
769, // CHAR_LITERAL
MIN_REDUCTION+343, // "c"
MIN_REDUCTION+343, // "l"
MIN_REDUCTION+343, // "a"
MIN_REDUCTION+343, // "s"
-1, // idChar
-1, // reserved
MIN_REDUCTION+343, // "e"
637, // "!"
1360, // "="
1616, // "+"
MIN_REDUCTION+343, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+343, // "x"
MIN_REDUCTION+343, // "X"
-1, // hex
-1, // letter
-1, // "_"
MIN_REDUCTION+343, // "d"
MIN_REDUCTION+343, // "g"
MIN_REDUCTION+343, // "m"
MIN_REDUCTION+343, // "p"
MIN_REDUCTION+343, // "v"
MIN_REDUCTION+343, // "y"
MIN_REDUCTION+343, // "f"
MIN_REDUCTION+343, // "i"
MIN_REDUCTION+343, // {"A".."W" "Y".."Z"}
MIN_REDUCTION+343, // "o"
MIN_REDUCTION+343, // "r"
MIN_REDUCTION+343, // "u"
MIN_REDUCTION+343, // {"j" "q"}
MIN_REDUCTION+343, // "b"
MIN_REDUCTION+343, // "h"
MIN_REDUCTION+343, // "k"
MIN_REDUCTION+343, // "n"
MIN_REDUCTION+343, // "t"
MIN_REDUCTION+343, // "w"
MIN_REDUCTION+343, // "z"
MIN_REDUCTION+343, // {"1".."9"}
376, // white
1602, // {12}
1602, // " "
1602, // {9}
381, // eol
1433, // comment
565, // oneLineComment
26, // blockComment
1572, // "/"
-1, // printable**
-1, // printable
1638, // "*"
-1, // blockCommentContent*
-1, // blockCommentContent
582, // "["
295, // "-"
174, // "<"
182, // "|"
-1, // {"?".."@"}
164, // "&"
1357, // ")"
155, // ","
369, // "]"
-1, // {"#".."$"}
387, // ";"
1173, // ">"
1611, // "{"
978, // "%"
1273, // "("
-1, // "\"
319, // "."
246, // ":"
984, // "}"
-1, // {"^" "`" "~"}
995, // "'"
1482, // '"'
418, // {10}
1458, // {13}
-1, // stringPrintable
-1, // recognizeEscapeChar
-1, // charPrintable
-1, // letter++
1049, // idChar**
873, // $$1
-1, // stringPrintable*
-1, // $$2
-1, // escapeChars
-1, // token*
-1, // printable*
-1, // digit+
1157, // idChar*
-1, // letter+
MIN_REDUCTION+343, // $
-1, // $NT
  }
,
{ // state 1423
90,100, // "l"
91,1635, // "a"
116,432, // "o"
121,817, // "h"
  }
,
{ // state 1424
0x80000000|1, // match move
0x80000000|1428, // no-match move
0x80000000|36, // NT-test-match state for idChar
  }
,
{ // state 1425
122,184, // "k"
  }
,
{ // state 1426
92,436, // "s"
  }
,
{ // state 1427
181,MIN_REDUCTION+270, // $NT
  }
,
{ // state 1428
-1, // $$start
-1, // start
1220, // white*
-1, // $$0
MIN_REDUCTION+233, // token
1392, // `boolean
1186, // `class
1576, // `extends
798, // `void
1167, // `int
267, // `while
1537, // `if
316, // `else
440, // `for
165, // `break
280, // `this
1368, // `false
1106, // `true
953, // `super
489, // `null
1163, // `return
630, // `instanceof
976, // `new
1330, // `abstract
1402, // `assert
1567, // `byte
27, // `case
833, // `catch
982, // `char
1324, // `const
141, // `continue
115, // `default
1035, // `do
140, // `double
308, // `enum
662, // `final
1021, // `finally
1158, // `float
765, // `goto
1302, // `implements
768, // `import
1514, // `interface
1633, // `long
812, // `native
1233, // `package
245, // `private
339, // `protected
1254, // `public
516, // `short
412, // `static
1491, // `strictfp
832, // `switch
397, // `synchronized
201, // `throw
1108, // `throws
417, // `transient
631, // `try
927, // `volatile
972, // `!
312, // `!=
1102, // `%
1560, // `&&
293, // `*
647, // `(
123, // `)
1355, // `{
95, // `}
413, // `-
1444, // `+
67, // `=
1322, // `==
109, // `[
551, // `]
1370, // `||
168, // `<
53, // `<=
1559, // `,
604, // `>
1435, // `>=
1247, // `.
1490, // `;
111, // `++
50, // `--
152, // `/
385, // `:
-1, // ID
161, // INT_LITERAL
485, // STRING_LITERAL
769, // CHAR_LITERAL
MIN_REDUCTION+233, // "c"
MIN_REDUCTION+233, // "l"
MIN_REDUCTION+233, // "a"
MIN_REDUCTION+233, // "s"
-1, // idChar
-1, // reserved
MIN_REDUCTION+233, // "e"
637, // "!"
1360, // "="
1616, // "+"
MIN_REDUCTION+233, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+233, // "x"
MIN_REDUCTION+233, // "X"
-1, // hex
-1, // letter
-1, // "_"
MIN_REDUCTION+233, // "d"
MIN_REDUCTION+233, // "g"
MIN_REDUCTION+233, // "m"
MIN_REDUCTION+233, // "p"
MIN_REDUCTION+233, // "v"
MIN_REDUCTION+233, // "y"
MIN_REDUCTION+233, // "f"
MIN_REDUCTION+233, // "i"
MIN_REDUCTION+233, // {"A".."W" "Y".."Z"}
MIN_REDUCTION+233, // "o"
MIN_REDUCTION+233, // "r"
MIN_REDUCTION+233, // "u"
MIN_REDUCTION+233, // {"j" "q"}
MIN_REDUCTION+233, // "b"
MIN_REDUCTION+233, // "h"
MIN_REDUCTION+233, // "k"
MIN_REDUCTION+233, // "n"
MIN_REDUCTION+233, // "t"
MIN_REDUCTION+233, // "w"
MIN_REDUCTION+233, // "z"
MIN_REDUCTION+233, // {"1".."9"}
376, // white
1602, // {12}
1602, // " "
1602, // {9}
381, // eol
1433, // comment
565, // oneLineComment
26, // blockComment
1572, // "/"
-1, // printable**
-1, // printable
1638, // "*"
-1, // blockCommentContent*
-1, // blockCommentContent
582, // "["
295, // "-"
174, // "<"
182, // "|"
-1, // {"?".."@"}
164, // "&"
1357, // ")"
155, // ","
369, // "]"
-1, // {"#".."$"}
387, // ";"
1173, // ">"
1611, // "{"
978, // "%"
1273, // "("
-1, // "\"
319, // "."
246, // ":"
984, // "}"
-1, // {"^" "`" "~"}
995, // "'"
1482, // '"'
418, // {10}
1458, // {13}
-1, // stringPrintable
-1, // recognizeEscapeChar
-1, // charPrintable
-1, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
-1, // escapeChars
-1, // token*
-1, // printable*
-1, // digit+
-1, // idChar*
-1, // letter+
MIN_REDUCTION+233, // $
-1, // $NT
  }
,
{ // state 1429
-1, // $$start
-1, // start
1440, // white*
-1, // $$0
MIN_REDUCTION+144, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
972, // `!
312, // `!=
1102, // `%
1560, // `&&
293, // `*
647, // `(
123, // `)
1355, // `{
95, // `}
413, // `-
1444, // `+
67, // `=
1322, // `==
109, // `[
551, // `]
1370, // `||
168, // `<
53, // `<=
1559, // `,
604, // `>
1435, // `>=
1247, // `.
1490, // `;
111, // `++
50, // `--
152, // `/
385, // `:
872, // ID
161, // INT_LITERAL
485, // STRING_LITERAL
769, // CHAR_LITERAL
513, // "c"
513, // "l"
513, // "a"
513, // "s"
-1, // idChar
-1, // reserved
513, // "e"
637, // "!"
1360, // "="
1616, // "+"
305, // "0"
566, // digit++
961, // digit
513, // "x"
513, // "X"
-1, // hex
1361, // letter
-1, // "_"
513, // "d"
513, // "g"
513, // "m"
513, // "p"
513, // "v"
513, // "y"
513, // "f"
513, // "i"
513, // {"A".."W" "Y".."Z"}
513, // "o"
513, // "r"
513, // "u"
513, // {"j" "q"}
513, // "b"
513, // "h"
513, // "k"
513, // "n"
513, // "t"
513, // "w"
513, // "z"
305, // {"1".."9"}
376, // white
1602, // {12}
1602, // " "
1602, // {9}
381, // eol
1433, // comment
565, // oneLineComment
26, // blockComment
1572, // "/"
-1, // printable**
-1, // printable
1638, // "*"
-1, // blockCommentContent*
-1, // blockCommentContent
582, // "["
295, // "-"
174, // "<"
182, // "|"
-1, // {"?".."@"}
164, // "&"
1357, // ")"
155, // ","
369, // "]"
-1, // {"#".."$"}
387, // ";"
1173, // ">"
1611, // "{"
978, // "%"
1273, // "("
-1, // "\"
319, // "."
246, // ":"
984, // "}"
-1, // {"^" "`" "~"}
995, // "'"
1482, // '"'
418, // {10}
1458, // {13}
-1, // stringPrintable
-1, // recognizeEscapeChar
-1, // charPrintable
792, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
-1, // escapeChars
-1, // token*
-1, // printable*
466, // digit+
-1, // idChar*
883, // letter+
MIN_REDUCTION+144, // $
-1, // $NT
  }
,
{ // state 1430
MIN_REDUCTION+319, // (default reduction)
  }
,
{ // state 1431
0x80000000|1146, // match move
0x80000000|573, // no-match move
0x80000000|824, // NT-test-match state for printable
  }
,
{ // state 1432
99,305, // "0"
100,70, // digit++
101,961, // digit
127,305, // {"1".."9"}
177,466, // digit+
  }
,
{ // state 1433
MIN_REDUCTION+115, // (default reduction)
  }
,
{ // state 1434
91,822, // "a"
  }
,
{ // state 1435
MIN_REDUCTION+78, // (default reduction)
  }
,
{ // state 1436
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 1437
0x80000000|591, // match move
0x80000000|156, // no-match move
// T-test match for "0":
99,
  }
,
{ // state 1438
128,1304, // white
132,381, // eol
133,1433, // comment
134,565, // oneLineComment
135,26, // blockComment
MIN_REDUCTION+274, // (default reduction)
  }
,
{ // state 1439
128,620, // white
129,674, // {12}
130,674, // " "
131,674, // {9}
132,889, // eol
133,775, // comment
134,943, // oneLineComment
135,641, // blockComment
136,1598, // "/"
164,926, // {10}
165,676, // {13}
181,MIN_REDUCTION+229, // $NT
  }
,
{ // state 1440
0x80000000|752, // match move
0x80000000|11, // no-match move
// T-test match for "0":
99,
  }
,
{ // state 1441
124,383, // "t"
  }
,
{ // state 1442
181,MIN_REDUCTION+121, // $NT
MIN_REDUCTION+121, // (default reduction)
  }
,
{ // state 1443
136,659, // "/"
  }
,
{ // state 1444
MIN_REDUCTION+68, // (default reduction)
  }
,
{ // state 1445
0x80000000|1169, // match move
0x80000000|763, // no-match move
0x80000000|1258, // NT-test-match state for reserved
  }
,
{ // state 1446
MIN_REDUCTION+114, // (default reduction)
  }
,
{ // state 1447
114,826, // "i"
  }
,
{ // state 1448
116,249, // "o"
  }
,
{ // state 1449
89,1377, // "c"
  }
,
{ // state 1450
2,1300, // white*
171,1473, // $$1
MIN_REDUCTION+341, // (default reduction)
  }
,
{ // state 1451
0x80000000|1, // match move
0x80000000|698, // no-match move
0x80000000|36, // NT-test-match state for idChar
  }
,
{ // state 1452
92,1621, // "s"
  }
,
{ // state 1453
-1, // $$start
-1, // start
24, // white*
-1, // $$0
MIN_REDUCTION+239, // token
1392, // `boolean
1186, // `class
1576, // `extends
798, // `void
1167, // `int
267, // `while
1537, // `if
316, // `else
440, // `for
165, // `break
280, // `this
1368, // `false
1106, // `true
953, // `super
489, // `null
1163, // `return
630, // `instanceof
976, // `new
1330, // `abstract
1402, // `assert
1567, // `byte
27, // `case
833, // `catch
982, // `char
1324, // `const
141, // `continue
115, // `default
1035, // `do
140, // `double
308, // `enum
662, // `final
1021, // `finally
1158, // `float
765, // `goto
1302, // `implements
768, // `import
1514, // `interface
1633, // `long
812, // `native
1233, // `package
245, // `private
339, // `protected
1254, // `public
516, // `short
412, // `static
1491, // `strictfp
832, // `switch
397, // `synchronized
201, // `throw
1108, // `throws
417, // `transient
631, // `try
927, // `volatile
972, // `!
312, // `!=
1102, // `%
1560, // `&&
293, // `*
647, // `(
123, // `)
1355, // `{
95, // `}
413, // `-
1444, // `+
67, // `=
1322, // `==
109, // `[
551, // `]
1370, // `||
168, // `<
53, // `<=
1559, // `,
604, // `>
1435, // `>=
1247, // `.
1490, // `;
111, // `++
50, // `--
152, // `/
385, // `:
-1, // ID
161, // INT_LITERAL
485, // STRING_LITERAL
769, // CHAR_LITERAL
MIN_REDUCTION+239, // "c"
MIN_REDUCTION+239, // "l"
MIN_REDUCTION+239, // "a"
MIN_REDUCTION+239, // "s"
-1, // idChar
-1, // reserved
MIN_REDUCTION+239, // "e"
637, // "!"
1360, // "="
1616, // "+"
MIN_REDUCTION+239, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+239, // "x"
MIN_REDUCTION+239, // "X"
-1, // hex
-1, // letter
-1, // "_"
MIN_REDUCTION+239, // "d"
MIN_REDUCTION+239, // "g"
MIN_REDUCTION+239, // "m"
MIN_REDUCTION+239, // "p"
MIN_REDUCTION+239, // "v"
MIN_REDUCTION+239, // "y"
MIN_REDUCTION+239, // "f"
MIN_REDUCTION+239, // "i"
MIN_REDUCTION+239, // {"A".."W" "Y".."Z"}
MIN_REDUCTION+239, // "o"
MIN_REDUCTION+239, // "r"
MIN_REDUCTION+239, // "u"
MIN_REDUCTION+239, // {"j" "q"}
MIN_REDUCTION+239, // "b"
MIN_REDUCTION+239, // "h"
MIN_REDUCTION+239, // "k"
MIN_REDUCTION+239, // "n"
MIN_REDUCTION+239, // "t"
MIN_REDUCTION+239, // "w"
MIN_REDUCTION+239, // "z"
MIN_REDUCTION+239, // {"1".."9"}
376, // white
1602, // {12}
1602, // " "
1602, // {9}
381, // eol
1433, // comment
565, // oneLineComment
26, // blockComment
1572, // "/"
-1, // printable**
-1, // printable
1638, // "*"
-1, // blockCommentContent*
-1, // blockCommentContent
582, // "["
295, // "-"
174, // "<"
182, // "|"
-1, // {"?".."@"}
164, // "&"
1357, // ")"
155, // ","
369, // "]"
-1, // {"#".."$"}
387, // ";"
1173, // ">"
1611, // "{"
978, // "%"
1273, // "("
-1, // "\"
319, // "."
246, // ":"
984, // "}"
-1, // {"^" "`" "~"}
995, // "'"
1482, // '"'
418, // {10}
1458, // {13}
-1, // stringPrintable
-1, // recognizeEscapeChar
-1, // charPrintable
-1, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
-1, // escapeChars
-1, // token*
-1, // printable*
-1, // digit+
-1, // idChar*
-1, // letter+
MIN_REDUCTION+239, // $
-1, // $NT
  }
,
{ // state 1454
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+274, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
972, // `!
312, // `!=
1102, // `%
1560, // `&&
293, // `*
647, // `(
123, // `)
1355, // `{
95, // `}
413, // `-
1444, // `+
67, // `=
1322, // `==
109, // `[
551, // `]
1370, // `||
168, // `<
53, // `<=
1559, // `,
604, // `>
1435, // `>=
1247, // `.
1490, // `;
111, // `++
50, // `--
152, // `/
385, // `:
872, // ID
161, // INT_LITERAL
485, // STRING_LITERAL
769, // CHAR_LITERAL
513, // "c"
513, // "l"
513, // "a"
513, // "s"
-1, // idChar
-1, // reserved
513, // "e"
637, // "!"
1360, // "="
1616, // "+"
305, // "0"
566, // digit++
961, // digit
513, // "x"
513, // "X"
-1, // hex
1361, // letter
-1, // "_"
513, // "d"
513, // "g"
513, // "m"
513, // "p"
513, // "v"
513, // "y"
513, // "f"
513, // "i"
513, // {"A".."W" "Y".."Z"}
513, // "o"
513, // "r"
513, // "u"
513, // {"j" "q"}
513, // "b"
513, // "h"
513, // "k"
513, // "n"
513, // "t"
513, // "w"
513, // "z"
305, // {"1".."9"}
1304, // white
1602, // {12}
1602, // " "
1602, // {9}
381, // eol
1433, // comment
565, // oneLineComment
26, // blockComment
1572, // "/"
-1, // printable**
-1, // printable
1638, // "*"
-1, // blockCommentContent*
-1, // blockCommentContent
582, // "["
295, // "-"
174, // "<"
182, // "|"
-1, // {"?".."@"}
164, // "&"
1357, // ")"
155, // ","
369, // "]"
-1, // {"#".."$"}
387, // ";"
1173, // ">"
1611, // "{"
978, // "%"
1273, // "("
-1, // "\"
319, // "."
246, // ":"
984, // "}"
-1, // {"^" "`" "~"}
995, // "'"
1482, // '"'
418, // {10}
1458, // {13}
-1, // stringPrintable
-1, // recognizeEscapeChar
-1, // charPrintable
792, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
-1, // escapeChars
-1, // token*
-1, // printable*
466, // digit+
-1, // idChar*
883, // letter+
MIN_REDUCTION+274, // $
-1, // $NT
  }
,
{ // state 1455
128,1304, // white
132,381, // eol
133,1433, // comment
134,565, // oneLineComment
135,26, // blockComment
MIN_REDUCTION+145, // (default reduction)
  }
,
{ // state 1456
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+280, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
972, // `!
312, // `!=
1102, // `%
1560, // `&&
293, // `*
647, // `(
123, // `)
1355, // `{
95, // `}
413, // `-
1444, // `+
67, // `=
1322, // `==
109, // `[
551, // `]
1370, // `||
168, // `<
53, // `<=
1559, // `,
604, // `>
1435, // `>=
1247, // `.
1490, // `;
111, // `++
50, // `--
152, // `/
385, // `:
872, // ID
161, // INT_LITERAL
485, // STRING_LITERAL
769, // CHAR_LITERAL
513, // "c"
513, // "l"
513, // "a"
513, // "s"
-1, // idChar
-1, // reserved
513, // "e"
637, // "!"
1360, // "="
1616, // "+"
305, // "0"
566, // digit++
961, // digit
513, // "x"
513, // "X"
-1, // hex
1361, // letter
-1, // "_"
513, // "d"
513, // "g"
513, // "m"
513, // "p"
513, // "v"
513, // "y"
513, // "f"
513, // "i"
513, // {"A".."W" "Y".."Z"}
513, // "o"
513, // "r"
513, // "u"
513, // {"j" "q"}
513, // "b"
513, // "h"
513, // "k"
513, // "n"
513, // "t"
513, // "w"
513, // "z"
305, // {"1".."9"}
1304, // white
1602, // {12}
1602, // " "
1602, // {9}
381, // eol
1433, // comment
565, // oneLineComment
26, // blockComment
1572, // "/"
-1, // printable**
-1, // printable
1638, // "*"
-1, // blockCommentContent*
-1, // blockCommentContent
582, // "["
295, // "-"
174, // "<"
182, // "|"
-1, // {"?".."@"}
164, // "&"
1357, // ")"
155, // ","
369, // "]"
-1, // {"#".."$"}
387, // ";"
1173, // ">"
1611, // "{"
978, // "%"
1273, // "("
-1, // "\"
319, // "."
246, // ":"
984, // "}"
-1, // {"^" "`" "~"}
995, // "'"
1482, // '"'
418, // {10}
1458, // {13}
-1, // stringPrintable
-1, // recognizeEscapeChar
-1, // charPrintable
792, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
-1, // escapeChars
-1, // token*
-1, // printable*
466, // digit+
-1, // idChar*
883, // letter+
MIN_REDUCTION+280, // $
-1, // $NT
  }
,
{ // state 1457
181,MIN_REDUCTION+291, // $NT
  }
,
{ // state 1458
0x80000000|1511, // match move
0x80000000|110, // no-match move
// T-test match for 10:
164,
  }
,
{ // state 1459
128,1304, // white
132,381, // eol
133,1433, // comment
134,565, // oneLineComment
135,26, // blockComment
MIN_REDUCTION+151, // (default reduction)
  }
,
{ // state 1460
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+97, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
972, // `!
312, // `!=
1102, // `%
1560, // `&&
293, // `*
647, // `(
123, // `)
1355, // `{
95, // `}
413, // `-
1444, // `+
67, // `=
1322, // `==
109, // `[
551, // `]
1370, // `||
168, // `<
53, // `<=
1559, // `,
604, // `>
1435, // `>=
1247, // `.
1490, // `;
111, // `++
50, // `--
152, // `/
385, // `:
872, // ID
161, // INT_LITERAL
485, // STRING_LITERAL
769, // CHAR_LITERAL
513, // "c"
513, // "l"
513, // "a"
513, // "s"
-1, // idChar
-1, // reserved
513, // "e"
637, // "!"
1360, // "="
1616, // "+"
305, // "0"
566, // digit++
961, // digit
513, // "x"
513, // "X"
-1, // hex
1361, // letter
-1, // "_"
513, // "d"
513, // "g"
513, // "m"
513, // "p"
513, // "v"
513, // "y"
513, // "f"
513, // "i"
513, // {"A".."W" "Y".."Z"}
513, // "o"
513, // "r"
513, // "u"
513, // {"j" "q"}
513, // "b"
513, // "h"
513, // "k"
513, // "n"
513, // "t"
513, // "w"
513, // "z"
305, // {"1".."9"}
1304, // white
1602, // {12}
1602, // " "
1602, // {9}
381, // eol
1433, // comment
565, // oneLineComment
26, // blockComment
1572, // "/"
-1, // printable**
-1, // printable
1638, // "*"
-1, // blockCommentContent*
-1, // blockCommentContent
582, // "["
295, // "-"
174, // "<"
182, // "|"
-1, // {"?".."@"}
164, // "&"
1357, // ")"
155, // ","
369, // "]"
-1, // {"#".."$"}
387, // ";"
1173, // ">"
1611, // "{"
978, // "%"
1273, // "("
-1, // "\"
319, // "."
246, // ":"
984, // "}"
-1, // {"^" "`" "~"}
995, // "'"
1482, // '"'
418, // {10}
1458, // {13}
-1, // stringPrintable
-1, // recognizeEscapeChar
-1, // charPrintable
792, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
-1, // escapeChars
-1, // token*
-1, // printable*
466, // digit+
-1, // idChar*
883, // letter+
MIN_REDUCTION+97, // $
-1, // $NT
  }
,
{ // state 1461
-1, // $$start
-1, // start
1333, // white*
-1, // $$0
MIN_REDUCTION+154, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
972, // `!
312, // `!=
1102, // `%
1560, // `&&
293, // `*
647, // `(
123, // `)
1355, // `{
95, // `}
-1, // `-
1444, // `+
67, // `=
1322, // `==
109, // `[
551, // `]
1370, // `||
168, // `<
53, // `<=
1559, // `,
604, // `>
1435, // `>=
1247, // `.
1490, // `;
111, // `++
-1, // `--
152, // `/
385, // `:
872, // ID
161, // INT_LITERAL
485, // STRING_LITERAL
769, // CHAR_LITERAL
513, // "c"
513, // "l"
513, // "a"
513, // "s"
-1, // idChar
-1, // reserved
513, // "e"
637, // "!"
1360, // "="
1616, // "+"
305, // "0"
566, // digit++
961, // digit
513, // "x"
513, // "X"
-1, // hex
1361, // letter
-1, // "_"
513, // "d"
513, // "g"
513, // "m"
513, // "p"
513, // "v"
513, // "y"
513, // "f"
513, // "i"
513, // {"A".."W" "Y".."Z"}
513, // "o"
513, // "r"
513, // "u"
513, // {"j" "q"}
513, // "b"
513, // "h"
513, // "k"
513, // "n"
513, // "t"
513, // "w"
513, // "z"
305, // {"1".."9"}
376, // white
1602, // {12}
1602, // " "
1602, // {9}
381, // eol
1433, // comment
565, // oneLineComment
26, // blockComment
1572, // "/"
-1, // printable**
-1, // printable
1638, // "*"
-1, // blockCommentContent*
-1, // blockCommentContent
582, // "["
MIN_REDUCTION+154, // "-"
174, // "<"
182, // "|"
-1, // {"?".."@"}
164, // "&"
1357, // ")"
155, // ","
369, // "]"
-1, // {"#".."$"}
387, // ";"
1173, // ">"
1611, // "{"
978, // "%"
1273, // "("
-1, // "\"
319, // "."
246, // ":"
984, // "}"
-1, // {"^" "`" "~"}
995, // "'"
1482, // '"'
418, // {10}
1458, // {13}
-1, // stringPrintable
-1, // recognizeEscapeChar
-1, // charPrintable
792, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
-1, // escapeChars
-1, // token*
-1, // printable*
466, // digit+
-1, // idChar*
883, // letter+
MIN_REDUCTION+154, // $
-1, // $NT
  }
,
{ // state 1462
-1, // $$start
-1, // start
297, // white*
-1, // $$0
MIN_REDUCTION+158, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
972, // `!
312, // `!=
1102, // `%
1560, // `&&
293, // `*
647, // `(
123, // `)
1355, // `{
95, // `}
413, // `-
1444, // `+
67, // `=
1322, // `==
109, // `[
551, // `]
1370, // `||
168, // `<
53, // `<=
1559, // `,
604, // `>
1435, // `>=
1247, // `.
1490, // `;
111, // `++
50, // `--
152, // `/
385, // `:
872, // ID
161, // INT_LITERAL
485, // STRING_LITERAL
769, // CHAR_LITERAL
513, // "c"
513, // "l"
513, // "a"
513, // "s"
-1, // idChar
-1, // reserved
513, // "e"
637, // "!"
1360, // "="
1616, // "+"
305, // "0"
566, // digit++
961, // digit
513, // "x"
513, // "X"
-1, // hex
1361, // letter
-1, // "_"
513, // "d"
513, // "g"
513, // "m"
513, // "p"
513, // "v"
513, // "y"
513, // "f"
513, // "i"
513, // {"A".."W" "Y".."Z"}
513, // "o"
513, // "r"
513, // "u"
513, // {"j" "q"}
513, // "b"
513, // "h"
513, // "k"
513, // "n"
513, // "t"
513, // "w"
513, // "z"
305, // {"1".."9"}
376, // white
1602, // {12}
1602, // " "
1602, // {9}
381, // eol
1433, // comment
565, // oneLineComment
26, // blockComment
1572, // "/"
-1, // printable**
-1, // printable
1638, // "*"
-1, // blockCommentContent*
-1, // blockCommentContent
582, // "["
295, // "-"
174, // "<"
182, // "|"
-1, // {"?".."@"}
164, // "&"
1357, // ")"
155, // ","
369, // "]"
-1, // {"#".."$"}
387, // ";"
1173, // ">"
1611, // "{"
978, // "%"
1273, // "("
-1, // "\"
319, // "."
246, // ":"
984, // "}"
-1, // {"^" "`" "~"}
995, // "'"
1482, // '"'
418, // {10}
1458, // {13}
-1, // stringPrintable
-1, // recognizeEscapeChar
-1, // charPrintable
792, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
-1, // escapeChars
-1, // token*
-1, // printable*
466, // digit+
-1, // idChar*
883, // letter+
MIN_REDUCTION+158, // $
-1, // $NT
  }
,
{ // state 1463
91,81, // "a"
95,108, // "e"
118,1038, // "u"
  }
,
{ // state 1464
0x80000000|1, // match move
0x80000000|1547, // no-match move
0x80000000|36, // NT-test-match state for idChar
  }
,
{ // state 1465
0x80000000|1571, // match move
0x80000000|846, // no-match move
0x80000000|1258, // NT-test-match state for reserved
  }
,
{ // state 1466
95,1320, // "e"
  }
,
{ // state 1467
0x80000000|437, // match move
0x80000000|1480, // no-match move
// T-test match for "0":
99,
  }
,
{ // state 1468
117,909, // "r"
  }
,
{ // state 1469
128,1304, // white
132,381, // eol
133,1433, // comment
134,565, // oneLineComment
135,26, // blockComment
MIN_REDUCTION+214, // (default reduction)
  }
,
{ // state 1470
128,620, // white
129,674, // {12}
130,674, // " "
131,674, // {9}
132,889, // eol
133,775, // comment
134,943, // oneLineComment
135,641, // blockComment
136,1598, // "/"
164,926, // {10}
165,676, // {13}
181,MIN_REDUCTION+92, // $NT
  }
,
{ // state 1471
0x80000000|1516, // match move
0x80000000|1199, // no-match move
0x80000000|1258, // NT-test-match state for reserved
  }
,
{ // state 1472
0x80000000|1543, // match move
0x80000000|1363, // no-match move
// T-test match for "0":
99,
  }
,
{ // state 1473
MIN_REDUCTION+340, // (default reduction)
  }
,
{ // state 1474
-1, // $$start
-1, // start
693, // white*
-1, // $$0
MIN_REDUCTION+96, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
972, // `!
312, // `!=
1102, // `%
1560, // `&&
293, // `*
647, // `(
123, // `)
1355, // `{
95, // `}
413, // `-
1444, // `+
67, // `=
1322, // `==
109, // `[
551, // `]
1370, // `||
168, // `<
53, // `<=
1559, // `,
604, // `>
1435, // `>=
1247, // `.
1490, // `;
111, // `++
50, // `--
152, // `/
385, // `:
872, // ID
161, // INT_LITERAL
485, // STRING_LITERAL
769, // CHAR_LITERAL
513, // "c"
513, // "l"
513, // "a"
513, // "s"
-1, // idChar
-1, // reserved
513, // "e"
637, // "!"
1360, // "="
1616, // "+"
305, // "0"
566, // digit++
961, // digit
513, // "x"
513, // "X"
-1, // hex
1361, // letter
-1, // "_"
513, // "d"
513, // "g"
513, // "m"
513, // "p"
513, // "v"
513, // "y"
513, // "f"
513, // "i"
513, // {"A".."W" "Y".."Z"}
513, // "o"
513, // "r"
513, // "u"
513, // {"j" "q"}
513, // "b"
513, // "h"
513, // "k"
513, // "n"
513, // "t"
513, // "w"
513, // "z"
305, // {"1".."9"}
376, // white
1602, // {12}
1602, // " "
1602, // {9}
381, // eol
1433, // comment
565, // oneLineComment
26, // blockComment
1572, // "/"
-1, // printable**
-1, // printable
1638, // "*"
-1, // blockCommentContent*
-1, // blockCommentContent
582, // "["
295, // "-"
174, // "<"
182, // "|"
-1, // {"?".."@"}
164, // "&"
1357, // ")"
155, // ","
369, // "]"
-1, // {"#".."$"}
387, // ";"
1173, // ">"
1611, // "{"
978, // "%"
1273, // "("
-1, // "\"
319, // "."
246, // ":"
984, // "}"
-1, // {"^" "`" "~"}
995, // "'"
1482, // '"'
418, // {10}
1458, // {13}
-1, // stringPrintable
-1, // recognizeEscapeChar
-1, // charPrintable
792, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
-1, // escapeChars
-1, // token*
-1, // printable*
466, // digit+
-1, // idChar*
883, // letter+
MIN_REDUCTION+96, // $
-1, // $NT
  }
,
{ // state 1475
136,1442, // "/"
  }
,
{ // state 1476
2,1193, // white*
128,376, // white
129,1602, // {12}
130,1602, // " "
131,1602, // {9}
132,381, // eol
164,418, // {10}
165,1458, // {13}
MIN_REDUCTION+186, // (default reduction)
  }
,
{ // state 1477
117,1174, // "r"
  }
,
{ // state 1478
128,620, // white
129,674, // {12}
130,674, // " "
131,674, // {9}
132,889, // eol
133,775, // comment
134,943, // oneLineComment
135,641, // blockComment
136,1598, // "/"
164,926, // {10}
165,676, // {13}
181,MIN_REDUCTION+262, // $NT
  }
,
{ // state 1479
181,MIN_REDUCTION+306, // $NT
  }
,
{ // state 1480
0x80000000|1409, // match move
0x80000000|1042, // no-match move
0x80000000|1258, // NT-test-match state for reserved
  }
,
{ // state 1481
92,915, // "s"
  }
,
{ // state 1482
89,1323, // "c"
90,1323, // "l"
91,1323, // "a"
92,1323, // "s"
95,1323, // "e"
96,1342, // "!"
97,505, // "="
98,505, // "+"
99,505, // "0"
102,1323, // "x"
103,505, // "X"
106,1323, // "_"
107,1323, // "d"
108,1323, // "g"
109,1323, // "m"
110,1323, // "p"
111,1323, // "v"
112,1323, // "y"
113,1323, // "f"
114,1323, // "i"
115,505, // {"A".."W" "Y".."Z"}
116,1323, // "o"
117,1323, // "r"
118,1323, // "u"
119,1323, // {"j" "q"}
120,1323, // "b"
121,1323, // "h"
122,1323, // "k"
123,1323, // "n"
124,1323, // "t"
125,1323, // "w"
126,1323, // "z"
127,505, // {"1".."9"}
130,1342, // " "
136,505, // "/"
139,505, // "*"
142,505, // "["
143,505, // "-"
144,505, // "<"
145,1323, // "|"
146,505, // {"?".."@"}
147,505, // "&"
148,505, // ")"
149,505, // ","
150,1323, // "]"
151,505, // {"#".."$"}
152,505, // ";"
153,505, // ">"
154,1323, // "{"
155,505, // "%"
156,505, // "("
157,1201, // "\"
158,505, // "."
159,505, // ":"
160,1323, // "}"
161,1323, // {"^" "`" "~"}
162,505, // "'"
163,1631, // '"'
166,1620, // stringPrintable
167,730, // recognizeEscapeChar
172,1059, // stringPrintable*
173,783, // $$2
174,675, // escapeChars
  }
,
{ // state 1483
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 1484
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 1485
0x80000000|13, // match move
0x80000000|795, // no-match move
0x80000000|1258, // NT-test-match state for reserved
  }
,
{ // state 1486
2,172, // white*
128,1336, // white
129,674, // {12}
130,674, // " "
131,674, // {9}
132,889, // eol
133,775, // comment
134,943, // oneLineComment
135,641, // blockComment
136,1598, // "/"
164,926, // {10}
165,676, // {13}
181,MIN_REDUCTION+209, // $NT
  }
,
{ // state 1487
2,1215, // white*
128,376, // white
132,381, // eol
133,1433, // comment
134,565, // oneLineComment
135,26, // blockComment
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 1488
89,1256, // "c"
  }
,
{ // state 1489
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+241, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
972, // `!
312, // `!=
1102, // `%
1560, // `&&
293, // `*
647, // `(
123, // `)
1355, // `{
95, // `}
413, // `-
1444, // `+
67, // `=
1322, // `==
109, // `[
551, // `]
1370, // `||
168, // `<
53, // `<=
1559, // `,
604, // `>
1435, // `>=
1247, // `.
1490, // `;
111, // `++
50, // `--
152, // `/
385, // `:
872, // ID
161, // INT_LITERAL
485, // STRING_LITERAL
769, // CHAR_LITERAL
513, // "c"
513, // "l"
513, // "a"
513, // "s"
-1, // idChar
-1, // reserved
513, // "e"
637, // "!"
1360, // "="
1616, // "+"
305, // "0"
566, // digit++
961, // digit
513, // "x"
513, // "X"
-1, // hex
1361, // letter
-1, // "_"
513, // "d"
513, // "g"
513, // "m"
513, // "p"
513, // "v"
513, // "y"
513, // "f"
513, // "i"
513, // {"A".."W" "Y".."Z"}
513, // "o"
513, // "r"
513, // "u"
513, // {"j" "q"}
513, // "b"
513, // "h"
513, // "k"
513, // "n"
513, // "t"
513, // "w"
513, // "z"
305, // {"1".."9"}
1304, // white
1602, // {12}
1602, // " "
1602, // {9}
381, // eol
1433, // comment
565, // oneLineComment
26, // blockComment
1572, // "/"
-1, // printable**
-1, // printable
1638, // "*"
-1, // blockCommentContent*
-1, // blockCommentContent
582, // "["
295, // "-"
174, // "<"
182, // "|"
-1, // {"?".."@"}
164, // "&"
1357, // ")"
155, // ","
369, // "]"
-1, // {"#".."$"}
387, // ";"
1173, // ">"
1611, // "{"
978, // "%"
1273, // "("
-1, // "\"
319, // "."
246, // ":"
984, // "}"
-1, // {"^" "`" "~"}
995, // "'"
1482, // '"'
418, // {10}
1458, // {13}
-1, // stringPrintable
-1, // recognizeEscapeChar
-1, // charPrintable
792, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
-1, // escapeChars
-1, // token*
-1, // printable*
466, // digit+
-1, // idChar*
883, // letter+
MIN_REDUCTION+241, // $
-1, // $NT
  }
,
{ // state 1490
MIN_REDUCTION+80, // (default reduction)
  }
,
{ // state 1491
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 1492
128,1304, // white
132,381, // eol
133,1433, // comment
134,565, // oneLineComment
135,26, // blockComment
MIN_REDUCTION+167, // (default reduction)
  }
,
{ // state 1493
0x80000000|1, // match move
0x80000000|1565, // no-match move
0x80000000|36, // NT-test-match state for idChar
  }
,
{ // state 1494
128,1304, // white
132,381, // eol
133,1433, // comment
134,565, // oneLineComment
135,26, // blockComment
MIN_REDUCTION+325, // (default reduction)
  }
,
{ // state 1495
2,952, // white*
128,376, // white
132,381, // eol
133,1433, // comment
134,565, // oneLineComment
135,26, // blockComment
MIN_REDUCTION+100, // (default reduction)
  }
,
{ // state 1496
0x80000000|1, // match move
0x80000000|492, // no-match move
0x80000000|36, // NT-test-match state for idChar
  }
,
{ // state 1497
117,1277, // "r"
  }
,
{ // state 1498
181,MIN_REDUCTION+118, // $NT
MIN_REDUCTION+118, // (default reduction)
  }
,
{ // state 1499
-1, // $$start
-1, // start
726, // white*
-1, // $$0
MIN_REDUCTION+314, // token
1392, // `boolean
1186, // `class
1576, // `extends
798, // `void
1167, // `int
267, // `while
1537, // `if
316, // `else
440, // `for
165, // `break
280, // `this
1368, // `false
1106, // `true
953, // `super
489, // `null
1163, // `return
630, // `instanceof
976, // `new
1330, // `abstract
1402, // `assert
1567, // `byte
27, // `case
833, // `catch
982, // `char
1324, // `const
141, // `continue
115, // `default
1035, // `do
140, // `double
308, // `enum
662, // `final
1021, // `finally
1158, // `float
765, // `goto
1302, // `implements
768, // `import
1514, // `interface
1633, // `long
812, // `native
1233, // `package
245, // `private
339, // `protected
1254, // `public
516, // `short
412, // `static
1491, // `strictfp
832, // `switch
397, // `synchronized
201, // `throw
1108, // `throws
417, // `transient
631, // `try
927, // `volatile
972, // `!
312, // `!=
1102, // `%
1560, // `&&
293, // `*
647, // `(
123, // `)
1355, // `{
95, // `}
413, // `-
1444, // `+
67, // `=
1322, // `==
109, // `[
551, // `]
1370, // `||
168, // `<
53, // `<=
1559, // `,
604, // `>
1435, // `>=
1247, // `.
1490, // `;
111, // `++
50, // `--
152, // `/
385, // `:
-1, // ID
161, // INT_LITERAL
485, // STRING_LITERAL
769, // CHAR_LITERAL
MIN_REDUCTION+314, // "c"
MIN_REDUCTION+314, // "l"
MIN_REDUCTION+314, // "a"
MIN_REDUCTION+314, // "s"
-1, // idChar
-1, // reserved
MIN_REDUCTION+314, // "e"
637, // "!"
1360, // "="
1616, // "+"
MIN_REDUCTION+314, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+314, // "x"
MIN_REDUCTION+314, // "X"
-1, // hex
-1, // letter
-1, // "_"
MIN_REDUCTION+314, // "d"
MIN_REDUCTION+314, // "g"
MIN_REDUCTION+314, // "m"
MIN_REDUCTION+314, // "p"
MIN_REDUCTION+314, // "v"
MIN_REDUCTION+314, // "y"
MIN_REDUCTION+314, // "f"
MIN_REDUCTION+314, // "i"
MIN_REDUCTION+314, // {"A".."W" "Y".."Z"}
MIN_REDUCTION+314, // "o"
MIN_REDUCTION+314, // "r"
MIN_REDUCTION+314, // "u"
MIN_REDUCTION+314, // {"j" "q"}
MIN_REDUCTION+314, // "b"
MIN_REDUCTION+314, // "h"
MIN_REDUCTION+314, // "k"
MIN_REDUCTION+314, // "n"
MIN_REDUCTION+314, // "t"
MIN_REDUCTION+314, // "w"
MIN_REDUCTION+314, // "z"
MIN_REDUCTION+314, // {"1".."9"}
376, // white
1602, // {12}
1602, // " "
1602, // {9}
381, // eol
1433, // comment
565, // oneLineComment
26, // blockComment
1572, // "/"
-1, // printable**
-1, // printable
1638, // "*"
-1, // blockCommentContent*
-1, // blockCommentContent
582, // "["
295, // "-"
174, // "<"
182, // "|"
-1, // {"?".."@"}
164, // "&"
1357, // ")"
155, // ","
369, // "]"
-1, // {"#".."$"}
387, // ";"
1173, // ">"
1611, // "{"
978, // "%"
1273, // "("
-1, // "\"
319, // "."
246, // ":"
984, // "}"
-1, // {"^" "`" "~"}
995, // "'"
1482, // '"'
418, // {10}
1458, // {13}
-1, // stringPrintable
-1, // recognizeEscapeChar
-1, // charPrintable
-1, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
-1, // escapeChars
-1, // token*
-1, // printable*
-1, // digit+
-1, // idChar*
-1, // letter+
MIN_REDUCTION+314, // $
-1, // $NT
  }
,
{ // state 1500
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+271, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
972, // `!
312, // `!=
1102, // `%
1560, // `&&
293, // `*
647, // `(
123, // `)
1355, // `{
95, // `}
413, // `-
1444, // `+
67, // `=
1322, // `==
109, // `[
551, // `]
1370, // `||
168, // `<
53, // `<=
1559, // `,
604, // `>
1435, // `>=
1247, // `.
1490, // `;
111, // `++
50, // `--
152, // `/
385, // `:
872, // ID
161, // INT_LITERAL
485, // STRING_LITERAL
769, // CHAR_LITERAL
513, // "c"
513, // "l"
513, // "a"
513, // "s"
-1, // idChar
-1, // reserved
513, // "e"
637, // "!"
1360, // "="
1616, // "+"
305, // "0"
566, // digit++
961, // digit
513, // "x"
513, // "X"
-1, // hex
1361, // letter
-1, // "_"
513, // "d"
513, // "g"
513, // "m"
513, // "p"
513, // "v"
513, // "y"
513, // "f"
513, // "i"
513, // {"A".."W" "Y".."Z"}
513, // "o"
513, // "r"
513, // "u"
513, // {"j" "q"}
513, // "b"
513, // "h"
513, // "k"
513, // "n"
513, // "t"
513, // "w"
513, // "z"
305, // {"1".."9"}
1304, // white
1602, // {12}
1602, // " "
1602, // {9}
381, // eol
1433, // comment
565, // oneLineComment
26, // blockComment
1572, // "/"
-1, // printable**
-1, // printable
1638, // "*"
-1, // blockCommentContent*
-1, // blockCommentContent
582, // "["
295, // "-"
174, // "<"
182, // "|"
-1, // {"?".."@"}
164, // "&"
1357, // ")"
155, // ","
369, // "]"
-1, // {"#".."$"}
387, // ";"
1173, // ">"
1611, // "{"
978, // "%"
1273, // "("
-1, // "\"
319, // "."
246, // ":"
984, // "}"
-1, // {"^" "`" "~"}
995, // "'"
1482, // '"'
418, // {10}
1458, // {13}
-1, // stringPrintable
-1, // recognizeEscapeChar
-1, // charPrintable
792, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
-1, // escapeChars
-1, // token*
-1, // printable*
466, // digit+
-1, // idChar*
883, // letter+
MIN_REDUCTION+271, // $
-1, // $NT
  }
,
{ // state 1501
0x80000000|335, // match move
0x80000000|656, // no-match move
// T-test match for "0":
99,
  }
,
{ // state 1502
91,187, // "a"
  }
,
{ // state 1503
128,1304, // white
132,381, // eol
133,1433, // comment
134,565, // oneLineComment
135,26, // blockComment
MIN_REDUCTION+187, // (default reduction)
  }
,
{ // state 1504
MIN_REDUCTION+289, // (default reduction)
  }
,
{ // state 1505
0x80000000|136, // match move
0x80000000|158, // no-match move
0x80000000|36, // NT-test-match state for idChar
  }
,
{ // state 1506
128,620, // white
129,674, // {12}
130,674, // " "
131,674, // {9}
132,889, // eol
133,775, // comment
134,943, // oneLineComment
135,641, // blockComment
136,1598, // "/"
164,926, // {10}
165,676, // {13}
181,MIN_REDUCTION+301, // $NT
  }
,
{ // state 1507
2,759, // white*
MIN_REDUCTION+347, // (default reduction)
  }
,
{ // state 1508
128,1304, // white
132,381, // eol
133,1433, // comment
134,565, // oneLineComment
135,26, // blockComment
MIN_REDUCTION+101, // (default reduction)
  }
,
{ // state 1509
MIN_REDUCTION+139, // (default reduction)
  }
,
{ // state 1510
MIN_REDUCTION+364, // (default reduction)
  }
,
{ // state 1511
164,1367, // {10}
  }
,
{ // state 1512
0x80000000|482, // match move
0x80000000|213, // no-match move
// T-test match for "0":
99,
  }
,
{ // state 1513
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 1514
MIN_REDUCTION+41, // (default reduction)
  }
,
{ // state 1515
-1, // $$start
-1, // start
416, // white*
-1, // $$0
MIN_REDUCTION+172, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
972, // `!
312, // `!=
1102, // `%
1560, // `&&
293, // `*
647, // `(
123, // `)
1355, // `{
95, // `}
413, // `-
1444, // `+
-1, // `=
-1, // `==
109, // `[
551, // `]
1370, // `||
168, // `<
53, // `<=
1559, // `,
604, // `>
1435, // `>=
1247, // `.
1490, // `;
111, // `++
50, // `--
152, // `/
385, // `:
872, // ID
161, // INT_LITERAL
485, // STRING_LITERAL
769, // CHAR_LITERAL
513, // "c"
513, // "l"
513, // "a"
513, // "s"
-1, // idChar
-1, // reserved
513, // "e"
637, // "!"
MIN_REDUCTION+172, // "="
1616, // "+"
305, // "0"
566, // digit++
961, // digit
513, // "x"
513, // "X"
-1, // hex
1361, // letter
-1, // "_"
513, // "d"
513, // "g"
513, // "m"
513, // "p"
513, // "v"
513, // "y"
513, // "f"
513, // "i"
513, // {"A".."W" "Y".."Z"}
513, // "o"
513, // "r"
513, // "u"
513, // {"j" "q"}
513, // "b"
513, // "h"
513, // "k"
513, // "n"
513, // "t"
513, // "w"
513, // "z"
305, // {"1".."9"}
376, // white
1602, // {12}
1602, // " "
1602, // {9}
381, // eol
1433, // comment
565, // oneLineComment
26, // blockComment
1572, // "/"
-1, // printable**
-1, // printable
1638, // "*"
-1, // blockCommentContent*
-1, // blockCommentContent
582, // "["
295, // "-"
174, // "<"
182, // "|"
-1, // {"?".."@"}
164, // "&"
1357, // ")"
155, // ","
369, // "]"
-1, // {"#".."$"}
387, // ";"
1173, // ">"
1611, // "{"
978, // "%"
1273, // "("
-1, // "\"
319, // "."
246, // ":"
984, // "}"
-1, // {"^" "`" "~"}
995, // "'"
1482, // '"'
418, // {10}
1458, // {13}
-1, // stringPrintable
-1, // recognizeEscapeChar
-1, // charPrintable
792, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
-1, // escapeChars
-1, // token*
-1, // printable*
466, // digit+
-1, // idChar*
883, // letter+
MIN_REDUCTION+172, // $
-1, // $NT
  }
,
{ // state 1516
MIN_REDUCTION+214, // (default reduction)
  }
,
{ // state 1517
128,620, // white
129,674, // {12}
130,674, // " "
131,674, // {9}
132,889, // eol
133,775, // comment
134,943, // oneLineComment
135,641, // blockComment
136,1598, // "/"
164,926, // {10}
165,676, // {13}
181,MIN_REDUCTION+304, // $NT
  }
,
{ // state 1518
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+307, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
972, // `!
312, // `!=
1102, // `%
1560, // `&&
293, // `*
647, // `(
123, // `)
1355, // `{
95, // `}
413, // `-
1444, // `+
67, // `=
1322, // `==
109, // `[
551, // `]
1370, // `||
168, // `<
53, // `<=
1559, // `,
604, // `>
1435, // `>=
1247, // `.
1490, // `;
111, // `++
50, // `--
152, // `/
385, // `:
872, // ID
161, // INT_LITERAL
485, // STRING_LITERAL
769, // CHAR_LITERAL
513, // "c"
513, // "l"
513, // "a"
513, // "s"
-1, // idChar
-1, // reserved
513, // "e"
637, // "!"
1360, // "="
1616, // "+"
305, // "0"
566, // digit++
961, // digit
513, // "x"
513, // "X"
-1, // hex
1361, // letter
-1, // "_"
513, // "d"
513, // "g"
513, // "m"
513, // "p"
513, // "v"
513, // "y"
513, // "f"
513, // "i"
513, // {"A".."W" "Y".."Z"}
513, // "o"
513, // "r"
513, // "u"
513, // {"j" "q"}
513, // "b"
513, // "h"
513, // "k"
513, // "n"
513, // "t"
513, // "w"
513, // "z"
305, // {"1".."9"}
1304, // white
1602, // {12}
1602, // " "
1602, // {9}
381, // eol
1433, // comment
565, // oneLineComment
26, // blockComment
1572, // "/"
-1, // printable**
-1, // printable
1638, // "*"
-1, // blockCommentContent*
-1, // blockCommentContent
582, // "["
295, // "-"
174, // "<"
182, // "|"
-1, // {"?".."@"}
164, // "&"
1357, // ")"
155, // ","
369, // "]"
-1, // {"#".."$"}
387, // ";"
1173, // ">"
1611, // "{"
978, // "%"
1273, // "("
-1, // "\"
319, // "."
246, // ":"
984, // "}"
-1, // {"^" "`" "~"}
995, // "'"
1482, // '"'
418, // {10}
1458, // {13}
-1, // stringPrintable
-1, // recognizeEscapeChar
-1, // charPrintable
792, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
-1, // escapeChars
-1, // token*
-1, // printable*
466, // digit+
-1, // idChar*
883, // letter+
MIN_REDUCTION+307, // $
-1, // $NT
  }
,
{ // state 1519
124,1381, // "t"
  }
,
{ // state 1520
2,1027, // white*
128,1336, // white
129,674, // {12}
130,674, // " "
131,674, // {9}
132,889, // eol
133,775, // comment
134,943, // oneLineComment
135,641, // blockComment
136,1598, // "/"
164,926, // {10}
165,676, // {13}
181,MIN_REDUCTION+275, // $NT
  }
,
{ // state 1521
0x80000000|1265, // match move
0x80000000|1383, // no-match move
0x80000000|1258, // NT-test-match state for reserved
  }
,
{ // state 1522
122,764, // "k"
  }
,
{ // state 1523
128,1304, // white
132,381, // eol
133,1433, // comment
134,565, // oneLineComment
135,26, // blockComment
MIN_REDUCTION+310, // (default reduction)
  }
,
{ // state 1524
109,729, // "m"
  }
,
{ // state 1525
124,1281, // "t"
  }
,
{ // state 1526
124,198, // "t"
  }
,
{ // state 1527
89,1513, // "c"
90,1513, // "l"
91,1513, // "a"
92,1513, // "s"
95,1513, // "e"
96,1513, // "!"
97,1513, // "="
98,1513, // "+"
99,1513, // "0"
102,1513, // "x"
103,1513, // "X"
106,1513, // "_"
107,1513, // "d"
108,1513, // "g"
109,1513, // "m"
110,1513, // "p"
111,1513, // "v"
112,1513, // "y"
113,1513, // "f"
114,1513, // "i"
115,1513, // {"A".."W" "Y".."Z"}
116,1513, // "o"
117,1513, // "r"
118,1513, // "u"
119,1513, // {"j" "q"}
120,1513, // "b"
121,1513, // "h"
122,1513, // "k"
123,1513, // "n"
124,1513, // "t"
125,1513, // "w"
126,1513, // "z"
127,1513, // {"1".."9"}
130,1513, // " "
131,1513, // {9}
132,237, // eol
136,1513, // "/"
139,1325, // "*"
141,1627, // blockCommentContent
142,1513, // "["
143,1513, // "-"
144,1513, // "<"
145,1513, // "|"
146,1513, // {"?".."@"}
147,1513, // "&"
148,1513, // ")"
149,1513, // ","
150,1513, // "]"
151,1513, // {"#".."$"}
152,1513, // ";"
153,1513, // ">"
154,1513, // "{"
155,1513, // "%"
156,1513, // "("
157,1513, // "\"
158,1513, // "."
159,1513, // ":"
160,1513, // "}"
161,1513, // {"^" "`" "~"}
162,1513, // "'"
163,1513, // '"'
164,303, // {10}
165,1001, // {13}
  }
,
{ // state 1528
114,58, // "i"
  }
,
{ // state 1529
128,620, // white
129,674, // {12}
130,674, // " "
131,674, // {9}
132,889, // eol
133,775, // comment
134,943, // oneLineComment
135,641, // blockComment
136,1598, // "/"
164,926, // {10}
165,676, // {13}
181,MIN_REDUCTION+250, // $NT
  }
,
{ // state 1530
110,1142, // "p"
  }
,
{ // state 1531
0x80000000|1110, // match move
0x80000000|55, // no-match move
// T-test match for "0":
99,
  }
,
{ // state 1532
0x80000000|16, // match move
0x80000000|1500, // no-match move
0x80000000|1258, // NT-test-match state for reserved
  }
,
{ // state 1533
118,32, // "u"
  }
,
{ // state 1534
2,1467, // white*
MIN_REDUCTION+150, // (default reduction)
  }
,
{ // state 1535
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+292, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
972, // `!
312, // `!=
1102, // `%
1560, // `&&
293, // `*
647, // `(
123, // `)
1355, // `{
95, // `}
413, // `-
1444, // `+
67, // `=
1322, // `==
109, // `[
551, // `]
1370, // `||
168, // `<
53, // `<=
1559, // `,
604, // `>
1435, // `>=
1247, // `.
1490, // `;
111, // `++
50, // `--
152, // `/
385, // `:
872, // ID
161, // INT_LITERAL
485, // STRING_LITERAL
769, // CHAR_LITERAL
513, // "c"
513, // "l"
513, // "a"
513, // "s"
-1, // idChar
-1, // reserved
513, // "e"
637, // "!"
1360, // "="
1616, // "+"
305, // "0"
566, // digit++
961, // digit
513, // "x"
513, // "X"
-1, // hex
1361, // letter
-1, // "_"
513, // "d"
513, // "g"
513, // "m"
513, // "p"
513, // "v"
513, // "y"
513, // "f"
513, // "i"
513, // {"A".."W" "Y".."Z"}
513, // "o"
513, // "r"
513, // "u"
513, // {"j" "q"}
513, // "b"
513, // "h"
513, // "k"
513, // "n"
513, // "t"
513, // "w"
513, // "z"
305, // {"1".."9"}
1304, // white
1602, // {12}
1602, // " "
1602, // {9}
381, // eol
1433, // comment
565, // oneLineComment
26, // blockComment
1572, // "/"
-1, // printable**
-1, // printable
1638, // "*"
-1, // blockCommentContent*
-1, // blockCommentContent
582, // "["
295, // "-"
174, // "<"
182, // "|"
-1, // {"?".."@"}
164, // "&"
1357, // ")"
155, // ","
369, // "]"
-1, // {"#".."$"}
387, // ";"
1173, // ">"
1611, // "{"
978, // "%"
1273, // "("
-1, // "\"
319, // "."
246, // ":"
984, // "}"
-1, // {"^" "`" "~"}
995, // "'"
1482, // '"'
418, // {10}
1458, // {13}
-1, // stringPrintable
-1, // recognizeEscapeChar
-1, // charPrintable
792, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
-1, // escapeChars
-1, // token*
-1, // printable*
466, // digit+
-1, // idChar*
883, // letter+
MIN_REDUCTION+292, // $
-1, // $NT
  }
,
{ // state 1536
91,1526, // "a"
117,670, // "r"
  }
,
{ // state 1537
MIN_REDUCTION+11, // (default reduction)
  }
,
{ // state 1538
MIN_REDUCTION+259, // (default reduction)
  }
,
{ // state 1539
95,623, // "e"
  }
,
{ // state 1540
128,1304, // white
132,381, // eol
133,1433, // comment
134,565, // oneLineComment
135,26, // blockComment
MIN_REDUCTION+244, // (default reduction)
  }
,
{ // state 1541
118,1524, // "u"
  }
,
{ // state 1542
0x80000000|1459, // match move
0x80000000|1553, // no-match move
// T-test match for "0":
99,
  }
,
{ // state 1543
128,1304, // white
132,381, // eol
133,1433, // comment
134,565, // oneLineComment
135,26, // blockComment
MIN_REDUCTION+229, // (default reduction)
  }
,
{ // state 1544
MIN_REDUCTION+99, // (default reduction)
  }
,
{ // state 1545
95,367, // "e"
  }
,
{ // state 1546
132,552, // eol
137,419, // printable**
164,418, // {10}
165,1458, // {13}
176,225, // printable*
  }
,
{ // state 1547
-1, // $$start
-1, // start
1308, // white*
-1, // $$0
MIN_REDUCTION+305, // token
1392, // `boolean
1186, // `class
1576, // `extends
798, // `void
1167, // `int
267, // `while
1537, // `if
316, // `else
440, // `for
165, // `break
280, // `this
1368, // `false
1106, // `true
953, // `super
489, // `null
1163, // `return
630, // `instanceof
976, // `new
1330, // `abstract
1402, // `assert
1567, // `byte
27, // `case
833, // `catch
982, // `char
1324, // `const
141, // `continue
115, // `default
1035, // `do
140, // `double
308, // `enum
662, // `final
1021, // `finally
1158, // `float
765, // `goto
1302, // `implements
768, // `import
1514, // `interface
1633, // `long
812, // `native
1233, // `package
245, // `private
339, // `protected
1254, // `public
516, // `short
412, // `static
1491, // `strictfp
832, // `switch
397, // `synchronized
201, // `throw
1108, // `throws
417, // `transient
631, // `try
927, // `volatile
972, // `!
312, // `!=
1102, // `%
1560, // `&&
293, // `*
647, // `(
123, // `)
1355, // `{
95, // `}
413, // `-
1444, // `+
67, // `=
1322, // `==
109, // `[
551, // `]
1370, // `||
168, // `<
53, // `<=
1559, // `,
604, // `>
1435, // `>=
1247, // `.
1490, // `;
111, // `++
50, // `--
152, // `/
385, // `:
-1, // ID
161, // INT_LITERAL
485, // STRING_LITERAL
769, // CHAR_LITERAL
MIN_REDUCTION+305, // "c"
MIN_REDUCTION+305, // "l"
MIN_REDUCTION+305, // "a"
MIN_REDUCTION+305, // "s"
-1, // idChar
-1, // reserved
MIN_REDUCTION+305, // "e"
637, // "!"
1360, // "="
1616, // "+"
MIN_REDUCTION+305, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+305, // "x"
MIN_REDUCTION+305, // "X"
-1, // hex
-1, // letter
-1, // "_"
MIN_REDUCTION+305, // "d"
MIN_REDUCTION+305, // "g"
MIN_REDUCTION+305, // "m"
MIN_REDUCTION+305, // "p"
MIN_REDUCTION+305, // "v"
MIN_REDUCTION+305, // "y"
MIN_REDUCTION+305, // "f"
MIN_REDUCTION+305, // "i"
MIN_REDUCTION+305, // {"A".."W" "Y".."Z"}
MIN_REDUCTION+305, // "o"
MIN_REDUCTION+305, // "r"
MIN_REDUCTION+305, // "u"
MIN_REDUCTION+305, // {"j" "q"}
MIN_REDUCTION+305, // "b"
MIN_REDUCTION+305, // "h"
MIN_REDUCTION+305, // "k"
MIN_REDUCTION+305, // "n"
MIN_REDUCTION+305, // "t"
MIN_REDUCTION+305, // "w"
MIN_REDUCTION+305, // "z"
MIN_REDUCTION+305, // {"1".."9"}
376, // white
1602, // {12}
1602, // " "
1602, // {9}
381, // eol
1433, // comment
565, // oneLineComment
26, // blockComment
1572, // "/"
-1, // printable**
-1, // printable
1638, // "*"
-1, // blockCommentContent*
-1, // blockCommentContent
582, // "["
295, // "-"
174, // "<"
182, // "|"
-1, // {"?".."@"}
164, // "&"
1357, // ")"
155, // ","
369, // "]"
-1, // {"#".."$"}
387, // ";"
1173, // ">"
1611, // "{"
978, // "%"
1273, // "("
-1, // "\"
319, // "."
246, // ":"
984, // "}"
-1, // {"^" "`" "~"}
995, // "'"
1482, // '"'
418, // {10}
1458, // {13}
-1, // stringPrintable
-1, // recognizeEscapeChar
-1, // charPrintable
-1, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
-1, // escapeChars
-1, // token*
-1, // printable*
-1, // digit+
-1, // idChar*
-1, // letter+
MIN_REDUCTION+305, // $
-1, // $NT
  }
,
{ // state 1548
117,408, // "r"
  }
,
{ // state 1549
0x80000000|41, // match move
0x80000000|191, // no-match move
0x80000000|1258, // NT-test-match state for reserved
  }
,
{ // state 1550
0x80000000|1, // match move
0x80000000|1271, // no-match move
0x80000000|36, // NT-test-match state for idChar
  }
,
{ // state 1551
MIN_REDUCTION+373, // (default reduction)
  }
,
{ // state 1552
136,458, // "/"
  }
,
{ // state 1553
0x80000000|572, // match move
0x80000000|276, // no-match move
0x80000000|1258, // NT-test-match state for reserved
  }
,
{ // state 1554
0x80000000|1107, // match move
0x80000000|1202, // no-match move
// T-test match for "0":
99,
  }
,
{ // state 1555
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+301, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
972, // `!
312, // `!=
1102, // `%
1560, // `&&
293, // `*
647, // `(
123, // `)
1355, // `{
95, // `}
413, // `-
1444, // `+
67, // `=
1322, // `==
109, // `[
551, // `]
1370, // `||
168, // `<
53, // `<=
1559, // `,
604, // `>
1435, // `>=
1247, // `.
1490, // `;
111, // `++
50, // `--
152, // `/
385, // `:
872, // ID
161, // INT_LITERAL
485, // STRING_LITERAL
769, // CHAR_LITERAL
513, // "c"
513, // "l"
513, // "a"
513, // "s"
-1, // idChar
-1, // reserved
513, // "e"
637, // "!"
1360, // "="
1616, // "+"
305, // "0"
566, // digit++
961, // digit
513, // "x"
513, // "X"
-1, // hex
1361, // letter
-1, // "_"
513, // "d"
513, // "g"
513, // "m"
513, // "p"
513, // "v"
513, // "y"
513, // "f"
513, // "i"
513, // {"A".."W" "Y".."Z"}
513, // "o"
513, // "r"
513, // "u"
513, // {"j" "q"}
513, // "b"
513, // "h"
513, // "k"
513, // "n"
513, // "t"
513, // "w"
513, // "z"
305, // {"1".."9"}
1304, // white
1602, // {12}
1602, // " "
1602, // {9}
381, // eol
1433, // comment
565, // oneLineComment
26, // blockComment
1572, // "/"
-1, // printable**
-1, // printable
1638, // "*"
-1, // blockCommentContent*
-1, // blockCommentContent
582, // "["
295, // "-"
174, // "<"
182, // "|"
-1, // {"?".."@"}
164, // "&"
1357, // ")"
155, // ","
369, // "]"
-1, // {"#".."$"}
387, // ";"
1173, // ">"
1611, // "{"
978, // "%"
1273, // "("
-1, // "\"
319, // "."
246, // ":"
984, // "}"
-1, // {"^" "`" "~"}
995, // "'"
1482, // '"'
418, // {10}
1458, // {13}
-1, // stringPrintable
-1, // recognizeEscapeChar
-1, // charPrintable
792, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
-1, // escapeChars
-1, // token*
-1, // printable*
466, // digit+
-1, // idChar*
883, // letter+
MIN_REDUCTION+301, // $
-1, // $NT
  }
,
{ // state 1556
0x80000000|1, // match move
0x80000000|1649, // no-match move
0x80000000|36, // NT-test-match state for idChar
  }
,
{ // state 1557
123,1206, // "n"
  }
,
{ // state 1558
0x80000000|1114, // match move
0x80000000|1601, // no-match move
// T-test match for "/":
136,
  }
,
{ // state 1559
MIN_REDUCTION+76, // (default reduction)
  }
,
{ // state 1560
MIN_REDUCTION+61, // (default reduction)
  }
,
{ // state 1561
143,1298, // "-"
  }
,
{ // state 1562
124,127, // "t"
  }
,
{ // state 1563
0x80000000|1085, // match move
0x80000000|1366, // no-match move
0x80000000|1258, // NT-test-match state for reserved
  }
,
{ // state 1564
128,1304, // white
132,381, // eol
133,1433, // comment
134,565, // oneLineComment
135,26, // blockComment
MIN_REDUCTION+97, // (default reduction)
  }
,
{ // state 1565
-1, // $$start
-1, // start
1579, // white*
-1, // $$0
MIN_REDUCTION+93, // token
1392, // `boolean
1186, // `class
1576, // `extends
798, // `void
1167, // `int
267, // `while
1537, // `if
316, // `else
440, // `for
165, // `break
280, // `this
1368, // `false
1106, // `true
953, // `super
489, // `null
1163, // `return
630, // `instanceof
976, // `new
1330, // `abstract
1402, // `assert
1567, // `byte
27, // `case
833, // `catch
982, // `char
1324, // `const
141, // `continue
115, // `default
1035, // `do
140, // `double
308, // `enum
662, // `final
1021, // `finally
1158, // `float
765, // `goto
1302, // `implements
768, // `import
1514, // `interface
1633, // `long
812, // `native
1233, // `package
245, // `private
339, // `protected
1254, // `public
516, // `short
412, // `static
1491, // `strictfp
832, // `switch
397, // `synchronized
201, // `throw
1108, // `throws
417, // `transient
631, // `try
927, // `volatile
972, // `!
312, // `!=
1102, // `%
1560, // `&&
293, // `*
647, // `(
123, // `)
1355, // `{
95, // `}
413, // `-
1444, // `+
67, // `=
1322, // `==
109, // `[
551, // `]
1370, // `||
168, // `<
53, // `<=
1559, // `,
604, // `>
1435, // `>=
1247, // `.
1490, // `;
111, // `++
50, // `--
152, // `/
385, // `:
-1, // ID
161, // INT_LITERAL
485, // STRING_LITERAL
769, // CHAR_LITERAL
MIN_REDUCTION+93, // "c"
MIN_REDUCTION+93, // "l"
MIN_REDUCTION+93, // "a"
MIN_REDUCTION+93, // "s"
-1, // idChar
-1, // reserved
MIN_REDUCTION+93, // "e"
637, // "!"
1360, // "="
1616, // "+"
MIN_REDUCTION+93, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+93, // "x"
MIN_REDUCTION+93, // "X"
-1, // hex
-1, // letter
-1, // "_"
MIN_REDUCTION+93, // "d"
MIN_REDUCTION+93, // "g"
MIN_REDUCTION+93, // "m"
MIN_REDUCTION+93, // "p"
MIN_REDUCTION+93, // "v"
MIN_REDUCTION+93, // "y"
MIN_REDUCTION+93, // "f"
MIN_REDUCTION+93, // "i"
MIN_REDUCTION+93, // {"A".."W" "Y".."Z"}
MIN_REDUCTION+93, // "o"
MIN_REDUCTION+93, // "r"
MIN_REDUCTION+93, // "u"
MIN_REDUCTION+93, // {"j" "q"}
MIN_REDUCTION+93, // "b"
MIN_REDUCTION+93, // "h"
MIN_REDUCTION+93, // "k"
MIN_REDUCTION+93, // "n"
MIN_REDUCTION+93, // "t"
MIN_REDUCTION+93, // "w"
MIN_REDUCTION+93, // "z"
MIN_REDUCTION+93, // {"1".."9"}
376, // white
1602, // {12}
1602, // " "
1602, // {9}
381, // eol
1433, // comment
565, // oneLineComment
26, // blockComment
1572, // "/"
-1, // printable**
-1, // printable
1638, // "*"
-1, // blockCommentContent*
-1, // blockCommentContent
582, // "["
295, // "-"
174, // "<"
182, // "|"
-1, // {"?".."@"}
164, // "&"
1357, // ")"
155, // ","
369, // "]"
-1, // {"#".."$"}
387, // ";"
1173, // ">"
1611, // "{"
978, // "%"
1273, // "("
-1, // "\"
319, // "."
246, // ":"
984, // "}"
-1, // {"^" "`" "~"}
995, // "'"
1482, // '"'
418, // {10}
1458, // {13}
-1, // stringPrintable
-1, // recognizeEscapeChar
-1, // charPrintable
-1, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
-1, // escapeChars
-1, // token*
-1, // printable*
-1, // digit+
-1, // idChar*
-1, // letter+
MIN_REDUCTION+93, // $
-1, // $NT
  }
,
{ // state 1566
124,1262, // "t"
  }
,
{ // state 1567
MIN_REDUCTION+25, // (default reduction)
  }
,
{ // state 1568
0x80000000|1321, // match move
0x80000000|1590, // no-match move
// T-test match for "0":
99,
  }
,
{ // state 1569
0x80000000|1072, // match move
0x80000000|1465, // no-match move
// T-test match for "0":
99,
  }
,
{ // state 1570
0x80000000|1, // match move
0x80000000|755, // no-match move
0x80000000|36, // NT-test-match state for idChar
  }
,
{ // state 1571
2,1315, // white*
MIN_REDUCTION+164, // (default reduction)
  }
,
{ // state 1572
0x80000000|1415, // match move
0x80000000|1476, // no-match move
// T-test match for {"*" "/"}:
136,
139,
  }
,
{ // state 1573
MIN_REDUCTION+187, // (default reduction)
  }
,
{ // state 1574
MIN_REDUCTION+134, // (default reduction)
  }
,
{ // state 1575
MIN_REDUCTION+351, // (default reduction)
  }
,
{ // state 1576
MIN_REDUCTION+7, // (default reduction)
  }
,
{ // state 1577
0x80000000|1, // match move
0x80000000|762, // no-match move
0x80000000|36, // NT-test-match state for idChar
  }
,
{ // state 1578
MIN_REDUCTION+350, // (default reduction)
  }
,
{ // state 1579
0x80000000|1650, // match move
0x80000000|1391, // no-match move
// T-test match for "0":
99,
  }
,
{ // state 1580
107,1426, // "d"
  }
,
{ // state 1581
89,1425, // "c"
  }
,
{ // state 1582
MIN_REDUCTION+368, // (default reduction)
  }
,
{ // state 1583
92,1232, // "s"
  }
,
{ // state 1584
91,1347, // "a"
  }
,
{ // state 1585
0x80000000|1176, // match move
0x80000000|411, // no-match move
// T-test match for "0":
99,
  }
,
{ // state 1586
128,620, // white
129,674, // {12}
130,674, // " "
131,674, // {9}
132,889, // eol
133,775, // comment
134,943, // oneLineComment
135,641, // blockComment
136,1598, // "/"
164,926, // {10}
165,676, // {13}
181,MIN_REDUCTION+289, // $NT
  }
,
{ // state 1587
95,209, // "e"
  }
,
{ // state 1588
MIN_REDUCTION+256, // (default reduction)
  }
,
{ // state 1589
116,1285, // "o"
  }
,
{ // state 1590
0x80000000|214, // match move
0x80000000|1603, // no-match move
0x80000000|1258, // NT-test-match state for reserved
  }
,
{ // state 1591
118,188, // "u"
  }
,
{ // state 1592
MIN_REDUCTION+223, // (default reduction)
  }
,
{ // state 1593
116,1198, // "o"
  }
,
{ // state 1594
-1, // $$start
-1, // start
850, // white*
-1, // $$0
MIN_REDUCTION+260, // token
1392, // `boolean
1186, // `class
1576, // `extends
798, // `void
1167, // `int
267, // `while
1537, // `if
316, // `else
440, // `for
165, // `break
280, // `this
1368, // `false
1106, // `true
953, // `super
489, // `null
1163, // `return
630, // `instanceof
976, // `new
1330, // `abstract
1402, // `assert
1567, // `byte
27, // `case
833, // `catch
982, // `char
1324, // `const
141, // `continue
115, // `default
1035, // `do
140, // `double
308, // `enum
662, // `final
1021, // `finally
1158, // `float
765, // `goto
1302, // `implements
768, // `import
1514, // `interface
1633, // `long
812, // `native
1233, // `package
245, // `private
339, // `protected
1254, // `public
516, // `short
412, // `static
1491, // `strictfp
832, // `switch
397, // `synchronized
201, // `throw
1108, // `throws
417, // `transient
631, // `try
927, // `volatile
972, // `!
312, // `!=
1102, // `%
1560, // `&&
293, // `*
647, // `(
123, // `)
1355, // `{
95, // `}
413, // `-
1444, // `+
67, // `=
1322, // `==
109, // `[
551, // `]
1370, // `||
168, // `<
53, // `<=
1559, // `,
604, // `>
1435, // `>=
1247, // `.
1490, // `;
111, // `++
50, // `--
152, // `/
385, // `:
-1, // ID
161, // INT_LITERAL
485, // STRING_LITERAL
769, // CHAR_LITERAL
MIN_REDUCTION+260, // "c"
MIN_REDUCTION+260, // "l"
MIN_REDUCTION+260, // "a"
MIN_REDUCTION+260, // "s"
-1, // idChar
-1, // reserved
MIN_REDUCTION+260, // "e"
637, // "!"
1360, // "="
1616, // "+"
MIN_REDUCTION+260, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+260, // "x"
MIN_REDUCTION+260, // "X"
-1, // hex
-1, // letter
-1, // "_"
MIN_REDUCTION+260, // "d"
MIN_REDUCTION+260, // "g"
MIN_REDUCTION+260, // "m"
MIN_REDUCTION+260, // "p"
MIN_REDUCTION+260, // "v"
MIN_REDUCTION+260, // "y"
MIN_REDUCTION+260, // "f"
MIN_REDUCTION+260, // "i"
MIN_REDUCTION+260, // {"A".."W" "Y".."Z"}
MIN_REDUCTION+260, // "o"
MIN_REDUCTION+260, // "r"
MIN_REDUCTION+260, // "u"
MIN_REDUCTION+260, // {"j" "q"}
MIN_REDUCTION+260, // "b"
MIN_REDUCTION+260, // "h"
MIN_REDUCTION+260, // "k"
MIN_REDUCTION+260, // "n"
MIN_REDUCTION+260, // "t"
MIN_REDUCTION+260, // "w"
MIN_REDUCTION+260, // "z"
MIN_REDUCTION+260, // {"1".."9"}
376, // white
1602, // {12}
1602, // " "
1602, // {9}
381, // eol
1433, // comment
565, // oneLineComment
26, // blockComment
1572, // "/"
-1, // printable**
-1, // printable
1638, // "*"
-1, // blockCommentContent*
-1, // blockCommentContent
582, // "["
295, // "-"
174, // "<"
182, // "|"
-1, // {"?".."@"}
164, // "&"
1357, // ")"
155, // ","
369, // "]"
-1, // {"#".."$"}
387, // ";"
1173, // ">"
1611, // "{"
978, // "%"
1273, // "("
-1, // "\"
319, // "."
246, // ":"
984, // "}"
-1, // {"^" "`" "~"}
995, // "'"
1482, // '"'
418, // {10}
1458, // {13}
-1, // stringPrintable
-1, // recognizeEscapeChar
-1, // charPrintable
-1, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
-1, // escapeChars
-1, // token*
-1, // printable*
-1, // digit+
-1, // idChar*
-1, // letter+
MIN_REDUCTION+260, // $
-1, // $NT
  }
,
{ // state 1595
MIN_REDUCTION+141, // (default reduction)
  }
,
{ // state 1596
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+310, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
972, // `!
312, // `!=
1102, // `%
1560, // `&&
293, // `*
647, // `(
123, // `)
1355, // `{
95, // `}
413, // `-
1444, // `+
67, // `=
1322, // `==
109, // `[
551, // `]
1370, // `||
168, // `<
53, // `<=
1559, // `,
604, // `>
1435, // `>=
1247, // `.
1490, // `;
111, // `++
50, // `--
152, // `/
385, // `:
872, // ID
161, // INT_LITERAL
485, // STRING_LITERAL
769, // CHAR_LITERAL
513, // "c"
513, // "l"
513, // "a"
513, // "s"
-1, // idChar
-1, // reserved
513, // "e"
637, // "!"
1360, // "="
1616, // "+"
305, // "0"
566, // digit++
961, // digit
513, // "x"
513, // "X"
-1, // hex
1361, // letter
-1, // "_"
513, // "d"
513, // "g"
513, // "m"
513, // "p"
513, // "v"
513, // "y"
513, // "f"
513, // "i"
513, // {"A".."W" "Y".."Z"}
513, // "o"
513, // "r"
513, // "u"
513, // {"j" "q"}
513, // "b"
513, // "h"
513, // "k"
513, // "n"
513, // "t"
513, // "w"
513, // "z"
305, // {"1".."9"}
1304, // white
1602, // {12}
1602, // " "
1602, // {9}
381, // eol
1433, // comment
565, // oneLineComment
26, // blockComment
1572, // "/"
-1, // printable**
-1, // printable
1638, // "*"
-1, // blockCommentContent*
-1, // blockCommentContent
582, // "["
295, // "-"
174, // "<"
182, // "|"
-1, // {"?".."@"}
164, // "&"
1357, // ")"
155, // ","
369, // "]"
-1, // {"#".."$"}
387, // ";"
1173, // ">"
1611, // "{"
978, // "%"
1273, // "("
-1, // "\"
319, // "."
246, // ":"
984, // "}"
-1, // {"^" "`" "~"}
995, // "'"
1482, // '"'
418, // {10}
1458, // {13}
-1, // stringPrintable
-1, // recognizeEscapeChar
-1, // charPrintable
792, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
-1, // escapeChars
-1, // token*
-1, // printable*
466, // digit+
-1, // idChar*
883, // letter+
MIN_REDUCTION+310, // $
-1, // $NT
  }
};
}
private class Initter9{
public int doInit(int startIdx) {
  for (int i = 0; i < myParseTable.length; i++) {
    parseTable[i+startIdx] = myParseTable[i];
  }
  return myParseTable.length;
}
private final int[][] myParseTable = {
{ // state 1597
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+145, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
972, // `!
312, // `!=
1102, // `%
1560, // `&&
293, // `*
647, // `(
123, // `)
1355, // `{
95, // `}
413, // `-
1444, // `+
67, // `=
1322, // `==
109, // `[
551, // `]
1370, // `||
168, // `<
53, // `<=
1559, // `,
604, // `>
1435, // `>=
1247, // `.
1490, // `;
111, // `++
50, // `--
152, // `/
385, // `:
872, // ID
161, // INT_LITERAL
485, // STRING_LITERAL
769, // CHAR_LITERAL
513, // "c"
513, // "l"
513, // "a"
513, // "s"
-1, // idChar
-1, // reserved
513, // "e"
637, // "!"
1360, // "="
1616, // "+"
305, // "0"
566, // digit++
961, // digit
513, // "x"
513, // "X"
-1, // hex
1361, // letter
-1, // "_"
513, // "d"
513, // "g"
513, // "m"
513, // "p"
513, // "v"
513, // "y"
513, // "f"
513, // "i"
513, // {"A".."W" "Y".."Z"}
513, // "o"
513, // "r"
513, // "u"
513, // {"j" "q"}
513, // "b"
513, // "h"
513, // "k"
513, // "n"
513, // "t"
513, // "w"
513, // "z"
305, // {"1".."9"}
1304, // white
1602, // {12}
1602, // " "
1602, // {9}
381, // eol
1433, // comment
565, // oneLineComment
26, // blockComment
1572, // "/"
-1, // printable**
-1, // printable
1638, // "*"
-1, // blockCommentContent*
-1, // blockCommentContent
582, // "["
295, // "-"
174, // "<"
182, // "|"
-1, // {"?".."@"}
164, // "&"
1357, // ")"
155, // ","
369, // "]"
-1, // {"#".."$"}
387, // ";"
1173, // ">"
1611, // "{"
978, // "%"
1273, // "("
-1, // "\"
319, // "."
246, // ":"
984, // "}"
-1, // {"^" "`" "~"}
995, // "'"
1482, // '"'
418, // {10}
1458, // {13}
-1, // stringPrintable
-1, // recognizeEscapeChar
-1, // charPrintable
792, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
-1, // escapeChars
-1, // token*
-1, // printable*
466, // digit+
-1, // idChar*
883, // letter+
MIN_REDUCTION+145, // $
-1, // $NT
  }
,
{ // state 1598
136,835, // "/"
139,535, // "*"
  }
,
{ // state 1599
124,1200, // "t"
  }
,
{ // state 1600
128,1304, // white
132,381, // eol
133,1433, // comment
134,565, // oneLineComment
135,26, // blockComment
MIN_REDUCTION+183, // (default reduction)
  }
,
{ // state 1601
MIN_REDUCTION+124, // (default reduction)
  }
,
{ // state 1602
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 1603
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+169, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
972, // `!
312, // `!=
1102, // `%
1560, // `&&
293, // `*
647, // `(
123, // `)
1355, // `{
95, // `}
413, // `-
1444, // `+
67, // `=
1322, // `==
109, // `[
551, // `]
1370, // `||
168, // `<
53, // `<=
1559, // `,
604, // `>
1435, // `>=
1247, // `.
1490, // `;
111, // `++
50, // `--
152, // `/
385, // `:
872, // ID
161, // INT_LITERAL
485, // STRING_LITERAL
769, // CHAR_LITERAL
513, // "c"
513, // "l"
513, // "a"
513, // "s"
-1, // idChar
-1, // reserved
513, // "e"
637, // "!"
1360, // "="
1616, // "+"
305, // "0"
566, // digit++
961, // digit
513, // "x"
513, // "X"
-1, // hex
1361, // letter
-1, // "_"
513, // "d"
513, // "g"
513, // "m"
513, // "p"
513, // "v"
513, // "y"
513, // "f"
513, // "i"
513, // {"A".."W" "Y".."Z"}
513, // "o"
513, // "r"
513, // "u"
513, // {"j" "q"}
513, // "b"
513, // "h"
513, // "k"
513, // "n"
513, // "t"
513, // "w"
513, // "z"
305, // {"1".."9"}
1304, // white
1602, // {12}
1602, // " "
1602, // {9}
381, // eol
1433, // comment
565, // oneLineComment
26, // blockComment
1572, // "/"
-1, // printable**
-1, // printable
1638, // "*"
-1, // blockCommentContent*
-1, // blockCommentContent
582, // "["
295, // "-"
174, // "<"
182, // "|"
-1, // {"?".."@"}
164, // "&"
1357, // ")"
155, // ","
369, // "]"
-1, // {"#".."$"}
387, // ";"
1173, // ">"
1611, // "{"
978, // "%"
1273, // "("
-1, // "\"
319, // "."
246, // ":"
984, // "}"
-1, // {"^" "`" "~"}
995, // "'"
1482, // '"'
418, // {10}
1458, // {13}
-1, // stringPrintable
-1, // recognizeEscapeChar
-1, // charPrintable
792, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
-1, // escapeChars
-1, // token*
-1, // printable*
466, // digit+
-1, // idChar*
883, // letter+
MIN_REDUCTION+169, // $
-1, // $NT
  }
,
{ // state 1604
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+202, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
972, // `!
312, // `!=
1102, // `%
1560, // `&&
293, // `*
647, // `(
123, // `)
1355, // `{
95, // `}
413, // `-
1444, // `+
67, // `=
1322, // `==
109, // `[
551, // `]
1370, // `||
168, // `<
53, // `<=
1559, // `,
604, // `>
1435, // `>=
1247, // `.
1490, // `;
111, // `++
50, // `--
152, // `/
385, // `:
872, // ID
161, // INT_LITERAL
485, // STRING_LITERAL
769, // CHAR_LITERAL
513, // "c"
513, // "l"
513, // "a"
513, // "s"
-1, // idChar
-1, // reserved
513, // "e"
637, // "!"
1360, // "="
1616, // "+"
305, // "0"
566, // digit++
961, // digit
513, // "x"
513, // "X"
-1, // hex
1361, // letter
-1, // "_"
513, // "d"
513, // "g"
513, // "m"
513, // "p"
513, // "v"
513, // "y"
513, // "f"
513, // "i"
513, // {"A".."W" "Y".."Z"}
513, // "o"
513, // "r"
513, // "u"
513, // {"j" "q"}
513, // "b"
513, // "h"
513, // "k"
513, // "n"
513, // "t"
513, // "w"
513, // "z"
305, // {"1".."9"}
1304, // white
1602, // {12}
1602, // " "
1602, // {9}
381, // eol
1433, // comment
565, // oneLineComment
26, // blockComment
1572, // "/"
-1, // printable**
-1, // printable
1638, // "*"
-1, // blockCommentContent*
-1, // blockCommentContent
582, // "["
295, // "-"
174, // "<"
182, // "|"
-1, // {"?".."@"}
164, // "&"
1357, // ")"
155, // ","
369, // "]"
-1, // {"#".."$"}
387, // ";"
1173, // ">"
1611, // "{"
978, // "%"
1273, // "("
-1, // "\"
319, // "."
246, // ":"
984, // "}"
-1, // {"^" "`" "~"}
995, // "'"
1482, // '"'
418, // {10}
1458, // {13}
-1, // stringPrintable
-1, // recognizeEscapeChar
-1, // charPrintable
792, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
-1, // escapeChars
-1, // token*
-1, // printable*
466, // digit+
-1, // idChar*
883, // letter+
MIN_REDUCTION+202, // $
-1, // $NT
  }
,
{ // state 1605
181,MIN_REDUCTION+108, // $NT
  }
,
{ // state 1606
123,830, // "n"
  }
,
{ // state 1607
MIN_REDUCTION+220, // (default reduction)
  }
,
{ // state 1608
0x80000000|1291, // match move
0x80000000|501, // no-match move
0x80000000|1258, // NT-test-match state for reserved
  }
,
{ // state 1609
0x80000000|138, // match move
0x80000000|697, // no-match move
0x80000000|1258, // NT-test-match state for reserved
  }
,
{ // state 1610
89,820, // "c"
  }
,
{ // state 1611
0x80000000|815, // match move
0x80000000|491, // no-match move
// T-test match for "0":
99,
  }
,
{ // state 1612
89,937, // "c"
  }
,
{ // state 1613
0x80000000|495, // match move
0x80000000|395, // no-match move
0x80000000|1258, // NT-test-match state for reserved
  }
,
{ // state 1614
0x80000000|1, // match move
0x80000000|788, // no-match move
0x80000000|36, // NT-test-match state for idChar
  }
,
{ // state 1615
181,MIN_REDUCTION+249, // $NT
  }
,
{ // state 1616
0x80000000|474, // match move
0x80000000|57, // no-match move
// T-test match for "+":
98,
  }
,
{ // state 1617
0x80000000|1410, // match move
0x80000000|965, // no-match move
// T-test match for "0":
99,
  }
,
{ // state 1618
2,1219, // white*
128,1336, // white
129,674, // {12}
130,674, // " "
131,674, // {9}
132,889, // eol
133,775, // comment
134,943, // oneLineComment
135,641, // blockComment
136,1598, // "/"
164,926, // {10}
165,676, // {13}
181,MIN_REDUCTION+215, // $NT
  }
,
{ // state 1619
MIN_REDUCTION+375, // (default reduction)
  }
,
{ // state 1620
MIN_REDUCTION+366, // (default reduction)
  }
,
{ // state 1621
0x80000000|1, // match move
0x80000000|1643, // no-match move
0x80000000|36, // NT-test-match state for idChar
  }
,
{ // state 1622
124,1243, // "t"
  }
,
{ // state 1623
116,1055, // "o"
  }
,
{ // state 1624
136,1289, // "/"
  }
,
{ // state 1625
0x80000000|951, // match move
0x80000000|863, // no-match move
// T-test match for "0":
99,
  }
,
{ // state 1626
128,1304, // white
132,381, // eol
133,1433, // comment
134,565, // oneLineComment
135,26, // blockComment
MIN_REDUCTION+205, // (default reduction)
  }
,
{ // state 1627
MIN_REDUCTION+363, // (default reduction)
  }
,
{ // state 1628
2,1079, // white*
128,1336, // white
129,674, // {12}
130,674, // " "
131,674, // {9}
132,889, // eol
133,775, // comment
134,943, // oneLineComment
135,641, // blockComment
136,1598, // "/"
164,926, // {10}
165,676, // {13}
181,MIN_REDUCTION+269, // $NT
  }
,
{ // state 1629
124,1251, // "t"
  }
,
{ // state 1630
181,MIN_REDUCTION+234, // $NT
  }
,
{ // state 1631
0x80000000|747, // match move
0x80000000|233, // no-match move
// T-test match for "0":
99,
  }
,
{ // state 1632
MIN_REDUCTION+217, // (default reduction)
  }
,
{ // state 1633
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 1634
109,336, // "m"
  }
,
{ // state 1635
92,722, // "s"
124,250, // "t"
  }
,
{ // state 1636
95,1382, // "e"
  }
,
{ // state 1637
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+159, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
972, // `!
312, // `!=
1102, // `%
1560, // `&&
293, // `*
647, // `(
123, // `)
1355, // `{
95, // `}
413, // `-
1444, // `+
67, // `=
1322, // `==
109, // `[
551, // `]
1370, // `||
168, // `<
53, // `<=
1559, // `,
604, // `>
1435, // `>=
1247, // `.
1490, // `;
111, // `++
50, // `--
152, // `/
385, // `:
872, // ID
161, // INT_LITERAL
485, // STRING_LITERAL
769, // CHAR_LITERAL
513, // "c"
513, // "l"
513, // "a"
513, // "s"
-1, // idChar
-1, // reserved
513, // "e"
637, // "!"
1360, // "="
1616, // "+"
305, // "0"
566, // digit++
961, // digit
513, // "x"
513, // "X"
-1, // hex
1361, // letter
-1, // "_"
513, // "d"
513, // "g"
513, // "m"
513, // "p"
513, // "v"
513, // "y"
513, // "f"
513, // "i"
513, // {"A".."W" "Y".."Z"}
513, // "o"
513, // "r"
513, // "u"
513, // {"j" "q"}
513, // "b"
513, // "h"
513, // "k"
513, // "n"
513, // "t"
513, // "w"
513, // "z"
305, // {"1".."9"}
1304, // white
1602, // {12}
1602, // " "
1602, // {9}
381, // eol
1433, // comment
565, // oneLineComment
26, // blockComment
1572, // "/"
-1, // printable**
-1, // printable
1638, // "*"
-1, // blockCommentContent*
-1, // blockCommentContent
582, // "["
295, // "-"
174, // "<"
182, // "|"
-1, // {"?".."@"}
164, // "&"
1357, // ")"
155, // ","
369, // "]"
-1, // {"#".."$"}
387, // ";"
1173, // ">"
1611, // "{"
978, // "%"
1273, // "("
-1, // "\"
319, // "."
246, // ":"
984, // "}"
-1, // {"^" "`" "~"}
995, // "'"
1482, // '"'
418, // {10}
1458, // {13}
-1, // stringPrintable
-1, // recognizeEscapeChar
-1, // charPrintable
792, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
-1, // escapeChars
-1, // token*
-1, // printable*
466, // digit+
-1, // idChar*
883, // letter+
MIN_REDUCTION+159, // $
-1, // $NT
  }
,
{ // state 1638
0x80000000|1411, // match move
0x80000000|25, // no-match move
// T-test match for "0":
99,
  }
,
{ // state 1639
111,1371, // "v"
  }
,
{ // state 1640
MIN_REDUCTION+367, // (default reduction)
  }
,
{ // state 1641
89,216, // "c"
  }
,
{ // state 1642
0x80000000|48, // match move
0x80000000|1122, // no-match move
0x80000000|1258, // NT-test-match state for reserved
  }
,
{ // state 1643
-1, // $$start
-1, // start
554, // white*
-1, // $$0
MIN_REDUCTION+212, // token
1392, // `boolean
1186, // `class
1576, // `extends
798, // `void
1167, // `int
267, // `while
1537, // `if
316, // `else
440, // `for
165, // `break
280, // `this
1368, // `false
1106, // `true
953, // `super
489, // `null
1163, // `return
630, // `instanceof
976, // `new
1330, // `abstract
1402, // `assert
1567, // `byte
27, // `case
833, // `catch
982, // `char
1324, // `const
141, // `continue
115, // `default
1035, // `do
140, // `double
308, // `enum
662, // `final
1021, // `finally
1158, // `float
765, // `goto
1302, // `implements
768, // `import
1514, // `interface
1633, // `long
812, // `native
1233, // `package
245, // `private
339, // `protected
1254, // `public
516, // `short
412, // `static
1491, // `strictfp
832, // `switch
397, // `synchronized
201, // `throw
1108, // `throws
417, // `transient
631, // `try
927, // `volatile
972, // `!
312, // `!=
1102, // `%
1560, // `&&
293, // `*
647, // `(
123, // `)
1355, // `{
95, // `}
413, // `-
1444, // `+
67, // `=
1322, // `==
109, // `[
551, // `]
1370, // `||
168, // `<
53, // `<=
1559, // `,
604, // `>
1435, // `>=
1247, // `.
1490, // `;
111, // `++
50, // `--
152, // `/
385, // `:
-1, // ID
161, // INT_LITERAL
485, // STRING_LITERAL
769, // CHAR_LITERAL
MIN_REDUCTION+212, // "c"
MIN_REDUCTION+212, // "l"
MIN_REDUCTION+212, // "a"
MIN_REDUCTION+212, // "s"
-1, // idChar
-1, // reserved
MIN_REDUCTION+212, // "e"
637, // "!"
1360, // "="
1616, // "+"
MIN_REDUCTION+212, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+212, // "x"
MIN_REDUCTION+212, // "X"
-1, // hex
-1, // letter
-1, // "_"
MIN_REDUCTION+212, // "d"
MIN_REDUCTION+212, // "g"
MIN_REDUCTION+212, // "m"
MIN_REDUCTION+212, // "p"
MIN_REDUCTION+212, // "v"
MIN_REDUCTION+212, // "y"
MIN_REDUCTION+212, // "f"
MIN_REDUCTION+212, // "i"
MIN_REDUCTION+212, // {"A".."W" "Y".."Z"}
MIN_REDUCTION+212, // "o"
MIN_REDUCTION+212, // "r"
MIN_REDUCTION+212, // "u"
MIN_REDUCTION+212, // {"j" "q"}
MIN_REDUCTION+212, // "b"
MIN_REDUCTION+212, // "h"
MIN_REDUCTION+212, // "k"
MIN_REDUCTION+212, // "n"
MIN_REDUCTION+212, // "t"
MIN_REDUCTION+212, // "w"
MIN_REDUCTION+212, // "z"
MIN_REDUCTION+212, // {"1".."9"}
376, // white
1602, // {12}
1602, // " "
1602, // {9}
381, // eol
1433, // comment
565, // oneLineComment
26, // blockComment
1572, // "/"
-1, // printable**
-1, // printable
1638, // "*"
-1, // blockCommentContent*
-1, // blockCommentContent
582, // "["
295, // "-"
174, // "<"
182, // "|"
-1, // {"?".."@"}
164, // "&"
1357, // ")"
155, // ","
369, // "]"
-1, // {"#".."$"}
387, // ";"
1173, // ">"
1611, // "{"
978, // "%"
1273, // "("
-1, // "\"
319, // "."
246, // ":"
984, // "}"
-1, // {"^" "`" "~"}
995, // "'"
1482, // '"'
418, // {10}
1458, // {13}
-1, // stringPrintable
-1, // recognizeEscapeChar
-1, // charPrintable
-1, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
-1, // escapeChars
-1, // token*
-1, // printable*
-1, // digit+
-1, // idChar*
-1, // letter+
MIN_REDUCTION+212, // $
-1, // $NT
  }
,
{ // state 1644
92,685, // "s"
124,1388, // "t"
  }
,
{ // state 1645
124,263, // "t"
  }
,
{ // state 1646
-1, // $$start
447, // start
72, // white*
514, // $$0
666, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
972, // `!
312, // `!=
1102, // `%
1560, // `&&
293, // `*
647, // `(
123, // `)
1355, // `{
95, // `}
413, // `-
1444, // `+
67, // `=
1322, // `==
109, // `[
551, // `]
1370, // `||
168, // `<
53, // `<=
1559, // `,
604, // `>
1435, // `>=
1247, // `.
1490, // `;
111, // `++
50, // `--
152, // `/
385, // `:
872, // ID
161, // INT_LITERAL
485, // STRING_LITERAL
769, // CHAR_LITERAL
513, // "c"
513, // "l"
513, // "a"
513, // "s"
-1, // idChar
-1, // reserved
513, // "e"
637, // "!"
1360, // "="
1616, // "+"
305, // "0"
566, // digit++
961, // digit
513, // "x"
513, // "X"
-1, // hex
1361, // letter
-1, // "_"
513, // "d"
513, // "g"
513, // "m"
513, // "p"
513, // "v"
513, // "y"
513, // "f"
513, // "i"
513, // {"A".."W" "Y".."Z"}
513, // "o"
513, // "r"
513, // "u"
513, // {"j" "q"}
513, // "b"
513, // "h"
513, // "k"
513, // "n"
513, // "t"
513, // "w"
513, // "z"
305, // {"1".."9"}
657, // white
1168, // {12}
1168, // " "
1168, // {9}
1446, // eol
1070, // comment
1306, // oneLineComment
839, // blockComment
1009, // "/"
-1, // printable**
-1, // printable
1638, // "*"
-1, // blockCommentContent*
-1, // blockCommentContent
582, // "["
295, // "-"
174, // "<"
182, // "|"
-1, // {"?".."@"}
164, // "&"
1357, // ")"
155, // ","
369, // "]"
-1, // {"#".."$"}
387, // ";"
1173, // ">"
1611, // "{"
978, // "%"
1273, // "("
-1, // "\"
319, // "."
246, // ":"
984, // "}"
-1, // {"^" "`" "~"}
995, // "'"
1482, // '"'
356, // {10}
688, // {13}
-1, // stringPrintable
-1, // recognizeEscapeChar
-1, // charPrintable
792, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
-1, // escapeChars
1278, // token*
-1, // printable*
466, // digit+
-1, // idChar*
883, // letter+
MIN_REDUCTION+1, // $
-1, // $NT
  }
,
{ // state 1647
0x80000000|1573, // match move
0x80000000|1050, // no-match move
0x80000000|1258, // NT-test-match state for reserved
  }
,
{ // state 1648
4,1037, // token
58,972, // `!
59,312, // `!=
60,1102, // `%
61,1560, // `&&
62,293, // `*
63,647, // `(
64,123, // `)
65,1355, // `{
66,95, // `}
67,413, // `-
68,1444, // `+
69,67, // `=
70,1322, // `==
71,109, // `[
72,551, // `]
73,1370, // `||
74,168, // `<
75,53, // `<=
76,1559, // `,
77,604, // `>
78,1435, // `>=
79,1247, // `.
80,1490, // `;
81,111, // `++
82,50, // `--
83,152, // `/
84,385, // `:
85,872, // ID
86,161, // INT_LITERAL
87,485, // STRING_LITERAL
88,769, // CHAR_LITERAL
99,322, // "0"
105,1361, // letter
169,792, // letter++
179,883, // letter+
  }
,
{ // state 1649
-1, // $$start
-1, // start
371, // white*
-1, // $$0
MIN_REDUCTION+329, // token
1392, // `boolean
1186, // `class
1576, // `extends
798, // `void
1167, // `int
267, // `while
1537, // `if
316, // `else
440, // `for
165, // `break
280, // `this
1368, // `false
1106, // `true
953, // `super
489, // `null
1163, // `return
630, // `instanceof
976, // `new
1330, // `abstract
1402, // `assert
1567, // `byte
27, // `case
833, // `catch
982, // `char
1324, // `const
141, // `continue
115, // `default
1035, // `do
140, // `double
308, // `enum
662, // `final
1021, // `finally
1158, // `float
765, // `goto
1302, // `implements
768, // `import
1514, // `interface
1633, // `long
812, // `native
1233, // `package
245, // `private
339, // `protected
1254, // `public
516, // `short
412, // `static
1491, // `strictfp
832, // `switch
397, // `synchronized
201, // `throw
1108, // `throws
417, // `transient
631, // `try
927, // `volatile
972, // `!
312, // `!=
1102, // `%
1560, // `&&
293, // `*
647, // `(
123, // `)
1355, // `{
95, // `}
413, // `-
1444, // `+
67, // `=
1322, // `==
109, // `[
551, // `]
1370, // `||
168, // `<
53, // `<=
1559, // `,
604, // `>
1435, // `>=
1247, // `.
1490, // `;
111, // `++
50, // `--
152, // `/
385, // `:
-1, // ID
161, // INT_LITERAL
485, // STRING_LITERAL
769, // CHAR_LITERAL
MIN_REDUCTION+329, // "c"
MIN_REDUCTION+329, // "l"
MIN_REDUCTION+329, // "a"
MIN_REDUCTION+329, // "s"
-1, // idChar
-1, // reserved
MIN_REDUCTION+329, // "e"
637, // "!"
1360, // "="
1616, // "+"
MIN_REDUCTION+329, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+329, // "x"
MIN_REDUCTION+329, // "X"
-1, // hex
-1, // letter
-1, // "_"
MIN_REDUCTION+329, // "d"
MIN_REDUCTION+329, // "g"
MIN_REDUCTION+329, // "m"
MIN_REDUCTION+329, // "p"
MIN_REDUCTION+329, // "v"
MIN_REDUCTION+329, // "y"
MIN_REDUCTION+329, // "f"
MIN_REDUCTION+329, // "i"
MIN_REDUCTION+329, // {"A".."W" "Y".."Z"}
MIN_REDUCTION+329, // "o"
MIN_REDUCTION+329, // "r"
MIN_REDUCTION+329, // "u"
MIN_REDUCTION+329, // {"j" "q"}
MIN_REDUCTION+329, // "b"
MIN_REDUCTION+329, // "h"
MIN_REDUCTION+329, // "k"
MIN_REDUCTION+329, // "n"
MIN_REDUCTION+329, // "t"
MIN_REDUCTION+329, // "w"
MIN_REDUCTION+329, // "z"
MIN_REDUCTION+329, // {"1".."9"}
376, // white
1602, // {12}
1602, // " "
1602, // {9}
381, // eol
1433, // comment
565, // oneLineComment
26, // blockComment
1572, // "/"
-1, // printable**
-1, // printable
1638, // "*"
-1, // blockCommentContent*
-1, // blockCommentContent
582, // "["
295, // "-"
174, // "<"
182, // "|"
-1, // {"?".."@"}
164, // "&"
1357, // ")"
155, // ","
369, // "]"
-1, // {"#".."$"}
387, // ";"
1173, // ">"
1611, // "{"
978, // "%"
1273, // "("
-1, // "\"
319, // "."
246, // ":"
984, // "}"
-1, // {"^" "`" "~"}
995, // "'"
1482, // '"'
418, // {10}
1458, // {13}
-1, // stringPrintable
-1, // recognizeEscapeChar
-1, // charPrintable
-1, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
-1, // escapeChars
-1, // token*
-1, // printable*
-1, // digit+
-1, // idChar*
-1, // letter+
MIN_REDUCTION+329, // $
-1, // $NT
  }
,
{ // state 1650
128,1304, // white
132,381, // eol
133,1433, // comment
134,565, // oneLineComment
135,26, // blockComment
MIN_REDUCTION+92, // (default reduction)
  }
,
};
}
public TokenGrammarParseTable(TokenGrammar actionObj) {
  actionObject = actionObj;
  parseTable = new int[1651][];
  int doneSoFar = 0;
  doneSoFar += new Initter1().doInit(doneSoFar);
  doneSoFar += new Initter2().doInit(doneSoFar);
  doneSoFar += new Initter3().doInit(doneSoFar);
  doneSoFar += new Initter4().doInit(doneSoFar);
  doneSoFar += new Initter5().doInit(doneSoFar);
  doneSoFar += new Initter6().doInit(doneSoFar);
  doneSoFar += new Initter7().doInit(doneSoFar);
  doneSoFar += new Initter8().doInit(doneSoFar);
  doneSoFar += new Initter9().doInit(doneSoFar);
}
public int[] getProdTable() { return prodTable; }
private static int[] prodTable = {
// $$start ::= start
(0<<16)+1,
// $$start ::=
(0<<16)+0,
// start ::= white* $$0
(1<<16)+2,
// start ::= white*
(1<<16)+1,
// start ::= $$0
(1<<16)+1,
// token ::= `boolean
(4<<16)+1,
// token ::= `class
(4<<16)+1,
// token ::= `extends
(4<<16)+1,
// token ::= `void
(4<<16)+1,
// token ::= `int
(4<<16)+1,
// token ::= `while
(4<<16)+1,
// token ::= `if
(4<<16)+1,
// token ::= `else
(4<<16)+1,
// token ::= `for
(4<<16)+1,
// token ::= `break
(4<<16)+1,
// token ::= `this
(4<<16)+1,
// token ::= `false
(4<<16)+1,
// token ::= `true
(4<<16)+1,
// token ::= `super
(4<<16)+1,
// token ::= `null
(4<<16)+1,
// token ::= `return
(4<<16)+1,
// token ::= `instanceof
(4<<16)+1,
// token ::= `new
(4<<16)+1,
// token ::= `abstract
(4<<16)+1,
// token ::= `assert
(4<<16)+1,
// token ::= `byte
(4<<16)+1,
// token ::= `case
(4<<16)+1,
// token ::= `catch
(4<<16)+1,
// token ::= `char
(4<<16)+1,
// token ::= `const
(4<<16)+1,
// token ::= `continue
(4<<16)+1,
// token ::= `default
(4<<16)+1,
// token ::= `do
(4<<16)+1,
// token ::= `double
(4<<16)+1,
// token ::= `enum
(4<<16)+1,
// token ::= `final
(4<<16)+1,
// token ::= `finally
(4<<16)+1,
// token ::= `float
(4<<16)+1,
// token ::= `goto
(4<<16)+1,
// token ::= `implements
(4<<16)+1,
// token ::= `import
(4<<16)+1,
// token ::= `interface
(4<<16)+1,
// token ::= `long
(4<<16)+1,
// token ::= `native
(4<<16)+1,
// token ::= `package
(4<<16)+1,
// token ::= `private
(4<<16)+1,
// token ::= `protected
(4<<16)+1,
// token ::= `public
(4<<16)+1,
// token ::= `short
(4<<16)+1,
// token ::= `static
(4<<16)+1,
// token ::= `strictfp
(4<<16)+1,
// token ::= `switch
(4<<16)+1,
// token ::= `synchronized
(4<<16)+1,
// token ::= `throw
(4<<16)+1,
// token ::= `throws
(4<<16)+1,
// token ::= `transient
(4<<16)+1,
// token ::= `try
(4<<16)+1,
// token ::= `volatile
(4<<16)+1,
// token ::= `!
(4<<16)+1,
// token ::= `!=
(4<<16)+1,
// token ::= `%
(4<<16)+1,
// token ::= `&&
(4<<16)+1,
// token ::= `*
(4<<16)+1,
// token ::= `(
(4<<16)+1,
// token ::= `)
(4<<16)+1,
// token ::= `{
(4<<16)+1,
// token ::= `}
(4<<16)+1,
// token ::= `-
(4<<16)+1,
// token ::= `+
(4<<16)+1,
// token ::= `=
(4<<16)+1,
// token ::= `==
(4<<16)+1,
// token ::= `[
(4<<16)+1,
// token ::= `]
(4<<16)+1,
// token ::= `||
(4<<16)+1,
// token ::= `<
(4<<16)+1,
// token ::= `<=
(4<<16)+1,
// token ::= `,
(4<<16)+1,
// token ::= `>
(4<<16)+1,
// token ::= `>=
(4<<16)+1,
// token ::= `.
(4<<16)+1,
// token ::= `;
(4<<16)+1,
// token ::= `++
(4<<16)+1,
// token ::= `--
(4<<16)+1,
// token ::= `/
(4<<16)+1,
// token ::= `:
(4<<16)+1,
// token ::= ID
(4<<16)+1,
// token ::= INT_LITERAL
(4<<16)+1,
// token ::= STRING_LITERAL
(4<<16)+1,
// token ::= CHAR_LITERAL
(4<<16)+1,
// `class ::= "c" "l" "a" "s" "s" !idChar white*
(6<<16)+6,
// `class ::= "c" "l" "a" "s" "s" !idChar
(6<<16)+5,
// reserved ::= `class
(94<<16)+1,
// `else ::= "e" "l" "s" "e" !idChar white*
(12<<16)+5,
// `else ::= "e" "l" "s" "e" !idChar
(12<<16)+4,
// reserved ::= `else
(94<<16)+1,
// `!= ::= "!" "=" white*
(59<<16)+3,
// `!= ::= "!" "="
(59<<16)+2,
// `+ ::= "+" !"+" white*
(68<<16)+2,
// `+ ::= "+" !"+"
(68<<16)+1,
// INT_LITERAL ::= !"0" digit++ white*
(86<<16)+2,
// INT_LITERAL ::= !"0" digit++
(86<<16)+1,
// INT_LITERAL ::= "0" !digit !{"X" "x"} white*
(86<<16)+2,
// INT_LITERAL ::= "0" !digit !{"X" "x"}
(86<<16)+1,
// hex ::= "x"
(104<<16)+1,
// hex ::= "X"
(104<<16)+1,
// INT_LITERAL ::= "0" hex digit++
(86<<16)+3,
// INT_LITERAL ::= "0" digit++ white*
(86<<16)+3,
// INT_LITERAL ::= "0" digit++
(86<<16)+2,
// idChar ::= letter
(93<<16)+1,
// idChar ::= digit
(93<<16)+1,
// idChar ::= "_"
(93<<16)+1,
// letter ::= {"A".."Z" "a".."z"}
(105<<16)+1,
// digit ::= {"0".."9"}
(101<<16)+1,
// white ::= {9 12 " "}
(128<<16)+1,
// white ::= eol
(128<<16)+1,
// white ::= comment
(128<<16)+1,
// comment ::= oneLineComment
(133<<16)+1,
// comment ::= blockComment
(133<<16)+1,
// oneLineComment ::= "/" "/" printable** eol
(134<<16)+4,
// oneLineComment ::= "/" "/" !printable eol
(134<<16)+3,
// blockComment ::= "/" "*" blockCommentContent* "*" "/"
(135<<16)+5,
// blockComment ::= "/" "*" "*" "/"
(135<<16)+4,
// blockCommentContent ::= eol
(141<<16)+1,
// blockCommentContent ::= {9 " "..")" "+".."~"}
(141<<16)+1,
// blockCommentContent ::= "*" !"/"
(141<<16)+1,
// eol ::= {10}
(132<<16)+1,
// eol ::= {13} {10}
(132<<16)+2,
// eol ::= {13} !10
(132<<16)+1,
// printable ::= {" ".."~"}
(138<<16)+1,
// stringPrintable ::= {" ".."!"}
(166<<16)+1,
// stringPrintable ::= {"#".."["}
(166<<16)+1,
// stringPrintable ::= {"]".."~"}
(166<<16)+1,
// stringPrintable ::= recognizeEscapeChar
(166<<16)+1,
// charPrintable ::= {" ".."&"}
(168<<16)+1,
// charPrintable ::= {"(".."["}
(168<<16)+1,
// charPrintable ::= {"]".."~"}
(168<<16)+1,
// charPrintable ::= recognizeEscapeChar
(168<<16)+1,
// `! ::= "!" !"=" white*
(58<<16)+2,
// `! ::= "!" !"="
(58<<16)+1,
// `% ::= "%" white*
(60<<16)+2,
// `% ::= "%"
(60<<16)+1,
// `&& ::= "&" "&" white*
(61<<16)+3,
// `&& ::= "&" "&"
(61<<16)+2,
// `* ::= "*" white*
(62<<16)+2,
// `* ::= "*"
(62<<16)+1,
// `( ::= "(" white*
(63<<16)+2,
// `( ::= "("
(63<<16)+1,
// `) ::= ")" white*
(64<<16)+2,
// `) ::= ")"
(64<<16)+1,
// `{ ::= "{" white*
(65<<16)+2,
// `{ ::= "{"
(65<<16)+1,
// `} ::= "}" white*
(66<<16)+2,
// `} ::= "}"
(66<<16)+1,
// `- ::= "-" !"-" white*
(67<<16)+2,
// `- ::= "-" !"-"
(67<<16)+1,
// `= ::= "=" !"=" white*
(69<<16)+2,
// `= ::= "=" !"="
(69<<16)+1,
// `== ::= "=" "=" white*
(70<<16)+3,
// `== ::= "=" "="
(70<<16)+2,
// `[ ::= "[" white*
(71<<16)+2,
// `[ ::= "["
(71<<16)+1,
// `] ::= "]" white*
(72<<16)+2,
// `] ::= "]"
(72<<16)+1,
// `|| ::= "|" "|" white*
(73<<16)+3,
// `|| ::= "|" "|"
(73<<16)+2,
// `< ::= "<" !"=" white*
(74<<16)+2,
// `< ::= "<" !"="
(74<<16)+1,
// `<= ::= "<" "=" white*
(75<<16)+3,
// `<= ::= "<" "="
(75<<16)+2,
// `, ::= "," white*
(76<<16)+2,
// `, ::= ","
(76<<16)+1,
// `> ::= ">" !"=" white*
(77<<16)+2,
// `> ::= ">" !"="
(77<<16)+1,
// `>= ::= ">" "=" white*
(78<<16)+3,
// `>= ::= ">" "="
(78<<16)+2,
// `: ::= ":" white*
(84<<16)+2,
// `: ::= ":"
(84<<16)+1,
// `. ::= "." white*
(79<<16)+2,
// `. ::= "."
(79<<16)+1,
// `; ::= ";" white*
(80<<16)+2,
// `; ::= ";"
(80<<16)+1,
// `++ ::= "+" "+" white*
(81<<16)+3,
// `++ ::= "+" "+"
(81<<16)+2,
// `-- ::= "-" "-" white*
(82<<16)+3,
// `-- ::= "-" "-"
(82<<16)+2,
// `/ ::= "/" !{"*" "/"} white*
(83<<16)+2,
// `/ ::= "/" !{"*" "/"}
(83<<16)+1,
// `boolean ::= "b" "o" "o" "l" "e" "a" "n" !idChar white*
(5<<16)+8,
// `boolean ::= "b" "o" "o" "l" "e" "a" "n" !idChar
(5<<16)+7,
// reserved ::= `boolean
(94<<16)+1,
// `extends ::= "e" "x" "t" "e" "n" "d" "s" !idChar white*
(7<<16)+8,
// `extends ::= "e" "x" "t" "e" "n" "d" "s" !idChar
(7<<16)+7,
// reserved ::= `extends
(94<<16)+1,
// `void ::= "v" "o" "i" "d" !idChar white*
(8<<16)+5,
// `void ::= "v" "o" "i" "d" !idChar
(8<<16)+4,
// reserved ::= `void
(94<<16)+1,
// `int ::= "i" "n" "t" !idChar white*
(9<<16)+4,
// `int ::= "i" "n" "t" !idChar
(9<<16)+3,
// reserved ::= `int
(94<<16)+1,
// `while ::= "w" "h" "i" "l" "e" !idChar white*
(10<<16)+6,
// `while ::= "w" "h" "i" "l" "e" !idChar
(10<<16)+5,
// reserved ::= `while
(94<<16)+1,
// `if ::= "i" "f" !idChar white*
(11<<16)+3,
// `if ::= "i" "f" !idChar
(11<<16)+2,
// reserved ::= `if
(94<<16)+1,
// `for ::= "f" "o" "r" !idChar white*
(13<<16)+4,
// `for ::= "f" "o" "r" !idChar
(13<<16)+3,
// reserved ::= `for
(94<<16)+1,
// `break ::= "b" "r" "e" "a" "k" !idChar white*
(14<<16)+6,
// `break ::= "b" "r" "e" "a" "k" !idChar
(14<<16)+5,
// reserved ::= `break
(94<<16)+1,
// `this ::= "t" "h" "i" "s" !idChar white*
(15<<16)+5,
// `this ::= "t" "h" "i" "s" !idChar
(15<<16)+4,
// reserved ::= `this
(94<<16)+1,
// `false ::= "f" "a" "l" "s" "e" !idChar white*
(16<<16)+6,
// `false ::= "f" "a" "l" "s" "e" !idChar
(16<<16)+5,
// reserved ::= `false
(94<<16)+1,
// `true ::= "t" "r" "u" "e" !idChar white*
(17<<16)+5,
// `true ::= "t" "r" "u" "e" !idChar
(17<<16)+4,
// reserved ::= `true
(94<<16)+1,
// `super ::= "s" "u" "p" "e" "r" !idChar white*
(18<<16)+6,
// `super ::= "s" "u" "p" "e" "r" !idChar
(18<<16)+5,
// reserved ::= `super
(94<<16)+1,
// `null ::= "n" "u" "l" "l" !idChar white*
(19<<16)+5,
// `null ::= "n" "u" "l" "l" !idChar
(19<<16)+4,
// reserved ::= `null
(94<<16)+1,
// `return ::= "r" "e" "t" "u" "r" "n" !idChar white*
(20<<16)+7,
// `return ::= "r" "e" "t" "u" "r" "n" !idChar
(20<<16)+6,
// reserved ::= `return
(94<<16)+1,
// `instanceof ::= "i" "n" "s" "t" "a" "n" "c" "e" "o" "f" !idChar white*
(21<<16)+11,
// `instanceof ::= "i" "n" "s" "t" "a" "n" "c" "e" "o" "f" !idChar
(21<<16)+10,
// reserved ::= `instanceof
(94<<16)+1,
// `new ::= "n" "e" "w" !idChar white*
(22<<16)+4,
// `new ::= "n" "e" "w" !idChar
(22<<16)+3,
// reserved ::= `new
(94<<16)+1,
// `abstract ::= "a" "b" "s" "t" "r" "a" "c" "t" !idChar white*
(23<<16)+9,
// `abstract ::= "a" "b" "s" "t" "r" "a" "c" "t" !idChar
(23<<16)+8,
// reserved ::= `abstract
(94<<16)+1,
// `assert ::= "a" "s" "s" "e" "r" "t" !idChar white*
(24<<16)+7,
// `assert ::= "a" "s" "s" "e" "r" "t" !idChar
(24<<16)+6,
// reserved ::= `assert
(94<<16)+1,
// `byte ::= "b" "y" "t" "e" !idChar white*
(25<<16)+5,
// `byte ::= "b" "y" "t" "e" !idChar
(25<<16)+4,
// reserved ::= `byte
(94<<16)+1,
// `case ::= "c" "a" "s" "e" !idChar white*
(26<<16)+5,
// `case ::= "c" "a" "s" "e" !idChar
(26<<16)+4,
// reserved ::= `case
(94<<16)+1,
// `catch ::= "c" "a" "t" "c" "h" !idChar white*
(27<<16)+6,
// `catch ::= "c" "a" "t" "c" "h" !idChar
(27<<16)+5,
// reserved ::= `catch
(94<<16)+1,
// `char ::= "c" "h" "a" "r" !idChar white*
(28<<16)+5,
// `char ::= "c" "h" "a" "r" !idChar
(28<<16)+4,
// reserved ::= `char
(94<<16)+1,
// `const ::= "c" "o" "n" "s" "t" !idChar white*
(29<<16)+6,
// `const ::= "c" "o" "n" "s" "t" !idChar
(29<<16)+5,
// reserved ::= `const
(94<<16)+1,
// `continue ::= "c" "o" "n" "t" "i" "n" "u" "e" !idChar white*
(30<<16)+9,
// `continue ::= "c" "o" "n" "t" "i" "n" "u" "e" !idChar
(30<<16)+8,
// reserved ::= `continue
(94<<16)+1,
// `default ::= "d" "e" "f" "a" "u" "l" "t" !idChar white*
(31<<16)+8,
// `default ::= "d" "e" "f" "a" "u" "l" "t" !idChar
(31<<16)+7,
// reserved ::= `default
(94<<16)+1,
// `do ::= "d" "o" !idChar white*
(32<<16)+3,
// `do ::= "d" "o" !idChar
(32<<16)+2,
// reserved ::= `do
(94<<16)+1,
// `double ::= "d" "o" "u" "b" "l" "e" !idChar white*
(33<<16)+7,
// `double ::= "d" "o" "u" "b" "l" "e" !idChar
(33<<16)+6,
// reserved ::= `double
(94<<16)+1,
// `enum ::= "e" "n" "u" "m" !idChar white*
(34<<16)+5,
// `enum ::= "e" "n" "u" "m" !idChar
(34<<16)+4,
// reserved ::= `enum
(94<<16)+1,
// `final ::= "f" "i" "n" "a" "l" !idChar white*
(35<<16)+6,
// `final ::= "f" "i" "n" "a" "l" !idChar
(35<<16)+5,
// reserved ::= `final
(94<<16)+1,
// `finally ::= "f" "i" "n" "a" "l" "l" "y" !idChar white*
(36<<16)+8,
// `finally ::= "f" "i" "n" "a" "l" "l" "y" !idChar
(36<<16)+7,
// reserved ::= `finally
(94<<16)+1,
// `float ::= "f" "l" "o" "a" "t" !idChar white*
(37<<16)+6,
// `float ::= "f" "l" "o" "a" "t" !idChar
(37<<16)+5,
// reserved ::= `float
(94<<16)+1,
// `goto ::= "g" "o" "t" "o" !idChar white*
(38<<16)+5,
// `goto ::= "g" "o" "t" "o" !idChar
(38<<16)+4,
// reserved ::= `goto
(94<<16)+1,
// `implements ::= "i" "m" "p" "l" "e" "m" "e" "n" "t" "s" !idChar white*
(39<<16)+11,
// `implements ::= "i" "m" "p" "l" "e" "m" "e" "n" "t" "s" !idChar
(39<<16)+10,
// reserved ::= `implements
(94<<16)+1,
// `import ::= "i" "m" "p" "o" "r" "t" !idChar white*
(40<<16)+7,
// `import ::= "i" "m" "p" "o" "r" "t" !idChar
(40<<16)+6,
// reserved ::= `import
(94<<16)+1,
// `interface ::= "i" "n" "t" "e" "r" "f" "a" "c" "e" !idChar white*
(41<<16)+10,
// `interface ::= "i" "n" "t" "e" "r" "f" "a" "c" "e" !idChar
(41<<16)+9,
// reserved ::= `interface
(94<<16)+1,
// `long ::= "l" "o" "n" "g" !idChar white*
(42<<16)+5,
// `long ::= "l" "o" "n" "g" !idChar
(42<<16)+4,
// reserved ::= `long
(94<<16)+1,
// `native ::= "n" "a" "t" "i" "v" "e" !idChar white*
(43<<16)+7,
// `native ::= "n" "a" "t" "i" "v" "e" !idChar
(43<<16)+6,
// reserved ::= `native
(94<<16)+1,
// `package ::= "p" "a" "c" "k" "a" "g" "e" !idChar white*
(44<<16)+8,
// `package ::= "p" "a" "c" "k" "a" "g" "e" !idChar
(44<<16)+7,
// reserved ::= `package
(94<<16)+1,
// `private ::= "p" "r" "i" "v" "a" "t" "e" !idChar white*
(45<<16)+8,
// `private ::= "p" "r" "i" "v" "a" "t" "e" !idChar
(45<<16)+7,
// reserved ::= `private
(94<<16)+1,
// `protected ::= "p" "r" "o" "t" "e" "c" "t" "e" "d" !idChar white*
(46<<16)+10,
// `protected ::= "p" "r" "o" "t" "e" "c" "t" "e" "d" !idChar
(46<<16)+9,
// reserved ::= `protected
(94<<16)+1,
// `public ::= "p" "u" "b" "l" "i" "c" !idChar white*
(47<<16)+7,
// `public ::= "p" "u" "b" "l" "i" "c" !idChar
(47<<16)+6,
// reserved ::= `public
(94<<16)+1,
// `short ::= "s" "h" "o" "r" "t" !idChar white*
(48<<16)+6,
// `short ::= "s" "h" "o" "r" "t" !idChar
(48<<16)+5,
// reserved ::= `short
(94<<16)+1,
// `static ::= "s" "t" "a" "t" "i" "c" !idChar white*
(49<<16)+7,
// `static ::= "s" "t" "a" "t" "i" "c" !idChar
(49<<16)+6,
// reserved ::= `static
(94<<16)+1,
// `strictfp ::= "s" "t" "r" "i" "c" "t" "f" "p" !idChar white*
(50<<16)+9,
// `strictfp ::= "s" "t" "r" "i" "c" "t" "f" "p" !idChar
(50<<16)+8,
// reserved ::= `strictfp
(94<<16)+1,
// `switch ::= "s" "w" "i" "t" "c" "h" !idChar white*
(51<<16)+7,
// `switch ::= "s" "w" "i" "t" "c" "h" !idChar
(51<<16)+6,
// reserved ::= `switch
(94<<16)+1,
// `synchronized ::= "s" "y" "n" "c" "h" "r" "o" "n" "i" "z" "e" "d" !idChar white*
(52<<16)+13,
// `synchronized ::= "s" "y" "n" "c" "h" "r" "o" "n" "i" "z" "e" "d" !idChar
(52<<16)+12,
// reserved ::= `synchronized
(94<<16)+1,
// `throw ::= "t" "h" "r" "o" "w" !idChar white*
(53<<16)+6,
// `throw ::= "t" "h" "r" "o" "w" !idChar
(53<<16)+5,
// reserved ::= `throw
(94<<16)+1,
// `throws ::= "t" "h" "r" "o" "w" "s" !idChar white*
(54<<16)+7,
// `throws ::= "t" "h" "r" "o" "w" "s" !idChar
(54<<16)+6,
// reserved ::= `throws
(94<<16)+1,
// `transient ::= "t" "r" "a" "n" "s" "i" "e" "n" "t" !idChar white*
(55<<16)+10,
// `transient ::= "t" "r" "a" "n" "s" "i" "e" "n" "t" !idChar
(55<<16)+9,
// reserved ::= `transient
(94<<16)+1,
// `try ::= "t" "r" "y" !idChar white*
(56<<16)+4,
// `try ::= "t" "r" "y" !idChar
(56<<16)+3,
// reserved ::= `try
(94<<16)+1,
// `volatile ::= "v" "o" "l" "a" "t" "i" "l" "e" !idChar white*
(57<<16)+9,
// `volatile ::= "v" "o" "l" "a" "t" "i" "l" "e" !idChar
(57<<16)+8,
// reserved ::= `volatile
(94<<16)+1,
// ID ::= !reserved letter++ idChar** $$1
(85<<16)+3,
// ID ::= !reserved letter++ idChar**
(85<<16)+2,
// ID ::= !reserved letter++ !idChar $$1
(85<<16)+2,
// ID ::= !reserved letter++ !idChar
(85<<16)+1,
// STRING_LITERAL ::= '"' stringPrintable* $$2
(87<<16)+3,
// STRING_LITERAL ::= '"' $$2
(87<<16)+2,
// CHAR_LITERAL ::= "'" charPrintable "'" white*
(88<<16)+4,
// CHAR_LITERAL ::= "'" charPrintable "'"
(88<<16)+3,
// escapeChars ::= "\" "\"
(174<<16)+2,
// escapeChars ::= "\" '"'
(174<<16)+2,
// escapeChars ::= "\" "'"
(174<<16)+2,
// escapeChars ::= "\" "n"
(174<<16)+2,
// escapeChars ::= "\" "t"
(174<<16)+2,
// escapeChars ::= "\" "f"
(174<<16)+2,
// escapeChars ::= "\" "r"
(174<<16)+2,
// recognizeEscapeChar ::= escapeChars
(167<<16)+1,
// token* ::= token* token
(175<<16)+2,
// token* ::= token
(175<<16)+1,
// printable** ::= printable* !printable
(137<<16)+1,
// digit++ ::= digit+ !digit
(100<<16)+1,
// idChar** ::= idChar* !idChar
(170<<16)+1,
// white* ::= white* white
(2<<16)+2,
// white* ::= white
(2<<16)+1,
// blockCommentContent* ::= blockCommentContent* blockCommentContent
(140<<16)+2,
// blockCommentContent* ::= blockCommentContent
(140<<16)+1,
// stringPrintable* ::= stringPrintable* stringPrintable
(172<<16)+2,
// stringPrintable* ::= stringPrintable
(172<<16)+1,
// letter++ ::= letter+ !letter
(169<<16)+1,
// digit+ ::= digit
(177<<16)+1,
// digit+ ::= digit+ digit
(177<<16)+2,
// letter+ ::= letter
(179<<16)+1,
// letter+ ::= letter+ letter
(179<<16)+2,
// printable* ::= printable* printable
(176<<16)+2,
// printable* ::= printable
(176<<16)+1,
// idChar* ::= idChar* idChar
(178<<16)+2,
// idChar* ::= idChar
(178<<16)+1,
// $$0 ::= token*
(3<<16)+1,
// $$1 ::= white*
(171<<16)+1,
// $$2 ::= '"' white*
(173<<16)+2,
// $$2 ::= '"'
(173<<16)+1,
};
public int[] getCharMapTable() { return charMapTable; }
private static int[] charMapTable = {
-1, // 0
-1, // 1
-1, // 2
-1, // 3
-1, // 4
-1, // 5
-1, // 6
-1, // 7
-1, // 8
131, // 9
164, // 10
-1, // 11
129, // 12
165, // 13
-1, // 14
-1, // 15
-1, // 16
-1, // 17
-1, // 18
-1, // 19
-1, // 20
-1, // 21
-1, // 22
-1, // 23
-1, // 24
-1, // 25
-1, // 26
-1, // 27
-1, // 28
-1, // 29
-1, // 30
-1, // 31
130, // " "
96, // "!"
163, // '"'
151, // "#"
151, // "$"
155, // "%"
147, // "&"
162, // "'"
156, // "("
148, // ")"
139, // "*"
98, // "+"
149, // ","
143, // "-"
158, // "."
136, // "/"
99, // "0"
127, // "1"
127, // "2"
127, // "3"
127, // "4"
127, // "5"
127, // "6"
127, // "7"
127, // "8"
127, // "9"
159, // ":"
152, // ";"
144, // "<"
97, // "="
153, // ">"
146, // "?"
146, // "@"
115, // "A"
115, // "B"
115, // "C"
115, // "D"
115, // "E"
115, // "F"
115, // "G"
115, // "H"
115, // "I"
115, // "J"
115, // "K"
115, // "L"
115, // "M"
115, // "N"
115, // "O"
115, // "P"
115, // "Q"
115, // "R"
115, // "S"
115, // "T"
115, // "U"
115, // "V"
115, // "W"
103, // "X"
115, // "Y"
115, // "Z"
142, // "["
157, // "\"
150, // "]"
161, // "^"
106, // "_"
161, // "`"
91, // "a"
120, // "b"
89, // "c"
107, // "d"
95, // "e"
113, // "f"
108, // "g"
121, // "h"
114, // "i"
119, // "j"
122, // "k"
90, // "l"
109, // "m"
123, // "n"
116, // "o"
110, // "p"
119, // "q"
117, // "r"
92, // "s"
124, // "t"
118, // "u"
111, // "v"
125, // "w"
102, // "x"
112, // "y"
126, // "z"
154, // "{"
145, // "|"
160, // "}"
161, // "~"
-1, // 127
-1, // 128
-1, // 129
-1, // 130
-1, // 131
-1, // 132
-1, // 133
-1, // 134
-1, // 135
-1, // 136
-1, // 137
-1, // 138
-1, // 139
-1, // 140
-1, // 141
-1, // 142
-1, // 143
-1, // 144
-1, // 145
-1, // 146
-1, // 147
-1, // 148
-1, // 149
-1, // 150
-1, // 151
-1, // 152
-1, // 153
-1, // 154
-1, // 155
-1, // 156
-1, // 157
-1, // 158
-1, // 159
-1, // 160
-1, // 161
-1, // 162
-1, // 163
-1, // 164
-1, // 165
-1, // 166
-1, // 167
-1, // 168
-1, // 169
-1, // 170
-1, // 171
-1, // 172
-1, // 173
-1, // 174
-1, // 175
-1, // 176
-1, // 177
-1, // 178
-1, // 179
-1, // 180
-1, // 181
-1, // 182
-1, // 183
-1, // 184
-1, // 185
-1, // 186
-1, // 187
-1, // 188
-1, // 189
-1, // 190
-1, // 191
-1, // 192
-1, // 193
-1, // 194
-1, // 195
-1, // 196
-1, // 197
-1, // 198
-1, // 199
-1, // 200
-1, // 201
-1, // 202
-1, // 203
-1, // 204
-1, // 205
-1, // 206
-1, // 207
-1, // 208
-1, // 209
-1, // 210
-1, // 211
-1, // 212
-1, // 213
-1, // 214
-1, // 215
-1, // 216
-1, // 217
-1, // 218
-1, // 219
-1, // 220
-1, // 221
-1, // 222
-1, // 223
-1, // 224
-1, // 225
-1, // 226
-1, // 227
-1, // 228
-1, // 229
-1, // 230
-1, // 231
-1, // 232
-1, // 233
-1, // 234
-1, // 235
-1, // 236
-1, // 237
-1, // 238
-1, // 239
-1, // 240
-1, // 241
-1, // 242
-1, // 243
-1, // 244
-1, // 245
-1, // 246
-1, // 247
-1, // 248
-1, // 249
-1, // 250
-1, // 251
-1, // 252
-1, // 253
-1, // 254
-1, // 255
};
public String[] getActionProdNameTable() { return actionProdNameTable; }
private String[] actionProdNameTable = {
"", // 0
"", // 1
"", // 2
"", // 3
"", // 4
"", // 5
"", // 6
"", // 7
"", // 8
"", // 9
"", // 10
"", // 11
"", // 12
"", // 13
"", // 14
"", // 15
"", // 16
"", // 17
"", // 18
"", // 19
"", // 20
"", // 21
"", // 22
"", // 23
"", // 24
"", // 25
"", // 26
"", // 27
"", // 28
"", // 29
"", // 30
"", // 31
"", // 32
"", // 33
"", // 34
"", // 35
"", // 36
"", // 37
"", // 38
"", // 39
"", // 40
"", // 41
"", // 42
"", // 43
"", // 44
"", // 45
"", // 46
"", // 47
"", // 48
"", // 49
"", // 50
"", // 51
"", // 52
"", // 53
"", // 54
"", // 55
"", // 56
"", // 57
"", // 58
"", // 59
"", // 60
"", // 61
"", // 62
"", // 63
"", // 64
"", // 65
"", // 66
"", // 67
"", // 68
"", // 69
"", // 70
"", // 71
"", // 72
"", // 73
"", // 74
"", // 75
"", // 76
"", // 77
"", // 78
"", // 79
"", // 80
"", // 81
"", // 82
"", // 83
"", // 84
"", // 85
"", // 86
"", // 87
"", // 88
"", // 89
"", // 90
"", // 91
"", // 92
"", // 93
"", // 94
"", // 95
"", // 96
"", // 97
"", // 98
"", // 99
"", // 100
"", // 101
"", // 102
"", // 103
"", // 104
"", // 105
"", // 106
"", // 107
"", // 108
"", // 109
"", // 110
"", // 111
"", // 112
"", // 113
"", // 114
"", // 115
"", // 116
"", // 117
"", // 118
"", // 119
"", // 120
"", // 121
"", // 122
"", // 123
"", // 124
"", // 125
"", // 126
"", // 127
"", // 128
"", // 129
"", // 130
"", // 131
"", // 132
"", // 133
"", // 134
"", // 135
"", // 136
"", // 137
"", // 138
"", // 139
"", // 140
"", // 141
"", // 142
"", // 143
"", // 144
"", // 145
"", // 146
"", // 147
"", // 148
"", // 149
"", // 150
"", // 151
"", // 152
"", // 153
"", // 154
"", // 155
"", // 156
"", // 157
"", // 158
"", // 159
"", // 160
"", // 161
"", // 162
"", // 163
"", // 164
"", // 165
"", // 166
"", // 167
"", // 168
"", // 169
"", // 170
"", // 171
"", // 172
"", // 173
"", // 174
"", // 175
"", // 176
"", // 177
"", // 178
"", // 179
"", // 180
"", // 181
"", // 182
"", // 183
"", // 184
"", // 185
"", // 186
"", // 187
"", // 188
"", // 189
"", // 190
"", // 191
"", // 192
"", // 193
"", // 194
"", // 195
"", // 196
"", // 197
"", // 198
"", // 199
"", // 200
"", // 201
"", // 202
"", // 203
"", // 204
"", // 205
"", // 206
"", // 207
"", // 208
"", // 209
"", // 210
"", // 211
"", // 212
"", // 213
"", // 214
"", // 215
"", // 216
"", // 217
"", // 218
"", // 219
"", // 220
"", // 221
"", // 222
"", // 223
"", // 224
"", // 225
"", // 226
"", // 227
"", // 228
"", // 229
"", // 230
"", // 231
"", // 232
"", // 233
"", // 234
"", // 235
"", // 236
"", // 237
"", // 238
"", // 239
"", // 240
"", // 241
"", // 242
"", // 243
"", // 244
"", // 245
"", // 246
"", // 247
"", // 248
"", // 249
"", // 250
"", // 251
"", // 252
"", // 253
"", // 254
"", // 255
"", // 256
"", // 257
"", // 258
"", // 259
"", // 260
"", // 261
"", // 262
"", // 263
"", // 264
"", // 265
"", // 266
"", // 267
"", // 268
"", // 269
"", // 270
"", // 271
"", // 272
"", // 273
"", // 274
"", // 275
"", // 276
"", // 277
"", // 278
"", // 279
"", // 280
"", // 281
"", // 282
"", // 283
"", // 284
"", // 285
"", // 286
"", // 287
"", // 288
"", // 289
"", // 290
"", // 291
"", // 292
"", // 293
"", // 294
"", // 295
"", // 296
"", // 297
"", // 298
"", // 299
"", // 300
"", // 301
"", // 302
"", // 303
"", // 304
"", // 305
"", // 306
"", // 307
"", // 308
"", // 309
"", // 310
"", // 311
"", // 312
"", // 313
"", // 314
"", // 315
"", // 316
"", // 317
"", // 318
"", // 319
"", // 320
"", // 321
"", // 322
"", // 323
"", // 324
"", // 325
"", // 326
"", // 327
"", // 328
"", // 329
"", // 330
"", // 331
"", // 332
"", // 333
"", // 334
"", // 335
"", // 336
"", // 337
"", // 338
"", // 339
"", // 340
"", // 341
"", // 342
"", // 343
"", // 344
"", // 345
"", // 346
"", // 347
"", // 348
"", // 349
"", // 350
"", // 351
"", // 352
"", // 353
"", // 354
"", // 355
"token* ::= token* token", // 356
"token* ::= token* token", // 357
"printable** ::= printable* !printable", // 358
"digit++ ::= digit+ !digit", // 359
"idChar** ::= idChar* !idChar", // 360
"white* ::= white* white", // 361
"white* ::= white* white", // 362
"blockCommentContent* ::= blockCommentContent* blockCommentContent", // 363
"blockCommentContent* ::= blockCommentContent* blockCommentContent", // 364
"stringPrintable* ::= stringPrintable* stringPrintable", // 365
"stringPrintable* ::= stringPrintable* stringPrintable", // 366
"letter++ ::= letter+ !letter", // 367
"digit+ ::= digit", // 368
"digit+ ::= digit+ digit", // 369
"letter+ ::= letter", // 370
"letter+ ::= letter+ letter", // 371
"printable* ::= printable* printable", // 372
"printable* ::= printable* printable", // 373
"idChar* ::= idChar* idChar", // 374
"idChar* ::= idChar* idChar", // 375
"", // 376
"", // 377
"", // 378
"", // 379
};
public int[][] getActionTable() { return actionTable; }
private int[][] actionTable = {
    { // 0: $$start ::= start @pass
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 1: $$start ::= [start] @pass
      ((3<<5)|0x6)/*nullProductionAction:3*/,
    },
    { // 2: start ::= white* $$0 @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 3: start ::= white* [token*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 4: start ::= [white*] $$0 @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
    },
    { // 5: token ::= [#] `boolean @sawBoolean(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((0<<5)|0x5)/*methodCall:0*/,
    },
    { // 6: token ::= [#] `class @sawClass(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((1<<5)|0x5)/*methodCall:1*/,
    },
    { // 7: token ::= [#] `extends @sawExtends(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((2<<5)|0x5)/*methodCall:2*/,
    },
    { // 8: token ::= [#] `void @sawVoid(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((3<<5)|0x5)/*methodCall:3*/,
    },
    { // 9: token ::= [#] `int @sawInt(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((4<<5)|0x5)/*methodCall:4*/,
    },
    { // 10: token ::= [#] `while @sawWhile(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((5<<5)|0x5)/*methodCall:5*/,
    },
    { // 11: token ::= [#] `if @sawIf(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((6<<5)|0x5)/*methodCall:6*/,
    },
    { // 12: token ::= [#] `else @sawElse(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((7<<5)|0x5)/*methodCall:7*/,
    },
    { // 13: token ::= [#] `for @sawFor(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((8<<5)|0x5)/*methodCall:8*/,
    },
    { // 14: token ::= [#] `break @sawBreak(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((9<<5)|0x5)/*methodCall:9*/,
    },
    { // 15: token ::= [#] `this @sawThis(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((10<<5)|0x5)/*methodCall:10*/,
    },
    { // 16: token ::= [#] `false @sawFalse(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((11<<5)|0x5)/*methodCall:11*/,
    },
    { // 17: token ::= [#] `true @sawTrue(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((12<<5)|0x5)/*methodCall:12*/,
    },
    { // 18: token ::= [#] `super @sawSuper(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((13<<5)|0x5)/*methodCall:13*/,
    },
    { // 19: token ::= [#] `null @sawNull(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((14<<5)|0x5)/*methodCall:14*/,
    },
    { // 20: token ::= [#] `return @sawReturn(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((15<<5)|0x5)/*methodCall:15*/,
    },
    { // 21: token ::= [#] `instanceof @sawInstanceof(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((16<<5)|0x5)/*methodCall:16*/,
    },
    { // 22: token ::= [#] `new @sawNew(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((17<<5)|0x5)/*methodCall:17*/,
    },
    { // 23: token ::= [#] `abstract @sawAbstract(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((18<<5)|0x5)/*methodCall:18*/,
    },
    { // 24: token ::= [#] `assert @sawAssert(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((19<<5)|0x5)/*methodCall:19*/,
    },
    { // 25: token ::= [#] `byte @sawByte(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((20<<5)|0x5)/*methodCall:20*/,
    },
    { // 26: token ::= [#] `case @sawCase(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((21<<5)|0x5)/*methodCall:21*/,
    },
    { // 27: token ::= [#] `catch @sawCatch(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((22<<5)|0x5)/*methodCall:22*/,
    },
    { // 28: token ::= [#] `char @sawChar(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((23<<5)|0x5)/*methodCall:23*/,
    },
    { // 29: token ::= [#] `const @sawConst(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((24<<5)|0x5)/*methodCall:24*/,
    },
    { // 30: token ::= [#] `continue @sawContinue(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((25<<5)|0x5)/*methodCall:25*/,
    },
    { // 31: token ::= [#] `default @sawDefault(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((26<<5)|0x5)/*methodCall:26*/,
    },
    { // 32: token ::= [#] `do @sawDo(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((27<<5)|0x5)/*methodCall:27*/,
    },
    { // 33: token ::= [#] `double @sawDouble(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((28<<5)|0x5)/*methodCall:28*/,
    },
    { // 34: token ::= [#] `enum @sawEnum(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((29<<5)|0x5)/*methodCall:29*/,
    },
    { // 35: token ::= [#] `final @sawFinal(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((30<<5)|0x5)/*methodCall:30*/,
    },
    { // 36: token ::= [#] `finally @sawFinally(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((31<<5)|0x5)/*methodCall:31*/,
    },
    { // 37: token ::= [#] `float @sawFloat(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((32<<5)|0x5)/*methodCall:32*/,
    },
    { // 38: token ::= [#] `goto @sawGoto(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((33<<5)|0x5)/*methodCall:33*/,
    },
    { // 39: token ::= [#] `implements @sawImplements(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((34<<5)|0x5)/*methodCall:34*/,
    },
    { // 40: token ::= [#] `import @sawImport(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((35<<5)|0x5)/*methodCall:35*/,
    },
    { // 41: token ::= [#] `interface @sawInterface(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((36<<5)|0x5)/*methodCall:36*/,
    },
    { // 42: token ::= [#] `long @sawLong(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((37<<5)|0x5)/*methodCall:37*/,
    },
    { // 43: token ::= [#] `native @sawNative(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((38<<5)|0x5)/*methodCall:38*/,
    },
    { // 44: token ::= [#] `package @sawPackage(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((39<<5)|0x5)/*methodCall:39*/,
    },
    { // 45: token ::= [#] `private @sawPrivate(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((40<<5)|0x5)/*methodCall:40*/,
    },
    { // 46: token ::= [#] `protected @sawProtected(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((41<<5)|0x5)/*methodCall:41*/,
    },
    { // 47: token ::= [#] `public @sawPublic(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((42<<5)|0x5)/*methodCall:42*/,
    },
    { // 48: token ::= [#] `short @sawShort(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((43<<5)|0x5)/*methodCall:43*/,
    },
    { // 49: token ::= [#] `static @sawStatic(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((44<<5)|0x5)/*methodCall:44*/,
    },
    { // 50: token ::= [#] `strictfp @sawStrictfp(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((45<<5)|0x5)/*methodCall:45*/,
    },
    { // 51: token ::= [#] `switch @sawSwitch(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((46<<5)|0x5)/*methodCall:46*/,
    },
    { // 52: token ::= [#] `synchronized @sawSynchronized(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((47<<5)|0x5)/*methodCall:47*/,
    },
    { // 53: token ::= [#] `throw @sawThrow(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((48<<5)|0x5)/*methodCall:48*/,
    },
    { // 54: token ::= [#] `throws @sawThrows(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((49<<5)|0x5)/*methodCall:49*/,
    },
    { // 55: token ::= [#] `transient @sawTransient(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((50<<5)|0x5)/*methodCall:50*/,
    },
    { // 56: token ::= [#] `try @sawTry(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((51<<5)|0x5)/*methodCall:51*/,
    },
    { // 57: token ::= [#] `volatile @sawVolatile(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((52<<5)|0x5)/*methodCall:52*/,
    },
    { // 58: token ::= [#] `! @sawNot(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((53<<5)|0x5)/*methodCall:53*/,
    },
    { // 59: token ::= [#] `!= @sawNotEqual(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((54<<5)|0x5)/*methodCall:54*/,
    },
    { // 60: token ::= [#] `% @sawRemainder(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((55<<5)|0x5)/*methodCall:55*/,
    },
    { // 61: token ::= [#] `&& @sawAnd(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((56<<5)|0x5)/*methodCall:56*/,
    },
    { // 62: token ::= [#] `* @sawTimes(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((57<<5)|0x5)/*methodCall:57*/,
    },
    { // 63: token ::= [#] `( @sawLpar(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((58<<5)|0x5)/*methodCall:58*/,
    },
    { // 64: token ::= [#] `) @sawRpar(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((59<<5)|0x5)/*methodCall:59*/,
    },
    { // 65: token ::= [#] `{ @sawLbrace(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((60<<5)|0x5)/*methodCall:60*/,
    },
    { // 66: token ::= [#] `} @sawRbrace(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((61<<5)|0x5)/*methodCall:61*/,
    },
    { // 67: token ::= [#] `- @sawMinus(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((62<<5)|0x5)/*methodCall:62*/,
    },
    { // 68: token ::= [#] `+ @sawPlus(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((63<<5)|0x5)/*methodCall:63*/,
    },
    { // 69: token ::= [#] `= @sawAssign(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((64<<5)|0x5)/*methodCall:64*/,
    },
    { // 70: token ::= [#] `== @sawEqual(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((65<<5)|0x5)/*methodCall:65*/,
    },
    { // 71: token ::= [#] `[ @sawLbrack(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((66<<5)|0x5)/*methodCall:66*/,
    },
    { // 72: token ::= [#] `] @sawRbrack(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((67<<5)|0x5)/*methodCall:67*/,
    },
    { // 73: token ::= [#] `|| @sawOr(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((68<<5)|0x5)/*methodCall:68*/,
    },
    { // 74: token ::= [#] `< @sawLess(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((69<<5)|0x5)/*methodCall:69*/,
    },
    { // 75: token ::= [#] `<= @sawLessEq(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((70<<5)|0x5)/*methodCall:70*/,
    },
    { // 76: token ::= [#] `, @sawComma(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((71<<5)|0x5)/*methodCall:71*/,
    },
    { // 77: token ::= [#] `> @sawGreater(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((72<<5)|0x5)/*methodCall:72*/,
    },
    { // 78: token ::= [#] `>= @sawGreaterEq(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((73<<5)|0x5)/*methodCall:73*/,
    },
    { // 79: token ::= [#] `. @sawDot(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((74<<5)|0x5)/*methodCall:74*/,
    },
    { // 80: token ::= [#] `; @sawSemi(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((75<<5)|0x5)/*methodCall:75*/,
    },
    { // 81: token ::= [#] `++ @sawPlusPlus(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((76<<5)|0x5)/*methodCall:76*/,
    },
    { // 82: token ::= [#] `-- @sawMinusMinus(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((77<<5)|0x5)/*methodCall:77*/,
    },
    { // 83: token ::= [#] `/ @sawSlash(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((78<<5)|0x5)/*methodCall:78*/,
    },
    { // 84: token ::= [#] `: @sawColon(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((79<<5)|0x5)/*methodCall:79*/,
    },
    { // 85: token ::= [#] ID @identifier(int,String)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((80<<5)|0x5)/*methodCall:80*/,
    },
    { // 86: token ::= [#] INT_LITERAL @intLit(int,int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((81<<5)|0x5)/*methodCall:81*/,
    },
    { // 87: token ::= [#] STRING_LITERAL @stringLit(int,String)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((82<<5)|0x5)/*methodCall:82*/,
    },
    { // 88: token ::= [#] CHAR_LITERAL @charLit(int,int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((83<<5)|0x5)/*methodCall:83*/,
    },
    { // 89: `class ::= "c" "l" "a" "s" "s" !idChar white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 90: `class ::= "c" "l" "a" "s" "s" !idChar [white*] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 91: reserved ::= `class @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 92: `else ::= "e" "l" "s" "e" !idChar white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 93: `else ::= "e" "l" "s" "e" !idChar [white*] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 94: reserved ::= `else @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 95: `!= ::= "!" "=" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 96: `!= ::= "!" "=" [white*] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 97: `+ ::= "+" !"+" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 98: `+ ::= "+" !"+" [white*] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 99: INT_LITERAL ::= !"0" [#] digit++ white* @convertToInt(int,List<Character>)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((84<<5)|0x5)/*methodCall:84*/,
    },
    { // 100: INT_LITERAL ::= !"0" [#] digit++ [white*] @convertToInt(int,List<Character>)=>int
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((84<<5)|0x5)/*methodCall:84*/,
    },
    { // 101: INT_LITERAL ::= [#] "0" !digit !{"X" "x"} white* @returnZero(int,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((85<<5)|0x5)/*methodCall:85*/,
    },
    { // 102: INT_LITERAL ::= [#] "0" !digit !{"X" "x"} [white*] @returnZero(int,char)=>int
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((85<<5)|0x5)/*methodCall:85*/,
    },
    { // 103: hex ::= "x" @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 104: hex ::= "X" @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 105: INT_LITERAL ::= [#] "0" hex digit++ @convertHexToInt(int,Character,Character,List<Character>)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((86<<5)|0x5)/*methodCall:86*/,
    },
    { // 106: INT_LITERAL ::= [#] "0" digit++ white* @convertOctalToInt(int,Character,List<Character>)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((87<<5)|0x5)/*methodCall:87*/,
    },
    { // 107: INT_LITERAL ::= [#] "0" digit++ [white*] @convertOctalToInt(int,Character,List<Character>)=>int
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((87<<5)|0x5)/*methodCall:87*/,
    },
    { // 108: idChar ::= letter @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 109: idChar ::= digit @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 110: idChar ::= "_" @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 111: letter ::= {"A".."Z" "a".."z"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 112: digit ::= {"0".."9"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 113: white ::= {9 12 " "} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 114: white ::= eol @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 115: white ::= comment @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 116: comment ::= oneLineComment @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 117: comment ::= blockComment @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 118: oneLineComment ::= "/" "/" printable** eol @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 119: oneLineComment ::= "/" "/" !printable [printable**] eol @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((0<<5)|0x6)/*nullProductionAction:0*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 120: blockComment ::= "/" "*" blockCommentContent* "*" "/" @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 121: blockComment ::= "/" "*" [blockCommentContent*] "*" "/" @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 122: blockCommentContent ::= eol @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 123: blockCommentContent ::= {9 " "..")" "+".."~"} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 124: blockCommentContent ::= "*" !"/" @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 125: eol ::= {10} [registerNewline] @void
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 126: eol ::= {13} {10} [registerNewline] @void
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 127: eol ::= {13} !10 [registerNewline] @void
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 128: printable ::= {" ".."~"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 129: stringPrintable ::= {" ".."!"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 130: stringPrintable ::= {"#".."["} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 131: stringPrintable ::= {"]".."~"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 132: stringPrintable ::= recognizeEscapeChar @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 133: charPrintable ::= {" ".."&"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 134: charPrintable ::= {"(".."["} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 135: charPrintable ::= {"]".."~"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 136: charPrintable ::= recognizeEscapeChar @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 137: `! ::= "!" !"=" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 138: `! ::= "!" !"=" [white*] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 139: `% ::= "%" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 140: `% ::= "%" [white*] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 141: `&& ::= "&" "&" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 142: `&& ::= "&" "&" [white*] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 143: `* ::= "*" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 144: `* ::= "*" [white*] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 145: `( ::= "(" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 146: `( ::= "(" [white*] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 147: `) ::= ")" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 148: `) ::= ")" [white*] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 149: `{ ::= "{" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 150: `{ ::= "{" [white*] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 151: `} ::= "}" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 152: `} ::= "}" [white*] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 153: `- ::= "-" !"-" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 154: `- ::= "-" !"-" [white*] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 155: `= ::= "=" !"=" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 156: `= ::= "=" !"=" [white*] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 157: `== ::= "=" "=" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 158: `== ::= "=" "=" [white*] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 159: `[ ::= "[" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 160: `[ ::= "[" [white*] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 161: `] ::= "]" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 162: `] ::= "]" [white*] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 163: `|| ::= "|" "|" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 164: `|| ::= "|" "|" [white*] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 165: `< ::= "<" !"=" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 166: `< ::= "<" !"=" [white*] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 167: `<= ::= "<" "=" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 168: `<= ::= "<" "=" [white*] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 169: `, ::= "," white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 170: `, ::= "," [white*] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 171: `> ::= ">" !"=" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 172: `> ::= ">" !"=" [white*] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 173: `>= ::= ">" "=" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 174: `>= ::= ">" "=" [white*] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 175: `: ::= ":" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 176: `: ::= ":" [white*] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 177: `. ::= "." white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 178: `. ::= "." [white*] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 179: `; ::= ";" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 180: `; ::= ";" [white*] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 181: `++ ::= "+" "+" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 182: `++ ::= "+" "+" [white*] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 183: `-- ::= "-" "-" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 184: `-- ::= "-" "-" [white*] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 185: `/ ::= "/" !{"*" "/"} white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 186: `/ ::= "/" !{"*" "/"} [white*] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 187: `boolean ::= "b" "o" "o" "l" "e" "a" "n" !idChar white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x3)/*popOffPushBack:7*/,
    },
    { // 188: `boolean ::= "b" "o" "o" "l" "e" "a" "n" !idChar [white*] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x3)/*popOffPushBack:7*/,
    },
    { // 189: reserved ::= `boolean @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 190: `extends ::= "e" "x" "t" "e" "n" "d" "s" !idChar white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x3)/*popOffPushBack:7*/,
    },
    { // 191: `extends ::= "e" "x" "t" "e" "n" "d" "s" !idChar [white*] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x3)/*popOffPushBack:7*/,
    },
    { // 192: reserved ::= `extends @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 193: `void ::= "v" "o" "i" "d" !idChar white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 194: `void ::= "v" "o" "i" "d" !idChar [white*] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 195: reserved ::= `void @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 196: `int ::= "i" "n" "t" !idChar white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 197: `int ::= "i" "n" "t" !idChar [white*] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 198: reserved ::= `int @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 199: `while ::= "w" "h" "i" "l" "e" !idChar white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 200: `while ::= "w" "h" "i" "l" "e" !idChar [white*] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 201: reserved ::= `while @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 202: `if ::= "i" "f" !idChar white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 203: `if ::= "i" "f" !idChar [white*] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 204: reserved ::= `if @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 205: `for ::= "f" "o" "r" !idChar white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 206: `for ::= "f" "o" "r" !idChar [white*] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 207: reserved ::= `for @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 208: `break ::= "b" "r" "e" "a" "k" !idChar white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 209: `break ::= "b" "r" "e" "a" "k" !idChar [white*] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 210: reserved ::= `break @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 211: `this ::= "t" "h" "i" "s" !idChar white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 212: `this ::= "t" "h" "i" "s" !idChar [white*] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 213: reserved ::= `this @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 214: `false ::= "f" "a" "l" "s" "e" !idChar white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 215: `false ::= "f" "a" "l" "s" "e" !idChar [white*] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 216: reserved ::= `false @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 217: `true ::= "t" "r" "u" "e" !idChar white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 218: `true ::= "t" "r" "u" "e" !idChar [white*] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 219: reserved ::= `true @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 220: `super ::= "s" "u" "p" "e" "r" !idChar white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 221: `super ::= "s" "u" "p" "e" "r" !idChar [white*] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 222: reserved ::= `super @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 223: `null ::= "n" "u" "l" "l" !idChar white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 224: `null ::= "n" "u" "l" "l" !idChar [white*] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 225: reserved ::= `null @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 226: `return ::= "r" "e" "t" "u" "r" "n" !idChar white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x3)/*popOffPushBack:6*/,
    },
    { // 227: `return ::= "r" "e" "t" "u" "r" "n" !idChar [white*] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x3)/*popOffPushBack:6*/,
    },
    { // 228: reserved ::= `return @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 229: `instanceof ::= "i" "n" "s" "t" "a" "n" "c" "e" "o" "f" !idChar white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((10<<5)|0x3)/*popOffPushBack:10*/,
    },
    { // 230: `instanceof ::= "i" "n" "s" "t" "a" "n" "c" "e" "o" "f" !idChar [white*] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((10<<5)|0x3)/*popOffPushBack:10*/,
    },
    { // 231: reserved ::= `instanceof @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 232: `new ::= "n" "e" "w" !idChar white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 233: `new ::= "n" "e" "w" !idChar [white*] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 234: reserved ::= `new @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 235: `abstract ::= "a" "b" "s" "t" "r" "a" "c" "t" !idChar white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((8<<5)|0x3)/*popOffPushBack:8*/,
    },
    { // 236: `abstract ::= "a" "b" "s" "t" "r" "a" "c" "t" !idChar [white*] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((8<<5)|0x3)/*popOffPushBack:8*/,
    },
    { // 237: reserved ::= `abstract @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 238: `assert ::= "a" "s" "s" "e" "r" "t" !idChar white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x3)/*popOffPushBack:6*/,
    },
    { // 239: `assert ::= "a" "s" "s" "e" "r" "t" !idChar [white*] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x3)/*popOffPushBack:6*/,
    },
    { // 240: reserved ::= `assert @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 241: `byte ::= "b" "y" "t" "e" !idChar white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 242: `byte ::= "b" "y" "t" "e" !idChar [white*] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 243: reserved ::= `byte @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 244: `case ::= "c" "a" "s" "e" !idChar white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 245: `case ::= "c" "a" "s" "e" !idChar [white*] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 246: reserved ::= `case @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 247: `catch ::= "c" "a" "t" "c" "h" !idChar white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 248: `catch ::= "c" "a" "t" "c" "h" !idChar [white*] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 249: reserved ::= `catch @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 250: `char ::= "c" "h" "a" "r" !idChar white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 251: `char ::= "c" "h" "a" "r" !idChar [white*] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 252: reserved ::= `char @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 253: `const ::= "c" "o" "n" "s" "t" !idChar white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 254: `const ::= "c" "o" "n" "s" "t" !idChar [white*] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 255: reserved ::= `const @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 256: `continue ::= "c" "o" "n" "t" "i" "n" "u" "e" !idChar white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((8<<5)|0x3)/*popOffPushBack:8*/,
    },
    { // 257: `continue ::= "c" "o" "n" "t" "i" "n" "u" "e" !idChar [white*] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((8<<5)|0x3)/*popOffPushBack:8*/,
    },
    { // 258: reserved ::= `continue @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 259: `default ::= "d" "e" "f" "a" "u" "l" "t" !idChar white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x3)/*popOffPushBack:7*/,
    },
    { // 260: `default ::= "d" "e" "f" "a" "u" "l" "t" !idChar [white*] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x3)/*popOffPushBack:7*/,
    },
    { // 261: reserved ::= `default @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 262: `do ::= "d" "o" !idChar white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 263: `do ::= "d" "o" !idChar [white*] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 264: reserved ::= `do @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 265: `double ::= "d" "o" "u" "b" "l" "e" !idChar white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x3)/*popOffPushBack:6*/,
    },
    { // 266: `double ::= "d" "o" "u" "b" "l" "e" !idChar [white*] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x3)/*popOffPushBack:6*/,
    },
    { // 267: reserved ::= `double @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 268: `enum ::= "e" "n" "u" "m" !idChar white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 269: `enum ::= "e" "n" "u" "m" !idChar [white*] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 270: reserved ::= `enum @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 271: `final ::= "f" "i" "n" "a" "l" !idChar white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 272: `final ::= "f" "i" "n" "a" "l" !idChar [white*] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 273: reserved ::= `final @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 274: `finally ::= "f" "i" "n" "a" "l" "l" "y" !idChar white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x3)/*popOffPushBack:7*/,
    },
    { // 275: `finally ::= "f" "i" "n" "a" "l" "l" "y" !idChar [white*] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x3)/*popOffPushBack:7*/,
    },
    { // 276: reserved ::= `finally @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 277: `float ::= "f" "l" "o" "a" "t" !idChar white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 278: `float ::= "f" "l" "o" "a" "t" !idChar [white*] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 279: reserved ::= `float @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 280: `goto ::= "g" "o" "t" "o" !idChar white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 281: `goto ::= "g" "o" "t" "o" !idChar [white*] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 282: reserved ::= `goto @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 283: `implements ::= "i" "m" "p" "l" "e" "m" "e" "n" "t" "s" !idChar white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((10<<5)|0x3)/*popOffPushBack:10*/,
    },
    { // 284: `implements ::= "i" "m" "p" "l" "e" "m" "e" "n" "t" "s" !idChar [white*] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((10<<5)|0x3)/*popOffPushBack:10*/,
    },
    { // 285: reserved ::= `implements @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 286: `import ::= "i" "m" "p" "o" "r" "t" !idChar white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x3)/*popOffPushBack:6*/,
    },
    { // 287: `import ::= "i" "m" "p" "o" "r" "t" !idChar [white*] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x3)/*popOffPushBack:6*/,
    },
    { // 288: reserved ::= `import @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 289: `interface ::= "i" "n" "t" "e" "r" "f" "a" "c" "e" !idChar white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x3)/*popOffPushBack:9*/,
    },
    { // 290: `interface ::= "i" "n" "t" "e" "r" "f" "a" "c" "e" !idChar [white*] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x3)/*popOffPushBack:9*/,
    },
    { // 291: reserved ::= `interface @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 292: `long ::= "l" "o" "n" "g" !idChar white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 293: `long ::= "l" "o" "n" "g" !idChar [white*] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 294: reserved ::= `long @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 295: `native ::= "n" "a" "t" "i" "v" "e" !idChar white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x3)/*popOffPushBack:6*/,
    },
    { // 296: `native ::= "n" "a" "t" "i" "v" "e" !idChar [white*] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x3)/*popOffPushBack:6*/,
    },
    { // 297: reserved ::= `native @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 298: `package ::= "p" "a" "c" "k" "a" "g" "e" !idChar white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x3)/*popOffPushBack:7*/,
    },
    { // 299: `package ::= "p" "a" "c" "k" "a" "g" "e" !idChar [white*] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x3)/*popOffPushBack:7*/,
    },
    { // 300: reserved ::= `package @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 301: `private ::= "p" "r" "i" "v" "a" "t" "e" !idChar white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x3)/*popOffPushBack:7*/,
    },
    { // 302: `private ::= "p" "r" "i" "v" "a" "t" "e" !idChar [white*] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x3)/*popOffPushBack:7*/,
    },
    { // 303: reserved ::= `private @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 304: `protected ::= "p" "r" "o" "t" "e" "c" "t" "e" "d" !idChar white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x3)/*popOffPushBack:9*/,
    },
    { // 305: `protected ::= "p" "r" "o" "t" "e" "c" "t" "e" "d" !idChar [white*] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x3)/*popOffPushBack:9*/,
    },
    { // 306: reserved ::= `protected @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 307: `public ::= "p" "u" "b" "l" "i" "c" !idChar white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x3)/*popOffPushBack:6*/,
    },
    { // 308: `public ::= "p" "u" "b" "l" "i" "c" !idChar [white*] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x3)/*popOffPushBack:6*/,
    },
    { // 309: reserved ::= `public @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 310: `short ::= "s" "h" "o" "r" "t" !idChar white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 311: `short ::= "s" "h" "o" "r" "t" !idChar [white*] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 312: reserved ::= `short @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 313: `static ::= "s" "t" "a" "t" "i" "c" !idChar white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x3)/*popOffPushBack:6*/,
    },
    { // 314: `static ::= "s" "t" "a" "t" "i" "c" !idChar [white*] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x3)/*popOffPushBack:6*/,
    },
    { // 315: reserved ::= `static @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 316: `strictfp ::= "s" "t" "r" "i" "c" "t" "f" "p" !idChar white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((8<<5)|0x3)/*popOffPushBack:8*/,
    },
    { // 317: `strictfp ::= "s" "t" "r" "i" "c" "t" "f" "p" !idChar [white*] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((8<<5)|0x3)/*popOffPushBack:8*/,
    },
    { // 318: reserved ::= `strictfp @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 319: `switch ::= "s" "w" "i" "t" "c" "h" !idChar white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x3)/*popOffPushBack:6*/,
    },
    { // 320: `switch ::= "s" "w" "i" "t" "c" "h" !idChar [white*] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x3)/*popOffPushBack:6*/,
    },
    { // 321: reserved ::= `switch @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 322: `synchronized ::= "s" "y" "n" "c" "h" "r" "o" "n" "i" "z" "e" "d" !idChar white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((12<<5)|0x3)/*popOffPushBack:12*/,
    },
    { // 323: `synchronized ::= "s" "y" "n" "c" "h" "r" "o" "n" "i" "z" "e" "d" !idChar [white*] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((12<<5)|0x3)/*popOffPushBack:12*/,
    },
    { // 324: reserved ::= `synchronized @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 325: `throw ::= "t" "h" "r" "o" "w" !idChar white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 326: `throw ::= "t" "h" "r" "o" "w" !idChar [white*] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 327: reserved ::= `throw @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 328: `throws ::= "t" "h" "r" "o" "w" "s" !idChar white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x3)/*popOffPushBack:6*/,
    },
    { // 329: `throws ::= "t" "h" "r" "o" "w" "s" !idChar [white*] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x3)/*popOffPushBack:6*/,
    },
    { // 330: reserved ::= `throws @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 331: `transient ::= "t" "r" "a" "n" "s" "i" "e" "n" "t" !idChar white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x3)/*popOffPushBack:9*/,
    },
    { // 332: `transient ::= "t" "r" "a" "n" "s" "i" "e" "n" "t" !idChar [white*] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x3)/*popOffPushBack:9*/,
    },
    { // 333: reserved ::= `transient @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 334: `try ::= "t" "r" "y" !idChar white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 335: `try ::= "t" "r" "y" !idChar [white*] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 336: reserved ::= `try @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 337: `volatile ::= "v" "o" "l" "a" "t" "i" "l" "e" !idChar white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((8<<5)|0x3)/*popOffPushBack:8*/,
    },
    { // 338: `volatile ::= "v" "o" "l" "a" "t" "i" "l" "e" !idChar [white*] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((8<<5)|0x3)/*popOffPushBack:8*/,
    },
    { // 339: reserved ::= `volatile @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 340: ID ::= !reserved letter++ idChar** $$1 @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x4)/*stringConcat:2*/,
    },
    { // 341: ID ::= !reserved letter++ idChar** [white*] @text
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x4)/*stringConcat:2*/,
    },
    { // 342: ID ::= !reserved letter++ !idChar [idChar**] $$1 @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x4)/*stringConcat:2*/,
    },
    { // 343: ID ::= !reserved letter++ !idChar [idChar**] [white*] @text
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x4)/*stringConcat:2*/,
    },
    { // 344: STRING_LITERAL ::= '"' stringPrintable* $$2 @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x4)/*stringConcat:3*/,
    },
    { // 345: STRING_LITERAL ::= '"' [stringPrintable*] $$2 @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x4)/*stringConcat:3*/,
    },
    { // 346: CHAR_LITERAL ::= "'" charPrintable "'" white* @return0(char,char,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((88<<5)|0x5)/*methodCall:88*/,
    },
    { // 347: CHAR_LITERAL ::= "'" charPrintable "'" [white*] @return0(char,char,char)=>int
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((88<<5)|0x5)/*methodCall:88*/,
    },
    { // 348: escapeChars ::= "\" "\" @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 349: escapeChars ::= "\" '"' @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 350: escapeChars ::= "\" "'" @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 351: escapeChars ::= "\" "n" @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 352: escapeChars ::= "\" "t" @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 353: escapeChars ::= "\" "f" @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 354: escapeChars ::= "\" "r" @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 355: recognizeEscapeChar ::= escapeChars @recognizeEscapeChar(char,char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((2<<5)|0x0)/*popToPushBack:2*/,
      ((89<<5)|0x5)/*methodCall:89*/,
    },
    { // 356: token* ::= token* token @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 357: token* ::= [token*] token @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((5<<5)|0x6)/*nullProductionAction:5*/,
    },
    { // 358: printable** ::= printable* !printable @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 359: digit++ ::= digit+ !digit @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 360: idChar** ::= idChar* !idChar @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 361: white* ::= white* white @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 362: white* ::= [white*] white @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
    },
    { // 363: blockCommentContent* ::= blockCommentContent* blockCommentContent @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 364: blockCommentContent* ::= [blockCommentContent*] blockCommentContent @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
    },
    { // 365: stringPrintable* ::= stringPrintable* stringPrintable @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 366: stringPrintable* ::= [stringPrintable*] stringPrintable @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 367: letter++ ::= letter+ !letter @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 368: digit+ ::= digit @singleList
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xa)/*singleList:1*/,
    },
    { // 369: digit+ ::= digit+ digit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 370: letter+ ::= letter @singleList
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xa)/*singleList:1*/,
    },
    { // 371: letter+ ::= letter+ letter @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 372: printable* ::= printable* printable @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 373: printable* ::= [printable*] printable @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 374: idChar* ::= idChar* idChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 375: idChar* ::= [idChar*] idChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 376: $$0 ::= token* @pass
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 377: $$1 ::= white* @pass
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 378: $$2 ::= '"' white* @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 379: $$2 ::= '"' [white*] @pass
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
};
public String[] getNullProdNameTable() { return nullProdNameTable; }
private String[] nullProdNameTable = {
    "printable** ::= printable* !printable", // printable**
    "printable* ::=", // printable*
    "stringPrintable* ::=", // stringPrintable*
    "", // start
    "idChar** ::= idChar* !idChar", // idChar**
    "token* ::=", // token*
    "idChar* ::=", // idChar*
    "blockCommentContent* ::=", // blockCommentContent*
    "white* ::=", // white*
    "", // $$start
    "# ::=", // #
    "", // registerNewline
};
public int[][] getNullProductionActionTable() { return nullActionTable; }
private int[][] nullActionTable = {
    { // printable**
      ((1<<5)|0x6)/*nullProductionAction:1*/,
    },
    { // printable*
      ((1<<5)|0x9)/*emptyList:1*/,
    },
    { // stringPrintable*
      ((1<<5)|0x9)/*emptyList:1*/,
    },
    { // start
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((5<<5)|0x6)/*nullProductionAction:5*/,
    },
    { // idChar**
      ((6<<5)|0x6)/*nullProductionAction:6*/,
    },
    { // token*
    },
    { // idChar*
      ((1<<5)|0x9)/*emptyList:1*/,
    },
    { // blockCommentContent*
    },
    { // white*
    },
    { // $$start
      ((3<<5)|0x6)/*nullProductionAction:3*/,
    },
    { // #
      7/*duplicateTop*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // registerNewline
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((90<<5)|0x5)/*methodCall:90*/,
    },
};
public void actionCall(int idx, wrangLR.runtime.SemanticInfo si) {
  switch(idx) {
    default: System.err.println("Internal error--illegal action number: "+idx);break;
    case 0: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawBoolean(parm0);
    }
    break;
    case 1: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawClass(parm0);
    }
    break;
    case 2: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawExtends(parm0);
    }
    break;
    case 3: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawVoid(parm0);
    }
    break;
    case 4: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawInt(parm0);
    }
    break;
    case 5: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawWhile(parm0);
    }
    break;
    case 6: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawIf(parm0);
    }
    break;
    case 7: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawElse(parm0);
    }
    break;
    case 8: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawFor(parm0);
    }
    break;
    case 9: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawBreak(parm0);
    }
    break;
    case 10: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawThis(parm0);
    }
    break;
    case 11: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawFalse(parm0);
    }
    break;
    case 12: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawTrue(parm0);
    }
    break;
    case 13: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawSuper(parm0);
    }
    break;
    case 14: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawNull(parm0);
    }
    break;
    case 15: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawReturn(parm0);
    }
    break;
    case 16: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawInstanceof(parm0);
    }
    break;
    case 17: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawNew(parm0);
    }
    break;
    case 18: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawAbstract(parm0);
    }
    break;
    case 19: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawAssert(parm0);
    }
    break;
    case 20: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawByte(parm0);
    }
    break;
    case 21: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawCase(parm0);
    }
    break;
    case 22: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawCatch(parm0);
    }
    break;
    case 23: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawChar(parm0);
    }
    break;
    case 24: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawConst(parm0);
    }
    break;
    case 25: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawContinue(parm0);
    }
    break;
    case 26: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawDefault(parm0);
    }
    break;
    case 27: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawDo(parm0);
    }
    break;
    case 28: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawDouble(parm0);
    }
    break;
    case 29: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawEnum(parm0);
    }
    break;
    case 30: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawFinal(parm0);
    }
    break;
    case 31: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawFinally(parm0);
    }
    break;
    case 32: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawFloat(parm0);
    }
    break;
    case 33: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawGoto(parm0);
    }
    break;
    case 34: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawImplements(parm0);
    }
    break;
    case 35: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawImport(parm0);
    }
    break;
    case 36: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawInterface(parm0);
    }
    break;
    case 37: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawLong(parm0);
    }
    break;
    case 38: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawNative(parm0);
    }
    break;
    case 39: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawPackage(parm0);
    }
    break;
    case 40: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawPrivate(parm0);
    }
    break;
    case 41: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawProtected(parm0);
    }
    break;
    case 42: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawPublic(parm0);
    }
    break;
    case 43: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawShort(parm0);
    }
    break;
    case 44: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawStatic(parm0);
    }
    break;
    case 45: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawStrictfp(parm0);
    }
    break;
    case 46: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawSwitch(parm0);
    }
    break;
    case 47: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawSynchronized(parm0);
    }
    break;
    case 48: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawThrow(parm0);
    }
    break;
    case 49: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawThrows(parm0);
    }
    break;
    case 50: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawTransient(parm0);
    }
    break;
    case 51: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawTry(parm0);
    }
    break;
    case 52: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawVolatile(parm0);
    }
    break;
    case 53: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawNot(parm0);
    }
    break;
    case 54: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawNotEqual(parm0);
    }
    break;
    case 55: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawRemainder(parm0);
    }
    break;
    case 56: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawAnd(parm0);
    }
    break;
    case 57: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawTimes(parm0);
    }
    break;
    case 58: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawLpar(parm0);
    }
    break;
    case 59: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawRpar(parm0);
    }
    break;
    case 60: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawLbrace(parm0);
    }
    break;
    case 61: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawRbrace(parm0);
    }
    break;
    case 62: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawMinus(parm0);
    }
    break;
    case 63: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawPlus(parm0);
    }
    break;
    case 64: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawAssign(parm0);
    }
    break;
    case 65: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawEqual(parm0);
    }
    break;
    case 66: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawLbrack(parm0);
    }
    break;
    case 67: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawRbrack(parm0);
    }
    break;
    case 68: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawOr(parm0);
    }
    break;
    case 69: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawLess(parm0);
    }
    break;
    case 70: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawLessEq(parm0);
    }
    break;
    case 71: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawComma(parm0);
    }
    break;
    case 72: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawGreater(parm0);
    }
    break;
    case 73: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawGreaterEq(parm0);
    }
    break;
    case 74: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawDot(parm0);
    }
    break;
    case 75: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawSemi(parm0);
    }
    break;
    case 76: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawPlusPlus(parm0);
    }
    break;
    case 77: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawMinusMinus(parm0);
    }
    break;
    case 78: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawSlash(parm0);
    }
    break;
    case 79: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawColon(parm0);
    }
    break;
    case 80: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      actionObject.identifier(parm0,parm1);
    }
    break;
    case 81: {
      int parm0 = (Integer)si.popPb();
      int parm1 = (Integer)si.popPb();
      actionObject.intLit(parm0,parm1);
    }
    break;
    case 82: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      actionObject.stringLit(parm0,parm1);
    }
    break;
    case 83: {
      int parm0 = (Integer)si.popPb();
      int parm1 = (Integer)si.popPb();
      actionObject.charLit(parm0,parm1);
    }
    break;
    case 84: {
      int parm0 = (Integer)si.popPb();
      List<Character> parm1 = (List<Character>)si.popPb();
      int result = actionObject.convertToInt(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 85: {
      int parm0 = (Integer)si.popPb();
      char parm1 = (Character)si.popPb();
      int result = actionObject.returnZero(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 86: {
      int parm0 = (Integer)si.popPb();
      Character parm1 = (Character)si.popPb();
      Character parm2 = (Character)si.popPb();
      List<Character> parm3 = (List<Character>)si.popPb();
      int result = actionObject.convertHexToInt(parm0,parm1,parm2,parm3);
      si.pushPb(result);
    }
    break;
    case 87: {
      int parm0 = (Integer)si.popPb();
      Character parm1 = (Character)si.popPb();
      List<Character> parm2 = (List<Character>)si.popPb();
      int result = actionObject.convertOctalToInt(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 88: {
      char parm0 = (Character)si.popPb();
      char parm1 = (Character)si.popPb();
      char parm2 = (Character)si.popPb();
      int result = actionObject.return0(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 89: {
      char parm0 = (Character)si.popPb();
      char parm1 = (Character)si.popPb();
      char result = actionObject.recognizeEscapeChar(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 90: {
      int parm0 = (Integer)si.popPb();
      actionObject.registerNewline(parm0);
    }
    break;
  }
}
private String[] saNameSigTable = {
"void sawBoolean(int)",
"void sawClass(int)",
"void sawExtends(int)",
"void sawVoid(int)",
"void sawInt(int)",
"void sawWhile(int)",
"void sawIf(int)",
"void sawElse(int)",
"void sawFor(int)",
"void sawBreak(int)",
"void sawThis(int)",
"void sawFalse(int)",
"void sawTrue(int)",
"void sawSuper(int)",
"void sawNull(int)",
"void sawReturn(int)",
"void sawInstanceof(int)",
"void sawNew(int)",
"void sawAbstract(int)",
"void sawAssert(int)",
"void sawByte(int)",
"void sawCase(int)",
"void sawCatch(int)",
"void sawChar(int)",
"void sawConst(int)",
"void sawContinue(int)",
"void sawDefault(int)",
"void sawDo(int)",
"void sawDouble(int)",
"void sawEnum(int)",
"void sawFinal(int)",
"void sawFinally(int)",
"void sawFloat(int)",
"void sawGoto(int)",
"void sawImplements(int)",
"void sawImport(int)",
"void sawInterface(int)",
"void sawLong(int)",
"void sawNative(int)",
"void sawPackage(int)",
"void sawPrivate(int)",
"void sawProtected(int)",
"void sawPublic(int)",
"void sawShort(int)",
"void sawStatic(int)",
"void sawStrictfp(int)",
"void sawSwitch(int)",
"void sawSynchronized(int)",
"void sawThrow(int)",
"void sawThrows(int)",
"void sawTransient(int)",
"void sawTry(int)",
"void sawVolatile(int)",
"void sawNot(int)",
"void sawNotEqual(int)",
"void sawRemainder(int)",
"void sawAnd(int)",
"void sawTimes(int)",
"void sawLpar(int)",
"void sawRpar(int)",
"void sawLbrace(int)",
"void sawRbrace(int)",
"void sawMinus(int)",
"void sawPlus(int)",
"void sawAssign(int)",
"void sawEqual(int)",
"void sawLbrack(int)",
"void sawRbrack(int)",
"void sawOr(int)",
"void sawLess(int)",
"void sawLessEq(int)",
"void sawComma(int)",
"void sawGreater(int)",
"void sawGreaterEq(int)",
"void sawDot(int)",
"void sawSemi(int)",
"void sawPlusPlus(int)",
"void sawMinusMinus(int)",
"void sawSlash(int)",
"void sawColon(int)",
"void identifier(int,String)",
"void intLit(int,int)",
"void stringLit(int,String)",
"void charLit(int,int)",
"int convertToInt(int,List<Character>)",
"int returnZero(int,char)",
"int convertHexToInt(int,Character,Character,List<Character>)",
"int convertOctalToInt(int,Character,List<Character>)",
"int return0(char,char,char)",
"char recognizeEscapeChar(char,char)",
"void registerNewline(int)",
};
public String[] getSaNameSigTable() {
  return saNameSigTable;
}
private int[] sigCountTable = {
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
2,0,
2,0,
2,0,
2,0,
2,1,
2,1,
4,1,
3,1,
3,1,
2,1,
1,0,
};
public int[] getSigCountTable() {
  return sigCountTable;
}
public int[] getSymbolSizeTable() { return symbolSizeTable; }
private int[] symbolSizeTable = {
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    1,
    1,
    1,
    1,
    -1,
    -1,
    -1,
    -1,
    1,
    0,
    -1,
    -1,
    -1,
    -1,
    -1,
    1,
    1,
    -1,
    -1,
    1,
    1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    0,
    -1,
    -1,
    -1,
    0,
    0,
    0,
    0,
    -1,
    1,
    1,
    -1,
    0,
    0,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    1,
    1,
    1,
    1,
    1,
    0,
    1,
    1,
    2,
    0,
    1,
    1,
    1,
    1,
    -1,
    -1,
};
public Object vectorToTuple(java.util.ArrayList<Object> vec) {
  switch (vec.size()) {
    case 2: return new Tuple2<Object,Object>(vec.get(0),vec.get(1));
  }
  System.err.println("Internal error--illegal Tuple size: "+vec.size());
  return null;
}
}
class Tuple2<T0,T1> {
    private T0 val0;
    private T1 val1;
    public Tuple2(T0 parm0 ,T1 parm1) {
        val0 = parm0;
        val1 = parm1;
    }
    public T0 getVal0() { return val0;}
    public T1 getVal1() { return val1;}
    public String toString() {
       return "<<"+val0+","+val1+">>";
    }
}
