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
public int getEofSym() { return 113; }
public int getNttSym() { return 114; }
private String[] symNameTable = {
"$$start",
"<start>",
"ws*",
"<program>",
"<class decl>+",
"<extends ID>",
"`extends",
"ID",
"<class decl>",
"`class",
"<extends ID>?",
"$$0",
"<decl in class>",
"<field decl>",
"<method decl>",
"`public",
"`void",
"`(",
"<paramList>?",
"$$1",
"<type>",
"$$2",
"<param>",
"<extra param>",
"`,",
"<paramList>",
"<extra param>*",
"`int",
"`boolean",
"<empty bracket pair>",
"`[",
"`]",
"<stmt>",
"<assign>",
"`;",
"`{",
"<stmt>*",
"`}",
"<local var decl>",
"`if",
"<expr>",
"`)",
"`else",
"`while",
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
"{\"A\"..\"Z\" \"a\" \"d\" \"f\"..\"g\" \"j\"..\"k\" \"m\"..\"n\" \"q\" \"s\" \"y\"..\"z\"}",
"\"c\"",
"\"i\"",
"\"l\"",
"\"o\"",
"\"r\"",
"\"u\"",
"\"x\"",
"\"b\"",
"\"e\"",
"\"h\"",
"\"t\"",
"\"w\"",
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
"\"+\"",
"`return",
"\"*\"",
"\"(\"",
"\")\"",
"\"{\"",
"\"}\"",
"\"-\"",
"\"=\"",
"\"[\"",
"\"]\"",
"\",\"",
"\";\"",
"idChar*",
"$$3",
"digit*",
"$$4",
"hexDigit*",
"$$5",
"idChar",
"\"_\"",
"idChar128",
"223",
"hexDigit",
"hexDigit128",
"<decl in class>*",
"$",
"$NT",
};
public String symName(int n) {
 return n >= 0 && n < symNameTable.length ? symNameTable[n] : "??";
}
private MJGrammar actionObject;
public int[][] getParseTable() { return parseTable; }
public int numSymbols() { return 115;}
private static final int MIN_REDUCTION = 1150;
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
1,479, // <start>
2,739, // ws*
3,239, // <program>
4,53, // <class decl>+
8,950, // <class decl>
9,707, // `class
83,644, // ws
84,693, // " "
85,397, // {10}
86,9, // "#"
  }
,
{ // state 1
  }
,
{ // state 2
59,546, // letter
60,55, // "p"
61,55, // "v"
62,55, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q" "s" "y".."z"}
63,55, // "c"
64,55, // "i"
65,55, // "l"
66,55, // "o"
67,55, // "r"
68,55, // "u"
69,55, // "x"
70,55, // "b"
71,55, // "e"
72,55, // "h"
73,55, // "t"
74,55, // "w"
75,1033, // letter128
76,570, // {199..218 231..250}
77,570, // {193..198 225..230}
78,219, // digit
79,185, // {"1".."9"}
80,185, // "0"
81,640, // digit128
82,1120, // {176..185}
101,919, // $$3
106,1096, // idChar
107,1077, // "_"
108,1117, // idChar128
109,791, // {223}
  }
,
{ // state 3
17,706, // `(
90,785, // "("
  }
,
{ // state 4
0x80000000|1, // match move
0x80000000|511, // no-match move
0x80000000|36, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 5
0x80000000|1, // match move
0x80000000|868, // no-match move
0x80000000|36, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 6
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 7
2,788, // ws*
MIN_REDUCTION+99, // (default reduction)
  }
,
{ // state 8
0x80000000|69, // match move
0x80000000|605, // no-match move
0x80000000|36, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 9
63,336, // "c"
  }
,
{ // state 10
MIN_REDUCTION+17, // (default reduction)
  }
,
{ // state 11
2,802, // ws*
30,MIN_REDUCTION+145, // `[
83,75, // ws
84,137, // " "
85,543, // {10}
96,MIN_REDUCTION+145, // "["
MIN_REDUCTION+145, // (default reduction)
  }
,
{ // state 12
2,199, // ws*
83,1027, // ws
84,1095, // " "
85,844, // {10}
MIN_REDUCTION+99, // (default reduction)
  }
,
{ // state 13
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 14
MIN_REDUCTION+120, // (default reduction)
  }
,
{ // state 15
MIN_REDUCTION+120, // (default reduction)
  }
,
{ // state 16
7,19, // ID
18,142, // <paramList>?
19,241, // $$1
20,500, // <type>
22,262, // <param>
25,413, // <paramList>
27,10, // `int
28,171, // `boolean
41,252, // `)
59,779, // letter
60,677, // "p"
61,677, // "v"
62,677, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q" "s" "y".."z"}
63,677, // "c"
64,677, // "i"
65,677, // "l"
66,677, // "o"
67,677, // "r"
68,677, // "u"
69,677, // "x"
70,677, // "b"
71,677, // "e"
72,677, // "h"
73,677, // "t"
74,677, // "w"
75,518, // letter128
76,1069, // {199..218 231..250}
77,1069, // {193..198 225..230}
86,442, // "#"
91,344, // ")"
  }
,
{ // state 17
2,1143, // ws*
83,1130, // ws
84,57, // " "
85,740, // {10}
MIN_REDUCTION+87, // (default reduction)
  }
,
{ // state 18
34,301, // `;
99,923, // ";"
  }
,
{ // state 19
MIN_REDUCTION+19, // (default reduction)
  }
,
{ // state 20
0x80000000|1, // match move
0x80000000|917, // no-match move
0x80000000|36, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 21
7,19, // ID
12,293, // <decl in class>
13,811, // <field decl>
14,161, // <method decl>
15,271, // `public
20,556, // <type>
27,10, // `int
28,171, // `boolean
37,856, // `}
59,779, // letter
60,677, // "p"
61,677, // "v"
62,677, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q" "s" "y".."z"}
63,677, // "c"
64,677, // "i"
65,677, // "l"
66,677, // "o"
67,677, // "r"
68,677, // "u"
69,677, // "x"
70,677, // "b"
71,677, // "e"
72,677, // "h"
73,677, // "t"
74,677, // "w"
75,518, // letter128
76,1069, // {199..218 231..250}
77,1069, // {193..198 225..230}
86,39, // "#"
93,398, // "}"
  }
,
{ // state 22
17,532, // `(
90,785, // "("
  }
,
{ // state 23
83,MIN_REDUCTION+135, // ws
84,MIN_REDUCTION+135, // " "
85,MIN_REDUCTION+135, // {10}
MIN_REDUCTION+135, // (default reduction)
  }
,
{ // state 24
0x80000000|1147, // match move
0x80000000|804, // no-match move
0x80000000|85, // NT-test-match state for `else
  }
,
{ // state 25
0x80000000|1, // match move
0x80000000|1127, // no-match move
0x80000000|36, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 26
MIN_REDUCTION+134, // (default reduction)
  }
,
{ // state 27
0x80000000|1, // match move
0x80000000|854, // no-match move
0x80000000|36, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 28
0x80000000|396, // match move
0x80000000|490, // no-match move
0x80000000|85, // NT-test-match state for `else
  }
,
{ // state 29
0x80000000|1, // match move
0x80000000|857, // no-match move
0x80000000|36, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 30
0x80000000|173, // match move
0x80000000|437, // no-match move
0x80000000|85, // NT-test-match state for `else
  }
,
{ // state 31
2,563, // ws*
MIN_REDUCTION+85, // (default reduction)
  }
,
{ // state 32
MIN_REDUCTION+55, // (default reduction)
  }
,
{ // state 33
83,433, // ws
84,817, // " "
85,1052, // {10}
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 34
0x80000000|1, // match move
0x80000000|853, // no-match move
0x80000000|36, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 35
MIN_REDUCTION+114, // (default reduction)
  }
,
{ // state 36
30,972, // `[
96,931, // "["
  }
,
{ // state 37
2,762, // ws*
30,MIN_REDUCTION+145, // `[
83,63, // ws
84,113, // " "
85,25, // {10}
96,MIN_REDUCTION+145, // "["
MIN_REDUCTION+145, // (default reduction)
  }
,
{ // state 38
83,766, // ws
84,688, // " "
85,30, // {10}
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 39
60,1047, // "p"
64,132, // "i"
70,121, // "b"
  }
,
{ // state 40
MIN_REDUCTION+28, // (default reduction)
  }
,
{ // state 41
2,758, // ws*
30,MIN_REDUCTION+145, // `[
83,60, // ws
84,110, // " "
85,523, // {10}
96,MIN_REDUCTION+145, // "["
MIN_REDUCTION+145, // (default reduction)
  }
,
{ // state 42
0x80000000|1, // match move
0x80000000|830, // no-match move
0x80000000|36, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 43
31,611, // `]
97,993, // "]"
  }
,
{ // state 44
0x80000000|1088, // match move
0x80000000|760, // no-match move
0x80000000|85, // NT-test-match state for `else
  }
,
{ // state 45
59,546, // letter
60,55, // "p"
61,55, // "v"
62,55, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q" "s" "y".."z"}
63,55, // "c"
64,55, // "i"
65,55, // "l"
66,55, // "o"
67,55, // "r"
68,55, // "u"
69,55, // "x"
70,55, // "b"
71,55, // "e"
72,55, // "h"
73,55, // "t"
74,55, // "w"
75,916, // letter128
76,613, // {199..218 231..250}
77,613, // {193..198 225..230}
78,219, // digit
79,185, // {"1".."9"}
80,185, // "0"
81,650, // digit128
82,1101, // {176..185}
101,893, // $$3
106,1096, // idChar
107,1077, // "_"
108,888, // idChar128
109,685, // {223}
  }
,
{ // state 46
0x80000000|1, // match move
0x80000000|536, // no-match move
0x80000000|36, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 47
17,697, // `(
90,785, // "("
  }
,
{ // state 48
0x80000000|1, // match move
0x80000000|540, // no-match move
0x80000000|36, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 49
MIN_REDUCTION+134, // (default reduction)
  }
,
{ // state 50
83,1082, // ws
84,870, // " "
85,486, // {10}
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 51
MIN_REDUCTION+22, // (default reduction)
  }
,
{ // state 52
59,546, // letter
60,55, // "p"
61,55, // "v"
62,55, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q" "s" "y".."z"}
63,55, // "c"
64,55, // "i"
65,55, // "l"
66,55, // "o"
67,55, // "r"
68,55, // "u"
69,55, // "x"
70,55, // "b"
71,55, // "e"
72,55, // "h"
73,55, // "t"
74,55, // "w"
75,903, // letter128
76,599, // {199..218 231..250}
77,599, // {193..198 225..230}
78,219, // digit
79,185, // {"1".."9"}
80,185, // "0"
81,669, // digit128
82,1107, // {176..185}
101,900, // $$3
106,1096, // idChar
107,1077, // "_"
108,956, // idChar128
109,668, // {223}
  }
,
{ // state 53
8,165, // <class decl>
9,707, // `class
86,9, // "#"
MIN_REDUCTION+3, // (default reduction)
  }
,
{ // state 54
59,546, // letter
60,55, // "p"
61,55, // "v"
62,55, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q" "s" "y".."z"}
63,55, // "c"
64,55, // "i"
65,55, // "l"
66,55, // "o"
67,55, // "r"
68,55, // "u"
69,55, // "x"
70,55, // "b"
71,55, // "e"
72,55, // "h"
73,55, // "t"
74,55, // "w"
75,909, // letter128
76,595, // {199..218 231..250}
77,595, // {193..198 225..230}
78,219, // digit
79,185, // {"1".."9"}
80,185, // "0"
81,664, // digit128
82,1108, // {176..185}
101,906, // $$3
106,1096, // idChar
107,1077, // "_"
108,948, // idChar128
109,663, // {223}
  }
,
{ // state 55
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 56
MIN_REDUCTION+20, // (default reduction)
  }
,
{ // state 57
MIN_REDUCTION+54, // (default reduction)
  }
,
{ // state 58
0x80000000|709, // match move
0x80000000|331, // no-match move
0x80000000|36, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 59
83,665, // ws
84,1039, // " "
85,88, // {10}
MIN_REDUCTION+142, // (default reduction)
  }
,
{ // state 60
0x80000000|1, // match move
0x80000000|569, // no-match move
0x80000000|36, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 61
MIN_REDUCTION+55, // (default reduction)
  }
,
{ // state 62
0x80000000|378, // match move
0x80000000|618, // no-match move
0x80000000|85, // NT-test-match state for `else
  }
,
{ // state 63
0x80000000|1, // match move
0x80000000|587, // no-match move
0x80000000|36, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 64
83,26, // ws
84,258, // " "
85,588, // {10}
MIN_REDUCTION+84, // (default reduction)
  }
,
{ // state 65
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 66
2,601, // ws*
MIN_REDUCTION+99, // (default reduction)
  }
,
{ // state 67
MIN_REDUCTION+26, // (default reduction)
  }
,
{ // state 68
59,546, // letter
60,55, // "p"
61,55, // "v"
62,55, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q" "s" "y".."z"}
63,55, // "c"
64,55, // "i"
65,55, // "l"
66,55, // "o"
67,55, // "r"
68,55, // "u"
69,55, // "x"
70,55, // "b"
71,55, // "e"
72,55, // "h"
73,55, // "t"
74,55, // "w"
75,928, // letter128
76,882, // {199..218 231..250}
77,882, // {193..198 225..230}
78,219, // digit
79,185, // {"1".."9"}
80,185, // "0"
81,1063, // digit128
82,807, // {176..185}
100,705, // idChar*
101,427, // $$3
106,401, // idChar
107,1077, // "_"
108,392, // idChar128
109,718, // {223}
  }
,
{ // state 69
MIN_REDUCTION+54, // (default reduction)
  }
,
{ // state 70
83,435, // ws
84,291, // " "
85,722, // {10}
MIN_REDUCTION+142, // (default reduction)
  }
,
{ // state 71
0x80000000|649, // match move
0x80000000|455, // no-match move
0x80000000|85, // NT-test-match state for `else
  }
,
{ // state 72
MIN_REDUCTION+55, // (default reduction)
  }
,
{ // state 73
83,899, // ws
84,1026, // " "
85,286, // {10}
MIN_REDUCTION+56, // (default reduction)
  }
,
{ // state 74
50,981, // `+
87,809, // "+"
MIN_REDUCTION+36, // (default reduction)
  }
,
{ // state 75
0x80000000|1, // match move
0x80000000|552, // no-match move
0x80000000|36, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 76
MIN_REDUCTION+34, // (default reduction)
  }
,
{ // state 77
MIN_REDUCTION+33, // (default reduction)
  }
,
{ // state 78
MIN_REDUCTION+35, // (default reduction)
  }
,
{ // state 79
0x80000000|1, // match move
0x80000000|824, // no-match move
0x80000000|36, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 80
65,1139, // "l"
  }
,
{ // state 81
MIN_REDUCTION+134, // (default reduction)
  }
,
{ // state 82
83,95, // ws
84,1012, // " "
85,699, // {10}
MIN_REDUCTION+84, // (default reduction)
  }
,
{ // state 83
2,64, // ws*
83,183, // ws
84,258, // " "
85,588, // {10}
MIN_REDUCTION+85, // (default reduction)
  }
,
{ // state 84
78,935, // digit
79,960, // {"1".."9"}
80,960, // "0"
81,670, // digit128
82,1101, // {176..185}
102,937, // digit*
103,133, // $$4
  }
,
{ // state 85
86,391, // "#"
  }
,
{ // state 86
50,968, // `+
87,809, // "+"
MIN_REDUCTION+36, // (default reduction)
  }
,
{ // state 87
50,971, // `+
87,809, // "+"
MIN_REDUCTION+36, // (default reduction)
  }
,
{ // state 88
MIN_REDUCTION+55, // (default reduction)
  }
,
{ // state 89
MIN_REDUCTION+142, // (default reduction)
  }
,
{ // state 90
MIN_REDUCTION+55, // (default reduction)
  }
,
{ // state 91
83,417, // ws
84,284, // " "
85,885, // {10}
MIN_REDUCTION+142, // (default reduction)
  }
,
{ // state 92
0x80000000|1, // match move
0x80000000|1067, // no-match move
0x80000000|36, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 93
0x80000000|1, // match move
0x80000000|798, // no-match move
0x80000000|36, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 94
2,33, // ws*
83,313, // ws
84,817, // " "
85,1052, // {10}
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 95
MIN_REDUCTION+134, // (default reduction)
  }
,
{ // state 96
0x80000000|1, // match move
0x80000000|796, // no-match move
0x80000000|36, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 97
MIN_REDUCTION+54, // (default reduction)
  }
,
{ // state 98
42,333, // `else
86,386, // "#"
  }
,
{ // state 99
0x80000000|1, // match move
0x80000000|1119, // no-match move
0x80000000|36, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 100
0x80000000|987, // match move
0x80000000|701, // no-match move
0x80000000|36, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 101
0x80000000|1, // match move
0x80000000|1122, // no-match move
0x80000000|36, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 102
2,187, // ws*
83,478, // ws
84,549, // " "
85,228, // {10}
MIN_REDUCTION+143, // (default reduction)
  }
,
{ // state 103
2,180, // ws*
83,477, // ws
84,547, // " "
85,230, // {10}
MIN_REDUCTION+143, // (default reduction)
  }
,
{ // state 104
0x80000000|1, // match move
0x80000000|610, // no-match move
0x80000000|36, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 105
0x80000000|1, // match move
0x80000000|232, // no-match move
0x80000000|36, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 106
0x80000000|1, // match move
0x80000000|614, // no-match move
0x80000000|36, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 107
MIN_REDUCTION+34, // (default reduction)
  }
,
{ // state 108
30,MIN_REDUCTION+144, // `[
83,42, // ws
84,137, // " "
85,543, // {10}
96,MIN_REDUCTION+144, // "["
MIN_REDUCTION+144, // (default reduction)
  }
,
{ // state 109
MIN_REDUCTION+53, // (default reduction)
  }
,
{ // state 110
0x80000000|1, // match move
0x80000000|223, // no-match move
0x80000000|36, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 111
MIN_REDUCTION+33, // (default reduction)
  }
,
{ // state 112
21,487, // $$2
41,901, // `)
91,344, // ")"
  }
,
{ // state 113
0x80000000|1, // match move
0x80000000|221, // no-match move
0x80000000|36, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 114
MIN_REDUCTION+35, // (default reduction)
  }
,
{ // state 115
41,157, // `)
91,463, // ")"
  }
,
{ // state 116
30,MIN_REDUCTION+51, // `[
96,MIN_REDUCTION+51, // "["
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 117
0x80000000|1, // match move
0x80000000|1106, // no-match move
0x80000000|36, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 118
50,781, // `+
87,809, // "+"
MIN_REDUCTION+36, // (default reduction)
  }
,
{ // state 119
59,546, // letter
60,55, // "p"
61,55, // "v"
62,55, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q" "s" "y".."z"}
63,55, // "c"
64,55, // "i"
65,55, // "l"
66,55, // "o"
67,55, // "r"
68,55, // "u"
69,55, // "x"
70,55, // "b"
71,55, // "e"
72,55, // "h"
73,55, // "t"
74,55, // "w"
75,334, // letter128
76,703, // {199..218 231..250}
77,703, // {193..198 225..230}
78,219, // digit
79,185, // {"1".."9"}
80,185, // "0"
81,323, // digit128
82,753, // {176..185}
100,839, // idChar*
101,976, // $$3
106,401, // idChar
107,1077, // "_"
108,1013, // idChar128
109,864, // {223}
  }
,
{ // state 120
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 121
66,461, // "o"
  }
,
{ // state 122
59,546, // letter
60,55, // "p"
61,55, // "v"
62,55, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q" "s" "y".."z"}
63,55, // "c"
64,55, // "i"
65,55, // "l"
66,55, // "o"
67,55, // "r"
68,55, // "u"
69,55, // "x"
70,55, // "b"
71,55, // "e"
72,55, // "h"
73,55, // "t"
74,55, // "w"
75,332, // letter128
76,704, // {199..218 231..250}
77,704, // {193..198 225..230}
78,219, // digit
79,185, // {"1".."9"}
80,185, // "0"
81,324, // digit128
82,759, // {176..185}
100,836, // idChar*
101,977, // $$3
106,401, // idChar
107,1077, // "_"
108,1015, // idChar128
109,862, // {223}
  }
,
{ // state 123
83,49, // ws
84,1097, // " "
85,90, // {10}
MIN_REDUCTION+60, // (default reduction)
  }
,
{ // state 124
83,62, // ws
84,71, // " "
85,735, // {10}
MIN_REDUCTION+84, // (default reduction)
  }
,
{ // state 125
MIN_REDUCTION+34, // (default reduction)
  }
,
{ // state 126
MIN_REDUCTION+35, // (default reduction)
  }
,
{ // state 127
MIN_REDUCTION+33, // (default reduction)
  }
,
{ // state 128
MIN_REDUCTION+34, // (default reduction)
  }
,
{ // state 129
0x80000000|160, // match move
0x80000000|743, // no-match move
0x80000000|36, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 130
MIN_REDUCTION+35, // (default reduction)
  }
,
{ // state 131
MIN_REDUCTION+33, // (default reduction)
  }
,
{ // state 132
73,320, // "t"
  }
,
{ // state 133
0x80000000|1, // match move
0x80000000|594, // no-match move
0x80000000|36, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 134
2,181, // ws*
83,1090, // ws
84,1026, // " "
85,286, // {10}
MIN_REDUCTION+65, // (default reduction)
  }
,
{ // state 135
30,MIN_REDUCTION+102, // `[
96,MIN_REDUCTION+102, // "["
MIN_REDUCTION+102, // (default reduction)
  }
,
{ // state 136
0x80000000|983, // match move
0x80000000|1116, // no-match move
0x80000000|36, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 137
0x80000000|1, // match move
0x80000000|196, // no-match move
0x80000000|36, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 138
17,557, // `(
90,785, // "("
  }
,
{ // state 139
MIN_REDUCTION+140, // (default reduction)
  }
,
{ // state 140
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 141
30,MIN_REDUCTION+51, // `[
96,MIN_REDUCTION+51, // "["
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 142
19,553, // $$1
41,252, // `)
91,344, // ")"
  }
,
{ // state 143
MIN_REDUCTION+134, // (default reduction)
  }
,
{ // state 144
0x80000000|780, // match move
0x80000000|732, // no-match move
0x80000000|85, // NT-test-match state for `else
  }
,
{ // state 145
7,1070, // ID
17,715, // `(
40,503, // <expr>
45,1060, // <expr8>
46,111, // <expr7>
47,107, // <expr6>
48,114, // <expr5>
49,74, // <expr4>
51,335, // <expr3>
53,947, // <expr2>
54,775, // <cast expr>
55,805, // <unary expr>
56,638, // <expr1>
57,379, // `-
58,800, // INTLIT
59,1051, // letter
60,677, // "p"
61,677, // "v"
62,677, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q" "s" "y".."z"}
63,677, // "c"
64,677, // "i"
65,677, // "l"
66,677, // "o"
67,677, // "r"
68,677, // "u"
69,677, // "x"
70,677, // "b"
71,677, // "e"
72,677, // "h"
73,677, // "t"
74,677, // "w"
75,1092, // letter128
76,613, // {199..218 231..250}
77,613, // {193..198 225..230}
79,84, // {"1".."9"}
80,403, // "0"
81,506, // digit128
82,1101, // {176..185}
90,846, // "("
94,17, // "-"
  }
,
{ // state 146
7,100, // ID
17,734, // `(
20,389, // <type>
27,10, // `int
28,171, // `boolean
32,686, // <stmt>
33,810, // <assign>
35,488, // `{
38,310, // <local var decl>
39,3, // `if
40,158, // <expr>
43,1031, // `while
45,1043, // <expr8>
46,127, // <expr7>
47,125, // <expr6>
48,130, // <expr5>
49,86, // <expr4>
51,210, // <expr3>
53,982, // <expr2>
54,792, // <cast expr>
55,625, // <unary expr>
56,656, // <expr1>
57,371, // `-
58,819, // INTLIT
59,376, // letter
60,677, // "p"
61,677, // "v"
62,677, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q" "s" "y".."z"}
63,677, // "c"
64,677, // "i"
65,677, // "l"
66,677, // "o"
67,677, // "r"
68,677, // "u"
69,677, // "x"
70,677, // "b"
71,677, // "e"
72,677, // "h"
73,677, // "t"
74,677, // "w"
75,635, // letter128
76,154, // {199..218 231..250}
77,154, // {193..198 225..230}
79,164, // {"1".."9"}
80,393, // "0"
81,489, // digit128
82,1107, // {176..185}
86,975, // "#"
90,846, // "("
92,662, // "{"
94,17, // "-"
  }
,
{ // state 147
78,935, // digit
79,960, // {"1".."9"}
80,960, // "0"
81,710, // digit128
82,1120, // {176..185}
102,967, // digit*
103,432, // $$4
  }
,
{ // state 148
MIN_REDUCTION+135, // (default reduction)
  }
,
{ // state 149
2,746, // ws*
30,MIN_REDUCTION+143, // `[
83,75, // ws
84,137, // " "
85,543, // {10}
96,MIN_REDUCTION+143, // "["
MIN_REDUCTION+143, // (default reduction)
  }
,
{ // state 150
2,822, // ws*
30,MIN_REDUCTION+101, // `[
83,60, // ws
84,110, // " "
85,523, // {10}
96,MIN_REDUCTION+101, // "["
MIN_REDUCTION+101, // (default reduction)
  }
,
{ // state 151
MIN_REDUCTION+55, // (default reduction)
  }
,
{ // state 152
2,211, // ws*
  }
,
{ // state 153
7,100, // ID
17,734, // `(
20,389, // <type>
27,10, // `int
28,171, // `boolean
32,696, // <stmt>
33,810, // <assign>
35,488, // `{
37,692, // `}
38,310, // <local var decl>
39,3, // `if
40,158, // <expr>
43,1031, // `while
45,1043, // <expr8>
46,127, // <expr7>
47,125, // <expr6>
48,130, // <expr5>
49,86, // <expr4>
51,210, // <expr3>
53,982, // <expr2>
54,792, // <cast expr>
55,625, // <unary expr>
56,656, // <expr1>
57,371, // `-
58,819, // INTLIT
59,376, // letter
60,677, // "p"
61,677, // "v"
62,677, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q" "s" "y".."z"}
63,677, // "c"
64,677, // "i"
65,677, // "l"
66,677, // "o"
67,677, // "r"
68,677, // "u"
69,677, // "x"
70,677, // "b"
71,677, // "e"
72,677, // "h"
73,677, // "t"
74,677, // "w"
75,635, // letter128
76,154, // {199..218 231..250}
77,154, // {193..198 225..230}
79,164, // {"1".."9"}
80,393, // "0"
81,489, // digit128
82,1107, // {176..185}
86,975, // "#"
90,846, // "("
92,662, // "{"
93,961, // "}"
94,17, // "-"
  }
,
{ // state 154
0x80000000|898, // match move
0x80000000|833, // no-match move
0x80000000|36, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 155
MIN_REDUCTION+12, // (default reduction)
  }
,
{ // state 156
83,848, // ws
84,539, // " "
85,222, // {10}
MIN_REDUCTION+142, // (default reduction)
  }
,
{ // state 157
7,100, // ID
17,734, // `(
20,389, // <type>
27,10, // `int
28,171, // `boolean
32,166, // <stmt>
33,776, // <assign>
35,1042, // `{
38,620, // <local var decl>
39,279, // `if
40,158, // <expr>
43,711, // `while
45,1043, // <expr8>
46,127, // <expr7>
47,125, // <expr6>
48,130, // <expr5>
49,86, // <expr4>
51,210, // <expr3>
53,982, // <expr2>
54,792, // <cast expr>
55,625, // <unary expr>
56,656, // <expr1>
57,371, // `-
58,819, // INTLIT
59,376, // letter
60,677, // "p"
61,677, // "v"
62,677, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q" "s" "y".."z"}
63,677, // "c"
64,677, // "i"
65,677, // "l"
66,677, // "o"
67,677, // "r"
68,677, // "u"
69,677, // "x"
70,677, // "b"
71,677, // "e"
72,677, // "h"
73,677, // "t"
74,677, // "w"
75,635, // letter128
76,154, // {199..218 231..250}
77,154, // {193..198 225..230}
79,164, // {"1".."9"}
80,393, // "0"
81,489, // digit128
82,1107, // {176..185}
86,975, // "#"
90,846, // "("
92,662, // "{"
94,17, // "-"
  }
,
{ // state 158
44,243, // `=
95,363, // "="
  }
,
{ // state 159
83,849, // ws
84,537, // " "
85,224, // {10}
MIN_REDUCTION+142, // (default reduction)
  }
,
{ // state 160
2,876, // ws*
MIN_REDUCTION+143, // (default reduction)
  }
,
{ // state 161
MIN_REDUCTION+8, // (default reduction)
  }
,
{ // state 162
78,935, // digit
79,960, // {"1".."9"}
80,960, // "0"
81,676, // digit128
82,1108, // {176..185}
102,952, // digit*
103,106, // $$4
  }
,
{ // state 163
34,636, // `;
99,713, // ";"
  }
,
{ // state 164
78,935, // digit
79,960, // {"1".."9"}
80,960, // "0"
81,679, // digit128
82,1107, // {176..185}
102,949, // digit*
103,104, // $$4
  }
,
{ // state 165
MIN_REDUCTION+133, // (default reduction)
  }
,
{ // state 166
0x80000000|357, // match move
0x80000000|67, // no-match move
0x80000000|85, // NT-test-match state for `else
  }
,
{ // state 167
2,865, // ws*
30,MIN_REDUCTION+101, // `[
83,75, // ws
84,137, // " "
85,543, // {10}
96,MIN_REDUCTION+101, // "["
MIN_REDUCTION+101, // (default reduction)
  }
,
{ // state 168
2,784, // ws*
30,MIN_REDUCTION+143, // `[
83,60, // ws
84,110, // " "
85,523, // {10}
96,MIN_REDUCTION+143, // "["
MIN_REDUCTION+143, // (default reduction)
  }
,
{ // state 169
2,789, // ws*
30,MIN_REDUCTION+143, // `[
83,63, // ws
84,113, // " "
85,25, // {10}
96,MIN_REDUCTION+143, // "["
MIN_REDUCTION+143, // (default reduction)
  }
,
{ // state 170
30,MIN_REDUCTION+142, // `[
83,42, // ws
84,137, // " "
85,543, // {10}
96,MIN_REDUCTION+142, // "["
MIN_REDUCTION+142, // (default reduction)
  }
,
{ // state 171
MIN_REDUCTION+18, // (default reduction)
  }
,
{ // state 172
MIN_REDUCTION+24, // (default reduction)
  }
,
{ // state 173
MIN_REDUCTION+55, // (default reduction)
  }
,
{ // state 174
83,665, // ws
84,1039, // " "
85,88, // {10}
MIN_REDUCTION+100, // (default reduction)
  }
,
{ // state 175
41,813, // `)
91,463, // ")"
  }
,
{ // state 176
MIN_REDUCTION+135, // (default reduction)
  }
,
{ // state 177
MIN_REDUCTION+25, // (default reduction)
  }
,
{ // state 178
MIN_REDUCTION+22, // (default reduction)
  }
,
{ // state 179
2,684, // ws*
  }
,
{ // state 180
83,592, // ws
84,547, // " "
85,230, // {10}
MIN_REDUCTION+142, // (default reduction)
  }
,
{ // state 181
83,899, // ws
84,1026, // " "
85,286, // {10}
MIN_REDUCTION+64, // (default reduction)
  }
,
{ // state 182
2,789, // ws*
  }
,
{ // state 183
MIN_REDUCTION+135, // (default reduction)
  }
,
{ // state 184
37,838, // `}
93,828, // "}"
  }
,
{ // state 185
MIN_REDUCTION+52, // (default reduction)
  }
,
{ // state 186
0x80000000|855, // match move
0x80000000|544, // no-match move
0x80000000|85, // NT-test-match state for `else
  }
,
{ // state 187
83,590, // ws
84,549, // " "
85,228, // {10}
MIN_REDUCTION+142, // (default reduction)
  }
,
{ // state 188
MIN_REDUCTION+55, // (default reduction)
  }
,
{ // state 189
0x80000000|709, // match move
0x80000000|317, // no-match move
0x80000000|36, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 190
0x80000000|709, // match move
0x80000000|315, // no-match move
0x80000000|36, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 191
MIN_REDUCTION+114, // (default reduction)
  }
,
{ // state 192
83,381, // ws
84,843, // " "
85,750, // {10}
114,MIN_REDUCTION+70, // $NT
  }
,
{ // state 193
7,79, // ID
17,771, // `(
40,571, // <expr>
45,1091, // <expr8>
46,77, // <expr7>
47,76, // <expr6>
48,78, // <expr5>
49,118, // <expr4>
51,248, // <expr3>
53,997, // <expr2>
54,773, // <cast expr>
55,597, // <unary expr>
56,700, // <expr1>
57,350, // `-
58,639, // INTLIT
59,1109, // letter
60,677, // "p"
61,677, // "v"
62,677, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q" "s" "y".."z"}
63,677, // "c"
64,677, // "i"
65,677, // "l"
66,677, // "o"
67,677, // "r"
68,677, // "u"
69,677, // "x"
70,677, // "b"
71,677, // "e"
72,677, // "h"
73,677, // "t"
74,677, // "w"
75,1131, // letter128
76,570, // {199..218 231..250}
77,570, // {193..198 225..230}
79,147, // {"1".."9"}
80,360, // "0"
81,533, // digit128
82,1120, // {176..185}
90,846, // "("
94,17, // "-"
  }
,
{ // state 194
MIN_REDUCTION+139, // (default reduction)
  }
,
{ // state 195
2,48, // ws*
30,MIN_REDUCTION+95, // `[
83,60, // ws
84,110, // " "
85,523, // {10}
96,MIN_REDUCTION+95, // "["
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 196
30,MIN_REDUCTION+54, // `[
96,MIN_REDUCTION+54, // "["
MIN_REDUCTION+54, // (default reduction)
  }
,
{ // state 197
MIN_REDUCTION+55, // (default reduction)
  }
,
{ // state 198
0x80000000|709, // match move
0x80000000|510, // no-match move
0x80000000|36, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 199
83,245, // ws
84,1095, // " "
85,844, // {10}
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 200
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 201
83,766, // ws
84,688, // " "
85,30, // {10}
MIN_REDUCTION+84, // (default reduction)
  }
,
{ // state 202
MIN_REDUCTION+135, // (default reduction)
  }
,
{ // state 203
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 204
7,79, // ID
17,771, // `(
40,573, // <expr>
45,1091, // <expr8>
46,77, // <expr7>
47,76, // <expr6>
48,78, // <expr5>
49,118, // <expr4>
51,248, // <expr3>
53,997, // <expr2>
54,773, // <cast expr>
55,597, // <unary expr>
56,700, // <expr1>
57,350, // `-
58,639, // INTLIT
59,1109, // letter
60,677, // "p"
61,677, // "v"
62,677, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q" "s" "y".."z"}
63,677, // "c"
64,677, // "i"
65,677, // "l"
66,677, // "o"
67,677, // "r"
68,677, // "u"
69,677, // "x"
70,677, // "b"
71,677, // "e"
72,677, // "h"
73,677, // "t"
74,677, // "w"
75,1131, // letter128
76,570, // {199..218 231..250}
77,570, // {193..198 225..230}
79,147, // {"1".."9"}
80,360, // "0"
81,533, // digit128
82,1120, // {176..185}
90,846, // "("
94,17, // "-"
  }
,
{ // state 205
30,MIN_REDUCTION+115, // `[
96,MIN_REDUCTION+115, // "["
MIN_REDUCTION+115, // (default reduction)
  }
,
{ // state 206
MIN_REDUCTION+6, // (default reduction)
  }
,
{ // state 207
30,MIN_REDUCTION+115, // `[
96,MIN_REDUCTION+115, // "["
MIN_REDUCTION+115, // (default reduction)
  }
,
{ // state 208
30,MIN_REDUCTION+100, // `[
83,5, // ws
84,105, // " "
85,20, // {10}
96,MIN_REDUCTION+100, // "["
MIN_REDUCTION+100, // (default reduction)
  }
,
{ // state 209
MIN_REDUCTION+5, // (default reduction)
  }
,
{ // state 210
52,742, // `*
89,768, // "*"
MIN_REDUCTION+38, // (default reduction)
  }
,
{ // state 211
0x80000000|1, // match move
0x80000000|568, // no-match move
0x80000000|36, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 212
MIN_REDUCTION+31, // (default reduction)
  }
,
{ // state 213
52,745, // `*
89,768, // "*"
MIN_REDUCTION+38, // (default reduction)
  }
,
{ // state 214
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 215
30,MIN_REDUCTION+100, // `[
83,27, // ws
84,110, // " "
85,523, // {10}
96,MIN_REDUCTION+100, // "["
MIN_REDUCTION+100, // (default reduction)
  }
,
{ // state 216
MIN_REDUCTION+134, // (default reduction)
  }
,
{ // state 217
7,79, // ID
17,771, // `(
40,566, // <expr>
45,1091, // <expr8>
46,77, // <expr7>
47,76, // <expr6>
48,78, // <expr5>
49,118, // <expr4>
51,248, // <expr3>
53,997, // <expr2>
54,773, // <cast expr>
55,597, // <unary expr>
56,700, // <expr1>
57,350, // `-
58,639, // INTLIT
59,1109, // letter
60,677, // "p"
61,677, // "v"
62,677, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q" "s" "y".."z"}
63,677, // "c"
64,677, // "i"
65,677, // "l"
66,677, // "o"
67,677, // "r"
68,677, // "u"
69,677, // "x"
70,677, // "b"
71,677, // "e"
72,677, // "h"
73,677, // "t"
74,677, // "w"
75,1131, // letter128
76,570, // {199..218 231..250}
77,570, // {193..198 225..230}
79,147, // {"1".."9"}
80,360, // "0"
81,533, // digit128
82,1120, // {176..185}
90,846, // "("
94,17, // "-"
  }
,
{ // state 218
0x80000000|719, // match move
0x80000000|894, // no-match move
0x80000000|85, // NT-test-match state for `else
  }
,
{ // state 219
MIN_REDUCTION+111, // (default reduction)
  }
,
{ // state 220
MIN_REDUCTION+25, // (default reduction)
  }
,
{ // state 221
30,MIN_REDUCTION+54, // `[
96,MIN_REDUCTION+54, // "["
MIN_REDUCTION+54, // (default reduction)
  }
,
{ // state 222
MIN_REDUCTION+55, // (default reduction)
  }
,
{ // state 223
30,MIN_REDUCTION+54, // `[
96,MIN_REDUCTION+54, // "["
MIN_REDUCTION+54, // (default reduction)
  }
,
{ // state 224
MIN_REDUCTION+55, // (default reduction)
  }
,
{ // state 225
MIN_REDUCTION+30, // (default reduction)
  }
,
{ // state 226
2,46, // ws*
30,MIN_REDUCTION+95, // `[
83,63, // ws
84,113, // " "
85,25, // {10}
96,MIN_REDUCTION+95, // "["
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 227
7,19, // ID
20,938, // <type>
27,10, // `int
28,171, // `boolean
59,779, // letter
60,677, // "p"
61,677, // "v"
62,677, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q" "s" "y".."z"}
63,677, // "c"
64,677, // "i"
65,677, // "l"
66,677, // "o"
67,677, // "r"
68,677, // "u"
69,677, // "x"
70,677, // "b"
71,677, // "e"
72,677, // "h"
73,677, // "t"
74,677, // "w"
75,518, // letter128
76,1069, // {199..218 231..250}
77,1069, // {193..198 225..230}
86,442, // "#"
  }
,
{ // state 228
MIN_REDUCTION+55, // (default reduction)
  }
,
{ // state 229
7,19, // ID
20,941, // <type>
27,10, // `int
28,171, // `boolean
59,779, // letter
60,677, // "p"
61,677, // "v"
62,677, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q" "s" "y".."z"}
63,677, // "c"
64,677, // "i"
65,677, // "l"
66,677, // "o"
67,677, // "r"
68,677, // "u"
69,677, // "x"
70,677, // "b"
71,677, // "e"
72,677, // "h"
73,677, // "t"
74,677, // "w"
75,518, // letter128
76,1069, // {199..218 231..250}
77,1069, // {193..198 225..230}
86,442, // "#"
  }
,
{ // state 230
MIN_REDUCTION+55, // (default reduction)
  }
,
{ // state 231
30,MIN_REDUCTION+115, // `[
96,MIN_REDUCTION+115, // "["
MIN_REDUCTION+115, // (default reduction)
  }
,
{ // state 232
30,MIN_REDUCTION+54, // `[
96,MIN_REDUCTION+54, // "["
MIN_REDUCTION+54, // (default reduction)
  }
,
{ // state 233
7,100, // ID
17,734, // `(
20,389, // <type>
27,10, // `int
28,171, // `boolean
32,696, // <stmt>
33,810, // <assign>
35,488, // `{
37,723, // `}
38,310, // <local var decl>
39,3, // `if
40,158, // <expr>
43,1031, // `while
45,1043, // <expr8>
46,127, // <expr7>
47,125, // <expr6>
48,130, // <expr5>
49,86, // <expr4>
51,210, // <expr3>
53,982, // <expr2>
54,792, // <cast expr>
55,625, // <unary expr>
56,656, // <expr1>
57,371, // `-
58,819, // INTLIT
59,376, // letter
60,677, // "p"
61,677, // "v"
62,677, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q" "s" "y".."z"}
63,677, // "c"
64,677, // "i"
65,677, // "l"
66,677, // "o"
67,677, // "r"
68,677, // "u"
69,677, // "x"
70,677, // "b"
71,677, // "e"
72,677, // "h"
73,677, // "t"
74,677, // "w"
75,635, // letter128
76,154, // {199..218 231..250}
77,154, // {193..198 225..230}
79,164, // {"1".."9"}
80,393, // "0"
81,489, // digit128
82,1107, // {176..185}
86,975, // "#"
90,846, // "("
92,662, // "{"
93,83, // "}"
94,17, // "-"
  }
,
{ // state 234
30,MIN_REDUCTION+100, // `[
83,29, // ws
84,113, // " "
85,25, // {10}
96,MIN_REDUCTION+100, // "["
MIN_REDUCTION+100, // (default reduction)
  }
,
{ // state 235
2,174, // ws*
83,1133, // ws
84,1039, // " "
85,88, // {10}
MIN_REDUCTION+101, // (default reduction)
  }
,
{ // state 236
41,343, // `)
91,463, // ")"
  }
,
{ // state 237
7,100, // ID
17,734, // `(
20,389, // <type>
27,10, // `int
28,171, // `boolean
32,696, // <stmt>
33,810, // <assign>
35,488, // `{
37,1003, // `}
38,310, // <local var decl>
39,3, // `if
40,158, // <expr>
43,1031, // `while
45,1043, // <expr8>
46,127, // <expr7>
47,125, // <expr6>
48,130, // <expr5>
49,86, // <expr4>
51,210, // <expr3>
53,982, // <expr2>
54,792, // <cast expr>
55,625, // <unary expr>
56,656, // <expr1>
57,371, // `-
58,819, // INTLIT
59,376, // letter
60,677, // "p"
61,677, // "v"
62,677, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q" "s" "y".."z"}
63,677, // "c"
64,677, // "i"
65,677, // "l"
66,677, // "o"
67,677, // "r"
68,677, // "u"
69,677, // "x"
70,677, // "b"
71,677, // "e"
72,677, // "h"
73,677, // "t"
74,677, // "w"
75,635, // letter128
76,154, // {199..218 231..250}
77,154, // {193..198 225..230}
79,164, // {"1".."9"}
80,393, // "0"
81,489, // digit128
82,1107, // {176..185}
86,975, // "#"
90,846, // "("
92,662, // "{"
93,24, // "}"
94,17, // "-"
  }
,
{ // state 238
7,100, // ID
17,734, // `(
20,389, // <type>
27,10, // `int
28,171, // `boolean
32,28, // <stmt>
33,776, // <assign>
35,1042, // `{
38,620, // <local var decl>
39,279, // `if
40,158, // <expr>
43,711, // `while
45,1043, // <expr8>
46,127, // <expr7>
47,125, // <expr6>
48,130, // <expr5>
49,86, // <expr4>
51,210, // <expr3>
53,982, // <expr2>
54,792, // <cast expr>
55,625, // <unary expr>
56,656, // <expr1>
57,371, // `-
58,819, // INTLIT
59,376, // letter
60,677, // "p"
61,677, // "v"
62,677, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q" "s" "y".."z"}
63,677, // "c"
64,677, // "i"
65,677, // "l"
66,677, // "o"
67,677, // "r"
68,677, // "u"
69,677, // "x"
70,677, // "b"
71,677, // "e"
72,677, // "h"
73,677, // "t"
74,677, // "w"
75,635, // letter128
76,154, // {199..218 231..250}
77,154, // {193..198 225..230}
79,164, // {"1".."9"}
80,393, // "0"
81,489, // digit128
82,1107, // {176..185}
86,975, // "#"
90,846, // "("
92,662, // "{"
94,17, // "-"
  }
,
{ // state 239
MIN_REDUCTION+2, // (default reduction)
  }
,
{ // state 240
2,953, // ws*
30,MIN_REDUCTION+101, // `[
83,34, // ws
84,105, // " "
85,20, // {10}
96,MIN_REDUCTION+101, // "["
MIN_REDUCTION+101, // (default reduction)
  }
,
{ // state 241
MIN_REDUCTION+10, // (default reduction)
  }
,
{ // state 242
2,59, // ws*
83,1133, // ws
84,1039, // " "
85,88, // {10}
MIN_REDUCTION+143, // (default reduction)
  }
,
{ // state 243
7,96, // ID
17,731, // `(
40,1113, // <expr>
45,1041, // <expr8>
46,131, // <expr7>
47,128, // <expr6>
48,126, // <expr5>
49,87, // <expr4>
51,213, // <expr3>
53,973, // <expr2>
54,794, // <cast expr>
55,624, // <unary expr>
56,657, // <expr1>
57,367, // `-
58,815, // INTLIT
59,1066, // letter
60,677, // "p"
61,677, // "v"
62,677, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q" "s" "y".."z"}
63,677, // "c"
64,677, // "i"
65,677, // "l"
66,677, // "o"
67,677, // "r"
68,677, // "u"
69,677, // "x"
70,677, // "b"
71,677, // "e"
72,677, // "h"
73,677, // "t"
74,677, // "w"
75,1105, // letter128
76,595, // {199..218 231..250}
77,595, // {193..198 225..230}
79,162, // {"1".."9"}
80,394, // "0"
81,491, // digit128
82,1108, // {176..185}
90,846, // "("
94,17, // "-"
  }
,
{ // state 244
30,MIN_REDUCTION+115, // `[
96,MIN_REDUCTION+115, // "["
MIN_REDUCTION+115, // (default reduction)
  }
,
{ // state 245
MIN_REDUCTION+134, // (default reduction)
  }
,
{ // state 246
30,MIN_REDUCTION+135, // `[
96,MIN_REDUCTION+135, // "["
MIN_REDUCTION+135, // (default reduction)
  }
,
{ // state 247
2,4, // ws*
30,MIN_REDUCTION+95, // `[
83,34, // ws
84,105, // " "
85,20, // {10}
96,MIN_REDUCTION+95, // "["
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 248
52,761, // `*
89,768, // "*"
MIN_REDUCTION+38, // (default reduction)
  }
,
{ // state 249
0x80000000|31, // match move
0x80000000|476, // no-match move
0x80000000|85, // NT-test-match state for `else
  }
,
{ // state 250
2,845, // ws*
83,940, // ws
84,688, // " "
85,30, // {10}
MIN_REDUCTION+85, // (default reduction)
  }
,
{ // state 251
0x80000000|148, // match move
0x80000000|246, // no-match move
0x80000000|36, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 252
35,384, // `{
92,662, // "{"
  }
,
{ // state 253
30,MIN_REDUCTION+53, // `[
96,MIN_REDUCTION+53, // "["
MIN_REDUCTION+53, // (default reduction)
  }
,
{ // state 254
30,MIN_REDUCTION+100, // `[
83,42, // ws
84,137, // " "
85,543, // {10}
96,MIN_REDUCTION+100, // "["
MIN_REDUCTION+100, // (default reduction)
  }
,
{ // state 255
30,MIN_REDUCTION+115, // `[
96,MIN_REDUCTION+115, // "["
MIN_REDUCTION+115, // (default reduction)
  }
,
{ // state 256
MIN_REDUCTION+53, // (default reduction)
  }
,
{ // state 257
MIN_REDUCTION+53, // (default reduction)
  }
,
{ // state 258
MIN_REDUCTION+54, // (default reduction)
  }
,
{ // state 259
30,MIN_REDUCTION+53, // `[
96,MIN_REDUCTION+53, // "["
MIN_REDUCTION+53, // (default reduction)
  }
,
{ // state 260
7,79, // ID
17,771, // `(
40,603, // <expr>
45,1091, // <expr8>
46,77, // <expr7>
47,76, // <expr6>
48,78, // <expr5>
49,118, // <expr4>
51,248, // <expr3>
53,997, // <expr2>
54,773, // <cast expr>
55,597, // <unary expr>
56,700, // <expr1>
57,350, // `-
58,639, // INTLIT
59,1109, // letter
60,677, // "p"
61,677, // "v"
62,677, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q" "s" "y".."z"}
63,677, // "c"
64,677, // "i"
65,677, // "l"
66,677, // "o"
67,677, // "r"
68,677, // "u"
69,677, // "x"
70,677, // "b"
71,677, // "e"
72,677, // "h"
73,677, // "t"
74,677, // "w"
75,1131, // letter128
76,570, // {199..218 231..250}
77,570, // {193..198 225..230}
79,147, // {"1".."9"}
80,360, // "0"
81,533, // digit128
82,1120, // {176..185}
90,846, // "("
94,17, // "-"
  }
,
{ // state 261
30,MIN_REDUCTION+53, // `[
96,MIN_REDUCTION+53, // "["
MIN_REDUCTION+53, // (default reduction)
  }
,
{ // state 262
23,1020, // <extra param>
24,227, // `,
26,600, // <extra param>*
98,1072, // ","
MIN_REDUCTION+16, // (default reduction)
  }
,
{ // state 263
83,879, // ws
84,606, // " "
85,274, // {10}
MIN_REDUCTION+94, // (default reduction)
  }
,
{ // state 264
2,774, // ws*
  }
,
{ // state 265
2,820, // ws*
30,MIN_REDUCTION+101, // `[
83,63, // ws
84,113, // " "
85,25, // {10}
96,MIN_REDUCTION+101, // "["
MIN_REDUCTION+101, // (default reduction)
  }
,
{ // state 266
23,1019, // <extra param>
24,229, // `,
26,598, // <extra param>*
98,1072, // ","
MIN_REDUCTION+16, // (default reduction)
  }
,
{ // state 267
7,100, // ID
17,734, // `(
20,389, // <type>
27,10, // `int
28,171, // `boolean
32,725, // <stmt>
33,769, // <assign>
35,545, // `{
38,726, // <local var decl>
39,495, // `if
40,158, // <expr>
43,985, // `while
45,1043, // <expr8>
46,127, // <expr7>
47,125, // <expr6>
48,130, // <expr5>
49,86, // <expr4>
51,210, // <expr3>
53,982, // <expr2>
54,792, // <cast expr>
55,625, // <unary expr>
56,656, // <expr1>
57,371, // `-
58,819, // INTLIT
59,376, // letter
60,677, // "p"
61,677, // "v"
62,677, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q" "s" "y".."z"}
63,677, // "c"
64,677, // "i"
65,677, // "l"
66,677, // "o"
67,677, // "r"
68,677, // "u"
69,677, // "x"
70,677, // "b"
71,677, // "e"
72,677, // "h"
73,677, // "t"
74,677, // "w"
75,635, // letter128
76,154, // {199..218 231..250}
77,154, // {193..198 225..230}
79,164, // {"1".."9"}
80,393, // "0"
81,489, // digit128
82,1107, // {176..185}
86,975, // "#"
90,846, // "("
92,662, // "{"
94,17, // "-"
  }
,
{ // state 268
71,994, // "e"
  }
,
{ // state 269
MIN_REDUCTION+134, // (default reduction)
  }
,
{ // state 270
2,758, // ws*
  }
,
{ // state 271
7,19, // ID
16,812, // `void
20,737, // <type>
27,10, // `int
28,171, // `boolean
59,779, // letter
60,677, // "p"
61,677, // "v"
62,677, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q" "s" "y".."z"}
63,677, // "c"
64,677, // "i"
65,677, // "l"
66,677, // "o"
67,677, // "r"
68,677, // "u"
69,677, // "x"
70,677, // "b"
71,677, // "e"
72,677, // "h"
73,677, // "t"
74,677, // "w"
75,518, // letter128
76,1069, // {199..218 231..250}
77,1069, // {193..198 225..230}
86,832, // "#"
  }
,
{ // state 272
2,762, // ws*
  }
,
{ // state 273
7,100, // ID
17,734, // `(
20,389, // <type>
27,10, // `int
28,171, // `boolean
32,1035, // <stmt>
33,942, // <assign>
35,1098, // `{
38,368, // <local var decl>
39,834, // `if
40,158, // <expr>
43,138, // `while
45,1043, // <expr8>
46,127, // <expr7>
47,125, // <expr6>
48,130, // <expr5>
49,86, // <expr4>
51,210, // <expr3>
53,982, // <expr2>
54,792, // <cast expr>
55,625, // <unary expr>
56,656, // <expr1>
57,371, // `-
58,819, // INTLIT
59,376, // letter
60,677, // "p"
61,677, // "v"
62,677, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q" "s" "y".."z"}
63,677, // "c"
64,677, // "i"
65,677, // "l"
66,677, // "o"
67,677, // "r"
68,677, // "u"
69,677, // "x"
70,677, // "b"
71,677, // "e"
72,677, // "h"
73,677, // "t"
74,677, // "w"
75,635, // letter128
76,154, // {199..218 231..250}
77,154, // {193..198 225..230}
79,164, // {"1".."9"}
80,393, // "0"
81,489, // digit128
82,1107, // {176..185}
86,975, // "#"
90,846, // "("
92,662, // "{"
94,17, // "-"
  }
,
{ // state 274
MIN_REDUCTION+55, // (default reduction)
  }
,
{ // state 275
83,859, // ws
84,97, // " "
85,1093, // {10}
MIN_REDUCTION+78, // (default reduction)
  }
,
{ // state 276
30,MIN_REDUCTION+103, // `[
96,MIN_REDUCTION+103, // "["
MIN_REDUCTION+103, // (default reduction)
  }
,
{ // state 277
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 278
83,MIN_REDUCTION+54, // ws
84,MIN_REDUCTION+54, // " "
85,MIN_REDUCTION+54, // {10}
MIN_REDUCTION+54, // (default reduction)
  }
,
{ // state 279
17,300, // `(
90,785, // "("
  }
,
{ // state 280
MIN_REDUCTION+135, // (default reduction)
  }
,
{ // state 281
MIN_REDUCTION+39, // (default reduction)
  }
,
{ // state 282
MIN_REDUCTION+135, // (default reduction)
  }
,
{ // state 283
30,MIN_REDUCTION+49, // `[
96,MIN_REDUCTION+49, // "["
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 284
MIN_REDUCTION+54, // (default reduction)
  }
,
{ // state 285
2,964, // ws*
83,411, // ws
84,535, // " "
85,958, // {10}
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 286
MIN_REDUCTION+55, // (default reduction)
  }
,
{ // state 287
83,1082, // ws
84,870, // " "
85,486, // {10}
MIN_REDUCTION+84, // (default reduction)
  }
,
{ // state 288
MIN_REDUCTION+115, // (default reduction)
  }
,
{ // state 289
MIN_REDUCTION+53, // (default reduction)
  }
,
{ // state 290
MIN_REDUCTION+53, // (default reduction)
  }
,
{ // state 291
MIN_REDUCTION+54, // (default reduction)
  }
,
{ // state 292
29,751, // <empty bracket pair>
30,1148, // `[
41,383, // `)
91,565, // ")"
96,931, // "["
  }
,
{ // state 293
MIN_REDUCTION+122, // (default reduction)
  }
,
{ // state 294
MIN_REDUCTION+53, // (default reduction)
  }
,
{ // state 295
0x80000000|468, // match move
0x80000000|1056, // no-match move
0x80000000|85, // NT-test-match state for `else
  }
,
{ // state 296
2,802, // ws*
  }
,
{ // state 297
MIN_REDUCTION+54, // (default reduction)
  }
,
{ // state 298
30,MIN_REDUCTION+49, // `[
96,MIN_REDUCTION+49, // "["
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 299
30,MIN_REDUCTION+49, // `[
96,MIN_REDUCTION+49, // "["
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 300
7,1070, // ID
17,715, // `(
40,1024, // <expr>
45,1060, // <expr8>
46,111, // <expr7>
47,107, // <expr6>
48,114, // <expr5>
49,74, // <expr4>
51,335, // <expr3>
53,947, // <expr2>
54,775, // <cast expr>
55,805, // <unary expr>
56,638, // <expr1>
57,379, // `-
58,800, // INTLIT
59,1051, // letter
60,677, // "p"
61,677, // "v"
62,677, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q" "s" "y".."z"}
63,677, // "c"
64,677, // "i"
65,677, // "l"
66,677, // "o"
67,677, // "r"
68,677, // "u"
69,677, // "x"
70,677, // "b"
71,677, // "e"
72,677, // "h"
73,677, // "t"
74,677, // "w"
75,1092, // letter128
76,613, // {199..218 231..250}
77,613, // {193..198 225..230}
79,84, // {"1".."9"}
80,403, // "0"
81,506, // digit128
82,1101, // {176..185}
90,846, // "("
94,17, // "-"
  }
,
{ // state 301
0x80000000|1144, // match move
0x80000000|837, // no-match move
0x80000000|85, // NT-test-match state for `else
  }
,
{ // state 302
83,62, // ws
84,71, // " "
85,735, // {10}
MIN_REDUCTION+84, // (default reduction)
  }
,
{ // state 303
0x80000000|596, // match move
0x80000000|67, // no-match move
0x80000000|85, // NT-test-match state for `else
  }
,
{ // state 304
30,MIN_REDUCTION+49, // `[
96,MIN_REDUCTION+49, // "["
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 305
MIN_REDUCTION+39, // (default reduction)
  }
,
{ // state 306
MIN_REDUCTION+54, // (default reduction)
  }
,
{ // state 307
MIN_REDUCTION+39, // (default reduction)
  }
,
{ // state 308
7,100, // ID
17,734, // `(
20,389, // <type>
27,10, // `int
28,171, // `boolean
32,467, // <stmt>
33,908, // <assign>
35,593, // `{
38,18, // <local var decl>
39,1005, // `if
40,158, // <expr>
43,47, // `while
45,1043, // <expr8>
46,127, // <expr7>
47,125, // <expr6>
48,130, // <expr5>
49,86, // <expr4>
51,210, // <expr3>
53,982, // <expr2>
54,792, // <cast expr>
55,625, // <unary expr>
56,656, // <expr1>
57,371, // `-
58,819, // INTLIT
59,376, // letter
60,677, // "p"
61,677, // "v"
62,677, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q" "s" "y".."z"}
63,677, // "c"
64,677, // "i"
65,677, // "l"
66,677, // "o"
67,677, // "r"
68,677, // "u"
69,677, // "x"
70,677, // "b"
71,677, // "e"
72,677, // "h"
73,677, // "t"
74,677, // "w"
75,635, // letter128
76,154, // {199..218 231..250}
77,154, // {193..198 225..230}
79,164, // {"1".."9"}
80,393, // "0"
81,489, // digit128
82,1107, // {176..185}
86,975, // "#"
90,846, // "("
92,662, // "{"
94,17, // "-"
  }
,
{ // state 309
30,MIN_REDUCTION+106, // `[
83,42, // ws
84,137, // " "
85,543, // {10}
96,MIN_REDUCTION+106, // "["
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 310
34,177, // `;
99,375, // ";"
  }
,
{ // state 311
MIN_REDUCTION+54, // (default reduction)
  }
,
{ // state 312
MIN_REDUCTION+115, // (default reduction)
  }
,
{ // state 313
MIN_REDUCTION+135, // (default reduction)
  }
,
{ // state 314
MIN_REDUCTION+115, // (default reduction)
  }
,
{ // state 315
30,MIN_REDUCTION+117, // `[
96,MIN_REDUCTION+117, // "["
MIN_REDUCTION+117, // (default reduction)
  }
,
{ // state 316
2,211, // ws*
30,MIN_REDUCTION+95, // `[
83,75, // ws
84,137, // " "
85,543, // {10}
96,MIN_REDUCTION+95, // "["
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 317
30,MIN_REDUCTION+117, // `[
96,MIN_REDUCTION+117, // "["
MIN_REDUCTION+117, // (default reduction)
  }
,
{ // state 318
MIN_REDUCTION+23, // (default reduction)
  }
,
{ // state 319
73,134, // "t"
  }
,
{ // state 320
2,538, // ws*
83,555, // ws
84,606, // " "
85,274, // {10}
MIN_REDUCTION+65, // (default reduction)
  }
,
{ // state 321
MIN_REDUCTION+39, // (default reduction)
  }
,
{ // state 322
2,1018, // ws*
83,202, // ws
84,97, // " "
85,1093, // {10}
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 323
MIN_REDUCTION+114, // (default reduction)
  }
,
{ // state 324
MIN_REDUCTION+114, // (default reduction)
  }
,
{ // state 325
MIN_REDUCTION+25, // (default reduction)
  }
,
{ // state 326
83,418, // ws
84,560, // " "
85,151, // {10}
MIN_REDUCTION+70, // (default reduction)
  }
,
{ // state 327
7,96, // ID
17,731, // `(
40,534, // <expr>
45,1041, // <expr8>
46,131, // <expr7>
47,128, // <expr6>
48,126, // <expr5>
49,87, // <expr4>
51,213, // <expr3>
53,973, // <expr2>
54,794, // <cast expr>
55,624, // <unary expr>
56,657, // <expr1>
57,367, // `-
58,815, // INTLIT
59,1066, // letter
60,677, // "p"
61,677, // "v"
62,677, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q" "s" "y".."z"}
63,677, // "c"
64,677, // "i"
65,677, // "l"
66,677, // "o"
67,677, // "r"
68,677, // "u"
69,677, // "x"
70,677, // "b"
71,677, // "e"
72,677, // "h"
73,677, // "t"
74,677, // "w"
75,1105, // letter128
76,595, // {199..218 231..250}
77,595, // {193..198 225..230}
79,162, // {"1".."9"}
80,394, // "0"
81,491, // digit128
82,1108, // {176..185}
90,846, // "("
94,17, // "-"
  }
,
{ // state 328
MIN_REDUCTION+54, // (default reduction)
  }
,
{ // state 329
41,267, // `)
91,463, // ")"
  }
,
{ // state 330
41,996, // `)
91,463, // ")"
  }
,
{ // state 331
30,MIN_REDUCTION+117, // `[
96,MIN_REDUCTION+117, // "["
MIN_REDUCTION+117, // (default reduction)
  }
,
{ // state 332
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 333
7,100, // ID
17,734, // `(
20,389, // <type>
27,10, // `int
28,171, // `boolean
32,1035, // <stmt>
33,163, // <assign>
35,1017, // `{
38,786, // <local var decl>
39,22, // `if
40,158, // <expr>
43,790, // `while
45,1043, // <expr8>
46,127, // <expr7>
47,125, // <expr6>
48,130, // <expr5>
49,86, // <expr4>
51,210, // <expr3>
53,982, // <expr2>
54,792, // <cast expr>
55,625, // <unary expr>
56,656, // <expr1>
57,371, // `-
58,819, // INTLIT
59,376, // letter
60,677, // "p"
61,677, // "v"
62,677, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q" "s" "y".."z"}
63,677, // "c"
64,677, // "i"
65,677, // "l"
66,677, // "o"
67,677, // "r"
68,677, // "u"
69,677, // "x"
70,677, // "b"
71,677, // "e"
72,677, // "h"
73,677, // "t"
74,677, // "w"
75,635, // letter128
76,154, // {199..218 231..250}
77,154, // {193..198 225..230}
79,164, // {"1".."9"}
80,393, // "0"
81,489, // digit128
82,1107, // {176..185}
86,975, // "#"
90,846, // "("
92,662, // "{"
94,17, // "-"
  }
,
{ // state 334
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 335
52,747, // `*
89,768, // "*"
MIN_REDUCTION+38, // (default reduction)
  }
,
{ // state 336
65,1055, // "l"
  }
,
{ // state 337
MIN_REDUCTION+134, // (default reduction)
  }
,
{ // state 338
2,944, // ws*
83,957, // ws
84,843, // " "
85,750, // {10}
114,MIN_REDUCTION+95, // $NT
  }
,
{ // state 339
MIN_REDUCTION+115, // (default reduction)
  }
,
{ // state 340
MIN_REDUCTION+54, // (default reduction)
  }
,
{ // state 341
MIN_REDUCTION+102, // (default reduction)
  }
,
{ // state 342
0x80000000|1, // match move
0x80000000|863, // no-match move
0x80000000|36, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 343
7,100, // ID
17,734, // `(
20,389, // <type>
27,10, // `int
28,171, // `boolean
32,756, // <stmt>
33,908, // <assign>
35,593, // `{
38,18, // <local var decl>
39,1005, // `if
40,158, // <expr>
43,47, // `while
45,1043, // <expr8>
46,127, // <expr7>
47,125, // <expr6>
48,130, // <expr5>
49,86, // <expr4>
51,210, // <expr3>
53,982, // <expr2>
54,792, // <cast expr>
55,625, // <unary expr>
56,656, // <expr1>
57,371, // `-
58,819, // INTLIT
59,376, // letter
60,677, // "p"
61,677, // "v"
62,677, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q" "s" "y".."z"}
63,677, // "c"
64,677, // "i"
65,677, // "l"
66,677, // "o"
67,677, // "r"
68,677, // "u"
69,677, // "x"
70,677, // "b"
71,677, // "e"
72,677, // "h"
73,677, // "t"
74,677, // "w"
75,635, // letter128
76,154, // {199..218 231..250}
77,154, // {193..198 225..230}
79,164, // {"1".."9"}
80,393, // "0"
81,489, // digit128
82,1107, // {176..185}
86,975, // "#"
90,846, // "("
92,662, // "{"
94,17, // "-"
  }
,
{ // state 344
2,749, // ws*
83,1100, // ws
84,340, // " "
85,829, // {10}
MIN_REDUCTION+81, // (default reduction)
  }
,
{ // state 345
7,100, // ID
17,734, // `(
20,389, // <type>
27,10, // `int
28,171, // `boolean
32,995, // <stmt>
33,769, // <assign>
35,545, // `{
38,726, // <local var decl>
39,495, // `if
40,158, // <expr>
43,985, // `while
45,1043, // <expr8>
46,127, // <expr7>
47,125, // <expr6>
48,130, // <expr5>
49,86, // <expr4>
51,210, // <expr3>
53,982, // <expr2>
54,792, // <cast expr>
55,625, // <unary expr>
56,656, // <expr1>
57,371, // `-
58,819, // INTLIT
59,376, // letter
60,677, // "p"
61,677, // "v"
62,677, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q" "s" "y".."z"}
63,677, // "c"
64,677, // "i"
65,677, // "l"
66,677, // "o"
67,677, // "r"
68,677, // "u"
69,677, // "x"
70,677, // "b"
71,677, // "e"
72,677, // "h"
73,677, // "t"
74,677, // "w"
75,635, // letter128
76,154, // {199..218 231..250}
77,154, // {193..198 225..230}
79,164, // {"1".."9"}
80,393, // "0"
81,489, // digit128
82,1107, // {176..185}
86,975, // "#"
90,846, // "("
92,662, // "{"
94,17, // "-"
  }
,
{ // state 346
30,MIN_REDUCTION+106, // `[
83,27, // ws
84,110, // " "
85,523, // {10}
96,MIN_REDUCTION+106, // "["
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 347
30,MIN_REDUCTION+48, // `[
96,MIN_REDUCTION+48, // "["
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 348
0x80000000|730, // match move
0x80000000|514, // no-match move
0x80000000|85, // NT-test-match state for `else
  }
,
{ // state 349
30,MIN_REDUCTION+109, // `[
96,MIN_REDUCTION+109, // "["
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 350
7,79, // ID
55,821, // <unary expr>
56,700, // <expr1>
57,350, // `-
58,639, // INTLIT
59,1109, // letter
60,677, // "p"
61,677, // "v"
62,677, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q" "s" "y".."z"}
63,677, // "c"
64,677, // "i"
65,677, // "l"
66,677, // "o"
67,677, // "r"
68,677, // "u"
69,677, // "x"
70,677, // "b"
71,677, // "e"
72,677, // "h"
73,677, // "t"
74,677, // "w"
75,1131, // letter128
76,570, // {199..218 231..250}
77,570, // {193..198 225..230}
79,147, // {"1".."9"}
80,360, // "0"
81,533, // digit128
82,1120, // {176..185}
94,17, // "-"
  }
,
{ // state 351
83,417, // ws
84,284, // " "
85,885, // {10}
MIN_REDUCTION+66, // (default reduction)
  }
,
{ // state 352
69,913, // "x"
  }
,
{ // state 353
7,100, // ID
17,734, // `(
20,389, // <type>
27,10, // `int
28,171, // `boolean
32,984, // <stmt>
33,769, // <assign>
35,545, // `{
38,726, // <local var decl>
39,495, // `if
40,158, // <expr>
43,985, // `while
45,1043, // <expr8>
46,127, // <expr7>
47,125, // <expr6>
48,130, // <expr5>
49,86, // <expr4>
51,210, // <expr3>
53,982, // <expr2>
54,792, // <cast expr>
55,625, // <unary expr>
56,656, // <expr1>
57,371, // `-
58,819, // INTLIT
59,376, // letter
60,677, // "p"
61,677, // "v"
62,677, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q" "s" "y".."z"}
63,677, // "c"
64,677, // "i"
65,677, // "l"
66,677, // "o"
67,677, // "r"
68,677, // "u"
69,677, // "x"
70,677, // "b"
71,677, // "e"
72,677, // "h"
73,677, // "t"
74,677, // "w"
75,635, // letter128
76,154, // {199..218 231..250}
77,154, // {193..198 225..230}
79,164, // {"1".."9"}
80,393, // "0"
81,489, // digit128
82,1107, // {176..185}
86,434, // "#"
88,327, // `return
90,846, // "("
92,662, // "{"
94,17, // "-"
  }
,
{ // state 354
83,899, // ws
84,1026, // " "
85,286, // {10}
MIN_REDUCTION+142, // (default reduction)
  }
,
{ // state 355
30,MIN_REDUCTION+142, // `[
83,29, // ws
84,113, // " "
85,25, // {10}
96,MIN_REDUCTION+142, // "["
MIN_REDUCTION+142, // (default reduction)
  }
,
{ // state 356
MIN_REDUCTION+115, // (default reduction)
  }
,
{ // state 357
42,621, // `else
86,386, // "#"
  }
,
{ // state 358
30,MIN_REDUCTION+142, // `[
83,27, // ws
84,110, // " "
85,523, // {10}
96,MIN_REDUCTION+142, // "["
MIN_REDUCTION+142, // (default reduction)
  }
,
{ // state 359
41,721, // `)
91,463, // ")"
  }
,
{ // state 360
60,925, // "p"
61,925, // "v"
62,925, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q" "s" "y".."z"}
63,925, // "c"
64,925, // "i"
65,925, // "l"
66,925, // "o"
67,925, // "r"
68,925, // "u"
69,925, // "x"
70,925, // "b"
71,925, // "e"
72,925, // "h"
73,925, // "t"
74,925, // "w"
77,58, // {193..198 225..230}
79,925, // {"1".."9"}
80,925, // "0"
82,58, // {176..185}
104,512, // hexDigit*
105,757, // $$5
110,508, // hexDigit
111,469, // hexDigit128
  }
,
{ // state 361
83,62, // ws
84,71, // " "
85,735, // {10}
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 362
30,MIN_REDUCTION+106, // `[
83,29, // ws
84,113, // " "
85,25, // {10}
96,MIN_REDUCTION+106, // "["
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 363
2,1038, // ws*
83,202, // ws
84,97, // " "
85,1093, // {10}
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 364
MIN_REDUCTION+13, // (default reduction)
  }
,
{ // state 365
MIN_REDUCTION+13, // (default reduction)
  }
,
{ // state 366
MIN_REDUCTION+134, // (default reduction)
  }
,
{ // state 367
7,96, // ID
55,835, // <unary expr>
56,657, // <expr1>
57,367, // `-
58,815, // INTLIT
59,1066, // letter
60,677, // "p"
61,677, // "v"
62,677, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q" "s" "y".."z"}
63,677, // "c"
64,677, // "i"
65,677, // "l"
66,677, // "o"
67,677, // "r"
68,677, // "u"
69,677, // "x"
70,677, // "b"
71,677, // "e"
72,677, // "h"
73,677, // "t"
74,677, // "w"
75,1105, // letter128
76,595, // {199..218 231..250}
77,595, // {193..198 225..230}
79,162, // {"1".."9"}
80,394, // "0"
81,491, // digit128
82,1108, // {176..185}
94,17, // "-"
  }
,
{ // state 368
34,493, // `;
99,348, // ";"
  }
,
{ // state 369
2,684, // ws*
30,MIN_REDUCTION+143, // `[
83,34, // ws
84,105, // " "
85,20, // {10}
96,MIN_REDUCTION+143, // "["
MIN_REDUCTION+143, // (default reduction)
  }
,
{ // state 370
29,751, // <empty bracket pair>
30,1148, // `[
41,426, // `)
91,565, // ")"
96,931, // "["
  }
,
{ // state 371
7,93, // ID
55,840, // <unary expr>
56,656, // <expr1>
57,371, // `-
58,819, // INTLIT
59,1078, // letter
60,677, // "p"
61,677, // "v"
62,677, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q" "s" "y".."z"}
63,677, // "c"
64,677, // "i"
65,677, // "l"
66,677, // "o"
67,677, // "r"
68,677, // "u"
69,677, // "x"
70,677, // "b"
71,677, // "e"
72,677, // "h"
73,677, // "t"
74,677, // "w"
75,1102, // letter128
76,599, // {199..218 231..250}
77,599, // {193..198 225..230}
79,164, // {"1".."9"}
80,393, // "0"
81,489, // digit128
82,1107, // {176..185}
94,17, // "-"
  }
,
{ // state 372
2,452, // ws*
83,477, // ws
84,547, // " "
85,230, // {10}
MIN_REDUCTION+101, // (default reduction)
  }
,
{ // state 373
2,451, // ws*
83,478, // ws
84,549, // " "
85,228, // {10}
MIN_REDUCTION+101, // (default reduction)
  }
,
{ // state 374
0x80000000|98, // match move
0x80000000|760, // no-match move
0x80000000|85, // NT-test-match state for `else
  }
,
{ // state 375
2,50, // ws*
83,955, // ws
84,870, // " "
85,486, // {10}
MIN_REDUCTION+99, // (default reduction)
  }
,
{ // state 376
59,546, // letter
60,55, // "p"
61,55, // "v"
62,55, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q" "s" "y".."z"}
63,55, // "c"
64,55, // "i"
65,55, // "l"
66,55, // "o"
67,55, // "r"
68,55, // "u"
69,55, // "x"
70,55, // "b"
71,55, // "e"
72,55, // "h"
73,55, // "t"
74,55, // "w"
75,410, // letter128
76,154, // {199..218 231..250}
77,154, // {193..198 225..230}
78,219, // digit
79,185, // {"1".."9"}
80,185, // "0"
81,1075, // digit128
82,136, // {176..185}
100,377, // idChar*
101,1142, // $$3
106,401, // idChar
107,1077, // "_"
108,129, // idChar128
109,444, // {223}
  }
,
{ // state 377
59,546, // letter
60,55, // "p"
61,55, // "v"
62,55, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q" "s" "y".."z"}
63,55, // "c"
64,55, // "i"
65,55, // "l"
66,55, // "o"
67,55, // "r"
68,55, // "u"
69,55, // "x"
70,55, // "b"
71,55, // "e"
72,55, // "h"
73,55, // "t"
74,55, // "w"
75,410, // letter128
76,154, // {199..218 231..250}
77,154, // {193..198 225..230}
78,219, // digit
79,185, // {"1".."9"}
80,185, // "0"
81,1075, // digit128
82,136, // {176..185}
101,675, // $$3
106,1096, // idChar
107,1077, // "_"
108,129, // idChar128
109,444, // {223}
  }
,
{ // state 378
MIN_REDUCTION+134, // (default reduction)
  }
,
{ // state 379
7,1070, // ID
55,850, // <unary expr>
56,638, // <expr1>
57,379, // `-
58,800, // INTLIT
59,1051, // letter
60,677, // "p"
61,677, // "v"
62,677, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q" "s" "y".."z"}
63,677, // "c"
64,677, // "i"
65,677, // "l"
66,677, // "o"
67,677, // "r"
68,677, // "u"
69,677, // "x"
70,677, // "b"
71,677, // "e"
72,677, // "h"
73,677, // "t"
74,677, // "w"
75,1092, // letter128
76,613, // {199..218 231..250}
77,613, // {193..198 225..230}
79,84, // {"1".."9"}
80,403, // "0"
81,506, // digit128
82,1101, // {176..185}
94,17, // "-"
  }
,
{ // state 380
30,MIN_REDUCTION+142, // `[
83,5, // ws
84,105, // " "
85,20, // {10}
96,MIN_REDUCTION+142, // "["
MIN_REDUCTION+142, // (default reduction)
  }
,
{ // state 381
114,MIN_REDUCTION+134, // $NT
MIN_REDUCTION+134, // (default reduction)
  }
,
{ // state 382
MIN_REDUCTION+114, // (default reduction)
  }
,
{ // state 383
7,1070, // ID
17,715, // `(
54,214, // <cast expr>
56,482, // <expr1>
58,800, // INTLIT
59,1051, // letter
60,677, // "p"
61,677, // "v"
62,677, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q" "s" "y".."z"}
63,677, // "c"
64,677, // "i"
65,677, // "l"
66,677, // "o"
67,677, // "r"
68,677, // "u"
69,677, // "x"
70,677, // "b"
71,677, // "e"
72,677, // "h"
73,677, // "t"
74,677, // "w"
75,1092, // letter128
76,613, // {199..218 231..250}
77,613, // {193..198 225..230}
79,84, // {"1".."9"}
80,403, // "0"
81,506, // digit128
82,1101, // {176..185}
90,846, // "("
  }
,
{ // state 384
7,100, // ID
17,734, // `(
20,389, // <type>
27,10, // `int
28,171, // `boolean
32,1114, // <stmt>
33,810, // <assign>
35,488, // `{
36,612, // <stmt>*
37,194, // `}
38,310, // <local var decl>
39,3, // `if
40,158, // <expr>
43,1031, // `while
45,1043, // <expr8>
46,127, // <expr7>
47,125, // <expr6>
48,130, // <expr5>
49,86, // <expr4>
51,210, // <expr3>
53,982, // <expr2>
54,792, // <cast expr>
55,625, // <unary expr>
56,656, // <expr1>
57,371, // `-
58,819, // INTLIT
59,376, // letter
60,677, // "p"
61,677, // "v"
62,677, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q" "s" "y".."z"}
63,677, // "c"
64,677, // "i"
65,677, // "l"
66,677, // "o"
67,677, // "r"
68,677, // "u"
69,677, // "x"
70,677, // "b"
71,677, // "e"
72,677, // "h"
73,677, // "t"
74,677, // "w"
75,635, // letter128
76,154, // {199..218 231..250}
77,154, // {193..198 225..230}
79,164, // {"1".."9"}
80,393, // "0"
81,489, // digit128
82,1107, // {176..185}
86,975, // "#"
90,846, // "("
92,662, // "{"
93,828, // "}"
94,17, // "-"
  }
,
{ // state 385
83,MIN_REDUCTION+55, // ws
84,MIN_REDUCTION+55, // " "
85,MIN_REDUCTION+55, // {10}
MIN_REDUCTION+55, // (default reduction)
  }
,
{ // state 386
71,80, // "e"
  }
,
{ // state 387
2,4, // ws*
  }
,
{ // state 388
2,504, // ws*
MIN_REDUCTION+85, // (default reduction)
  }
,
{ // state 389
7,1037, // ID
29,56, // <empty bracket pair>
30,43, // `[
59,485, // letter
60,677, // "p"
61,677, // "v"
62,677, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q" "s" "y".."z"}
63,677, // "c"
64,677, // "i"
65,677, // "l"
66,677, // "o"
67,677, // "r"
68,677, // "u"
69,677, // "x"
70,677, // "b"
71,677, // "e"
72,677, // "h"
73,677, // "t"
74,677, // "w"
75,963, // letter128
76,912, // {199..218 231..250}
77,912, // {193..198 225..230}
96,931, // "["
  }
,
{ // state 390
MIN_REDUCTION+138, // (default reduction)
  }
,
{ // state 391
71,551, // "e"
  }
,
{ // state 392
2,354, // ws*
83,1090, // ws
84,1026, // " "
85,286, // {10}
MIN_REDUCTION+143, // (default reduction)
  }
,
{ // state 393
60,925, // "p"
61,925, // "v"
62,925, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q" "s" "y".."z"}
63,925, // "c"
64,925, // "i"
65,925, // "l"
66,925, // "o"
67,925, // "r"
68,925, // "u"
69,925, // "x"
70,925, // "b"
71,925, // "e"
72,925, // "h"
73,925, // "t"
74,925, // "w"
77,189, // {193..198 225..230}
79,925, // {"1".."9"}
80,925, // "0"
82,189, // {176..185}
104,454, // hexDigit*
105,682, // $$5
110,508, // hexDigit
111,501, // hexDigit128
  }
,
{ // state 394
60,925, // "p"
61,925, // "v"
62,925, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q" "s" "y".."z"}
63,925, // "c"
64,925, // "i"
65,925, // "l"
66,925, // "o"
67,925, // "r"
68,925, // "u"
69,925, // "x"
70,925, // "b"
71,925, // "e"
72,925, // "h"
73,925, // "t"
74,925, // "w"
77,190, // {193..198 225..230}
79,925, // {"1".."9"}
80,925, // "0"
82,190, // {176..185}
104,456, // hexDigit*
105,689, // $$5
110,508, // hexDigit
111,494, // hexDigit128
  }
,
{ // state 395
7,93, // ID
17,734, // `(
54,203, // <cast expr>
56,513, // <expr1>
58,819, // INTLIT
59,1078, // letter
60,677, // "p"
61,677, // "v"
62,677, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q" "s" "y".."z"}
63,677, // "c"
64,677, // "i"
65,677, // "l"
66,677, // "o"
67,677, // "r"
68,677, // "u"
69,677, // "x"
70,677, // "b"
71,677, // "e"
72,677, // "h"
73,677, // "t"
74,677, // "w"
75,1102, // letter128
76,599, // {199..218 231..250}
77,599, // {193..198 225..230}
79,164, // {"1".."9"}
80,393, // "0"
81,489, // digit128
82,1107, // {176..185}
90,846, // "("
  }
,
{ // state 396
MIN_REDUCTION+27, // (default reduction)
  }
,
{ // state 397
MIN_REDUCTION+55, // (default reduction)
  }
,
{ // state 398
2,82, // ws*
83,176, // ws
84,1012, // " "
85,699, // {10}
MIN_REDUCTION+85, // (default reduction)
  }
,
{ // state 399
29,751, // <empty bracket pair>
30,1148, // `[
41,395, // `)
91,565, // ")"
96,931, // "["
  }
,
{ // state 400
MIN_REDUCTION+19, // (default reduction)
  }
,
{ // state 401
MIN_REDUCTION+131, // (default reduction)
  }
,
{ // state 402
7,96, // ID
17,731, // `(
54,200, // <cast expr>
56,509, // <expr1>
58,815, // INTLIT
59,1066, // letter
60,677, // "p"
61,677, // "v"
62,677, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q" "s" "y".."z"}
63,677, // "c"
64,677, // "i"
65,677, // "l"
66,677, // "o"
67,677, // "r"
68,677, // "u"
69,677, // "x"
70,677, // "b"
71,677, // "e"
72,677, // "h"
73,677, // "t"
74,677, // "w"
75,1105, // letter128
76,595, // {199..218 231..250}
77,595, // {193..198 225..230}
79,162, // {"1".."9"}
80,394, // "0"
81,491, // digit128
82,1108, // {176..185}
90,846, // "("
  }
,
{ // state 403
60,925, // "p"
61,925, // "v"
62,925, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q" "s" "y".."z"}
63,925, // "c"
64,925, // "i"
65,925, // "l"
66,925, // "o"
67,925, // "r"
68,925, // "u"
69,925, // "x"
70,925, // "b"
71,925, // "e"
72,925, // "h"
73,925, // "t"
74,925, // "w"
77,198, // {193..198 225..230}
79,925, // {"1".."9"}
80,925, // "0"
82,198, // {176..185}
104,459, // hexDigit*
105,666, // $$5
110,508, // hexDigit
111,520, // hexDigit128
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
{ // state 404
29,751, // <empty bracket pair>
30,1148, // `[
41,402, // `)
91,565, // ")"
96,931, // "["
  }
,
{ // state 405
30,MIN_REDUCTION+106, // `[
83,5, // ws
84,105, // " "
85,20, // {10}
96,MIN_REDUCTION+106, // "["
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 406
2,48, // ws*
  }
,
{ // state 407
2,46, // ws*
  }
,
{ // state 408
MIN_REDUCTION+100, // (default reduction)
  }
,
{ // state 409
7,100, // ID
17,734, // `(
20,389, // <type>
27,10, // `int
28,171, // `boolean
32,696, // <stmt>
33,810, // <assign>
35,488, // `{
37,1003, // `}
38,310, // <local var decl>
39,3, // `if
40,158, // <expr>
43,1031, // `while
45,1043, // <expr8>
46,127, // <expr7>
47,125, // <expr6>
48,130, // <expr5>
49,86, // <expr4>
51,210, // <expr3>
53,982, // <expr2>
54,792, // <cast expr>
55,625, // <unary expr>
56,656, // <expr1>
57,371, // `-
58,819, // INTLIT
59,376, // letter
60,677, // "p"
61,677, // "v"
62,677, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q" "s" "y".."z"}
63,677, // "c"
64,677, // "i"
65,677, // "l"
66,677, // "o"
67,677, // "r"
68,677, // "u"
69,677, // "x"
70,677, // "b"
71,677, // "e"
72,677, // "h"
73,677, // "t"
74,677, // "w"
75,635, // letter128
76,154, // {199..218 231..250}
77,154, // {193..198 225..230}
79,164, // {"1".."9"}
80,393, // "0"
81,489, // digit128
82,1107, // {176..185}
86,975, // "#"
90,846, // "("
92,662, // "{"
93,572, // "}"
94,17, // "-"
  }
,
{ // state 410
0x80000000|521, // match move
0x80000000|874, // no-match move
0x80000000|36, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 411
MIN_REDUCTION+135, // (default reduction)
  }
,
{ // state 412
MIN_REDUCTION+21, // (default reduction)
  }
,
{ // state 413
MIN_REDUCTION+124, // (default reduction)
  }
,
{ // state 414
2,564, // ws*
  }
,
{ // state 415
MIN_REDUCTION+124, // (default reduction)
  }
,
{ // state 416
2,562, // ws*
  }
,
{ // state 417
MIN_REDUCTION+134, // (default reduction)
  }
,
{ // state 418
MIN_REDUCTION+134, // (default reduction)
  }
,
{ // state 419
59,546, // letter
60,55, // "p"
61,55, // "v"
62,55, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q" "s" "y".."z"}
63,55, // "c"
64,55, // "i"
65,55, // "l"
66,55, // "o"
67,55, // "r"
68,55, // "u"
69,55, // "x"
70,55, // "b"
71,55, // "e"
72,55, // "h"
73,55, // "t"
74,55, // "w"
75,667, // letter128
76,694, // {199..218 231..250}
77,694, // {193..198 225..230}
78,219, // digit
79,185, // {"1".."9"}
80,185, // "0"
81,752, // digit128
82,929, // {176..185}
100,801, // idChar*
101,991, // $$3
106,401, // idChar
107,1077, // "_"
108,102, // idChar128
109,875, // {223}
  }
,
{ // state 420
2,1121, // ws*
30,MIN_REDUCTION+101, // `[
83,251, // ws
84,8, // " "
85,691, // {10}
96,MIN_REDUCTION+101, // "["
MIN_REDUCTION+101, // (default reduction)
  }
,
{ // state 421
2,992, // ws*
83,1090, // ws
84,1026, // " "
85,286, // {10}
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 422
59,546, // letter
60,55, // "p"
61,55, // "v"
62,55, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q" "s" "y".."z"}
63,55, // "c"
64,55, // "i"
65,55, // "l"
66,55, // "o"
67,55, // "r"
68,55, // "u"
69,55, // "x"
70,55, // "b"
71,55, // "e"
72,55, // "h"
73,55, // "t"
74,55, // "w"
75,671, // letter128
76,695, // {199..218 231..250}
77,695, // {193..198 225..230}
78,219, // digit
79,185, // {"1".."9"}
80,185, // "0"
81,754, // digit128
82,946, // {176..185}
100,799, // idChar*
101,988, // $$3
106,401, // idChar
107,1077, // "_"
108,103, // idChar128
109,877, // {223}
  }
,
{ // state 423
2,1121, // ws*
MIN_REDUCTION+101, // (default reduction)
  }
,
{ // state 424
MIN_REDUCTION+134, // (default reduction)
  }
,
{ // state 425
MIN_REDUCTION+134, // (default reduction)
  }
,
{ // state 426
7,79, // ID
17,771, // `(
54,65, // <cast expr>
56,342, // <expr1>
58,639, // INTLIT
59,1109, // letter
60,677, // "p"
61,677, // "v"
62,677, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q" "s" "y".."z"}
63,677, // "c"
64,677, // "i"
65,677, // "l"
66,677, // "o"
67,677, // "r"
68,677, // "u"
69,677, // "x"
70,677, // "b"
71,677, // "e"
72,677, // "h"
73,677, // "t"
74,677, // "w"
75,1131, // letter128
76,570, // {199..218 231..250}
77,570, // {193..198 225..230}
79,147, // {"1".."9"}
80,360, // "0"
81,533, // digit128
82,1120, // {176..185}
90,846, // "("
  }
,
{ // state 427
MIN_REDUCTION+103, // (default reduction)
  }
,
{ // state 428
83,879, // ws
84,606, // " "
85,274, // {10}
MIN_REDUCTION+100, // (default reduction)
  }
,
{ // state 429
0x80000000|66, // match move
0x80000000|524, // no-match move
0x80000000|85, // NT-test-match state for `else
  }
,
{ // state 430
2,616, // ws*
  }
,
{ // state 431
2,504, // ws*
83,144, // ws
84,71, // " "
85,735, // {10}
MIN_REDUCTION+85, // (default reduction)
  }
,
{ // state 432
0x80000000|1, // match move
0x80000000|576, // no-match move
0x80000000|36, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 433
MIN_REDUCTION+134, // (default reduction)
  }
,
{ // state 434
64,132, // "i"
67,268, // "r"
70,121, // "b"
74,647, // "w"
87,458, // "+"
  }
,
{ // state 435
MIN_REDUCTION+134, // (default reduction)
  }
,
{ // state 436
7,100, // ID
17,734, // `(
20,389, // <type>
27,10, // `int
28,171, // `boolean
32,1054, // <stmt>
33,769, // <assign>
35,545, // `{
36,353, // <stmt>*
38,726, // <local var decl>
39,495, // `if
40,158, // <expr>
43,985, // `while
45,1043, // <expr8>
46,127, // <expr7>
47,125, // <expr6>
48,130, // <expr5>
49,86, // <expr4>
51,210, // <expr3>
53,982, // <expr2>
54,792, // <cast expr>
55,625, // <unary expr>
56,656, // <expr1>
57,371, // `-
58,819, // INTLIT
59,376, // letter
60,677, // "p"
61,677, // "v"
62,677, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q" "s" "y".."z"}
63,677, // "c"
64,677, // "i"
65,677, // "l"
66,677, // "o"
67,677, // "r"
68,677, // "u"
69,677, // "x"
70,677, // "b"
71,677, // "e"
72,677, // "h"
73,677, // "t"
74,677, // "w"
75,635, // letter128
76,154, // {199..218 231..250}
77,154, // {193..198 225..230}
79,164, // {"1".."9"}
80,393, // "0"
81,489, // digit128
82,1107, // {176..185}
86,434, // "#"
88,918, // `return
90,846, // "("
92,662, // "{"
94,17, // "-"
  }
,
{ // state 437
83,MIN_REDUCTION+55, // ws
84,MIN_REDUCTION+55, // " "
85,MIN_REDUCTION+55, // {10}
MIN_REDUCTION+55, // (default reduction)
  }
,
{ // state 438
MIN_REDUCTION+134, // (default reduction)
  }
,
{ // state 439
MIN_REDUCTION+55, // (default reduction)
  }
,
{ // state 440
2,287, // ws*
83,955, // ws
84,870, // " "
85,486, // {10}
MIN_REDUCTION+85, // (default reduction)
  }
,
{ // state 441
MIN_REDUCTION+55, // (default reduction)
  }
,
{ // state 442
64,132, // "i"
70,121, // "b"
  }
,
{ // state 443
41,308, // `)
91,463, // ")"
  }
,
{ // state 444
0x80000000|288, // match move
0x80000000|244, // no-match move
0x80000000|36, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 445
2,530, // ws*
83,280, // ws
84,537, // " "
85,224, // {10}
MIN_REDUCTION+101, // (default reduction)
  }
,
{ // state 446
83,424, // ws
84,306, // " "
85,873, // {10}
MIN_REDUCTION+142, // (default reduction)
  }
,
{ // state 447
30,MIN_REDUCTION+109, // `[
96,MIN_REDUCTION+109, // "["
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 448
83,1080, // ws
84,878, // " "
85,439, // {10}
MIN_REDUCTION+78, // (default reduction)
  }
,
{ // state 449
2,528, // ws*
83,282, // ws
84,539, // " "
85,222, // {10}
MIN_REDUCTION+101, // (default reduction)
  }
,
{ // state 450
30,MIN_REDUCTION+48, // `[
96,MIN_REDUCTION+48, // "["
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 451
83,590, // ws
84,549, // " "
85,228, // {10}
MIN_REDUCTION+100, // (default reduction)
  }
,
{ // state 452
83,592, // ws
84,547, // " "
85,230, // {10}
MIN_REDUCTION+100, // (default reduction)
  }
,
{ // state 453
83,1081, // ws
84,881, // " "
85,441, // {10}
MIN_REDUCTION+78, // (default reduction)
  }
,
{ // state 454
60,925, // "p"
61,925, // "v"
62,925, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q" "s" "y".."z"}
63,925, // "c"
64,925, // "i"
65,925, // "l"
66,925, // "o"
67,925, // "r"
68,925, // "u"
69,925, // "x"
70,925, // "b"
71,925, // "e"
72,925, // "h"
73,925, // "t"
74,925, // "w"
77,189, // {193..198 225..230}
79,925, // {"1".."9"}
80,925, // "0"
82,189, // {176..185}
105,680, // $$5
110,628, // hexDigit
111,501, // hexDigit128
  }
,
{ // state 455
83,MIN_REDUCTION+54, // ws
84,MIN_REDUCTION+54, // " "
85,MIN_REDUCTION+54, // {10}
MIN_REDUCTION+54, // (default reduction)
  }
,
{ // state 456
60,925, // "p"
61,925, // "v"
62,925, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q" "s" "y".."z"}
63,925, // "c"
64,925, // "i"
65,925, // "l"
66,925, // "o"
67,925, // "r"
68,925, // "u"
69,925, // "x"
70,925, // "b"
71,925, // "e"
72,925, // "h"
73,925, // "t"
74,925, // "w"
77,190, // {193..198 225..230}
79,925, // {"1".."9"}
80,925, // "0"
82,190, // {176..185}
105,672, // $$5
110,628, // hexDigit
111,494, // hexDigit128
  }
,
{ // state 457
MIN_REDUCTION+134, // (default reduction)
  }
,
{ // state 458
2,472, // ws*
83,1137, // ws
84,284, // " "
85,885, // {10}
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 459
60,925, // "p"
61,925, // "v"
62,925, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q" "s" "y".."z"}
63,925, // "c"
64,925, // "i"
65,925, // "l"
66,925, // "o"
67,925, // "r"
68,925, // "u"
69,925, // "x"
70,925, // "b"
71,925, // "e"
72,925, // "h"
73,925, // "t"
74,925, // "w"
77,198, // {193..198 225..230}
79,925, // {"1".."9"}
80,925, // "0"
82,198, // {176..185}
105,690, // $$5
110,628, // hexDigit
111,520, // hexDigit128
  }
,
{ // state 460
MIN_REDUCTION+134, // (default reduction)
  }
,
{ // state 461
2,529, // ws*
83,555, // ws
84,606, // " "
85,274, // {10}
MIN_REDUCTION+57, // (default reduction)
  }
,
{ // state 462
83,526, // ws
84,581, // " "
85,1134, // {10}
MIN_REDUCTION+80, // (default reduction)
  }
,
{ // state 463
2,943, // ws*
83,580, // ws
84,560, // " "
85,151, // {10}
MIN_REDUCTION+81, // (default reduction)
  }
,
{ // state 464
83,460, // ws
84,297, // " "
85,869, // {10}
MIN_REDUCTION+142, // (default reduction)
  }
,
{ // state 465
30,MIN_REDUCTION+109, // `[
96,MIN_REDUCTION+109, // "["
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 466
30,MIN_REDUCTION+109, // `[
96,MIN_REDUCTION+109, // "["
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 467
0x80000000|468, // match move
0x80000000|40, // no-match move
0x80000000|85, // NT-test-match state for `else
  }
,
{ // state 468
MIN_REDUCTION+28, // (default reduction)
  }
,
{ // state 469
0x80000000|430, // match move
0x80000000|939, // no-match move
0x80000000|36, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 470
41,1011, // `)
91,463, // ")"
  }
,
{ // state 471
30,MIN_REDUCTION+48, // `[
96,MIN_REDUCTION+48, // "["
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 472
83,417, // ws
84,284, // " "
85,885, // {10}
MIN_REDUCTION+68, // (default reduction)
  }
,
{ // state 473
2,586, // ws*
  }
,
{ // state 474
0x80000000|719, // match move
0x80000000|38, // no-match move
0x80000000|85, // NT-test-match state for `else
  }
,
{ // state 475
30,MIN_REDUCTION+48, // `[
96,MIN_REDUCTION+48, // "["
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 476
2,563, // ws*
83,940, // ws
84,688, // " "
85,30, // {10}
MIN_REDUCTION+85, // (default reduction)
  }
,
{ // state 477
MIN_REDUCTION+135, // (default reduction)
  }
,
{ // state 478
MIN_REDUCTION+135, // (default reduction)
  }
,
{ // state 479
113,MIN_REDUCTION+0, // $
  }
,
{ // state 480
83,MIN_REDUCTION+134, // ws
84,MIN_REDUCTION+134, // " "
85,MIN_REDUCTION+134, // {10}
MIN_REDUCTION+134, // (default reduction)
  }
,
{ // state 481
MIN_REDUCTION+17, // (default reduction)
  }
,
{ // state 482
0x80000000|1, // match move
0x80000000|951, // no-match move
0x80000000|36, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 483
2,674, // ws*
  }
,
{ // state 484
59,546, // letter
60,55, // "p"
61,55, // "v"
62,55, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q" "s" "y".."z"}
63,55, // "c"
64,55, // "i"
65,55, // "l"
66,55, // "o"
67,55, // "r"
68,55, // "u"
69,55, // "x"
70,55, // "b"
71,55, // "e"
72,55, // "h"
73,55, // "t"
74,55, // "w"
75,13, // letter128
76,921, // {199..218 231..250}
77,921, // {193..198 225..230}
78,219, // digit
79,185, // {"1".."9"}
80,185, // "0"
81,1123, // digit128
82,257, // {176..185}
100,770, // idChar*
101,619, // $$3
106,401, // idChar
107,1077, // "_"
108,978, // idChar128
109,314, // {223}
  }
,
{ // state 485
59,546, // letter
60,55, // "p"
61,55, // "v"
62,55, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q" "s" "y".."z"}
63,55, // "c"
64,55, // "i"
65,55, // "l"
66,55, // "o"
67,55, // "r"
68,55, // "u"
69,55, // "x"
70,55, // "b"
71,55, // "e"
72,55, // "h"
73,55, // "t"
74,55, // "w"
75,6, // letter128
76,912, // {199..218 231..250}
77,912, // {193..198 225..230}
78,219, // digit
79,185, // {"1".."9"}
80,185, // "0"
81,1124, // digit128
82,256, // {176..185}
100,764, // idChar*
101,617, // $$3
106,401, // idChar
107,1077, // "_"
108,974, // idChar128
109,312, // {223}
  }
,
{ // state 486
MIN_REDUCTION+55, // (default reduction)
  }
,
{ // state 487
MIN_REDUCTION+11, // (default reduction)
  }
,
{ // state 488
7,100, // ID
17,734, // `(
20,389, // <type>
27,10, // `int
28,171, // `boolean
32,1114, // <stmt>
33,810, // <assign>
35,488, // `{
36,827, // <stmt>*
37,172, // `}
38,310, // <local var decl>
39,3, // `if
40,158, // <expr>
43,1031, // `while
45,1043, // <expr8>
46,127, // <expr7>
47,125, // <expr6>
48,130, // <expr5>
49,86, // <expr4>
51,210, // <expr3>
53,982, // <expr2>
54,792, // <cast expr>
55,625, // <unary expr>
56,656, // <expr1>
57,371, // `-
58,819, // INTLIT
59,376, // letter
60,677, // "p"
61,677, // "v"
62,677, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q" "s" "y".."z"}
63,677, // "c"
64,677, // "i"
65,677, // "l"
66,677, // "o"
67,677, // "r"
68,677, // "u"
69,677, // "x"
70,677, // "b"
71,677, // "e"
72,677, // "h"
73,677, // "t"
74,677, // "w"
75,635, // letter128
76,154, // {199..218 231..250}
77,154, // {193..198 225..230}
79,164, // {"1".."9"}
80,393, // "0"
81,489, // digit128
82,1107, // {176..185}
86,975, // "#"
90,846, // "("
92,662, // "{"
93,440, // "}"
94,17, // "-"
  }
,
{ // state 489
0x80000000|497, // match move
0x80000000|702, // no-match move
0x80000000|36, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 490
MIN_REDUCTION+27, // (default reduction)
  }
,
{ // state 491
0x80000000|496, // match move
0x80000000|683, // no-match move
0x80000000|36, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 492
MIN_REDUCTION+134, // (default reduction)
  }
,
{ // state 493
0x80000000|1144, // match move
0x80000000|220, // no-match move
0x80000000|85, // NT-test-match state for `else
  }
,
{ // state 494
0x80000000|416, // match move
0x80000000|904, // no-match move
0x80000000|36, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 495
17,1001, // `(
90,785, // "("
  }
,
{ // state 496
2,627, // ws*
  }
,
{ // state 497
2,623, // ws*
  }
,
{ // state 498
7,364, // ID
29,56, // <empty bracket pair>
30,43, // `[
59,119, // letter
60,677, // "p"
61,677, // "v"
62,677, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q" "s" "y".."z"}
63,677, // "c"
64,677, // "i"
65,677, // "l"
66,677, // "o"
67,677, // "r"
68,677, // "u"
69,677, // "x"
70,677, // "b"
71,677, // "e"
72,677, // "h"
73,677, // "t"
74,677, // "w"
75,449, // letter128
76,703, // {199..218 231..250}
77,703, // {193..198 225..230}
96,931, // "["
  }
,
{ // state 499
2,774, // ws*
30,MIN_REDUCTION+145, // `[
83,34, // ws
84,105, // " "
85,20, // {10}
96,MIN_REDUCTION+145, // "["
MIN_REDUCTION+145, // (default reduction)
  }
,
{ // state 500
7,365, // ID
29,56, // <empty bracket pair>
30,43, // `[
59,122, // letter
60,677, // "p"
61,677, // "v"
62,677, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q" "s" "y".."z"}
63,677, // "c"
64,677, // "i"
65,677, // "l"
66,677, // "o"
67,677, // "r"
68,677, // "u"
69,677, // "x"
70,677, // "b"
71,677, // "e"
72,677, // "h"
73,677, // "t"
74,677, // "w"
75,445, // letter128
76,704, // {199..218 231..250}
77,704, // {193..198 225..230}
96,931, // "["
  }
,
{ // state 501
0x80000000|414, // match move
0x80000000|895, // no-match move
0x80000000|36, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 502
MIN_REDUCTION+103, // (default reduction)
  }
,
{ // state 503
41,866, // `)
91,463, // ")"
  }
,
{ // state 504
0x80000000|1079, // match move
0x80000000|124, // no-match move
0x80000000|85, // NT-test-match state for `else
  }
,
{ // state 505
2,558, // ws*
  }
,
{ // state 506
0x80000000|505, // match move
0x80000000|652, // no-match move
0x80000000|36, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 507
MIN_REDUCTION+27, // (default reduction)
  }
,
{ // state 508
MIN_REDUCTION+127, // (default reduction)
  }
,
{ // state 509
0x80000000|1, // match move
0x80000000|902, // no-match move
0x80000000|36, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 510
30,MIN_REDUCTION+117, // `[
96,MIN_REDUCTION+117, // "["
MIN_REDUCTION+117, // (default reduction)
  }
,
{ // state 511
30,MIN_REDUCTION+94, // `[
83,5, // ws
84,105, // " "
85,20, // {10}
96,MIN_REDUCTION+94, // "["
MIN_REDUCTION+94, // (default reduction)
  }
,
{ // state 512
60,925, // "p"
61,925, // "v"
62,925, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q" "s" "y".."z"}
63,925, // "c"
64,925, // "i"
65,925, // "l"
66,925, // "o"
67,925, // "r"
68,925, // "u"
69,925, // "x"
70,925, // "b"
71,925, // "e"
72,925, // "h"
73,925, // "t"
74,925, // "w"
77,58, // {193..198 225..230}
79,925, // {"1".."9"}
80,925, // "0"
82,58, // {176..185}
105,648, // $$5
110,628, // hexDigit
111,469, // hexDigit128
  }
,
{ // state 513
0x80000000|1, // match move
0x80000000|905, // no-match move
0x80000000|36, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 514
2,474, // ws*
83,940, // ws
84,688, // " "
85,30, // {10}
MIN_REDUCTION+99, // (default reduction)
  }
,
{ // state 515
59,546, // letter
60,55, // "p"
61,55, // "v"
62,55, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q" "s" "y".."z"}
63,55, // "c"
64,55, // "i"
65,55, // "l"
66,55, // "o"
67,55, // "r"
68,55, // "u"
69,55, // "x"
70,55, // "b"
71,55, // "e"
72,55, // "h"
73,55, // "t"
74,55, // "w"
75,1053, // letter128
76,643, // {199..218 231..250}
77,643, // {193..198 225..230}
78,219, // digit
79,185, // {"1".."9"}
80,185, // "0"
81,965, // digit128
82,289, // {176..185}
100,763, // idChar*
101,502, // $$3
106,401, // idChar
107,1077, // "_"
108,242, // idChar128
109,645, // {223}
  }
,
{ // state 516
MIN_REDUCTION+102, // (default reduction)
  }
,
{ // state 517
MIN_REDUCTION+102, // (default reduction)
  }
,
{ // state 518
2,428, // ws*
83,555, // ws
84,606, // " "
85,274, // {10}
MIN_REDUCTION+101, // (default reduction)
  }
,
{ // state 519
MIN_REDUCTION+24, // (default reduction)
  }
,
{ // state 520
0x80000000|473, // match move
0x80000000|920, // no-match move
0x80000000|36, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 521
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 522
7,1070, // ID
17,715, // `(
40,115, // <expr>
45,1060, // <expr8>
46,111, // <expr7>
47,107, // <expr6>
48,114, // <expr5>
49,74, // <expr4>
51,335, // <expr3>
53,947, // <expr2>
54,775, // <cast expr>
55,805, // <unary expr>
56,638, // <expr1>
57,379, // `-
58,800, // INTLIT
59,1051, // letter
60,677, // "p"
61,677, // "v"
62,677, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q" "s" "y".."z"}
63,677, // "c"
64,677, // "i"
65,677, // "l"
66,677, // "o"
67,677, // "r"
68,677, // "u"
69,677, // "x"
70,677, // "b"
71,677, // "e"
72,677, // "h"
73,677, // "t"
74,677, // "w"
75,1092, // letter128
76,613, // {199..218 231..250}
77,613, // {193..198 225..230}
79,84, // {"1".."9"}
80,403, // "0"
81,506, // digit128
82,1101, // {176..185}
90,846, // "("
94,17, // "-"
  }
,
{ // state 523
0x80000000|1, // match move
0x80000000|1138, // no-match move
0x80000000|36, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 524
2,601, // ws*
83,144, // ws
84,71, // " "
85,735, // {10}
MIN_REDUCTION+99, // (default reduction)
  }
,
{ // state 525
59,546, // letter
60,55, // "p"
61,55, // "v"
62,55, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q" "s" "y".."z"}
63,55, // "c"
64,55, // "i"
65,55, // "l"
66,55, // "o"
67,55, // "r"
68,55, // "u"
69,55, // "x"
70,55, // "b"
71,55, // "e"
72,55, // "h"
73,55, // "t"
74,55, // "w"
75,120, // letter128
76,889, // {199..218 231..250}
77,889, // {193..198 225..230}
78,219, // digit
79,185, // {"1".."9"}
80,185, // "0"
81,1118, // digit128
82,294, // {176..185}
100,782, // idChar*
101,582, // $$3
106,401, // idChar
107,1077, // "_"
108,989, // idChar128
109,339, // {223}
  }
,
{ // state 526
MIN_REDUCTION+134, // (default reduction)
  }
,
{ // state 527
7,100, // ID
17,734, // `(
20,389, // <type>
27,10, // `int
28,171, // `boolean
32,696, // <stmt>
33,810, // <assign>
35,488, // `{
37,692, // `}
38,310, // <local var decl>
39,3, // `if
40,158, // <expr>
43,1031, // `while
45,1043, // <expr8>
46,127, // <expr7>
47,125, // <expr6>
48,130, // <expr5>
49,86, // <expr4>
51,210, // <expr3>
53,982, // <expr2>
54,792, // <cast expr>
55,625, // <unary expr>
56,656, // <expr1>
57,371, // `-
58,819, // INTLIT
59,376, // letter
60,677, // "p"
61,677, // "v"
62,677, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q" "s" "y".."z"}
63,677, // "c"
64,677, // "i"
65,677, // "l"
66,677, // "o"
67,677, // "r"
68,677, // "u"
69,677, // "x"
70,677, // "b"
71,677, // "e"
72,677, // "h"
73,677, // "t"
74,677, // "w"
75,635, // letter128
76,154, // {199..218 231..250}
77,154, // {193..198 225..230}
79,164, // {"1".."9"}
80,393, // "0"
81,489, // digit128
82,1107, // {176..185}
86,975, // "#"
90,846, // "("
92,662, // "{"
93,249, // "}"
94,17, // "-"
  }
,
{ // state 528
83,848, // ws
84,539, // " "
85,222, // {10}
MIN_REDUCTION+100, // (default reduction)
  }
,
{ // state 529
83,879, // ws
84,606, // " "
85,274, // {10}
MIN_REDUCTION+56, // (default reduction)
  }
,
{ // state 530
83,849, // ws
84,537, // " "
85,224, // {10}
MIN_REDUCTION+100, // (default reduction)
  }
,
{ // state 531
83,49, // ws
84,1097, // " "
85,90, // {10}
MIN_REDUCTION+58, // (default reduction)
  }
,
{ // state 532
7,1070, // ID
17,715, // `(
40,1004, // <expr>
45,1060, // <expr8>
46,111, // <expr7>
47,107, // <expr6>
48,114, // <expr5>
49,74, // <expr4>
51,335, // <expr3>
53,947, // <expr2>
54,775, // <cast expr>
55,805, // <unary expr>
56,638, // <expr1>
57,379, // `-
58,800, // INTLIT
59,1051, // letter
60,677, // "p"
61,677, // "v"
62,677, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q" "s" "y".."z"}
63,677, // "c"
64,677, // "i"
65,677, // "l"
66,677, // "o"
67,677, // "r"
68,677, // "u"
69,677, // "x"
70,677, // "b"
71,677, // "e"
72,677, // "h"
73,677, // "t"
74,677, // "w"
75,1092, // letter128
76,613, // {199..218 231..250}
77,613, // {193..198 225..230}
79,84, // {"1".."9"}
80,403, // "0"
81,506, // digit128
82,1101, // {176..185}
90,846, // "("
94,17, // "-"
  }
,
{ // state 533
0x80000000|483, // match move
0x80000000|727, // no-match move
0x80000000|36, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 534
34,842, // `;
99,818, // ";"
  }
,
{ // state 535
MIN_REDUCTION+54, // (default reduction)
  }
,
{ // state 536
30,MIN_REDUCTION+94, // `[
83,29, // ws
84,113, // " "
85,25, // {10}
96,MIN_REDUCTION+94, // "["
MIN_REDUCTION+94, // (default reduction)
  }
,
{ // state 537
MIN_REDUCTION+54, // (default reduction)
  }
,
{ // state 538
83,879, // ws
84,606, // " "
85,274, // {10}
MIN_REDUCTION+64, // (default reduction)
  }
,
{ // state 539
MIN_REDUCTION+54, // (default reduction)
  }
,
{ // state 540
30,MIN_REDUCTION+94, // `[
83,27, // ws
84,110, // " "
85,523, // {10}
96,MIN_REDUCTION+94, // "["
MIN_REDUCTION+94, // (default reduction)
  }
,
{ // state 541
59,546, // letter
60,55, // "p"
61,55, // "v"
62,55, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q" "s" "y".."z"}
63,55, // "c"
64,55, // "i"
65,55, // "l"
66,55, // "o"
67,55, // "r"
68,55, // "u"
69,55, // "x"
70,55, // "b"
71,55, // "e"
72,55, // "h"
73,55, // "t"
74,55, // "w"
75,140, // letter128
76,896, // {199..218 231..250}
77,896, // {193..198 225..230}
78,219, // digit
79,185, // {"1".."9"}
80,185, // "0"
81,35, // digit128
82,290, // {176..185}
100,795, // idChar*
101,561, // $$3
106,401, // idChar
107,1077, // "_"
108,1025, // idChar128
109,356, // {223}
  }
,
{ // state 542
83,492, // ws
84,328, // " "
85,826, // {10}
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 543
0x80000000|1, // match move
0x80000000|1145, // no-match move
0x80000000|36, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 544
MIN_REDUCTION+24, // (default reduction)
  }
,
{ // state 545
7,100, // ID
17,734, // `(
20,389, // <type>
27,10, // `int
28,171, // `boolean
32,1114, // <stmt>
33,810, // <assign>
35,488, // `{
36,233, // <stmt>*
37,630, // `}
38,310, // <local var decl>
39,3, // `if
40,158, // <expr>
43,1031, // `while
45,1043, // <expr8>
46,127, // <expr7>
47,125, // <expr6>
48,130, // <expr5>
49,86, // <expr4>
51,210, // <expr3>
53,982, // <expr2>
54,792, // <cast expr>
55,625, // <unary expr>
56,656, // <expr1>
57,371, // `-
58,819, // INTLIT
59,376, // letter
60,677, // "p"
61,677, // "v"
62,677, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q" "s" "y".."z"}
63,677, // "c"
64,677, // "i"
65,677, // "l"
66,677, // "o"
67,677, // "r"
68,677, // "u"
69,677, // "x"
70,677, // "b"
71,677, // "e"
72,677, // "h"
73,677, // "t"
74,677, // "w"
75,635, // letter128
76,154, // {199..218 231..250}
77,154, // {193..198 225..230}
79,164, // {"1".."9"}
80,393, // "0"
81,489, // digit128
82,1107, // {176..185}
86,975, // "#"
90,846, // "("
92,662, // "{"
93,83, // "}"
94,17, // "-"
  }
,
{ // state 546
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 547
MIN_REDUCTION+54, // (default reduction)
  }
,
{ // state 548
66,1062, // "o"
  }
,
{ // state 549
MIN_REDUCTION+54, // (default reduction)
  }
,
{ // state 550
5,1022, // <extends ID>
6,1110, // `extends
10,891, // <extends ID>?
11,206, // $$0
35,698, // `{
86,748, // "#"
92,94, // "{"
  }
,
{ // state 551
65,1112, // "l"
  }
,
{ // state 552
30,MIN_REDUCTION+135, // `[
96,MIN_REDUCTION+135, // "["
MIN_REDUCTION+135, // (default reduction)
  }
,
{ // state 553
MIN_REDUCTION+9, // (default reduction)
  }
,
{ // state 554
17,736, // `(
90,936, // "("
  }
,
{ // state 555
MIN_REDUCTION+135, // (default reduction)
  }
,
{ // state 556
7,1030, // ID
29,56, // <empty bracket pair>
30,43, // `[
59,484, // letter
60,677, // "p"
61,677, // "v"
62,677, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q" "s" "y".."z"}
63,677, // "c"
64,677, // "i"
65,677, // "l"
66,677, // "o"
67,677, // "r"
68,677, // "u"
69,677, // "x"
70,677, // "b"
71,677, // "e"
72,677, // "h"
73,677, // "t"
74,677, // "w"
75,926, // letter128
76,921, // {199..218 231..250}
77,921, // {193..198 225..230}
96,931, // "["
  }
,
{ // state 557
7,1070, // ID
17,715, // `(
40,470, // <expr>
45,1060, // <expr8>
46,111, // <expr7>
47,107, // <expr6>
48,114, // <expr5>
49,74, // <expr4>
51,335, // <expr3>
53,947, // <expr2>
54,775, // <cast expr>
55,805, // <unary expr>
56,638, // <expr1>
57,379, // `-
58,800, // INTLIT
59,1051, // letter
60,677, // "p"
61,677, // "v"
62,677, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q" "s" "y".."z"}
63,677, // "c"
64,677, // "i"
65,677, // "l"
66,677, // "o"
67,677, // "r"
68,677, // "u"
69,677, // "x"
70,677, // "b"
71,677, // "e"
72,677, // "h"
73,677, // "t"
74,677, // "w"
75,1092, // letter128
76,613, // {199..218 231..250}
77,613, // {193..198 225..230}
79,84, // {"1".."9"}
80,403, // "0"
81,506, // digit128
82,1101, // {176..185}
90,846, // "("
94,17, // "-"
  }
,
{ // state 558
0x80000000|1, // match move
0x80000000|405, // no-match move
0x80000000|36, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 559
30,MIN_REDUCTION+113, // `[
96,MIN_REDUCTION+113, // "["
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 560
MIN_REDUCTION+54, // (default reduction)
  }
,
{ // state 561
MIN_REDUCTION+103, // (default reduction)
  }
,
{ // state 562
0x80000000|1, // match move
0x80000000|626, // no-match move
0x80000000|36, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 563
0x80000000|1079, // match move
0x80000000|930, // no-match move
0x80000000|85, // NT-test-match state for `else
  }
,
{ // state 564
0x80000000|1, // match move
0x80000000|622, // no-match move
0x80000000|36, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 565
2,462, // ws*
83,681, // ws
84,581, // " "
85,1134, // {10}
MIN_REDUCTION+81, // (default reduction)
  }
,
{ // state 566
31,1135, // `]
97,966, // "]"
  }
,
{ // state 567
0x80000000|1, // match move
0x80000000|450, // no-match move
0x80000000|36, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 568
30,MIN_REDUCTION+94, // `[
83,42, // ws
84,137, // " "
85,543, // {10}
96,MIN_REDUCTION+94, // "["
MIN_REDUCTION+94, // (default reduction)
  }
,
{ // state 569
30,MIN_REDUCTION+135, // `[
96,MIN_REDUCTION+135, // "["
MIN_REDUCTION+135, // (default reduction)
  }
,
{ // state 570
0x80000000|277, // match move
0x80000000|116, // no-match move
0x80000000|36, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 571
31,1125, // `]
97,962, // "]"
  }
,
{ // state 572
0x80000000|388, // match move
0x80000000|431, // no-match move
0x80000000|85, // NT-test-match state for `else
  }
,
{ // state 573
31,1128, // `]
97,954, // "]"
  }
,
{ // state 574
MIN_REDUCTION+18, // (default reduction)
  }
,
{ // state 575
30,MIN_REDUCTION+113, // `[
96,MIN_REDUCTION+113, // "["
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 576
30,MIN_REDUCTION+105, // `[
96,MIN_REDUCTION+105, // "["
MIN_REDUCTION+105, // (default reduction)
  }
,
{ // state 577
30,MIN_REDUCTION+113, // `[
96,MIN_REDUCTION+113, // "["
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 578
7,1070, // ID
17,715, // `(
40,329, // <expr>
45,1060, // <expr8>
46,111, // <expr7>
47,107, // <expr6>
48,114, // <expr5>
49,74, // <expr4>
51,335, // <expr3>
53,947, // <expr2>
54,775, // <cast expr>
55,805, // <unary expr>
56,638, // <expr1>
57,379, // `-
58,800, // INTLIT
59,1051, // letter
60,677, // "p"
61,677, // "v"
62,677, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q" "s" "y".."z"}
63,677, // "c"
64,677, // "i"
65,677, // "l"
66,677, // "o"
67,677, // "r"
68,677, // "u"
69,677, // "x"
70,677, // "b"
71,677, // "e"
72,677, // "h"
73,677, // "t"
74,677, // "w"
75,1092, // letter128
76,613, // {199..218 231..250}
77,613, // {193..198 225..230}
79,84, // {"1".."9"}
80,403, // "0"
81,506, // digit128
82,1101, // {176..185}
90,846, // "("
94,17, // "-"
  }
,
{ // state 579
MIN_REDUCTION+54, // (default reduction)
  }
,
{ // state 580
MIN_REDUCTION+135, // (default reduction)
  }
,
{ // state 581
MIN_REDUCTION+54, // (default reduction)
  }
,
{ // state 582
MIN_REDUCTION+103, // (default reduction)
  }
,
{ // state 583
30,MIN_REDUCTION+146, // `[
83,5, // ws
84,105, // " "
85,20, // {10}
96,MIN_REDUCTION+146, // "["
MIN_REDUCTION+146, // (default reduction)
  }
,
{ // state 584
MIN_REDUCTION+135, // (default reduction)
  }
,
{ // state 585
41,708, // `)
91,463, // ")"
  }
,
{ // state 586
0x80000000|1, // match move
0x80000000|583, // no-match move
0x80000000|36, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 587
30,MIN_REDUCTION+135, // `[
96,MIN_REDUCTION+135, // "["
MIN_REDUCTION+135, // (default reduction)
  }
,
{ // state 588
MIN_REDUCTION+55, // (default reduction)
  }
,
{ // state 589
114,MIN_REDUCTION+21, // $NT
  }
,
{ // state 590
MIN_REDUCTION+134, // (default reduction)
  }
,
{ // state 591
MIN_REDUCTION+114, // (default reduction)
  }
,
{ // state 592
MIN_REDUCTION+134, // (default reduction)
  }
,
{ // state 593
7,100, // ID
17,734, // `(
20,389, // <type>
27,10, // `int
28,171, // `boolean
32,1114, // <stmt>
33,810, // <assign>
35,488, // `{
36,237, // <stmt>*
37,186, // `}
38,310, // <local var decl>
39,3, // `if
40,158, // <expr>
43,1031, // `while
45,1043, // <expr8>
46,127, // <expr7>
47,125, // <expr6>
48,130, // <expr5>
49,86, // <expr4>
51,210, // <expr3>
53,982, // <expr2>
54,792, // <cast expr>
55,625, // <unary expr>
56,656, // <expr1>
57,371, // `-
58,819, // INTLIT
59,376, // letter
60,677, // "p"
61,677, // "v"
62,677, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q" "s" "y".."z"}
63,677, // "c"
64,677, // "i"
65,677, // "l"
66,677, // "o"
67,677, // "r"
68,677, // "u"
69,677, // "x"
70,677, // "b"
71,677, // "e"
72,677, // "h"
73,677, // "t"
74,677, // "w"
75,635, // letter128
76,154, // {199..218 231..250}
77,154, // {193..198 225..230}
79,164, // {"1".."9"}
80,393, // "0"
81,489, // digit128
82,1107, // {176..185}
86,975, // "#"
90,846, // "("
92,662, // "{"
93,24, // "}"
94,17, // "-"
  }
,
{ // state 594
30,MIN_REDUCTION+105, // `[
96,MIN_REDUCTION+105, // "["
MIN_REDUCTION+105, // (default reduction)
  }
,
{ // state 595
0x80000000|277, // match move
0x80000000|1034, // no-match move
0x80000000|36, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 596
42,238, // `else
86,386, // "#"
  }
,
{ // state 597
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 598
23,14, // <extra param>
24,229, // `,
98,1072, // ","
MIN_REDUCTION+15, // (default reduction)
  }
,
{ // state 599
0x80000000|277, // match move
0x80000000|141, // no-match move
0x80000000|36, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 600
23,15, // <extra param>
24,227, // `,
98,1072, // ","
MIN_REDUCTION+15, // (default reduction)
  }
,
{ // state 601
0x80000000|719, // match move
0x80000000|361, // no-match move
0x80000000|85, // NT-test-match state for `else
  }
,
{ // state 602
MIN_REDUCTION+102, // (default reduction)
  }
,
{ // state 603
31,567, // `]
97,922, // "]"
  }
,
{ // state 604
MIN_REDUCTION+102, // (default reduction)
  }
,
{ // state 605
30,MIN_REDUCTION+54, // `[
96,MIN_REDUCTION+54, // "["
MIN_REDUCTION+54, // (default reduction)
  }
,
{ // state 606
MIN_REDUCTION+54, // (default reduction)
  }
,
{ // state 607
0x80000000|1, // match move
0x80000000|884, // no-match move
0x80000000|36, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 608
30,MIN_REDUCTION+114, // `[
96,MIN_REDUCTION+114, // "["
MIN_REDUCTION+114, // (default reduction)
  }
,
{ // state 609
30,MIN_REDUCTION+113, // `[
96,MIN_REDUCTION+113, // "["
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 610
30,MIN_REDUCTION+105, // `[
96,MIN_REDUCTION+105, // "["
MIN_REDUCTION+105, // (default reduction)
  }
,
{ // state 611
MIN_REDUCTION+21, // (default reduction)
  }
,
{ // state 612
7,100, // ID
17,734, // `(
20,389, // <type>
27,10, // `int
28,171, // `boolean
32,696, // <stmt>
33,810, // <assign>
35,488, // `{
37,390, // `}
38,310, // <local var decl>
39,3, // `if
40,158, // <expr>
43,1031, // `while
45,1043, // <expr8>
46,127, // <expr7>
47,125, // <expr6>
48,130, // <expr5>
49,86, // <expr4>
51,210, // <expr3>
53,982, // <expr2>
54,792, // <cast expr>
55,625, // <unary expr>
56,656, // <expr1>
57,371, // `-
58,819, // INTLIT
59,376, // letter
60,677, // "p"
61,677, // "v"
62,677, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q" "s" "y".."z"}
63,677, // "c"
64,677, // "i"
65,677, // "l"
66,677, // "o"
67,677, // "r"
68,677, // "u"
69,677, // "x"
70,677, // "b"
71,677, // "e"
72,677, // "h"
73,677, // "t"
74,677, // "w"
75,635, // letter128
76,154, // {199..218 231..250}
77,154, // {193..198 225..230}
79,164, // {"1".."9"}
80,393, // "0"
81,489, // digit128
82,1107, // {176..185}
86,975, // "#"
90,846, // "("
92,662, // "{"
93,828, // "}"
94,17, // "-"
  }
,
{ // state 613
0x80000000|277, // match move
0x80000000|1045, // no-match move
0x80000000|36, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 614
30,MIN_REDUCTION+105, // `[
96,MIN_REDUCTION+105, // "["
MIN_REDUCTION+105, // (default reduction)
  }
,
{ // state 615
MIN_REDUCTION+53, // (default reduction)
  }
,
{ // state 616
0x80000000|1, // match move
0x80000000|673, // no-match move
0x80000000|36, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 617
MIN_REDUCTION+103, // (default reduction)
  }
,
{ // state 618
83,MIN_REDUCTION+134, // ws
84,MIN_REDUCTION+134, // " "
85,MIN_REDUCTION+134, // {10}
MIN_REDUCTION+134, // (default reduction)
  }
,
{ // state 619
MIN_REDUCTION+103, // (default reduction)
  }
,
{ // state 620
34,301, // `;
99,429, // ";"
  }
,
{ // state 621
7,100, // ID
17,734, // `(
20,389, // <type>
27,10, // `int
28,171, // `boolean
32,28, // <stmt>
33,908, // <assign>
35,593, // `{
38,18, // <local var decl>
39,1005, // `if
40,158, // <expr>
43,47, // `while
45,1043, // <expr8>
46,127, // <expr7>
47,125, // <expr6>
48,130, // <expr5>
49,86, // <expr4>
51,210, // <expr3>
53,982, // <expr2>
54,792, // <cast expr>
55,625, // <unary expr>
56,656, // <expr1>
57,371, // `-
58,819, // INTLIT
59,376, // letter
60,677, // "p"
61,677, // "v"
62,677, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q" "s" "y".."z"}
63,677, // "c"
64,677, // "i"
65,677, // "l"
66,677, // "o"
67,677, // "r"
68,677, // "u"
69,677, // "x"
70,677, // "b"
71,677, // "e"
72,677, // "h"
73,677, // "t"
74,677, // "w"
75,635, // letter128
76,154, // {199..218 231..250}
77,154, // {193..198 225..230}
79,164, // {"1".."9"}
80,393, // "0"
81,489, // digit128
82,1107, // {176..185}
86,975, // "#"
90,846, // "("
92,662, // "{"
94,17, // "-"
  }
,
{ // state 622
30,MIN_REDUCTION+146, // `[
83,27, // ws
84,110, // " "
85,523, // {10}
96,MIN_REDUCTION+146, // "["
MIN_REDUCTION+146, // (default reduction)
  }
,
{ // state 623
0x80000000|1, // match move
0x80000000|346, // no-match move
0x80000000|36, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 624
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 625
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 626
30,MIN_REDUCTION+146, // `[
83,29, // ws
84,113, // " "
85,25, // {10}
96,MIN_REDUCTION+146, // "["
MIN_REDUCTION+146, // (default reduction)
  }
,
{ // state 627
0x80000000|1, // match move
0x80000000|362, // no-match move
0x80000000|36, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 628
MIN_REDUCTION+126, // (default reduction)
  }
,
{ // state 629
MIN_REDUCTION+135, // (default reduction)
  }
,
{ // state 630
MIN_REDUCTION+24, // (default reduction)
  }
,
{ // state 631
0x80000000|1, // match move
0x80000000|861, // no-match move
0x80000000|36, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 632
MIN_REDUCTION+135, // (default reduction)
  }
,
{ // state 633
0x80000000|1, // match move
0x80000000|858, // no-match move
0x80000000|36, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 634
MIN_REDUCTION+135, // (default reduction)
  }
,
{ // state 635
0x80000000|423, // match move
0x80000000|420, // no-match move
0x80000000|36, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 636
0x80000000|911, // match move
0x80000000|1083, // no-match move
0x80000000|85, // NT-test-match state for `else
  }
,
{ // state 637
30,MIN_REDUCTION+134, // `[
96,MIN_REDUCTION+134, // "["
MIN_REDUCTION+134, // (default reduction)
  }
,
{ // state 638
0x80000000|1, // match move
0x80000000|990, // no-match move
0x80000000|36, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 639
0x80000000|1, // match move
0x80000000|283, // no-match move
0x80000000|36, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 640
0x80000000|382, // match move
0x80000000|1115, // no-match move
0x80000000|36, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 641
7,96, // ID
17,731, // `(
40,212, // <expr>
45,1041, // <expr8>
46,131, // <expr7>
47,128, // <expr6>
48,126, // <expr5>
49,87, // <expr4>
51,213, // <expr3>
53,973, // <expr2>
54,794, // <cast expr>
55,624, // <unary expr>
56,657, // <expr1>
57,367, // `-
58,815, // INTLIT
59,1066, // letter
60,677, // "p"
61,677, // "v"
62,677, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q" "s" "y".."z"}
63,677, // "c"
64,677, // "i"
65,677, // "l"
66,677, // "o"
67,677, // "r"
68,677, // "u"
69,677, // "x"
70,677, // "b"
71,677, // "e"
72,677, // "h"
73,677, // "t"
74,677, // "w"
75,1105, // letter128
76,595, // {199..218 231..250}
77,595, // {193..198 225..230}
79,162, // {"1".."9"}
80,394, // "0"
81,491, // digit128
82,1108, // {176..185}
90,846, // "("
94,17, // "-"
  }
,
{ // state 642
7,1070, // ID
17,715, // `(
40,585, // <expr>
45,1060, // <expr8>
46,111, // <expr7>
47,107, // <expr6>
48,114, // <expr5>
49,74, // <expr4>
51,335, // <expr3>
53,947, // <expr2>
54,775, // <cast expr>
55,805, // <unary expr>
56,638, // <expr1>
57,379, // `-
58,800, // INTLIT
59,1051, // letter
60,677, // "p"
61,677, // "v"
62,677, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q" "s" "y".."z"}
63,677, // "c"
64,677, // "i"
65,677, // "l"
66,677, // "o"
67,677, // "r"
68,677, // "u"
69,677, // "x"
70,677, // "b"
71,677, // "e"
72,677, // "h"
73,677, // "t"
74,677, // "w"
75,1092, // letter128
76,613, // {199..218 231..250}
77,613, // {193..198 225..230}
79,84, // {"1".."9"}
80,403, // "0"
81,506, // digit128
82,1101, // {176..185}
90,846, // "("
94,17, // "-"
  }
,
{ // state 643
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 644
MIN_REDUCTION+135, // (default reduction)
  }
,
{ // state 645
MIN_REDUCTION+115, // (default reduction)
  }
,
{ // state 646
MIN_REDUCTION+135, // (default reduction)
  }
,
{ // state 647
72,1140, // "h"
  }
,
{ // state 648
0x80000000|1, // match move
0x80000000|1029, // no-match move
0x80000000|36, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 649
MIN_REDUCTION+54, // (default reduction)
  }
,
{ // state 650
0x80000000|382, // match move
0x80000000|1094, // no-match move
0x80000000|36, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 651
MIN_REDUCTION+135, // (default reduction)
  }
,
{ // state 652
2,558, // ws*
30,MIN_REDUCTION+107, // `[
83,34, // ws
84,105, // " "
85,20, // {10}
96,MIN_REDUCTION+107, // "["
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 653
MIN_REDUCTION+137, // (default reduction)
  }
,
{ // state 654
MIN_REDUCTION+134, // (default reduction)
  }
,
{ // state 655
0x80000000|1, // match move
0x80000000|852, // no-match move
0x80000000|36, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 656
0x80000000|1, // match move
0x80000000|1002, // no-match move
0x80000000|36, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 657
0x80000000|1, // match move
0x80000000|998, // no-match move
0x80000000|36, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 658
MIN_REDUCTION+103, // (default reduction)
  }
,
{ // state 659
MIN_REDUCTION+23, // (default reduction)
  }
,
{ // state 660
0x80000000|855, // match move
0x80000000|519, // no-match move
0x80000000|85, // NT-test-match state for `else
  }
,
{ // state 661
34,184, // `;
99,818, // ";"
  }
,
{ // state 662
2,1049, // ws*
83,584, // ws
84,579, // " "
85,72, // {10}
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 663
0x80000000|883, // match move
0x80000000|205, // no-match move
0x80000000|36, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 664
0x80000000|382, // match move
0x80000000|1064, // no-match move
0x80000000|36, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 665
MIN_REDUCTION+134, // (default reduction)
  }
,
{ // state 666
0x80000000|1, // match move
0x80000000|447, // no-match move
0x80000000|36, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 667
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 668
0x80000000|883, // match move
0x80000000|207, // no-match move
0x80000000|36, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 669
0x80000000|382, // match move
0x80000000|1068, // no-match move
0x80000000|36, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 670
0x80000000|264, // match move
0x80000000|499, // no-match move
0x80000000|36, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 671
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 672
0x80000000|1, // match move
0x80000000|1009, // no-match move
0x80000000|36, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 673
30,MIN_REDUCTION+146, // `[
83,42, // ws
84,137, // " "
85,543, // {10}
96,MIN_REDUCTION+146, // "["
MIN_REDUCTION+146, // (default reduction)
  }
,
{ // state 674
0x80000000|1, // match move
0x80000000|309, // no-match move
0x80000000|36, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 675
0x80000000|1061, // match move
0x80000000|135, // no-match move
0x80000000|36, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 676
0x80000000|272, // match move
0x80000000|37, // no-match move
0x80000000|36, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 677
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 678
83,245, // ws
84,1095, // " "
85,844, // {10}
MIN_REDUCTION+84, // (default reduction)
  }
,
{ // state 679
0x80000000|270, // match move
0x80000000|41, // no-match move
0x80000000|36, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 680
0x80000000|1, // match move
0x80000000|1010, // no-match move
0x80000000|36, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 681
MIN_REDUCTION+135, // (default reduction)
  }
,
{ // state 682
0x80000000|1, // match move
0x80000000|465, // no-match move
0x80000000|36, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 683
2,627, // ws*
30,MIN_REDUCTION+107, // `[
83,63, // ws
84,113, // " "
85,25, // {10}
96,MIN_REDUCTION+107, // "["
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 684
0x80000000|1, // match move
0x80000000|380, // no-match move
0x80000000|36, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 685
0x80000000|883, // match move
0x80000000|255, // no-match move
0x80000000|36, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 686
MIN_REDUCTION+27, // (default reduction)
  }
,
{ // state 687
83,269, // ws
84,1007, // " "
85,32, // {10}
MIN_REDUCTION+96, // (default reduction)
  }
,
{ // state 688
0x80000000|649, // match move
0x80000000|278, // no-match move
0x80000000|85, // NT-test-match state for `else
  }
,
{ // state 689
0x80000000|1, // match move
0x80000000|466, // no-match move
0x80000000|36, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 690
0x80000000|1, // match move
0x80000000|1000, // no-match move
0x80000000|36, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 691
0x80000000|738, // match move
0x80000000|767, // no-match move
0x80000000|36, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 692
0x80000000|659, // match move
0x80000000|1008, // no-match move
0x80000000|85, // NT-test-match state for `else
  }
,
{ // state 693
MIN_REDUCTION+54, // (default reduction)
  }
,
{ // state 694
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 695
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 696
MIN_REDUCTION+128, // (default reduction)
  }
,
{ // state 697
7,1070, // ID
17,715, // `(
40,443, // <expr>
45,1060, // <expr8>
46,111, // <expr7>
47,107, // <expr6>
48,114, // <expr5>
49,74, // <expr4>
51,335, // <expr3>
53,947, // <expr2>
54,775, // <cast expr>
55,805, // <unary expr>
56,638, // <expr1>
57,379, // `-
58,800, // INTLIT
59,1051, // letter
60,677, // "p"
61,677, // "v"
62,677, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q" "s" "y".."z"}
63,677, // "c"
64,677, // "i"
65,677, // "l"
66,677, // "o"
67,677, // "r"
68,677, // "u"
69,677, // "x"
70,677, // "b"
71,677, // "e"
72,677, // "h"
73,677, // "t"
74,677, // "w"
75,1092, // letter128
76,613, // {199..218 231..250}
77,613, // {193..198 225..230}
79,84, // {"1".."9"}
80,403, // "0"
81,506, // digit128
82,1101, // {176..185}
90,846, // "("
94,17, // "-"
  }
,
{ // state 698
7,19, // ID
12,927, // <decl in class>
13,811, // <field decl>
14,161, // <method decl>
15,271, // `public
20,556, // <type>
27,10, // `int
28,171, // `boolean
37,653, // `}
59,779, // letter
60,677, // "p"
61,677, // "v"
62,677, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q" "s" "y".."z"}
63,677, // "c"
64,677, // "i"
65,677, // "l"
66,677, // "o"
67,677, // "r"
68,677, // "u"
69,677, // "x"
70,677, // "b"
71,677, // "e"
72,677, // "h"
73,677, // "t"
74,677, // "w"
75,518, // letter128
76,1069, // {199..218 231..250}
77,1069, // {193..198 225..230}
86,39, // "#"
93,398, // "}"
112,21, // <decl in class>*
  }
,
{ // state 699
MIN_REDUCTION+55, // (default reduction)
  }
,
{ // state 700
0x80000000|1, // match move
0x80000000|887, // no-match move
0x80000000|36, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 701
30,MIN_REDUCTION+47, // `[
44,MIN_REDUCTION+47, // `=
50,MIN_REDUCTION+47, // `+
52,MIN_REDUCTION+47, // `*
87,MIN_REDUCTION+47, // "+"
89,MIN_REDUCTION+47, // "*"
95,MIN_REDUCTION+47, // "="
96,MIN_REDUCTION+47, // "["
MIN_REDUCTION+19, // (default reduction)
  }
,
{ // state 702
2,623, // ws*
30,MIN_REDUCTION+107, // `[
83,60, // ws
84,110, // " "
85,523, // {10}
96,MIN_REDUCTION+107, // "["
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 703
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 704
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 705
59,546, // letter
60,55, // "p"
61,55, // "v"
62,55, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q" "s" "y".."z"}
63,55, // "c"
64,55, // "i"
65,55, // "l"
66,55, // "o"
67,55, // "r"
68,55, // "u"
69,55, // "x"
70,55, // "b"
71,55, // "e"
72,55, // "h"
73,55, // "t"
74,55, // "w"
75,928, // letter128
76,882, // {199..218 231..250}
77,882, // {193..198 225..230}
78,219, // digit
79,185, // {"1".."9"}
80,185, // "0"
81,1063, // digit128
82,807, // {176..185}
101,1040, // $$3
106,1096, // idChar
107,1077, // "_"
108,392, // idChar128
109,718, // {223}
  }
,
{ // state 706
7,1070, // ID
17,715, // `(
40,236, // <expr>
45,1060, // <expr8>
46,111, // <expr7>
47,107, // <expr6>
48,114, // <expr5>
49,74, // <expr4>
51,335, // <expr3>
53,947, // <expr2>
54,775, // <cast expr>
55,805, // <unary expr>
56,638, // <expr1>
57,379, // `-
58,800, // INTLIT
59,1051, // letter
60,677, // "p"
61,677, // "v"
62,677, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q" "s" "y".."z"}
63,677, // "c"
64,677, // "i"
65,677, // "l"
66,677, // "o"
67,677, // "r"
68,677, // "u"
69,677, // "x"
70,677, // "b"
71,677, // "e"
72,677, // "h"
73,677, // "t"
74,677, // "w"
75,1092, // letter128
76,613, // {199..218 231..250}
77,613, // {193..198 225..230}
79,84, // {"1".."9"}
80,403, // "0"
81,506, // digit128
82,1101, // {176..185}
90,846, // "("
94,17, // "-"
  }
,
{ // state 707
7,550, // ID
59,515, // letter
60,677, // "p"
61,677, // "v"
62,677, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q" "s" "y".."z"}
63,677, // "c"
64,677, // "i"
65,677, // "l"
66,677, // "o"
67,677, // "r"
68,677, // "u"
69,677, // "x"
70,677, // "b"
71,677, // "e"
72,677, // "h"
73,677, // "t"
74,677, // "w"
75,235, // letter128
76,643, // {199..218 231..250}
77,643, // {193..198 225..230}
  }
,
{ // state 708
7,100, // ID
17,734, // `(
20,389, // <type>
27,10, // `int
28,171, // `boolean
32,44, // <stmt>
33,942, // <assign>
35,1098, // `{
38,368, // <local var decl>
39,834, // `if
40,158, // <expr>
43,138, // `while
45,1043, // <expr8>
46,127, // <expr7>
47,125, // <expr6>
48,130, // <expr5>
49,86, // <expr4>
51,210, // <expr3>
53,982, // <expr2>
54,792, // <cast expr>
55,625, // <unary expr>
56,656, // <expr1>
57,371, // `-
58,819, // INTLIT
59,376, // letter
60,677, // "p"
61,677, // "v"
62,677, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q" "s" "y".."z"}
63,677, // "c"
64,677, // "i"
65,677, // "l"
66,677, // "o"
67,677, // "r"
68,677, // "u"
69,677, // "x"
70,677, // "b"
71,677, // "e"
72,677, // "h"
73,677, // "t"
74,677, // "w"
75,635, // letter128
76,154, // {199..218 231..250}
77,154, // {193..198 225..230}
79,164, // {"1".."9"}
80,393, // "0"
81,489, // digit128
82,1107, // {176..185}
86,975, // "#"
90,846, // "("
92,662, // "{"
94,17, // "-"
  }
,
{ // state 709
MIN_REDUCTION+117, // (default reduction)
  }
,
{ // state 710
0x80000000|296, // match move
0x80000000|11, // no-match move
0x80000000|36, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 711
17,1129, // `(
90,785, // "("
  }
,
{ // state 712
MIN_REDUCTION+102, // (default reduction)
  }
,
{ // state 713
0x80000000|1087, // match move
0x80000000|1071, // no-match move
0x80000000|85, // NT-test-match state for `else
  }
,
{ // state 714
MIN_REDUCTION+102, // (default reduction)
  }
,
{ // state 715
7,400, // ID
20,292, // <type>
27,481, // `int
28,574, // `boolean
59,68, // letter
60,677, // "p"
61,677, // "v"
62,677, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q" "s" "y".."z"}
63,677, // "c"
64,677, // "i"
65,677, // "l"
66,677, // "o"
67,677, // "r"
68,677, // "u"
69,677, // "x"
70,677, // "b"
71,677, // "e"
72,677, // "h"
73,677, // "t"
74,677, // "w"
75,907, // letter128
76,882, // {199..218 231..250}
77,882, // {193..198 225..230}
86,886, // "#"
  }
,
{ // state 716
2,783, // ws*
83,183, // ws
84,258, // " "
85,588, // {10}
MIN_REDUCTION+99, // (default reduction)
  }
,
{ // state 717
0x80000000|366, // match move
0x80000000|637, // no-match move
0x80000000|36, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 718
MIN_REDUCTION+115, // (default reduction)
  }
,
{ // state 719
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 720
MIN_REDUCTION+102, // (default reduction)
  }
,
{ // state 721
7,100, // ID
17,734, // `(
20,389, // <type>
27,10, // `int
28,171, // `boolean
32,295, // <stmt>
33,163, // <assign>
35,1017, // `{
38,786, // <local var decl>
39,22, // `if
40,158, // <expr>
43,790, // `while
45,1043, // <expr8>
46,127, // <expr7>
47,125, // <expr6>
48,130, // <expr5>
49,86, // <expr4>
51,210, // <expr3>
53,982, // <expr2>
54,792, // <cast expr>
55,625, // <unary expr>
56,656, // <expr1>
57,371, // `-
58,819, // INTLIT
59,376, // letter
60,677, // "p"
61,677, // "v"
62,677, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q" "s" "y".."z"}
63,677, // "c"
64,677, // "i"
65,677, // "l"
66,677, // "o"
67,677, // "r"
68,677, // "u"
69,677, // "x"
70,677, // "b"
71,677, // "e"
72,677, // "h"
73,677, // "t"
74,677, // "w"
75,635, // letter128
76,154, // {199..218 231..250}
77,154, // {193..198 225..230}
79,164, // {"1".."9"}
80,393, // "0"
81,489, // digit128
82,1107, // {176..185}
86,975, // "#"
90,846, // "("
92,662, // "{"
94,17, // "-"
  }
,
{ // state 722
MIN_REDUCTION+55, // (default reduction)
  }
,
{ // state 723
MIN_REDUCTION+23, // (default reduction)
  }
,
{ // state 724
30,MIN_REDUCTION+102, // `[
96,MIN_REDUCTION+102, // "["
MIN_REDUCTION+102, // (default reduction)
  }
,
{ // state 725
MIN_REDUCTION+28, // (default reduction)
  }
,
{ // state 726
34,325, // `;
99,716, // ";"
  }
,
{ // state 727
2,674, // ws*
30,MIN_REDUCTION+107, // `[
83,75, // ws
84,137, // " "
85,543, // {10}
96,MIN_REDUCTION+107, // "["
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 728
MIN_REDUCTION+135, // (default reduction)
  }
,
{ // state 729
30,MIN_REDUCTION+102, // `[
96,MIN_REDUCTION+102, // "["
MIN_REDUCTION+102, // (default reduction)
  }
,
{ // state 730
2,474, // ws*
MIN_REDUCTION+99, // (default reduction)
  }
,
{ // state 731
7,400, // ID
20,404, // <type>
27,481, // `int
28,574, // `boolean
59,68, // letter
60,677, // "p"
61,677, // "v"
62,677, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q" "s" "y".."z"}
63,677, // "c"
64,677, // "i"
65,677, // "l"
66,677, // "o"
67,677, // "r"
68,677, // "u"
69,677, // "x"
70,677, // "b"
71,677, // "e"
72,677, // "h"
73,677, // "t"
74,677, // "w"
75,907, // letter128
76,882, // {199..218 231..250}
77,882, // {193..198 225..230}
86,886, // "#"
  }
,
{ // state 732
83,MIN_REDUCTION+135, // ws
84,MIN_REDUCTION+135, // " "
85,MIN_REDUCTION+135, // {10}
MIN_REDUCTION+135, // (default reduction)
  }
,
{ // state 733
MIN_REDUCTION+102, // (default reduction)
  }
,
{ // state 734
7,400, // ID
20,399, // <type>
27,481, // `int
28,574, // `boolean
59,68, // letter
60,677, // "p"
61,677, // "v"
62,677, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q" "s" "y".."z"}
63,677, // "c"
64,677, // "i"
65,677, // "l"
66,677, // "o"
67,677, // "r"
68,677, // "u"
69,677, // "x"
70,677, // "b"
71,677, // "e"
72,677, // "h"
73,677, // "t"
74,677, // "w"
75,907, // letter128
76,882, // {199..218 231..250}
77,882, // {193..198 225..230}
86,886, // "#"
  }
,
{ // state 735
0x80000000|173, // match move
0x80000000|385, // no-match move
0x80000000|85, // NT-test-match state for `else
  }
,
{ // state 736
7,19, // ID
18,112, // <paramList>?
20,498, // <type>
21,155, // $$2
22,266, // <param>
25,415, // <paramList>
27,10, // `int
28,171, // `boolean
41,901, // `)
59,779, // letter
60,677, // "p"
61,677, // "v"
62,677, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q" "s" "y".."z"}
63,677, // "c"
64,677, // "i"
65,677, // "l"
66,677, // "o"
67,677, // "r"
68,677, // "u"
69,677, // "x"
70,677, // "b"
71,677, // "e"
72,677, // "h"
73,677, // "t"
74,677, // "w"
75,518, // letter128
76,1069, // {199..218 231..250}
77,1069, // {193..198 225..230}
86,442, // "#"
91,344, // ")"
  }
,
{ // state 737
7,554, // ID
29,56, // <empty bracket pair>
30,43, // `[
59,525, // letter
60,677, // "p"
61,677, // "v"
62,677, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q" "s" "y".."z"}
63,677, // "c"
64,677, // "i"
65,677, // "l"
66,677, // "o"
67,677, // "r"
68,677, // "u"
69,677, // "x"
70,677, // "b"
71,677, // "e"
72,677, // "h"
73,677, // "t"
74,677, // "w"
75,910, // letter128
76,889, // {199..218 231..250}
77,889, // {193..198 225..230}
96,931, // "["
  }
,
{ // state 738
MIN_REDUCTION+55, // (default reduction)
  }
,
{ // state 739
3,1136, // <program>
4,53, // <class decl>+
8,950, // <class decl>
9,707, // `class
83,216, // ws
84,693, // " "
85,397, // {10}
86,9, // "#"
  }
,
{ // state 740
MIN_REDUCTION+55, // (default reduction)
  }
,
{ // state 741
30,MIN_REDUCTION+102, // `[
96,MIN_REDUCTION+102, // "["
MIN_REDUCTION+102, // (default reduction)
  }
,
{ // state 742
7,93, // ID
17,734, // `(
53,307, // <expr2>
54,792, // <cast expr>
55,625, // <unary expr>
56,656, // <expr1>
57,371, // `-
58,819, // INTLIT
59,1078, // letter
60,677, // "p"
61,677, // "v"
62,677, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q" "s" "y".."z"}
63,677, // "c"
64,677, // "i"
65,677, // "l"
66,677, // "o"
67,677, // "r"
68,677, // "u"
69,677, // "x"
70,677, // "b"
71,677, // "e"
72,677, // "h"
73,677, // "t"
74,677, // "w"
75,1102, // letter128
76,599, // {199..218 231..250}
77,599, // {193..198 225..230}
79,164, // {"1".."9"}
80,393, // "0"
81,489, // digit128
82,1107, // {176..185}
90,846, // "("
94,17, // "-"
  }
,
{ // state 743
2,876, // ws*
30,MIN_REDUCTION+143, // `[
83,251, // ws
84,8, // " "
85,691, // {10}
96,MIN_REDUCTION+143, // "["
MIN_REDUCTION+143, // (default reduction)
  }
,
{ // state 744
MIN_REDUCTION+103, // (default reduction)
  }
,
{ // state 745
7,96, // ID
17,731, // `(
53,305, // <expr2>
54,794, // <cast expr>
55,624, // <unary expr>
56,657, // <expr1>
57,367, // `-
58,815, // INTLIT
59,1066, // letter
60,677, // "p"
61,677, // "v"
62,677, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q" "s" "y".."z"}
63,677, // "c"
64,677, // "i"
65,677, // "l"
66,677, // "o"
67,677, // "r"
68,677, // "u"
69,677, // "x"
70,677, // "b"
71,677, // "e"
72,677, // "h"
73,677, // "t"
74,677, // "w"
75,1105, // letter128
76,595, // {199..218 231..250}
77,595, // {193..198 225..230}
79,162, // {"1".."9"}
80,394, // "0"
81,491, // digit128
82,1108, // {176..185}
90,846, // "("
94,17, // "-"
  }
,
{ // state 746
0x80000000|1, // match move
0x80000000|170, // no-match move
0x80000000|36, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 747
7,1070, // ID
17,715, // `(
53,281, // <expr2>
54,775, // <cast expr>
55,805, // <unary expr>
56,638, // <expr1>
57,379, // `-
58,800, // INTLIT
59,1051, // letter
60,677, // "p"
61,677, // "v"
62,677, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q" "s" "y".."z"}
63,677, // "c"
64,677, // "i"
65,677, // "l"
66,677, // "o"
67,677, // "r"
68,677, // "u"
69,677, // "x"
70,677, // "b"
71,677, // "e"
72,677, // "h"
73,677, // "t"
74,677, // "w"
75,1092, // letter128
76,613, // {199..218 231..250}
77,613, // {193..198 225..230}
79,84, // {"1".."9"}
80,403, // "0"
81,506, // digit128
82,1101, // {176..185}
90,846, // "("
94,17, // "-"
  }
,
{ // state 748
71,352, // "e"
  }
,
{ // state 749
83,457, // ws
84,340, // " "
85,829, // {10}
MIN_REDUCTION+80, // (default reduction)
  }
,
{ // state 750
114,MIN_REDUCTION+55, // $NT
MIN_REDUCTION+55, // (default reduction)
  }
,
{ // state 751
MIN_REDUCTION+20, // (default reduction)
  }
,
{ // state 752
MIN_REDUCTION+114, // (default reduction)
  }
,
{ // state 753
MIN_REDUCTION+53, // (default reduction)
  }
,
{ // state 754
MIN_REDUCTION+114, // (default reduction)
  }
,
{ // state 755
30,MIN_REDUCTION+100, // `[
83,717, // ws
84,8, // " "
85,691, // {10}
96,MIN_REDUCTION+100, // "["
MIN_REDUCTION+100, // (default reduction)
  }
,
{ // state 756
0x80000000|890, // match move
0x80000000|67, // no-match move
0x80000000|85, // NT-test-match state for `else
  }
,
{ // state 757
0x80000000|1, // match move
0x80000000|349, // no-match move
0x80000000|36, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 758
0x80000000|1, // match move
0x80000000|1044, // no-match move
0x80000000|36, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 759
MIN_REDUCTION+53, // (default reduction)
  }
,
{ // state 760
MIN_REDUCTION+26, // (default reduction)
  }
,
{ // state 761
7,79, // ID
17,771, // `(
53,321, // <expr2>
54,773, // <cast expr>
55,597, // <unary expr>
56,700, // <expr1>
57,350, // `-
58,639, // INTLIT
59,1109, // letter
60,677, // "p"
61,677, // "v"
62,677, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q" "s" "y".."z"}
63,677, // "c"
64,677, // "i"
65,677, // "l"
66,677, // "o"
67,677, // "r"
68,677, // "u"
69,677, // "x"
70,677, // "b"
71,677, // "e"
72,677, // "h"
73,677, // "t"
74,677, // "w"
75,1131, // letter128
76,570, // {199..218 231..250}
77,570, // {193..198 225..230}
79,147, // {"1".."9"}
80,360, // "0"
81,533, // digit128
82,1120, // {176..185}
90,846, // "("
94,17, // "-"
  }
,
{ // state 762
0x80000000|1, // match move
0x80000000|1050, // no-match move
0x80000000|36, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 763
59,546, // letter
60,55, // "p"
61,55, // "v"
62,55, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q" "s" "y".."z"}
63,55, // "c"
64,55, // "i"
65,55, // "l"
66,55, // "o"
67,55, // "r"
68,55, // "u"
69,55, // "x"
70,55, // "b"
71,55, // "e"
72,55, // "h"
73,55, // "t"
74,55, // "w"
75,1053, // letter128
76,643, // {199..218 231..250}
77,643, // {193..198 225..230}
78,219, // digit
79,185, // {"1".."9"}
80,185, // "0"
81,965, // digit128
82,289, // {176..185}
101,1104, // $$3
106,1096, // idChar
107,1077, // "_"
108,242, // idChar128
109,645, // {223}
  }
,
{ // state 764
59,546, // letter
60,55, // "p"
61,55, // "v"
62,55, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q" "s" "y".."z"}
63,55, // "c"
64,55, // "i"
65,55, // "l"
66,55, // "o"
67,55, // "r"
68,55, // "u"
69,55, // "x"
70,55, // "b"
71,55, // "e"
72,55, // "h"
73,55, // "t"
74,55, // "w"
75,6, // letter128
76,912, // {199..218 231..250}
77,912, // {193..198 225..230}
78,219, // digit
79,185, // {"1".."9"}
80,185, // "0"
81,1124, // digit128
82,256, // {176..185}
101,714, // $$3
106,1096, // idChar
107,1077, // "_"
108,974, // idChar128
109,312, // {223}
  }
,
{ // state 765
83,808, // ws
84,1046, // " "
85,188, // {10}
MIN_REDUCTION+74, // (default reduction)
  }
,
{ // state 766
0x80000000|378, // match move
0x80000000|480, // no-match move
0x80000000|85, // NT-test-match state for `else
  }
,
{ // state 767
30,MIN_REDUCTION+55, // `[
96,MIN_REDUCTION+55, // "["
MIN_REDUCTION+55, // (default reduction)
  }
,
{ // state 768
2,1084, // ws*
83,651, // ws
84,825, // " "
85,61, // {10}
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 769
34,915, // `;
99,716, // ";"
  }
,
{ // state 770
59,546, // letter
60,55, // "p"
61,55, // "v"
62,55, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q" "s" "y".."z"}
63,55, // "c"
64,55, // "i"
65,55, // "l"
66,55, // "o"
67,55, // "r"
68,55, // "u"
69,55, // "x"
70,55, // "b"
71,55, // "e"
72,55, // "h"
73,55, // "t"
74,55, // "w"
75,13, // letter128
76,921, // {199..218 231..250}
77,921, // {193..198 225..230}
78,219, // digit
79,185, // {"1".."9"}
80,185, // "0"
81,1123, // digit128
82,257, // {176..185}
101,712, // $$3
106,1096, // idChar
107,1077, // "_"
108,978, // idChar128
109,314, // {223}
  }
,
{ // state 771
7,400, // ID
20,370, // <type>
27,481, // `int
28,574, // `boolean
59,68, // letter
60,677, // "p"
61,677, // "v"
62,677, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q" "s" "y".."z"}
63,677, // "c"
64,677, // "i"
65,677, // "l"
66,677, // "o"
67,677, // "r"
68,677, // "u"
69,677, // "x"
70,677, // "b"
71,677, // "e"
72,677, // "h"
73,677, // "t"
74,677, // "w"
75,907, // letter128
76,882, // {199..218 231..250}
77,882, // {193..198 225..230}
86,886, // "#"
  }
,
{ // state 772
83,269, // ws
84,1007, // " "
85,32, // {10}
MIN_REDUCTION+78, // (default reduction)
  }
,
{ // state 773
MIN_REDUCTION+41, // (default reduction)
  }
,
{ // state 774
0x80000000|1, // match move
0x80000000|1057, // no-match move
0x80000000|36, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 775
MIN_REDUCTION+41, // (default reduction)
  }
,
{ // state 776
34,1089, // `;
99,429, // ";"
  }
,
{ // state 777
0x80000000|1146, // match move
0x80000000|760, // no-match move
0x80000000|85, // NT-test-match state for `else
  }
,
{ // state 778
30,MIN_REDUCTION+102, // `[
96,MIN_REDUCTION+102, // "["
MIN_REDUCTION+102, // (default reduction)
  }
,
{ // state 779
59,546, // letter
60,55, // "p"
61,55, // "v"
62,55, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q" "s" "y".."z"}
63,55, // "c"
64,55, // "i"
65,55, // "l"
66,55, // "o"
67,55, // "r"
68,55, // "u"
69,55, // "x"
70,55, // "b"
71,55, // "e"
72,55, // "h"
73,55, // "t"
74,55, // "w"
75,816, // letter128
76,1069, // {199..218 231..250}
77,1069, // {193..198 225..230}
78,219, // digit
79,185, // {"1".."9"}
80,185, // "0"
81,591, // digit128
82,109, // {176..185}
100,959, // idChar*
101,658, // $$3
106,401, // idChar
107,1077, // "_"
108,1099, // idChar128
109,933, // {223}
  }
,
{ // state 780
MIN_REDUCTION+135, // (default reduction)
  }
,
{ // state 781
7,79, // ID
17,771, // `(
51,1036, // <expr3>
53,997, // <expr2>
54,773, // <cast expr>
55,597, // <unary expr>
56,700, // <expr1>
57,350, // `-
58,639, // INTLIT
59,1109, // letter
60,677, // "p"
61,677, // "v"
62,677, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q" "s" "y".."z"}
63,677, // "c"
64,677, // "i"
65,677, // "l"
66,677, // "o"
67,677, // "r"
68,677, // "u"
69,677, // "x"
70,677, // "b"
71,677, // "e"
72,677, // "h"
73,677, // "t"
74,677, // "w"
75,1131, // letter128
76,570, // {199..218 231..250}
77,570, // {193..198 225..230}
79,147, // {"1".."9"}
80,360, // "0"
81,533, // digit128
82,1120, // {176..185}
90,846, // "("
94,17, // "-"
  }
,
{ // state 782
59,546, // letter
60,55, // "p"
61,55, // "v"
62,55, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q" "s" "y".."z"}
63,55, // "c"
64,55, // "i"
65,55, // "l"
66,55, // "o"
67,55, // "r"
68,55, // "u"
69,55, // "x"
70,55, // "b"
71,55, // "e"
72,55, // "h"
73,55, // "t"
74,55, // "w"
75,120, // letter128
76,889, // {199..218 231..250}
77,889, // {193..198 225..230}
78,219, // digit
79,185, // {"1".."9"}
80,185, // "0"
81,1118, // digit128
82,294, // {176..185}
101,720, // $$3
106,1096, // idChar
107,1077, // "_"
108,989, // idChar128
109,339, // {223}
  }
,
{ // state 783
83,26, // ws
84,258, // " "
85,588, // {10}
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 784
0x80000000|1, // match move
0x80000000|358, // no-match move
0x80000000|36, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 785
2,275, // ws*
83,202, // ws
84,97, // " "
85,1093, // {10}
MIN_REDUCTION+79, // (default reduction)
  }
,
{ // state 786
34,493, // `;
99,713, // ";"
  }
,
{ // state 787
83,424, // ws
84,306, // " "
85,873, // {10}
MIN_REDUCTION+100, // (default reduction)
  }
,
{ // state 788
0x80000000|719, // match move
0x80000000|841, // no-match move
0x80000000|85, // NT-test-match state for `else
  }
,
{ // state 789
0x80000000|1, // match move
0x80000000|355, // no-match move
0x80000000|36, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 790
17,1023, // `(
90,785, // "("
  }
,
{ // state 791
0x80000000|883, // match move
0x80000000|231, // no-match move
0x80000000|36, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 792
MIN_REDUCTION+41, // (default reduction)
  }
,
{ // state 793
83,460, // ws
84,297, // " "
85,869, // {10}
MIN_REDUCTION+100, // (default reduction)
  }
,
{ // state 794
MIN_REDUCTION+41, // (default reduction)
  }
,
{ // state 795
59,546, // letter
60,55, // "p"
61,55, // "v"
62,55, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q" "s" "y".."z"}
63,55, // "c"
64,55, // "i"
65,55, // "l"
66,55, // "o"
67,55, // "r"
68,55, // "u"
69,55, // "x"
70,55, // "b"
71,55, // "e"
72,55, // "h"
73,55, // "t"
74,55, // "w"
75,140, // letter128
76,896, // {199..218 231..250}
77,896, // {193..198 225..230}
78,219, // digit
79,185, // {"1".."9"}
80,185, // "0"
81,35, // digit128
82,290, // {176..185}
101,733, // $$3
106,1096, // idChar
107,1077, // "_"
108,1025, // idChar128
109,356, // {223}
  }
,
{ // state 796
30,MIN_REDUCTION+47, // `[
96,MIN_REDUCTION+47, // "["
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 797
MIN_REDUCTION+54, // (default reduction)
  }
,
{ // state 798
30,MIN_REDUCTION+47, // `[
96,MIN_REDUCTION+47, // "["
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 799
59,546, // letter
60,55, // "p"
61,55, // "v"
62,55, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q" "s" "y".."z"}
63,55, // "c"
64,55, // "i"
65,55, // "l"
66,55, // "o"
67,55, // "r"
68,55, // "u"
69,55, // "x"
70,55, // "b"
71,55, // "e"
72,55, // "h"
73,55, // "t"
74,55, // "w"
75,671, // letter128
76,695, // {199..218 231..250}
77,695, // {193..198 225..230}
78,219, // digit
79,185, // {"1".."9"}
80,185, // "0"
81,754, // digit128
82,946, // {176..185}
101,517, // $$3
106,1096, // idChar
107,1077, // "_"
108,103, // idChar128
109,877, // {223}
  }
,
{ // state 800
0x80000000|1, // match move
0x80000000|304, // no-match move
0x80000000|36, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 801
59,546, // letter
60,55, // "p"
61,55, // "v"
62,55, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q" "s" "y".."z"}
63,55, // "c"
64,55, // "i"
65,55, // "l"
66,55, // "o"
67,55, // "r"
68,55, // "u"
69,55, // "x"
70,55, // "b"
71,55, // "e"
72,55, // "h"
73,55, // "t"
74,55, // "w"
75,667, // letter128
76,694, // {199..218 231..250}
77,694, // {193..198 225..230}
78,219, // digit
79,185, // {"1".."9"}
80,185, // "0"
81,752, // digit128
82,929, // {176..185}
101,516, // $$3
106,1096, // idChar
107,1077, // "_"
108,102, // idChar128
109,875, // {223}
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
{ // state 802
0x80000000|1, // match move
0x80000000|108, // no-match move
0x80000000|36, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 803
66,1014, // "o"
  }
,
{ // state 804
2,871, // ws*
83,144, // ws
84,71, // " "
85,735, // {10}
MIN_REDUCTION+85, // (default reduction)
  }
,
{ // state 805
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 806
83,417, // ws
84,284, // " "
85,885, // {10}
MIN_REDUCTION+100, // (default reduction)
  }
,
{ // state 807
MIN_REDUCTION+53, // (default reduction)
  }
,
{ // state 808
MIN_REDUCTION+134, // (default reduction)
  }
,
{ // state 809
2,945, // ws*
83,629, // ws
84,797, // " "
85,197, // {10}
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 810
34,178, // `;
99,375, // ";"
  }
,
{ // state 811
MIN_REDUCTION+7, // (default reduction)
  }
,
{ // state 812
7,1028, // ID
59,525, // letter
60,677, // "p"
61,677, // "v"
62,677, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q" "s" "y".."z"}
63,677, // "c"
64,677, // "i"
65,677, // "l"
66,677, // "o"
67,677, // "r"
68,677, // "u"
69,677, // "x"
70,677, // "b"
71,677, // "e"
72,677, // "h"
73,677, // "t"
74,677, // "w"
75,910, // letter128
76,889, // {199..218 231..250}
77,889, // {193..198 225..230}
  }
,
{ // state 813
7,100, // ID
17,734, // `(
20,389, // <type>
27,10, // `int
28,171, // `boolean
32,777, // <stmt>
33,163, // <assign>
35,1017, // `{
38,786, // <local var decl>
39,22, // `if
40,158, // <expr>
43,790, // `while
45,1043, // <expr8>
46,127, // <expr7>
47,125, // <expr6>
48,130, // <expr5>
49,86, // <expr4>
51,210, // <expr3>
53,982, // <expr2>
54,792, // <cast expr>
55,625, // <unary expr>
56,656, // <expr1>
57,371, // `-
58,819, // INTLIT
59,376, // letter
60,677, // "p"
61,677, // "v"
62,677, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q" "s" "y".."z"}
63,677, // "c"
64,677, // "i"
65,677, // "l"
66,677, // "o"
67,677, // "r"
68,677, // "u"
69,677, // "x"
70,677, // "b"
71,677, // "e"
72,677, // "h"
73,677, // "t"
74,677, // "w"
75,635, // letter128
76,154, // {199..218 231..250}
77,154, // {193..198 225..230}
79,164, // {"1".."9"}
80,393, // "0"
81,489, // digit128
82,1107, // {176..185}
86,975, // "#"
90,846, // "("
92,662, // "{"
94,17, // "-"
  }
,
{ // state 814
30,MIN_REDUCTION+47, // `[
96,MIN_REDUCTION+47, // "["
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 815
0x80000000|1, // match move
0x80000000|299, // no-match move
0x80000000|36, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 816
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 817
MIN_REDUCTION+54, // (default reduction)
  }
,
{ // state 818
2,542, // ws*
83,1103, // ws
84,328, // " "
85,826, // {10}
MIN_REDUCTION+99, // (default reduction)
  }
,
{ // state 819
0x80000000|1, // match move
0x80000000|298, // no-match move
0x80000000|36, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 820
0x80000000|1, // match move
0x80000000|234, // no-match move
0x80000000|36, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 821
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 822
0x80000000|1, // match move
0x80000000|215, // no-match move
0x80000000|36, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 823
83,859, // ws
84,97, // " "
85,1093, // {10}
MIN_REDUCTION+72, // (default reduction)
  }
,
{ // state 824
30,MIN_REDUCTION+47, // `[
96,MIN_REDUCTION+47, // "["
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 825
MIN_REDUCTION+54, // (default reduction)
  }
,
{ // state 826
MIN_REDUCTION+55, // (default reduction)
  }
,
{ // state 827
7,100, // ID
17,734, // `(
20,389, // <type>
27,10, // `int
28,171, // `boolean
32,696, // <stmt>
33,810, // <assign>
35,488, // `{
37,318, // `}
38,310, // <local var decl>
39,3, // `if
40,158, // <expr>
43,1031, // `while
45,1043, // <expr8>
46,127, // <expr7>
47,125, // <expr6>
48,130, // <expr5>
49,86, // <expr4>
51,210, // <expr3>
53,982, // <expr2>
54,792, // <cast expr>
55,625, // <unary expr>
56,656, // <expr1>
57,371, // `-
58,819, // INTLIT
59,376, // letter
60,677, // "p"
61,677, // "v"
62,677, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q" "s" "y".."z"}
63,677, // "c"
64,677, // "i"
65,677, // "l"
66,677, // "o"
67,677, // "r"
68,677, // "u"
69,677, // "x"
70,677, // "b"
71,677, // "e"
72,677, // "h"
73,677, // "t"
74,677, // "w"
75,635, // letter128
76,154, // {199..218 231..250}
77,154, // {193..198 225..230}
79,164, // {"1".."9"}
80,393, // "0"
81,489, // digit128
82,1107, // {176..185}
86,975, // "#"
90,846, // "("
92,662, // "{"
93,440, // "}"
94,17, // "-"
  }
,
{ // state 828
2,678, // ws*
83,1027, // ws
84,1095, // " "
85,844, // {10}
MIN_REDUCTION+85, // (default reduction)
  }
,
{ // state 829
MIN_REDUCTION+55, // (default reduction)
  }
,
{ // state 830
30,MIN_REDUCTION+134, // `[
96,MIN_REDUCTION+134, // "["
MIN_REDUCTION+134, // (default reduction)
  }
,
{ // state 831
83,438, // ws
84,311, // " "
85,851, // {10}
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 832
61,548, // "v"
64,132, // "i"
70,121, // "b"
  }
,
{ // state 833
30,MIN_REDUCTION+51, // `[
96,MIN_REDUCTION+51, // "["
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 834
17,642, // `(
90,785, // "("
  }
,
{ // state 835
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 836
59,546, // letter
60,55, // "p"
61,55, // "v"
62,55, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q" "s" "y".."z"}
63,55, // "c"
64,55, // "i"
65,55, // "l"
66,55, // "o"
67,55, // "r"
68,55, // "u"
69,55, // "x"
70,55, // "b"
71,55, // "e"
72,55, // "h"
73,55, // "t"
74,55, // "w"
75,332, // letter128
76,704, // {199..218 231..250}
77,704, // {193..198 225..230}
78,219, // digit
79,185, // {"1".."9"}
80,185, // "0"
81,324, // digit128
82,759, // {176..185}
101,604, // $$3
106,1096, // idChar
107,1077, // "_"
108,1015, // idChar128
109,862, // {223}
  }
,
{ // state 837
MIN_REDUCTION+25, // (default reduction)
  }
,
{ // state 838
MIN_REDUCTION+141, // (default reduction)
  }
,
{ // state 839
59,546, // letter
60,55, // "p"
61,55, // "v"
62,55, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q" "s" "y".."z"}
63,55, // "c"
64,55, // "i"
65,55, // "l"
66,55, // "o"
67,55, // "r"
68,55, // "u"
69,55, // "x"
70,55, // "b"
71,55, // "e"
72,55, // "h"
73,55, // "t"
74,55, // "w"
75,334, // letter128
76,703, // {199..218 231..250}
77,703, // {193..198 225..230}
78,219, // digit
79,185, // {"1".."9"}
80,185, // "0"
81,323, // digit128
82,753, // {176..185}
101,602, // $$3
106,1096, // idChar
107,1077, // "_"
108,1013, // idChar128
109,864, // {223}
  }
,
{ // state 840
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 841
83,62, // ws
84,71, // " "
85,735, // {10}
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 842
37,139, // `}
93,828, // "}"
  }
,
{ // state 843
114,MIN_REDUCTION+54, // $NT
MIN_REDUCTION+54, // (default reduction)
  }
,
{ // state 844
MIN_REDUCTION+55, // (default reduction)
  }
,
{ // state 845
0x80000000|1079, // match move
0x80000000|201, // no-match move
0x80000000|85, // NT-test-match state for `else
  }
,
{ // state 846
2,772, // ws*
83,728, // ws
84,1007, // " "
85,32, // {10}
MIN_REDUCTION+79, // (default reduction)
  }
,
{ // state 847
7,100, // ID
17,734, // `(
20,389, // <type>
27,10, // `int
28,171, // `boolean
32,374, // <stmt>
33,942, // <assign>
35,1098, // `{
38,368, // <local var decl>
39,834, // `if
40,158, // <expr>
43,138, // `while
45,1043, // <expr8>
46,127, // <expr7>
47,125, // <expr6>
48,130, // <expr5>
49,86, // <expr4>
51,210, // <expr3>
53,982, // <expr2>
54,792, // <cast expr>
55,625, // <unary expr>
56,656, // <expr1>
57,371, // `-
58,819, // INTLIT
59,376, // letter
60,677, // "p"
61,677, // "v"
62,677, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q" "s" "y".."z"}
63,677, // "c"
64,677, // "i"
65,677, // "l"
66,677, // "o"
67,677, // "r"
68,677, // "u"
69,677, // "x"
70,677, // "b"
71,677, // "e"
72,677, // "h"
73,677, // "t"
74,677, // "w"
75,635, // letter128
76,154, // {199..218 231..250}
77,154, // {193..198 225..230}
79,164, // {"1".."9"}
80,393, // "0"
81,489, // digit128
82,1107, // {176..185}
86,975, // "#"
90,846, // "("
92,662, // "{"
94,17, // "-"
  }
,
{ // state 848
MIN_REDUCTION+134, // (default reduction)
  }
,
{ // state 849
MIN_REDUCTION+134, // (default reduction)
  }
,
{ // state 850
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 851
MIN_REDUCTION+55, // (default reduction)
  }
,
{ // state 852
30,MIN_REDUCTION+104, // `[
96,MIN_REDUCTION+104, // "["
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 853
30,MIN_REDUCTION+135, // `[
96,MIN_REDUCTION+135, // "["
MIN_REDUCTION+135, // (default reduction)
  }
,
{ // state 854
30,MIN_REDUCTION+134, // `[
96,MIN_REDUCTION+134, // "["
MIN_REDUCTION+134, // (default reduction)
  }
,
{ // state 855
MIN_REDUCTION+24, // (default reduction)
  }
,
{ // state 856
MIN_REDUCTION+136, // (default reduction)
  }
,
{ // state 857
30,MIN_REDUCTION+134, // `[
96,MIN_REDUCTION+134, // "["
MIN_REDUCTION+134, // (default reduction)
  }
,
{ // state 858
30,MIN_REDUCTION+104, // `[
96,MIN_REDUCTION+104, // "["
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 859
MIN_REDUCTION+134, // (default reduction)
  }
,
{ // state 860
83,435, // ws
84,291, // " "
85,722, // {10}
MIN_REDUCTION+100, // (default reduction)
  }
,
{ // state 861
30,MIN_REDUCTION+104, // `[
96,MIN_REDUCTION+104, // "["
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 862
MIN_REDUCTION+115, // (default reduction)
  }
,
{ // state 863
30,260, // `[
96,322, // "["
MIN_REDUCTION+44, // (default reduction)
  }
,
{ // state 864
MIN_REDUCTION+115, // (default reduction)
  }
,
{ // state 865
0x80000000|1, // match move
0x80000000|254, // no-match move
0x80000000|36, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 866
7,100, // ID
17,734, // `(
20,389, // <type>
27,10, // `int
28,171, // `boolean
32,999, // <stmt>
33,810, // <assign>
35,488, // `{
38,310, // <local var decl>
39,3, // `if
40,158, // <expr>
43,1031, // `while
45,1043, // <expr8>
46,127, // <expr7>
47,125, // <expr6>
48,130, // <expr5>
49,86, // <expr4>
51,210, // <expr3>
53,982, // <expr2>
54,792, // <cast expr>
55,625, // <unary expr>
56,656, // <expr1>
57,371, // `-
58,819, // INTLIT
59,376, // letter
60,677, // "p"
61,677, // "v"
62,677, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q" "s" "y".."z"}
63,677, // "c"
64,677, // "i"
65,677, // "l"
66,677, // "o"
67,677, // "r"
68,677, // "u"
69,677, // "x"
70,677, // "b"
71,677, // "e"
72,677, // "h"
73,677, // "t"
74,677, // "w"
75,635, // letter128
76,154, // {199..218 231..250}
77,154, // {193..198 225..230}
79,164, // {"1".."9"}
80,393, // "0"
81,489, // digit128
82,1107, // {176..185}
86,975, // "#"
90,846, // "("
92,662, // "{"
94,17, // "-"
  }
,
{ // state 867
83,879, // ws
84,606, // " "
85,274, // {10}
MIN_REDUCTION+142, // (default reduction)
  }
,
{ // state 868
30,MIN_REDUCTION+134, // `[
96,MIN_REDUCTION+134, // "["
MIN_REDUCTION+134, // (default reduction)
  }
,
{ // state 869
MIN_REDUCTION+55, // (default reduction)
  }
,
{ // state 870
MIN_REDUCTION+54, // (default reduction)
  }
,
{ // state 871
0x80000000|1079, // match move
0x80000000|302, // no-match move
0x80000000|85, // NT-test-match state for `else
  }
,
{ // state 872
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 873
MIN_REDUCTION+55, // (default reduction)
  }
,
{ // state 874
30,MIN_REDUCTION+113, // `[
96,MIN_REDUCTION+113, // "["
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 875
MIN_REDUCTION+115, // (default reduction)
  }
,
{ // state 876
0x80000000|89, // match move
0x80000000|1085, // no-match move
0x80000000|36, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 877
MIN_REDUCTION+115, // (default reduction)
  }
,
{ // state 878
MIN_REDUCTION+54, // (default reduction)
  }
,
{ // state 879
MIN_REDUCTION+134, // (default reduction)
  }
,
{ // state 880
MIN_REDUCTION+4, // (default reduction)
  }
,
{ // state 881
MIN_REDUCTION+54, // (default reduction)
  }
,
{ // state 882
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 883
MIN_REDUCTION+115, // (default reduction)
  }
,
{ // state 884
30,MIN_REDUCTION+104, // `[
96,MIN_REDUCTION+104, // "["
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 885
MIN_REDUCTION+55, // (default reduction)
  }
,
{ // state 886
64,319, // "i"
70,803, // "b"
  }
,
{ // state 887
30,260, // `[
96,322, // "["
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 888
0x80000000|179, // match move
0x80000000|369, // no-match move
0x80000000|36, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 889
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 890
42,146, // `else
86,386, // "#"
  }
,
{ // state 891
11,209, // $$0
35,698, // `{
92,94, // "{"
  }
,
{ // state 892
30,MIN_REDUCTION+53, // `[
96,MIN_REDUCTION+53, // "["
MIN_REDUCTION+53, // (default reduction)
  }
,
{ // state 893
0x80000000|1, // match move
0x80000000|778, // no-match move
0x80000000|36, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 894
83,766, // ws
84,688, // " "
85,30, // {10}
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 895
2,564, // ws*
30,MIN_REDUCTION+147, // `[
83,60, // ws
84,110, // " "
85,523, // {10}
96,MIN_REDUCTION+147, // "["
MIN_REDUCTION+147, // (default reduction)
  }
,
{ // state 896
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 897
2,860, // ws*
83,924, // ws
84,291, // " "
85,722, // {10}
MIN_REDUCTION+101, // (default reduction)
  }
,
{ // state 898
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 899
MIN_REDUCTION+134, // (default reduction)
  }
,
{ // state 900
0x80000000|1, // match move
0x80000000|724, // no-match move
0x80000000|36, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 901
35,436, // `{
92,285, // "{"
  }
,
{ // state 902
30,204, // `[
96,322, // "["
MIN_REDUCTION+44, // (default reduction)
  }
,
{ // state 903
0x80000000|872, // match move
0x80000000|575, // no-match move
0x80000000|36, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 904
2,562, // ws*
30,MIN_REDUCTION+147, // `[
83,63, // ws
84,113, // " "
85,25, // {10}
96,MIN_REDUCTION+147, // "["
MIN_REDUCTION+147, // (default reduction)
  }
,
{ // state 905
30,193, // `[
96,322, // "["
MIN_REDUCTION+44, // (default reduction)
  }
,
{ // state 906
0x80000000|1, // match move
0x80000000|729, // no-match move
0x80000000|36, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 907
2,934, // ws*
83,1090, // ws
84,1026, // " "
85,286, // {10}
MIN_REDUCTION+101, // (default reduction)
  }
,
{ // state 908
34,1089, // `;
99,923, // ";"
  }
,
{ // state 909
0x80000000|872, // match move
0x80000000|577, // no-match move
0x80000000|36, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 910
2,806, // ws*
83,1137, // ws
84,284, // " "
85,885, // {10}
MIN_REDUCTION+101, // (default reduction)
  }
,
{ // state 911
MIN_REDUCTION+22, // (default reduction)
  }
,
{ // state 912
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 913
2,123, // ws*
83,646, // ws
84,1097, // " "
85,90, // {10}
MIN_REDUCTION+61, // (default reduction)
  }
,
{ // state 914
MIN_REDUCTION+118, // (default reduction)
  }
,
{ // state 915
MIN_REDUCTION+22, // (default reduction)
  }
,
{ // state 916
0x80000000|872, // match move
0x80000000|559, // no-match move
0x80000000|36, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 917
30,MIN_REDUCTION+55, // `[
96,MIN_REDUCTION+55, // "["
MIN_REDUCTION+55, // (default reduction)
  }
,
{ // state 918
7,96, // ID
17,731, // `(
40,661, // <expr>
45,1041, // <expr8>
46,131, // <expr7>
47,128, // <expr6>
48,126, // <expr5>
49,87, // <expr4>
51,213, // <expr3>
53,973, // <expr2>
54,794, // <cast expr>
55,624, // <unary expr>
56,657, // <expr1>
57,367, // `-
58,815, // INTLIT
59,1066, // letter
60,677, // "p"
61,677, // "v"
62,677, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q" "s" "y".."z"}
63,677, // "c"
64,677, // "i"
65,677, // "l"
66,677, // "o"
67,677, // "r"
68,677, // "u"
69,677, // "x"
70,677, // "b"
71,677, // "e"
72,677, // "h"
73,677, // "t"
74,677, // "w"
75,1105, // letter128
76,595, // {199..218 231..250}
77,595, // {193..198 225..230}
79,162, // {"1".."9"}
80,394, // "0"
81,491, // digit128
82,1108, // {176..185}
90,846, // "("
94,17, // "-"
  }
,
{ // state 919
0x80000000|1, // match move
0x80000000|741, // no-match move
0x80000000|36, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 920
2,586, // ws*
30,MIN_REDUCTION+147, // `[
83,34, // ws
84,105, // " "
85,20, // {10}
96,MIN_REDUCTION+147, // "["
MIN_REDUCTION+147, // (default reduction)
  }
,
{ // state 921
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 922
0x80000000|152, // match move
0x80000000|316, // no-match move
0x80000000|36, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 923
0x80000000|7, // match move
0x80000000|1076, // no-match move
0x80000000|85, // NT-test-match state for `else
  }
,
{ // state 924
MIN_REDUCTION+135, // (default reduction)
  }
,
{ // state 925
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 926
2,787, // ws*
83,1126, // ws
84,306, // " "
85,873, // {10}
MIN_REDUCTION+101, // (default reduction)
  }
,
{ // state 927
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 928
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 929
MIN_REDUCTION+53, // (default reduction)
  }
,
{ // state 930
83,766, // ws
84,688, // " "
85,30, // {10}
MIN_REDUCTION+84, // (default reduction)
  }
,
{ // state 931
2,831, // ws*
83,1141, // ws
84,311, // " "
85,851, // {10}
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 932
2,453, // ws*
83,634, // ws
84,881, // " "
85,441, // {10}
MIN_REDUCTION+79, // (default reduction)
  }
,
{ // state 933
MIN_REDUCTION+115, // (default reduction)
  }
,
{ // state 934
83,899, // ws
84,1026, // " "
85,286, // {10}
MIN_REDUCTION+100, // (default reduction)
  }
,
{ // state 935
MIN_REDUCTION+119, // (default reduction)
  }
,
{ // state 936
2,448, // ws*
83,632, // ws
84,878, // " "
85,439, // {10}
MIN_REDUCTION+79, // (default reduction)
  }
,
{ // state 937
78,914, // digit
79,960, // {"1".."9"}
80,960, // "0"
81,670, // digit128
82,1101, // {176..185}
103,655, // $$4
  }
,
{ // state 938
7,1058, // ID
29,56, // <empty bracket pair>
30,43, // `[
59,419, // letter
60,677, // "p"
61,677, // "v"
62,677, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q" "s" "y".."z"}
63,677, // "c"
64,677, // "i"
65,677, // "l"
66,677, // "o"
67,677, // "r"
68,677, // "u"
69,677, // "x"
70,677, // "b"
71,677, // "e"
72,677, // "h"
73,677, // "t"
74,677, // "w"
75,373, // letter128
76,694, // {199..218 231..250}
77,694, // {193..198 225..230}
96,931, // "["
  }
,
{ // state 939
2,616, // ws*
30,MIN_REDUCTION+147, // `[
83,75, // ws
84,137, // " "
85,543, // {10}
96,MIN_REDUCTION+147, // "["
MIN_REDUCTION+147, // (default reduction)
  }
,
{ // state 940
0x80000000|780, // match move
0x80000000|23, // no-match move
0x80000000|85, // NT-test-match state for `else
  }
,
{ // state 941
7,1059, // ID
29,56, // <empty bracket pair>
30,43, // `[
59,422, // letter
60,677, // "p"
61,677, // "v"
62,677, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q" "s" "y".."z"}
63,677, // "c"
64,677, // "i"
65,677, // "l"
66,677, // "o"
67,677, // "r"
68,677, // "u"
69,677, // "x"
70,677, // "b"
71,677, // "e"
72,677, // "h"
73,677, // "t"
74,677, // "w"
75,372, // letter128
76,695, // {199..218 231..250}
77,695, // {193..198 225..230}
96,931, // "["
  }
,
{ // state 942
34,636, // `;
99,348, // ";"
  }
,
{ // state 943
83,418, // ws
84,560, // " "
85,151, // {10}
MIN_REDUCTION+80, // (default reduction)
  }
,
{ // state 944
83,381, // ws
84,843, // " "
85,750, // {10}
114,MIN_REDUCTION+94, // $NT
  }
,
{ // state 945
83,143, // ws
84,797, // " "
85,197, // {10}
MIN_REDUCTION+88, // (default reduction)
  }
,
{ // state 946
MIN_REDUCTION+53, // (default reduction)
  }
,
{ // state 947
MIN_REDUCTION+40, // (default reduction)
  }
,
{ // state 948
0x80000000|182, // match move
0x80000000|169, // no-match move
0x80000000|36, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 949
78,914, // digit
79,960, // {"1".."9"}
80,960, // "0"
81,679, // digit128
82,1107, // {176..185}
103,633, // $$4
  }
,
{ // state 950
MIN_REDUCTION+132, // (default reduction)
  }
,
{ // state 951
30,217, // `[
96,322, // "["
MIN_REDUCTION+44, // (default reduction)
  }
,
{ // state 952
78,914, // digit
79,960, // {"1".."9"}
80,960, // "0"
81,676, // digit128
82,1108, // {176..185}
103,631, // $$4
  }
,
{ // state 953
0x80000000|1, // match move
0x80000000|208, // no-match move
0x80000000|36, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 954
0x80000000|407, // match move
0x80000000|226, // no-match move
0x80000000|36, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 955
MIN_REDUCTION+135, // (default reduction)
  }
,
{ // state 956
0x80000000|969, // match move
0x80000000|168, // no-match move
0x80000000|36, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 957
114,MIN_REDUCTION+135, // $NT
MIN_REDUCTION+135, // (default reduction)
  }
,
{ // state 958
MIN_REDUCTION+55, // (default reduction)
  }
,
{ // state 959
59,546, // letter
60,55, // "p"
61,55, // "v"
62,55, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q" "s" "y".."z"}
63,55, // "c"
64,55, // "i"
65,55, // "l"
66,55, // "o"
67,55, // "r"
68,55, // "u"
69,55, // "x"
70,55, // "b"
71,55, // "e"
72,55, // "h"
73,55, // "t"
74,55, // "w"
75,816, // letter128
76,1069, // {199..218 231..250}
77,1069, // {193..198 225..230}
78,219, // digit
79,185, // {"1".."9"}
80,185, // "0"
81,591, // digit128
82,109, // {176..185}
101,341, // $$3
106,1096, // idChar
107,1077, // "_"
108,1099, // idChar128
109,933, // {223}
  }
,
{ // state 960
MIN_REDUCTION+52, // (default reduction)
  }
,
{ // state 961
0x80000000|1048, // match move
0x80000000|250, // no-match move
0x80000000|85, // NT-test-match state for `else
  }
,
{ // state 962
0x80000000|406, // match move
0x80000000|195, // no-match move
0x80000000|36, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 963
2,793, // ws*
83,1132, // ws
84,297, // " "
85,869, // {10}
MIN_REDUCTION+101, // (default reduction)
  }
,
{ // state 964
83,337, // ws
84,535, // " "
85,958, // {10}
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 965
MIN_REDUCTION+114, // (default reduction)
  }
,
{ // state 966
0x80000000|387, // match move
0x80000000|247, // no-match move
0x80000000|36, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 967
78,914, // digit
79,960, // {"1".."9"}
80,960, // "0"
81,710, // digit128
82,1120, // {176..185}
103,607, // $$4
  }
,
{ // state 968
7,93, // ID
17,734, // `(
51,1065, // <expr3>
53,982, // <expr2>
54,792, // <cast expr>
55,625, // <unary expr>
56,656, // <expr1>
57,371, // `-
58,819, // INTLIT
59,1078, // letter
60,677, // "p"
61,677, // "v"
62,677, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q" "s" "y".."z"}
63,677, // "c"
64,677, // "i"
65,677, // "l"
66,677, // "o"
67,677, // "r"
68,677, // "u"
69,677, // "x"
70,677, // "b"
71,677, // "e"
72,677, // "h"
73,677, // "t"
74,677, // "w"
75,1102, // letter128
76,599, // {199..218 231..250}
77,599, // {193..198 225..230}
79,164, // {"1".."9"}
80,393, // "0"
81,489, // digit128
82,1107, // {176..185}
90,846, // "("
94,17, // "-"
  }
,
{ // state 969
2,784, // ws*
  }
,
{ // state 970
2,953, // ws*
  }
,
{ // state 971
7,96, // ID
17,731, // `(
51,1073, // <expr3>
53,973, // <expr2>
54,794, // <cast expr>
55,624, // <unary expr>
56,657, // <expr1>
57,367, // `-
58,815, // INTLIT
59,1066, // letter
60,677, // "p"
61,677, // "v"
62,677, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q" "s" "y".."z"}
63,677, // "c"
64,677, // "i"
65,677, // "l"
66,677, // "o"
67,677, // "r"
68,677, // "u"
69,677, // "x"
70,677, // "b"
71,677, // "e"
72,677, // "h"
73,677, // "t"
74,677, // "w"
75,1105, // letter128
76,595, // {199..218 231..250}
77,595, // {193..198 225..230}
79,162, // {"1".."9"}
80,394, // "0"
81,491, // digit128
82,1108, // {176..185}
90,846, // "("
94,17, // "-"
  }
,
{ // state 972
31,589, // `]
97,338, // "]"
  }
,
{ // state 973
MIN_REDUCTION+40, // (default reduction)
  }
,
{ // state 974
2,464, // ws*
83,1132, // ws
84,297, // " "
85,869, // {10}
MIN_REDUCTION+143, // (default reduction)
  }
,
{ // state 975
64,132, // "i"
70,121, // "b"
74,647, // "w"
87,458, // "+"
  }
,
{ // state 976
MIN_REDUCTION+103, // (default reduction)
  }
,
{ // state 977
MIN_REDUCTION+103, // (default reduction)
  }
,
{ // state 978
2,446, // ws*
83,1126, // ws
84,306, // " "
85,873, // {10}
MIN_REDUCTION+143, // (default reduction)
  }
,
{ // state 979
2,822, // ws*
  }
,
{ // state 980
2,820, // ws*
  }
,
{ // state 981
7,1070, // ID
17,715, // `(
51,1086, // <expr3>
53,947, // <expr2>
54,775, // <cast expr>
55,805, // <unary expr>
56,638, // <expr1>
57,379, // `-
58,800, // INTLIT
59,1051, // letter
60,677, // "p"
61,677, // "v"
62,677, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q" "s" "y".."z"}
63,677, // "c"
64,677, // "i"
65,677, // "l"
66,677, // "o"
67,677, // "r"
68,677, // "u"
69,677, // "x"
70,677, // "b"
71,677, // "e"
72,677, // "h"
73,677, // "t"
74,677, // "w"
75,1092, // letter128
76,613, // {199..218 231..250}
77,613, // {193..198 225..230}
79,84, // {"1".."9"}
80,403, // "0"
81,506, // digit128
82,1101, // {176..185}
90,846, // "("
94,17, // "-"
  }
,
{ // state 982
MIN_REDUCTION+40, // (default reduction)
  }
,
{ // state 983
MIN_REDUCTION+53, // (default reduction)
  }
,
{ // state 984
MIN_REDUCTION+128, // (default reduction)
  }
,
{ // state 985
17,578, // `(
90,785, // "("
  }
,
{ // state 986
2,746, // ws*
  }
,
{ // state 987
MIN_REDUCTION+19, // (default reduction)
  }
,
{ // state 988
MIN_REDUCTION+103, // (default reduction)
  }
,
{ // state 989
2,91, // ws*
83,1137, // ws
84,284, // " "
85,885, // {10}
MIN_REDUCTION+143, // (default reduction)
  }
,
{ // state 990
30,217, // `[
96,322, // "["
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 991
MIN_REDUCTION+103, // (default reduction)
  }
,
{ // state 992
83,899, // ws
84,1026, // " "
85,286, // {10}
MIN_REDUCTION+94, // (default reduction)
  }
,
{ // state 993
2,263, // ws*
83,555, // ws
84,606, // " "
85,274, // {10}
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 994
2,823, // ws*
83,202, // ws
84,97, // " "
85,1093, // {10}
MIN_REDUCTION+73, // (default reduction)
  }
,
{ // state 995
MIN_REDUCTION+27, // (default reduction)
  }
,
{ // state 996
7,100, // ID
17,734, // `(
20,389, // <type>
27,10, // `int
28,171, // `boolean
32,467, // <stmt>
33,776, // <assign>
35,1042, // `{
38,620, // <local var decl>
39,279, // `if
40,158, // <expr>
43,711, // `while
45,1043, // <expr8>
46,127, // <expr7>
47,125, // <expr6>
48,130, // <expr5>
49,86, // <expr4>
51,210, // <expr3>
53,982, // <expr2>
54,792, // <cast expr>
55,625, // <unary expr>
56,656, // <expr1>
57,371, // `-
58,819, // INTLIT
59,376, // letter
60,677, // "p"
61,677, // "v"
62,677, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q" "s" "y".."z"}
63,677, // "c"
64,677, // "i"
65,677, // "l"
66,677, // "o"
67,677, // "r"
68,677, // "u"
69,677, // "x"
70,677, // "b"
71,677, // "e"
72,677, // "h"
73,677, // "t"
74,677, // "w"
75,635, // letter128
76,154, // {199..218 231..250}
77,154, // {193..198 225..230}
79,164, // {"1".."9"}
80,393, // "0"
81,489, // digit128
82,1107, // {176..185}
86,975, // "#"
90,846, // "("
92,662, // "{"
94,17, // "-"
  }
,
{ // state 997
MIN_REDUCTION+40, // (default reduction)
  }
,
{ // state 998
30,204, // `[
96,322, // "["
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 999
MIN_REDUCTION+28, // (default reduction)
  }
,
{ // state 1000
30,MIN_REDUCTION+108, // `[
96,MIN_REDUCTION+108, // "["
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 1001
7,1070, // ID
17,715, // `(
40,175, // <expr>
45,1060, // <expr8>
46,111, // <expr7>
47,107, // <expr6>
48,114, // <expr5>
49,74, // <expr4>
51,335, // <expr3>
53,947, // <expr2>
54,775, // <cast expr>
55,805, // <unary expr>
56,638, // <expr1>
57,379, // `-
58,800, // INTLIT
59,1051, // letter
60,677, // "p"
61,677, // "v"
62,677, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q" "s" "y".."z"}
63,677, // "c"
64,677, // "i"
65,677, // "l"
66,677, // "o"
67,677, // "r"
68,677, // "u"
69,677, // "x"
70,677, // "b"
71,677, // "e"
72,677, // "h"
73,677, // "t"
74,677, // "w"
75,1092, // letter128
76,613, // {199..218 231..250}
77,613, // {193..198 225..230}
79,84, // {"1".."9"}
80,403, // "0"
81,506, // digit128
82,1101, // {176..185}
90,846, // "("
94,17, // "-"
  }
,
{ // state 1002
30,193, // `[
96,322, // "["
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 1003
0x80000000|659, // match move
0x80000000|1016, // no-match move
0x80000000|85, // NT-test-match state for `else
  }
,
{ // state 1004
41,847, // `)
91,463, // ")"
  }
,
{ // state 1005
17,522, // `(
90,785, // "("
  }
,
{ // state 1006
7,100, // ID
17,734, // `(
20,389, // <type>
27,10, // `int
28,171, // `boolean
32,303, // <stmt>
33,776, // <assign>
35,1042, // `{
38,620, // <local var decl>
39,279, // `if
40,158, // <expr>
43,711, // `while
45,1043, // <expr8>
46,127, // <expr7>
47,125, // <expr6>
48,130, // <expr5>
49,86, // <expr4>
51,210, // <expr3>
53,982, // <expr2>
54,792, // <cast expr>
55,625, // <unary expr>
56,656, // <expr1>
57,371, // `-
58,819, // INTLIT
59,376, // letter
60,677, // "p"
61,677, // "v"
62,677, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q" "s" "y".."z"}
63,677, // "c"
64,677, // "i"
65,677, // "l"
66,677, // "o"
67,677, // "r"
68,677, // "u"
69,677, // "x"
70,677, // "b"
71,677, // "e"
72,677, // "h"
73,677, // "t"
74,677, // "w"
75,635, // letter128
76,154, // {199..218 231..250}
77,154, // {193..198 225..230}
79,164, // {"1".."9"}
80,393, // "0"
81,489, // digit128
82,1107, // {176..185}
86,975, // "#"
90,846, // "("
92,662, // "{"
94,17, // "-"
  }
,
{ // state 1007
MIN_REDUCTION+54, // (default reduction)
  }
,
{ // state 1008
MIN_REDUCTION+23, // (default reduction)
  }
,
{ // state 1009
30,MIN_REDUCTION+108, // `[
96,MIN_REDUCTION+108, // "["
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 1010
30,MIN_REDUCTION+108, // `[
96,MIN_REDUCTION+108, // "["
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 1011
7,100, // ID
17,734, // `(
20,389, // <type>
27,10, // `int
28,171, // `boolean
32,295, // <stmt>
33,942, // <assign>
35,1098, // `{
38,368, // <local var decl>
39,834, // `if
40,158, // <expr>
43,138, // `while
45,1043, // <expr8>
46,127, // <expr7>
47,125, // <expr6>
48,130, // <expr5>
49,86, // <expr4>
51,210, // <expr3>
53,982, // <expr2>
54,792, // <cast expr>
55,625, // <unary expr>
56,656, // <expr1>
57,371, // `-
58,819, // INTLIT
59,376, // letter
60,677, // "p"
61,677, // "v"
62,677, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q" "s" "y".."z"}
63,677, // "c"
64,677, // "i"
65,677, // "l"
66,677, // "o"
67,677, // "r"
68,677, // "u"
69,677, // "x"
70,677, // "b"
71,677, // "e"
72,677, // "h"
73,677, // "t"
74,677, // "w"
75,635, // letter128
76,154, // {199..218 231..250}
77,154, // {193..198 225..230}
79,164, // {"1".."9"}
80,393, // "0"
81,489, // digit128
82,1107, // {176..185}
86,975, // "#"
90,846, // "("
92,662, // "{"
94,17, // "-"
  }
,
{ // state 1012
MIN_REDUCTION+54, // (default reduction)
  }
,
{ // state 1013
2,156, // ws*
83,282, // ws
84,539, // " "
85,222, // {10}
MIN_REDUCTION+143, // (default reduction)
  }
,
{ // state 1014
2,73, // ws*
83,1090, // ws
84,1026, // " "
85,286, // {10}
MIN_REDUCTION+57, // (default reduction)
  }
,
{ // state 1015
2,159, // ws*
83,280, // ws
84,537, // " "
85,224, // {10}
MIN_REDUCTION+143, // (default reduction)
  }
,
{ // state 1016
MIN_REDUCTION+23, // (default reduction)
  }
,
{ // state 1017
7,100, // ID
17,734, // `(
20,389, // <type>
27,10, // `int
28,171, // `boolean
32,1114, // <stmt>
33,810, // <assign>
35,488, // `{
36,153, // <stmt>*
37,660, // `}
38,310, // <local var decl>
39,3, // `if
40,158, // <expr>
43,1031, // `while
45,1043, // <expr8>
46,127, // <expr7>
47,125, // <expr6>
48,130, // <expr5>
49,86, // <expr4>
51,210, // <expr3>
53,982, // <expr2>
54,792, // <cast expr>
55,625, // <unary expr>
56,656, // <expr1>
57,371, // `-
58,819, // INTLIT
59,376, // letter
60,677, // "p"
61,677, // "v"
62,677, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q" "s" "y".."z"}
63,677, // "c"
64,677, // "i"
65,677, // "l"
66,677, // "o"
67,677, // "r"
68,677, // "u"
69,677, // "x"
70,677, // "b"
71,677, // "e"
72,677, // "h"
73,677, // "t"
74,677, // "w"
75,635, // letter128
76,154, // {199..218 231..250}
77,154, // {193..198 225..230}
79,164, // {"1".."9"}
80,393, // "0"
81,489, // digit128
82,1107, // {176..185}
86,975, // "#"
90,846, // "("
92,662, // "{"
93,961, // "}"
94,17, // "-"
  }
,
{ // state 1018
83,859, // ws
84,97, // " "
85,1093, // {10}
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 1019
MIN_REDUCTION+121, // (default reduction)
  }
,
{ // state 1020
MIN_REDUCTION+121, // (default reduction)
  }
,
{ // state 1021
2,765, // ws*
83,1074, // ws
84,1046, // " "
85,188, // {10}
MIN_REDUCTION+75, // (default reduction)
  }
,
{ // state 1022
MIN_REDUCTION+125, // (default reduction)
  }
,
{ // state 1023
7,1070, // ID
17,715, // `(
40,359, // <expr>
45,1060, // <expr8>
46,111, // <expr7>
47,107, // <expr6>
48,114, // <expr5>
49,74, // <expr4>
51,335, // <expr3>
53,947, // <expr2>
54,775, // <cast expr>
55,805, // <unary expr>
56,638, // <expr1>
57,379, // `-
58,800, // INTLIT
59,1051, // letter
60,677, // "p"
61,677, // "v"
62,677, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q" "s" "y".."z"}
63,677, // "c"
64,677, // "i"
65,677, // "l"
66,677, // "o"
67,677, // "r"
68,677, // "u"
69,677, // "x"
70,677, // "b"
71,677, // "e"
72,677, // "h"
73,677, // "t"
74,677, // "w"
75,1092, // letter128
76,613, // {199..218 231..250}
77,613, // {193..198 225..230}
79,84, // {"1".."9"}
80,403, // "0"
81,506, // digit128
82,1101, // {176..185}
90,846, // "("
94,17, // "-"
  }
,
{ // state 1024
41,1006, // `)
91,463, // ")"
  }
,
{ // state 1025
2,70, // ws*
83,924, // ws
84,291, // " "
85,722, // {10}
MIN_REDUCTION+143, // (default reduction)
  }
,
{ // state 1026
MIN_REDUCTION+54, // (default reduction)
  }
,
{ // state 1027
MIN_REDUCTION+135, // (default reduction)
  }
,
{ // state 1028
17,16, // `(
90,932, // "("
  }
,
{ // state 1029
30,MIN_REDUCTION+108, // `[
96,MIN_REDUCTION+108, // "["
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 1030
34,225, // `;
99,12, // ";"
  }
,
{ // state 1031
17,145, // `(
90,785, // "("
  }
,
{ // state 1032
2,865, // ws*
  }
,
{ // state 1033
0x80000000|872, // match move
0x80000000|609, // no-match move
0x80000000|36, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1034
30,MIN_REDUCTION+51, // `[
96,MIN_REDUCTION+51, // "["
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 1035
0x80000000|396, // match move
0x80000000|507, // no-match move
0x80000000|85, // NT-test-match state for `else
  }
,
{ // state 1036
52,761, // `*
89,768, // "*"
MIN_REDUCTION+37, // (default reduction)
  }
,
{ // state 1037
44,641, // `=
95,363, // "="
  }
,
{ // state 1038
83,859, // ws
84,97, // " "
85,1093, // {10}
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 1039
MIN_REDUCTION+54, // (default reduction)
  }
,
{ // state 1040
MIN_REDUCTION+102, // (default reduction)
  }
,
{ // state 1041
MIN_REDUCTION+32, // (default reduction)
  }
,
{ // state 1042
7,100, // ID
17,734, // `(
20,389, // <type>
27,10, // `int
28,171, // `boolean
32,1114, // <stmt>
33,810, // <assign>
35,488, // `{
36,409, // <stmt>*
37,186, // `}
38,310, // <local var decl>
39,3, // `if
40,158, // <expr>
43,1031, // `while
45,1043, // <expr8>
46,127, // <expr7>
47,125, // <expr6>
48,130, // <expr5>
49,86, // <expr4>
51,210, // <expr3>
53,982, // <expr2>
54,792, // <cast expr>
55,625, // <unary expr>
56,656, // <expr1>
57,371, // `-
58,819, // INTLIT
59,376, // letter
60,677, // "p"
61,677, // "v"
62,677, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q" "s" "y".."z"}
63,677, // "c"
64,677, // "i"
65,677, // "l"
66,677, // "o"
67,677, // "r"
68,677, // "u"
69,677, // "x"
70,677, // "b"
71,677, // "e"
72,677, // "h"
73,677, // "t"
74,677, // "w"
75,635, // letter128
76,154, // {199..218 231..250}
77,154, // {193..198 225..230}
79,164, // {"1".."9"}
80,393, // "0"
81,489, // digit128
82,1107, // {176..185}
86,975, // "#"
90,846, // "("
92,662, // "{"
93,572, // "}"
94,17, // "-"
  }
,
{ // state 1043
MIN_REDUCTION+32, // (default reduction)
  }
,
{ // state 1044
30,MIN_REDUCTION+144, // `[
83,27, // ws
84,110, // " "
85,523, // {10}
96,MIN_REDUCTION+144, // "["
MIN_REDUCTION+144, // (default reduction)
  }
,
{ // state 1045
30,MIN_REDUCTION+51, // `[
96,MIN_REDUCTION+51, // "["
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 1046
MIN_REDUCTION+54, // (default reduction)
  }
,
{ // state 1047
68,1021, // "u"
  }
,
{ // state 1048
2,845, // ws*
MIN_REDUCTION+85, // (default reduction)
  }
,
{ // state 1049
83,654, // ws
84,579, // " "
85,72, // {10}
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 1050
30,MIN_REDUCTION+144, // `[
83,29, // ws
84,113, // " "
85,25, // {10}
96,MIN_REDUCTION+144, // "["
MIN_REDUCTION+144, // (default reduction)
  }
,
{ // state 1051
59,546, // letter
60,55, // "p"
61,55, // "v"
62,55, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q" "s" "y".."z"}
63,55, // "c"
64,55, // "i"
65,55, // "l"
66,55, // "o"
67,55, // "r"
68,55, // "u"
69,55, // "x"
70,55, // "b"
71,55, // "e"
72,55, // "h"
73,55, // "t"
74,55, // "w"
75,916, // letter128
76,613, // {199..218 231..250}
77,613, // {193..198 225..230}
78,219, // digit
79,185, // {"1".."9"}
80,185, // "0"
81,650, // digit128
82,1101, // {176..185}
100,45, // idChar*
101,92, // $$3
106,401, // idChar
107,1077, // "_"
108,888, // idChar128
109,685, // {223}
  }
,
{ // state 1052
MIN_REDUCTION+55, // (default reduction)
  }
,
{ // state 1053
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 1054
MIN_REDUCTION+129, // (default reduction)
  }
,
{ // state 1055
2,531, // ws*
83,646, // ws
84,1097, // " "
85,90, // {10}
MIN_REDUCTION+59, // (default reduction)
  }
,
{ // state 1056
MIN_REDUCTION+28, // (default reduction)
  }
,
{ // state 1057
30,MIN_REDUCTION+144, // `[
83,5, // ws
84,105, // " "
85,20, // {10}
96,MIN_REDUCTION+144, // "["
MIN_REDUCTION+144, // (default reduction)
  }
,
{ // state 1058
MIN_REDUCTION+14, // (default reduction)
  }
,
{ // state 1059
MIN_REDUCTION+14, // (default reduction)
  }
,
{ // state 1060
MIN_REDUCTION+32, // (default reduction)
  }
,
{ // state 1061
MIN_REDUCTION+102, // (default reduction)
  }
,
{ // state 1062
2,1111, // ws*
83,646, // ws
84,1097, // " "
85,90, // {10}
MIN_REDUCTION+63, // (default reduction)
  }
,
{ // state 1063
MIN_REDUCTION+114, // (default reduction)
  }
,
{ // state 1064
30,MIN_REDUCTION+114, // `[
96,MIN_REDUCTION+114, // "["
MIN_REDUCTION+114, // (default reduction)
  }
,
{ // state 1065
52,742, // `*
89,768, // "*"
MIN_REDUCTION+37, // (default reduction)
  }
,
{ // state 1066
59,546, // letter
60,55, // "p"
61,55, // "v"
62,55, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q" "s" "y".."z"}
63,55, // "c"
64,55, // "i"
65,55, // "l"
66,55, // "o"
67,55, // "r"
68,55, // "u"
69,55, // "x"
70,55, // "b"
71,55, // "e"
72,55, // "h"
73,55, // "t"
74,55, // "w"
75,909, // letter128
76,595, // {199..218 231..250}
77,595, // {193..198 225..230}
78,219, // digit
79,185, // {"1".."9"}
80,185, // "0"
81,664, // digit128
82,1108, // {176..185}
100,54, // idChar*
101,101, // $$3
106,401, // idChar
107,1077, // "_"
108,948, // idChar128
109,663, // {223}
  }
,
{ // state 1067
30,MIN_REDUCTION+103, // `[
96,MIN_REDUCTION+103, // "["
MIN_REDUCTION+103, // (default reduction)
  }
,
{ // state 1068
30,MIN_REDUCTION+114, // `[
96,MIN_REDUCTION+114, // "["
MIN_REDUCTION+114, // (default reduction)
  }
,
{ // state 1069
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 1070
0x80000000|1, // match move
0x80000000|814, // no-match move
0x80000000|36, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1071
2,218, // ws*
83,940, // ws
84,688, // " "
85,30, // {10}
MIN_REDUCTION+99, // (default reduction)
  }
,
{ // state 1072
2,687, // ws*
83,728, // ws
84,1007, // " "
85,32, // {10}
MIN_REDUCTION+97, // (default reduction)
  }
,
{ // state 1073
52,745, // `*
89,768, // "*"
MIN_REDUCTION+37, // (default reduction)
  }
,
{ // state 1074
MIN_REDUCTION+135, // (default reduction)
  }
,
{ // state 1075
0x80000000|191, // match move
0x80000000|608, // no-match move
0x80000000|36, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1076
2,788, // ws*
83,144, // ws
84,71, // " "
85,735, // {10}
MIN_REDUCTION+99, // (default reduction)
  }
,
{ // state 1077
MIN_REDUCTION+112, // (default reduction)
  }
,
{ // state 1078
59,546, // letter
60,55, // "p"
61,55, // "v"
62,55, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q" "s" "y".."z"}
63,55, // "c"
64,55, // "i"
65,55, // "l"
66,55, // "o"
67,55, // "r"
68,55, // "u"
69,55, // "x"
70,55, // "b"
71,55, // "e"
72,55, // "h"
73,55, // "t"
74,55, // "w"
75,903, // letter128
76,599, // {199..218 231..250}
77,599, // {193..198 225..230}
78,219, // digit
79,185, // {"1".."9"}
80,185, // "0"
81,669, // digit128
82,1107, // {176..185}
100,52, // idChar*
101,99, // $$3
106,401, // idChar
107,1077, // "_"
108,956, // idChar128
109,668, // {223}
  }
,
{ // state 1079
MIN_REDUCTION+84, // (default reduction)
  }
,
{ // state 1080
MIN_REDUCTION+134, // (default reduction)
  }
,
{ // state 1081
MIN_REDUCTION+134, // (default reduction)
  }
,
{ // state 1082
MIN_REDUCTION+134, // (default reduction)
  }
,
{ // state 1083
MIN_REDUCTION+22, // (default reduction)
  }
,
{ // state 1084
83,81, // ws
84,825, // " "
85,61, // {10}
MIN_REDUCTION+76, // (default reduction)
  }
,
{ // state 1085
30,MIN_REDUCTION+142, // `[
83,717, // ws
84,8, // " "
85,691, // {10}
96,MIN_REDUCTION+142, // "["
MIN_REDUCTION+142, // (default reduction)
  }
,
{ // state 1086
52,747, // `*
89,768, // "*"
MIN_REDUCTION+37, // (default reduction)
  }
,
{ // state 1087
2,218, // ws*
MIN_REDUCTION+99, // (default reduction)
  }
,
{ // state 1088
42,273, // `else
86,386, // "#"
  }
,
{ // state 1089
0x80000000|911, // match move
0x80000000|51, // no-match move
0x80000000|85, // NT-test-match state for `else
  }
,
{ // state 1090
MIN_REDUCTION+135, // (default reduction)
  }
,
{ // state 1091
MIN_REDUCTION+32, // (default reduction)
  }
,
{ // state 1092
0x80000000|970, // match move
0x80000000|240, // no-match move
0x80000000|36, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1093
MIN_REDUCTION+55, // (default reduction)
  }
,
{ // state 1094
30,MIN_REDUCTION+114, // `[
96,MIN_REDUCTION+114, // "["
MIN_REDUCTION+114, // (default reduction)
  }
,
{ // state 1095
MIN_REDUCTION+54, // (default reduction)
  }
,
{ // state 1096
MIN_REDUCTION+130, // (default reduction)
  }
,
{ // state 1097
MIN_REDUCTION+54, // (default reduction)
  }
,
{ // state 1098
7,100, // ID
17,734, // `(
20,389, // <type>
27,10, // `int
28,171, // `boolean
32,1114, // <stmt>
33,810, // <assign>
35,488, // `{
36,527, // <stmt>*
37,660, // `}
38,310, // <local var decl>
39,3, // `if
40,158, // <expr>
43,1031, // `while
45,1043, // <expr8>
46,127, // <expr7>
47,125, // <expr6>
48,130, // <expr5>
49,86, // <expr4>
51,210, // <expr3>
53,982, // <expr2>
54,792, // <cast expr>
55,625, // <unary expr>
56,656, // <expr1>
57,371, // `-
58,819, // INTLIT
59,376, // letter
60,677, // "p"
61,677, // "v"
62,677, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q" "s" "y".."z"}
63,677, // "c"
64,677, // "i"
65,677, // "l"
66,677, // "o"
67,677, // "r"
68,677, // "u"
69,677, // "x"
70,677, // "b"
71,677, // "e"
72,677, // "h"
73,677, // "t"
74,677, // "w"
75,635, // letter128
76,154, // {199..218 231..250}
77,154, // {193..198 225..230}
79,164, // {"1".."9"}
80,393, // "0"
81,489, // digit128
82,1107, // {176..185}
86,975, // "#"
90,846, // "("
92,662, // "{"
93,249, // "}"
94,17, // "-"
  }
,
{ // state 1099
2,867, // ws*
83,555, // ws
84,606, // " "
85,274, // {10}
MIN_REDUCTION+143, // (default reduction)
  }
,
{ // state 1100
MIN_REDUCTION+135, // (default reduction)
  }
,
{ // state 1101
0x80000000|615, // match move
0x80000000|253, // no-match move
0x80000000|36, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1102
0x80000000|979, // match move
0x80000000|150, // no-match move
0x80000000|36, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1103
MIN_REDUCTION+135, // (default reduction)
  }
,
{ // state 1104
MIN_REDUCTION+102, // (default reduction)
  }
,
{ // state 1105
0x80000000|980, // match move
0x80000000|265, // no-match move
0x80000000|36, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1106
30,MIN_REDUCTION+103, // `[
96,MIN_REDUCTION+103, // "["
MIN_REDUCTION+103, // (default reduction)
  }
,
{ // state 1107
0x80000000|615, // match move
0x80000000|261, // no-match move
0x80000000|36, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1108
0x80000000|615, // match move
0x80000000|259, // no-match move
0x80000000|36, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1109
59,546, // letter
60,55, // "p"
61,55, // "v"
62,55, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q" "s" "y".."z"}
63,55, // "c"
64,55, // "i"
65,55, // "l"
66,55, // "o"
67,55, // "r"
68,55, // "u"
69,55, // "x"
70,55, // "b"
71,55, // "e"
72,55, // "h"
73,55, // "t"
74,55, // "w"
75,1033, // letter128
76,570, // {199..218 231..250}
77,570, // {193..198 225..230}
78,219, // digit
79,185, // {"1".."9"}
80,185, // "0"
81,640, // digit128
82,1120, // {176..185}
100,2, // idChar*
101,117, // $$3
106,401, // idChar
107,1077, // "_"
108,1117, // idChar128
109,791, // {223}
  }
,
{ // state 1110
7,880, // ID
59,541, // letter
60,677, // "p"
61,677, // "v"
62,677, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q" "s" "y".."z"}
63,677, // "c"
64,677, // "i"
65,677, // "l"
66,677, // "o"
67,677, // "r"
68,677, // "u"
69,677, // "x"
70,677, // "b"
71,677, // "e"
72,677, // "h"
73,677, // "t"
74,677, // "w"
75,897, // letter128
76,896, // {199..218 231..250}
77,896, // {193..198 225..230}
  }
,
{ // state 1111
83,49, // ws
84,1097, // " "
85,90, // {10}
MIN_REDUCTION+62, // (default reduction)
  }
,
{ // state 1112
2,192, // ws*
83,957, // ws
84,843, // " "
85,750, // {10}
114,MIN_REDUCTION+71, // $NT
  }
,
{ // state 1113
MIN_REDUCTION+29, // (default reduction)
  }
,
{ // state 1114
MIN_REDUCTION+129, // (default reduction)
  }
,
{ // state 1115
30,MIN_REDUCTION+114, // `[
96,MIN_REDUCTION+114, // "["
MIN_REDUCTION+114, // (default reduction)
  }
,
{ // state 1116
30,MIN_REDUCTION+53, // `[
96,MIN_REDUCTION+53, // "["
MIN_REDUCTION+53, // (default reduction)
  }
,
{ // state 1117
0x80000000|986, // match move
0x80000000|149, // no-match move
0x80000000|36, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1118
MIN_REDUCTION+114, // (default reduction)
  }
,
{ // state 1119
30,MIN_REDUCTION+103, // `[
96,MIN_REDUCTION+103, // "["
MIN_REDUCTION+103, // (default reduction)
  }
,
{ // state 1120
0x80000000|615, // match move
0x80000000|892, // no-match move
0x80000000|36, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1121
0x80000000|408, // match move
0x80000000|755, // no-match move
0x80000000|36, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1122
30,MIN_REDUCTION+103, // `[
96,MIN_REDUCTION+103, // "["
MIN_REDUCTION+103, // (default reduction)
  }
,
{ // state 1123
MIN_REDUCTION+114, // (default reduction)
  }
,
{ // state 1124
MIN_REDUCTION+114, // (default reduction)
  }
,
{ // state 1125
0x80000000|1, // match move
0x80000000|475, // no-match move
0x80000000|36, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1126
MIN_REDUCTION+135, // (default reduction)
  }
,
{ // state 1127
30,MIN_REDUCTION+55, // `[
96,MIN_REDUCTION+55, // "["
MIN_REDUCTION+55, // (default reduction)
  }
,
{ // state 1128
0x80000000|1, // match move
0x80000000|471, // no-match move
0x80000000|36, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1129
7,1070, // ID
17,715, // `(
40,330, // <expr>
45,1060, // <expr8>
46,111, // <expr7>
47,107, // <expr6>
48,114, // <expr5>
49,74, // <expr4>
51,335, // <expr3>
53,947, // <expr2>
54,775, // <cast expr>
55,805, // <unary expr>
56,638, // <expr1>
57,379, // `-
58,800, // INTLIT
59,1051, // letter
60,677, // "p"
61,677, // "v"
62,677, // {"A".."Z" "a" "d" "f".."g" "j".."k" "m".."n" "q" "s" "y".."z"}
63,677, // "c"
64,677, // "i"
65,677, // "l"
66,677, // "o"
67,677, // "r"
68,677, // "u"
69,677, // "x"
70,677, // "b"
71,677, // "e"
72,677, // "h"
73,677, // "t"
74,677, // "w"
75,1092, // letter128
76,613, // {199..218 231..250}
77,613, // {193..198 225..230}
79,84, // {"1".."9"}
80,403, // "0"
81,506, // digit128
82,1101, // {176..185}
90,846, // "("
94,17, // "-"
  }
,
{ // state 1130
MIN_REDUCTION+135, // (default reduction)
  }
,
{ // state 1131
0x80000000|1032, // match move
0x80000000|167, // no-match move
0x80000000|36, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1132
MIN_REDUCTION+135, // (default reduction)
  }
,
{ // state 1133
MIN_REDUCTION+135, // (default reduction)
  }
,
{ // state 1134
MIN_REDUCTION+55, // (default reduction)
  }
,
{ // state 1135
0x80000000|1, // match move
0x80000000|347, // no-match move
0x80000000|36, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1136
MIN_REDUCTION+1, // (default reduction)
  }
,
{ // state 1137
MIN_REDUCTION+135, // (default reduction)
  }
,
{ // state 1138
30,MIN_REDUCTION+55, // `[
96,MIN_REDUCTION+55, // "["
MIN_REDUCTION+55, // (default reduction)
  }
,
{ // state 1139
2,326, // ws*
83,580, // ws
84,560, // " "
85,151, // {10}
MIN_REDUCTION+71, // (default reduction)
  }
,
{ // state 1140
2,351, // ws*
83,1137, // ws
84,284, // " "
85,885, // {10}
MIN_REDUCTION+67, // (default reduction)
  }
,
{ // state 1141
MIN_REDUCTION+135, // (default reduction)
  }
,
{ // state 1142
0x80000000|744, // match move
0x80000000|276, // no-match move
0x80000000|36, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1143
83,425, // ws
84,57, // " "
85,740, // {10}
MIN_REDUCTION+86, // (default reduction)
  }
,
{ // state 1144
MIN_REDUCTION+25, // (default reduction)
  }
,
{ // state 1145
30,MIN_REDUCTION+55, // `[
96,MIN_REDUCTION+55, // "["
MIN_REDUCTION+55, // (default reduction)
  }
,
{ // state 1146
42,345, // `else
86,386, // "#"
  }
,
{ // state 1147
2,871, // ws*
MIN_REDUCTION+85, // (default reduction)
  }
,
{ // state 1148
31,412, // `]
97,421, // "]"
  }
,
};
}
public MJGrammarParseTable(MJGrammar actionObj) {
  actionObject = actionObj;
  parseTable = new int[1149][];
  int doneSoFar = 0;
  doneSoFar += new Initter1().doInit(doneSoFar);
  doneSoFar += new Initter2().doInit(doneSoFar);
  doneSoFar += new Initter3().doInit(doneSoFar);
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
// <extends ID> ::= `extends ID
(5<<16)+2,
// <class decl> ::= `class ID <extends ID>? $$0
(8<<16)+4,
// <class decl> ::= `class ID $$0
(8<<16)+3,
// <decl in class> ::= <field decl>
(12<<16)+1,
// <decl in class> ::= <method decl>
(12<<16)+1,
// <method decl> ::= `public `void ID `( <paramList>? $$1
(14<<16)+6,
// <method decl> ::= `public `void ID `( $$1
(14<<16)+5,
// <method decl> ::= `public <type> ID `( <paramList>? $$2
(14<<16)+6,
// <method decl> ::= `public <type> ID `( $$2
(14<<16)+5,
// <param> ::= <type> ID
(22<<16)+2,
// <extra param> ::= `, <type> ID
(23<<16)+3,
// <paramList> ::= <param> <extra param>*
(25<<16)+2,
// <paramList> ::= <param>
(25<<16)+1,
// <type> ::= `int
(20<<16)+1,
// <type> ::= `boolean
(20<<16)+1,
// <type> ::= ID
(20<<16)+1,
// <type> ::= <type> <empty bracket pair>
(20<<16)+2,
// <empty bracket pair> ::= `[ `]
(29<<16)+2,
// <stmt> ::= <assign> `;
(32<<16)+2,
// <stmt> ::= `{ <stmt>* `}
(32<<16)+3,
// <stmt> ::= `{ `}
(32<<16)+2,
// <stmt> ::= <local var decl> `;
(32<<16)+2,
// <stmt> ::= `if `( <expr> `) <stmt> !`else
(32<<16)+5,
// <stmt> ::= `if `( <expr> `) <stmt> `else <stmt>
(32<<16)+7,
// <stmt> ::= `while `( <expr> `) <stmt>
(32<<16)+5,
// <assign> ::= <expr> `= <expr>
(33<<16)+3,
// <field decl> ::= <type> ID `;
(13<<16)+3,
// <local var decl> ::= <type> ID `= <expr>
(38<<16)+4,
// <expr> ::= <expr8>
(40<<16)+1,
// <expr8> ::= <expr7>
(45<<16)+1,
// <expr7> ::= <expr6>
(46<<16)+1,
// <expr6> ::= <expr5>
(47<<16)+1,
// <expr5> ::= <expr4>
(48<<16)+1,
// <expr4> ::= <expr4> `+ <expr3>
(49<<16)+3,
// <expr4> ::= <expr3>
(49<<16)+1,
// <expr3> ::= <expr3> `* <expr2>
(51<<16)+3,
// <expr3> ::= <expr2>
(51<<16)+1,
// <expr2> ::= <cast expr>
(53<<16)+1,
// <expr2> ::= <unary expr>
(53<<16)+1,
// <cast expr> ::= `( <type> `) <cast expr>
(54<<16)+4,
// <cast expr> ::= `( <type> `) <expr1>
(54<<16)+4,
// <unary expr> ::= `- <unary expr>
(55<<16)+2,
// <unary expr> ::= <expr1>
(55<<16)+1,
// <expr1> ::= ID
(56<<16)+1,
// <expr1> ::= <expr1> !<empty bracket pair> `[ <expr> `]
(56<<16)+4,
// <expr1> ::= INTLIT
(56<<16)+1,
// letter ::= {"A".."Z" "a".."z"}
(59<<16)+1,
// letter128 ::= {193..218 225..250}
(75<<16)+1,
// digit ::= {"0".."9"}
(78<<16)+1,
// digit128 ::= {176..185}
(81<<16)+1,
// ws ::= " "
(83<<16)+1,
// ws ::= {10}
(83<<16)+1,
// `boolean ::= "#" "b" "o" ws*
(28<<16)+4,
// `boolean ::= "#" "b" "o"
(28<<16)+3,
// `class ::= "#" "c" "l" ws*
(9<<16)+4,
// `class ::= "#" "c" "l"
(9<<16)+3,
// `extends ::= "#" "e" "x" ws*
(6<<16)+4,
// `extends ::= "#" "e" "x"
(6<<16)+3,
// `void ::= "#" "v" "o" ws*
(16<<16)+4,
// `void ::= "#" "v" "o"
(16<<16)+3,
// `int ::= "#" "i" "t" ws*
(27<<16)+4,
// `int ::= "#" "i" "t"
(27<<16)+3,
// `while ::= "#" "w" "h" ws*
(43<<16)+4,
// `while ::= "#" "w" "h"
(43<<16)+3,
// `if ::= "#" "+" ws*
(39<<16)+3,
// `if ::= "#" "+"
(39<<16)+2,
// `else ::= "#" "e" "l" ws*
(42<<16)+4,
// `else ::= "#" "e" "l"
(42<<16)+3,
// `return ::= "#" "r" "e" ws*
(88<<16)+4,
// `return ::= "#" "r" "e"
(88<<16)+3,
// `public ::= "#" "p" "u" ws*
(15<<16)+4,
// `public ::= "#" "p" "u"
(15<<16)+3,
// `* ::= "*" ws*
(52<<16)+2,
// `* ::= "*"
(52<<16)+1,
// `( ::= "(" ws*
(17<<16)+2,
// `( ::= "("
(17<<16)+1,
// `) ::= ")" ws*
(41<<16)+2,
// `) ::= ")"
(41<<16)+1,
// `{ ::= "{" ws*
(35<<16)+2,
// `{ ::= "{"
(35<<16)+1,
// `} ::= "}" ws*
(37<<16)+2,
// `} ::= "}"
(37<<16)+1,
// `- ::= "-" ws*
(57<<16)+2,
// `- ::= "-"
(57<<16)+1,
// `+ ::= "+" ws*
(50<<16)+2,
// `+ ::= "+"
(50<<16)+1,
// `= ::= "=" ws*
(44<<16)+2,
// `= ::= "="
(44<<16)+1,
// `[ ::= "[" ws*
(30<<16)+2,
// `[ ::= "["
(30<<16)+1,
// `] ::= "]" ws*
(31<<16)+2,
// `] ::= "]"
(31<<16)+1,
// `, ::= "," ws*
(24<<16)+2,
// `, ::= ","
(24<<16)+1,
// `; ::= ";" ws*
(34<<16)+2,
// `; ::= ";"
(34<<16)+1,
// ID ::= letter128 ws*
(7<<16)+2,
// ID ::= letter128
(7<<16)+1,
// ID ::= letter idChar* $$3
(7<<16)+3,
// ID ::= letter $$3
(7<<16)+2,
// INTLIT ::= {"1".."9"} digit* $$4
(58<<16)+3,
// INTLIT ::= {"1".."9"} $$4
(58<<16)+2,
// INTLIT ::= digit128 ws*
(58<<16)+2,
// INTLIT ::= digit128
(58<<16)+1,
// INTLIT ::= "0" hexDigit* $$5
(58<<16)+3,
// INTLIT ::= "0" $$5
(58<<16)+2,
// idChar ::= letter
(106<<16)+1,
// idChar ::= digit
(106<<16)+1,
// idChar ::= "_"
(106<<16)+1,
// idChar128 ::= letter128
(108<<16)+1,
// idChar128 ::= digit128
(108<<16)+1,
// idChar128 ::= {223}
(108<<16)+1,
// hexDigit ::= {"0".."9" "A".."Z" "a".."z"}
(110<<16)+1,
// hexDigit128 ::= {176..185 193..198 225..230}
(111<<16)+1,
// digit* ::= digit* digit
(102<<16)+2,
// digit* ::= digit
(102<<16)+1,
// <extra param>* ::= <extra param>* <extra param>
(26<<16)+2,
// <extra param>* ::= <extra param>
(26<<16)+1,
// <decl in class>* ::= <decl in class>* <decl in class>
(112<<16)+2,
// <decl in class>* ::= <decl in class>
(112<<16)+1,
// <paramList>? ::= <paramList>
(18<<16)+1,
// <extends ID>? ::= <extends ID>
(10<<16)+1,
// hexDigit* ::= hexDigit* hexDigit
(104<<16)+2,
// hexDigit* ::= hexDigit
(104<<16)+1,
// <stmt>* ::= <stmt>* <stmt>
(36<<16)+2,
// <stmt>* ::= <stmt>
(36<<16)+1,
// idChar* ::= idChar* idChar
(100<<16)+2,
// idChar* ::= idChar
(100<<16)+1,
// <class decl>+ ::= <class decl>
(4<<16)+1,
// <class decl>+ ::= <class decl>+ <class decl>
(4<<16)+2,
// ws* ::= ws* ws
(2<<16)+2,
// ws* ::= ws
(2<<16)+1,
// $$0 ::= `{ <decl in class>* `}
(11<<16)+3,
// $$0 ::= `{ `}
(11<<16)+2,
// $$1 ::= `) `{ <stmt>* `}
(19<<16)+4,
// $$1 ::= `) `{ `}
(19<<16)+3,
// $$2 ::= `) `{ <stmt>* `return <expr> `; `}
(21<<16)+7,
// $$2 ::= `) `{ `return <expr> `; `}
(21<<16)+6,
// $$3 ::= idChar128 ws*
(101<<16)+2,
// $$3 ::= idChar128
(101<<16)+1,
// $$4 ::= digit128 ws*
(103<<16)+2,
// $$4 ::= digit128
(103<<16)+1,
// $$5 ::= hexDigit128 ws*
(105<<16)+2,
// $$5 ::= hexDigit128
(105<<16)+1,
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
85, // 10
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
84, // " "
-1, // "!"
-1, // '"'
86, // "#"
-1, // "$"
-1, // "%"
-1, // "&"
-1, // "'"
90, // "("
91, // ")"
89, // "*"
87, // "+"
98, // ","
94, // "-"
-1, // "."
-1, // "/"
80, // "0"
79, // "1"
79, // "2"
79, // "3"
79, // "4"
79, // "5"
79, // "6"
79, // "7"
79, // "8"
79, // "9"
-1, // ":"
99, // ";"
-1, // "<"
95, // "="
-1, // ">"
-1, // "?"
-1, // "@"
62, // "A"
62, // "B"
62, // "C"
62, // "D"
62, // "E"
62, // "F"
62, // "G"
62, // "H"
62, // "I"
62, // "J"
62, // "K"
62, // "L"
62, // "M"
62, // "N"
62, // "O"
62, // "P"
62, // "Q"
62, // "R"
62, // "S"
62, // "T"
62, // "U"
62, // "V"
62, // "W"
62, // "X"
62, // "Y"
62, // "Z"
96, // "["
-1, // "\"
97, // "]"
-1, // "^"
107, // "_"
-1, // "`"
62, // "a"
70, // "b"
63, // "c"
62, // "d"
71, // "e"
62, // "f"
62, // "g"
72, // "h"
64, // "i"
62, // "j"
62, // "k"
65, // "l"
62, // "m"
62, // "n"
66, // "o"
60, // "p"
62, // "q"
67, // "r"
62, // "s"
73, // "t"
68, // "u"
61, // "v"
74, // "w"
69, // "x"
62, // "y"
62, // "z"
92, // "{"
-1, // "|"
93, // "}"
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
82, // 176
82, // 177
82, // 178
82, // 179
82, // 180
82, // 181
82, // 182
82, // 183
82, // 184
82, // 185
-1, // 186
-1, // 187
-1, // 188
-1, // 189
-1, // 190
-1, // 191
-1, // 192
77, // 193
77, // 194
77, // 195
77, // 196
77, // 197
77, // 198
76, // 199
76, // 200
76, // 201
76, // 202
76, // 203
76, // 204
76, // 205
76, // 206
76, // 207
76, // 208
76, // 209
76, // 210
76, // 211
76, // 212
76, // 213
76, // 214
76, // 215
76, // 216
76, // 217
76, // 218
-1, // 219
-1, // 220
-1, // 221
-1, // 222
109, // 223
-1, // 224
77, // 225
77, // 226
77, // 227
77, // 228
77, // 229
77, // 230
76, // 231
76, // 232
76, // 233
76, // 234
76, // 235
76, // 236
76, // 237
76, // 238
76, // 239
76, // 240
76, // 241
76, // 242
76, // 243
76, // 244
76, // 245
76, // 246
76, // 247
76, // 248
76, // 249
76, // 250
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
"digit* ::= digit* digit", // 118
"digit* ::= digit* digit", // 119
"<extra param>* ::= <extra param>* <extra param>", // 120
"<extra param>* ::= <extra param>* <extra param>", // 121
"<decl in class>* ::= <decl in class>* <decl in class>", // 122
"<decl in class>* ::= <decl in class>* <decl in class>", // 123
"<paramList>? ::= <paramList>", // 124
"<extends ID>? ::= <extends ID>", // 125
"hexDigit* ::= hexDigit* hexDigit", // 126
"hexDigit* ::= hexDigit* hexDigit", // 127
"<stmt>* ::= <stmt>* <stmt>", // 128
"<stmt>* ::= <stmt>* <stmt>", // 129
"idChar* ::= idChar* idChar", // 130
"idChar* ::= idChar* idChar", // 131
"<class decl>+ ::= <class decl>", // 132
"<class decl>+ ::= <class decl>+ <class decl>", // 133
"ws* ::= ws* ws", // 134
"ws* ::= ws* ws", // 135
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
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((0<<5)|0x5)/*methodCall:0*/,
    },
    { // 3: <program> ::= [#] <class decl>+ @createProgram(int,List<ClassDecl>)=>Program
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0x5)/*methodCall:1*/,
    },
    { // 4: <extends ID> ::= `extends ID @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 5: <class decl> ::= `class [#] ID <extends ID>? $$0 @createClassDecl(int,String,String,List<Decl>)=>ClassDecl
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((2<<5)|0x5)/*methodCall:2*/,
    },
    { // 6: <class decl> ::= `class [#] ID [<extends ID>?] $$0 @createClassDecl(int,String,String,List<Decl>)=>ClassDecl
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((2<<5)|0x5)/*methodCall:2*/,
    },
    { // 7: <decl in class> ::= <field decl> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 8: <decl in class> ::= <method decl> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 9: <method decl> ::= `public `void [#] ID `( <paramList>? $$1 @createMethodDeclVoid(int,String,VarDeclList,List<Stmt>)=>Decl
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((3<<5)|0x5)/*methodCall:3*/,
    },
    { // 10: <method decl> ::= `public `void [#] ID `( [<paramList>?] $$1 @createMethodDeclVoid(int,String,VarDeclList,List<Stmt>)=>Decl
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((0<<5)|0x6)/*nullProductionAction:0*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((3<<5)|0x5)/*methodCall:3*/,
    },
    { // 11: <method decl> ::= `public <type> [#] ID `( <paramList>? $$2 @createMethodDeclNonVoid(Type,int,String,VarDeclList,List<Stmt>,Exp)=>Decl
      ((1<<5)|0xe)/*popPos:1*/,
      ((2<<5)|0x0)/*popToPushBack:2*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x5)/*methodCall:4*/,
    },
    { // 12: <method decl> ::= `public <type> [#] ID `( [<paramList>?] $$2 @createMethodDeclNonVoid(Type,int,String,VarDeclList,List<Stmt>,Exp)=>Decl
      ((1<<5)|0xe)/*popPos:1*/,
      ((2<<5)|0x0)/*popToPushBack:2*/,
      ((0<<5)|0x6)/*nullProductionAction:0*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x5)/*methodCall:4*/,
    },
    { // 13: <param> ::= <type> [#] ID @newParam(Type,int,String)=>VarDecl
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x5)/*methodCall:5*/,
    },
    { // 14: <extra param> ::= `, <type> [#] ID @newExtraParam(Type,int,String)=>VarDecl
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x5)/*methodCall:6*/,
    },
    { // 15: <paramList> ::= <param> <extra param>* @newParamList(VarDecl,List<VarDecl>)=>VarDeclList
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x5)/*methodCall:7*/,
    },
    { // 16: <paramList> ::= <param> [<extra param>*] @newParamList(VarDecl,List<VarDecl>)=>VarDeclList
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x5)/*methodCall:7*/,
    },
    { // 17: <type> ::= [#] `int @intType(int)=>Type
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((8<<5)|0x5)/*methodCall:8*/,
    },
    { // 18: <type> ::= [#] `boolean @booleanType(int)=>Type
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((9<<5)|0x5)/*methodCall:9*/,
    },
    { // 19: <type> ::= [#] ID @idType(int,String)=>Type
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((10<<5)|0x5)/*methodCall:10*/,
    },
    { // 20: <type> ::= [#] <type> <empty bracket pair> @newArrayType(int,Type,Object)=>Type
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((11<<5)|0x5)/*methodCall:11*/,
    },
    { // 21: <empty bracket pair> ::= `[ `] @null
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x8)/*nullPointer:1*/,
    },
    { // 22: <stmt> ::= <assign> `; @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 23: <stmt> ::= [#] `{ <stmt>* `} @newBlock(int,List<Stmt>)=>Stmt
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((12<<5)|0x5)/*methodCall:12*/,
    },
    { // 24: <stmt> ::= [#] `{ [<stmt>*] `} @newBlock(int,List<Stmt>)=>Stmt
      ((1<<5)|0xe)/*popPos:1*/,
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((12<<5)|0x5)/*methodCall:12*/,
    },
    { // 25: <stmt> ::= <local var decl> `; @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 26: <stmt> ::= [#] `if `( <expr> `) <stmt> !`else [#] @newIf(int,Exp,Stmt,int)=>Stmt
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((13<<5)|0x5)/*methodCall:13*/,
    },
    { // 27: <stmt> ::= [#] `if `( <expr> `) <stmt> [#] `else <stmt> @newIfElse(int,Exp,Stmt,int,Stmt)=>Stmt
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((14<<5)|0x5)/*methodCall:14*/,
    },
    { // 28: <stmt> ::= [#] `while `( <expr> `) <stmt> @newWhile(int,Exp,Stmt)=>Stmt
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((15<<5)|0x5)/*methodCall:15*/,
    },
    { // 29: <assign> ::= <expr> [#] `= <expr> @assign(Exp,int,Exp)=>Stmt
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((16<<5)|0x5)/*methodCall:16*/,
    },
    { // 30: <field decl> ::= <type> [#] ID `; @fieldDecl(Type,int,String)=>Decl
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((17<<5)|0x5)/*methodCall:17*/,
    },
    { // 31: <local var decl> ::= <type> [#] ID `= <expr> @localVarDecl(Type,int,String,Exp)=>Stmt
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((18<<5)|0x5)/*methodCall:18*/,
    },
    { // 32: <expr> ::= <expr8> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 33: <expr8> ::= <expr7> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 34: <expr7> ::= <expr6> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 35: <expr6> ::= <expr5> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 36: <expr5> ::= <expr4> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 37: <expr4> ::= <expr4> [#] `+ <expr3> @newPlus(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((19<<5)|0x5)/*methodCall:19*/,
    },
    { // 38: <expr4> ::= <expr3> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 39: <expr3> ::= <expr3> [#] `* <expr2> @newTimes(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((20<<5)|0x5)/*methodCall:20*/,
    },
    { // 40: <expr3> ::= <expr2> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 41: <expr2> ::= <cast expr> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 42: <expr2> ::= <unary expr> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 43: <cast expr> ::= [#] `( <type> `) <cast expr> @newCast(int,Type,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((21<<5)|0x5)/*methodCall:21*/,
    },
    { // 44: <cast expr> ::= [#] `( <type> `) <expr1> @newCast(int,Type,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((21<<5)|0x5)/*methodCall:21*/,
    },
    { // 45: <unary expr> ::= [#] `- <unary expr> @newUnaryMinus(int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((22<<5)|0x5)/*methodCall:22*/,
    },
    { // 46: <unary expr> ::= <expr1> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 47: <expr1> ::= [#] ID @newIDExp(int,String)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((23<<5)|0x5)/*methodCall:23*/,
    },
    { // 48: <expr1> ::= <expr1> !<empty bracket pair> [#] `[ <expr> `] @newArrayLookup(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((24<<5)|0x5)/*methodCall:24*/,
    },
    { // 49: <expr1> ::= [#] INTLIT @newIntLit(int,int)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((25<<5)|0x5)/*methodCall:25*/,
    },
    { // 50: letter ::= {"A".."Z" "a".."z"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 51: letter128 ::= {193..218 225..250} @sub128(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((26<<5)|0x5)/*methodCall:26*/,
    },
    { // 52: digit ::= {"0".."9"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 53: digit128 ::= {176..185} @sub128(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((26<<5)|0x5)/*methodCall:26*/,
    },
    { // 54: ws ::= " " @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 55: ws ::= {10} [registerNewline] @void
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 56: `boolean ::= "#" "b" "o" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 57: `boolean ::= "#" "b" "o" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 58: `class ::= "#" "c" "l" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 59: `class ::= "#" "c" "l" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 60: `extends ::= "#" "e" "x" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 61: `extends ::= "#" "e" "x" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 62: `void ::= "#" "v" "o" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 63: `void ::= "#" "v" "o" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 64: `int ::= "#" "i" "t" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 65: `int ::= "#" "i" "t" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 66: `while ::= "#" "w" "h" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 67: `while ::= "#" "w" "h" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 68: `if ::= "#" "+" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 69: `if ::= "#" "+" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 70: `else ::= "#" "e" "l" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 71: `else ::= "#" "e" "l" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 72: `return ::= "#" "r" "e" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 73: `return ::= "#" "r" "e" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 74: `public ::= "#" "p" "u" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 75: `public ::= "#" "p" "u" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 76: `* ::= "*" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 77: `* ::= "*" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 78: `( ::= "(" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 79: `( ::= "(" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 80: `) ::= ")" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 81: `) ::= ")" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 82: `{ ::= "{" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 83: `{ ::= "{" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 84: `} ::= "}" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 85: `} ::= "}" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 86: `- ::= "-" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 87: `- ::= "-" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 88: `+ ::= "+" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 89: `+ ::= "+" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 90: `= ::= "=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 91: `= ::= "=" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 92: `[ ::= "[" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 93: `[ ::= "[" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 94: `] ::= "]" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 95: `] ::= "]" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 96: `, ::= "," ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 97: `, ::= "," [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 98: `; ::= ";" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 99: `; ::= ";" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 100: ID ::= letter128 ws* @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x4)/*stringConcat:1*/,
    },
    { // 101: ID ::= letter128 [ws*] @text
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x4)/*stringConcat:1*/,
    },
    { // 102: ID ::= letter idChar* $$3 @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x4)/*stringConcat:3*/,
    },
    { // 103: ID ::= letter [idChar*] $$3 @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x4)/*stringConcat:3*/,
    },
    { // 104: INTLIT ::= {"1".."9"} digit* $$4 @convertToInt(char,List<Character>,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((27<<5)|0x5)/*methodCall:27*/,
    },
    { // 105: INTLIT ::= {"1".."9"} [digit*] $$4 @convertToInt(char,List<Character>,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((27<<5)|0x5)/*methodCall:27*/,
    },
    { // 106: INTLIT ::= digit128 ws* @convertToInt(char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((28<<5)|0x5)/*methodCall:28*/,
    },
    { // 107: INTLIT ::= digit128 [ws*] @convertToInt(char)=>int
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((28<<5)|0x5)/*methodCall:28*/,
    },
    { // 108: INTLIT ::= "0" hexDigit* $$5 @convert16ToInt(char,List<Character>,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((29<<5)|0x5)/*methodCall:29*/,
    },
    { // 109: INTLIT ::= "0" [hexDigit*] $$5 @convert16ToInt(char,List<Character>,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((29<<5)|0x5)/*methodCall:29*/,
    },
    { // 110: idChar ::= letter @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 111: idChar ::= digit @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 112: idChar ::= "_" @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 113: idChar128 ::= letter128 @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 114: idChar128 ::= digit128 @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 115: idChar128 ::= {223} @underscore(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((30<<5)|0x5)/*methodCall:30*/,
    },
    { // 116: hexDigit ::= {"0".."9" "A".."Z" "a".."z"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 117: hexDigit128 ::= {176..185 193..198 225..230} @sub128(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((26<<5)|0x5)/*methodCall:26*/,
    },
    { // 118: digit* ::= digit* digit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 119: digit* ::= [digit*] digit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 120: <extra param>* ::= <extra param>* <extra param> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 121: <extra param>* ::= [<extra param>*] <extra param> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 122: <decl in class>* ::= <decl in class>* <decl in class> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 123: <decl in class>* ::= [<decl in class>*] <decl in class> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 124: <paramList>? ::= <paramList> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 125: <extends ID>? ::= <extends ID> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 126: hexDigit* ::= hexDigit* hexDigit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 127: hexDigit* ::= [hexDigit*] hexDigit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 128: <stmt>* ::= <stmt>* <stmt> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 129: <stmt>* ::= [<stmt>*] <stmt> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 130: idChar* ::= idChar* idChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 131: idChar* ::= [idChar*] idChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 132: <class decl>+ ::= <class decl> @singleList
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xa)/*singleList:1*/,
    },
    { // 133: <class decl>+ ::= <class decl>+ <class decl> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 134: ws* ::= ws* ws @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 135: ws* ::= [ws*] ws @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
    },
    { // 136: $$0 ::= `{ <decl in class>* `} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 137: $$0 ::= `{ [<decl in class>*] `} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 138: $$1 ::= `) `{ <stmt>* `} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 139: $$1 ::= `) `{ [<stmt>*] `} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 140: $$2 ::= `) `{ <stmt>* `return <expr> `; `} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 141: $$2 ::= `) `{ [<stmt>*] `return <expr> `; `} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 142: $$3 ::= idChar128 ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 143: $$3 ::= idChar128 [ws*] @pass
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 144: $$4 ::= digit128 ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 145: $$4 ::= digit128 [ws*] @pass
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 146: $$5 ::= hexDigit128 ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 147: $$5 ::= hexDigit128 [ws*] @pass
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
};
public String[] getNullProdNameTable() { return nullProdNameTable; }
private String[] nullProdNameTable = {
    "<paramList>? ::=", // <paramList>?
    "hexDigit* ::=", // hexDigit*
    "<stmt>* ::=", // <stmt>*
    "<decl in class>* ::=", // <decl in class>*
    "ws* ::=", // ws*
    "<extends ID>? ::=", // <extends ID>?
    "idChar* ::=", // idChar*
    "<extra param>* ::=", // <extra param>*
    "digit* ::=", // digit*
    "# ::=", // #
    "", // registerNewline
};
public int[][] getNullProductionActionTable() { return nullActionTable; }
private int[][] nullActionTable = {
    { // <paramList>?
      ((1<<5)|0x8)/*nullPointer:1*/,
    },
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
    { // <extends ID>?
      ((1<<5)|0x8)/*nullPointer:1*/,
    },
    { // idChar*
      ((1<<5)|0x9)/*emptyList:1*/,
    },
    { // <extra param>*
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
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((31<<5)|0x5)/*methodCall:31*/,
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
      String parm2 = (String)si.popPb();
      List<Decl> parm3 = (List<Decl>)si.popPb();
      ClassDecl result = actionObject.createClassDecl(parm0,parm1,parm2,parm3);
      si.pushPb(result);
    }
    break;
    case 3: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      VarDeclList parm2 = (VarDeclList)si.popPb();
      List<Stmt> parm3 = (List<Stmt>)si.popPb();
      Decl result = actionObject.createMethodDeclVoid(parm0,parm1,parm2,parm3);
      si.pushPb(result);
    }
    break;
    case 4: {
      Type parm0 = (Type)si.popPb();
      int parm1 = (Integer)si.popPb();
      String parm2 = (String)si.popPb();
      VarDeclList parm3 = (VarDeclList)si.popPb();
      List<Stmt> parm4 = (List<Stmt>)si.popPb();
      Exp parm5 = (Exp)si.popPb();
      Decl result = actionObject.createMethodDeclNonVoid(parm0,parm1,parm2,parm3,parm4,parm5);
      si.pushPb(result);
    }
    break;
    case 5: {
      Type parm0 = (Type)si.popPb();
      int parm1 = (Integer)si.popPb();
      String parm2 = (String)si.popPb();
      VarDecl result = actionObject.newParam(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 6: {
      Type parm0 = (Type)si.popPb();
      int parm1 = (Integer)si.popPb();
      String parm2 = (String)si.popPb();
      VarDecl result = actionObject.newExtraParam(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 7: {
      VarDecl parm0 = (VarDecl)si.popPb();
      List<VarDecl> parm1 = (List<VarDecl>)si.popPb();
      VarDeclList result = actionObject.newParamList(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 8: {
      int parm0 = (Integer)si.popPb();
      Type result = actionObject.intType(parm0);
      si.pushPb(result);
    }
    break;
    case 9: {
      int parm0 = (Integer)si.popPb();
      Type result = actionObject.booleanType(parm0);
      si.pushPb(result);
    }
    break;
    case 10: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      Type result = actionObject.idType(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 11: {
      int parm0 = (Integer)si.popPb();
      Type parm1 = (Type)si.popPb();
      Object parm2 = (Object)si.popPb();
      Type result = actionObject.newArrayType(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 12: {
      int parm0 = (Integer)si.popPb();
      List<Stmt> parm1 = (List<Stmt>)si.popPb();
      Stmt result = actionObject.newBlock(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 13: {
      int parm0 = (Integer)si.popPb();
      Exp parm1 = (Exp)si.popPb();
      Stmt parm2 = (Stmt)si.popPb();
      int parm3 = (Integer)si.popPb();
      Stmt result = actionObject.newIf(parm0,parm1,parm2,parm3);
      si.pushPb(result);
    }
    break;
    case 14: {
      int parm0 = (Integer)si.popPb();
      Exp parm1 = (Exp)si.popPb();
      Stmt parm2 = (Stmt)si.popPb();
      int parm3 = (Integer)si.popPb();
      Stmt parm4 = (Stmt)si.popPb();
      Stmt result = actionObject.newIfElse(parm0,parm1,parm2,parm3,parm4);
      si.pushPb(result);
    }
    break;
    case 15: {
      int parm0 = (Integer)si.popPb();
      Exp parm1 = (Exp)si.popPb();
      Stmt parm2 = (Stmt)si.popPb();
      Stmt result = actionObject.newWhile(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 16: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Stmt result = actionObject.assign(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 17: {
      Type parm0 = (Type)si.popPb();
      int parm1 = (Integer)si.popPb();
      String parm2 = (String)si.popPb();
      Decl result = actionObject.fieldDecl(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 18: {
      Type parm0 = (Type)si.popPb();
      int parm1 = (Integer)si.popPb();
      String parm2 = (String)si.popPb();
      Exp parm3 = (Exp)si.popPb();
      Stmt result = actionObject.localVarDecl(parm0,parm1,parm2,parm3);
      si.pushPb(result);
    }
    break;
    case 19: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newPlus(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 20: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newTimes(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 21: {
      int parm0 = (Integer)si.popPb();
      Type parm1 = (Type)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newCast(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 22: {
      int parm0 = (Integer)si.popPb();
      Exp parm1 = (Exp)si.popPb();
      Exp result = actionObject.newUnaryMinus(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 23: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      Exp result = actionObject.newIDExp(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 24: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newArrayLookup(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 25: {
      int parm0 = (Integer)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp result = actionObject.newIntLit(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 26: {
      char parm0 = (Character)si.popPb();
      char result = actionObject.sub128(parm0);
      si.pushPb(result);
    }
    break;
    case 27: {
      char parm0 = (Character)si.popPb();
      List<Character> parm1 = (List<Character>)si.popPb();
      char parm2 = (Character)si.popPb();
      int result = actionObject.convertToInt(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 28: {
      char parm0 = (Character)si.popPb();
      int result = actionObject.convertToInt(parm0);
      si.pushPb(result);
    }
    break;
    case 29: {
      char parm0 = (Character)si.popPb();
      List<Character> parm1 = (List<Character>)si.popPb();
      char parm2 = (Character)si.popPb();
      int result = actionObject.convert16ToInt(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 30: {
      char parm0 = (Character)si.popPb();
      char result = actionObject.underscore(parm0);
      si.pushPb(result);
    }
    break;
    case 31: {
      int parm0 = (Integer)si.popPb();
      actionObject.registerNewline(parm0);
    }
    break;
  }
}
private String[] saNameSigTable = {
"void topLevel(Program)",
"Program createProgram(int,List<ClassDecl>)",
"ClassDecl createClassDecl(int,String,String,List<Decl>)",
"Decl createMethodDeclVoid(int,String,VarDeclList,List<Stmt>)",
"Decl createMethodDeclNonVoid(Type,int,String,VarDeclList,List<Stmt>,Exp)",
"VarDecl newParam(Type,int,String)",
"VarDecl newExtraParam(Type,int,String)",
"VarDeclList newParamList(VarDecl,List<VarDecl>)",
"Type intType(int)",
"Type booleanType(int)",
"Type idType(int,String)",
"Type newArrayType(int,Type,Object)",
"Stmt newBlock(int,List<Stmt>)",
"Stmt newIf(int,Exp,Stmt,int)",
"Stmt newIfElse(int,Exp,Stmt,int,Stmt)",
"Stmt newWhile(int,Exp,Stmt)",
"Stmt assign(Exp,int,Exp)",
"Decl fieldDecl(Type,int,String)",
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
4,1,
4,1,
6,1,
3,1,
3,1,
2,1,
1,1,
1,1,
2,1,
3,1,
2,1,
4,1,
5,1,
3,1,
3,1,
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
    1,
    0,
    1,
    1,
    1,
    1,
    1,
    0,
    0,
    0,
    1,
    1,
    1,
    2,
    1,
    1,
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
    0,
    1,
    0,
    1,
    0,
    1,
    0,
    0,
    0,
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
