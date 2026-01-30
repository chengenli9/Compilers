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
public int getEofSym() { return 177; }
public int getNttSym() { return 178; }
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
"10",
"13",
"printable",
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
"stringPrintable",
"charPrintable",
"oneLineComment",
"blockComment",
"doubleSlash",
"printable*",
"slashStar",
"blockCommentContent*",
"starSlash",
"blockCommentContent",
"letter++",
"idChar**",
"$$1",
"stringPrintable*",
"$$2",
"token*",
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
public int numSymbols() { return 179;}
private static final int MIN_REDUCTION = 2026;
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
0x80000000|785, // match move
0x80000000|1172, // no-match move
0x80000000|63, // NT-test-match state for doubleSlash
  }
,
{ // state 1
  }
,
{ // state 2
114,1766, // "u"
  }
,
{ // state 3
114,747, // "u"
  }
,
{ // state 4
0x80000000|1632, // match move
0x80000000|301, // no-match move
0x80000000|63, // NT-test-match state for doubleSlash
  }
,
{ // state 5
0x80000000|1, // match move
0x80000000|933, // no-match move
0x80000000|64, // NT-test-match state for idChar
  }
,
{ // state 6
MIN_REDUCTION+2, // (default reduction)
  }
,
{ // state 7
0x80000000|1432, // match move
0x80000000|756, // no-match move
0x80000000|1622, // NT-test-match state for slashStar
  }
,
{ // state 8
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
129,482, // eol
130,1769, // comment
131,1062, // {10}
132,1577, // {13}
MIN_REDUCTION+274, // (default reduction)
  }
,
{ // state 9
92,1336, // "s"
  }
,
{ // state 10
178,MIN_REDUCTION+309, // $NT
  }
,
{ // state 11
110,823, // "i"
  }
,
{ // state 12
0x80000000|1709, // match move
0x80000000|1742, // no-match move
0x80000000|1581, // NT-test-match state for reserved
  }
,
{ // state 13
113,617, // "r"
  }
,
{ // state 14
121,1757, // "t"
  }
,
{ // state 15
2,1722, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
129,482, // eol
130,1769, // comment
131,1062, // {10}
132,1577, // {13}
MIN_REDUCTION+260, // (default reduction)
  }
,
{ // state 16
0x80000000|1, // match move
0x80000000|394, // no-match move
0x80000000|64, // NT-test-match state for idChar
  }
,
{ // state 17
0x80000000|635, // match move
0x80000000|26, // no-match move
0x80000000|1622, // NT-test-match state for slashStar
  }
,
{ // state 18
0x80000000|372, // match move
0x80000000|450, // no-match move
0x80000000|1622, // NT-test-match state for slashStar
  }
,
{ // state 19
MIN_REDUCTION+214, // (default reduction)
  }
,
{ // state 20
2,1270, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1422, // "/"
160,715, // oneLineComment
161,48, // blockComment
162,732, // doubleSlash
164,1194, // slashStar
MIN_REDUCTION+182, // (default reduction)
  }
,
{ // state 21
2,310, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
129,482, // eol
130,1769, // comment
131,1062, // {10}
132,1577, // {13}
MIN_REDUCTION+269, // (default reduction)
  }
,
{ // state 22
2,1910, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1422, // "/"
160,715, // oneLineComment
161,48, // blockComment
162,732, // doubleSlash
164,1194, // slashStar
MIN_REDUCTION+146, // (default reduction)
  }
,
{ // state 23
0x80000000|1578, // match move
0x80000000|235, // no-match move
0x80000000|63, // NT-test-match state for doubleSlash
  }
,
{ // state 24
114,1665, // "u"
  }
,
{ // state 25
MIN_REDUCTION+322, // (default reduction)
  }
,
{ // state 26
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
129,482, // eol
130,1769, // comment
131,1062, // {10}
132,1577, // {13}
MIN_REDUCTION+241, // (default reduction)
  }
,
{ // state 27
0x80000000|871, // match move
0x80000000|1988, // no-match move
0x80000000|1622, // NT-test-match state for slashStar
  }
,
{ // state 28
2,1620, // white*
170,1827, // $$1
MIN_REDUCTION+335, // (default reduction)
  }
,
{ // state 29
0x80000000|210, // match move
0x80000000|794, // no-match move
0x80000000|63, // NT-test-match state for doubleSlash
  }
,
{ // state 30
0x80000000|1, // match move
0x80000000|327, // no-match move
0x80000000|64, // NT-test-match state for idChar
  }
,
{ // state 31
MIN_REDUCTION+79, // (default reduction)
  }
,
{ // state 32
91,1601, // "a"
  }
,
{ // state 33
0x80000000|429, // match move
0x80000000|1073, // no-match move
0x80000000|1622, // NT-test-match state for slashStar
  }
,
{ // state 34
178,MIN_REDUCTION+207, // $NT
  }
,
{ // state 35
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1422, // "/"
160,715, // oneLineComment
161,48, // blockComment
162,732, // doubleSlash
164,1194, // slashStar
MIN_REDUCTION+151, // (default reduction)
  }
,
{ // state 36
0x80000000|1, // match move
0x80000000|1153, // no-match move
0x80000000|64, // NT-test-match state for idChar
  }
,
{ // state 37
178,MIN_REDUCTION+128, // $NT
  }
,
{ // state 38
0x80000000|1146, // match move
0x80000000|72, // no-match move
0x80000000|1581, // NT-test-match state for reserved
  }
,
{ // state 39
0x80000000|574, // match move
0x80000000|808, // no-match move
0x80000000|64, // NT-test-match state for idChar
  }
,
{ // state 40
0x80000000|1032, // match move
0x80000000|1286, // no-match move
0x80000000|63, // NT-test-match state for doubleSlash
  }
,
{ // state 41
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 42
121,771, // "t"
  }
,
{ // state 43
2,799, // white*
MIN_REDUCTION+160, // (default reduction)
  }
,
{ // state 44
178,MIN_REDUCTION+204, // $NT
  }
,
{ // state 45
0x80000000|784, // match move
0x80000000|1738, // no-match move
0x80000000|1622, // NT-test-match state for slashStar
  }
,
{ // state 46
0x80000000|405, // match move
0x80000000|347, // no-match move
0x80000000|1622, // NT-test-match state for slashStar
  }
,
{ // state 47
0x80000000|746, // match move
0x80000000|1832, // no-match move
0x80000000|63, // NT-test-match state for doubleSlash
  }
,
{ // state 48
MIN_REDUCTION+120, // (default reduction)
  }
,
{ // state 49
0x80000000|1882, // match move
0x80000000|349, // no-match move
0x80000000|1622, // NT-test-match state for slashStar
  }
,
{ // state 50
105,705, // "m"
109,1552, // "f"
120,247, // "n"
  }
,
{ // state 51
120,970, // "n"
  }
,
{ // state 52
103,297, // "d"
  }
,
{ // state 53
178,MIN_REDUCTION+291, // $NT
  }
,
{ // state 54
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
129,482, // eol
130,1769, // comment
131,1062, // {10}
132,1577, // {13}
MIN_REDUCTION+223, // (default reduction)
  }
,
{ // state 55
95,647, // "e"
  }
,
{ // state 56
114,1360, // "u"
  }
,
{ // state 57
0x80000000|420, // match move
0x80000000|1565, // no-match move
0x80000000|1622, // NT-test-match state for slashStar
  }
,
{ // state 58
0x80000000|56, // match move
0x80000000|1747, // no-match move
0x80000000|64, // NT-test-match state for idChar
  }
,
{ // state 59
0x80000000|24, // match move
0x80000000|229, // no-match move
0x80000000|64, // NT-test-match state for idChar
  }
,
{ // state 60
2,593, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1309, // "/"
161,48, // blockComment
164,1194, // slashStar
MIN_REDUCTION+215, // (default reduction)
  }
,
{ // state 61
2,23, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1309, // "/"
161,48, // blockComment
164,1194, // slashStar
MIN_REDUCTION+311, // (default reduction)
  }
,
{ // state 62
0x80000000|78, // match move
0x80000000|1726, // no-match move
0x80000000|1622, // NT-test-match state for slashStar
  }
,
{ // state 63
143,1416, // "/"
  }
,
{ // state 64
89,891, // "c"
90,891, // "l"
91,891, // "a"
92,891, // "s"
95,891, // "e"
100,1979, // letter
101,350, // digit
102,240, // "_"
103,891, // "d"
104,891, // "g"
105,891, // "m"
106,891, // "p"
107,891, // "v"
108,891, // "y"
109,891, // "f"
110,891, // "i"
111,891, // {"A".."Z"}
112,891, // "o"
113,891, // "r"
114,891, // "u"
115,891, // "x"
116,891, // {"j" "q"}
117,891, // "b"
118,891, // "h"
119,891, // "k"
120,891, // "n"
121,891, // "t"
122,891, // "w"
123,891, // "z"
124,365, // {"0".."9"}
  }
,
{ // state 65
0x80000000|1005, // match move
0x80000000|840, // no-match move
0x80000000|1581, // NT-test-match state for reserved
  }
,
{ // state 66
113,30, // "r"
  }
,
{ // state 67
0x80000000|623, // match move
0x80000000|954, // no-match move
0x80000000|1581, // NT-test-match state for reserved
  }
,
{ // state 68
2,259, // white*
MIN_REDUCTION+132, // (default reduction)
  }
,
{ // state 69
2,856, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
129,482, // eol
130,1769, // comment
131,1062, // {10}
132,1577, // {13}
MIN_REDUCTION+176, // (default reduction)
  }
,
{ // state 70
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1309, // "/"
161,48, // blockComment
164,1194, // slashStar
MIN_REDUCTION+211, // (default reduction)
  }
,
{ // state 71
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 72
0x80000000|1104, // match move
0x80000000|1670, // no-match move
0x80000000|1622, // NT-test-match state for slashStar
  }
,
{ // state 73
178,MIN_REDUCTION+201, // $NT
  }
,
{ // state 74
0x80000000|419, // match move
0x80000000|1405, // no-match move
0x80000000|1581, // NT-test-match state for reserved
  }
,
{ // state 75
-1, // $$start
-1, // start
-1, // white*
6, // $$0
1056, // token
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
1508, // `!
1692, // `!=
882, // `%
685, // `&&
657, // `*
1835, // `(
1936, // `)
1023, // `{
1027, // `}
1043, // `-
809, // `+
625, // `=
1179, // `==
439, // `[
1452, // `]
396, // `||
2021, // `<
602, // `<=
175, // `,
298, // `>
778, // `>=
31, // `.
968, // `;
938, // `++
417, // `--
1825, // `/
738, // `:
1607, // ID
793, // INT_LITERAL
136, // STRING_LITERAL
1729, // CHAR_LITERAL
653, // "c"
653, // "l"
653, // "a"
653, // "s"
-1, // idChar
-1, // reserved
653, // "e"
1108, // "!"
1889, // "="
404, // "+"
795, // digit++
1688, // letter
1240, // digit
-1, // "_"
653, // "d"
653, // "g"
653, // "m"
653, // "p"
653, // "v"
653, // "y"
653, // "f"
653, // "i"
653, // {"A".."Z"}
653, // "o"
653, // "r"
653, // "u"
653, // "x"
653, // {"j" "q"}
653, // "b"
653, // "h"
653, // "k"
653, // "n"
653, // "t"
653, // "w"
653, // "z"
392, // {"0".."9"}
712, // white
1479, // {12}
1479, // " "
1479, // {9}
1786, // eol
1375, // comment
71, // {10}
1509, // {13}
-1, // printable
1009, // "["
999, // "-"
1173, // "<"
447, // "|"
-1, // {"?".."@"}
2015, // "&"
395, // ")"
1948, // ","
173, // "]"
1229, // "/"
-1, // {"#".."$"}
1310, // ";"
552, // ">"
1278, // "{"
1011, // "%"
458, // "("
-1, // "\"
1391, // "."
1654, // ":"
1823, // "}"
-1, // {"^" "`" "~"}
991, // "'"
661, // '"'
253, // "*"
-1, // stringPrintable
-1, // charPrintable
-1, // oneLineComment
-1, // blockComment
-1, // doubleSlash
-1, // printable*
-1, // slashStar
-1, // blockCommentContent*
-1, // starSlash
-1, // blockCommentContent
1557, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
1599, // token*
594, // digit+
-1, // idChar*
1151, // letter+
MIN_REDUCTION+3, // $
-1, // $NT
  }
,
{ // state 76
0x80000000|1650, // match move
0x80000000|1107, // no-match move
0x80000000|64, // NT-test-match state for idChar
  }
,
{ // state 77
2,1119, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1422, // "/"
160,715, // oneLineComment
161,48, // blockComment
162,732, // doubleSlash
164,1194, // slashStar
MIN_REDUCTION+254, // (default reduction)
  }
,
{ // state 78
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1309, // "/"
161,48, // blockComment
164,1194, // slashStar
MIN_REDUCTION+177, // (default reduction)
  }
,
{ // state 79
178,MIN_REDUCTION+183, // $NT
  }
,
{ // state 80
110,862, // "i"
  }
,
{ // state 81
2,960, // white*
125,2024, // white
126,857, // {12}
127,857, // " "
128,857, // {9}
129,1169, // eol
130,977, // comment
131,1299, // {10}
132,884, // {13}
143,1422, // "/"
160,1218, // oneLineComment
161,821, // blockComment
162,1907, // doubleSlash
164,782, // slashStar
178,MIN_REDUCTION+248, // $NT
  }
,
{ // state 82
113,355, // "r"
  }
,
{ // state 83
110,1809, // "i"
  }
,
{ // state 84
0x80000000|1296, // match move
0x80000000|299, // no-match move
0x80000000|1581, // NT-test-match state for reserved
  }
,
{ // state 85
89,1873, // "c"
90,1873, // "l"
91,1873, // "a"
92,1873, // "s"
93,102, // idChar
95,1873, // "e"
100,1269, // letter
101,399, // digit
102,1307, // "_"
103,1873, // "d"
104,1873, // "g"
105,1873, // "m"
106,1873, // "p"
107,1873, // "v"
108,1873, // "y"
109,1873, // "f"
110,1873, // "i"
111,1873, // {"A".."Z"}
112,1873, // "o"
113,1873, // "r"
114,1873, // "u"
115,1873, // "x"
116,1873, // {"j" "q"}
117,1873, // "b"
118,1873, // "h"
119,1873, // "k"
120,1873, // "n"
121,1873, // "t"
122,1873, // "w"
123,1873, // "z"
124,1130, // {"0".."9"}
  }
,
{ // state 86
0x80000000|1792, // match move
0x80000000|904, // no-match move
0x80000000|1622, // NT-test-match state for slashStar
  }
,
{ // state 87
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1309, // "/"
161,48, // blockComment
164,1194, // slashStar
MIN_REDUCTION+214, // (default reduction)
  }
,
{ // state 88
0x80000000|1, // match move
0x80000000|1052, // no-match move
0x80000000|64, // NT-test-match state for idChar
  }
,
{ // state 89
124,365, // {"0".."9"}
  }
,
{ // state 90
122,511, // "w"
  }
,
{ // state 91
2,1462, // white*
125,2024, // white
126,857, // {12}
127,857, // " "
128,857, // {9}
129,1169, // eol
130,977, // comment
131,1299, // {10}
132,884, // {13}
143,1422, // "/"
160,1218, // oneLineComment
161,821, // blockComment
162,1907, // doubleSlash
164,782, // slashStar
178,MIN_REDUCTION+281, // $NT
  }
,
{ // state 92
0x80000000|1797, // match move
0x80000000|575, // no-match move
0x80000000|1622, // NT-test-match state for slashStar
  }
,
{ // state 93
91,560, // "a"
  }
,
{ // state 94
92,514, // "s"
  }
,
{ // state 95
178,MIN_REDUCTION+303, // $NT
  }
,
{ // state 96
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
129,482, // eol
130,1769, // comment
131,1062, // {10}
132,1577, // {13}
MIN_REDUCTION+325, // (default reduction)
  }
,
{ // state 97
95,520, // "e"
  }
,
{ // state 98
89,305, // "c"
  }
,
{ // state 99
0x80000000|353, // match move
0x80000000|559, // no-match move
0x80000000|63, // NT-test-match state for doubleSlash
  }
,
{ // state 100
120,944, // "n"
  }
,
{ // state 101
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1309, // "/"
161,48, // blockComment
164,1194, // slashStar
MIN_REDUCTION+173, // (default reduction)
  }
,
{ // state 102
0x80000000|900, // match move
0x80000000|1300, // no-match move
0x80000000|64, // NT-test-match state for idChar
  }
,
{ // state 103
2,1620, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1309, // "/"
161,48, // blockComment
164,1194, // slashStar
169,1730, // idChar**
170,1438, // $$1
175,1467, // idChar*
MIN_REDUCTION+337, // (default reduction)
  }
,
{ // state 104
155,1231, // "'"
  }
,
{ // state 105
MIN_REDUCTION+307, // (default reduction)
  }
,
{ // state 106
109,641, // "f"
  }
,
{ // state 107
97,945, // "="
  }
,
{ // state 108
2,201, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1422, // "/"
160,715, // oneLineComment
161,48, // blockComment
162,732, // doubleSlash
164,1194, // slashStar
MIN_REDUCTION+156, // (default reduction)
  }
,
{ // state 109
MIN_REDUCTION+39, // (default reduction)
  }
,
{ // state 110
121,16, // "t"
  }
,
{ // state 111
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1422, // "/"
160,715, // oneLineComment
161,48, // blockComment
162,732, // doubleSlash
164,1194, // slashStar
MIN_REDUCTION+235, // (default reduction)
  }
,
{ // state 112
2,338, // white*
125,2024, // white
126,857, // {12}
127,857, // " "
128,857, // {9}
129,1169, // eol
130,977, // comment
131,1299, // {10}
132,884, // {13}
143,1422, // "/"
160,1218, // oneLineComment
161,821, // blockComment
162,1907, // doubleSlash
164,782, // slashStar
178,MIN_REDUCTION+200, // $NT
  }
,
{ // state 113
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1422, // "/"
160,715, // oneLineComment
161,48, // blockComment
162,732, // doubleSlash
164,1194, // slashStar
MIN_REDUCTION+241, // (default reduction)
  }
,
{ // state 114
2,212, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1422, // "/"
160,715, // oneLineComment
161,48, // blockComment
162,732, // doubleSlash
164,1194, // slashStar
MIN_REDUCTION+188, // (default reduction)
  }
,
{ // state 115
0x80000000|742, // match move
0x80000000|1519, // no-match move
0x80000000|1622, // NT-test-match state for slashStar
  }
,
{ // state 116
0x80000000|1, // match move
0x80000000|853, // no-match move
0x80000000|64, // NT-test-match state for idChar
  }
,
{ // state 117
95,1796, // "e"
  }
,
{ // state 118
2,912, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
129,482, // eol
130,1769, // comment
131,1062, // {10}
132,1577, // {13}
MIN_REDUCTION+364, // (default reduction)
  }
,
{ // state 119
0x80000000|939, // match move
0x80000000|1243, // no-match move
0x80000000|1622, // NT-test-match state for slashStar
  }
,
{ // state 120
0x80000000|1924, // match move
0x80000000|1952, // no-match move
0x80000000|1581, // NT-test-match state for reserved
  }
,
{ // state 121
95,407, // "e"
  }
,
{ // state 122
0x80000000|1314, // match move
0x80000000|728, // no-match move
0x80000000|1581, // NT-test-match state for reserved
  }
,
{ // state 123
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 124
MIN_REDUCTION+217, // (default reduction)
  }
,
{ // state 125
120,637, // "n"
  }
,
{ // state 126
0x80000000|1, // match move
0x80000000|886, // no-match move
0x80000000|64, // NT-test-match state for idChar
  }
,
{ // state 127
MIN_REDUCTION+19, // (default reduction)
  }
,
{ // state 128
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1309, // "/"
161,48, // blockComment
164,1194, // slashStar
MIN_REDUCTION+151, // (default reduction)
  }
,
{ // state 129
2,1015, // white*
125,2024, // white
126,857, // {12}
127,857, // " "
128,857, // {9}
129,1169, // eol
130,977, // comment
131,1299, // {10}
132,884, // {13}
143,1422, // "/"
160,1218, // oneLineComment
161,821, // blockComment
162,1907, // doubleSlash
164,782, // slashStar
178,MIN_REDUCTION+191, // $NT
  }
,
{ // state 130
2,47, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1309, // "/"
161,48, // blockComment
164,1194, // slashStar
MIN_REDUCTION+233, // (default reduction)
  }
,
{ // state 131
0x80000000|1199, // match move
0x80000000|1805, // no-match move
0x80000000|63, // NT-test-match state for doubleSlash
  }
,
{ // state 132
MIN_REDUCTION+167, // (default reduction)
  }
,
{ // state 133
MIN_REDUCTION+29, // (default reduction)
  }
,
{ // state 134
89,724, // "c"
90,724, // "l"
91,724, // "a"
92,724, // "s"
95,724, // "e"
96,724, // "!"
97,724, // "="
98,724, // "+"
102,724, // "_"
103,724, // "d"
104,724, // "g"
105,724, // "m"
106,724, // "p"
107,724, // "v"
108,724, // "y"
109,724, // "f"
110,724, // "i"
111,724, // {"A".."Z"}
112,724, // "o"
113,724, // "r"
114,724, // "u"
115,724, // "x"
116,724, // {"j" "q"}
117,724, // "b"
118,724, // "h"
119,724, // "k"
120,724, // "n"
121,724, // "t"
122,724, // "w"
123,724, // "z"
124,724, // {"0".."9"}
127,724, // " "
128,724, // {9}
129,1228, // eol
131,343, // {10}
132,367, // {13}
134,724, // "["
135,724, // "-"
136,724, // "<"
137,724, // "|"
138,724, // {"?".."@"}
139,724, // "&"
140,724, // ")"
141,724, // ","
142,724, // "]"
143,724, // "/"
144,724, // {"#".."$"}
145,724, // ";"
146,724, // ">"
147,724, // "{"
148,724, // "%"
149,724, // "("
150,724, // "\"
151,724, // "."
152,724, // ":"
153,724, // "}"
154,724, // {"^" "`" "~"}
155,724, // "'"
156,724, // '"'
157,847, // "*"
166,1890, // starSlash
167,442, // blockCommentContent
  }
,
{ // state 135
178,MIN_REDUCTION+252, // $NT
  }
,
{ // state 136
MIN_REDUCTION+87, // (default reduction)
  }
,
{ // state 137
0x80000000|1681, // match move
0x80000000|1352, // no-match move
0x80000000|1622, // NT-test-match state for slashStar
  }
,
{ // state 138
95,749, // "e"
  }
,
{ // state 139
2,659, // white*
125,2024, // white
126,857, // {12}
127,857, // " "
128,857, // {9}
129,1169, // eol
130,977, // comment
131,1299, // {10}
132,884, // {13}
143,1422, // "/"
160,1218, // oneLineComment
161,821, // blockComment
162,1907, // doubleSlash
164,782, // slashStar
178,MIN_REDUCTION+332, // $NT
  }
,
{ // state 140
95,292, // "e"
  }
,
{ // state 141
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1422, // "/"
160,715, // oneLineComment
161,48, // blockComment
162,732, // doubleSlash
164,1194, // slashStar
MIN_REDUCTION+217, // (default reduction)
  }
,
{ // state 142
0x80000000|1608, // match move
0x80000000|75, // no-match move
0x80000000|1622, // NT-test-match state for slashStar
  }
,
{ // state 143
2,1535, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1309, // "/"
161,48, // blockComment
164,1194, // slashStar
MIN_REDUCTION+227, // (default reduction)
  }
,
{ // state 144
2,1523, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1309, // "/"
161,48, // blockComment
164,1194, // slashStar
MIN_REDUCTION+266, // (default reduction)
  }
,
{ // state 145
121,601, // "t"
  }
,
{ // state 146
0x80000000|1457, // match move
0x80000000|40, // no-match move
0x80000000|64, // NT-test-match state for idChar
  }
,
{ // state 147
0x80000000|905, // match move
0x80000000|1019, // no-match move
0x80000000|1581, // NT-test-match state for reserved
  }
,
{ // state 148
121,861, // "t"
  }
,
{ // state 149
125,792, // white
126,857, // {12}
127,857, // " "
128,857, // {9}
129,1169, // eol
130,977, // comment
131,1299, // {10}
132,884, // {13}
143,1422, // "/"
160,1218, // oneLineComment
161,821, // blockComment
162,1907, // doubleSlash
164,782, // slashStar
178,MIN_REDUCTION+253, // $NT
  }
,
{ // state 150
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
129,482, // eol
130,1769, // comment
131,1062, // {10}
132,1577, // {13}
MIN_REDUCTION+149, // (default reduction)
  }
,
{ // state 151
2,1752, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
129,482, // eol
130,1769, // comment
131,1062, // {10}
132,1577, // {13}
MIN_REDUCTION+140, // (default reduction)
  }
,
{ // state 152
0x80000000|1378, // match move
0x80000000|695, // no-match move
0x80000000|1581, // NT-test-match state for reserved
  }
,
{ // state 153
178,MIN_REDUCTION+261, // $NT
  }
,
{ // state 154
2,1507, // white*
125,2024, // white
126,857, // {12}
127,857, // " "
128,857, // {9}
129,1169, // eol
130,977, // comment
131,1299, // {10}
132,884, // {13}
143,1422, // "/"
160,1218, // oneLineComment
161,821, // blockComment
162,1907, // doubleSlash
164,782, // slashStar
178,MIN_REDUCTION+287, // $NT
  }
,
{ // state 155
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
129,482, // eol
130,1769, // comment
131,1062, // {10}
132,1577, // {13}
MIN_REDUCTION+139, // (default reduction)
  }
,
{ // state 156
95,1597, // "e"
  }
,
{ // state 157
0x80000000|1, // match move
0x80000000|806, // no-match move
0x80000000|64, // NT-test-match state for idChar
  }
,
{ // state 158
2,201, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1309, // "/"
161,48, // blockComment
164,1194, // slashStar
MIN_REDUCTION+156, // (default reduction)
  }
,
{ // state 159
178,MIN_REDUCTION+91, // $NT
  }
,
{ // state 160
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
129,482, // eol
130,1769, // comment
131,1062, // {10}
132,1577, // {13}
MIN_REDUCTION+141, // (default reduction)
  }
,
{ // state 161
0x80000000|1651, // match move
0x80000000|463, // no-match move
0x80000000|1581, // NT-test-match state for reserved
  }
,
{ // state 162
2,1097, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1309, // "/"
161,48, // blockComment
164,1194, // slashStar
MIN_REDUCTION+281, // (default reduction)
  }
,
{ // state 163
110,457, // "i"
  }
,
{ // state 164
0x80000000|130, // match move
0x80000000|348, // no-match move
0x80000000|1622, // NT-test-match state for slashStar
  }
,
{ // state 165
90,620, // "l"
  }
,
{ // state 166
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1309, // "/"
161,48, // blockComment
164,1194, // slashStar
MIN_REDUCTION+265, // (default reduction)
  }
,
{ // state 167
110,1743, // "i"
  }
,
{ // state 168
2,708, // white*
125,2024, // white
126,857, // {12}
127,857, // " "
128,857, // {9}
129,1169, // eol
130,977, // comment
131,1299, // {10}
132,884, // {13}
143,1422, // "/"
160,1218, // oneLineComment
161,821, // blockComment
162,1907, // doubleSlash
164,782, // slashStar
178,MIN_REDUCTION+326, // $NT
  }
,
{ // state 169
2,1625, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1309, // "/"
161,48, // blockComment
164,1194, // slashStar
MIN_REDUCTION+212, // (default reduction)
  }
,
{ // state 170
MIN_REDUCTION+208, // (default reduction)
  }
,
{ // state 171
0x80000000|1347, // match move
0x80000000|1111, // no-match move
0x80000000|1622, // NT-test-match state for slashStar
  }
,
{ // state 172
MIN_REDUCTION+137, // (default reduction)
  }
,
{ // state 173
0x80000000|108, // match move
0x80000000|287, // no-match move
0x80000000|63, // NT-test-match state for doubleSlash
  }
,
{ // state 174
2,479, // white*
125,2024, // white
126,857, // {12}
127,857, // " "
128,857, // {9}
129,1169, // eol
130,977, // comment
131,1299, // {10}
132,884, // {13}
143,1422, // "/"
160,1218, // oneLineComment
161,821, // blockComment
162,1907, // doubleSlash
164,782, // slashStar
178,MIN_REDUCTION+275, // $NT
  }
,
{ // state 175
MIN_REDUCTION+76, // (default reduction)
  }
,
{ // state 176
MIN_REDUCTION+35, // (default reduction)
  }
,
{ // state 177
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1309, // "/"
161,48, // blockComment
164,1194, // slashStar
MIN_REDUCTION+232, // (default reduction)
  }
,
{ // state 178
92,591, // "s"
  }
,
{ // state 179
92,1762, // "s"
  }
,
{ // state 180
MIN_REDUCTION+259, // (default reduction)
  }
,
{ // state 181
-1, // $$start
-1, // start
1311, // white*
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
1508, // `!
1692, // `!=
882, // `%
685, // `&&
657, // `*
1835, // `(
1936, // `)
1023, // `{
1027, // `}
1043, // `-
809, // `+
625, // `=
1179, // `==
439, // `[
1452, // `]
396, // `||
2021, // `<
602, // `<=
175, // `,
298, // `>
778, // `>=
31, // `.
968, // `;
938, // `++
417, // `--
1825, // `/
738, // `:
1607, // ID
793, // INT_LITERAL
136, // STRING_LITERAL
1729, // CHAR_LITERAL
653, // "c"
653, // "l"
653, // "a"
653, // "s"
-1, // idChar
-1, // reserved
653, // "e"
1108, // "!"
596, // "="
404, // "+"
795, // digit++
1688, // letter
1240, // digit
-1, // "_"
653, // "d"
653, // "g"
653, // "m"
653, // "p"
653, // "v"
653, // "y"
653, // "f"
653, // "i"
653, // {"A".."Z"}
653, // "o"
653, // "r"
653, // "u"
653, // "x"
653, // {"j" "q"}
653, // "b"
653, // "h"
653, // "k"
653, // "n"
653, // "t"
653, // "w"
653, // "z"
392, // {"0".."9"}
702, // white
1975, // {12}
1975, // " "
1975, // {9}
482, // eol
1769, // comment
1062, // {10}
1577, // {13}
-1, // printable
1009, // "["
999, // "-"
1173, // "<"
447, // "|"
-1, // {"?".."@"}
2015, // "&"
395, // ")"
1948, // ","
173, // "]"
1229, // "/"
-1, // {"#".."$"}
1310, // ";"
552, // ">"
1278, // "{"
1011, // "%"
458, // "("
-1, // "\"
1391, // "."
1654, // ":"
1823, // "}"
-1, // {"^" "`" "~"}
991, // "'"
661, // '"'
253, // "*"
-1, // stringPrintable
-1, // charPrintable
-1, // oneLineComment
-1, // blockComment
-1, // doubleSlash
-1, // printable*
-1, // slashStar
-1, // blockCommentContent*
-1, // starSlash
-1, // blockCommentContent
1557, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
-1, // token*
594, // digit+
-1, // idChar*
1151, // letter+
MIN_REDUCTION+150, // $
-1, // $NT
  }
,
{ // state 182
95,936, // "e"
  }
,
{ // state 183
0x80000000|1567, // match move
0x80000000|171, // no-match move
0x80000000|1581, // NT-test-match state for reserved
  }
,
{ // state 184
0x80000000|1974, // match move
0x80000000|1934, // no-match move
0x80000000|1581, // NT-test-match state for reserved
  }
,
{ // state 185
0x80000000|1, // match move
0x80000000|290, // no-match move
0x80000000|64, // NT-test-match state for idChar
  }
,
{ // state 186
0x80000000|921, // match move
0x80000000|335, // no-match move
0x80000000|63, // NT-test-match state for doubleSlash
  }
,
{ // state 187
125,792, // white
126,857, // {12}
127,857, // " "
128,857, // {9}
129,1169, // eol
130,977, // comment
131,1299, // {10}
132,884, // {13}
143,1422, // "/"
160,1218, // oneLineComment
161,821, // blockComment
162,1907, // doubleSlash
164,782, // slashStar
178,MIN_REDUCTION+322, // $NT
  }
,
{ // state 188
2,1450, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1309, // "/"
161,48, // blockComment
164,1194, // slashStar
MIN_REDUCTION+134, // (default reduction)
  }
,
{ // state 189
2,697, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
129,482, // eol
130,1769, // comment
131,1062, // {10}
132,1577, // {13}
MIN_REDUCTION+206, // (default reduction)
  }
,
{ // state 190
0x80000000|888, // match move
0x80000000|1898, // no-match move
0x80000000|63, // NT-test-match state for doubleSlash
  }
,
{ // state 191
MIN_REDUCTION+135, // (default reduction)
  }
,
{ // state 192
MIN_REDUCTION+25, // (default reduction)
  }
,
{ // state 193
0x80000000|1, // match move
0x80000000|275, // no-match move
0x80000000|64, // NT-test-match state for idChar
  }
,
{ // state 194
121,906, // "t"
  }
,
{ // state 195
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 196
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
129,482, // eol
130,1769, // comment
131,1062, // {10}
132,1577, // {13}
MIN_REDUCTION+145, // (default reduction)
  }
,
{ // state 197
91,1524, // "a"
108,1866, // "y"
114,1481, // "u"
  }
,
{ // state 198
178,MIN_REDUCTION+297, // $NT
  }
,
{ // state 199
3,6, // $$0
4,1056, // token
5,432, // `boolean
6,735, // `class
7,679, // `extends
8,231, // `void
9,1102, // `int
10,324, // `while
11,351, // `if
12,748, // `else
13,1134, // `for
14,1984, // `break
15,316, // `this
16,380, // `false
17,276, // `true
18,908, // `super
19,127, // `null
20,699, // `return
21,1345, // `instanceof
22,2014, // `new
23,1124, // `abstract
24,469, // `assert
25,192, // `byte
26,535, // `case
27,1558, // `catch
28,974, // `char
29,133, // `const
30,315, // `continue
31,1947, // `default
32,1381, // `do
33,1997, // `double
34,650, // `enum
35,176, // `final
36,279, // `finally
37,674, // `float
38,1740, // `goto
39,109, // `implements
40,239, // `import
41,849, // `interface
42,1268, // `long
43,540, // `native
44,1099, // `package
45,1389, // `private
46,667, // `protected
47,41, // `public
48,1425, // `short
49,1176, // `static
50,331, // `strictfp
51,544, // `switch
52,759, // `synchronized
53,811, // `throw
54,369, // `throws
55,1046, // `transient
56,271, // `try
57,426, // `volatile
89,345, // "c"
90,1774, // "l"
91,1047, // "a"
92,1749, // "s"
95,631, // "e"
103,220, // "d"
104,1703, // "g"
106,1675, // "p"
107,1125, // "v"
109,304, // "f"
110,50, // "i"
113,270, // "r"
117,986, // "b"
120,471, // "n"
121,876, // "t"
122,1379, // "w"
173,1599, // token*
MIN_REDUCTION+3, // (default reduction)
  }
,
{ // state 200
0x80000000|1684, // match move
0x80000000|1076, // no-match move
0x80000000|1622, // NT-test-match state for slashStar
  }
,
{ // state 201
0x80000000|1836, // match move
0x80000000|122, // no-match move
0x80000000|63, // NT-test-match state for doubleSlash
  }
,
{ // state 202
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1422, // "/"
160,715, // oneLineComment
161,48, // blockComment
162,732, // doubleSlash
164,1194, // slashStar
MIN_REDUCTION+133, // (default reduction)
  }
,
{ // state 203
2,379, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1309, // "/"
161,48, // blockComment
164,1194, // slashStar
MIN_REDUCTION+100, // (default reduction)
  }
,
{ // state 204
121,1794, // "t"
  }
,
{ // state 205
0x80000000|531, // match move
0x80000000|208, // no-match move
0x80000000|1622, // NT-test-match state for slashStar
  }
,
{ // state 206
0x80000000|491, // match move
0x80000000|233, // no-match move
0x80000000|63, // NT-test-match state for doubleSlash
  }
,
{ // state 207
0x80000000|1077, // match move
0x80000000|27, // no-match move
0x80000000|1581, // NT-test-match state for reserved
  }
,
{ // state 208
2,99, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
129,482, // eol
130,1769, // comment
131,1062, // {10}
132,1577, // {13}
MIN_REDUCTION+332, // (default reduction)
  }
,
{ // state 209
91,1397, // "a"
  }
,
{ // state 210
2,1182, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1422, // "/"
160,715, // oneLineComment
161,48, // blockComment
162,732, // doubleSlash
164,1194, // slashStar
MIN_REDUCTION+221, // (default reduction)
  }
,
{ // state 211
0x80000000|1219, // match move
0x80000000|1470, // no-match move
0x80000000|1622, // NT-test-match state for slashStar
  }
,
{ // state 212
0x80000000|1288, // match move
0x80000000|1443, // no-match move
0x80000000|63, // NT-test-match state for doubleSlash
  }
,
{ // state 213
0x80000000|1, // match move
0x80000000|222, // no-match move
0x80000000|64, // NT-test-match state for idChar
  }
,
{ // state 214
1,570, // start
2,1643, // white*
3,1862, // $$0
4,1056, // token
125,1568, // white
126,1479, // {12}
127,1479, // " "
128,1479, // {9}
130,1375, // comment
143,1309, // "/"
161,1106, // blockComment
164,1520, // slashStar
173,1599, // token*
177,MIN_REDUCTION+1, // $
  }
,
{ // state 215
0x80000000|926, // match move
0x80000000|1804, // no-match move
0x80000000|63, // NT-test-match state for doubleSlash
  }
,
{ // state 216
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
129,482, // eol
130,1769, // comment
131,1062, // {10}
132,1577, // {13}
MIN_REDUCTION+247, // (default reduction)
  }
,
{ // state 217
2,1871, // white*
MIN_REDUCTION+142, // (default reduction)
  }
,
{ // state 218
92,1456, // "s"
  }
,
{ // state 219
125,792, // white
126,857, // {12}
127,857, // " "
128,857, // {9}
129,1169, // eol
130,977, // comment
131,1299, // {10}
132,884, // {13}
143,1422, // "/"
160,1218, // oneLineComment
161,821, // blockComment
162,1907, // doubleSlash
164,782, // slashStar
178,MIN_REDUCTION+89, // $NT
  }
,
{ // state 220
95,1454, // "e"
112,58, // "o"
  }
,
{ // state 221
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 222
0x80000000|114, // match move
0x80000000|881, // no-match move
0x80000000|63, // NT-test-match state for doubleSlash
  }
,
{ // state 223
MIN_REDUCTION+199, // (default reduction)
  }
,
{ // state 224
0x80000000|1, // match move
0x80000000|791, // no-match move
0x80000000|64, // NT-test-match state for idChar
  }
,
{ // state 225
0x80000000|1276, // match move
0x80000000|1606, // no-match move
0x80000000|1622, // NT-test-match state for slashStar
  }
,
{ // state 226
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1309, // "/"
161,48, // blockComment
164,1194, // slashStar
MIN_REDUCTION+193, // (default reduction)
  }
,
{ // state 227
2,1325, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
129,482, // eol
130,1769, // comment
131,1062, // {10}
132,1577, // {13}
MIN_REDUCTION+197, // (default reduction)
  }
,
{ // state 228
2,212, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1309, // "/"
161,48, // blockComment
164,1194, // slashStar
MIN_REDUCTION+188, // (default reduction)
  }
,
{ // state 229
2,1838, // white*
125,2024, // white
126,857, // {12}
127,857, // " "
128,857, // {9}
129,1169, // eol
130,977, // comment
131,1299, // {10}
132,884, // {13}
143,1422, // "/"
160,1218, // oneLineComment
161,821, // blockComment
162,1907, // doubleSlash
164,782, // slashStar
178,MIN_REDUCTION+257, // $NT
  }
,
{ // state 230
2,962, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
129,482, // eol
130,1769, // comment
131,1062, // {10}
132,1577, // {13}
MIN_REDUCTION+341, // (default reduction)
  }
,
{ // state 231
MIN_REDUCTION+8, // (default reduction)
  }
,
{ // state 232
2,1241, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1309, // "/"
161,48, // blockComment
164,1194, // slashStar
MIN_REDUCTION+293, // (default reduction)
  }
,
{ // state 233
0x80000000|1647, // match move
0x80000000|340, // no-match move
0x80000000|1622, // NT-test-match state for slashStar
  }
,
{ // state 234
MIN_REDUCTION+171, // (default reduction)
  }
,
{ // state 235
0x80000000|1908, // match move
0x80000000|1925, // no-match move
0x80000000|1581, // NT-test-match state for reserved
  }
,
{ // state 236
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
129,482, // eol
130,1769, // comment
131,1062, // {10}
132,1577, // {13}
MIN_REDUCTION+181, // (default reduction)
  }
,
{ // state 237
125,792, // white
126,857, // {12}
127,857, // " "
128,857, // {9}
129,1169, // eol
130,977, // comment
131,1299, // {10}
132,884, // {13}
143,1422, // "/"
160,1218, // oneLineComment
161,821, // blockComment
162,1907, // doubleSlash
164,782, // slashStar
178,MIN_REDUCTION+304, // $NT
  }
,
{ // state 238
103,1961, // "d"
  }
,
{ // state 239
MIN_REDUCTION+40, // (default reduction)
  }
,
{ // state 240
178,MIN_REDUCTION+103, // $NT
  }
,
{ // state 241
125,792, // white
126,857, // {12}
127,857, // " "
128,857, // {9}
129,1169, // eol
130,977, // comment
131,1299, // {10}
132,884, // {13}
143,1422, // "/"
160,1218, // oneLineComment
161,821, // blockComment
162,1907, // doubleSlash
164,782, // slashStar
178,MIN_REDUCTION+202, // $NT
  }
,
{ // state 242
MIN_REDUCTION+124, // (default reduction)
  }
,
{ // state 243
0x80000000|1671, // match move
0x80000000|1686, // no-match move
0x80000000|1581, // NT-test-match state for reserved
  }
,
{ // state 244
95,995, // "e"
  }
,
{ // state 245
2,962, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1422, // "/"
160,715, // oneLineComment
161,48, // blockComment
162,732, // doubleSlash
164,1194, // slashStar
MIN_REDUCTION+341, // (default reduction)
  }
,
{ // state 246
89,116, // "c"
  }
,
{ // state 247
92,1951, // "s"
121,39, // "t"
  }
,
{ // state 248
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1309, // "/"
161,48, // blockComment
164,1194, // slashStar
MIN_REDUCTION+310, // (default reduction)
  }
,
{ // state 249
92,1617, // "s"
  }
,
{ // state 250
2,379, // white*
MIN_REDUCTION+100, // (default reduction)
  }
,
{ // state 251
0x80000000|733, // match move
0x80000000|1082, // no-match move
0x80000000|1581, // NT-test-match state for reserved
  }
,
{ // state 252
89,595, // "c"
  }
,
{ // state 253
0x80000000|1338, // match move
0x80000000|969, // no-match move
0x80000000|63, // NT-test-match state for doubleSlash
  }
,
{ // state 254
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1422, // "/"
160,715, // oneLineComment
161,48, // blockComment
162,732, // doubleSlash
164,1194, // slashStar
MIN_REDUCTION+147, // (default reduction)
  }
,
{ // state 255
2,390, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
129,482, // eol
130,1769, // comment
131,1062, // {10}
132,1577, // {13}
MIN_REDUCTION+194, // (default reduction)
  }
,
{ // state 256
2,310, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1422, // "/"
160,715, // oneLineComment
161,48, // blockComment
162,732, // doubleSlash
164,1194, // slashStar
MIN_REDUCTION+269, // (default reduction)
  }
,
{ // state 257
0x80000000|1, // match move
0x80000000|1372, // no-match move
0x80000000|64, // NT-test-match state for idChar
  }
,
{ // state 258
MIN_REDUCTION+129, // (default reduction)
  }
,
{ // state 259
0x80000000|1478, // match move
0x80000000|361, // no-match move
0x80000000|63, // NT-test-match state for doubleSlash
  }
,
{ // state 260
121,981, // "t"
  }
,
{ // state 261
110,489, // "i"
  }
,
{ // state 262
0x80000000|530, // match move
0x80000000|1014, // no-match move
0x80000000|1581, // NT-test-match state for reserved
  }
,
{ // state 263
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
129,482, // eol
130,1769, // comment
131,1062, // {10}
132,1577, // {13}
MIN_REDUCTION+97, // (default reduction)
  }
,
{ // state 264
89,MIN_REDUCTION+357, // "c"
90,MIN_REDUCTION+357, // "l"
91,MIN_REDUCTION+357, // "a"
92,MIN_REDUCTION+357, // "s"
95,MIN_REDUCTION+357, // "e"
102,MIN_REDUCTION+357, // "_"
103,MIN_REDUCTION+357, // "d"
104,MIN_REDUCTION+357, // "g"
105,MIN_REDUCTION+357, // "m"
106,MIN_REDUCTION+357, // "p"
107,MIN_REDUCTION+357, // "v"
108,MIN_REDUCTION+357, // "y"
109,MIN_REDUCTION+357, // "f"
110,MIN_REDUCTION+357, // "i"
111,MIN_REDUCTION+357, // {"A".."Z"}
112,MIN_REDUCTION+357, // "o"
113,MIN_REDUCTION+357, // "r"
114,MIN_REDUCTION+357, // "u"
115,MIN_REDUCTION+357, // "x"
116,MIN_REDUCTION+357, // {"j" "q"}
117,MIN_REDUCTION+357, // "b"
118,MIN_REDUCTION+357, // "h"
119,MIN_REDUCTION+357, // "k"
120,MIN_REDUCTION+357, // "n"
121,MIN_REDUCTION+357, // "t"
122,MIN_REDUCTION+357, // "w"
123,MIN_REDUCTION+357, // "z"
124,MIN_REDUCTION+357, // {"0".."9"}
169,MIN_REDUCTION+357, // idChar**
MIN_REDUCTION+357, // (default reduction)
  }
,
{ // state 265
2,912, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1309, // "/"
161,48, // blockComment
164,1194, // slashStar
MIN_REDUCTION+364, // (default reduction)
  }
,
{ // state 266
90,678, // "l"
  }
,
{ // state 267
0x80000000|513, // match move
0x80000000|1864, // no-match move
0x80000000|63, // NT-test-match state for doubleSlash
  }
,
{ // state 268
91,883, // "a"
  }
,
{ // state 269
2,593, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
129,482, // eol
130,1769, // comment
131,1062, // {10}
132,1577, // {13}
MIN_REDUCTION+215, // (default reduction)
  }
,
{ // state 270
95,1897, // "e"
  }
,
{ // state 271
MIN_REDUCTION+56, // (default reduction)
  }
,
{ // state 272
0x80000000|783, // match move
0x80000000|160, // no-match move
0x80000000|1622, // NT-test-match state for slashStar
  }
,
{ // state 273
91,51, // "a"
  }
,
{ // state 274
0x80000000|1, // match move
0x80000000|1374, // no-match move
0x80000000|64, // NT-test-match state for idChar
  }
,
{ // state 275
0x80000000|682, // match move
0x80000000|1451, // no-match move
0x80000000|63, // NT-test-match state for doubleSlash
  }
,
{ // state 276
MIN_REDUCTION+17, // (default reduction)
  }
,
{ // state 277
89,1234, // "c"
  }
,
{ // state 278
MIN_REDUCTION+211, // (default reduction)
  }
,
{ // state 279
MIN_REDUCTION+36, // (default reduction)
  }
,
{ // state 280
0x80000000|816, // match move
0x80000000|410, // no-match move
0x80000000|63, // NT-test-match state for doubleSlash
  }
,
{ // state 281
2,692, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1422, // "/"
160,715, // oneLineComment
161,48, // blockComment
162,732, // doubleSlash
164,1194, // slashStar
MIN_REDUCTION+302, // (default reduction)
  }
,
{ // state 282
0x80000000|333, // match move
0x80000000|137, // no-match move
0x80000000|63, // NT-test-match state for doubleSlash
  }
,
{ // state 283
114,1717, // "u"
  }
,
{ // state 284
106,716, // "p"
  }
,
{ // state 285
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1309, // "/"
161,48, // blockComment
164,1194, // slashStar
MIN_REDUCTION+301, // (default reduction)
  }
,
{ // state 286
0x80000000|43, // match move
0x80000000|867, // no-match move
0x80000000|1581, // NT-test-match state for reserved
  }
,
{ // state 287
0x80000000|1049, // match move
0x80000000|2023, // no-match move
0x80000000|1581, // NT-test-match state for reserved
  }
,
{ // state 288
106,1273, // "p"
  }
,
{ // state 289
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1309, // "/"
161,48, // blockComment
164,1194, // slashStar
MIN_REDUCTION+159, // (default reduction)
  }
,
{ // state 290
0x80000000|622, // match move
0x80000000|119, // no-match move
0x80000000|63, // NT-test-match state for doubleSlash
  }
,
{ // state 291
0x80000000|636, // match move
0x80000000|1059, // no-match move
0x80000000|1622, // NT-test-match state for slashStar
  }
,
{ // state 292
0x80000000|1, // match move
0x80000000|722, // no-match move
0x80000000|64, // NT-test-match state for idChar
  }
,
{ // state 293
157,37, // "*"
  }
,
{ // state 294
2,697, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1309, // "/"
161,48, // blockComment
164,1194, // slashStar
MIN_REDUCTION+206, // (default reduction)
  }
,
{ // state 295
2,47, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1422, // "/"
160,715, // oneLineComment
161,48, // blockComment
162,732, // doubleSlash
164,1194, // slashStar
MIN_REDUCTION+233, // (default reduction)
  }
,
{ // state 296
125,792, // white
126,857, // {12}
127,857, // " "
128,857, // {9}
129,1169, // eol
130,977, // comment
131,1299, // {10}
132,884, // {13}
143,1422, // "/"
160,1218, // oneLineComment
161,821, // blockComment
162,1907, // doubleSlash
164,782, // slashStar
178,MIN_REDUCTION+328, // $NT
  }
,
{ // state 297
0x80000000|1, // match move
0x80000000|206, // no-match move
0x80000000|64, // NT-test-match state for idChar
  }
,
{ // state 298
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 299
0x80000000|1115, // match move
0x80000000|354, // no-match move
0x80000000|1622, // NT-test-match state for slashStar
  }
,
{ // state 300
0x80000000|824, // match move
0x80000000|1563, // no-match move
0x80000000|1622, // NT-test-match state for slashStar
  }
,
{ // state 301
0x80000000|670, // match move
0x80000000|573, // no-match move
0x80000000|1581, // NT-test-match state for reserved
  }
,
{ // state 302
0x80000000|295, // match move
0x80000000|164, // no-match move
0x80000000|63, // NT-test-match state for doubleSlash
  }
,
{ // state 303
0x80000000|1, // match move
0x80000000|676, // no-match move
0x80000000|64, // NT-test-match state for idChar
  }
,
{ // state 304
90,1994, // "l"
91,266, // "a"
110,626, // "i"
112,66, // "o"
  }
,
{ // state 305
118,505, // "h"
  }
,
{ // state 306
2,1535, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1422, // "/"
160,715, // oneLineComment
161,48, // blockComment
162,732, // doubleSlash
164,1194, // slashStar
MIN_REDUCTION+227, // (default reduction)
  }
,
{ // state 307
2,1752, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1309, // "/"
161,48, // blockComment
164,1194, // slashStar
MIN_REDUCTION+140, // (default reduction)
  }
,
{ // state 308
91,14, // "a"
  }
,
{ // state 309
125,792, // white
126,857, // {12}
127,857, // " "
128,857, // {9}
129,1169, // eol
130,977, // comment
131,1299, // {10}
132,884, // {13}
143,1422, // "/"
160,1218, // oneLineComment
161,821, // blockComment
162,1907, // doubleSlash
164,782, // slashStar
178,MIN_REDUCTION+307, // $NT
  }
,
{ // state 310
0x80000000|710, // match move
0x80000000|84, // no-match move
0x80000000|63, // NT-test-match state for doubleSlash
  }
,
{ // state 311
2,215, // white*
MIN_REDUCTION+172, // (default reduction)
  }
,
{ // state 312
2,1466, // white*
125,2024, // white
126,857, // {12}
127,857, // " "
128,857, // {9}
129,1169, // eol
130,977, // comment
131,1299, // {10}
132,884, // {13}
143,1422, // "/"
160,1218, // oneLineComment
161,821, // blockComment
162,1907, // doubleSlash
164,782, // slashStar
178,MIN_REDUCTION+311, // $NT
  }
,
{ // state 313
0x80000000|1033, // match move
0x80000000|1937, // no-match move
0x80000000|1622, // NT-test-match state for slashStar
  }
,
{ // state 314
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1309, // "/"
161,48, // blockComment
164,1194, // slashStar
MIN_REDUCTION+328, // (default reduction)
  }
,
{ // state 315
MIN_REDUCTION+30, // (default reduction)
  }
,
{ // state 316
MIN_REDUCTION+15, // (default reduction)
  }
,
{ // state 317
1,570, // start
2,1643, // white*
3,1862, // $$0
4,1056, // token
5,432, // `boolean
6,735, // `class
7,679, // `extends
8,231, // `void
9,1102, // `int
10,324, // `while
11,351, // `if
12,748, // `else
13,1134, // `for
14,1984, // `break
15,316, // `this
16,380, // `false
17,276, // `true
18,908, // `super
19,127, // `null
20,699, // `return
21,1345, // `instanceof
22,2014, // `new
23,1124, // `abstract
24,469, // `assert
25,192, // `byte
26,535, // `case
27,1558, // `catch
28,974, // `char
29,133, // `const
30,315, // `continue
31,1947, // `default
32,1381, // `do
33,1997, // `double
34,650, // `enum
35,176, // `final
36,279, // `finally
37,674, // `float
38,1740, // `goto
39,109, // `implements
40,239, // `import
41,849, // `interface
42,1268, // `long
43,540, // `native
44,1099, // `package
45,1389, // `private
46,667, // `protected
47,41, // `public
48,1425, // `short
49,1176, // `static
50,331, // `strictfp
51,544, // `switch
52,759, // `synchronized
53,811, // `throw
54,369, // `throws
55,1046, // `transient
56,271, // `try
57,426, // `volatile
89,345, // "c"
90,1774, // "l"
91,1047, // "a"
92,1749, // "s"
95,631, // "e"
103,220, // "d"
104,1703, // "g"
106,1675, // "p"
107,1125, // "v"
109,304, // "f"
110,50, // "i"
113,270, // "r"
117,986, // "b"
120,471, // "n"
121,876, // "t"
122,1379, // "w"
173,1599, // token*
177,MIN_REDUCTION+1, // $
  }
,
{ // state 318
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
129,482, // eol
130,1769, // comment
131,1062, // {10}
132,1577, // {13}
MIN_REDUCTION+298, // (default reduction)
  }
,
{ // state 319
2,1995, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
129,482, // eol
130,1769, // comment
131,1062, // {10}
132,1577, // {13}
MIN_REDUCTION+284, // (default reduction)
  }
,
{ // state 320
90,1957, // "l"
  }
,
{ // state 321
121,106, // "t"
  }
,
{ // state 322
109,671, // "f"
  }
,
{ // state 323
0x80000000|1, // match move
0x80000000|1446, // no-match move
0x80000000|64, // NT-test-match state for idChar
  }
,
{ // state 324
MIN_REDUCTION+10, // (default reduction)
  }
,
{ // state 325
MIN_REDUCTION+253, // (default reduction)
  }
,
{ // state 326
2,310, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1309, // "/"
161,48, // blockComment
164,1194, // slashStar
MIN_REDUCTION+269, // (default reduction)
  }
,
{ // state 327
0x80000000|922, // match move
0x80000000|1247, // no-match move
0x80000000|63, // NT-test-match state for doubleSlash
  }
,
{ // state 328
178,MIN_REDUCTION+327, // $NT
  }
,
{ // state 329
121,11, // "t"
  }
,
{ // state 330
2,1283, // white*
MIN_REDUCTION+168, // (default reduction)
  }
,
{ // state 331
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 332
107,121, // "v"
  }
,
{ // state 333
2,946, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1422, // "/"
160,715, // oneLineComment
161,48, // blockComment
162,732, // doubleSlash
164,1194, // slashStar
MIN_REDUCTION+317, // (default reduction)
  }
,
{ // state 334
-1, // $$start
570, // start
1643, // white*
1862, // $$0
1056, // token
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
1508, // `!
1692, // `!=
882, // `%
685, // `&&
657, // `*
1835, // `(
1936, // `)
1023, // `{
1027, // `}
1043, // `-
809, // `+
625, // `=
1179, // `==
439, // `[
1452, // `]
396, // `||
2021, // `<
602, // `<=
175, // `,
298, // `>
778, // `>=
31, // `.
968, // `;
938, // `++
417, // `--
1825, // `/
738, // `:
1607, // ID
793, // INT_LITERAL
136, // STRING_LITERAL
1729, // CHAR_LITERAL
653, // "c"
653, // "l"
653, // "a"
653, // "s"
-1, // idChar
-1, // reserved
653, // "e"
1108, // "!"
1889, // "="
404, // "+"
795, // digit++
1688, // letter
1240, // digit
-1, // "_"
653, // "d"
653, // "g"
653, // "m"
653, // "p"
653, // "v"
653, // "y"
653, // "f"
653, // "i"
653, // {"A".."Z"}
653, // "o"
653, // "r"
653, // "u"
653, // "x"
653, // {"j" "q"}
653, // "b"
653, // "h"
653, // "k"
653, // "n"
653, // "t"
653, // "w"
653, // "z"
392, // {"0".."9"}
1568, // white
1479, // {12}
1479, // " "
1479, // {9}
1786, // eol
1375, // comment
71, // {10}
1509, // {13}
-1, // printable
1009, // "["
999, // "-"
1173, // "<"
447, // "|"
-1, // {"?".."@"}
2015, // "&"
395, // ")"
1948, // ","
173, // "]"
1229, // "/"
-1, // {"#".."$"}
1310, // ";"
552, // ">"
1278, // "{"
1011, // "%"
458, // "("
-1, // "\"
1391, // "."
1654, // ":"
1823, // "}"
-1, // {"^" "`" "~"}
991, // "'"
661, // '"'
253, // "*"
-1, // stringPrintable
-1, // charPrintable
-1, // oneLineComment
-1, // blockComment
-1, // doubleSlash
-1, // printable*
-1, // slashStar
-1, // blockCommentContent*
-1, // starSlash
-1, // blockCommentContent
1557, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable*
-1, // $$2
1599, // token*
594, // digit+
-1, // idChar*
1151, // letter+
MIN_REDUCTION+1, // $
-1, // $NT
  }
,
{ // state 335
0x80000000|68, // match move
0x80000000|300, // no-match move
0x80000000|1581, // NT-test-match state for reserved
  }
,
{ // state 336
120,691, // "n"
  }
,
{ // state 337
0x80000000|1242, // match move
0x80000000|1616, // no-match move
0x80000000|63, // NT-test-match state for doubleSlash
  }
,
{ // state 338
125,792, // white
126,857, // {12}
127,857, // " "
128,857, // {9}
129,1169, // eol
130,977, // comment
131,1299, // {10}
132,884, // {13}
143,1422, // "/"
160,1218, // oneLineComment
161,821, // blockComment
162,1907, // doubleSlash
164,782, // slashStar
178,MIN_REDUCTION+199, // $NT
  }
,
{ // state 339
0x80000000|598, // match move
0x80000000|455, // no-match move
0x80000000|1581, // NT-test-match state for reserved
  }
,
{ // state 340
2,1633, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
129,482, // eol
130,1769, // comment
131,1062, // {10}
132,1577, // {13}
MIN_REDUCTION+299, // (default reduction)
  }
,
{ // state 341
0x80000000|465, // match move
0x80000000|1561, // no-match move
0x80000000|1581, // NT-test-match state for reserved
  }
,
{ // state 342
0x80000000|1114, // match move
0x80000000|18, // no-match move
0x80000000|1581, // NT-test-match state for reserved
  }
,
{ // state 343
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 344
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1309, // "/"
161,48, // blockComment
164,1194, // slashStar
MIN_REDUCTION+187, // (default reduction)
  }
,
{ // state 345
90,32, // "l"
91,985, // "a"
112,1613, // "o"
118,209, // "h"
  }
,
{ // state 346
108,1884, // "y"
  }
,
{ // state 347
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
129,482, // eol
130,1769, // comment
131,1062, // {10}
132,1577, // {13}
MIN_REDUCTION+238, // (default reduction)
  }
,
{ // state 348
2,47, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
129,482, // eol
130,1769, // comment
131,1062, // {10}
132,1577, // {13}
MIN_REDUCTION+233, // (default reduction)
  }
,
{ // state 349
2,548, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
129,482, // eol
130,1769, // comment
131,1062, // {10}
132,1577, // {13}
MIN_REDUCTION+162, // (default reduction)
  }
,
{ // state 350
178,MIN_REDUCTION+102, // $NT
  }
,
{ // state 351
MIN_REDUCTION+11, // (default reduction)
  }
,
{ // state 352
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1422, // "/"
160,715, // oneLineComment
161,48, // blockComment
162,732, // doubleSlash
164,1194, // slashStar
MIN_REDUCTION+286, // (default reduction)
  }
,
{ // state 353
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1422, // "/"
160,715, // oneLineComment
161,48, // blockComment
162,732, // doubleSlash
164,1194, // slashStar
MIN_REDUCTION+331, // (default reduction)
  }
,
{ // state 354
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
129,482, // eol
130,1769, // comment
131,1062, // {10}
132,1577, // {13}
MIN_REDUCTION+268, // (default reduction)
  }
,
{ // state 355
121,1116, // "t"
  }
,
{ // state 356
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1309, // "/"
161,48, // blockComment
164,1194, // slashStar
MIN_REDUCTION+155, // (default reduction)
  }
,
{ // state 357
2,237, // white*
125,2024, // white
126,857, // {12}
127,857, // " "
128,857, // {9}
129,1169, // eol
130,977, // comment
131,1299, // {10}
132,884, // {13}
143,1422, // "/"
160,1218, // oneLineComment
161,821, // blockComment
162,1907, // doubleSlash
164,782, // slashStar
178,MIN_REDUCTION+305, // $NT
  }
,
{ // state 358
113,1834, // "r"
  }
,
{ // state 359
118,1999, // "h"
  }
,
{ // state 360
0x80000000|451, // match move
0x80000000|1576, // no-match move
0x80000000|1581, // NT-test-match state for reserved
  }
,
{ // state 361
0x80000000|684, // match move
0x80000000|896, // no-match move
0x80000000|1581, // NT-test-match state for reserved
  }
,
{ // state 362
0x80000000|306, // match move
0x80000000|980, // no-match move
0x80000000|63, // NT-test-match state for doubleSlash
  }
,
{ // state 363
122,1798, // "w"
  }
,
{ // state 364
90,1163, // "l"
115,434, // "x"
120,3, // "n"
  }
,
{ // state 365
178,MIN_REDUCTION+105, // $NT
  }
,
{ // state 366
178,MIN_REDUCTION+333, // $NT
  }
,
{ // state 367
0x80000000|1706, // match move
0x80000000|1204, // no-match move
// T-test match for 10:
131,
  }
,
{ // state 368
2,740, // white*
125,2024, // white
126,857, // {12}
127,857, // " "
128,857, // {9}
129,1169, // eol
130,977, // comment
131,1299, // {10}
132,884, // {13}
143,1422, // "/"
160,1218, // oneLineComment
161,821, // blockComment
162,1907, // doubleSlash
164,782, // slashStar
178,MIN_REDUCTION+233, // $NT
  }
,
{ // state 369
MIN_REDUCTION+54, // (default reduction)
  }
,
{ // state 370
MIN_REDUCTION+181, // (default reduction)
  }
,
{ // state 371
125,792, // white
126,857, // {12}
127,857, // " "
128,857, // {9}
129,1169, // eol
130,977, // comment
131,1299, // {10}
132,884, // {13}
143,1422, // "/"
160,1218, // oneLineComment
161,821, // blockComment
162,1907, // doubleSlash
164,782, // slashStar
178,MIN_REDUCTION+235, // $NT
  }
,
{ // state 372
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1309, // "/"
161,48, // blockComment
164,1194, // slashStar
MIN_REDUCTION+280, // (default reduction)
  }
,
{ // state 373
0x80000000|1, // match move
0x80000000|1396, // no-match move
0x80000000|64, // NT-test-match state for idChar
  }
,
{ // state 374
0x80000000|978, // match move
0x80000000|1879, // no-match move
0x80000000|63, // NT-test-match state for doubleSlash
  }
,
{ // state 375
0x80000000|1, // match move
0x80000000|302, // no-match move
0x80000000|64, // NT-test-match state for idChar
  }
,
{ // state 376
0x80000000|1071, // match move
0x80000000|739, // no-match move
0x80000000|63, // NT-test-match state for doubleSlash
  }
,
{ // state 377
91,1735, // "a"
108,1004, // "y"
114,140, // "u"
  }
,
{ // state 378
0x80000000|1885, // match move
0x80000000|607, // no-match move
0x80000000|63, // NT-test-match state for doubleSlash
  }
,
{ // state 379
0x80000000|1156, // match move
0x80000000|666, // no-match move
0x80000000|63, // NT-test-match state for doubleSlash
  }
,
{ // state 380
MIN_REDUCTION+16, // (default reduction)
  }
,
{ // state 381
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
129,482, // eol
130,1769, // comment
131,1062, // {10}
132,1577, // {13}
MIN_REDUCTION+277, // (default reduction)
  }
,
{ // state 382
MIN_REDUCTION+105, // (default reduction)
  }
,
{ // state 383
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1422, // "/"
160,715, // oneLineComment
161,48, // blockComment
162,732, // doubleSlash
164,1194, // slashStar
MIN_REDUCTION+190, // (default reduction)
  }
,
{ // state 384
90,1384, // "l"
91,509, // "a"
110,336, // "i"
112,1055, // "o"
  }
,
{ // state 385
0x80000000|35, // match move
0x80000000|1415, // no-match move
0x80000000|63, // NT-test-match state for doubleSlash
  }
,
{ // state 386
0x80000000|1585, // match move
0x80000000|1600, // no-match move
0x80000000|1581, // NT-test-match state for reserved
  }
,
{ // state 387
122,696, // "w"
  }
,
{ // state 388
0x80000000|1, // match move
0x80000000|1619, // no-match move
0x80000000|64, // NT-test-match state for idChar
  }
,
{ // state 389
0x80000000|77, // match move
0x80000000|903, // no-match move
0x80000000|63, // NT-test-match state for doubleSlash
  }
,
{ // state 390
0x80000000|1602, // match move
0x80000000|74, // no-match move
0x80000000|63, // NT-test-match state for doubleSlash
  }
,
{ // state 391
120,1707, // "n"
  }
,
{ // state 392
0x80000000|1208, // match move
0x80000000|1174, // no-match move
0x80000000|89, // NT-test-match state for digit
  }
,
{ // state 393
90,563, // "l"
  }
,
{ // state 394
0x80000000|525, // match move
0x80000000|211, // no-match move
0x80000000|63, // NT-test-match state for doubleSlash
  }
,
{ // state 395
0x80000000|1634, // match move
0x80000000|865, // no-match move
0x80000000|63, // NT-test-match state for doubleSlash
  }
,
{ // state 396
MIN_REDUCTION+73, // (default reduction)
  }
,
{ // state 397
0x80000000|19, // match move
0x80000000|1088, // no-match move
0x80000000|1581, // NT-test-match state for reserved
  }
,
{ // state 398
121,1395, // "t"
  }
,
{ // state 399
0x80000000|1148, // match move
0x80000000|1660, // no-match move
0x80000000|64, // NT-test-match state for idChar
  }
,
{ // state 400
109,1689, // "f"
  }
,
{ // state 401
2,99, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1422, // "/"
160,715, // oneLineComment
161,48, // blockComment
162,732, // doubleSlash
164,1194, // slashStar
MIN_REDUCTION+332, // (default reduction)
  }
,
{ // state 402
89,1161, // "c"
  }
,
{ // state 403
97,1157, // "="
  }
,
{ // state 404
0x80000000|534, // match move
0x80000000|1012, // no-match move
// T-test match for "+":
98,
  }
,
{ // state 405
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1309, // "/"
161,48, // blockComment
164,1194, // slashStar
MIN_REDUCTION+238, // (default reduction)
  }
,
{ // state 406
90,393, // "l"
  }
,
{ // state 407
0x80000000|1, // match move
0x80000000|1641, // no-match move
0x80000000|64, // NT-test-match state for idChar
  }
,
{ // state 408
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
129,482, // eol
130,1769, // comment
131,1062, // {10}
132,1577, // {13}
MIN_REDUCTION+157, // (default reduction)
  }
,
{ // state 409
0x80000000|1521, // match move
0x80000000|1383, // no-match move
0x80000000|63, // NT-test-match state for doubleSlash
  }
,
{ // state 410
0x80000000|103, // match move
0x80000000|526, // no-match move
0x80000000|1622, // NT-test-match state for slashStar
  }
,
{ // state 411
2,1938, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1309, // "/"
161,48, // blockComment
164,1194, // slashStar
MIN_REDUCTION+164, // (default reduction)
  }
,
{ // state 412
0x80000000|177, // match move
0x80000000|766, // no-match move
0x80000000|1622, // NT-test-match state for slashStar
  }
,
{ // state 413
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
129,482, // eol
130,1769, // comment
131,1062, // {10}
132,1577, // {13}
MIN_REDUCTION+202, // (default reduction)
  }
,
{ // state 414
2,374, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1309, // "/"
161,48, // blockComment
164,1194, // slashStar
MIN_REDUCTION+320, // (default reduction)
  }
,
{ // state 415
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1422, // "/"
160,715, // oneLineComment
161,48, // blockComment
162,732, // doubleSlash
164,1194, // slashStar
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 416
2,1625, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
129,482, // eol
130,1769, // comment
131,1062, // {10}
132,1577, // {13}
MIN_REDUCTION+212, // (default reduction)
  }
,
{ // state 417
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 418
0x80000000|519, // match move
0x80000000|1186, // no-match move
0x80000000|63, // NT-test-match state for doubleSlash
  }
,
{ // state 419
MIN_REDUCTION+193, // (default reduction)
  }
,
{ // state 420
2,1283, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1309, // "/"
161,48, // blockComment
164,1194, // slashStar
MIN_REDUCTION+168, // (default reduction)
  }
,
{ // state 421
95,2006, // "e"
  }
,
{ // state 422
MIN_REDUCTION+362, // (default reduction)
  }
,
{ // state 423
2,799, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1422, // "/"
160,715, // oneLineComment
161,48, // blockComment
162,732, // doubleSlash
164,1194, // slashStar
MIN_REDUCTION+160, // (default reduction)
  }
,
{ // state 424
0x80000000|1761, // match move
0x80000000|819, // no-match move
0x80000000|63, // NT-test-match state for doubleSlash
  }
,
{ // state 425
2,962, // white*
MIN_REDUCTION+341, // (default reduction)
  }
,
{ // state 426
MIN_REDUCTION+57, // (default reduction)
  }
,
{ // state 427
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1422, // "/"
160,715, // oneLineComment
161,48, // blockComment
162,732, // doubleSlash
164,1194, // slashStar
MIN_REDUCTION+280, // (default reduction)
  }
,
{ // state 428
2,1267, // white*
125,2024, // white
126,857, // {12}
127,857, // " "
128,857, // {9}
129,1169, // eol
130,977, // comment
131,1299, // {10}
132,884, // {13}
143,1422, // "/"
160,1218, // oneLineComment
161,821, // blockComment
162,1907, // doubleSlash
164,782, // slashStar
178,MIN_REDUCTION+206, // $NT
  }
,
{ // state 429
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1309, // "/"
161,48, // blockComment
164,1194, // slashStar
MIN_REDUCTION+133, // (default reduction)
  }
,
{ // state 430
2,1450, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
129,482, // eol
130,1769, // comment
131,1062, // {10}
132,1577, // {13}
MIN_REDUCTION+134, // (default reduction)
  }
,
{ // state 431
MIN_REDUCTION+301, // (default reduction)
  }
,
{ // state 432
MIN_REDUCTION+5, // (default reduction)
  }
,
{ // state 433
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1309, // "/"
161,48, // blockComment
164,1194, // slashStar
MIN_REDUCTION+184, // (default reduction)
  }
,
{ // state 434
121,244, // "t"
  }
,
{ // state 435
90,1057, // "l"
91,1198, // "a"
112,477, // "o"
118,1941, // "h"
  }
,
{ // state 436
0x80000000|2022, // match move
0x80000000|86, // no-match move
0x80000000|1581, // NT-test-match state for reserved
  }
,
{ // state 437
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1422, // "/"
160,715, // oneLineComment
161,48, // blockComment
162,732, // doubleSlash
164,1194, // slashStar
MIN_REDUCTION+173, // (default reduction)
  }
,
{ // state 438
92,148, // "s"
  }
,
{ // state 439
MIN_REDUCTION+71, // (default reduction)
  }
,
{ // state 440
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
129,482, // eol
130,1769, // comment
131,1062, // {10}
132,1577, // {13}
MIN_REDUCTION+190, // (default reduction)
  }
,
{ // state 441
0x80000000|1, // match move
0x80000000|1458, // no-match move
0x80000000|64, // NT-test-match state for idChar
  }
,
{ // state 442
MIN_REDUCTION+350, // (default reduction)
  }
,
{ // state 443
0x80000000|1028, // match move
0x80000000|1788, // no-match move
0x80000000|1622, // NT-test-match state for slashStar
  }
,
{ // state 444
89,724, // "c"
90,724, // "l"
91,724, // "a"
92,724, // "s"
95,724, // "e"
96,724, // "!"
97,724, // "="
98,724, // "+"
102,724, // "_"
103,724, // "d"
104,724, // "g"
105,724, // "m"
106,724, // "p"
107,724, // "v"
108,724, // "y"
109,724, // "f"
110,724, // "i"
111,724, // {"A".."Z"}
112,724, // "o"
113,724, // "r"
114,724, // "u"
115,724, // "x"
116,724, // {"j" "q"}
117,724, // "b"
118,724, // "h"
119,724, // "k"
120,724, // "n"
121,724, // "t"
122,724, // "w"
123,724, // "z"
124,724, // {"0".."9"}
127,724, // " "
128,724, // {9}
129,1228, // eol
131,343, // {10}
132,367, // {13}
134,724, // "["
135,724, // "-"
136,724, // "<"
137,724, // "|"
138,724, // {"?".."@"}
139,724, // "&"
140,724, // ")"
141,724, // ","
142,724, // "]"
143,724, // "/"
144,724, // {"#".."$"}
145,724, // ";"
146,724, // ">"
147,724, // "{"
148,724, // "%"
149,724, // "("
150,724, // "\"
151,724, // "."
152,724, // ":"
153,724, // "}"
154,724, // {"^" "`" "~"}
155,724, // "'"
156,724, // '"'
157,1623, // "*"
166,851, // starSlash
167,442, // blockCommentContent
  }
,
{ // state 445
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1309, // "/"
161,48, // blockComment
164,1194, // slashStar
MIN_REDUCTION+171, // (default reduction)
  }
,
{ // state 446
95,238, // "e"
  }
,
{ // state 447
137,1693, // "|"
  }
,
{ // state 448
0x80000000|1525, // match move
0x80000000|1265, // no-match move
0x80000000|63, // NT-test-match state for doubleSlash
  }
,
{ // state 449
0x80000000|1, // match move
0x80000000|1527, // no-match move
0x80000000|64, // NT-test-match state for idChar
  }
,
{ // state 450
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
129,482, // eol
130,1769, // comment
131,1062, // {10}
132,1577, // {13}
MIN_REDUCTION+280, // (default reduction)
  }
,
{ // state 451
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 452
109,790, // "f"
  }
,
{ // state 453
2,527, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
129,482, // eol
130,1769, // comment
131,1062, // {10}
132,1577, // {13}
MIN_REDUCTION+166, // (default reduction)
  }
,
{ // state 454
2,1637, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1422, // "/"
160,715, // oneLineComment
161,48, // blockComment
162,732, // doubleSlash
164,1194, // slashStar
MIN_REDUCTION+178, // (default reduction)
  }
,
{ // state 455
0x80000000|101, // match move
0x80000000|1833, // no-match move
0x80000000|1622, // NT-test-match state for slashStar
  }
,
{ // state 456
MIN_REDUCTION+187, // (default reduction)
  }
,
{ // state 457
120,529, // "n"
  }
,
{ // state 458
0x80000000|476, // match move
0x80000000|672, // no-match move
0x80000000|63, // NT-test-match state for doubleSlash
  }
,
{ // state 459
178,MIN_REDUCTION+315, // $NT
  }
,
{ // state 460
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1309, // "/"
161,48, // blockComment
164,1194, // slashStar
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 461
0x80000000|1502, // match move
0x80000000|1856, // no-match move
0x80000000|1622, // NT-test-match state for slashStar
  }
,
{ // state 462
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1309, // "/"
161,48, // blockComment
164,1194, // slashStar
MIN_REDUCTION+253, // (default reduction)
  }
,
{ // state 463
0x80000000|533, // match move
0x80000000|150, // no-match move
0x80000000|1622, // NT-test-match state for slashStar
  }
,
{ // state 464
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1309, // "/"
161,48, // blockComment
164,1194, // slashStar
MIN_REDUCTION+165, // (default reduction)
  }
,
{ // state 465
MIN_REDUCTION+247, // (default reduction)
  }
,
{ // state 466
2,1301, // white*
125,2024, // white
126,857, // {12}
127,857, // " "
128,857, // {9}
129,1169, // eol
130,977, // comment
131,1299, // {10}
132,884, // {13}
143,1422, // "/"
160,1218, // oneLineComment
161,821, // blockComment
162,1907, // doubleSlash
164,782, // slashStar
178,MIN_REDUCTION+197, // $NT
  }
,
{ // state 467
0x80000000|1225, // match move
0x80000000|1473, // no-match move
0x80000000|1622, // NT-test-match state for slashStar
  }
,
{ // state 468
178,MIN_REDUCTION+294, // $NT
  }
,
{ // state 469
MIN_REDUCTION+24, // (default reduction)
  }
,
{ // state 470
2,201, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
129,482, // eol
130,1769, // comment
131,1062, // {10}
132,1577, // {13}
MIN_REDUCTION+156, // (default reduction)
  }
,
{ // state 471
91,204, // "a"
95,90, // "e"
114,1859, // "u"
  }
,
{ // state 472
0x80000000|1697, // match move
0x80000000|1131, // no-match move
0x80000000|63, // NT-test-match state for doubleSlash
  }
,
{ // state 473
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
129,482, // eol
130,1769, // comment
131,1062, // {10}
132,1577, // {13}
MIN_REDUCTION+253, // (default reduction)
  }
,
{ // state 474
118,761, // "h"
  }
,
{ // state 475
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
129,482, // eol
130,1769, // comment
131,1062, // {10}
132,1577, // {13}
MIN_REDUCTION+171, // (default reduction)
  }
,
{ // state 476
2,1752, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1422, // "/"
160,715, // oneLineComment
161,48, // blockComment
162,732, // doubleSlash
164,1194, // slashStar
MIN_REDUCTION+140, // (default reduction)
  }
,
{ // state 477
120,1847, // "n"
  }
,
{ // state 478
2,1241, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
129,482, // eol
130,1769, // comment
131,1062, // {10}
132,1577, // {13}
MIN_REDUCTION+293, // (default reduction)
  }
,
{ // state 479
125,792, // white
126,857, // {12}
127,857, // " "
128,857, // {9}
129,1169, // eol
130,977, // comment
131,1299, // {10}
132,884, // {13}
143,1422, // "/"
160,1218, // oneLineComment
161,821, // blockComment
162,1907, // doubleSlash
164,782, // slashStar
178,MIN_REDUCTION+274, // $NT
  }
,
{ // state 480
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 481
0x80000000|1187, // match move
0x80000000|1503, // no-match move
0x80000000|1581, // NT-test-match state for reserved
  }
,
{ // state 482
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 483
2,962, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1309, // "/"
161,48, // blockComment
164,1194, // slashStar
MIN_REDUCTION+341, // (default reduction)
  }
,
{ // state 484
2,1779, // white*
125,2024, // white
126,857, // {12}
127,857, // " "
128,857, // {9}
129,1169, // eol
130,977, // comment
131,1299, // {10}
132,884, // {13}
143,1422, // "/"
160,1218, // oneLineComment
161,821, // blockComment
162,1907, // doubleSlash
164,782, // slashStar
178,MIN_REDUCTION+224, // $NT
  }
,
{ // state 485
90,1128, // "l"
  }
,
{ // state 486
MIN_REDUCTION+298, // (default reduction)
  }
,
{ // state 487
0x80000000|798, // match move
0x80000000|1084, // no-match move
0x80000000|1581, // NT-test-match state for reserved
  }
,
{ // state 488
MIN_REDUCTION+292, // (default reduction)
  }
,
{ // state 489
89,36, // "c"
  }
,
{ // state 490
103,1018, // "d"
  }
,
{ // state 491
2,1633, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1422, // "/"
160,715, // oneLineComment
161,48, // blockComment
162,732, // doubleSlash
164,1194, // slashStar
MIN_REDUCTION+299, // (default reduction)
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
{ // state 492
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1309, // "/"
161,48, // blockComment
164,1194, // slashStar
MIN_REDUCTION+202, // (default reduction)
  }
,
{ // state 493
89,1630, // "c"
  }
,
{ // state 494
0x80000000|1894, // match move
0x80000000|562, // no-match move
0x80000000|1622, // NT-test-match state for slashStar
  }
,
{ // state 495
0x80000000|326, // match move
0x80000000|21, // no-match move
0x80000000|1622, // NT-test-match state for slashStar
  }
,
{ // state 496
0x80000000|1, // match move
0x80000000|1540, // no-match move
0x80000000|64, // NT-test-match state for idChar
  }
,
{ // state 497
2,1676, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1422, // "/"
160,715, // oneLineComment
161,48, // blockComment
162,732, // doubleSlash
164,1194, // slashStar
MIN_REDUCTION+230, // (default reduction)
  }
,
{ // state 498
125,792, // white
126,857, // {12}
127,857, // " "
128,857, // {9}
129,1169, // eol
130,977, // comment
131,1299, // {10}
132,884, // {13}
143,1422, // "/"
160,1218, // oneLineComment
161,821, // blockComment
162,1907, // doubleSlash
164,782, // slashStar
178,MIN_REDUCTION+214, // $NT
  }
,
{ // state 499
90,1121, // "l"
  }
,
{ // state 500
2,131, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
129,482, // eol
130,1769, // comment
131,1062, // {10}
132,1577, // {13}
MIN_REDUCTION+209, // (default reduction)
  }
,
{ // state 501
0x80000000|1026, // match move
0x80000000|227, // no-match move
0x80000000|1622, // NT-test-match state for slashStar
  }
,
{ // state 502
0x80000000|1468, // match move
0x80000000|120, // no-match move
0x80000000|63, // NT-test-match state for doubleSlash
  }
,
{ // state 503
2,309, // white*
125,2024, // white
126,857, // {12}
127,857, // " "
128,857, // {9}
129,1169, // eol
130,977, // comment
131,1299, // {10}
132,884, // {13}
143,1422, // "/"
160,1218, // oneLineComment
161,821, // blockComment
162,1907, // doubleSlash
164,782, // slashStar
178,MIN_REDUCTION+308, // $NT
  }
,
{ // state 504
0x80000000|1, // match move
0x80000000|376, // no-match move
0x80000000|64, // NT-test-match state for idChar
  }
,
{ // state 505
113,1331, // "r"
  }
,
{ // state 506
110,583, // "i"
  }
,
{ // state 507
125,792, // white
126,857, // {12}
127,857, // " "
128,857, // {9}
129,1169, // eol
130,977, // comment
131,1299, // {10}
132,884, // {13}
143,1422, // "/"
160,1218, // oneLineComment
161,821, // blockComment
162,1907, // doubleSlash
164,782, // slashStar
178,MIN_REDUCTION+250, // $NT
  }
,
{ // state 508
95,1066, // "e"
  }
,
{ // state 509
90,178, // "l"
  }
,
{ // state 510
0x80000000|1447, // match move
0x80000000|677, // no-match move
0x80000000|1581, // NT-test-match state for reserved
  }
,
{ // state 511
0x80000000|1, // match move
0x80000000|362, // no-match move
0x80000000|64, // NT-test-match state for idChar
  }
,
{ // state 512
112,1991, // "o"
  }
,
{ // state 513
2,385, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1422, // "/"
160,715, // oneLineComment
161,48, // blockComment
162,732, // doubleSlash
164,1194, // slashStar
MIN_REDUCTION+152, // (default reduction)
  }
,
{ // state 514
95,1537, // "e"
  }
,
{ // state 515
0x80000000|1530, // match move
0x80000000|2012, // no-match move
0x80000000|521, // NT-test-match state for letter
  }
,
{ // state 516
90,421, // "l"
  }
,
{ // state 517
89,359, // "c"
  }
,
{ // state 518
178,MIN_REDUCTION+306, // $NT
  }
,
{ // state 519
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1422, // "/"
160,715, // oneLineComment
161,48, // blockComment
162,732, // doubleSlash
164,1194, // slashStar
MIN_REDUCTION+262, // (default reduction)
  }
,
{ // state 520
120,1526, // "n"
  }
,
{ // state 521
89,891, // "c"
90,891, // "l"
91,891, // "a"
92,891, // "s"
95,891, // "e"
103,891, // "d"
104,891, // "g"
105,891, // "m"
106,891, // "p"
107,891, // "v"
108,891, // "y"
109,891, // "f"
110,891, // "i"
111,891, // {"A".."Z"}
112,891, // "o"
113,891, // "r"
114,891, // "u"
115,891, // "x"
116,891, // {"j" "q"}
117,891, // "b"
118,891, // "h"
119,891, // "k"
120,891, // "n"
121,891, // "t"
122,891, // "w"
123,891, // "z"
  }
,
{ // state 522
2,577, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1422, // "/"
160,715, // oneLineComment
161,48, // blockComment
162,732, // doubleSlash
164,1194, // slashStar
MIN_REDUCTION+290, // (default reduction)
  }
,
{ // state 523
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1422, // "/"
160,715, // oneLineComment
161,48, // blockComment
162,732, // doubleSlash
164,1194, // slashStar
MIN_REDUCTION+163, // (default reduction)
  }
,
{ // state 524
2,1119, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
129,482, // eol
130,1769, // comment
131,1062, // {10}
132,1577, // {13}
MIN_REDUCTION+254, // (default reduction)
  }
,
{ // state 525
2,1778, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1422, // "/"
160,715, // oneLineComment
161,48, // blockComment
162,732, // doubleSlash
164,1194, // slashStar
MIN_REDUCTION+248, // (default reduction)
  }
,
{ // state 526
2,1620, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
129,482, // eol
130,1769, // comment
131,1062, // {10}
132,1577, // {13}
169,1730, // idChar**
170,1438, // $$1
175,1467, // idChar*
MIN_REDUCTION+337, // (default reduction)
  }
,
{ // state 527
0x80000000|1865, // match move
0x80000000|1118, // no-match move
0x80000000|63, // NT-test-match state for doubleSlash
  }
,
{ // state 528
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1422, // "/"
160,715, // oneLineComment
161,48, // blockComment
162,732, // doubleSlash
164,1194, // slashStar
MIN_REDUCTION+157, // (default reduction)
  }
,
{ // state 529
114,804, // "u"
  }
,
{ // state 530
MIN_REDUCTION+190, // (default reduction)
  }
,
{ // state 531
2,99, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1309, // "/"
161,48, // blockComment
164,1194, // slashStar
MIN_REDUCTION+332, // (default reduction)
  }
,
{ // state 532
2,1700, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1309, // "/"
161,48, // blockComment
164,1194, // slashStar
MIN_REDUCTION+314, // (default reduction)
  }
,
{ // state 533
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1309, // "/"
161,48, // blockComment
164,1194, // slashStar
MIN_REDUCTION+149, // (default reduction)
  }
,
{ // state 534
98,378, // "+"
  }
,
{ // state 535
MIN_REDUCTION+26, // (default reduction)
  }
,
{ // state 536
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1309, // "/"
161,48, // blockComment
164,1194, // slashStar
MIN_REDUCTION+289, // (default reduction)
  }
,
{ // state 537
0x80000000|1830, // match move
0x80000000|1899, // no-match move
0x80000000|1581, // NT-test-match state for reserved
  }
,
{ // state 538
2,1423, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
129,482, // eol
130,1769, // comment
131,1062, // {10}
132,1577, // {13}
MIN_REDUCTION+203, // (default reduction)
  }
,
{ // state 539
2,1485, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1422, // "/"
160,715, // oneLineComment
161,48, // blockComment
162,732, // doubleSlash
164,1194, // slashStar
MIN_REDUCTION+278, // (default reduction)
  }
,
{ // state 540
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 541
0x80000000|1554, // match move
0x80000000|381, // no-match move
0x80000000|1622, // NT-test-match state for slashStar
  }
,
{ // state 542
2,498, // white*
125,2024, // white
126,857, // {12}
127,857, // " "
128,857, // {9}
129,1169, // eol
130,977, // comment
131,1299, // {10}
132,884, // {13}
143,1422, // "/"
160,1218, // oneLineComment
161,821, // blockComment
162,1907, // doubleSlash
164,782, // slashStar
178,MIN_REDUCTION+215, // $NT
  }
,
{ // state 543
2,1910, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1309, // "/"
161,48, // blockComment
164,1194, // slashStar
MIN_REDUCTION+146, // (default reduction)
  }
,
{ // state 544
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 545
2,1097, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
129,482, // eol
130,1769, // comment
131,1062, // {10}
132,1577, // {13}
MIN_REDUCTION+281, // (default reduction)
  }
,
{ // state 546
121,775, // "t"
  }
,
{ // state 547
178,MIN_REDUCTION+279, // $NT
  }
,
{ // state 548
0x80000000|1483, // match move
0x80000000|436, // no-match move
0x80000000|63, // NT-test-match state for doubleSlash
  }
,
{ // state 549
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
129,482, // eol
130,1769, // comment
131,1062, // {10}
132,1577, // {13}
MIN_REDUCTION+310, // (default reduction)
  }
,
{ // state 550
2,1441, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
129,482, // eol
130,1769, // comment
131,1062, // {10}
132,1577, // {13}
MIN_REDUCTION+200, // (default reduction)
  }
,
{ // state 551
0x80000000|1, // match move
0x80000000|640, // no-match move
0x80000000|521, // NT-test-match state for letter
  }
,
{ // state 552
0x80000000|403, // match move
0x80000000|1664, // no-match move
// T-test match for "=":
97,
  }
,
{ // state 553
2,1211, // white*
MIN_REDUCTION+174, // (default reduction)
  }
,
{ // state 554
91,764, // "a"
  }
,
{ // state 555
103,1411, // "d"
  }
,
{ // state 556
MIN_REDUCTION+360, // (default reduction)
  }
,
{ // state 557
120,1534, // "n"
  }
,
{ // state 558
MIN_REDUCTION+347, // (default reduction)
  }
,
{ // state 559
0x80000000|1433, // match move
0x80000000|443, // no-match move
0x80000000|1581, // NT-test-match state for reserved
  }
,
{ // state 560
121,815, // "t"
  }
,
{ // state 561
2,805, // white*
125,2024, // white
126,857, // {12}
127,857, // " "
128,857, // {9}
129,1169, // eol
130,977, // comment
131,1299, // {10}
132,884, // {13}
143,1422, // "/"
160,1218, // oneLineComment
161,821, // blockComment
162,1907, // doubleSlash
164,782, // slashStar
178,MIN_REDUCTION+272, // $NT
  }
,
{ // state 562
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
129,482, // eol
130,1769, // comment
131,1062, // {10}
132,1577, // {13}
MIN_REDUCTION+226, // (default reduction)
  }
,
{ // state 563
0x80000000|1, // match move
0x80000000|1945, // no-match move
0x80000000|64, // NT-test-match state for idChar
  }
,
{ // state 564
131,1541, // {10}
  }
,
{ // state 565
0x80000000|1785, // match move
0x80000000|1801, // no-match move
0x80000000|1581, // NT-test-match state for reserved
  }
,
{ // state 566
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1422, // "/"
160,715, // oneLineComment
161,48, // blockComment
162,732, // doubleSlash
164,1194, // slashStar
MIN_REDUCTION+202, // (default reduction)
  }
,
{ // state 567
0x80000000|1050, // match move
0x80000000|1387, // no-match move
0x80000000|1581, // NT-test-match state for reserved
  }
,
{ // state 568
2,1311, // white*
97,267, // "="
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1309, // "/"
161,48, // blockComment
164,1194, // slashStar
MIN_REDUCTION+150, // (default reduction)
  }
,
{ // state 569
0x80000000|769, // match move
0x80000000|500, // no-match move
0x80000000|1622, // NT-test-match state for slashStar
  }
,
{ // state 570
177,MIN_REDUCTION+0, // $
  }
,
{ // state 571
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 572
110,1272, // "i"
  }
,
{ // state 573
0x80000000|983, // match move
0x80000000|1972, // no-match move
0x80000000|1622, // NT-test-match state for slashStar
  }
,
{ // state 574
95,763, // "e"
  }
,
{ // state 575
2,692, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
129,482, // eol
130,1769, // comment
131,1062, // {10}
132,1577, // {13}
MIN_REDUCTION+302, // (default reduction)
  }
,
{ // state 576
2,1620, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1422, // "/"
160,715, // oneLineComment
161,48, // blockComment
162,732, // doubleSlash
164,1194, // slashStar
170,1827, // $$1
MIN_REDUCTION+335, // (default reduction)
  }
,
{ // state 577
0x80000000|2004, // match move
0x80000000|966, // no-match move
0x80000000|63, // NT-test-match state for doubleSlash
  }
,
{ // state 578
0x80000000|543, // match move
0x80000000|1333, // no-match move
0x80000000|1622, // NT-test-match state for slashStar
  }
,
{ // state 579
MIN_REDUCTION+165, // (default reduction)
  }
,
{ // state 580
2,928, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
129,482, // eol
130,1769, // comment
131,1062, // {10}
132,1577, // {13}
MIN_REDUCTION+308, // (default reduction)
  }
,
{ // state 581
0x80000000|1, // match move
0x80000000|698, // no-match move
0x80000000|64, // NT-test-match state for idChar
  }
,
{ // state 582
0x80000000|1101, // match move
0x80000000|1357, // no-match move
0x80000000|1622, // NT-test-match state for slashStar
  }
,
{ // state 583
89,193, // "c"
  }
,
{ // state 584
121,274, // "t"
  }
,
{ // state 585
2,1523, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
129,482, // eol
130,1769, // comment
131,1062, // {10}
132,1577, // {13}
MIN_REDUCTION+266, // (default reduction)
  }
,
{ // state 586
MIN_REDUCTION+277, // (default reduction)
  }
,
{ // state 587
0x80000000|1048, // match move
0x80000000|33, // no-match move
0x80000000|1581, // NT-test-match state for reserved
  }
,
{ // state 588
178,MIN_REDUCTION+234, // $NT
  }
,
{ // state 589
MIN_REDUCTION+126, // (default reduction)
  }
,
{ // state 590
95,1030, // "e"
  }
,
{ // state 591
95,1765, // "e"
  }
,
{ // state 592
112,1221, // "o"
  }
,
{ // state 593
0x80000000|1344, // match move
0x80000000|397, // no-match move
0x80000000|63, // NT-test-match state for doubleSlash
  }
,
{ // state 594
0x80000000|1501, // match move
0x80000000|1510, // no-match move
0x80000000|89, // NT-test-match state for digit
  }
,
{ // state 595
118,1196, // "h"
  }
,
{ // state 596
2,1040, // white*
97,267, // "="
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
129,482, // eol
130,1769, // comment
131,1062, // {10}
132,1577, // {13}
143,1422, // "/"
160,715, // oneLineComment
161,48, // blockComment
162,732, // doubleSlash
164,1194, // slashStar
MIN_REDUCTION+152, // (default reduction)
  }
,
{ // state 597
0x80000000|1445, // match move
0x80000000|1303, // no-match move
0x80000000|63, // NT-test-match state for doubleSlash
  }
,
{ // state 598
MIN_REDUCTION+173, // (default reduction)
  }
,
{ // state 599
0x80000000|673, // match move
0x80000000|1436, // no-match move
0x80000000|521, // NT-test-match state for letter
  }
,
{ // state 600
0x80000000|1168, // match move
0x80000000|965, // no-match move
0x80000000|1581, // NT-test-match state for reserved
  }
,
{ // state 601
95,1811, // "e"
  }
,
{ // state 602
MIN_REDUCTION+75, // (default reduction)
  }
,
{ // state 603
MIN_REDUCTION+356, // (default reduction)
  }
,
{ // state 604
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1422, // "/"
160,715, // oneLineComment
161,48, // blockComment
162,732, // doubleSlash
164,1194, // slashStar
MIN_REDUCTION+211, // (default reduction)
  }
,
{ // state 605
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1422, // "/"
160,715, // oneLineComment
161,48, // blockComment
162,732, // doubleSlash
164,1194, // slashStar
MIN_REDUCTION+223, // (default reduction)
  }
,
{ // state 606
178,MIN_REDUCTION+213, // $NT
  }
,
{ // state 607
0x80000000|1213, // match move
0x80000000|822, // no-match move
0x80000000|1581, // NT-test-match state for reserved
  }
,
{ // state 608
MIN_REDUCTION+352, // (default reduction)
  }
,
{ // state 609
0x80000000|1418, // match move
0x80000000|701, // no-match move
0x80000000|63, // NT-test-match state for doubleSlash
  }
,
{ // state 610
2,1570, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1422, // "/"
160,715, // oneLineComment
161,48, // blockComment
162,732, // doubleSlash
164,1194, // slashStar
MIN_REDUCTION+305, // (default reduction)
  }
,
{ // state 611
0x80000000|1, // match move
0x80000000|797, // no-match move
0x80000000|64, // NT-test-match state for idChar
  }
,
{ // state 612
2,527, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1422, // "/"
160,715, // oneLineComment
161,48, // blockComment
162,732, // doubleSlash
164,1194, // slashStar
MIN_REDUCTION+166, // (default reduction)
  }
,
{ // state 613
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1309, // "/"
161,48, // blockComment
164,1194, // slashStar
MIN_REDUCTION+247, // (default reduction)
  }
,
{ // state 614
178,MIN_REDUCTION+130, // $NT
  }
,
{ // state 615
178,MIN_REDUCTION+219, // $NT
  }
,
{ // state 616
107,308, // "v"
  }
,
{ // state 617
120,1992, // "n"
  }
,
{ // state 618
178,MIN_REDUCTION+255, // $NT
  }
,
{ // state 619
121,182, // "t"
  }
,
{ // state 620
95,1248, // "e"
  }
,
{ // state 621
MIN_REDUCTION+360, // (default reduction)
  }
,
{ // state 622
2,4, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1422, // "/"
160,715, // oneLineComment
161,48, // blockComment
162,732, // doubleSlash
164,1194, // slashStar
MIN_REDUCTION+245, // (default reduction)
  }
,
{ // state 623
MIN_REDUCTION+340, // (default reduction)
  }
,
{ // state 624
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1309, // "/"
161,48, // blockComment
164,1194, // slashStar
MIN_REDUCTION+99, // (default reduction)
  }
,
{ // state 625
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 626
120,1820, // "n"
  }
,
{ // state 627
119,1417, // "k"
  }
,
{ // state 628
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1309, // "/"
161,48, // blockComment
164,1194, // slashStar
MIN_REDUCTION+295, // (default reduction)
  }
,
{ // state 629
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1309, // "/"
161,48, // blockComment
164,1194, // slashStar
MIN_REDUCTION+235, // (default reduction)
  }
,
{ // state 630
2,1995, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1309, // "/"
161,48, // blockComment
164,1194, // slashStar
MIN_REDUCTION+284, // (default reduction)
  }
,
{ // state 631
90,94, // "l"
115,1313, // "x"
120,2, // "n"
  }
,
{ // state 632
0x80000000|1, // match move
0x80000000|609, // no-match move
0x80000000|64, // NT-test-match state for idChar
  }
,
{ // state 633
0x80000000|1, // match move
0x80000000|1728, // no-match move
0x80000000|64, // NT-test-match state for idChar
  }
,
{ // state 634
0x80000000|1, // match move
0x80000000|796, // no-match move
0x80000000|64, // NT-test-match state for idChar
  }
,
{ // state 635
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1309, // "/"
161,48, // blockComment
164,1194, // slashStar
MIN_REDUCTION+241, // (default reduction)
  }
,
{ // state 636
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1309, // "/"
161,48, // blockComment
164,1194, // slashStar
MIN_REDUCTION+220, // (default reduction)
  }
,
{ // state 637
89,1346, // "c"
  }
,
{ // state 638
2,781, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
129,482, // eol
130,1769, // comment
131,1062, // {10}
132,1577, // {13}
MIN_REDUCTION+218, // (default reduction)
  }
,
{ // state 639
125,792, // white
126,857, // {12}
127,857, // " "
128,857, // {9}
129,1169, // eol
130,977, // comment
131,1299, // {10}
132,884, // {13}
143,1422, // "/"
160,1218, // oneLineComment
161,821, // blockComment
162,1907, // doubleSlash
164,782, // slashStar
178,MIN_REDUCTION+211, // $NT
  }
,
{ // state 640
102,MIN_REDUCTION+104, // "_"
169,MIN_REDUCTION+104, // idChar**
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 641
106,1189, // "p"
  }
,
{ // state 642
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
129,482, // eol
130,1769, // comment
131,1062, // {10}
132,1577, // {13}
MIN_REDUCTION+292, // (default reduction)
  }
,
{ // state 643
0x80000000|1, // match move
0x80000000|282, // no-match move
0x80000000|64, // NT-test-match state for idChar
  }
,
{ // state 644
0x80000000|1, // match move
0x80000000|1334, // no-match move
0x80000000|64, // NT-test-match state for idChar
  }
,
{ // state 645
MIN_REDUCTION+114, // (default reduction)
  }
,
{ // state 646
110,616, // "i"
112,619, // "o"
  }
,
{ // state 647
0x80000000|1, // match move
0x80000000|1720, // no-match move
0x80000000|64, // NT-test-match state for idChar
  }
,
{ // state 648
0x80000000|1551, // match move
0x80000000|1421, // no-match move
0x80000000|63, // NT-test-match state for doubleSlash
  }
,
{ // state 649
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1309, // "/"
161,48, // blockComment
164,1194, // slashStar
MIN_REDUCTION+217, // (default reduction)
  }
,
{ // state 650
MIN_REDUCTION+34, // (default reduction)
  }
,
{ // state 651
2,1921, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1309, // "/"
161,48, // blockComment
164,1194, // slashStar
MIN_REDUCTION+272, // (default reduction)
  }
,
{ // state 652
0x80000000|586, // match move
0x80000000|541, // no-match move
0x80000000|1581, // NT-test-match state for reserved
  }
,
{ // state 653
0x80000000|1195, // match move
0x80000000|551, // no-match move
0x80000000|64, // NT-test-match state for idChar
  }
,
{ // state 654
2,873, // white*
MIN_REDUCTION+96, // (default reduction)
  }
,
{ // state 655
2,697, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1422, // "/"
160,715, // oneLineComment
161,48, // blockComment
162,732, // doubleSlash
164,1194, // slashStar
MIN_REDUCTION+206, // (default reduction)
  }
,
{ // state 656
MIN_REDUCTION+223, // (default reduction)
  }
,
{ // state 657
MIN_REDUCTION+62, // (default reduction)
  }
,
{ // state 658
95,1505, // "e"
  }
,
{ // state 659
125,792, // white
126,857, // {12}
127,857, // " "
128,857, // {9}
129,1169, // eol
130,977, // comment
131,1299, // {10}
132,884, // {13}
143,1422, // "/"
160,1218, // oneLineComment
161,821, // blockComment
162,1907, // doubleSlash
164,782, // slashStar
178,MIN_REDUCTION+331, // $NT
  }
,
{ // state 660
2,548, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1422, // "/"
160,715, // oneLineComment
161,48, // blockComment
162,732, // doubleSlash
164,1194, // slashStar
MIN_REDUCTION+162, // (default reduction)
  }
,
{ // state 661
89,1655, // "c"
90,1655, // "l"
91,1655, // "a"
92,1655, // "s"
95,1655, // "e"
96,1668, // "!"
97,645, // "="
98,645, // "+"
102,1655, // "_"
103,1655, // "d"
104,1655, // "g"
105,1655, // "m"
106,1655, // "p"
107,1655, // "v"
108,1655, // "y"
109,1655, // "f"
110,1655, // "i"
111,645, // {"A".."Z"}
112,1655, // "o"
113,1655, // "r"
114,1655, // "u"
115,1655, // "x"
116,1655, // {"j" "q"}
117,1655, // "b"
118,1655, // "h"
119,1655, // "k"
120,1655, // "n"
121,1655, // "t"
122,1655, // "w"
123,1655, // "z"
124,645, // {"0".."9"}
127,1668, // " "
134,645, // "["
135,645, // "-"
136,645, // "<"
137,1655, // "|"
138,645, // {"?".."@"}
139,645, // "&"
140,645, // ")"
141,645, // ","
142,1655, // "]"
143,645, // "/"
144,645, // {"#".."$"}
145,645, // ";"
146,645, // ">"
147,1655, // "{"
148,645, // "%"
149,645, // "("
151,645, // "."
152,645, // ":"
153,1655, // "}"
154,1655, // {"^" "`" "~"}
155,645, // "'"
156,1777, // '"'
157,645, // "*"
158,736, // stringPrintable
171,1362, // stringPrintable*
172,1677, // $$2
  }
,
{ // state 662
2,873, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
129,482, // eol
130,1769, // comment
131,1062, // {10}
132,1577, // {13}
MIN_REDUCTION+96, // (default reduction)
  }
,
{ // state 663
2,1880, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1422, // "/"
160,715, // oneLineComment
161,48, // blockComment
162,732, // doubleSlash
164,1194, // slashStar
MIN_REDUCTION+191, // (default reduction)
  }
,
{ // state 664
2,1120, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1309, // "/"
161,48, // blockComment
164,1194, // slashStar
MIN_REDUCTION+287, // (default reduction)
  }
,
{ // state 665
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1309, // "/"
161,48, // blockComment
164,1194, // slashStar
MIN_REDUCTION+181, // (default reduction)
  }
,
{ // state 666
0x80000000|925, // match move
0x80000000|993, // no-match move
0x80000000|1581, // NT-test-match state for reserved
  }
,
{ // state 667
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 668
0x80000000|1732, // match move
0x80000000|1863, // no-match move
0x80000000|1581, // NT-test-match state for reserved
  }
,
{ // state 669
2,296, // white*
125,2024, // white
126,857, // {12}
127,857, // " "
128,857, // {9}
129,1169, // eol
130,977, // comment
131,1299, // {10}
132,884, // {13}
143,1422, // "/"
160,1218, // oneLineComment
161,821, // blockComment
162,1907, // doubleSlash
164,782, // slashStar
178,MIN_REDUCTION+329, // $NT
  }
,
{ // state 670
MIN_REDUCTION+244, // (default reduction)
  }
,
{ // state 671
91,907, // "a"
  }
,
{ // state 672
0x80000000|1215, // match move
0x80000000|1850, // no-match move
0x80000000|1581, // NT-test-match state for reserved
  }
,
{ // state 673
MIN_REDUCTION+357, // (default reduction)
  }
,
{ // state 674
MIN_REDUCTION+37, // (default reduction)
  }
,
{ // state 675
2,1938, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
129,482, // eol
130,1769, // comment
131,1062, // {10}
132,1577, // {13}
MIN_REDUCTION+164, // (default reduction)
  }
,
{ // state 676
0x80000000|1373, // match move
0x80000000|1171, // no-match move
0x80000000|63, // NT-test-match state for doubleSlash
  }
,
{ // state 677
0x80000000|1471, // match move
0x80000000|96, // no-match move
0x80000000|1622, // NT-test-match state for slashStar
  }
,
{ // state 678
92,1158, // "s"
  }
,
{ // state 679
MIN_REDUCTION+7, // (default reduction)
  }
,
{ // state 680
0x80000000|180, // match move
0x80000000|1257, // no-match move
0x80000000|1581, // NT-test-match state for reserved
  }
,
{ // state 681
178,MIN_REDUCTION+288, // $NT
  }
,
{ // state 682
2,928, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1422, // "/"
160,715, // oneLineComment
161,48, // blockComment
162,732, // doubleSlash
164,1194, // slashStar
MIN_REDUCTION+308, // (default reduction)
  }
,
{ // state 683
0x80000000|1340, // match move
0x80000000|1566, // no-match move
0x80000000|1622, // NT-test-match state for slashStar
  }
,
{ // state 684
MIN_REDUCTION+131, // (default reduction)
  }
,
{ // state 685
MIN_REDUCTION+61, // (default reduction)
  }
,
{ // state 686
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1422, // "/"
160,715, // oneLineComment
161,48, // blockComment
162,732, // doubleSlash
164,1194, // slashStar
MIN_REDUCTION+247, // (default reduction)
  }
,
{ // state 687
95,1435, // "e"
  }
,
{ // state 688
2,1874, // white*
125,2024, // white
126,857, // {12}
127,857, // " "
128,857, // {9}
129,1169, // eol
130,977, // comment
131,1299, // {10}
132,884, // {13}
143,1422, // "/"
160,1218, // oneLineComment
161,821, // blockComment
162,1907, // doubleSlash
164,782, // slashStar
178,MIN_REDUCTION+296, // $NT
  }
,
{ // state 689
92,80, // "s"
  }
,
{ // state 690
112,363, // "o"
  }
,
{ // state 691
91,1232, // "a"
  }
,
{ // state 692
0x80000000|1429, // match move
0x80000000|1298, // no-match move
0x80000000|63, // NT-test-match state for doubleSlash
  }
,
{ // state 693
109,1149, // "f"
  }
,
{ // state 694
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
129,482, // eol
130,1769, // comment
131,1062, // {10}
132,1577, // {13}
MIN_REDUCTION+151, // (default reduction)
  }
,
{ // state 695
0x80000000|289, // match move
0x80000000|1683, // no-match move
0x80000000|1622, // NT-test-match state for slashStar
  }
,
{ // state 696
0x80000000|1274, // match move
0x80000000|1409, // no-match move
0x80000000|64, // NT-test-match state for idChar
  }
,
{ // state 697
0x80000000|1669, // match move
0x80000000|38, // no-match move
0x80000000|63, // NT-test-match state for doubleSlash
  }
,
{ // state 698
0x80000000|1533, // match move
0x80000000|1739, // no-match move
0x80000000|63, // NT-test-match state for doubleSlash
  }
,
{ // state 699
MIN_REDUCTION+20, // (default reduction)
  }
,
{ // state 700
MIN_REDUCTION+151, // (default reduction)
  }
,
{ // state 701
0x80000000|1546, // match move
0x80000000|255, // no-match move
0x80000000|1622, // NT-test-match state for slashStar
  }
,
{ // state 702
MIN_REDUCTION+349, // (default reduction)
  }
,
{ // state 703
95,358, // "e"
  }
,
{ // state 704
0x80000000|1455, // match move
0x80000000|1694, // no-match move
0x80000000|63, // NT-test-match state for doubleSlash
  }
,
{ // state 705
106,1818, // "p"
  }
,
{ // state 706
2,1746, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1422, // "/"
160,715, // oneLineComment
161,48, // blockComment
162,732, // doubleSlash
164,1194, // slashStar
MIN_REDUCTION+257, // (default reduction)
  }
,
{ // state 707
112,893, // "o"
  }
,
{ // state 708
125,792, // white
126,857, // {12}
127,857, // " "
128,857, // {9}
129,1169, // eol
130,977, // comment
131,1299, // {10}
132,884, // {13}
143,1422, // "/"
160,1218, // oneLineComment
161,821, // blockComment
162,1907, // doubleSlash
164,782, // slashStar
178,MIN_REDUCTION+325, // $NT
  }
,
{ // state 709
113,398, // "r"
  }
,
{ // state 710
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1422, // "/"
160,715, // oneLineComment
161,48, // blockComment
162,732, // doubleSlash
164,1194, // slashStar
MIN_REDUCTION+268, // (default reduction)
  }
,
{ // state 711
0x80000000|433, // match move
0x80000000|1162, // no-match move
0x80000000|1622, // NT-test-match state for slashStar
  }
,
{ // state 712
MIN_REDUCTION+348, // (default reduction)
  }
,
{ // state 713
0x80000000|539, // match move
0x80000000|1959, // no-match move
0x80000000|63, // NT-test-match state for doubleSlash
  }
,
{ // state 714
2,1086, // white*
125,2024, // white
126,857, // {12}
127,857, // " "
128,857, // {9}
129,1169, // eol
130,977, // comment
131,1299, // {10}
132,884, // {13}
143,1422, // "/"
160,1218, // oneLineComment
161,821, // blockComment
162,1907, // doubleSlash
164,782, // slashStar
178,MIN_REDUCTION+182, // $NT
  }
,
{ // state 715
MIN_REDUCTION+119, // (default reduction)
  }
,
{ // state 716
95,943, // "e"
  }
,
{ // state 717
178,MIN_REDUCTION+222, // $NT
  }
,
{ // state 718
0x80000000|128, // match move
0x80000000|694, // no-match move
0x80000000|1622, // NT-test-match state for slashStar
  }
,
{ // state 719
MIN_REDUCTION+356, // (default reduction)
  }
,
{ // state 720
0x80000000|1555, // match move
0x80000000|1549, // no-match move
0x80000000|1581, // NT-test-match state for reserved
  }
,
{ // state 721
121,934, // "t"
  }
,
{ // state 722
0x80000000|1940, // match move
0x80000000|828, // no-match move
0x80000000|63, // NT-test-match state for doubleSlash
  }
,
{ // state 723
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1422, // "/"
160,715, // oneLineComment
161,48, // blockComment
162,732, // doubleSlash
164,1194, // slashStar
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 724
MIN_REDUCTION+125, // (default reduction)
  }
,
{ // state 725
2,418, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
129,482, // eol
130,1769, // comment
131,1062, // {10}
132,1577, // {13}
MIN_REDUCTION+263, // (default reduction)
  }
,
{ // state 726
0x80000000|1591, // match move
0x80000000|817, // no-match move
0x80000000|63, // NT-test-match state for doubleSlash
  }
,
{ // state 727
2,385, // white*
MIN_REDUCTION+152, // (default reduction)
  }
,
{ // state 728
0x80000000|356, // match move
0x80000000|1090, // no-match move
0x80000000|1622, // NT-test-match state for slashStar
  }
,
{ // state 729
2,1938, // white*
MIN_REDUCTION+164, // (default reduction)
  }
,
{ // state 730
2,1676, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1309, // "/"
161,48, // blockComment
164,1194, // slashStar
MIN_REDUCTION+230, // (default reduction)
  }
,
{ // state 731
2,1716, // white*
125,2024, // white
126,857, // {12}
127,857, // " "
128,857, // {9}
129,1169, // eol
130,977, // comment
131,1299, // {10}
132,884, // {13}
143,1422, // "/"
160,1218, // oneLineComment
161,821, // blockComment
162,1907, // doubleSlash
164,782, // slashStar
178,MIN_REDUCTION+194, // $NT
  }
,
{ // state 732
89,1393, // "c"
90,1393, // "l"
91,1393, // "a"
92,1393, // "s"
95,1393, // "e"
96,1393, // "!"
97,1393, // "="
98,1393, // "+"
102,1393, // "_"
103,1393, // "d"
104,1393, // "g"
105,1393, // "m"
106,1393, // "p"
107,1393, // "v"
108,1393, // "y"
109,1393, // "f"
110,1393, // "i"
111,1393, // {"A".."Z"}
112,1393, // "o"
113,1393, // "r"
114,1393, // "u"
115,1393, // "x"
116,1393, // {"j" "q"}
117,1393, // "b"
118,1393, // "h"
119,1393, // "k"
120,1393, // "n"
121,1393, // "t"
122,1393, // "w"
123,1393, // "z"
124,1393, // {"0".."9"}
127,1393, // " "
129,950, // eol
131,1062, // {10}
132,1577, // {13}
133,558, // printable
134,1393, // "["
135,1393, // "-"
136,1393, // "<"
137,1393, // "|"
138,1393, // {"?".."@"}
139,1393, // "&"
140,1393, // ")"
141,1393, // ","
142,1393, // "]"
143,1393, // "/"
144,1393, // {"#".."$"}
145,1393, // ";"
146,1393, // ">"
147,1393, // "{"
148,1393, // "%"
149,1393, // "("
150,1393, // "\"
151,1393, // "."
152,1393, // ":"
153,1393, // "}"
154,1393, // {"^" "`" "~"}
155,1393, // "'"
156,1393, // '"'
157,1393, // "*"
163,1902, // printable*
  }
,
{ // state 733
2,1528, // white*
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 734
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
129,482, // eol
130,1769, // comment
131,1062, // {10}
132,1577, // {13}
MIN_REDUCTION+214, // (default reduction)
  }
,
{ // state 735
MIN_REDUCTION+6, // (default reduction)
  }
,
{ // state 736
MIN_REDUCTION+353, // (default reduction)
  }
,
{ // state 737
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1309, // "/"
161,48, // blockComment
164,1194, // slashStar
MIN_REDUCTION+223, // (default reduction)
  }
,
{ // state 738
MIN_REDUCTION+84, // (default reduction)
  }
,
{ // state 739
0x80000000|232, // match move
0x80000000|478, // no-match move
0x80000000|1622, // NT-test-match state for slashStar
  }
,
{ // state 740
125,792, // white
126,857, // {12}
127,857, // " "
128,857, // {9}
129,1169, // eol
130,977, // comment
131,1299, // {10}
132,884, // {13}
143,1422, // "/"
160,1218, // oneLineComment
161,821, // blockComment
162,1907, // doubleSlash
164,782, // slashStar
178,MIN_REDUCTION+232, // $NT
  }
,
{ // state 741
0x80000000|311, // match move
0x80000000|45, // no-match move
0x80000000|1581, // NT-test-match state for reserved
  }
,
{ // state 742
2,1570, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1309, // "/"
161,48, // blockComment
164,1194, // slashStar
MIN_REDUCTION+305, // (default reduction)
  }
,
{ // state 743
2,1532, // white*
125,2024, // white
126,857, // {12}
127,857, // " "
128,857, // {9}
129,1169, // eol
130,977, // comment
131,1299, // {10}
132,884, // {13}
143,1422, // "/"
160,1218, // oneLineComment
161,821, // blockComment
162,1907, // doubleSlash
164,782, // slashStar
178,MIN_REDUCTION+209, // $NT
  }
,
{ // state 744
2,1210, // white*
125,2024, // white
126,857, // {12}
127,857, // " "
128,857, // {9}
129,1169, // eol
130,977, // comment
131,1299, // {10}
132,884, // {13}
143,1422, // "/"
160,1218, // oneLineComment
161,821, // blockComment
162,1907, // doubleSlash
164,782, // slashStar
178,MIN_REDUCTION+278, // $NT
  }
,
{ // state 745
MIN_REDUCTION+184, // (default reduction)
  }
,
{ // state 746
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1422, // "/"
160,715, // oneLineComment
161,48, // blockComment
162,732, // doubleSlash
164,1194, // slashStar
MIN_REDUCTION+232, // (default reduction)
  }
,
{ // state 747
105,224, // "m"
  }
,
{ // state 748
MIN_REDUCTION+12, // (default reduction)
  }
,
{ // state 749
103,643, // "d"
  }
,
{ // state 750
2,866, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
129,482, // eol
130,1769, // comment
131,1062, // {10}
132,1577, // {13}
MIN_REDUCTION+242, // (default reduction)
  }
,
{ // state 751
2,1164, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
129,482, // eol
130,1769, // comment
131,1062, // {10}
132,1577, // {13}
MIN_REDUCTION+170, // (default reduction)
  }
,
{ // state 752
121,1359, // "t"
  }
,
{ // state 753
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1422, // "/"
160,715, // oneLineComment
161,48, // blockComment
162,732, // doubleSlash
164,1194, // slashStar
MIN_REDUCTION+199, // (default reduction)
  }
,
{ // state 754
120,1150, // "n"
  }
,
{ // state 755
0x80000000|1, // match move
0x80000000|1251, // no-match move
0x80000000|64, // NT-test-match state for idChar
  }
,
{ // state 756
2,1826, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
129,482, // eol
130,1769, // comment
131,1062, // {10}
132,1577, // {13}
MIN_REDUCTION+224, // (default reduction)
  }
,
{ // state 757
2,472, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
129,482, // eol
130,1769, // comment
131,1062, // {10}
132,1577, // {13}
MIN_REDUCTION+323, // (default reduction)
  }
,
{ // state 758
89,1393, // "c"
90,1393, // "l"
91,1393, // "a"
92,1393, // "s"
95,1393, // "e"
96,1393, // "!"
97,1393, // "="
98,1393, // "+"
102,1393, // "_"
103,1393, // "d"
104,1393, // "g"
105,1393, // "m"
106,1393, // "p"
107,1393, // "v"
108,1393, // "y"
109,1393, // "f"
110,1393, // "i"
111,1393, // {"A".."Z"}
112,1393, // "o"
113,1393, // "r"
114,1393, // "u"
115,1393, // "x"
116,1393, // {"j" "q"}
117,1393, // "b"
118,1393, // "h"
119,1393, // "k"
120,1393, // "n"
121,1393, // "t"
122,1393, // "w"
123,1393, // "z"
124,1393, // {"0".."9"}
127,1393, // " "
129,831, // eol
131,71, // {10}
132,1509, // {13}
133,1255, // printable
134,1393, // "["
135,1393, // "-"
136,1393, // "<"
137,1393, // "|"
138,1393, // {"?".."@"}
139,1393, // "&"
140,1393, // ")"
141,1393, // ","
142,1393, // "]"
143,1393, // "/"
144,1393, // {"#".."$"}
145,1393, // ";"
146,1393, // ">"
147,1393, // "{"
148,1393, // "%"
149,1393, // "("
150,1393, // "\"
151,1393, // "."
152,1393, // ":"
153,1393, // "}"
154,1393, // {"^" "`" "~"}
155,1393, // "'"
156,1393, // '"'
157,1393, // "*"
  }
,
{ // state 759
MIN_REDUCTION+52, // (default reduction)
  }
,
{ // state 760
110,320, // "i"
  }
,
{ // state 761
0x80000000|1, // match move
0x80000000|704, // no-match move
0x80000000|64, // NT-test-match state for idChar
  }
,
{ // state 762
2,1325, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1422, // "/"
160,715, // oneLineComment
161,48, // blockComment
162,732, // doubleSlash
164,1194, // slashStar
MIN_REDUCTION+197, // (default reduction)
  }
,
{ // state 763
113,1320, // "r"
  }
,
{ // state 764
89,1083, // "c"
  }
,
{ // state 765
0x80000000|1964, // match move
0x80000000|833, // no-match move
0x80000000|1622, // NT-test-match state for slashStar
  }
,
{ // state 766
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
129,482, // eol
130,1769, // comment
131,1062, // {10}
132,1577, // {13}
MIN_REDUCTION+232, // (default reduction)
  }
,
{ // state 767
0x80000000|250, // match move
0x80000000|1529, // no-match move
0x80000000|1581, // NT-test-match state for reserved
  }
,
{ // state 768
0x80000000|60, // match move
0x80000000|269, // no-match move
0x80000000|1622, // NT-test-match state for slashStar
  }
,
{ // state 769
2,131, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1309, // "/"
161,48, // blockComment
164,1194, // slashStar
MIN_REDUCTION+209, // (default reduction)
  }
,
{ // state 770
0x80000000|1, // match move
0x80000000|1236, // no-match move
0x80000000|521, // NT-test-match state for letter
  }
,
{ // state 771
95,644, // "e"
  }
,
{ // state 772
178,MIN_REDUCTION+321, // $NT
  }
,
{ // state 773
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1422, // "/"
160,715, // oneLineComment
161,48, // blockComment
162,732, // doubleSlash
164,1194, // slashStar
MIN_REDUCTION+145, // (default reduction)
  }
,
{ // state 774
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
129,482, // eol
130,1769, // comment
131,1062, // {10}
132,1577, // {13}
MIN_REDUCTION+304, // (default reduction)
  }
,
{ // state 775
112,1200, // "o"
  }
,
{ // state 776
120,493, // "n"
  }
,
{ // state 777
0x80000000|1542, // match move
0x80000000|638, // no-match move
0x80000000|1622, // NT-test-match state for slashStar
  }
,
{ // state 778
MIN_REDUCTION+78, // (default reduction)
  }
,
{ // state 779
0x80000000|1691, // match move
0x80000000|453, // no-match move
0x80000000|1622, // NT-test-match state for slashStar
  }
,
{ // state 780
2,1781, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
129,482, // eol
130,1769, // comment
131,1062, // {10}
132,1577, // {13}
MIN_REDUCTION+138, // (default reduction)
  }
,
{ // state 781
0x80000000|141, // match move
0x80000000|1291, // no-match move
0x80000000|63, // NT-test-match state for doubleSlash
  }
,
{ // state 782
89,724, // "c"
90,724, // "l"
91,724, // "a"
92,724, // "s"
95,724, // "e"
96,724, // "!"
97,724, // "="
98,724, // "+"
102,724, // "_"
103,724, // "d"
104,724, // "g"
105,724, // "m"
106,724, // "p"
107,724, // "v"
108,724, // "y"
109,724, // "f"
110,724, // "i"
111,724, // {"A".."Z"}
112,724, // "o"
113,724, // "r"
114,724, // "u"
115,724, // "x"
116,724, // {"j" "q"}
117,724, // "b"
118,724, // "h"
119,724, // "k"
120,724, // "n"
121,724, // "t"
122,724, // "w"
123,724, // "z"
124,724, // {"0".."9"}
127,724, // " "
128,724, // {9}
129,1228, // eol
131,343, // {10}
132,367, // {13}
134,724, // "["
135,724, // "-"
136,724, // "<"
137,724, // "|"
138,724, // {"?".."@"}
139,724, // "&"
140,724, // ")"
141,724, // ","
142,724, // "]"
143,724, // "/"
144,724, // {"#".."$"}
145,724, // ";"
146,724, // ">"
147,724, // "{"
148,724, // "%"
149,724, // "("
150,724, // "\"
151,724, // "."
152,724, // ":"
153,724, // "}"
154,724, // {"^" "`" "~"}
155,724, // "'"
156,724, // '"'
157,847, // "*"
165,134, // blockCommentContent*
166,1931, // starSlash
167,1201, // blockCommentContent
  }
,
{ // state 783
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1309, // "/"
161,48, // blockComment
164,1194, // slashStar
MIN_REDUCTION+141, // (default reduction)
  }
,
{ // state 784
2,215, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1309, // "/"
161,48, // blockComment
164,1194, // slashStar
MIN_REDUCTION+172, // (default reduction)
  }
,
{ // state 785
1,570, // start
2,1643, // white*
3,1862, // $$0
4,1056, // token
125,1568, // white
126,1479, // {12}
127,1479, // " "
128,1479, // {9}
130,1375, // comment
143,1422, // "/"
160,1629, // oneLineComment
161,1106, // blockComment
162,2020, // doubleSlash
164,1520, // slashStar
173,1599, // token*
177,MIN_REDUCTION+1, // $
  }
,
{ // state 786
0x80000000|105, // match move
0x80000000|1113, // no-match move
0x80000000|1581, // NT-test-match state for reserved
  }
,
{ // state 787
0x80000000|630, // match move
0x80000000|319, // no-match move
0x80000000|1622, // NT-test-match state for slashStar
  }
,
{ // state 788
0x80000000|497, // match move
0x80000000|1763, // no-match move
0x80000000|63, // NT-test-match state for doubleSlash
  }
,
{ // state 789
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1309, // "/"
161,48, // blockComment
164,1194, // slashStar
MIN_REDUCTION+143, // (default reduction)
  }
,
{ // state 790
106,303, // "p"
  }
,
{ // state 791
2,1388, // white*
125,2024, // white
126,857, // {12}
127,857, // " "
128,857, // {9}
129,1169, // eol
130,977, // comment
131,1299, // {10}
132,884, // {13}
143,1422, // "/"
160,1218, // oneLineComment
161,821, // blockComment
162,1907, // doubleSlash
164,782, // slashStar
178,MIN_REDUCTION+263, // $NT
  }
,
{ // state 792
178,MIN_REDUCTION+348, // $NT
MIN_REDUCTION+348, // (default reduction)
  }
,
{ // state 793
MIN_REDUCTION+86, // (default reduction)
  }
,
{ // state 794
0x80000000|1126, // match move
0x80000000|1410, // no-match move
0x80000000|1622, // NT-test-match state for slashStar
  }
,
{ // state 795
0x80000000|1960, // match move
0x80000000|767, // no-match move
0x80000000|63, // NT-test-match state for doubleSlash
  }
,
{ // state 796
0x80000000|1070, // match move
0x80000000|1854, // no-match move
0x80000000|63, // NT-test-match state for doubleSlash
  }
,
{ // state 797
0x80000000|401, // match move
0x80000000|205, // no-match move
0x80000000|63, // NT-test-match state for doubleSlash
  }
,
{ // state 798
2,424, // white*
MIN_REDUCTION+154, // (default reduction)
  }
,
{ // state 799
0x80000000|1803, // match move
0x80000000|152, // no-match move
0x80000000|63, // NT-test-match state for doubleSlash
  }
,
{ // state 800
112,709, // "o"
  }
,
{ // state 801
178,MIN_REDUCTION+225, // $NT
  }
,
{ // state 802
121,517, // "t"
  }
,
{ // state 803
2,1370, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1309, // "/"
161,48, // blockComment
164,1194, // slashStar
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 804
95,157, // "e"
  }
,
{ // state 805
125,792, // white
126,857, // {12}
127,857, // " "
128,857, // {9}
129,1169, // eol
130,977, // comment
131,1299, // {10}
132,884, // {13}
143,1422, // "/"
160,1218, // oneLineComment
161,821, // blockComment
162,1907, // doubleSlash
164,782, // slashStar
178,MIN_REDUCTION+271, // $NT
  }
,
{ // state 806
2,507, // white*
125,2024, // white
126,857, // {12}
127,857, // " "
128,857, // {9}
129,1169, // eol
130,977, // comment
131,1299, // {10}
132,884, // {13}
143,1422, // "/"
160,1218, // oneLineComment
161,821, // blockComment
162,1907, // doubleSlash
164,782, // slashStar
178,MIN_REDUCTION+251, // $NT
  }
,
{ // state 807
MIN_REDUCTION+129, // (default reduction)
  }
,
{ // state 808
0x80000000|663, // match move
0x80000000|1983, // no-match move
0x80000000|63, // NT-test-match state for doubleSlash
  }
,
{ // state 809
MIN_REDUCTION+68, // (default reduction)
  }
,
{ // state 810
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1309, // "/"
161,48, // blockComment
164,1194, // slashStar
MIN_REDUCTION+147, // (default reduction)
  }
,
{ // state 811
MIN_REDUCTION+53, // (default reduction)
  }
,
{ // state 812
0x80000000|1, // match move
0x80000000|1133, // no-match move
0x80000000|64, // NT-test-match state for idChar
  }
,
{ // state 813
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1422, // "/"
160,715, // oneLineComment
161,48, // blockComment
162,732, // doubleSlash
164,1194, // slashStar
MIN_REDUCTION+265, // (default reduction)
  }
,
{ // state 814
0x80000000|1, // match move
0x80000000|713, // no-match move
0x80000000|64, // NT-test-match state for idChar
  }
,
{ // state 815
0x80000000|1, // match move
0x80000000|1122, // no-match move
0x80000000|64, // NT-test-match state for idChar
  }
,
{ // state 816
2,1620, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1422, // "/"
160,715, // oneLineComment
161,48, // blockComment
162,732, // doubleSlash
164,1194, // slashStar
169,1730, // idChar**
170,1438, // $$1
175,1467, // idChar*
MIN_REDUCTION+337, // (default reduction)
  }
,
{ // state 817
0x80000000|1504, // match move
0x80000000|750, // no-match move
0x80000000|1622, // NT-test-match state for slashStar
  }
,
{ // state 818
0x80000000|1036, // match move
0x80000000|837, // no-match move
0x80000000|1581, // NT-test-match state for reserved
  }
,
{ // state 819
0x80000000|1715, // match move
0x80000000|1734, // no-match move
0x80000000|1581, // NT-test-match state for reserved
  }
,
{ // state 820
2,1826, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1422, // "/"
160,715, // oneLineComment
161,48, // blockComment
162,732, // doubleSlash
164,1194, // slashStar
MIN_REDUCTION+224, // (default reduction)
  }
,
{ // state 821
178,MIN_REDUCTION+120, // $NT
MIN_REDUCTION+120, // (default reduction)
  }
,
{ // state 822
0x80000000|1831, // match move
0x80000000|69, // no-match move
0x80000000|1622, // NT-test-match state for slashStar
  }
,
{ // state 823
89,1536, // "c"
  }
,
{ // state 824
2,259, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1309, // "/"
161,48, // blockComment
164,1194, // slashStar
MIN_REDUCTION+132, // (default reduction)
  }
,
{ // state 825
2,1662, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
129,482, // eol
130,1769, // comment
131,1062, // {10}
132,1577, // {13}
MIN_REDUCTION+148, // (default reduction)
  }
,
{ // state 826
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1309, // "/"
161,48, // blockComment
164,1194, // slashStar
MIN_REDUCTION+286, // (default reduction)
  }
,
{ // state 827
178,MIN_REDUCTION+195, // $NT
  }
,
{ // state 828
0x80000000|169, // match move
0x80000000|416, // no-match move
0x80000000|1622, // NT-test-match state for slashStar
  }
,
{ // state 829
2,1746, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1309, // "/"
161,48, // blockComment
164,1194, // slashStar
MIN_REDUCTION+257, // (default reduction)
  }
,
{ // state 830
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
129,482, // eol
130,1769, // comment
131,1062, // {10}
132,1577, // {13}
MIN_REDUCTION+196, // (default reduction)
  }
,
{ // state 831
MIN_REDUCTION+121, // (default reduction)
  }
,
{ // state 832
0x80000000|1, // match move
0x80000000|1220, // no-match move
0x80000000|64, // NT-test-match state for idChar
  }
,
{ // state 833
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
129,482, // eol
130,1769, // comment
131,1062, // {10}
132,1577, // {13}
MIN_REDUCTION+175, // (default reduction)
  }
,
{ // state 834
MIN_REDUCTION+175, // (default reduction)
  }
,
{ // state 835
113,812, // "r"
  }
,
{ // state 836
178,MIN_REDUCTION+198, // $NT
  }
,
{ // state 837
0x80000000|810, // match move
0x80000000|1929, // no-match move
0x80000000|1622, // NT-test-match state for slashStar
  }
,
{ // state 838
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1422, // "/"
160,715, // oneLineComment
161,48, // blockComment
162,732, // doubleSlash
164,1194, // slashStar
MIN_REDUCTION+181, // (default reduction)
  }
,
{ // state 839
2,1211, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1422, // "/"
160,715, // oneLineComment
161,48, // blockComment
162,732, // doubleSlash
164,1194, // slashStar
MIN_REDUCTION+174, // (default reduction)
  }
,
{ // state 840
0x80000000|492, // match move
0x80000000|413, // no-match move
0x80000000|1622, // NT-test-match state for slashStar
  }
,
{ // state 841
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
129,482, // eol
130,1769, // comment
131,1062, // {10}
132,1577, // {13}
MIN_REDUCTION+363, // (default reduction)
  }
,
{ // state 842
MIN_REDUCTION+355, // (default reduction)
  }
,
{ // state 843
0x80000000|1327, // match move
0x80000000|1963, // no-match move
0x80000000|63, // NT-test-match state for doubleSlash
  }
,
{ // state 844
95,754, // "e"
  }
,
{ // state 845
89,627, // "c"
  }
,
{ // state 846
0x80000000|880, // match move
0x80000000|1821, // no-match move
0x80000000|1622, // NT-test-match state for slashStar
  }
,
{ // state 847
0x80000000|878, // match move
0x80000000|589, // no-match move
// T-test match for "/":
143,
  }
,
{ // state 848
2,799, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1309, // "/"
161,48, // blockComment
164,1194, // slashStar
MIN_REDUCTION+160, // (default reduction)
  }
,
{ // state 849
MIN_REDUCTION+41, // (default reduction)
  }
,
{ // state 850
178,MIN_REDUCTION+318, // $NT
  }
,
{ // state 851
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 852
2,1164, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1422, // "/"
160,715, // oneLineComment
161,48, // blockComment
162,732, // doubleSlash
164,1194, // slashStar
MIN_REDUCTION+170, // (default reduction)
  }
,
{ // state 853
0x80000000|281, // match move
0x80000000|92, // no-match move
0x80000000|63, // NT-test-match state for doubleSlash
  }
,
{ // state 854
120,88, // "n"
  }
,
{ // state 855
0x80000000|1035, // match move
0x80000000|1939, // no-match move
0x80000000|1622, // NT-test-match state for slashStar
  }
,
{ // state 856
0x80000000|947, // match move
0x80000000|1904, // no-match move
0x80000000|63, // NT-test-match state for doubleSlash
  }
,
{ // state 857
178,MIN_REDUCTION+106, // $NT
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 858
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 859
178,MIN_REDUCTION+210, // $NT
  }
,
{ // state 860
2,1319, // white*
125,2024, // white
126,857, // {12}
127,857, // " "
128,857, // {9}
129,1169, // eol
130,977, // comment
131,1299, // {10}
132,884, // {13}
143,1422, // "/"
160,1218, // oneLineComment
161,821, // blockComment
162,1907, // doubleSlash
164,782, // slashStar
178,MIN_REDUCTION+269, // $NT
  }
,
{ // state 861
113,554, // "r"
  }
,
{ // state 862
95,557, // "e"
  }
,
{ // state 863
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1309, // "/"
161,48, // blockComment
164,1194, // slashStar
MIN_REDUCTION+307, // (default reduction)
  }
,
{ // state 864
178,MIN_REDUCTION+330, // $NT
  }
,
{ // state 865
0x80000000|217, // match move
0x80000000|913, // no-match move
0x80000000|1581, // NT-test-match state for reserved
  }
,
{ // state 866
0x80000000|113, // match move
0x80000000|1515, // no-match move
0x80000000|63, // NT-test-match state for doubleSlash
  }
,
{ // state 867
0x80000000|848, // match move
0x80000000|1192, // no-match move
0x80000000|1622, // NT-test-match state for slashStar
  }
,
{ // state 868
178,MIN_REDUCTION+237, // $NT
  }
,
{ // state 869
112,387, // "o"
  }
,
{ // state 870
0x80000000|1365, // match move
0x80000000|196, // no-match move
0x80000000|1622, // NT-test-match state for slashStar
  }
,
{ // state 871
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1309, // "/"
161,48, // blockComment
164,1194, // slashStar
MIN_REDUCTION+256, // (default reduction)
  }
,
{ // state 872
0x80000000|111, // match move
0x80000000|668, // no-match move
0x80000000|63, // NT-test-match state for doubleSlash
  }
,
{ // state 873
0x80000000|415, // match move
0x80000000|360, // no-match move
0x80000000|63, // NT-test-match state for doubleSlash
  }
,
{ // state 874
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
129,482, // eol
130,1769, // comment
131,1062, // {10}
132,1577, // {13}
MIN_REDUCTION+283, // (default reduction)
  }
,
{ // state 875
MIN_REDUCTION+358, // (default reduction)
  }
,
{ // state 876
113,377, // "r"
118,1868, // "h"
  }
,
{ // state 877
104,1230, // "g"
  }
,
{ // state 878
143,1783, // "/"
  }
,
{ // state 879
2,1722, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1309, // "/"
161,48, // blockComment
164,1194, // slashStar
MIN_REDUCTION+260, // (default reduction)
  }
,
{ // state 880
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1309, // "/"
161,48, // blockComment
164,1194, // slashStar
MIN_REDUCTION+229, // (default reduction)
  }
,
{ // state 881
0x80000000|228, // match move
0x80000000|1013, // no-match move
0x80000000|1622, // NT-test-match state for slashStar
  }
,
{ // state 882
MIN_REDUCTION+60, // (default reduction)
  }
,
{ // state 883
104,1249, // "g"
  }
,
{ // state 884
0x80000000|1089, // match move
0x80000000|1909, // no-match move
// T-test match for 10:
131,
  }
,
{ // state 885
91,283, // "a"
  }
,
{ // state 886
2,1733, // white*
125,2024, // white
126,857, // {12}
127,857, // " "
128,857, // {9}
129,1169, // eol
130,977, // comment
131,1299, // {10}
132,884, // {13}
143,1422, // "/"
160,1218, // oneLineComment
161,821, // blockComment
162,1907, // doubleSlash
164,782, // slashStar
178,MIN_REDUCTION+185, // $NT
  }
,
{ // state 887
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
129,482, // eol
130,1769, // comment
131,1062, // {10}
132,1577, // {13}
MIN_REDUCTION+259, // (default reduction)
  }
,
{ // state 888
2,873, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1422, // "/"
160,715, // oneLineComment
161,48, // blockComment
162,732, // doubleSlash
164,1194, // slashStar
MIN_REDUCTION+96, // (default reduction)
  }
,
{ // state 889
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1422, // "/"
160,715, // oneLineComment
161,48, // blockComment
162,732, // doubleSlash
164,1194, // slashStar
MIN_REDUCTION+139, // (default reduction)
  }
,
{ // state 890
2,374, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1422, // "/"
160,715, // oneLineComment
161,48, // blockComment
162,732, // doubleSlash
164,1194, // slashStar
MIN_REDUCTION+320, // (default reduction)
  }
,
{ // state 891
178,MIN_REDUCTION+104, // $NT
  }
,
{ // state 892
0x80000000|188, // match move
0x80000000|430, // no-match move
0x80000000|1622, // NT-test-match state for slashStar
  }
,
{ // state 893
120,1328, // "n"
  }
,
{ // state 894
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1422, // "/"
160,715, // oneLineComment
161,48, // blockComment
162,732, // doubleSlash
164,1194, // slashStar
MIN_REDUCTION+177, // (default reduction)
  }
,
{ // state 895
MIN_REDUCTION+355, // (default reduction)
  }
,
{ // state 896
0x80000000|1819, // match move
0x80000000|1016, // no-match move
0x80000000|1622, // NT-test-match state for slashStar
  }
,
{ // state 897
0x80000000|1289, // match move
0x80000000|291, // no-match move
0x80000000|1581, // NT-test-match state for reserved
  }
,
{ // state 898
0x80000000|1967, // match move
0x80000000|565, // no-match move
0x80000000|63, // NT-test-match state for doubleSlash
  }
,
{ // state 899
120,98, // "n"
  }
,
{ // state 900
MIN_REDUCTION+359, // (default reduction)
  }
,
{ // state 901
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1422, // "/"
160,715, // oneLineComment
161,48, // blockComment
162,732, // doubleSlash
164,1194, // slashStar
MIN_REDUCTION+143, // (default reduction)
  }
,
{ // state 902
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1422, // "/"
160,715, // oneLineComment
161,48, // blockComment
162,732, // doubleSlash
164,1194, // slashStar
MIN_REDUCTION+304, // (default reduction)
  }
,
{ // state 903
0x80000000|1828, // match move
0x80000000|524, // no-match move
0x80000000|1622, // NT-test-match state for slashStar
  }
,
{ // state 904
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
129,482, // eol
130,1769, // comment
131,1062, // {10}
132,1577, // {13}
MIN_REDUCTION+161, // (default reduction)
  }
,
{ // state 905
MIN_REDUCTION+271, // (default reduction)
  }
,
{ // state 906
0x80000000|1, // match move
0x80000000|788, // no-match move
0x80000000|64, // NT-test-match state for idChar
  }
,
{ // state 907
114,1214, // "u"
  }
,
{ // state 908
MIN_REDUCTION+18, // (default reduction)
  }
,
{ // state 909
2,379, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
129,482, // eol
130,1769, // comment
131,1062, // {10}
132,1577, // {13}
MIN_REDUCTION+100, // (default reduction)
  }
,
{ // state 910
178,MIN_REDUCTION+192, // $NT
  }
,
{ // state 911
0x80000000|425, // match move
0x80000000|1339, // no-match move
0x80000000|1581, // NT-test-match state for reserved
  }
,
{ // state 912
0x80000000|1295, // match move
0x80000000|1474, // no-match move
0x80000000|63, // NT-test-match state for doubleSlash
  }
,
{ // state 913
0x80000000|1667, // match move
0x80000000|1496, // no-match move
0x80000000|1622, // NT-test-match state for slashStar
  }
,
{ // state 914
2,1955, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
129,482, // eol
130,1769, // comment
131,1062, // {10}
132,1577, // {13}
MIN_REDUCTION+296, // (default reduction)
  }
,
{ // state 915
89,724, // "c"
90,724, // "l"
91,724, // "a"
92,724, // "s"
95,724, // "e"
96,724, // "!"
97,724, // "="
98,724, // "+"
102,724, // "_"
103,724, // "d"
104,724, // "g"
105,724, // "m"
106,724, // "p"
107,724, // "v"
108,724, // "y"
109,724, // "f"
110,724, // "i"
111,724, // {"A".."Z"}
112,724, // "o"
113,724, // "r"
114,724, // "u"
115,724, // "x"
116,724, // {"j" "q"}
117,724, // "b"
118,724, // "h"
119,724, // "k"
120,724, // "n"
121,724, // "t"
122,724, // "w"
123,724, // "z"
124,724, // {"0".."9"}
127,724, // " "
128,724, // {9}
129,1228, // eol
131,343, // {10}
132,367, // {13}
134,724, // "["
135,724, // "-"
136,724, // "<"
137,724, // "|"
138,724, // {"?".."@"}
139,724, // "&"
140,724, // ")"
141,724, // ","
142,724, // "]"
143,724, // "/"
144,724, // {"#".."$"}
145,724, // ";"
146,724, // ">"
147,724, // "{"
148,724, // "%"
149,724, // "("
150,724, // "\"
151,724, // "."
152,724, // ":"
153,724, // "}"
154,724, // {"^" "`" "~"}
155,724, // "'"
156,724, // '"'
157,1428, // "*"
166,480, // starSlash
167,442, // blockCommentContent
  }
,
{ // state 916
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
129,482, // eol
130,1769, // comment
131,1062, // {10}
132,1577, // {13}
MIN_REDUCTION+362, // (default reduction)
  }
,
{ // state 917
0x80000000|1449, // match move
0x80000000|987, // no-match move
0x80000000|1581, // NT-test-match state for reserved
  }
,
{ // state 918
90,146, // "l"
  }
,
{ // state 919
110,508, // "i"
  }
,
{ // state 920
0x80000000|486, // match move
0x80000000|1363, // no-match move
0x80000000|1581, // NT-test-match state for reserved
  }
,
{ // state 921
2,259, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1422, // "/"
160,715, // oneLineComment
161,48, // blockComment
162,732, // doubleSlash
164,1194, // slashStar
MIN_REDUCTION+132, // (default reduction)
  }
,
{ // state 922
2,1441, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1422, // "/"
160,715, // oneLineComment
161,48, // blockComment
162,732, // doubleSlash
164,1194, // slashStar
MIN_REDUCTION+200, // (default reduction)
  }
,
{ // state 923
2,1283, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1422, // "/"
160,715, // oneLineComment
161,48, // blockComment
162,732, // doubleSlash
164,1194, // slashStar
MIN_REDUCTION+168, // (default reduction)
  }
,
{ // state 924
178,MIN_REDUCTION+246, // $NT
  }
,
{ // state 925
MIN_REDUCTION+99, // (default reduction)
  }
,
{ // state 926
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1422, // "/"
160,715, // oneLineComment
161,48, // blockComment
162,732, // doubleSlash
164,1194, // slashStar
MIN_REDUCTION+171, // (default reduction)
  }
,
{ // state 927
2,1816, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
129,482, // eol
130,1769, // comment
131,1062, // {10}
132,1577, // {13}
MIN_REDUCTION+144, // (default reduction)
  }
,
{ // state 928
0x80000000|1913, // match move
0x80000000|786, // no-match move
0x80000000|63, // NT-test-match state for doubleSlash
  }
,
{ // state 929
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1422, // "/"
160,715, // oneLineComment
161,48, // blockComment
162,732, // doubleSlash
164,1194, // slashStar
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 930
2,1322, // white*
125,2024, // white
126,857, // {12}
127,857, // " "
128,857, // {9}
129,1169, // eol
130,977, // comment
131,1299, // {10}
132,884, // {13}
143,1422, // "/"
160,1218, // oneLineComment
161,821, // blockComment
162,1907, // doubleSlash
164,782, // slashStar
178,MIN_REDUCTION+317, // $NT
  }
,
{ // state 931
2,1722, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1422, // "/"
160,715, // oneLineComment
161,48, // blockComment
162,732, // doubleSlash
164,1194, // slashStar
MIN_REDUCTION+260, // (default reduction)
  }
,
{ // state 932
0x80000000|1, // match move
0x80000000|1852, // no-match move
0x80000000|64, // NT-test-match state for idChar
  }
,
{ // state 933
0x80000000|1640, // match move
0x80000000|1318, // no-match move
0x80000000|63, // NT-test-match state for doubleSlash
  }
,
{ // state 934
110,165, // "i"
  }
,
{ // state 935
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
129,482, // eol
130,1769, // comment
131,1062, // {10}
132,1577, // {13}
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 936
89,752, // "c"
  }
,
{ // state 937
MIN_REDUCTION+145, // (default reduction)
  }
,
{ // state 938
MIN_REDUCTION+81, // (default reduction)
  }
,
{ // state 939
2,4, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1309, // "/"
161,48, // blockComment
164,1194, // slashStar
MIN_REDUCTION+245, // (default reduction)
  }
,
{ // state 940
125,792, // white
126,857, // {12}
127,857, // " "
128,857, // {9}
129,1169, // eol
130,977, // comment
131,1299, // {10}
132,884, // {13}
143,1422, // "/"
160,1218, // oneLineComment
161,821, // blockComment
162,1907, // doubleSlash
164,782, // slashStar
178,MIN_REDUCTION+292, // $NT
  }
,
{ // state 941
121,1044, // "t"
  }
,
{ // state 942
0x80000000|729, // match move
0x80000000|1795, // no-match move
0x80000000|1581, // NT-test-match state for reserved
  }
,
{ // state 943
113,1958, // "r"
  }
,
{ // state 944
104,634, // "g"
  }
,
{ // state 945
0x80000000|660, // match move
0x80000000|1966, // no-match move
0x80000000|63, // NT-test-match state for doubleSlash
  }
,
{ // state 946
0x80000000|1402, // match move
0x80000000|1572, // no-match move
0x80000000|63, // NT-test-match state for doubleSlash
  }
,
{ // state 947
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1422, // "/"
160,715, // oneLineComment
161,48, // blockComment
162,732, // doubleSlash
164,1194, // slashStar
MIN_REDUCTION+175, // (default reduction)
  }
,
{ // state 948
110,499, // "i"
  }
,
{ // state 949
2,409, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1422, // "/"
160,715, // oneLineComment
161,48, // blockComment
162,732, // doubleSlash
164,1194, // slashStar
MIN_REDUCTION+185, // (default reduction)
  }
,
{ // state 950
MIN_REDUCTION+122, // (default reduction)
  }
,
{ // state 951
2,1528, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1309, // "/"
161,48, // blockComment
164,1194, // slashStar
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 952
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
129,482, // eol
130,1769, // comment
131,1062, // {10}
132,1577, // {13}
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 953
113,1480, // "r"
  }
,
{ // state 954
0x80000000|1741, // match move
0x80000000|1332, // no-match move
0x80000000|1622, // NT-test-match state for slashStar
  }
,
{ // state 955
125,792, // white
126,857, // {12}
127,857, // " "
128,857, // {9}
129,1169, // eol
130,977, // comment
131,1299, // {10}
132,884, // {13}
143,1422, // "/"
160,1218, // oneLineComment
161,821, // blockComment
162,1907, // doubleSlash
164,782, // slashStar
178,MIN_REDUCTION+259, // $NT
  }
,
{ // state 956
2,872, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1422, // "/"
160,715, // oneLineComment
161,48, // blockComment
162,732, // doubleSlash
164,1194, // slashStar
MIN_REDUCTION+236, // (default reduction)
  }
,
{ // state 957
89,1393, // "c"
90,1393, // "l"
91,1393, // "a"
92,1393, // "s"
95,1393, // "e"
96,1393, // "!"
97,1393, // "="
98,1393, // "+"
102,1393, // "_"
103,1393, // "d"
104,1393, // "g"
105,1393, // "m"
106,1393, // "p"
107,1393, // "v"
108,1393, // "y"
109,1393, // "f"
110,1393, // "i"
111,1393, // {"A".."Z"}
112,1393, // "o"
113,1393, // "r"
114,1393, // "u"
115,1393, // "x"
116,1393, // {"j" "q"}
117,1393, // "b"
118,1393, // "h"
119,1393, // "k"
120,1393, // "n"
121,1393, // "t"
122,1393, // "w"
123,1393, // "z"
124,1393, // {"0".."9"}
127,1393, // " "
129,1139, // eol
131,1299, // {10}
132,884, // {13}
133,1255, // printable
134,1393, // "["
135,1393, // "-"
136,1393, // "<"
137,1393, // "|"
138,1393, // {"?".."@"}
139,1393, // "&"
140,1393, // ")"
141,1393, // ","
142,1393, // "]"
143,1393, // "/"
144,1393, // {"#".."$"}
145,1393, // ";"
146,1393, // ">"
147,1393, // "{"
148,1393, // "%"
149,1393, // "("
150,1393, // "\"
151,1393, // "."
152,1393, // ":"
153,1393, // "}"
154,1393, // {"^" "`" "~"}
155,1393, // "'"
156,1393, // '"'
157,1393, // "*"
  }
,
{ // state 958
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1422, // "/"
160,715, // oneLineComment
161,48, // blockComment
162,732, // doubleSlash
164,1194, // slashStar
MIN_REDUCTION+137, // (default reduction)
  }
,
{ // state 959
2,1644, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1309, // "/"
161,48, // blockComment
164,1194, // slashStar
MIN_REDUCTION+158, // (default reduction)
  }
,
{ // state 960
125,792, // white
126,857, // {12}
127,857, // " "
128,857, // {9}
129,1169, // eol
130,977, // comment
131,1299, // {10}
132,884, // {13}
143,1422, // "/"
160,1218, // oneLineComment
161,821, // blockComment
162,1907, // doubleSlash
164,782, // slashStar
178,MIN_REDUCTION+247, // $NT
  }
,
{ // state 961
0x80000000|737, // match move
0x80000000|54, // no-match move
0x80000000|1622, // NT-test-match state for slashStar
  }
,
{ // state 962
0x80000000|1025, // match move
0x80000000|67, // no-match move
0x80000000|63, // NT-test-match state for doubleSlash
  }
,
{ // state 963
95,277, // "e"
  }
,
{ // state 964
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
129,482, // eol
130,1769, // comment
131,1062, // {10}
132,1577, // {13}
MIN_REDUCTION+271, // (default reduction)
  }
,
{ // state 965
0x80000000|1933, // match move
0x80000000|1054, // no-match move
0x80000000|1622, // NT-test-match state for slashStar
  }
,
{ // state 966
0x80000000|1614, // match move
0x80000000|1559, // no-match move
0x80000000|1581, // NT-test-match state for reserved
  }
,
{ // state 967
0x80000000|1, // match move
0x80000000|988, // no-match move
0x80000000|64, // NT-test-match state for idChar
  }
,
{ // state 968
MIN_REDUCTION+80, // (default reduction)
  }
,
{ // state 969
0x80000000|1238, // match move
0x80000000|1548, // no-match move
0x80000000|1581, // NT-test-match state for reserved
  }
,
{ // state 970
89,687, // "c"
  }
,
{ // state 971
143,258, // "/"
  }
,
{ // state 972
2,424, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
129,482, // eol
130,1769, // comment
131,1062, // {10}
132,1577, // {13}
MIN_REDUCTION+154, // (default reduction)
  }
,
{ // state 973
2,1955, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1422, // "/"
160,715, // oneLineComment
161,48, // blockComment
162,732, // doubleSlash
164,1194, // slashStar
MIN_REDUCTION+296, // (default reduction)
  }
,
{ // state 974
MIN_REDUCTION+28, // (default reduction)
  }
,
{ // state 975
0x80000000|1, // match move
0x80000000|2010, // no-match move
0x80000000|64, // NT-test-match state for idChar
  }
,
{ // state 976
0x80000000|1007, // match move
0x80000000|1072, // no-match move
0x80000000|1622, // NT-test-match state for slashStar
  }
,
{ // state 977
178,MIN_REDUCTION+108, // $NT
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 978
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1422, // "/"
160,715, // oneLineComment
161,48, // blockComment
162,732, // doubleSlash
164,1194, // slashStar
MIN_REDUCTION+319, // (default reduction)
  }
,
{ // state 979
0x80000000|460, // match move
0x80000000|1477, // no-match move
0x80000000|1622, // NT-test-match state for slashStar
  }
,
{ // state 980
0x80000000|143, // match move
0x80000000|1968, // no-match move
0x80000000|1622, // NT-test-match state for slashStar
  }
,
{ // state 981
113,1147, // "r"
  }
,
{ // state 982
178,MIN_REDUCTION+324, // $NT
  }
,
{ // state 983
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1309, // "/"
161,48, // blockComment
164,1194, // slashStar
MIN_REDUCTION+244, // (default reduction)
  }
,
{ // state 984
0x80000000|1053, // match move
0x80000000|1408, // no-match move
0x80000000|1622, // NT-test-match state for slashStar
  }
,
{ // state 985
92,1648, // "s"
121,252, // "t"
  }
,
{ // state 986
108,145, // "y"
112,1284, // "o"
113,156, // "r"
  }
,
{ // state 987
0x80000000|568, // match move
0x80000000|181, // no-match move
0x80000000|1622, // NT-test-match state for slashStar
  }
,
{ // state 988
0x80000000|949, // match move
0x80000000|1713, // no-match move
0x80000000|63, // NT-test-match state for doubleSlash
  }
,
{ // state 989
0x80000000|199, // match move
0x80000000|142, // no-match move
0x80000000|1581, // NT-test-match state for reserved
  }
,
{ // state 990
113,693, // "r"
  }
,
{ // state 991
89,1611, // "c"
90,1611, // "l"
91,1611, // "a"
92,1611, // "s"
95,1611, // "e"
96,998, // "!"
97,1944, // "="
98,1944, // "+"
102,1611, // "_"
103,1611, // "d"
104,1611, // "g"
105,1611, // "m"
106,1611, // "p"
107,1611, // "v"
108,1611, // "y"
109,1611, // "f"
110,1611, // "i"
111,1944, // {"A".."Z"}
112,1611, // "o"
113,1611, // "r"
114,1611, // "u"
115,1611, // "x"
116,1611, // {"j" "q"}
117,1611, // "b"
118,1611, // "h"
119,1611, // "k"
120,1611, // "n"
121,1611, // "t"
122,1611, // "w"
123,1611, // "z"
124,1944, // {"0".."9"}
127,998, // " "
134,1944, // "["
135,1944, // "-"
136,1944, // "<"
137,1611, // "|"
138,1944, // {"?".."@"}
139,998, // "&"
140,1944, // ")"
141,1944, // ","
142,1611, // "]"
143,1944, // "/"
144,998, // {"#".."$"}
145,1944, // ";"
146,1944, // ">"
147,1611, // "{"
148,998, // "%"
149,1944, // "("
151,1944, // "."
152,1944, // ":"
153,1611, // "}"
154,1611, // {"^" "`" "~"}
156,998, // '"'
157,1944, // "*"
159,104, // charPrintable
  }
,
{ // state 992
110,9, // "i"
113,869, // "r"
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
{ // state 993
0x80000000|624, // match move
0x80000000|1060, // no-match move
0x80000000|1622, // NT-test-match state for slashStar
  }
,
{ // state 994
178,MIN_REDUCTION+276, // $NT
  }
,
{ // state 995
120,555, // "n"
  }
,
{ // state 996
0x80000000|1475, // match move
0x80000000|1603, // no-match move
0x80000000|63, // NT-test-match state for doubleSlash
  }
,
{ // state 997
2,898, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1422, // "/"
160,715, // oneLineComment
161,48, // blockComment
162,732, // doubleSlash
164,1194, // slashStar
MIN_REDUCTION+275, // (default reduction)
  }
,
{ // state 998
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 999
0x80000000|1464, // match move
0x80000000|2017, // no-match move
// T-test match for "-":
135,
  }
,
{ // state 1000
0x80000000|464, // match move
0x80000000|1159, // no-match move
0x80000000|1622, // NT-test-match state for slashStar
  }
,
{ // state 1001
0x80000000|1069, // match move
0x80000000|976, // no-match move
0x80000000|63, // NT-test-match state for doubleSlash
  }
,
{ // state 1002
117,1476, // "b"
  }
,
{ // state 1003
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
129,482, // eol
130,1769, // comment
131,1062, // {10}
132,1577, // {13}
MIN_REDUCTION+137, // (default reduction)
  }
,
{ // state 1004
0x80000000|1, // match move
0x80000000|996, // no-match move
0x80000000|64, // NT-test-match state for idChar
  }
,
{ // state 1005
MIN_REDUCTION+202, // (default reduction)
  }
,
{ // state 1006
MIN_REDUCTION+358, // (default reduction)
  }
,
{ // state 1007
2,648, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1309, // "/"
161,48, // blockComment
164,1194, // slashStar
MIN_REDUCTION+251, // (default reduction)
  }
,
{ // state 1008
2,1144, // white*
125,2024, // white
126,857, // {12}
127,857, // " "
128,857, // {9}
129,1169, // eol
130,977, // comment
131,1299, // {10}
132,884, // {13}
143,1422, // "/"
160,1218, // oneLineComment
161,821, // blockComment
162,1907, // doubleSlash
164,782, // slashStar
178,MIN_REDUCTION+314, // $NT
  }
,
{ // state 1009
0x80000000|1261, // match move
0x80000000|487, // no-match move
0x80000000|63, // NT-test-match state for doubleSlash
  }
,
{ // state 1010
90,117, // "l"
  }
,
{ // state 1011
0x80000000|1226, // match move
0x80000000|1342, // no-match move
0x80000000|63, // NT-test-match state for doubleSlash
  }
,
{ // state 1012
0x80000000|1495, // match move
0x80000000|251, // no-match move
0x80000000|63, // NT-test-match state for doubleSlash
  }
,
{ // state 1013
2,212, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
129,482, // eol
130,1769, // comment
131,1062, // {10}
132,1577, // {13}
MIN_REDUCTION+188, // (default reduction)
  }
,
{ // state 1014
0x80000000|1129, // match move
0x80000000|440, // no-match move
0x80000000|1622, // NT-test-match state for slashStar
  }
,
{ // state 1015
125,792, // white
126,857, // {12}
127,857, // " "
128,857, // {9}
129,1169, // eol
130,977, // comment
131,1299, // {10}
132,884, // {13}
143,1422, // "/"
160,1218, // oneLineComment
161,821, // blockComment
162,1907, // doubleSlash
164,782, // slashStar
178,MIN_REDUCTION+190, // $NT
  }
,
{ // state 1016
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
129,482, // eol
130,1769, // comment
131,1062, // {10}
132,1577, // {13}
MIN_REDUCTION+131, // (default reduction)
  }
,
{ // state 1017
95,1895, // "e"
  }
,
{ // state 1018
0x80000000|1, // match move
0x80000000|1064, // no-match move
0x80000000|64, // NT-test-match state for idChar
  }
,
{ // state 1019
0x80000000|1901, // match move
0x80000000|964, // no-match move
0x80000000|1622, // NT-test-match state for slashStar
  }
,
{ // state 1020
0x80000000|1635, // match move
0x80000000|1723, // no-match move
0x80000000|1581, // NT-test-match state for reserved
  }
,
{ // state 1021
0x80000000|1973, // match move
0x80000000|757, // no-match move
0x80000000|1622, // NT-test-match state for slashStar
  }
,
{ // state 1022
0x80000000|1849, // match move
0x80000000|272, // no-match move
0x80000000|1581, // NT-test-match state for reserved
  }
,
{ // state 1023
MIN_REDUCTION+65, // (default reduction)
  }
,
{ // state 1024
2,1880, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
129,482, // eol
130,1769, // comment
131,1062, // {10}
132,1577, // {13}
MIN_REDUCTION+191, // (default reduction)
  }
,
{ // state 1025
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1422, // "/"
160,715, // oneLineComment
161,48, // blockComment
162,732, // doubleSlash
164,1194, // slashStar
MIN_REDUCTION+340, // (default reduction)
  }
,
{ // state 1026
2,1325, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1309, // "/"
161,48, // blockComment
164,1194, // slashStar
MIN_REDUCTION+197, // (default reduction)
  }
,
{ // state 1027
MIN_REDUCTION+66, // (default reduction)
  }
,
{ // state 1028
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1309, // "/"
161,48, // blockComment
164,1194, // slashStar
MIN_REDUCTION+331, // (default reduction)
  }
,
{ // state 1029
110,802, // "i"
  }
,
{ // state 1030
0x80000000|1, // match move
0x80000000|1001, // no-match move
0x80000000|64, // NT-test-match state for idChar
  }
,
{ // state 1031
2,241, // white*
125,2024, // white
126,857, // {12}
127,857, // " "
128,857, // {9}
129,1169, // eol
130,977, // comment
131,1299, // {10}
132,884, // {13}
143,1422, // "/"
160,1218, // oneLineComment
161,821, // blockComment
162,1907, // doubleSlash
164,782, // slashStar
178,MIN_REDUCTION+203, // $NT
  }
,
{ // state 1032
2,1523, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1422, // "/"
160,715, // oneLineComment
161,48, // blockComment
162,732, // doubleSlash
164,1194, // slashStar
MIN_REDUCTION+266, // (default reduction)
  }
,
{ // state 1033
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1309, // "/"
161,48, // blockComment
164,1194, // slashStar
MIN_REDUCTION+250, // (default reduction)
  }
,
{ // state 1034
2,1485, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
129,482, // eol
130,1769, // comment
131,1062, // {10}
132,1577, // {13}
MIN_REDUCTION+278, // (default reduction)
  }
,
{ // state 1035
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1309, // "/"
161,48, // blockComment
164,1194, // slashStar
MIN_REDUCTION+179, // (default reduction)
  }
,
{ // state 1036
MIN_REDUCTION+147, // (default reduction)
  }
,
{ // state 1037
MIN_REDUCTION+111, // (default reduction)
  }
,
{ // state 1038
2,639, // white*
125,2024, // white
126,857, // {12}
127,857, // " "
128,857, // {9}
129,1169, // eol
130,977, // comment
131,1299, // {10}
132,884, // {13}
143,1422, // "/"
160,1218, // oneLineComment
161,821, // blockComment
162,1907, // doubleSlash
164,782, // slashStar
178,MIN_REDUCTION+212, // $NT
  }
,
{ // state 1039
0x80000000|1807, // match move
0x80000000|578, // no-match move
0x80000000|1581, // NT-test-match state for reserved
  }
,
{ // state 1040
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
129,482, // eol
130,1769, // comment
131,1062, // {10}
132,1577, // {13}
143,1422, // "/"
160,715, // oneLineComment
161,48, // blockComment
162,732, // doubleSlash
164,1194, // slashStar
MIN_REDUCTION+151, // (default reduction)
  }
,
{ // state 1041
0x80000000|1, // match move
0x80000000|2001, // no-match move
0x80000000|64, // NT-test-match state for idChar
  }
,
{ // state 1042
MIN_REDUCTION+229, // (default reduction)
  }
,
{ // state 1043
MIN_REDUCTION+67, // (default reduction)
  }
,
{ // state 1044
0x80000000|1, // match move
0x80000000|91, // no-match move
0x80000000|64, // NT-test-match state for idChar
  }
,
{ // state 1045
113,854, // "r"
  }
,
{ // state 1046
MIN_REDUCTION+55, // (default reduction)
  }
,
{ // state 1047
92,1096, // "s"
117,1872, // "b"
  }
,
{ // state 1048
MIN_REDUCTION+133, // (default reduction)
  }
,
{ // state 1049
2,201, // white*
MIN_REDUCTION+156, // (default reduction)
  }
,
{ // state 1050
2,1816, // white*
MIN_REDUCTION+144, // (default reduction)
  }
,
{ // state 1051
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1309, // "/"
161,48, // blockComment
164,1194, // slashStar
MIN_REDUCTION+292, // (default reduction)
  }
,
{ // state 1052
2,1492, // white*
125,2024, // white
126,857, // {12}
127,857, // " "
128,857, // {9}
129,1169, // eol
130,977, // comment
131,1299, // {10}
132,884, // {13}
143,1422, // "/"
160,1218, // oneLineComment
161,821, // blockComment
162,1907, // doubleSlash
164,782, // slashStar
178,MIN_REDUCTION+221, // $NT
  }
,
{ // state 1053
2,1270, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1309, // "/"
161,48, // blockComment
164,1194, // slashStar
MIN_REDUCTION+182, // (default reduction)
  }
,
{ // state 1054
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
129,482, // eol
130,1769, // comment
131,1062, // {10}
132,1577, // {13}
MIN_REDUCTION+169, // (default reduction)
  }
,
{ // state 1055
113,1078, // "r"
  }
,
{ // state 1056
MIN_REDUCTION+343, // (default reduction)
  }
,
{ // state 1057
91,1817, // "a"
  }
,
{ // state 1058
103,496, // "d"
  }
,
{ // state 1059
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
129,482, // eol
130,1769, // comment
131,1062, // {10}
132,1577, // {13}
MIN_REDUCTION+220, // (default reduction)
  }
,
{ // state 1060
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
129,482, // eol
130,1769, // comment
131,1062, // {10}
132,1577, // {13}
MIN_REDUCTION+99, // (default reduction)
  }
,
{ // state 1061
2,1211, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
129,482, // eol
130,1769, // comment
131,1062, // {10}
132,1577, // {13}
MIN_REDUCTION+174, // (default reduction)
  }
,
{ // state 1062
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 1063
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1422, // "/"
160,715, // oneLineComment
161,48, // blockComment
162,732, // doubleSlash
164,1194, // slashStar
MIN_REDUCTION+313, // (default reduction)
  }
,
{ // state 1064
2,1737, // white*
125,2024, // white
126,857, // {12}
127,857, // " "
128,857, // {9}
129,1169, // eol
130,977, // comment
131,1299, // {10}
132,884, // {13}
143,1422, // "/"
160,1218, // oneLineComment
161,821, // blockComment
162,1907, // doubleSlash
164,782, // slashStar
178,MIN_REDUCTION+188, // $NT
  }
,
{ // state 1065
MIN_REDUCTION+241, // (default reduction)
  }
,
{ // state 1066
120,1696, // "n"
  }
,
{ // state 1067
0x80000000|651, // match move
0x80000000|1987, // no-match move
0x80000000|1622, // NT-test-match state for slashStar
  }
,
{ // state 1068
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1422, // "/"
160,715, // oneLineComment
161,48, // blockComment
162,732, // doubleSlash
164,1194, // slashStar
MIN_REDUCTION+179, // (default reduction)
  }
,
{ // state 1069
2,648, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1422, // "/"
160,715, // oneLineComment
161,48, // blockComment
162,732, // doubleSlash
164,1194, // slashStar
MIN_REDUCTION+251, // (default reduction)
  }
,
{ // state 1070
2,1120, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1422, // "/"
160,715, // oneLineComment
161,48, // blockComment
162,732, // doubleSlash
164,1194, // slashStar
MIN_REDUCTION+287, // (default reduction)
  }
,
{ // state 1071
2,1241, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1422, // "/"
160,715, // oneLineComment
161,48, // blockComment
162,732, // doubleSlash
164,1194, // slashStar
MIN_REDUCTION+293, // (default reduction)
  }
,
{ // state 1072
2,648, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
129,482, // eol
130,1769, // comment
131,1062, // {10}
132,1577, // {13}
MIN_REDUCTION+251, // (default reduction)
  }
,
{ // state 1073
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
129,482, // eol
130,1769, // comment
131,1062, // {10}
132,1577, // {13}
MIN_REDUCTION+133, // (default reduction)
  }
,
{ // state 1074
2,424, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1309, // "/"
161,48, // blockComment
164,1194, // slashStar
MIN_REDUCTION+154, // (default reduction)
  }
,
{ // state 1075
0x80000000|1, // match move
0x80000000|81, // no-match move
0x80000000|64, // NT-test-match state for idChar
  }
,
{ // state 1076
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
129,482, // eol
130,1769, // comment
131,1062, // {10}
132,1577, // {13}
MIN_REDUCTION+163, // (default reduction)
  }
,
{ // state 1077
MIN_REDUCTION+256, // (default reduction)
  }
,
{ // state 1078
0x80000000|1, // match move
0x80000000|112, // no-match move
0x80000000|64, // NT-test-match state for idChar
  }
,
{ // state 1079
0x80000000|1356, // match move
0x80000000|129, // no-match move
0x80000000|64, // NT-test-match state for idChar
  }
,
{ // state 1080
2,912, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1422, // "/"
160,715, // oneLineComment
161,48, // blockComment
162,732, // doubleSlash
164,1194, // slashStar
MIN_REDUCTION+364, // (default reduction)
  }
,
{ // state 1081
MIN_REDUCTION+163, // (default reduction)
  }
,
{ // state 1082
0x80000000|951, // match move
0x80000000|1571, // no-match move
0x80000000|1622, // NT-test-match state for slashStar
  }
,
{ // state 1083
121,832, // "t"
  }
,
{ // state 1084
0x80000000|1074, // match move
0x80000000|972, // no-match move
0x80000000|1622, // NT-test-match state for slashStar
  }
,
{ // state 1085
0x80000000|1177, // match move
0x80000000|62, // no-match move
0x80000000|1581, // NT-test-match state for reserved
  }
,
{ // state 1086
125,792, // white
126,857, // {12}
127,857, // " "
128,857, // {9}
129,1169, // eol
130,977, // comment
131,1299, // {10}
132,884, // {13}
143,1422, // "/"
160,1218, // oneLineComment
161,821, // blockComment
162,1907, // doubleSlash
164,782, // slashStar
178,MIN_REDUCTION+181, // $NT
  }
,
{ // state 1087
0x80000000|1297, // match move
0x80000000|1484, // no-match move
0x80000000|1622, // NT-test-match state for slashStar
  }
,
{ // state 1088
0x80000000|87, // match move
0x80000000|734, // no-match move
0x80000000|1622, // NT-test-match state for slashStar
  }
,
{ // state 1089
131,1491, // {10}
  }
,
{ // state 1090
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
129,482, // eol
130,1769, // comment
131,1062, // {10}
132,1577, // {13}
MIN_REDUCTION+155, // (default reduction)
  }
,
{ // state 1091
120,877, // "n"
  }
,
{ // state 1092
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1309, // "/"
161,48, // blockComment
164,1194, // slashStar
MIN_REDUCTION+137, // (default reduction)
  }
,
{ // state 1093
91,1787, // "a"
  }
,
{ // state 1094
MIN_REDUCTION+130, // (default reduction)
  }
,
{ // state 1095
0x80000000|1594, // match move
0x80000000|2009, // no-match move
0x80000000|1581, // NT-test-match state for reserved
  }
,
{ // state 1096
92,703, // "s"
  }
,
{ // state 1097
0x80000000|427, // match move
0x80000000|342, // no-match move
0x80000000|63, // NT-test-match state for doubleSlash
  }
,
{ // state 1098
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1422, // "/"
160,715, // oneLineComment
161,48, // blockComment
162,732, // doubleSlash
164,1194, // slashStar
MIN_REDUCTION+167, // (default reduction)
  }
,
{ // state 1099
MIN_REDUCTION+44, // (default reduction)
  }
,
{ // state 1100
2,1781, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1309, // "/"
161,48, // blockComment
164,1194, // slashStar
MIN_REDUCTION+138, // (default reduction)
  }
,
{ // state 1101
2,1750, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1309, // "/"
161,48, // blockComment
164,1194, // slashStar
MIN_REDUCTION+326, // (default reduction)
  }
,
{ // state 1102
MIN_REDUCTION+9, // (default reduction)
  }
,
{ // state 1103
0x80000000|649, // match move
0x80000000|1109, // no-match move
0x80000000|1622, // NT-test-match state for slashStar
  }
,
{ // state 1104
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1309, // "/"
161,48, // blockComment
164,1194, // slashStar
MIN_REDUCTION+205, // (default reduction)
  }
,
{ // state 1105
113,707, // "r"
  }
,
{ // state 1106
MIN_REDUCTION+120, // (default reduction)
  }
,
{ // state 1107
2,1206, // white*
125,2024, // white
126,857, // {12}
127,857, // " "
128,857, // {9}
129,1169, // eol
130,977, // comment
131,1299, // {10}
132,884, // {13}
143,1422, // "/"
160,1218, // oneLineComment
161,821, // blockComment
162,1907, // doubleSlash
164,782, // slashStar
178,MIN_REDUCTION+266, // $NT
  }
,
{ // state 1108
0x80000000|1437, // match move
0x80000000|186, // no-match move
// T-test match for "=":
97,
  }
,
{ // state 1109
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
129,482, // eol
130,1769, // comment
131,1062, // {10}
132,1577, // {13}
MIN_REDUCTION+217, // (default reduction)
  }
,
{ // state 1110
92,1604, // "s"
121,1079, // "t"
  }
,
{ // state 1111
2,1637, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
129,482, // eol
130,1769, // comment
131,1062, // {10}
132,1577, // {13}
MIN_REDUCTION+178, // (default reduction)
  }
,
{ // state 1112
95,1793, // "e"
  }
,
{ // state 1113
0x80000000|863, // match move
0x80000000|1197, // no-match move
0x80000000|1622, // NT-test-match state for slashStar
  }
,
{ // state 1114
MIN_REDUCTION+280, // (default reduction)
  }
,
{ // state 1115
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1309, // "/"
161,48, // blockComment
164,1194, // slashStar
MIN_REDUCTION+268, // (default reduction)
  }
,
{ // state 1116
0x80000000|1, // match move
0x80000000|368, // no-match move
0x80000000|64, // NT-test-match state for idChar
  }
,
{ // state 1117
2,1662, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1309, // "/"
161,48, // blockComment
164,1194, // slashStar
MIN_REDUCTION+148, // (default reduction)
  }
,
{ // state 1118
0x80000000|579, // match move
0x80000000|1000, // no-match move
0x80000000|1581, // NT-test-match state for reserved
  }
,
{ // state 1119
0x80000000|1235, // match move
0x80000000|1663, // no-match move
0x80000000|63, // NT-test-match state for doubleSlash
  }
,
{ // state 1120
0x80000000|352, // match move
0x80000000|537, // no-match move
0x80000000|63, // NT-test-match state for doubleSlash
  }
,
{ // state 1121
95,632, // "e"
  }
,
{ // state 1122
0x80000000|1369, // match move
0x80000000|1067, // no-match move
0x80000000|63, // NT-test-match state for doubleSlash
  }
,
{ // state 1123
113,941, // "r"
  }
,
{ // state 1124
MIN_REDUCTION+23, // (default reduction)
  }
,
{ // state 1125
112,1942, // "o"
  }
,
{ // state 1126
2,1182, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1309, // "/"
161,48, // blockComment
164,1194, // slashStar
MIN_REDUCTION+221, // (default reduction)
  }
,
{ // state 1127
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1309, // "/"
161,48, // blockComment
164,1194, // slashStar
MIN_REDUCTION+208, // (default reduction)
  }
,
{ // state 1128
0x80000000|1, // match move
0x80000000|1386, // no-match move
0x80000000|64, // NT-test-match state for idChar
  }
,
{ // state 1129
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1309, // "/"
161,48, // blockComment
164,1194, // slashStar
MIN_REDUCTION+190, // (default reduction)
  }
,
{ // state 1130
0x80000000|1680, // match move
0x80000000|382, // no-match move
0x80000000|64, // NT-test-match state for idChar
  }
,
{ // state 1131
0x80000000|25, // match move
0x80000000|1513, // no-match move
0x80000000|1581, // NT-test-match state for reserved
  }
,
{ // state 1132
0x80000000|370, // match move
0x80000000|1305, // no-match move
0x80000000|1581, // NT-test-match state for reserved
  }
,
{ // state 1133
0x80000000|2005, // match move
0x80000000|768, // no-match move
0x80000000|63, // NT-test-match state for doubleSlash
  }
,
{ // state 1134
MIN_REDUCTION+13, // (default reduction)
  }
,
{ // state 1135
0x80000000|522, // match move
0x80000000|1878, // no-match move
0x80000000|63, // NT-test-match state for doubleSlash
  }
,
{ // state 1136
90,1361, // "l"
110,490, // "i"
  }
,
{ // state 1137
120,1905, // "n"
  }
,
{ // state 1138
119,581, // "k"
  }
,
{ // state 1139
178,MIN_REDUCTION+121, // $NT
MIN_REDUCTION+121, // (default reduction)
  }
,
{ // state 1140
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1422, // "/"
160,715, // oneLineComment
161,48, // blockComment
162,732, // doubleSlash
164,1194, // slashStar
MIN_REDUCTION+283, // (default reduction)
  }
,
{ // state 1141
121,1518, // "t"
  }
,
{ // state 1142
0x80000000|1482, // match move
0x80000000|1493, // no-match move
0x80000000|1622, // NT-test-match state for slashStar
  }
,
{ // state 1143
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1422, // "/"
160,715, // oneLineComment
161,48, // blockComment
162,732, // doubleSlash
164,1194, // slashStar
MIN_REDUCTION+141, // (default reduction)
  }
,
{ // state 1144
125,792, // white
126,857, // {12}
127,857, // " "
128,857, // {9}
129,1169, // eol
130,977, // comment
131,1299, // {10}
132,884, // {13}
143,1422, // "/"
160,1218, // oneLineComment
161,821, // blockComment
162,1907, // doubleSlash
164,782, // slashStar
178,MIN_REDUCTION+313, // $NT
  }
,
{ // state 1145
MIN_REDUCTION+226, // (default reduction)
  }
,
{ // state 1146
MIN_REDUCTION+205, // (default reduction)
  }
,
{ // state 1147
91,1590, // "a"
  }
,
{ // state 1148
MIN_REDUCTION+102, // (default reduction)
  }
,
{ // state 1149
91,1390, // "a"
  }
,
{ // state 1150
103,1595, // "d"
  }
,
{ // state 1151
0x80000000|515, // match move
0x80000000|1190, // no-match move
0x80000000|64, // NT-test-match state for idChar
  }
,
{ // state 1152
0x80000000|414, // match move
0x80000000|1580, // no-match move
0x80000000|1622, // NT-test-match state for slashStar
  }
,
{ // state 1153
2,1252, // white*
125,2024, // white
126,857, // {12}
127,857, // " "
128,857, // {9}
129,1169, // eol
130,977, // comment
131,1299, // {10}
132,884, // {13}
143,1422, // "/"
160,1218, // oneLineComment
161,821, // blockComment
162,1907, // doubleSlash
164,782, // slashStar
178,MIN_REDUCTION+302, // $NT
  }
,
{ // state 1154
2,898, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1309, // "/"
161,48, // blockComment
164,1194, // slashStar
MIN_REDUCTION+275, // (default reduction)
  }
,
{ // state 1155
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1422, // "/"
160,715, // oneLineComment
161,48, // blockComment
162,732, // doubleSlash
164,1194, // slashStar
MIN_REDUCTION+362, // (default reduction)
  }
,
{ // state 1156
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1422, // "/"
160,715, // oneLineComment
161,48, // blockComment
162,732, // doubleSlash
164,1194, // slashStar
MIN_REDUCTION+99, // (default reduction)
  }
,
{ // state 1157
0x80000000|923, // match move
0x80000000|1216, // no-match move
0x80000000|63, // NT-test-match state for doubleSlash
  }
,
{ // state 1158
95,1260, // "e"
  }
,
{ // state 1159
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
129,482, // eol
130,1769, // comment
131,1062, // {10}
132,1577, // {13}
MIN_REDUCTION+165, // (default reduction)
  }
,
{ // state 1160
0x80000000|556, // match move
0x80000000|621, // no-match move
0x80000000|64, // NT-test-match state for idChar
  }
,
{ // state 1161
95,1759, // "e"
  }
,
{ // state 1162
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
129,482, // eol
130,1769, // comment
131,1062, // {10}
132,1577, // {13}
MIN_REDUCTION+184, // (default reduction)
  }
,
{ // state 1163
92,1780, // "s"
  }
,
{ // state 1164
0x80000000|1444, // match move
0x80000000|600, // no-match move
0x80000000|63, // NT-test-match state for doubleSlash
  }
,
{ // state 1165
2,577, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
129,482, // eol
130,1769, // comment
131,1062, // {10}
132,1577, // {13}
MIN_REDUCTION+290, // (default reduction)
  }
,
{ // state 1166
95,1392, // "e"
  }
,
{ // state 1167
0x80000000|858, // match move
0x80000000|979, // no-match move
0x80000000|1581, // NT-test-match state for reserved
  }
,
{ // state 1168
MIN_REDUCTION+169, // (default reduction)
  }
,
{ // state 1169
178,MIN_REDUCTION+107, // $NT
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 1170
178,MIN_REDUCTION+282, // $NT
  }
,
{ // state 1171
0x80000000|61, // match move
0x80000000|1845, // no-match move
0x80000000|1622, // NT-test-match state for slashStar
  }
,
{ // state 1172
0x80000000|317, // match move
0x80000000|1993, // no-match move
0x80000000|1581, // NT-test-match state for reserved
  }
,
{ // state 1173
0x80000000|107, // match move
0x80000000|1773, // no-match move
// T-test match for "=":
97,
  }
,
{ // state 1174
MIN_REDUCTION+105, // (default reduction)
  }
,
{ // state 1175
0x80000000|1586, // match move
0x80000000|1222, // no-match move
0x80000000|1581, // NT-test-match state for reserved
  }
,
{ // state 1176
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 1177
MIN_REDUCTION+177, // (default reduction)
  }
,
{ // state 1178
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1309, // "/"
161,48, // blockComment
164,1194, // slashStar
MIN_REDUCTION+153, // (default reduction)
  }
,
{ // state 1179
MIN_REDUCTION+70, // (default reduction)
  }
,
{ // state 1180
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1422, // "/"
160,715, // oneLineComment
161,48, // blockComment
162,732, // doubleSlash
164,1194, // slashStar
MIN_REDUCTION+277, // (default reduction)
  }
,
{ // state 1181
89,474, // "c"
  }
,
{ // state 1182
0x80000000|1791, // match move
0x80000000|897, // no-match move
0x80000000|63, // NT-test-match state for doubleSlash
  }
,
{ // state 1183
89,MIN_REDUCTION+354, // "c"
90,MIN_REDUCTION+354, // "l"
91,MIN_REDUCTION+354, // "a"
92,MIN_REDUCTION+354, // "s"
95,MIN_REDUCTION+354, // "e"
102,MIN_REDUCTION+354, // "_"
103,MIN_REDUCTION+354, // "d"
104,MIN_REDUCTION+354, // "g"
105,MIN_REDUCTION+354, // "m"
106,MIN_REDUCTION+354, // "p"
107,MIN_REDUCTION+354, // "v"
108,MIN_REDUCTION+354, // "y"
109,MIN_REDUCTION+354, // "f"
110,MIN_REDUCTION+354, // "i"
111,MIN_REDUCTION+354, // {"A".."Z"}
112,MIN_REDUCTION+354, // "o"
113,MIN_REDUCTION+354, // "r"
114,MIN_REDUCTION+354, // "u"
115,MIN_REDUCTION+354, // "x"
116,MIN_REDUCTION+354, // {"j" "q"}
117,MIN_REDUCTION+354, // "b"
118,MIN_REDUCTION+354, // "h"
119,MIN_REDUCTION+354, // "k"
120,MIN_REDUCTION+354, // "n"
121,MIN_REDUCTION+354, // "t"
122,MIN_REDUCTION+354, // "w"
123,MIN_REDUCTION+354, // "z"
124,MIN_REDUCTION+354, // {"0".."9"}
169,MIN_REDUCTION+354, // idChar**
MIN_REDUCTION+354, // (default reduction)
  }
,
{ // state 1184
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1422, // "/"
160,715, // oneLineComment
161,48, // blockComment
162,732, // doubleSlash
164,1194, // slashStar
MIN_REDUCTION+259, // (default reduction)
  }
,
{ // state 1185
MIN_REDUCTION+124, // (default reduction)
  }
,
{ // state 1186
0x80000000|1919, // match move
0x80000000|1928, // no-match move
0x80000000|1581, // NT-test-match state for reserved
  }
,
{ // state 1187
2,1644, // white*
MIN_REDUCTION+158, // (default reduction)
  }
,
{ // state 1188
2,337, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
129,482, // eol
130,1769, // comment
131,1062, // {10}
132,1577, // {13}
MIN_REDUCTION+239, // (default reduction)
  }
,
{ // state 1189
0x80000000|1, // match move
0x80000000|312, // no-match move
0x80000000|64, // NT-test-match state for idChar
  }
,
{ // state 1190
0x80000000|1, // match move
0x80000000|1183, // no-match move
0x80000000|521, // NT-test-match state for letter
  }
,
{ // state 1191
95,835, // "e"
  }
,
{ // state 1192
2,799, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
129,482, // eol
130,1769, // comment
131,1062, // {10}
132,1577, // {13}
MIN_REDUCTION+160, // (default reduction)
  }
,
{ // state 1193
MIN_REDUCTION+101, // (default reduction)
  }
,
{ // state 1194
89,724, // "c"
90,724, // "l"
91,724, // "a"
92,724, // "s"
95,724, // "e"
96,724, // "!"
97,724, // "="
98,724, // "+"
102,724, // "_"
103,724, // "d"
104,724, // "g"
105,724, // "m"
106,724, // "p"
107,724, // "v"
108,724, // "y"
109,724, // "f"
110,724, // "i"
111,724, // {"A".."Z"}
112,724, // "o"
113,724, // "r"
114,724, // "u"
115,724, // "x"
116,724, // {"j" "q"}
117,724, // "b"
118,724, // "h"
119,724, // "k"
120,724, // "n"
121,724, // "t"
122,724, // "w"
123,724, // "z"
124,724, // {"0".."9"}
127,724, // " "
128,724, // {9}
129,1228, // eol
131,343, // {10}
132,367, // {13}
134,724, // "["
135,724, // "-"
136,724, // "<"
137,724, // "|"
138,724, // {"?".."@"}
139,724, // "&"
140,724, // ")"
141,724, // ","
142,724, // "]"
143,724, // "/"
144,724, // {"#".."$"}
145,724, // ";"
146,724, // ">"
147,724, // "{"
148,724, // "%"
149,724, // "("
150,724, // "\"
151,724, // "."
152,724, // ":"
153,724, // "}"
154,724, // {"^" "`" "~"}
155,724, // "'"
156,724, // '"'
157,1428, // "*"
165,915, // blockCommentContent*
166,242, // starSlash
167,1201, // blockCommentContent
  }
,
{ // state 1195
0x80000000|1460, // match move
0x80000000|571, // no-match move
0x80000000|521, // NT-test-match state for letter
  }
,
{ // state 1196
0x80000000|1, // match move
0x80000000|726, // no-match move
0x80000000|64, // NT-test-match state for idChar
  }
,
{ // state 1197
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
129,482, // eol
130,1769, // comment
131,1062, // {10}
132,1577, // {13}
MIN_REDUCTION+307, // (default reduction)
  }
,
{ // state 1198
92,1812, // "s"
121,1490, // "t"
  }
,
{ // state 1199
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1422, // "/"
160,715, // oneLineComment
161,48, // blockComment
162,732, // doubleSlash
164,1194, // slashStar
MIN_REDUCTION+208, // (default reduction)
  }
,
{ // state 1200
0x80000000|1, // match move
0x80000000|174, // no-match move
0x80000000|64, // NT-test-match state for idChar
  }
,
{ // state 1201
MIN_REDUCTION+351, // (default reduction)
  }
,
{ // state 1202
95,322, // "e"
112,59, // "o"
  }
,
{ // state 1203
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1422, // "/"
160,715, // oneLineComment
161,48, // blockComment
162,732, // doubleSlash
164,1194, // slashStar
MIN_REDUCTION+226, // (default reduction)
  }
,
{ // state 1204
MIN_REDUCTION+111, // (default reduction)
  }
,
{ // state 1205
2,409, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1309, // "/"
161,48, // blockComment
164,1194, // slashStar
MIN_REDUCTION+185, // (default reduction)
  }
,
{ // state 1206
125,792, // white
126,857, // {12}
127,857, // " "
128,857, // {9}
129,1169, // eol
130,977, // comment
131,1299, // {10}
132,884, // {13}
143,1422, // "/"
160,1218, // oneLineComment
161,821, // blockComment
162,1907, // doubleSlash
164,782, // slashStar
178,MIN_REDUCTION+265, // $NT
  }
,
{ // state 1207
2,1750, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1422, // "/"
160,715, // oneLineComment
161,48, // blockComment
162,732, // doubleSlash
164,1194, // slashStar
MIN_REDUCTION+326, // (default reduction)
  }
,
{ // state 1208
MIN_REDUCTION+105, // (default reduction)
  }
,
{ // state 1209
121,760, // "t"
  }
,
{ // state 1210
125,792, // white
126,857, // {12}
127,857, // " "
128,857, // {9}
129,1169, // eol
130,977, // comment
131,1299, // {10}
132,884, // {13}
143,1422, // "/"
160,1218, // oneLineComment
161,821, // blockComment
162,1907, // doubleSlash
164,782, // slashStar
178,MIN_REDUCTION+277, // $NT
  }
,
{ // state 1211
0x80000000|437, // match move
0x80000000|339, // no-match move
0x80000000|63, // NT-test-match state for doubleSlash
  }
,
{ // state 1212
0x80000000|445, // match move
0x80000000|475, // no-match move
0x80000000|1622, // NT-test-match state for slashStar
  }
,
{ // state 1213
2,856, // white*
MIN_REDUCTION+176, // (default reduction)
  }
,
{ // state 1214
90,584, // "l"
  }
,
{ // state 1215
2,1752, // white*
MIN_REDUCTION+140, // (default reduction)
  }
,
{ // state 1216
0x80000000|330, // match move
0x80000000|57, // no-match move
0x80000000|1581, // NT-test-match state for reserved
  }
,
{ // state 1217
91,1285, // "a"
95,1256, // "e"
114,406, // "u"
  }
,
{ // state 1218
178,MIN_REDUCTION+119, // $NT
MIN_REDUCTION+119, // (default reduction)
  }
,
{ // state 1219
2,1778, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1309, // "/"
161,48, // blockComment
164,1194, // slashStar
MIN_REDUCTION+248, // (default reduction)
  }
,
{ // state 1220
2,1725, // white*
125,2024, // white
126,857, // {12}
127,857, // " "
128,857, // {9}
129,1169, // eol
130,977, // comment
131,1299, // {10}
132,884, // {13}
143,1422, // "/"
160,1218, // oneLineComment
161,821, // blockComment
162,1907, // doubleSlash
164,782, // slashStar
178,MIN_REDUCTION+230, // $NT
  }
,
{ // state 1221
113,1755, // "r"
  }
,
{ // state 1222
0x80000000|1117, // match move
0x80000000|825, // no-match move
0x80000000|1622, // NT-test-match state for slashStar
  }
,
{ // state 1223
MIN_REDUCTION+319, // (default reduction)
  }
,
{ // state 1224
2,1950, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1422, // "/"
160,715, // oneLineComment
161,48, // blockComment
162,732, // doubleSlash
164,1194, // slashStar
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 1225
2,1620, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1309, // "/"
161,48, // blockComment
164,1194, // slashStar
170,1827, // $$1
MIN_REDUCTION+335, // (default reduction)
  }
,
{ // state 1226
2,1450, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1422, // "/"
160,715, // oneLineComment
161,48, // blockComment
162,732, // doubleSlash
164,1194, // slashStar
MIN_REDUCTION+134, // (default reduction)
  }
,
{ // state 1227
0x80000000|1092, // match move
0x80000000|1003, // no-match move
0x80000000|1622, // NT-test-match state for slashStar
  }
,
{ // state 1228
MIN_REDUCTION+127, // (default reduction)
  }
,
{ // state 1229
0x80000000|1, // match move
0x80000000|1258, // no-match move
// T-test match for {"*" "/"}:
143,
157,
  }
,
{ // state 1230
0x80000000|1, // match move
0x80000000|154, // no-match move
0x80000000|64, // NT-test-match state for idChar
  }
,
{ // state 1231
0x80000000|245, // match move
0x80000000|911, // no-match move
0x80000000|63, // NT-test-match state for doubleSlash
  }
,
{ // state 1232
90,76, // "l"
  }
,
{ // state 1233
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1309, // "/"
161,48, // blockComment
164,1194, // slashStar
MIN_REDUCTION+135, // (default reduction)
  }
,
{ // state 1234
121,1698, // "t"
  }
,
{ // state 1235
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1422, // "/"
160,715, // oneLineComment
161,48, // blockComment
162,732, // doubleSlash
164,1194, // slashStar
MIN_REDUCTION+253, // (default reduction)
  }
,
{ // state 1236
102,MIN_REDUCTION+358, // "_"
169,MIN_REDUCTION+358, // idChar**
MIN_REDUCTION+358, // (default reduction)
  }
,
{ // state 1237
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
129,482, // eol
130,1769, // comment
131,1062, // {10}
132,1577, // {13}
MIN_REDUCTION+328, // (default reduction)
  }
,
{ // state 1238
2,1781, // white*
MIN_REDUCTION+138, // (default reduction)
  }
,
{ // state 1239
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
129,482, // eol
130,1769, // comment
131,1062, // {10}
132,1577, // {13}
MIN_REDUCTION+235, // (default reduction)
  }
,
{ // state 1240
0x80000000|895, // match move
0x80000000|842, // no-match move
0x80000000|89, // NT-test-match state for digit
  }
,
{ // state 1241
0x80000000|1731, // match move
0x80000000|1400, // no-match move
0x80000000|63, // NT-test-match state for doubleSlash
  }
,
{ // state 1242
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1422, // "/"
160,715, // oneLineComment
161,48, // blockComment
162,732, // doubleSlash
164,1194, // slashStar
MIN_REDUCTION+238, // (default reduction)
  }
,
{ // state 1243
2,4, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
129,482, // eol
130,1769, // comment
131,1062, // {10}
132,1577, // {13}
MIN_REDUCTION+245, // (default reduction)
  }
,
{ // state 1244
2,418, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1422, // "/"
160,715, // oneLineComment
161,48, // blockComment
162,732, // doubleSlash
164,1194, // slashStar
MIN_REDUCTION+263, // (default reduction)
  }
,
{ // state 1245
0x80000000|1127, // match move
0x80000000|1710, // no-match move
0x80000000|1622, // NT-test-match state for slashStar
  }
,
{ // state 1246
121,512, // "t"
  }
,
{ // state 1247
0x80000000|1870, // match move
0x80000000|550, // no-match move
0x80000000|1622, // NT-test-match state for slashStar
  }
,
{ // state 1248
0x80000000|1, // match move
0x80000000|139, // no-match move
0x80000000|64, // NT-test-match state for idChar
  }
,
{ // state 1249
95,504, // "e"
  }
,
{ // state 1250
2,872, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1309, // "/"
161,48, // blockComment
164,1194, // slashStar
MIN_REDUCTION+236, // (default reduction)
  }
,
{ // state 1251
2,1956, // white*
125,2024, // white
126,857, // {12}
127,857, // " "
128,857, // {9}
129,1169, // eol
130,977, // comment
131,1299, // {10}
132,884, // {13}
143,1422, // "/"
160,1218, // oneLineComment
161,821, // blockComment
162,1907, // doubleSlash
164,782, // slashStar
178,MIN_REDUCTION+284, // $NT
  }
,
{ // state 1252
125,792, // white
126,857, // {12}
127,857, // " "
128,857, // {9}
129,1169, // eol
130,977, // comment
131,1299, // {10}
132,884, // {13}
143,1422, // "/"
160,1218, // oneLineComment
161,821, // blockComment
162,1907, // doubleSlash
164,782, // slashStar
178,MIN_REDUCTION+301, // $NT
  }
,
{ // state 1253
104,2013, // "g"
  }
,
{ // state 1254
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1422, // "/"
160,715, // oneLineComment
161,48, // blockComment
162,732, // doubleSlash
164,1194, // slashStar
MIN_REDUCTION+97, // (default reduction)
  }
,
{ // state 1255
MIN_REDUCTION+346, // (default reduction)
  }
,
{ // state 1256
122,257, // "w"
  }
,
{ // state 1257
0x80000000|1977, // match move
0x80000000|887, // no-match move
0x80000000|1622, // NT-test-match state for slashStar
  }
,
{ // state 1258
2,1851, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
129,482, // eol
131,1062, // {10}
132,1577, // {13}
MIN_REDUCTION+180, // (default reduction)
  }
,
{ // state 1259
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
129,482, // eol
130,1769, // comment
131,1062, // {10}
132,1577, // {13}
MIN_REDUCTION+167, // (default reduction)
  }
,
{ // state 1260
0x80000000|1, // match move
0x80000000|1279, // no-match move
0x80000000|64, // NT-test-match state for idChar
  }
,
{ // state 1261
2,424, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1422, // "/"
160,715, // oneLineComment
161,48, // blockComment
162,732, // doubleSlash
164,1194, // slashStar
MIN_REDUCTION+154, // (default reduction)
  }
,
{ // state 1262
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1309, // "/"
161,48, // blockComment
164,1194, // slashStar
MIN_REDUCTION+313, // (default reduction)
  }
,
{ // state 1263
MIN_REDUCTION+345, // (default reduction)
  }
,
{ // state 1264
MIN_REDUCTION+179, // (default reduction)
  }
,
{ // state 1265
0x80000000|1621, // match move
0x80000000|1188, // no-match move
0x80000000|1622, // NT-test-match state for slashStar
  }
,
{ // state 1266
MIN_REDUCTION+265, // (default reduction)
  }
,
{ // state 1267
125,792, // white
126,857, // {12}
127,857, // " "
128,857, // {9}
129,1169, // eol
130,977, // comment
131,1299, // {10}
132,884, // {13}
143,1422, // "/"
160,1218, // oneLineComment
161,821, // blockComment
162,1907, // doubleSlash
164,782, // slashStar
178,MIN_REDUCTION+205, // $NT
  }
,
{ // state 1268
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 1269
0x80000000|1775, // match move
0x80000000|1193, // no-match move
0x80000000|64, // NT-test-match state for idChar
  }
,
{ // state 1270
0x80000000|838, // match move
0x80000000|1132, // no-match move
0x80000000|63, // NT-test-match state for doubleSlash
  }
,
{ // state 1271
110,1522, // "i"
112,1516, // "o"
  }
,
{ // state 1272
89,1645, // "c"
  }
,
{ // state 1273
90,658, // "l"
112,1123, // "o"
  }
,
{ // state 1274
92,441, // "s"
  }
,
{ // state 1275
178,MIN_REDUCTION+267, // $NT
  }
,
{ // state 1276
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1309, // "/"
161,48, // blockComment
164,1194, // slashStar
MIN_REDUCTION+319, // (default reduction)
  }
,
{ // state 1277
2,1950, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
129,482, // eol
130,1769, // comment
131,1062, // {10}
132,1577, // {13}
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 1278
0x80000000|1321, // match move
0x80000000|567, // no-match move
0x80000000|63, // NT-test-match state for doubleSlash
  }
,
{ // state 1279
0x80000000|1911, // match move
0x80000000|569, // no-match move
0x80000000|63, // NT-test-match state for doubleSlash
  }
,
{ // state 1280
114,590, // "u"
  }
,
{ // state 1281
2,1485, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1309, // "/"
161,48, // blockComment
164,1194, // slashStar
MIN_REDUCTION+278, // (default reduction)
  }
,
{ // state 1282
178,MIN_REDUCTION+270, // $NT
  }
,
{ // state 1283
0x80000000|1098, // match move
0x80000000|1609, // no-match move
0x80000000|63, // NT-test-match state for doubleSlash
  }
,
{ // state 1284
112,516, // "o"
  }
,
{ // state 1285
121,1431, // "t"
  }
,
{ // state 1286
0x80000000|144, // match move
0x80000000|585, // no-match move
0x80000000|1622, // NT-test-match state for slashStar
  }
,
{ // state 1287
125,792, // white
126,857, // {12}
127,857, // " "
128,857, // {9}
129,1169, // eol
130,977, // comment
131,1299, // {10}
132,884, // {13}
143,1422, // "/"
160,1218, // oneLineComment
161,821, // blockComment
162,1907, // doubleSlash
164,782, // slashStar
178,MIN_REDUCTION+319, // $NT
  }
,
{ // state 1288
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1422, // "/"
160,715, // oneLineComment
161,48, // blockComment
162,732, // doubleSlash
164,1194, // slashStar
MIN_REDUCTION+187, // (default reduction)
  }
,
{ // state 1289
MIN_REDUCTION+220, // (default reduction)
  }
,
{ // state 1290
178,MIN_REDUCTION+273, // $NT
  }
,
{ // state 1291
0x80000000|124, // match move
0x80000000|1103, // no-match move
0x80000000|1581, // NT-test-match state for reserved
  }
,
{ // state 1292
0x80000000|1051, // match move
0x80000000|642, // no-match move
0x80000000|1622, // NT-test-match state for slashStar
  }
,
{ // state 1293
0x80000000|829, // match move
0x80000000|1592, // no-match move
0x80000000|1622, // NT-test-match state for slashStar
  }
,
{ // state 1294
2,1311, // white*
97,267, // "="
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1422, // "/"
160,715, // oneLineComment
161,48, // blockComment
162,732, // doubleSlash
164,1194, // slashStar
MIN_REDUCTION+150, // (default reduction)
  }
,
{ // state 1295
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1422, // "/"
160,715, // oneLineComment
161,48, // blockComment
162,732, // doubleSlash
164,1194, // slashStar
MIN_REDUCTION+363, // (default reduction)
  }
,
{ // state 1296
MIN_REDUCTION+268, // (default reduction)
  }
,
{ // state 1297
2,385, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1309, // "/"
161,48, // blockComment
164,1194, // slashStar
MIN_REDUCTION+152, // (default reduction)
  }
,
{ // state 1298
0x80000000|431, // match move
0x80000000|1412, // no-match move
0x80000000|1581, // NT-test-match state for reserved
  }
,
{ // state 1299
178,MIN_REDUCTION+109, // $NT
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 1300
MIN_REDUCTION+359, // (default reduction)
  }
,
{ // state 1301
125,792, // white
126,857, // {12}
127,857, // " "
128,857, // {9}
129,1169, // eol
130,977, // comment
131,1299, // {10}
132,884, // {13}
143,1422, // "/"
160,1218, // oneLineComment
161,821, // blockComment
162,1907, // doubleSlash
164,782, // slashStar
178,MIN_REDUCTION+196, // $NT
  }
,
{ // state 1302
112,1091, // "o"
  }
,
{ // state 1303
0x80000000|191, // match move
0x80000000|1406, // no-match move
0x80000000|1581, // NT-test-match state for reserved
  }
,
{ // state 1304
178,MIN_REDUCTION+240, // $NT
  }
,
{ // state 1305
0x80000000|665, // match move
0x80000000|236, // no-match move
0x80000000|1622, // NT-test-match state for slashStar
  }
,
{ // state 1306
120,1877, // "n"
  }
,
{ // state 1307
0x80000000|1844, // match move
0x80000000|1846, // no-match move
0x80000000|64, // NT-test-match state for idChar
  }
,
{ // state 1308
0x80000000|1, // match move
0x80000000|466, // no-match move
0x80000000|64, // NT-test-match state for idChar
  }
,
{ // state 1309
157,1853, // "*"
  }
,
{ // state 1310
0x80000000|839, // match move
0x80000000|1593, // no-match move
0x80000000|63, // NT-test-match state for doubleSlash
  }
,
{ // state 1311
0x80000000|1399, // match move
0x80000000|161, // no-match move
0x80000000|63, // NT-test-match state for doubleSlash
  }
,
{ // state 1312
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1309, // "/"
161,48, // blockComment
164,1194, // slashStar
MIN_REDUCTION+157, // (default reduction)
  }
,
{ // state 1313
121,844, // "t"
  }
,
{ // state 1314
MIN_REDUCTION+155, // (default reduction)
  }
,
{ // state 1315
2,1676, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
129,482, // eol
130,1769, // comment
131,1062, // {10}
132,1577, // {13}
MIN_REDUCTION+230, // (default reduction)
  }
,
{ // state 1316
2,928, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1309, // "/"
161,48, // blockComment
164,1194, // slashStar
MIN_REDUCTION+308, // (default reduction)
  }
,
{ // state 1317
2,577, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1309, // "/"
161,48, // blockComment
164,1194, // slashStar
MIN_REDUCTION+290, // (default reduction)
  }
,
{ // state 1318
0x80000000|162, // match move
0x80000000|545, // no-match move
0x80000000|1622, // NT-test-match state for slashStar
  }
,
{ // state 1319
125,792, // white
126,857, // {12}
127,857, // " "
128,857, // {9}
129,1169, // eol
130,977, // comment
131,1299, // {10}
132,884, // {13}
143,1422, // "/"
160,1218, // oneLineComment
161,821, // blockComment
162,1907, // doubleSlash
164,782, // slashStar
178,MIN_REDUCTION+268, // $NT
  }
,
{ // state 1320
109,1841, // "f"
  }
,
{ // state 1321
2,1816, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1422, // "/"
160,715, // oneLineComment
161,48, // blockComment
162,732, // doubleSlash
164,1194, // slashStar
MIN_REDUCTION+144, // (default reduction)
  }
,
{ // state 1322
125,792, // white
126,857, // {12}
127,857, // " "
128,857, // {9}
129,1169, // eol
130,977, // comment
131,1299, // {10}
132,884, // {13}
143,1422, // "/"
160,1218, // oneLineComment
161,821, // blockComment
162,1907, // doubleSlash
164,782, // slashStar
178,MIN_REDUCTION+316, // $NT
  }
,
{ // state 1323
0x80000000|344, // match move
0x80000000|1579, // no-match move
0x80000000|1622, // NT-test-match state for slashStar
  }
,
{ // state 1324
125,792, // white
126,857, // {12}
127,857, // " "
128,857, // {9}
129,1169, // eol
130,977, // comment
131,1299, // {10}
132,884, // {13}
143,1422, // "/"
160,1218, // oneLineComment
161,821, // blockComment
162,1907, // doubleSlash
164,782, // slashStar
178,MIN_REDUCTION+217, // $NT
  }
,
{ // state 1325
0x80000000|1935, // match move
0x80000000|1020, // no-match move
0x80000000|63, // NT-test-match state for doubleSlash
  }
,
{ // state 1326
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1309, // "/"
161,48, // blockComment
164,1194, // slashStar
MIN_REDUCTION+262, // (default reduction)
  }
,
{ // state 1327
2,597, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1422, // "/"
160,715, // oneLineComment
161,48, // blockComment
162,732, // doubleSlash
164,1194, // slashStar
MIN_REDUCTION+136, // (default reduction)
  }
,
{ // state 1328
110,1843, // "i"
  }
,
{ // state 1329
92,919, // "s"
  }
,
{ // state 1330
MIN_REDUCTION+342, // (default reduction)
  }
,
{ // state 1331
112,1137, // "o"
  }
,
{ // state 1332
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
129,482, // eol
130,1769, // comment
131,1062, // {10}
132,1577, // {13}
MIN_REDUCTION+340, // (default reduction)
  }
,
{ // state 1333
2,1910, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
129,482, // eol
130,1769, // comment
131,1062, // {10}
132,1577, // {13}
MIN_REDUCTION+146, // (default reduction)
  }
,
{ // state 1334
0x80000000|973, // match move
0x80000000|1771, // no-match move
0x80000000|63, // NT-test-match state for doubleSlash
  }
,
{ // state 1335
0x80000000|1, // match move
0x80000000|168, // no-match move
0x80000000|64, // NT-test-match state for idChar
  }
,
{ // state 1336
0x80000000|1, // match move
0x80000000|428, // no-match move
0x80000000|64, // NT-test-match state for idChar
  }
,
{ // state 1337
2,597, // white*
MIN_REDUCTION+136, // (default reduction)
  }
,
{ // state 1338
2,1781, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1422, // "/"
160,715, // oneLineComment
161,48, // blockComment
162,732, // doubleSlash
164,1194, // slashStar
MIN_REDUCTION+138, // (default reduction)
  }
,
{ // state 1339
0x80000000|483, // match move
0x80000000|230, // no-match move
0x80000000|1622, // NT-test-match state for slashStar
  }
,
{ // state 1340
2,597, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1309, // "/"
161,48, // blockComment
164,1194, // slashStar
MIN_REDUCTION+136, // (default reduction)
  }
,
{ // state 1341
MIN_REDUCTION+121, // (default reduction)
  }
,
{ // state 1342
0x80000000|1642, // match move
0x80000000|892, // no-match move
0x80000000|1581, // NT-test-match state for reserved
  }
,
{ // state 1343
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
129,482, // eol
130,1769, // comment
131,1062, // {10}
132,1577, // {13}
MIN_REDUCTION+295, // (default reduction)
  }
,
{ // state 1344
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1422, // "/"
160,715, // oneLineComment
161,48, // blockComment
162,732, // doubleSlash
164,1194, // slashStar
MIN_REDUCTION+214, // (default reduction)
  }
,
{ // state 1345
MIN_REDUCTION+21, // (default reduction)
  }
,
{ // state 1346
95,1896, // "e"
  }
,
{ // state 1347
2,1637, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1309, // "/"
161,48, // blockComment
164,1194, // slashStar
MIN_REDUCTION+178, // (default reduction)
  }
,
{ // state 1348
2,872, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
129,482, // eol
130,1769, // comment
131,1062, // {10}
132,1577, // {13}
MIN_REDUCTION+236, // (default reduction)
  }
,
{ // state 1349
0x80000000|1721, // match move
0x80000000|1061, // no-match move
0x80000000|1622, // NT-test-match state for slashStar
  }
,
{ // state 1350
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1309, // "/"
161,48, // blockComment
164,1194, // slashStar
MIN_REDUCTION+316, // (default reduction)
  }
,
{ // state 1351
95,633, // "e"
  }
,
{ // state 1352
2,946, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
129,482, // eol
130,1769, // comment
131,1062, // {10}
132,1577, // {13}
MIN_REDUCTION+317, // (default reduction)
  }
,
{ // state 1353
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1422, // "/"
160,715, // oneLineComment
161,48, // blockComment
162,732, // doubleSlash
164,1194, // slashStar
MIN_REDUCTION+271, // (default reduction)
  }
,
{ // state 1354
118,1041, // "h"
  }
,
{ // state 1355
MIN_REDUCTION+139, // (default reduction)
  }
,
{ // state 1356
95,990, // "e"
  }
,
{ // state 1357
2,1750, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
129,482, // eol
130,1769, // comment
131,1062, // {10}
132,1577, // {13}
MIN_REDUCTION+326, // (default reduction)
  }
,
{ // state 1358
0x80000000|1006, // match move
0x80000000|875, // no-match move
0x80000000|521, // NT-test-match state for letter
  }
,
{ // state 1359
95,1058, // "e"
  }
,
{ // state 1360
117,1010, // "b"
  }
,
{ // state 1361
91,721, // "a"
  }
,
{ // state 1362
89,1655, // "c"
90,1655, // "l"
91,1655, // "a"
92,1655, // "s"
95,1655, // "e"
96,1668, // "!"
97,645, // "="
98,645, // "+"
102,1655, // "_"
103,1655, // "d"
104,1655, // "g"
105,1655, // "m"
106,1655, // "p"
107,1655, // "v"
108,1655, // "y"
109,1655, // "f"
110,1655, // "i"
111,645, // {"A".."Z"}
112,1655, // "o"
113,1655, // "r"
114,1655, // "u"
115,1655, // "x"
116,1655, // {"j" "q"}
117,1655, // "b"
118,1655, // "h"
119,1655, // "k"
120,1655, // "n"
121,1655, // "t"
122,1655, // "w"
123,1655, // "z"
124,645, // {"0".."9"}
127,1668, // " "
134,645, // "["
135,645, // "-"
136,645, // "<"
137,1655, // "|"
138,645, // {"?".."@"}
139,645, // "&"
140,645, // ")"
141,645, // ","
142,1655, // "]"
143,645, // "/"
144,645, // {"#".."$"}
145,645, // ";"
146,645, // ">"
147,1655, // "{"
148,645, // "%"
149,645, // "("
151,645, // "."
152,645, // ":"
153,1655, // "}"
154,1655, // {"^" "`" "~"}
155,645, // "'"
156,1777, // '"'
157,645, // "*"
158,608, // stringPrintable
172,1605, // $$2
  }
,
{ // state 1363
0x80000000|1511, // match move
0x80000000|318, // no-match move
0x80000000|1622, // NT-test-match state for slashStar
  }
,
{ // state 1364
2,502, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1309, // "/"
161,48, // blockComment
164,1194, // slashStar
MIN_REDUCTION+329, // (default reduction)
  }
,
{ // state 1365
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1309, // "/"
161,48, // blockComment
164,1194, // slashStar
MIN_REDUCTION+145, // (default reduction)
  }
,
{ // state 1366
125,792, // white
126,857, // {12}
127,857, // " "
128,857, // {9}
129,1169, // eol
130,977, // comment
131,1299, // {10}
132,884, // {13}
143,1422, // "/"
160,1218, // oneLineComment
161,821, // blockComment
162,1907, // doubleSlash
164,782, // slashStar
178,MIN_REDUCTION+226, // $NT
  }
,
{ // state 1367
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
129,482, // eol
130,1769, // comment
131,1062, // {10}
132,1577, // {13}
MIN_REDUCTION+316, // (default reduction)
  }
,
{ // state 1368
103,213, // "d"
  }
,
{ // state 1369
2,1921, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1422, // "/"
160,715, // oneLineComment
161,48, // blockComment
162,732, // doubleSlash
164,1194, // slashStar
MIN_REDUCTION+272, // (default reduction)
  }
,
{ // state 1370
0x80000000|929, // match move
0x80000000|1095, // no-match move
0x80000000|63, // NT-test-match state for doubleSlash
  }
,
{ // state 1371
109,1506, // "f"
  }
,
{ // state 1372
2,1366, // white*
125,2024, // white
126,857, // {12}
127,857, // " "
128,857, // {9}
129,1169, // eol
130,977, // comment
131,1299, // {10}
132,884, // {13}
143,1422, // "/"
160,1218, // oneLineComment
161,821, // blockComment
162,1907, // doubleSlash
164,782, // slashStar
178,MIN_REDUCTION+227, // $NT
  }
,
{ // state 1373
2,23, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1422, // "/"
160,715, // oneLineComment
161,48, // blockComment
162,732, // doubleSlash
164,1194, // slashStar
MIN_REDUCTION+311, // (default reduction)
  }
,
{ // state 1374
2,149, // white*
125,2024, // white
126,857, // {12}
127,857, // " "
128,857, // {9}
129,1169, // eol
130,977, // comment
131,1299, // {10}
132,884, // {13}
143,1422, // "/"
160,1218, // oneLineComment
161,821, // blockComment
162,1907, // doubleSlash
164,782, // slashStar
178,MIN_REDUCTION+254, // $NT
  }
,
{ // state 1375
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 1376
MIN_REDUCTION+111, // (default reduction)
  }
,
{ // state 1377
2,1370, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1422, // "/"
160,715, // oneLineComment
161,48, // blockComment
162,732, // doubleSlash
164,1194, // slashStar
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 1378
MIN_REDUCTION+159, // (default reduction)
  }
,
{ // state 1379
118,948, // "h"
  }
,
{ // state 1380
0x80000000|1754, // match move
0x80000000|1021, // no-match move
0x80000000|63, // NT-test-match state for doubleSlash
  }
,
{ // state 1381
MIN_REDUCTION+32, // (default reduction)
  }
,
{ // state 1382
91,1618, // "a"
113,572, // "r"
  }
,
{ // state 1383
0x80000000|745, // match move
0x80000000|711, // no-match move
0x80000000|1581, // NT-test-match state for reserved
  }
,
{ // state 1384
112,1093, // "o"
  }
,
{ // state 1385
2,912, // white*
MIN_REDUCTION+364, // (default reduction)
  }
,
{ // state 1386
0x80000000|1745, // match move
0x80000000|777, // no-match move
0x80000000|63, // NT-test-match state for doubleSlash
  }
,
{ // state 1387
0x80000000|1705, // match move
0x80000000|927, // no-match move
0x80000000|1622, // NT-test-match state for slashStar
  }
,
{ // state 1388
125,792, // white
126,857, // {12}
127,857, // " "
128,857, // {9}
129,1169, // eol
130,977, // comment
131,1299, // {10}
132,884, // {13}
143,1422, // "/"
160,1218, // oneLineComment
161,821, // blockComment
162,1907, // doubleSlash
164,782, // slashStar
178,MIN_REDUCTION+262, // $NT
  }
,
{ // state 1389
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 1390
89,1583, // "c"
  }
,
{ // state 1391
0x80000000|1990, // match move
0x80000000|741, // no-match move
0x80000000|63, // NT-test-match state for doubleSlash
  }
,
{ // state 1392
91,391, // "a"
  }
,
{ // state 1393
MIN_REDUCTION+112, // (default reduction)
  }
,
{ // state 1394
178,MIN_REDUCTION+258, // $NT
  }
,
{ // state 1395
0x80000000|1, // match move
0x80000000|357, // no-match move
0x80000000|64, // NT-test-match state for idChar
  }
,
{ // state 1396
2,1631, // white*
125,2024, // white
126,857, // {12}
127,857, // " "
128,857, // {9}
129,1169, // eol
130,977, // comment
131,1299, // {10}
132,884, // {13}
143,1422, // "/"
160,1218, // oneLineComment
161,821, // blockComment
162,1907, // doubleSlash
164,782, // slashStar
178,MIN_REDUCTION+239, // $NT
  }
,
{ // state 1397
113,185, // "r"
  }
,
{ // state 1398
0x80000000|70, // match move
0x80000000|1649, // no-match move
0x80000000|1622, // NT-test-match state for slashStar
  }
,
{ // state 1399
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1422, // "/"
160,715, // oneLineComment
161,48, // blockComment
162,732, // doubleSlash
164,1194, // slashStar
MIN_REDUCTION+149, // (default reduction)
  }
,
{ // state 1400
0x80000000|488, // match move
0x80000000|1292, // no-match move
0x80000000|1581, // NT-test-match state for reserved
  }
,
{ // state 1401
107,1017, // "v"
  }
,
{ // state 1402
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1422, // "/"
160,715, // oneLineComment
161,48, // blockComment
162,732, // doubleSlash
164,1194, // slashStar
MIN_REDUCTION+316, // (default reduction)
  }
,
{ // state 1403
0x80000000|655, // match move
0x80000000|1453, // no-match move
0x80000000|63, // NT-test-match state for doubleSlash
  }
,
{ // state 1404
MIN_REDUCTION+250, // (default reduction)
  }
,
{ // state 1405
0x80000000|226, // match move
0x80000000|1839, // no-match move
0x80000000|1622, // NT-test-match state for slashStar
  }
,
{ // state 1406
0x80000000|1233, // match move
0x80000000|1719, // no-match move
0x80000000|1622, // NT-test-match state for slashStar
  }
,
{ // state 1407
178,MIN_REDUCTION+216, // $NT
  }
,
{ // state 1408
2,1270, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
129,482, // eol
130,1769, // comment
131,1062, // {10}
132,1577, // {13}
MIN_REDUCTION+182, // (default reduction)
  }
,
{ // state 1409
2,1287, // white*
125,2024, // white
126,857, // {12}
127,857, // " "
128,857, // {9}
129,1169, // eol
130,977, // comment
131,1299, // {10}
132,884, // {13}
143,1422, // "/"
160,1218, // oneLineComment
161,821, // blockComment
162,1907, // doubleSlash
164,782, // slashStar
178,MIN_REDUCTION+320, // $NT
  }
,
{ // state 1410
2,1182, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
129,482, // eol
130,1769, // comment
131,1062, // {10}
132,1577, // {13}
MIN_REDUCTION+221, // (default reduction)
  }
,
{ // state 1411
92,126, // "s"
  }
,
{ // state 1412
0x80000000|285, // match move
0x80000000|1426, // no-match move
0x80000000|1622, // NT-test-match state for slashStar
  }
,
{ // state 1413
2,898, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
129,482, // eol
130,1769, // comment
131,1062, // {10}
132,1577, // {13}
MIN_REDUCTION+275, // (default reduction)
  }
,
{ // state 1414
125,792, // white
126,857, // {12}
127,857, // " "
128,857, // {9}
129,1169, // eol
130,977, // comment
131,1299, // {10}
132,884, // {13}
143,1422, // "/"
160,1218, // oneLineComment
161,821, // blockComment
162,1907, // doubleSlash
164,782, // slashStar
178,MIN_REDUCTION+241, // $NT
  }
,
{ // state 1415
0x80000000|700, // match move
0x80000000|718, // no-match move
0x80000000|1581, // NT-test-match state for reserved
  }
,
{ // state 1416
143,614, // "/"
  }
,
{ // state 1417
91,1253, // "a"
  }
,
{ // state 1418
2,390, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1422, // "/"
160,715, // oneLineComment
161,48, // blockComment
162,732, // doubleSlash
164,1194, // slashStar
MIN_REDUCTION+194, // (default reduction)
  }
,
{ // state 1419
0x80000000|1784, // match move
0x80000000|916, // no-match move
0x80000000|1622, // NT-test-match state for slashStar
  }
,
{ // state 1420
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
129,482, // eol
130,1769, // comment
131,1062, // {10}
132,1577, // {13}
MIN_REDUCTION+262, // (default reduction)
  }
,
{ // state 1421
0x80000000|1404, // match move
0x80000000|313, // no-match move
0x80000000|1581, // NT-test-match state for reserved
  }
,
{ // state 1422
143,1094, // "/"
157,1853, // "*"
  }
,
{ // state 1423
0x80000000|566, // match move
0x80000000|65, // no-match move
0x80000000|63, // NT-test-match state for doubleSlash
  }
,
{ // state 1424
178,MIN_REDUCTION+186, // $NT
  }
,
{ // state 1425
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 1426
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
129,482, // eol
130,1769, // comment
131,1062, // {10}
132,1577, // {13}
MIN_REDUCTION+301, // (default reduction)
  }
,
{ // state 1427
113,197, // "r"
118,992, // "h"
  }
,
{ // state 1428
0x80000000|971, // match move
0x80000000|589, // no-match move
// T-test match for "/":
143,
  }
,
{ // state 1429
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1422, // "/"
160,715, // oneLineComment
161,48, // blockComment
162,732, // doubleSlash
164,1194, // slashStar
MIN_REDUCTION+301, // (default reduction)
  }
,
{ // state 1430
0x80000000|1224, // match move
0x80000000|1916, // no-match move
0x80000000|63, // NT-test-match state for doubleSlash
  }
,
{ // state 1431
110,332, // "i"
  }
,
{ // state 1432
2,1826, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1309, // "/"
161,48, // blockComment
164,1194, // slashStar
MIN_REDUCTION+224, // (default reduction)
  }
,
{ // state 1433
MIN_REDUCTION+331, // (default reduction)
  }
,
{ // state 1434
0x80000000|278, // match move
0x80000000|1398, // no-match move
0x80000000|1581, // NT-test-match state for reserved
  }
,
{ // state 1435
112,1371, // "o"
  }
,
{ // state 1436
MIN_REDUCTION+357, // (default reduction)
  }
,
{ // state 1437
97,190, // "="
  }
,
{ // state 1438
MIN_REDUCTION+336, // (default reduction)
  }
,
{ // state 1439
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 1440
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1309, // "/"
161,48, // blockComment
164,1194, // slashStar
MIN_REDUCTION+274, // (default reduction)
  }
,
{ // state 1441
0x80000000|753, // match move
0x80000000|1848, // no-match move
0x80000000|63, // NT-test-match state for doubleSlash
  }
,
{ // state 1442
MIN_REDUCTION+122, // (default reduction)
  }
,
{ // state 1443
0x80000000|456, // match move
0x80000000|1323, // no-match move
0x80000000|1581, // NT-test-match state for reserved
  }
,
{ // state 1444
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1422, // "/"
160,715, // oneLineComment
161,48, // blockComment
162,732, // doubleSlash
164,1194, // slashStar
MIN_REDUCTION+169, // (default reduction)
  }
,
{ // state 1445
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1422, // "/"
160,715, // oneLineComment
161,48, // blockComment
162,732, // doubleSlash
164,1194, // slashStar
MIN_REDUCTION+135, // (default reduction)
  }
,
{ // state 1446
2,219, // white*
125,2024, // white
126,857, // {12}
127,857, // " "
128,857, // {9}
129,1169, // eol
130,977, // comment
131,1299, // {10}
132,884, // {13}
143,1422, // "/"
160,1218, // oneLineComment
161,821, // blockComment
162,1907, // doubleSlash
164,782, // slashStar
178,MIN_REDUCTION+90, // $NT
  }
,
{ // state 1447
MIN_REDUCTION+325, // (default reduction)
  }
,
{ // state 1448
125,792, // white
126,857, // {12}
127,857, // " "
128,857, // {9}
129,1169, // eol
130,977, // comment
131,1299, // {10}
132,884, // {13}
143,1422, // "/"
160,1218, // oneLineComment
161,821, // blockComment
162,1907, // doubleSlash
164,782, // slashStar
178,MIN_REDUCTION+289, // $NT
  }
,
{ // state 1449
2,1311, // white*
5,432, // `boolean
6,735, // `class
7,679, // `extends
8,231, // `void
9,1102, // `int
10,324, // `while
11,351, // `if
12,748, // `else
13,1134, // `for
14,1984, // `break
15,316, // `this
16,380, // `false
17,276, // `true
18,908, // `super
19,127, // `null
20,699, // `return
21,1345, // `instanceof
22,2014, // `new
23,1124, // `abstract
24,469, // `assert
25,192, // `byte
26,535, // `case
27,1558, // `catch
28,974, // `char
29,133, // `const
30,315, // `continue
31,1947, // `default
32,1381, // `do
33,1997, // `double
34,650, // `enum
35,176, // `final
36,279, // `finally
37,674, // `float
38,1740, // `goto
39,109, // `implements
40,239, // `import
41,849, // `interface
42,1268, // `long
43,540, // `native
44,1099, // `package
45,1389, // `private
46,667, // `protected
47,41, // `public
48,1425, // `short
49,1176, // `static
50,331, // `strictfp
51,544, // `switch
52,759, // `synchronized
53,811, // `throw
54,369, // `throws
55,1046, // `transient
56,271, // `try
57,426, // `volatile
89,345, // "c"
90,1774, // "l"
91,1047, // "a"
92,1749, // "s"
95,631, // "e"
97,267, // "="
103,220, // "d"
104,1703, // "g"
106,1675, // "p"
107,1125, // "v"
109,304, // "f"
110,50, // "i"
113,270, // "r"
117,986, // "b"
120,471, // "n"
121,876, // "t"
122,1379, // "w"
MIN_REDUCTION+150, // (default reduction)
  }
,
{ // state 1450
0x80000000|202, // match move
0x80000000|587, // no-match move
0x80000000|63, // NT-test-match state for doubleSlash
  }
,
{ // state 1451
0x80000000|1316, // match move
0x80000000|580, // no-match move
0x80000000|1622, // NT-test-match state for slashStar
  }
,
{ // state 1452
MIN_REDUCTION+72, // (default reduction)
  }
,
{ // state 1453
0x80000000|294, // match move
0x80000000|189, // no-match move
0x80000000|1622, // NT-test-match state for slashStar
  }
,
{ // state 1454
109,885, // "f"
  }
,
{ // state 1455
2,1700, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1422, // "/"
160,715, // oneLineComment
161,48, // blockComment
162,732, // doubleSlash
164,1194, // slashStar
MIN_REDUCTION+314, // (default reduction)
  }
,
{ // state 1456
0x80000000|1, // match move
0x80000000|1380, // no-match move
0x80000000|64, // NT-test-match state for idChar
  }
,
{ // state 1457
90,2007, // "l"
  }
,
{ // state 1458
2,187, // white*
125,2024, // white
126,857, // {12}
127,857, // " "
128,857, // {9}
129,1169, // eol
130,977, // comment
131,1299, // {10}
132,884, // {13}
143,1422, // "/"
160,1218, // oneLineComment
161,821, // blockComment
162,1907, // doubleSlash
164,782, // slashStar
178,MIN_REDUCTION+323, // $NT
  }
,
{ // state 1459
178,MIN_REDUCTION+249, // $NT
  }
,
{ // state 1460
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 1461
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1422, // "/"
160,715, // oneLineComment
161,48, // blockComment
162,732, // doubleSlash
164,1194, // slashStar
MIN_REDUCTION+229, // (default reduction)
  }
,
{ // state 1462
125,792, // white
126,857, // {12}
127,857, // " "
128,857, // {9}
129,1169, // eol
130,977, // comment
131,1299, // {10}
132,884, // {13}
143,1422, // "/"
160,1218, // oneLineComment
161,821, // blockComment
162,1907, // doubleSlash
164,782, // slashStar
178,MIN_REDUCTION+280, // $NT
  }
,
{ // state 1463
0x80000000|1, // match move
0x80000000|448, // no-match move
0x80000000|64, // NT-test-match state for idChar
  }
,
{ // state 1464
135,1858, // "-"
  }
,
{ // state 1465
91,1209, // "a"
  }
,
{ // state 1466
125,792, // white
126,857, // {12}
127,857, // " "
128,857, // {9}
129,1169, // eol
130,977, // comment
131,1299, // {10}
132,884, // {13}
143,1422, // "/"
160,1218, // oneLineComment
161,821, // blockComment
162,1907, // doubleSlash
164,782, // slashStar
178,MIN_REDUCTION+310, // $NT
  }
,
{ // state 1467
0x80000000|85, // match move
0x80000000|1263, // no-match move
0x80000000|64, // NT-test-match state for idChar
  }
,
{ // state 1468
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1422, // "/"
160,715, // oneLineComment
161,48, // blockComment
162,732, // doubleSlash
164,1194, // slashStar
MIN_REDUCTION+328, // (default reduction)
  }
,
{ // state 1469
2,409, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
129,482, // eol
130,1769, // comment
131,1062, // {10}
132,1577, // {13}
MIN_REDUCTION+185, // (default reduction)
  }
,
{ // state 1470
2,1778, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
129,482, // eol
130,1769, // comment
131,1062, // {10}
132,1577, // {13}
MIN_REDUCTION+248, // (default reduction)
  }
,
{ // state 1471
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1309, // "/"
161,48, // blockComment
164,1194, // slashStar
MIN_REDUCTION+325, // (default reduction)
  }
,
{ // state 1472
2,1164, // white*
MIN_REDUCTION+170, // (default reduction)
  }
,
{ // state 1473
2,1620, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
129,482, // eol
130,1769, // comment
131,1062, // {10}
132,1577, // {13}
170,1827, // $$1
MIN_REDUCTION+335, // (default reduction)
  }
,
{ // state 1474
0x80000000|1886, // match move
0x80000000|1971, // no-match move
0x80000000|1581, // NT-test-match state for reserved
  }
,
{ // state 1475
2,502, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1422, // "/"
160,715, // oneLineComment
161,48, // blockComment
162,732, // doubleSlash
164,1194, // slashStar
MIN_REDUCTION+329, // (default reduction)
  }
,
{ // state 1476
90,1547, // "l"
  }
,
{ // state 1477
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
129,482, // eol
130,1769, // comment
131,1062, // {10}
132,1577, // {13}
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 1478
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1422, // "/"
160,715, // oneLineComment
161,48, // blockComment
162,732, // doubleSlash
164,1194, // slashStar
MIN_REDUCTION+131, // (default reduction)
  }
,
{ // state 1479
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 1480
121,5, // "t"
  }
,
{ // state 1481
95,2008, // "e"
  }
,
{ // state 1482
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1309, // "/"
161,48, // blockComment
164,1194, // slashStar
MIN_REDUCTION+199, // (default reduction)
  }
,
{ // state 1483
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1422, // "/"
160,715, // oneLineComment
161,48, // blockComment
162,732, // doubleSlash
164,1194, // slashStar
MIN_REDUCTION+161, // (default reduction)
  }
,
{ // state 1484
2,385, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
129,482, // eol
130,1769, // comment
131,1062, // {10}
132,1577, // {13}
MIN_REDUCTION+152, // (default reduction)
  }
,
{ // state 1485
0x80000000|1180, // match move
0x80000000|652, // no-match move
0x80000000|63, // NT-test-match state for doubleSlash
  }
,
{ // state 1486
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1309, // "/"
161,48, // blockComment
164,1194, // slashStar
MIN_REDUCTION+322, // (default reduction)
  }
,
{ // state 1487
0x80000000|1861, // match move
0x80000000|662, // no-match move
0x80000000|1622, // NT-test-match state for slashStar
  }
,
{ // state 1488
91,845, // "a"
113,646, // "r"
114,1900, // "u"
  }
,
{ // state 1489
MIN_REDUCTION+232, // (default reduction)
  }
,
{ // state 1490
89,1354, // "c"
  }
,
{ // state 1491
178,MIN_REDUCTION+110, // $NT
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 1492
125,792, // white
126,857, // {12}
127,857, // " "
128,857, // {9}
129,1169, // eol
130,977, // comment
131,1299, // {10}
132,884, // {13}
143,1422, // "/"
160,1218, // oneLineComment
161,821, // blockComment
162,1907, // doubleSlash
164,782, // slashStar
178,MIN_REDUCTION+220, // $NT
  }
,
{ // state 1493
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
129,482, // eol
130,1769, // comment
131,1062, // {10}
132,1577, // {13}
MIN_REDUCTION+199, // (default reduction)
  }
,
{ // state 1494
2,527, // white*
MIN_REDUCTION+166, // (default reduction)
  }
,
{ // state 1495
2,1528, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1422, // "/"
160,715, // oneLineComment
161,48, // blockComment
162,732, // doubleSlash
164,1194, // slashStar
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 1496
2,1871, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
129,482, // eol
130,1769, // comment
131,1062, // {10}
132,1577, // {13}
MIN_REDUCTION+142, // (default reduction)
  }
,
{ // state 1497
178,MIN_REDUCTION+189, // $NT
  }
,
{ // state 1498
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
129,482, // eol
130,1769, // comment
131,1062, // {10}
132,1577, // {13}
MIN_REDUCTION+322, // (default reduction)
  }
,
{ // state 1499
178,MIN_REDUCTION+94, // $NT
  }
,
{ // state 1500
0x80000000|1711, // match move
0x80000000|1259, // no-match move
0x80000000|1622, // NT-test-match state for slashStar
  }
,
{ // state 1501
101,1612, // digit
124,392, // {"0".."9"}
  }
,
{ // state 1502
4,1330, // token
MIN_REDUCTION+361, // (default reduction)
  }
,
{ // state 1503
0x80000000|959, // match move
0x80000000|1682, // no-match move
0x80000000|1622, // NT-test-match state for slashStar
  }
,
{ // state 1504
2,866, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1309, // "/"
161,48, // blockComment
164,1194, // slashStar
MIN_REDUCTION+242, // (default reduction)
  }
,
{ // state 1505
105,1112, // "m"
  }
,
{ // state 1506
0x80000000|1, // match move
0x80000000|484, // no-match move
0x80000000|64, // NT-test-match state for idChar
  }
,
{ // state 1507
125,792, // white
126,857, // {12}
127,857, // " "
128,857, // {9}
129,1169, // eol
130,977, // comment
131,1299, // {10}
132,884, // {13}
143,1422, // "/"
160,1218, // oneLineComment
161,821, // blockComment
162,1907, // doubleSlash
164,782, // slashStar
178,MIN_REDUCTION+286, // $NT
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
{ // state 1508
MIN_REDUCTION+58, // (default reduction)
  }
,
{ // state 1509
0x80000000|1575, // match move
0x80000000|1037, // no-match move
// T-test match for 10:
131,
  }
,
{ // state 1510
MIN_REDUCTION+344, // (default reduction)
  }
,
{ // state 1511
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1309, // "/"
161,48, // blockComment
164,1194, // slashStar
MIN_REDUCTION+298, // (default reduction)
  }
,
{ // state 1512
92,110, // "s"
121,1860, // "t"
  }
,
{ // state 1513
0x80000000|1486, // match move
0x80000000|1498, // no-match move
0x80000000|1622, // NT-test-match state for slashStar
  }
,
{ // state 1514
121,1351, // "t"
  }
,
{ // state 1515
0x80000000|1065, // match move
0x80000000|17, // no-match move
0x80000000|1581, // NT-test-match state for reserved
  }
,
{ // state 1516
121,963, // "t"
  }
,
{ // state 1517
91,125, // "a"
  }
,
{ // state 1518
0x80000000|1, // match move
0x80000000|389, // no-match move
0x80000000|64, // NT-test-match state for idChar
  }
,
{ // state 1519
2,1570, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
129,482, // eol
130,1769, // comment
131,1062, // {10}
132,1577, // {13}
MIN_REDUCTION+305, // (default reduction)
  }
,
{ // state 1520
89,724, // "c"
90,724, // "l"
91,724, // "a"
92,724, // "s"
95,724, // "e"
96,724, // "!"
97,724, // "="
98,724, // "+"
102,724, // "_"
103,724, // "d"
104,724, // "g"
105,724, // "m"
106,724, // "p"
107,724, // "v"
108,724, // "y"
109,724, // "f"
110,724, // "i"
111,724, // {"A".."Z"}
112,724, // "o"
113,724, // "r"
114,724, // "u"
115,724, // "x"
116,724, // {"j" "q"}
117,724, // "b"
118,724, // "h"
119,724, // "k"
120,724, // "n"
121,724, // "t"
122,724, // "w"
123,724, // "z"
124,724, // {"0".."9"}
127,724, // " "
128,724, // {9}
129,1228, // eol
131,343, // {10}
132,367, // {13}
134,724, // "["
135,724, // "-"
136,724, // "<"
137,724, // "|"
138,724, // {"?".."@"}
139,724, // "&"
140,724, // ")"
141,724, // ","
142,724, // "]"
143,724, // "/"
144,724, // {"#".."$"}
145,724, // ";"
146,724, // ">"
147,724, // "{"
148,724, // "%"
149,724, // "("
150,724, // "\"
151,724, // "."
152,724, // ":"
153,724, // "}"
154,724, // {"^" "`" "~"}
155,724, // "'"
156,724, // '"'
157,1623, // "*"
165,444, // blockCommentContent*
166,1185, // starSlash
167,1201, // blockCommentContent
  }
,
{ // state 1521
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1422, // "/"
160,715, // oneLineComment
161,48, // blockComment
162,732, // doubleSlash
164,1194, // slashStar
MIN_REDUCTION+184, // (default reduction)
  }
,
{ // state 1522
107,1953, // "v"
  }
,
{ // state 1523
0x80000000|813, // match move
0x80000000|1744, // no-match move
0x80000000|63, // NT-test-match state for doubleSlash
  }
,
{ // state 1524
120,689, // "n"
  }
,
{ // state 1525
2,337, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1422, // "/"
160,715, // oneLineComment
161,48, // blockComment
162,732, // doubleSlash
164,1194, // slashStar
MIN_REDUCTION+239, // (default reduction)
  }
,
{ // state 1526
121,1893, // "t"
  }
,
{ // state 1527
0x80000000|256, // match move
0x80000000|495, // no-match move
0x80000000|63, // NT-test-match state for doubleSlash
  }
,
{ // state 1528
0x80000000|1254, // match move
0x80000000|1584, // no-match move
0x80000000|63, // NT-test-match state for doubleSlash
  }
,
{ // state 1529
0x80000000|203, // match move
0x80000000|909, // no-match move
0x80000000|1622, // NT-test-match state for slashStar
  }
,
{ // state 1530
89,653, // "c"
90,653, // "l"
91,653, // "a"
92,653, // "s"
95,653, // "e"
100,1658, // letter
103,653, // "d"
104,653, // "g"
105,653, // "m"
106,653, // "p"
107,653, // "v"
108,653, // "y"
109,653, // "f"
110,653, // "i"
111,653, // {"A".."Z"}
112,653, // "o"
113,653, // "r"
114,653, // "u"
115,653, // "x"
116,653, // {"j" "q"}
117,653, // "b"
118,653, // "h"
119,653, // "k"
120,653, // "n"
121,653, // "t"
122,653, // "w"
123,653, // "z"
  }
,
{ // state 1531
0x80000000|462, // match move
0x80000000|473, // no-match move
0x80000000|1622, // NT-test-match state for slashStar
  }
,
{ // state 1532
125,792, // white
126,857, // {12}
127,857, // " "
128,857, // {9}
129,1169, // eol
130,977, // comment
131,1299, // {10}
132,884, // {13}
143,1422, // "/"
160,1218, // oneLineComment
161,821, // blockComment
162,1907, // doubleSlash
164,782, // slashStar
178,MIN_REDUCTION+208, // $NT
  }
,
{ // state 1533
2,1423, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1422, // "/"
160,715, // oneLineComment
161,48, // blockComment
162,732, // doubleSlash
164,1194, // slashStar
MIN_REDUCTION+203, // (default reduction)
  }
,
{ // state 1534
121,1335, // "t"
  }
,
{ // state 1535
0x80000000|1203, // match move
0x80000000|1574, // no-match move
0x80000000|63, // NT-test-match state for doubleSlash
  }
,
{ // state 1536
0x80000000|1, // match move
0x80000000|503, // no-match move
0x80000000|64, // NT-test-match state for idChar
  }
,
{ // state 1537
0x80000000|1, // match move
0x80000000|1430, // no-match move
0x80000000|64, // NT-test-match state for idChar
  }
,
{ // state 1538
0x80000000|1626, // match move
0x80000000|461, // no-match move
0x80000000|1581, // NT-test-match state for reserved
  }
,
{ // state 1539
105,288, // "m"
109,1308, // "f"
120,1110, // "n"
  }
,
{ // state 1540
2,1883, // white*
125,2024, // white
126,857, // {12}
127,857, // " "
128,857, // {9}
129,1169, // eol
130,977, // comment
131,1299, // {10}
132,884, // {13}
143,1422, // "/"
160,1218, // oneLineComment
161,821, // blockComment
162,1907, // doubleSlash
164,782, // slashStar
178,MIN_REDUCTION+299, // $NT
  }
,
{ // state 1541
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 1542
2,781, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1309, // "/"
161,48, // blockComment
164,1194, // slashStar
MIN_REDUCTION+218, // (default reduction)
  }
,
{ // state 1543
114,1045, // "u"
  }
,
{ // state 1544
112,546, // "o"
  }
,
{ // state 1545
92,1550, // "s"
117,438, // "b"
  }
,
{ // state 1546
2,390, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1309, // "/"
161,48, // blockComment
164,1194, // slashStar
MIN_REDUCTION+194, // (default reduction)
  }
,
{ // state 1547
110,246, // "i"
  }
,
{ // state 1548
0x80000000|1100, // match move
0x80000000|780, // no-match move
0x80000000|1622, // NT-test-match state for slashStar
  }
,
{ // state 1549
0x80000000|1943, // match move
0x80000000|874, // no-match move
0x80000000|1622, // NT-test-match state for slashStar
  }
,
{ // state 1550
92,1815, // "s"
  }
,
{ // state 1551
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1422, // "/"
160,715, // oneLineComment
161,48, // blockComment
162,732, // doubleSlash
164,1194, // slashStar
MIN_REDUCTION+250, // (default reduction)
  }
,
{ // state 1552
0x80000000|1, // match move
0x80000000|1753, // no-match move
0x80000000|64, // NT-test-match state for idChar
  }
,
{ // state 1553
2,502, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
129,482, // eol
130,1769, // comment
131,1062, // {10}
132,1577, // {13}
MIN_REDUCTION+329, // (default reduction)
  }
,
{ // state 1554
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1309, // "/"
161,48, // blockComment
164,1194, // slashStar
MIN_REDUCTION+277, // (default reduction)
  }
,
{ // state 1555
MIN_REDUCTION+283, // (default reduction)
  }
,
{ // state 1556
119,1998, // "k"
  }
,
{ // state 1557
0x80000000|1653, // match move
0x80000000|280, // no-match move
0x80000000|64, // NT-test-match state for idChar
  }
,
{ // state 1558
MIN_REDUCTION+27, // (default reduction)
  }
,
{ // state 1559
0x80000000|536, // match move
0x80000000|1892, // no-match move
0x80000000|1622, // NT-test-match state for slashStar
  }
,
{ // state 1560
0x80000000|1813, // match move
0x80000000|725, // no-match move
0x80000000|1622, // NT-test-match state for slashStar
  }
,
{ // state 1561
0x80000000|613, // match move
0x80000000|216, // no-match move
0x80000000|1622, // NT-test-match state for slashStar
  }
,
{ // state 1562
89,321, // "c"
  }
,
{ // state 1563
2,259, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
129,482, // eol
130,1769, // comment
131,1062, // {10}
132,1577, // {13}
MIN_REDUCTION+132, // (default reduction)
  }
,
{ // state 1564
2,1370, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
129,482, // eol
130,1769, // comment
131,1062, // {10}
132,1577, // {13}
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 1565
2,1283, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
129,482, // eol
130,1769, // comment
131,1062, // {10}
132,1577, // {13}
MIN_REDUCTION+168, // (default reduction)
  }
,
{ // state 1566
2,597, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
129,482, // eol
130,1769, // comment
131,1062, // {10}
132,1577, // {13}
MIN_REDUCTION+136, // (default reduction)
  }
,
{ // state 1567
2,1637, // white*
MIN_REDUCTION+178, // (default reduction)
  }
,
{ // state 1568
MIN_REDUCTION+349, // (default reduction)
  }
,
{ // state 1569
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1309, // "/"
161,48, // blockComment
164,1194, // slashStar
MIN_REDUCTION+139, // (default reduction)
  }
,
{ // state 1570
0x80000000|902, // match move
0x80000000|12, // no-match move
0x80000000|63, // NT-test-match state for doubleSlash
  }
,
{ // state 1571
2,1528, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
129,482, // eol
130,1769, // comment
131,1062, // {10}
132,1577, // {13}
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 1572
0x80000000|1982, // match move
0x80000000|1981, // no-match move
0x80000000|1581, // NT-test-match state for reserved
  }
,
{ // state 1573
95,1814, // "e"
  }
,
{ // state 1574
0x80000000|1145, // match move
0x80000000|494, // no-match move
0x80000000|1581, // NT-test-match state for reserved
  }
,
{ // state 1575
131,123, // {10}
  }
,
{ // state 1576
0x80000000|1996, // match move
0x80000000|935, // no-match move
0x80000000|1622, // NT-test-match state for slashStar
  }
,
{ // state 1577
0x80000000|564, // match move
0x80000000|1376, // no-match move
// T-test match for 10:
131,
  }
,
{ // state 1578
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1422, // "/"
160,715, // oneLineComment
161,48, // blockComment
162,732, // doubleSlash
164,1194, // slashStar
MIN_REDUCTION+310, // (default reduction)
  }
,
{ // state 1579
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
129,482, // eol
130,1769, // comment
131,1062, // {10}
132,1577, // {13}
MIN_REDUCTION+187, // (default reduction)
  }
,
{ // state 1580
2,374, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
129,482, // eol
130,1769, // comment
131,1062, // {10}
132,1577, // {13}
MIN_REDUCTION+320, // (default reduction)
  }
,
{ // state 1581
5,79, // `boolean
6,159, // `class
7,1424, // `extends
8,1497, // `void
9,910, // `int
10,827, // `while
11,836, // `if
12,1499, // `else
13,73, // `for
14,44, // `break
15,34, // `this
16,859, // `false
17,606, // `true
18,1407, // `super
19,615, // `null
20,717, // `return
21,801, // `instanceof
22,2000, // `new
23,1672, // `abstract
24,588, // `assert
25,868, // `byte
26,1304, // `case
27,1989, // `catch
28,924, // `char
29,1459, // `const
30,135, // `continue
31,618, // `default
32,1394, // `do
33,153, // `double
34,1764, // `enum
35,1275, // `final
36,1282, // `finally
37,1290, // `float
38,994, // `goto
39,547, // `implements
40,1170, // `import
41,1800, // `interface
42,681, // `long
43,53, // `native
44,468, // `package
45,198, // `private
46,1840, // `protected
47,95, // `public
48,518, // `short
49,10, // `static
50,1666, // `strictfp
51,459, // `switch
52,850, // `synchronized
53,772, // `throw
54,982, // `throws
55,328, // `transient
56,864, // `try
57,366, // `volatile
89,435, // "c"
90,1302, // "l"
91,1545, // "a"
92,1772, // "s"
95,364, // "e"
103,1202, // "d"
104,1544, // "g"
106,1488, // "p"
107,1756, // "v"
109,384, // "f"
110,1539, // "i"
113,1932, // "r"
117,1587, // "b"
120,1217, // "n"
121,1427, // "t"
122,1714, // "w"
  }
,
{ // state 1582
2,1938, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1422, // "/"
160,715, // oneLineComment
161,48, // blockComment
162,732, // doubleSlash
164,1194, // slashStar
MIN_REDUCTION+164, // (default reduction)
  }
,
{ // state 1583
95,755, // "e"
  }
,
{ // state 1584
0x80000000|1789, // match move
0x80000000|1881, // no-match move
0x80000000|1581, // NT-test-match state for reserved
  }
,
{ // state 1585
MIN_REDUCTION+313, // (default reduction)
  }
,
{ // state 1586
2,1662, // white*
MIN_REDUCTION+148, // (default reduction)
  }
,
{ // state 1587
108,1514, // "y"
112,1758, // "o"
113,1965, // "r"
  }
,
{ // state 1588
2,1995, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1422, // "/"
160,715, // oneLineComment
161,48, // blockComment
162,732, // doubleSlash
164,1194, // slashStar
MIN_REDUCTION+284, // (default reduction)
  }
,
{ // state 1589
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
129,482, // eol
130,1769, // comment
131,1062, // {10}
132,1577, // {13}
MIN_REDUCTION+153, // (default reduction)
  }
,
{ // state 1590
89,194, // "c"
  }
,
{ // state 1591
2,866, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1422, // "/"
160,715, // oneLineComment
161,48, // blockComment
162,732, // doubleSlash
164,1194, // slashStar
MIN_REDUCTION+242, // (default reduction)
  }
,
{ // state 1592
2,1746, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
129,482, // eol
130,1769, // comment
131,1062, // {10}
132,1577, // {13}
MIN_REDUCTION+257, // (default reduction)
  }
,
{ // state 1593
0x80000000|553, // match move
0x80000000|1349, // no-match move
0x80000000|1581, // NT-test-match state for reserved
  }
,
{ // state 1594
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 1595
92,967, // "s"
  }
,
{ // state 1596
90,261, // "l"
  }
,
{ // state 1597
91,1138, // "a"
  }
,
{ // state 1598
0x80000000|422, // match move
0x80000000|1419, // no-match move
0x80000000|1581, // NT-test-match state for reserved
  }
,
{ // state 1599
0x80000000|1918, // match move
0x80000000|1538, // no-match move
0x80000000|63, // NT-test-match state for doubleSlash
  }
,
{ // state 1600
0x80000000|1262, // match move
0x80000000|1799, // no-match move
0x80000000|1622, // NT-test-match state for slashStar
  }
,
{ // state 1601
92,1930, // "s"
  }
,
{ // state 1602
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1422, // "/"
160,715, // oneLineComment
161,48, // blockComment
162,732, // doubleSlash
164,1194, // slashStar
MIN_REDUCTION+193, // (default reduction)
  }
,
{ // state 1603
0x80000000|1364, // match move
0x80000000|1553, // no-match move
0x80000000|1622, // NT-test-match state for slashStar
  }
,
{ // state 1604
121,273, // "t"
  }
,
{ // state 1605
MIN_REDUCTION+338, // (default reduction)
  }
,
{ // state 1606
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
129,482, // eol
130,1769, // comment
131,1062, // {10}
132,1577, // {13}
MIN_REDUCTION+319, // (default reduction)
  }
,
{ // state 1607
MIN_REDUCTION+85, // (default reduction)
  }
,
{ // state 1608
3,6, // $$0
4,1056, // token
125,712, // white
126,1479, // {12}
127,1479, // " "
128,1479, // {9}
130,1375, // comment
143,1309, // "/"
161,1106, // blockComment
164,1520, // slashStar
173,1599, // token*
MIN_REDUCTION+3, // (default reduction)
  }
,
{ // state 1609
0x80000000|132, // match move
0x80000000|1500, // no-match move
0x80000000|1581, // NT-test-match state for reserved
  }
,
{ // state 1610
0x80000000|820, // match move
0x80000000|7, // no-match move
0x80000000|63, // NT-test-match state for doubleSlash
  }
,
{ // state 1611
MIN_REDUCTION+118, // (default reduction)
  }
,
{ // state 1612
0x80000000|719, // match move
0x80000000|603, // no-match move
0x80000000|89, // NT-test-match state for digit
  }
,
{ // state 1613
120,1512, // "n"
  }
,
{ // state 1614
MIN_REDUCTION+289, // (default reduction)
  }
,
{ // state 1615
0x80000000|1, // match move
0x80000000|1824, // no-match move
0x80000000|64, // NT-test-match state for idChar
  }
,
{ // state 1616
0x80000000|1962, // match move
0x80000000|46, // no-match move
0x80000000|1581, // NT-test-match state for reserved
  }
,
{ // state 1617
0x80000000|1, // match move
0x80000000|1403, // no-match move
0x80000000|64, // NT-test-match state for idChar
  }
,
{ // state 1618
121,506, // "t"
  }
,
{ // state 1619
2,1822, // white*
125,2024, // white
126,857, // {12}
127,857, // " "
128,857, // {9}
129,1169, // eol
130,977, // comment
131,1299, // {10}
132,884, // {13}
143,1422, // "/"
160,1218, // oneLineComment
161,821, // blockComment
162,1907, // doubleSlash
164,782, // slashStar
178,MIN_REDUCTION+93, // $NT
  }
,
{ // state 1620
0x80000000|1155, // match move
0x80000000|1598, // no-match move
0x80000000|63, // NT-test-match state for doubleSlash
  }
,
{ // state 1621
2,337, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1309, // "/"
161,48, // blockComment
164,1194, // slashStar
MIN_REDUCTION+239, // (default reduction)
  }
,
{ // state 1622
143,293, // "/"
  }
,
{ // state 1623
0x80000000|1659, // match move
0x80000000|589, // no-match move
// T-test match for "/":
143,
  }
,
{ // state 1624
121,179, // "t"
  }
,
{ // state 1625
0x80000000|604, // match move
0x80000000|1434, // no-match move
0x80000000|63, // NT-test-match state for doubleSlash
  }
,
{ // state 1626
4,1330, // token
5,432, // `boolean
6,735, // `class
7,679, // `extends
8,231, // `void
9,1102, // `int
10,324, // `while
11,351, // `if
12,748, // `else
13,1134, // `for
14,1984, // `break
15,316, // `this
16,380, // `false
17,276, // `true
18,908, // `super
19,127, // `null
20,699, // `return
21,1345, // `instanceof
22,2014, // `new
23,1124, // `abstract
24,469, // `assert
25,192, // `byte
26,535, // `case
27,1558, // `catch
28,974, // `char
29,133, // `const
30,315, // `continue
31,1947, // `default
32,1381, // `do
33,1997, // `double
34,650, // `enum
35,176, // `final
36,279, // `finally
37,674, // `float
38,1740, // `goto
39,109, // `implements
40,239, // `import
41,849, // `interface
42,1268, // `long
43,540, // `native
44,1099, // `package
45,1389, // `private
46,667, // `protected
47,41, // `public
48,1425, // `short
49,1176, // `static
50,331, // `strictfp
51,544, // `switch
52,759, // `synchronized
53,811, // `throw
54,369, // `throws
55,1046, // `transient
56,271, // `try
57,426, // `volatile
89,345, // "c"
90,1774, // "l"
91,1047, // "a"
92,1749, // "s"
95,631, // "e"
103,220, // "d"
104,1703, // "g"
106,1675, // "p"
107,1125, // "v"
109,304, // "f"
110,50, // "i"
113,270, // "r"
117,986, // "b"
120,471, // "n"
121,876, // "t"
122,1379, // "w"
MIN_REDUCTION+361, // (default reduction)
  }
,
{ // state 1627
MIN_REDUCTION+348, // (default reduction)
  }
,
{ // state 1628
0x80000000|1, // match move
0x80000000|1790, // no-match move
0x80000000|64, // NT-test-match state for idChar
  }
,
{ // state 1629
MIN_REDUCTION+119, // (default reduction)
  }
,
{ // state 1630
118,1105, // "h"
  }
,
{ // state 1631
125,792, // white
126,857, // {12}
127,857, // " "
128,857, // {9}
129,1169, // eol
130,977, // comment
131,1299, // {10}
132,884, // {13}
143,1422, // "/"
160,1218, // oneLineComment
161,821, // blockComment
162,1907, // doubleSlash
164,782, // slashStar
178,MIN_REDUCTION+238, // $NT
  }
,
{ // state 1632
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1422, // "/"
160,715, // oneLineComment
161,48, // blockComment
162,732, // doubleSlash
164,1194, // slashStar
MIN_REDUCTION+244, // (default reduction)
  }
,
{ // state 1633
0x80000000|1891, // match move
0x80000000|920, // no-match move
0x80000000|63, // NT-test-match state for doubleSlash
  }
,
{ // state 1634
2,1871, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1422, // "/"
160,715, // oneLineComment
161,48, // blockComment
162,732, // doubleSlash
164,1194, // slashStar
MIN_REDUCTION+142, // (default reduction)
  }
,
{ // state 1635
MIN_REDUCTION+196, // (default reduction)
  }
,
{ // state 1636
0x80000000|1042, // match move
0x80000000|846, // no-match move
0x80000000|1581, // NT-test-match state for reserved
  }
,
{ // state 1637
0x80000000|894, // match move
0x80000000|1085, // no-match move
0x80000000|63, // NT-test-match state for doubleSlash
  }
,
{ // state 1638
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1422, // "/"
160,715, // oneLineComment
161,48, // blockComment
162,732, // doubleSlash
164,1194, // slashStar
MIN_REDUCTION+256, // (default reduction)
  }
,
{ // state 1639
0x80000000|879, // match move
0x80000000|15, // no-match move
0x80000000|1622, // NT-test-match state for slashStar
  }
,
{ // state 1640
2,1097, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1422, // "/"
160,715, // oneLineComment
161,48, // blockComment
162,732, // doubleSlash
164,1194, // slashStar
MIN_REDUCTION+281, // (default reduction)
  }
,
{ // state 1641
2,1448, // white*
125,2024, // white
126,857, // {12}
127,857, // " "
128,857, // {9}
129,1169, // eol
130,977, // comment
131,1299, // {10}
132,884, // {13}
143,1422, // "/"
160,1218, // oneLineComment
161,821, // blockComment
162,1907, // doubleSlash
164,782, // slashStar
178,MIN_REDUCTION+290, // $NT
  }
,
{ // state 1642
2,1450, // white*
MIN_REDUCTION+134, // (default reduction)
  }
,
{ // state 1643
0x80000000|1887, // match move
0x80000000|989, // no-match move
0x80000000|63, // NT-test-match state for doubleSlash
  }
,
{ // state 1644
0x80000000|528, // match move
0x80000000|184, // no-match move
0x80000000|63, // NT-test-match state for doubleSlash
  }
,
{ // state 1645
121,452, // "t"
  }
,
{ // state 1646
89,1976, // "c"
  }
,
{ // state 1647
2,1633, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1309, // "/"
161,48, // blockComment
164,1194, // slashStar
MIN_REDUCTION+299, // (default reduction)
  }
,
{ // state 1648
95,1463, // "e"
  }
,
{ // state 1649
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
129,482, // eol
130,1769, // comment
131,1062, // {10}
132,1577, // {13}
MIN_REDUCTION+211, // (default reduction)
  }
,
{ // state 1650
90,346, // "l"
  }
,
{ // state 1651
MIN_REDUCTION+149, // (default reduction)
  }
,
{ // state 1652
106,1191, // "p"
  }
,
{ // state 1653
89,1873, // "c"
90,1873, // "l"
91,1873, // "a"
92,1873, // "s"
93,1160, // idChar
95,1873, // "e"
100,1269, // letter
101,399, // digit
102,1307, // "_"
103,1873, // "d"
104,1873, // "g"
105,1873, // "m"
106,1873, // "p"
107,1873, // "v"
108,1873, // "y"
109,1873, // "f"
110,1873, // "i"
111,1873, // {"A".."Z"}
112,1873, // "o"
113,1873, // "r"
114,1873, // "u"
115,1873, // "x"
116,1873, // {"j" "q"}
117,1873, // "b"
118,1873, // "h"
119,1873, // "k"
120,1873, // "n"
121,1873, // "t"
122,1873, // "w"
123,1873, // "z"
124,1130, // {"0".."9"}
169,1730, // idChar**
175,1467, // idChar*
  }
,
{ // state 1654
0x80000000|852, // match move
0x80000000|1923, // no-match move
0x80000000|63, // NT-test-match state for doubleSlash
  }
,
{ // state 1655
MIN_REDUCTION+115, // (default reduction)
  }
,
{ // state 1656
0x80000000|265, // match move
0x80000000|118, // no-match move
0x80000000|1622, // NT-test-match state for slashStar
  }
,
{ // state 1657
92,323, // "s"
  }
,
{ // state 1658
0x80000000|1358, // match move
0x80000000|770, // no-match move
0x80000000|64, // NT-test-match state for idChar
  }
,
{ // state 1659
143,807, // "/"
  }
,
{ // state 1660
MIN_REDUCTION+102, // (default reduction)
  }
,
{ // state 1661
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
129,482, // eol
130,1769, // comment
131,1062, // {10}
132,1577, // {13}
MIN_REDUCTION+265, // (default reduction)
  }
,
{ // state 1662
0x80000000|254, // match move
0x80000000|818, // no-match move
0x80000000|63, // NT-test-match state for doubleSlash
  }
,
{ // state 1663
0x80000000|325, // match move
0x80000000|1531, // no-match move
0x80000000|1581, // NT-test-match state for reserved
  }
,
{ // state 1664
0x80000000|612, // match move
0x80000000|1888, // no-match move
0x80000000|63, // NT-test-match state for doubleSlash
  }
,
{ // state 1665
117,1867, // "b"
  }
,
{ // state 1666
178,MIN_REDUCTION+312, // $NT
  }
,
{ // state 1667
2,1871, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1309, // "/"
161,48, // blockComment
164,1194, // slashStar
MIN_REDUCTION+142, // (default reduction)
  }
,
{ // state 1668
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 1669
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1422, // "/"
160,715, // oneLineComment
161,48, // blockComment
162,732, // doubleSlash
164,1194, // slashStar
MIN_REDUCTION+205, // (default reduction)
  }
,
{ // state 1670
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
129,482, // eol
130,1769, // comment
131,1062, // {10}
132,1577, // {13}
MIN_REDUCTION+205, // (default reduction)
  }
,
{ // state 1671
MIN_REDUCTION+295, // (default reduction)
  }
,
{ // state 1672
178,MIN_REDUCTION+231, // $NT
  }
,
{ // state 1673
0x80000000|1250, // match move
0x80000000|1348, // no-match move
0x80000000|1622, // NT-test-match state for slashStar
  }
,
{ // state 1674
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1309, // "/"
161,48, // blockComment
164,1194, // slashStar
MIN_REDUCTION+97, // (default reduction)
  }
,
{ // state 1675
91,1646, // "a"
113,1271, // "r"
114,1002, // "u"
  }
,
{ // state 1676
0x80000000|1461, // match move
0x80000000|1636, // no-match move
0x80000000|63, // NT-test-match state for doubleSlash
  }
,
{ // state 1677
MIN_REDUCTION+339, // (default reduction)
  }
,
{ // state 1678
0x80000000|1922, // match move
0x80000000|751, // no-match move
0x80000000|1622, // NT-test-match state for slashStar
  }
,
{ // state 1679
113,975, // "r"
  }
,
{ // state 1680
MIN_REDUCTION+105, // (default reduction)
  }
,
{ // state 1681
2,946, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1309, // "/"
161,48, // blockComment
164,1194, // slashStar
MIN_REDUCTION+317, // (default reduction)
  }
,
{ // state 1682
2,1644, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
129,482, // eol
130,1769, // comment
131,1062, // {10}
132,1577, // {13}
MIN_REDUCTION+158, // (default reduction)
  }
,
{ // state 1683
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
129,482, // eol
130,1769, // comment
131,1062, // {10}
132,1577, // {13}
MIN_REDUCTION+159, // (default reduction)
  }
,
{ // state 1684
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1309, // "/"
161,48, // blockComment
164,1194, // slashStar
MIN_REDUCTION+163, // (default reduction)
  }
,
{ // state 1685
0x80000000|1, // match move
0x80000000|264, // no-match move
0x80000000|521, // NT-test-match state for letter
  }
,
{ // state 1686
0x80000000|628, // match move
0x80000000|1343, // no-match move
0x80000000|1622, // NT-test-match state for slashStar
  }
,
{ // state 1687
120,1280, // "n"
  }
,
{ // state 1688
0x80000000|599, // match move
0x80000000|1685, // no-match move
0x80000000|64, // NT-test-match state for idChar
  }
,
{ // state 1689
0x80000000|1, // match move
0x80000000|1610, // no-match move
0x80000000|64, // NT-test-match state for idChar
  }
,
{ // state 1690
0x80000000|1264, // match move
0x80000000|855, // no-match move
0x80000000|1581, // NT-test-match state for reserved
  }
,
{ // state 1691
2,527, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1309, // "/"
161,48, // blockComment
164,1194, // slashStar
MIN_REDUCTION+166, // (default reduction)
  }
,
{ // state 1692
MIN_REDUCTION+59, // (default reduction)
  }
,
{ // state 1693
0x80000000|1776, // match move
0x80000000|481, // no-match move
0x80000000|63, // NT-test-match state for doubleSlash
  }
,
{ // state 1694
0x80000000|532, // match move
0x80000000|1869, // no-match move
0x80000000|1622, // NT-test-match state for slashStar
  }
,
{ // state 1695
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1422, // "/"
160,715, // oneLineComment
161,48, // blockComment
162,732, // doubleSlash
164,1194, // slashStar
MIN_REDUCTION+295, // (default reduction)
  }
,
{ // state 1696
121,1985, // "t"
  }
,
{ // state 1697
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1422, // "/"
160,715, // oneLineComment
161,48, // blockComment
162,732, // doubleSlash
164,1194, // slashStar
MIN_REDUCTION+322, // (default reduction)
  }
,
{ // state 1698
95,52, // "e"
  }
,
{ // state 1699
123,446, // "z"
  }
,
{ // state 1700
0x80000000|1063, // match move
0x80000000|386, // no-match move
0x80000000|63, // NT-test-match state for doubleSlash
  }
,
{ // state 1701
0x80000000|1, // match move
0x80000000|561, // no-match move
0x80000000|64, // NT-test-match state for idChar
  }
,
{ // state 1702
0x80000000|956, // match move
0x80000000|1673, // no-match move
0x80000000|63, // NT-test-match state for doubleSlash
  }
,
{ // state 1703
112,1246, // "o"
  }
,
{ // state 1704
121,1543, // "t"
  }
,
{ // state 1705
2,1816, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1309, // "/"
161,48, // blockComment
164,1194, // slashStar
MIN_REDUCTION+144, // (default reduction)
  }
,
{ // state 1706
131,1439, // {10}
  }
,
{ // state 1707
0x80000000|1, // match move
0x80000000|714, // no-match move
0x80000000|64, // NT-test-match state for idChar
  }
,
{ // state 1708
114,13, // "u"
  }
,
{ // state 1709
MIN_REDUCTION+304, // (default reduction)
  }
,
{ // state 1710
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
129,482, // eol
130,1769, // comment
131,1062, // {10}
132,1577, // {13}
MIN_REDUCTION+208, // (default reduction)
  }
,
{ // state 1711
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1309, // "/"
161,48, // blockComment
164,1194, // slashStar
MIN_REDUCTION+167, // (default reduction)
  }
,
{ // state 1712
0x80000000|931, // match move
0x80000000|1639, // no-match move
0x80000000|63, // NT-test-match state for doubleSlash
  }
,
{ // state 1713
0x80000000|1205, // match move
0x80000000|1469, // no-match move
0x80000000|1622, // NT-test-match state for slashStar
  }
,
{ // state 1714
118,83, // "h"
  }
,
{ // state 1715
MIN_REDUCTION+153, // (default reduction)
  }
,
{ // state 1716
125,792, // white
126,857, // {12}
127,857, // " "
128,857, // {9}
129,1169, // eol
130,977, // comment
131,1299, // {10}
132,884, // {13}
143,1422, // "/"
160,1218, // oneLineComment
161,821, // blockComment
162,1907, // doubleSlash
164,782, // slashStar
178,MIN_REDUCTION+193, // $NT
  }
,
{ // state 1717
90,1141, // "l"
  }
,
{ // state 1718
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1309, // "/"
161,48, // blockComment
164,1194, // slashStar
MIN_REDUCTION+363, // (default reduction)
  }
,
{ // state 1719
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
129,482, // eol
130,1769, // comment
131,1062, // {10}
132,1577, // {13}
MIN_REDUCTION+135, // (default reduction)
  }
,
{ // state 1720
2,955, // white*
125,2024, // white
126,857, // {12}
127,857, // " "
128,857, // {9}
129,1169, // eol
130,977, // comment
131,1299, // {10}
132,884, // {13}
143,1422, // "/"
160,1218, // oneLineComment
161,821, // blockComment
162,1907, // doubleSlash
164,782, // slashStar
178,MIN_REDUCTION+260, // $NT
  }
,
{ // state 1721
2,1211, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1309, // "/"
161,48, // blockComment
164,1194, // slashStar
MIN_REDUCTION+174, // (default reduction)
  }
,
{ // state 1722
0x80000000|1184, // match move
0x80000000|680, // no-match move
0x80000000|63, // NT-test-match state for doubleSlash
  }
,
{ // state 1723
0x80000000|1970, // match move
0x80000000|830, // no-match move
0x80000000|1622, // NT-test-match state for slashStar
  }
,
{ // state 1724
0x80000000|1, // match move
0x80000000|1748, // no-match move
0x80000000|64, // NT-test-match state for idChar
  }
,
{ // state 1725
125,792, // white
126,857, // {12}
127,857, // " "
128,857, // {9}
129,1169, // eol
130,977, // comment
131,1299, // {10}
132,884, // {13}
143,1422, // "/"
160,1218, // oneLineComment
161,821, // blockComment
162,1907, // doubleSlash
164,782, // slashStar
178,MIN_REDUCTION+229, // $NT
  }
,
{ // state 1726
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
129,482, // eol
130,1769, // comment
131,1062, // {10}
132,1577, // {13}
MIN_REDUCTION+177, // (default reduction)
  }
,
{ // state 1727
0x80000000|1, // match move
0x80000000|688, // no-match move
0x80000000|64, // NT-test-match state for idChar
  }
,
{ // state 1728
2,371, // white*
125,2024, // white
126,857, // {12}
127,857, // " "
128,857, // {9}
129,1169, // eol
130,977, // comment
131,1299, // {10}
132,884, // {13}
143,1422, // "/"
160,1218, // oneLineComment
161,821, // blockComment
162,1907, // doubleSlash
164,782, // slashStar
178,MIN_REDUCTION+236, // $NT
  }
,
{ // state 1729
MIN_REDUCTION+88, // (default reduction)
  }
,
{ // state 1730
0x80000000|576, // match move
0x80000000|1806, // no-match move
0x80000000|63, // NT-test-match state for doubleSlash
  }
,
{ // state 1731
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1422, // "/"
160,715, // oneLineComment
161,48, // blockComment
162,732, // doubleSlash
164,1194, // slashStar
MIN_REDUCTION+292, // (default reduction)
  }
,
{ // state 1732
MIN_REDUCTION+235, // (default reduction)
  }
,
{ // state 1733
125,792, // white
126,857, // {12}
127,857, // " "
128,857, // {9}
129,1169, // eol
130,977, // comment
131,1299, // {10}
132,884, // {13}
143,1422, // "/"
160,1218, // oneLineComment
161,821, // blockComment
162,1907, // doubleSlash
164,782, // slashStar
178,MIN_REDUCTION+184, // $NT
  }
,
{ // state 1734
0x80000000|1178, // match move
0x80000000|1589, // no-match move
0x80000000|1622, // NT-test-match state for slashStar
  }
,
{ // state 1735
120,1329, // "n"
  }
,
{ // state 1736
2,1955, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1309, // "/"
161,48, // blockComment
164,1194, // slashStar
MIN_REDUCTION+296, // (default reduction)
  }
,
{ // state 1737
125,792, // white
126,857, // {12}
127,857, // " "
128,857, // {9}
129,1169, // eol
130,977, // comment
131,1299, // {10}
132,884, // {13}
143,1422, // "/"
160,1218, // oneLineComment
161,821, // blockComment
162,1907, // doubleSlash
164,782, // slashStar
178,MIN_REDUCTION+187, // $NT
  }
,
{ // state 1738
2,215, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
129,482, // eol
130,1769, // comment
131,1062, // {10}
132,1577, // {13}
MIN_REDUCTION+172, // (default reduction)
  }
,
{ // state 1739
0x80000000|1842, // match move
0x80000000|538, // no-match move
0x80000000|1622, // NT-test-match state for slashStar
  }
,
{ // state 1740
MIN_REDUCTION+38, // (default reduction)
  }
,
{ // state 1741
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1309, // "/"
161,48, // blockComment
164,1194, // slashStar
MIN_REDUCTION+340, // (default reduction)
  }
,
{ // state 1742
0x80000000|1917, // match move
0x80000000|774, // no-match move
0x80000000|1622, // NT-test-match state for slashStar
  }
,
{ // state 1743
121,1181, // "t"
  }
,
{ // state 1744
0x80000000|1266, // match move
0x80000000|1857, // no-match move
0x80000000|1581, // NT-test-match state for reserved
  }
,
{ // state 1745
2,781, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1422, // "/"
160,715, // oneLineComment
161,48, // blockComment
162,732, // doubleSlash
164,1194, // slashStar
MIN_REDUCTION+218, // (default reduction)
  }
,
{ // state 1746
0x80000000|1638, // match move
0x80000000|207, // no-match move
0x80000000|63, // NT-test-match state for doubleSlash
  }
,
{ // state 1747
0x80000000|706, // match move
0x80000000|1293, // no-match move
0x80000000|63, // NT-test-match state for doubleSlash
  }
,
{ // state 1748
0x80000000|1244, // match move
0x80000000|1560, // no-match move
0x80000000|63, // NT-test-match state for doubleSlash
  }
,
{ // state 1749
108,776, // "y"
114,1652, // "u"
118,592, // "h"
121,1382, // "t"
122,167, // "w"
  }
,
{ // state 1750
0x80000000|1915, // match move
0x80000000|510, // no-match move
0x80000000|63, // NT-test-match state for doubleSlash
  }
,
{ // state 1751
105,97, // "m"
  }
,
{ // state 1752
0x80000000|889, // match move
0x80000000|1954, // no-match move
0x80000000|63, // NT-test-match state for doubleSlash
  }
,
{ // state 1753
0x80000000|762, // match move
0x80000000|501, // no-match move
0x80000000|63, // NT-test-match state for doubleSlash
  }
,
{ // state 1754
2,472, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1422, // "/"
160,715, // oneLineComment
161,48, // blockComment
162,732, // doubleSlash
164,1194, // slashStar
MIN_REDUCTION+323, // (default reduction)
  }
,
{ // state 1755
121,1615, // "t"
  }
,
{ // state 1756
112,1136, // "o"
  }
,
{ // state 1757
95,1727, // "e"
  }
,
{ // state 1758
112,1782, // "o"
  }
,
{ // state 1759
0x80000000|1, // match move
0x80000000|1767, // no-match move
0x80000000|64, // NT-test-match state for idChar
  }
,
{ // state 1760
178,MIN_REDUCTION+122, // $NT
MIN_REDUCTION+122, // (default reduction)
  }
,
{ // state 1761
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1422, // "/"
160,715, // oneLineComment
161,48, // blockComment
162,732, // doubleSlash
164,1194, // slashStar
MIN_REDUCTION+153, // (default reduction)
  }
,
{ // state 1762
0x80000000|1, // match move
0x80000000|744, // no-match move
0x80000000|64, // NT-test-match state for idChar
  }
,
{ // state 1763
0x80000000|730, // match move
0x80000000|1315, // no-match move
0x80000000|1622, // NT-test-match state for slashStar
  }
,
{ // state 1764
178,MIN_REDUCTION+264, // $NT
  }
,
{ // state 1765
0x80000000|1, // match move
0x80000000|743, // no-match move
0x80000000|64, // NT-test-match state for idChar
  }
,
{ // state 1766
105,1724, // "m"
  }
,
{ // state 1767
0x80000000|1588, // match move
0x80000000|787, // no-match move
0x80000000|63, // NT-test-match state for doubleSlash
  }
,
{ // state 1768
2,1880, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1309, // "/"
161,48, // blockComment
164,1194, // slashStar
MIN_REDUCTION+191, // (default reduction)
  }
,
{ // state 1769
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 1770
0x80000000|1569, // match move
0x80000000|155, // no-match move
0x80000000|1622, // NT-test-match state for slashStar
  }
,
{ // state 1771
0x80000000|1736, // match move
0x80000000|914, // no-match move
0x80000000|1622, // NT-test-match state for slashStar
  }
,
{ // state 1772
108,899, // "y"
114,284, // "u"
118,800, // "h"
121,2016, // "t"
122,1029, // "w"
  }
,
{ // state 1773
0x80000000|423, // match move
0x80000000|286, // no-match move
0x80000000|63, // NT-test-match state for doubleSlash
  }
,
{ // state 1774
112,100, // "o"
  }
,
{ // state 1775
MIN_REDUCTION+101, // (default reduction)
  }
,
{ // state 1776
2,1644, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1422, // "/"
160,715, // oneLineComment
161,48, // blockComment
162,732, // doubleSlash
164,1194, // slashStar
MIN_REDUCTION+158, // (default reduction)
  }
,
{ // state 1777
0x80000000|1080, // match move
0x80000000|1969, // no-match move
0x80000000|63, // NT-test-match state for doubleSlash
  }
,
{ // state 1778
0x80000000|686, // match move
0x80000000|341, // no-match move
0x80000000|63, // NT-test-match state for doubleSlash
  }
,
{ // state 1779
125,792, // white
126,857, // {12}
127,857, // " "
128,857, // {9}
129,1169, // eol
130,977, // comment
131,1299, // {10}
132,884, // {13}
143,1422, // "/"
160,1218, // oneLineComment
161,821, // blockComment
162,1907, // doubleSlash
164,782, // slashStar
178,MIN_REDUCTION+223, // $NT
  }
,
{ // state 1780
95,388, // "e"
  }
,
{ // state 1781
0x80000000|958, // match move
0x80000000|2003, // no-match move
0x80000000|63, // NT-test-match state for doubleSlash
  }
,
{ // state 1782
90,1166, // "l"
  }
,
{ // state 1783
178,MIN_REDUCTION+129, // $NT
MIN_REDUCTION+129, // (default reduction)
  }
,
{ // state 1784
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1309, // "/"
161,48, // blockComment
164,1194, // slashStar
MIN_REDUCTION+362, // (default reduction)
  }
,
{ // state 1785
MIN_REDUCTION+274, // (default reduction)
  }
,
{ // state 1786
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 1787
121,1701, // "t"
  }
,
{ // state 1788
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
129,482, // eol
130,1769, // comment
131,1062, // {10}
132,1577, // {13}
MIN_REDUCTION+331, // (default reduction)
  }
,
{ // state 1789
MIN_REDUCTION+97, // (default reduction)
  }
,
{ // state 1790
0x80000000|1377, // match move
0x80000000|1912, // no-match move
0x80000000|63, // NT-test-match state for doubleSlash
  }
,
{ // state 1791
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1422, // "/"
160,715, // oneLineComment
161,48, // blockComment
162,732, // doubleSlash
164,1194, // slashStar
MIN_REDUCTION+220, // (default reduction)
  }
,
{ // state 1792
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1309, // "/"
161,48, // blockComment
164,1194, // slashStar
MIN_REDUCTION+161, // (default reduction)
  }
,
{ // state 1793
120,1624, // "n"
  }
,
{ // state 1794
110,1401, // "i"
  }
,
{ // state 1795
0x80000000|411, // match move
0x80000000|675, // no-match move
0x80000000|1622, // NT-test-match state for slashStar
  }
,
{ // state 1796
0x80000000|1, // match move
0x80000000|1712, // no-match move
0x80000000|64, // NT-test-match state for idChar
  }
,
{ // state 1797
2,692, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1309, // "/"
161,48, // blockComment
164,1194, // slashStar
MIN_REDUCTION+302, // (default reduction)
  }
,
{ // state 1798
0x80000000|218, // match move
0x80000000|1986, // no-match move
0x80000000|64, // NT-test-match state for idChar
  }
,
{ // state 1799
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
129,482, // eol
130,1769, // comment
131,1062, // {10}
132,1577, // {13}
MIN_REDUCTION+313, // (default reduction)
  }
,
{ // state 1800
178,MIN_REDUCTION+285, // $NT
  }
,
{ // state 1801
0x80000000|1440, // match move
0x80000000|8, // no-match move
0x80000000|1622, // NT-test-match state for slashStar
  }
,
{ // state 1802
0x80000000|1154, // match move
0x80000000|1413, // no-match move
0x80000000|1622, // NT-test-match state for slashStar
  }
,
{ // state 1803
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1422, // "/"
160,715, // oneLineComment
161,48, // blockComment
162,732, // doubleSlash
164,1194, // slashStar
MIN_REDUCTION+159, // (default reduction)
  }
,
{ // state 1804
0x80000000|234, // match move
0x80000000|1212, // no-match move
0x80000000|1581, // NT-test-match state for reserved
  }
,
{ // state 1805
0x80000000|170, // match move
0x80000000|1245, // no-match move
0x80000000|1581, // NT-test-match state for reserved
  }
,
{ // state 1806
0x80000000|28, // match move
0x80000000|467, // no-match move
0x80000000|1581, // NT-test-match state for reserved
  }
,
{ // state 1807
2,1910, // white*
MIN_REDUCTION+146, // (default reduction)
  }
,
{ // state 1808
0x80000000|2011, // match move
0x80000000|1876, // no-match move
0x80000000|1581, // NT-test-match state for reserved
  }
,
{ // state 1809
90,1573, // "l"
  }
,
{ // state 1810
95,1751, // "e"
  }
,
{ // state 1811
0x80000000|1, // match move
0x80000000|1702, // no-match move
0x80000000|64, // NT-test-match state for idChar
  }
,
{ // state 1812
95,373, // "e"
  }
,
{ // state 1813
2,418, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1309, // "/"
161,48, // blockComment
164,1194, // slashStar
MIN_REDUCTION+263, // (default reduction)
  }
,
{ // state 1814
0x80000000|1, // match move
0x80000000|731, // no-match move
0x80000000|64, // NT-test-match state for idChar
  }
,
{ // state 1815
95,82, // "e"
  }
,
{ // state 1816
0x80000000|901, // match move
0x80000000|1808, // no-match move
0x80000000|63, // NT-test-match state for doubleSlash
  }
,
{ // state 1817
92,1657, // "s"
  }
,
{ // state 1818
90,1810, // "l"
112,953, // "o"
  }
,
{ // state 1819
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1309, // "/"
161,48, // blockComment
164,1194, // slashStar
MIN_REDUCTION+131, // (default reduction)
  }
,
{ // state 1820
91,918, // "a"
  }
,
{ // state 1821
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
129,482, // eol
130,1769, // comment
131,1062, // {10}
132,1577, // {13}
MIN_REDUCTION+229, // (default reduction)
  }
,
{ // state 1822
125,792, // white
126,857, // {12}
127,857, // " "
128,857, // {9}
129,1169, // eol
130,977, // comment
131,1299, // {10}
132,884, // {13}
143,1422, // "/"
160,1218, // oneLineComment
161,821, // blockComment
162,1907, // doubleSlash
164,782, // slashStar
178,MIN_REDUCTION+92, // $NT
  }
,
{ // state 1823
0x80000000|22, // match move
0x80000000|1039, // no-match move
0x80000000|63, // NT-test-match state for doubleSlash
  }
,
{ // state 1824
0x80000000|610, // match move
0x80000000|115, // no-match move
0x80000000|63, // NT-test-match state for doubleSlash
  }
,
{ // state 1825
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 1826
0x80000000|605, // match move
0x80000000|1949, // no-match move
0x80000000|63, // NT-test-match state for doubleSlash
  }
,
{ // state 1827
MIN_REDUCTION+334, // (default reduction)
  }
,
{ // state 1828
2,1119, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1309, // "/"
161,48, // blockComment
164,1194, // slashStar
MIN_REDUCTION+254, // (default reduction)
  }
,
{ // state 1829
2,1120, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
129,482, // eol
130,1769, // comment
131,1062, // {10}
132,1577, // {13}
MIN_REDUCTION+287, // (default reduction)
  }
,
{ // state 1830
MIN_REDUCTION+286, // (default reduction)
  }
,
{ // state 1831
2,856, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1309, // "/"
161,48, // blockComment
164,1194, // slashStar
MIN_REDUCTION+176, // (default reduction)
  }
,
{ // state 1832
0x80000000|1489, // match move
0x80000000|412, // no-match move
0x80000000|1581, // NT-test-match state for reserved
  }
,
{ // state 1833
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
129,482, // eol
130,1769, // comment
131,1062, // {10}
132,1577, // {13}
MIN_REDUCTION+173, // (default reduction)
  }
,
{ // state 1834
121,375, // "t"
  }
,
{ // state 1835
MIN_REDUCTION+63, // (default reduction)
  }
,
{ // state 1836
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1422, // "/"
160,715, // oneLineComment
161,48, // blockComment
162,732, // doubleSlash
164,1194, // slashStar
MIN_REDUCTION+155, // (default reduction)
  }
,
{ // state 1837
91,1556, // "a"
  }
,
{ // state 1838
125,792, // white
126,857, // {12}
127,857, // " "
128,857, // {9}
129,1169, // eol
130,977, // comment
131,1299, // {10}
132,884, // {13}
143,1422, // "/"
160,1218, // oneLineComment
161,821, // blockComment
162,1907, // doubleSlash
164,782, // slashStar
178,MIN_REDUCTION+256, // $NT
  }
,
{ // state 1839
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
129,482, // eol
130,1769, // comment
131,1062, // {10}
132,1577, // {13}
MIN_REDUCTION+193, // (default reduction)
  }
,
{ // state 1840
178,MIN_REDUCTION+300, // $NT
  }
,
{ // state 1841
91,402, // "a"
  }
,
{ // state 1842
2,1423, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1309, // "/"
161,48, // blockComment
164,1194, // slashStar
MIN_REDUCTION+203, // (default reduction)
  }
,
{ // state 1843
123,138, // "z"
  }
,
{ // state 1844
MIN_REDUCTION+103, // (default reduction)
  }
,
{ // state 1845
2,23, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
129,482, // eol
130,1769, // comment
131,1062, // {10}
132,1577, // {13}
MIN_REDUCTION+311, // (default reduction)
  }
,
{ // state 1846
MIN_REDUCTION+103, // (default reduction)
  }
,
{ // state 1847
92,1980, // "s"
121,163, // "t"
  }
,
{ // state 1848
0x80000000|223, // match move
0x80000000|1142, // no-match move
0x80000000|1581, // NT-test-match state for reserved
  }
,
{ // state 1849
MIN_REDUCTION+141, // (default reduction)
  }
,
{ // state 1850
0x80000000|307, // match move
0x80000000|151, // no-match move
0x80000000|1622, // NT-test-match state for slashStar
  }
,
{ // state 1851
0x80000000|1068, // match move
0x80000000|1690, // no-match move
0x80000000|63, // NT-test-match state for doubleSlash
  }
,
{ // state 1852
2,940, // white*
125,2024, // white
126,857, // {12}
127,857, // " "
128,857, // {9}
129,1169, // eol
130,977, // comment
131,1299, // {10}
132,884, // {13}
143,1422, // "/"
160,1218, // oneLineComment
161,821, // blockComment
162,1907, // doubleSlash
164,782, // slashStar
178,MIN_REDUCTION+293, // $NT
  }
,
{ // state 1853
MIN_REDUCTION+128, // (default reduction)
  }
,
{ // state 1854
0x80000000|664, // match move
0x80000000|1829, // no-match move
0x80000000|1622, // NT-test-match state for slashStar
  }
,
{ // state 1855
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
129,482, // eol
130,1769, // comment
131,1062, // {10}
132,1577, // {13}
MIN_REDUCTION+286, // (default reduction)
  }
,
{ // state 1856
4,1330, // token
58,1508, // `!
59,1692, // `!=
60,882, // `%
61,685, // `&&
62,657, // `*
63,1835, // `(
64,1936, // `)
65,1023, // `{
66,1027, // `}
67,1043, // `-
68,809, // `+
69,625, // `=
70,1179, // `==
71,439, // `[
72,1452, // `]
73,396, // `||
74,2021, // `<
75,602, // `<=
76,175, // `,
77,298, // `>
78,778, // `>=
79,31, // `.
80,968, // `;
81,938, // `++
82,417, // `--
83,1825, // `/
84,738, // `:
85,1607, // ID
86,793, // INT_LITERAL
87,136, // STRING_LITERAL
88,1729, // CHAR_LITERAL
89,653, // "c"
90,653, // "l"
91,653, // "a"
92,653, // "s"
95,653, // "e"
96,1108, // "!"
97,1889, // "="
98,404, // "+"
99,795, // digit++
100,1688, // letter
101,1240, // digit
103,653, // "d"
104,653, // "g"
105,653, // "m"
106,653, // "p"
107,653, // "v"
108,653, // "y"
109,653, // "f"
110,653, // "i"
111,653, // {"A".."Z"}
112,653, // "o"
113,653, // "r"
114,653, // "u"
115,653, // "x"
116,653, // {"j" "q"}
117,653, // "b"
118,653, // "h"
119,653, // "k"
120,653, // "n"
121,653, // "t"
122,653, // "w"
123,653, // "z"
124,392, // {"0".."9"}
134,1009, // "["
135,999, // "-"
136,1173, // "<"
137,447, // "|"
139,2015, // "&"
140,395, // ")"
141,1948, // ","
142,173, // "]"
143,1229, // "/"
145,1310, // ";"
146,552, // ">"
147,1278, // "{"
148,1011, // "%"
149,458, // "("
151,1391, // "."
152,1654, // ":"
153,1823, // "}"
155,991, // "'"
156,661, // '"'
157,253, // "*"
168,1557, // letter++
174,594, // digit+
176,1151, // letter+
MIN_REDUCTION+361, // (default reduction)
  }
,
{ // state 1857
0x80000000|166, // match move
0x80000000|1661, // no-match move
0x80000000|1622, // NT-test-match state for slashStar
  }
,
{ // state 1858
0x80000000|454, // match move
0x80000000|183, // no-match move
0x80000000|63, // NT-test-match state for doubleSlash
  }
,
{ // state 1859
90,485, // "l"
  }
,
{ // state 1860
110,1687, // "i"
  }
,
{ // state 1861
2,873, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1309, // "/"
161,48, // blockComment
164,1194, // slashStar
MIN_REDUCTION+96, // (default reduction)
  }
,
{ // state 1862
MIN_REDUCTION+4, // (default reduction)
  }
,
{ // state 1863
0x80000000|629, // match move
0x80000000|1239, // no-match move
0x80000000|1622, // NT-test-match state for slashStar
  }
,
{ // state 1864
0x80000000|727, // match move
0x80000000|1087, // no-match move
0x80000000|1581, // NT-test-match state for reserved
  }
,
{ // state 1865
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1422, // "/"
160,715, // oneLineComment
161,48, // blockComment
162,732, // doubleSlash
164,1194, // slashStar
MIN_REDUCTION+165, // (default reduction)
  }
,
{ // state 1866
0x80000000|1, // match move
0x80000000|669, // no-match move
0x80000000|64, // NT-test-match state for idChar
  }
,
{ // state 1867
90,55, // "l"
  }
,
{ // state 1868
110,249, // "i"
113,690, // "r"
  }
,
{ // state 1869
2,1700, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
129,482, // eol
130,1769, // comment
131,1062, // {10}
132,1577, // {13}
MIN_REDUCTION+314, // (default reduction)
  }
,
{ // state 1870
2,1441, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1309, // "/"
161,48, // blockComment
164,1194, // slashStar
MIN_REDUCTION+200, // (default reduction)
  }
,
{ // state 1871
0x80000000|1143, // match move
0x80000000|1022, // no-match move
0x80000000|63, // NT-test-match state for doubleSlash
  }
,
{ // state 1872
92,260, // "s"
  }
,
{ // state 1873
0x80000000|195, // match move
0x80000000|221, // no-match move
0x80000000|64, // NT-test-match state for idChar
  }
,
{ // state 1874
125,792, // white
126,857, // {12}
127,857, // " "
128,857, // {9}
129,1169, // eol
130,977, // comment
131,1299, // {10}
132,884, // {13}
143,1422, // "/"
160,1218, // oneLineComment
161,821, // blockComment
162,1907, // doubleSlash
164,782, // slashStar
178,MIN_REDUCTION+295, // $NT
  }
,
{ // state 1875
2,548, // white*
MIN_REDUCTION+162, // (default reduction)
  }
,
{ // state 1876
0x80000000|789, // match move
0x80000000|1927, // no-match move
0x80000000|1622, // NT-test-match state for slashStar
  }
,
{ // state 1877
0x80000000|1, // match move
0x80000000|1920, // no-match move
0x80000000|64, // NT-test-match state for idChar
  }
,
{ // state 1878
0x80000000|1317, // match move
0x80000000|1165, // no-match move
0x80000000|1622, // NT-test-match state for slashStar
  }
,
{ // state 1879
0x80000000|1223, // match move
0x80000000|225, // no-match move
0x80000000|1581, // NT-test-match state for reserved
  }
,
{ // state 1880
0x80000000|383, // match move
0x80000000|262, // no-match move
0x80000000|63, // NT-test-match state for doubleSlash
  }
,
{ // state 1881
0x80000000|1674, // match move
0x80000000|263, // no-match move
0x80000000|1622, // NT-test-match state for slashStar
  }
,
{ // state 1882
2,548, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1309, // "/"
161,48, // blockComment
164,1194, // slashStar
MIN_REDUCTION+162, // (default reduction)
  }
,
{ // state 1883
125,792, // white
126,857, // {12}
127,857, // " "
128,857, // {9}
129,1169, // eol
130,977, // comment
131,1299, // {10}
132,884, // {13}
143,1422, // "/"
160,1218, // oneLineComment
161,821, // blockComment
162,1907, // doubleSlash
164,782, // slashStar
178,MIN_REDUCTION+298, // $NT
  }
,
{ // state 1884
0x80000000|1, // match move
0x80000000|860, // no-match move
0x80000000|64, // NT-test-match state for idChar
  }
,
{ // state 1885
2,856, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1422, // "/"
160,715, // oneLineComment
161,48, // blockComment
162,732, // doubleSlash
164,1194, // slashStar
MIN_REDUCTION+176, // (default reduction)
  }
,
{ // state 1886
MIN_REDUCTION+363, // (default reduction)
  }
,
{ // state 1887
3,6, // $$0
4,1056, // token
125,712, // white
126,1479, // {12}
127,1479, // " "
128,1479, // {9}
130,1375, // comment
143,1422, // "/"
160,1629, // oneLineComment
161,1106, // blockComment
162,2020, // doubleSlash
164,1520, // slashStar
173,1599, // token*
MIN_REDUCTION+3, // (default reduction)
  }
,
{ // state 1888
0x80000000|1494, // match move
0x80000000|779, // no-match move
0x80000000|1581, // NT-test-match state for reserved
  }
,
{ // state 1889
0x80000000|1294, // match move
0x80000000|917, // no-match move
0x80000000|63, // NT-test-match state for doubleSlash
  }
,
{ // state 1890
178,MIN_REDUCTION+123, // $NT
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 1891
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1422, // "/"
160,715, // oneLineComment
161,48, // blockComment
162,732, // doubleSlash
164,1194, // slashStar
MIN_REDUCTION+298, // (default reduction)
  }
,
{ // state 1892
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
129,482, // eol
130,1769, // comment
131,1062, // {10}
132,1577, // {13}
MIN_REDUCTION+289, // (default reduction)
  }
,
{ // state 1893
92,814, // "s"
  }
,
{ // state 1894
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1309, // "/"
161,48, // blockComment
164,1194, // slashStar
MIN_REDUCTION+226, // (default reduction)
  }
,
{ // state 1895
0x80000000|1, // match move
0x80000000|1135, // no-match move
0x80000000|64, // NT-test-match state for idChar
  }
,
{ // state 1896
112,400, // "o"
  }
,
{ // state 1897
121,1708, // "t"
  }
,
{ // state 1898
0x80000000|654, // match move
0x80000000|1487, // no-match move
0x80000000|1581, // NT-test-match state for reserved
  }
,
{ // state 1899
0x80000000|826, // match move
0x80000000|1855, // no-match move
0x80000000|1622, // NT-test-match state for slashStar
  }
,
{ // state 1900
117,1596, // "b"
  }
,
{ // state 1901
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1309, // "/"
161,48, // blockComment
164,1194, // slashStar
MIN_REDUCTION+271, // (default reduction)
  }
,
{ // state 1902
89,1393, // "c"
90,1393, // "l"
91,1393, // "a"
92,1393, // "s"
95,1393, // "e"
96,1393, // "!"
97,1393, // "="
98,1393, // "+"
102,1393, // "_"
103,1393, // "d"
104,1393, // "g"
105,1393, // "m"
106,1393, // "p"
107,1393, // "v"
108,1393, // "y"
109,1393, // "f"
110,1393, // "i"
111,1393, // {"A".."Z"}
112,1393, // "o"
113,1393, // "r"
114,1393, // "u"
115,1393, // "x"
116,1393, // {"j" "q"}
117,1393, // "b"
118,1393, // "h"
119,1393, // "k"
120,1393, // "n"
121,1393, // "t"
122,1393, // "w"
123,1393, // "z"
124,1393, // {"0".."9"}
127,1393, // " "
129,1341, // eol
131,1062, // {10}
132,1577, // {13}
133,1255, // printable
134,1393, // "["
135,1393, // "-"
136,1393, // "<"
137,1393, // "|"
138,1393, // {"?".."@"}
139,1393, // "&"
140,1393, // ")"
141,1393, // ","
142,1393, // "]"
143,1393, // "/"
144,1393, // {"#".."$"}
145,1393, // ";"
146,1393, // ">"
147,1393, // "{"
148,1393, // "%"
149,1393, // "("
150,1393, // "\"
151,1393, // "."
152,1393, // ":"
153,1393, // "}"
154,1393, // {"^" "`" "~"}
155,1393, // "'"
156,1393, // '"'
157,1393, // "*"
  }
,
{ // state 1903
125,792, // white
126,857, // {12}
127,857, // " "
128,857, // {9}
129,1169, // eol
130,977, // comment
131,1299, // {10}
132,884, // {13}
143,1422, // "/"
160,1218, // oneLineComment
161,821, // blockComment
162,1907, // doubleSlash
164,782, // slashStar
178,MIN_REDUCTION+244, // $NT
  }
,
{ // state 1904
0x80000000|834, // match move
0x80000000|765, // no-match move
0x80000000|1581, // NT-test-match state for reserved
  }
,
{ // state 1905
110,1699, // "i"
  }
,
{ // state 1906
2,1662, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1422, // "/"
160,715, // oneLineComment
161,48, // blockComment
162,732, // doubleSlash
164,1194, // slashStar
MIN_REDUCTION+148, // (default reduction)
  }
,
{ // state 1907
89,1393, // "c"
90,1393, // "l"
91,1393, // "a"
92,1393, // "s"
95,1393, // "e"
96,1393, // "!"
97,1393, // "="
98,1393, // "+"
102,1393, // "_"
103,1393, // "d"
104,1393, // "g"
105,1393, // "m"
106,1393, // "p"
107,1393, // "v"
108,1393, // "y"
109,1393, // "f"
110,1393, // "i"
111,1393, // {"A".."Z"}
112,1393, // "o"
113,1393, // "r"
114,1393, // "u"
115,1393, // "x"
116,1393, // {"j" "q"}
117,1393, // "b"
118,1393, // "h"
119,1393, // "k"
120,1393, // "n"
121,1393, // "t"
122,1393, // "w"
123,1393, // "z"
124,1393, // {"0".."9"}
127,1393, // " "
129,1760, // eol
131,1299, // {10}
132,884, // {13}
133,558, // printable
134,1393, // "["
135,1393, // "-"
136,1393, // "<"
137,1393, // "|"
138,1393, // {"?".."@"}
139,1393, // "&"
140,1393, // ")"
141,1393, // ","
142,1393, // "]"
143,1393, // "/"
144,1393, // {"#".."$"}
145,1393, // ";"
146,1393, // ">"
147,1393, // "{"
148,1393, // "%"
149,1393, // "("
150,1393, // "\"
151,1393, // "."
152,1393, // ":"
153,1393, // "}"
154,1393, // {"^" "`" "~"}
155,1393, // "'"
156,1393, // '"'
157,1393, // "*"
163,957, // printable*
  }
,
{ // state 1908
MIN_REDUCTION+310, // (default reduction)
  }
,
{ // state 1909
178,MIN_REDUCTION+111, // $NT
MIN_REDUCTION+111, // (default reduction)
  }
,
{ // state 1910
0x80000000|773, // match move
0x80000000|1914, // no-match move
0x80000000|63, // NT-test-match state for doubleSlash
  }
,
{ // state 1911
2,131, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1422, // "/"
160,715, // oneLineComment
161,48, // blockComment
162,732, // doubleSlash
164,1194, // slashStar
MIN_REDUCTION+209, // (default reduction)
  }
,
{ // state 1912
0x80000000|803, // match move
0x80000000|1564, // no-match move
0x80000000|1622, // NT-test-match state for slashStar
  }
,
{ // state 1913
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1422, // "/"
160,715, // oneLineComment
161,48, // blockComment
162,732, // doubleSlash
164,1194, // slashStar
MIN_REDUCTION+307, // (default reduction)
  }
,
{ // state 1914
0x80000000|937, // match move
0x80000000|870, // no-match move
0x80000000|1581, // NT-test-match state for reserved
  }
,
{ // state 1915
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1422, // "/"
160,715, // oneLineComment
161,48, // blockComment
162,732, // doubleSlash
164,1194, // slashStar
MIN_REDUCTION+325, // (default reduction)
  }
,
{ // state 1916
0x80000000|2019, // match move
0x80000000|1277, // no-match move
0x80000000|1622, // NT-test-match state for slashStar
  }
,
{ // state 1917
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1309, // "/"
161,48, // blockComment
164,1194, // slashStar
MIN_REDUCTION+304, // (default reduction)
  }
,
{ // state 1918
4,1330, // token
MIN_REDUCTION+361, // (default reduction)
  }
,
{ // state 1919
MIN_REDUCTION+262, // (default reduction)
  }
,
{ // state 1920
0x80000000|20, // match move
0x80000000|984, // no-match move
0x80000000|63, // NT-test-match state for doubleSlash
  }
,
{ // state 1921
0x80000000|1353, // match move
0x80000000|147, // no-match move
0x80000000|63, // NT-test-match state for doubleSlash
  }
,
{ // state 1922
2,1164, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1309, // "/"
161,48, // blockComment
164,1194, // slashStar
MIN_REDUCTION+170, // (default reduction)
  }
,
{ // state 1923
0x80000000|1472, // match move
0x80000000|1678, // no-match move
0x80000000|1581, // NT-test-match state for reserved
  }
,
{ // state 1924
MIN_REDUCTION+328, // (default reduction)
  }
,
{ // state 1925
0x80000000|248, // match move
0x80000000|549, // no-match move
0x80000000|1622, // NT-test-match state for slashStar
  }
,
{ // state 1926
0x80000000|1081, // match move
0x80000000|200, // no-match move
0x80000000|1581, // NT-test-match state for reserved
  }
,
{ // state 1927
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
129,482, // eol
130,1769, // comment
131,1062, // {10}
132,1577, // {13}
MIN_REDUCTION+143, // (default reduction)
  }
,
{ // state 1928
0x80000000|1326, // match move
0x80000000|1420, // no-match move
0x80000000|1622, // NT-test-match state for slashStar
  }
,
{ // state 1929
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
129,482, // eol
130,1769, // comment
131,1062, // {10}
132,1577, // {13}
MIN_REDUCTION+147, // (default reduction)
  }
,
{ // state 1930
92,1628, // "s"
  }
,
{ // state 1931
178,MIN_REDUCTION+124, // $NT
MIN_REDUCTION+124, // (default reduction)
  }
,
{ // state 1932
95,1704, // "e"
  }
,
{ // state 1933
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1309, // "/"
161,48, // blockComment
164,1194, // slashStar
MIN_REDUCTION+169, // (default reduction)
  }
,
{ // state 1934
0x80000000|1312, // match move
0x80000000|408, // no-match move
0x80000000|1622, // NT-test-match state for slashStar
  }
,
{ // state 1935
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1422, // "/"
160,715, // oneLineComment
161,48, // blockComment
162,732, // doubleSlash
164,1194, // slashStar
MIN_REDUCTION+196, // (default reduction)
  }
,
{ // state 1936
MIN_REDUCTION+64, // (default reduction)
  }
,
{ // state 1937
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
129,482, // eol
130,1769, // comment
131,1062, // {10}
132,1577, // {13}
MIN_REDUCTION+250, // (default reduction)
  }
,
{ // state 1938
0x80000000|523, // match move
0x80000000|1926, // no-match move
0x80000000|63, // NT-test-match state for doubleSlash
  }
,
{ // state 1939
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
129,482, // eol
130,1769, // comment
131,1062, // {10}
132,1577, // {13}
MIN_REDUCTION+179, // (default reduction)
  }
,
{ // state 1940
2,1625, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1422, // "/"
160,715, // oneLineComment
161,48, // blockComment
162,732, // doubleSlash
164,1194, // slashStar
MIN_REDUCTION+212, // (default reduction)
  }
,
{ // state 1941
91,1679, // "a"
  }
,
{ // state 1942
90,1465, // "l"
110,1368, // "i"
  }
,
{ // state 1943
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1309, // "/"
161,48, // blockComment
164,1194, // slashStar
MIN_REDUCTION+283, // (default reduction)
  }
,
{ // state 1944
MIN_REDUCTION+117, // (default reduction)
  }
,
{ // state 1945
2,1324, // white*
125,2024, // white
126,857, // {12}
127,857, // " "
128,857, // {9}
129,1169, // eol
130,977, // comment
131,1299, // {10}
132,884, // {13}
143,1422, // "/"
160,1218, // oneLineComment
161,821, // blockComment
162,1907, // doubleSlash
164,782, // slashStar
178,MIN_REDUCTION+218, // $NT
  }
,
{ // state 1946
0x80000000|997, // match move
0x80000000|1802, // no-match move
0x80000000|63, // NT-test-match state for doubleSlash
  }
,
{ // state 1947
MIN_REDUCTION+31, // (default reduction)
  }
,
{ // state 1948
0x80000000|1582, // match move
0x80000000|942, // no-match move
0x80000000|63, // NT-test-match state for doubleSlash
  }
,
{ // state 1949
0x80000000|656, // match move
0x80000000|961, // no-match move
0x80000000|1581, // NT-test-match state for reserved
  }
,
{ // state 1950
0x80000000|723, // match move
0x80000000|1167, // no-match move
0x80000000|63, // NT-test-match state for doubleSlash
  }
,
{ // state 1951
121,1517, // "t"
  }
,
{ // state 1952
0x80000000|314, // match move
0x80000000|1237, // no-match move
0x80000000|1622, // NT-test-match state for slashStar
  }
,
{ // state 1953
91,42, // "a"
  }
,
{ // state 1954
0x80000000|1355, // match move
0x80000000|1770, // no-match move
0x80000000|1581, // NT-test-match state for reserved
  }
,
{ // state 1955
0x80000000|1695, // match move
0x80000000|243, // no-match move
0x80000000|63, // NT-test-match state for doubleSlash
  }
,
{ // state 1956
125,792, // white
126,857, // {12}
127,857, // " "
128,857, // {9}
129,1169, // eol
130,977, // comment
131,1299, // {10}
132,884, // {13}
143,1422, // "/"
160,1218, // oneLineComment
161,821, // blockComment
162,1907, // doubleSlash
164,782, // slashStar
178,MIN_REDUCTION+283, // $NT
  }
,
{ // state 1957
95,611, // "e"
  }
,
{ // state 1958
0x80000000|1, // match move
0x80000000|542, // no-match move
0x80000000|64, // NT-test-match state for idChar
  }
,
{ // state 1959
0x80000000|1281, // match move
0x80000000|1034, // no-match move
0x80000000|1622, // NT-test-match state for slashStar
  }
,
{ // state 1960
2,379, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1422, // "/"
160,715, // oneLineComment
161,48, // blockComment
162,732, // doubleSlash
164,1194, // slashStar
MIN_REDUCTION+100, // (default reduction)
  }
,
{ // state 1961
0x80000000|1, // match move
0x80000000|930, // no-match move
0x80000000|64, // NT-test-match state for idChar
  }
,
{ // state 1962
MIN_REDUCTION+238, // (default reduction)
  }
,
{ // state 1963
0x80000000|1337, // match move
0x80000000|683, // no-match move
0x80000000|1581, // NT-test-match state for reserved
  }
,
{ // state 1964
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1309, // "/"
161,48, // blockComment
164,1194, // slashStar
MIN_REDUCTION+175, // (default reduction)
  }
,
{ // state 1965
95,1837, // "e"
  }
,
{ // state 1966
0x80000000|1875, // match move
0x80000000|49, // no-match move
0x80000000|1581, // NT-test-match state for reserved
  }
,
{ // state 1967
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1422, // "/"
160,715, // oneLineComment
161,48, // blockComment
162,732, // doubleSlash
164,1194, // slashStar
MIN_REDUCTION+274, // (default reduction)
  }
,
{ // state 1968
2,1535, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
129,482, // eol
130,1769, // comment
131,1062, // {10}
132,1577, // {13}
MIN_REDUCTION+227, // (default reduction)
  }
,
{ // state 1969
0x80000000|1385, // match move
0x80000000|1656, // no-match move
0x80000000|1581, // NT-test-match state for reserved
  }
,
{ // state 1970
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1309, // "/"
161,48, // blockComment
164,1194, // slashStar
MIN_REDUCTION+196, // (default reduction)
  }
,
{ // state 1971
0x80000000|1718, // match move
0x80000000|841, // no-match move
0x80000000|1622, // NT-test-match state for slashStar
  }
,
{ // state 1972
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
129,482, // eol
130,1769, // comment
131,1062, // {10}
132,1577, // {13}
MIN_REDUCTION+244, // (default reduction)
  }
,
{ // state 1973
2,472, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1309, // "/"
161,48, // blockComment
164,1194, // slashStar
MIN_REDUCTION+323, // (default reduction)
  }
,
{ // state 1974
MIN_REDUCTION+157, // (default reduction)
  }
,
{ // state 1975
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 1976
119,268, // "k"
  }
,
{ // state 1977
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1309, // "/"
161,48, // blockComment
164,1194, // slashStar
MIN_REDUCTION+259, // (default reduction)
  }
,
{ // state 1978
0x80000000|1207, // match move
0x80000000|582, // no-match move
0x80000000|63, // NT-test-match state for doubleSlash
  }
,
{ // state 1979
178,MIN_REDUCTION+101, // $NT
  }
,
{ // state 1980
121,1075, // "t"
  }
,
{ // state 1981
0x80000000|1350, // match move
0x80000000|1367, // no-match move
0x80000000|1622, // NT-test-match state for slashStar
  }
,
{ // state 1982
MIN_REDUCTION+316, // (default reduction)
  }
,
{ // state 1983
0x80000000|1768, // match move
0x80000000|1024, // no-match move
0x80000000|1622, // NT-test-match state for slashStar
  }
,
{ // state 1984
MIN_REDUCTION+14, // (default reduction)
  }
,
{ // state 1985
0x80000000|1, // match move
0x80000000|1978, // no-match move
0x80000000|64, // NT-test-match state for idChar
  }
,
{ // state 1986
0x80000000|890, // match move
0x80000000|1152, // no-match move
0x80000000|63, // NT-test-match state for doubleSlash
  }
,
{ // state 1987
2,1921, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
129,482, // eol
130,1769, // comment
131,1062, // {10}
132,1577, // {13}
MIN_REDUCTION+272, // (default reduction)
  }
,
{ // state 1988
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
129,482, // eol
130,1769, // comment
131,1062, // {10}
132,1577, // {13}
MIN_REDUCTION+256, // (default reduction)
  }
,
{ // state 1989
178,MIN_REDUCTION+243, // $NT
  }
,
{ // state 1990
2,215, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1422, // "/"
160,715, // oneLineComment
161,48, // blockComment
162,732, // doubleSlash
164,1194, // slashStar
MIN_REDUCTION+172, // (default reduction)
  }
,
{ // state 1991
0x80000000|1, // match move
0x80000000|1946, // no-match move
0x80000000|64, // NT-test-match state for idChar
  }
,
{ // state 1992
0x80000000|1, // match move
0x80000000|29, // no-match move
0x80000000|64, // NT-test-match state for idChar
  }
,
{ // state 1993
0x80000000|214, // match move
0x80000000|334, // no-match move
0x80000000|1622, // NT-test-match state for slashStar
  }
,
{ // state 1994
112,93, // "o"
  }
,
{ // state 1995
0x80000000|1140, // match move
0x80000000|720, // no-match move
0x80000000|63, // NT-test-match state for doubleSlash
  }
,
{ // state 1996
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1309, // "/"
161,48, // blockComment
164,1194, // slashStar
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 1997
MIN_REDUCTION+33, // (default reduction)
  }
,
{ // state 1998
0x80000000|1, // match move
0x80000000|1031, // no-match move
0x80000000|64, // NT-test-match state for idChar
  }
,
{ // state 1999
0x80000000|1, // match move
0x80000000|1008, // no-match move
0x80000000|64, // NT-test-match state for idChar
  }
,
{ // state 2000
178,MIN_REDUCTION+228, // $NT
  }
,
{ // state 2001
2,1414, // white*
125,2024, // white
126,857, // {12}
127,857, // " "
128,857, // {9}
129,1169, // eol
130,977, // comment
131,1299, // {10}
132,884, // {13}
143,1422, // "/"
160,1218, // oneLineComment
161,821, // blockComment
162,1907, // doubleSlash
164,782, // slashStar
178,MIN_REDUCTION+242, // $NT
  }
,
{ // state 2002
110,1562, // "i"
  }
,
{ // state 2003
0x80000000|172, // match move
0x80000000|1227, // no-match move
0x80000000|1581, // NT-test-match state for reserved
  }
,
{ // state 2004
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1422, // "/"
160,715, // oneLineComment
161,48, // blockComment
162,732, // doubleSlash
164,1194, // slashStar
MIN_REDUCTION+289, // (default reduction)
  }
,
{ // state 2005
2,593, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1422, // "/"
160,715, // oneLineComment
161,48, // blockComment
162,732, // doubleSlash
164,1194, // slashStar
MIN_REDUCTION+215, // (default reduction)
  }
,
{ // state 2006
91,1306, // "a"
  }
,
{ // state 2007
108,449, // "y"
  }
,
{ // state 2008
0x80000000|1, // match move
0x80000000|1038, // no-match move
0x80000000|64, // NT-test-match state for idChar
  }
,
{ // state 2009
0x80000000|2018, // match move
0x80000000|952, // no-match move
0x80000000|1622, // NT-test-match state for slashStar
  }
,
{ // state 2010
2,1903, // white*
125,2024, // white
126,857, // {12}
127,857, // " "
128,857, // {9}
129,1169, // eol
130,977, // comment
131,1299, // {10}
132,884, // {13}
143,1422, // "/"
160,1218, // oneLineComment
161,821, // blockComment
162,1907, // doubleSlash
164,782, // slashStar
178,MIN_REDUCTION+245, // $NT
  }
,
{ // state 2011
MIN_REDUCTION+143, // (default reduction)
  }
,
{ // state 2012
MIN_REDUCTION+354, // (default reduction)
  }
,
{ // state 2013
95,932, // "e"
  }
,
{ // state 2014
MIN_REDUCTION+22, // (default reduction)
  }
,
{ // state 2015
139,843, // "&"
  }
,
{ // state 2016
91,329, // "a"
113,2002, // "r"
  }
,
{ // state 2017
0x80000000|1906, // match move
0x80000000|1175, // no-match move
0x80000000|63, // NT-test-match state for doubleSlash
  }
,
{ // state 2018
125,1627, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1309, // "/"
161,48, // blockComment
164,1194, // slashStar
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 2019
2,1950, // white*
125,702, // white
126,1975, // {12}
127,1975, // " "
128,1975, // {9}
130,1769, // comment
143,1309, // "/"
161,48, // blockComment
164,1194, // slashStar
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 2020
89,1393, // "c"
90,1393, // "l"
91,1393, // "a"
92,1393, // "s"
95,1393, // "e"
96,1393, // "!"
97,1393, // "="
98,1393, // "+"
102,1393, // "_"
103,1393, // "d"
104,1393, // "g"
105,1393, // "m"
106,1393, // "p"
107,1393, // "v"
108,1393, // "y"
109,1393, // "f"
110,1393, // "i"
111,1393, // {"A".."Z"}
112,1393, // "o"
113,1393, // "r"
114,1393, // "u"
115,1393, // "x"
116,1393, // {"j" "q"}
117,1393, // "b"
118,1393, // "h"
119,1393, // "k"
120,1393, // "n"
121,1393, // "t"
122,1393, // "w"
123,1393, // "z"
124,1393, // {"0".."9"}
127,1393, // " "
129,1442, // eol
131,71, // {10}
132,1509, // {13}
133,558, // printable
134,1393, // "["
135,1393, // "-"
136,1393, // "<"
137,1393, // "|"
138,1393, // {"?".."@"}
139,1393, // "&"
140,1393, // ")"
141,1393, // ","
142,1393, // "]"
143,1393, // "/"
144,1393, // {"#".."$"}
145,1393, // ";"
146,1393, // ">"
147,1393, // "{"
148,1393, // "%"
149,1393, // "("
150,1393, // "\"
151,1393, // "."
152,1393, // ":"
153,1393, // "}"
154,1393, // {"^" "`" "~"}
155,1393, // "'"
156,1393, // '"'
157,1393, // "*"
163,758, // printable*
  }
,
{ // state 2021
MIN_REDUCTION+74, // (default reduction)
  }
,
{ // state 2022
MIN_REDUCTION+161, // (default reduction)
  }
,
{ // state 2023
0x80000000|158, // match move
0x80000000|470, // no-match move
0x80000000|1622, // NT-test-match state for slashStar
  }
,
{ // state 2024
178,MIN_REDUCTION+349, // $NT
MIN_REDUCTION+349, // (default reduction)
  }
,
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
// eol ::= {10}
(129<<16)+1,
// eol ::= {13} {10}
(129<<16)+2,
// eol ::= {13} !10
(129<<16)+1,
// printable ::= {" ".."~"}
(133<<16)+1,
// stringPrintable ::= {" ".."!"}
(158<<16)+1,
// stringPrintable ::= {"#".."["}
(158<<16)+1,
// stringPrintable ::= {"]".."~"}
(158<<16)+1,
// charPrintable ::= {" ".."&"}
(159<<16)+1,
// charPrintable ::= {"(".."["}
(159<<16)+1,
// charPrintable ::= {"]".."~"}
(159<<16)+1,
// comment ::= oneLineComment
(130<<16)+1,
// comment ::= blockComment
(130<<16)+1,
// oneLineComment ::= doubleSlash printable* eol
(160<<16)+3,
// oneLineComment ::= doubleSlash eol
(160<<16)+2,
// blockComment ::= slashStar blockCommentContent* starSlash
(161<<16)+3,
// blockComment ::= slashStar starSlash
(161<<16)+2,
// blockCommentContent ::= {9 " "..")" "+".."~"}
(167<<16)+1,
// blockCommentContent ::= "*" !"/"
(167<<16)+1,
// blockCommentContent ::= eol
(167<<16)+1,
// slashStar ::= "/" "*"
(164<<16)+2,
// starSlash ::= "*" "/"
(166<<16)+2,
// doubleSlash ::= "/" "/"
(162<<16)+2,
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
// `= ::= "=" white*
(69<<16)+2,
// `= ::= "="
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
// digit++ ::= digit+ !digit
(99<<16)+1,
// idChar** ::= idChar* !idChar
(169<<16)+1,
// printable* ::= printable* printable
(163<<16)+2,
// printable* ::= printable
(163<<16)+1,
// white* ::= white* white
(2<<16)+2,
// white* ::= white
(2<<16)+1,
// blockCommentContent* ::= blockCommentContent* blockCommentContent
(165<<16)+2,
// blockCommentContent* ::= blockCommentContent
(165<<16)+1,
// stringPrintable* ::= stringPrintable* stringPrintable
(171<<16)+2,
// stringPrintable* ::= stringPrintable
(171<<16)+1,
// letter++ ::= letter+ !letter
(168<<16)+1,
// digit+ ::= digit
(174<<16)+1,
// digit+ ::= digit+ digit
(174<<16)+2,
// letter+ ::= letter
(176<<16)+1,
// letter+ ::= letter+ letter
(176<<16)+2,
// idChar* ::= idChar* idChar
(175<<16)+2,
// idChar* ::= idChar
(175<<16)+1,
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
131, // 10
-1, // 11
126, // 12
132, // 13
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
156, // '"'
144, // "#"
144, // "$"
148, // "%"
139, // "&"
155, // "'"
149, // "("
140, // ")"
157, // "*"
98, // "+"
141, // ","
135, // "-"
151, // "."
143, // "/"
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
152, // ":"
145, // ";"
136, // "<"
97, // "="
146, // ">"
138, // "?"
138, // "@"
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
134, // "["
150, // "\"
142, // "]"
154, // "^"
102, // "_"
154, // "`"
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
147, // "{"
137, // "|"
153, // "}"
154, // "~"
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
"digit++ ::= digit+ !digit", // 344
"idChar** ::= idChar* !idChar", // 345
"printable* ::= printable* printable", // 346
"printable* ::= printable* printable", // 347
"white* ::= white* white", // 348
"white* ::= white* white", // 349
"blockCommentContent* ::= blockCommentContent* blockCommentContent", // 350
"blockCommentContent* ::= blockCommentContent* blockCommentContent", // 351
"stringPrintable* ::= stringPrintable* stringPrintable", // 352
"stringPrintable* ::= stringPrintable* stringPrintable", // 353
"letter++ ::= letter+ !letter", // 354
"digit+ ::= digit", // 355
"digit+ ::= digit+ digit", // 356
"letter+ ::= letter", // 357
"letter+ ::= letter+ letter", // 358
"idChar* ::= idChar* idChar", // 359
"idChar* ::= idChar* idChar", // 360
"", // 361
"", // 362
"", // 363
"", // 364
};
public int[][] getActionTable() { return actionTable; }
private int[][] actionTable = {
    { // 0: $$start ::= start @pass
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 1: $$start ::= [start] @pass
      ((2<<5)|0x6)/*nullProductionAction:2*/,
    },
    { // 2: start ::= white* $$0 @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 3: start ::= white* [token*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 4: start ::= [white*] $$0 @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
    },
    { // 5: token ::= [#] `boolean @sawBoolean(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((0<<5)|0x5)/*methodCall:0*/,
    },
    { // 6: token ::= [#] `class @sawClass(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0x5)/*methodCall:1*/,
    },
    { // 7: token ::= [#] `extends @sawExtends(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((2<<5)|0x5)/*methodCall:2*/,
    },
    { // 8: token ::= [#] `void @sawVoid(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((3<<5)|0x5)/*methodCall:3*/,
    },
    { // 9: token ::= [#] `int @sawInt(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((4<<5)|0x5)/*methodCall:4*/,
    },
    { // 10: token ::= [#] `while @sawWhile(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((5<<5)|0x5)/*methodCall:5*/,
    },
    { // 11: token ::= [#] `if @sawIf(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((6<<5)|0x5)/*methodCall:6*/,
    },
    { // 12: token ::= [#] `else @sawElse(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((7<<5)|0x5)/*methodCall:7*/,
    },
    { // 13: token ::= [#] `for @sawFor(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((8<<5)|0x5)/*methodCall:8*/,
    },
    { // 14: token ::= [#] `break @sawBreak(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((9<<5)|0x5)/*methodCall:9*/,
    },
    { // 15: token ::= [#] `this @sawThis(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((10<<5)|0x5)/*methodCall:10*/,
    },
    { // 16: token ::= [#] `false @sawFalse(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((11<<5)|0x5)/*methodCall:11*/,
    },
    { // 17: token ::= [#] `true @sawTrue(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((12<<5)|0x5)/*methodCall:12*/,
    },
    { // 18: token ::= [#] `super @sawSuper(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((13<<5)|0x5)/*methodCall:13*/,
    },
    { // 19: token ::= [#] `null @sawNull(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((14<<5)|0x5)/*methodCall:14*/,
    },
    { // 20: token ::= [#] `return @sawReturn(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((15<<5)|0x5)/*methodCall:15*/,
    },
    { // 21: token ::= [#] `instanceof @sawInstanceof(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((16<<5)|0x5)/*methodCall:16*/,
    },
    { // 22: token ::= [#] `new @sawNew(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((17<<5)|0x5)/*methodCall:17*/,
    },
    { // 23: token ::= [#] `abstract @sawAbstract(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((18<<5)|0x5)/*methodCall:18*/,
    },
    { // 24: token ::= [#] `assert @sawAssert(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((19<<5)|0x5)/*methodCall:19*/,
    },
    { // 25: token ::= [#] `byte @sawByte(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((20<<5)|0x5)/*methodCall:20*/,
    },
    { // 26: token ::= [#] `case @sawCase(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((21<<5)|0x5)/*methodCall:21*/,
    },
    { // 27: token ::= [#] `catch @sawCatch(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((22<<5)|0x5)/*methodCall:22*/,
    },
    { // 28: token ::= [#] `char @sawChar(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((23<<5)|0x5)/*methodCall:23*/,
    },
    { // 29: token ::= [#] `const @sawConst(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((24<<5)|0x5)/*methodCall:24*/,
    },
    { // 30: token ::= [#] `continue @sawContinue(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((25<<5)|0x5)/*methodCall:25*/,
    },
    { // 31: token ::= [#] `default @sawDefault(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((26<<5)|0x5)/*methodCall:26*/,
    },
    { // 32: token ::= [#] `do @sawDo(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((27<<5)|0x5)/*methodCall:27*/,
    },
    { // 33: token ::= [#] `double @sawDouble(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((28<<5)|0x5)/*methodCall:28*/,
    },
    { // 34: token ::= [#] `enum @sawEnum(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((29<<5)|0x5)/*methodCall:29*/,
    },
    { // 35: token ::= [#] `final @sawFinal(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((30<<5)|0x5)/*methodCall:30*/,
    },
    { // 36: token ::= [#] `finally @sawFinally(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((31<<5)|0x5)/*methodCall:31*/,
    },
    { // 37: token ::= [#] `float @sawFloat(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((32<<5)|0x5)/*methodCall:32*/,
    },
    { // 38: token ::= [#] `goto @sawGoto(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((33<<5)|0x5)/*methodCall:33*/,
    },
    { // 39: token ::= [#] `implements @sawImplements(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((34<<5)|0x5)/*methodCall:34*/,
    },
    { // 40: token ::= [#] `import @sawImport(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((35<<5)|0x5)/*methodCall:35*/,
    },
    { // 41: token ::= [#] `interface @sawInterface(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((36<<5)|0x5)/*methodCall:36*/,
    },
    { // 42: token ::= [#] `long @sawLong(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((37<<5)|0x5)/*methodCall:37*/,
    },
    { // 43: token ::= [#] `native @sawNative(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((38<<5)|0x5)/*methodCall:38*/,
    },
    { // 44: token ::= [#] `package @sawPackage(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((39<<5)|0x5)/*methodCall:39*/,
    },
    { // 45: token ::= [#] `private @sawPrivate(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((40<<5)|0x5)/*methodCall:40*/,
    },
    { // 46: token ::= [#] `protected @sawProtected(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((41<<5)|0x5)/*methodCall:41*/,
    },
    { // 47: token ::= [#] `public @sawPublic(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((42<<5)|0x5)/*methodCall:42*/,
    },
    { // 48: token ::= [#] `short @sawShort(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((43<<5)|0x5)/*methodCall:43*/,
    },
    { // 49: token ::= [#] `static @sawStatic(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((44<<5)|0x5)/*methodCall:44*/,
    },
    { // 50: token ::= [#] `strictfp @sawStrictfp(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((45<<5)|0x5)/*methodCall:45*/,
    },
    { // 51: token ::= [#] `switch @sawSwitch(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((46<<5)|0x5)/*methodCall:46*/,
    },
    { // 52: token ::= [#] `synchronized @sawSynchronized(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((47<<5)|0x5)/*methodCall:47*/,
    },
    { // 53: token ::= [#] `throw @sawThrow(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((48<<5)|0x5)/*methodCall:48*/,
    },
    { // 54: token ::= [#] `throws @sawThrows(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((49<<5)|0x5)/*methodCall:49*/,
    },
    { // 55: token ::= [#] `transient @sawTransient(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((50<<5)|0x5)/*methodCall:50*/,
    },
    { // 56: token ::= [#] `try @sawTry(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((51<<5)|0x5)/*methodCall:51*/,
    },
    { // 57: token ::= [#] `volatile @sawVolatile(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((52<<5)|0x5)/*methodCall:52*/,
    },
    { // 58: token ::= [#] `! @sawNot(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((53<<5)|0x5)/*methodCall:53*/,
    },
    { // 59: token ::= [#] `!= @sawNotEqual(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((54<<5)|0x5)/*methodCall:54*/,
    },
    { // 60: token ::= [#] `% @sawRemainder(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((55<<5)|0x5)/*methodCall:55*/,
    },
    { // 61: token ::= [#] `&& @sawAnd(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((56<<5)|0x5)/*methodCall:56*/,
    },
    { // 62: token ::= [#] `* @sawTimes(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((57<<5)|0x5)/*methodCall:57*/,
    },
    { // 63: token ::= [#] `( @sawLpar(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((58<<5)|0x5)/*methodCall:58*/,
    },
    { // 64: token ::= [#] `) @sawRpar(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((59<<5)|0x5)/*methodCall:59*/,
    },
    { // 65: token ::= [#] `{ @sawLbrace(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((60<<5)|0x5)/*methodCall:60*/,
    },
    { // 66: token ::= [#] `} @sawRbrace(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((61<<5)|0x5)/*methodCall:61*/,
    },
    { // 67: token ::= [#] `- @sawMinus(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((62<<5)|0x5)/*methodCall:62*/,
    },
    { // 68: token ::= [#] `+ @sawPlus(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((63<<5)|0x5)/*methodCall:63*/,
    },
    { // 69: token ::= [#] `= @sawAssign(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((64<<5)|0x5)/*methodCall:64*/,
    },
    { // 70: token ::= [#] `== @sawEqual(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((65<<5)|0x5)/*methodCall:65*/,
    },
    { // 71: token ::= [#] `[ @sawLbrack(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((66<<5)|0x5)/*methodCall:66*/,
    },
    { // 72: token ::= [#] `] @sawRbrack(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((67<<5)|0x5)/*methodCall:67*/,
    },
    { // 73: token ::= [#] `|| @sawOr(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((68<<5)|0x5)/*methodCall:68*/,
    },
    { // 74: token ::= [#] `< @sawLess(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((69<<5)|0x5)/*methodCall:69*/,
    },
    { // 75: token ::= [#] `<= @sawLessEq(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((70<<5)|0x5)/*methodCall:70*/,
    },
    { // 76: token ::= [#] `, @sawComma(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((71<<5)|0x5)/*methodCall:71*/,
    },
    { // 77: token ::= [#] `> @sawGreater(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((72<<5)|0x5)/*methodCall:72*/,
    },
    { // 78: token ::= [#] `>= @sawGreaterEq(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((73<<5)|0x5)/*methodCall:73*/,
    },
    { // 79: token ::= [#] `. @sawDot(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((74<<5)|0x5)/*methodCall:74*/,
    },
    { // 80: token ::= [#] `; @sawSemi(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((75<<5)|0x5)/*methodCall:75*/,
    },
    { // 81: token ::= [#] `++ @sawPlusPlus(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((76<<5)|0x5)/*methodCall:76*/,
    },
    { // 82: token ::= [#] `-- @sawMinusMinus(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((77<<5)|0x5)/*methodCall:77*/,
    },
    { // 83: token ::= [#] `/ @sawSlash(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((78<<5)|0x5)/*methodCall:78*/,
    },
    { // 84: token ::= [#] `: @sawColon(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((79<<5)|0x5)/*methodCall:79*/,
    },
    { // 85: token ::= [#] ID @identifier(int,String)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((80<<5)|0x5)/*methodCall:80*/,
    },
    { // 86: token ::= [#] INT_LITERAL @intLit(int,int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((81<<5)|0x5)/*methodCall:81*/,
    },
    { // 87: token ::= [#] STRING_LITERAL @stringLit(int,String)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((82<<5)|0x5)/*methodCall:82*/,
    },
    { // 88: token ::= [#] CHAR_LITERAL @charLit(int,int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
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
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((7<<5)|0x6)/*nullProductionAction:7*/,
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
      ((7<<5)|0x6)/*nullProductionAction:7*/,
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
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 99: INT_LITERAL ::= [#] digit++ white* @convertToInt(int,List<Character>)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((84<<5)|0x5)/*methodCall:84*/,
    },
    { // 100: INT_LITERAL ::= [#] digit++ [white*] @convertToInt(int,List<Character>)=>int
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
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
    { // 109: eol ::= {10} [registerNewline] @void
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 110: eol ::= {13} {10} [registerNewline] @void
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 111: eol ::= {13} !10 [registerNewline] @void
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 112: printable ::= {" ".."~"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 113: stringPrintable ::= {" ".."!"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 114: stringPrintable ::= {"#".."["} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 115: stringPrintable ::= {"]".."~"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 116: charPrintable ::= {" ".."&"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 117: charPrintable ::= {"(".."["} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 118: charPrintable ::= {"]".."~"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 119: comment ::= oneLineComment @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 120: comment ::= blockComment @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 121: oneLineComment ::= doubleSlash printable* eol @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((2<<5)|0x0)/*popToPushBack:2*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 122: oneLineComment ::= doubleSlash [printable*] eol @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((0<<5)|0x6)/*nullProductionAction:0*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((2<<5)|0x0)/*popToPushBack:2*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 123: blockComment ::= slashStar blockCommentContent* starSlash @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((2<<5)|0x0)/*popToPushBack:2*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((2<<5)|0x0)/*popToPushBack:2*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 124: blockComment ::= slashStar [blockCommentContent*] starSlash @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((2<<5)|0x0)/*popToPushBack:2*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((2<<5)|0x0)/*popToPushBack:2*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 125: blockCommentContent ::= {9 " "..")" "+".."~"} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 126: blockCommentContent ::= "*" !"/" @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 127: blockCommentContent ::= eol @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 128: slashStar ::= "/" "*" @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 129: starSlash ::= "*" "/" @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 130: doubleSlash ::= "/" "/" @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
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
      ((7<<5)|0x6)/*nullProductionAction:7*/,
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
      ((7<<5)|0x6)/*nullProductionAction:7*/,
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
      ((7<<5)|0x6)/*nullProductionAction:7*/,
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
      ((7<<5)|0x6)/*nullProductionAction:7*/,
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
      ((7<<5)|0x6)/*nullProductionAction:7*/,
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
      ((7<<5)|0x6)/*nullProductionAction:7*/,
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
      ((7<<5)|0x6)/*nullProductionAction:7*/,
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
      ((7<<5)|0x6)/*nullProductionAction:7*/,
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
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 149: `= ::= "=" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 150: `= ::= "=" [white*] @void
      ((7<<5)|0x6)/*nullProductionAction:7*/,
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
      ((7<<5)|0x6)/*nullProductionAction:7*/,
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
      ((7<<5)|0x6)/*nullProductionAction:7*/,
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
      ((7<<5)|0x6)/*nullProductionAction:7*/,
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
      ((7<<5)|0x6)/*nullProductionAction:7*/,
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
      ((7<<5)|0x6)/*nullProductionAction:7*/,
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
      ((7<<5)|0x6)/*nullProductionAction:7*/,
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
      ((7<<5)|0x6)/*nullProductionAction:7*/,
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
      ((7<<5)|0x6)/*nullProductionAction:7*/,
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
      ((7<<5)|0x6)/*nullProductionAction:7*/,
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
      ((7<<5)|0x6)/*nullProductionAction:7*/,
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
      ((7<<5)|0x6)/*nullProductionAction:7*/,
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
      ((7<<5)|0x6)/*nullProductionAction:7*/,
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
      ((7<<5)|0x6)/*nullProductionAction:7*/,
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
      ((7<<5)|0x6)/*nullProductionAction:7*/,
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
      ((7<<5)|0x6)/*nullProductionAction:7*/,
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
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((7<<5)|0x6)/*nullProductionAction:7*/,
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
      ((7<<5)|0x6)/*nullProductionAction:7*/,
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
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((7<<5)|0x6)/*nullProductionAction:7*/,
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
      ((7<<5)|0x6)/*nullProductionAction:7*/,
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
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((7<<5)|0x6)/*nullProductionAction:7*/,
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
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((7<<5)|0x6)/*nullProductionAction:7*/,
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
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((7<<5)|0x6)/*nullProductionAction:7*/,
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
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((7<<5)|0x6)/*nullProductionAction:7*/,
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
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((7<<5)|0x6)/*nullProductionAction:7*/,
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
      ((7<<5)|0x6)/*nullProductionAction:7*/,
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
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((7<<5)|0x6)/*nullProductionAction:7*/,
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
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((7<<5)|0x6)/*nullProductionAction:7*/,
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
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((7<<5)|0x6)/*nullProductionAction:7*/,
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
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((7<<5)|0x6)/*nullProductionAction:7*/,
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
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((7<<5)|0x6)/*nullProductionAction:7*/,
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
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((7<<5)|0x6)/*nullProductionAction:7*/,
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
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x4)/*stringConcat:2*/,
    },
    { // 336: ID ::= !reserved letter++ !idChar [idChar**] $$1 @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x4)/*stringConcat:2*/,
    },
    { // 337: ID ::= !reserved letter++ !idChar [idChar**] [white*] @text
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((3<<5)|0x6)/*nullProductionAction:3*/,
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
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x4)/*stringConcat:3*/,
    },
    { // 340: CHAR_LITERAL ::= "'" charPrintable "'" white* @return0(char,char,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((85<<5)|0x5)/*methodCall:85*/,
    },
    { // 341: CHAR_LITERAL ::= "'" charPrintable "'" [white*] @return0(char,char,char)=>int
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((85<<5)|0x5)/*methodCall:85*/,
    },
    { // 342: token* ::= token* token @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 343: token* ::= [token*] token @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
    },
    { // 344: digit++ ::= digit+ !digit @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 345: idChar** ::= idChar* !idChar @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 346: printable* ::= printable* printable @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 347: printable* ::= [printable*] printable @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((0<<5)|0x6)/*nullProductionAction:0*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 348: white* ::= white* white @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 349: white* ::= [white*] white @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
    },
    { // 350: blockCommentContent* ::= blockCommentContent* blockCommentContent @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 351: blockCommentContent* ::= [blockCommentContent*] blockCommentContent @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
    },
    { // 352: stringPrintable* ::= stringPrintable* stringPrintable @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 353: stringPrintable* ::= [stringPrintable*] stringPrintable @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 354: letter++ ::= letter+ !letter @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 355: digit+ ::= digit @singleList
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xa)/*singleList:1*/,
    },
    { // 356: digit+ ::= digit+ digit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 357: letter+ ::= letter @singleList
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xa)/*singleList:1*/,
    },
    { // 358: letter+ ::= letter+ letter @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 359: idChar* ::= idChar* idChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 360: idChar* ::= [idChar*] idChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 361: $$0 ::= token* @pass
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 362: $$1 ::= white* @pass
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 363: $$2 ::= '"' white* @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 364: $$2 ::= '"' [white*] @pass
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
};
public String[] getNullProdNameTable() { return nullProdNameTable; }
private String[] nullProdNameTable = {
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
    { // printable*
      ((1<<5)|0x9)/*emptyList:1*/,
    },
    { // stringPrintable*
      ((1<<5)|0x9)/*emptyList:1*/,
    },
    { // start
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
    },
    { // idChar**
      ((5<<5)|0x6)/*nullProductionAction:5*/,
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
      ((2<<5)|0x6)/*nullProductionAction:2*/,
    },
    { // #
      7/*duplicateTop*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // registerNewline
      ((9<<5)|0x6)/*nullProductionAction:9*/,
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
      char parm0 = (Character)si.popPb();
      char parm1 = (Character)si.popPb();
      char parm2 = (Character)si.popPb();
      int result = actionObject.return0(parm0,parm1,parm2);
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
"int return0(char,char,char)",
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
3,1,
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
    -1,
    -1,
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
    -1,
    1,
    1,
    0,
    0,
    2,
    1,
    2,
    0,
    2,
    0,
    1,
    1,
    0,
    1,
    1,
    0,
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
