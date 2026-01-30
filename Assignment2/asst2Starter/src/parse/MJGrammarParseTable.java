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
import
syntaxtree
.
*
;
import
wrangLR
.
runtime
.
MessageObject
;
import
wrangLR
.
runtime
.
FilePosObject
;
public class MJGrammarParseTable implements wrangLR.runtime.ParseTable {
public int getEofSym() { return 90; }
public int getNttSym() { return 91; }
private String[] symNameTable = {
"$$start",
"<start>",
"ws*",
"<program>",
"<class decl>+",
"<class decl>",
"`class",
"ID",
"`{",
"<decl in class>*",
"`}",
"<decl in class>",
"<method decl>",
"`public",
"`void",
"`(",
"`)",
"<stmt>*",
"<type>",
"`int",
"`boolean",
"<empty bracket pair>",
"`[",
"`]",
"<stmt>",
"<assign>",
"`;",
"<local var decl>",
"<expr>",
"`=",
"<expr8>",
"<expr7>",
"<expr6>",
"<expr5>",
"<expr4>",
"`+",
"<expr3>",
"`*",
"<expr2>",
"<cast expr>",
"<unary expr>",
"<expr1>",
"`-",
"INTLIT",
"letter",
"\"p\"",
"\"v\"",
"\"b\"",
"{\"A\"..\"Z\" \"a\" \"d\"..\"h\" \"j\"..\"k\" \"m\"..\"n\" \"q\"..\"s\" \"w\"..\"z\"}",
"\"t\"",
"\"c\"",
"\"i\"",
"\"l\"",
"\"o\"",
"\"u\"",
"letter128",
"{199..218 231..250}",
"{193..198 225..230}",
"digit",
"{\"1\"..\"9\"}",
"\"0\"",
"digit128",
"{176..185}",
"ws",
"\" \"",
"10",
"\"#\"",
"\"*\"",
"\"(\"",
"\")\"",
"\"{\"",
"\"}\"",
"\"-\"",
"\"+\"",
"\"=\"",
"\"[\"",
"\"]\"",
"\";\"",
"idChar*",
"$$0",
"digit*",
"$$1",
"hexDigit*",
"$$2",
"idChar",
"\"_\"",
"idChar128",
"223",
"hexDigit",
"hexDigit128",
"$",
"$NT",
};
public String symName(int n) {
 return n >= 0 && n < symNameTable.length ? symNameTable[n] : "??";
}
private MJGrammar actionObject;
public int[][] getParseTable() { return parseTable; }
public int numSymbols() { return 92;}
private static final int MIN_REDUCTION = 630;
public int minReduction() { return MIN_REDUCTION;}
private static final int MAX_ACCEPT_REDUCTION = MIN_REDUCTION+0;
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
1,557, // <start>
2,196, // ws*
3,345, // <program>
4,145, // <class decl>+
5,397, // <class decl>
6,216, // `class
63,9, // ws
64,144, // " "
65,387, // {10}
66,211, // "#"
  }
,
{ // state 1
  }
,
{ // state 2
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 3
22,MIN_REDUCTION+110, // `[
63,58, // ws
64,178, // " "
65,535, // {10}
75,MIN_REDUCTION+110, // "["
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 4
0x80000000|209, // match move
0x80000000|385, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 5
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 6
0x80000000|97, // match move
0x80000000|51, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 7
22,MIN_REDUCTION+107, // `[
75,MIN_REDUCTION+107, // "["
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 8
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 9
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 10
0x80000000|1, // match move
0x80000000|269, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 11
0x80000000|23, // match move
0x80000000|94, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 12
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 13
0x80000000|1, // match move
0x80000000|275, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 14
37,101, // `*
67,307, // "*"
MIN_REDUCTION+26, // (default reduction)
  }
,
{ // state 15
2,414, // ws*
22,MIN_REDUCTION+113, // `[
63,142, // ws
64,160, // " "
65,515, // {10}
75,MIN_REDUCTION+113, // "["
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 16
2,313, // ws*
63,471, // ws
64,52, // " "
65,352, // {10}
MIN_REDUCTION+73, // (default reduction)
  }
,
{ // state 17
22,MIN_REDUCTION+72, // `[
63,58, // ws
64,178, // " "
65,535, // {10}
75,MIN_REDUCTION+72, // "["
MIN_REDUCTION+72, // (default reduction)
  }
,
{ // state 18
53,606, // "o"
  }
,
{ // state 19
0x80000000|332, // match move
0x80000000|162, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 20
44,623, // letter
45,81, // "p"
46,81, // "v"
47,81, // "b"
48,81, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
49,81, // "t"
50,81, // "c"
51,81, // "i"
52,81, // "l"
53,81, // "o"
54,81, // "u"
55,374, // letter128
56,324, // {199..218 231..250}
57,324, // {193..198 225..230}
58,267, // digit
59,235, // {"1".."9"}
60,235, // "0"
61,510, // digit128
62,248, // {176..185}
78,237, // idChar*
79,39, // $$0
84,561, // idChar
85,518, // "_"
86,288, // idChar128
87,180, // {223}
  }
,
{ // state 21
MIN_REDUCTION+8, // (default reduction)
  }
,
{ // state 22
22,MIN_REDUCTION+89, // `[
75,MIN_REDUCTION+89, // "["
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 23
2,442, // ws*
  }
,
{ // state 24
2,257, // ws*
22,MIN_REDUCTION+77, // `[
63,142, // ws
64,160, // " "
65,515, // {10}
75,MIN_REDUCTION+77, // "["
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 25
0x80000000|1, // match move
0x80000000|290, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 26
22,MIN_REDUCTION+89, // `[
75,MIN_REDUCTION+89, // "["
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 27
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 28
0x80000000|1, // match move
0x80000000|294, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 29
2,262, // ws*
22,MIN_REDUCTION+77, // `[
63,139, // ws
64,156, // " "
65,514, // {10}
75,MIN_REDUCTION+77, // "["
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 30
0x80000000|505, // match move
0x80000000|256, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 31
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 32
2,607, // ws*
63,194, // ws
64,556, // " "
65,155, // {10}
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 33
22,MIN_REDUCTION+37, // `[
75,MIN_REDUCTION+37, // "["
MIN_REDUCTION+37, // (default reduction)
  }
,
{ // state 34
63,506, // ws
64,255, // " "
65,151, // {10}
MIN_REDUCTION+60, // (default reduction)
  }
,
{ // state 35
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 36
2,412, // ws*
22,MIN_REDUCTION+113, // `[
63,139, // ws
64,156, // " "
65,514, // {10}
75,MIN_REDUCTION+113, // "["
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 37
91,MIN_REDUCTION+13, // $NT
  }
,
{ // state 38
22,602, // `[
75,192, // "["
MIN_REDUCTION+34, // (default reduction)
  }
,
{ // state 39
MIN_REDUCTION+79, // (default reduction)
  }
,
{ // state 40
MIN_REDUCTION+78, // (default reduction)
  }
,
{ // state 41
0x80000000|332, // match move
0x80000000|479, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 42
22,MIN_REDUCTION+37, // `[
75,MIN_REDUCTION+37, // "["
MIN_REDUCTION+37, // (default reduction)
  }
,
{ // state 43
MIN_REDUCTION+30, // (default reduction)
  }
,
{ // state 44
44,623, // letter
45,81, // "p"
46,81, // "v"
47,81, // "b"
48,81, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
49,81, // "t"
50,81, // "c"
51,81, // "i"
52,81, // "l"
53,81, // "o"
54,81, // "u"
55,484, // letter128
56,193, // {199..218 231..250}
57,193, // {193..198 225..230}
58,267, // digit
59,235, // {"1".."9"}
60,235, // "0"
61,525, // digit128
62,174, // {176..185}
79,30, // $$0
84,565, // idChar
85,518, // "_"
86,4, // idChar128
87,523, // {223}
  }
,
{ // state 45
0x80000000|332, // match move
0x80000000|181, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 46
22,415, // `[
75,188, // "["
  }
,
{ // state 47
45,371, // "p"
46,371, // "v"
47,371, // "b"
48,371, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
49,371, // "t"
50,371, // "c"
51,371, // "i"
52,371, // "l"
53,371, // "o"
54,371, // "u"
57,79, // {193..198 225..230}
59,371, // {"1".."9"}
60,371, // "0"
62,79, // {176..185}
83,440, // $$2
88,85, // hexDigit
89,11, // hexDigit128
  }
,
{ // state 48
49,563, // "t"
  }
,
{ // state 49
0x80000000|1, // match move
0x80000000|409, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 50
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 51
22,MIN_REDUCTION+42, // `[
75,MIN_REDUCTION+42, // "["
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 52
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 53
22,MIN_REDUCTION+90, // `[
75,MIN_REDUCTION+90, // "["
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 54
22,MIN_REDUCTION+89, // `[
75,MIN_REDUCTION+89, // "["
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 55
2,412, // ws*
  }
,
{ // state 56
2,482, // ws*
63,8, // ws
64,143, // " "
65,599, // {10}
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 57
MIN_REDUCTION+13, // (default reduction)
  }
,
{ // state 58
0x80000000|1, // match move
0x80000000|271, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 59
23,57, // `]
76,16, // "]"
  }
,
{ // state 60
MIN_REDUCTION+41, // (default reduction)
  }
,
{ // state 61
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 62
0x80000000|1, // match move
0x80000000|608, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 63
54,600, // "u"
  }
,
{ // state 64
22,MIN_REDUCTION+37, // `[
75,MIN_REDUCTION+37, // "["
MIN_REDUCTION+37, // (default reduction)
  }
,
{ // state 65
44,623, // letter
45,81, // "p"
46,81, // "v"
47,81, // "b"
48,81, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
49,81, // "t"
50,81, // "c"
51,81, // "i"
52,81, // "l"
53,81, // "o"
54,81, // "u"
55,484, // letter128
56,193, // {199..218 231..250}
57,193, // {193..198 225..230}
58,267, // digit
59,235, // {"1".."9"}
60,235, // "0"
61,525, // digit128
62,174, // {176..185}
78,44, // idChar*
79,231, // $$0
84,561, // idChar
85,518, // "_"
86,4, // idChar128
87,523, // {223}
  }
,
{ // state 66
22,605, // `[
75,192, // "["
MIN_REDUCTION+34, // (default reduction)
  }
,
{ // state 67
0x80000000|1, // match move
0x80000000|612, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 68
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 69
0x80000000|1, // match move
0x80000000|318, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 70
0x80000000|369, // match move
0x80000000|516, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 71
63,533, // ws
64,311, // " "
65,2, // {10}
MIN_REDUCTION+74, // (default reduction)
  }
,
{ // state 72
2,414, // ws*
  }
,
{ // state 73
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 74
2,609, // ws*
63,471, // ws
64,52, // " "
65,352, // {10}
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 75
37,131, // `*
67,307, // "*"
MIN_REDUCTION+26, // (default reduction)
  }
,
{ // state 76
0x80000000|1, // match move
0x80000000|411, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 77
MIN_REDUCTION+18, // (default reduction)
  }
,
{ // state 78
MIN_REDUCTION+30, // (default reduction)
  }
,
{ // state 79
0x80000000|165, // match move
0x80000000|399, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 80
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 81
MIN_REDUCTION+38, // (default reduction)
  }
,
{ // state 82
MIN_REDUCTION+30, // (default reduction)
  }
,
{ // state 83
0x80000000|1, // match move
0x80000000|423, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 84
MIN_REDUCTION+78, // (default reduction)
  }
,
{ // state 85
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 86
0x80000000|1, // match move
0x80000000|258, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 87
0x80000000|1, // match move
0x80000000|261, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 88
53,135, // "o"
  }
,
{ // state 89
2,603, // ws*
63,471, // ws
64,52, // " "
65,352, // {10}
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 90
63,176, // ws
64,299, // " "
65,35, // {10}
MIN_REDUCTION+52, // (default reduction)
  }
,
{ // state 91
2,467, // ws*
63,353, // ws
64,405, // " "
65,295, // {10}
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 92
22,MIN_REDUCTION+106, // `[
75,MIN_REDUCTION+106, // "["
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 93
47,626, // "b"
51,621, // "i"
  }
,
{ // state 94
2,442, // ws*
22,MIN_REDUCTION+113, // `[
63,531, // ws
64,178, // " "
65,535, // {10}
75,MIN_REDUCTION+113, // "["
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 95
0x80000000|443, // match move
0x80000000|582, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 96
37,129, // `*
67,307, // "*"
MIN_REDUCTION+26, // (default reduction)
  }
,
{ // state 97
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 98
63,351, // ws
64,469, // " "
65,309, // {10}
MIN_REDUCTION+44, // (default reduction)
  }
,
{ // state 99
0x80000000|473, // match move
0x80000000|320, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 100
2,219, // ws*
63,564, // ws
64,445, // " "
65,50, // {10}
MIN_REDUCTION+57, // (default reduction)
  }
,
{ // state 101
7,392, // ID
15,488, // `(
38,567, // <expr2>
39,220, // <cast expr>
40,43, // <unary expr>
41,507, // <expr1>
42,215, // `-
43,321, // INTLIT
44,337, // letter
45,122, // "p"
46,122, // "v"
47,122, // "b"
48,122, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
49,122, // "t"
50,122, // "c"
51,122, // "i"
52,122, // "l"
53,122, // "o"
54,122, // "u"
55,417, // letter128
56,19, // {199..218 231..250}
57,19, // {193..198 225..230}
59,464, // {"1".."9"}
60,480, // "0"
61,575, // digit128
62,587, // {176..185}
68,100, // "("
72,217, // "-"
  }
,
{ // state 102
MIN_REDUCTION+22, // (default reduction)
  }
,
{ // state 103
0x80000000|1, // match move
0x80000000|527, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 104
MIN_REDUCTION+21, // (default reduction)
  }
,
{ // state 105
0x80000000|475, // match move
0x80000000|316, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 106
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 107
MIN_REDUCTION+23, // (default reduction)
  }
,
{ // state 108
0x80000000|1, // match move
0x80000000|545, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 109
37,129, // `*
67,307, // "*"
MIN_REDUCTION+25, // (default reduction)
  }
,
{ // state 110
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 111
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 112
0x80000000|394, // match move
0x80000000|481, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 113
0x80000000|325, // match move
0x80000000|252, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 114
0x80000000|443, // match move
0x80000000|511, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 115
22,508, // `[
75,192, // "["
MIN_REDUCTION+34, // (default reduction)
  }
,
{ // state 116
0x80000000|325, // match move
0x80000000|254, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 117
0x80000000|443, // match move
0x80000000|517, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 118
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 119
63,136, // ws
64,454, // " "
65,589, // {10}
MIN_REDUCTION+62, // (default reduction)
  }
,
{ // state 120
0x80000000|393, // match move
0x80000000|483, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 121
22,MIN_REDUCTION+43, // `[
75,MIN_REDUCTION+43, // "["
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 122
MIN_REDUCTION+38, // (default reduction)
  }
,
{ // state 123
0x80000000|1, // match move
0x80000000|368, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 124
22,MIN_REDUCTION+43, // `[
75,MIN_REDUCTION+43, // "["
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 125
MIN_REDUCTION+12, // (default reduction)
  }
,
{ // state 126
63,292, // ws
64,546, // " "
65,541, // {10}
MIN_REDUCTION+62, // (default reduction)
  }
,
{ // state 127
45,371, // "p"
46,371, // "v"
47,371, // "b"
48,371, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
49,371, // "t"
50,371, // "c"
51,371, // "i"
52,371, // "l"
53,371, // "o"
54,371, // "u"
57,243, // {193..198 225..230}
59,371, // {"1".."9"}
60,371, // "0"
62,243, // {176..185}
83,461, // $$2
88,85, // hexDigit
89,296, // hexDigit128
  }
,
{ // state 128
45,371, // "p"
46,371, // "v"
47,371, // "b"
48,371, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
49,371, // "t"
50,371, // "c"
51,371, // "i"
52,371, // "l"
53,371, // "o"
54,371, // "u"
57,241, // {193..198 225..230}
59,371, // {"1".."9"}
60,371, // "0"
62,241, // {176..185}
83,462, // $$2
88,85, // hexDigit
89,301, // hexDigit128
  }
,
{ // state 129
7,594, // ID
15,138, // `(
38,616, // <expr2>
39,236, // <cast expr>
40,78, // <unary expr>
41,544, // <expr1>
42,272, // `-
43,286, // INTLIT
44,441, // letter
45,122, // "p"
46,122, // "v"
47,122, // "b"
48,122, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
49,122, // "t"
50,122, // "c"
51,122, // "i"
52,122, // "l"
53,122, // "o"
54,122, // "u"
55,446, // letter128
56,41, // {199..218 231..250}
57,41, // {193..198 225..230}
59,425, // {"1".."9"}
60,520, // "0"
61,384, // digit128
62,574, // {176..185}
68,100, // "("
72,217, // "-"
  }
,
{ // state 130
0x80000000|1, // match move
0x80000000|549, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 131
7,560, // ID
15,519, // `(
38,615, // <expr2>
39,233, // <cast expr>
40,82, // <unary expr>
41,548, // <expr1>
42,273, // `-
43,293, // INTLIT
44,444, // letter
45,122, // "p"
46,122, // "v"
47,122, // "b"
48,122, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
49,122, // "t"
50,122, // "c"
51,122, // "i"
52,122, // "l"
53,122, // "o"
54,122, // "u"
55,449, // letter128
56,45, // {199..218 231..250}
57,45, // {193..198 225..230}
59,428, // {"1".."9"}
60,513, // "0"
61,386, // digit128
62,573, // {176..185}
68,100, // "("
72,217, // "-"
  }
,
{ // state 132
0x80000000|1, // match move
0x80000000|551, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 133
37,131, // `*
67,307, // "*"
MIN_REDUCTION+25, // (default reduction)
  }
,
{ // state 134
0x80000000|1, // match move
0x80000000|498, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 135
2,577, // ws*
63,194, // ws
64,556, // " "
65,155, // {10}
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 136
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 137
0x80000000|1, // match move
0x80000000|496, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 138
7,304, // ID
18,225, // <type>
19,226, // `int
20,260, // `boolean
44,20, // letter
45,122, // "p"
46,122, // "v"
47,122, // "b"
48,122, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
49,122, // "t"
50,122, // "c"
51,122, // "i"
52,122, // "l"
53,122, // "o"
54,122, // "u"
55,576, // letter128
56,324, // {199..218 231..250}
57,324, // {193..198 225..230}
66,503, // "#"
  }
,
{ // state 139
0x80000000|1, // match move
0x80000000|547, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 140
44,623, // letter
45,81, // "p"
46,81, // "v"
47,81, // "b"
48,81, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
49,81, // "t"
50,81, // "c"
51,81, // "i"
52,81, // "l"
53,81, // "o"
54,81, // "u"
55,477, // letter128
56,19, // {199..218 231..250}
57,19, // {193..198 225..230}
58,267, // digit
59,235, // {"1".."9"}
60,235, // "0"
61,95, // digit128
62,587, // {176..185}
79,103, // $$0
84,565, // idChar
85,518, // "_"
86,70, // idChar128
87,232, // {223}
  }
,
{ // state 141
22,MIN_REDUCTION+108, // `[
63,58, // ws
64,178, // " "
65,535, // {10}
75,MIN_REDUCTION+108, // "["
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 142
0x80000000|1, // match move
0x80000000|539, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 143
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 144
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 145
5,213, // <class decl>
6,216, // `class
66,211, // "#"
MIN_REDUCTION+3, // (default reduction)
  }
,
{ // state 146
22,MIN_REDUCTION+43, // `[
75,MIN_REDUCTION+43, // "["
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 147
MIN_REDUCTION+100, // (default reduction)
  }
,
{ // state 148
0x80000000|190, // match move
0x80000000|278, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 149
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
382, // ID
593, // `{
-1, // <decl in class>*
21, // `}
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
519, // `(
-1, // `)
370, // <stmt>*
486, // <type>
163, // `int
361, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
323, // <stmt>
249, // <assign>
-1, // `;
372, // <local var decl>
175, // <expr>
-1, // `=
495, // <expr8>
168, // <expr7>
166, // <expr6>
172, // <expr5>
614, // <expr4>
-1, // `+
75, // <expr3>
-1, // `*
422, // <expr2>
233, // <cast expr>
82, // <unary expr>
548, // <expr1>
273, // `-
293, // INTLIT
65, // letter
122, // "p"
122, // "v"
122, // "b"
122, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
122, // "t"
122, // "c"
122, // "i"
122, // "l"
122, // "o"
122, // "u"
239, // letter128
193, // {199..218 231..250}
193, // {193..198 225..230}
-1, // digit
428, // {"1".."9"}
513, // "0"
386, // digit128
573, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
93, // "#"
-1, // "*"
100, // "("
-1, // ")"
197, // "{"
504, // "}"
217, // "-"
-1, // "+"
-1, // "="
-1, // "["
-1, // "]"
-1, // ";"
-1, // idChar*
-1, // $$0
-1, // digit*
-1, // $$1
-1, // hexDigit*
-1, // $$2
-1, // idChar
-1, // "_"
-1, // idChar128
-1, // {223}
-1, // hexDigit
-1, // hexDigit128
-1, // $
-1, // $NT
  }
,
{ // state 150
22,MIN_REDUCTION+43, // `[
75,MIN_REDUCTION+43, // "["
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 151
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 152
2,247, // ws*
63,376, // ws
64,335, // " "
65,244, // {10}
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 153
0x80000000|1, // match move
0x80000000|141, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 154
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 155
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 156
0x80000000|1, // match move
0x80000000|270, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 157
44,623, // letter
45,81, // "p"
46,81, // "v"
47,81, // "b"
48,81, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
49,81, // "t"
50,81, // "c"
51,81, // "i"
52,81, // "l"
53,81, // "o"
54,81, // "u"
55,355, // letter128
56,45, // {199..218 231..250}
57,45, // {193..198 225..230}
58,267, // digit
59,235, // {"1".."9"}
60,235, // "0"
61,117, // digit128
62,573, // {176..185}
79,132, // $$0
84,565, // idChar
85,518, // "_"
86,120, // idChar128
87,116, // {223}
  }
,
{ // state 158
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 159
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 160
0x80000000|1, // match move
0x80000000|268, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 161
44,623, // letter
45,81, // "p"
46,81, // "v"
47,81, // "b"
48,81, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
49,81, // "t"
50,81, // "c"
51,81, // "i"
52,81, // "l"
53,81, // "o"
54,81, // "u"
55,357, // letter128
56,41, // {199..218 231..250}
57,41, // {193..198 225..230}
58,267, // digit
59,235, // {"1".."9"}
60,235, // "0"
61,114, // digit128
62,574, // {176..185}
79,130, // $$0
84,565, // idChar
85,518, // "_"
86,112, // idChar128
87,113, // {223}
  }
,
{ // state 162
22,MIN_REDUCTION+39, // `[
75,MIN_REDUCTION+39, // "["
MIN_REDUCTION+39, // (default reduction)
  }
,
{ // state 163
MIN_REDUCTION+9, // (default reduction)
  }
,
{ // state 164
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 165
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 166
MIN_REDUCTION+22, // (default reduction)
  }
,
{ // state 167
MIN_REDUCTION+23, // (default reduction)
  }
,
{ // state 168
MIN_REDUCTION+21, // (default reduction)
  }
,
{ // state 169
MIN_REDUCTION+22, // (default reduction)
  }
,
{ // state 170
37,101, // `*
67,307, // "*"
MIN_REDUCTION+25, // (default reduction)
  }
,
{ // state 171
MIN_REDUCTION+21, // (default reduction)
  }
,
{ // state 172
MIN_REDUCTION+23, // (default reduction)
  }
,
{ // state 173
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 174
0x80000000|424, // match move
0x80000000|583, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 175
29,364, // `=
74,56, // "="
  }
,
{ // state 176
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 177
16,206, // `)
69,628, // ")"
  }
,
{ // state 178
0x80000000|1, // match move
0x80000000|250, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 179
0x80000000|426, // match move
0x80000000|92, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 180
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 181
22,MIN_REDUCTION+39, // `[
75,MIN_REDUCTION+39, // "["
MIN_REDUCTION+39, // (default reduction)
  }
,
{ // state 182
2,234, // ws*
63,391, // ws
64,358, // " "
65,253, // {10}
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 183
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 184
44,623, // letter
45,81, // "p"
46,81, // "v"
47,81, // "b"
48,81, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
49,81, // "t"
50,81, // "c"
51,81, // "i"
52,81, // "l"
53,81, // "o"
54,81, // "u"
55,164, // letter128
56,336, // {199..218 231..250}
57,336, // {193..198 225..230}
58,267, // digit
59,235, // {"1".."9"}
60,235, // "0"
61,586, // digit128
62,349, // {176..185}
78,474, // idChar*
79,437, // $$0
84,561, // idChar
85,518, // "_"
86,366, // idChar128
87,407, // {223}
  }
,
{ // state 185
MIN_REDUCTION+79, // (default reduction)
  }
,
{ // state 186
0x80000000|1, // match move
0x80000000|553, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 187
0x80000000|1, // match move
0x80000000|555, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 188
2,274, // ws*
63,410, // ws
64,373, // " "
65,277, // {10}
MIN_REDUCTION+71, // (default reduction)
  }
,
{ // state 189
0x80000000|1, // match move
0x80000000|433, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 190
2,259, // ws*
  }
,
{ // state 191
0x80000000|1, // match move
0x80000000|435, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 192
2,465, // ws*
63,8, // ws
64,143, // " "
65,599, // {10}
MIN_REDUCTION+71, // (default reduction)
  }
,
{ // state 193
0x80000000|350, // match move
0x80000000|280, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 194
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 195
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 196
3,604, // <program>
4,145, // <class decl>+
5,397, // <class decl>
6,216, // `class
63,266, // ws
64,144, // " "
65,387, // {10}
66,211, // "#"
  }
,
{ // state 197
2,501, // ws*
63,562, // ws
64,27, // " "
65,356, // {10}
MIN_REDUCTION+61, // (default reduction)
  }
,
{ // state 198
2,71, // ws*
63,111, // ws
64,311, // " "
65,2, // {10}
MIN_REDUCTION+75, // (default reduction)
  }
,
{ // state 199
91,MIN_REDUCTION+43, // $NT
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 200
44,623, // letter
45,81, // "p"
46,81, // "v"
47,81, // "b"
48,81, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
49,81, // "t"
50,81, // "c"
51,81, // "i"
52,81, // "l"
53,81, // "o"
54,81, // "u"
55,5, // letter128
56,359, // {199..218 231..250}
57,359, // {193..198 225..230}
58,267, // digit
59,235, // {"1".."9"}
60,235, // "0"
61,592, // digit128
62,306, // {176..185}
78,448, // idChar*
79,212, // $$0
84,561, // idChar
85,518, // "_"
86,347, // idChar128
87,375, // {223}
  }
,
{ // state 201
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
382, // ID
593, // `{
-1, // <decl in class>*
430, // `}
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
519, // `(
-1, // `)
-1, // <stmt>*
486, // <type>
163, // `int
361, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
147, // <stmt>
249, // <assign>
-1, // `;
372, // <local var decl>
175, // <expr>
-1, // `=
495, // <expr8>
168, // <expr7>
166, // <expr6>
172, // <expr5>
614, // <expr4>
-1, // `+
75, // <expr3>
-1, // `*
422, // <expr2>
233, // <cast expr>
82, // <unary expr>
548, // <expr1>
273, // `-
293, // INTLIT
65, // letter
122, // "p"
122, // "v"
122, // "b"
122, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
122, // "t"
122, // "c"
122, // "i"
122, // "l"
122, // "o"
122, // "u"
239, // letter128
193, // {199..218 231..250}
193, // {193..198 225..230}
-1, // digit
428, // {"1".."9"}
513, // "0"
386, // digit128
573, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
93, // "#"
-1, // "*"
100, // "("
-1, // ")"
197, // "{"
529, // "}"
217, // "-"
-1, // "+"
-1, // "="
-1, // "["
-1, // "]"
-1, // ";"
-1, // idChar*
-1, // $$0
-1, // digit*
-1, // $$1
-1, // hexDigit*
-1, // $$2
-1, // idChar
-1, // "_"
-1, // idChar128
-1, // {223}
-1, // hexDigit
-1, // hexDigit128
-1, // $
-1, // $NT
  }
,
{ // state 202
63,532, // ws
64,405, // " "
65,295, // {10}
MIN_REDUCTION+58, // (default reduction)
  }
,
{ // state 203
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 204
0x80000000|1, // match move
0x80000000|451, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 205
22,MIN_REDUCTION+76, // `[
63,179, // ws
64,6, // " "
65,395, // {10}
75,MIN_REDUCTION+76, // "["
MIN_REDUCTION+76, // (default reduction)
  }
,
{ // state 206
8,149, // `{
70,197, // "{"
  }
,
{ // state 207
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 208
22,MIN_REDUCTION+108, // `[
63,179, // ws
64,6, // " "
65,395, // {10}
75,MIN_REDUCTION+108, // "["
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 209
2,404, // ws*
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 210
MIN_REDUCTION+6, // (default reduction)
  }
,
{ // state 211
50,569, // "c"
  }
,
{ // state 212
MIN_REDUCTION+79, // (default reduction)
  }
,
{ // state 213
MIN_REDUCTION+105, // (default reduction)
  }
,
{ // state 214
2,389, // ws*
63,173, // ws
64,240, // " "
65,203, // {10}
MIN_REDUCTION+67, // (default reduction)
  }
,
{ // state 215
7,392, // ID
40,367, // <unary expr>
41,507, // <expr1>
42,215, // `-
43,321, // INTLIT
44,337, // letter
45,122, // "p"
46,122, // "v"
47,122, // "b"
48,122, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
49,122, // "t"
50,122, // "c"
51,122, // "i"
52,122, // "l"
53,122, // "o"
54,122, // "u"
55,417, // letter128
56,19, // {199..218 231..250}
57,19, // {193..198 225..230}
59,464, // {"1".."9"}
60,480, // "0"
61,575, // digit128
62,587, // {176..185}
72,217, // "-"
  }
,
{ // state 216
7,453, // ID
44,436, // letter
45,122, // "p"
46,122, // "v"
47,122, // "b"
48,122, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
49,122, // "t"
50,122, // "c"
51,122, // "i"
52,122, // "l"
53,122, // "o"
54,122, // "u"
55,91, // letter128
56,406, // {199..218 231..250}
57,406, // {193..198 225..230}
  }
,
{ // state 217
2,619, // ws*
63,68, // ws
64,80, // " "
65,251, // {10}
MIN_REDUCTION+65, // (default reduction)
  }
,
{ // state 218
7,392, // ID
15,488, // `(
39,571, // <cast expr>
41,69, // <expr1>
43,321, // INTLIT
44,337, // letter
45,122, // "p"
46,122, // "v"
47,122, // "b"
48,122, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
49,122, // "t"
50,122, // "c"
51,122, // "i"
52,122, // "l"
53,122, // "o"
54,122, // "u"
55,417, // letter128
56,19, // {199..218 231..250}
57,19, // {193..198 225..230}
59,464, // {"1".."9"}
60,480, // "0"
61,575, // digit128
62,587, // {176..185}
68,100, // "("
  }
,
{ // state 219
63,317, // ws
64,445, // " "
65,50, // {10}
MIN_REDUCTION+56, // (default reduction)
  }
,
{ // state 220
MIN_REDUCTION+29, // (default reduction)
  }
,
{ // state 221
MIN_REDUCTION+14, // (default reduction)
  }
,
{ // state 222
MIN_REDUCTION+17, // (default reduction)
  }
,
{ // state 223
16,421, // `)
21,401, // <empty bracket pair>
22,627, // `[
69,570, // ")"
75,188, // "["
  }
,
{ // state 224
0x80000000|1, // match move
0x80000000|500, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 225
16,418, // `)
21,401, // <empty bracket pair>
22,627, // `[
69,570, // ")"
75,188, // "["
  }
,
{ // state 226
MIN_REDUCTION+9, // (default reduction)
  }
,
{ // state 227
63,351, // ws
64,469, // " "
65,309, // {10}
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 228
63,351, // ws
64,469, // " "
65,309, // {10}
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 229
22,MIN_REDUCTION+108, // `[
63,28, // ws
64,160, // " "
65,515, // {10}
75,MIN_REDUCTION+108, // "["
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 230
22,MIN_REDUCTION+108, // `[
63,25, // ws
64,156, // " "
65,514, // {10}
75,MIN_REDUCTION+108, // "["
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 231
0x80000000|308, // match move
0x80000000|578, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 232
0x80000000|325, // match move
0x80000000|279, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 233
MIN_REDUCTION+29, // (default reduction)
  }
,
{ // state 234
63,534, // ws
64,358, // " "
65,253, // {10}
MIN_REDUCTION+76, // (default reduction)
  }
,
{ // state 235
MIN_REDUCTION+40, // (default reduction)
  }
,
{ // state 236
MIN_REDUCTION+29, // (default reduction)
  }
,
{ // state 237
44,623, // letter
45,81, // "p"
46,81, // "v"
47,81, // "b"
48,81, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
49,81, // "t"
50,81, // "c"
51,81, // "i"
52,81, // "l"
53,81, // "o"
54,81, // "u"
55,374, // letter128
56,324, // {199..218 231..250}
57,324, // {193..198 225..230}
58,267, // digit
59,235, // {"1".."9"}
60,235, // "0"
61,510, // digit128
62,248, // {176..185}
79,595, // $$0
84,565, // idChar
85,518, // "_"
86,288, // idChar128
87,180, // {223}
  }
,
{ // state 238
46,88, // "v"
  }
,
{ // state 239
0x80000000|470, // match move
0x80000000|487, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 240
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 241
0x80000000|165, // match move
0x80000000|381, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 242
MIN_REDUCTION+78, // (default reduction)
  }
,
{ // state 243
0x80000000|165, // match move
0x80000000|379, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 244
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 245
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 246
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 247
63,489, // ws
64,335, // " "
65,244, // {10}
MIN_REDUCTION+76, // (default reduction)
  }
,
{ // state 248
MIN_REDUCTION+41, // (default reduction)
  }
,
{ // state 249
26,221, // `;
77,198, // ";"
  }
,
{ // state 250
22,MIN_REDUCTION+42, // `[
75,MIN_REDUCTION+42, // "["
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 251
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 252
22,MIN_REDUCTION+91, // `[
75,MIN_REDUCTION+91, // "["
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 253
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 254
22,MIN_REDUCTION+91, // `[
75,MIN_REDUCTION+91, // "["
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 255
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 256
22,MIN_REDUCTION+78, // `[
75,MIN_REDUCTION+78, // "["
MIN_REDUCTION+78, // (default reduction)
  }
,
{ // state 257
0x80000000|1, // match move
0x80000000|281, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 258
22,MIN_REDUCTION+85, // `[
75,MIN_REDUCTION+85, // "["
MIN_REDUCTION+85, // (default reduction)
  }
,
{ // state 259
0x80000000|1, // match move
0x80000000|17, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 260
MIN_REDUCTION+10, // (default reduction)
  }
,
{ // state 261
22,MIN_REDUCTION+85, // `[
75,MIN_REDUCTION+85, // "["
MIN_REDUCTION+85, // (default reduction)
  }
,
{ // state 262
0x80000000|1, // match move
0x80000000|263, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 263
22,MIN_REDUCTION+76, // `[
63,25, // ws
64,156, // " "
65,514, // {10}
75,MIN_REDUCTION+76, // "["
MIN_REDUCTION+76, // (default reduction)
  }
,
{ // state 264
MIN_REDUCTION+41, // (default reduction)
  }
,
{ // state 265
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 266
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 267
MIN_REDUCTION+87, // (default reduction)
  }
,
{ // state 268
22,MIN_REDUCTION+42, // `[
75,MIN_REDUCTION+42, // "["
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 269
22,602, // `[
75,192, // "["
MIN_REDUCTION+32, // (default reduction)
  }
,
{ // state 270
22,MIN_REDUCTION+42, // `[
75,MIN_REDUCTION+42, // "["
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 271
22,MIN_REDUCTION+106, // `[
75,MIN_REDUCTION+106, // "["
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 272
7,594, // ID
40,460, // <unary expr>
41,544, // <expr1>
42,272, // `-
43,286, // INTLIT
44,441, // letter
45,122, // "p"
46,122, // "v"
47,122, // "b"
48,122, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
49,122, // "t"
50,122, // "c"
51,122, // "i"
52,122, // "l"
53,122, // "o"
54,122, // "u"
55,446, // letter128
56,41, // {199..218 231..250}
57,41, // {193..198 225..230}
59,425, // {"1".."9"}
60,520, // "0"
61,384, // digit128
62,574, // {176..185}
72,217, // "-"
  }
,
{ // state 273
7,560, // ID
40,455, // <unary expr>
41,548, // <expr1>
42,273, // `-
43,293, // INTLIT
44,444, // letter
45,122, // "p"
46,122, // "v"
47,122, // "b"
48,122, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
49,122, // "t"
50,122, // "c"
51,122, // "i"
52,122, // "l"
53,122, // "o"
54,122, // "u"
55,449, // letter128
56,45, // {199..218 231..250}
57,45, // {193..198 225..230}
59,428, // {"1".."9"}
60,513, // "0"
61,386, // digit128
62,573, // {176..185}
72,217, // "-"
  }
,
{ // state 274
63,512, // ws
64,373, // " "
65,277, // {10}
MIN_REDUCTION+70, // (default reduction)
  }
,
{ // state 275
22,605, // `[
75,192, // "["
MIN_REDUCTION+32, // (default reduction)
  }
,
{ // state 276
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 277
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 278
2,259, // ws*
22,MIN_REDUCTION+73, // `[
63,531, // ws
64,178, // " "
65,535, // {10}
75,MIN_REDUCTION+73, // "["
MIN_REDUCTION+73, // (default reduction)
  }
,
{ // state 279
22,MIN_REDUCTION+91, // `[
75,MIN_REDUCTION+91, // "["
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 280
22,MIN_REDUCTION+39, // `[
75,MIN_REDUCTION+39, // "["
MIN_REDUCTION+39, // (default reduction)
  }
,
{ // state 281
22,MIN_REDUCTION+76, // `[
63,28, // ws
64,160, // " "
65,515, // {10}
75,MIN_REDUCTION+76, // "["
MIN_REDUCTION+76, // (default reduction)
  }
,
{ // state 282
91,MIN_REDUCTION+42, // $NT
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 283
9,536, // <decl in class>*
10,390, // `}
11,285, // <decl in class>
12,210, // <method decl>
13,300, // `public
66,478, // "#"
71,327, // "}"
  }
,
{ // state 284
22,MIN_REDUCTION+110, // `[
63,25, // ws
64,156, // " "
65,514, // {10}
75,MIN_REDUCTION+110, // "["
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 285
MIN_REDUCTION+97, // (default reduction)
  }
,
{ // state 286
0x80000000|1, // match move
0x80000000|42, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 287
22,MIN_REDUCTION+110, // `[
63,28, // ws
64,160, // " "
65,515, // {10}
75,MIN_REDUCTION+110, // "["
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 288
2,227, // ws*
63,12, // ws
64,469, // " "
65,309, // {10}
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 289
MIN_REDUCTION+7, // (default reduction)
  }
,
{ // state 290
22,MIN_REDUCTION+106, // `[
75,MIN_REDUCTION+106, // "["
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 291
22,MIN_REDUCTION+91, // `[
75,MIN_REDUCTION+91, // "["
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 292
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 293
0x80000000|1, // match move
0x80000000|64, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 294
22,MIN_REDUCTION+106, // `[
75,MIN_REDUCTION+106, // "["
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 295
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 296
0x80000000|72, // match move
0x80000000|15, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 297
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 298
22,MIN_REDUCTION+81, // `[
75,MIN_REDUCTION+81, // "["
MIN_REDUCTION+81, // (default reduction)
  }
,
{ // state 299
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 300
14,491, // `void
66,238, // "#"
  }
,
{ // state 301
0x80000000|55, // match move
0x80000000|36, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 302
22,MIN_REDUCTION+81, // `[
75,MIN_REDUCTION+81, // "["
MIN_REDUCTION+81, // (default reduction)
  }
,
{ // state 303
0x80000000|1, // match move
0x80000000|305, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 304
MIN_REDUCTION+11, // (default reduction)
  }
,
{ // state 305
22,MIN_REDUCTION+76, // `[
63,58, // ws
64,178, // " "
65,535, // {10}
75,MIN_REDUCTION+76, // "["
MIN_REDUCTION+76, // (default reduction)
  }
,
{ // state 306
MIN_REDUCTION+41, // (default reduction)
  }
,
{ // state 307
2,538, // ws*
63,494, // ws
64,265, // " "
65,154, // {10}
MIN_REDUCTION+55, // (default reduction)
  }
,
{ // state 308
MIN_REDUCTION+79, // (default reduction)
  }
,
{ // state 309
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 310
22,MIN_REDUCTION+41, // `[
75,MIN_REDUCTION+41, // "["
MIN_REDUCTION+41, // (default reduction)
  }
,
{ // state 311
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 312
22,MIN_REDUCTION+41, // `[
75,MIN_REDUCTION+41, // "["
MIN_REDUCTION+41, // (default reduction)
  }
,
{ // state 313
63,322, // ws
64,52, // " "
65,352, // {10}
MIN_REDUCTION+72, // (default reduction)
  }
,
{ // state 314
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 315
22,MIN_REDUCTION+89, // `[
75,MIN_REDUCTION+89, // "["
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 316
2,62, // ws*
22,MIN_REDUCTION+73, // `[
63,142, // ws
64,160, // " "
65,515, // {10}
75,MIN_REDUCTION+73, // "["
MIN_REDUCTION+73, // (default reduction)
  }
,
{ // state 317
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 318
22,508, // `[
75,192, // "["
MIN_REDUCTION+32, // (default reduction)
  }
,
{ // state 319
2,303, // ws*
22,MIN_REDUCTION+77, // `[
63,531, // ws
64,178, // " "
65,535, // {10}
75,MIN_REDUCTION+77, // "["
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 320
2,67, // ws*
22,MIN_REDUCTION+73, // `[
63,139, // ws
64,156, // " "
65,514, // {10}
75,MIN_REDUCTION+73, // "["
MIN_REDUCTION+73, // (default reduction)
  }
,
{ // state 321
0x80000000|1, // match move
0x80000000|33, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 322
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 323
MIN_REDUCTION+101, // (default reduction)
  }
,
{ // state 324
MIN_REDUCTION+39, // (default reduction)
  }
,
{ // state 325
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 326
7,594, // ID
15,138, // `(
28,530, // <expr>
30,493, // <expr8>
31,171, // <expr7>
32,169, // <expr6>
33,167, // <expr5>
34,611, // <expr4>
36,96, // <expr3>
38,416, // <expr2>
39,236, // <cast expr>
40,78, // <unary expr>
41,544, // <expr1>
42,272, // `-
43,286, // INTLIT
44,441, // letter
45,122, // "p"
46,122, // "v"
47,122, // "b"
48,122, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
49,122, // "t"
50,122, // "c"
51,122, // "i"
52,122, // "l"
53,122, // "o"
54,122, // "u"
55,446, // letter128
56,41, // {199..218 231..250}
57,41, // {193..198 225..230}
59,425, // {"1".."9"}
60,520, // "0"
61,384, // digit128
62,574, // {176..185}
68,100, // "("
72,217, // "-"
  }
,
{ // state 327
2,119, // ws*
63,276, // ws
64,454, // " "
65,589, // {10}
MIN_REDUCTION+63, // (default reduction)
  }
,
{ // state 328
22,MIN_REDUCTION+81, // `[
75,MIN_REDUCTION+81, // "["
MIN_REDUCTION+81, // (default reduction)
  }
,
{ // state 329
2,450, // ws*
22,MIN_REDUCTION+111, // `[
63,142, // ws
64,160, // " "
65,515, // {10}
75,MIN_REDUCTION+111, // "["
MIN_REDUCTION+111, // (default reduction)
  }
,
{ // state 330
63,534, // ws
64,358, // " "
65,253, // {10}
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 331
2,34, // ws*
63,207, // ws
64,255, // " "
65,151, // {10}
MIN_REDUCTION+61, // (default reduction)
  }
,
{ // state 332
MIN_REDUCTION+39, // (default reduction)
  }
,
{ // state 333
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 334
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 335
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 336
MIN_REDUCTION+39, // (default reduction)
  }
,
{ // state 337
44,623, // letter
45,81, // "p"
46,81, // "v"
47,81, // "b"
48,81, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
49,81, // "t"
50,81, // "c"
51,81, // "i"
52,81, // "l"
53,81, // "o"
54,81, // "u"
55,477, // letter128
56,19, // {199..218 231..250}
57,19, // {193..198 225..230}
58,267, // digit
59,235, // {"1".."9"}
60,235, // "0"
61,95, // digit128
62,587, // {176..185}
78,140, // idChar*
79,224, // $$0
84,561, // idChar
85,518, // "_"
86,70, // idChar128
87,232, // {223}
  }
,
{ // state 338
22,MIN_REDUCTION+41, // `[
75,MIN_REDUCTION+41, // "["
MIN_REDUCTION+41, // (default reduction)
  }
,
{ // state 339
63,533, // ws
64,311, // " "
65,2, // {10}
MIN_REDUCTION+62, // (default reduction)
  }
,
{ // state 340
2,458, // ws*
22,MIN_REDUCTION+111, // `[
63,139, // ws
64,156, // " "
65,514, // {10}
75,MIN_REDUCTION+111, // "["
MIN_REDUCTION+111, // (default reduction)
  }
,
{ // state 341
7,594, // ID
15,138, // `(
36,109, // <expr3>
38,416, // <expr2>
39,236, // <cast expr>
40,78, // <unary expr>
41,544, // <expr1>
42,272, // `-
43,286, // INTLIT
44,441, // letter
45,122, // "p"
46,122, // "v"
47,122, // "b"
48,122, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
49,122, // "t"
50,122, // "c"
51,122, // "i"
52,122, // "l"
53,122, // "o"
54,122, // "u"
55,446, // letter128
56,41, // {199..218 231..250}
57,41, // {193..198 225..230}
59,425, // {"1".."9"}
60,520, // "0"
61,384, // digit128
62,574, // {176..185}
68,100, // "("
72,217, // "-"
  }
,
{ // state 342
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 343
7,560, // ID
15,519, // `(
36,133, // <expr3>
38,422, // <expr2>
39,233, // <cast expr>
40,82, // <unary expr>
41,548, // <expr1>
42,273, // `-
43,293, // INTLIT
44,444, // letter
45,122, // "p"
46,122, // "v"
47,122, // "b"
48,122, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
49,122, // "t"
50,122, // "c"
51,122, // "i"
52,122, // "l"
53,122, // "o"
54,122, // "u"
55,449, // letter128
56,45, // {199..218 231..250}
57,45, // {193..198 225..230}
59,428, // {"1".."9"}
60,513, // "0"
61,386, // digit128
62,573, // {176..185}
68,100, // "("
72,217, // "-"
  }
,
{ // state 344
MIN_REDUCTION+96, // (default reduction)
  }
,
{ // state 345
MIN_REDUCTION+2, // (default reduction)
  }
,
{ // state 346
MIN_REDUCTION+4, // (default reduction)
  }
,
{ // state 347
2,330, // ws*
63,391, // ws
64,358, // " "
65,253, // {10}
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 348
44,623, // letter
45,81, // "p"
46,81, // "v"
47,81, // "b"
48,81, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
49,81, // "t"
50,81, // "c"
51,81, // "i"
52,81, // "l"
53,81, // "o"
54,81, // "u"
55,61, // letter128
56,406, // {199..218 231..250}
57,406, // {193..198 225..230}
58,267, // digit
59,235, // {"1".."9"}
60,235, // "0"
61,625, // digit128
62,264, // {176..185}
79,242, // $$0
84,565, // idChar
85,518, // "_"
86,572, // idChar128
87,334, // {223}
  }
,
{ // state 349
MIN_REDUCTION+41, // (default reduction)
  }
,
{ // state 350
MIN_REDUCTION+39, // (default reduction)
  }
,
{ // state 351
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 352
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 353
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 354
0x80000000|1, // match move
0x80000000|3, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 355
0x80000000|314, // match move
0x80000000|22, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 356
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 357
0x80000000|314, // match move
0x80000000|26, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 358
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 359
MIN_REDUCTION+39, // (default reduction)
  }
,
{ // state 360
MIN_REDUCTION+94, // (default reduction)
  }
,
{ // state 361
MIN_REDUCTION+10, // (default reduction)
  }
,
{ // state 362
7,392, // ID
15,488, // `(
36,170, // <expr3>
38,434, // <expr2>
39,220, // <cast expr>
40,43, // <unary expr>
41,507, // <expr1>
42,215, // `-
43,321, // INTLIT
44,337, // letter
45,122, // "p"
46,122, // "v"
47,122, // "b"
48,122, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
49,122, // "t"
50,122, // "c"
51,122, // "i"
52,122, // "l"
53,122, // "o"
54,122, // "u"
55,417, // letter128
56,19, // {199..218 231..250}
57,19, // {193..198 225..230}
59,464, // {"1".."9"}
60,480, // "0"
61,575, // digit128
62,587, // {176..185}
68,100, // "("
72,217, // "-"
  }
,
{ // state 363
2,123, // ws*
22,MIN_REDUCTION+83, // `[
63,531, // ws
64,178, // " "
65,535, // {10}
75,MIN_REDUCTION+83, // "["
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 364
7,594, // ID
15,138, // `(
28,77, // <expr>
30,493, // <expr8>
31,171, // <expr7>
32,169, // <expr6>
33,167, // <expr5>
34,611, // <expr4>
36,96, // <expr3>
38,416, // <expr2>
39,236, // <cast expr>
40,78, // <unary expr>
41,544, // <expr1>
42,272, // `-
43,286, // INTLIT
44,441, // letter
45,122, // "p"
46,122, // "v"
47,122, // "b"
48,122, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
49,122, // "t"
50,122, // "c"
51,122, // "i"
52,122, // "l"
53,122, // "o"
54,122, // "u"
55,446, // letter128
56,41, // {199..218 231..250}
57,41, // {193..198 225..230}
59,425, // {"1".."9"}
60,520, // "0"
61,384, // digit128
62,574, // {176..185}
68,100, // "("
72,217, // "-"
  }
,
{ // state 365
63,489, // ws
64,335, // " "
65,244, // {10}
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 366
2,365, // ws*
63,376, // ws
64,335, // " "
65,244, // {10}
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 367
MIN_REDUCTION+33, // (default reduction)
  }
,
{ // state 368
22,MIN_REDUCTION+82, // `[
63,58, // ws
64,178, // " "
65,535, // {10}
75,MIN_REDUCTION+82, // "["
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 369
2,153, // ws*
  }
,
{ // state 370
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
382, // ID
593, // `{
-1, // <decl in class>*
289, // `}
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
519, // `(
-1, // `)
-1, // <stmt>*
486, // <type>
163, // `int
361, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
147, // <stmt>
249, // <assign>
-1, // `;
372, // <local var decl>
175, // <expr>
-1, // `=
495, // <expr8>
168, // <expr7>
166, // <expr6>
172, // <expr5>
614, // <expr4>
-1, // `+
75, // <expr3>
-1, // `*
422, // <expr2>
233, // <cast expr>
82, // <unary expr>
548, // <expr1>
273, // `-
293, // INTLIT
65, // letter
122, // "p"
122, // "v"
122, // "b"
122, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
122, // "t"
122, // "c"
122, // "i"
122, // "l"
122, // "o"
122, // "u"
239, // letter128
193, // {199..218 231..250}
193, // {193..198 225..230}
-1, // digit
428, // {"1".."9"}
513, // "0"
386, // digit128
573, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
93, // "#"
-1, // "*"
100, // "("
-1, // ")"
197, // "{"
504, // "}"
217, // "-"
-1, // "+"
-1, // "="
-1, // "["
-1, // "]"
-1, // ";"
-1, // idChar*
-1, // $$0
-1, // digit*
-1, // $$1
-1, // hexDigit*
-1, // $$2
-1, // idChar
-1, // "_"
-1, // idChar128
-1, // {223}
-1, // hexDigit
-1, // hexDigit128
-1, // $
-1, // $NT
  }
,
{ // state 371
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 372
26,222, // `;
77,198, // ";"
  }
,
{ // state 373
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 374
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 375
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 376
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 377
63,351, // ws
64,469, // " "
65,309, // {10}
MIN_REDUCTION+76, // (default reduction)
  }
,
{ // state 378
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 379
22,MIN_REDUCTION+93, // `[
75,MIN_REDUCTION+93, // "["
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 380
2,354, // ws*
22,MIN_REDUCTION+111, // `[
63,531, // ws
64,178, // " "
65,535, // {10}
75,MIN_REDUCTION+111, // "["
MIN_REDUCTION+111, // (default reduction)
  }
,
{ // state 381
22,MIN_REDUCTION+93, // `[
75,MIN_REDUCTION+93, // "["
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 382
0x80000000|432, // match move
0x80000000|456, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 383
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 384
0x80000000|579, // match move
0x80000000|403, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 385
2,404, // ws*
22,MIN_REDUCTION+109, // `[
63,622, // ws
64,6, // " "
65,395, // {10}
75,MIN_REDUCTION+109, // "["
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 386
0x80000000|581, // match move
0x80000000|400, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 387
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 388
63,439, // ws
64,282, // " "
65,199, // {10}
91,MIN_REDUCTION+72, // $NT
  }
,
{ // state 389
63,183, // ws
64,240, // " "
65,203, // {10}
MIN_REDUCTION+66, // (default reduction)
  }
,
{ // state 390
MIN_REDUCTION+5, // (default reduction)
  }
,
{ // state 391
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 392
0x80000000|1, // match move
0x80000000|559, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 393
2,499, // ws*
  }
,
{ // state 394
2,497, // ws*
  }
,
{ // state 395
0x80000000|110, // match move
0x80000000|150, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 396
0x80000000|459, // match move
0x80000000|340, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 397
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 398
0x80000000|466, // match move
0x80000000|329, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 399
22,MIN_REDUCTION+93, // `[
75,MIN_REDUCTION+93, // "["
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 400
2,76, // ws*
22,MIN_REDUCTION+83, // `[
63,139, // ws
64,156, // " "
65,514, // {10}
75,MIN_REDUCTION+83, // "["
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 401
MIN_REDUCTION+12, // (default reduction)
  }
,
{ // state 402
MIN_REDUCTION+40, // (default reduction)
  }
,
{ // state 403
2,83, // ws*
22,MIN_REDUCTION+83, // `[
63,142, // ws
64,160, // " "
65,515, // {10}
75,MIN_REDUCTION+83, // "["
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 404
0x80000000|618, // match move
0x80000000|208, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 405
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 406
MIN_REDUCTION+39, // (default reduction)
  }
,
{ // state 407
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 408
MIN_REDUCTION+99, // (default reduction)
  }
,
{ // state 409
22,MIN_REDUCTION+85, // `[
75,MIN_REDUCTION+85, // "["
MIN_REDUCTION+85, // (default reduction)
  }
,
{ // state 410
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 411
22,MIN_REDUCTION+82, // `[
63,25, // ws
64,156, // " "
65,514, // {10}
75,MIN_REDUCTION+82, // "["
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 412
0x80000000|1, // match move
0x80000000|558, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 413
63,532, // ws
64,405, // " "
65,295, // {10}
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 414
0x80000000|1, // match move
0x80000000|554, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 415
23,37, // `]
76,596, // "]"
  }
,
{ // state 416
MIN_REDUCTION+28, // (default reduction)
  }
,
{ // state 417
0x80000000|472, // match move
0x80000000|319, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 418
7,594, // ID
15,138, // `(
39,522, // <cast expr>
41,10, // <expr1>
43,286, // INTLIT
44,441, // letter
45,122, // "p"
46,122, // "v"
47,122, // "b"
48,122, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
49,122, // "t"
50,122, // "c"
51,122, // "i"
52,122, // "l"
53,122, // "o"
54,122, // "u"
55,446, // letter128
56,41, // {199..218 231..250}
57,41, // {193..198 225..230}
59,425, // {"1".."9"}
60,520, // "0"
61,384, // digit128
62,574, // {176..185}
68,100, // "("
  }
,
{ // state 419
2,262, // ws*
  }
,
{ // state 420
2,257, // ws*
  }
,
{ // state 421
7,560, // ID
15,519, // `(
39,540, // <cast expr>
41,13, // <expr1>
43,293, // INTLIT
44,444, // letter
45,122, // "p"
46,122, // "v"
47,122, // "b"
48,122, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
49,122, // "t"
50,122, // "c"
51,122, // "i"
52,122, // "l"
53,122, // "o"
54,122, // "u"
55,449, // letter128
56,45, // {199..218 231..250}
57,45, // {193..198 225..230}
59,428, // {"1".."9"}
60,513, // "0"
61,386, // digit128
62,573, // {176..185}
68,100, // "("
  }
,
{ // state 422
MIN_REDUCTION+28, // (default reduction)
  }
,
{ // state 423
22,MIN_REDUCTION+82, // `[
63,28, // ws
64,160, // " "
65,515, // {10}
75,MIN_REDUCTION+82, // "["
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 424
MIN_REDUCTION+41, // (default reduction)
  }
,
{ // state 425
58,159, // digit
59,402, // {"1".."9"}
60,402, // "0"
61,398, // digit128
62,574, // {176..185}
80,617, // digit*
81,550, // $$1
  }
,
{ // state 426
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 427
0x80000000|438, // match move
0x80000000|380, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 428
58,159, // digit
59,402, // {"1".."9"}
60,402, // "0"
61,396, // digit128
62,573, // {176..185}
80,620, // digit*
81,552, // $$1
  }
,
{ // state 429
16,218, // `)
21,401, // <empty bracket pair>
22,627, // `[
69,570, // ")"
75,188, // "["
  }
,
{ // state 430
MIN_REDUCTION+15, // (default reduction)
  }
,
{ // state 431
63,351, // ws
64,469, // " "
65,309, // {10}
MIN_REDUCTION+72, // (default reduction)
  }
,
{ // state 432
MIN_REDUCTION+11, // (default reduction)
  }
,
{ // state 433
22,MIN_REDUCTION+80, // `[
75,MIN_REDUCTION+80, // "["
MIN_REDUCTION+80, // (default reduction)
  }
,
{ // state 434
MIN_REDUCTION+28, // (default reduction)
  }
,
{ // state 435
22,MIN_REDUCTION+80, // `[
75,MIN_REDUCTION+80, // "["
MIN_REDUCTION+80, // (default reduction)
  }
,
{ // state 436
44,623, // letter
45,81, // "p"
46,81, // "v"
47,81, // "b"
48,81, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
49,81, // "t"
50,81, // "c"
51,81, // "i"
52,81, // "l"
53,81, // "o"
54,81, // "u"
55,61, // letter128
56,406, // {199..218 231..250}
57,406, // {193..198 225..230}
58,267, // digit
59,235, // {"1".."9"}
60,235, // "0"
61,625, // digit128
62,264, // {176..185}
78,348, // idChar*
79,185, // $$0
84,561, // idChar
85,518, // "_"
86,572, // idChar128
87,334, // {223}
  }
,
{ // state 437
MIN_REDUCTION+79, // (default reduction)
  }
,
{ // state 438
2,354, // ws*
  }
,
{ // state 439
91,MIN_REDUCTION+106, // $NT
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 440
0x80000000|1, // match move
0x80000000|601, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 441
44,623, // letter
45,81, // "p"
46,81, // "v"
47,81, // "b"
48,81, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
49,81, // "t"
50,81, // "c"
51,81, // "i"
52,81, // "l"
53,81, // "o"
54,81, // "u"
55,357, // letter128
56,41, // {199..218 231..250}
57,41, // {193..198 225..230}
58,267, // digit
59,235, // {"1".."9"}
60,235, // "0"
61,114, // digit128
62,574, // {176..185}
78,161, // idChar*
79,187, // $$0
84,561, // idChar
85,518, // "_"
86,112, // idChar128
87,113, // {223}
  }
,
{ // state 442
0x80000000|1, // match move
0x80000000|509, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 443
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 444
44,623, // letter
45,81, // "p"
46,81, // "v"
47,81, // "b"
48,81, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
49,81, // "t"
50,81, // "c"
51,81, // "i"
52,81, // "l"
53,81, // "o"
54,81, // "u"
55,355, // letter128
56,45, // {199..218 231..250}
57,45, // {193..198 225..230}
58,267, // digit
59,235, // {"1".."9"}
60,235, // "0"
61,117, // digit128
62,573, // {176..185}
78,157, // idChar*
79,186, // $$0
84,561, // idChar
85,518, // "_"
86,120, // idChar128
87,116, // {223}
  }
,
{ // state 445
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 446
0x80000000|420, // match move
0x80000000|24, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 447
29,326, // `=
74,56, // "="
  }
,
{ // state 448
44,623, // letter
45,81, // "p"
46,81, // "v"
47,81, // "b"
48,81, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
49,81, // "t"
50,81, // "c"
51,81, // "i"
52,81, // "l"
53,81, // "o"
54,81, // "u"
55,5, // letter128
56,359, // {199..218 231..250}
57,359, // {193..198 225..230}
58,267, // digit
59,235, // {"1".."9"}
60,235, // "0"
61,592, // digit128
62,306, // {176..185}
79,40, // $$0
84,565, // idChar
85,518, // "_"
86,347, // idChar128
87,375, // {223}
  }
,
{ // state 449
0x80000000|419, // match move
0x80000000|29, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 450
0x80000000|1, // match move
0x80000000|287, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 451
22,MIN_REDUCTION+80, // `[
75,MIN_REDUCTION+80, // "["
MIN_REDUCTION+80, // (default reduction)
  }
,
{ // state 452
63,490, // ws
64,333, // " "
65,246, // {10}
MIN_REDUCTION+56, // (default reduction)
  }
,
{ // state 453
8,283, // `{
70,331, // "{"
  }
,
{ // state 454
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 455
MIN_REDUCTION+33, // (default reduction)
  }
,
{ // state 456
22,MIN_REDUCTION+35, // `[
29,MIN_REDUCTION+35, // `=
35,MIN_REDUCTION+35, // `+
37,MIN_REDUCTION+35, // `*
67,MIN_REDUCTION+35, // "*"
73,MIN_REDUCTION+35, // "+"
74,MIN_REDUCTION+35, // "="
75,MIN_REDUCTION+35, // "["
MIN_REDUCTION+11, // (default reduction)
  }
,
{ // state 457
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 458
0x80000000|1, // match move
0x80000000|284, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 459
2,458, // ws*
  }
,
{ // state 460
MIN_REDUCTION+33, // (default reduction)
  }
,
{ // state 461
0x80000000|1, // match move
0x80000000|588, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 462
0x80000000|1, // match move
0x80000000|590, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 463
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 464
58,159, // digit
59,402, // {"1".."9"}
60,402, // "0"
61,427, // digit128
62,587, // {176..185}
80,492, // digit*
81,528, // $$1
  }
,
{ // state 465
63,297, // ws
64,143, // " "
65,599, // {10}
MIN_REDUCTION+70, // (default reduction)
  }
,
{ // state 466
2,450, // ws*
  }
,
{ // state 467
63,532, // ws
64,405, // " "
65,295, // {10}
MIN_REDUCTION+76, // (default reduction)
  }
,
{ // state 468
91,MIN_REDUCTION+107, // $NT
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 469
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 470
2,591, // ws*
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 471
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 472
2,303, // ws*
  }
,
{ // state 473
2,67, // ws*
  }
,
{ // state 474
44,623, // letter
45,81, // "p"
46,81, // "v"
47,81, // "b"
48,81, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
49,81, // "t"
50,81, // "c"
51,81, // "i"
52,81, // "l"
53,81, // "o"
54,81, // "u"
55,164, // letter128
56,336, // {199..218 231..250}
57,336, // {193..198 225..230}
58,267, // digit
59,235, // {"1".."9"}
60,235, // "0"
61,586, // digit128
62,349, // {176..185}
79,84, // $$0
84,565, // idChar
85,518, // "_"
86,366, // idChar128
87,407, // {223}
  }
,
{ // state 475
2,62, // ws*
  }
,
{ // state 476
MIN_REDUCTION+76, // (default reduction)
  }
,
{ // state 477
0x80000000|314, // match move
0x80000000|54, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 478
45,63, // "p"
  }
,
{ // state 479
22,MIN_REDUCTION+39, // `[
75,MIN_REDUCTION+39, // "["
MIN_REDUCTION+39, // (default reduction)
  }
,
{ // state 480
45,371, // "p"
46,371, // "v"
47,371, // "b"
48,371, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
49,371, // "t"
50,371, // "c"
51,371, // "i"
52,371, // "l"
53,371, // "o"
54,371, // "u"
57,79, // {193..198 225..230}
59,371, // {"1".."9"}
60,371, // "0"
62,79, // {176..185}
82,47, // hexDigit*
83,49, // $$2
88,408, // hexDigit
89,11, // hexDigit128
  }
,
{ // state 481
2,497, // ws*
22,MIN_REDUCTION+109, // `[
63,142, // ws
64,160, // " "
65,515, // {10}
75,MIN_REDUCTION+109, // "["
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 482
63,297, // ws
64,143, // " "
65,599, // {10}
MIN_REDUCTION+68, // (default reduction)
  }
,
{ // state 483
2,499, // ws*
22,MIN_REDUCTION+109, // `[
63,139, // ws
64,156, // " "
65,514, // {10}
75,MIN_REDUCTION+109, // "["
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 484
0x80000000|597, // match move
0x80000000|315, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 485
MIN_REDUCTION+13, // (default reduction)
  }
,
{ // state 486
7,447, // ID
21,125, // <empty bracket pair>
22,59, // `[
44,200, // letter
45,122, // "p"
46,122, // "v"
47,122, // "b"
48,122, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
49,122, // "t"
50,122, // "c"
51,122, // "i"
52,122, // "l"
53,122, // "o"
54,122, // "u"
55,182, // letter128
56,359, // {199..218 231..250}
57,359, // {193..198 225..230}
75,188, // "["
  }
,
{ // state 487
2,591, // ws*
22,MIN_REDUCTION+77, // `[
63,622, // ws
64,6, // " "
65,395, // {10}
75,MIN_REDUCTION+77, // "["
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 488
7,304, // ID
18,429, // <type>
19,226, // `int
20,260, // `boolean
44,20, // letter
45,122, // "p"
46,122, // "v"
47,122, // "b"
48,122, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
49,122, // "t"
50,122, // "c"
51,122, // "i"
52,122, // "l"
53,122, // "o"
54,122, // "u"
55,576, // letter128
56,324, // {199..218 231..250}
57,324, // {193..198 225..230}
66,503, // "#"
  }
,
{ // state 489
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 490
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 491
7,584, // ID
44,184, // letter
45,122, // "p"
46,122, // "v"
47,122, // "b"
48,122, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
49,122, // "t"
50,122, // "c"
51,122, // "i"
52,122, // "l"
53,122, // "o"
54,122, // "u"
55,152, // letter128
56,336, // {199..218 231..250}
57,336, // {193..198 225..230}
  }
,
{ // state 492
58,360, // digit
59,402, // {"1".."9"}
60,402, // "0"
61,427, // digit128
62,587, // {176..185}
81,204, // $$1
  }
,
{ // state 493
MIN_REDUCTION+20, // (default reduction)
  }
,
{ // state 494
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 495
MIN_REDUCTION+20, // (default reduction)
  }
,
{ // state 496
22,MIN_REDUCTION+36, // `[
75,MIN_REDUCTION+36, // "["
MIN_REDUCTION+36, // (default reduction)
  }
,
{ // state 497
0x80000000|1, // match move
0x80000000|229, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 498
22,MIN_REDUCTION+36, // `[
75,MIN_REDUCTION+36, // "["
MIN_REDUCTION+36, // (default reduction)
  }
,
{ // state 499
0x80000000|1, // match move
0x80000000|230, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 500
22,MIN_REDUCTION+79, // `[
75,MIN_REDUCTION+79, // "["
MIN_REDUCTION+79, // (default reduction)
  }
,
{ // state 501
63,106, // ws
64,27, // " "
65,356, // {10}
MIN_REDUCTION+60, // (default reduction)
  }
,
{ // state 502
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 503
47,18, // "b"
51,48, // "i"
  }
,
{ // state 504
2,126, // ws*
63,158, // ws
64,546, // " "
65,541, // {10}
MIN_REDUCTION+63, // (default reduction)
  }
,
{ // state 505
MIN_REDUCTION+78, // (default reduction)
  }
,
{ // state 506
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 507
0x80000000|1, // match move
0x80000000|115, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 508
7,392, // ID
15,488, // `(
28,543, // <expr>
30,542, // <expr8>
31,104, // <expr7>
32,102, // <expr6>
33,107, // <expr5>
34,580, // <expr4>
36,14, // <expr3>
38,434, // <expr2>
39,220, // <cast expr>
40,43, // <unary expr>
41,507, // <expr1>
42,215, // `-
43,321, // INTLIT
44,337, // letter
45,122, // "p"
46,122, // "v"
47,122, // "b"
48,122, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
49,122, // "t"
50,122, // "c"
51,122, // "i"
52,122, // "l"
53,122, // "o"
54,122, // "u"
55,417, // letter128
56,19, // {199..218 231..250}
57,19, // {193..198 225..230}
59,464, // {"1".."9"}
60,480, // "0"
61,575, // digit128
62,587, // {176..185}
68,100, // "("
72,217, // "-"
  }
,
{ // state 509
22,MIN_REDUCTION+112, // `[
63,58, // ws
64,178, // " "
65,535, // {10}
75,MIN_REDUCTION+112, // "["
MIN_REDUCTION+112, // (default reduction)
  }
,
{ // state 510
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 511
22,MIN_REDUCTION+90, // `[
75,MIN_REDUCTION+90, // "["
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 512
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 513
45,371, // "p"
46,371, // "v"
47,371, // "b"
48,371, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
49,371, // "t"
50,371, // "c"
51,371, // "i"
52,371, // "l"
53,371, // "o"
54,371, // "u"
57,241, // {193..198 225..230}
59,371, // {"1".."9"}
60,371, // "0"
62,241, // {176..185}
82,128, // hexDigit*
83,86, // $$2
88,408, // hexDigit
89,301, // hexDigit128
  }
,
{ // state 514
0x80000000|1, // match move
0x80000000|121, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 515
0x80000000|1, // match move
0x80000000|124, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 516
2,153, // ws*
22,MIN_REDUCTION+109, // `[
63,531, // ws
64,178, // " "
65,535, // {10}
75,MIN_REDUCTION+109, // "["
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 517
22,MIN_REDUCTION+90, // `[
75,MIN_REDUCTION+90, // "["
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 518
MIN_REDUCTION+88, // (default reduction)
  }
,
{ // state 519
7,304, // ID
18,223, // <type>
19,226, // `int
20,260, // `boolean
44,20, // letter
45,122, // "p"
46,122, // "v"
47,122, // "b"
48,122, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
49,122, // "t"
50,122, // "c"
51,122, // "i"
52,122, // "l"
53,122, // "o"
54,122, // "u"
55,576, // letter128
56,324, // {199..218 231..250}
57,324, // {193..198 225..230}
66,503, // "#"
  }
,
{ // state 520
45,371, // "p"
46,371, // "v"
47,371, // "b"
48,371, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
49,371, // "t"
50,371, // "c"
51,371, // "i"
52,371, // "l"
53,371, // "o"
54,371, // "u"
57,243, // {193..198 225..230}
59,371, // {"1".."9"}
60,371, // "0"
62,243, // {176..185}
82,127, // hexDigit*
83,87, // $$2
88,408, // hexDigit
89,296, // hexDigit128
  }
,
{ // state 521
23,134, // `]
76,99, // "]"
  }
,
{ // state 522
MIN_REDUCTION+31, // (default reduction)
  }
,
{ // state 523
0x80000000|342, // match move
0x80000000|291, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 524
23,137, // `]
76,105, // "]"
  }
,
{ // state 525
0x80000000|245, // match move
0x80000000|53, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 526
22,MIN_REDUCTION+107, // `[
75,MIN_REDUCTION+107, // "["
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 527
22,MIN_REDUCTION+78, // `[
75,MIN_REDUCTION+78, // "["
MIN_REDUCTION+78, // (default reduction)
  }
,
{ // state 528
0x80000000|1, // match move
0x80000000|328, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 529
2,339, // ws*
63,111, // ws
64,311, // " "
65,2, // {10}
MIN_REDUCTION+63, // (default reduction)
  }
,
{ // state 530
MIN_REDUCTION+19, // (default reduction)
  }
,
{ // state 531
0x80000000|1, // match move
0x80000000|526, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 532
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 533
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 534
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 535
0x80000000|1, // match move
0x80000000|146, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 536
10,346, // `}
11,344, // <decl in class>
12,210, // <method decl>
13,300, // `public
66,478, // "#"
71,327, // "}"
  }
,
{ // state 537
63,598, // ws
64,31, // " "
65,383, // {10}
MIN_REDUCTION+58, // (default reduction)
  }
,
{ // state 538
63,118, // ws
64,265, // " "
65,154, // {10}
MIN_REDUCTION+54, // (default reduction)
  }
,
{ // state 539
22,MIN_REDUCTION+107, // `[
75,MIN_REDUCTION+107, // "["
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 540
MIN_REDUCTION+31, // (default reduction)
  }
,
{ // state 541
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 542
MIN_REDUCTION+20, // (default reduction)
  }
,
{ // state 543
23,108, // `]
76,148, // "]"
  }
,
{ // state 544
0x80000000|1, // match move
0x80000000|38, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 545
22,MIN_REDUCTION+36, // `[
75,MIN_REDUCTION+36, // "["
MIN_REDUCTION+36, // (default reduction)
  }
,
{ // state 546
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 547
22,MIN_REDUCTION+107, // `[
75,MIN_REDUCTION+107, // "["
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 548
0x80000000|1, // match move
0x80000000|66, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 549
22,MIN_REDUCTION+78, // `[
75,MIN_REDUCTION+78, // "["
MIN_REDUCTION+78, // (default reduction)
  }
,
{ // state 550
0x80000000|1, // match move
0x80000000|298, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 551
22,MIN_REDUCTION+78, // `[
75,MIN_REDUCTION+78, // "["
MIN_REDUCTION+78, // (default reduction)
  }
,
{ // state 552
0x80000000|1, // match move
0x80000000|302, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 553
22,MIN_REDUCTION+79, // `[
75,MIN_REDUCTION+79, // "["
MIN_REDUCTION+79, // (default reduction)
  }
,
{ // state 554
22,MIN_REDUCTION+112, // `[
63,28, // ws
64,160, // " "
65,515, // {10}
75,MIN_REDUCTION+112, // "["
MIN_REDUCTION+112, // (default reduction)
  }
,
{ // state 555
22,MIN_REDUCTION+79, // `[
75,MIN_REDUCTION+79, // "["
MIN_REDUCTION+79, // (default reduction)
  }
,
{ // state 556
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 557
90,MIN_REDUCTION+0, // $
  }
,
{ // state 558
22,MIN_REDUCTION+112, // `[
63,25, // ws
64,156, // " "
65,514, // {10}
75,MIN_REDUCTION+112, // "["
MIN_REDUCTION+112, // (default reduction)
  }
,
{ // state 559
22,MIN_REDUCTION+35, // `[
75,MIN_REDUCTION+35, // "["
MIN_REDUCTION+35, // (default reduction)
  }
,
{ // state 560
0x80000000|1, // match move
0x80000000|610, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 561
MIN_REDUCTION+103, // (default reduction)
  }
,
{ // state 562
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 563
2,228, // ws*
63,12, // ws
64,469, // " "
65,309, // {10}
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 564
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 565
MIN_REDUCTION+102, // (default reduction)
  }
,
{ // state 566
2,431, // ws*
63,12, // ws
64,469, // " "
65,309, // {10}
MIN_REDUCTION+73, // (default reduction)
  }
,
{ // state 567
MIN_REDUCTION+27, // (default reduction)
  }
,
{ // state 568
2,123, // ws*
  }
,
{ // state 569
52,32, // "l"
  }
,
{ // state 570
2,537, // ws*
63,457, // ws
64,31, // " "
65,383, // {10}
MIN_REDUCTION+59, // (default reduction)
  }
,
{ // state 571
MIN_REDUCTION+31, // (default reduction)
  }
,
{ // state 572
2,413, // ws*
63,353, // ws
64,405, // " "
65,295, // {10}
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 573
0x80000000|60, // match move
0x80000000|312, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 574
0x80000000|60, // match move
0x80000000|310, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 575
0x80000000|568, // match move
0x80000000|363, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 576
2,377, // ws*
63,12, // ws
64,469, // " "
65,309, // {10}
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 577
63,73, // ws
64,556, // " "
65,155, // {10}
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 578
22,MIN_REDUCTION+79, // `[
75,MIN_REDUCTION+79, // "["
MIN_REDUCTION+79, // (default reduction)
  }
,
{ // state 579
2,83, // ws*
  }
,
{ // state 580
35,362, // `+
73,214, // "+"
MIN_REDUCTION+24, // (default reduction)
  }
,
{ // state 581
2,76, // ws*
  }
,
{ // state 582
22,MIN_REDUCTION+90, // `[
75,MIN_REDUCTION+90, // "["
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 583
22,MIN_REDUCTION+41, // `[
75,MIN_REDUCTION+41, // "["
MIN_REDUCTION+41, // (default reduction)
  }
,
{ // state 584
15,177, // `(
68,624, // "("
  }
,
{ // state 585
MIN_REDUCTION+16, // (default reduction)
  }
,
{ // state 586
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 587
0x80000000|60, // match move
0x80000000|338, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 588
22,MIN_REDUCTION+84, // `[
75,MIN_REDUCTION+84, // "["
MIN_REDUCTION+84, // (default reduction)
  }
,
{ // state 589
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 590
22,MIN_REDUCTION+84, // `[
75,MIN_REDUCTION+84, // "["
MIN_REDUCTION+84, // (default reduction)
  }
,
{ // state 591
0x80000000|476, // match move
0x80000000|205, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 592
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 593
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
382, // ID
593, // `{
-1, // <decl in class>*
585, // `}
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
519, // `(
-1, // `)
201, // <stmt>*
486, // <type>
163, // `int
361, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
323, // <stmt>
249, // <assign>
-1, // `;
372, // <local var decl>
175, // <expr>
-1, // `=
495, // <expr8>
168, // <expr7>
166, // <expr6>
172, // <expr5>
614, // <expr4>
-1, // `+
75, // <expr3>
-1, // `*
422, // <expr2>
233, // <cast expr>
82, // <unary expr>
548, // <expr1>
273, // `-
293, // INTLIT
65, // letter
122, // "p"
122, // "v"
122, // "b"
122, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
122, // "t"
122, // "c"
122, // "i"
122, // "l"
122, // "o"
122, // "u"
239, // letter128
193, // {199..218 231..250}
193, // {193..198 225..230}
-1, // digit
428, // {"1".."9"}
513, // "0"
386, // digit128
573, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
93, // "#"
-1, // "*"
100, // "("
-1, // ")"
197, // "{"
529, // "}"
217, // "-"
-1, // "+"
-1, // "="
-1, // "["
-1, // "]"
-1, // ";"
-1, // idChar*
-1, // $$0
-1, // digit*
-1, // $$1
-1, // hexDigit*
-1, // $$2
-1, // idChar
-1, // "_"
-1, // idChar128
-1, // {223}
-1, // hexDigit
-1, // hexDigit128
-1, // $
-1, // $NT
  }
,
{ // state 594
0x80000000|1, // match move
0x80000000|613, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 595
MIN_REDUCTION+78, // (default reduction)
  }
,
{ // state 596
2,388, // ws*
63,468, // ws
64,282, // " "
65,199, // {10}
91,MIN_REDUCTION+73, // $NT
  }
,
{ // state 597
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 598
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 599
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 600
2,90, // ws*
63,463, // ws
64,299, // " "
65,35, // {10}
MIN_REDUCTION+53, // (default reduction)
  }
,
{ // state 601
22,MIN_REDUCTION+84, // `[
75,MIN_REDUCTION+84, // "["
MIN_REDUCTION+84, // (default reduction)
  }
,
{ // state 602
7,392, // ID
15,488, // `(
28,524, // <expr>
30,542, // <expr8>
31,104, // <expr7>
32,102, // <expr6>
33,107, // <expr5>
34,580, // <expr4>
36,14, // <expr3>
38,434, // <expr2>
39,220, // <cast expr>
40,43, // <unary expr>
41,507, // <expr1>
42,215, // `-
43,321, // INTLIT
44,337, // letter
45,122, // "p"
46,122, // "v"
47,122, // "b"
48,122, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
49,122, // "t"
50,122, // "c"
51,122, // "i"
52,122, // "l"
53,122, // "o"
54,122, // "u"
55,417, // letter128
56,19, // {199..218 231..250}
57,19, // {193..198 225..230}
59,464, // {"1".."9"}
60,480, // "0"
61,575, // digit128
62,587, // {176..185}
68,100, // "("
72,217, // "-"
  }
,
{ // state 603
63,322, // ws
64,52, // " "
65,352, // {10}
MIN_REDUCTION+44, // (default reduction)
  }
,
{ // state 604
MIN_REDUCTION+1, // (default reduction)
  }
,
{ // state 605
7,392, // ID
15,488, // `(
28,521, // <expr>
30,542, // <expr8>
31,104, // <expr7>
32,102, // <expr6>
33,107, // <expr5>
34,580, // <expr4>
36,14, // <expr3>
38,434, // <expr2>
39,220, // <cast expr>
40,43, // <unary expr>
41,507, // <expr1>
42,215, // `-
43,321, // INTLIT
44,337, // letter
45,122, // "p"
46,122, // "v"
47,122, // "b"
48,122, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
49,122, // "t"
50,122, // "c"
51,122, // "i"
52,122, // "l"
53,122, // "o"
54,122, // "u"
55,417, // letter128
56,19, // {199..218 231..250}
57,19, // {193..198 225..230}
59,464, // {"1".."9"}
60,480, // "0"
61,575, // digit128
62,587, // {176..185}
68,100, // "("
72,217, // "-"
  }
,
{ // state 606
2,98, // ws*
63,12, // ws
64,469, // " "
65,309, // {10}
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 607
63,73, // ws
64,556, // " "
65,155, // {10}
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 608
22,MIN_REDUCTION+72, // `[
63,28, // ws
64,160, // " "
65,515, // {10}
75,MIN_REDUCTION+72, // "["
MIN_REDUCTION+72, // (default reduction)
  }
,
{ // state 609
63,322, // ws
64,52, // " "
65,352, // {10}
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 610
22,MIN_REDUCTION+35, // `[
75,MIN_REDUCTION+35, // "["
MIN_REDUCTION+35, // (default reduction)
  }
,
{ // state 611
35,341, // `+
73,214, // "+"
MIN_REDUCTION+24, // (default reduction)
  }
,
{ // state 612
22,MIN_REDUCTION+72, // `[
63,25, // ws
64,156, // " "
65,514, // {10}
75,MIN_REDUCTION+72, // "["
MIN_REDUCTION+72, // (default reduction)
  }
,
{ // state 613
22,MIN_REDUCTION+35, // `[
75,MIN_REDUCTION+35, // "["
MIN_REDUCTION+35, // (default reduction)
  }
,
{ // state 614
35,343, // `+
73,214, // "+"
MIN_REDUCTION+24, // (default reduction)
  }
,
{ // state 615
MIN_REDUCTION+27, // (default reduction)
  }
,
{ // state 616
MIN_REDUCTION+27, // (default reduction)
  }
,
{ // state 617
58,360, // digit
59,402, // {"1".."9"}
60,402, // "0"
61,398, // digit128
62,574, // {176..185}
81,191, // $$1
  }
,
{ // state 618
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 619
63,502, // ws
64,80, // " "
65,251, // {10}
MIN_REDUCTION+64, // (default reduction)
  }
,
{ // state 620
58,360, // digit
59,402, // {"1".."9"}
60,402, // "0"
61,396, // digit128
62,573, // {176..185}
81,189, // $$1
  }
,
{ // state 621
49,74, // "t"
  }
,
{ // state 622
0x80000000|195, // match move
0x80000000|7, // no-match move
0x80000000|46, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 623
MIN_REDUCTION+86, // (default reduction)
  }
,
{ // state 624
2,452, // ws*
63,378, // ws
64,333, // " "
65,246, // {10}
MIN_REDUCTION+57, // (default reduction)
  }
,
{ // state 625
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 626
53,89, // "o"
  }
,
{ // state 627
23,485, // `]
76,566, // "]"
  }
,
{ // state 628
2,202, // ws*
63,353, // ws
64,405, // " "
65,295, // {10}
MIN_REDUCTION+59, // (default reduction)
  }
,
};
}
public MJGrammarParseTable(MJGrammar actionObj) {
  actionObject = actionObj;
  parseTable = new int[629][];
  int doneSoFar = 0;
  doneSoFar += new Initter1().doInit(doneSoFar);
}
public int[] getProdTable() { return prodTable; }
private static int[] prodTable = {
// $$start ::= <start>
(0<<16)+1,
// <start> ::= ws* <program>
(1<<16)+2,
// <start> ::= <program>
(1<<16)+1,
// <program> ::= <class decl>+
(3<<16)+1,
// <class decl> ::= `class ID `{ <decl in class>* `}
(5<<16)+5,
// <class decl> ::= `class ID `{ `}
(5<<16)+4,
// <decl in class> ::= <method decl>
(11<<16)+1,
// <method decl> ::= `public `void ID `( `) `{ <stmt>* `}
(12<<16)+8,
// <method decl> ::= `public `void ID `( `) `{ `}
(12<<16)+7,
// <type> ::= `int
(18<<16)+1,
// <type> ::= `boolean
(18<<16)+1,
// <type> ::= ID
(18<<16)+1,
// <type> ::= <type> <empty bracket pair>
(18<<16)+2,
// <empty bracket pair> ::= `[ `]
(21<<16)+2,
// <stmt> ::= <assign> `;
(24<<16)+2,
// <stmt> ::= `{ <stmt>* `}
(24<<16)+3,
// <stmt> ::= `{ `}
(24<<16)+2,
// <stmt> ::= <local var decl> `;
(24<<16)+2,
// <assign> ::= <expr> `= <expr>
(25<<16)+3,
// <local var decl> ::= <type> ID `= <expr>
(27<<16)+4,
// <expr> ::= <expr8>
(28<<16)+1,
// <expr8> ::= <expr7>
(30<<16)+1,
// <expr7> ::= <expr6>
(31<<16)+1,
// <expr6> ::= <expr5>
(32<<16)+1,
// <expr5> ::= <expr4>
(33<<16)+1,
// <expr4> ::= <expr4> `+ <expr3>
(34<<16)+3,
// <expr4> ::= <expr3>
(34<<16)+1,
// <expr3> ::= <expr3> `* <expr2>
(36<<16)+3,
// <expr3> ::= <expr2>
(36<<16)+1,
// <expr2> ::= <cast expr>
(38<<16)+1,
// <expr2> ::= <unary expr>
(38<<16)+1,
// <cast expr> ::= `( <type> `) <cast expr>
(39<<16)+4,
// <cast expr> ::= `( <type> `) <expr1>
(39<<16)+4,
// <unary expr> ::= `- <unary expr>
(40<<16)+2,
// <unary expr> ::= <expr1>
(40<<16)+1,
// <expr1> ::= ID
(41<<16)+1,
// <expr1> ::= <expr1> !<empty bracket pair> `[ <expr> `]
(41<<16)+4,
// <expr1> ::= INTLIT
(41<<16)+1,
// letter ::= {"A".."Z" "a".."z"}
(44<<16)+1,
// letter128 ::= {193..218 225..250}
(55<<16)+1,
// digit ::= {"0".."9"}
(58<<16)+1,
// digit128 ::= {176..185}
(61<<16)+1,
// ws ::= " "
(63<<16)+1,
// ws ::= {10}
(63<<16)+1,
// `boolean ::= "#" "b" "o" ws*
(20<<16)+4,
// `boolean ::= "#" "b" "o"
(20<<16)+3,
// `class ::= "#" "c" "l" ws*
(6<<16)+4,
// `class ::= "#" "c" "l"
(6<<16)+3,
// `void ::= "#" "v" "o" ws*
(14<<16)+4,
// `void ::= "#" "v" "o"
(14<<16)+3,
// `int ::= "#" "i" "t" ws*
(19<<16)+4,
// `int ::= "#" "i" "t"
(19<<16)+3,
// `public ::= "#" "p" "u" ws*
(13<<16)+4,
// `public ::= "#" "p" "u"
(13<<16)+3,
// `* ::= "*" ws*
(37<<16)+2,
// `* ::= "*"
(37<<16)+1,
// `( ::= "(" ws*
(15<<16)+2,
// `( ::= "("
(15<<16)+1,
// `) ::= ")" ws*
(16<<16)+2,
// `) ::= ")"
(16<<16)+1,
// `{ ::= "{" ws*
(8<<16)+2,
// `{ ::= "{"
(8<<16)+1,
// `} ::= "}" ws*
(10<<16)+2,
// `} ::= "}"
(10<<16)+1,
// `- ::= "-" ws*
(42<<16)+2,
// `- ::= "-"
(42<<16)+1,
// `+ ::= "+" ws*
(35<<16)+2,
// `+ ::= "+"
(35<<16)+1,
// `= ::= "=" ws*
(29<<16)+2,
// `= ::= "="
(29<<16)+1,
// `[ ::= "[" ws*
(22<<16)+2,
// `[ ::= "["
(22<<16)+1,
// `] ::= "]" ws*
(23<<16)+2,
// `] ::= "]"
(23<<16)+1,
// `; ::= ";" ws*
(26<<16)+2,
// `; ::= ";"
(26<<16)+1,
// ID ::= letter128 ws*
(7<<16)+2,
// ID ::= letter128
(7<<16)+1,
// ID ::= letter idChar* $$0
(7<<16)+3,
// ID ::= letter $$0
(7<<16)+2,
// INTLIT ::= {"1".."9"} digit* $$1
(43<<16)+3,
// INTLIT ::= {"1".."9"} $$1
(43<<16)+2,
// INTLIT ::= digit128 ws*
(43<<16)+2,
// INTLIT ::= digit128
(43<<16)+1,
// INTLIT ::= "0" hexDigit* $$2
(43<<16)+3,
// INTLIT ::= "0" $$2
(43<<16)+2,
// idChar ::= letter
(84<<16)+1,
// idChar ::= digit
(84<<16)+1,
// idChar ::= "_"
(84<<16)+1,
// idChar128 ::= letter128
(86<<16)+1,
// idChar128 ::= digit128
(86<<16)+1,
// idChar128 ::= {223}
(86<<16)+1,
// hexDigit ::= {"0".."9" "A".."Z" "a".."z"}
(88<<16)+1,
// hexDigit128 ::= {176..185 193..198 225..230}
(89<<16)+1,
// digit* ::= digit* digit
(80<<16)+2,
// digit* ::= digit
(80<<16)+1,
// <decl in class>* ::= <decl in class>* <decl in class>
(9<<16)+2,
// <decl in class>* ::= <decl in class>
(9<<16)+1,
// hexDigit* ::= hexDigit* hexDigit
(82<<16)+2,
// hexDigit* ::= hexDigit
(82<<16)+1,
// <stmt>* ::= <stmt>* <stmt>
(17<<16)+2,
// <stmt>* ::= <stmt>
(17<<16)+1,
// idChar* ::= idChar* idChar
(78<<16)+2,
// idChar* ::= idChar
(78<<16)+1,
// <class decl>+ ::= <class decl>
(4<<16)+1,
// <class decl>+ ::= <class decl>+ <class decl>
(4<<16)+2,
// ws* ::= ws* ws
(2<<16)+2,
// ws* ::= ws
(2<<16)+1,
// $$0 ::= idChar128 ws*
(79<<16)+2,
// $$0 ::= idChar128
(79<<16)+1,
// $$1 ::= digit128 ws*
(81<<16)+2,
// $$1 ::= digit128
(81<<16)+1,
// $$2 ::= hexDigit128 ws*
(83<<16)+2,
// $$2 ::= hexDigit128
(83<<16)+1,
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
-1, // 9
65, // 10
-1, // 11
-1, // 12
-1, // 13
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
64, // " "
-1, // "!"
-1, // '"'
66, // "#"
-1, // "$"
-1, // "%"
-1, // "&"
-1, // "'"
68, // "("
69, // ")"
67, // "*"
73, // "+"
-1, // ","
72, // "-"
-1, // "."
-1, // "/"
60, // "0"
59, // "1"
59, // "2"
59, // "3"
59, // "4"
59, // "5"
59, // "6"
59, // "7"
59, // "8"
59, // "9"
-1, // ":"
77, // ";"
-1, // "<"
74, // "="
-1, // ">"
-1, // "?"
-1, // "@"
48, // "A"
48, // "B"
48, // "C"
48, // "D"
48, // "E"
48, // "F"
48, // "G"
48, // "H"
48, // "I"
48, // "J"
48, // "K"
48, // "L"
48, // "M"
48, // "N"
48, // "O"
48, // "P"
48, // "Q"
48, // "R"
48, // "S"
48, // "T"
48, // "U"
48, // "V"
48, // "W"
48, // "X"
48, // "Y"
48, // "Z"
75, // "["
-1, // "\"
76, // "]"
-1, // "^"
85, // "_"
-1, // "`"
48, // "a"
47, // "b"
50, // "c"
48, // "d"
48, // "e"
48, // "f"
48, // "g"
48, // "h"
51, // "i"
48, // "j"
48, // "k"
52, // "l"
48, // "m"
48, // "n"
53, // "o"
45, // "p"
48, // "q"
48, // "r"
48, // "s"
49, // "t"
54, // "u"
46, // "v"
48, // "w"
48, // "x"
48, // "y"
48, // "z"
70, // "{"
-1, // "|"
71, // "}"
-1, // "~"
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
62, // 176
62, // 177
62, // 178
62, // 179
62, // 180
62, // 181
62, // 182
62, // 183
62, // 184
62, // 185
-1, // 186
-1, // 187
-1, // 188
-1, // 189
-1, // 190
-1, // 191
-1, // 192
57, // 193
57, // 194
57, // 195
57, // 196
57, // 197
57, // 198
56, // 199
56, // 200
56, // 201
56, // 202
56, // 203
56, // 204
56, // 205
56, // 206
56, // 207
56, // 208
56, // 209
56, // 210
56, // 211
56, // 212
56, // 213
56, // 214
56, // 215
56, // 216
56, // 217
56, // 218
-1, // 219
-1, // 220
-1, // 221
-1, // 222
87, // 223
-1, // 224
57, // 225
57, // 226
57, // 227
57, // 228
57, // 229
57, // 230
56, // 231
56, // 232
56, // 233
56, // 234
56, // 235
56, // 236
56, // 237
56, // 238
56, // 239
56, // 240
56, // 241
56, // 242
56, // 243
56, // 244
56, // 245
56, // 246
56, // 247
56, // 248
56, // 249
56, // 250
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
"digit* ::= digit* digit", // 94
"digit* ::= digit* digit", // 95
"<decl in class>* ::= <decl in class>* <decl in class>", // 96
"<decl in class>* ::= <decl in class>* <decl in class>", // 97
"hexDigit* ::= hexDigit* hexDigit", // 98
"hexDigit* ::= hexDigit* hexDigit", // 99
"<stmt>* ::= <stmt>* <stmt>", // 100
"<stmt>* ::= <stmt>* <stmt>", // 101
"idChar* ::= idChar* idChar", // 102
"idChar* ::= idChar* idChar", // 103
"<class decl>+ ::= <class decl>", // 104
"<class decl>+ ::= <class decl>+ <class decl>", // 105
"ws* ::= ws* ws", // 106
"ws* ::= ws* ws", // 107
"", // 108
"", // 109
"", // 110
"", // 111
"", // 112
"", // 113
};
public int[][] getActionTable() { return actionTable; }
private int[][] actionTable = {
    { // 0: $$start ::= <start> @pass
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 1: <start> ::= ws* <program> @topLevel(Program)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((0<<5)|0x5)/*methodCall:0*/,
    },
    { // 2: <start> ::= [ws*] <program> @topLevel(Program)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((0<<5)|0x5)/*methodCall:0*/,
    },
    { // 3: <program> ::= [#] <class decl>+ @createProgram(int,List<ClassDecl>)=>Program
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0x5)/*methodCall:1*/,
    },
    { // 4: <class decl> ::= `class [#] ID `{ <decl in class>* `} @createClassDecl(int,String,List<Decl>)=>ClassDecl
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((2<<5)|0x5)/*methodCall:2*/,
    },
    { // 5: <class decl> ::= `class [#] ID `{ [<decl in class>*] `} @createClassDecl(int,String,List<Decl>)=>ClassDecl
      ((1<<5)|0xe)/*popPos:1*/,
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((2<<5)|0x5)/*methodCall:2*/,
    },
    { // 6: <decl in class> ::= <method decl> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 7: <method decl> ::= `public `void [#] ID `( `) `{ <stmt>* `} @createMethodDeclVoid(int,String,List<Stmt>)=>Decl
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((3<<5)|0x5)/*methodCall:3*/,
    },
    { // 8: <method decl> ::= `public `void [#] ID `( `) `{ [<stmt>*] `} @createMethodDeclVoid(int,String,List<Stmt>)=>Decl
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((3<<5)|0x5)/*methodCall:3*/,
    },
    { // 9: <type> ::= [#] `int @intType(int)=>Type
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((4<<5)|0x5)/*methodCall:4*/,
    },
    { // 10: <type> ::= [#] `boolean @booleanType(int)=>Type
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((5<<5)|0x5)/*methodCall:5*/,
    },
    { // 11: <type> ::= [#] ID @idType(int,String)=>Type
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((6<<5)|0x5)/*methodCall:6*/,
    },
    { // 12: <type> ::= [#] <type> <empty bracket pair> @newArrayType(int,Type,Object)=>Type
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((7<<5)|0x5)/*methodCall:7*/,
    },
    { // 13: <empty bracket pair> ::= `[ `] @null
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x8)/*nullPointer:1*/,
    },
    { // 14: <stmt> ::= <assign> `; @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 15: <stmt> ::= [#] `{ <stmt>* `} @newBlock(int,List<Stmt>)=>Stmt
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((8<<5)|0x5)/*methodCall:8*/,
    },
    { // 16: <stmt> ::= [#] `{ [<stmt>*] `} @newBlock(int,List<Stmt>)=>Stmt
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((8<<5)|0x5)/*methodCall:8*/,
    },
    { // 17: <stmt> ::= <local var decl> `; @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 18: <assign> ::= <expr> [#] `= <expr> @assign(Exp,int,Exp)=>Stmt
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x5)/*methodCall:9*/,
    },
    { // 19: <local var decl> ::= <type> [#] ID `= <expr> @localVarDecl(Type,int,String,Exp)=>Stmt
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((10<<5)|0x5)/*methodCall:10*/,
    },
    { // 20: <expr> ::= <expr8> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 21: <expr8> ::= <expr7> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 22: <expr7> ::= <expr6> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 23: <expr6> ::= <expr5> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 24: <expr5> ::= <expr4> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 25: <expr4> ::= <expr4> [#] `+ <expr3> @newPlus(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((11<<5)|0x5)/*methodCall:11*/,
    },
    { // 26: <expr4> ::= <expr3> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 27: <expr3> ::= <expr3> [#] `* <expr2> @newTimes(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((12<<5)|0x5)/*methodCall:12*/,
    },
    { // 28: <expr3> ::= <expr2> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 29: <expr2> ::= <cast expr> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 30: <expr2> ::= <unary expr> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 31: <cast expr> ::= [#] `( <type> `) <cast expr> @newCast(int,Type,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((13<<5)|0x5)/*methodCall:13*/,
    },
    { // 32: <cast expr> ::= [#] `( <type> `) <expr1> @newCast(int,Type,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((13<<5)|0x5)/*methodCall:13*/,
    },
    { // 33: <unary expr> ::= [#] `- <unary expr> @newUnaryMinus(int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((14<<5)|0x5)/*methodCall:14*/,
    },
    { // 34: <unary expr> ::= <expr1> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 35: <expr1> ::= [#] ID @newIDExp(int,String)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((15<<5)|0x5)/*methodCall:15*/,
    },
    { // 36: <expr1> ::= <expr1> !<empty bracket pair> [#] `[ <expr> `] @newArrayLookup(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((16<<5)|0x5)/*methodCall:16*/,
    },
    { // 37: <expr1> ::= [#] INTLIT @newIntLit(int,int)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((17<<5)|0x5)/*methodCall:17*/,
    },
    { // 38: letter ::= {"A".."Z" "a".."z"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 39: letter128 ::= {193..218 225..250} @sub128(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((18<<5)|0x5)/*methodCall:18*/,
    },
    { // 40: digit ::= {"0".."9"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 41: digit128 ::= {176..185} @sub128(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((18<<5)|0x5)/*methodCall:18*/,
    },
    { // 42: ws ::= " " @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 43: ws ::= {10} [registerNewline] @void
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 44: `boolean ::= "#" "b" "o" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 45: `boolean ::= "#" "b" "o" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 46: `class ::= "#" "c" "l" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 47: `class ::= "#" "c" "l" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 48: `void ::= "#" "v" "o" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 49: `void ::= "#" "v" "o" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 50: `int ::= "#" "i" "t" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 51: `int ::= "#" "i" "t" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 52: `public ::= "#" "p" "u" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 53: `public ::= "#" "p" "u" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 54: `* ::= "*" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 55: `* ::= "*" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 56: `( ::= "(" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 57: `( ::= "(" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 58: `) ::= ")" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 59: `) ::= ")" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 60: `{ ::= "{" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 61: `{ ::= "{" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 62: `} ::= "}" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 63: `} ::= "}" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 64: `- ::= "-" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 65: `- ::= "-" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 66: `+ ::= "+" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 67: `+ ::= "+" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 68: `= ::= "=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 69: `= ::= "=" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 70: `[ ::= "[" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 71: `[ ::= "[" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 72: `] ::= "]" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 73: `] ::= "]" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 74: `; ::= ";" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 75: `; ::= ";" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 76: ID ::= letter128 ws* @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x4)/*stringConcat:1*/,
    },
    { // 77: ID ::= letter128 [ws*] @text
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x4)/*stringConcat:1*/,
    },
    { // 78: ID ::= letter idChar* $$0 @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x4)/*stringConcat:3*/,
    },
    { // 79: ID ::= letter [idChar*] $$0 @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x4)/*stringConcat:3*/,
    },
    { // 80: INTLIT ::= {"1".."9"} digit* $$1 @convertToInt(char,List<Character>,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((19<<5)|0x5)/*methodCall:19*/,
    },
    { // 81: INTLIT ::= {"1".."9"} [digit*] $$1 @convertToInt(char,List<Character>,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((19<<5)|0x5)/*methodCall:19*/,
    },
    { // 82: INTLIT ::= digit128 ws* @convertToInt(char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((20<<5)|0x5)/*methodCall:20*/,
    },
    { // 83: INTLIT ::= digit128 [ws*] @convertToInt(char)=>int
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((20<<5)|0x5)/*methodCall:20*/,
    },
    { // 84: INTLIT ::= "0" hexDigit* $$2 @convert16ToInt(char,List<Character>,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((21<<5)|0x5)/*methodCall:21*/,
    },
    { // 85: INTLIT ::= "0" [hexDigit*] $$2 @convert16ToInt(char,List<Character>,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((0<<5)|0x6)/*nullProductionAction:0*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((21<<5)|0x5)/*methodCall:21*/,
    },
    { // 86: idChar ::= letter @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 87: idChar ::= digit @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 88: idChar ::= "_" @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 89: idChar128 ::= letter128 @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 90: idChar128 ::= digit128 @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 91: idChar128 ::= {223} @underscore(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((22<<5)|0x5)/*methodCall:22*/,
    },
    { // 92: hexDigit ::= {"0".."9" "A".."Z" "a".."z"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 93: hexDigit128 ::= {176..185 193..198 225..230} @sub128(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((18<<5)|0x5)/*methodCall:18*/,
    },
    { // 94: digit* ::= digit* digit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 95: digit* ::= [digit*] digit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 96: <decl in class>* ::= <decl in class>* <decl in class> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 97: <decl in class>* ::= [<decl in class>*] <decl in class> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 98: hexDigit* ::= hexDigit* hexDigit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 99: hexDigit* ::= [hexDigit*] hexDigit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((0<<5)|0x6)/*nullProductionAction:0*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 100: <stmt>* ::= <stmt>* <stmt> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 101: <stmt>* ::= [<stmt>*] <stmt> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 102: idChar* ::= idChar* idChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 103: idChar* ::= [idChar*] idChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 104: <class decl>+ ::= <class decl> @singleList
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xa)/*singleList:1*/,
    },
    { // 105: <class decl>+ ::= <class decl>+ <class decl> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 106: ws* ::= ws* ws @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 107: ws* ::= [ws*] ws @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((3<<5)|0x6)/*nullProductionAction:3*/,
    },
    { // 108: $$0 ::= idChar128 ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 109: $$0 ::= idChar128 [ws*] @pass
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 110: $$1 ::= digit128 ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 111: $$1 ::= digit128 [ws*] @pass
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 112: $$2 ::= hexDigit128 ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 113: $$2 ::= hexDigit128 [ws*] @pass
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
};
public String[] getNullProdNameTable() { return nullProdNameTable; }
private String[] nullProdNameTable = {
    "hexDigit* ::=", // hexDigit*
    "<stmt>* ::=", // <stmt>*
    "<decl in class>* ::=", // <decl in class>*
    "ws* ::=", // ws*
    "idChar* ::=", // idChar*
    "digit* ::=", // digit*
    "# ::=", // #
    "", // registerNewline
};
public int[][] getNullProductionActionTable() { return nullActionTable; }
private int[][] nullActionTable = {
    { // hexDigit*
      ((1<<5)|0x9)/*emptyList:1*/,
    },
    { // <stmt>*
      ((1<<5)|0x9)/*emptyList:1*/,
    },
    { // <decl in class>*
      ((1<<5)|0x9)/*emptyList:1*/,
    },
    { // ws*
    },
    { // idChar*
      ((1<<5)|0x9)/*emptyList:1*/,
    },
    { // digit*
      ((1<<5)|0x9)/*emptyList:1*/,
    },
    { // #
      7/*duplicateTop*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // registerNewline
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((23<<5)|0x5)/*methodCall:23*/,
    },
};
public void actionCall(int idx, wrangLR.runtime.SemanticInfo si) {
  switch(idx) {
    default: System.err.println("Internal error--illegal action number: "+idx);break;
    case 0: {
      Program parm0 = (Program)si.popPb();
      actionObject.topLevel(parm0);
    }
    break;
    case 1: {
      int parm0 = (Integer)si.popPb();
      List<ClassDecl> parm1 = (List<ClassDecl>)si.popPb();
      Program result = actionObject.createProgram(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 2: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      List<Decl> parm2 = (List<Decl>)si.popPb();
      ClassDecl result = actionObject.createClassDecl(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 3: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      List<Stmt> parm2 = (List<Stmt>)si.popPb();
      Decl result = actionObject.createMethodDeclVoid(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 4: {
      int parm0 = (Integer)si.popPb();
      Type result = actionObject.intType(parm0);
      si.pushPb(result);
    }
    break;
    case 5: {
      int parm0 = (Integer)si.popPb();
      Type result = actionObject.booleanType(parm0);
      si.pushPb(result);
    }
    break;
    case 6: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      Type result = actionObject.idType(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 7: {
      int parm0 = (Integer)si.popPb();
      Type parm1 = (Type)si.popPb();
      Object parm2 = (Object)si.popPb();
      Type result = actionObject.newArrayType(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 8: {
      int parm0 = (Integer)si.popPb();
      List<Stmt> parm1 = (List<Stmt>)si.popPb();
      Stmt result = actionObject.newBlock(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 9: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Stmt result = actionObject.assign(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 10: {
      Type parm0 = (Type)si.popPb();
      int parm1 = (Integer)si.popPb();
      String parm2 = (String)si.popPb();
      Exp parm3 = (Exp)si.popPb();
      Stmt result = actionObject.localVarDecl(parm0,parm1,parm2,parm3);
      si.pushPb(result);
    }
    break;
    case 11: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newPlus(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 12: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newTimes(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 13: {
      int parm0 = (Integer)si.popPb();
      Type parm1 = (Type)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newCast(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 14: {
      int parm0 = (Integer)si.popPb();
      Exp parm1 = (Exp)si.popPb();
      Exp result = actionObject.newUnaryMinus(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 15: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      Exp result = actionObject.newIDExp(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 16: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newArrayLookup(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 17: {
      int parm0 = (Integer)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp result = actionObject.newIntLit(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 18: {
      char parm0 = (Character)si.popPb();
      char result = actionObject.sub128(parm0);
      si.pushPb(result);
    }
    break;
    case 19: {
      char parm0 = (Character)si.popPb();
      List<Character> parm1 = (List<Character>)si.popPb();
      char parm2 = (Character)si.popPb();
      int result = actionObject.convertToInt(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 20: {
      char parm0 = (Character)si.popPb();
      int result = actionObject.convertToInt(parm0);
      si.pushPb(result);
    }
    break;
    case 21: {
      char parm0 = (Character)si.popPb();
      List<Character> parm1 = (List<Character>)si.popPb();
      char parm2 = (Character)si.popPb();
      int result = actionObject.convert16ToInt(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 22: {
      char parm0 = (Character)si.popPb();
      char result = actionObject.underscore(parm0);
      si.pushPb(result);
    }
    break;
    case 23: {
      int parm0 = (Integer)si.popPb();
      actionObject.registerNewline(parm0);
    }
    break;
  }
}
private String[] saNameSigTable = {
"void topLevel(Program)",
"Program createProgram(int,List<ClassDecl>)",
"ClassDecl createClassDecl(int,String,List<Decl>)",
"Decl createMethodDeclVoid(int,String,List<Stmt>)",
"Type intType(int)",
"Type booleanType(int)",
"Type idType(int,String)",
"Type newArrayType(int,Type,Object)",
"Stmt newBlock(int,List<Stmt>)",
"Stmt assign(Exp,int,Exp)",
"Stmt localVarDecl(Type,int,String,Exp)",
"Exp newPlus(Exp,int,Exp)",
"Exp newTimes(Exp,int,Exp)",
"Exp newCast(int,Type,Exp)",
"Exp newUnaryMinus(int,Exp)",
"Exp newIDExp(int,String)",
"Exp newArrayLookup(Exp,int,Exp)",
"Exp newIntLit(int,int)",
"char sub128(char)",
"int convertToInt(char,List<Character>,char)",
"int convertToInt(char)",
"int convert16ToInt(char,List<Character>,char)",
"char underscore(char)",
"void registerNewline(int)",
};
public String[] getSaNameSigTable() {
  return saNameSigTable;
}
private int[] sigCountTable = {
1,0,
2,1,
3,1,
3,1,
1,1,
1,1,
2,1,
3,1,
2,1,
3,1,
4,1,
3,1,
3,1,
3,1,
2,1,
2,1,
3,1,
2,1,
1,1,
3,1,
1,1,
3,1,
1,1,
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
    1,
    1,
    1,
    0,
    1,
    0,
    1,
    0,
    1,
    1,
    0,
    0,
    0,
    0,
    1,
    1,
    0,
    0,
    1,
    0,
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
    1,
    1,
    0,
    1,
    0,
    1,
    1,
    1,
    1,
    0,
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
    1,
    -1,
    -1,
    1,
    -1,
    -1,
    1,
    -1,
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
    1,
    1,
    1,
    1,
    1,
    1,
    1,
    -1,
    1,
    -1,
    1,
    1,
    -1,
    -1,
};
public Object vectorToTuple(java.util.ArrayList<Object> vec) {
  switch (vec.size()) {
  }
  System.err.println("Internal error--illegal Tuple size: "+vec.size());
  return null;
}
}
