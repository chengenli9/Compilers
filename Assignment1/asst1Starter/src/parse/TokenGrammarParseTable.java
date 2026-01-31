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
public int getEofSym() { return 178; }
public int getNttSym() { return 179; }
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
"digit++",
"letter",
"digit",
"\"_\"",
"\"d\"",
"\"g\"",
"\"m\"",
"\"p\"",
"\"v\"",
"\"y\"",
"\"f\"",
"\"i\"",
"{\"A\"..\"Z\"}",
"\"o\"",
"\"r\"",
"\"u\"",
"\"x\"",
"{\"j\" \"q\"}",
"\"b\"",
"\"h\"",
"\"k\"",
"\"n\"",
"\"t\"",
"\"w\"",
"\"z\"",
"{\"0\"..\"9\"}",
"white",
"12",
"\" \"",
"9",
"eol",
"comment",
"oneLineComment",
"blockComment",
"doubleSlash",
"printable**",
"printable",
"slashStar",
"blockCommentContent*",
"starSlash",
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
"\"/\"",
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
"\"*\"",
"10",
"13",
"stringPrintable",
"charPrintable",
"letter++",
"idChar**",
"$$1",
"stringPrintable*",
"$$2",
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
public int numSymbols() { return 180;}
private static final int MIN_REDUCTION = 2045;
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
0x80000000|801, // match move
0x80000000|1188, // no-match move
0x80000000|65, // NT-test-match state for doubleSlash
  }
,
{ // state 1
  }
,
{ // state 2
114,1780, // "u"
  }
,
{ // state 3
114,763, // "u"
  }
,
{ // state 4
0x80000000|1646, // match move
0x80000000|305, // no-match move
0x80000000|65, // NT-test-match state for doubleSlash
  }
,
{ // state 5
0x80000000|1, // match move
0x80000000|953, // no-match move
0x80000000|67, // NT-test-match state for idChar
  }
,
{ // state 6
MIN_REDUCTION+2, // (default reduction)
  }
,
{ // state 7
0x80000000|1592, // match move
0x80000000|846, // no-match move
0x80000000|1594, // NT-test-match state for reserved
  }
,
{ // state 8
0x80000000|1444, // match move
0x80000000|772, // no-match move
0x80000000|1636, // NT-test-match state for slashStar
  }
,
{ // state 9
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
129,493, // eol
130,1783, // comment
164,1076, // {10}
165,1589, // {13}
MIN_REDUCTION+274, // (default reduction)
  }
,
{ // state 10
92,1352, // "s"
  }
,
{ // state 11
179,MIN_REDUCTION+309, // $NT
  }
,
{ // state 12
110,840, // "i"
  }
,
{ // state 13
0x80000000|1722, // match move
0x80000000|1756, // no-match move
0x80000000|1594, // NT-test-match state for reserved
  }
,
{ // state 14
113,628, // "r"
  }
,
{ // state 15
121,1771, // "t"
  }
,
{ // state 16
2,1736, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
129,493, // eol
130,1783, // comment
164,1076, // {10}
165,1589, // {13}
MIN_REDUCTION+260, // (default reduction)
  }
,
{ // state 17
0x80000000|1, // match move
0x80000000|405, // no-match move
0x80000000|67, // NT-test-match state for idChar
  }
,
{ // state 18
0x80000000|644, // match move
0x80000000|27, // no-match move
0x80000000|1636, // NT-test-match state for slashStar
  }
,
{ // state 19
0x80000000|382, // match move
0x80000000|461, // no-match move
0x80000000|1636, // NT-test-match state for slashStar
  }
,
{ // state 20
MIN_REDUCTION+214, // (default reduction)
  }
,
{ // state 21
2,1287, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
131,729, // oneLineComment
132,50, // blockComment
133,66, // doubleSlash
136,1210, // slashStar
149,144, // "/"
MIN_REDUCTION+182, // (default reduction)
  }
,
{ // state 22
2,318, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
129,493, // eol
130,1783, // comment
164,1076, // {10}
165,1589, // {13}
MIN_REDUCTION+269, // (default reduction)
  }
,
{ // state 23
2,1925, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
131,729, // oneLineComment
132,50, // blockComment
133,66, // doubleSlash
136,1210, // slashStar
149,144, // "/"
MIN_REDUCTION+146, // (default reduction)
  }
,
{ // state 24
0x80000000|1590, // match move
0x80000000|238, // no-match move
0x80000000|65, // NT-test-match state for doubleSlash
  }
,
{ // state 25
114,1678, // "u"
  }
,
{ // state 26
MIN_REDUCTION+322, // (default reduction)
  }
,
{ // state 27
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
129,493, // eol
130,1783, // comment
164,1076, // {10}
165,1589, // {13}
MIN_REDUCTION+241, // (default reduction)
  }
,
{ // state 28
0x80000000|891, // match move
0x80000000|2006, // no-match move
0x80000000|1636, // NT-test-match state for slashStar
  }
,
{ // state 29
2,1634, // white*
170,1842, // $$1
MIN_REDUCTION+335, // (default reduction)
  }
,
{ // state 30
0x80000000|214, // match move
0x80000000|810, // no-match move
0x80000000|65, // NT-test-match state for doubleSlash
  }
,
{ // state 31
97,270, // "="
  }
,
{ // state 32
0x80000000|1, // match move
0x80000000|336, // no-match move
0x80000000|67, // NT-test-match state for idChar
  }
,
{ // state 33
MIN_REDUCTION+79, // (default reduction)
  }
,
{ // state 34
91,1614, // "a"
  }
,
{ // state 35
0x80000000|439, // match move
0x80000000|1087, // no-match move
0x80000000|1636, // NT-test-match state for slashStar
  }
,
{ // state 36
179,MIN_REDUCTION+207, // $NT
  }
,
{ // state 37
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
131,729, // oneLineComment
132,50, // blockComment
133,66, // doubleSlash
136,1210, // slashStar
149,144, // "/"
MIN_REDUCTION+151, // (default reduction)
  }
,
{ // state 38
0x80000000|1, // match move
0x80000000|1168, // no-match move
0x80000000|67, // NT-test-match state for idChar
  }
,
{ // state 39
179,MIN_REDUCTION+118, // $NT
  }
,
{ // state 40
0x80000000|1161, // match move
0x80000000|74, // no-match move
0x80000000|1594, // NT-test-match state for reserved
  }
,
{ // state 41
0x80000000|583, // match move
0x80000000|825, // no-match move
0x80000000|67, // NT-test-match state for idChar
  }
,
{ // state 42
0x80000000|1047, // match move
0x80000000|1303, // no-match move
0x80000000|65, // NT-test-match state for doubleSlash
  }
,
{ // state 43
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 44
121,787, // "t"
  }
,
{ // state 45
2,816, // white*
MIN_REDUCTION+160, // (default reduction)
  }
,
{ // state 46
179,MIN_REDUCTION+204, // $NT
  }
,
{ // state 47
0x80000000|800, // match move
0x80000000|1753, // no-match move
0x80000000|1636, // NT-test-match state for slashStar
  }
,
{ // state 48
0x80000000|416, // match move
0x80000000|356, // no-match move
0x80000000|1636, // NT-test-match state for slashStar
  }
,
{ // state 49
0x80000000|762, // match move
0x80000000|1847, // no-match move
0x80000000|65, // NT-test-match state for doubleSlash
  }
,
{ // state 50
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 51
0x80000000|1898, // match move
0x80000000|358, // no-match move
0x80000000|1636, // NT-test-match state for slashStar
  }
,
{ // state 52
105,719, // "m"
109,1564, // "f"
120,249, // "n"
  }
,
{ // state 53
120,987, // "n"
  }
,
{ // state 54
103,301, // "d"
  }
,
{ // state 55
179,MIN_REDUCTION+291, // $NT
  }
,
{ // state 56
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
129,493, // eol
130,1783, // comment
164,1076, // {10}
165,1589, // {13}
MIN_REDUCTION+223, // (default reduction)
  }
,
{ // state 57
95,657, // "e"
  }
,
{ // state 58
114,1375, // "u"
  }
,
{ // state 59
0x80000000|431, // match move
0x80000000|1578, // no-match move
0x80000000|1636, // NT-test-match state for slashStar
  }
,
{ // state 60
0x80000000|58, // match move
0x80000000|1761, // no-match move
0x80000000|67, // NT-test-match state for idChar
  }
,
{ // state 61
0x80000000|25, // match move
0x80000000|233, // no-match move
0x80000000|67, // NT-test-match state for idChar
  }
,
{ // state 62
2,603, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
132,50, // blockComment
136,1210, // slashStar
149,1327, // "/"
MIN_REDUCTION+215, // (default reduction)
  }
,
{ // state 63
2,24, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
132,50, // blockComment
136,1210, // slashStar
149,1327, // "/"
MIN_REDUCTION+311, // (default reduction)
  }
,
{ // state 64
0x80000000|80, // match move
0x80000000|1740, // no-match move
0x80000000|1636, // NT-test-match state for slashStar
  }
,
{ // state 65
149,1429, // "/"
  }
,
{ // state 66
0x80000000|1805, // match move
0x80000000|584, // no-match move
0x80000000|1101, // NT-test-match state for printable
  }
,
{ // state 67
89,911, // "c"
90,911, // "l"
91,911, // "a"
92,911, // "s"
95,911, // "e"
100,1997, // letter
101,359, // digit
102,243, // "_"
103,911, // "d"
104,911, // "g"
105,911, // "m"
106,911, // "p"
107,911, // "v"
108,911, // "y"
109,911, // "f"
110,911, // "i"
111,911, // {"A".."Z"}
112,911, // "o"
113,911, // "r"
114,911, // "u"
115,911, // "x"
116,911, // {"j" "q"}
117,911, // "b"
118,911, // "h"
119,911, // "k"
120,911, // "n"
121,911, // "t"
122,911, // "w"
123,911, // "z"
124,374, // {"0".."9"}
  }
,
{ // state 68
0x80000000|1021, // match move
0x80000000|857, // no-match move
0x80000000|1594, // NT-test-match state for reserved
  }
,
{ // state 69
113,32, // "r"
  }
,
{ // state 70
2,262, // white*
MIN_REDUCTION+132, // (default reduction)
  }
,
{ // state 71
2,876, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
129,493, // eol
130,1783, // comment
164,1076, // {10}
165,1589, // {13}
MIN_REDUCTION+176, // (default reduction)
  }
,
{ // state 72
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
132,50, // blockComment
136,1210, // slashStar
149,1327, // "/"
MIN_REDUCTION+211, // (default reduction)
  }
,
{ // state 73
MIN_REDUCTION+121, // (default reduction)
  }
,
{ // state 74
0x80000000|1119, // match move
0x80000000|1683, // no-match move
0x80000000|1636, // NT-test-match state for slashStar
  }
,
{ // state 75
179,MIN_REDUCTION+201, // $NT
  }
,
{ // state 76
0x80000000|430, // match move
0x80000000|1418, // no-match move
0x80000000|1594, // NT-test-match state for reserved
  }
,
{ // state 77
-1, // $$start
-1, // start
-1, // white*
6, // $$0
1070, // token
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
1519, // `!
1705, // `!=
902, // `%
697, // `&&
668, // `*
1850, // `(
1951, // `)
1039, // `{
1042, // `}
1057, // `-
827, // `+
634, // `=
1195, // `==
450, // `[
1462, // `]
407, // `||
2039, // `<
614, // `<=
179, // `,
302, // `>
794, // `>=
33, // `.
985, // `;
958, // `++
428, // `--
1840, // `/
754, // `:
1621, // ID
809, // INT_LITERAL
140, // STRING_LITERAL
1743, // CHAR_LITERAL
663, // "c"
663, // "l"
663, // "a"
663, // "s"
-1, // idChar
-1, // reserved
663, // "e"
1123, // "!"
1508, // "="
414, // "+"
811, // digit++
1701, // letter
1258, // digit
-1, // "_"
663, // "d"
663, // "g"
663, // "m"
663, // "p"
663, // "v"
663, // "y"
663, // "f"
663, // "i"
663, // {"A".."Z"}
663, // "o"
663, // "r"
663, // "u"
663, // "x"
663, // {"j" "q"}
663, // "b"
663, // "h"
663, // "k"
663, // "n"
663, // "t"
663, // "w"
663, // "z"
403, // {"0".."9"}
726, // white
1489, // {12}
1489, // " "
1489, // {9}
1800, // eol
1390, // comment
-1, // oneLineComment
-1, // blockComment
-1, // doubleSlash
-1, // printable**
-1, // printable
-1, // slashStar
-1, // blockCommentContent*
-1, // starSlash
-1, // blockCommentContent
1025, // "["
1015, // "-"
1189, // "<"
458, // "|"
-1, // {"?".."@"}
2034, // "&"
406, // ")"
1964, // ","
177, // "]"
1247, // "/"
-1, // {"#".."$"}
1328, // ";"
562, // ">"
1295, // "{"
1027, // "%"
469, // "("
-1, // "\"
1406, // "."
1667, // ":"
1838, // "}"
-1, // {"^" "`" "~"}
2025, // "'"
673, // '"'
255, // "*"
73, // {10}
1520, // {13}
-1, // stringPrintable
-1, // charPrintable
1569, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
1612, // token*
-1, // printable*
604, // digit+
-1, // idChar*
1166, // letter+
MIN_REDUCTION+3, // $
-1, // $NT
  }
,
{ // state 78
0x80000000|1664, // match move
0x80000000|1122, // no-match move
0x80000000|67, // NT-test-match state for idChar
  }
,
{ // state 79
2,1135, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
131,729, // oneLineComment
132,50, // blockComment
133,66, // doubleSlash
136,1210, // slashStar
149,144, // "/"
MIN_REDUCTION+254, // (default reduction)
  }
,
{ // state 80
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
132,50, // blockComment
136,1210, // slashStar
149,1327, // "/"
MIN_REDUCTION+177, // (default reduction)
  }
,
{ // state 81
179,MIN_REDUCTION+183, // $NT
  }
,
{ // state 82
0x80000000|1922, // match move
0x80000000|2042, // no-match move
0x80000000|1594, // NT-test-match state for reserved
  }
,
{ // state 83
MIN_REDUCTION+124, // (default reduction)
  }
,
{ // state 84
110,882, // "i"
  }
,
{ // state 85
2,978, // white*
125,2043, // white
126,877, // {12}
127,877, // " "
128,877, // {9}
129,1185, // eol
130,994, // comment
131,1236, // oneLineComment
132,838, // blockComment
133,1248, // doubleSlash
136,798, // slashStar
149,144, // "/"
164,1315, // {10}
165,904, // {13}
179,MIN_REDUCTION+248, // $NT
  }
,
{ // state 86
113,364, // "r"
  }
,
{ // state 87
110,1824, // "i"
  }
,
{ // state 88
0x80000000|665, // match move
0x80000000|1172, // no-match move
0x80000000|1636, // NT-test-match state for slashStar
  }
,
{ // state 89
0x80000000|1312, // match move
0x80000000|303, // no-match move
0x80000000|1594, // NT-test-match state for reserved
  }
,
{ // state 90
89,1889, // "c"
90,1889, // "l"
91,1889, // "a"
92,1889, // "s"
93,107, // idChar
95,1889, // "e"
100,1286, // letter
101,410, // digit
102,1324, // "_"
103,1889, // "d"
104,1889, // "g"
105,1889, // "m"
106,1889, // "p"
107,1889, // "v"
108,1889, // "y"
109,1889, // "f"
110,1889, // "i"
111,1889, // {"A".."Z"}
112,1889, // "o"
113,1889, // "r"
114,1889, // "u"
115,1889, // "x"
116,1889, // {"j" "q"}
117,1889, // "b"
118,1889, // "h"
119,1889, // "k"
120,1889, // "n"
121,1889, // "t"
122,1889, // "w"
123,1889, // "z"
124,1146, // {"0".."9"}
  }
,
{ // state 91
0x80000000|1807, // match move
0x80000000|924, // no-match move
0x80000000|1636, // NT-test-match state for slashStar
  }
,
{ // state 92
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
132,50, // blockComment
136,1210, // slashStar
149,1327, // "/"
MIN_REDUCTION+214, // (default reduction)
  }
,
{ // state 93
0x80000000|1, // match move
0x80000000|1066, // no-match move
0x80000000|67, // NT-test-match state for idChar
  }
,
{ // state 94
124,374, // {"0".."9"}
  }
,
{ // state 95
122,522, // "w"
  }
,
{ // state 96
2,1472, // white*
125,2043, // white
126,877, // {12}
127,877, // " "
128,877, // {9}
129,1185, // eol
130,994, // comment
131,1236, // oneLineComment
132,838, // blockComment
133,1248, // doubleSlash
136,798, // slashStar
149,144, // "/"
164,1315, // {10}
165,904, // {13}
179,MIN_REDUCTION+281, // $NT
  }
,
{ // state 97
0x80000000|1812, // match move
0x80000000|585, // no-match move
0x80000000|1636, // NT-test-match state for slashStar
  }
,
{ // state 98
91,570, // "a"
  }
,
{ // state 99
92,525, // "s"
  }
,
{ // state 100
179,MIN_REDUCTION+303, // $NT
  }
,
{ // state 101
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
129,493, // eol
130,1783, // comment
164,1076, // {10}
165,1589, // {13}
MIN_REDUCTION+325, // (default reduction)
  }
,
{ // state 102
95,531, // "e"
  }
,
{ // state 103
89,309, // "c"
  }
,
{ // state 104
0x80000000|362, // match move
0x80000000|568, // no-match move
0x80000000|65, // NT-test-match state for doubleSlash
  }
,
{ // state 105
120,964, // "n"
  }
,
{ // state 106
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
132,50, // blockComment
136,1210, // slashStar
149,1327, // "/"
MIN_REDUCTION+173, // (default reduction)
  }
,
{ // state 107
0x80000000|920, // match move
0x80000000|1316, // no-match move
0x80000000|67, // NT-test-match state for idChar
  }
,
{ // state 108
2,1634, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
132,50, // blockComment
136,1210, // slashStar
149,1327, // "/"
169,1744, // idChar**
170,1450, // $$1
176,1477, // idChar*
MIN_REDUCTION+337, // (default reduction)
  }
,
{ // state 109
MIN_REDUCTION+307, // (default reduction)
  }
,
{ // state 110
109,651, // "f"
  }
,
{ // state 111
97,965, // "="
  }
,
{ // state 112
2,205, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
131,729, // oneLineComment
132,50, // blockComment
133,66, // doubleSlash
136,1210, // slashStar
149,144, // "/"
MIN_REDUCTION+156, // (default reduction)
  }
,
{ // state 113
MIN_REDUCTION+39, // (default reduction)
  }
,
{ // state 114
121,17, // "t"
  }
,
{ // state 115
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
131,729, // oneLineComment
132,50, // blockComment
133,66, // doubleSlash
136,1210, // slashStar
149,144, // "/"
MIN_REDUCTION+235, // (default reduction)
  }
,
{ // state 116
2,347, // white*
125,2043, // white
126,877, // {12}
127,877, // " "
128,877, // {9}
129,1185, // eol
130,994, // comment
131,1236, // oneLineComment
132,838, // blockComment
133,1248, // doubleSlash
136,798, // slashStar
149,144, // "/"
164,1315, // {10}
165,904, // {13}
179,MIN_REDUCTION+200, // $NT
  }
,
{ // state 117
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
131,729, // oneLineComment
132,50, // blockComment
133,66, // doubleSlash
136,1210, // slashStar
149,144, // "/"
MIN_REDUCTION+241, // (default reduction)
  }
,
{ // state 118
2,216, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
131,729, // oneLineComment
132,50, // blockComment
133,66, // doubleSlash
136,1210, // slashStar
149,144, // "/"
MIN_REDUCTION+188, // (default reduction)
  }
,
{ // state 119
0x80000000|758, // match move
0x80000000|1531, // no-match move
0x80000000|1636, // NT-test-match state for slashStar
  }
,
{ // state 120
0x80000000|1, // match move
0x80000000|873, // no-match move
0x80000000|67, // NT-test-match state for idChar
  }
,
{ // state 121
95,1811, // "e"
  }
,
{ // state 122
2,932, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
129,493, // eol
130,1783, // comment
164,1076, // {10}
165,1589, // {13}
MIN_REDUCTION+365, // (default reduction)
  }
,
{ // state 123
0x80000000|959, // match move
0x80000000|1261, // no-match move
0x80000000|1636, // NT-test-match state for slashStar
  }
,
{ // state 124
0x80000000|1939, // match move
0x80000000|1968, // no-match move
0x80000000|1594, // NT-test-match state for reserved
  }
,
{ // state 125
95,418, // "e"
  }
,
{ // state 126
0x80000000|1331, // match move
0x80000000|743, // no-match move
0x80000000|1594, // NT-test-match state for reserved
  }
,
{ // state 127
MIN_REDUCTION+122, // (default reduction)
  }
,
{ // state 128
MIN_REDUCTION+217, // (default reduction)
  }
,
{ // state 129
120,646, // "n"
  }
,
{ // state 130
0x80000000|1, // match move
0x80000000|906, // no-match move
0x80000000|67, // NT-test-match state for idChar
  }
,
{ // state 131
MIN_REDUCTION+19, // (default reduction)
  }
,
{ // state 132
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
132,50, // blockComment
136,1210, // slashStar
149,1327, // "/"
MIN_REDUCTION+151, // (default reduction)
  }
,
{ // state 133
2,1031, // white*
125,2043, // white
126,877, // {12}
127,877, // " "
128,877, // {9}
129,1185, // eol
130,994, // comment
131,1236, // oneLineComment
132,838, // blockComment
133,1248, // doubleSlash
136,798, // slashStar
149,144, // "/"
164,1315, // {10}
165,904, // {13}
179,MIN_REDUCTION+191, // $NT
  }
,
{ // state 134
2,49, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
132,50, // blockComment
136,1210, // slashStar
149,1327, // "/"
MIN_REDUCTION+233, // (default reduction)
  }
,
{ // state 135
0x80000000|1215, // match move
0x80000000|1820, // no-match move
0x80000000|65, // NT-test-match state for doubleSlash
  }
,
{ // state 136
MIN_REDUCTION+167, // (default reduction)
  }
,
{ // state 137
MIN_REDUCTION+29, // (default reduction)
  }
,
{ // state 138
89,738, // "c"
90,738, // "l"
91,738, // "a"
92,738, // "s"
95,738, // "e"
96,738, // "!"
97,738, // "="
98,738, // "+"
102,738, // "_"
103,738, // "d"
104,738, // "g"
105,738, // "m"
106,738, // "p"
107,738, // "v"
108,738, // "y"
109,738, // "f"
110,738, // "i"
111,738, // {"A".."Z"}
112,738, // "o"
113,738, // "r"
114,738, // "u"
115,738, // "x"
116,738, // {"j" "q"}
117,738, // "b"
118,738, // "h"
119,738, // "k"
120,738, // "n"
121,738, // "t"
122,738, // "w"
123,738, // "z"
124,738, // {"0".."9"}
127,738, // " "
128,738, // {9}
129,1246, // eol
138,1905, // starSlash
139,453, // blockCommentContent
140,738, // "["
141,738, // "-"
142,738, // "<"
143,738, // "|"
144,738, // {"?".."@"}
145,738, // "&"
146,738, // ")"
147,738, // ","
148,738, // "]"
149,738, // "/"
150,738, // {"#".."$"}
151,738, // ";"
152,738, // ">"
153,738, // "{"
154,738, // "%"
155,738, // "("
156,738, // "\"
157,738, // "."
158,738, // ":"
159,738, // "}"
160,738, // {"^" "`" "~"}
161,738, // "'"
162,738, // '"'
163,865, // "*"
164,352, // {10}
165,376, // {13}
  }
,
{ // state 139
179,MIN_REDUCTION+252, // $NT
  }
,
{ // state 140
MIN_REDUCTION+87, // (default reduction)
  }
,
{ // state 141
0x80000000|1694, // match move
0x80000000|1367, // no-match move
0x80000000|1636, // NT-test-match state for slashStar
  }
,
{ // state 142
95,765, // "e"
  }
,
{ // state 143
2,671, // white*
125,2043, // white
126,877, // {12}
127,877, // " "
128,877, // {9}
129,1185, // eol
130,994, // comment
131,1236, // oneLineComment
132,838, // blockComment
133,1248, // doubleSlash
136,798, // slashStar
149,144, // "/"
164,1315, // {10}
165,904, // {13}
179,MIN_REDUCTION+332, // $NT
  }
,
{ // state 144
149,448, // "/"
163,1869, // "*"
  }
,
{ // state 145
95,296, // "e"
  }
,
{ // state 146
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
131,729, // oneLineComment
132,50, // blockComment
133,66, // doubleSlash
136,1210, // slashStar
149,144, // "/"
MIN_REDUCTION+217, // (default reduction)
  }
,
{ // state 147
0x80000000|1622, // match move
0x80000000|77, // no-match move
0x80000000|1636, // NT-test-match state for slashStar
  }
,
{ // state 148
2,1547, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
132,50, // blockComment
136,1210, // slashStar
149,1327, // "/"
MIN_REDUCTION+227, // (default reduction)
  }
,
{ // state 149
2,1535, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
132,50, // blockComment
136,1210, // slashStar
149,1327, // "/"
MIN_REDUCTION+266, // (default reduction)
  }
,
{ // state 150
121,612, // "t"
  }
,
{ // state 151
0x80000000|1467, // match move
0x80000000|42, // no-match move
0x80000000|67, // NT-test-match state for idChar
  }
,
{ // state 152
0x80000000|926, // match move
0x80000000|1035, // no-match move
0x80000000|1594, // NT-test-match state for reserved
  }
,
{ // state 153
121,881, // "t"
  }
,
{ // state 154
125,808, // white
126,877, // {12}
127,877, // " "
128,877, // {9}
129,1185, // eol
130,994, // comment
131,1236, // oneLineComment
132,838, // blockComment
133,1248, // doubleSlash
136,798, // slashStar
149,144, // "/"
164,1315, // {10}
165,904, // {13}
179,MIN_REDUCTION+253, // $NT
  }
,
{ // state 155
2,1766, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
129,493, // eol
130,1783, // comment
164,1076, // {10}
165,1589, // {13}
MIN_REDUCTION+140, // (default reduction)
  }
,
{ // state 156
0x80000000|1393, // match move
0x80000000|707, // no-match move
0x80000000|1594, // NT-test-match state for reserved
  }
,
{ // state 157
179,MIN_REDUCTION+261, // $NT
  }
,
{ // state 158
2,1518, // white*
125,2043, // white
126,877, // {12}
127,877, // " "
128,877, // {9}
129,1185, // eol
130,994, // comment
131,1236, // oneLineComment
132,838, // blockComment
133,1248, // doubleSlash
136,798, // slashStar
149,144, // "/"
164,1315, // {10}
165,904, // {13}
179,MIN_REDUCTION+287, // $NT
  }
,
{ // state 159
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
129,493, // eol
130,1783, // comment
164,1076, // {10}
165,1589, // {13}
MIN_REDUCTION+139, // (default reduction)
  }
,
{ // state 160
95,1610, // "e"
  }
,
{ // state 161
0x80000000|1, // match move
0x80000000|823, // no-match move
0x80000000|67, // NT-test-match state for idChar
  }
,
{ // state 162
2,205, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
132,50, // blockComment
136,1210, // slashStar
149,1327, // "/"
MIN_REDUCTION+156, // (default reduction)
  }
,
{ // state 163
179,MIN_REDUCTION+91, // $NT
  }
,
{ // state 164
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
129,493, // eol
130,1783, // comment
164,1076, // {10}
165,1589, // {13}
MIN_REDUCTION+141, // (default reduction)
  }
,
{ // state 165
2,569, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
131,729, // oneLineComment
132,50, // blockComment
133,66, // doubleSlash
136,1210, // slashStar
149,144, // "/"
MIN_REDUCTION+341, // (default reduction)
  }
,
{ // state 166
2,1112, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
132,50, // blockComment
136,1210, // slashStar
149,1327, // "/"
MIN_REDUCTION+281, // (default reduction)
  }
,
{ // state 167
110,468, // "i"
  }
,
{ // state 168
0x80000000|134, // match move
0x80000000|357, // no-match move
0x80000000|1636, // NT-test-match state for slashStar
  }
,
{ // state 169
90,631, // "l"
  }
,
{ // state 170
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
132,50, // blockComment
136,1210, // slashStar
149,1327, // "/"
MIN_REDUCTION+265, // (default reduction)
  }
,
{ // state 171
110,1757, // "i"
  }
,
{ // state 172
2,722, // white*
125,2043, // white
126,877, // {12}
127,877, // " "
128,877, // {9}
129,1185, // eol
130,994, // comment
131,1236, // oneLineComment
132,838, // blockComment
133,1248, // doubleSlash
136,798, // slashStar
149,144, // "/"
164,1315, // {10}
165,904, // {13}
179,MIN_REDUCTION+326, // $NT
  }
,
{ // state 173
2,1639, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
132,50, // blockComment
136,1210, // slashStar
149,1327, // "/"
MIN_REDUCTION+212, // (default reduction)
  }
,
{ // state 174
MIN_REDUCTION+208, // (default reduction)
  }
,
{ // state 175
0x80000000|1361, // match move
0x80000000|1126, // no-match move
0x80000000|1636, // NT-test-match state for slashStar
  }
,
{ // state 176
MIN_REDUCTION+137, // (default reduction)
  }
,
{ // state 177
0x80000000|112, // match move
0x80000000|291, // no-match move
0x80000000|65, // NT-test-match state for doubleSlash
  }
,
{ // state 178
2,490, // white*
125,2043, // white
126,877, // {12}
127,877, // " "
128,877, // {9}
129,1185, // eol
130,994, // comment
131,1236, // oneLineComment
132,838, // blockComment
133,1248, // doubleSlash
136,798, // slashStar
149,144, // "/"
164,1315, // {10}
165,904, // {13}
179,MIN_REDUCTION+275, // $NT
  }
,
{ // state 179
MIN_REDUCTION+76, // (default reduction)
  }
,
{ // state 180
MIN_REDUCTION+35, // (default reduction)
  }
,
{ // state 181
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
132,50, // blockComment
136,1210, // slashStar
149,1327, // "/"
MIN_REDUCTION+232, // (default reduction)
  }
,
{ // state 182
92,601, // "s"
  }
,
{ // state 183
92,1775, // "s"
  }
,
{ // state 184
MIN_REDUCTION+259, // (default reduction)
  }
,
{ // state 185
95,956, // "e"
  }
,
{ // state 186
0x80000000|1577, // match move
0x80000000|175, // no-match move
0x80000000|1594, // NT-test-match state for reserved
  }
,
{ // state 187
0x80000000|1991, // match move
0x80000000|1949, // no-match move
0x80000000|1594, // NT-test-match state for reserved
  }
,
{ // state 188
0x80000000|1, // match move
0x80000000|294, // no-match move
0x80000000|67, // NT-test-match state for idChar
  }
,
{ // state 189
0x80000000|941, // match move
0x80000000|344, // no-match move
0x80000000|65, // NT-test-match state for doubleSlash
  }
,
{ // state 190
125,808, // white
126,877, // {12}
127,877, // " "
128,877, // {9}
129,1185, // eol
130,994, // comment
131,1236, // oneLineComment
132,838, // blockComment
133,1248, // doubleSlash
136,798, // slashStar
149,144, // "/"
164,1315, // {10}
165,904, // {13}
179,MIN_REDUCTION+322, // $NT
  }
,
{ // state 191
2,1460, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
132,50, // blockComment
136,1210, // slashStar
149,1327, // "/"
MIN_REDUCTION+134, // (default reduction)
  }
,
{ // state 192
2,709, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
129,493, // eol
130,1783, // comment
164,1076, // {10}
165,1589, // {13}
MIN_REDUCTION+206, // (default reduction)
  }
,
{ // state 193
0x80000000|908, // match move
0x80000000|1914, // no-match move
0x80000000|65, // NT-test-match state for doubleSlash
  }
,
{ // state 194
MIN_REDUCTION+135, // (default reduction)
  }
,
{ // state 195
MIN_REDUCTION+25, // (default reduction)
  }
,
{ // state 196
0x80000000|1, // match move
0x80000000|279, // no-match move
0x80000000|67, // NT-test-match state for idChar
  }
,
{ // state 197
121,927, // "t"
  }
,
{ // state 198
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 199
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
129,493, // eol
130,1783, // comment
164,1076, // {10}
165,1589, // {13}
MIN_REDUCTION+145, // (default reduction)
  }
,
{ // state 200
91,1536, // "a"
108,1882, // "y"
114,1491, // "u"
  }
,
{ // state 201
179,MIN_REDUCTION+297, // $NT
  }
,
{ // state 202
3,6, // $$0
4,1070, // token
5,442, // `boolean
6,750, // `class
7,691, // `extends
8,234, // `void
9,1117, // `int
10,333, // `while
11,360, // `if
12,764, // `else
13,1150, // `for
14,2002, // `break
15,324, // `this
16,391, // `false
17,280, // `true
18,929, // `super
19,131, // `null
20,711, // `return
21,1359, // `instanceof
22,2033, // `new
23,1140, // `abstract
24,480, // `assert
25,195, // `byte
26,545, // `case
27,1570, // `catch
28,991, // `char
29,137, // `const
30,323, // `continue
31,1962, // `default
32,1396, // `do
33,2015, // `double
34,660, // `enum
35,180, // `final
36,283, // `finally
37,686, // `float
38,1755, // `goto
39,113, // `implements
40,242, // `import
41,869, // `interface
42,1285, // `long
43,550, // `native
44,1114, // `package
45,1404, // `private
46,679, // `protected
47,43, // `public
48,1437, // `short
49,1192, // `static
50,340, // `strictfp
51,554, // `switch
52,774, // `synchronized
53,828, // `throw
54,378, // `throws
55,1060, // `transient
56,275, // `try
57,436, // `volatile
89,354, // "c"
90,1788, // "l"
91,1061, // "a"
92,1763, // "s"
95,640, // "e"
103,224, // "d"
104,1716, // "g"
106,1688, // "p"
107,1141, // "v"
109,308, // "f"
110,52, // "i"
113,274, // "r"
117,1003, // "b"
120,482, // "n"
121,896, // "t"
122,1394, // "w"
173,1612, // token*
MIN_REDUCTION+3, // (default reduction)
  }
,
{ // state 203
0x80000000|867, // match move
0x80000000|1910, // no-match move
0x80000000|1101, // NT-test-match state for printable
  }
,
{ // state 204
0x80000000|1697, // match move
0x80000000|1090, // no-match move
0x80000000|1636, // NT-test-match state for slashStar
  }
,
{ // state 205
0x80000000|1851, // match move
0x80000000|126, // no-match move
0x80000000|65, // NT-test-match state for doubleSlash
  }
,
{ // state 206
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
131,729, // oneLineComment
132,50, // blockComment
133,66, // doubleSlash
136,1210, // slashStar
149,144, // "/"
MIN_REDUCTION+133, // (default reduction)
  }
,
{ // state 207
2,390, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
132,50, // blockComment
136,1210, // slashStar
149,1327, // "/"
MIN_REDUCTION+100, // (default reduction)
  }
,
{ // state 208
121,1809, // "t"
  }
,
{ // state 209
0x80000000|542, // match move
0x80000000|212, // no-match move
0x80000000|1636, // NT-test-match state for slashStar
  }
,
{ // state 210
0x80000000|501, // match move
0x80000000|236, // no-match move
0x80000000|65, // NT-test-match state for doubleSlash
  }
,
{ // state 211
0x80000000|1092, // match move
0x80000000|28, // no-match move
0x80000000|1594, // NT-test-match state for reserved
  }
,
{ // state 212
2,104, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
129,493, // eol
130,1783, // comment
164,1076, // {10}
165,1589, // {13}
MIN_REDUCTION+332, // (default reduction)
  }
,
{ // state 213
91,1411, // "a"
  }
,
{ // state 214
2,1198, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
131,729, // oneLineComment
132,50, // blockComment
133,66, // doubleSlash
136,1210, // slashStar
149,144, // "/"
MIN_REDUCTION+221, // (default reduction)
  }
,
{ // state 215
0x80000000|1237, // match move
0x80000000|1480, // no-match move
0x80000000|1636, // NT-test-match state for slashStar
  }
,
{ // state 216
0x80000000|1305, // match move
0x80000000|1454, // no-match move
0x80000000|65, // NT-test-match state for doubleSlash
  }
,
{ // state 217
0x80000000|1, // match move
0x80000000|226, // no-match move
0x80000000|67, // NT-test-match state for idChar
  }
,
{ // state 218
1,579, // start
2,1659, // white*
3,1878, // $$0
4,1070, // token
125,1580, // white
126,1489, // {12}
127,1489, // " "
128,1489, // {9}
130,1390, // comment
132,1121, // blockComment
136,1532, // slashStar
149,1327, // "/"
173,1612, // token*
178,MIN_REDUCTION+1, // $
  }
,
{ // state 219
0x80000000|946, // match move
0x80000000|1819, // no-match move
0x80000000|65, // NT-test-match state for doubleSlash
  }
,
{ // state 220
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
129,493, // eol
130,1783, // comment
164,1076, // {10}
165,1589, // {13}
MIN_REDUCTION+247, // (default reduction)
  }
,
{ // state 221
2,1887, // white*
MIN_REDUCTION+142, // (default reduction)
  }
,
{ // state 222
92,1466, // "s"
  }
,
{ // state 223
125,808, // white
126,877, // {12}
127,877, // " "
128,877, // {9}
129,1185, // eol
130,994, // comment
131,1236, // oneLineComment
132,838, // blockComment
133,1248, // doubleSlash
136,798, // slashStar
149,144, // "/"
164,1315, // {10}
165,904, // {13}
179,MIN_REDUCTION+89, // $NT
  }
,
{ // state 224
95,1464, // "e"
112,60, // "o"
  }
,
{ // state 225
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 226
0x80000000|118, // match move
0x80000000|901, // no-match move
0x80000000|65, // NT-test-match state for doubleSlash
  }
,
{ // state 227
MIN_REDUCTION+199, // (default reduction)
  }
,
{ // state 228
0x80000000|1, // match move
0x80000000|807, // no-match move
0x80000000|67, // NT-test-match state for idChar
  }
,
{ // state 229
0x80000000|1293, // match move
0x80000000|1620, // no-match move
0x80000000|1636, // NT-test-match state for slashStar
  }
,
{ // state 230
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
132,50, // blockComment
136,1210, // slashStar
149,1327, // "/"
MIN_REDUCTION+193, // (default reduction)
  }
,
{ // state 231
2,1342, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
129,493, // eol
130,1783, // comment
164,1076, // {10}
165,1589, // {13}
MIN_REDUCTION+197, // (default reduction)
  }
,
{ // state 232
2,216, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
132,50, // blockComment
136,1210, // slashStar
149,1327, // "/"
MIN_REDUCTION+188, // (default reduction)
  }
,
{ // state 233
2,1853, // white*
125,2043, // white
126,877, // {12}
127,877, // " "
128,877, // {9}
129,1185, // eol
130,994, // comment
131,1236, // oneLineComment
132,838, // blockComment
133,1248, // doubleSlash
136,798, // slashStar
149,144, // "/"
164,1315, // {10}
165,904, // {13}
179,MIN_REDUCTION+257, // $NT
  }
,
{ // state 234
MIN_REDUCTION+8, // (default reduction)
  }
,
{ // state 235
2,1259, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
132,50, // blockComment
136,1210, // slashStar
149,1327, // "/"
MIN_REDUCTION+293, // (default reduction)
  }
,
{ // state 236
0x80000000|1661, // match move
0x80000000|349, // no-match move
0x80000000|1636, // NT-test-match state for slashStar
  }
,
{ // state 237
MIN_REDUCTION+171, // (default reduction)
  }
,
{ // state 238
0x80000000|1923, // match move
0x80000000|1940, // no-match move
0x80000000|1594, // NT-test-match state for reserved
  }
,
{ // state 239
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
129,493, // eol
130,1783, // comment
164,1076, // {10}
165,1589, // {13}
MIN_REDUCTION+181, // (default reduction)
  }
,
{ // state 240
125,808, // white
126,877, // {12}
127,877, // " "
128,877, // {9}
129,1185, // eol
130,994, // comment
131,1236, // oneLineComment
132,838, // blockComment
133,1248, // doubleSlash
136,798, // slashStar
149,144, // "/"
164,1315, // {10}
165,904, // {13}
179,MIN_REDUCTION+304, // $NT
  }
,
{ // state 241
103,1977, // "d"
  }
,
{ // state 242
MIN_REDUCTION+40, // (default reduction)
  }
,
{ // state 243
179,MIN_REDUCTION+103, // $NT
  }
,
{ // state 244
125,808, // white
126,877, // {12}
127,877, // " "
128,877, // {9}
129,1185, // eol
130,994, // comment
131,1236, // oneLineComment
132,838, // blockComment
133,1248, // doubleSlash
136,798, // slashStar
149,144, // "/"
164,1315, // {10}
165,904, // {13}
179,MIN_REDUCTION+202, // $NT
  }
,
{ // state 245
MIN_REDUCTION+114, // (default reduction)
  }
,
{ // state 246
0x80000000|1684, // match move
0x80000000|1699, // no-match move
0x80000000|1594, // NT-test-match state for reserved
  }
,
{ // state 247
95,1011, // "e"
  }
,
{ // state 248
89,120, // "c"
  }
,
{ // state 249
92,1967, // "s"
121,41, // "t"
  }
,
{ // state 250
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
132,50, // blockComment
136,1210, // slashStar
149,1327, // "/"
MIN_REDUCTION+310, // (default reduction)
  }
,
{ // state 251
92,1631, // "s"
  }
,
{ // state 252
2,390, // white*
MIN_REDUCTION+100, // (default reduction)
  }
,
{ // state 253
0x80000000|748, // match move
0x80000000|1097, // no-match move
0x80000000|1594, // NT-test-match state for reserved
  }
,
{ // state 254
89,605, // "c"
  }
,
{ // state 255
0x80000000|1354, // match move
0x80000000|986, // no-match move
0x80000000|65, // NT-test-match state for doubleSlash
  }
,
{ // state 256
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
131,729, // oneLineComment
132,50, // blockComment
133,66, // doubleSlash
136,1210, // slashStar
149,144, // "/"
MIN_REDUCTION+147, // (default reduction)
  }
,
{ // state 257
2,401, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
129,493, // eol
130,1783, // comment
164,1076, // {10}
165,1589, // {13}
MIN_REDUCTION+194, // (default reduction)
  }
,
{ // state 258
129,MIN_REDUCTION+120, // eol
164,MIN_REDUCTION+120, // {10}
165,MIN_REDUCTION+120, // {13}
MIN_REDUCTION+120, // (default reduction)
  }
,
{ // state 259
2,318, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
131,729, // oneLineComment
132,50, // blockComment
133,66, // doubleSlash
136,1210, // slashStar
149,144, // "/"
MIN_REDUCTION+269, // (default reduction)
  }
,
{ // state 260
0x80000000|1, // match move
0x80000000|1387, // no-match move
0x80000000|67, // NT-test-match state for idChar
  }
,
{ // state 261
MIN_REDUCTION+119, // (default reduction)
  }
,
{ // state 262
0x80000000|1488, // match move
0x80000000|370, // no-match move
0x80000000|65, // NT-test-match state for doubleSlash
  }
,
{ // state 263
121,998, // "t"
  }
,
{ // state 264
110,499, // "i"
  }
,
{ // state 265
0x80000000|541, // match move
0x80000000|1030, // no-match move
0x80000000|1594, // NT-test-match state for reserved
  }
,
{ // state 266
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
129,493, // eol
130,1783, // comment
164,1076, // {10}
165,1589, // {13}
MIN_REDUCTION+97, // (default reduction)
  }
,
{ // state 267
89,MIN_REDUCTION+356, // "c"
90,MIN_REDUCTION+356, // "l"
91,MIN_REDUCTION+356, // "a"
92,MIN_REDUCTION+356, // "s"
95,MIN_REDUCTION+356, // "e"
102,MIN_REDUCTION+356, // "_"
103,MIN_REDUCTION+356, // "d"
104,MIN_REDUCTION+356, // "g"
105,MIN_REDUCTION+356, // "m"
106,MIN_REDUCTION+356, // "p"
107,MIN_REDUCTION+356, // "v"
108,MIN_REDUCTION+356, // "y"
109,MIN_REDUCTION+356, // "f"
110,MIN_REDUCTION+356, // "i"
111,MIN_REDUCTION+356, // {"A".."Z"}
112,MIN_REDUCTION+356, // "o"
113,MIN_REDUCTION+356, // "r"
114,MIN_REDUCTION+356, // "u"
115,MIN_REDUCTION+356, // "x"
116,MIN_REDUCTION+356, // {"j" "q"}
117,MIN_REDUCTION+356, // "b"
118,MIN_REDUCTION+356, // "h"
119,MIN_REDUCTION+356, // "k"
120,MIN_REDUCTION+356, // "n"
121,MIN_REDUCTION+356, // "t"
122,MIN_REDUCTION+356, // "w"
123,MIN_REDUCTION+356, // "z"
124,MIN_REDUCTION+356, // {"0".."9"}
169,MIN_REDUCTION+356, // idChar**
MIN_REDUCTION+356, // (default reduction)
  }
,
{ // state 268
2,932, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
132,50, // blockComment
136,1210, // slashStar
149,1327, // "/"
MIN_REDUCTION+365, // (default reduction)
  }
,
{ // state 269
90,690, // "l"
  }
,
{ // state 270
0x80000000|524, // match move
0x80000000|1880, // no-match move
0x80000000|65, // NT-test-match state for doubleSlash
  }
,
{ // state 271
91,903, // "a"
  }
,
{ // state 272
2,603, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
129,493, // eol
130,1783, // comment
164,1076, // {10}
165,1589, // {13}
MIN_REDUCTION+215, // (default reduction)
  }
,
{ // state 273
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
129,493, // eol
130,1783, // comment
164,1076, // {10}
165,1589, // {13}
MIN_REDUCTION+340, // (default reduction)
  }
,
{ // state 274
95,1913, // "e"
  }
,
{ // state 275
MIN_REDUCTION+56, // (default reduction)
  }
,
{ // state 276
0x80000000|799, // match move
0x80000000|164, // no-match move
0x80000000|1636, // NT-test-match state for slashStar
  }
,
{ // state 277
91,53, // "a"
  }
,
{ // state 278
0x80000000|1, // match move
0x80000000|1389, // no-match move
0x80000000|67, // NT-test-match state for idChar
  }
,
{ // state 279
0x80000000|694, // match move
0x80000000|1461, // no-match move
0x80000000|65, // NT-test-match state for doubleSlash
  }
,
{ // state 280
MIN_REDUCTION+17, // (default reduction)
  }
,
{ // state 281
89,1252, // "c"
  }
,
{ // state 282
MIN_REDUCTION+211, // (default reduction)
  }
,
{ // state 283
MIN_REDUCTION+36, // (default reduction)
  }
,
{ // state 284
0x80000000|833, // match move
0x80000000|421, // no-match move
0x80000000|65, // NT-test-match state for doubleSlash
  }
,
{ // state 285
2,704, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
131,729, // oneLineComment
132,50, // blockComment
133,66, // doubleSlash
136,1210, // slashStar
149,144, // "/"
MIN_REDUCTION+302, // (default reduction)
  }
,
{ // state 286
0x80000000|342, // match move
0x80000000|141, // no-match move
0x80000000|65, // NT-test-match state for doubleSlash
  }
,
{ // state 287
114,1731, // "u"
  }
,
{ // state 288
106,730, // "p"
  }
,
{ // state 289
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
132,50, // blockComment
136,1210, // slashStar
149,1327, // "/"
MIN_REDUCTION+301, // (default reduction)
  }
,
{ // state 290
0x80000000|45, // match move
0x80000000|887, // no-match move
0x80000000|1594, // NT-test-match state for reserved
  }
,
{ // state 291
0x80000000|1064, // match move
0x80000000|2041, // no-match move
0x80000000|1594, // NT-test-match state for reserved
  }
,
{ // state 292
106,1290, // "p"
  }
,
{ // state 293
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
132,50, // blockComment
136,1210, // slashStar
149,1327, // "/"
MIN_REDUCTION+159, // (default reduction)
  }
,
{ // state 294
0x80000000|632, // match move
0x80000000|123, // no-match move
0x80000000|65, // NT-test-match state for doubleSlash
  }
,
{ // state 295
0x80000000|645, // match move
0x80000000|1073, // no-match move
0x80000000|1636, // NT-test-match state for slashStar
  }
,
{ // state 296
0x80000000|1, // match move
0x80000000|736, // no-match move
0x80000000|67, // NT-test-match state for idChar
  }
,
{ // state 297
163,39, // "*"
  }
,
{ // state 298
2,709, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
132,50, // blockComment
136,1210, // slashStar
149,1327, // "/"
MIN_REDUCTION+206, // (default reduction)
  }
,
{ // state 299
2,49, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
131,729, // oneLineComment
132,50, // blockComment
133,66, // doubleSlash
136,1210, // slashStar
149,144, // "/"
MIN_REDUCTION+233, // (default reduction)
  }
,
{ // state 300
125,808, // white
126,877, // {12}
127,877, // " "
128,877, // {9}
129,1185, // eol
130,994, // comment
131,1236, // oneLineComment
132,838, // blockComment
133,1248, // doubleSlash
136,798, // slashStar
149,144, // "/"
164,1315, // {10}
165,904, // {13}
179,MIN_REDUCTION+328, // $NT
  }
,
{ // state 301
0x80000000|1, // match move
0x80000000|210, // no-match move
0x80000000|67, // NT-test-match state for idChar
  }
,
{ // state 302
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 303
0x80000000|1130, // match move
0x80000000|363, // no-match move
0x80000000|1636, // NT-test-match state for slashStar
  }
,
{ // state 304
0x80000000|841, // match move
0x80000000|1575, // no-match move
0x80000000|1636, // NT-test-match state for slashStar
  }
,
{ // state 305
0x80000000|682, // match move
0x80000000|582, // no-match move
0x80000000|1594, // NT-test-match state for reserved
  }
,
{ // state 306
0x80000000|299, // match move
0x80000000|168, // no-match move
0x80000000|65, // NT-test-match state for doubleSlash
  }
,
{ // state 307
0x80000000|1, // match move
0x80000000|688, // no-match move
0x80000000|67, // NT-test-match state for idChar
  }
,
{ // state 308
90,2012, // "l"
91,269, // "a"
110,635, // "i"
112,69, // "o"
  }
,
{ // state 309
118,515, // "h"
  }
,
{ // state 310
2,569, // white*
MIN_REDUCTION+341, // (default reduction)
  }
,
{ // state 311
MIN_REDUCTION+120, // (default reduction)
  }
,
{ // state 312
2,1547, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
131,729, // oneLineComment
132,50, // blockComment
133,66, // doubleSlash
136,1210, // slashStar
149,144, // "/"
MIN_REDUCTION+227, // (default reduction)
  }
,
{ // state 313
0x80000000|741, // match move
0x80000000|1745, // no-match move
0x80000000|67, // NT-test-match state for idChar
  }
,
{ // state 314
2,1766, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
132,50, // blockComment
136,1210, // slashStar
149,1327, // "/"
MIN_REDUCTION+140, // (default reduction)
  }
,
{ // state 315
91,15, // "a"
  }
,
{ // state 316
0x80000000|380, // match move
0x80000000|925, // no-match move
0x80000000|1101, // NT-test-match state for printable
  }
,
{ // state 317
125,808, // white
126,877, // {12}
127,877, // " "
128,877, // {9}
129,1185, // eol
130,994, // comment
131,1236, // oneLineComment
132,838, // blockComment
133,1248, // doubleSlash
136,798, // slashStar
149,144, // "/"
164,1315, // {10}
165,904, // {13}
179,MIN_REDUCTION+307, // $NT
  }
,
{ // state 318
0x80000000|724, // match move
0x80000000|89, // no-match move
0x80000000|65, // NT-test-match state for doubleSlash
  }
,
{ // state 319
2,219, // white*
MIN_REDUCTION+172, // (default reduction)
  }
,
{ // state 320
2,1476, // white*
125,2043, // white
126,877, // {12}
127,877, // " "
128,877, // {9}
129,1185, // eol
130,994, // comment
131,1236, // oneLineComment
132,838, // blockComment
133,1248, // doubleSlash
136,798, // slashStar
149,144, // "/"
164,1315, // {10}
165,904, // {13}
179,MIN_REDUCTION+311, // $NT
  }
,
{ // state 321
0x80000000|1048, // match move
0x80000000|1952, // no-match move
0x80000000|1636, // NT-test-match state for slashStar
  }
,
{ // state 322
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
132,50, // blockComment
136,1210, // slashStar
149,1327, // "/"
MIN_REDUCTION+328, // (default reduction)
  }
,
{ // state 323
MIN_REDUCTION+30, // (default reduction)
  }
,
{ // state 324
MIN_REDUCTION+15, // (default reduction)
  }
,
{ // state 325
1,579, // start
2,1659, // white*
3,1878, // $$0
4,1070, // token
5,442, // `boolean
6,750, // `class
7,691, // `extends
8,234, // `void
9,1117, // `int
10,333, // `while
11,360, // `if
12,764, // `else
13,1150, // `for
14,2002, // `break
15,324, // `this
16,391, // `false
17,280, // `true
18,929, // `super
19,131, // `null
20,711, // `return
21,1359, // `instanceof
22,2033, // `new
23,1140, // `abstract
24,480, // `assert
25,195, // `byte
26,545, // `case
27,1570, // `catch
28,991, // `char
29,137, // `const
30,323, // `continue
31,1962, // `default
32,1396, // `do
33,2015, // `double
34,660, // `enum
35,180, // `final
36,283, // `finally
37,686, // `float
38,1755, // `goto
39,113, // `implements
40,242, // `import
41,869, // `interface
42,1285, // `long
43,550, // `native
44,1114, // `package
45,1404, // `private
46,679, // `protected
47,43, // `public
48,1437, // `short
49,1192, // `static
50,340, // `strictfp
51,554, // `switch
52,774, // `synchronized
53,828, // `throw
54,378, // `throws
55,1060, // `transient
56,275, // `try
57,436, // `volatile
89,354, // "c"
90,1788, // "l"
91,1061, // "a"
92,1763, // "s"
95,640, // "e"
103,224, // "d"
104,1716, // "g"
106,1688, // "p"
107,1141, // "v"
109,308, // "f"
110,52, // "i"
113,274, // "r"
117,1003, // "b"
120,482, // "n"
121,896, // "t"
122,1394, // "w"
173,1612, // token*
178,MIN_REDUCTION+1, // $
  }
,
{ // state 326
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
129,493, // eol
130,1783, // comment
164,1076, // {10}
165,1589, // {13}
MIN_REDUCTION+298, // (default reduction)
  }
,
{ // state 327
2,2013, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
129,493, // eol
130,1783, // comment
164,1076, // {10}
165,1589, // {13}
MIN_REDUCTION+284, // (default reduction)
  }
,
{ // state 328
90,1973, // "l"
  }
,
{ // state 329
121,110, // "t"
  }
,
{ // state 330
129,1724, // eol
164,73, // {10}
165,1520, // {13}
  }
,
{ // state 331
109,683, // "f"
  }
,
{ // state 332
0x80000000|1, // match move
0x80000000|1457, // no-match move
0x80000000|67, // NT-test-match state for idChar
  }
,
{ // state 333
MIN_REDUCTION+10, // (default reduction)
  }
,
{ // state 334
MIN_REDUCTION+253, // (default reduction)
  }
,
{ // state 335
2,318, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
132,50, // blockComment
136,1210, // slashStar
149,1327, // "/"
MIN_REDUCTION+269, // (default reduction)
  }
,
{ // state 336
0x80000000|942, // match move
0x80000000|1265, // no-match move
0x80000000|65, // NT-test-match state for doubleSlash
  }
,
{ // state 337
179,MIN_REDUCTION+327, // $NT
  }
,
{ // state 338
121,12, // "t"
  }
,
{ // state 339
2,1300, // white*
MIN_REDUCTION+168, // (default reduction)
  }
,
{ // state 340
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 341
107,125, // "v"
  }
,
{ // state 342
2,966, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
131,729, // oneLineComment
132,50, // blockComment
133,66, // doubleSlash
136,1210, // slashStar
149,144, // "/"
MIN_REDUCTION+317, // (default reduction)
  }
,
{ // state 343
-1, // $$start
579, // start
1659, // white*
1878, // $$0
1070, // token
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
1519, // `!
1705, // `!=
902, // `%
697, // `&&
668, // `*
1850, // `(
1951, // `)
1039, // `{
1042, // `}
1057, // `-
827, // `+
634, // `=
1195, // `==
450, // `[
1462, // `]
407, // `||
2039, // `<
614, // `<=
179, // `,
302, // `>
794, // `>=
33, // `.
985, // `;
958, // `++
428, // `--
1840, // `/
754, // `:
1621, // ID
809, // INT_LITERAL
140, // STRING_LITERAL
1743, // CHAR_LITERAL
663, // "c"
663, // "l"
663, // "a"
663, // "s"
-1, // idChar
-1, // reserved
663, // "e"
1123, // "!"
1508, // "="
414, // "+"
811, // digit++
1701, // letter
1258, // digit
-1, // "_"
663, // "d"
663, // "g"
663, // "m"
663, // "p"
663, // "v"
663, // "y"
663, // "f"
663, // "i"
663, // {"A".."Z"}
663, // "o"
663, // "r"
663, // "u"
663, // "x"
663, // {"j" "q"}
663, // "b"
663, // "h"
663, // "k"
663, // "n"
663, // "t"
663, // "w"
663, // "z"
403, // {"0".."9"}
1580, // white
1489, // {12}
1489, // " "
1489, // {9}
1800, // eol
1390, // comment
-1, // oneLineComment
-1, // blockComment
-1, // doubleSlash
-1, // printable**
-1, // printable
-1, // slashStar
-1, // blockCommentContent*
-1, // starSlash
-1, // blockCommentContent
1025, // "["
1015, // "-"
1189, // "<"
458, // "|"
-1, // {"?".."@"}
2034, // "&"
406, // ")"
1964, // ","
177, // "]"
1247, // "/"
-1, // {"#".."$"}
1328, // ";"
562, // ">"
1295, // "{"
1027, // "%"
469, // "("
-1, // "\"
1406, // "."
1667, // ":"
1838, // "}"
-1, // {"^" "`" "~"}
2025, // "'"
673, // '"'
255, // "*"
73, // {10}
1520, // {13}
-1, // stringPrintable
-1, // charPrintable
1569, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
1612, // token*
-1, // printable*
604, // digit+
-1, // idChar*
1166, // letter+
MIN_REDUCTION+1, // $
-1, // $NT
  }
,
{ // state 344
0x80000000|70, // match move
0x80000000|304, // no-match move
0x80000000|1594, // NT-test-match state for reserved
  }
,
{ // state 345
120,703, // "n"
  }
,
{ // state 346
0x80000000|1260, // match move
0x80000000|1630, // no-match move
0x80000000|65, // NT-test-match state for doubleSlash
  }
,
{ // state 347
125,808, // white
126,877, // {12}
127,877, // " "
128,877, // {9}
129,1185, // eol
130,994, // comment
131,1236, // oneLineComment
132,838, // blockComment
133,1248, // doubleSlash
136,798, // slashStar
149,144, // "/"
164,1315, // {10}
165,904, // {13}
179,MIN_REDUCTION+199, // $NT
  }
,
{ // state 348
0x80000000|607, // match move
0x80000000|466, // no-match move
0x80000000|1594, // NT-test-match state for reserved
  }
,
{ // state 349
2,1647, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
129,493, // eol
130,1783, // comment
164,1076, // {10}
165,1589, // {13}
MIN_REDUCTION+299, // (default reduction)
  }
,
{ // state 350
0x80000000|476, // match move
0x80000000|1573, // no-match move
0x80000000|1594, // NT-test-match state for reserved
  }
,
{ // state 351
0x80000000|1129, // match move
0x80000000|19, // no-match move
0x80000000|1594, // NT-test-match state for reserved
  }
,
{ // state 352
MIN_REDUCTION+121, // (default reduction)
  }
,
{ // state 353
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
132,50, // blockComment
136,1210, // slashStar
149,1327, // "/"
MIN_REDUCTION+187, // (default reduction)
  }
,
{ // state 354
90,34, // "l"
91,1002, // "a"
112,1627, // "o"
118,213, // "h"
  }
,
{ // state 355
108,1900, // "y"
  }
,
{ // state 356
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
129,493, // eol
130,1783, // comment
164,1076, // {10}
165,1589, // {13}
MIN_REDUCTION+238, // (default reduction)
  }
,
{ // state 357
2,49, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
129,493, // eol
130,1783, // comment
164,1076, // {10}
165,1589, // {13}
MIN_REDUCTION+233, // (default reduction)
  }
,
{ // state 358
2,558, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
129,493, // eol
130,1783, // comment
164,1076, // {10}
165,1589, // {13}
MIN_REDUCTION+162, // (default reduction)
  }
,
{ // state 359
179,MIN_REDUCTION+102, // $NT
  }
,
{ // state 360
MIN_REDUCTION+11, // (default reduction)
  }
,
{ // state 361
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
131,729, // oneLineComment
132,50, // blockComment
133,66, // doubleSlash
136,1210, // slashStar
149,144, // "/"
MIN_REDUCTION+286, // (default reduction)
  }
,
{ // state 362
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
131,729, // oneLineComment
132,50, // blockComment
133,66, // doubleSlash
136,1210, // slashStar
149,144, // "/"
MIN_REDUCTION+331, // (default reduction)
  }
,
{ // state 363
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
129,493, // eol
130,1783, // comment
164,1076, // {10}
165,1589, // {13}
MIN_REDUCTION+268, // (default reduction)
  }
,
{ // state 364
121,1131, // "t"
  }
,
{ // state 365
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
132,50, // blockComment
136,1210, // slashStar
149,1327, // "/"
MIN_REDUCTION+155, // (default reduction)
  }
,
{ // state 366
2,240, // white*
125,2043, // white
126,877, // {12}
127,877, // " "
128,877, // {9}
129,1185, // eol
130,994, // comment
131,1236, // oneLineComment
132,838, // blockComment
133,1248, // doubleSlash
136,798, // slashStar
149,144, // "/"
164,1315, // {10}
165,904, // {13}
179,MIN_REDUCTION+305, // $NT
  }
,
{ // state 367
113,1849, // "r"
  }
,
{ // state 368
118,2017, // "h"
  }
,
{ // state 369
0x80000000|462, // match move
0x80000000|1588, // no-match move
0x80000000|1594, // NT-test-match state for reserved
  }
,
{ // state 370
0x80000000|696, // match move
0x80000000|916, // no-match move
0x80000000|1594, // NT-test-match state for reserved
  }
,
{ // state 371
0x80000000|312, // match move
0x80000000|997, // no-match move
0x80000000|65, // NT-test-match state for doubleSlash
  }
,
{ // state 372
122,1813, // "w"
  }
,
{ // state 373
90,1179, // "l"
115,444, // "x"
120,3, // "n"
  }
,
{ // state 374
179,MIN_REDUCTION+105, // $NT
  }
,
{ // state 375
179,MIN_REDUCTION+333, // $NT
  }
,
{ // state 376
0x80000000|1719, // match move
0x80000000|1221, // no-match move
// T-test match for 10:
164,
  }
,
{ // state 377
2,756, // white*
125,2043, // white
126,877, // {12}
127,877, // " "
128,877, // {9}
129,1185, // eol
130,994, // comment
131,1236, // oneLineComment
132,838, // blockComment
133,1248, // doubleSlash
136,798, // slashStar
149,144, // "/"
164,1315, // {10}
165,904, // {13}
179,MIN_REDUCTION+233, // $NT
  }
,
{ // state 378
MIN_REDUCTION+54, // (default reduction)
  }
,
{ // state 379
MIN_REDUCTION+181, // (default reduction)
  }
,
{ // state 380
89,1091, // "c"
90,1091, // "l"
91,1091, // "a"
92,1091, // "s"
95,1091, // "e"
96,1091, // "!"
97,1091, // "="
98,1091, // "+"
102,1091, // "_"
103,1091, // "d"
104,1091, // "g"
105,1091, // "m"
106,1091, // "p"
107,1091, // "v"
108,1091, // "y"
109,1091, // "f"
110,1091, // "i"
111,1091, // {"A".."Z"}
112,1091, // "o"
113,1091, // "r"
114,1091, // "u"
115,1091, // "x"
116,1091, // {"j" "q"}
117,1091, // "b"
118,1091, // "h"
119,1091, // "k"
120,1091, // "n"
121,1091, // "t"
122,1091, // "w"
123,1091, // "z"
124,1091, // {"0".."9"}
127,1091, // " "
135,669, // printable
140,1091, // "["
141,1091, // "-"
142,1091, // "<"
143,1091, // "|"
144,1091, // {"?".."@"}
145,1091, // "&"
146,1091, // ")"
147,1091, // ","
148,1091, // "]"
149,1091, // "/"
150,1091, // {"#".."$"}
151,1091, // ";"
152,1091, // ">"
153,1091, // "{"
154,1091, // "%"
155,1091, // "("
156,1091, // "\"
157,1091, // "."
158,1091, // ":"
159,1091, // "}"
160,1091, // {"^" "`" "~"}
161,1091, // "'"
162,1091, // '"'
163,1091, // "*"
  }
,
{ // state 381
125,808, // white
126,877, // {12}
127,877, // " "
128,877, // {9}
129,1185, // eol
130,994, // comment
131,1236, // oneLineComment
132,838, // blockComment
133,1248, // doubleSlash
136,798, // slashStar
149,144, // "/"
164,1315, // {10}
165,904, // {13}
179,MIN_REDUCTION+235, // $NT
  }
,
{ // state 382
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
132,50, // blockComment
136,1210, // slashStar
149,1327, // "/"
MIN_REDUCTION+280, // (default reduction)
  }
,
{ // state 383
0x80000000|1, // match move
0x80000000|1410, // no-match move
0x80000000|67, // NT-test-match state for idChar
  }
,
{ // state 384
0x80000000|995, // match move
0x80000000|1895, // no-match move
0x80000000|65, // NT-test-match state for doubleSlash
  }
,
{ // state 385
161,753, // "'"
  }
,
{ // state 386
0x80000000|1, // match move
0x80000000|306, // no-match move
0x80000000|67, // NT-test-match state for idChar
  }
,
{ // state 387
0x80000000|1085, // match move
0x80000000|755, // no-match move
0x80000000|65, // NT-test-match state for doubleSlash
  }
,
{ // state 388
91,1750, // "a"
108,1020, // "y"
114,145, // "u"
  }
,
{ // state 389
0x80000000|1901, // match move
0x80000000|618, // no-match move
0x80000000|65, // NT-test-match state for doubleSlash
  }
,
{ // state 390
0x80000000|1171, // match move
0x80000000|678, // no-match move
0x80000000|65, // NT-test-match state for doubleSlash
  }
,
{ // state 391
MIN_REDUCTION+16, // (default reduction)
  }
,
{ // state 392
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
129,493, // eol
130,1783, // comment
164,1076, // {10}
165,1589, // {13}
MIN_REDUCTION+277, // (default reduction)
  }
,
{ // state 393
MIN_REDUCTION+105, // (default reduction)
  }
,
{ // state 394
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
131,729, // oneLineComment
132,50, // blockComment
133,66, // doubleSlash
136,1210, // slashStar
149,144, // "/"
MIN_REDUCTION+190, // (default reduction)
  }
,
{ // state 395
90,1399, // "l"
91,519, // "a"
110,345, // "i"
112,1069, // "o"
  }
,
{ // state 396
0x80000000|37, // match move
0x80000000|1428, // no-match move
0x80000000|65, // NT-test-match state for doubleSlash
  }
,
{ // state 397
0x80000000|1598, // match move
0x80000000|1613, // no-match move
0x80000000|1594, // NT-test-match state for reserved
  }
,
{ // state 398
122,708, // "w"
  }
,
{ // state 399
0x80000000|1, // match move
0x80000000|1633, // no-match move
0x80000000|67, // NT-test-match state for idChar
  }
,
{ // state 400
0x80000000|79, // match move
0x80000000|923, // no-match move
0x80000000|65, // NT-test-match state for doubleSlash
  }
,
{ // state 401
0x80000000|1615, // match move
0x80000000|76, // no-match move
0x80000000|65, // NT-test-match state for doubleSlash
  }
,
{ // state 402
120,1720, // "n"
  }
,
{ // state 403
0x80000000|1225, // match move
0x80000000|1190, // no-match move
0x80000000|94, // NT-test-match state for digit
  }
,
{ // state 404
90,573, // "l"
  }
,
{ // state 405
0x80000000|536, // match move
0x80000000|215, // no-match move
0x80000000|65, // NT-test-match state for doubleSlash
  }
,
{ // state 406
0x80000000|1648, // match move
0x80000000|885, // no-match move
0x80000000|65, // NT-test-match state for doubleSlash
  }
,
{ // state 407
MIN_REDUCTION+73, // (default reduction)
  }
,
{ // state 408
0x80000000|20, // match move
0x80000000|1104, // no-match move
0x80000000|1594, // NT-test-match state for reserved
  }
,
{ // state 409
121,1409, // "t"
  }
,
{ // state 410
0x80000000|1163, // match move
0x80000000|1673, // no-match move
0x80000000|67, // NT-test-match state for idChar
  }
,
{ // state 411
109,1702, // "f"
  }
,
{ // state 412
2,104, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
131,729, // oneLineComment
132,50, // blockComment
133,66, // doubleSlash
136,1210, // slashStar
149,144, // "/"
MIN_REDUCTION+332, // (default reduction)
  }
,
{ // state 413
89,1177, // "c"
  }
,
{ // state 414
0x80000000|544, // match move
0x80000000|1028, // no-match move
// T-test match for "+":
98,
  }
,
{ // state 415
97,1173, // "="
  }
,
{ // state 416
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
132,50, // blockComment
136,1210, // slashStar
149,1327, // "/"
MIN_REDUCTION+238, // (default reduction)
  }
,
{ // state 417
90,404, // "l"
  }
,
{ // state 418
0x80000000|1, // match move
0x80000000|1655, // no-match move
0x80000000|67, // NT-test-match state for idChar
  }
,
{ // state 419
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
129,493, // eol
130,1783, // comment
164,1076, // {10}
165,1589, // {13}
MIN_REDUCTION+157, // (default reduction)
  }
,
{ // state 420
0x80000000|1533, // match move
0x80000000|1398, // no-match move
0x80000000|65, // NT-test-match state for doubleSlash
  }
,
{ // state 421
0x80000000|108, // match move
0x80000000|538, // no-match move
0x80000000|1636, // NT-test-match state for slashStar
  }
,
{ // state 422
2,1953, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
132,50, // blockComment
136,1210, // slashStar
149,1327, // "/"
MIN_REDUCTION+164, // (default reduction)
  }
,
{ // state 423
0x80000000|181, // match move
0x80000000|782, // no-match move
0x80000000|1636, // NT-test-match state for slashStar
  }
,
{ // state 424
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
129,493, // eol
130,1783, // comment
164,1076, // {10}
165,1589, // {13}
MIN_REDUCTION+202, // (default reduction)
  }
,
{ // state 425
2,384, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
132,50, // blockComment
136,1210, // slashStar
149,1327, // "/"
MIN_REDUCTION+320, // (default reduction)
  }
,
{ // state 426
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
131,729, // oneLineComment
132,50, // blockComment
133,66, // doubleSlash
136,1210, // slashStar
149,144, // "/"
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 427
2,1639, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
129,493, // eol
130,1783, // comment
164,1076, // {10}
165,1589, // {13}
MIN_REDUCTION+212, // (default reduction)
  }
,
{ // state 428
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 429
0x80000000|530, // match move
0x80000000|1202, // no-match move
0x80000000|65, // NT-test-match state for doubleSlash
  }
,
{ // state 430
MIN_REDUCTION+193, // (default reduction)
  }
,
{ // state 431
2,1300, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
132,50, // blockComment
136,1210, // slashStar
149,1327, // "/"
MIN_REDUCTION+168, // (default reduction)
  }
,
{ // state 432
95,2024, // "e"
  }
,
{ // state 433
2,816, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
131,729, // oneLineComment
132,50, // blockComment
133,66, // doubleSlash
136,1210, // slashStar
149,144, // "/"
MIN_REDUCTION+160, // (default reduction)
  }
,
{ // state 434
MIN_REDUCTION+363, // (default reduction)
  }
,
{ // state 435
0x80000000|1774, // match move
0x80000000|836, // no-match move
0x80000000|65, // NT-test-match state for doubleSlash
  }
,
{ // state 436
MIN_REDUCTION+57, // (default reduction)
  }
,
{ // state 437
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
131,729, // oneLineComment
132,50, // blockComment
133,66, // doubleSlash
136,1210, // slashStar
149,144, // "/"
MIN_REDUCTION+280, // (default reduction)
  }
,
{ // state 438
2,1284, // white*
125,2043, // white
126,877, // {12}
127,877, // " "
128,877, // {9}
129,1185, // eol
130,994, // comment
131,1236, // oneLineComment
132,838, // blockComment
133,1248, // doubleSlash
136,798, // slashStar
149,144, // "/"
164,1315, // {10}
165,904, // {13}
179,MIN_REDUCTION+206, // $NT
  }
,
{ // state 439
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
132,50, // blockComment
136,1210, // slashStar
149,1327, // "/"
MIN_REDUCTION+133, // (default reduction)
  }
,
{ // state 440
2,1460, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
129,493, // eol
130,1783, // comment
164,1076, // {10}
165,1589, // {13}
MIN_REDUCTION+134, // (default reduction)
  }
,
{ // state 441
MIN_REDUCTION+301, // (default reduction)
  }
,
{ // state 442
MIN_REDUCTION+5, // (default reduction)
  }
,
{ // state 443
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
132,50, // blockComment
136,1210, // slashStar
149,1327, // "/"
MIN_REDUCTION+184, // (default reduction)
  }
,
{ // state 444
121,247, // "t"
  }
,
{ // state 445
90,1071, // "l"
91,1214, // "a"
112,488, // "o"
118,1956, // "h"
  }
,
{ // state 446
0x80000000|2040, // match move
0x80000000|91, // no-match move
0x80000000|1594, // NT-test-match state for reserved
  }
,
{ // state 447
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
131,729, // oneLineComment
132,50, // blockComment
133,66, // doubleSlash
136,1210, // slashStar
149,144, // "/"
MIN_REDUCTION+173, // (default reduction)
  }
,
{ // state 448
0x80000000|311, // match move
0x80000000|258, // no-match move
0x80000000|1101, // NT-test-match state for printable
  }
,
{ // state 449
92,153, // "s"
  }
,
{ // state 450
MIN_REDUCTION+71, // (default reduction)
  }
,
{ // state 451
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
129,493, // eol
130,1783, // comment
164,1076, // {10}
165,1589, // {13}
MIN_REDUCTION+190, // (default reduction)
  }
,
{ // state 452
0x80000000|1, // match move
0x80000000|1468, // no-match move
0x80000000|67, // NT-test-match state for idChar
  }
,
{ // state 453
MIN_REDUCTION+349, // (default reduction)
  }
,
{ // state 454
0x80000000|1043, // match move
0x80000000|1802, // no-match move
0x80000000|1636, // NT-test-match state for slashStar
  }
,
{ // state 455
89,738, // "c"
90,738, // "l"
91,738, // "a"
92,738, // "s"
95,738, // "e"
96,738, // "!"
97,738, // "="
98,738, // "+"
102,738, // "_"
103,738, // "d"
104,738, // "g"
105,738, // "m"
106,738, // "p"
107,738, // "v"
108,738, // "y"
109,738, // "f"
110,738, // "i"
111,738, // {"A".."Z"}
112,738, // "o"
113,738, // "r"
114,738, // "u"
115,738, // "x"
116,738, // {"j" "q"}
117,738, // "b"
118,738, // "h"
119,738, // "k"
120,738, // "n"
121,738, // "t"
122,738, // "w"
123,738, // "z"
124,738, // {"0".."9"}
127,738, // " "
128,738, // {9}
129,1246, // eol
138,871, // starSlash
139,453, // blockCommentContent
140,738, // "["
141,738, // "-"
142,738, // "<"
143,738, // "|"
144,738, // {"?".."@"}
145,738, // "&"
146,738, // ")"
147,738, // ","
148,738, // "]"
149,738, // "/"
150,738, // {"#".."$"}
151,738, // ";"
152,738, // ">"
153,738, // "{"
154,738, // "%"
155,738, // "("
156,738, // "\"
157,738, // "."
158,738, // ":"
159,738, // "}"
160,738, // {"^" "`" "~"}
161,738, // "'"
162,738, // '"'
163,1637, // "*"
164,352, // {10}
165,376, // {13}
  }
,
{ // state 456
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
132,50, // blockComment
136,1210, // slashStar
149,1327, // "/"
MIN_REDUCTION+171, // (default reduction)
  }
,
{ // state 457
95,241, // "e"
  }
,
{ // state 458
143,1706, // "|"
  }
,
{ // state 459
0x80000000|1537, // match move
0x80000000|1282, // no-match move
0x80000000|65, // NT-test-match state for doubleSlash
  }
,
{ // state 460
0x80000000|1, // match move
0x80000000|1539, // no-match move
0x80000000|67, // NT-test-match state for idChar
  }
,
{ // state 461
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
129,493, // eol
130,1783, // comment
164,1076, // {10}
165,1589, // {13}
MIN_REDUCTION+280, // (default reduction)
  }
,
{ // state 462
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 463
109,806, // "f"
  }
,
{ // state 464
2,1651, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
131,729, // oneLineComment
132,50, // blockComment
133,66, // doubleSlash
136,1210, // slashStar
149,144, // "/"
MIN_REDUCTION+178, // (default reduction)
  }
,
{ // state 465
2,539, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
129,493, // eol
130,1783, // comment
164,1076, // {10}
165,1589, // {13}
MIN_REDUCTION+166, // (default reduction)
  }
,
{ // state 466
0x80000000|106, // match move
0x80000000|1848, // no-match move
0x80000000|1636, // NT-test-match state for slashStar
  }
,
{ // state 467
MIN_REDUCTION+187, // (default reduction)
  }
,
{ // state 468
120,540, // "n"
  }
,
{ // state 469
0x80000000|487, // match move
0x80000000|684, // no-match move
0x80000000|65, // NT-test-match state for doubleSlash
  }
,
{ // state 470
179,MIN_REDUCTION+315, // $NT
  }
,
{ // state 471
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
132,50, // blockComment
136,1210, // slashStar
149,1327, // "/"
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 472
0x80000000|1513, // match move
0x80000000|1872, // no-match move
0x80000000|1636, // NT-test-match state for slashStar
  }
,
{ // state 473
0x80000000|310, // match move
0x80000000|88, // no-match move
0x80000000|1594, // NT-test-match state for reserved
  }
,
{ // state 474
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
132,50, // blockComment
136,1210, // slashStar
149,1327, // "/"
MIN_REDUCTION+253, // (default reduction)
  }
,
{ // state 475
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
132,50, // blockComment
136,1210, // slashStar
149,1327, // "/"
MIN_REDUCTION+165, // (default reduction)
  }
,
{ // state 476
MIN_REDUCTION+247, // (default reduction)
  }
,
{ // state 477
2,1317, // white*
125,2043, // white
126,877, // {12}
127,877, // " "
128,877, // {9}
129,1185, // eol
130,994, // comment
131,1236, // oneLineComment
132,838, // blockComment
133,1248, // doubleSlash
136,798, // slashStar
149,144, // "/"
164,1315, // {10}
165,904, // {13}
179,MIN_REDUCTION+197, // $NT
  }
,
{ // state 478
0x80000000|1243, // match move
0x80000000|1483, // no-match move
0x80000000|1636, // NT-test-match state for slashStar
  }
,
{ // state 479
179,MIN_REDUCTION+294, // $NT
  }
,
{ // state 480
MIN_REDUCTION+24, // (default reduction)
  }
,
{ // state 481
2,205, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
129,493, // eol
130,1783, // comment
164,1076, // {10}
165,1589, // {13}
MIN_REDUCTION+156, // (default reduction)
  }
,
{ // state 482
91,208, // "a"
95,95, // "e"
114,1875, // "u"
  }
,
{ // state 483
0x80000000|1710, // match move
0x80000000|1147, // no-match move
0x80000000|65, // NT-test-match state for doubleSlash
  }
,
{ // state 484
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
129,493, // eol
130,1783, // comment
164,1076, // {10}
165,1589, // {13}
MIN_REDUCTION+253, // (default reduction)
  }
,
{ // state 485
118,776, // "h"
  }
,
{ // state 486
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
129,493, // eol
130,1783, // comment
164,1076, // {10}
165,1589, // {13}
MIN_REDUCTION+171, // (default reduction)
  }
,
{ // state 487
2,1766, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
131,729, // oneLineComment
132,50, // blockComment
133,66, // doubleSlash
136,1210, // slashStar
149,144, // "/"
MIN_REDUCTION+140, // (default reduction)
  }
,
{ // state 488
120,1862, // "n"
  }
,
{ // state 489
2,1259, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
129,493, // eol
130,1783, // comment
164,1076, // {10}
165,1589, // {13}
MIN_REDUCTION+293, // (default reduction)
  }
,
{ // state 490
125,808, // white
126,877, // {12}
127,877, // " "
128,877, // {9}
129,1185, // eol
130,994, // comment
131,1236, // oneLineComment
132,838, // blockComment
133,1248, // doubleSlash
136,798, // slashStar
149,144, // "/"
164,1315, // {10}
165,904, // {13}
179,MIN_REDUCTION+274, // $NT
  }
,
{ // state 491
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 492
0x80000000|1203, // match move
0x80000000|1514, // no-match move
0x80000000|1594, // NT-test-match state for reserved
  }
,
{ // state 493
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 494
2,1793, // white*
125,2043, // white
126,877, // {12}
127,877, // " "
128,877, // {9}
129,1185, // eol
130,994, // comment
131,1236, // oneLineComment
132,838, // blockComment
133,1248, // doubleSlash
136,798, // slashStar
149,144, // "/"
164,1315, // {10}
165,904, // {13}
179,MIN_REDUCTION+224, // $NT
  }
,
{ // state 495
90,1144, // "l"
  }
,
{ // state 496
MIN_REDUCTION+298, // (default reduction)
  }
,
{ // state 497
0x80000000|814, // match move
0x80000000|1099, // no-match move
0x80000000|1594, // NT-test-match state for reserved
  }
,
{ // state 498
MIN_REDUCTION+292, // (default reduction)
  }
,
{ // state 499
89,38, // "c"
  }
,
{ // state 500
103,1034, // "d"
  }
,
{ // state 501
2,1647, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
131,729, // oneLineComment
132,50, // blockComment
133,66, // doubleSlash
136,1210, // slashStar
149,144, // "/"
MIN_REDUCTION+299, // (default reduction)
  }
,
{ // state 502
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
132,50, // blockComment
136,1210, // slashStar
149,1327, // "/"
MIN_REDUCTION+202, // (default reduction)
  }
,
{ // state 503
89,1644, // "c"
  }
,
{ // state 504
0x80000000|1909, // match move
0x80000000|572, // no-match move
0x80000000|1636, // NT-test-match state for slashStar
  }
,
{ // state 505
0x80000000|335, // match move
0x80000000|22, // no-match move
0x80000000|1636, // NT-test-match state for slashStar
  }
,
{ // state 506
0x80000000|1, // match move
0x80000000|1552, // no-match move
0x80000000|67, // NT-test-match state for idChar
  }
,
{ // state 507
2,1689, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
131,729, // oneLineComment
132,50, // blockComment
133,66, // doubleSlash
136,1210, // slashStar
149,144, // "/"
MIN_REDUCTION+230, // (default reduction)
  }
,
{ // state 508
125,808, // white
126,877, // {12}
127,877, // " "
128,877, // {9}
129,1185, // eol
130,994, // comment
131,1236, // oneLineComment
132,838, // blockComment
133,1248, // doubleSlash
136,798, // slashStar
149,144, // "/"
164,1315, // {10}
165,904, // {13}
179,MIN_REDUCTION+214, // $NT
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
{ // state 509
90,1137, // "l"
  }
,
{ // state 510
2,135, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
129,493, // eol
130,1783, // comment
164,1076, // {10}
165,1589, // {13}
MIN_REDUCTION+209, // (default reduction)
  }
,
{ // state 511
0x80000000|1041, // match move
0x80000000|231, // no-match move
0x80000000|1636, // NT-test-match state for slashStar
  }
,
{ // state 512
0x80000000|1478, // match move
0x80000000|124, // no-match move
0x80000000|65, // NT-test-match state for doubleSlash
  }
,
{ // state 513
2,317, // white*
125,2043, // white
126,877, // {12}
127,877, // " "
128,877, // {9}
129,1185, // eol
130,994, // comment
131,1236, // oneLineComment
132,838, // blockComment
133,1248, // doubleSlash
136,798, // slashStar
149,144, // "/"
164,1315, // {10}
165,904, // {13}
179,MIN_REDUCTION+308, // $NT
  }
,
{ // state 514
0x80000000|1, // match move
0x80000000|387, // no-match move
0x80000000|67, // NT-test-match state for idChar
  }
,
{ // state 515
113,1348, // "r"
  }
,
{ // state 516
110,593, // "i"
  }
,
{ // state 517
125,808, // white
126,877, // {12}
127,877, // " "
128,877, // {9}
129,1185, // eol
130,994, // comment
131,1236, // oneLineComment
132,838, // blockComment
133,1248, // doubleSlash
136,798, // slashStar
149,144, // "/"
164,1315, // {10}
165,904, // {13}
179,MIN_REDUCTION+250, // $NT
  }
,
{ // state 518
95,1080, // "e"
  }
,
{ // state 519
90,182, // "l"
  }
,
{ // state 520
MIN_REDUCTION+359, // (default reduction)
  }
,
{ // state 521
0x80000000|1458, // match move
0x80000000|689, // no-match move
0x80000000|1594, // NT-test-match state for reserved
  }
,
{ // state 522
0x80000000|1, // match move
0x80000000|371, // no-match move
0x80000000|67, // NT-test-match state for idChar
  }
,
{ // state 523
112,2009, // "o"
  }
,
{ // state 524
2,396, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
131,729, // oneLineComment
132,50, // blockComment
133,66, // doubleSlash
136,1210, // slashStar
149,144, // "/"
MIN_REDUCTION+152, // (default reduction)
  }
,
{ // state 525
95,1549, // "e"
  }
,
{ // state 526
0x80000000|1541, // match move
0x80000000|2031, // no-match move
0x80000000|532, // NT-test-match state for letter
  }
,
{ // state 527
90,432, // "l"
  }
,
{ // state 528
89,368, // "c"
  }
,
{ // state 529
179,MIN_REDUCTION+306, // $NT
  }
,
{ // state 530
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
131,729, // oneLineComment
132,50, // blockComment
133,66, // doubleSlash
136,1210, // slashStar
149,144, // "/"
MIN_REDUCTION+262, // (default reduction)
  }
,
{ // state 531
120,1538, // "n"
  }
,
{ // state 532
89,911, // "c"
90,911, // "l"
91,911, // "a"
92,911, // "s"
95,911, // "e"
103,911, // "d"
104,911, // "g"
105,911, // "m"
106,911, // "p"
107,911, // "v"
108,911, // "y"
109,911, // "f"
110,911, // "i"
111,911, // {"A".."Z"}
112,911, // "o"
113,911, // "r"
114,911, // "u"
115,911, // "x"
116,911, // {"j" "q"}
117,911, // "b"
118,911, // "h"
119,911, // "k"
120,911, // "n"
121,911, // "t"
122,911, // "w"
123,911, // "z"
  }
,
{ // state 533
2,587, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
131,729, // oneLineComment
132,50, // blockComment
133,66, // doubleSlash
136,1210, // slashStar
149,144, // "/"
MIN_REDUCTION+290, // (default reduction)
  }
,
{ // state 534
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
131,729, // oneLineComment
132,50, // blockComment
133,66, // doubleSlash
136,1210, // slashStar
149,144, // "/"
MIN_REDUCTION+163, // (default reduction)
  }
,
{ // state 535
2,1135, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
129,493, // eol
130,1783, // comment
164,1076, // {10}
165,1589, // {13}
MIN_REDUCTION+254, // (default reduction)
  }
,
{ // state 536
2,1792, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
131,729, // oneLineComment
132,50, // blockComment
133,66, // doubleSlash
136,1210, // slashStar
149,144, // "/"
MIN_REDUCTION+248, // (default reduction)
  }
,
{ // state 537
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
131,729, // oneLineComment
132,50, // blockComment
133,66, // doubleSlash
136,1210, // slashStar
149,144, // "/"
MIN_REDUCTION+157, // (default reduction)
  }
,
{ // state 538
2,1634, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
129,493, // eol
130,1783, // comment
164,1076, // {10}
165,1589, // {13}
169,1744, // idChar**
170,1450, // $$1
176,1477, // idChar*
MIN_REDUCTION+337, // (default reduction)
  }
,
{ // state 539
0x80000000|1881, // match move
0x80000000|1134, // no-match move
0x80000000|65, // NT-test-match state for doubleSlash
  }
,
{ // state 540
114,821, // "u"
  }
,
{ // state 541
MIN_REDUCTION+190, // (default reduction)
  }
,
{ // state 542
2,104, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
132,50, // blockComment
136,1210, // slashStar
149,1327, // "/"
MIN_REDUCTION+332, // (default reduction)
  }
,
{ // state 543
2,1713, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
132,50, // blockComment
136,1210, // slashStar
149,1327, // "/"
MIN_REDUCTION+314, // (default reduction)
  }
,
{ // state 544
98,389, // "+"
  }
,
{ // state 545
MIN_REDUCTION+26, // (default reduction)
  }
,
{ // state 546
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
132,50, // blockComment
136,1210, // slashStar
149,1327, // "/"
MIN_REDUCTION+289, // (default reduction)
  }
,
{ // state 547
0x80000000|1845, // match move
0x80000000|1915, // no-match move
0x80000000|1594, // NT-test-match state for reserved
  }
,
{ // state 548
2,1435, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
129,493, // eol
130,1783, // comment
164,1076, // {10}
165,1589, // {13}
MIN_REDUCTION+203, // (default reduction)
  }
,
{ // state 549
2,1495, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
131,729, // oneLineComment
132,50, // blockComment
133,66, // doubleSlash
136,1210, // slashStar
149,144, // "/"
MIN_REDUCTION+278, // (default reduction)
  }
,
{ // state 550
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 551
0x80000000|1566, // match move
0x80000000|392, // no-match move
0x80000000|1636, // NT-test-match state for slashStar
  }
,
{ // state 552
2,508, // white*
125,2043, // white
126,877, // {12}
127,877, // " "
128,877, // {9}
129,1185, // eol
130,994, // comment
131,1236, // oneLineComment
132,838, // blockComment
133,1248, // doubleSlash
136,798, // slashStar
149,144, // "/"
164,1315, // {10}
165,904, // {13}
179,MIN_REDUCTION+215, // $NT
  }
,
{ // state 553
2,1925, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
132,50, // blockComment
136,1210, // slashStar
149,1327, // "/"
MIN_REDUCTION+146, // (default reduction)
  }
,
{ // state 554
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 555
2,1112, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
129,493, // eol
130,1783, // comment
164,1076, // {10}
165,1589, // {13}
MIN_REDUCTION+281, // (default reduction)
  }
,
{ // state 556
121,791, // "t"
  }
,
{ // state 557
179,MIN_REDUCTION+279, // $NT
  }
,
{ // state 558
0x80000000|1493, // match move
0x80000000|446, // no-match move
0x80000000|65, // NT-test-match state for doubleSlash
  }
,
{ // state 559
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
129,493, // eol
130,1783, // comment
164,1076, // {10}
165,1589, // {13}
MIN_REDUCTION+310, // (default reduction)
  }
,
{ // state 560
2,1453, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
129,493, // eol
130,1783, // comment
164,1076, // {10}
165,1589, // {13}
MIN_REDUCTION+200, // (default reduction)
  }
,
{ // state 561
0x80000000|1, // match move
0x80000000|650, // no-match move
0x80000000|532, // NT-test-match state for letter
  }
,
{ // state 562
0x80000000|415, // match move
0x80000000|1677, // no-match move
// T-test match for "=":
97,
  }
,
{ // state 563
2,1229, // white*
MIN_REDUCTION+174, // (default reduction)
  }
,
{ // state 564
0x80000000|1176, // match move
0x80000000|715, // no-match move
0x80000000|1636, // NT-test-match state for slashStar
  }
,
{ // state 565
91,779, // "a"
  }
,
{ // state 566
103,1424, // "d"
  }
,
{ // state 567
120,1546, // "n"
  }
,
{ // state 568
0x80000000|1445, // match move
0x80000000|454, // no-match move
0x80000000|1594, // NT-test-match state for reserved
  }
,
{ // state 569
0x80000000|781, // match move
0x80000000|82, // no-match move
0x80000000|65, // NT-test-match state for doubleSlash
  }
,
{ // state 570
121,832, // "t"
  }
,
{ // state 571
2,822, // white*
125,2043, // white
126,877, // {12}
127,877, // " "
128,877, // {9}
129,1185, // eol
130,994, // comment
131,1236, // oneLineComment
132,838, // blockComment
133,1248, // doubleSlash
136,798, // slashStar
149,144, // "/"
164,1315, // {10}
165,904, // {13}
179,MIN_REDUCTION+272, // $NT
  }
,
{ // state 572
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
129,493, // eol
130,1783, // comment
164,1076, // {10}
165,1589, // {13}
MIN_REDUCTION+226, // (default reduction)
  }
,
{ // state 573
0x80000000|1, // match move
0x80000000|1960, // no-match move
0x80000000|67, // NT-test-match state for idChar
  }
,
{ // state 574
164,1553, // {10}
  }
,
{ // state 575
0x80000000|1799, // match move
0x80000000|1816, // no-match move
0x80000000|1594, // NT-test-match state for reserved
  }
,
{ // state 576
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
131,729, // oneLineComment
132,50, // blockComment
133,66, // doubleSlash
136,1210, // slashStar
149,144, // "/"
MIN_REDUCTION+202, // (default reduction)
  }
,
{ // state 577
0x80000000|1063, // match move
0x80000000|1402, // no-match move
0x80000000|1594, // NT-test-match state for reserved
  }
,
{ // state 578
0x80000000|785, // match move
0x80000000|510, // no-match move
0x80000000|1636, // NT-test-match state for slashStar
  }
,
{ // state 579
178,MIN_REDUCTION+0, // $
  }
,
{ // state 580
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 581
110,1289, // "i"
  }
,
{ // state 582
0x80000000|1000, // match move
0x80000000|1988, // no-match move
0x80000000|1636, // NT-test-match state for slashStar
  }
,
{ // state 583
95,778, // "e"
  }
,
{ // state 584
129,866, // eol
134,1864, // printable**
164,1076, // {10}
165,1589, // {13}
174,316, // printable*
  }
,
{ // state 585
2,704, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
129,493, // eol
130,1783, // comment
164,1076, // {10}
165,1589, // {13}
MIN_REDUCTION+302, // (default reduction)
  }
,
{ // state 586
2,1634, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
131,729, // oneLineComment
132,50, // blockComment
133,66, // doubleSlash
136,1210, // slashStar
149,144, // "/"
170,1842, // $$1
MIN_REDUCTION+335, // (default reduction)
  }
,
{ // state 587
0x80000000|2022, // match move
0x80000000|983, // no-match move
0x80000000|65, // NT-test-match state for doubleSlash
  }
,
{ // state 588
0x80000000|553, // match move
0x80000000|1349, // no-match move
0x80000000|1636, // NT-test-match state for slashStar
  }
,
{ // state 589
MIN_REDUCTION+165, // (default reduction)
  }
,
{ // state 590
2,948, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
129,493, // eol
130,1783, // comment
164,1076, // {10}
165,1589, // {13}
MIN_REDUCTION+308, // (default reduction)
  }
,
{ // state 591
0x80000000|1, // match move
0x80000000|710, // no-match move
0x80000000|67, // NT-test-match state for idChar
  }
,
{ // state 592
0x80000000|1116, // match move
0x80000000|1372, // no-match move
0x80000000|1636, // NT-test-match state for slashStar
  }
,
{ // state 593
89,196, // "c"
  }
,
{ // state 594
121,278, // "t"
  }
,
{ // state 595
2,1535, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
129,493, // eol
130,1783, // comment
164,1076, // {10}
165,1589, // {13}
MIN_REDUCTION+266, // (default reduction)
  }
,
{ // state 596
MIN_REDUCTION+277, // (default reduction)
  }
,
{ // state 597
0x80000000|1062, // match move
0x80000000|35, // no-match move
0x80000000|1594, // NT-test-match state for reserved
  }
,
{ // state 598
179,MIN_REDUCTION+234, // $NT
  }
,
{ // state 599
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 600
95,1045, // "e"
  }
,
{ // state 601
95,1778, // "e"
  }
,
{ // state 602
112,1239, // "o"
  }
,
{ // state 603
0x80000000|1358, // match move
0x80000000|408, // no-match move
0x80000000|65, // NT-test-match state for doubleSlash
  }
,
{ // state 604
0x80000000|1512, // match move
0x80000000|1521, // no-match move
0x80000000|94, // NT-test-match state for digit
  }
,
{ // state 605
118,1212, // "h"
  }
,
{ // state 606
0x80000000|520, // match move
0x80000000|1618, // no-match move
0x80000000|1101, // NT-test-match state for printable
  }
,
{ // state 607
MIN_REDUCTION+173, // (default reduction)
  }
,
{ // state 608
0x80000000|1456, // match move
0x80000000|1319, // no-match move
0x80000000|65, // NT-test-match state for doubleSlash
  }
,
{ // state 609
0x80000000|685, // match move
0x80000000|1448, // no-match move
0x80000000|532, // NT-test-match state for letter
  }
,
{ // state 610
MIN_REDUCTION+124, // (default reduction)
  }
,
{ // state 611
0x80000000|1184, // match move
0x80000000|982, // no-match move
0x80000000|1594, // NT-test-match state for reserved
  }
,
{ // state 612
95,1826, // "e"
  }
,
{ // state 613
MIN_REDUCTION+355, // (default reduction)
  }
,
{ // state 614
MIN_REDUCTION+75, // (default reduction)
  }
,
{ // state 615
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
131,729, // oneLineComment
132,50, // blockComment
133,66, // doubleSlash
136,1210, // slashStar
149,144, // "/"
MIN_REDUCTION+211, // (default reduction)
  }
,
{ // state 616
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
131,729, // oneLineComment
132,50, // blockComment
133,66, // doubleSlash
136,1210, // slashStar
149,144, // "/"
MIN_REDUCTION+223, // (default reduction)
  }
,
{ // state 617
179,MIN_REDUCTION+213, // $NT
  }
,
{ // state 618
0x80000000|1230, // match move
0x80000000|839, // no-match move
0x80000000|1594, // NT-test-match state for reserved
  }
,
{ // state 619
MIN_REDUCTION+351, // (default reduction)
  }
,
{ // state 620
0x80000000|1431, // match move
0x80000000|713, // no-match move
0x80000000|65, // NT-test-match state for doubleSlash
  }
,
{ // state 621
2,1582, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
131,729, // oneLineComment
132,50, // blockComment
133,66, // doubleSlash
136,1210, // slashStar
149,144, // "/"
MIN_REDUCTION+305, // (default reduction)
  }
,
{ // state 622
0x80000000|1, // match move
0x80000000|813, // no-match move
0x80000000|67, // NT-test-match state for idChar
  }
,
{ // state 623
2,539, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
131,729, // oneLineComment
132,50, // blockComment
133,66, // doubleSlash
136,1210, // slashStar
149,144, // "/"
MIN_REDUCTION+166, // (default reduction)
  }
,
{ // state 624
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
132,50, // blockComment
136,1210, // slashStar
149,1327, // "/"
MIN_REDUCTION+247, // (default reduction)
  }
,
{ // state 625
179,MIN_REDUCTION+120, // $NT
  }
,
{ // state 626
179,MIN_REDUCTION+219, // $NT
  }
,
{ // state 627
107,315, // "v"
  }
,
{ // state 628
120,2010, // "n"
  }
,
{ // state 629
179,MIN_REDUCTION+255, // $NT
  }
,
{ // state 630
121,185, // "t"
  }
,
{ // state 631
95,1266, // "e"
  }
,
{ // state 632
2,4, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
131,729, // oneLineComment
132,50, // blockComment
133,66, // doubleSlash
136,1210, // slashStar
149,144, // "/"
MIN_REDUCTION+245, // (default reduction)
  }
,
{ // state 633
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
132,50, // blockComment
136,1210, // slashStar
149,1327, // "/"
MIN_REDUCTION+99, // (default reduction)
  }
,
{ // state 634
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 635
120,1835, // "n"
  }
,
{ // state 636
119,1430, // "k"
  }
,
{ // state 637
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
132,50, // blockComment
136,1210, // slashStar
149,1327, // "/"
MIN_REDUCTION+295, // (default reduction)
  }
,
{ // state 638
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
132,50, // blockComment
136,1210, // slashStar
149,1327, // "/"
MIN_REDUCTION+235, // (default reduction)
  }
,
{ // state 639
2,2013, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
132,50, // blockComment
136,1210, // slashStar
149,1327, // "/"
MIN_REDUCTION+284, // (default reduction)
  }
,
{ // state 640
90,99, // "l"
115,1330, // "x"
120,2, // "n"
  }
,
{ // state 641
0x80000000|1, // match move
0x80000000|620, // no-match move
0x80000000|67, // NT-test-match state for idChar
  }
,
{ // state 642
0x80000000|1, // match move
0x80000000|1742, // no-match move
0x80000000|67, // NT-test-match state for idChar
  }
,
{ // state 643
0x80000000|1, // match move
0x80000000|812, // no-match move
0x80000000|67, // NT-test-match state for idChar
  }
,
{ // state 644
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
132,50, // blockComment
136,1210, // slashStar
149,1327, // "/"
MIN_REDUCTION+241, // (default reduction)
  }
,
{ // state 645
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
132,50, // blockComment
136,1210, // slashStar
149,1327, // "/"
MIN_REDUCTION+220, // (default reduction)
  }
,
{ // state 646
89,1360, // "c"
  }
,
{ // state 647
2,797, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
129,493, // eol
130,1783, // comment
164,1076, // {10}
165,1589, // {13}
MIN_REDUCTION+218, // (default reduction)
  }
,
{ // state 648
125,808, // white
126,877, // {12}
127,877, // " "
128,877, // {9}
129,1185, // eol
130,994, // comment
131,1236, // oneLineComment
132,838, // blockComment
133,1248, // doubleSlash
136,798, // slashStar
149,144, // "/"
164,1315, // {10}
165,904, // {13}
179,MIN_REDUCTION+211, // $NT
  }
,
{ // state 649
MIN_REDUCTION+111, // (default reduction)
  }
,
{ // state 650
102,MIN_REDUCTION+104, // "_"
169,MIN_REDUCTION+104, // idChar**
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 651
106,1205, // "p"
  }
,
{ // state 652
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
129,493, // eol
130,1783, // comment
164,1076, // {10}
165,1589, // {13}
MIN_REDUCTION+292, // (default reduction)
  }
,
{ // state 653
0x80000000|1, // match move
0x80000000|286, // no-match move
0x80000000|67, // NT-test-match state for idChar
  }
,
{ // state 654
0x80000000|1, // match move
0x80000000|1350, // no-match move
0x80000000|67, // NT-test-match state for idChar
  }
,
{ // state 655
MIN_REDUCTION+126, // (default reduction)
  }
,
{ // state 656
110,627, // "i"
112,630, // "o"
  }
,
{ // state 657
0x80000000|1, // match move
0x80000000|1734, // no-match move
0x80000000|67, // NT-test-match state for idChar
  }
,
{ // state 658
0x80000000|1563, // match move
0x80000000|1434, // no-match move
0x80000000|65, // NT-test-match state for doubleSlash
  }
,
{ // state 659
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
132,50, // blockComment
136,1210, // slashStar
149,1327, // "/"
MIN_REDUCTION+217, // (default reduction)
  }
,
{ // state 660
MIN_REDUCTION+34, // (default reduction)
  }
,
{ // state 661
2,1936, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
132,50, // blockComment
136,1210, // slashStar
149,1327, // "/"
MIN_REDUCTION+272, // (default reduction)
  }
,
{ // state 662
0x80000000|596, // match move
0x80000000|551, // no-match move
0x80000000|1594, // NT-test-match state for reserved
  }
,
{ // state 663
0x80000000|1211, // match move
0x80000000|561, // no-match move
0x80000000|67, // NT-test-match state for idChar
  }
,
{ // state 664
2,893, // white*
MIN_REDUCTION+96, // (default reduction)
  }
,
{ // state 665
2,569, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
132,50, // blockComment
136,1210, // slashStar
149,1327, // "/"
MIN_REDUCTION+341, // (default reduction)
  }
,
{ // state 666
2,709, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
131,729, // oneLineComment
132,50, // blockComment
133,66, // doubleSlash
136,1210, // slashStar
149,144, // "/"
MIN_REDUCTION+206, // (default reduction)
  }
,
{ // state 667
MIN_REDUCTION+223, // (default reduction)
  }
,
{ // state 668
MIN_REDUCTION+62, // (default reduction)
  }
,
{ // state 669
0x80000000|1133, // match move
0x80000000|815, // no-match move
0x80000000|1101, // NT-test-match state for printable
  }
,
{ // state 670
95,1516, // "e"
  }
,
{ // state 671
125,808, // white
126,877, // {12}
127,877, // " "
128,877, // {9}
129,1185, // eol
130,994, // comment
131,1236, // oneLineComment
132,838, // blockComment
133,1248, // doubleSlash
136,798, // slashStar
149,144, // "/"
164,1315, // {10}
165,904, // {13}
179,MIN_REDUCTION+331, // $NT
  }
,
{ // state 672
2,558, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
131,729, // oneLineComment
132,50, // blockComment
133,66, // doubleSlash
136,1210, // slashStar
149,144, // "/"
MIN_REDUCTION+162, // (default reduction)
  }
,
{ // state 673
89,1668, // "c"
90,1668, // "l"
91,1668, // "a"
92,1668, // "s"
95,1668, // "e"
96,1681, // "!"
97,655, // "="
98,655, // "+"
102,1668, // "_"
103,1668, // "d"
104,1668, // "g"
105,1668, // "m"
106,1668, // "p"
107,1668, // "v"
108,1668, // "y"
109,1668, // "f"
110,1668, // "i"
111,655, // {"A".."Z"}
112,1668, // "o"
113,1668, // "r"
114,1668, // "u"
115,1668, // "x"
116,1668, // {"j" "q"}
117,1668, // "b"
118,1668, // "h"
119,1668, // "k"
120,1668, // "n"
121,1668, // "t"
122,1668, // "w"
123,1668, // "z"
124,655, // {"0".."9"}
127,1681, // " "
140,655, // "["
141,655, // "-"
142,655, // "<"
143,1668, // "|"
144,655, // {"?".."@"}
145,655, // "&"
146,655, // ")"
147,655, // ","
148,1668, // "]"
149,655, // "/"
150,655, // {"#".."$"}
151,655, // ";"
152,655, // ">"
153,1668, // "{"
154,655, // "%"
155,655, // "("
157,655, // "."
158,655, // ":"
159,1668, // "}"
160,1668, // {"^" "`" "~"}
161,655, // "'"
162,1791, // '"'
163,655, // "*"
166,751, // stringPrintable
171,1377, // stringPrintable*
172,1690, // $$2
  }
,
{ // state 674
2,893, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
129,493, // eol
130,1783, // comment
164,1076, // {10}
165,1589, // {13}
MIN_REDUCTION+96, // (default reduction)
  }
,
{ // state 675
2,1896, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
131,729, // oneLineComment
132,50, // blockComment
133,66, // doubleSlash
136,1210, // slashStar
149,144, // "/"
MIN_REDUCTION+191, // (default reduction)
  }
,
{ // state 676
2,1136, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
132,50, // blockComment
136,1210, // slashStar
149,1327, // "/"
MIN_REDUCTION+287, // (default reduction)
  }
,
{ // state 677
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
132,50, // blockComment
136,1210, // slashStar
149,1327, // "/"
MIN_REDUCTION+181, // (default reduction)
  }
,
{ // state 678
0x80000000|945, // match move
0x80000000|1009, // no-match move
0x80000000|1594, // NT-test-match state for reserved
  }
,
{ // state 679
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 680
0x80000000|1747, // match move
0x80000000|1879, // no-match move
0x80000000|1594, // NT-test-match state for reserved
  }
,
{ // state 681
2,300, // white*
125,2043, // white
126,877, // {12}
127,877, // " "
128,877, // {9}
129,1185, // eol
130,994, // comment
131,1236, // oneLineComment
132,838, // blockComment
133,1248, // doubleSlash
136,798, // slashStar
149,144, // "/"
164,1315, // {10}
165,904, // {13}
179,MIN_REDUCTION+329, // $NT
  }
,
{ // state 682
MIN_REDUCTION+244, // (default reduction)
  }
,
{ // state 683
91,928, // "a"
  }
,
{ // state 684
0x80000000|1233, // match move
0x80000000|1866, // no-match move
0x80000000|1594, // NT-test-match state for reserved
  }
,
{ // state 685
MIN_REDUCTION+356, // (default reduction)
  }
,
{ // state 686
MIN_REDUCTION+37, // (default reduction)
  }
,
{ // state 687
2,1953, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
129,493, // eol
130,1783, // comment
164,1076, // {10}
165,1589, // {13}
MIN_REDUCTION+164, // (default reduction)
  }
,
{ // state 688
0x80000000|1388, // match move
0x80000000|1187, // no-match move
0x80000000|65, // NT-test-match state for doubleSlash
  }
,
{ // state 689
0x80000000|1481, // match move
0x80000000|101, // no-match move
0x80000000|1636, // NT-test-match state for slashStar
  }
,
{ // state 690
92,1174, // "s"
  }
,
{ // state 691
MIN_REDUCTION+7, // (default reduction)
  }
,
{ // state 692
0x80000000|184, // match move
0x80000000|1274, // no-match move
0x80000000|1594, // NT-test-match state for reserved
  }
,
{ // state 693
179,MIN_REDUCTION+288, // $NT
  }
,
{ // state 694
2,948, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
131,729, // oneLineComment
132,50, // blockComment
133,66, // doubleSlash
136,1210, // slashStar
149,144, // "/"
MIN_REDUCTION+308, // (default reduction)
  }
,
{ // state 695
0x80000000|1355, // match move
0x80000000|1579, // no-match move
0x80000000|1636, // NT-test-match state for slashStar
  }
,
{ // state 696
MIN_REDUCTION+131, // (default reduction)
  }
,
{ // state 697
MIN_REDUCTION+61, // (default reduction)
  }
,
{ // state 698
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
131,729, // oneLineComment
132,50, // blockComment
133,66, // doubleSlash
136,1210, // slashStar
149,144, // "/"
MIN_REDUCTION+247, // (default reduction)
  }
,
{ // state 699
95,1447, // "e"
  }
,
{ // state 700
2,1890, // white*
125,2043, // white
126,877, // {12}
127,877, // " "
128,877, // {9}
129,1185, // eol
130,994, // comment
131,1236, // oneLineComment
132,838, // blockComment
133,1248, // doubleSlash
136,798, // slashStar
149,144, // "/"
164,1315, // {10}
165,904, // {13}
179,MIN_REDUCTION+296, // $NT
  }
,
{ // state 701
92,84, // "s"
  }
,
{ // state 702
112,372, // "o"
  }
,
{ // state 703
91,1250, // "a"
  }
,
{ // state 704
0x80000000|1441, // match move
0x80000000|1314, // no-match move
0x80000000|65, // NT-test-match state for doubleSlash
  }
,
{ // state 705
109,1164, // "f"
  }
,
{ // state 706
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
129,493, // eol
130,1783, // comment
164,1076, // {10}
165,1589, // {13}
MIN_REDUCTION+151, // (default reduction)
  }
,
{ // state 707
0x80000000|293, // match move
0x80000000|1696, // no-match move
0x80000000|1636, // NT-test-match state for slashStar
  }
,
{ // state 708
0x80000000|1291, // match move
0x80000000|1422, // no-match move
0x80000000|67, // NT-test-match state for idChar
  }
,
{ // state 709
0x80000000|1682, // match move
0x80000000|40, // no-match move
0x80000000|65, // NT-test-match state for doubleSlash
  }
,
{ // state 710
0x80000000|1545, // match move
0x80000000|1754, // no-match move
0x80000000|65, // NT-test-match state for doubleSlash
  }
,
{ // state 711
MIN_REDUCTION+20, // (default reduction)
  }
,
{ // state 712
MIN_REDUCTION+151, // (default reduction)
  }
,
{ // state 713
0x80000000|1558, // match move
0x80000000|257, // no-match move
0x80000000|1636, // NT-test-match state for slashStar
  }
,
{ // state 714
MIN_REDUCTION+348, // (default reduction)
  }
,
{ // state 715
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
129,493, // eol
130,1783, // comment
164,1076, // {10}
165,1589, // {13}
MIN_REDUCTION+149, // (default reduction)
  }
,
{ // state 716
95,367, // "e"
  }
,
{ // state 717
MIN_REDUCTION+149, // (default reduction)
  }
,
{ // state 718
0x80000000|1465, // match move
0x80000000|1707, // no-match move
0x80000000|65, // NT-test-match state for doubleSlash
  }
,
{ // state 719
106,1833, // "p"
  }
,
{ // state 720
2,1760, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
131,729, // oneLineComment
132,50, // blockComment
133,66, // doubleSlash
136,1210, // slashStar
149,144, // "/"
MIN_REDUCTION+257, // (default reduction)
  }
,
{ // state 721
112,913, // "o"
  }
,
{ // state 722
125,808, // white
126,877, // {12}
127,877, // " "
128,877, // {9}
129,1185, // eol
130,994, // comment
131,1236, // oneLineComment
132,838, // blockComment
133,1248, // doubleSlash
136,798, // slashStar
149,144, // "/"
164,1315, // {10}
165,904, // {13}
179,MIN_REDUCTION+325, // $NT
  }
,
{ // state 723
113,409, // "r"
  }
,
{ // state 724
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
131,729, // oneLineComment
132,50, // blockComment
133,66, // doubleSlash
136,1210, // slashStar
149,144, // "/"
MIN_REDUCTION+268, // (default reduction)
  }
,
{ // state 725
0x80000000|443, // match move
0x80000000|1178, // no-match move
0x80000000|1636, // NT-test-match state for slashStar
  }
,
{ // state 726
MIN_REDUCTION+347, // (default reduction)
  }
,
{ // state 727
0x80000000|549, // match move
0x80000000|1975, // no-match move
0x80000000|65, // NT-test-match state for doubleSlash
  }
,
{ // state 728
2,1102, // white*
125,2043, // white
126,877, // {12}
127,877, // " "
128,877, // {9}
129,1185, // eol
130,994, // comment
131,1236, // oneLineComment
132,838, // blockComment
133,1248, // doubleSlash
136,798, // slashStar
149,144, // "/"
164,1315, // {10}
165,904, // {13}
179,MIN_REDUCTION+182, // $NT
  }
,
{ // state 729
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 730
95,963, // "e"
  }
,
{ // state 731
179,MIN_REDUCTION+222, // $NT
  }
,
{ // state 732
0x80000000|132, // match move
0x80000000|706, // no-match move
0x80000000|1636, // NT-test-match state for slashStar
  }
,
{ // state 733
MIN_REDUCTION+355, // (default reduction)
  }
,
{ // state 734
0x80000000|1567, // match move
0x80000000|1561, // no-match move
0x80000000|1594, // NT-test-match state for reserved
  }
,
{ // state 735
121,954, // "t"
  }
,
{ // state 736
0x80000000|1955, // match move
0x80000000|845, // no-match move
0x80000000|65, // NT-test-match state for doubleSlash
  }
,
{ // state 737
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
131,729, // oneLineComment
132,50, // blockComment
133,66, // doubleSlash
136,1210, // slashStar
149,144, // "/"
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 738
MIN_REDUCTION+115, // (default reduction)
  }
,
{ // state 739
2,429, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
129,493, // eol
130,1783, // comment
164,1076, // {10}
165,1589, // {13}
MIN_REDUCTION+263, // (default reduction)
  }
,
{ // state 740
0x80000000|1604, // match move
0x80000000|834, // no-match move
0x80000000|65, // NT-test-match state for doubleSlash
  }
,
{ // state 741
MIN_REDUCTION+361, // (default reduction)
  }
,
{ // state 742
2,396, // white*
MIN_REDUCTION+152, // (default reduction)
  }
,
{ // state 743
0x80000000|365, // match move
0x80000000|1106, // no-match move
0x80000000|1636, // NT-test-match state for slashStar
  }
,
{ // state 744
2,1953, // white*
MIN_REDUCTION+164, // (default reduction)
  }
,
{ // state 745
89,1091, // "c"
90,1091, // "l"
91,1091, // "a"
92,1091, // "s"
95,1091, // "e"
96,1091, // "!"
97,1091, // "="
98,1091, // "+"
102,1091, // "_"
103,1091, // "d"
104,1091, // "g"
105,1091, // "m"
106,1091, // "p"
107,1091, // "v"
108,1091, // "y"
109,1091, // "f"
110,1091, // "i"
111,1091, // {"A".."Z"}
112,1091, // "o"
113,1091, // "r"
114,1091, // "u"
115,1091, // "x"
116,1091, // {"j" "q"}
117,1091, // "b"
118,1091, // "h"
119,1091, // "k"
120,1091, // "n"
121,1091, // "t"
122,1091, // "w"
123,1091, // "z"
124,1091, // {"0".."9"}
127,1091, // " "
134,1325, // printable**
135,606, // printable
140,1091, // "["
141,1091, // "-"
142,1091, // "<"
143,1091, // "|"
144,1091, // {"?".."@"}
145,1091, // "&"
146,1091, // ")"
147,1091, // ","
148,1091, // "]"
149,1091, // "/"
150,1091, // {"#".."$"}
151,1091, // ";"
152,1091, // ">"
153,1091, // "{"
154,1091, // "%"
155,1091, // "("
156,1091, // "\"
157,1091, // "."
158,1091, // ":"
159,1091, // "}"
160,1091, // {"^" "`" "~"}
161,1091, // "'"
162,1091, // '"'
163,1091, // "*"
174,316, // printable*
  }
,
{ // state 746
2,1689, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
132,50, // blockComment
136,1210, // slashStar
149,1327, // "/"
MIN_REDUCTION+230, // (default reduction)
  }
,
{ // state 747
2,1730, // white*
125,2043, // white
126,877, // {12}
127,877, // " "
128,877, // {9}
129,1185, // eol
130,994, // comment
131,1236, // oneLineComment
132,838, // blockComment
133,1248, // doubleSlash
136,798, // slashStar
149,144, // "/"
164,1315, // {10}
165,904, // {13}
179,MIN_REDUCTION+194, // $NT
  }
,
{ // state 748
2,1540, // white*
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 749
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
129,493, // eol
130,1783, // comment
164,1076, // {10}
165,1589, // {13}
MIN_REDUCTION+214, // (default reduction)
  }
,
{ // state 750
MIN_REDUCTION+6, // (default reduction)
  }
,
{ // state 751
MIN_REDUCTION+352, // (default reduction)
  }
,
{ // state 752
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
132,50, // blockComment
136,1210, // slashStar
149,1327, // "/"
MIN_REDUCTION+223, // (default reduction)
  }
,
{ // state 753
0x80000000|165, // match move
0x80000000|473, // no-match move
0x80000000|65, // NT-test-match state for doubleSlash
  }
,
{ // state 754
MIN_REDUCTION+84, // (default reduction)
  }
,
{ // state 755
0x80000000|235, // match move
0x80000000|489, // no-match move
0x80000000|1636, // NT-test-match state for slashStar
  }
,
{ // state 756
125,808, // white
126,877, // {12}
127,877, // " "
128,877, // {9}
129,1185, // eol
130,994, // comment
131,1236, // oneLineComment
132,838, // blockComment
133,1248, // doubleSlash
136,798, // slashStar
149,144, // "/"
164,1315, // {10}
165,904, // {13}
179,MIN_REDUCTION+232, // $NT
  }
,
{ // state 757
0x80000000|319, // match move
0x80000000|47, // no-match move
0x80000000|1594, // NT-test-match state for reserved
  }
,
{ // state 758
2,1582, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
132,50, // blockComment
136,1210, // slashStar
149,1327, // "/"
MIN_REDUCTION+305, // (default reduction)
  }
,
{ // state 759
2,1544, // white*
125,2043, // white
126,877, // {12}
127,877, // " "
128,877, // {9}
129,1185, // eol
130,994, // comment
131,1236, // oneLineComment
132,838, // blockComment
133,1248, // doubleSlash
136,798, // slashStar
149,144, // "/"
164,1315, // {10}
165,904, // {13}
179,MIN_REDUCTION+209, // $NT
  }
,
{ // state 760
2,1228, // white*
125,2043, // white
126,877, // {12}
127,877, // " "
128,877, // {9}
129,1185, // eol
130,994, // comment
131,1236, // oneLineComment
132,838, // blockComment
133,1248, // doubleSlash
136,798, // slashStar
149,144, // "/"
164,1315, // {10}
165,904, // {13}
179,MIN_REDUCTION+278, // $NT
  }
,
{ // state 761
MIN_REDUCTION+184, // (default reduction)
  }
,
{ // state 762
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
131,729, // oneLineComment
132,50, // blockComment
133,66, // doubleSlash
136,1210, // slashStar
149,144, // "/"
MIN_REDUCTION+232, // (default reduction)
  }
,
{ // state 763
105,228, // "m"
  }
,
{ // state 764
MIN_REDUCTION+12, // (default reduction)
  }
,
{ // state 765
103,653, // "d"
  }
,
{ // state 766
2,886, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
129,493, // eol
130,1783, // comment
164,1076, // {10}
165,1589, // {13}
MIN_REDUCTION+242, // (default reduction)
  }
,
{ // state 767
2,1180, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
129,493, // eol
130,1783, // comment
164,1076, // {10}
165,1589, // {13}
MIN_REDUCTION+170, // (default reduction)
  }
,
{ // state 768
121,1374, // "t"
  }
,
{ // state 769
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
131,729, // oneLineComment
132,50, // blockComment
133,66, // doubleSlash
136,1210, // slashStar
149,144, // "/"
MIN_REDUCTION+199, // (default reduction)
  }
,
{ // state 770
120,1165, // "n"
  }
,
{ // state 771
0x80000000|1, // match move
0x80000000|1269, // no-match move
0x80000000|67, // NT-test-match state for idChar
  }
,
{ // state 772
2,1841, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
129,493, // eol
130,1783, // comment
164,1076, // {10}
165,1589, // {13}
MIN_REDUCTION+224, // (default reduction)
  }
,
{ // state 773
2,483, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
129,493, // eol
130,1783, // comment
164,1076, // {10}
165,1589, // {13}
MIN_REDUCTION+323, // (default reduction)
  }
,
{ // state 774
MIN_REDUCTION+52, // (default reduction)
  }
,
{ // state 775
110,328, // "i"
  }
,
{ // state 776
0x80000000|1, // match move
0x80000000|718, // no-match move
0x80000000|67, // NT-test-match state for idChar
  }
,
{ // state 777
2,1342, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
131,729, // oneLineComment
132,50, // blockComment
133,66, // doubleSlash
136,1210, // slashStar
149,144, // "/"
MIN_REDUCTION+197, // (default reduction)
  }
,
{ // state 778
113,1337, // "r"
  }
,
{ // state 779
89,1098, // "c"
  }
,
{ // state 780
0x80000000|1980, // match move
0x80000000|850, // no-match move
0x80000000|1636, // NT-test-match state for slashStar
  }
,
{ // state 781
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
131,729, // oneLineComment
132,50, // blockComment
133,66, // doubleSlash
136,1210, // slashStar
149,144, // "/"
MIN_REDUCTION+340, // (default reduction)
  }
,
{ // state 782
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
129,493, // eol
130,1783, // comment
164,1076, // {10}
165,1589, // {13}
MIN_REDUCTION+232, // (default reduction)
  }
,
{ // state 783
0x80000000|252, // match move
0x80000000|1542, // no-match move
0x80000000|1594, // NT-test-match state for reserved
  }
,
{ // state 784
0x80000000|62, // match move
0x80000000|272, // no-match move
0x80000000|1636, // NT-test-match state for slashStar
  }
,
{ // state 785
2,135, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
132,50, // blockComment
136,1210, // slashStar
149,1327, // "/"
MIN_REDUCTION+209, // (default reduction)
  }
,
{ // state 786
0x80000000|1, // match move
0x80000000|1254, // no-match move
0x80000000|532, // NT-test-match state for letter
  }
,
{ // state 787
95,654, // "e"
  }
,
{ // state 788
179,MIN_REDUCTION+321, // $NT
  }
,
{ // state 789
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
131,729, // oneLineComment
132,50, // blockComment
133,66, // doubleSlash
136,1210, // slashStar
149,144, // "/"
MIN_REDUCTION+145, // (default reduction)
  }
,
{ // state 790
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
129,493, // eol
130,1783, // comment
164,1076, // {10}
165,1589, // {13}
MIN_REDUCTION+304, // (default reduction)
  }
,
{ // state 791
112,1217, // "o"
  }
,
{ // state 792
120,503, // "n"
  }
,
{ // state 793
0x80000000|1554, // match move
0x80000000|647, // no-match move
0x80000000|1636, // NT-test-match state for slashStar
  }
,
{ // state 794
MIN_REDUCTION+78, // (default reduction)
  }
,
{ // state 795
0x80000000|1704, // match move
0x80000000|465, // no-match move
0x80000000|1636, // NT-test-match state for slashStar
  }
,
{ // state 796
2,1795, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
129,493, // eol
130,1783, // comment
164,1076, // {10}
165,1589, // {13}
MIN_REDUCTION+138, // (default reduction)
  }
,
{ // state 797
0x80000000|146, // match move
0x80000000|1308, // no-match move
0x80000000|65, // NT-test-match state for doubleSlash
  }
,
{ // state 798
89,738, // "c"
90,738, // "l"
91,738, // "a"
92,738, // "s"
95,738, // "e"
96,738, // "!"
97,738, // "="
98,738, // "+"
102,738, // "_"
103,738, // "d"
104,738, // "g"
105,738, // "m"
106,738, // "p"
107,738, // "v"
108,738, // "y"
109,738, // "f"
110,738, // "i"
111,738, // {"A".."Z"}
112,738, // "o"
113,738, // "r"
114,738, // "u"
115,738, // "x"
116,738, // {"j" "q"}
117,738, // "b"
118,738, // "h"
119,738, // "k"
120,738, // "n"
121,738, // "t"
122,738, // "w"
123,738, // "z"
124,738, // {"0".."9"}
127,738, // " "
128,738, // {9}
129,1246, // eol
137,138, // blockCommentContent*
138,1946, // starSlash
139,1218, // blockCommentContent
140,738, // "["
141,738, // "-"
142,738, // "<"
143,738, // "|"
144,738, // {"?".."@"}
145,738, // "&"
146,738, // ")"
147,738, // ","
148,738, // "]"
149,738, // "/"
150,738, // {"#".."$"}
151,738, // ";"
152,738, // ">"
153,738, // "{"
154,738, // "%"
155,738, // "("
156,738, // "\"
157,738, // "."
158,738, // ":"
159,738, // "}"
160,738, // {"^" "`" "~"}
161,738, // "'"
162,738, // '"'
163,865, // "*"
164,352, // {10}
165,376, // {13}
  }
,
{ // state 799
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
132,50, // blockComment
136,1210, // slashStar
149,1327, // "/"
MIN_REDUCTION+141, // (default reduction)
  }
,
{ // state 800
2,219, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
132,50, // blockComment
136,1210, // slashStar
149,1327, // "/"
MIN_REDUCTION+172, // (default reduction)
  }
,
{ // state 801
1,579, // start
2,1659, // white*
3,1878, // $$0
4,1070, // token
125,1580, // white
126,1489, // {12}
127,1489, // " "
128,1489, // {9}
130,1390, // comment
131,1643, // oneLineComment
132,1121, // blockComment
133,203, // doubleSlash
136,1532, // slashStar
149,144, // "/"
173,1612, // token*
178,MIN_REDUCTION+1, // $
  }
,
{ // state 802
0x80000000|109, // match move
0x80000000|1128, // no-match move
0x80000000|1594, // NT-test-match state for reserved
  }
,
{ // state 803
0x80000000|639, // match move
0x80000000|327, // no-match move
0x80000000|1636, // NT-test-match state for slashStar
  }
,
{ // state 804
0x80000000|507, // match move
0x80000000|1776, // no-match move
0x80000000|65, // NT-test-match state for doubleSlash
  }
,
{ // state 805
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
132,50, // blockComment
136,1210, // slashStar
149,1327, // "/"
MIN_REDUCTION+143, // (default reduction)
  }
,
{ // state 806
106,307, // "p"
  }
,
{ // state 807
2,1403, // white*
125,2043, // white
126,877, // {12}
127,877, // " "
128,877, // {9}
129,1185, // eol
130,994, // comment
131,1236, // oneLineComment
132,838, // blockComment
133,1248, // doubleSlash
136,798, // slashStar
149,144, // "/"
164,1315, // {10}
165,904, // {13}
179,MIN_REDUCTION+263, // $NT
  }
,
{ // state 808
179,MIN_REDUCTION+347, // $NT
MIN_REDUCTION+347, // (default reduction)
  }
,
{ // state 809
MIN_REDUCTION+86, // (default reduction)
  }
,
{ // state 810
0x80000000|1142, // match move
0x80000000|1423, // no-match move
0x80000000|1636, // NT-test-match state for slashStar
  }
,
{ // state 811
0x80000000|1976, // match move
0x80000000|783, // no-match move
0x80000000|65, // NT-test-match state for doubleSlash
  }
,
{ // state 812
0x80000000|1084, // match move
0x80000000|1870, // no-match move
0x80000000|65, // NT-test-match state for doubleSlash
  }
,
{ // state 813
0x80000000|412, // match move
0x80000000|209, // no-match move
0x80000000|65, // NT-test-match state for doubleSlash
  }
,
{ // state 814
2,435, // white*
MIN_REDUCTION+154, // (default reduction)
  }
,
{ // state 815
MIN_REDUCTION+358, // (default reduction)
  }
,
{ // state 816
0x80000000|1818, // match move
0x80000000|156, // no-match move
0x80000000|65, // NT-test-match state for doubleSlash
  }
,
{ // state 817
112,723, // "o"
  }
,
{ // state 818
179,MIN_REDUCTION+225, // $NT
  }
,
{ // state 819
121,528, // "t"
  }
,
{ // state 820
2,1385, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
132,50, // blockComment
136,1210, // slashStar
149,1327, // "/"
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 821
95,161, // "e"
  }
,
{ // state 822
125,808, // white
126,877, // {12}
127,877, // " "
128,877, // {9}
129,1185, // eol
130,994, // comment
131,1236, // oneLineComment
132,838, // blockComment
133,1248, // doubleSlash
136,798, // slashStar
149,144, // "/"
164,1315, // {10}
165,904, // {13}
179,MIN_REDUCTION+271, // $NT
  }
,
{ // state 823
2,517, // white*
125,2043, // white
126,877, // {12}
127,877, // " "
128,877, // {9}
129,1185, // eol
130,994, // comment
131,1236, // oneLineComment
132,838, // blockComment
133,1248, // doubleSlash
136,798, // slashStar
149,144, // "/"
164,1315, // {10}
165,904, // {13}
179,MIN_REDUCTION+251, // $NT
  }
,
{ // state 824
MIN_REDUCTION+119, // (default reduction)
  }
,
{ // state 825
0x80000000|675, // match move
0x80000000|2001, // no-match move
0x80000000|65, // NT-test-match state for doubleSlash
  }
,
{ // state 826
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
132,50, // blockComment
136,1210, // slashStar
149,1327, // "/"
MIN_REDUCTION+147, // (default reduction)
  }
,
{ // state 827
MIN_REDUCTION+68, // (default reduction)
  }
,
{ // state 828
MIN_REDUCTION+53, // (default reduction)
  }
,
{ // state 829
0x80000000|1, // match move
0x80000000|1149, // no-match move
0x80000000|67, // NT-test-match state for idChar
  }
,
{ // state 830
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
131,729, // oneLineComment
132,50, // blockComment
133,66, // doubleSlash
136,1210, // slashStar
149,144, // "/"
MIN_REDUCTION+265, // (default reduction)
  }
,
{ // state 831
0x80000000|1, // match move
0x80000000|727, // no-match move
0x80000000|67, // NT-test-match state for idChar
  }
,
{ // state 832
0x80000000|1, // match move
0x80000000|1138, // no-match move
0x80000000|67, // NT-test-match state for idChar
  }
,
{ // state 833
2,1634, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
131,729, // oneLineComment
132,50, // blockComment
133,66, // doubleSlash
136,1210, // slashStar
149,144, // "/"
169,1744, // idChar**
170,1450, // $$1
176,1477, // idChar*
MIN_REDUCTION+337, // (default reduction)
  }
,
{ // state 834
0x80000000|1515, // match move
0x80000000|766, // no-match move
0x80000000|1636, // NT-test-match state for slashStar
  }
,
{ // state 835
0x80000000|1050, // match move
0x80000000|854, // no-match move
0x80000000|1594, // NT-test-match state for reserved
  }
,
{ // state 836
0x80000000|1729, // match move
0x80000000|1749, // no-match move
0x80000000|1594, // NT-test-match state for reserved
  }
,
{ // state 837
2,1841, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
131,729, // oneLineComment
132,50, // blockComment
133,66, // doubleSlash
136,1210, // slashStar
149,144, // "/"
MIN_REDUCTION+224, // (default reduction)
  }
,
{ // state 838
179,MIN_REDUCTION+110, // $NT
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 839
0x80000000|1846, // match move
0x80000000|71, // no-match move
0x80000000|1636, // NT-test-match state for slashStar
  }
,
{ // state 840
89,1548, // "c"
  }
,
{ // state 841
2,262, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
132,50, // blockComment
136,1210, // slashStar
149,1327, // "/"
MIN_REDUCTION+132, // (default reduction)
  }
,
{ // state 842
2,1675, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
129,493, // eol
130,1783, // comment
164,1076, // {10}
165,1589, // {13}
MIN_REDUCTION+148, // (default reduction)
  }
,
{ // state 843
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
132,50, // blockComment
136,1210, // slashStar
149,1327, // "/"
MIN_REDUCTION+286, // (default reduction)
  }
,
{ // state 844
179,MIN_REDUCTION+195, // $NT
  }
,
{ // state 845
0x80000000|173, // match move
0x80000000|427, // no-match move
0x80000000|1636, // NT-test-match state for slashStar
  }
,
{ // state 846
0x80000000|1227, // match move
0x80000000|967, // no-match move
0x80000000|1636, // NT-test-match state for slashStar
  }
,
{ // state 847
2,1760, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
132,50, // blockComment
136,1210, // slashStar
149,1327, // "/"
MIN_REDUCTION+257, // (default reduction)
  }
,
{ // state 848
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
129,493, // eol
130,1783, // comment
164,1076, // {10}
165,1589, // {13}
MIN_REDUCTION+196, // (default reduction)
  }
,
{ // state 849
0x80000000|1, // match move
0x80000000|1238, // no-match move
0x80000000|67, // NT-test-match state for idChar
  }
,
{ // state 850
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
129,493, // eol
130,1783, // comment
164,1076, // {10}
165,1589, // {13}
MIN_REDUCTION+175, // (default reduction)
  }
,
{ // state 851
MIN_REDUCTION+175, // (default reduction)
  }
,
{ // state 852
113,829, // "r"
  }
,
{ // state 853
179,MIN_REDUCTION+198, // $NT
  }
,
{ // state 854
0x80000000|826, // match move
0x80000000|1944, // no-match move
0x80000000|1636, // NT-test-match state for slashStar
  }
,
{ // state 855
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
131,729, // oneLineComment
132,50, // blockComment
133,66, // doubleSlash
136,1210, // slashStar
149,144, // "/"
MIN_REDUCTION+181, // (default reduction)
  }
,
{ // state 856
2,1229, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
131,729, // oneLineComment
132,50, // blockComment
133,66, // doubleSlash
136,1210, // slashStar
149,144, // "/"
MIN_REDUCTION+174, // (default reduction)
  }
,
{ // state 857
0x80000000|502, // match move
0x80000000|424, // no-match move
0x80000000|1636, // NT-test-match state for slashStar
  }
,
{ // state 858
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
129,493, // eol
130,1783, // comment
164,1076, // {10}
165,1589, // {13}
MIN_REDUCTION+364, // (default reduction)
  }
,
{ // state 859
2,937, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
131,729, // oneLineComment
132,50, // blockComment
133,66, // doubleSlash
136,1210, // slashStar
149,144, // "/"
MIN_REDUCTION+150, // (default reduction)
  }
,
{ // state 860
MIN_REDUCTION+354, // (default reduction)
  }
,
{ // state 861
0x80000000|1344, // match move
0x80000000|1979, // no-match move
0x80000000|65, // NT-test-match state for doubleSlash
  }
,
{ // state 862
95,770, // "e"
  }
,
{ // state 863
89,636, // "c"
  }
,
{ // state 864
0x80000000|900, // match move
0x80000000|1836, // no-match move
0x80000000|1636, // NT-test-match state for slashStar
  }
,
{ // state 865
0x80000000|898, // match move
0x80000000|599, // no-match move
// T-test match for "/":
149,
  }
,
{ // state 866
MIN_REDUCTION+112, // (default reduction)
  }
,
{ // state 867
89,1091, // "c"
90,1091, // "l"
91,1091, // "a"
92,1091, // "s"
95,1091, // "e"
96,1091, // "!"
97,1091, // "="
98,1091, // "+"
102,1091, // "_"
103,1091, // "d"
104,1091, // "g"
105,1091, // "m"
106,1091, // "p"
107,1091, // "v"
108,1091, // "y"
109,1091, // "f"
110,1091, // "i"
111,1091, // {"A".."Z"}
112,1091, // "o"
113,1091, // "r"
114,1091, // "u"
115,1091, // "x"
116,1091, // {"j" "q"}
117,1091, // "b"
118,1091, // "h"
119,1091, // "k"
120,1091, // "n"
121,1091, // "t"
122,1091, // "w"
123,1091, // "z"
124,1091, // {"0".."9"}
127,1091, // " "
134,330, // printable**
135,606, // printable
140,1091, // "["
141,1091, // "-"
142,1091, // "<"
143,1091, // "|"
144,1091, // {"?".."@"}
145,1091, // "&"
146,1091, // ")"
147,1091, // ","
148,1091, // "]"
149,1091, // "/"
150,1091, // {"#".."$"}
151,1091, // ";"
152,1091, // ">"
153,1091, // "{"
154,1091, // "%"
155,1091, // "("
156,1091, // "\"
157,1091, // "."
158,1091, // ":"
159,1091, // "}"
160,1091, // {"^" "`" "~"}
161,1091, // "'"
162,1091, // '"'
163,1091, // "*"
174,316, // printable*
  }
,
{ // state 868
2,816, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
132,50, // blockComment
136,1210, // slashStar
149,1327, // "/"
MIN_REDUCTION+160, // (default reduction)
  }
,
{ // state 869
MIN_REDUCTION+41, // (default reduction)
  }
,
{ // state 870
179,MIN_REDUCTION+318, // $NT
  }
,
{ // state 871
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 872
2,1180, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
131,729, // oneLineComment
132,50, // blockComment
133,66, // doubleSlash
136,1210, // slashStar
149,144, // "/"
MIN_REDUCTION+170, // (default reduction)
  }
,
{ // state 873
0x80000000|285, // match move
0x80000000|97, // no-match move
0x80000000|65, // NT-test-match state for doubleSlash
  }
,
{ // state 874
120,93, // "n"
  }
,
{ // state 875
0x80000000|1051, // match move
0x80000000|1954, // no-match move
0x80000000|1636, // NT-test-match state for slashStar
  }
,
{ // state 876
0x80000000|968, // match move
0x80000000|1919, // no-match move
0x80000000|65, // NT-test-match state for doubleSlash
  }
,
{ // state 877
179,MIN_REDUCTION+106, // $NT
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 878
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 879
179,MIN_REDUCTION+210, // $NT
  }
,
{ // state 880
2,1336, // white*
125,2043, // white
126,877, // {12}
127,877, // " "
128,877, // {9}
129,1185, // eol
130,994, // comment
131,1236, // oneLineComment
132,838, // blockComment
133,1248, // doubleSlash
136,798, // slashStar
149,144, // "/"
164,1315, // {10}
165,904, // {13}
179,MIN_REDUCTION+269, // $NT
  }
,
{ // state 881
113,565, // "r"
  }
,
{ // state 882
95,567, // "e"
  }
,
{ // state 883
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
132,50, // blockComment
136,1210, // slashStar
149,1327, // "/"
MIN_REDUCTION+307, // (default reduction)
  }
,
{ // state 884
179,MIN_REDUCTION+330, // $NT
  }
,
{ // state 885
0x80000000|221, // match move
0x80000000|933, // no-match move
0x80000000|1594, // NT-test-match state for reserved
  }
,
{ // state 886
0x80000000|117, // match move
0x80000000|1527, // no-match move
0x80000000|65, // NT-test-match state for doubleSlash
  }
,
{ // state 887
0x80000000|868, // match move
0x80000000|1208, // no-match move
0x80000000|1636, // NT-test-match state for slashStar
  }
,
{ // state 888
179,MIN_REDUCTION+237, // $NT
  }
,
{ // state 889
112,398, // "o"
  }
,
{ // state 890
0x80000000|1380, // match move
0x80000000|199, // no-match move
0x80000000|1636, // NT-test-match state for slashStar
  }
,
{ // state 891
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
132,50, // blockComment
136,1210, // slashStar
149,1327, // "/"
MIN_REDUCTION+256, // (default reduction)
  }
,
{ // state 892
0x80000000|115, // match move
0x80000000|680, // no-match move
0x80000000|65, // NT-test-match state for doubleSlash
  }
,
{ // state 893
0x80000000|426, // match move
0x80000000|369, // no-match move
0x80000000|65, // NT-test-match state for doubleSlash
  }
,
{ // state 894
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
129,493, // eol
130,1783, // comment
164,1076, // {10}
165,1589, // {13}
MIN_REDUCTION+283, // (default reduction)
  }
,
{ // state 895
MIN_REDUCTION+357, // (default reduction)
  }
,
{ // state 896
113,388, // "r"
118,1884, // "h"
  }
,
{ // state 897
104,1249, // "g"
  }
,
{ // state 898
149,1797, // "/"
  }
,
{ // state 899
2,1736, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
132,50, // blockComment
136,1210, // slashStar
149,1327, // "/"
MIN_REDUCTION+260, // (default reduction)
  }
,
{ // state 900
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
132,50, // blockComment
136,1210, // slashStar
149,1327, // "/"
MIN_REDUCTION+229, // (default reduction)
  }
,
{ // state 901
0x80000000|232, // match move
0x80000000|1029, // no-match move
0x80000000|1636, // NT-test-match state for slashStar
  }
,
{ // state 902
MIN_REDUCTION+60, // (default reduction)
  }
,
{ // state 903
104,1267, // "g"
  }
,
{ // state 904
0x80000000|1105, // match move
0x80000000|1924, // no-match move
// T-test match for 10:
164,
  }
,
{ // state 905
91,287, // "a"
  }
,
{ // state 906
2,1748, // white*
125,2043, // white
126,877, // {12}
127,877, // " "
128,877, // {9}
129,1185, // eol
130,994, // comment
131,1236, // oneLineComment
132,838, // blockComment
133,1248, // doubleSlash
136,798, // slashStar
149,144, // "/"
164,1315, // {10}
165,904, // {13}
179,MIN_REDUCTION+185, // $NT
  }
,
{ // state 907
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
129,493, // eol
130,1783, // comment
164,1076, // {10}
165,1589, // {13}
MIN_REDUCTION+259, // (default reduction)
  }
,
{ // state 908
2,893, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
131,729, // oneLineComment
132,50, // blockComment
133,66, // doubleSlash
136,1210, // slashStar
149,144, // "/"
MIN_REDUCTION+96, // (default reduction)
  }
,
{ // state 909
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
131,729, // oneLineComment
132,50, // blockComment
133,66, // doubleSlash
136,1210, // slashStar
149,144, // "/"
MIN_REDUCTION+139, // (default reduction)
  }
,
{ // state 910
2,384, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
131,729, // oneLineComment
132,50, // blockComment
133,66, // doubleSlash
136,1210, // slashStar
149,144, // "/"
MIN_REDUCTION+320, // (default reduction)
  }
,
{ // state 911
179,MIN_REDUCTION+104, // $NT
  }
,
{ // state 912
0x80000000|191, // match move
0x80000000|440, // no-match move
0x80000000|1636, // NT-test-match state for slashStar
  }
,
{ // state 913
120,1345, // "n"
  }
,
{ // state 914
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
131,729, // oneLineComment
132,50, // blockComment
133,66, // doubleSlash
136,1210, // slashStar
149,144, // "/"
MIN_REDUCTION+177, // (default reduction)
  }
,
{ // state 915
MIN_REDUCTION+354, // (default reduction)
  }
,
{ // state 916
0x80000000|1834, // match move
0x80000000|1032, // no-match move
0x80000000|1636, // NT-test-match state for slashStar
  }
,
{ // state 917
0x80000000|1306, // match move
0x80000000|295, // no-match move
0x80000000|1594, // NT-test-match state for reserved
  }
,
{ // state 918
0x80000000|1983, // match move
0x80000000|575, // no-match move
0x80000000|65, // NT-test-match state for doubleSlash
  }
,
{ // state 919
120,103, // "n"
  }
,
{ // state 920
MIN_REDUCTION+360, // (default reduction)
  }
,
{ // state 921
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
131,729, // oneLineComment
132,50, // blockComment
133,66, // doubleSlash
136,1210, // slashStar
149,144, // "/"
MIN_REDUCTION+143, // (default reduction)
  }
,
{ // state 922
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
131,729, // oneLineComment
132,50, // blockComment
133,66, // doubleSlash
136,1210, // slashStar
149,144, // "/"
MIN_REDUCTION+304, // (default reduction)
  }
,
{ // state 923
0x80000000|1843, // match move
0x80000000|535, // no-match move
0x80000000|1636, // NT-test-match state for slashStar
  }
,
{ // state 924
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
129,493, // eol
130,1783, // comment
164,1076, // {10}
165,1589, // {13}
MIN_REDUCTION+161, // (default reduction)
  }
,
{ // state 925
MIN_REDUCTION+344, // (default reduction)
  }
,
{ // state 926
MIN_REDUCTION+271, // (default reduction)
  }
,
{ // state 927
0x80000000|1, // match move
0x80000000|804, // no-match move
0x80000000|67, // NT-test-match state for idChar
  }
,
{ // state 928
114,1232, // "u"
  }
,
{ // state 929
MIN_REDUCTION+18, // (default reduction)
  }
,
{ // state 930
2,390, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
129,493, // eol
130,1783, // comment
164,1076, // {10}
165,1589, // {13}
MIN_REDUCTION+100, // (default reduction)
  }
,
{ // state 931
179,MIN_REDUCTION+192, // $NT
  }
,
{ // state 932
0x80000000|1311, // match move
0x80000000|1484, // no-match move
0x80000000|65, // NT-test-match state for doubleSlash
  }
,
{ // state 933
0x80000000|1680, // match move
0x80000000|1506, // no-match move
0x80000000|1636, // NT-test-match state for slashStar
  }
,
{ // state 934
2,1971, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
129,493, // eol
130,1783, // comment
164,1076, // {10}
165,1589, // {13}
MIN_REDUCTION+296, // (default reduction)
  }
,
{ // state 935
89,738, // "c"
90,738, // "l"
91,738, // "a"
92,738, // "s"
95,738, // "e"
96,738, // "!"
97,738, // "="
98,738, // "+"
102,738, // "_"
103,738, // "d"
104,738, // "g"
105,738, // "m"
106,738, // "p"
107,738, // "v"
108,738, // "y"
109,738, // "f"
110,738, // "i"
111,738, // {"A".."Z"}
112,738, // "o"
113,738, // "r"
114,738, // "u"
115,738, // "x"
116,738, // {"j" "q"}
117,738, // "b"
118,738, // "h"
119,738, // "k"
120,738, // "n"
121,738, // "t"
122,738, // "w"
123,738, // "z"
124,738, // {"0".."9"}
127,738, // " "
128,738, // {9}
129,1246, // eol
138,491, // starSlash
139,453, // blockCommentContent
140,738, // "["
141,738, // "-"
142,738, // "<"
143,738, // "|"
144,738, // {"?".."@"}
145,738, // "&"
146,738, // ")"
147,738, // ","
148,738, // "]"
149,738, // "/"
150,738, // {"#".."$"}
151,738, // ";"
152,738, // ">"
153,738, // "{"
154,738, // "%"
155,738, // "("
156,738, // "\"
157,738, // "."
158,738, // ":"
159,738, // "}"
160,738, // {"^" "`" "~"}
161,738, // "'"
162,738, // '"'
163,1440, // "*"
164,352, // {10}
165,376, // {13}
  }
,
{ // state 936
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
129,493, // eol
130,1783, // comment
164,1076, // {10}
165,1589, // {13}
MIN_REDUCTION+363, // (default reduction)
  }
,
{ // state 937
0x80000000|1996, // match move
0x80000000|1008, // no-match move
0x80000000|65, // NT-test-match state for doubleSlash
  }
,
{ // state 938
90,151, // "l"
  }
,
{ // state 939
110,518, // "i"
  }
,
{ // state 940
0x80000000|496, // match move
0x80000000|1378, // no-match move
0x80000000|1594, // NT-test-match state for reserved
  }
,
{ // state 941
2,262, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
131,729, // oneLineComment
132,50, // blockComment
133,66, // doubleSlash
136,1210, // slashStar
149,144, // "/"
MIN_REDUCTION+132, // (default reduction)
  }
,
{ // state 942
2,1453, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
131,729, // oneLineComment
132,50, // blockComment
133,66, // doubleSlash
136,1210, // slashStar
149,144, // "/"
MIN_REDUCTION+200, // (default reduction)
  }
,
{ // state 943
2,1300, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
131,729, // oneLineComment
132,50, // blockComment
133,66, // doubleSlash
136,1210, // slashStar
149,144, // "/"
MIN_REDUCTION+168, // (default reduction)
  }
,
{ // state 944
179,MIN_REDUCTION+246, // $NT
  }
,
{ // state 945
MIN_REDUCTION+99, // (default reduction)
  }
,
{ // state 946
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
131,729, // oneLineComment
132,50, // blockComment
133,66, // doubleSlash
136,1210, // slashStar
149,144, // "/"
MIN_REDUCTION+171, // (default reduction)
  }
,
{ // state 947
2,1831, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
129,493, // eol
130,1783, // comment
164,1076, // {10}
165,1589, // {13}
MIN_REDUCTION+144, // (default reduction)
  }
,
{ // state 948
0x80000000|1928, // match move
0x80000000|802, // no-match move
0x80000000|65, // NT-test-match state for doubleSlash
  }
,
{ // state 949
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
131,729, // oneLineComment
132,50, // blockComment
133,66, // doubleSlash
136,1210, // slashStar
149,144, // "/"
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 950
2,1339, // white*
125,2043, // white
126,877, // {12}
127,877, // " "
128,877, // {9}
129,1185, // eol
130,994, // comment
131,1236, // oneLineComment
132,838, // blockComment
133,1248, // doubleSlash
136,798, // slashStar
149,144, // "/"
164,1315, // {10}
165,904, // {13}
179,MIN_REDUCTION+317, // $NT
  }
,
{ // state 951
2,1736, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
131,729, // oneLineComment
132,50, // blockComment
133,66, // doubleSlash
136,1210, // slashStar
149,144, // "/"
MIN_REDUCTION+260, // (default reduction)
  }
,
{ // state 952
0x80000000|1, // match move
0x80000000|1868, // no-match move
0x80000000|67, // NT-test-match state for idChar
  }
,
{ // state 953
0x80000000|1654, // match move
0x80000000|1335, // no-match move
0x80000000|65, // NT-test-match state for doubleSlash
  }
,
{ // state 954
110,169, // "i"
  }
,
{ // state 955
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
129,493, // eol
130,1783, // comment
164,1076, // {10}
165,1589, // {13}
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 956
89,768, // "c"
  }
,
{ // state 957
MIN_REDUCTION+145, // (default reduction)
  }
,
{ // state 958
MIN_REDUCTION+81, // (default reduction)
  }
,
{ // state 959
2,4, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
132,50, // blockComment
136,1210, // slashStar
149,1327, // "/"
MIN_REDUCTION+245, // (default reduction)
  }
,
{ // state 960
125,808, // white
126,877, // {12}
127,877, // " "
128,877, // {9}
129,1185, // eol
130,994, // comment
131,1236, // oneLineComment
132,838, // blockComment
133,1248, // doubleSlash
136,798, // slashStar
149,144, // "/"
164,1315, // {10}
165,904, // {13}
179,MIN_REDUCTION+292, // $NT
  }
,
{ // state 961
121,1058, // "t"
  }
,
{ // state 962
0x80000000|744, // match move
0x80000000|1810, // no-match move
0x80000000|1594, // NT-test-match state for reserved
  }
,
{ // state 963
113,1974, // "r"
  }
,
{ // state 964
104,643, // "g"
  }
,
{ // state 965
0x80000000|672, // match move
0x80000000|1982, // no-match move
0x80000000|65, // NT-test-match state for doubleSlash
  }
,
{ // state 966
0x80000000|1415, // match move
0x80000000|1584, // no-match move
0x80000000|65, // NT-test-match state for doubleSlash
  }
,
{ // state 967
2,937, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
129,493, // eol
130,1783, // comment
164,1076, // {10}
165,1589, // {13}
MIN_REDUCTION+150, // (default reduction)
  }
,
{ // state 968
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
131,729, // oneLineComment
132,50, // blockComment
133,66, // doubleSlash
136,1210, // slashStar
149,144, // "/"
MIN_REDUCTION+175, // (default reduction)
  }
,
{ // state 969
110,509, // "i"
  }
,
{ // state 970
2,420, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
131,729, // oneLineComment
132,50, // blockComment
133,66, // doubleSlash
136,1210, // slashStar
149,144, // "/"
MIN_REDUCTION+185, // (default reduction)
  }
,
{ // state 971
2,1540, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
132,50, // blockComment
136,1210, // slashStar
149,1327, // "/"
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 972
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
129,493, // eol
130,1783, // comment
164,1076, // {10}
165,1589, // {13}
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 973
113,1490, // "r"
  }
,
{ // state 974
125,808, // white
126,877, // {12}
127,877, // " "
128,877, // {9}
129,1185, // eol
130,994, // comment
131,1236, // oneLineComment
132,838, // blockComment
133,1248, // doubleSlash
136,798, // slashStar
149,144, // "/"
164,1315, // {10}
165,904, // {13}
179,MIN_REDUCTION+259, // $NT
  }
,
{ // state 975
2,892, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
131,729, // oneLineComment
132,50, // blockComment
133,66, // doubleSlash
136,1210, // slashStar
149,144, // "/"
MIN_REDUCTION+236, // (default reduction)
  }
,
{ // state 976
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
131,729, // oneLineComment
132,50, // blockComment
133,66, // doubleSlash
136,1210, // slashStar
149,144, // "/"
MIN_REDUCTION+137, // (default reduction)
  }
,
{ // state 977
2,1657, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
132,50, // blockComment
136,1210, // slashStar
149,1327, // "/"
MIN_REDUCTION+158, // (default reduction)
  }
,
{ // state 978
125,808, // white
126,877, // {12}
127,877, // " "
128,877, // {9}
129,1185, // eol
130,994, // comment
131,1236, // oneLineComment
132,838, // blockComment
133,1248, // doubleSlash
136,798, // slashStar
149,144, // "/"
164,1315, // {10}
165,904, // {13}
179,MIN_REDUCTION+247, // $NT
  }
,
{ // state 979
0x80000000|752, // match move
0x80000000|56, // no-match move
0x80000000|1636, // NT-test-match state for slashStar
  }
,
{ // state 980
95,281, // "e"
  }
,
{ // state 981
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
129,493, // eol
130,1783, // comment
164,1076, // {10}
165,1589, // {13}
MIN_REDUCTION+271, // (default reduction)
  }
,
{ // state 982
0x80000000|1948, // match move
0x80000000|1068, // no-match move
0x80000000|1636, // NT-test-match state for slashStar
  }
,
{ // state 983
0x80000000|1628, // match move
0x80000000|1571, // no-match move
0x80000000|1594, // NT-test-match state for reserved
  }
,
{ // state 984
0x80000000|1, // match move
0x80000000|1004, // no-match move
0x80000000|67, // NT-test-match state for idChar
  }
,
{ // state 985
MIN_REDUCTION+80, // (default reduction)
  }
,
{ // state 986
0x80000000|1256, // match move
0x80000000|1560, // no-match move
0x80000000|1594, // NT-test-match state for reserved
  }
,
{ // state 987
89,699, // "c"
  }
,
{ // state 988
149,261, // "/"
  }
,
{ // state 989
2,435, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
129,493, // eol
130,1783, // comment
164,1076, // {10}
165,1589, // {13}
MIN_REDUCTION+154, // (default reduction)
  }
,
{ // state 990
2,1971, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
131,729, // oneLineComment
132,50, // blockComment
133,66, // doubleSlash
136,1210, // slashStar
149,144, // "/"
MIN_REDUCTION+296, // (default reduction)
  }
,
{ // state 991
MIN_REDUCTION+28, // (default reduction)
  }
,
{ // state 992
0x80000000|1, // match move
0x80000000|2029, // no-match move
0x80000000|67, // NT-test-match state for idChar
  }
,
{ // state 993
0x80000000|1023, // match move
0x80000000|1086, // no-match move
0x80000000|1636, // NT-test-match state for slashStar
  }
,
{ // state 994
179,MIN_REDUCTION+108, // $NT
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 995
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
131,729, // oneLineComment
132,50, // blockComment
133,66, // doubleSlash
136,1210, // slashStar
149,144, // "/"
MIN_REDUCTION+319, // (default reduction)
  }
,
{ // state 996
0x80000000|471, // match move
0x80000000|1487, // no-match move
0x80000000|1636, // NT-test-match state for slashStar
  }
,
{ // state 997
0x80000000|148, // match move
0x80000000|1984, // no-match move
0x80000000|1636, // NT-test-match state for slashStar
  }
,
{ // state 998
113,1162, // "r"
  }
,
{ // state 999
179,MIN_REDUCTION+324, // $NT
  }
,
{ // state 1000
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
132,50, // blockComment
136,1210, // slashStar
149,1327, // "/"
MIN_REDUCTION+244, // (default reduction)
  }
,
{ // state 1001
0x80000000|1067, // match move
0x80000000|1421, // no-match move
0x80000000|1636, // NT-test-match state for slashStar
  }
,
{ // state 1002
92,1662, // "s"
121,254, // "t"
  }
,
{ // state 1003
108,150, // "y"
112,1301, // "o"
113,160, // "r"
  }
,
{ // state 1004
0x80000000|970, // match move
0x80000000|1727, // no-match move
0x80000000|65, // NT-test-match state for doubleSlash
  }
,
{ // state 1005
0x80000000|202, // match move
0x80000000|147, // no-match move
0x80000000|1594, // NT-test-match state for reserved
  }
,
{ // state 1006
113,705, // "r"
  }
,
{ // state 1007
110,10, // "i"
113,889, // "r"
  }
,
{ // state 1008
0x80000000|717, // match move
0x80000000|564, // no-match move
0x80000000|1594, // NT-test-match state for reserved
  }
,
{ // state 1009
0x80000000|633, // match move
0x80000000|1075, // no-match move
0x80000000|1636, // NT-test-match state for slashStar
  }
,
{ // state 1010
179,MIN_REDUCTION+276, // $NT
  }
,
{ // state 1011
120,566, // "n"
  }
,
{ // state 1012
0x80000000|1485, // match move
0x80000000|1616, // no-match move
0x80000000|65, // NT-test-match state for doubleSlash
  }
,
{ // state 1013
2,918, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
131,729, // oneLineComment
132,50, // blockComment
133,66, // doubleSlash
136,1210, // slashStar
149,144, // "/"
MIN_REDUCTION+275, // (default reduction)
  }
,
{ // state 1014
MIN_REDUCTION+128, // (default reduction)
  }
,
{ // state 1015
0x80000000|1474, // match move
0x80000000|2036, // no-match move
// T-test match for "-":
141,
  }
,
{ // state 1016
0x80000000|475, // match move
0x80000000|1175, // no-match move
0x80000000|1636, // NT-test-match state for slashStar
  }
,
{ // state 1017
0x80000000|1083, // match move
0x80000000|993, // no-match move
0x80000000|65, // NT-test-match state for doubleSlash
  }
,
{ // state 1018
117,1486, // "b"
  }
,
{ // state 1019
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
129,493, // eol
130,1783, // comment
164,1076, // {10}
165,1589, // {13}
MIN_REDUCTION+137, // (default reduction)
  }
,
{ // state 1020
0x80000000|1, // match move
0x80000000|1012, // no-match move
0x80000000|67, // NT-test-match state for idChar
  }
,
{ // state 1021
MIN_REDUCTION+202, // (default reduction)
  }
,
{ // state 1022
MIN_REDUCTION+357, // (default reduction)
  }
,
{ // state 1023
2,658, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
132,50, // blockComment
136,1210, // slashStar
149,1327, // "/"
MIN_REDUCTION+251, // (default reduction)
  }
,
{ // state 1024
2,1159, // white*
125,2043, // white
126,877, // {12}
127,877, // " "
128,877, // {9}
129,1185, // eol
130,994, // comment
131,1236, // oneLineComment
132,838, // blockComment
133,1248, // doubleSlash
136,798, // slashStar
149,144, // "/"
164,1315, // {10}
165,904, // {13}
179,MIN_REDUCTION+314, // $NT
  }
,
{ // state 1025
0x80000000|1278, // match move
0x80000000|497, // no-match move
0x80000000|65, // NT-test-match state for doubleSlash
  }
,
{ // state 1026
90,121, // "l"
  }
,
{ // state 1027
0x80000000|1244, // match move
0x80000000|1356, // no-match move
0x80000000|65, // NT-test-match state for doubleSlash
  }
,
{ // state 1028
0x80000000|1504, // match move
0x80000000|253, // no-match move
0x80000000|65, // NT-test-match state for doubleSlash
  }
,
{ // state 1029
2,216, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
129,493, // eol
130,1783, // comment
164,1076, // {10}
165,1589, // {13}
MIN_REDUCTION+188, // (default reduction)
  }
,
{ // state 1030
0x80000000|1145, // match move
0x80000000|451, // no-match move
0x80000000|1636, // NT-test-match state for slashStar
  }
,
{ // state 1031
125,808, // white
126,877, // {12}
127,877, // " "
128,877, // {9}
129,1185, // eol
130,994, // comment
131,1236, // oneLineComment
132,838, // blockComment
133,1248, // doubleSlash
136,798, // slashStar
149,144, // "/"
164,1315, // {10}
165,904, // {13}
179,MIN_REDUCTION+190, // $NT
  }
,
{ // state 1032
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
129,493, // eol
130,1783, // comment
164,1076, // {10}
165,1589, // {13}
MIN_REDUCTION+131, // (default reduction)
  }
,
{ // state 1033
95,1911, // "e"
  }
,
{ // state 1034
0x80000000|1, // match move
0x80000000|1078, // no-match move
0x80000000|67, // NT-test-match state for idChar
  }
,
{ // state 1035
0x80000000|1917, // match move
0x80000000|981, // no-match move
0x80000000|1636, // NT-test-match state for slashStar
  }
,
{ // state 1036
0x80000000|1649, // match move
0x80000000|1737, // no-match move
0x80000000|1594, // NT-test-match state for reserved
  }
,
{ // state 1037
0x80000000|1990, // match move
0x80000000|773, // no-match move
0x80000000|1636, // NT-test-match state for slashStar
  }
,
{ // state 1038
0x80000000|1865, // match move
0x80000000|276, // no-match move
0x80000000|1594, // NT-test-match state for reserved
  }
,
{ // state 1039
MIN_REDUCTION+65, // (default reduction)
  }
,
{ // state 1040
2,1896, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
129,493, // eol
130,1783, // comment
164,1076, // {10}
165,1589, // {13}
MIN_REDUCTION+191, // (default reduction)
  }
,
{ // state 1041
2,1342, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
132,50, // blockComment
136,1210, // slashStar
149,1327, // "/"
MIN_REDUCTION+197, // (default reduction)
  }
,
{ // state 1042
MIN_REDUCTION+66, // (default reduction)
  }
,
{ // state 1043
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
132,50, // blockComment
136,1210, // slashStar
149,1327, // "/"
MIN_REDUCTION+331, // (default reduction)
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
{ // state 1044
110,819, // "i"
  }
,
{ // state 1045
0x80000000|1, // match move
0x80000000|1017, // no-match move
0x80000000|67, // NT-test-match state for idChar
  }
,
{ // state 1046
2,244, // white*
125,2043, // white
126,877, // {12}
127,877, // " "
128,877, // {9}
129,1185, // eol
130,994, // comment
131,1236, // oneLineComment
132,838, // blockComment
133,1248, // doubleSlash
136,798, // slashStar
149,144, // "/"
164,1315, // {10}
165,904, // {13}
179,MIN_REDUCTION+203, // $NT
  }
,
{ // state 1047
2,1535, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
131,729, // oneLineComment
132,50, // blockComment
133,66, // doubleSlash
136,1210, // slashStar
149,144, // "/"
MIN_REDUCTION+266, // (default reduction)
  }
,
{ // state 1048
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
132,50, // blockComment
136,1210, // slashStar
149,1327, // "/"
MIN_REDUCTION+250, // (default reduction)
  }
,
{ // state 1049
2,1495, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
129,493, // eol
130,1783, // comment
164,1076, // {10}
165,1589, // {13}
MIN_REDUCTION+278, // (default reduction)
  }
,
{ // state 1050
MIN_REDUCTION+147, // (default reduction)
  }
,
{ // state 1051
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
132,50, // blockComment
136,1210, // slashStar
149,1327, // "/"
MIN_REDUCTION+179, // (default reduction)
  }
,
{ // state 1052
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 1053
2,648, // white*
125,2043, // white
126,877, // {12}
127,877, // " "
128,877, // {9}
129,1185, // eol
130,994, // comment
131,1236, // oneLineComment
132,838, // blockComment
133,1248, // doubleSlash
136,798, // slashStar
149,144, // "/"
164,1315, // {10}
165,904, // {13}
179,MIN_REDUCTION+212, // $NT
  }
,
{ // state 1054
0x80000000|1823, // match move
0x80000000|588, // no-match move
0x80000000|1594, // NT-test-match state for reserved
  }
,
{ // state 1055
0x80000000|1, // match move
0x80000000|2019, // no-match move
0x80000000|67, // NT-test-match state for idChar
  }
,
{ // state 1056
MIN_REDUCTION+229, // (default reduction)
  }
,
{ // state 1057
MIN_REDUCTION+67, // (default reduction)
  }
,
{ // state 1058
0x80000000|1, // match move
0x80000000|96, // no-match move
0x80000000|67, // NT-test-match state for idChar
  }
,
{ // state 1059
113,874, // "r"
  }
,
{ // state 1060
MIN_REDUCTION+55, // (default reduction)
  }
,
{ // state 1061
92,1111, // "s"
117,1888, // "b"
  }
,
{ // state 1062
MIN_REDUCTION+133, // (default reduction)
  }
,
{ // state 1063
2,1831, // white*
MIN_REDUCTION+144, // (default reduction)
  }
,
{ // state 1064
2,205, // white*
MIN_REDUCTION+156, // (default reduction)
  }
,
{ // state 1065
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
132,50, // blockComment
136,1210, // slashStar
149,1327, // "/"
MIN_REDUCTION+292, // (default reduction)
  }
,
{ // state 1066
2,1502, // white*
125,2043, // white
126,877, // {12}
127,877, // " "
128,877, // {9}
129,1185, // eol
130,994, // comment
131,1236, // oneLineComment
132,838, // blockComment
133,1248, // doubleSlash
136,798, // slashStar
149,144, // "/"
164,1315, // {10}
165,904, // {13}
179,MIN_REDUCTION+221, // $NT
  }
,
{ // state 1067
2,1287, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
132,50, // blockComment
136,1210, // slashStar
149,1327, // "/"
MIN_REDUCTION+182, // (default reduction)
  }
,
{ // state 1068
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
129,493, // eol
130,1783, // comment
164,1076, // {10}
165,1589, // {13}
MIN_REDUCTION+169, // (default reduction)
  }
,
{ // state 1069
113,1093, // "r"
  }
,
{ // state 1070
MIN_REDUCTION+343, // (default reduction)
  }
,
{ // state 1071
91,1832, // "a"
  }
,
{ // state 1072
103,506, // "d"
  }
,
{ // state 1073
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
129,493, // eol
130,1783, // comment
164,1076, // {10}
165,1589, // {13}
MIN_REDUCTION+220, // (default reduction)
  }
,
{ // state 1074
2,1229, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
129,493, // eol
130,1783, // comment
164,1076, // {10}
165,1589, // {13}
MIN_REDUCTION+174, // (default reduction)
  }
,
{ // state 1075
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
129,493, // eol
130,1783, // comment
164,1076, // {10}
165,1589, // {13}
MIN_REDUCTION+99, // (default reduction)
  }
,
{ // state 1076
MIN_REDUCTION+121, // (default reduction)
  }
,
{ // state 1077
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
131,729, // oneLineComment
132,50, // blockComment
133,66, // doubleSlash
136,1210, // slashStar
149,144, // "/"
MIN_REDUCTION+313, // (default reduction)
  }
,
{ // state 1078
2,1752, // white*
125,2043, // white
126,877, // {12}
127,877, // " "
128,877, // {9}
129,1185, // eol
130,994, // comment
131,1236, // oneLineComment
132,838, // blockComment
133,1248, // doubleSlash
136,798, // slashStar
149,144, // "/"
164,1315, // {10}
165,904, // {13}
179,MIN_REDUCTION+188, // $NT
  }
,
{ // state 1079
MIN_REDUCTION+241, // (default reduction)
  }
,
{ // state 1080
120,1709, // "n"
  }
,
{ // state 1081
0x80000000|661, // match move
0x80000000|2005, // no-match move
0x80000000|1636, // NT-test-match state for slashStar
  }
,
{ // state 1082
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
131,729, // oneLineComment
132,50, // blockComment
133,66, // doubleSlash
136,1210, // slashStar
149,144, // "/"
MIN_REDUCTION+179, // (default reduction)
  }
,
{ // state 1083
2,658, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
131,729, // oneLineComment
132,50, // blockComment
133,66, // doubleSlash
136,1210, // slashStar
149,144, // "/"
MIN_REDUCTION+251, // (default reduction)
  }
,
{ // state 1084
2,1136, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
131,729, // oneLineComment
132,50, // blockComment
133,66, // doubleSlash
136,1210, // slashStar
149,144, // "/"
MIN_REDUCTION+287, // (default reduction)
  }
,
{ // state 1085
2,1259, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
131,729, // oneLineComment
132,50, // blockComment
133,66, // doubleSlash
136,1210, // slashStar
149,144, // "/"
MIN_REDUCTION+293, // (default reduction)
  }
,
{ // state 1086
2,658, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
129,493, // eol
130,1783, // comment
164,1076, // {10}
165,1589, // {13}
MIN_REDUCTION+251, // (default reduction)
  }
,
{ // state 1087
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
129,493, // eol
130,1783, // comment
164,1076, // {10}
165,1589, // {13}
MIN_REDUCTION+133, // (default reduction)
  }
,
{ // state 1088
2,435, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
132,50, // blockComment
136,1210, // slashStar
149,1327, // "/"
MIN_REDUCTION+154, // (default reduction)
  }
,
{ // state 1089
0x80000000|1, // match move
0x80000000|85, // no-match move
0x80000000|67, // NT-test-match state for idChar
  }
,
{ // state 1090
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
129,493, // eol
130,1783, // comment
164,1076, // {10}
165,1589, // {13}
MIN_REDUCTION+163, // (default reduction)
  }
,
{ // state 1091
0x80000000|610, // match move
0x80000000|83, // no-match move
0x80000000|1101, // NT-test-match state for printable
  }
,
{ // state 1092
MIN_REDUCTION+256, // (default reduction)
  }
,
{ // state 1093
0x80000000|1, // match move
0x80000000|116, // no-match move
0x80000000|67, // NT-test-match state for idChar
  }
,
{ // state 1094
0x80000000|1371, // match move
0x80000000|133, // no-match move
0x80000000|67, // NT-test-match state for idChar
  }
,
{ // state 1095
2,932, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
131,729, // oneLineComment
132,50, // blockComment
133,66, // doubleSlash
136,1210, // slashStar
149,144, // "/"
MIN_REDUCTION+365, // (default reduction)
  }
,
{ // state 1096
MIN_REDUCTION+163, // (default reduction)
  }
,
{ // state 1097
0x80000000|971, // match move
0x80000000|1583, // no-match move
0x80000000|1636, // NT-test-match state for slashStar
  }
,
{ // state 1098
121,849, // "t"
  }
,
{ // state 1099
0x80000000|1088, // match move
0x80000000|989, // no-match move
0x80000000|1636, // NT-test-match state for slashStar
  }
,
{ // state 1100
0x80000000|1193, // match move
0x80000000|64, // no-match move
0x80000000|1594, // NT-test-match state for reserved
  }
,
{ // state 1101
89,1323, // "c"
90,1323, // "l"
91,1323, // "a"
92,1323, // "s"
95,1323, // "e"
96,1323, // "!"
97,1323, // "="
98,1323, // "+"
102,1323, // "_"
103,1323, // "d"
104,1323, // "g"
105,1323, // "m"
106,1323, // "p"
107,1323, // "v"
108,1323, // "y"
109,1323, // "f"
110,1323, // "i"
111,1323, // {"A".."Z"}
112,1323, // "o"
113,1323, // "r"
114,1323, // "u"
115,1323, // "x"
116,1323, // {"j" "q"}
117,1323, // "b"
118,1323, // "h"
119,1323, // "k"
120,1323, // "n"
121,1323, // "t"
122,1323, // "w"
123,1323, // "z"
124,1323, // {"0".."9"}
127,1323, // " "
140,1323, // "["
141,1323, // "-"
142,1323, // "<"
143,1323, // "|"
144,1323, // {"?".."@"}
145,1323, // "&"
146,1323, // ")"
147,1323, // ","
148,1323, // "]"
149,1323, // "/"
150,1323, // {"#".."$"}
151,1323, // ";"
152,1323, // ">"
153,1323, // "{"
154,1323, // "%"
155,1323, // "("
156,1323, // "\"
157,1323, // "."
158,1323, // ":"
159,1323, // "}"
160,1323, // {"^" "`" "~"}
161,1323, // "'"
162,1323, // '"'
163,1323, // "*"
  }
,
{ // state 1102
125,808, // white
126,877, // {12}
127,877, // " "
128,877, // {9}
129,1185, // eol
130,994, // comment
131,1236, // oneLineComment
132,838, // blockComment
133,1248, // doubleSlash
136,798, // slashStar
149,144, // "/"
164,1315, // {10}
165,904, // {13}
179,MIN_REDUCTION+181, // $NT
  }
,
{ // state 1103
0x80000000|1313, // match move
0x80000000|1494, // no-match move
0x80000000|1636, // NT-test-match state for slashStar
  }
,
{ // state 1104
0x80000000|92, // match move
0x80000000|749, // no-match move
0x80000000|1636, // NT-test-match state for slashStar
  }
,
{ // state 1105
164,1501, // {10}
  }
,
{ // state 1106
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
129,493, // eol
130,1783, // comment
164,1076, // {10}
165,1589, // {13}
MIN_REDUCTION+155, // (default reduction)
  }
,
{ // state 1107
120,897, // "n"
  }
,
{ // state 1108
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
132,50, // blockComment
136,1210, // slashStar
149,1327, // "/"
MIN_REDUCTION+137, // (default reduction)
  }
,
{ // state 1109
91,1801, // "a"
  }
,
{ // state 1110
0x80000000|1607, // match move
0x80000000|2028, // no-match move
0x80000000|1594, // NT-test-match state for reserved
  }
,
{ // state 1111
92,716, // "s"
  }
,
{ // state 1112
0x80000000|437, // match move
0x80000000|351, // no-match move
0x80000000|65, // NT-test-match state for doubleSlash
  }
,
{ // state 1113
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
131,729, // oneLineComment
132,50, // blockComment
133,66, // doubleSlash
136,1210, // slashStar
149,144, // "/"
MIN_REDUCTION+167, // (default reduction)
  }
,
{ // state 1114
MIN_REDUCTION+44, // (default reduction)
  }
,
{ // state 1115
2,1795, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
132,50, // blockComment
136,1210, // slashStar
149,1327, // "/"
MIN_REDUCTION+138, // (default reduction)
  }
,
{ // state 1116
2,1764, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
132,50, // blockComment
136,1210, // slashStar
149,1327, // "/"
MIN_REDUCTION+326, // (default reduction)
  }
,
{ // state 1117
MIN_REDUCTION+9, // (default reduction)
  }
,
{ // state 1118
0x80000000|659, // match move
0x80000000|1124, // no-match move
0x80000000|1636, // NT-test-match state for slashStar
  }
,
{ // state 1119
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
132,50, // blockComment
136,1210, // slashStar
149,1327, // "/"
MIN_REDUCTION+205, // (default reduction)
  }
,
{ // state 1120
113,721, // "r"
  }
,
{ // state 1121
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 1122
2,1223, // white*
125,2043, // white
126,877, // {12}
127,877, // " "
128,877, // {9}
129,1185, // eol
130,994, // comment
131,1236, // oneLineComment
132,838, // blockComment
133,1248, // doubleSlash
136,798, // slashStar
149,144, // "/"
164,1315, // {10}
165,904, // {13}
179,MIN_REDUCTION+266, // $NT
  }
,
{ // state 1123
0x80000000|1449, // match move
0x80000000|189, // no-match move
// T-test match for "=":
97,
  }
,
{ // state 1124
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
129,493, // eol
130,1783, // comment
164,1076, // {10}
165,1589, // {13}
MIN_REDUCTION+217, // (default reduction)
  }
,
{ // state 1125
92,1617, // "s"
121,1094, // "t"
  }
,
{ // state 1126
2,1651, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
129,493, // eol
130,1783, // comment
164,1076, // {10}
165,1589, // {13}
MIN_REDUCTION+178, // (default reduction)
  }
,
{ // state 1127
95,1808, // "e"
  }
,
{ // state 1128
0x80000000|883, // match move
0x80000000|1213, // no-match move
0x80000000|1636, // NT-test-match state for slashStar
  }
,
{ // state 1129
MIN_REDUCTION+280, // (default reduction)
  }
,
{ // state 1130
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
132,50, // blockComment
136,1210, // slashStar
149,1327, // "/"
MIN_REDUCTION+268, // (default reduction)
  }
,
{ // state 1131
0x80000000|1, // match move
0x80000000|377, // no-match move
0x80000000|67, // NT-test-match state for idChar
  }
,
{ // state 1132
2,1675, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
132,50, // blockComment
136,1210, // slashStar
149,1327, // "/"
MIN_REDUCTION+148, // (default reduction)
  }
,
{ // state 1133
MIN_REDUCTION+358, // (default reduction)
  }
,
{ // state 1134
0x80000000|589, // match move
0x80000000|1016, // no-match move
0x80000000|1594, // NT-test-match state for reserved
  }
,
{ // state 1135
0x80000000|1253, // match move
0x80000000|1676, // no-match move
0x80000000|65, // NT-test-match state for doubleSlash
  }
,
{ // state 1136
0x80000000|361, // match move
0x80000000|547, // no-match move
0x80000000|65, // NT-test-match state for doubleSlash
  }
,
{ // state 1137
95,641, // "e"
  }
,
{ // state 1138
0x80000000|1384, // match move
0x80000000|1081, // no-match move
0x80000000|65, // NT-test-match state for doubleSlash
  }
,
{ // state 1139
113,961, // "r"
  }
,
{ // state 1140
MIN_REDUCTION+23, // (default reduction)
  }
,
{ // state 1141
112,1957, // "o"
  }
,
{ // state 1142
2,1198, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
132,50, // blockComment
136,1210, // slashStar
149,1327, // "/"
MIN_REDUCTION+221, // (default reduction)
  }
,
{ // state 1143
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
132,50, // blockComment
136,1210, // slashStar
149,1327, // "/"
MIN_REDUCTION+208, // (default reduction)
  }
,
{ // state 1144
0x80000000|1, // match move
0x80000000|1401, // no-match move
0x80000000|67, // NT-test-match state for idChar
  }
,
{ // state 1145
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
132,50, // blockComment
136,1210, // slashStar
149,1327, // "/"
MIN_REDUCTION+190, // (default reduction)
  }
,
{ // state 1146
0x80000000|1693, // match move
0x80000000|393, // no-match move
0x80000000|67, // NT-test-match state for idChar
  }
,
{ // state 1147
0x80000000|26, // match move
0x80000000|1525, // no-match move
0x80000000|1594, // NT-test-match state for reserved
  }
,
{ // state 1148
0x80000000|379, // match move
0x80000000|1321, // no-match move
0x80000000|1594, // NT-test-match state for reserved
  }
,
{ // state 1149
0x80000000|2023, // match move
0x80000000|784, // no-match move
0x80000000|65, // NT-test-match state for doubleSlash
  }
,
{ // state 1150
MIN_REDUCTION+13, // (default reduction)
  }
,
{ // state 1151
0x80000000|533, // match move
0x80000000|1894, // no-match move
0x80000000|65, // NT-test-match state for doubleSlash
  }
,
{ // state 1152
90,1376, // "l"
110,500, // "i"
  }
,
{ // state 1153
120,1920, // "n"
  }
,
{ // state 1154
119,591, // "k"
  }
,
{ // state 1155
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
131,729, // oneLineComment
132,50, // blockComment
133,66, // doubleSlash
136,1210, // slashStar
149,144, // "/"
MIN_REDUCTION+283, // (default reduction)
  }
,
{ // state 1156
121,1530, // "t"
  }
,
{ // state 1157
0x80000000|1492, // match move
0x80000000|1503, // no-match move
0x80000000|1636, // NT-test-match state for slashStar
  }
,
{ // state 1158
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
131,729, // oneLineComment
132,50, // blockComment
133,66, // doubleSlash
136,1210, // slashStar
149,144, // "/"
MIN_REDUCTION+141, // (default reduction)
  }
,
{ // state 1159
125,808, // white
126,877, // {12}
127,877, // " "
128,877, // {9}
129,1185, // eol
130,994, // comment
131,1236, // oneLineComment
132,838, // blockComment
133,1248, // doubleSlash
136,798, // slashStar
149,144, // "/"
164,1315, // {10}
165,904, // {13}
179,MIN_REDUCTION+313, // $NT
  }
,
{ // state 1160
MIN_REDUCTION+226, // (default reduction)
  }
,
{ // state 1161
MIN_REDUCTION+205, // (default reduction)
  }
,
{ // state 1162
91,1603, // "a"
  }
,
{ // state 1163
MIN_REDUCTION+102, // (default reduction)
  }
,
{ // state 1164
91,1405, // "a"
  }
,
{ // state 1165
103,1608, // "d"
  }
,
{ // state 1166
0x80000000|526, // match move
0x80000000|1206, // no-match move
0x80000000|67, // NT-test-match state for idChar
  }
,
{ // state 1167
0x80000000|425, // match move
0x80000000|1593, // no-match move
0x80000000|1636, // NT-test-match state for slashStar
  }
,
{ // state 1168
2,1270, // white*
125,2043, // white
126,877, // {12}
127,877, // " "
128,877, // {9}
129,1185, // eol
130,994, // comment
131,1236, // oneLineComment
132,838, // blockComment
133,1248, // doubleSlash
136,798, // slashStar
149,144, // "/"
164,1315, // {10}
165,904, // {13}
179,MIN_REDUCTION+302, // $NT
  }
,
{ // state 1169
2,918, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
132,50, // blockComment
136,1210, // slashStar
149,1327, // "/"
MIN_REDUCTION+275, // (default reduction)
  }
,
{ // state 1170
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
131,729, // oneLineComment
132,50, // blockComment
133,66, // doubleSlash
136,1210, // slashStar
149,144, // "/"
MIN_REDUCTION+363, // (default reduction)
  }
,
{ // state 1171
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
131,729, // oneLineComment
132,50, // blockComment
133,66, // doubleSlash
136,1210, // slashStar
149,144, // "/"
MIN_REDUCTION+99, // (default reduction)
  }
,
{ // state 1172
2,569, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
129,493, // eol
130,1783, // comment
164,1076, // {10}
165,1589, // {13}
MIN_REDUCTION+341, // (default reduction)
  }
,
{ // state 1173
0x80000000|943, // match move
0x80000000|1234, // no-match move
0x80000000|65, // NT-test-match state for doubleSlash
  }
,
{ // state 1174
95,1277, // "e"
  }
,
{ // state 1175
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
129,493, // eol
130,1783, // comment
164,1076, // {10}
165,1589, // {13}
MIN_REDUCTION+165, // (default reduction)
  }
,
{ // state 1176
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
132,50, // blockComment
136,1210, // slashStar
149,1327, // "/"
MIN_REDUCTION+149, // (default reduction)
  }
,
{ // state 1177
95,1773, // "e"
  }
,
{ // state 1178
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
129,493, // eol
130,1783, // comment
164,1076, // {10}
165,1589, // {13}
MIN_REDUCTION+184, // (default reduction)
  }
,
{ // state 1179
92,1794, // "s"
  }
,
{ // state 1180
0x80000000|1455, // match move
0x80000000|611, // no-match move
0x80000000|65, // NT-test-match state for doubleSlash
  }
,
{ // state 1181
2,587, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
129,493, // eol
130,1783, // comment
164,1076, // {10}
165,1589, // {13}
MIN_REDUCTION+290, // (default reduction)
  }
,
{ // state 1182
95,1407, // "e"
  }
,
{ // state 1183
0x80000000|878, // match move
0x80000000|996, // no-match move
0x80000000|1594, // NT-test-match state for reserved
  }
,
{ // state 1184
MIN_REDUCTION+169, // (default reduction)
  }
,
{ // state 1185
179,MIN_REDUCTION+107, // $NT
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 1186
179,MIN_REDUCTION+282, // $NT
  }
,
{ // state 1187
0x80000000|63, // match move
0x80000000|1860, // no-match move
0x80000000|1636, // NT-test-match state for slashStar
  }
,
{ // state 1188
0x80000000|325, // match move
0x80000000|2011, // no-match move
0x80000000|1594, // NT-test-match state for reserved
  }
,
{ // state 1189
0x80000000|111, // match move
0x80000000|1787, // no-match move
// T-test match for "=":
97,
  }
,
{ // state 1190
MIN_REDUCTION+105, // (default reduction)
  }
,
{ // state 1191
0x80000000|1599, // match move
0x80000000|1240, // no-match move
0x80000000|1594, // NT-test-match state for reserved
  }
,
{ // state 1192
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 1193
MIN_REDUCTION+177, // (default reduction)
  }
,
{ // state 1194
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
132,50, // blockComment
136,1210, // slashStar
149,1327, // "/"
MIN_REDUCTION+153, // (default reduction)
  }
,
{ // state 1195
MIN_REDUCTION+70, // (default reduction)
  }
,
{ // state 1196
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
131,729, // oneLineComment
132,50, // blockComment
133,66, // doubleSlash
136,1210, // slashStar
149,144, // "/"
MIN_REDUCTION+277, // (default reduction)
  }
,
{ // state 1197
89,485, // "c"
  }
,
{ // state 1198
0x80000000|1806, // match move
0x80000000|917, // no-match move
0x80000000|65, // NT-test-match state for doubleSlash
  }
,
{ // state 1199
89,MIN_REDUCTION+353, // "c"
90,MIN_REDUCTION+353, // "l"
91,MIN_REDUCTION+353, // "a"
92,MIN_REDUCTION+353, // "s"
95,MIN_REDUCTION+353, // "e"
102,MIN_REDUCTION+353, // "_"
103,MIN_REDUCTION+353, // "d"
104,MIN_REDUCTION+353, // "g"
105,MIN_REDUCTION+353, // "m"
106,MIN_REDUCTION+353, // "p"
107,MIN_REDUCTION+353, // "v"
108,MIN_REDUCTION+353, // "y"
109,MIN_REDUCTION+353, // "f"
110,MIN_REDUCTION+353, // "i"
111,MIN_REDUCTION+353, // {"A".."Z"}
112,MIN_REDUCTION+353, // "o"
113,MIN_REDUCTION+353, // "r"
114,MIN_REDUCTION+353, // "u"
115,MIN_REDUCTION+353, // "x"
116,MIN_REDUCTION+353, // {"j" "q"}
117,MIN_REDUCTION+353, // "b"
118,MIN_REDUCTION+353, // "h"
119,MIN_REDUCTION+353, // "k"
120,MIN_REDUCTION+353, // "n"
121,MIN_REDUCTION+353, // "t"
122,MIN_REDUCTION+353, // "w"
123,MIN_REDUCTION+353, // "z"
124,MIN_REDUCTION+353, // {"0".."9"}
169,MIN_REDUCTION+353, // idChar**
MIN_REDUCTION+353, // (default reduction)
  }
,
{ // state 1200
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
131,729, // oneLineComment
132,50, // blockComment
133,66, // doubleSlash
136,1210, // slashStar
149,144, // "/"
MIN_REDUCTION+259, // (default reduction)
  }
,
{ // state 1201
MIN_REDUCTION+114, // (default reduction)
  }
,
{ // state 1202
0x80000000|1934, // match move
0x80000000|1943, // no-match move
0x80000000|1594, // NT-test-match state for reserved
  }
,
{ // state 1203
2,1657, // white*
MIN_REDUCTION+158, // (default reduction)
  }
,
{ // state 1204
2,346, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
129,493, // eol
130,1783, // comment
164,1076, // {10}
165,1589, // {13}
MIN_REDUCTION+239, // (default reduction)
  }
,
{ // state 1205
0x80000000|1, // match move
0x80000000|320, // no-match move
0x80000000|67, // NT-test-match state for idChar
  }
,
{ // state 1206
0x80000000|1, // match move
0x80000000|1199, // no-match move
0x80000000|532, // NT-test-match state for letter
  }
,
{ // state 1207
95,852, // "e"
  }
,
{ // state 1208
2,816, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
129,493, // eol
130,1783, // comment
164,1076, // {10}
165,1589, // {13}
MIN_REDUCTION+160, // (default reduction)
  }
,
{ // state 1209
MIN_REDUCTION+101, // (default reduction)
  }
,
{ // state 1210
89,738, // "c"
90,738, // "l"
91,738, // "a"
92,738, // "s"
95,738, // "e"
96,738, // "!"
97,738, // "="
98,738, // "+"
102,738, // "_"
103,738, // "d"
104,738, // "g"
105,738, // "m"
106,738, // "p"
107,738, // "v"
108,738, // "y"
109,738, // "f"
110,738, // "i"
111,738, // {"A".."Z"}
112,738, // "o"
113,738, // "r"
114,738, // "u"
115,738, // "x"
116,738, // {"j" "q"}
117,738, // "b"
118,738, // "h"
119,738, // "k"
120,738, // "n"
121,738, // "t"
122,738, // "w"
123,738, // "z"
124,738, // {"0".."9"}
127,738, // " "
128,738, // {9}
129,1246, // eol
137,935, // blockCommentContent*
138,245, // starSlash
139,1218, // blockCommentContent
140,738, // "["
141,738, // "-"
142,738, // "<"
143,738, // "|"
144,738, // {"?".."@"}
145,738, // "&"
146,738, // ")"
147,738, // ","
148,738, // "]"
149,738, // "/"
150,738, // {"#".."$"}
151,738, // ";"
152,738, // ">"
153,738, // "{"
154,738, // "%"
155,738, // "("
156,738, // "\"
157,738, // "."
158,738, // ":"
159,738, // "}"
160,738, // {"^" "`" "~"}
161,738, // "'"
162,738, // '"'
163,1440, // "*"
164,352, // {10}
165,376, // {13}
  }
,
{ // state 1211
0x80000000|1470, // match move
0x80000000|580, // no-match move
0x80000000|532, // NT-test-match state for letter
  }
,
{ // state 1212
0x80000000|1, // match move
0x80000000|740, // no-match move
0x80000000|67, // NT-test-match state for idChar
  }
,
{ // state 1213
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
129,493, // eol
130,1783, // comment
164,1076, // {10}
165,1589, // {13}
MIN_REDUCTION+307, // (default reduction)
  }
,
{ // state 1214
92,1827, // "s"
121,1500, // "t"
  }
,
{ // state 1215
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
131,729, // oneLineComment
132,50, // blockComment
133,66, // doubleSlash
136,1210, // slashStar
149,144, // "/"
MIN_REDUCTION+208, // (default reduction)
  }
,
{ // state 1216
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
132,50, // blockComment
136,1210, // slashStar
149,1327, // "/"
MIN_REDUCTION+340, // (default reduction)
  }
,
{ // state 1217
0x80000000|1, // match move
0x80000000|178, // no-match move
0x80000000|67, // NT-test-match state for idChar
  }
,
{ // state 1218
MIN_REDUCTION+350, // (default reduction)
  }
,
{ // state 1219
95,331, // "e"
112,61, // "o"
  }
,
{ // state 1220
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
131,729, // oneLineComment
132,50, // blockComment
133,66, // doubleSlash
136,1210, // slashStar
149,144, // "/"
MIN_REDUCTION+226, // (default reduction)
  }
,
{ // state 1221
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 1222
2,420, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
132,50, // blockComment
136,1210, // slashStar
149,1327, // "/"
MIN_REDUCTION+185, // (default reduction)
  }
,
{ // state 1223
125,808, // white
126,877, // {12}
127,877, // " "
128,877, // {9}
129,1185, // eol
130,994, // comment
131,1236, // oneLineComment
132,838, // blockComment
133,1248, // doubleSlash
136,798, // slashStar
149,144, // "/"
164,1315, // {10}
165,904, // {13}
179,MIN_REDUCTION+265, // $NT
  }
,
{ // state 1224
2,1764, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
131,729, // oneLineComment
132,50, // blockComment
133,66, // doubleSlash
136,1210, // slashStar
149,144, // "/"
MIN_REDUCTION+326, // (default reduction)
  }
,
{ // state 1225
MIN_REDUCTION+105, // (default reduction)
  }
,
{ // state 1226
121,775, // "t"
  }
,
{ // state 1227
2,937, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
132,50, // blockComment
136,1210, // slashStar
149,1327, // "/"
MIN_REDUCTION+150, // (default reduction)
  }
,
{ // state 1228
125,808, // white
126,877, // {12}
127,877, // " "
128,877, // {9}
129,1185, // eol
130,994, // comment
131,1236, // oneLineComment
132,838, // blockComment
133,1248, // doubleSlash
136,798, // slashStar
149,144, // "/"
164,1315, // {10}
165,904, // {13}
179,MIN_REDUCTION+277, // $NT
  }
,
{ // state 1229
0x80000000|447, // match move
0x80000000|348, // no-match move
0x80000000|65, // NT-test-match state for doubleSlash
  }
,
{ // state 1230
2,876, // white*
MIN_REDUCTION+176, // (default reduction)
  }
,
{ // state 1231
0x80000000|456, // match move
0x80000000|486, // no-match move
0x80000000|1636, // NT-test-match state for slashStar
  }
,
{ // state 1232
90,594, // "l"
  }
,
{ // state 1233
2,1766, // white*
MIN_REDUCTION+140, // (default reduction)
  }
,
{ // state 1234
0x80000000|339, // match move
0x80000000|59, // no-match move
0x80000000|1594, // NT-test-match state for reserved
  }
,
{ // state 1235
91,1302, // "a"
95,1273, // "e"
114,417, // "u"
  }
,
{ // state 1236
179,MIN_REDUCTION+109, // $NT
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 1237
2,1792, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
132,50, // blockComment
136,1210, // slashStar
149,1327, // "/"
MIN_REDUCTION+248, // (default reduction)
  }
,
{ // state 1238
2,1739, // white*
125,2043, // white
126,877, // {12}
127,877, // " "
128,877, // {9}
129,1185, // eol
130,994, // comment
131,1236, // oneLineComment
132,838, // blockComment
133,1248, // doubleSlash
136,798, // slashStar
149,144, // "/"
164,1315, // {10}
165,904, // {13}
179,MIN_REDUCTION+230, // $NT
  }
,
{ // state 1239
113,1769, // "r"
  }
,
{ // state 1240
0x80000000|1132, // match move
0x80000000|842, // no-match move
0x80000000|1636, // NT-test-match state for slashStar
  }
,
{ // state 1241
MIN_REDUCTION+319, // (default reduction)
  }
,
{ // state 1242
2,1966, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
131,729, // oneLineComment
132,50, // blockComment
133,66, // doubleSlash
136,1210, // slashStar
149,144, // "/"
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 1243
2,1634, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
132,50, // blockComment
136,1210, // slashStar
149,1327, // "/"
170,1842, // $$1
MIN_REDUCTION+335, // (default reduction)
  }
,
{ // state 1244
2,1460, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
131,729, // oneLineComment
132,50, // blockComment
133,66, // doubleSlash
136,1210, // slashStar
149,144, // "/"
MIN_REDUCTION+134, // (default reduction)
  }
,
{ // state 1245
0x80000000|1108, // match move
0x80000000|1019, // no-match move
0x80000000|1636, // NT-test-match state for slashStar
  }
,
{ // state 1246
MIN_REDUCTION+117, // (default reduction)
  }
,
{ // state 1247
0x80000000|1, // match move
0x80000000|1275, // no-match move
// T-test match for {"*" "/"}:
149,
163,
  }
,
{ // state 1248
0x80000000|745, // match move
0x80000000|1364, // no-match move
0x80000000|1101, // NT-test-match state for printable
  }
,
{ // state 1249
0x80000000|1, // match move
0x80000000|158, // no-match move
0x80000000|67, // NT-test-match state for idChar
  }
,
{ // state 1250
90,78, // "l"
  }
,
{ // state 1251
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
132,50, // blockComment
136,1210, // slashStar
149,1327, // "/"
MIN_REDUCTION+135, // (default reduction)
  }
,
{ // state 1252
121,1711, // "t"
  }
,
{ // state 1253
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
131,729, // oneLineComment
132,50, // blockComment
133,66, // doubleSlash
136,1210, // slashStar
149,144, // "/"
MIN_REDUCTION+253, // (default reduction)
  }
,
{ // state 1254
102,MIN_REDUCTION+357, // "_"
169,MIN_REDUCTION+357, // idChar**
MIN_REDUCTION+357, // (default reduction)
  }
,
{ // state 1255
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
129,493, // eol
130,1783, // comment
164,1076, // {10}
165,1589, // {13}
MIN_REDUCTION+328, // (default reduction)
  }
,
{ // state 1256
2,1795, // white*
MIN_REDUCTION+138, // (default reduction)
  }
,
{ // state 1257
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
129,493, // eol
130,1783, // comment
164,1076, // {10}
165,1589, // {13}
MIN_REDUCTION+235, // (default reduction)
  }
,
{ // state 1258
0x80000000|915, // match move
0x80000000|860, // no-match move
0x80000000|94, // NT-test-match state for digit
  }
,
{ // state 1259
0x80000000|1746, // match move
0x80000000|1413, // no-match move
0x80000000|65, // NT-test-match state for doubleSlash
  }
,
{ // state 1260
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
131,729, // oneLineComment
132,50, // blockComment
133,66, // doubleSlash
136,1210, // slashStar
149,144, // "/"
MIN_REDUCTION+238, // (default reduction)
  }
,
{ // state 1261
2,4, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
129,493, // eol
130,1783, // comment
164,1076, // {10}
165,1589, // {13}
MIN_REDUCTION+245, // (default reduction)
  }
,
{ // state 1262
2,429, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
131,729, // oneLineComment
132,50, // blockComment
133,66, // doubleSlash
136,1210, // slashStar
149,144, // "/"
MIN_REDUCTION+263, // (default reduction)
  }
,
{ // state 1263
0x80000000|1143, // match move
0x80000000|1723, // no-match move
0x80000000|1636, // NT-test-match state for slashStar
  }
,
{ // state 1264
121,523, // "t"
  }
,
{ // state 1265
0x80000000|1886, // match move
0x80000000|560, // no-match move
0x80000000|1636, // NT-test-match state for slashStar
  }
,
{ // state 1266
0x80000000|1, // match move
0x80000000|143, // no-match move
0x80000000|67, // NT-test-match state for idChar
  }
,
{ // state 1267
95,514, // "e"
  }
,
{ // state 1268
2,892, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
132,50, // blockComment
136,1210, // slashStar
149,1327, // "/"
MIN_REDUCTION+236, // (default reduction)
  }
,
{ // state 1269
2,1972, // white*
125,2043, // white
126,877, // {12}
127,877, // " "
128,877, // {9}
129,1185, // eol
130,994, // comment
131,1236, // oneLineComment
132,838, // blockComment
133,1248, // doubleSlash
136,798, // slashStar
149,144, // "/"
164,1315, // {10}
165,904, // {13}
179,MIN_REDUCTION+284, // $NT
  }
,
{ // state 1270
125,808, // white
126,877, // {12}
127,877, // " "
128,877, // {9}
129,1185, // eol
130,994, // comment
131,1236, // oneLineComment
132,838, // blockComment
133,1248, // doubleSlash
136,798, // slashStar
149,144, // "/"
164,1315, // {10}
165,904, // {13}
179,MIN_REDUCTION+301, // $NT
  }
,
{ // state 1271
104,2032, // "g"
  }
,
{ // state 1272
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
131,729, // oneLineComment
132,50, // blockComment
133,66, // doubleSlash
136,1210, // slashStar
149,144, // "/"
MIN_REDUCTION+97, // (default reduction)
  }
,
{ // state 1273
122,260, // "w"
  }
,
{ // state 1274
0x80000000|1994, // match move
0x80000000|907, // no-match move
0x80000000|1636, // NT-test-match state for slashStar
  }
,
{ // state 1275
2,1867, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
129,493, // eol
164,1076, // {10}
165,1589, // {13}
MIN_REDUCTION+180, // (default reduction)
  }
,
{ // state 1276
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
129,493, // eol
130,1783, // comment
164,1076, // {10}
165,1589, // {13}
MIN_REDUCTION+167, // (default reduction)
  }
,
{ // state 1277
0x80000000|1, // match move
0x80000000|1296, // no-match move
0x80000000|67, // NT-test-match state for idChar
  }
,
{ // state 1278
2,435, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
131,729, // oneLineComment
132,50, // blockComment
133,66, // doubleSlash
136,1210, // slashStar
149,144, // "/"
MIN_REDUCTION+154, // (default reduction)
  }
,
{ // state 1279
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
132,50, // blockComment
136,1210, // slashStar
149,1327, // "/"
MIN_REDUCTION+313, // (default reduction)
  }
,
{ // state 1280
MIN_REDUCTION+346, // (default reduction)
  }
,
{ // state 1281
MIN_REDUCTION+179, // (default reduction)
  }
,
{ // state 1282
0x80000000|1635, // match move
0x80000000|1204, // no-match move
0x80000000|1636, // NT-test-match state for slashStar
  }
,
{ // state 1283
MIN_REDUCTION+265, // (default reduction)
  }
,
{ // state 1284
125,808, // white
126,877, // {12}
127,877, // " "
128,877, // {9}
129,1185, // eol
130,994, // comment
131,1236, // oneLineComment
132,838, // blockComment
133,1248, // doubleSlash
136,798, // slashStar
149,144, // "/"
164,1315, // {10}
165,904, // {13}
179,MIN_REDUCTION+205, // $NT
  }
,
{ // state 1285
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 1286
0x80000000|1790, // match move
0x80000000|1209, // no-match move
0x80000000|67, // NT-test-match state for idChar
  }
,
{ // state 1287
0x80000000|855, // match move
0x80000000|1148, // no-match move
0x80000000|65, // NT-test-match state for doubleSlash
  }
,
{ // state 1288
110,1534, // "i"
112,1528, // "o"
  }
,
{ // state 1289
89,1658, // "c"
  }
,
{ // state 1290
90,670, // "l"
112,1139, // "o"
  }
,
{ // state 1291
92,452, // "s"
  }
,
{ // state 1292
179,MIN_REDUCTION+267, // $NT
  }
,
{ // state 1293
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
132,50, // blockComment
136,1210, // slashStar
149,1327, // "/"
MIN_REDUCTION+319, // (default reduction)
  }
,
{ // state 1294
2,1966, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
129,493, // eol
130,1783, // comment
164,1076, // {10}
165,1589, // {13}
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 1295
0x80000000|1338, // match move
0x80000000|577, // no-match move
0x80000000|65, // NT-test-match state for doubleSlash
  }
,
{ // state 1296
0x80000000|1926, // match move
0x80000000|578, // no-match move
0x80000000|65, // NT-test-match state for doubleSlash
  }
,
{ // state 1297
114,600, // "u"
  }
,
{ // state 1298
2,1495, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
132,50, // blockComment
136,1210, // slashStar
149,1327, // "/"
MIN_REDUCTION+278, // (default reduction)
  }
,
{ // state 1299
179,MIN_REDUCTION+270, // $NT
  }
,
{ // state 1300
0x80000000|1113, // match move
0x80000000|1623, // no-match move
0x80000000|65, // NT-test-match state for doubleSlash
  }
,
{ // state 1301
112,527, // "o"
  }
,
{ // state 1302
121,1443, // "t"
  }
,
{ // state 1303
0x80000000|149, // match move
0x80000000|595, // no-match move
0x80000000|1636, // NT-test-match state for slashStar
  }
,
{ // state 1304
125,808, // white
126,877, // {12}
127,877, // " "
128,877, // {9}
129,1185, // eol
130,994, // comment
131,1236, // oneLineComment
132,838, // blockComment
133,1248, // doubleSlash
136,798, // slashStar
149,144, // "/"
164,1315, // {10}
165,904, // {13}
179,MIN_REDUCTION+319, // $NT
  }
,
{ // state 1305
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
131,729, // oneLineComment
132,50, // blockComment
133,66, // doubleSlash
136,1210, // slashStar
149,144, // "/"
MIN_REDUCTION+187, // (default reduction)
  }
,
{ // state 1306
MIN_REDUCTION+220, // (default reduction)
  }
,
{ // state 1307
179,MIN_REDUCTION+273, // $NT
  }
,
{ // state 1308
0x80000000|128, // match move
0x80000000|1118, // no-match move
0x80000000|1594, // NT-test-match state for reserved
  }
,
{ // state 1309
0x80000000|1065, // match move
0x80000000|652, // no-match move
0x80000000|1636, // NT-test-match state for slashStar
  }
,
{ // state 1310
0x80000000|847, // match move
0x80000000|1605, // no-match move
0x80000000|1636, // NT-test-match state for slashStar
  }
,
{ // state 1311
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
131,729, // oneLineComment
132,50, // blockComment
133,66, // doubleSlash
136,1210, // slashStar
149,144, // "/"
MIN_REDUCTION+364, // (default reduction)
  }
,
{ // state 1312
MIN_REDUCTION+268, // (default reduction)
  }
,
{ // state 1313
2,396, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
132,50, // blockComment
136,1210, // slashStar
149,1327, // "/"
MIN_REDUCTION+152, // (default reduction)
  }
,
{ // state 1314
0x80000000|441, // match move
0x80000000|1425, // no-match move
0x80000000|1594, // NT-test-match state for reserved
  }
,
{ // state 1315
179,MIN_REDUCTION+121, // $NT
MIN_REDUCTION+121, // (default reduction)
  }
,
{ // state 1316
MIN_REDUCTION+360, // (default reduction)
  }
,
{ // state 1317
125,808, // white
126,877, // {12}
127,877, // " "
128,877, // {9}
129,1185, // eol
130,994, // comment
131,1236, // oneLineComment
132,838, // blockComment
133,1248, // doubleSlash
136,798, // slashStar
149,144, // "/"
164,1315, // {10}
165,904, // {13}
179,MIN_REDUCTION+196, // $NT
  }
,
{ // state 1318
112,1107, // "o"
  }
,
{ // state 1319
0x80000000|194, // match move
0x80000000|1419, // no-match move
0x80000000|1594, // NT-test-match state for reserved
  }
,
{ // state 1320
179,MIN_REDUCTION+240, // $NT
  }
,
{ // state 1321
0x80000000|677, // match move
0x80000000|239, // no-match move
0x80000000|1636, // NT-test-match state for slashStar
  }
,
{ // state 1322
120,1893, // "n"
  }
,
{ // state 1323
179,MIN_REDUCTION+124, // $NT
  }
,
{ // state 1324
0x80000000|1859, // match move
0x80000000|1861, // no-match move
0x80000000|67, // NT-test-match state for idChar
  }
,
{ // state 1325
129,1963, // eol
164,1315, // {10}
165,904, // {13}
  }
,
{ // state 1326
0x80000000|1, // match move
0x80000000|477, // no-match move
0x80000000|67, // NT-test-match state for idChar
  }
,
{ // state 1327
163,1869, // "*"
  }
,
{ // state 1328
0x80000000|856, // match move
0x80000000|1606, // no-match move
0x80000000|65, // NT-test-match state for doubleSlash
  }
,
{ // state 1329
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
132,50, // blockComment
136,1210, // slashStar
149,1327, // "/"
MIN_REDUCTION+157, // (default reduction)
  }
,
{ // state 1330
121,862, // "t"
  }
,
{ // state 1331
MIN_REDUCTION+155, // (default reduction)
  }
,
{ // state 1332
2,1689, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
129,493, // eol
130,1783, // comment
164,1076, // {10}
165,1589, // {13}
MIN_REDUCTION+230, // (default reduction)
  }
,
{ // state 1333
2,948, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
132,50, // blockComment
136,1210, // slashStar
149,1327, // "/"
MIN_REDUCTION+308, // (default reduction)
  }
,
{ // state 1334
2,587, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
132,50, // blockComment
136,1210, // slashStar
149,1327, // "/"
MIN_REDUCTION+290, // (default reduction)
  }
,
{ // state 1335
0x80000000|166, // match move
0x80000000|555, // no-match move
0x80000000|1636, // NT-test-match state for slashStar
  }
,
{ // state 1336
125,808, // white
126,877, // {12}
127,877, // " "
128,877, // {9}
129,1185, // eol
130,994, // comment
131,1236, // oneLineComment
132,838, // blockComment
133,1248, // doubleSlash
136,798, // slashStar
149,144, // "/"
164,1315, // {10}
165,904, // {13}
179,MIN_REDUCTION+268, // $NT
  }
,
{ // state 1337
109,1856, // "f"
  }
,
{ // state 1338
2,1831, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
131,729, // oneLineComment
132,50, // blockComment
133,66, // doubleSlash
136,1210, // slashStar
149,144, // "/"
MIN_REDUCTION+144, // (default reduction)
  }
,
{ // state 1339
125,808, // white
126,877, // {12}
127,877, // " "
128,877, // {9}
129,1185, // eol
130,994, // comment
131,1236, // oneLineComment
132,838, // blockComment
133,1248, // doubleSlash
136,798, // slashStar
149,144, // "/"
164,1315, // {10}
165,904, // {13}
179,MIN_REDUCTION+316, // $NT
  }
,
{ // state 1340
0x80000000|353, // match move
0x80000000|1591, // no-match move
0x80000000|1636, // NT-test-match state for slashStar
  }
,
{ // state 1341
125,808, // white
126,877, // {12}
127,877, // " "
128,877, // {9}
129,1185, // eol
130,994, // comment
131,1236, // oneLineComment
132,838, // blockComment
133,1248, // doubleSlash
136,798, // slashStar
149,144, // "/"
164,1315, // {10}
165,904, // {13}
179,MIN_REDUCTION+217, // $NT
  }
,
{ // state 1342
0x80000000|1950, // match move
0x80000000|1036, // no-match move
0x80000000|65, // NT-test-match state for doubleSlash
  }
,
{ // state 1343
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
132,50, // blockComment
136,1210, // slashStar
149,1327, // "/"
MIN_REDUCTION+262, // (default reduction)
  }
,
{ // state 1344
2,608, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
131,729, // oneLineComment
132,50, // blockComment
133,66, // doubleSlash
136,1210, // slashStar
149,144, // "/"
MIN_REDUCTION+136, // (default reduction)
  }
,
{ // state 1345
110,1858, // "i"
  }
,
{ // state 1346
92,939, // "s"
  }
,
{ // state 1347
MIN_REDUCTION+342, // (default reduction)
  }
,
{ // state 1348
112,1153, // "o"
  }
,
{ // state 1349
2,1925, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
129,493, // eol
130,1783, // comment
164,1076, // {10}
165,1589, // {13}
MIN_REDUCTION+146, // (default reduction)
  }
,
{ // state 1350
0x80000000|990, // match move
0x80000000|1785, // no-match move
0x80000000|65, // NT-test-match state for doubleSlash
  }
,
{ // state 1351
0x80000000|1, // match move
0x80000000|172, // no-match move
0x80000000|67, // NT-test-match state for idChar
  }
,
{ // state 1352
0x80000000|1, // match move
0x80000000|438, // no-match move
0x80000000|67, // NT-test-match state for idChar
  }
,
{ // state 1353
2,608, // white*
MIN_REDUCTION+136, // (default reduction)
  }
,
{ // state 1354
2,1795, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
131,729, // oneLineComment
132,50, // blockComment
133,66, // doubleSlash
136,1210, // slashStar
149,144, // "/"
MIN_REDUCTION+138, // (default reduction)
  }
,
{ // state 1355
2,608, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
132,50, // blockComment
136,1210, // slashStar
149,1327, // "/"
MIN_REDUCTION+136, // (default reduction)
  }
,
{ // state 1356
0x80000000|1656, // match move
0x80000000|912, // no-match move
0x80000000|1594, // NT-test-match state for reserved
  }
,
{ // state 1357
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
129,493, // eol
130,1783, // comment
164,1076, // {10}
165,1589, // {13}
MIN_REDUCTION+295, // (default reduction)
  }
,
{ // state 1358
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
131,729, // oneLineComment
132,50, // blockComment
133,66, // doubleSlash
136,1210, // slashStar
149,144, // "/"
MIN_REDUCTION+214, // (default reduction)
  }
,
{ // state 1359
MIN_REDUCTION+21, // (default reduction)
  }
,
{ // state 1360
95,1912, // "e"
  }
,
{ // state 1361
2,1651, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
132,50, // blockComment
136,1210, // slashStar
149,1327, // "/"
MIN_REDUCTION+178, // (default reduction)
  }
,
{ // state 1362
2,892, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
129,493, // eol
130,1783, // comment
164,1076, // {10}
165,1589, // {13}
MIN_REDUCTION+236, // (default reduction)
  }
,
{ // state 1363
0x80000000|1735, // match move
0x80000000|1074, // no-match move
0x80000000|1636, // NT-test-match state for slashStar
  }
,
{ // state 1364
129,1779, // eol
134,1325, // printable**
164,1315, // {10}
165,904, // {13}
174,316, // printable*
  }
,
{ // state 1365
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
132,50, // blockComment
136,1210, // slashStar
149,1327, // "/"
MIN_REDUCTION+316, // (default reduction)
  }
,
{ // state 1366
95,642, // "e"
  }
,
{ // state 1367
2,966, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
129,493, // eol
130,1783, // comment
164,1076, // {10}
165,1589, // {13}
MIN_REDUCTION+317, // (default reduction)
  }
,
{ // state 1368
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
131,729, // oneLineComment
132,50, // blockComment
133,66, // doubleSlash
136,1210, // slashStar
149,144, // "/"
MIN_REDUCTION+271, // (default reduction)
  }
,
{ // state 1369
118,1055, // "h"
  }
,
{ // state 1370
MIN_REDUCTION+139, // (default reduction)
  }
,
{ // state 1371
95,1006, // "e"
  }
,
{ // state 1372
2,1764, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
129,493, // eol
130,1783, // comment
164,1076, // {10}
165,1589, // {13}
MIN_REDUCTION+326, // (default reduction)
  }
,
{ // state 1373
0x80000000|1022, // match move
0x80000000|895, // no-match move
0x80000000|532, // NT-test-match state for letter
  }
,
{ // state 1374
95,1072, // "e"
  }
,
{ // state 1375
117,1026, // "b"
  }
,
{ // state 1376
91,735, // "a"
  }
,
{ // state 1377
89,1668, // "c"
90,1668, // "l"
91,1668, // "a"
92,1668, // "s"
95,1668, // "e"
96,1681, // "!"
97,655, // "="
98,655, // "+"
102,1668, // "_"
103,1668, // "d"
104,1668, // "g"
105,1668, // "m"
106,1668, // "p"
107,1668, // "v"
108,1668, // "y"
109,1668, // "f"
110,1668, // "i"
111,655, // {"A".."Z"}
112,1668, // "o"
113,1668, // "r"
114,1668, // "u"
115,1668, // "x"
116,1668, // {"j" "q"}
117,1668, // "b"
118,1668, // "h"
119,1668, // "k"
120,1668, // "n"
121,1668, // "t"
122,1668, // "w"
123,1668, // "z"
124,655, // {"0".."9"}
127,1681, // " "
140,655, // "["
141,655, // "-"
142,655, // "<"
143,1668, // "|"
144,655, // {"?".."@"}
145,655, // "&"
146,655, // ")"
147,655, // ","
148,1668, // "]"
149,655, // "/"
150,655, // {"#".."$"}
151,655, // ";"
152,655, // ">"
153,1668, // "{"
154,655, // "%"
155,655, // "("
157,655, // "."
158,655, // ":"
159,1668, // "}"
160,1668, // {"^" "`" "~"}
161,655, // "'"
162,1791, // '"'
163,655, // "*"
166,619, // stringPrintable
172,1619, // $$2
  }
,
{ // state 1378
0x80000000|1522, // match move
0x80000000|326, // no-match move
0x80000000|1636, // NT-test-match state for slashStar
  }
,
{ // state 1379
2,512, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
132,50, // blockComment
136,1210, // slashStar
149,1327, // "/"
MIN_REDUCTION+329, // (default reduction)
  }
,
{ // state 1380
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
132,50, // blockComment
136,1210, // slashStar
149,1327, // "/"
MIN_REDUCTION+145, // (default reduction)
  }
,
{ // state 1381
125,808, // white
126,877, // {12}
127,877, // " "
128,877, // {9}
129,1185, // eol
130,994, // comment
131,1236, // oneLineComment
132,838, // blockComment
133,1248, // doubleSlash
136,798, // slashStar
149,144, // "/"
164,1315, // {10}
165,904, // {13}
179,MIN_REDUCTION+226, // $NT
  }
,
{ // state 1382
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
129,493, // eol
130,1783, // comment
164,1076, // {10}
165,1589, // {13}
MIN_REDUCTION+316, // (default reduction)
  }
,
{ // state 1383
103,217, // "d"
  }
,
{ // state 1384
2,1936, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
131,729, // oneLineComment
132,50, // blockComment
133,66, // doubleSlash
136,1210, // slashStar
149,144, // "/"
MIN_REDUCTION+272, // (default reduction)
  }
,
{ // state 1385
0x80000000|949, // match move
0x80000000|1110, // no-match move
0x80000000|65, // NT-test-match state for doubleSlash
  }
,
{ // state 1386
109,1517, // "f"
  }
,
{ // state 1387
2,1381, // white*
125,2043, // white
126,877, // {12}
127,877, // " "
128,877, // {9}
129,1185, // eol
130,994, // comment
131,1236, // oneLineComment
132,838, // blockComment
133,1248, // doubleSlash
136,798, // slashStar
149,144, // "/"
164,1315, // {10}
165,904, // {13}
179,MIN_REDUCTION+227, // $NT
  }
,
{ // state 1388
2,24, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
131,729, // oneLineComment
132,50, // blockComment
133,66, // doubleSlash
136,1210, // slashStar
149,144, // "/"
MIN_REDUCTION+311, // (default reduction)
  }
,
{ // state 1389
2,154, // white*
125,2043, // white
126,877, // {12}
127,877, // " "
128,877, // {9}
129,1185, // eol
130,994, // comment
131,1236, // oneLineComment
132,838, // blockComment
133,1248, // doubleSlash
136,798, // slashStar
149,144, // "/"
164,1315, // {10}
165,904, // {13}
179,MIN_REDUCTION+254, // $NT
  }
,
{ // state 1390
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 1391
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 1392
2,1385, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
131,729, // oneLineComment
132,50, // blockComment
133,66, // doubleSlash
136,1210, // slashStar
149,144, // "/"
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 1393
MIN_REDUCTION+159, // (default reduction)
  }
,
{ // state 1394
118,969, // "h"
  }
,
{ // state 1395
0x80000000|1768, // match move
0x80000000|1037, // no-match move
0x80000000|65, // NT-test-match state for doubleSlash
  }
,
{ // state 1396
MIN_REDUCTION+32, // (default reduction)
  }
,
{ // state 1397
91,1632, // "a"
113,581, // "r"
  }
,
{ // state 1398
0x80000000|761, // match move
0x80000000|725, // no-match move
0x80000000|1594, // NT-test-match state for reserved
  }
,
{ // state 1399
112,1109, // "o"
  }
,
{ // state 1400
2,932, // white*
MIN_REDUCTION+365, // (default reduction)
  }
,
{ // state 1401
0x80000000|1759, // match move
0x80000000|793, // no-match move
0x80000000|65, // NT-test-match state for doubleSlash
  }
,
{ // state 1402
0x80000000|1718, // match move
0x80000000|947, // no-match move
0x80000000|1636, // NT-test-match state for slashStar
  }
,
{ // state 1403
125,808, // white
126,877, // {12}
127,877, // " "
128,877, // {9}
129,1185, // eol
130,994, // comment
131,1236, // oneLineComment
132,838, // blockComment
133,1248, // doubleSlash
136,798, // slashStar
149,144, // "/"
164,1315, // {10}
165,904, // {13}
179,MIN_REDUCTION+262, // $NT
  }
,
{ // state 1404
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 1405
89,1596, // "c"
  }
,
{ // state 1406
0x80000000|2008, // match move
0x80000000|757, // no-match move
0x80000000|65, // NT-test-match state for doubleSlash
  }
,
{ // state 1407
91,402, // "a"
  }
,
{ // state 1408
179,MIN_REDUCTION+258, // $NT
  }
,
{ // state 1409
0x80000000|1, // match move
0x80000000|366, // no-match move
0x80000000|67, // NT-test-match state for idChar
  }
,
{ // state 1410
2,1645, // white*
125,2043, // white
126,877, // {12}
127,877, // " "
128,877, // {9}
129,1185, // eol
130,994, // comment
131,1236, // oneLineComment
132,838, // blockComment
133,1248, // doubleSlash
136,798, // slashStar
149,144, // "/"
164,1315, // {10}
165,904, // {13}
179,MIN_REDUCTION+239, // $NT
  }
,
{ // state 1411
113,188, // "r"
  }
,
{ // state 1412
0x80000000|72, // match move
0x80000000|1663, // no-match move
0x80000000|1636, // NT-test-match state for slashStar
  }
,
{ // state 1413
0x80000000|498, // match move
0x80000000|1309, // no-match move
0x80000000|1594, // NT-test-match state for reserved
  }
,
{ // state 1414
107,1033, // "v"
  }
,
{ // state 1415
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
131,729, // oneLineComment
132,50, // blockComment
133,66, // doubleSlash
136,1210, // slashStar
149,144, // "/"
MIN_REDUCTION+316, // (default reduction)
  }
,
{ // state 1416
0x80000000|666, // match move
0x80000000|1463, // no-match move
0x80000000|65, // NT-test-match state for doubleSlash
  }
,
{ // state 1417
MIN_REDUCTION+250, // (default reduction)
  }
,
{ // state 1418
0x80000000|230, // match move
0x80000000|1854, // no-match move
0x80000000|1636, // NT-test-match state for slashStar
  }
,
{ // state 1419
0x80000000|1251, // match move
0x80000000|1733, // no-match move
0x80000000|1636, // NT-test-match state for slashStar
  }
,
{ // state 1420
179,MIN_REDUCTION+216, // $NT
  }
,
{ // state 1421
2,1287, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
129,493, // eol
130,1783, // comment
164,1076, // {10}
165,1589, // {13}
MIN_REDUCTION+182, // (default reduction)
  }
,
{ // state 1422
2,1304, // white*
125,2043, // white
126,877, // {12}
127,877, // " "
128,877, // {9}
129,1185, // eol
130,994, // comment
131,1236, // oneLineComment
132,838, // blockComment
133,1248, // doubleSlash
136,798, // slashStar
149,144, // "/"
164,1315, // {10}
165,904, // {13}
179,MIN_REDUCTION+320, // $NT
  }
,
{ // state 1423
2,1198, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
129,493, // eol
130,1783, // comment
164,1076, // {10}
165,1589, // {13}
MIN_REDUCTION+221, // (default reduction)
  }
,
{ // state 1424
92,130, // "s"
  }
,
{ // state 1425
0x80000000|289, // match move
0x80000000|1438, // no-match move
0x80000000|1636, // NT-test-match state for slashStar
  }
,
{ // state 1426
2,918, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
129,493, // eol
130,1783, // comment
164,1076, // {10}
165,1589, // {13}
MIN_REDUCTION+275, // (default reduction)
  }
,
{ // state 1427
125,808, // white
126,877, // {12}
127,877, // " "
128,877, // {9}
129,1185, // eol
130,994, // comment
131,1236, // oneLineComment
132,838, // blockComment
133,1248, // doubleSlash
136,798, // slashStar
149,144, // "/"
164,1315, // {10}
165,904, // {13}
179,MIN_REDUCTION+241, // $NT
  }
,
{ // state 1428
0x80000000|712, // match move
0x80000000|732, // no-match move
0x80000000|1594, // NT-test-match state for reserved
  }
,
{ // state 1429
149,625, // "/"
  }
,
{ // state 1430
91,1271, // "a"
  }
,
{ // state 1431
2,401, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
131,729, // oneLineComment
132,50, // blockComment
133,66, // doubleSlash
136,1210, // slashStar
149,144, // "/"
MIN_REDUCTION+194, // (default reduction)
  }
,
{ // state 1432
0x80000000|1798, // match move
0x80000000|936, // no-match move
0x80000000|1636, // NT-test-match state for slashStar
  }
,
{ // state 1433
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
129,493, // eol
130,1783, // comment
164,1076, // {10}
165,1589, // {13}
MIN_REDUCTION+262, // (default reduction)
  }
,
{ // state 1434
0x80000000|1417, // match move
0x80000000|321, // no-match move
0x80000000|1594, // NT-test-match state for reserved
  }
,
{ // state 1435
0x80000000|576, // match move
0x80000000|68, // no-match move
0x80000000|65, // NT-test-match state for doubleSlash
  }
,
{ // state 1436
179,MIN_REDUCTION+186, // $NT
  }
,
{ // state 1437
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 1438
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
129,493, // eol
130,1783, // comment
164,1076, // {10}
165,1589, // {13}
MIN_REDUCTION+301, // (default reduction)
  }
,
{ // state 1439
113,200, // "r"
118,1007, // "h"
  }
,
{ // state 1440
0x80000000|988, // match move
0x80000000|599, // no-match move
// T-test match for "/":
149,
  }
,
{ // state 1441
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
131,729, // oneLineComment
132,50, // blockComment
133,66, // doubleSlash
136,1210, // slashStar
149,144, // "/"
MIN_REDUCTION+301, // (default reduction)
  }
,
{ // state 1442
0x80000000|1242, // match move
0x80000000|1931, // no-match move
0x80000000|65, // NT-test-match state for doubleSlash
  }
,
{ // state 1443
110,341, // "i"
  }
,
{ // state 1444
2,1841, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
132,50, // blockComment
136,1210, // slashStar
149,1327, // "/"
MIN_REDUCTION+224, // (default reduction)
  }
,
{ // state 1445
MIN_REDUCTION+331, // (default reduction)
  }
,
{ // state 1446
0x80000000|282, // match move
0x80000000|1412, // no-match move
0x80000000|1594, // NT-test-match state for reserved
  }
,
{ // state 1447
112,1386, // "o"
  }
,
{ // state 1448
MIN_REDUCTION+356, // (default reduction)
  }
,
{ // state 1449
97,193, // "="
  }
,
{ // state 1450
MIN_REDUCTION+336, // (default reduction)
  }
,
{ // state 1451
MIN_REDUCTION+122, // (default reduction)
  }
,
{ // state 1452
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
132,50, // blockComment
136,1210, // slashStar
149,1327, // "/"
MIN_REDUCTION+274, // (default reduction)
  }
,
{ // state 1453
0x80000000|769, // match move
0x80000000|1863, // no-match move
0x80000000|65, // NT-test-match state for doubleSlash
  }
,
{ // state 1454
0x80000000|467, // match move
0x80000000|1340, // no-match move
0x80000000|1594, // NT-test-match state for reserved
  }
,
{ // state 1455
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
131,729, // oneLineComment
132,50, // blockComment
133,66, // doubleSlash
136,1210, // slashStar
149,144, // "/"
MIN_REDUCTION+169, // (default reduction)
  }
,
{ // state 1456
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
131,729, // oneLineComment
132,50, // blockComment
133,66, // doubleSlash
136,1210, // slashStar
149,144, // "/"
MIN_REDUCTION+135, // (default reduction)
  }
,
{ // state 1457
2,223, // white*
125,2043, // white
126,877, // {12}
127,877, // " "
128,877, // {9}
129,1185, // eol
130,994, // comment
131,1236, // oneLineComment
132,838, // blockComment
133,1248, // doubleSlash
136,798, // slashStar
149,144, // "/"
164,1315, // {10}
165,904, // {13}
179,MIN_REDUCTION+90, // $NT
  }
,
{ // state 1458
MIN_REDUCTION+325, // (default reduction)
  }
,
{ // state 1459
125,808, // white
126,877, // {12}
127,877, // " "
128,877, // {9}
129,1185, // eol
130,994, // comment
131,1236, // oneLineComment
132,838, // blockComment
133,1248, // doubleSlash
136,798, // slashStar
149,144, // "/"
164,1315, // {10}
165,904, // {13}
179,MIN_REDUCTION+289, // $NT
  }
,
{ // state 1460
0x80000000|206, // match move
0x80000000|597, // no-match move
0x80000000|65, // NT-test-match state for doubleSlash
  }
,
{ // state 1461
0x80000000|1333, // match move
0x80000000|590, // no-match move
0x80000000|1636, // NT-test-match state for slashStar
  }
,
{ // state 1462
MIN_REDUCTION+72, // (default reduction)
  }
,
{ // state 1463
0x80000000|298, // match move
0x80000000|192, // no-match move
0x80000000|1636, // NT-test-match state for slashStar
  }
,
{ // state 1464
109,905, // "f"
  }
,
{ // state 1465
2,1713, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
131,729, // oneLineComment
132,50, // blockComment
133,66, // doubleSlash
136,1210, // slashStar
149,144, // "/"
MIN_REDUCTION+314, // (default reduction)
  }
,
{ // state 1466
0x80000000|1, // match move
0x80000000|1395, // no-match move
0x80000000|67, // NT-test-match state for idChar
  }
,
{ // state 1467
90,2026, // "l"
  }
,
{ // state 1468
2,190, // white*
125,2043, // white
126,877, // {12}
127,877, // " "
128,877, // {9}
129,1185, // eol
130,994, // comment
131,1236, // oneLineComment
132,838, // blockComment
133,1248, // doubleSlash
136,798, // slashStar
149,144, // "/"
164,1315, // {10}
165,904, // {13}
179,MIN_REDUCTION+323, // $NT
  }
,
{ // state 1469
179,MIN_REDUCTION+249, // $NT
  }
,
{ // state 1470
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 1471
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
131,729, // oneLineComment
132,50, // blockComment
133,66, // doubleSlash
136,1210, // slashStar
149,144, // "/"
MIN_REDUCTION+229, // (default reduction)
  }
,
{ // state 1472
125,808, // white
126,877, // {12}
127,877, // " "
128,877, // {9}
129,1185, // eol
130,994, // comment
131,1236, // oneLineComment
132,838, // blockComment
133,1248, // doubleSlash
136,798, // slashStar
149,144, // "/"
164,1315, // {10}
165,904, // {13}
179,MIN_REDUCTION+280, // $NT
  }
,
{ // state 1473
0x80000000|1, // match move
0x80000000|459, // no-match move
0x80000000|67, // NT-test-match state for idChar
  }
,
{ // state 1474
141,1874, // "-"
  }
,
{ // state 1475
91,1226, // "a"
  }
,
{ // state 1476
125,808, // white
126,877, // {12}
127,877, // " "
128,877, // {9}
129,1185, // eol
130,994, // comment
131,1236, // oneLineComment
132,838, // blockComment
133,1248, // doubleSlash
136,798, // slashStar
149,144, // "/"
164,1315, // {10}
165,904, // {13}
179,MIN_REDUCTION+310, // $NT
  }
,
{ // state 1477
0x80000000|90, // match move
0x80000000|1280, // no-match move
0x80000000|67, // NT-test-match state for idChar
  }
,
{ // state 1478
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
131,729, // oneLineComment
132,50, // blockComment
133,66, // doubleSlash
136,1210, // slashStar
149,144, // "/"
MIN_REDUCTION+328, // (default reduction)
  }
,
{ // state 1479
2,420, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
129,493, // eol
130,1783, // comment
164,1076, // {10}
165,1589, // {13}
MIN_REDUCTION+185, // (default reduction)
  }
,
{ // state 1480
2,1792, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
129,493, // eol
130,1783, // comment
164,1076, // {10}
165,1589, // {13}
MIN_REDUCTION+248, // (default reduction)
  }
,
{ // state 1481
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
132,50, // blockComment
136,1210, // slashStar
149,1327, // "/"
MIN_REDUCTION+325, // (default reduction)
  }
,
{ // state 1482
2,1180, // white*
MIN_REDUCTION+170, // (default reduction)
  }
,
{ // state 1483
2,1634, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
129,493, // eol
130,1783, // comment
164,1076, // {10}
165,1589, // {13}
170,1842, // $$1
MIN_REDUCTION+335, // (default reduction)
  }
,
{ // state 1484
0x80000000|1902, // match move
0x80000000|1987, // no-match move
0x80000000|1594, // NT-test-match state for reserved
  }
,
{ // state 1485
2,512, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
131,729, // oneLineComment
132,50, // blockComment
133,66, // doubleSlash
136,1210, // slashStar
149,144, // "/"
MIN_REDUCTION+329, // (default reduction)
  }
,
{ // state 1486
90,1559, // "l"
  }
,
{ // state 1487
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
129,493, // eol
130,1783, // comment
164,1076, // {10}
165,1589, // {13}
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 1488
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
131,729, // oneLineComment
132,50, // blockComment
133,66, // doubleSlash
136,1210, // slashStar
149,144, // "/"
MIN_REDUCTION+131, // (default reduction)
  }
,
{ // state 1489
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 1490
121,5, // "t"
  }
,
{ // state 1491
95,2027, // "e"
  }
,
{ // state 1492
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
132,50, // blockComment
136,1210, // slashStar
149,1327, // "/"
MIN_REDUCTION+199, // (default reduction)
  }
,
{ // state 1493
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
131,729, // oneLineComment
132,50, // blockComment
133,66, // doubleSlash
136,1210, // slashStar
149,144, // "/"
MIN_REDUCTION+161, // (default reduction)
  }
,
{ // state 1494
2,396, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
129,493, // eol
130,1783, // comment
164,1076, // {10}
165,1589, // {13}
MIN_REDUCTION+152, // (default reduction)
  }
,
{ // state 1495
0x80000000|1196, // match move
0x80000000|662, // no-match move
0x80000000|65, // NT-test-match state for doubleSlash
  }
,
{ // state 1496
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
132,50, // blockComment
136,1210, // slashStar
149,1327, // "/"
MIN_REDUCTION+322, // (default reduction)
  }
,
{ // state 1497
0x80000000|1877, // match move
0x80000000|674, // no-match move
0x80000000|1636, // NT-test-match state for slashStar
  }
,
{ // state 1498
91,863, // "a"
113,656, // "r"
114,1916, // "u"
  }
,
{ // state 1499
MIN_REDUCTION+232, // (default reduction)
  }
,
{ // state 1500
89,1369, // "c"
  }
,
{ // state 1501
179,MIN_REDUCTION+122, // $NT
MIN_REDUCTION+122, // (default reduction)
  }
,
{ // state 1502
125,808, // white
126,877, // {12}
127,877, // " "
128,877, // {9}
129,1185, // eol
130,994, // comment
131,1236, // oneLineComment
132,838, // blockComment
133,1248, // doubleSlash
136,798, // slashStar
149,144, // "/"
164,1315, // {10}
165,904, // {13}
179,MIN_REDUCTION+220, // $NT
  }
,
{ // state 1503
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
129,493, // eol
130,1783, // comment
164,1076, // {10}
165,1589, // {13}
MIN_REDUCTION+199, // (default reduction)
  }
,
{ // state 1504
2,1540, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
131,729, // oneLineComment
132,50, // blockComment
133,66, // doubleSlash
136,1210, // slashStar
149,144, // "/"
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 1505
2,539, // white*
MIN_REDUCTION+166, // (default reduction)
  }
,
{ // state 1506
2,1887, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
129,493, // eol
130,1783, // comment
164,1076, // {10}
165,1589, // {13}
MIN_REDUCTION+142, // (default reduction)
  }
,
{ // state 1507
179,MIN_REDUCTION+189, // $NT
  }
,
{ // state 1508
0x80000000|31, // match move
0x80000000|1989, // no-match move
// T-test match for "=":
97,
  }
,
{ // state 1509
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
129,493, // eol
130,1783, // comment
164,1076, // {10}
165,1589, // {13}
MIN_REDUCTION+322, // (default reduction)
  }
,
{ // state 1510
179,MIN_REDUCTION+94, // $NT
  }
,
{ // state 1511
0x80000000|1725, // match move
0x80000000|1276, // no-match move
0x80000000|1636, // NT-test-match state for slashStar
  }
,
{ // state 1512
101,1626, // digit
124,403, // {"0".."9"}
  }
,
{ // state 1513
4,1347, // token
MIN_REDUCTION+362, // (default reduction)
  }
,
{ // state 1514
0x80000000|977, // match move
0x80000000|1695, // no-match move
0x80000000|1636, // NT-test-match state for slashStar
  }
,
{ // state 1515
2,886, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
132,50, // blockComment
136,1210, // slashStar
149,1327, // "/"
MIN_REDUCTION+242, // (default reduction)
  }
,
{ // state 1516
105,1127, // "m"
  }
,
{ // state 1517
0x80000000|1, // match move
0x80000000|494, // no-match move
0x80000000|67, // NT-test-match state for idChar
  }
,
{ // state 1518
125,808, // white
126,877, // {12}
127,877, // " "
128,877, // {9}
129,1185, // eol
130,994, // comment
131,1236, // oneLineComment
132,838, // blockComment
133,1248, // doubleSlash
136,798, // slashStar
149,144, // "/"
164,1315, // {10}
165,904, // {13}
179,MIN_REDUCTION+286, // $NT
  }
,
{ // state 1519
MIN_REDUCTION+58, // (default reduction)
  }
,
{ // state 1520
0x80000000|1587, // match move
0x80000000|1052, // no-match move
// T-test match for 10:
164,
  }
,
{ // state 1521
MIN_REDUCTION+345, // (default reduction)
  }
,
{ // state 1522
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
132,50, // blockComment
136,1210, // slashStar
149,1327, // "/"
MIN_REDUCTION+298, // (default reduction)
  }
,
{ // state 1523
MIN_REDUCTION+112, // (default reduction)
  }
,
{ // state 1524
92,114, // "s"
121,1876, // "t"
  }
,
{ // state 1525
0x80000000|1496, // match move
0x80000000|1509, // no-match move
0x80000000|1636, // NT-test-match state for slashStar
  }
,
{ // state 1526
121,1366, // "t"
  }
,
{ // state 1527
0x80000000|1079, // match move
0x80000000|18, // no-match move
0x80000000|1594, // NT-test-match state for reserved
  }
,
{ // state 1528
121,980, // "t"
  }
,
{ // state 1529
91,129, // "a"
  }
,
{ // state 1530
0x80000000|1, // match move
0x80000000|400, // no-match move
0x80000000|67, // NT-test-match state for idChar
  }
,
{ // state 1531
2,1582, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
129,493, // eol
130,1783, // comment
164,1076, // {10}
165,1589, // {13}
MIN_REDUCTION+305, // (default reduction)
  }
,
{ // state 1532
89,738, // "c"
90,738, // "l"
91,738, // "a"
92,738, // "s"
95,738, // "e"
96,738, // "!"
97,738, // "="
98,738, // "+"
102,738, // "_"
103,738, // "d"
104,738, // "g"
105,738, // "m"
106,738, // "p"
107,738, // "v"
108,738, // "y"
109,738, // "f"
110,738, // "i"
111,738, // {"A".."Z"}
112,738, // "o"
113,738, // "r"
114,738, // "u"
115,738, // "x"
116,738, // {"j" "q"}
117,738, // "b"
118,738, // "h"
119,738, // "k"
120,738, // "n"
121,738, // "t"
122,738, // "w"
123,738, // "z"
124,738, // {"0".."9"}
127,738, // " "
128,738, // {9}
129,1246, // eol
137,455, // blockCommentContent*
138,1201, // starSlash
139,1218, // blockCommentContent
140,738, // "["
141,738, // "-"
142,738, // "<"
143,738, // "|"
144,738, // {"?".."@"}
145,738, // "&"
146,738, // ")"
147,738, // ","
148,738, // "]"
149,738, // "/"
150,738, // {"#".."$"}
151,738, // ";"
152,738, // ">"
153,738, // "{"
154,738, // "%"
155,738, // "("
156,738, // "\"
157,738, // "."
158,738, // ":"
159,738, // "}"
160,738, // {"^" "`" "~"}
161,738, // "'"
162,738, // '"'
163,1637, // "*"
164,352, // {10}
165,376, // {13}
  }
,
{ // state 1533
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
131,729, // oneLineComment
132,50, // blockComment
133,66, // doubleSlash
136,1210, // slashStar
149,144, // "/"
MIN_REDUCTION+184, // (default reduction)
  }
,
{ // state 1534
107,1969, // "v"
  }
,
{ // state 1535
0x80000000|830, // match move
0x80000000|1758, // no-match move
0x80000000|65, // NT-test-match state for doubleSlash
  }
,
{ // state 1536
120,701, // "n"
  }
,
{ // state 1537
2,346, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
131,729, // oneLineComment
132,50, // blockComment
133,66, // doubleSlash
136,1210, // slashStar
149,144, // "/"
MIN_REDUCTION+239, // (default reduction)
  }
,
{ // state 1538
121,1908, // "t"
  }
,
{ // state 1539
0x80000000|259, // match move
0x80000000|505, // no-match move
0x80000000|65, // NT-test-match state for doubleSlash
  }
,
{ // state 1540
0x80000000|1272, // match move
0x80000000|1597, // no-match move
0x80000000|65, // NT-test-match state for doubleSlash
  }
,
{ // state 1541
89,663, // "c"
90,663, // "l"
91,663, // "a"
92,663, // "s"
95,663, // "e"
100,1671, // letter
103,663, // "d"
104,663, // "g"
105,663, // "m"
106,663, // "p"
107,663, // "v"
108,663, // "y"
109,663, // "f"
110,663, // "i"
111,663, // {"A".."Z"}
112,663, // "o"
113,663, // "r"
114,663, // "u"
115,663, // "x"
116,663, // {"j" "q"}
117,663, // "b"
118,663, // "h"
119,663, // "k"
120,663, // "n"
121,663, // "t"
122,663, // "w"
123,663, // "z"
  }
,
{ // state 1542
0x80000000|207, // match move
0x80000000|930, // no-match move
0x80000000|1636, // NT-test-match state for slashStar
  }
,
{ // state 1543
0x80000000|474, // match move
0x80000000|484, // no-match move
0x80000000|1636, // NT-test-match state for slashStar
  }
,
{ // state 1544
125,808, // white
126,877, // {12}
127,877, // " "
128,877, // {9}
129,1185, // eol
130,994, // comment
131,1236, // oneLineComment
132,838, // blockComment
133,1248, // doubleSlash
136,798, // slashStar
149,144, // "/"
164,1315, // {10}
165,904, // {13}
179,MIN_REDUCTION+208, // $NT
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
{ // state 1545
2,1435, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
131,729, // oneLineComment
132,50, // blockComment
133,66, // doubleSlash
136,1210, // slashStar
149,144, // "/"
MIN_REDUCTION+203, // (default reduction)
  }
,
{ // state 1546
121,1351, // "t"
  }
,
{ // state 1547
0x80000000|1220, // match move
0x80000000|1586, // no-match move
0x80000000|65, // NT-test-match state for doubleSlash
  }
,
{ // state 1548
0x80000000|1, // match move
0x80000000|513, // no-match move
0x80000000|67, // NT-test-match state for idChar
  }
,
{ // state 1549
0x80000000|1, // match move
0x80000000|1442, // no-match move
0x80000000|67, // NT-test-match state for idChar
  }
,
{ // state 1550
0x80000000|1640, // match move
0x80000000|472, // no-match move
0x80000000|1594, // NT-test-match state for reserved
  }
,
{ // state 1551
105,292, // "m"
109,1326, // "f"
120,1125, // "n"
  }
,
{ // state 1552
2,1899, // white*
125,2043, // white
126,877, // {12}
127,877, // " "
128,877, // {9}
129,1185, // eol
130,994, // comment
131,1236, // oneLineComment
132,838, // blockComment
133,1248, // doubleSlash
136,798, // slashStar
149,144, // "/"
164,1315, // {10}
165,904, // {13}
179,MIN_REDUCTION+299, // $NT
  }
,
{ // state 1553
MIN_REDUCTION+122, // (default reduction)
  }
,
{ // state 1554
2,797, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
132,50, // blockComment
136,1210, // slashStar
149,1327, // "/"
MIN_REDUCTION+218, // (default reduction)
  }
,
{ // state 1555
114,1059, // "u"
  }
,
{ // state 1556
112,556, // "o"
  }
,
{ // state 1557
92,1562, // "s"
117,449, // "b"
  }
,
{ // state 1558
2,401, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
132,50, // blockComment
136,1210, // slashStar
149,1327, // "/"
MIN_REDUCTION+194, // (default reduction)
  }
,
{ // state 1559
110,248, // "i"
  }
,
{ // state 1560
0x80000000|1115, // match move
0x80000000|796, // no-match move
0x80000000|1636, // NT-test-match state for slashStar
  }
,
{ // state 1561
0x80000000|1958, // match move
0x80000000|894, // no-match move
0x80000000|1636, // NT-test-match state for slashStar
  }
,
{ // state 1562
92,1830, // "s"
  }
,
{ // state 1563
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
131,729, // oneLineComment
132,50, // blockComment
133,66, // doubleSlash
136,1210, // slashStar
149,144, // "/"
MIN_REDUCTION+250, // (default reduction)
  }
,
{ // state 1564
0x80000000|1, // match move
0x80000000|1767, // no-match move
0x80000000|67, // NT-test-match state for idChar
  }
,
{ // state 1565
2,512, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
129,493, // eol
130,1783, // comment
164,1076, // {10}
165,1589, // {13}
MIN_REDUCTION+329, // (default reduction)
  }
,
{ // state 1566
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
132,50, // blockComment
136,1210, // slashStar
149,1327, // "/"
MIN_REDUCTION+277, // (default reduction)
  }
,
{ // state 1567
MIN_REDUCTION+283, // (default reduction)
  }
,
{ // state 1568
119,2016, // "k"
  }
,
{ // state 1569
0x80000000|1666, // match move
0x80000000|284, // no-match move
0x80000000|67, // NT-test-match state for idChar
  }
,
{ // state 1570
MIN_REDUCTION+27, // (default reduction)
  }
,
{ // state 1571
0x80000000|546, // match move
0x80000000|1907, // no-match move
0x80000000|1636, // NT-test-match state for slashStar
  }
,
{ // state 1572
0x80000000|1828, // match move
0x80000000|739, // no-match move
0x80000000|1636, // NT-test-match state for slashStar
  }
,
{ // state 1573
0x80000000|624, // match move
0x80000000|220, // no-match move
0x80000000|1636, // NT-test-match state for slashStar
  }
,
{ // state 1574
89,329, // "c"
  }
,
{ // state 1575
2,262, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
129,493, // eol
130,1783, // comment
164,1076, // {10}
165,1589, // {13}
MIN_REDUCTION+132, // (default reduction)
  }
,
{ // state 1576
2,1385, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
129,493, // eol
130,1783, // comment
164,1076, // {10}
165,1589, // {13}
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 1577
2,1651, // white*
MIN_REDUCTION+178, // (default reduction)
  }
,
{ // state 1578
2,1300, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
129,493, // eol
130,1783, // comment
164,1076, // {10}
165,1589, // {13}
MIN_REDUCTION+168, // (default reduction)
  }
,
{ // state 1579
2,608, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
129,493, // eol
130,1783, // comment
164,1076, // {10}
165,1589, // {13}
MIN_REDUCTION+136, // (default reduction)
  }
,
{ // state 1580
MIN_REDUCTION+348, // (default reduction)
  }
,
{ // state 1581
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
132,50, // blockComment
136,1210, // slashStar
149,1327, // "/"
MIN_REDUCTION+139, // (default reduction)
  }
,
{ // state 1582
0x80000000|922, // match move
0x80000000|13, // no-match move
0x80000000|65, // NT-test-match state for doubleSlash
  }
,
{ // state 1583
2,1540, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
129,493, // eol
130,1783, // comment
164,1076, // {10}
165,1589, // {13}
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 1584
0x80000000|2000, // match move
0x80000000|1999, // no-match move
0x80000000|1594, // NT-test-match state for reserved
  }
,
{ // state 1585
95,1829, // "e"
  }
,
{ // state 1586
0x80000000|1160, // match move
0x80000000|504, // no-match move
0x80000000|1594, // NT-test-match state for reserved
  }
,
{ // state 1587
164,127, // {10}
  }
,
{ // state 1588
0x80000000|2014, // match move
0x80000000|955, // no-match move
0x80000000|1636, // NT-test-match state for slashStar
  }
,
{ // state 1589
0x80000000|574, // match move
0x80000000|1391, // no-match move
// T-test match for 10:
164,
  }
,
{ // state 1590
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
131,729, // oneLineComment
132,50, // blockComment
133,66, // doubleSlash
136,1210, // slashStar
149,144, // "/"
MIN_REDUCTION+310, // (default reduction)
  }
,
{ // state 1591
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
129,493, // eol
130,1783, // comment
164,1076, // {10}
165,1589, // {13}
MIN_REDUCTION+187, // (default reduction)
  }
,
{ // state 1592
2,937, // white*
MIN_REDUCTION+150, // (default reduction)
  }
,
{ // state 1593
2,384, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
129,493, // eol
130,1783, // comment
164,1076, // {10}
165,1589, // {13}
MIN_REDUCTION+320, // (default reduction)
  }
,
{ // state 1594
5,81, // `boolean
6,163, // `class
7,1436, // `extends
8,1507, // `void
9,931, // `int
10,844, // `while
11,853, // `if
12,1510, // `else
13,75, // `for
14,46, // `break
15,36, // `this
16,879, // `false
17,617, // `true
18,1420, // `super
19,626, // `null
20,731, // `return
21,818, // `instanceof
22,2018, // `new
23,1685, // `abstract
24,598, // `assert
25,888, // `byte
26,1320, // `case
27,2007, // `catch
28,944, // `char
29,1469, // `const
30,139, // `continue
31,629, // `default
32,1408, // `do
33,157, // `double
34,1777, // `enum
35,1292, // `final
36,1299, // `finally
37,1307, // `float
38,1010, // `goto
39,557, // `implements
40,1186, // `import
41,1815, // `interface
42,693, // `long
43,55, // `native
44,479, // `package
45,201, // `private
46,1855, // `protected
47,100, // `public
48,529, // `short
49,11, // `static
50,1679, // `strictfp
51,470, // `switch
52,870, // `synchronized
53,788, // `throw
54,999, // `throws
55,337, // `transient
56,884, // `try
57,375, // `volatile
89,445, // "c"
90,1318, // "l"
91,1557, // "a"
92,1786, // "s"
95,373, // "e"
103,1219, // "d"
104,1556, // "g"
106,1498, // "p"
107,1770, // "v"
109,395, // "f"
110,1551, // "i"
113,1947, // "r"
117,1600, // "b"
120,1235, // "n"
121,1439, // "t"
122,1728, // "w"
  }
,
{ // state 1595
2,1953, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
131,729, // oneLineComment
132,50, // blockComment
133,66, // doubleSlash
136,1210, // slashStar
149,144, // "/"
MIN_REDUCTION+164, // (default reduction)
  }
,
{ // state 1596
95,771, // "e"
  }
,
{ // state 1597
0x80000000|1803, // match move
0x80000000|1897, // no-match move
0x80000000|1594, // NT-test-match state for reserved
  }
,
{ // state 1598
MIN_REDUCTION+313, // (default reduction)
  }
,
{ // state 1599
2,1675, // white*
MIN_REDUCTION+148, // (default reduction)
  }
,
{ // state 1600
108,1526, // "y"
112,1772, // "o"
113,1981, // "r"
  }
,
{ // state 1601
2,2013, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
131,729, // oneLineComment
132,50, // blockComment
133,66, // doubleSlash
136,1210, // slashStar
149,144, // "/"
MIN_REDUCTION+284, // (default reduction)
  }
,
{ // state 1602
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
129,493, // eol
130,1783, // comment
164,1076, // {10}
165,1589, // {13}
MIN_REDUCTION+153, // (default reduction)
  }
,
{ // state 1603
89,197, // "c"
  }
,
{ // state 1604
2,886, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
131,729, // oneLineComment
132,50, // blockComment
133,66, // doubleSlash
136,1210, // slashStar
149,144, // "/"
MIN_REDUCTION+242, // (default reduction)
  }
,
{ // state 1605
2,1760, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
129,493, // eol
130,1783, // comment
164,1076, // {10}
165,1589, // {13}
MIN_REDUCTION+257, // (default reduction)
  }
,
{ // state 1606
0x80000000|563, // match move
0x80000000|1363, // no-match move
0x80000000|1594, // NT-test-match state for reserved
  }
,
{ // state 1607
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 1608
92,984, // "s"
  }
,
{ // state 1609
90,264, // "l"
  }
,
{ // state 1610
91,1154, // "a"
  }
,
{ // state 1611
0x80000000|434, // match move
0x80000000|1432, // no-match move
0x80000000|1594, // NT-test-match state for reserved
  }
,
{ // state 1612
0x80000000|1933, // match move
0x80000000|1550, // no-match move
0x80000000|65, // NT-test-match state for doubleSlash
  }
,
{ // state 1613
0x80000000|1279, // match move
0x80000000|1814, // no-match move
0x80000000|1636, // NT-test-match state for slashStar
  }
,
{ // state 1614
92,1945, // "s"
  }
,
{ // state 1615
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
131,729, // oneLineComment
132,50, // blockComment
133,66, // doubleSlash
136,1210, // slashStar
149,144, // "/"
MIN_REDUCTION+193, // (default reduction)
  }
,
{ // state 1616
0x80000000|1379, // match move
0x80000000|1565, // no-match move
0x80000000|1636, // NT-test-match state for slashStar
  }
,
{ // state 1617
121,277, // "t"
  }
,
{ // state 1618
MIN_REDUCTION+359, // (default reduction)
  }
,
{ // state 1619
MIN_REDUCTION+338, // (default reduction)
  }
,
{ // state 1620
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
129,493, // eol
130,1783, // comment
164,1076, // {10}
165,1589, // {13}
MIN_REDUCTION+319, // (default reduction)
  }
,
{ // state 1621
MIN_REDUCTION+85, // (default reduction)
  }
,
{ // state 1622
3,6, // $$0
4,1070, // token
125,726, // white
126,1489, // {12}
127,1489, // " "
128,1489, // {9}
130,1390, // comment
132,1121, // blockComment
136,1532, // slashStar
149,1327, // "/"
173,1612, // token*
MIN_REDUCTION+3, // (default reduction)
  }
,
{ // state 1623
0x80000000|136, // match move
0x80000000|1511, // no-match move
0x80000000|1594, // NT-test-match state for reserved
  }
,
{ // state 1624
0x80000000|837, // match move
0x80000000|8, // no-match move
0x80000000|65, // NT-test-match state for doubleSlash
  }
,
{ // state 1625
MIN_REDUCTION+130, // (default reduction)
  }
,
{ // state 1626
0x80000000|733, // match move
0x80000000|613, // no-match move
0x80000000|94, // NT-test-match state for digit
  }
,
{ // state 1627
120,1524, // "n"
  }
,
{ // state 1628
MIN_REDUCTION+289, // (default reduction)
  }
,
{ // state 1629
0x80000000|1, // match move
0x80000000|1839, // no-match move
0x80000000|67, // NT-test-match state for idChar
  }
,
{ // state 1630
0x80000000|1978, // match move
0x80000000|48, // no-match move
0x80000000|1594, // NT-test-match state for reserved
  }
,
{ // state 1631
0x80000000|1, // match move
0x80000000|1416, // no-match move
0x80000000|67, // NT-test-match state for idChar
  }
,
{ // state 1632
121,516, // "t"
  }
,
{ // state 1633
2,1837, // white*
125,2043, // white
126,877, // {12}
127,877, // " "
128,877, // {9}
129,1185, // eol
130,994, // comment
131,1236, // oneLineComment
132,838, // blockComment
133,1248, // doubleSlash
136,798, // slashStar
149,144, // "/"
164,1315, // {10}
165,904, // {13}
179,MIN_REDUCTION+93, // $NT
  }
,
{ // state 1634
0x80000000|1170, // match move
0x80000000|1611, // no-match move
0x80000000|65, // NT-test-match state for doubleSlash
  }
,
{ // state 1635
2,346, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
132,50, // blockComment
136,1210, // slashStar
149,1327, // "/"
MIN_REDUCTION+239, // (default reduction)
  }
,
{ // state 1636
149,297, // "/"
  }
,
{ // state 1637
0x80000000|1672, // match move
0x80000000|599, // no-match move
// T-test match for "/":
149,
  }
,
{ // state 1638
121,183, // "t"
  }
,
{ // state 1639
0x80000000|615, // match move
0x80000000|1446, // no-match move
0x80000000|65, // NT-test-match state for doubleSlash
  }
,
{ // state 1640
4,1347, // token
5,442, // `boolean
6,750, // `class
7,691, // `extends
8,234, // `void
9,1117, // `int
10,333, // `while
11,360, // `if
12,764, // `else
13,1150, // `for
14,2002, // `break
15,324, // `this
16,391, // `false
17,280, // `true
18,929, // `super
19,131, // `null
20,711, // `return
21,1359, // `instanceof
22,2033, // `new
23,1140, // `abstract
24,480, // `assert
25,195, // `byte
26,545, // `case
27,1570, // `catch
28,991, // `char
29,137, // `const
30,323, // `continue
31,1962, // `default
32,1396, // `do
33,2015, // `double
34,660, // `enum
35,180, // `final
36,283, // `finally
37,686, // `float
38,1755, // `goto
39,113, // `implements
40,242, // `import
41,869, // `interface
42,1285, // `long
43,550, // `native
44,1114, // `package
45,1404, // `private
46,679, // `protected
47,43, // `public
48,1437, // `short
49,1192, // `static
50,340, // `strictfp
51,554, // `switch
52,774, // `synchronized
53,828, // `throw
54,378, // `throws
55,1060, // `transient
56,275, // `try
57,436, // `volatile
89,354, // "c"
90,1788, // "l"
91,1061, // "a"
92,1763, // "s"
95,640, // "e"
103,224, // "d"
104,1716, // "g"
106,1688, // "p"
107,1141, // "v"
109,308, // "f"
110,52, // "i"
113,274, // "r"
117,1003, // "b"
120,482, // "n"
121,896, // "t"
122,1394, // "w"
MIN_REDUCTION+362, // (default reduction)
  }
,
{ // state 1641
MIN_REDUCTION+347, // (default reduction)
  }
,
{ // state 1642
0x80000000|1, // match move
0x80000000|1804, // no-match move
0x80000000|67, // NT-test-match state for idChar
  }
,
{ // state 1643
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 1644
118,1120, // "h"
  }
,
{ // state 1645
125,808, // white
126,877, // {12}
127,877, // " "
128,877, // {9}
129,1185, // eol
130,994, // comment
131,1236, // oneLineComment
132,838, // blockComment
133,1248, // doubleSlash
136,798, // slashStar
149,144, // "/"
164,1315, // {10}
165,904, // {13}
179,MIN_REDUCTION+238, // $NT
  }
,
{ // state 1646
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
131,729, // oneLineComment
132,50, // blockComment
133,66, // doubleSlash
136,1210, // slashStar
149,144, // "/"
MIN_REDUCTION+244, // (default reduction)
  }
,
{ // state 1647
0x80000000|1906, // match move
0x80000000|940, // no-match move
0x80000000|65, // NT-test-match state for doubleSlash
  }
,
{ // state 1648
2,1887, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
131,729, // oneLineComment
132,50, // blockComment
133,66, // doubleSlash
136,1210, // slashStar
149,144, // "/"
MIN_REDUCTION+142, // (default reduction)
  }
,
{ // state 1649
MIN_REDUCTION+196, // (default reduction)
  }
,
{ // state 1650
0x80000000|1056, // match move
0x80000000|864, // no-match move
0x80000000|1594, // NT-test-match state for reserved
  }
,
{ // state 1651
0x80000000|914, // match move
0x80000000|1100, // no-match move
0x80000000|65, // NT-test-match state for doubleSlash
  }
,
{ // state 1652
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
131,729, // oneLineComment
132,50, // blockComment
133,66, // doubleSlash
136,1210, // slashStar
149,144, // "/"
MIN_REDUCTION+256, // (default reduction)
  }
,
{ // state 1653
0x80000000|899, // match move
0x80000000|16, // no-match move
0x80000000|1636, // NT-test-match state for slashStar
  }
,
{ // state 1654
2,1112, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
131,729, // oneLineComment
132,50, // blockComment
133,66, // doubleSlash
136,1210, // slashStar
149,144, // "/"
MIN_REDUCTION+281, // (default reduction)
  }
,
{ // state 1655
2,1459, // white*
125,2043, // white
126,877, // {12}
127,877, // " "
128,877, // {9}
129,1185, // eol
130,994, // comment
131,1236, // oneLineComment
132,838, // blockComment
133,1248, // doubleSlash
136,798, // slashStar
149,144, // "/"
164,1315, // {10}
165,904, // {13}
179,MIN_REDUCTION+290, // $NT
  }
,
{ // state 1656
2,1460, // white*
MIN_REDUCTION+134, // (default reduction)
  }
,
{ // state 1657
0x80000000|537, // match move
0x80000000|187, // no-match move
0x80000000|65, // NT-test-match state for doubleSlash
  }
,
{ // state 1658
121,463, // "t"
  }
,
{ // state 1659
0x80000000|1904, // match move
0x80000000|1005, // no-match move
0x80000000|65, // NT-test-match state for doubleSlash
  }
,
{ // state 1660
89,1993, // "c"
  }
,
{ // state 1661
2,1647, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
132,50, // blockComment
136,1210, // slashStar
149,1327, // "/"
MIN_REDUCTION+299, // (default reduction)
  }
,
{ // state 1662
95,1473, // "e"
  }
,
{ // state 1663
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
129,493, // eol
130,1783, // comment
164,1076, // {10}
165,1589, // {13}
MIN_REDUCTION+211, // (default reduction)
  }
,
{ // state 1664
90,355, // "l"
  }
,
{ // state 1665
106,1207, // "p"
  }
,
{ // state 1666
89,1889, // "c"
90,1889, // "l"
91,1889, // "a"
92,1889, // "s"
93,313, // idChar
95,1889, // "e"
100,1286, // letter
101,410, // digit
102,1324, // "_"
103,1889, // "d"
104,1889, // "g"
105,1889, // "m"
106,1889, // "p"
107,1889, // "v"
108,1889, // "y"
109,1889, // "f"
110,1889, // "i"
111,1889, // {"A".."Z"}
112,1889, // "o"
113,1889, // "r"
114,1889, // "u"
115,1889, // "x"
116,1889, // {"j" "q"}
117,1889, // "b"
118,1889, // "h"
119,1889, // "k"
120,1889, // "n"
121,1889, // "t"
122,1889, // "w"
123,1889, // "z"
124,1146, // {"0".."9"}
169,1744, // idChar**
176,1477, // idChar*
  }
,
{ // state 1667
0x80000000|872, // match move
0x80000000|1938, // no-match move
0x80000000|65, // NT-test-match state for doubleSlash
  }
,
{ // state 1668
MIN_REDUCTION+127, // (default reduction)
  }
,
{ // state 1669
0x80000000|268, // match move
0x80000000|122, // no-match move
0x80000000|1636, // NT-test-match state for slashStar
  }
,
{ // state 1670
92,332, // "s"
  }
,
{ // state 1671
0x80000000|1373, // match move
0x80000000|786, // no-match move
0x80000000|67, // NT-test-match state for idChar
  }
,
{ // state 1672
149,824, // "/"
  }
,
{ // state 1673
MIN_REDUCTION+102, // (default reduction)
  }
,
{ // state 1674
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
129,493, // eol
130,1783, // comment
164,1076, // {10}
165,1589, // {13}
MIN_REDUCTION+265, // (default reduction)
  }
,
{ // state 1675
0x80000000|256, // match move
0x80000000|835, // no-match move
0x80000000|65, // NT-test-match state for doubleSlash
  }
,
{ // state 1676
0x80000000|334, // match move
0x80000000|1543, // no-match move
0x80000000|1594, // NT-test-match state for reserved
  }
,
{ // state 1677
0x80000000|623, // match move
0x80000000|1903, // no-match move
0x80000000|65, // NT-test-match state for doubleSlash
  }
,
{ // state 1678
117,1883, // "b"
  }
,
{ // state 1679
179,MIN_REDUCTION+312, // $NT
  }
,
{ // state 1680
2,1887, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
132,50, // blockComment
136,1210, // slashStar
149,1327, // "/"
MIN_REDUCTION+142, // (default reduction)
  }
,
{ // state 1681
MIN_REDUCTION+125, // (default reduction)
  }
,
{ // state 1682
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
131,729, // oneLineComment
132,50, // blockComment
133,66, // doubleSlash
136,1210, // slashStar
149,144, // "/"
MIN_REDUCTION+205, // (default reduction)
  }
,
{ // state 1683
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
129,493, // eol
130,1783, // comment
164,1076, // {10}
165,1589, // {13}
MIN_REDUCTION+205, // (default reduction)
  }
,
{ // state 1684
MIN_REDUCTION+295, // (default reduction)
  }
,
{ // state 1685
179,MIN_REDUCTION+231, // $NT
  }
,
{ // state 1686
0x80000000|1268, // match move
0x80000000|1362, // no-match move
0x80000000|1636, // NT-test-match state for slashStar
  }
,
{ // state 1687
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
132,50, // blockComment
136,1210, // slashStar
149,1327, // "/"
MIN_REDUCTION+97, // (default reduction)
  }
,
{ // state 1688
91,1660, // "a"
113,1288, // "r"
114,1018, // "u"
  }
,
{ // state 1689
0x80000000|1471, // match move
0x80000000|1650, // no-match move
0x80000000|65, // NT-test-match state for doubleSlash
  }
,
{ // state 1690
MIN_REDUCTION+339, // (default reduction)
  }
,
{ // state 1691
0x80000000|1937, // match move
0x80000000|767, // no-match move
0x80000000|1636, // NT-test-match state for slashStar
  }
,
{ // state 1692
113,992, // "r"
  }
,
{ // state 1693
MIN_REDUCTION+105, // (default reduction)
  }
,
{ // state 1694
2,966, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
132,50, // blockComment
136,1210, // slashStar
149,1327, // "/"
MIN_REDUCTION+317, // (default reduction)
  }
,
{ // state 1695
2,1657, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
129,493, // eol
130,1783, // comment
164,1076, // {10}
165,1589, // {13}
MIN_REDUCTION+158, // (default reduction)
  }
,
{ // state 1696
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
129,493, // eol
130,1783, // comment
164,1076, // {10}
165,1589, // {13}
MIN_REDUCTION+159, // (default reduction)
  }
,
{ // state 1697
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
132,50, // blockComment
136,1210, // slashStar
149,1327, // "/"
MIN_REDUCTION+163, // (default reduction)
  }
,
{ // state 1698
0x80000000|1, // match move
0x80000000|267, // no-match move
0x80000000|532, // NT-test-match state for letter
  }
,
{ // state 1699
0x80000000|637, // match move
0x80000000|1357, // no-match move
0x80000000|1636, // NT-test-match state for slashStar
  }
,
{ // state 1700
120,1297, // "n"
  }
,
{ // state 1701
0x80000000|609, // match move
0x80000000|1698, // no-match move
0x80000000|67, // NT-test-match state for idChar
  }
,
{ // state 1702
0x80000000|1, // match move
0x80000000|1624, // no-match move
0x80000000|67, // NT-test-match state for idChar
  }
,
{ // state 1703
0x80000000|1281, // match move
0x80000000|875, // no-match move
0x80000000|1594, // NT-test-match state for reserved
  }
,
{ // state 1704
2,539, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
132,50, // blockComment
136,1210, // slashStar
149,1327, // "/"
MIN_REDUCTION+166, // (default reduction)
  }
,
{ // state 1705
MIN_REDUCTION+59, // (default reduction)
  }
,
{ // state 1706
0x80000000|1789, // match move
0x80000000|492, // no-match move
0x80000000|65, // NT-test-match state for doubleSlash
  }
,
{ // state 1707
0x80000000|543, // match move
0x80000000|1885, // no-match move
0x80000000|1636, // NT-test-match state for slashStar
  }
,
{ // state 1708
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
131,729, // oneLineComment
132,50, // blockComment
133,66, // doubleSlash
136,1210, // slashStar
149,144, // "/"
MIN_REDUCTION+295, // (default reduction)
  }
,
{ // state 1709
121,2003, // "t"
  }
,
{ // state 1710
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
131,729, // oneLineComment
132,50, // blockComment
133,66, // doubleSlash
136,1210, // slashStar
149,144, // "/"
MIN_REDUCTION+322, // (default reduction)
  }
,
{ // state 1711
95,54, // "e"
  }
,
{ // state 1712
123,457, // "z"
  }
,
{ // state 1713
0x80000000|1077, // match move
0x80000000|397, // no-match move
0x80000000|65, // NT-test-match state for doubleSlash
  }
,
{ // state 1714
0x80000000|1, // match move
0x80000000|571, // no-match move
0x80000000|67, // NT-test-match state for idChar
  }
,
{ // state 1715
0x80000000|975, // match move
0x80000000|1686, // no-match move
0x80000000|65, // NT-test-match state for doubleSlash
  }
,
{ // state 1716
112,1264, // "o"
  }
,
{ // state 1717
121,1555, // "t"
  }
,
{ // state 1718
2,1831, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
132,50, // blockComment
136,1210, // slashStar
149,1327, // "/"
MIN_REDUCTION+144, // (default reduction)
  }
,
{ // state 1719
164,1451, // {10}
  }
,
{ // state 1720
0x80000000|1, // match move
0x80000000|728, // no-match move
0x80000000|67, // NT-test-match state for idChar
  }
,
{ // state 1721
114,14, // "u"
  }
,
{ // state 1722
MIN_REDUCTION+304, // (default reduction)
  }
,
{ // state 1723
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
129,493, // eol
130,1783, // comment
164,1076, // {10}
165,1589, // {13}
MIN_REDUCTION+208, // (default reduction)
  }
,
{ // state 1724
MIN_REDUCTION+111, // (default reduction)
  }
,
{ // state 1725
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
132,50, // blockComment
136,1210, // slashStar
149,1327, // "/"
MIN_REDUCTION+167, // (default reduction)
  }
,
{ // state 1726
0x80000000|951, // match move
0x80000000|1653, // no-match move
0x80000000|65, // NT-test-match state for doubleSlash
  }
,
{ // state 1727
0x80000000|1222, // match move
0x80000000|1479, // no-match move
0x80000000|1636, // NT-test-match state for slashStar
  }
,
{ // state 1728
118,87, // "h"
  }
,
{ // state 1729
MIN_REDUCTION+153, // (default reduction)
  }
,
{ // state 1730
125,808, // white
126,877, // {12}
127,877, // " "
128,877, // {9}
129,1185, // eol
130,994, // comment
131,1236, // oneLineComment
132,838, // blockComment
133,1248, // doubleSlash
136,798, // slashStar
149,144, // "/"
164,1315, // {10}
165,904, // {13}
179,MIN_REDUCTION+193, // $NT
  }
,
{ // state 1731
90,1156, // "l"
  }
,
{ // state 1732
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
132,50, // blockComment
136,1210, // slashStar
149,1327, // "/"
MIN_REDUCTION+364, // (default reduction)
  }
,
{ // state 1733
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
129,493, // eol
130,1783, // comment
164,1076, // {10}
165,1589, // {13}
MIN_REDUCTION+135, // (default reduction)
  }
,
{ // state 1734
2,974, // white*
125,2043, // white
126,877, // {12}
127,877, // " "
128,877, // {9}
129,1185, // eol
130,994, // comment
131,1236, // oneLineComment
132,838, // blockComment
133,1248, // doubleSlash
136,798, // slashStar
149,144, // "/"
164,1315, // {10}
165,904, // {13}
179,MIN_REDUCTION+260, // $NT
  }
,
{ // state 1735
2,1229, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
132,50, // blockComment
136,1210, // slashStar
149,1327, // "/"
MIN_REDUCTION+174, // (default reduction)
  }
,
{ // state 1736
0x80000000|1200, // match move
0x80000000|692, // no-match move
0x80000000|65, // NT-test-match state for doubleSlash
  }
,
{ // state 1737
0x80000000|1986, // match move
0x80000000|848, // no-match move
0x80000000|1636, // NT-test-match state for slashStar
  }
,
{ // state 1738
0x80000000|1, // match move
0x80000000|1762, // no-match move
0x80000000|67, // NT-test-match state for idChar
  }
,
{ // state 1739
125,808, // white
126,877, // {12}
127,877, // " "
128,877, // {9}
129,1185, // eol
130,994, // comment
131,1236, // oneLineComment
132,838, // blockComment
133,1248, // doubleSlash
136,798, // slashStar
149,144, // "/"
164,1315, // {10}
165,904, // {13}
179,MIN_REDUCTION+229, // $NT
  }
,
{ // state 1740
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
129,493, // eol
130,1783, // comment
164,1076, // {10}
165,1589, // {13}
MIN_REDUCTION+177, // (default reduction)
  }
,
{ // state 1741
0x80000000|1, // match move
0x80000000|700, // no-match move
0x80000000|67, // NT-test-match state for idChar
  }
,
{ // state 1742
2,381, // white*
125,2043, // white
126,877, // {12}
127,877, // " "
128,877, // {9}
129,1185, // eol
130,994, // comment
131,1236, // oneLineComment
132,838, // blockComment
133,1248, // doubleSlash
136,798, // slashStar
149,144, // "/"
164,1315, // {10}
165,904, // {13}
179,MIN_REDUCTION+236, // $NT
  }
,
{ // state 1743
MIN_REDUCTION+88, // (default reduction)
  }
,
{ // state 1744
0x80000000|586, // match move
0x80000000|1821, // no-match move
0x80000000|65, // NT-test-match state for doubleSlash
  }
,
{ // state 1745
MIN_REDUCTION+361, // (default reduction)
  }
,
{ // state 1746
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
131,729, // oneLineComment
132,50, // blockComment
133,66, // doubleSlash
136,1210, // slashStar
149,144, // "/"
MIN_REDUCTION+292, // (default reduction)
  }
,
{ // state 1747
MIN_REDUCTION+235, // (default reduction)
  }
,
{ // state 1748
125,808, // white
126,877, // {12}
127,877, // " "
128,877, // {9}
129,1185, // eol
130,994, // comment
131,1236, // oneLineComment
132,838, // blockComment
133,1248, // doubleSlash
136,798, // slashStar
149,144, // "/"
164,1315, // {10}
165,904, // {13}
179,MIN_REDUCTION+184, // $NT
  }
,
{ // state 1749
0x80000000|1194, // match move
0x80000000|1602, // no-match move
0x80000000|1636, // NT-test-match state for slashStar
  }
,
{ // state 1750
120,1346, // "n"
  }
,
{ // state 1751
2,1971, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
132,50, // blockComment
136,1210, // slashStar
149,1327, // "/"
MIN_REDUCTION+296, // (default reduction)
  }
,
{ // state 1752
125,808, // white
126,877, // {12}
127,877, // " "
128,877, // {9}
129,1185, // eol
130,994, // comment
131,1236, // oneLineComment
132,838, // blockComment
133,1248, // doubleSlash
136,798, // slashStar
149,144, // "/"
164,1315, // {10}
165,904, // {13}
179,MIN_REDUCTION+187, // $NT
  }
,
{ // state 1753
2,219, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
129,493, // eol
130,1783, // comment
164,1076, // {10}
165,1589, // {13}
MIN_REDUCTION+172, // (default reduction)
  }
,
{ // state 1754
0x80000000|1857, // match move
0x80000000|548, // no-match move
0x80000000|1636, // NT-test-match state for slashStar
  }
,
{ // state 1755
MIN_REDUCTION+38, // (default reduction)
  }
,
{ // state 1756
0x80000000|1932, // match move
0x80000000|790, // no-match move
0x80000000|1636, // NT-test-match state for slashStar
  }
,
{ // state 1757
121,1197, // "t"
  }
,
{ // state 1758
0x80000000|1283, // match move
0x80000000|1873, // no-match move
0x80000000|1594, // NT-test-match state for reserved
  }
,
{ // state 1759
2,797, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
131,729, // oneLineComment
132,50, // blockComment
133,66, // doubleSlash
136,1210, // slashStar
149,144, // "/"
MIN_REDUCTION+218, // (default reduction)
  }
,
{ // state 1760
0x80000000|1652, // match move
0x80000000|211, // no-match move
0x80000000|65, // NT-test-match state for doubleSlash
  }
,
{ // state 1761
0x80000000|720, // match move
0x80000000|1310, // no-match move
0x80000000|65, // NT-test-match state for doubleSlash
  }
,
{ // state 1762
0x80000000|1262, // match move
0x80000000|1572, // no-match move
0x80000000|65, // NT-test-match state for doubleSlash
  }
,
{ // state 1763
108,792, // "y"
114,1665, // "u"
118,602, // "h"
121,1397, // "t"
122,171, // "w"
  }
,
{ // state 1764
0x80000000|1930, // match move
0x80000000|521, // no-match move
0x80000000|65, // NT-test-match state for doubleSlash
  }
,
{ // state 1765
105,102, // "m"
  }
,
{ // state 1766
0x80000000|909, // match move
0x80000000|1970, // no-match move
0x80000000|65, // NT-test-match state for doubleSlash
  }
,
{ // state 1767
0x80000000|777, // match move
0x80000000|511, // no-match move
0x80000000|65, // NT-test-match state for doubleSlash
  }
,
{ // state 1768
2,483, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
131,729, // oneLineComment
132,50, // blockComment
133,66, // doubleSlash
136,1210, // slashStar
149,144, // "/"
MIN_REDUCTION+323, // (default reduction)
  }
,
{ // state 1769
121,1629, // "t"
  }
,
{ // state 1770
112,1152, // "o"
  }
,
{ // state 1771
95,1741, // "e"
  }
,
{ // state 1772
112,1796, // "o"
  }
,
{ // state 1773
0x80000000|1, // match move
0x80000000|1781, // no-match move
0x80000000|67, // NT-test-match state for idChar
  }
,
{ // state 1774
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
131,729, // oneLineComment
132,50, // blockComment
133,66, // doubleSlash
136,1210, // slashStar
149,144, // "/"
MIN_REDUCTION+153, // (default reduction)
  }
,
{ // state 1775
0x80000000|1, // match move
0x80000000|760, // no-match move
0x80000000|67, // NT-test-match state for idChar
  }
,
{ // state 1776
0x80000000|746, // match move
0x80000000|1332, // no-match move
0x80000000|1636, // NT-test-match state for slashStar
  }
,
{ // state 1777
179,MIN_REDUCTION+264, // $NT
  }
,
{ // state 1778
0x80000000|1, // match move
0x80000000|759, // no-match move
0x80000000|67, // NT-test-match state for idChar
  }
,
{ // state 1779
179,MIN_REDUCTION+112, // $NT
MIN_REDUCTION+112, // (default reduction)
  }
,
{ // state 1780
105,1738, // "m"
  }
,
{ // state 1781
0x80000000|1601, // match move
0x80000000|803, // no-match move
0x80000000|65, // NT-test-match state for doubleSlash
  }
,
{ // state 1782
2,1896, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
132,50, // blockComment
136,1210, // slashStar
149,1327, // "/"
MIN_REDUCTION+191, // (default reduction)
  }
,
{ // state 1783
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 1784
0x80000000|1581, // match move
0x80000000|159, // no-match move
0x80000000|1636, // NT-test-match state for slashStar
  }
,
{ // state 1785
0x80000000|1751, // match move
0x80000000|934, // no-match move
0x80000000|1636, // NT-test-match state for slashStar
  }
,
{ // state 1786
108,919, // "y"
114,288, // "u"
118,817, // "h"
121,2035, // "t"
122,1044, // "w"
  }
,
{ // state 1787
0x80000000|433, // match move
0x80000000|290, // no-match move
0x80000000|65, // NT-test-match state for doubleSlash
  }
,
{ // state 1788
112,105, // "o"
  }
,
{ // state 1789
2,1657, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
131,729, // oneLineComment
132,50, // blockComment
133,66, // doubleSlash
136,1210, // slashStar
149,144, // "/"
MIN_REDUCTION+158, // (default reduction)
  }
,
{ // state 1790
MIN_REDUCTION+101, // (default reduction)
  }
,
{ // state 1791
0x80000000|1095, // match move
0x80000000|1985, // no-match move
0x80000000|65, // NT-test-match state for doubleSlash
  }
,
{ // state 1792
0x80000000|698, // match move
0x80000000|350, // no-match move
0x80000000|65, // NT-test-match state for doubleSlash
  }
,
{ // state 1793
125,808, // white
126,877, // {12}
127,877, // " "
128,877, // {9}
129,1185, // eol
130,994, // comment
131,1236, // oneLineComment
132,838, // blockComment
133,1248, // doubleSlash
136,798, // slashStar
149,144, // "/"
164,1315, // {10}
165,904, // {13}
179,MIN_REDUCTION+223, // $NT
  }
,
{ // state 1794
95,399, // "e"
  }
,
{ // state 1795
0x80000000|976, // match move
0x80000000|2021, // no-match move
0x80000000|65, // NT-test-match state for doubleSlash
  }
,
{ // state 1796
90,1182, // "l"
  }
,
{ // state 1797
179,MIN_REDUCTION+119, // $NT
MIN_REDUCTION+119, // (default reduction)
  }
,
{ // state 1798
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
132,50, // blockComment
136,1210, // slashStar
149,1327, // "/"
MIN_REDUCTION+363, // (default reduction)
  }
,
{ // state 1799
MIN_REDUCTION+274, // (default reduction)
  }
,
{ // state 1800
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 1801
121,1714, // "t"
  }
,
{ // state 1802
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
129,493, // eol
130,1783, // comment
164,1076, // {10}
165,1589, // {13}
MIN_REDUCTION+331, // (default reduction)
  }
,
{ // state 1803
MIN_REDUCTION+97, // (default reduction)
  }
,
{ // state 1804
0x80000000|1392, // match move
0x80000000|1927, // no-match move
0x80000000|65, // NT-test-match state for doubleSlash
  }
,
{ // state 1805
89,1091, // "c"
90,1091, // "l"
91,1091, // "a"
92,1091, // "s"
95,1091, // "e"
96,1091, // "!"
97,1091, // "="
98,1091, // "+"
102,1091, // "_"
103,1091, // "d"
104,1091, // "g"
105,1091, // "m"
106,1091, // "p"
107,1091, // "v"
108,1091, // "y"
109,1091, // "f"
110,1091, // "i"
111,1091, // {"A".."Z"}
112,1091, // "o"
113,1091, // "r"
114,1091, // "u"
115,1091, // "x"
116,1091, // {"j" "q"}
117,1091, // "b"
118,1091, // "h"
119,1091, // "k"
120,1091, // "n"
121,1091, // "t"
122,1091, // "w"
123,1091, // "z"
124,1091, // {"0".."9"}
127,1091, // " "
134,1864, // printable**
135,606, // printable
140,1091, // "["
141,1091, // "-"
142,1091, // "<"
143,1091, // "|"
144,1091, // {"?".."@"}
145,1091, // "&"
146,1091, // ")"
147,1091, // ","
148,1091, // "]"
149,1091, // "/"
150,1091, // {"#".."$"}
151,1091, // ";"
152,1091, // ">"
153,1091, // "{"
154,1091, // "%"
155,1091, // "("
156,1091, // "\"
157,1091, // "."
158,1091, // ":"
159,1091, // "}"
160,1091, // {"^" "`" "~"}
161,1091, // "'"
162,1091, // '"'
163,1091, // "*"
174,316, // printable*
  }
,
{ // state 1806
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
131,729, // oneLineComment
132,50, // blockComment
133,66, // doubleSlash
136,1210, // slashStar
149,144, // "/"
MIN_REDUCTION+220, // (default reduction)
  }
,
{ // state 1807
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
132,50, // blockComment
136,1210, // slashStar
149,1327, // "/"
MIN_REDUCTION+161, // (default reduction)
  }
,
{ // state 1808
120,1638, // "n"
  }
,
{ // state 1809
110,1414, // "i"
  }
,
{ // state 1810
0x80000000|422, // match move
0x80000000|687, // no-match move
0x80000000|1636, // NT-test-match state for slashStar
  }
,
{ // state 1811
0x80000000|1, // match move
0x80000000|1726, // no-match move
0x80000000|67, // NT-test-match state for idChar
  }
,
{ // state 1812
2,704, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
132,50, // blockComment
136,1210, // slashStar
149,1327, // "/"
MIN_REDUCTION+302, // (default reduction)
  }
,
{ // state 1813
0x80000000|222, // match move
0x80000000|2004, // no-match move
0x80000000|67, // NT-test-match state for idChar
  }
,
{ // state 1814
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
129,493, // eol
130,1783, // comment
164,1076, // {10}
165,1589, // {13}
MIN_REDUCTION+313, // (default reduction)
  }
,
{ // state 1815
179,MIN_REDUCTION+285, // $NT
  }
,
{ // state 1816
0x80000000|1452, // match move
0x80000000|9, // no-match move
0x80000000|1636, // NT-test-match state for slashStar
  }
,
{ // state 1817
0x80000000|1169, // match move
0x80000000|1426, // no-match move
0x80000000|1636, // NT-test-match state for slashStar
  }
,
{ // state 1818
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
131,729, // oneLineComment
132,50, // blockComment
133,66, // doubleSlash
136,1210, // slashStar
149,144, // "/"
MIN_REDUCTION+159, // (default reduction)
  }
,
{ // state 1819
0x80000000|237, // match move
0x80000000|1231, // no-match move
0x80000000|1594, // NT-test-match state for reserved
  }
,
{ // state 1820
0x80000000|174, // match move
0x80000000|1263, // no-match move
0x80000000|1594, // NT-test-match state for reserved
  }
,
{ // state 1821
0x80000000|29, // match move
0x80000000|478, // no-match move
0x80000000|1594, // NT-test-match state for reserved
  }
,
{ // state 1822
0x80000000|2030, // match move
0x80000000|1892, // no-match move
0x80000000|1594, // NT-test-match state for reserved
  }
,
{ // state 1823
2,1925, // white*
MIN_REDUCTION+146, // (default reduction)
  }
,
{ // state 1824
90,1585, // "l"
  }
,
{ // state 1825
95,1765, // "e"
  }
,
{ // state 1826
0x80000000|1, // match move
0x80000000|1715, // no-match move
0x80000000|67, // NT-test-match state for idChar
  }
,
{ // state 1827
95,383, // "e"
  }
,
{ // state 1828
2,429, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
132,50, // blockComment
136,1210, // slashStar
149,1327, // "/"
MIN_REDUCTION+263, // (default reduction)
  }
,
{ // state 1829
0x80000000|1, // match move
0x80000000|747, // no-match move
0x80000000|67, // NT-test-match state for idChar
  }
,
{ // state 1830
95,86, // "e"
  }
,
{ // state 1831
0x80000000|921, // match move
0x80000000|1822, // no-match move
0x80000000|65, // NT-test-match state for doubleSlash
  }
,
{ // state 1832
92,1670, // "s"
  }
,
{ // state 1833
90,1825, // "l"
112,973, // "o"
  }
,
{ // state 1834
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
132,50, // blockComment
136,1210, // slashStar
149,1327, // "/"
MIN_REDUCTION+131, // (default reduction)
  }
,
{ // state 1835
91,938, // "a"
  }
,
{ // state 1836
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
129,493, // eol
130,1783, // comment
164,1076, // {10}
165,1589, // {13}
MIN_REDUCTION+229, // (default reduction)
  }
,
{ // state 1837
125,808, // white
126,877, // {12}
127,877, // " "
128,877, // {9}
129,1185, // eol
130,994, // comment
131,1236, // oneLineComment
132,838, // blockComment
133,1248, // doubleSlash
136,798, // slashStar
149,144, // "/"
164,1315, // {10}
165,904, // {13}
179,MIN_REDUCTION+92, // $NT
  }
,
{ // state 1838
0x80000000|23, // match move
0x80000000|1054, // no-match move
0x80000000|65, // NT-test-match state for doubleSlash
  }
,
{ // state 1839
0x80000000|621, // match move
0x80000000|119, // no-match move
0x80000000|65, // NT-test-match state for doubleSlash
  }
,
{ // state 1840
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 1841
0x80000000|616, // match move
0x80000000|1965, // no-match move
0x80000000|65, // NT-test-match state for doubleSlash
  }
,
{ // state 1842
MIN_REDUCTION+334, // (default reduction)
  }
,
{ // state 1843
2,1135, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
132,50, // blockComment
136,1210, // slashStar
149,1327, // "/"
MIN_REDUCTION+254, // (default reduction)
  }
,
{ // state 1844
2,1136, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
129,493, // eol
130,1783, // comment
164,1076, // {10}
165,1589, // {13}
MIN_REDUCTION+287, // (default reduction)
  }
,
{ // state 1845
MIN_REDUCTION+286, // (default reduction)
  }
,
{ // state 1846
2,876, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
132,50, // blockComment
136,1210, // slashStar
149,1327, // "/"
MIN_REDUCTION+176, // (default reduction)
  }
,
{ // state 1847
0x80000000|1499, // match move
0x80000000|423, // no-match move
0x80000000|1594, // NT-test-match state for reserved
  }
,
{ // state 1848
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
129,493, // eol
130,1783, // comment
164,1076, // {10}
165,1589, // {13}
MIN_REDUCTION+173, // (default reduction)
  }
,
{ // state 1849
121,386, // "t"
  }
,
{ // state 1850
MIN_REDUCTION+63, // (default reduction)
  }
,
{ // state 1851
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
131,729, // oneLineComment
132,50, // blockComment
133,66, // doubleSlash
136,1210, // slashStar
149,144, // "/"
MIN_REDUCTION+155, // (default reduction)
  }
,
{ // state 1852
91,1568, // "a"
  }
,
{ // state 1853
125,808, // white
126,877, // {12}
127,877, // " "
128,877, // {9}
129,1185, // eol
130,994, // comment
131,1236, // oneLineComment
132,838, // blockComment
133,1248, // doubleSlash
136,798, // slashStar
149,144, // "/"
164,1315, // {10}
165,904, // {13}
179,MIN_REDUCTION+256, // $NT
  }
,
{ // state 1854
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
129,493, // eol
130,1783, // comment
164,1076, // {10}
165,1589, // {13}
MIN_REDUCTION+193, // (default reduction)
  }
,
{ // state 1855
179,MIN_REDUCTION+300, // $NT
  }
,
{ // state 1856
91,413, // "a"
  }
,
{ // state 1857
2,1435, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
132,50, // blockComment
136,1210, // slashStar
149,1327, // "/"
MIN_REDUCTION+203, // (default reduction)
  }
,
{ // state 1858
123,142, // "z"
  }
,
{ // state 1859
MIN_REDUCTION+103, // (default reduction)
  }
,
{ // state 1860
2,24, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
129,493, // eol
130,1783, // comment
164,1076, // {10}
165,1589, // {13}
MIN_REDUCTION+311, // (default reduction)
  }
,
{ // state 1861
MIN_REDUCTION+103, // (default reduction)
  }
,
{ // state 1862
92,1998, // "s"
121,167, // "t"
  }
,
{ // state 1863
0x80000000|227, // match move
0x80000000|1157, // no-match move
0x80000000|1594, // NT-test-match state for reserved
  }
,
{ // state 1864
129,649, // eol
164,1076, // {10}
165,1589, // {13}
  }
,
{ // state 1865
MIN_REDUCTION+141, // (default reduction)
  }
,
{ // state 1866
0x80000000|314, // match move
0x80000000|155, // no-match move
0x80000000|1636, // NT-test-match state for slashStar
  }
,
{ // state 1867
0x80000000|1082, // match move
0x80000000|1703, // no-match move
0x80000000|65, // NT-test-match state for doubleSlash
  }
,
{ // state 1868
2,960, // white*
125,2043, // white
126,877, // {12}
127,877, // " "
128,877, // {9}
129,1185, // eol
130,994, // comment
131,1236, // oneLineComment
132,838, // blockComment
133,1248, // doubleSlash
136,798, // slashStar
149,144, // "/"
164,1315, // {10}
165,904, // {13}
179,MIN_REDUCTION+293, // $NT
  }
,
{ // state 1869
MIN_REDUCTION+118, // (default reduction)
  }
,
{ // state 1870
0x80000000|676, // match move
0x80000000|1844, // no-match move
0x80000000|1636, // NT-test-match state for slashStar
  }
,
{ // state 1871
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
129,493, // eol
130,1783, // comment
164,1076, // {10}
165,1589, // {13}
MIN_REDUCTION+286, // (default reduction)
  }
,
{ // state 1872
4,1347, // token
58,1519, // `!
59,1705, // `!=
60,902, // `%
61,697, // `&&
62,668, // `*
63,1850, // `(
64,1951, // `)
65,1039, // `{
66,1042, // `}
67,1057, // `-
68,827, // `+
69,634, // `=
70,1195, // `==
71,450, // `[
72,1462, // `]
73,407, // `||
74,2039, // `<
75,614, // `<=
76,179, // `,
77,302, // `>
78,794, // `>=
79,33, // `.
80,985, // `;
81,958, // `++
82,428, // `--
83,1840, // `/
84,754, // `:
85,1621, // ID
86,809, // INT_LITERAL
87,140, // STRING_LITERAL
88,1743, // CHAR_LITERAL
89,663, // "c"
90,663, // "l"
91,663, // "a"
92,663, // "s"
95,663, // "e"
96,1123, // "!"
97,1508, // "="
98,414, // "+"
99,811, // digit++
100,1701, // letter
101,1258, // digit
103,663, // "d"
104,663, // "g"
105,663, // "m"
106,663, // "p"
107,663, // "v"
108,663, // "y"
109,663, // "f"
110,663, // "i"
111,663, // {"A".."Z"}
112,663, // "o"
113,663, // "r"
114,663, // "u"
115,663, // "x"
116,663, // {"j" "q"}
117,663, // "b"
118,663, // "h"
119,663, // "k"
120,663, // "n"
121,663, // "t"
122,663, // "w"
123,663, // "z"
124,403, // {"0".."9"}
140,1025, // "["
141,1015, // "-"
142,1189, // "<"
143,458, // "|"
145,2034, // "&"
146,406, // ")"
147,1964, // ","
148,177, // "]"
149,1247, // "/"
151,1328, // ";"
152,562, // ">"
153,1295, // "{"
154,1027, // "%"
155,469, // "("
157,1406, // "."
158,1667, // ":"
159,1838, // "}"
161,2025, // "'"
162,673, // '"'
163,255, // "*"
168,1569, // letter++
175,604, // digit+
177,1166, // letter+
MIN_REDUCTION+362, // (default reduction)
  }
,
{ // state 1873
0x80000000|170, // match move
0x80000000|1674, // no-match move
0x80000000|1636, // NT-test-match state for slashStar
  }
,
{ // state 1874
0x80000000|464, // match move
0x80000000|186, // no-match move
0x80000000|65, // NT-test-match state for doubleSlash
  }
,
{ // state 1875
90,495, // "l"
  }
,
{ // state 1876
110,1700, // "i"
  }
,
{ // state 1877
2,893, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
132,50, // blockComment
136,1210, // slashStar
149,1327, // "/"
MIN_REDUCTION+96, // (default reduction)
  }
,
{ // state 1878
MIN_REDUCTION+4, // (default reduction)
  }
,
{ // state 1879
0x80000000|638, // match move
0x80000000|1257, // no-match move
0x80000000|1636, // NT-test-match state for slashStar
  }
,
{ // state 1880
0x80000000|742, // match move
0x80000000|1103, // no-match move
0x80000000|1594, // NT-test-match state for reserved
  }
,
{ // state 1881
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
131,729, // oneLineComment
132,50, // blockComment
133,66, // doubleSlash
136,1210, // slashStar
149,144, // "/"
MIN_REDUCTION+165, // (default reduction)
  }
,
{ // state 1882
0x80000000|1, // match move
0x80000000|681, // no-match move
0x80000000|67, // NT-test-match state for idChar
  }
,
{ // state 1883
90,57, // "l"
  }
,
{ // state 1884
110,251, // "i"
113,702, // "r"
  }
,
{ // state 1885
2,1713, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
129,493, // eol
130,1783, // comment
164,1076, // {10}
165,1589, // {13}
MIN_REDUCTION+314, // (default reduction)
  }
,
{ // state 1886
2,1453, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
132,50, // blockComment
136,1210, // slashStar
149,1327, // "/"
MIN_REDUCTION+200, // (default reduction)
  }
,
{ // state 1887
0x80000000|1158, // match move
0x80000000|1038, // no-match move
0x80000000|65, // NT-test-match state for doubleSlash
  }
,
{ // state 1888
92,263, // "s"
  }
,
{ // state 1889
0x80000000|198, // match move
0x80000000|225, // no-match move
0x80000000|67, // NT-test-match state for idChar
  }
,
{ // state 1890
125,808, // white
126,877, // {12}
127,877, // " "
128,877, // {9}
129,1185, // eol
130,994, // comment
131,1236, // oneLineComment
132,838, // blockComment
133,1248, // doubleSlash
136,798, // slashStar
149,144, // "/"
164,1315, // {10}
165,904, // {13}
179,MIN_REDUCTION+295, // $NT
  }
,
{ // state 1891
2,558, // white*
MIN_REDUCTION+162, // (default reduction)
  }
,
{ // state 1892
0x80000000|805, // match move
0x80000000|1942, // no-match move
0x80000000|1636, // NT-test-match state for slashStar
  }
,
{ // state 1893
0x80000000|1, // match move
0x80000000|1935, // no-match move
0x80000000|67, // NT-test-match state for idChar
  }
,
{ // state 1894
0x80000000|1334, // match move
0x80000000|1181, // no-match move
0x80000000|1636, // NT-test-match state for slashStar
  }
,
{ // state 1895
0x80000000|1241, // match move
0x80000000|229, // no-match move
0x80000000|1594, // NT-test-match state for reserved
  }
,
{ // state 1896
0x80000000|394, // match move
0x80000000|265, // no-match move
0x80000000|65, // NT-test-match state for doubleSlash
  }
,
{ // state 1897
0x80000000|1687, // match move
0x80000000|266, // no-match move
0x80000000|1636, // NT-test-match state for slashStar
  }
,
{ // state 1898
2,558, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
132,50, // blockComment
136,1210, // slashStar
149,1327, // "/"
MIN_REDUCTION+162, // (default reduction)
  }
,
{ // state 1899
125,808, // white
126,877, // {12}
127,877, // " "
128,877, // {9}
129,1185, // eol
130,994, // comment
131,1236, // oneLineComment
132,838, // blockComment
133,1248, // doubleSlash
136,798, // slashStar
149,144, // "/"
164,1315, // {10}
165,904, // {13}
179,MIN_REDUCTION+298, // $NT
  }
,
{ // state 1900
0x80000000|1, // match move
0x80000000|880, // no-match move
0x80000000|67, // NT-test-match state for idChar
  }
,
{ // state 1901
2,876, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
131,729, // oneLineComment
132,50, // blockComment
133,66, // doubleSlash
136,1210, // slashStar
149,144, // "/"
MIN_REDUCTION+176, // (default reduction)
  }
,
{ // state 1902
MIN_REDUCTION+364, // (default reduction)
  }
,
{ // state 1903
0x80000000|1505, // match move
0x80000000|795, // no-match move
0x80000000|1594, // NT-test-match state for reserved
  }
,
{ // state 1904
3,6, // $$0
4,1070, // token
125,726, // white
126,1489, // {12}
127,1489, // " "
128,1489, // {9}
130,1390, // comment
131,1643, // oneLineComment
132,1121, // blockComment
133,203, // doubleSlash
136,1532, // slashStar
149,144, // "/"
173,1612, // token*
MIN_REDUCTION+3, // (default reduction)
  }
,
{ // state 1905
179,MIN_REDUCTION+113, // $NT
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 1906
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
131,729, // oneLineComment
132,50, // blockComment
133,66, // doubleSlash
136,1210, // slashStar
149,144, // "/"
MIN_REDUCTION+298, // (default reduction)
  }
,
{ // state 1907
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
129,493, // eol
130,1783, // comment
164,1076, // {10}
165,1589, // {13}
MIN_REDUCTION+289, // (default reduction)
  }
,
{ // state 1908
92,831, // "s"
  }
,
{ // state 1909
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
132,50, // blockComment
136,1210, // slashStar
149,1327, // "/"
MIN_REDUCTION+226, // (default reduction)
  }
,
{ // state 1910
129,1523, // eol
134,330, // printable**
164,73, // {10}
165,1520, // {13}
174,316, // printable*
  }
,
{ // state 1911
0x80000000|1, // match move
0x80000000|1151, // no-match move
0x80000000|67, // NT-test-match state for idChar
  }
,
{ // state 1912
112,411, // "o"
  }
,
{ // state 1913
121,1721, // "t"
  }
,
{ // state 1914
0x80000000|664, // match move
0x80000000|1497, // no-match move
0x80000000|1594, // NT-test-match state for reserved
  }
,
{ // state 1915
0x80000000|843, // match move
0x80000000|1871, // no-match move
0x80000000|1636, // NT-test-match state for slashStar
  }
,
{ // state 1916
117,1609, // "b"
  }
,
{ // state 1917
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
132,50, // blockComment
136,1210, // slashStar
149,1327, // "/"
MIN_REDUCTION+271, // (default reduction)
  }
,
{ // state 1918
125,808, // white
126,877, // {12}
127,877, // " "
128,877, // {9}
129,1185, // eol
130,994, // comment
131,1236, // oneLineComment
132,838, // blockComment
133,1248, // doubleSlash
136,798, // slashStar
149,144, // "/"
164,1315, // {10}
165,904, // {13}
179,MIN_REDUCTION+244, // $NT
  }
,
{ // state 1919
0x80000000|851, // match move
0x80000000|780, // no-match move
0x80000000|1594, // NT-test-match state for reserved
  }
,
{ // state 1920
110,1712, // "i"
  }
,
{ // state 1921
2,1675, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
131,729, // oneLineComment
132,50, // blockComment
133,66, // doubleSlash
136,1210, // slashStar
149,144, // "/"
MIN_REDUCTION+148, // (default reduction)
  }
,
{ // state 1922
MIN_REDUCTION+340, // (default reduction)
  }
,
{ // state 1923
MIN_REDUCTION+310, // (default reduction)
  }
,
{ // state 1924
179,MIN_REDUCTION+123, // $NT
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 1925
0x80000000|789, // match move
0x80000000|1929, // no-match move
0x80000000|65, // NT-test-match state for doubleSlash
  }
,
{ // state 1926
2,135, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
131,729, // oneLineComment
132,50, // blockComment
133,66, // doubleSlash
136,1210, // slashStar
149,144, // "/"
MIN_REDUCTION+209, // (default reduction)
  }
,
{ // state 1927
0x80000000|820, // match move
0x80000000|1576, // no-match move
0x80000000|1636, // NT-test-match state for slashStar
  }
,
{ // state 1928
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
131,729, // oneLineComment
132,50, // blockComment
133,66, // doubleSlash
136,1210, // slashStar
149,144, // "/"
MIN_REDUCTION+307, // (default reduction)
  }
,
{ // state 1929
0x80000000|957, // match move
0x80000000|890, // no-match move
0x80000000|1594, // NT-test-match state for reserved
  }
,
{ // state 1930
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
131,729, // oneLineComment
132,50, // blockComment
133,66, // doubleSlash
136,1210, // slashStar
149,144, // "/"
MIN_REDUCTION+325, // (default reduction)
  }
,
{ // state 1931
0x80000000|2038, // match move
0x80000000|1294, // no-match move
0x80000000|1636, // NT-test-match state for slashStar
  }
,
{ // state 1932
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
132,50, // blockComment
136,1210, // slashStar
149,1327, // "/"
MIN_REDUCTION+304, // (default reduction)
  }
,
{ // state 1933
4,1347, // token
MIN_REDUCTION+362, // (default reduction)
  }
,
{ // state 1934
MIN_REDUCTION+262, // (default reduction)
  }
,
{ // state 1935
0x80000000|21, // match move
0x80000000|1001, // no-match move
0x80000000|65, // NT-test-match state for doubleSlash
  }
,
{ // state 1936
0x80000000|1368, // match move
0x80000000|152, // no-match move
0x80000000|65, // NT-test-match state for doubleSlash
  }
,
{ // state 1937
2,1180, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
132,50, // blockComment
136,1210, // slashStar
149,1327, // "/"
MIN_REDUCTION+170, // (default reduction)
  }
,
{ // state 1938
0x80000000|1482, // match move
0x80000000|1691, // no-match move
0x80000000|1594, // NT-test-match state for reserved
  }
,
{ // state 1939
MIN_REDUCTION+328, // (default reduction)
  }
,
{ // state 1940
0x80000000|250, // match move
0x80000000|559, // no-match move
0x80000000|1636, // NT-test-match state for slashStar
  }
,
{ // state 1941
0x80000000|1096, // match move
0x80000000|204, // no-match move
0x80000000|1594, // NT-test-match state for reserved
  }
,
{ // state 1942
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
129,493, // eol
130,1783, // comment
164,1076, // {10}
165,1589, // {13}
MIN_REDUCTION+143, // (default reduction)
  }
,
{ // state 1943
0x80000000|1343, // match move
0x80000000|1433, // no-match move
0x80000000|1636, // NT-test-match state for slashStar
  }
,
{ // state 1944
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
129,493, // eol
130,1783, // comment
164,1076, // {10}
165,1589, // {13}
MIN_REDUCTION+147, // (default reduction)
  }
,
{ // state 1945
92,1642, // "s"
  }
,
{ // state 1946
179,MIN_REDUCTION+114, // $NT
MIN_REDUCTION+114, // (default reduction)
  }
,
{ // state 1947
95,1717, // "e"
  }
,
{ // state 1948
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
132,50, // blockComment
136,1210, // slashStar
149,1327, // "/"
MIN_REDUCTION+169, // (default reduction)
  }
,
{ // state 1949
0x80000000|1329, // match move
0x80000000|419, // no-match move
0x80000000|1636, // NT-test-match state for slashStar
  }
,
{ // state 1950
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
131,729, // oneLineComment
132,50, // blockComment
133,66, // doubleSlash
136,1210, // slashStar
149,144, // "/"
MIN_REDUCTION+196, // (default reduction)
  }
,
{ // state 1951
MIN_REDUCTION+64, // (default reduction)
  }
,
{ // state 1952
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
129,493, // eol
130,1783, // comment
164,1076, // {10}
165,1589, // {13}
MIN_REDUCTION+250, // (default reduction)
  }
,
{ // state 1953
0x80000000|534, // match move
0x80000000|1941, // no-match move
0x80000000|65, // NT-test-match state for doubleSlash
  }
,
{ // state 1954
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
129,493, // eol
130,1783, // comment
164,1076, // {10}
165,1589, // {13}
MIN_REDUCTION+179, // (default reduction)
  }
,
{ // state 1955
2,1639, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
131,729, // oneLineComment
132,50, // blockComment
133,66, // doubleSlash
136,1210, // slashStar
149,144, // "/"
MIN_REDUCTION+212, // (default reduction)
  }
,
{ // state 1956
91,1692, // "a"
  }
,
{ // state 1957
90,1475, // "l"
110,1383, // "i"
  }
,
{ // state 1958
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
132,50, // blockComment
136,1210, // slashStar
149,1327, // "/"
MIN_REDUCTION+283, // (default reduction)
  }
,
{ // state 1959
MIN_REDUCTION+129, // (default reduction)
  }
,
{ // state 1960
2,1341, // white*
125,2043, // white
126,877, // {12}
127,877, // " "
128,877, // {9}
129,1185, // eol
130,994, // comment
131,1236, // oneLineComment
132,838, // blockComment
133,1248, // doubleSlash
136,798, // slashStar
149,144, // "/"
164,1315, // {10}
165,904, // {13}
179,MIN_REDUCTION+218, // $NT
  }
,
{ // state 1961
0x80000000|1013, // match move
0x80000000|1817, // no-match move
0x80000000|65, // NT-test-match state for doubleSlash
  }
,
{ // state 1962
MIN_REDUCTION+31, // (default reduction)
  }
,
{ // state 1963
179,MIN_REDUCTION+111, // $NT
MIN_REDUCTION+111, // (default reduction)
  }
,
{ // state 1964
0x80000000|1595, // match move
0x80000000|962, // no-match move
0x80000000|65, // NT-test-match state for doubleSlash
  }
,
{ // state 1965
0x80000000|667, // match move
0x80000000|979, // no-match move
0x80000000|1594, // NT-test-match state for reserved
  }
,
{ // state 1966
0x80000000|737, // match move
0x80000000|1183, // no-match move
0x80000000|65, // NT-test-match state for doubleSlash
  }
,
{ // state 1967
121,1529, // "t"
  }
,
{ // state 1968
0x80000000|322, // match move
0x80000000|1255, // no-match move
0x80000000|1636, // NT-test-match state for slashStar
  }
,
{ // state 1969
91,44, // "a"
  }
,
{ // state 1970
0x80000000|1370, // match move
0x80000000|1784, // no-match move
0x80000000|1594, // NT-test-match state for reserved
  }
,
{ // state 1971
0x80000000|1708, // match move
0x80000000|246, // no-match move
0x80000000|65, // NT-test-match state for doubleSlash
  }
,
{ // state 1972
125,808, // white
126,877, // {12}
127,877, // " "
128,877, // {9}
129,1185, // eol
130,994, // comment
131,1236, // oneLineComment
132,838, // blockComment
133,1248, // doubleSlash
136,798, // slashStar
149,144, // "/"
164,1315, // {10}
165,904, // {13}
179,MIN_REDUCTION+283, // $NT
  }
,
{ // state 1973
95,622, // "e"
  }
,
{ // state 1974
0x80000000|1, // match move
0x80000000|552, // no-match move
0x80000000|67, // NT-test-match state for idChar
  }
,
{ // state 1975
0x80000000|1298, // match move
0x80000000|1049, // no-match move
0x80000000|1636, // NT-test-match state for slashStar
  }
,
{ // state 1976
2,390, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
131,729, // oneLineComment
132,50, // blockComment
133,66, // doubleSlash
136,1210, // slashStar
149,144, // "/"
MIN_REDUCTION+100, // (default reduction)
  }
,
{ // state 1977
0x80000000|1, // match move
0x80000000|950, // no-match move
0x80000000|67, // NT-test-match state for idChar
  }
,
{ // state 1978
MIN_REDUCTION+238, // (default reduction)
  }
,
{ // state 1979
0x80000000|1353, // match move
0x80000000|695, // no-match move
0x80000000|1594, // NT-test-match state for reserved
  }
,
{ // state 1980
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
132,50, // blockComment
136,1210, // slashStar
149,1327, // "/"
MIN_REDUCTION+175, // (default reduction)
  }
,
{ // state 1981
95,1852, // "e"
  }
,
{ // state 1982
0x80000000|1891, // match move
0x80000000|51, // no-match move
0x80000000|1594, // NT-test-match state for reserved
  }
,
{ // state 1983
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
131,729, // oneLineComment
132,50, // blockComment
133,66, // doubleSlash
136,1210, // slashStar
149,144, // "/"
MIN_REDUCTION+274, // (default reduction)
  }
,
{ // state 1984
2,1547, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
129,493, // eol
130,1783, // comment
164,1076, // {10}
165,1589, // {13}
MIN_REDUCTION+227, // (default reduction)
  }
,
{ // state 1985
0x80000000|1400, // match move
0x80000000|1669, // no-match move
0x80000000|1594, // NT-test-match state for reserved
  }
,
{ // state 1986
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
132,50, // blockComment
136,1210, // slashStar
149,1327, // "/"
MIN_REDUCTION+196, // (default reduction)
  }
,
{ // state 1987
0x80000000|1732, // match move
0x80000000|858, // no-match move
0x80000000|1636, // NT-test-match state for slashStar
  }
,
{ // state 1988
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
129,493, // eol
130,1783, // comment
164,1076, // {10}
165,1589, // {13}
MIN_REDUCTION+244, // (default reduction)
  }
,
{ // state 1989
0x80000000|859, // match move
0x80000000|7, // no-match move
0x80000000|65, // NT-test-match state for doubleSlash
  }
,
{ // state 1990
2,483, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
132,50, // blockComment
136,1210, // slashStar
149,1327, // "/"
MIN_REDUCTION+323, // (default reduction)
  }
,
{ // state 1991
MIN_REDUCTION+157, // (default reduction)
  }
,
{ // state 1992
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 1993
119,271, // "k"
  }
,
{ // state 1994
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
132,50, // blockComment
136,1210, // slashStar
149,1327, // "/"
MIN_REDUCTION+259, // (default reduction)
  }
,
{ // state 1995
0x80000000|1224, // match move
0x80000000|592, // no-match move
0x80000000|65, // NT-test-match state for doubleSlash
  }
,
{ // state 1996
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
131,729, // oneLineComment
132,50, // blockComment
133,66, // doubleSlash
136,1210, // slashStar
149,144, // "/"
MIN_REDUCTION+149, // (default reduction)
  }
,
{ // state 1997
179,MIN_REDUCTION+101, // $NT
  }
,
{ // state 1998
121,1089, // "t"
  }
,
{ // state 1999
0x80000000|1365, // match move
0x80000000|1382, // no-match move
0x80000000|1636, // NT-test-match state for slashStar
  }
,
{ // state 2000
MIN_REDUCTION+316, // (default reduction)
  }
,
{ // state 2001
0x80000000|1782, // match move
0x80000000|1040, // no-match move
0x80000000|1636, // NT-test-match state for slashStar
  }
,
{ // state 2002
MIN_REDUCTION+14, // (default reduction)
  }
,
{ // state 2003
0x80000000|1, // match move
0x80000000|1995, // no-match move
0x80000000|67, // NT-test-match state for idChar
  }
,
{ // state 2004
0x80000000|910, // match move
0x80000000|1167, // no-match move
0x80000000|65, // NT-test-match state for doubleSlash
  }
,
{ // state 2005
2,1936, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
129,493, // eol
130,1783, // comment
164,1076, // {10}
165,1589, // {13}
MIN_REDUCTION+272, // (default reduction)
  }
,
{ // state 2006
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
129,493, // eol
130,1783, // comment
164,1076, // {10}
165,1589, // {13}
MIN_REDUCTION+256, // (default reduction)
  }
,
{ // state 2007
179,MIN_REDUCTION+243, // $NT
  }
,
{ // state 2008
2,219, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
131,729, // oneLineComment
132,50, // blockComment
133,66, // doubleSlash
136,1210, // slashStar
149,144, // "/"
MIN_REDUCTION+172, // (default reduction)
  }
,
{ // state 2009
0x80000000|1, // match move
0x80000000|1961, // no-match move
0x80000000|67, // NT-test-match state for idChar
  }
,
{ // state 2010
0x80000000|1, // match move
0x80000000|30, // no-match move
0x80000000|67, // NT-test-match state for idChar
  }
,
{ // state 2011
0x80000000|218, // match move
0x80000000|343, // no-match move
0x80000000|1636, // NT-test-match state for slashStar
  }
,
{ // state 2012
112,98, // "o"
  }
,
{ // state 2013
0x80000000|1155, // match move
0x80000000|734, // no-match move
0x80000000|65, // NT-test-match state for doubleSlash
  }
,
{ // state 2014
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
132,50, // blockComment
136,1210, // slashStar
149,1327, // "/"
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 2015
MIN_REDUCTION+33, // (default reduction)
  }
,
{ // state 2016
0x80000000|1, // match move
0x80000000|1046, // no-match move
0x80000000|67, // NT-test-match state for idChar
  }
,
{ // state 2017
0x80000000|1, // match move
0x80000000|1024, // no-match move
0x80000000|67, // NT-test-match state for idChar
  }
,
{ // state 2018
179,MIN_REDUCTION+228, // $NT
  }
,
{ // state 2019
2,1427, // white*
125,2043, // white
126,877, // {12}
127,877, // " "
128,877, // {9}
129,1185, // eol
130,994, // comment
131,1236, // oneLineComment
132,838, // blockComment
133,1248, // doubleSlash
136,798, // slashStar
149,144, // "/"
164,1315, // {10}
165,904, // {13}
179,MIN_REDUCTION+242, // $NT
  }
,
{ // state 2020
110,1574, // "i"
  }
,
{ // state 2021
0x80000000|176, // match move
0x80000000|1245, // no-match move
0x80000000|1594, // NT-test-match state for reserved
  }
,
{ // state 2022
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
131,729, // oneLineComment
132,50, // blockComment
133,66, // doubleSlash
136,1210, // slashStar
149,144, // "/"
MIN_REDUCTION+289, // (default reduction)
  }
,
{ // state 2023
2,603, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
131,729, // oneLineComment
132,50, // blockComment
133,66, // doubleSlash
136,1210, // slashStar
149,144, // "/"
MIN_REDUCTION+215, // (default reduction)
  }
,
{ // state 2024
91,1322, // "a"
  }
,
{ // state 2025
89,1625, // "c"
90,1625, // "l"
91,1625, // "a"
92,1625, // "s"
95,1625, // "e"
96,1014, // "!"
97,1959, // "="
98,1959, // "+"
102,1625, // "_"
103,1625, // "d"
104,1625, // "g"
105,1625, // "m"
106,1625, // "p"
107,1625, // "v"
108,1625, // "y"
109,1625, // "f"
110,1625, // "i"
111,1959, // {"A".."Z"}
112,1625, // "o"
113,1625, // "r"
114,1625, // "u"
115,1625, // "x"
116,1625, // {"j" "q"}
117,1625, // "b"
118,1625, // "h"
119,1625, // "k"
120,1625, // "n"
121,1625, // "t"
122,1625, // "w"
123,1625, // "z"
124,1959, // {"0".."9"}
127,1014, // " "
140,1959, // "["
141,1959, // "-"
142,1959, // "<"
143,1625, // "|"
144,1959, // {"?".."@"}
145,1014, // "&"
146,1959, // ")"
147,1959, // ","
148,1625, // "]"
149,1959, // "/"
150,1014, // {"#".."$"}
151,1959, // ";"
152,1959, // ">"
153,1625, // "{"
154,1014, // "%"
155,1959, // "("
157,1959, // "."
158,1959, // ":"
159,1625, // "}"
160,1625, // {"^" "`" "~"}
162,1014, // '"'
163,1959, // "*"
167,385, // charPrintable
  }
,
{ // state 2026
108,460, // "y"
  }
,
{ // state 2027
0x80000000|1, // match move
0x80000000|1053, // no-match move
0x80000000|67, // NT-test-match state for idChar
  }
,
{ // state 2028
0x80000000|2037, // match move
0x80000000|972, // no-match move
0x80000000|1636, // NT-test-match state for slashStar
  }
,
{ // state 2029
2,1918, // white*
125,2043, // white
126,877, // {12}
127,877, // " "
128,877, // {9}
129,1185, // eol
130,994, // comment
131,1236, // oneLineComment
132,838, // blockComment
133,1248, // doubleSlash
136,798, // slashStar
149,144, // "/"
164,1315, // {10}
165,904, // {13}
179,MIN_REDUCTION+245, // $NT
  }
,
{ // state 2030
MIN_REDUCTION+143, // (default reduction)
  }
,
{ // state 2031
MIN_REDUCTION+353, // (default reduction)
  }
,
{ // state 2032
95,952, // "e"
  }
,
{ // state 2033
MIN_REDUCTION+22, // (default reduction)
  }
,
{ // state 2034
145,861, // "&"
  }
,
{ // state 2035
91,338, // "a"
113,2020, // "r"
  }
,
{ // state 2036
0x80000000|1921, // match move
0x80000000|1191, // no-match move
0x80000000|65, // NT-test-match state for doubleSlash
  }
,
{ // state 2037
125,1641, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
132,50, // blockComment
136,1210, // slashStar
149,1327, // "/"
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 2038
2,1966, // white*
125,714, // white
126,1992, // {12}
127,1992, // " "
128,1992, // {9}
130,1783, // comment
132,50, // blockComment
136,1210, // slashStar
149,1327, // "/"
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 2039
MIN_REDUCTION+74, // (default reduction)
  }
,
{ // state 2040
MIN_REDUCTION+161, // (default reduction)
  }
,
{ // state 2041
0x80000000|162, // match move
0x80000000|481, // no-match move
0x80000000|1636, // NT-test-match state for slashStar
  }
,
{ // state 2042
0x80000000|1216, // match move
0x80000000|273, // no-match move
0x80000000|1636, // NT-test-match state for slashStar
  }
,
{ // state 2043
179,MIN_REDUCTION+348, // $NT
MIN_REDUCTION+348, // (default reduction)
  }
,
};
}
public TokenGrammarParseTable(TokenGrammar actionObj) {
  actionObject = actionObj;
  parseTable = new int[2044][];
  int doneSoFar = 0;
  doneSoFar += new Initter1().doInit(doneSoFar);
  doneSoFar += new Initter2().doInit(doneSoFar);
  doneSoFar += new Initter3().doInit(doneSoFar);
  doneSoFar += new Initter4().doInit(doneSoFar);
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
// INT_LITERAL ::= digit++ white*
(86<<16)+2,
// INT_LITERAL ::= digit++
(86<<16)+1,
// idChar ::= letter
(93<<16)+1,
// idChar ::= digit
(93<<16)+1,
// idChar ::= "_"
(93<<16)+1,
// letter ::= {"A".."Z" "a".."z"}
(100<<16)+1,
// digit ::= {"0".."9"}
(101<<16)+1,
// white ::= {9 12 " "}
(125<<16)+1,
// white ::= eol
(125<<16)+1,
// white ::= comment
(125<<16)+1,
// comment ::= oneLineComment
(130<<16)+1,
// comment ::= blockComment
(130<<16)+1,
// oneLineComment ::= doubleSlash printable** eol
(131<<16)+3,
// oneLineComment ::= doubleSlash !printable eol
(131<<16)+2,
// blockComment ::= slashStar blockCommentContent* starSlash
(132<<16)+3,
// blockComment ::= slashStar starSlash
(132<<16)+2,
// blockCommentContent ::= {9 " "..")" "+".."~"}
(139<<16)+1,
// blockCommentContent ::= "*" !"/"
(139<<16)+1,
// blockCommentContent ::= eol
(139<<16)+1,
// slashStar ::= "/" "*"
(136<<16)+2,
// starSlash ::= "*" "/"
(138<<16)+2,
// doubleSlash ::= "/" "/"
(133<<16)+2,
// eol ::= {10}
(129<<16)+1,
// eol ::= {13} {10}
(129<<16)+2,
// eol ::= {13} !10
(129<<16)+1,
// printable ::= {" ".."~"}
(135<<16)+1,
// stringPrintable ::= {" ".."!"}
(166<<16)+1,
// stringPrintable ::= {"#".."["}
(166<<16)+1,
// stringPrintable ::= {"]".."~"}
(166<<16)+1,
// charPrintable ::= {" ".."&"}
(167<<16)+1,
// charPrintable ::= {"(".."["}
(167<<16)+1,
// charPrintable ::= {"]".."~"}
(167<<16)+1,
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
// `/ ::= !doubleSlash !slashStar "/" !{"*" "/"} white*
(83<<16)+2,
// `/ ::= !doubleSlash !slashStar "/" !{"*" "/"}
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
// token* ::= token* token
(173<<16)+2,
// token* ::= token
(173<<16)+1,
// printable** ::= printable* !printable
(134<<16)+1,
// digit++ ::= digit+ !digit
(99<<16)+1,
// idChar** ::= idChar* !idChar
(169<<16)+1,
// white* ::= white* white
(2<<16)+2,
// white* ::= white
(2<<16)+1,
// blockCommentContent* ::= blockCommentContent* blockCommentContent
(137<<16)+2,
// blockCommentContent* ::= blockCommentContent
(137<<16)+1,
// stringPrintable* ::= stringPrintable* stringPrintable
(171<<16)+2,
// stringPrintable* ::= stringPrintable
(171<<16)+1,
// letter++ ::= letter+ !letter
(168<<16)+1,
// digit+ ::= digit
(175<<16)+1,
// digit+ ::= digit+ digit
(175<<16)+2,
// letter+ ::= letter
(177<<16)+1,
// letter+ ::= letter+ letter
(177<<16)+2,
// printable* ::= printable* printable
(174<<16)+2,
// printable* ::= printable
(174<<16)+1,
// idChar* ::= idChar* idChar
(176<<16)+2,
// idChar* ::= idChar
(176<<16)+1,
// $$0 ::= token*
(3<<16)+1,
// $$1 ::= white*
(170<<16)+1,
// $$2 ::= '"' white*
(172<<16)+2,
// $$2 ::= '"'
(172<<16)+1,
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
128, // 9
164, // 10
-1, // 11
126, // 12
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
127, // " "
96, // "!"
162, // '"'
150, // "#"
150, // "$"
154, // "%"
145, // "&"
161, // "'"
155, // "("
146, // ")"
163, // "*"
98, // "+"
147, // ","
141, // "-"
157, // "."
149, // "/"
124, // "0"
124, // "1"
124, // "2"
124, // "3"
124, // "4"
124, // "5"
124, // "6"
124, // "7"
124, // "8"
124, // "9"
158, // ":"
151, // ";"
142, // "<"
97, // "="
152, // ">"
144, // "?"
144, // "@"
111, // "A"
111, // "B"
111, // "C"
111, // "D"
111, // "E"
111, // "F"
111, // "G"
111, // "H"
111, // "I"
111, // "J"
111, // "K"
111, // "L"
111, // "M"
111, // "N"
111, // "O"
111, // "P"
111, // "Q"
111, // "R"
111, // "S"
111, // "T"
111, // "U"
111, // "V"
111, // "W"
111, // "X"
111, // "Y"
111, // "Z"
140, // "["
156, // "\"
148, // "]"
160, // "^"
102, // "_"
160, // "`"
91, // "a"
117, // "b"
89, // "c"
103, // "d"
95, // "e"
109, // "f"
104, // "g"
118, // "h"
110, // "i"
116, // "j"
119, // "k"
90, // "l"
105, // "m"
120, // "n"
112, // "o"
106, // "p"
116, // "q"
113, // "r"
92, // "s"
121, // "t"
114, // "u"
107, // "v"
122, // "w"
115, // "x"
108, // "y"
123, // "z"
153, // "{"
143, // "|"
159, // "}"
160, // "~"
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
"token* ::= token* token", // 342
"token* ::= token* token", // 343
"printable** ::= printable* !printable", // 344
"digit++ ::= digit+ !digit", // 345
"idChar** ::= idChar* !idChar", // 346
"white* ::= white* white", // 347
"white* ::= white* white", // 348
"blockCommentContent* ::= blockCommentContent* blockCommentContent", // 349
"blockCommentContent* ::= blockCommentContent* blockCommentContent", // 350
"stringPrintable* ::= stringPrintable* stringPrintable", // 351
"stringPrintable* ::= stringPrintable* stringPrintable", // 352
"letter++ ::= letter+ !letter", // 353
"digit+ ::= digit", // 354
"digit+ ::= digit+ digit", // 355
"letter+ ::= letter", // 356
"letter+ ::= letter+ letter", // 357
"printable* ::= printable* printable", // 358
"printable* ::= printable* printable", // 359
"idChar* ::= idChar* idChar", // 360
"idChar* ::= idChar* idChar", // 361
"", // 362
"", // 363
"", // 364
"", // 365
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
    { // 99: INT_LITERAL ::= [#] digit++ white* @convertToInt(int,List<Character>)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((84<<5)|0x5)/*methodCall:84*/,
    },
    { // 100: INT_LITERAL ::= [#] digit++ [white*] @convertToInt(int,List<Character>)=>int
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((84<<5)|0x5)/*methodCall:84*/,
    },
    { // 101: idChar ::= letter @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 102: idChar ::= digit @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 103: idChar ::= "_" @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 104: letter ::= {"A".."Z" "a".."z"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 105: digit ::= {"0".."9"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 106: white ::= {9 12 " "} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 107: white ::= eol @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 108: white ::= comment @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 109: comment ::= oneLineComment @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 110: comment ::= blockComment @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 111: oneLineComment ::= doubleSlash printable** eol @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((2<<5)|0x0)/*popToPushBack:2*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 112: oneLineComment ::= doubleSlash !printable [printable**] eol @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((0<<5)|0x6)/*nullProductionAction:0*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((2<<5)|0x0)/*popToPushBack:2*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 113: blockComment ::= slashStar blockCommentContent* starSlash @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((2<<5)|0x0)/*popToPushBack:2*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((2<<5)|0x0)/*popToPushBack:2*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 114: blockComment ::= slashStar [blockCommentContent*] starSlash @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((2<<5)|0x0)/*popToPushBack:2*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((2<<5)|0x0)/*popToPushBack:2*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 115: blockCommentContent ::= {9 " "..")" "+".."~"} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 116: blockCommentContent ::= "*" !"/" @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 117: blockCommentContent ::= eol @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 118: slashStar ::= "/" "*" @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 119: starSlash ::= "*" "/" @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 120: doubleSlash ::= "/" "/" @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 121: eol ::= {10} [registerNewline] @void
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 122: eol ::= {13} {10} [registerNewline] @void
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 123: eol ::= {13} !10 [registerNewline] @void
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 124: printable ::= {" ".."~"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 125: stringPrintable ::= {" ".."!"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 126: stringPrintable ::= {"#".."["} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 127: stringPrintable ::= {"]".."~"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 128: charPrintable ::= {" ".."&"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 129: charPrintable ::= {"(".."["} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 130: charPrintable ::= {"]".."~"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 131: `! ::= "!" !"=" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 132: `! ::= "!" !"=" [white*] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 133: `% ::= "%" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 134: `% ::= "%" [white*] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 135: `&& ::= "&" "&" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 136: `&& ::= "&" "&" [white*] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 137: `* ::= "*" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 138: `* ::= "*" [white*] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 139: `( ::= "(" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 140: `( ::= "(" [white*] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 141: `) ::= ")" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 142: `) ::= ")" [white*] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 143: `{ ::= "{" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 144: `{ ::= "{" [white*] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 145: `} ::= "}" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 146: `} ::= "}" [white*] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 147: `- ::= "-" !"-" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 148: `- ::= "-" !"-" [white*] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 149: `= ::= "=" !"=" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 150: `= ::= "=" !"=" [white*] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 151: `== ::= "=" "=" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 152: `== ::= "=" "=" [white*] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 153: `[ ::= "[" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 154: `[ ::= "[" [white*] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 155: `] ::= "]" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 156: `] ::= "]" [white*] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 157: `|| ::= "|" "|" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 158: `|| ::= "|" "|" [white*] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 159: `< ::= "<" !"=" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 160: `< ::= "<" !"=" [white*] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 161: `<= ::= "<" "=" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 162: `<= ::= "<" "=" [white*] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 163: `, ::= "," white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 164: `, ::= "," [white*] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 165: `> ::= ">" !"=" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 166: `> ::= ">" !"=" [white*] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 167: `>= ::= ">" "=" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 168: `>= ::= ">" "=" [white*] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 169: `: ::= ":" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 170: `: ::= ":" [white*] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 171: `. ::= "." white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 172: `. ::= "." [white*] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 173: `; ::= ";" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 174: `; ::= ";" [white*] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 175: `++ ::= "+" "+" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 176: `++ ::= "+" "+" [white*] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 177: `-- ::= "-" "-" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 178: `-- ::= "-" "-" [white*] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 179: `/ ::= !doubleSlash !slashStar "/" !{"*" "/"} white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 180: `/ ::= !doubleSlash !slashStar "/" !{"*" "/"} [white*] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 181: `boolean ::= "b" "o" "o" "l" "e" "a" "n" !idChar white* @void
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
    { // 182: `boolean ::= "b" "o" "o" "l" "e" "a" "n" !idChar [white*] @void
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
    { // 183: reserved ::= `boolean @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 184: `extends ::= "e" "x" "t" "e" "n" "d" "s" !idChar white* @void
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
    { // 185: `extends ::= "e" "x" "t" "e" "n" "d" "s" !idChar [white*] @void
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
    { // 186: reserved ::= `extends @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 187: `void ::= "v" "o" "i" "d" !idChar white* @void
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
    { // 188: `void ::= "v" "o" "i" "d" !idChar [white*] @void
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
    { // 189: reserved ::= `void @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 190: `int ::= "i" "n" "t" !idChar white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 191: `int ::= "i" "n" "t" !idChar [white*] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 192: reserved ::= `int @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 193: `while ::= "w" "h" "i" "l" "e" !idChar white* @void
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
    { // 194: `while ::= "w" "h" "i" "l" "e" !idChar [white*] @void
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
    { // 195: reserved ::= `while @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 196: `if ::= "i" "f" !idChar white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 197: `if ::= "i" "f" !idChar [white*] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 198: reserved ::= `if @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 199: `for ::= "f" "o" "r" !idChar white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 200: `for ::= "f" "o" "r" !idChar [white*] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 201: reserved ::= `for @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 202: `break ::= "b" "r" "e" "a" "k" !idChar white* @void
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
    { // 203: `break ::= "b" "r" "e" "a" "k" !idChar [white*] @void
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
    { // 204: reserved ::= `break @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 205: `this ::= "t" "h" "i" "s" !idChar white* @void
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
    { // 206: `this ::= "t" "h" "i" "s" !idChar [white*] @void
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
    { // 207: reserved ::= `this @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 208: `false ::= "f" "a" "l" "s" "e" !idChar white* @void
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
    { // 209: `false ::= "f" "a" "l" "s" "e" !idChar [white*] @void
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
    { // 210: reserved ::= `false @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 211: `true ::= "t" "r" "u" "e" !idChar white* @void
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
    { // 212: `true ::= "t" "r" "u" "e" !idChar [white*] @void
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
    { // 213: reserved ::= `true @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 214: `super ::= "s" "u" "p" "e" "r" !idChar white* @void
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
    { // 215: `super ::= "s" "u" "p" "e" "r" !idChar [white*] @void
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
    { // 216: reserved ::= `super @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 217: `null ::= "n" "u" "l" "l" !idChar white* @void
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
    { // 218: `null ::= "n" "u" "l" "l" !idChar [white*] @void
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
    { // 219: reserved ::= `null @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 220: `return ::= "r" "e" "t" "u" "r" "n" !idChar white* @void
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
    { // 221: `return ::= "r" "e" "t" "u" "r" "n" !idChar [white*] @void
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
    { // 222: reserved ::= `return @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 223: `instanceof ::= "i" "n" "s" "t" "a" "n" "c" "e" "o" "f" !idChar white* @void
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
    { // 224: `instanceof ::= "i" "n" "s" "t" "a" "n" "c" "e" "o" "f" !idChar [white*] @void
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
    { // 225: reserved ::= `instanceof @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 226: `new ::= "n" "e" "w" !idChar white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 227: `new ::= "n" "e" "w" !idChar [white*] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 228: reserved ::= `new @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 229: `abstract ::= "a" "b" "s" "t" "r" "a" "c" "t" !idChar white* @void
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
    { // 230: `abstract ::= "a" "b" "s" "t" "r" "a" "c" "t" !idChar [white*] @void
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
    { // 231: reserved ::= `abstract @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 232: `assert ::= "a" "s" "s" "e" "r" "t" !idChar white* @void
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
    { // 233: `assert ::= "a" "s" "s" "e" "r" "t" !idChar [white*] @void
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
    { // 234: reserved ::= `assert @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 235: `byte ::= "b" "y" "t" "e" !idChar white* @void
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
    { // 236: `byte ::= "b" "y" "t" "e" !idChar [white*] @void
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
    { // 237: reserved ::= `byte @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 238: `case ::= "c" "a" "s" "e" !idChar white* @void
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
    { // 239: `case ::= "c" "a" "s" "e" !idChar [white*] @void
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
    { // 240: reserved ::= `case @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 241: `catch ::= "c" "a" "t" "c" "h" !idChar white* @void
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
    { // 242: `catch ::= "c" "a" "t" "c" "h" !idChar [white*] @void
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
    { // 243: reserved ::= `catch @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 244: `char ::= "c" "h" "a" "r" !idChar white* @void
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
    { // 245: `char ::= "c" "h" "a" "r" !idChar [white*] @void
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
    { // 246: reserved ::= `char @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 247: `const ::= "c" "o" "n" "s" "t" !idChar white* @void
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
    { // 248: `const ::= "c" "o" "n" "s" "t" !idChar [white*] @void
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
    { // 249: reserved ::= `const @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 250: `continue ::= "c" "o" "n" "t" "i" "n" "u" "e" !idChar white* @void
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
    { // 251: `continue ::= "c" "o" "n" "t" "i" "n" "u" "e" !idChar [white*] @void
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
    { // 252: reserved ::= `continue @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 253: `default ::= "d" "e" "f" "a" "u" "l" "t" !idChar white* @void
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
    { // 254: `default ::= "d" "e" "f" "a" "u" "l" "t" !idChar [white*] @void
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
    { // 255: reserved ::= `default @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 256: `do ::= "d" "o" !idChar white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 257: `do ::= "d" "o" !idChar [white*] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 258: reserved ::= `do @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 259: `double ::= "d" "o" "u" "b" "l" "e" !idChar white* @void
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
    { // 260: `double ::= "d" "o" "u" "b" "l" "e" !idChar [white*] @void
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
    { // 261: reserved ::= `double @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 262: `enum ::= "e" "n" "u" "m" !idChar white* @void
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
    { // 263: `enum ::= "e" "n" "u" "m" !idChar [white*] @void
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
    { // 264: reserved ::= `enum @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 265: `final ::= "f" "i" "n" "a" "l" !idChar white* @void
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
    { // 266: `final ::= "f" "i" "n" "a" "l" !idChar [white*] @void
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
    { // 267: reserved ::= `final @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 268: `finally ::= "f" "i" "n" "a" "l" "l" "y" !idChar white* @void
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
    { // 269: `finally ::= "f" "i" "n" "a" "l" "l" "y" !idChar [white*] @void
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
    { // 270: reserved ::= `finally @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 271: `float ::= "f" "l" "o" "a" "t" !idChar white* @void
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
    { // 272: `float ::= "f" "l" "o" "a" "t" !idChar [white*] @void
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
    { // 273: reserved ::= `float @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 274: `goto ::= "g" "o" "t" "o" !idChar white* @void
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
    { // 275: `goto ::= "g" "o" "t" "o" !idChar [white*] @void
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
    { // 276: reserved ::= `goto @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 277: `implements ::= "i" "m" "p" "l" "e" "m" "e" "n" "t" "s" !idChar white* @void
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
    { // 278: `implements ::= "i" "m" "p" "l" "e" "m" "e" "n" "t" "s" !idChar [white*] @void
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
    { // 279: reserved ::= `implements @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 280: `import ::= "i" "m" "p" "o" "r" "t" !idChar white* @void
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
    { // 281: `import ::= "i" "m" "p" "o" "r" "t" !idChar [white*] @void
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
    { // 282: reserved ::= `import @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 283: `interface ::= "i" "n" "t" "e" "r" "f" "a" "c" "e" !idChar white* @void
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
    { // 284: `interface ::= "i" "n" "t" "e" "r" "f" "a" "c" "e" !idChar [white*] @void
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
    { // 285: reserved ::= `interface @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 286: `long ::= "l" "o" "n" "g" !idChar white* @void
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
    { // 287: `long ::= "l" "o" "n" "g" !idChar [white*] @void
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
    { // 288: reserved ::= `long @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 289: `native ::= "n" "a" "t" "i" "v" "e" !idChar white* @void
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
    { // 290: `native ::= "n" "a" "t" "i" "v" "e" !idChar [white*] @void
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
    { // 291: reserved ::= `native @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 292: `package ::= "p" "a" "c" "k" "a" "g" "e" !idChar white* @void
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
    { // 293: `package ::= "p" "a" "c" "k" "a" "g" "e" !idChar [white*] @void
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
    { // 294: reserved ::= `package @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 295: `private ::= "p" "r" "i" "v" "a" "t" "e" !idChar white* @void
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
    { // 296: `private ::= "p" "r" "i" "v" "a" "t" "e" !idChar [white*] @void
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
    { // 297: reserved ::= `private @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 298: `protected ::= "p" "r" "o" "t" "e" "c" "t" "e" "d" !idChar white* @void
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
    { // 299: `protected ::= "p" "r" "o" "t" "e" "c" "t" "e" "d" !idChar [white*] @void
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
    { // 300: reserved ::= `protected @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 301: `public ::= "p" "u" "b" "l" "i" "c" !idChar white* @void
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
    { // 302: `public ::= "p" "u" "b" "l" "i" "c" !idChar [white*] @void
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
    { // 303: reserved ::= `public @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 304: `short ::= "s" "h" "o" "r" "t" !idChar white* @void
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
    { // 305: `short ::= "s" "h" "o" "r" "t" !idChar [white*] @void
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
    { // 306: reserved ::= `short @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 307: `static ::= "s" "t" "a" "t" "i" "c" !idChar white* @void
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
    { // 308: `static ::= "s" "t" "a" "t" "i" "c" !idChar [white*] @void
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
    { // 309: reserved ::= `static @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 310: `strictfp ::= "s" "t" "r" "i" "c" "t" "f" "p" !idChar white* @void
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
    { // 311: `strictfp ::= "s" "t" "r" "i" "c" "t" "f" "p" !idChar [white*] @void
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
    { // 312: reserved ::= `strictfp @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 313: `switch ::= "s" "w" "i" "t" "c" "h" !idChar white* @void
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
    { // 314: `switch ::= "s" "w" "i" "t" "c" "h" !idChar [white*] @void
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
    { // 315: reserved ::= `switch @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 316: `synchronized ::= "s" "y" "n" "c" "h" "r" "o" "n" "i" "z" "e" "d" !idChar white* @void
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
    { // 317: `synchronized ::= "s" "y" "n" "c" "h" "r" "o" "n" "i" "z" "e" "d" !idChar [white*] @void
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
    { // 318: reserved ::= `synchronized @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 319: `throw ::= "t" "h" "r" "o" "w" !idChar white* @void
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
    { // 320: `throw ::= "t" "h" "r" "o" "w" !idChar [white*] @void
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
    { // 321: reserved ::= `throw @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 322: `throws ::= "t" "h" "r" "o" "w" "s" !idChar white* @void
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
    { // 323: `throws ::= "t" "h" "r" "o" "w" "s" !idChar [white*] @void
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
    { // 324: reserved ::= `throws @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 325: `transient ::= "t" "r" "a" "n" "s" "i" "e" "n" "t" !idChar white* @void
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
    { // 326: `transient ::= "t" "r" "a" "n" "s" "i" "e" "n" "t" !idChar [white*] @void
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
    { // 327: reserved ::= `transient @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 328: `try ::= "t" "r" "y" !idChar white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 329: `try ::= "t" "r" "y" !idChar [white*] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 330: reserved ::= `try @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 331: `volatile ::= "v" "o" "l" "a" "t" "i" "l" "e" !idChar white* @void
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
    { // 332: `volatile ::= "v" "o" "l" "a" "t" "i" "l" "e" !idChar [white*] @void
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
    { // 333: reserved ::= `volatile @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 334: ID ::= !reserved letter++ idChar** $$1 @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x4)/*stringConcat:2*/,
    },
    { // 335: ID ::= !reserved letter++ idChar** [white*] @text
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x4)/*stringConcat:2*/,
    },
    { // 336: ID ::= !reserved letter++ !idChar [idChar**] $$1 @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x4)/*stringConcat:2*/,
    },
    { // 337: ID ::= !reserved letter++ !idChar [idChar**] [white*] @text
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x4)/*stringConcat:2*/,
    },
    { // 338: STRING_LITERAL ::= '"' stringPrintable* $$2 @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x4)/*stringConcat:3*/,
    },
    { // 339: STRING_LITERAL ::= '"' [stringPrintable*] $$2 @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x4)/*stringConcat:3*/,
    },
    { // 340: CHAR_LITERAL ::= [#] "'" charPrintable "'" white* @return0(int,char,char,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((85<<5)|0x5)/*methodCall:85*/,
    },
    { // 341: CHAR_LITERAL ::= [#] "'" charPrintable "'" [white*] @return0(int,char,char,char)=>int
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((85<<5)|0x5)/*methodCall:85*/,
    },
    { // 342: token* ::= token* token @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 343: token* ::= [token*] token @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((5<<5)|0x6)/*nullProductionAction:5*/,
    },
    { // 344: printable** ::= printable* !printable @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 345: digit++ ::= digit+ !digit @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 346: idChar** ::= idChar* !idChar @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 347: white* ::= white* white @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 348: white* ::= [white*] white @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
    },
    { // 349: blockCommentContent* ::= blockCommentContent* blockCommentContent @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 350: blockCommentContent* ::= [blockCommentContent*] blockCommentContent @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
    },
    { // 351: stringPrintable* ::= stringPrintable* stringPrintable @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 352: stringPrintable* ::= [stringPrintable*] stringPrintable @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 353: letter++ ::= letter+ !letter @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 354: digit+ ::= digit @singleList
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xa)/*singleList:1*/,
    },
    { // 355: digit+ ::= digit+ digit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 356: letter+ ::= letter @singleList
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xa)/*singleList:1*/,
    },
    { // 357: letter+ ::= letter+ letter @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 358: printable* ::= printable* printable @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 359: printable* ::= [printable*] printable @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 360: idChar* ::= idChar* idChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 361: idChar* ::= [idChar*] idChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 362: $$0 ::= token* @pass
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 363: $$1 ::= white* @pass
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 364: $$2 ::= '"' white* @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 365: $$2 ::= '"' [white*] @pass
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
      ((86<<5)|0x5)/*methodCall:86*/,
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
      char parm2 = (Character)si.popPb();
      char parm3 = (Character)si.popPb();
      int result = actionObject.return0(parm0,parm1,parm2,parm3);
      si.pushPb(result);
    }
    break;
    case 86: {
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
"int return0(int,char,char,char)",
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
4,1,
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
    1,
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
    -1,
    0,
    -1,
    -1,
    -1,
    0,
    0,
    0,
    0,
    2,
    1,
    1,
    2,
    0,
    2,
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
    -1,
    -1,
    1,
    1,
    1,
    1,
    0,
    1,
    1,
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
