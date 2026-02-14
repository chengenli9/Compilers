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
public int getEofSym() { return 109; }
public int getNttSym() { return 110; }
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
"{\"A\"..\"Z\" \"a\" \"d\" \"f\"..\"h\" \"j\"..\"k\" \"m\"..\"n\" \"q\" \"s\" \"w\" \"y\"..\"z\"}",
"\"p\"",
"\"v\"",
"\"c\"",
"\"i\"",
"\"l\"",
"\"o\"",
"\"r\"",
"\"u\"",
"\"x\"",
"\"b\"",
"\"e\"",
"\"t\"",
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
public int numSymbols() { return 111;}
private static final int MIN_REDUCTION = 968;
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
1,419, // <start>
2,642, // ws*
3,777, // <program>
4,608, // <class decl>+
8,812, // <class decl>
9,107, // `class
79,11, // ws
80,607, // " "
81,805, // {10}
82,659, // "#"
  }
,
{ // state 1
  }
,
{ // state 2
57,478, // letter
58,48, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q" "s" "w" "y".."z"}
59,48, // "p"
60,48, // "v"
61,48, // "c"
62,48, // "i"
63,48, // "l"
64,48, // "o"
65,48, // "r"
66,48, // "u"
67,48, // "x"
68,48, // "b"
69,48, // "e"
70,48, // "t"
71,867, // letter128
72,503, // {199..218 231..250}
73,503, // {193..198 225..230}
74,195, // digit
75,174, // {"1".."9"}
76,174, // "0"
77,564, // digit128
78,946, // {176..185}
97,793, // $$3
102,924, // idChar
103,910, // "_"
104,905, // idChar128
105,692, // {223}
  }
,
{ // state 3
MIN_REDUCTION+53, // (default reduction)
  }
,
{ // state 4
0x80000000|1, // match move
0x80000000|441, // no-match move
0x80000000|31, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 5
0x80000000|1, // match move
0x80000000|748, // no-match move
0x80000000|31, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 6
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 7
0x80000000|57, // match move
0x80000000|530, // no-match move
0x80000000|31, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 8
30,MIN_REDUCTION+129, // `[
92,MIN_REDUCTION+129, // "["
MIN_REDUCTION+129, // (default reduction)
  }
,
{ // state 9
57,478, // letter
58,48, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q" "s" "w" "y".."z"}
59,48, // "p"
60,48, // "v"
61,48, // "c"
62,48, // "i"
63,48, // "l"
64,48, // "o"
65,48, // "r"
66,48, // "u"
67,48, // "x"
68,48, // "b"
69,48, // "e"
70,48, // "t"
71,586, // letter128
72,611, // {199..218 231..250}
73,611, // {193..198 225..230}
74,195, // digit
75,174, // {"1".."9"}
76,174, // "0"
77,654, // digit128
78,808, // {176..185}
96,699, // idChar*
97,449, // $$3
102,935, // idChar
103,910, // "_"
104,228, // idChar128
105,757, // {223}
  }
,
{ // state 10
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 11
MIN_REDUCTION+129, // (default reduction)
  }
,
{ // state 12
7,280, // ID
17,385, // `(
20,875, // <type>
27,104, // `int
28,790, // `boolean
32,408, // <stmt>
33,706, // <assign>
35,34, // `{
38,270, // <local var decl>
39,150, // `if
40,125, // <expr>
43,880, // <expr8>
44,114, // <expr7>
45,111, // <expr6>
46,118, // <expr5>
47,958, // <expr4>
49,546, // <expr3>
51,831, // <expr2>
52,693, // <cast expr>
53,551, // <unary expr>
54,413, // <expr1>
55,720, // `-
56,215, // INTLIT
57,742, // letter
58,593, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q" "s" "w" "y".."z"}
59,593, // "p"
60,593, // "v"
61,593, // "c"
62,593, // "i"
63,593, // "l"
64,593, // "o"
65,593, // "r"
66,593, // "u"
67,593, // "x"
68,593, // "b"
69,593, // "e"
70,593, // "t"
71,697, // letter128
72,133, // {199..218 231..250}
73,133, // {193..198 225..230}
75,576, // {"1".."9"}
76,162, // "0"
77,284, // digit128
78,936, // {176..185}
82,77, // "#"
86,61, // "("
88,142, // "{"
90,671, // "-"
  }
,
{ // state 13
MIN_REDUCTION+114, // (default reduction)
  }
,
{ // state 14
MIN_REDUCTION+114, // (default reduction)
  }
,
{ // state 15
0x80000000|1, // match move
0x80000000|197, // no-match move
0x80000000|31, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 16
0x80000000|1, // match move
0x80000000|199, // no-match move
0x80000000|31, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 17
2,230, // ws*
79,862, // ws
80,531, // " "
81,781, // {10}
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 18
7,907, // ID
12,252, // <decl in class>
13,707, // <field decl>
14,151, // <method decl>
15,325, // `public
20,871, // <type>
27,104, // `int
28,790, // `boolean
37,733, // `}
57,770, // letter
58,593, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q" "s" "w" "y".."z"}
59,593, // "p"
60,593, // "v"
61,593, // "c"
62,593, // "i"
63,593, // "l"
64,593, // "o"
65,593, // "r"
66,593, // "u"
67,593, // "x"
68,593, // "b"
69,593, // "e"
70,593, // "t"
71,149, // letter128
72,906, // {199..218 231..250}
73,906, // {193..198 225..230}
82,136, // "#"
89,767, // "}"
  }
,
{ // state 19
64,955, // "o"
  }
,
{ // state 20
MIN_REDUCTION+53, // (default reduction)
  }
,
{ // state 21
MIN_REDUCTION+53, // (default reduction)
  }
,
{ // state 22
57,478, // letter
58,48, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q" "s" "w" "y".."z"}
59,48, // "p"
60,48, // "v"
61,48, // "c"
62,48, // "i"
63,48, // "l"
64,48, // "o"
65,48, // "r"
66,48, // "u"
67,48, // "x"
68,48, // "b"
69,48, // "e"
70,48, // "t"
71,583, // letter128
72,610, // {199..218 231..250}
73,610, // {193..198 225..230}
74,195, // digit
75,174, // {"1".."9"}
76,174, // "0"
77,651, // digit128
78,798, // {176..185}
96,700, // idChar*
97,447, // $$3
102,935, // idChar
103,910, // "_"
104,232, // idChar128
105,755, // {223}
  }
,
{ // state 23
MIN_REDUCTION+128, // (default reduction)
  }
,
{ // state 24
0x80000000|1, // match move
0x80000000|731, // no-match move
0x80000000|31, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 25
0x80000000|1, // match move
0x80000000|734, // no-match move
0x80000000|31, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 26
30,MIN_REDUCTION+47, // `[
92,MIN_REDUCTION+47, // "["
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 27
79,374, // ws
80,710, // " "
81,96, // {10}
MIN_REDUCTION+76, // (default reduction)
  }
,
{ // state 28
30,952, // `[
92,640, // "["
MIN_REDUCTION+44, // (default reduction)
  }
,
{ // state 29
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 30
30,MIN_REDUCTION+47, // `[
92,MIN_REDUCTION+47, // "["
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 31
30,826, // `[
92,131, // "["
  }
,
{ // state 32
70,929, // "t"
  }
,
{ // state 33
2,870, // ws*
79,493, // ws
80,89, // " "
81,456, // {10}
MIN_REDUCTION+85, // (default reduction)
  }
,
{ // state 34
7,280, // ID
17,385, // `(
20,875, // <type>
27,104, // `int
28,790, // `boolean
32,721, // <stmt>
33,706, // <assign>
35,34, // `{
36,148, // <stmt>*
37,465, // `}
38,270, // <local var decl>
39,150, // `if
40,125, // <expr>
43,880, // <expr8>
44,114, // <expr7>
45,111, // <expr6>
46,118, // <expr5>
47,958, // <expr4>
49,546, // <expr3>
51,831, // <expr2>
52,693, // <cast expr>
53,551, // <unary expr>
54,413, // <expr1>
55,720, // `-
56,215, // INTLIT
57,742, // letter
58,593, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q" "s" "w" "y".."z"}
59,593, // "p"
60,593, // "v"
61,593, // "c"
62,593, // "i"
63,593, // "l"
64,593, // "o"
65,593, // "r"
66,593, // "u"
67,593, // "x"
68,593, // "b"
69,593, // "e"
70,593, // "t"
71,697, // letter128
72,133, // {199..218 231..250}
73,133, // {193..198 225..230}
75,576, // {"1".."9"}
76,162, // "0"
77,284, // digit128
78,936, // {176..185}
82,77, // "#"
86,61, // "("
88,142, // "{"
89,393, // "}"
90,671, // "-"
  }
,
{ // state 35
0x80000000|1, // match move
0x80000000|717, // no-match move
0x80000000|31, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 36
31,535, // `]
93,17, // "]"
  }
,
{ // state 37
57,478, // letter
58,48, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q" "s" "w" "y".."z"}
59,48, // "p"
60,48, // "v"
61,48, // "c"
62,48, // "i"
63,48, // "l"
64,48, // "o"
65,48, // "r"
66,48, // "u"
67,48, // "x"
68,48, // "b"
69,48, // "e"
70,48, // "t"
71,792, // letter128
72,538, // {199..218 231..250}
73,538, // {193..198 225..230}
74,195, // digit
75,174, // {"1".."9"}
76,174, // "0"
77,569, // digit128
78,931, // {176..185}
97,774, // $$3
102,924, // idChar
103,910, // "_"
104,105, // idChar128
105,597, // {223}
  }
,
{ // state 38
0x80000000|1, // match move
0x80000000|464, // no-match move
0x80000000|31, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 39
30,MIN_REDUCTION+47, // `[
92,MIN_REDUCTION+47, // "["
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 40
30,954, // `[
92,640, // "["
MIN_REDUCTION+44, // (default reduction)
  }
,
{ // state 41
0x80000000|1, // match move
0x80000000|470, // no-match move
0x80000000|31, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 42
35,153, // `{
88,142, // "{"
  }
,
{ // state 43
MIN_REDUCTION+128, // (default reduction)
  }
,
{ // state 44
79,913, // ws
80,750, // " "
81,3, // {10}
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 45
0x80000000|1, // match move
0x80000000|236, // no-match move
0x80000000|31, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 46
57,478, // letter
58,48, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q" "s" "w" "y".."z"}
59,48, // "p"
60,48, // "v"
61,48, // "c"
62,48, // "i"
63,48, // "l"
64,48, // "o"
65,48, // "r"
66,48, // "u"
67,48, // "x"
68,48, // "b"
69,48, // "e"
70,48, // "t"
71,782, // letter128
72,523, // {199..218 231..250}
73,523, // {193..198 225..230}
74,195, // digit
75,174, // {"1".."9"}
76,174, // "0"
77,585, // digit128
78,936, // {176..185}
97,780, // $$3
102,924, // idChar
103,910, // "_"
104,873, // idChar128
105,584, // {223}
  }
,
{ // state 47
57,478, // letter
58,48, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q" "s" "w" "y".."z"}
59,48, // "p"
60,48, // "v"
61,48, // "c"
62,48, // "i"
63,48, // "l"
64,48, // "o"
65,48, // "r"
66,48, // "u"
67,48, // "x"
68,48, // "b"
69,48, // "e"
70,48, // "t"
71,787, // letter128
72,519, // {199..218 231..250}
73,519, // {193..198 225..230}
74,195, // digit
75,174, // {"1".."9"}
76,174, // "0"
77,581, // digit128
78,937, // {176..185}
97,783, // $$3
102,924, // idChar
103,910, // "_"
104,869, // idChar128
105,580, // {223}
  }
,
{ // state 48
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 49
30,960, // `[
92,640, // "["
MIN_REDUCTION+44, // (default reduction)
  }
,
{ // state 50
MIN_REDUCTION+52, // (default reduction)
  }
,
{ // state 51
0x80000000|625, // match move
0x80000000|298, // no-match move
0x80000000|31, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 52
79,582, // ws
80,872, // " "
81,168, // {10}
MIN_REDUCTION+136, // (default reduction)
  }
,
{ // state 53
79,23, // ws
80,225, // " "
81,847, // {10}
MIN_REDUCTION+78, // (default reduction)
  }
,
{ // state 54
30,MIN_REDUCTION+47, // `[
92,MIN_REDUCTION+47, // "["
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 55
2,747, // ws*
79,862, // ws
80,531, // " "
81,781, // {10}
MIN_REDUCTION+137, // (default reduction)
  }
,
{ // state 56
7,907, // ID
18,431, // <paramList>?
19,754, // $$1
20,418, // <type>
22,120, // <param>
25,356, // <paramList>
27,104, // `int
28,790, // `boolean
41,42, // `)
57,770, // letter
58,593, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q" "s" "w" "y".."z"}
59,593, // "p"
60,593, // "v"
61,593, // "c"
62,593, // "i"
63,593, // "l"
64,593, // "o"
65,593, // "r"
66,593, // "u"
67,593, // "x"
68,593, // "b"
69,593, // "e"
70,593, // "t"
71,149, // letter128
72,906, // {199..218 231..250}
73,906, // {193..198 225..230}
82,563, // "#"
87,483, // ")"
  }
,
{ // state 57
MIN_REDUCTION+52, // (default reduction)
  }
,
{ // state 58
66,210, // "u"
  }
,
{ // state 59
79,376, // ws
80,251, // " "
81,164, // {10}
MIN_REDUCTION+136, // (default reduction)
  }
,
{ // state 60
79,779, // ws
80,863, // " "
81,226, // {10}
MIN_REDUCTION+54, // (default reduction)
  }
,
{ // state 61
2,674, // ws*
79,423, // ws
80,844, // " "
81,527, // {10}
MIN_REDUCTION+73, // (default reduction)
  }
,
{ // state 62
7,292, // ID
17,359, // `(
51,425, // <expr2>
52,675, // <cast expr>
53,521, // <unary expr>
54,375, // <expr1>
55,667, // `-
56,238, // INTLIT
57,749, // letter
58,593, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q" "s" "w" "y".."z"}
59,593, // "p"
60,593, // "v"
61,593, // "c"
62,593, // "i"
63,593, // "l"
64,593, // "o"
65,593, // "r"
66,593, // "u"
67,593, // "x"
68,593, // "b"
69,593, // "e"
70,593, // "t"
71,828, // letter128
72,503, // {199..218 231..250}
73,503, // {193..198 225..230}
75,617, // {"1".."9"}
76,135, // "0"
77,429, // digit128
78,946, // {176..185}
86,61, // "("
90,671, // "-"
  }
,
{ // state 63
MIN_REDUCTION+32, // (default reduction)
  }
,
{ // state 64
0x80000000|1, // match move
0x80000000|885, // no-match move
0x80000000|31, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 65
MIN_REDUCTION+31, // (default reduction)
  }
,
{ // state 66
MIN_REDUCTION+33, // (default reduction)
  }
,
{ // state 67
50,76, // `*
85,222, // "*"
MIN_REDUCTION+35, // (default reduction)
  }
,
{ // state 68
30,MIN_REDUCTION+53, // `[
92,MIN_REDUCTION+53, // "["
MIN_REDUCTION+53, // (default reduction)
  }
,
{ // state 69
MIN_REDUCTION+53, // (default reduction)
  }
,
{ // state 70
30,894, // `[
92,640, // "["
MIN_REDUCTION+44, // (default reduction)
  }
,
{ // state 71
MIN_REDUCTION+128, // (default reduction)
  }
,
{ // state 72
79,83, // ws
80,851, // " "
81,439, // {10}
MIN_REDUCTION+78, // (default reduction)
  }
,
{ // state 73
30,MIN_REDUCTION+53, // `[
92,MIN_REDUCTION+53, // "["
MIN_REDUCTION+53, // (default reduction)
  }
,
{ // state 74
30,MIN_REDUCTION+53, // `[
92,MIN_REDUCTION+53, // "["
MIN_REDUCTION+53, // (default reduction)
  }
,
{ // state 75
69,660, // "e"
  }
,
{ // state 76
7,443, // ID
17,605, // `(
51,473, // <expr2>
52,695, // <cast expr>
53,550, // <unary expr>
54,411, // <expr1>
55,718, // `-
56,211, // INTLIT
57,646, // letter
58,593, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q" "s" "w" "y".."z"}
59,593, // "p"
60,593, // "v"
61,593, // "c"
62,593, // "i"
63,593, // "l"
64,593, // "o"
65,593, // "r"
66,593, // "u"
67,593, // "x"
68,593, // "b"
69,593, // "e"
70,593, // "t"
71,845, // letter128
72,519, // {199..218 231..250}
73,519, // {193..198 225..230}
75,578, // {"1".."9"}
76,161, // "0"
77,282, // digit128
78,937, // {176..185}
86,61, // "("
90,671, // "-"
  }
,
{ // state 77
62,476, // "i"
68,480, // "b"
83,106, // "+"
  }
,
{ // state 78
7,421, // ID
17,385, // `(
51,472, // <expr2>
52,693, // <cast expr>
53,551, // <unary expr>
54,413, // <expr1>
55,720, // `-
56,215, // INTLIT
57,645, // letter
58,593, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q" "s" "w" "y".."z"}
59,593, // "p"
60,593, // "v"
61,593, // "c"
62,593, // "i"
63,593, // "l"
64,593, // "o"
65,593, // "r"
66,593, // "u"
67,593, // "x"
68,593, // "b"
69,593, // "e"
70,593, // "t"
71,848, // letter128
72,523, // {199..218 231..250}
73,523, // {193..198 225..230}
75,576, // {"1".."9"}
76,162, // "0"
77,284, // digit128
78,936, // {176..185}
86,61, // "("
90,671, // "-"
  }
,
{ // state 79
MIN_REDUCTION+136, // (default reduction)
  }
,
{ // state 80
50,78, // `*
85,222, // "*"
MIN_REDUCTION+35, // (default reduction)
  }
,
{ // state 81
79,361, // ws
80,244, // " "
81,178, // {10}
MIN_REDUCTION+136, // (default reduction)
  }
,
{ // state 82
2,941, // ws*
79,134, // ws
80,926, // " "
81,619, // {10}
MIN_REDUCTION+61, // (default reduction)
  }
,
{ // state 83
MIN_REDUCTION+128, // (default reduction)
  }
,
{ // state 84
0x80000000|1, // match move
0x80000000|923, // no-match move
0x80000000|31, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 85
2,756, // ws*
MIN_REDUCTION+137, // (default reduction)
  }
,
{ // state 86
0x80000000|1, // match move
0x80000000|917, // no-match move
0x80000000|31, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 87
57,478, // letter
58,48, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q" "s" "w" "y".."z"}
59,48, // "p"
60,48, // "v"
61,48, // "c"
62,48, // "i"
63,48, // "l"
64,48, // "o"
65,48, // "r"
66,48, // "u"
67,48, // "x"
68,48, // "b"
69,48, // "e"
70,48, // "t"
71,889, // letter128
72,566, // {199..218 231..250}
73,566, // {193..198 225..230}
74,195, // digit
75,174, // {"1".."9"}
76,174, // "0"
77,818, // digit128
78,249, // {176..185}
96,666, // idChar*
97,88, // $$3
102,935, // idChar
103,910, // "_"
104,334, // idChar128
105,567, // {223}
  }
,
{ // state 88
MIN_REDUCTION+97, // (default reduction)
  }
,
{ // state 89
MIN_REDUCTION+52, // (default reduction)
  }
,
{ // state 90
30,MIN_REDUCTION+53, // `[
92,MIN_REDUCTION+53, // "["
MIN_REDUCTION+53, // (default reduction)
  }
,
{ // state 91
30,MIN_REDUCTION+97, // `[
92,MIN_REDUCTION+97, // "["
MIN_REDUCTION+97, // (default reduction)
  }
,
{ // state 92
MIN_REDUCTION+129, // (default reduction)
  }
,
{ // state 93
0x80000000|1, // match move
0x80000000|207, // no-match move
0x80000000|31, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 94
MIN_REDUCTION+32, // (default reduction)
  }
,
{ // state 95
30,MIN_REDUCTION+138, // `[
79,35, // ws
80,126, // " "
81,914, // {10}
92,MIN_REDUCTION+138, // "["
MIN_REDUCTION+138, // (default reduction)
  }
,
{ // state 96
MIN_REDUCTION+53, // (default reduction)
  }
,
{ // state 97
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 98
7,437, // ID
17,575, // `(
51,479, // <expr2>
52,677, // <cast expr>
53,702, // <unary expr>
54,386, // <expr1>
55,712, // `-
56,206, // INTLIT
57,687, // letter
58,593, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q" "s" "w" "y".."z"}
59,593, // "p"
60,593, // "v"
61,593, // "c"
62,593, // "i"
63,593, // "l"
64,593, // "o"
65,593, // "r"
66,593, // "u"
67,593, // "x"
68,593, // "b"
69,593, // "e"
70,593, // "t"
71,866, // letter128
72,538, // {199..218 231..250}
73,538, // {193..198 225..230}
75,691, // {"1".."9"}
76,172, // "0"
77,261, // digit128
78,931, // {176..185}
86,61, // "("
90,671, // "-"
  }
,
{ // state 99
0x80000000|1, // match move
0x80000000|198, // no-match move
0x80000000|31, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 100
MIN_REDUCTION+31, // (default reduction)
  }
,
{ // state 101
0x80000000|1, // match move
0x80000000|196, // no-match move
0x80000000|31, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 102
MIN_REDUCTION+33, // (default reduction)
  }
,
{ // state 103
30,MIN_REDUCTION+49, // `[
92,MIN_REDUCTION+49, // "["
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 104
MIN_REDUCTION+17, // (default reduction)
  }
,
{ // state 105
0x80000000|167, // match move
0x80000000|577, // no-match move
0x80000000|31, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 106
2,414, // ws*
79,275, // ws
80,244, // " "
81,178, // {10}
MIN_REDUCTION+65, // (default reduction)
  }
,
{ // state 107
7,233, // ID
57,87, // letter
58,593, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q" "s" "w" "y".."z"}
59,593, // "p"
60,593, // "v"
61,593, // "c"
62,593, // "i"
63,593, // "l"
64,593, // "o"
65,593, // "r"
66,593, // "u"
67,593, // "x"
68,593, // "b"
69,593, // "e"
70,593, // "t"
71,854, // letter128
72,566, // {199..218 231..250}
73,566, // {193..198 225..230}
  }
,
{ // state 108
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 109
79,43, // ws
80,926, // " "
81,619, // {10}
MIN_REDUCTION+58, // (default reduction)
  }
,
{ // state 110
0x80000000|1, // match move
0x80000000|154, // no-match move
0x80000000|31, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 111
MIN_REDUCTION+32, // (default reduction)
  }
,
{ // state 112
MIN_REDUCTION+53, // (default reduction)
  }
,
{ // state 113
MIN_REDUCTION+33, // (default reduction)
  }
,
{ // state 114
MIN_REDUCTION+31, // (default reduction)
  }
,
{ // state 115
MIN_REDUCTION+32, // (default reduction)
  }
,
{ // state 116
7,443, // ID
17,605, // `(
40,825, // <expr>
43,879, // <expr8>
44,119, // <expr7>
45,115, // <expr6>
46,113, // <expr5>
47,956, // <expr4>
49,565, // <expr3>
51,827, // <expr2>
52,695, // <cast expr>
53,550, // <unary expr>
54,411, // <expr1>
55,718, // `-
56,211, // INTLIT
57,646, // letter
58,593, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q" "s" "w" "y".."z"}
59,593, // "p"
60,593, // "v"
61,593, // "c"
62,593, // "i"
63,593, // "l"
64,593, // "o"
65,593, // "r"
66,593, // "u"
67,593, // "x"
68,593, // "b"
69,593, // "e"
70,593, // "t"
71,845, // letter128
72,519, // {199..218 231..250}
73,519, // {193..198 225..230}
75,578, // {"1".."9"}
76,161, // "0"
77,282, // digit128
78,937, // {176..185}
86,61, // "("
90,671, // "-"
  }
,
{ // state 117
50,62, // `*
85,222, // "*"
MIN_REDUCTION+35, // (default reduction)
  }
,
{ // state 118
MIN_REDUCTION+33, // (default reduction)
  }
,
{ // state 119
MIN_REDUCTION+31, // (default reduction)
  }
,
{ // state 120
23,736, // <extra param>
24,838, // `,
26,524, // <extra param>*
94,775, // ","
MIN_REDUCTION+16, // (default reduction)
  }
,
{ // state 121
MIN_REDUCTION+129, // (default reduction)
  }
,
{ // state 122
30,MIN_REDUCTION+96, // `[
92,MIN_REDUCTION+96, // "["
MIN_REDUCTION+96, // (default reduction)
  }
,
{ // state 123
23,735, // <extra param>
24,839, // `,
26,522, // <extra param>*
94,775, // ","
MIN_REDUCTION+16, // (default reduction)
  }
,
{ // state 124
0x80000000|832, // match move
0x80000000|944, // no-match move
0x80000000|31, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 125
42,264, // `=
91,33, // "="
  }
,
{ // state 126
0x80000000|1, // match move
0x80000000|180, // no-match move
0x80000000|31, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 127
MIN_REDUCTION+134, // (default reduction)
  }
,
{ // state 128
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 129
30,MIN_REDUCTION+49, // `[
92,MIN_REDUCTION+49, // "["
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 130
MIN_REDUCTION+128, // (default reduction)
  }
,
{ // state 131
2,719, // ws*
79,308, // ws
80,271, // " "
81,202, // {10}
MIN_REDUCTION+87, // (default reduction)
  }
,
{ // state 132
2,191, // ws*
  }
,
{ // state 133
0x80000000|778, // match move
0x80000000|722, // no-match move
0x80000000|31, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 134
MIN_REDUCTION+129, // (default reduction)
  }
,
{ // state 135
58,796, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q" "s" "w" "y".."z"}
59,796, // "p"
60,796, // "v"
61,796, // "c"
62,796, // "i"
63,796, // "l"
64,796, // "o"
65,796, // "r"
66,796, // "u"
67,796, // "x"
68,796, // "b"
69,796, // "e"
70,796, // "t"
73,51, // {193..198 225..230}
75,796, // {"1".."9"}
76,796, // "0"
78,51, // {176..185}
100,442, // hexDigit*
101,964, // $$5
106,919, // hexDigit
107,422, // hexDigit128
  }
,
{ // state 136
59,58, // "p"
62,476, // "i"
68,480, // "b"
  }
,
{ // state 137
35,257, // `{
88,709, // "{"
  }
,
{ // state 138
57,478, // letter
58,48, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q" "s" "w" "y".."z"}
59,48, // "p"
60,48, // "v"
61,48, // "c"
62,48, // "i"
63,48, // "l"
64,48, // "o"
65,48, // "r"
66,48, // "u"
67,48, // "x"
68,48, // "b"
69,48, // "e"
70,48, // "t"
71,10, // letter128
72,795, // {199..218 231..250}
73,795, // {193..198 225..230}
74,195, // digit
75,174, // {"1".."9"}
76,174, // "0"
77,948, // digit128
78,223, // {176..185}
96,673, // idChar*
97,318, // $$3
102,935, // idChar
103,910, // "_"
104,609, // idChar128
105,274, // {223}
  }
,
{ // state 139
MIN_REDUCTION+6, // (default reduction)
  }
,
{ // state 140
2,397, // ws*
79,801, // ws
80,481, // " "
81,855, // {10}
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 141
79,728, // ws
80,468, // " "
81,20, // {10}
MIN_REDUCTION+136, // (default reduction)
  }
,
{ // state 142
2,887, // ws*
79,928, // ws
80,508, // " "
81,786, // {10}
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 143
2,395, // ws*
79,799, // ws
80,482, // " "
81,856, // {10}
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 144
79,729, // ws
80,466, // " "
81,21, // {10}
MIN_REDUCTION+136, // (default reduction)
  }
,
{ // state 145
2,44, // ws*
79,579, // ws
80,750, // " "
81,3, // {10}
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 146
57,478, // letter
58,48, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q" "s" "w" "y".."z"}
59,48, // "p"
60,48, // "v"
61,48, // "c"
62,48, // "i"
63,48, // "l"
64,48, // "o"
65,48, // "r"
66,48, // "u"
67,48, // "x"
68,48, // "b"
69,48, // "e"
70,48, // "t"
71,6, // letter128
72,788, // {199..218 231..250}
73,788, // {193..198 225..230}
74,195, // digit
75,174, // {"1".."9"}
76,174, // "0"
77,949, // digit128
78,221, // {176..185}
96,668, // idChar*
97,320, // $$3
102,935, // idChar
103,910, // "_"
104,623, // idChar128
105,272, // {223}
  }
,
{ // state 147
110,MIN_REDUCTION+53, // $NT
MIN_REDUCTION+53, // (default reduction)
  }
,
{ // state 148
7,280, // ID
17,385, // `(
20,875, // <type>
27,104, // `int
28,790, // `boolean
32,612, // <stmt>
33,706, // <assign>
35,34, // `{
37,834, // `}
38,270, // <local var decl>
39,150, // `if
40,125, // <expr>
43,880, // <expr8>
44,114, // <expr7>
45,111, // <expr6>
46,118, // <expr5>
47,958, // <expr4>
49,546, // <expr3>
51,831, // <expr2>
52,693, // <cast expr>
53,551, // <unary expr>
54,413, // <expr1>
55,720, // `-
56,215, // INTLIT
57,742, // letter
58,593, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q" "s" "w" "y".."z"}
59,593, // "p"
60,593, // "v"
61,593, // "c"
62,593, // "i"
63,593, // "l"
64,593, // "o"
65,593, // "r"
66,593, // "u"
67,593, // "x"
68,593, // "b"
69,593, // "e"
70,593, // "t"
71,697, // letter128
72,133, // {199..218 231..250}
73,133, // {193..198 225..230}
75,576, // {"1".."9"}
76,162, // "0"
77,284, // digit128
78,936, // {176..185}
82,77, // "#"
86,61, // "("
88,142, // "{"
89,393, // "}"
90,671, // "-"
  }
,
{ // state 149
2,372, // ws*
79,862, // ws
80,531, // " "
81,781, // {10}
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 150
17,400, // `(
86,861, // "("
  }
,
{ // state 151
MIN_REDUCTION+8, // (default reduction)
  }
,
{ // state 152
57,478, // letter
58,48, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q" "s" "w" "y".."z"}
59,48, // "p"
60,48, // "v"
61,48, // "c"
62,48, // "i"
63,48, // "l"
64,48, // "o"
65,48, // "r"
66,48, // "u"
67,48, // "x"
68,48, // "b"
69,48, // "e"
70,48, // "t"
71,108, // letter128
72,771, // {199..218 231..250}
73,771, // {193..198 225..230}
74,195, // digit
75,174, // {"1".."9"}
76,174, // "0"
77,945, // digit128
78,254, // {176..185}
96,681, // idChar*
97,311, // $$3
102,935, // idChar
103,910, // "_"
104,598, // idChar128
105,306, // {223}
  }
,
{ // state 153
7,280, // ID
17,385, // `(
20,875, // <type>
27,104, // `int
28,790, // `boolean
32,721, // <stmt>
33,706, // <assign>
35,34, // `{
36,536, // <stmt>*
37,933, // `}
38,270, // <local var decl>
39,150, // `if
40,125, // <expr>
43,880, // <expr8>
44,114, // <expr7>
45,111, // <expr6>
46,118, // <expr5>
47,958, // <expr4>
49,546, // <expr3>
51,831, // <expr2>
52,693, // <cast expr>
53,551, // <unary expr>
54,413, // <expr1>
55,720, // `-
56,215, // INTLIT
57,742, // letter
58,593, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q" "s" "w" "y".."z"}
59,593, // "p"
60,593, // "v"
61,593, // "c"
62,593, // "i"
63,593, // "l"
64,593, // "o"
65,593, // "r"
66,593, // "u"
67,593, // "x"
68,593, // "b"
69,593, // "e"
70,593, // "t"
71,697, // letter128
72,133, // {199..218 231..250}
73,133, // {193..198 225..230}
75,576, // {"1".."9"}
76,162, // "0"
77,284, // digit128
78,936, // {176..185}
82,77, // "#"
86,61, // "("
88,142, // "{"
89,890, // "}"
90,671, // "-"
  }
,
{ // state 154
30,960, // `[
92,640, // "["
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 155
0x80000000|85, // match move
0x80000000|157, // no-match move
0x80000000|31, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 156
MIN_REDUCTION+127, // (default reduction)
  }
,
{ // state 157
2,756, // ws*
30,MIN_REDUCTION+137, // `[
79,477, // ws
80,7, // " "
81,294, // {10}
92,MIN_REDUCTION+137, // "["
MIN_REDUCTION+137, // (default reduction)
  }
,
{ // state 158
30,MIN_REDUCTION+136, // `[
79,35, // ws
80,126, // " "
81,914, // {10}
92,MIN_REDUCTION+136, // "["
MIN_REDUCTION+136, // (default reduction)
  }
,
{ // state 159
MIN_REDUCTION+129, // (default reduction)
  }
,
{ // state 160
MIN_REDUCTION+129, // (default reduction)
  }
,
{ // state 161
58,796, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q" "s" "w" "y".."z"}
59,796, // "p"
60,796, // "v"
61,796, // "c"
62,796, // "i"
63,796, // "l"
64,796, // "o"
65,796, // "r"
66,796, // "u"
67,796, // "x"
68,796, // "b"
69,796, // "e"
70,796, // "t"
73,177, // {193..198 225..230}
75,796, // {"1".."9"}
76,796, // "0"
78,177, // {176..185}
100,401, // hexDigit*
101,492, // $$5
106,919, // hexDigit
107,377, // hexDigit128
  }
,
{ // state 162
58,796, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q" "s" "w" "y".."z"}
59,796, // "p"
60,796, // "v"
61,796, // "c"
62,796, // "i"
63,796, // "l"
64,796, // "o"
65,796, // "r"
66,796, // "u"
67,796, // "x"
68,796, // "b"
69,796, // "e"
70,796, // "t"
73,176, // {193..198 225..230}
75,796, // {"1".."9"}
76,796, // "0"
78,176, // {176..185}
100,399, // hexDigit*
101,495, // $$5
106,919, // hexDigit
107,445, // hexDigit128
  }
,
{ // state 163
79,582, // ws
80,872, // " "
81,168, // {10}
MIN_REDUCTION+94, // (default reduction)
  }
,
{ // state 164
MIN_REDUCTION+53, // (default reduction)
  }
,
{ // state 165
MIN_REDUCTION+25, // (default reduction)
  }
,
{ // state 166
MIN_REDUCTION+22, // (default reduction)
  }
,
{ // state 167
2,596, // ws*
  }
,
{ // state 168
MIN_REDUCTION+53, // (default reduction)
  }
,
{ // state 169
79,518, // ws
80,481, // " "
81,855, // {10}
MIN_REDUCTION+136, // (default reduction)
  }
,
{ // state 170
79,779, // ws
80,863, // " "
81,226, // {10}
MIN_REDUCTION+62, // (default reduction)
  }
,
{ // state 171
57,478, // letter
58,48, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q" "s" "w" "y".."z"}
59,48, // "p"
60,48, // "v"
61,48, // "c"
62,48, // "i"
63,48, // "l"
64,48, // "o"
65,48, // "r"
66,48, // "u"
67,48, // "x"
68,48, // "b"
69,48, // "e"
70,48, // "t"
71,128, // letter128
72,776, // {199..218 231..250}
73,776, // {193..198 225..230}
74,195, // digit
75,174, // {"1".."9"}
76,174, // "0"
77,29, // digit128
78,250, // {176..185}
96,696, // idChar*
97,329, // $$3
102,935, // idChar
103,910, // "_"
104,925, // idChar128
105,316, // {223}
  }
,
{ // state 172
58,796, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q" "s" "w" "y".."z"}
59,796, // "p"
60,796, // "v"
61,796, // "c"
62,796, // "i"
63,796, // "l"
64,796, // "o"
65,796, // "r"
66,796, // "u"
67,796, // "x"
68,796, // "b"
69,796, // "e"
70,796, // "t"
73,181, // {193..198 225..230}
75,796, // {"1".."9"}
76,796, // "0"
78,181, // {176..185}
100,403, // hexDigit*
101,497, // $$5
106,919, // hexDigit
107,367, // hexDigit128
  }
,
{ // state 173
2,690, // ws*
  }
,
{ // state 174
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 175
79,515, // ws
80,482, // " "
81,856, // {10}
MIN_REDUCTION+136, // (default reduction)
  }
,
{ // state 176
0x80000000|625, // match move
0x80000000|279, // no-match move
0x80000000|31, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 177
0x80000000|625, // match move
0x80000000|276, // no-match move
0x80000000|31, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 178
MIN_REDUCTION+53, // (default reduction)
  }
,
{ // state 179
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 180
30,MIN_REDUCTION+52, // `[
92,MIN_REDUCTION+52, // "["
MIN_REDUCTION+52, // (default reduction)
  }
,
{ // state 181
0x80000000|625, // match move
0x80000000|440, // no-match move
0x80000000|31, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 182
79,213, // ws
80,922, // " "
81,409, // {10}
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 183
MIN_REDUCTION+53, // (default reduction)
  }
,
{ // state 184
30,MIN_REDUCTION+109, // `[
92,MIN_REDUCTION+109, // "["
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 185
MIN_REDUCTION+53, // (default reduction)
  }
,
{ // state 186
30,MIN_REDUCTION+109, // `[
92,MIN_REDUCTION+109, // "["
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 187
MIN_REDUCTION+53, // (default reduction)
  }
,
{ // state 188
30,MIN_REDUCTION+103, // `[
92,MIN_REDUCTION+103, // "["
MIN_REDUCTION+103, // (default reduction)
  }
,
{ // state 189
30,MIN_REDUCTION+94, // `[
79,5, // ws
80,93, // " "
81,892, // {10}
92,MIN_REDUCTION+94, // "["
MIN_REDUCTION+94, // (default reduction)
  }
,
{ // state 190
41,895, // `)
87,343, // ")"
  }
,
{ // state 191
0x80000000|1, // match move
0x80000000|501, // no-match move
0x80000000|31, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 192
30,MIN_REDUCTION+94, // `[
79,24, // ws
80,99, // " "
81,901, // {10}
92,MIN_REDUCTION+94, // "["
MIN_REDUCTION+94, // (default reduction)
  }
,
{ // state 193
MIN_REDUCTION+128, // (default reduction)
  }
,
{ // state 194
2,109, // ws*
79,134, // ws
80,926, // " "
81,619, // {10}
MIN_REDUCTION+59, // (default reduction)
  }
,
{ // state 195
MIN_REDUCTION+105, // (default reduction)
  }
,
{ // state 196
30,MIN_REDUCTION+52, // `[
92,MIN_REDUCTION+52, // "["
MIN_REDUCTION+52, // (default reduction)
  }
,
{ // state 197
30,952, // `[
92,640, // "["
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 198
30,MIN_REDUCTION+52, // `[
92,MIN_REDUCTION+52, // "["
MIN_REDUCTION+52, // (default reduction)
  }
,
{ // state 199
30,954, // `[
92,640, // "["
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 200
MIN_REDUCTION+129, // (default reduction)
  }
,
{ // state 201
34,636, // `;
95,820, // ";"
  }
,
{ // state 202
MIN_REDUCTION+53, // (default reduction)
  }
,
{ // state 203
2,191, // ws*
30,MIN_REDUCTION+89, // `[
79,396, // ws
80,126, // " "
81,914, // {10}
92,MIN_REDUCTION+89, // "["
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 204
30,MIN_REDUCTION+109, // `[
92,MIN_REDUCTION+109, // "["
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 205
30,MIN_REDUCTION+103, // `[
92,MIN_REDUCTION+103, // "["
MIN_REDUCTION+103, // (default reduction)
  }
,
{ // state 206
0x80000000|1, // match move
0x80000000|54, // no-match move
0x80000000|31, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 207
30,MIN_REDUCTION+52, // `[
92,MIN_REDUCTION+52, // "["
MIN_REDUCTION+52, // (default reduction)
  }
,
{ // state 208
30,MIN_REDUCTION+94, // `[
79,25, // ws
80,101, // " "
81,902, // {10}
92,MIN_REDUCTION+94, // "["
MIN_REDUCTION+94, // (default reduction)
  }
,
{ // state 209
30,MIN_REDUCTION+103, // `[
92,MIN_REDUCTION+103, // "["
MIN_REDUCTION+103, // (default reduction)
  }
,
{ // state 210
2,669, // ws*
79,314, // ws
80,883, // " "
81,379, // {10}
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 211
0x80000000|1, // match move
0x80000000|30, // no-match move
0x80000000|31, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 212
30,MIN_REDUCTION+109, // `[
92,MIN_REDUCTION+109, // "["
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 213
MIN_REDUCTION+128, // (default reduction)
  }
,
{ // state 214
MIN_REDUCTION+53, // (default reduction)
  }
,
{ // state 215
0x80000000|1, // match move
0x80000000|39, // no-match move
0x80000000|31, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 216
MIN_REDUCTION+53, // (default reduction)
  }
,
{ // state 217
2,4, // ws*
30,MIN_REDUCTION+89, // `[
79,64, // ws
80,93, // " "
81,892, // {10}
92,MIN_REDUCTION+89, // "["
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 218
30,MIN_REDUCTION+51, // `[
92,MIN_REDUCTION+51, // "["
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 219
30,MIN_REDUCTION+94, // `[
79,35, // ws
80,126, // " "
81,914, // {10}
92,MIN_REDUCTION+94, // "["
MIN_REDUCTION+94, // (default reduction)
  }
,
{ // state 220
30,MIN_REDUCTION+109, // `[
92,MIN_REDUCTION+109, // "["
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 221
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 222
2,915, // ws*
79,362, // ws
80,716, // " "
81,618, // {10}
MIN_REDUCTION+71, // (default reduction)
  }
,
{ // state 223
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 224
MIN_REDUCTION+117, // (default reduction)
  }
,
{ // state 225
MIN_REDUCTION+52, // (default reduction)
  }
,
{ // state 226
MIN_REDUCTION+53, // (default reduction)
  }
,
{ // state 227
30,MIN_REDUCTION+51, // `[
92,MIN_REDUCTION+51, // "["
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 228
2,169, // ws*
79,801, // ws
80,481, // " "
81,855, // {10}
MIN_REDUCTION+137, // (default reduction)
  }
,
{ // state 229
30,MIN_REDUCTION+51, // `[
92,MIN_REDUCTION+51, // "["
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 230
79,760, // ws
80,531, // " "
81,781, // {10}
MIN_REDUCTION+88, // (default reduction)
  }
,
{ // state 231
2,676, // ws*
  }
,
{ // state 232
2,175, // ws*
79,799, // ws
80,482, // " "
81,856, // {10}
MIN_REDUCTION+137, // (default reduction)
  }
,
{ // state 233
5,858, // <extends ID>
6,939, // `extends
10,810, // <extends ID>?
11,139, // $$0
35,555, // `{
82,75, // "#"
88,769, // "{"
  }
,
{ // state 234
2,38, // ws*
30,MIN_REDUCTION+89, // `[
79,86, // ws
80,101, // " "
81,902, // {10}
92,MIN_REDUCTION+89, // "["
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 235
MIN_REDUCTION+128, // (default reduction)
  }
,
{ // state 236
30,894, // `[
92,640, // "["
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 237
2,41, // ws*
30,MIN_REDUCTION+89, // `[
79,84, // ws
80,99, // " "
81,901, // {10}
92,MIN_REDUCTION+89, // "["
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 238
0x80000000|1, // match move
0x80000000|26, // no-match move
0x80000000|31, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 239
2,686, // ws*
79,278, // ws
80,225, // " "
81,847, // {10}
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 240
2,661, // ws*
  }
,
{ // state 241
2,664, // ws*
  }
,
{ // state 242
79,739, // ws
80,89, // " "
81,456, // {10}
MIN_REDUCTION+72, // (default reduction)
  }
,
{ // state 243
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 244
MIN_REDUCTION+52, // (default reduction)
  }
,
{ // state 245
79,913, // ws
80,750, // " "
81,3, // {10}
MIN_REDUCTION+78, // (default reduction)
  }
,
{ // state 246
7,443, // ID
17,605, // `(
49,67, // <expr3>
51,827, // <expr2>
52,695, // <cast expr>
53,550, // <unary expr>
54,411, // <expr1>
55,718, // `-
56,211, // INTLIT
57,646, // letter
58,593, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q" "s" "w" "y".."z"}
59,593, // "p"
60,593, // "v"
61,593, // "c"
62,593, // "i"
63,593, // "l"
64,593, // "o"
65,593, // "r"
66,593, // "u"
67,593, // "x"
68,593, // "b"
69,593, // "e"
70,593, // "t"
71,845, // letter128
72,519, // {199..218 231..250}
73,519, // {193..198 225..230}
75,578, // {"1".."9"}
76,161, // "0"
77,282, // digit128
78,937, // {176..185}
86,61, // "("
90,671, // "-"
  }
,
{ // state 247
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 248
7,421, // ID
17,385, // `(
49,80, // <expr3>
51,831, // <expr2>
52,693, // <cast expr>
53,551, // <unary expr>
54,413, // <expr1>
55,720, // `-
56,215, // INTLIT
57,645, // letter
58,593, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q" "s" "w" "y".."z"}
59,593, // "p"
60,593, // "v"
61,593, // "c"
62,593, // "i"
63,593, // "l"
64,593, // "o"
65,593, // "r"
66,593, // "u"
67,593, // "x"
68,593, // "b"
69,593, // "e"
70,593, // "t"
71,848, // letter128
72,523, // {199..218 231..250}
73,523, // {193..198 225..230}
75,576, // {"1".."9"}
76,162, // "0"
77,284, // digit128
78,936, // {176..185}
86,61, // "("
90,671, // "-"
  }
,
{ // state 249
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 250
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 251
MIN_REDUCTION+52, // (default reduction)
  }
,
{ // state 252
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 253
7,280, // ID
17,385, // `(
20,875, // <type>
27,104, // `int
28,790, // `boolean
32,721, // <stmt>
33,706, // <assign>
35,34, // `{
36,500, // <stmt>*
37,474, // `}
38,270, // <local var decl>
39,150, // `if
40,125, // <expr>
43,880, // <expr8>
44,114, // <expr7>
45,111, // <expr6>
46,118, // <expr5>
47,958, // <expr4>
49,546, // <expr3>
51,831, // <expr2>
52,693, // <cast expr>
53,551, // <unary expr>
54,413, // <expr1>
55,720, // `-
56,215, // INTLIT
57,742, // letter
58,593, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q" "s" "w" "y".."z"}
59,593, // "p"
60,593, // "v"
61,593, // "c"
62,593, // "i"
63,593, // "l"
64,593, // "o"
65,593, // "r"
66,593, // "u"
67,593, // "x"
68,593, // "b"
69,593, // "e"
70,593, // "t"
71,697, // letter128
72,133, // {199..218 231..250}
73,133, // {193..198 225..230}
75,576, // {"1".."9"}
76,162, // "0"
77,284, // digit128
78,936, // {176..185}
82,77, // "#"
86,61, // "("
88,142, // "{"
89,460, // "}"
90,671, // "-"
  }
,
{ // state 254
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 255
2,701, // ws*
  }
,
{ // state 256
7,437, // ID
17,575, // `(
49,416, // <expr3>
51,809, // <expr2>
52,677, // <cast expr>
53,702, // <unary expr>
54,386, // <expr1>
55,712, // `-
56,206, // INTLIT
57,687, // letter
58,593, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q" "s" "w" "y".."z"}
59,593, // "p"
60,593, // "v"
61,593, // "c"
62,593, // "i"
63,593, // "l"
64,593, // "o"
65,593, // "r"
66,593, // "u"
67,593, // "x"
68,593, // "b"
69,593, // "e"
70,593, // "t"
71,866, // letter128
72,538, // {199..218 231..250}
73,538, // {193..198 225..230}
75,691, // {"1".."9"}
76,172, // "0"
77,261, // digit128
78,931, // {176..185}
86,61, // "("
90,671, // "-"
  }
,
{ // state 257
7,280, // ID
17,385, // `(
20,875, // <type>
27,104, // `int
28,790, // `boolean
32,658, // <stmt>
33,670, // <assign>
35,253, // `{
36,312, // <stmt>*
38,637, // <local var decl>
39,504, // `if
40,125, // <expr>
43,880, // <expr8>
44,114, // <expr7>
45,111, // <expr6>
46,118, // <expr5>
47,958, // <expr4>
49,546, // <expr3>
51,831, // <expr2>
52,693, // <cast expr>
53,551, // <unary expr>
54,413, // <expr1>
55,720, // `-
56,215, // INTLIT
57,742, // letter
58,593, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q" "s" "w" "y".."z"}
59,593, // "p"
60,593, // "v"
61,593, // "c"
62,593, // "i"
63,593, // "l"
64,593, // "o"
65,593, // "r"
66,593, // "u"
67,593, // "x"
68,593, // "b"
69,593, // "e"
70,593, // "t"
71,697, // letter128
72,133, // {199..218 231..250}
73,133, // {193..198 225..230}
75,576, // {"1".."9"}
76,162, // "0"
77,284, // digit128
78,936, // {176..185}
82,648, // "#"
84,116, // `return
86,61, // "("
88,142, // "{"
90,671, // "-"
  }
,
{ // state 258
MIN_REDUCTION+129, // (default reduction)
  }
,
{ // state 259
MIN_REDUCTION+129, // (default reduction)
  }
,
{ // state 260
MIN_REDUCTION+52, // (default reduction)
  }
,
{ // state 261
0x80000000|438, // match move
0x80000000|430, // no-match move
0x80000000|31, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 262
7,292, // ID
17,359, // `(
49,117, // <expr3>
51,842, // <expr2>
52,675, // <cast expr>
53,521, // <unary expr>
54,375, // <expr1>
55,667, // `-
56,238, // INTLIT
57,749, // letter
58,593, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q" "s" "w" "y".."z"}
59,593, // "p"
60,593, // "v"
61,593, // "c"
62,593, // "i"
63,593, // "l"
64,593, // "o"
65,593, // "r"
66,593, // "u"
67,593, // "x"
68,593, // "b"
69,593, // "e"
70,593, // "t"
71,828, // letter128
72,503, // {199..218 231..250}
73,503, // {193..198 225..230}
75,617, // {"1".."9"}
76,135, // "0"
77,429, // digit128
78,946, // {176..185}
86,61, // "("
90,671, // "-"
  }
,
{ // state 263
2,590, // ws*
30,MIN_REDUCTION+101, // `[
79,396, // ws
80,126, // " "
81,914, // {10}
92,MIN_REDUCTION+101, // "["
MIN_REDUCTION+101, // (default reduction)
  }
,
{ // state 264
7,443, // ID
17,605, // `(
40,549, // <expr>
43,879, // <expr8>
44,119, // <expr7>
45,115, // <expr6>
46,113, // <expr5>
47,956, // <expr4>
49,565, // <expr3>
51,827, // <expr2>
52,695, // <cast expr>
53,550, // <unary expr>
54,411, // <expr1>
55,718, // `-
56,211, // INTLIT
57,646, // letter
58,593, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q" "s" "w" "y".."z"}
59,593, // "p"
60,593, // "v"
61,593, // "c"
62,593, // "i"
63,593, // "l"
64,593, // "o"
65,593, // "r"
66,593, // "u"
67,593, // "x"
68,593, // "b"
69,593, // "e"
70,593, // "t"
71,845, // letter128
72,519, // {199..218 231..250}
73,519, // {193..198 225..230}
75,578, // {"1".."9"}
76,161, // "0"
77,282, // digit128
78,937, // {176..185}
86,61, // "("
90,671, // "-"
  }
,
{ // state 265
21,916, // $$2
41,137, // `)
87,483, // ")"
  }
,
{ // state 266
MIN_REDUCTION+52, // (default reduction)
  }
,
{ // state 267
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 268
0x80000000|1, // match move
0x80000000|502, // no-match move
0x80000000|31, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 269
30,MIN_REDUCTION+100, // `[
79,35, // ws
80,126, // " "
81,914, // {10}
92,MIN_REDUCTION+100, // "["
MIN_REDUCTION+100, // (default reduction)
  }
,
{ // state 270
34,165, // `;
95,145, // ";"
  }
,
{ // state 271
MIN_REDUCTION+52, // (default reduction)
  }
,
{ // state 272
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 273
MIN_REDUCTION+26, // (default reduction)
  }
,
{ // state 274
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 275
MIN_REDUCTION+129, // (default reduction)
  }
,
{ // state 276
30,MIN_REDUCTION+111, // `[
92,MIN_REDUCTION+111, // "["
MIN_REDUCTION+111, // (default reduction)
  }
,
{ // state 277
30,MIN_REDUCTION+103, // `[
92,MIN_REDUCTION+103, // "["
MIN_REDUCTION+103, // (default reduction)
  }
,
{ // state 278
MIN_REDUCTION+129, // (default reduction)
  }
,
{ // state 279
30,MIN_REDUCTION+111, // `[
92,MIN_REDUCTION+111, // "["
MIN_REDUCTION+111, // (default reduction)
  }
,
{ // state 280
0x80000000|841, // match move
0x80000000|852, // no-match move
0x80000000|31, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 281
MIN_REDUCTION+53, // (default reduction)
  }
,
{ // state 282
0x80000000|435, // match move
0x80000000|303, // no-match move
0x80000000|31, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 283
0x80000000|1, // match move
0x80000000|893, // no-match move
0x80000000|31, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 284
0x80000000|436, // match move
0x80000000|300, // no-match move
0x80000000|31, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 285
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 286
0x80000000|1, // match move
0x80000000|484, // no-match move
0x80000000|31, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 287
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 288
MIN_REDUCTION+25, // (default reduction)
  }
,
{ // state 289
MIN_REDUCTION+129, // (default reduction)
  }
,
{ // state 290
0x80000000|1, // match move
0x80000000|486, // no-match move
0x80000000|31, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 291
MIN_REDUCTION+129, // (default reduction)
  }
,
{ // state 292
0x80000000|1, // match move
0x80000000|420, // no-match move
0x80000000|31, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 293
0x80000000|1, // match move
0x80000000|559, // no-match move
0x80000000|31, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 294
0x80000000|69, // match move
0x80000000|615, // no-match move
0x80000000|31, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 295
7,443, // ID
17,605, // `(
40,462, // <expr>
43,879, // <expr8>
44,119, // <expr7>
45,115, // <expr6>
46,113, // <expr5>
47,956, // <expr4>
49,565, // <expr3>
51,827, // <expr2>
52,695, // <cast expr>
53,550, // <unary expr>
54,411, // <expr1>
55,718, // `-
56,211, // INTLIT
57,646, // letter
58,593, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q" "s" "w" "y".."z"}
59,593, // "p"
60,593, // "v"
61,593, // "c"
62,593, // "i"
63,593, // "l"
64,593, // "o"
65,593, // "r"
66,593, // "u"
67,593, // "x"
68,593, // "b"
69,593, // "e"
70,593, // "t"
71,845, // letter128
72,519, // {199..218 231..250}
73,519, // {193..198 225..230}
75,578, // {"1".."9"}
76,161, // "0"
77,282, // digit128
78,937, // {176..185}
86,61, // "("
90,671, // "-"
  }
,
{ // state 296
MIN_REDUCTION+52, // (default reduction)
  }
,
{ // state 297
7,437, // ID
17,575, // `(
40,190, // <expr>
43,897, // <expr8>
44,100, // <expr7>
45,94, // <expr6>
46,102, // <expr5>
47,878, // <expr4>
49,542, // <expr3>
51,809, // <expr2>
52,677, // <cast expr>
53,702, // <unary expr>
54,386, // <expr1>
55,712, // `-
56,206, // INTLIT
57,687, // letter
58,593, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q" "s" "w" "y".."z"}
59,593, // "p"
60,593, // "v"
61,593, // "c"
62,593, // "i"
63,593, // "l"
64,593, // "o"
65,593, // "r"
66,593, // "u"
67,593, // "x"
68,593, // "b"
69,593, // "e"
70,593, // "t"
71,866, // letter128
72,538, // {199..218 231..250}
73,538, // {193..198 225..230}
75,691, // {"1".."9"}
76,172, // "0"
77,261, // digit128
78,931, // {176..185}
86,61, // "("
90,671, // "-"
  }
,
{ // state 298
30,MIN_REDUCTION+111, // `[
92,MIN_REDUCTION+111, // "["
MIN_REDUCTION+111, // (default reduction)
  }
,
{ // state 299
MIN_REDUCTION+20, // (default reduction)
  }
,
{ // state 300
2,548, // ws*
30,MIN_REDUCTION+101, // `[
79,84, // ws
80,99, // " "
81,901, // {10}
92,MIN_REDUCTION+101, // "["
MIN_REDUCTION+101, // (default reduction)
  }
,
{ // state 301
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 302
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 303
2,553, // ws*
30,MIN_REDUCTION+101, // `[
79,86, // ws
80,101, // " "
81,902, // {10}
92,MIN_REDUCTION+101, // "["
MIN_REDUCTION+101, // (default reduction)
  }
,
{ // state 304
MIN_REDUCTION+128, // (default reduction)
  }
,
{ // state 305
MIN_REDUCTION+96, // (default reduction)
  }
,
{ // state 306
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 307
MIN_REDUCTION+52, // (default reduction)
  }
,
{ // state 308
MIN_REDUCTION+129, // (default reduction)
  }
,
{ // state 309
69,840, // "e"
  }
,
{ // state 310
30,MIN_REDUCTION+100, // `[
79,24, // ws
80,99, // " "
81,901, // {10}
92,MIN_REDUCTION+100, // "["
MIN_REDUCTION+100, // (default reduction)
  }
,
{ // state 311
MIN_REDUCTION+97, // (default reduction)
  }
,
{ // state 312
7,280, // ID
17,385, // `(
20,875, // <type>
27,104, // `int
28,790, // `boolean
32,833, // <stmt>
33,670, // <assign>
35,253, // `{
38,637, // <local var decl>
39,504, // `if
40,125, // <expr>
43,880, // <expr8>
44,114, // <expr7>
45,111, // <expr6>
46,118, // <expr5>
47,958, // <expr4>
49,546, // <expr3>
51,831, // <expr2>
52,693, // <cast expr>
53,551, // <unary expr>
54,413, // <expr1>
55,720, // `-
56,215, // INTLIT
57,742, // letter
58,593, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q" "s" "w" "y".."z"}
59,593, // "p"
60,593, // "v"
61,593, // "c"
62,593, // "i"
63,593, // "l"
64,593, // "o"
65,593, // "r"
66,593, // "u"
67,593, // "x"
68,593, // "b"
69,593, // "e"
70,593, // "t"
71,697, // letter128
72,133, // {199..218 231..250}
73,133, // {193..198 225..230}
75,576, // {"1".."9"}
76,162, // "0"
77,284, // digit128
78,936, // {176..185}
82,648, // "#"
84,295, // `return
86,61, // "("
88,142, // "{"
90,671, // "-"
  }
,
{ // state 313
79,779, // ws
80,863, // " "
81,226, // {10}
MIN_REDUCTION+136, // (default reduction)
  }
,
{ // state 314
MIN_REDUCTION+129, // (default reduction)
  }
,
{ // state 315
30,MIN_REDUCTION+136, // `[
79,25, // ws
80,101, // " "
81,902, // {10}
92,MIN_REDUCTION+136, // "["
MIN_REDUCTION+136, // (default reduction)
  }
,
{ // state 316
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 317
30,MIN_REDUCTION+136, // `[
79,24, // ws
80,99, // " "
81,901, // {10}
92,MIN_REDUCTION+136, // "["
MIN_REDUCTION+136, // (default reduction)
  }
,
{ // state 318
MIN_REDUCTION+97, // (default reduction)
  }
,
{ // state 319
7,443, // ID
17,605, // `(
52,388, // <cast expr>
54,15, // <expr1>
56,211, // INTLIT
57,646, // letter
58,593, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q" "s" "w" "y".."z"}
59,593, // "p"
60,593, // "v"
61,593, // "c"
62,593, // "i"
63,593, // "l"
64,593, // "o"
65,593, // "r"
66,593, // "u"
67,593, // "x"
68,593, // "b"
69,593, // "e"
70,593, // "t"
71,845, // letter128
72,519, // {199..218 231..250}
73,519, // {193..198 225..230}
75,578, // {"1".."9"}
76,161, // "0"
77,282, // digit128
78,937, // {176..185}
86,61, // "("
  }
,
{ // state 320
MIN_REDUCTION+97, // (default reduction)
  }
,
{ // state 321
7,421, // ID
17,385, // `(
52,407, // <cast expr>
54,16, // <expr1>
56,215, // INTLIT
57,645, // letter
58,593, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q" "s" "w" "y".."z"}
59,593, // "p"
60,593, // "v"
61,593, // "c"
62,593, // "i"
63,593, // "l"
64,593, // "o"
65,593, // "r"
66,593, // "u"
67,593, // "x"
68,593, // "b"
69,593, // "e"
70,593, // "t"
71,848, // letter128
72,523, // {199..218 231..250}
73,523, // {193..198 225..230}
75,576, // {"1".."9"}
76,162, // "0"
77,284, // digit128
78,936, // {176..185}
86,61, // "("
  }
,
{ // state 322
30,MIN_REDUCTION+100, // `[
79,25, // ws
80,101, // " "
81,902, // {10}
92,MIN_REDUCTION+100, // "["
MIN_REDUCTION+100, // (default reduction)
  }
,
{ // state 323
0x80000000|1, // match move
0x80000000|877, // no-match move
0x80000000|31, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 324
MIN_REDUCTION+129, // (default reduction)
  }
,
{ // state 325
7,907, // ID
16,599, // `void
20,819, // <type>
27,104, // `int
28,790, // `boolean
57,770, // letter
58,593, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q" "s" "w" "y".."z"}
59,593, // "p"
60,593, // "v"
61,593, // "c"
62,593, // "i"
63,593, // "l"
64,593, // "o"
65,593, // "r"
66,593, // "u"
67,593, // "x"
68,593, // "b"
69,593, // "e"
70,593, // "t"
71,149, // letter128
72,906, // {199..218 231..250}
73,906, // {193..198 225..230}
82,327, // "#"
  }
,
{ // state 326
MIN_REDUCTION+128, // (default reduction)
  }
,
{ // state 327
60,558, // "v"
62,476, // "i"
68,480, // "b"
  }
,
{ // state 328
29,299, // <empty bracket pair>
30,966, // `[
41,672, // `)
87,932, // ")"
92,131, // "["
  }
,
{ // state 329
MIN_REDUCTION+97, // (default reduction)
  }
,
{ // state 330
0x80000000|1, // match move
0x80000000|886, // no-match move
0x80000000|31, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 331
0x80000000|1, // match move
0x80000000|884, // no-match move
0x80000000|31, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 332
57,478, // letter
58,48, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q" "s" "w" "y".."z"}
59,48, // "p"
60,48, // "v"
61,48, // "c"
62,48, // "i"
63,48, // "l"
64,48, // "o"
65,48, // "r"
66,48, // "u"
67,48, // "x"
68,48, // "b"
69,48, // "e"
70,48, // "t"
71,354, // letter128
72,133, // {199..218 231..250}
73,133, // {193..198 225..230}
74,195, // digit
75,174, // {"1".."9"}
76,174, // "0"
77,908, // digit128
78,124, // {176..185}
97,592, // $$3
102,924, // idChar
103,910, // "_"
104,155, // idChar128
105,389, // {223}
  }
,
{ // state 333
30,MIN_REDUCTION+136, // `[
79,5, // ws
80,93, // " "
81,892, // {10}
92,MIN_REDUCTION+136, // "["
MIN_REDUCTION+136, // (default reduction)
  }
,
{ // state 334
2,52, // ws*
79,433, // ws
80,872, // " "
81,168, // {10}
MIN_REDUCTION+137, // (default reduction)
  }
,
{ // state 335
110,MIN_REDUCTION+128, // $NT
MIN_REDUCTION+128, // (default reduction)
  }
,
{ // state 336
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 337
2,4, // ws*
  }
,
{ // state 338
2,491, // ws*
30,MIN_REDUCTION+141, // `[
79,86, // ws
80,101, // " "
81,902, // {10}
92,MIN_REDUCTION+141, // "["
MIN_REDUCTION+141, // (default reduction)
  }
,
{ // state 339
MIN_REDUCTION+132, // (default reduction)
  }
,
{ // state 340
2,494, // ws*
30,MIN_REDUCTION+141, // `[
79,84, // ws
80,99, // " "
81,901, // {10}
92,MIN_REDUCTION+141, // "["
MIN_REDUCTION+141, // (default reduction)
  }
,
{ // state 341
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 342
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 343
2,804, // ws*
79,92, // ws
80,490, // " "
81,822, // {10}
MIN_REDUCTION+75, // (default reduction)
  }
,
{ // state 344
2,513, // ws*
30,MIN_REDUCTION+141, // `[
79,64, // ws
80,93, // " "
81,892, // {10}
92,MIN_REDUCTION+141, // "["
MIN_REDUCTION+141, // (default reduction)
  }
,
{ // state 345
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 346
110,MIN_REDUCTION+129, // $NT
MIN_REDUCTION+129, // (default reduction)
  }
,
{ // state 347
2,947, // ws*
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 348
7,437, // ID
17,575, // `(
52,381, // <cast expr>
54,110, // <expr1>
56,206, // INTLIT
57,687, // letter
58,593, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q" "s" "w" "y".."z"}
59,593, // "p"
60,593, // "v"
61,593, // "c"
62,593, // "i"
63,593, // "l"
64,593, // "o"
65,593, // "r"
66,593, // "u"
67,593, // "x"
68,593, // "b"
69,593, // "e"
70,593, // "t"
71,866, // letter128
72,538, // {199..218 231..250}
73,538, // {193..198 225..230}
75,691, // {"1".."9"}
76,172, // "0"
77,261, // digit128
78,931, // {176..185}
86,61, // "("
  }
,
{ // state 349
30,MIN_REDUCTION+100, // `[
79,5, // ws
80,93, // " "
81,892, // {10}
92,MIN_REDUCTION+100, // "["
MIN_REDUCTION+100, // (default reduction)
  }
,
{ // state 350
2,41, // ws*
  }
,
{ // state 351
2,38, // ws*
  }
,
{ // state 352
MIN_REDUCTION+94, // (default reduction)
  }
,
{ // state 353
MIN_REDUCTION+5, // (default reduction)
  }
,
{ // state 354
0x80000000|453, // match move
0x80000000|752, // no-match move
0x80000000|31, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 355
MIN_REDUCTION+21, // (default reduction)
  }
,
{ // state 356
MIN_REDUCTION+118, // (default reduction)
  }
,
{ // state 357
2,494, // ws*
  }
,
{ // state 358
MIN_REDUCTION+118, // (default reduction)
  }
,
{ // state 359
7,746, // ID
20,328, // <type>
27,685, // `int
28,713, // `boolean
57,723, // letter
58,593, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q" "s" "w" "y".."z"}
59,593, // "p"
60,593, // "v"
61,593, // "c"
62,593, // "i"
63,593, // "l"
64,593, // "o"
65,593, // "r"
66,593, // "u"
67,593, // "x"
68,593, // "b"
69,593, // "e"
70,593, // "t"
71,938, // letter128
72,763, // {199..218 231..250}
73,763, // {193..198 225..230}
82,371, // "#"
  }
,
{ // state 360
2,491, // ws*
  }
,
{ // state 361
MIN_REDUCTION+128, // (default reduction)
  }
,
{ // state 362
MIN_REDUCTION+129, // (default reduction)
  }
,
{ // state 363
30,MIN_REDUCTION+46, // `[
92,MIN_REDUCTION+46, // "["
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 364
MIN_REDUCTION+128, // (default reduction)
  }
,
{ // state 365
30,MIN_REDUCTION+46, // `[
92,MIN_REDUCTION+46, // "["
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 366
2,541, // ws*
30,MIN_REDUCTION+141, // `[
79,396, // ws
80,126, // " "
81,914, // {10}
92,MIN_REDUCTION+141, // "["
MIN_REDUCTION+141, // (default reduction)
  }
,
{ // state 367
0x80000000|415, // match move
0x80000000|344, // no-match move
0x80000000|31, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 368
2,313, // ws*
79,496, // ws
80,863, // " "
81,226, // {10}
MIN_REDUCTION+137, // (default reduction)
  }
,
{ // state 369
MIN_REDUCTION+128, // (default reduction)
  }
,
{ // state 370
MIN_REDUCTION+128, // (default reduction)
  }
,
{ // state 371
62,32, // "i"
68,19, // "b"
  }
,
{ // state 372
79,760, // ws
80,531, // " "
81,781, // {10}
MIN_REDUCTION+94, // (default reduction)
  }
,
{ // state 373
2,541, // ws*
  }
,
{ // state 374
MIN_REDUCTION+128, // (default reduction)
  }
,
{ // state 375
0x80000000|1, // match move
0x80000000|70, // no-match move
0x80000000|31, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 376
MIN_REDUCTION+128, // (default reduction)
  }
,
{ // state 377
0x80000000|360, // match move
0x80000000|338, // no-match move
0x80000000|31, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 378
30,MIN_REDUCTION+46, // `[
92,MIN_REDUCTION+46, // "["
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 379
MIN_REDUCTION+53, // (default reduction)
  }
,
{ // state 380
MIN_REDUCTION+128, // (default reduction)
  }
,
{ // state 381
MIN_REDUCTION+41, // (default reduction)
  }
,
{ // state 382
31,383, // `]
93,587, // "]"
  }
,
{ // state 383
0x80000000|1, // match move
0x80000000|378, // no-match move
0x80000000|31, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 384
17,56, // `(
86,525, // "("
  }
,
{ // state 385
7,746, // ID
20,680, // <type>
27,685, // `int
28,713, // `boolean
57,723, // letter
58,593, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q" "s" "w" "y".."z"}
59,593, // "p"
60,593, // "v"
61,593, // "c"
62,593, // "i"
63,593, // "l"
64,593, // "o"
65,593, // "r"
66,593, // "u"
67,593, // "x"
68,593, // "b"
69,593, // "e"
70,593, // "t"
71,938, // letter128
72,763, // {199..218 231..250}
73,763, // {193..198 225..230}
82,371, // "#"
  }
,
{ // state 386
0x80000000|1, // match move
0x80000000|49, // no-match move
0x80000000|31, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 387
31,601, // `]
93,570, // "]"
  }
,
{ // state 388
MIN_REDUCTION+41, // (default reduction)
  }
,
{ // state 389
0x80000000|247, // match move
0x80000000|212, // no-match move
0x80000000|31, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 390
31,604, // `]
93,571, // "]"
  }
,
{ // state 391
79,369, // ws
80,266, // " "
81,187, // {10}
MIN_REDUCTION+136, // (default reduction)
  }
,
{ // state 392
79,911, // ws
80,758, // " "
81,860, // {10}
MIN_REDUCTION+72, // (default reduction)
  }
,
{ // state 393
2,245, // ws*
79,579, // ws
80,750, // " "
81,3, // {10}
MIN_REDUCTION+79, // (default reduction)
  }
,
{ // state 394
MIN_REDUCTION+29, // (default reduction)
  }
,
{ // state 395
79,515, // ws
80,482, // " "
81,856, // {10}
MIN_REDUCTION+94, // (default reduction)
  }
,
{ // state 396
0x80000000|1, // match move
0x80000000|909, // no-match move
0x80000000|31, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 397
79,518, // ws
80,481, // " "
81,855, // {10}
MIN_REDUCTION+94, // (default reduction)
  }
,
{ // state 398
79,912, // ws
80,762, // " "
81,859, // {10}
MIN_REDUCTION+72, // (default reduction)
  }
,
{ // state 399
58,796, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q" "s" "w" "y".."z"}
59,796, // "p"
60,796, // "v"
61,796, // "c"
62,796, // "i"
63,796, // "l"
64,796, // "o"
65,796, // "r"
66,796, // "u"
67,796, // "x"
68,796, // "b"
69,796, // "e"
70,796, // "t"
73,176, // {193..198 225..230}
75,796, // {"1".."9"}
76,796, // "0"
78,176, // {176..185}
101,595, // $$5
106,554, // hexDigit
107,445, // hexDigit128
  }
,
{ // state 400
7,437, // ID
17,575, // `(
40,768, // <expr>
43,897, // <expr8>
44,100, // <expr7>
45,94, // <expr6>
46,102, // <expr5>
47,878, // <expr4>
49,542, // <expr3>
51,809, // <expr2>
52,677, // <cast expr>
53,702, // <unary expr>
54,386, // <expr1>
55,712, // `-
56,206, // INTLIT
57,687, // letter
58,593, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q" "s" "w" "y".."z"}
59,593, // "p"
60,593, // "v"
61,593, // "c"
62,593, // "i"
63,593, // "l"
64,593, // "o"
65,593, // "r"
66,593, // "u"
67,593, // "x"
68,593, // "b"
69,593, // "e"
70,593, // "t"
71,866, // letter128
72,538, // {199..218 231..250}
73,538, // {193..198 225..230}
75,691, // {"1".."9"}
76,172, // "0"
77,261, // digit128
78,931, // {176..185}
86,61, // "("
90,671, // "-"
  }
,
{ // state 401
58,796, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q" "s" "w" "y".."z"}
59,796, // "p"
60,796, // "v"
61,796, // "c"
62,796, // "i"
63,796, // "l"
64,796, // "o"
65,796, // "r"
66,796, // "u"
67,796, // "x"
68,796, // "b"
69,796, // "e"
70,796, // "t"
73,177, // {193..198 225..230}
75,796, // {"1".."9"}
76,796, // "0"
78,177, // {176..185}
101,588, // $$5
106,554, // hexDigit
107,377, // hexDigit128
  }
,
{ // state 402
MIN_REDUCTION+128, // (default reduction)
  }
,
{ // state 403
58,796, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q" "s" "w" "y".."z"}
59,796, // "p"
60,796, // "v"
61,796, // "c"
62,796, // "i"
63,796, // "l"
64,796, // "o"
65,796, // "r"
66,796, // "u"
67,796, // "x"
68,796, // "b"
69,796, // "e"
70,796, // "t"
73,181, // {193..198 225..230}
75,796, // {"1".."9"}
76,796, // "0"
78,181, // {176..185}
101,602, // $$5
106,554, // hexDigit
107,367, // hexDigit128
  }
,
{ // state 404
MIN_REDUCTION+128, // (default reduction)
  }
,
{ // state 405
79,455, // ws
80,510, // " "
81,281, // {10}
MIN_REDUCTION+74, // (default reduction)
  }
,
{ // state 406
79,404, // ws
80,260, // " "
81,185, // {10}
MIN_REDUCTION+136, // (default reduction)
  }
,
{ // state 407
MIN_REDUCTION+41, // (default reduction)
  }
,
{ // state 408
MIN_REDUCTION+26, // (default reduction)
  }
,
{ // state 409
MIN_REDUCTION+53, // (default reduction)
  }
,
{ // state 410
31,573, // `]
93,613, // "]"
  }
,
{ // state 411
0x80000000|1, // match move
0x80000000|28, // no-match move
0x80000000|31, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 412
30,MIN_REDUCTION+46, // `[
92,MIN_REDUCTION+46, // "["
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 413
0x80000000|1, // match move
0x80000000|40, // no-match move
0x80000000|31, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 414
79,361, // ws
80,244, // " "
81,178, // {10}
MIN_REDUCTION+64, // (default reduction)
  }
,
{ // state 415
2,513, // ws*
  }
,
{ // state 416
50,98, // `*
85,222, // "*"
MIN_REDUCTION+35, // (default reduction)
  }
,
{ // state 417
7,951, // ID
29,591, // <empty bracket pair>
30,36, // `[
57,772, // letter
58,593, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q" "s" "w" "y".."z"}
59,593, // "p"
60,593, // "v"
61,593, // "c"
62,593, // "i"
63,593, // "l"
64,593, // "o"
65,593, // "r"
66,593, // "u"
67,593, // "x"
68,593, // "b"
69,593, // "e"
70,593, // "t"
71,684, // letter128
72,621, // {199..218 231..250}
73,621, // {193..198 225..230}
92,131, // "["
  }
,
{ // state 418
7,950, // ID
29,591, // <empty bracket pair>
30,36, // `[
57,965, // letter
58,593, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q" "s" "w" "y".."z"}
59,593, // "p"
60,593, // "v"
61,593, // "c"
62,593, // "i"
63,593, // "l"
64,593, // "o"
65,593, // "r"
66,593, // "u"
67,593, // "x"
68,593, // "b"
69,593, // "e"
70,593, // "t"
71,678, // letter128
72,622, // {199..218 231..250}
73,622, // {193..198 225..230}
92,131, // "["
  }
,
{ // state 419
109,MIN_REDUCTION+0, // $
  }
,
{ // state 420
30,MIN_REDUCTION+45, // `[
92,MIN_REDUCTION+45, // "["
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 421
0x80000000|1, // match move
0x80000000|469, // no-match move
0x80000000|31, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 422
0x80000000|373, // match move
0x80000000|366, // no-match move
0x80000000|31, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 423
MIN_REDUCTION+129, // (default reduction)
  }
,
{ // state 424
2,837, // ws*
79,496, // ws
80,863, // " "
81,226, // {10}
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 425
MIN_REDUCTION+37, // (default reduction)
  }
,
{ // state 426
2,590, // ws*
  }
,
{ // state 427
63,512, // "l"
  }
,
{ // state 428
MIN_REDUCTION+41, // (default reduction)
  }
,
{ // state 429
0x80000000|426, // match move
0x80000000|263, // no-match move
0x80000000|31, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 430
2,487, // ws*
30,MIN_REDUCTION+101, // `[
79,64, // ws
80,93, // " "
81,892, // {10}
92,MIN_REDUCTION+101, // "["
MIN_REDUCTION+101, // (default reduction)
  }
,
{ // state 431
19,903, // $$1
41,42, // `)
87,483, // ")"
  }
,
{ // state 432
MIN_REDUCTION+135, // (default reduction)
  }
,
{ // state 433
MIN_REDUCTION+129, // (default reduction)
  }
,
{ // state 434
MIN_REDUCTION+128, // (default reduction)
  }
,
{ // state 435
2,553, // ws*
  }
,
{ // state 436
2,548, // ws*
  }
,
{ // state 437
0x80000000|1, // match move
0x80000000|454, // no-match move
0x80000000|31, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 438
2,487, // ws*
  }
,
{ // state 439
MIN_REDUCTION+53, // (default reduction)
  }
,
{ // state 440
30,MIN_REDUCTION+111, // `[
92,MIN_REDUCTION+111, // "["
MIN_REDUCTION+111, // (default reduction)
  }
,
{ // state 441
30,MIN_REDUCTION+88, // `[
79,5, // ws
80,93, // " "
81,892, // {10}
92,MIN_REDUCTION+88, // "["
MIN_REDUCTION+88, // (default reduction)
  }
,
{ // state 442
58,796, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q" "s" "w" "y".."z"}
59,796, // "p"
60,796, // "v"
61,796, // "c"
62,796, // "i"
63,796, // "l"
64,796, // "o"
65,796, // "r"
66,796, // "u"
67,796, // "x"
68,796, // "b"
69,796, // "e"
70,796, // "t"
73,51, // {193..198 225..230}
75,796, // {"1".."9"}
76,796, // "0"
78,51, // {176..185}
101,568, // $$5
106,554, // hexDigit
107,422, // hexDigit128
  }
,
{ // state 443
0x80000000|1, // match move
0x80000000|471, // no-match move
0x80000000|31, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 444
MIN_REDUCTION+96, // (default reduction)
  }
,
{ // state 445
0x80000000|357, // match move
0x80000000|340, // no-match move
0x80000000|31, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 446
MIN_REDUCTION+96, // (default reduction)
  }
,
{ // state 447
MIN_REDUCTION+97, // (default reduction)
  }
,
{ // state 448
2,806, // ws*
79,346, // ws
80,727, // " "
81,147, // {10}
110,MIN_REDUCTION+89, // $NT
  }
,
{ // state 449
MIN_REDUCTION+97, // (default reduction)
  }
,
{ // state 450
MIN_REDUCTION+97, // (default reduction)
  }
,
{ // state 451
MIN_REDUCTION+97, // (default reduction)
  }
,
{ // state 452
MIN_REDUCTION+97, // (default reduction)
  }
,
{ // state 453
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 454
30,MIN_REDUCTION+45, // `[
92,MIN_REDUCTION+45, // "["
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 455
MIN_REDUCTION+128, // (default reduction)
  }
,
{ // state 456
MIN_REDUCTION+53, // (default reduction)
  }
,
{ // state 457
79,728, // ws
80,468, // " "
81,20, // {10}
MIN_REDUCTION+94, // (default reduction)
  }
,
{ // state 458
79,760, // ws
80,531, // " "
81,781, // {10}
MIN_REDUCTION+54, // (default reduction)
  }
,
{ // state 459
79,729, // ws
80,466, // " "
81,21, // {10}
MIN_REDUCTION+94, // (default reduction)
  }
,
{ // state 460
2,53, // ws*
79,278, // ws
80,225, // " "
81,847, // {10}
MIN_REDUCTION+79, // (default reduction)
  }
,
{ // state 461
79,43, // ws
80,926, // " "
81,619, // {10}
MIN_REDUCTION+56, // (default reduction)
  }
,
{ // state 462
34,726, // `;
95,657, // ";"
  }
,
{ // state 463
MIN_REDUCTION+52, // (default reduction)
  }
,
{ // state 464
30,MIN_REDUCTION+88, // `[
79,25, // ws
80,101, // " "
81,902, // {10}
92,MIN_REDUCTION+88, // "["
MIN_REDUCTION+88, // (default reduction)
  }
,
{ // state 465
MIN_REDUCTION+24, // (default reduction)
  }
,
{ // state 466
MIN_REDUCTION+52, // (default reduction)
  }
,
{ // state 467
79,760, // ws
80,531, // " "
81,781, // {10}
MIN_REDUCTION+62, // (default reduction)
  }
,
{ // state 468
MIN_REDUCTION+52, // (default reduction)
  }
,
{ // state 469
30,MIN_REDUCTION+45, // `[
92,MIN_REDUCTION+45, // "["
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 470
30,MIN_REDUCTION+88, // `[
79,24, // ws
80,99, // " "
81,901, // {10}
92,MIN_REDUCTION+88, // "["
MIN_REDUCTION+88, // (default reduction)
  }
,
{ // state 471
30,MIN_REDUCTION+45, // `[
92,MIN_REDUCTION+45, // "["
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 472
MIN_REDUCTION+37, // (default reduction)
  }
,
{ // state 473
MIN_REDUCTION+37, // (default reduction)
  }
,
{ // state 474
MIN_REDUCTION+24, // (default reduction)
  }
,
{ // state 475
79,434, // ws
80,296, // " "
81,214, // {10}
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 476
70,545, // "t"
  }
,
{ // state 477
0x80000000|641, // match move
0x80000000|8, // no-match move
0x80000000|31, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 478
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 479
MIN_REDUCTION+37, // (default reduction)
  }
,
{ // state 480
64,561, // "o"
  }
,
{ // state 481
MIN_REDUCTION+52, // (default reduction)
  }
,
{ // state 482
MIN_REDUCTION+52, // (default reduction)
  }
,
{ // state 483
2,650, // ws*
79,258, // ws
80,307, // " "
81,216, // {10}
MIN_REDUCTION+75, // (default reduction)
  }
,
{ // state 484
30,MIN_REDUCTION+99, // `[
92,MIN_REDUCTION+99, // "["
MIN_REDUCTION+99, // (default reduction)
  }
,
{ // state 485
MIN_REDUCTION+12, // (default reduction)
  }
,
{ // state 486
30,MIN_REDUCTION+99, // `[
92,MIN_REDUCTION+99, // "["
MIN_REDUCTION+99, // (default reduction)
  }
,
{ // state 487
0x80000000|1, // match move
0x80000000|349, // no-match move
0x80000000|31, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 488
30,MIN_REDUCTION+107, // `[
92,MIN_REDUCTION+107, // "["
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 489
2,649, // ws*
30,MIN_REDUCTION+137, // `[
79,396, // ws
80,126, // " "
81,914, // {10}
92,MIN_REDUCTION+137, // "["
MIN_REDUCTION+137, // (default reduction)
  }
,
{ // state 490
MIN_REDUCTION+52, // (default reduction)
  }
,
{ // state 491
0x80000000|1, // match move
0x80000000|552, // no-match move
0x80000000|31, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 492
0x80000000|1, // match move
0x80000000|209, // no-match move
0x80000000|31, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 493
MIN_REDUCTION+129, // (default reduction)
  }
,
{ // state 494
0x80000000|1, // match move
0x80000000|547, // no-match move
0x80000000|31, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 495
0x80000000|1, // match move
0x80000000|205, // no-match move
0x80000000|31, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 496
MIN_REDUCTION+129, // (default reduction)
  }
,
{ // state 497
0x80000000|1, // match move
0x80000000|277, // no-match move
0x80000000|31, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 498
50,62, // `*
85,222, // "*"
MIN_REDUCTION+36, // (default reduction)
  }
,
{ // state 499
17,647, // `(
86,529, // "("
  }
,
{ // state 500
7,280, // ID
17,385, // `(
20,875, // <type>
27,104, // `int
28,790, // `boolean
32,612, // <stmt>
33,706, // <assign>
35,34, // `{
37,836, // `}
38,270, // <local var decl>
39,150, // `if
40,125, // <expr>
43,880, // <expr8>
44,114, // <expr7>
45,111, // <expr6>
46,118, // <expr5>
47,958, // <expr4>
49,546, // <expr3>
51,831, // <expr2>
52,693, // <cast expr>
53,551, // <unary expr>
54,413, // <expr1>
55,720, // `-
56,215, // INTLIT
57,742, // letter
58,593, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q" "s" "w" "y".."z"}
59,593, // "p"
60,593, // "v"
61,593, // "c"
62,593, // "i"
63,593, // "l"
64,593, // "o"
65,593, // "r"
66,593, // "u"
67,593, // "x"
68,593, // "b"
69,593, // "e"
70,593, // "t"
71,697, // letter128
72,133, // {199..218 231..250}
73,133, // {193..198 225..230}
75,576, // {"1".."9"}
76,162, // "0"
77,284, // digit128
78,936, // {176..185}
82,77, // "#"
86,61, // "("
88,142, // "{"
89,460, // "}"
90,671, // "-"
  }
,
{ // state 501
30,MIN_REDUCTION+88, // `[
79,35, // ws
80,126, // " "
81,914, // {10}
92,MIN_REDUCTION+88, // "["
MIN_REDUCTION+88, // (default reduction)
  }
,
{ // state 502
30,MIN_REDUCTION+99, // `[
92,MIN_REDUCTION+99, // "["
MIN_REDUCTION+99, // (default reduction)
  }
,
{ // state 503
0x80000000|243, // match move
0x80000000|103, // no-match move
0x80000000|31, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 504
17,297, // `(
86,861, // "("
  }
,
{ // state 505
30,MIN_REDUCTION+107, // `[
92,MIN_REDUCTION+107, // "["
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 506
2,711, // ws*
30,MIN_REDUCTION+95, // `[
79,86, // ws
80,101, // " "
81,902, // {10}
92,MIN_REDUCTION+95, // "["
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 507
30,MIN_REDUCTION+107, // `[
92,MIN_REDUCTION+107, // "["
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 508
MIN_REDUCTION+52, // (default reduction)
  }
,
{ // state 509
2,714, // ws*
30,MIN_REDUCTION+95, // `[
79,84, // ws
80,99, // " "
81,901, // {10}
92,MIN_REDUCTION+95, // "["
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 510
MIN_REDUCTION+52, // (default reduction)
  }
,
{ // state 511
30,MIN_REDUCTION+140, // `[
79,5, // ws
80,93, // " "
81,892, // {10}
92,MIN_REDUCTION+140, // "["
MIN_REDUCTION+140, // (default reduction)
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
{ // state 512
2,461, // ws*
79,134, // ws
80,926, // " "
81,619, // {10}
MIN_REDUCTION+57, // (default reduction)
  }
,
{ // state 513
0x80000000|1, // match move
0x80000000|511, // no-match move
0x80000000|31, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 514
110,MIN_REDUCTION+21, // $NT
  }
,
{ // state 515
MIN_REDUCTION+128, // (default reduction)
  }
,
{ // state 516
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 517
0x80000000|255, // match move
0x80000000|891, // no-match move
0x80000000|31, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 518
MIN_REDUCTION+128, // (default reduction)
  }
,
{ // state 519
0x80000000|243, // match move
0x80000000|868, // no-match move
0x80000000|31, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 520
37,432, // `}
89,890, // "}"
  }
,
{ // state 521
MIN_REDUCTION+40, // (default reduction)
  }
,
{ // state 522
23,13, // <extra param>
24,839, // `,
94,775, // ","
MIN_REDUCTION+15, // (default reduction)
  }
,
{ // state 523
0x80000000|243, // match move
0x80000000|129, // no-match move
0x80000000|31, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 524
23,14, // <extra param>
24,838, // `,
94,775, // ","
MIN_REDUCTION+15, // (default reduction)
  }
,
{ // state 525
2,398, // ws*
79,159, // ws
80,762, // " "
81,859, // {10}
MIN_REDUCTION+73, // (default reduction)
  }
,
{ // state 526
MIN_REDUCTION+96, // (default reduction)
  }
,
{ // state 527
MIN_REDUCTION+53, // (default reduction)
  }
,
{ // state 528
MIN_REDUCTION+96, // (default reduction)
  }
,
{ // state 529
2,392, // ws*
79,160, // ws
80,758, // " "
81,860, // {10}
MIN_REDUCTION+73, // (default reduction)
  }
,
{ // state 530
30,MIN_REDUCTION+52, // `[
92,MIN_REDUCTION+52, // "["
MIN_REDUCTION+52, // (default reduction)
  }
,
{ // state 531
MIN_REDUCTION+52, // (default reduction)
  }
,
{ // state 532
0x80000000|1, // match move
0x80000000|766, // no-match move
0x80000000|31, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 533
30,MIN_REDUCTION+108, // `[
92,MIN_REDUCTION+108, // "["
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 534
30,MIN_REDUCTION+107, // `[
92,MIN_REDUCTION+107, // "["
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 535
MIN_REDUCTION+21, // (default reduction)
  }
,
{ // state 536
7,280, // ID
17,385, // `(
20,875, // <type>
27,104, // `int
28,790, // `boolean
32,612, // <stmt>
33,706, // <assign>
35,34, // `{
37,339, // `}
38,270, // <local var decl>
39,150, // `if
40,125, // <expr>
43,880, // <expr8>
44,114, // <expr7>
45,111, // <expr6>
46,118, // <expr5>
47,958, // <expr4>
49,546, // <expr3>
51,831, // <expr2>
52,693, // <cast expr>
53,551, // <unary expr>
54,413, // <expr1>
55,720, // `-
56,215, // INTLIT
57,742, // letter
58,593, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q" "s" "w" "y".."z"}
59,593, // "p"
60,593, // "v"
61,593, // "c"
62,593, // "i"
63,593, // "l"
64,593, // "o"
65,593, // "r"
66,593, // "u"
67,593, // "x"
68,593, // "b"
69,593, // "e"
70,593, // "t"
71,697, // letter128
72,133, // {199..218 231..250}
73,133, // {193..198 225..230}
75,576, // {"1".."9"}
76,162, // "0"
77,284, // digit128
78,936, // {176..185}
82,77, // "#"
86,61, // "("
88,142, // "{"
89,890, // "}"
90,671, // "-"
  }
,
{ // state 537
MIN_REDUCTION+14, // (default reduction)
  }
,
{ // state 538
0x80000000|243, // match move
0x80000000|882, // no-match move
0x80000000|31, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 539
MIN_REDUCTION+14, // (default reduction)
  }
,
{ // state 540
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 541
0x80000000|1, // match move
0x80000000|589, // no-match move
0x80000000|31, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 542
50,98, // `*
85,222, // "*"
MIN_REDUCTION+36, // (default reduction)
  }
,
{ // state 543
2,814, // ws*
30,MIN_REDUCTION+95, // `[
79,64, // ws
80,93, // " "
81,892, // {10}
92,MIN_REDUCTION+95, // "["
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 544
MIN_REDUCTION+129, // (default reduction)
  }
,
{ // state 545
2,467, // ws*
79,862, // ws
80,531, // " "
81,781, // {10}
MIN_REDUCTION+63, // (default reduction)
  }
,
{ // state 546
50,78, // `*
85,222, // "*"
MIN_REDUCTION+36, // (default reduction)
  }
,
{ // state 547
30,MIN_REDUCTION+140, // `[
79,24, // ws
80,99, // " "
81,901, // {10}
92,MIN_REDUCTION+140, // "["
MIN_REDUCTION+140, // (default reduction)
  }
,
{ // state 548
0x80000000|1, // match move
0x80000000|310, // no-match move
0x80000000|31, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 549
MIN_REDUCTION+27, // (default reduction)
  }
,
{ // state 550
MIN_REDUCTION+40, // (default reduction)
  }
,
{ // state 551
MIN_REDUCTION+40, // (default reduction)
  }
,
{ // state 552
30,MIN_REDUCTION+140, // `[
79,25, // ws
80,101, // " "
81,902, // {10}
92,MIN_REDUCTION+140, // "["
MIN_REDUCTION+140, // (default reduction)
  }
,
{ // state 553
0x80000000|1, // match move
0x80000000|322, // no-match move
0x80000000|31, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 554
MIN_REDUCTION+120, // (default reduction)
  }
,
{ // state 555
7,907, // ID
12,224, // <decl in class>
13,707, // <field decl>
14,151, // <method decl>
15,325, // `public
20,871, // <type>
27,104, // `int
28,790, // `boolean
37,682, // `}
57,770, // letter
58,593, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q" "s" "w" "y".."z"}
59,593, // "p"
60,593, // "v"
61,593, // "c"
62,593, // "i"
63,593, // "l"
64,593, // "o"
65,593, // "r"
66,593, // "u"
67,593, // "x"
68,593, // "b"
69,593, // "e"
70,593, // "t"
71,149, // letter128
72,906, // {199..218 231..250}
73,906, // {193..198 225..230}
82,136, // "#"
89,767, // "}"
108,18, // <decl in class>*
  }
,
{ // state 556
0x80000000|1, // match move
0x80000000|741, // no-match move
0x80000000|31, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 557
0x80000000|1, // match move
0x80000000|738, // no-match move
0x80000000|31, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 558
64,82, // "o"
  }
,
{ // state 559
30,MIN_REDUCTION+99, // `[
92,MIN_REDUCTION+99, // "["
MIN_REDUCTION+99, // (default reduction)
  }
,
{ // state 560
MIN_REDUCTION+129, // (default reduction)
  }
,
{ // state 561
2,458, // ws*
79,862, // ws
80,531, // " "
81,781, // {10}
MIN_REDUCTION+55, // (default reduction)
  }
,
{ // state 562
30,MIN_REDUCTION+128, // `[
92,MIN_REDUCTION+128, // "["
MIN_REDUCTION+128, // (default reduction)
  }
,
{ // state 563
62,476, // "i"
68,480, // "b"
  }
,
{ // state 564
0x80000000|336, // match move
0x80000000|943, // no-match move
0x80000000|31, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 565
50,76, // `*
85,222, // "*"
MIN_REDUCTION+36, // (default reduction)
  }
,
{ // state 566
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 567
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 568
0x80000000|1, // match move
0x80000000|864, // no-match move
0x80000000|31, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 569
0x80000000|336, // match move
0x80000000|921, // no-match move
0x80000000|31, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 570
0x80000000|350, // match move
0x80000000|237, // no-match move
0x80000000|31, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 571
0x80000000|351, // match move
0x80000000|234, // no-match move
0x80000000|31, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 572
MIN_REDUCTION+128, // (default reduction)
  }
,
{ // state 573
0x80000000|1, // match move
0x80000000|412, // no-match move
0x80000000|31, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 574
0x80000000|1, // match move
0x80000000|730, // no-match move
0x80000000|31, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 575
7,746, // ID
20,665, // <type>
27,685, // `int
28,713, // `boolean
57,723, // letter
58,593, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q" "s" "w" "y".."z"}
59,593, // "p"
60,593, // "v"
61,593, // "c"
62,593, // "i"
63,593, // "l"
64,593, // "o"
65,593, // "r"
66,593, // "u"
67,593, // "x"
68,593, // "b"
69,593, // "e"
70,593, // "t"
71,938, // letter128
72,763, // {199..218 231..250}
73,763, // {193..198 225..230}
82,371, // "#"
  }
,
{ // state 576
74,957, // digit
75,816, // {"1".."9"}
76,816, // "0"
77,927, // digit128
78,936, // {176..185}
98,811, // digit*
99,290, // $$4
  }
,
{ // state 577
2,596, // ws*
30,MIN_REDUCTION+137, // `[
79,64, // ws
80,93, // " "
81,892, // {10}
92,MIN_REDUCTION+137, // "["
MIN_REDUCTION+137, // (default reduction)
  }
,
{ // state 578
74,957, // digit
75,816, // {"1".."9"}
76,816, // "0"
77,930, // digit128
78,937, // {176..185}
98,813, // digit*
99,286, // $$4
  }
,
{ // state 579
MIN_REDUCTION+129, // (default reduction)
  }
,
{ // state 580
0x80000000|764, // match move
0x80000000|184, // no-match move
0x80000000|31, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 581
0x80000000|336, // match move
0x80000000|900, // no-match move
0x80000000|31, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 582
MIN_REDUCTION+128, // (default reduction)
  }
,
{ // state 583
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 584
0x80000000|764, // match move
0x80000000|186, // no-match move
0x80000000|31, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 585
0x80000000|336, // match move
0x80000000|904, // no-match move
0x80000000|31, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 586
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 587
0x80000000|337, // match move
0x80000000|217, // no-match move
0x80000000|31, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 588
0x80000000|1, // match move
0x80000000|849, // no-match move
0x80000000|31, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 589
30,MIN_REDUCTION+140, // `[
79,35, // ws
80,126, // " "
81,914, // {10}
92,MIN_REDUCTION+140, // "["
MIN_REDUCTION+140, // (default reduction)
  }
,
{ // state 590
0x80000000|1, // match move
0x80000000|269, // no-match move
0x80000000|31, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 591
MIN_REDUCTION+20, // (default reduction)
  }
,
{ // state 592
0x80000000|898, // match move
0x80000000|122, // no-match move
0x80000000|31, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 593
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 594
79,213, // ws
80,922, // " "
81,409, // {10}
MIN_REDUCTION+78, // (default reduction)
  }
,
{ // state 595
0x80000000|1, // match move
0x80000000|850, // no-match move
0x80000000|31, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 596
0x80000000|1, // match move
0x80000000|333, // no-match move
0x80000000|31, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 597
0x80000000|764, // match move
0x80000000|220, // no-match move
0x80000000|31, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 598
2,81, // ws*
79,275, // ws
80,244, // " "
81,178, // {10}
MIN_REDUCTION+137, // (default reduction)
  }
,
{ // state 599
7,384, // ID
57,152, // letter
58,593, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q" "s" "w" "y".."z"}
59,593, // "p"
60,593, // "v"
61,593, // "c"
62,593, // "i"
63,593, // "l"
64,593, // "o"
65,593, // "r"
66,593, // "u"
67,593, // "x"
68,593, // "b"
69,593, // "e"
70,593, // "t"
71,616, // letter128
72,771, // {199..218 231..250}
73,771, // {193..198 225..230}
  }
,
{ // state 600
79,235, // ws
80,844, // " "
81,527, // {10}
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 601
0x80000000|1, // match move
0x80000000|365, // no-match move
0x80000000|31, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 602
0x80000000|1, // match move
0x80000000|843, // no-match move
0x80000000|31, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 603
MIN_REDUCTION+129, // (default reduction)
  }
,
{ // state 604
0x80000000|1, // match move
0x80000000|363, // no-match move
0x80000000|31, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 605
7,746, // ID
20,683, // <type>
27,685, // `int
28,713, // `boolean
57,723, // letter
58,593, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q" "s" "w" "y".."z"}
59,593, // "p"
60,593, // "v"
61,593, // "c"
62,593, // "i"
63,593, // "l"
64,593, // "o"
65,593, // "r"
66,593, // "u"
67,593, // "x"
68,593, // "b"
69,593, // "e"
70,593, // "t"
71,938, // letter128
72,763, // {199..218 231..250}
73,763, // {193..198 225..230}
82,371, // "#"
  }
,
{ // state 606
MIN_REDUCTION+129, // (default reduction)
  }
,
{ // state 607
MIN_REDUCTION+52, // (default reduction)
  }
,
{ // state 608
8,156, // <class decl>
9,107, // `class
82,659, // "#"
MIN_REDUCTION+3, // (default reduction)
  }
,
{ // state 609
2,391, // ws*
79,289, // ws
80,266, // " "
81,187, // {10}
MIN_REDUCTION+137, // (default reduction)
  }
,
{ // state 610
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 611
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 612
MIN_REDUCTION+122, // (default reduction)
  }
,
{ // state 613
0x80000000|132, // match move
0x80000000|203, // no-match move
0x80000000|31, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 614
2,688, // ws*
30,MIN_REDUCTION+137, // `[
79,84, // ws
80,99, // " "
81,901, // {10}
92,MIN_REDUCTION+137, // "["
MIN_REDUCTION+137, // (default reduction)
  }
,
{ // state 615
30,MIN_REDUCTION+53, // `[
92,MIN_REDUCTION+53, // "["
MIN_REDUCTION+53, // (default reduction)
  }
,
{ // state 616
2,703, // ws*
79,275, // ws
80,244, // " "
81,178, // {10}
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 617
74,957, // digit
75,816, // {"1".."9"}
76,816, // "0"
77,517, // digit128
78,946, // {176..185}
98,821, // digit*
99,268, // $$4
  }
,
{ // state 618
MIN_REDUCTION+53, // (default reduction)
  }
,
{ // state 619
MIN_REDUCTION+53, // (default reduction)
  }
,
{ // state 620
MIN_REDUCTION+129, // (default reduction)
  }
,
{ // state 621
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 622
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 623
2,406, // ws*
79,291, // ws
80,260, // " "
81,185, // {10}
MIN_REDUCTION+137, // (default reduction)
  }
,
{ // state 624
57,478, // letter
58,48, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q" "s" "w" "y".."z"}
59,48, // "p"
60,48, // "v"
61,48, // "c"
62,48, // "i"
63,48, // "l"
64,48, // "o"
65,48, // "r"
66,48, // "u"
67,48, // "x"
68,48, // "b"
69,48, // "e"
70,48, // "t"
71,797, // letter128
72,763, // {199..218 231..250}
73,763, // {193..198 225..230}
74,195, // digit
75,174, // {"1".."9"}
76,174, // "0"
77,899, // digit128
78,704, // {176..185}
97,874, // $$3
102,924, // idChar
103,910, // "_"
104,368, // idChar128
105,631, // {223}
  }
,
{ // state 625
MIN_REDUCTION+111, // (default reduction)
  }
,
{ // state 626
MIN_REDUCTION+96, // (default reduction)
  }
,
{ // state 627
MIN_REDUCTION+96, // (default reduction)
  }
,
{ // state 628
2,690, // ws*
30,MIN_REDUCTION+137, // `[
79,86, // ws
80,101, // " "
81,902, // {10}
92,MIN_REDUCTION+137, // "["
MIN_REDUCTION+137, // (default reduction)
  }
,
{ // state 629
0x80000000|326, // match move
0x80000000|562, // no-match move
0x80000000|31, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 630
2,689, // ws*
79,289, // ws
80,266, // " "
81,187, // {10}
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 631
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 632
2,694, // ws*
79,291, // ws
80,260, // " "
81,185, // {10}
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 633
MIN_REDUCTION+96, // (default reduction)
  }
,
{ // state 634
0x80000000|753, // match move
0x80000000|91, // no-match move
0x80000000|31, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 635
30,MIN_REDUCTION+96, // `[
92,MIN_REDUCTION+96, // "["
MIN_REDUCTION+96, // (default reduction)
  }
,
{ // state 636
MIN_REDUCTION+28, // (default reduction)
  }
,
{ // state 637
34,288, // `;
95,239, // ";"
  }
,
{ // state 638
30,MIN_REDUCTION+96, // `[
92,MIN_REDUCTION+96, // "["
MIN_REDUCTION+96, // (default reduction)
  }
,
{ // state 639
MIN_REDUCTION+96, // (default reduction)
  }
,
{ // state 640
2,857, // ws*
79,493, // ws
80,89, // " "
81,456, // {10}
MIN_REDUCTION+87, // (default reduction)
  }
,
{ // state 641
MIN_REDUCTION+129, // (default reduction)
  }
,
{ // state 642
3,953, // <program>
4,608, // <class decl>+
8,812, // <class decl>
9,107, // `class
79,193, // ws
80,607, // " "
81,805, // {10}
82,659, // "#"
  }
,
{ // state 643
2,740, // ws*
79,324, // ws
80,251, // " "
81,164, // {10}
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 644
30,MIN_REDUCTION+96, // `[
92,MIN_REDUCTION+96, // "["
MIN_REDUCTION+96, // (default reduction)
  }
,
{ // state 645
57,478, // letter
58,48, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q" "s" "w" "y".."z"}
59,48, // "p"
60,48, // "v"
61,48, // "c"
62,48, // "i"
63,48, // "l"
64,48, // "o"
65,48, // "r"
66,48, // "u"
67,48, // "x"
68,48, // "b"
69,48, // "e"
70,48, // "t"
71,782, // letter128
72,523, // {199..218 231..250}
73,523, // {193..198 225..230}
74,195, // digit
75,174, // {"1".."9"}
76,174, // "0"
77,585, // digit128
78,936, // {176..185}
96,46, // idChar*
97,331, // $$3
102,935, // idChar
103,910, // "_"
104,873, // idChar128
105,584, // {223}
  }
,
{ // state 646
57,478, // letter
58,48, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q" "s" "w" "y".."z"}
59,48, // "p"
60,48, // "v"
61,48, // "c"
62,48, // "i"
63,48, // "l"
64,48, // "o"
65,48, // "r"
66,48, // "u"
67,48, // "x"
68,48, // "b"
69,48, // "e"
70,48, // "t"
71,787, // letter128
72,519, // {199..218 231..250}
73,519, // {193..198 225..230}
74,195, // digit
75,174, // {"1".."9"}
76,174, // "0"
77,581, // digit128
78,937, // {176..185}
96,47, // idChar*
97,330, // $$3
102,935, // idChar
103,910, // "_"
104,869, // idChar128
105,580, // {223}
  }
,
{ // state 647
7,907, // ID
18,265, // <paramList>?
20,417, // <type>
21,485, // $$2
22,123, // <param>
25,358, // <paramList>
27,104, // `int
28,790, // `boolean
41,137, // `)
57,770, // letter
58,593, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q" "s" "w" "y".."z"}
59,593, // "p"
60,593, // "v"
61,593, // "c"
62,593, // "i"
63,593, // "l"
64,593, // "o"
65,593, // "r"
66,593, // "u"
67,593, // "x"
68,593, // "b"
69,593, // "e"
70,593, // "t"
71,149, // letter128
72,906, // {199..218 231..250}
73,906, // {193..198 225..230}
82,563, // "#"
87,483, // ")"
  }
,
{ // state 648
62,476, // "i"
65,309, // "r"
68,480, // "b"
83,106, // "+"
  }
,
{ // state 649
0x80000000|1, // match move
0x80000000|158, // no-match move
0x80000000|31, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 650
79,402, // ws
80,307, // " "
81,216, // {10}
MIN_REDUCTION+74, // (default reduction)
  }
,
{ // state 651
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 652
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 653
MIN_REDUCTION+53, // (default reduction)
  }
,
{ // state 654
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 655
30,MIN_REDUCTION+94, // `[
79,629, // ws
80,7, // " "
81,294, // {10}
92,MIN_REDUCTION+94, // "["
MIN_REDUCTION+94, // (default reduction)
  }
,
{ // state 656
MIN_REDUCTION+129, // (default reduction)
  }
,
{ // state 657
2,475, // ws*
79,259, // ws
80,296, // " "
81,214, // {10}
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 658
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 659
61,427, // "c"
  }
,
{ // state 660
67,194, // "x"
  }
,
{ // state 661
0x80000000|1, // match move
0x80000000|881, // no-match move
0x80000000|31, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 662
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 663
2,807, // ws*
79,121, // ws
80,698, // " "
81,653, // {10}
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 664
0x80000000|1, // match move
0x80000000|888, // no-match move
0x80000000|31, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 665
29,299, // <empty bracket pair>
30,966, // `[
41,348, // `)
87,932, // ")"
92,131, // "["
  }
,
{ // state 666
57,478, // letter
58,48, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q" "s" "w" "y".."z"}
59,48, // "p"
60,48, // "v"
61,48, // "c"
62,48, // "i"
63,48, // "l"
64,48, // "o"
65,48, // "r"
66,48, // "u"
67,48, // "x"
68,48, // "b"
69,48, // "e"
70,48, // "t"
71,889, // letter128
72,566, // {199..218 231..250}
73,566, // {193..198 225..230}
74,195, // digit
75,174, // {"1".."9"}
76,174, // "0"
77,818, // digit128
78,249, // {176..185}
97,934, // $$3
102,924, // idChar
103,910, // "_"
104,334, // idChar128
105,567, // {223}
  }
,
{ // state 667
7,292, // ID
53,267, // <unary expr>
54,375, // <expr1>
55,667, // `-
56,238, // INTLIT
57,749, // letter
58,593, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q" "s" "w" "y".."z"}
59,593, // "p"
60,593, // "v"
61,593, // "c"
62,593, // "i"
63,593, // "l"
64,593, // "o"
65,593, // "r"
66,593, // "u"
67,593, // "x"
68,593, // "b"
69,593, // "e"
70,593, // "t"
71,828, // letter128
72,503, // {199..218 231..250}
73,503, // {193..198 225..230}
75,617, // {"1".."9"}
76,135, // "0"
77,429, // digit128
78,946, // {176..185}
90,671, // "-"
  }
,
{ // state 668
57,478, // letter
58,48, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q" "s" "w" "y".."z"}
59,48, // "p"
60,48, // "v"
61,48, // "c"
62,48, // "i"
63,48, // "l"
64,48, // "o"
65,48, // "r"
66,48, // "u"
67,48, // "x"
68,48, // "b"
69,48, // "e"
70,48, // "t"
71,6, // letter128
72,788, // {199..218 231..250}
73,788, // {193..198 225..230}
74,195, // digit
75,174, // {"1".."9"}
76,174, // "0"
77,949, // digit128
78,221, // {176..185}
97,627, // $$3
102,924, // idChar
103,910, // "_"
104,623, // idChar128
105,272, // {223}
  }
,
{ // state 669
79,705, // ws
80,883, // " "
81,379, // {10}
MIN_REDUCTION+68, // (default reduction)
  }
,
{ // state 670
34,791, // `;
95,239, // ";"
  }
,
{ // state 671
2,961, // ws*
79,544, // ws
80,50, // " "
81,183, // {10}
MIN_REDUCTION+81, // (default reduction)
  }
,
{ // state 672
7,292, // ID
17,359, // `(
52,428, // <cast expr>
54,45, // <expr1>
56,238, // INTLIT
57,749, // letter
58,593, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q" "s" "w" "y".."z"}
59,593, // "p"
60,593, // "v"
61,593, // "c"
62,593, // "i"
63,593, // "l"
64,593, // "o"
65,593, // "r"
66,593, // "u"
67,593, // "x"
68,593, // "b"
69,593, // "e"
70,593, // "t"
71,828, // letter128
72,503, // {199..218 231..250}
73,503, // {193..198 225..230}
75,617, // {"1".."9"}
76,135, // "0"
77,429, // digit128
78,946, // {176..185}
86,61, // "("
  }
,
{ // state 673
57,478, // letter
58,48, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q" "s" "w" "y".."z"}
59,48, // "p"
60,48, // "v"
61,48, // "c"
62,48, // "i"
63,48, // "l"
64,48, // "o"
65,48, // "r"
66,48, // "u"
67,48, // "x"
68,48, // "b"
69,48, // "e"
70,48, // "t"
71,10, // letter128
72,795, // {199..218 231..250}
73,795, // {193..198 225..230}
74,195, // digit
75,174, // {"1".."9"}
76,174, // "0"
77,948, // digit128
78,223, // {176..185}
97,626, // $$3
102,924, // idChar
103,910, // "_"
104,609, // idChar128
105,274, // {223}
  }
,
{ // state 674
79,235, // ws
80,844, // " "
81,527, // {10}
MIN_REDUCTION+72, // (default reduction)
  }
,
{ // state 675
MIN_REDUCTION+39, // (default reduction)
  }
,
{ // state 676
0x80000000|1, // match move
0x80000000|896, // no-match move
0x80000000|31, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 677
MIN_REDUCTION+39, // (default reduction)
  }
,
{ // state 678
2,459, // ws*
79,606, // ws
80,466, // " "
81,21, // {10}
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 679
30,MIN_REDUCTION+96, // `[
92,MIN_REDUCTION+96, // "["
MIN_REDUCTION+96, // (default reduction)
  }
,
{ // state 680
29,299, // <empty bracket pair>
30,966, // `[
41,321, // `)
87,932, // ")"
92,131, // "["
  }
,
{ // state 681
57,478, // letter
58,48, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q" "s" "w" "y".."z"}
59,48, // "p"
60,48, // "v"
61,48, // "c"
62,48, // "i"
63,48, // "l"
64,48, // "o"
65,48, // "r"
66,48, // "u"
67,48, // "x"
68,48, // "b"
69,48, // "e"
70,48, // "t"
71,108, // letter128
72,771, // {199..218 231..250}
73,771, // {193..198 225..230}
74,195, // digit
75,174, // {"1".."9"}
76,174, // "0"
77,945, // digit128
78,254, // {176..185}
97,633, // $$3
102,924, // idChar
103,910, // "_"
104,598, // idChar128
105,306, // {223}
  }
,
{ // state 682
MIN_REDUCTION+131, // (default reduction)
  }
,
{ // state 683
29,299, // <empty bracket pair>
30,966, // `[
41,319, // `)
87,932, // ")"
92,131, // "["
  }
,
{ // state 684
2,457, // ws*
79,603, // ws
80,468, // " "
81,20, // {10}
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 685
MIN_REDUCTION+17, // (default reduction)
  }
,
{ // state 686
79,23, // ws
80,225, // " "
81,847, // {10}
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 687
57,478, // letter
58,48, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q" "s" "w" "y".."z"}
59,48, // "p"
60,48, // "v"
61,48, // "c"
62,48, // "i"
63,48, // "l"
64,48, // "o"
65,48, // "r"
66,48, // "u"
67,48, // "x"
68,48, // "b"
69,48, // "e"
70,48, // "t"
71,792, // letter128
72,538, // {199..218 231..250}
73,538, // {193..198 225..230}
74,195, // digit
75,174, // {"1".."9"}
76,174, // "0"
77,569, // digit128
78,931, // {176..185}
96,37, // idChar*
97,323, // $$3
102,935, // idChar
103,910, // "_"
104,105, // idChar128
105,597, // {223}
  }
,
{ // state 688
0x80000000|1, // match move
0x80000000|317, // no-match move
0x80000000|31, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 689
79,369, // ws
80,266, // " "
81,187, // {10}
MIN_REDUCTION+94, // (default reduction)
  }
,
{ // state 690
0x80000000|1, // match move
0x80000000|315, // no-match move
0x80000000|31, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 691
74,957, // digit
75,816, // {"1".."9"}
76,816, // "0"
77,959, // digit128
78,931, // {176..185}
98,803, // digit*
99,293, // $$4
  }
,
{ // state 692
0x80000000|764, // match move
0x80000000|204, // no-match move
0x80000000|31, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 693
MIN_REDUCTION+39, // (default reduction)
  }
,
{ // state 694
79,404, // ws
80,260, // " "
81,185, // {10}
MIN_REDUCTION+94, // (default reduction)
  }
,
{ // state 695
MIN_REDUCTION+39, // (default reduction)
  }
,
{ // state 696
57,478, // letter
58,48, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q" "s" "w" "y".."z"}
59,48, // "p"
60,48, // "v"
61,48, // "c"
62,48, // "i"
63,48, // "l"
64,48, // "o"
65,48, // "r"
66,48, // "u"
67,48, // "x"
68,48, // "b"
69,48, // "e"
70,48, // "t"
71,128, // letter128
72,776, // {199..218 231..250}
73,776, // {193..198 225..230}
74,195, // digit
75,174, // {"1".."9"}
76,174, // "0"
77,29, // digit128
78,250, // {176..185}
97,639, // $$3
102,924, // idChar
103,910, // "_"
104,925, // idChar128
105,316, // {223}
  }
,
{ // state 697
0x80000000|347, // match move
0x80000000|876, // no-match move
0x80000000|31, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 698
MIN_REDUCTION+52, // (default reduction)
  }
,
{ // state 699
57,478, // letter
58,48, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q" "s" "w" "y".."z"}
59,48, // "p"
60,48, // "v"
61,48, // "c"
62,48, // "i"
63,48, // "l"
64,48, // "o"
65,48, // "r"
66,48, // "u"
67,48, // "x"
68,48, // "b"
69,48, // "e"
70,48, // "t"
71,586, // letter128
72,611, // {199..218 231..250}
73,611, // {193..198 225..230}
74,195, // digit
75,174, // {"1".."9"}
76,174, // "0"
77,654, // digit128
78,808, // {176..185}
97,446, // $$3
102,924, // idChar
103,910, // "_"
104,228, // idChar128
105,757, // {223}
  }
,
{ // state 700
57,478, // letter
58,48, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q" "s" "w" "y".."z"}
59,48, // "p"
60,48, // "v"
61,48, // "c"
62,48, // "i"
63,48, // "l"
64,48, // "o"
65,48, // "r"
66,48, // "u"
67,48, // "x"
68,48, // "b"
69,48, // "e"
70,48, // "t"
71,583, // letter128
72,610, // {199..218 231..250}
73,610, // {193..198 225..230}
74,195, // digit
75,174, // {"1".."9"}
76,174, // "0"
77,651, // digit128
78,798, // {176..185}
97,444, // $$3
102,924, // idChar
103,910, // "_"
104,232, // idChar128
105,755, // {223}
  }
,
{ // state 701
0x80000000|1, // match move
0x80000000|95, // no-match move
0x80000000|31, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 702
MIN_REDUCTION+40, // (default reduction)
  }
,
{ // state 703
79,361, // ws
80,244, // " "
81,178, // {10}
MIN_REDUCTION+94, // (default reduction)
  }
,
{ // state 704
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 705
MIN_REDUCTION+128, // (default reduction)
  }
,
{ // state 706
34,166, // `;
95,145, // ";"
  }
,
{ // state 707
MIN_REDUCTION+7, // (default reduction)
  }
,
{ // state 708
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 709
2,817, // ws*
79,560, // ws
80,463, // " "
81,112, // {10}
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 710
MIN_REDUCTION+52, // (default reduction)
  }
,
{ // state 711
0x80000000|1, // match move
0x80000000|208, // no-match move
0x80000000|31, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 712
7,437, // ID
53,345, // <unary expr>
54,386, // <expr1>
55,712, // `-
56,206, // INTLIT
57,687, // letter
58,593, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q" "s" "w" "y".."z"}
59,593, // "p"
60,593, // "v"
61,593, // "c"
62,593, // "i"
63,593, // "l"
64,593, // "o"
65,593, // "r"
66,593, // "u"
67,593, // "x"
68,593, // "b"
69,593, // "e"
70,593, // "t"
71,866, // letter128
72,538, // {199..218 231..250}
73,538, // {193..198 225..230}
75,691, // {"1".."9"}
76,172, // "0"
77,261, // digit128
78,931, // {176..185}
90,671, // "-"
  }
,
{ // state 713
MIN_REDUCTION+18, // (default reduction)
  }
,
{ // state 714
0x80000000|1, // match move
0x80000000|192, // no-match move
0x80000000|31, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 715
79,739, // ws
80,89, // " "
81,456, // {10}
MIN_REDUCTION+66, // (default reduction)
  }
,
{ // state 716
MIN_REDUCTION+52, // (default reduction)
  }
,
{ // state 717
30,MIN_REDUCTION+128, // `[
92,MIN_REDUCTION+128, // "["
MIN_REDUCTION+128, // (default reduction)
  }
,
{ // state 718
7,443, // ID
53,342, // <unary expr>
54,411, // <expr1>
55,718, // `-
56,211, // INTLIT
57,646, // letter
58,593, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q" "s" "w" "y".."z"}
59,593, // "p"
60,593, // "v"
61,593, // "c"
62,593, // "i"
63,593, // "l"
64,593, // "o"
65,593, // "r"
66,593, // "u"
67,593, // "x"
68,593, // "b"
69,593, // "e"
70,593, // "t"
71,845, // letter128
72,519, // {199..218 231..250}
73,519, // {193..198 225..230}
75,578, // {"1".."9"}
76,161, // "0"
77,282, // digit128
78,937, // {176..185}
90,671, // "-"
  }
,
{ // state 719
79,380, // ws
80,271, // " "
81,202, // {10}
MIN_REDUCTION+86, // (default reduction)
  }
,
{ // state 720
7,421, // ID
53,341, // <unary expr>
54,413, // <expr1>
55,720, // `-
56,215, // INTLIT
57,645, // letter
58,593, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q" "s" "w" "y".."z"}
59,593, // "p"
60,593, // "v"
61,593, // "c"
62,593, // "i"
63,593, // "l"
64,593, // "o"
65,593, // "r"
66,593, // "u"
67,593, // "x"
68,593, // "b"
69,593, // "e"
70,593, // "t"
71,848, // letter128
72,523, // {199..218 231..250}
73,523, // {193..198 225..230}
75,576, // {"1".."9"}
76,162, // "0"
77,284, // digit128
78,936, // {176..185}
90,671, // "-"
  }
,
{ // state 721
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 722
30,MIN_REDUCTION+49, // `[
92,MIN_REDUCTION+49, // "["
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 723
57,478, // letter
58,48, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q" "s" "w" "y".."z"}
59,48, // "p"
60,48, // "v"
61,48, // "c"
62,48, // "i"
63,48, // "l"
64,48, // "o"
65,48, // "r"
66,48, // "u"
67,48, // "x"
68,48, // "b"
69,48, // "e"
70,48, // "t"
71,797, // letter128
72,763, // {199..218 231..250}
73,763, // {193..198 225..230}
74,195, // digit
75,174, // {"1".."9"}
76,174, // "0"
77,899, // digit128
78,704, // {176..185}
96,624, // idChar*
97,794, // $$3
102,935, // idChar
103,910, // "_"
104,368, // idChar128
105,631, // {223}
  }
,
{ // state 724
57,478, // letter
58,48, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q" "s" "w" "y".."z"}
59,48, // "p"
60,48, // "v"
61,48, // "c"
62,48, // "i"
63,48, // "l"
64,48, // "o"
65,48, // "r"
66,48, // "u"
67,48, // "x"
68,48, // "b"
69,48, // "e"
70,48, // "t"
71,301, // letter128
72,622, // {199..218 231..250}
73,622, // {193..198 225..230}
74,195, // digit
75,174, // {"1".."9"}
76,174, // "0"
77,287, // digit128
78,662, // {176..185}
97,528, // $$3
102,924, // idChar
103,910, // "_"
104,732, // idChar128
105,743, // {223}
  }
,
{ // state 725
57,478, // letter
58,48, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q" "s" "w" "y".."z"}
59,48, // "p"
60,48, // "v"
61,48, // "c"
62,48, // "i"
63,48, // "l"
64,48, // "o"
65,48, // "r"
66,48, // "u"
67,48, // "x"
68,48, // "b"
69,48, // "e"
70,48, // "t"
71,302, // letter128
72,621, // {199..218 231..250}
73,621, // {193..198 225..230}
74,195, // digit
75,174, // {"1".."9"}
76,174, // "0"
77,285, // digit128
78,652, // {176..185}
97,526, // $$3
102,924, // idChar
103,910, // "_"
104,737, // idChar128
105,744, // {223}
  }
,
{ // state 726
37,127, // `}
89,890, // "}"
  }
,
{ // state 727
110,MIN_REDUCTION+52, // $NT
MIN_REDUCTION+52, // (default reduction)
  }
,
{ // state 728
MIN_REDUCTION+128, // (default reduction)
  }
,
{ // state 729
MIN_REDUCTION+128, // (default reduction)
  }
,
{ // state 730
30,MIN_REDUCTION+98, // `[
92,MIN_REDUCTION+98, // "["
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 731
30,MIN_REDUCTION+128, // `[
92,MIN_REDUCTION+128, // "["
MIN_REDUCTION+128, // (default reduction)
  }
,
{ // state 732
2,144, // ws*
79,606, // ws
80,466, // " "
81,21, // {10}
MIN_REDUCTION+137, // (default reduction)
  }
,
{ // state 733
MIN_REDUCTION+130, // (default reduction)
  }
,
{ // state 734
30,MIN_REDUCTION+128, // `[
92,MIN_REDUCTION+128, // "["
MIN_REDUCTION+128, // (default reduction)
  }
,
{ // state 735
MIN_REDUCTION+115, // (default reduction)
  }
,
{ // state 736
MIN_REDUCTION+115, // (default reduction)
  }
,
{ // state 737
2,141, // ws*
79,603, // ws
80,468, // " "
81,20, // {10}
MIN_REDUCTION+137, // (default reduction)
  }
,
{ // state 738
30,MIN_REDUCTION+98, // `[
92,MIN_REDUCTION+98, // "["
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 739
MIN_REDUCTION+128, // (default reduction)
  }
,
{ // state 740
79,376, // ws
80,251, // " "
81,164, // {10}
MIN_REDUCTION+94, // (default reduction)
  }
,
{ // state 741
30,MIN_REDUCTION+98, // `[
92,MIN_REDUCTION+98, // "["
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 742
57,478, // letter
58,48, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q" "s" "w" "y".."z"}
59,48, // "p"
60,48, // "v"
61,48, // "c"
62,48, // "i"
63,48, // "l"
64,48, // "o"
65,48, // "r"
66,48, // "u"
67,48, // "x"
68,48, // "b"
69,48, // "e"
70,48, // "t"
71,354, // letter128
72,133, // {199..218 231..250}
73,133, // {193..198 225..230}
74,195, // digit
75,174, // {"1".."9"}
76,174, // "0"
77,908, // digit128
78,124, // {176..185}
96,332, // idChar*
97,634, // $$3
102,935, // idChar
103,910, // "_"
104,155, // idChar128
105,389, // {223}
  }
,
{ // state 743
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 744
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 745
0x80000000|1, // match move
0x80000000|219, // no-match move
0x80000000|31, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 746
MIN_REDUCTION+19, // (default reduction)
  }
,
{ // state 747
79,760, // ws
80,531, // " "
81,781, // {10}
MIN_REDUCTION+136, // (default reduction)
  }
,
{ // state 748
30,MIN_REDUCTION+128, // `[
92,MIN_REDUCTION+128, // "["
MIN_REDUCTION+128, // (default reduction)
  }
,
{ // state 749
57,478, // letter
58,48, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q" "s" "w" "y".."z"}
59,48, // "p"
60,48, // "v"
61,48, // "c"
62,48, // "i"
63,48, // "l"
64,48, // "o"
65,48, // "r"
66,48, // "u"
67,48, // "x"
68,48, // "b"
69,48, // "e"
70,48, // "t"
71,867, // letter128
72,503, // {199..218 231..250}
73,503, // {193..198 225..230}
74,195, // digit
75,174, // {"1".."9"}
76,174, // "0"
77,564, // digit128
78,946, // {176..185}
96,2, // idChar*
97,283, // $$3
102,935, // idChar
103,910, // "_"
104,905, // idChar128
105,692, // {223}
  }
,
{ // state 750
MIN_REDUCTION+52, // (default reduction)
  }
,
{ // state 751
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 752
30,MIN_REDUCTION+107, // `[
92,MIN_REDUCTION+107, // "["
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 753
MIN_REDUCTION+97, // (default reduction)
  }
,
{ // state 754
MIN_REDUCTION+10, // (default reduction)
  }
,
{ // state 755
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 756
0x80000000|79, // match move
0x80000000|918, // no-match move
0x80000000|31, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 757
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 758
MIN_REDUCTION+52, // (default reduction)
  }
,
{ // state 759
2,745, // ws*
30,MIN_REDUCTION+95, // `[
79,396, // ws
80,126, // " "
81,914, // {10}
92,MIN_REDUCTION+95, // "["
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 760
MIN_REDUCTION+128, // (default reduction)
  }
,
{ // state 761
MIN_REDUCTION+4, // (default reduction)
  }
,
{ // state 762
MIN_REDUCTION+52, // (default reduction)
  }
,
{ // state 763
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 764
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 765
7,443, // ID
17,605, // `(
40,394, // <expr>
43,879, // <expr8>
44,119, // <expr7>
45,115, // <expr6>
46,113, // <expr5>
47,956, // <expr4>
49,565, // <expr3>
51,827, // <expr2>
52,695, // <cast expr>
53,550, // <unary expr>
54,411, // <expr1>
55,718, // `-
56,211, // INTLIT
57,646, // letter
58,593, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q" "s" "w" "y".."z"}
59,593, // "p"
60,593, // "v"
61,593, // "c"
62,593, // "i"
63,593, // "l"
64,593, // "o"
65,593, // "r"
66,593, // "u"
67,593, // "x"
68,593, // "b"
69,593, // "e"
70,593, // "t"
71,845, // letter128
72,519, // {199..218 231..250}
73,519, // {193..198 225..230}
75,578, // {"1".."9"}
76,161, // "0"
77,282, // digit128
78,937, // {176..185}
86,61, // "("
90,671, // "-"
  }
,
{ // state 766
30,MIN_REDUCTION+98, // `[
92,MIN_REDUCTION+98, // "["
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 767
2,72, // ws*
79,200, // ws
80,851, // " "
81,439, // {10}
MIN_REDUCTION+79, // (default reduction)
  }
,
{ // state 768
41,12, // `)
87,343, // ")"
  }
,
{ // state 769
2,27, // ws*
79,656, // ws
80,710, // " "
81,96, // {10}
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 770
57,478, // letter
58,48, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q" "s" "w" "y".."z"}
59,48, // "p"
60,48, // "v"
61,48, // "c"
62,48, // "i"
63,48, // "l"
64,48, // "o"
65,48, // "r"
66,48, // "u"
67,48, // "x"
68,48, // "b"
69,48, // "e"
70,48, // "t"
71,708, // letter128
72,906, // {199..218 231..250}
73,906, // {193..198 225..230}
74,195, // digit
75,174, // {"1".."9"}
76,174, // "0"
77,516, // digit128
78,97, // {176..185}
96,815, // idChar*
97,452, // $$3
102,935, // idChar
103,910, // "_"
104,55, // idChar128
105,800, // {223}
  }
,
{ // state 771
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 772
57,478, // letter
58,48, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q" "s" "w" "y".."z"}
59,48, // "p"
60,48, // "v"
61,48, // "c"
62,48, // "i"
63,48, // "l"
64,48, // "o"
65,48, // "r"
66,48, // "u"
67,48, // "x"
68,48, // "b"
69,48, // "e"
70,48, // "t"
71,302, // letter128
72,621, // {199..218 231..250}
73,621, // {193..198 225..230}
74,195, // digit
75,174, // {"1".."9"}
76,174, // "0"
77,285, // digit128
78,652, // {176..185}
96,725, // idChar*
97,450, // $$3
102,935, // idChar
103,910, // "_"
104,737, // idChar128
105,744, // {223}
  }
,
{ // state 773
30,MIN_REDUCTION+51, // `[
92,MIN_REDUCTION+51, // "["
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 774
0x80000000|1, // match move
0x80000000|679, // no-match move
0x80000000|31, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 775
2,600, // ws*
79,423, // ws
80,844, // " "
81,527, // {10}
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 776
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 777
MIN_REDUCTION+2, // (default reduction)
  }
,
{ // state 778
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 779
MIN_REDUCTION+128, // (default reduction)
  }
,
{ // state 780
0x80000000|1, // match move
0x80000000|635, // no-match move
0x80000000|31, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 781
MIN_REDUCTION+53, // (default reduction)
  }
,
{ // state 782
0x80000000|751, // match move
0x80000000|505, // no-match move
0x80000000|31, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 783
0x80000000|1, // match move
0x80000000|638, // no-match move
0x80000000|31, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 784
7,537, // ID
29,591, // <empty bracket pair>
30,36, // `[
57,22, // letter
58,593, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q" "s" "w" "y".."z"}
59,593, // "p"
60,593, // "v"
61,593, // "c"
62,593, // "i"
63,593, // "l"
64,593, // "o"
65,593, // "r"
66,593, // "u"
67,593, // "x"
68,593, // "b"
69,593, // "e"
70,593, // "t"
71,143, // letter128
72,610, // {199..218 231..250}
73,610, // {193..198 225..230}
92,131, // "["
  }
,
{ // state 785
7,539, // ID
29,591, // <empty bracket pair>
30,36, // `[
57,9, // letter
58,593, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q" "s" "w" "y".."z"}
59,593, // "p"
60,593, // "v"
61,593, // "c"
62,593, // "i"
63,593, // "l"
64,593, // "o"
65,593, // "r"
66,593, // "u"
67,593, // "x"
68,593, // "b"
69,593, // "e"
70,593, // "t"
71,140, // letter128
72,611, // {199..218 231..250}
73,611, // {193..198 225..230}
92,131, // "["
  }
,
{ // state 786
MIN_REDUCTION+53, // (default reduction)
  }
,
{ // state 787
0x80000000|751, // match move
0x80000000|507, // no-match move
0x80000000|31, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 788
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 789
MIN_REDUCTION+112, // (default reduction)
  }
,
{ // state 790
MIN_REDUCTION+18, // (default reduction)
  }
,
{ // state 791
MIN_REDUCTION+22, // (default reduction)
  }
,
{ // state 792
0x80000000|751, // match move
0x80000000|488, // no-match move
0x80000000|31, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 793
0x80000000|1, // match move
0x80000000|644, // no-match move
0x80000000|31, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 794
MIN_REDUCTION+97, // (default reduction)
  }
,
{ // state 795
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 796
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 797
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 798
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 799
MIN_REDUCTION+129, // (default reduction)
  }
,
{ // state 800
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 801
MIN_REDUCTION+129, // (default reduction)
  }
,
{ // state 802
79,779, // ws
80,863, // " "
81,226, // {10}
MIN_REDUCTION+94, // (default reduction)
  }
,
{ // state 803
74,789, // digit
75,816, // {"1".."9"}
76,816, // "0"
77,959, // digit128
78,931, // {176..185}
99,574, // $$4
  }
,
{ // state 804
79,364, // ws
80,490, // " "
81,822, // {10}
MIN_REDUCTION+74, // (default reduction)
  }
,
{ // state 805
MIN_REDUCTION+53, // (default reduction)
  }
,
{ // state 806
79,335, // ws
80,727, // " "
81,147, // {10}
110,MIN_REDUCTION+88, // $NT
  }
,
{ // state 807
79,130, // ws
80,698, // " "
81,653, // {10}
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 808
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 809
MIN_REDUCTION+38, // (default reduction)
  }
,
{ // state 810
11,353, // $$0
35,555, // `{
88,769, // "{"
  }
,
{ // state 811
74,789, // digit
75,816, // {"1".."9"}
76,816, // "0"
77,927, // digit128
78,936, // {176..185}
99,557, // $$4
  }
,
{ // state 812
MIN_REDUCTION+126, // (default reduction)
  }
,
{ // state 813
74,789, // digit
75,816, // {"1".."9"}
76,816, // "0"
77,930, // digit128
78,937, // {176..185}
99,556, // $$4
  }
,
{ // state 814
0x80000000|1, // match move
0x80000000|189, // no-match move
0x80000000|31, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 815
57,478, // letter
58,48, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q" "s" "w" "y".."z"}
59,48, // "p"
60,48, // "v"
61,48, // "c"
62,48, // "i"
63,48, // "l"
64,48, // "o"
65,48, // "r"
66,48, // "u"
67,48, // "x"
68,48, // "b"
69,48, // "e"
70,48, // "t"
71,708, // letter128
72,906, // {199..218 231..250}
73,906, // {193..198 225..230}
74,195, // digit
75,174, // {"1".."9"}
76,174, // "0"
77,516, // digit128
78,97, // {176..185}
97,305, // $$3
102,924, // idChar
103,910, // "_"
104,55, // idChar128
105,800, // {223}
  }
,
{ // state 816
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 817
79,304, // ws
80,463, // " "
81,112, // {10}
MIN_REDUCTION+76, // (default reduction)
  }
,
{ // state 818
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 819
7,499, // ID
29,591, // <empty bracket pair>
30,36, // `[
57,152, // letter
58,593, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q" "s" "w" "y".."z"}
59,593, // "p"
60,593, // "v"
61,593, // "c"
62,593, // "i"
63,593, // "l"
64,593, // "o"
65,593, // "r"
66,593, // "u"
67,593, // "x"
68,593, // "b"
69,593, // "e"
70,593, // "t"
71,616, // letter128
72,771, // {199..218 231..250}
73,771, // {193..198 225..230}
92,131, // "["
  }
,
{ // state 820
2,182, // ws*
79,620, // ws
80,922, // " "
81,409, // {10}
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 821
74,789, // digit
75,816, // {"1".."9"}
76,816, // "0"
77,517, // digit128
78,946, // {176..185}
99,532, // $$4
  }
,
{ // state 822
MIN_REDUCTION+53, // (default reduction)
  }
,
{ // state 823
2,688, // ws*
  }
,
{ // state 824
2,814, // ws*
  }
,
{ // state 825
34,520, // `;
95,657, // ";"
  }
,
{ // state 826
31,514, // `]
93,448, // "]"
  }
,
{ // state 827
MIN_REDUCTION+38, // (default reduction)
  }
,
{ // state 828
0x80000000|865, // match move
0x80000000|759, // no-match move
0x80000000|31, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 829
2,714, // ws*
  }
,
{ // state 830
2,711, // ws*
  }
,
{ // state 831
MIN_REDUCTION+38, // (default reduction)
  }
,
{ // state 832
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 833
MIN_REDUCTION+122, // (default reduction)
  }
,
{ // state 834
MIN_REDUCTION+23, // (default reduction)
  }
,
{ // state 835
2,649, // ws*
  }
,
{ // state 836
MIN_REDUCTION+23, // (default reduction)
  }
,
{ // state 837
79,779, // ws
80,863, // " "
81,226, // {10}
MIN_REDUCTION+88, // (default reduction)
  }
,
{ // state 838
7,907, // ID
20,784, // <type>
27,104, // `int
28,790, // `boolean
57,770, // letter
58,593, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q" "s" "w" "y".."z"}
59,593, // "p"
60,593, // "v"
61,593, // "c"
62,593, // "i"
63,593, // "l"
64,593, // "o"
65,593, // "r"
66,593, // "u"
67,593, // "x"
68,593, // "b"
69,593, // "e"
70,593, // "t"
71,149, // letter128
72,906, // {199..218 231..250}
73,906, // {193..198 225..230}
82,563, // "#"
  }
,
{ // state 839
7,907, // ID
20,785, // <type>
27,104, // `int
28,790, // `boolean
57,770, // letter
58,593, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q" "s" "w" "y".."z"}
59,593, // "p"
60,593, // "v"
61,593, // "c"
62,593, // "i"
63,593, // "l"
64,593, // "o"
65,593, // "r"
66,593, // "u"
67,593, // "x"
68,593, // "b"
69,593, // "e"
70,593, // "t"
71,149, // letter128
72,906, // {199..218 231..250}
73,906, // {193..198 225..230}
82,563, // "#"
  }
,
{ // state 840
2,715, // ws*
79,493, // ws
80,89, // " "
81,456, // {10}
MIN_REDUCTION+67, // (default reduction)
  }
,
{ // state 841
MIN_REDUCTION+19, // (default reduction)
  }
,
{ // state 842
MIN_REDUCTION+38, // (default reduction)
  }
,
{ // state 843
30,MIN_REDUCTION+102, // `[
92,MIN_REDUCTION+102, // "["
MIN_REDUCTION+102, // (default reduction)
  }
,
{ // state 844
MIN_REDUCTION+52, // (default reduction)
  }
,
{ // state 845
0x80000000|830, // match move
0x80000000|506, // no-match move
0x80000000|31, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 846
42,765, // `=
91,33, // "="
  }
,
{ // state 847
MIN_REDUCTION+53, // (default reduction)
  }
,
{ // state 848
0x80000000|829, // match move
0x80000000|509, // no-match move
0x80000000|31, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 849
30,MIN_REDUCTION+102, // `[
92,MIN_REDUCTION+102, // "["
MIN_REDUCTION+102, // (default reduction)
  }
,
{ // state 850
30,MIN_REDUCTION+102, // `[
92,MIN_REDUCTION+102, // "["
MIN_REDUCTION+102, // (default reduction)
  }
,
{ // state 851
MIN_REDUCTION+52, // (default reduction)
  }
,
{ // state 852
30,MIN_REDUCTION+45, // `[
42,MIN_REDUCTION+45, // `=
48,MIN_REDUCTION+45, // `+
50,MIN_REDUCTION+45, // `*
83,MIN_REDUCTION+45, // "+"
85,MIN_REDUCTION+45, // "*"
91,MIN_REDUCTION+45, // "="
92,MIN_REDUCTION+45, // "["
MIN_REDUCTION+19, // (default reduction)
  }
,
{ // state 853
MIN_REDUCTION+129, // (default reduction)
  }
,
{ // state 854
2,163, // ws*
79,433, // ws
80,872, // " "
81,168, // {10}
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 855
MIN_REDUCTION+53, // (default reduction)
  }
,
{ // state 856
MIN_REDUCTION+53, // (default reduction)
  }
,
{ // state 857
79,739, // ws
80,89, // " "
81,456, // {10}
MIN_REDUCTION+86, // (default reduction)
  }
,
{ // state 858
MIN_REDUCTION+119, // (default reduction)
  }
,
{ // state 859
MIN_REDUCTION+53, // (default reduction)
  }
,
{ // state 860
MIN_REDUCTION+53, // (default reduction)
  }
,
{ // state 861
2,242, // ws*
79,493, // ws
80,89, // " "
81,456, // {10}
MIN_REDUCTION+73, // (default reduction)
  }
,
{ // state 862
MIN_REDUCTION+129, // (default reduction)
  }
,
{ // state 863
MIN_REDUCTION+52, // (default reduction)
  }
,
{ // state 864
30,MIN_REDUCTION+102, // `[
92,MIN_REDUCTION+102, // "["
MIN_REDUCTION+102, // (default reduction)
  }
,
{ // state 865
2,745, // ws*
  }
,
{ // state 866
0x80000000|824, // match move
0x80000000|543, // no-match move
0x80000000|31, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 867
0x80000000|751, // match move
0x80000000|534, // no-match move
0x80000000|31, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 868
30,MIN_REDUCTION+49, // `[
92,MIN_REDUCTION+49, // "["
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 869
0x80000000|173, // match move
0x80000000|628, // no-match move
0x80000000|31, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 870
79,739, // ws
80,89, // " "
81,456, // {10}
MIN_REDUCTION+84, // (default reduction)
  }
,
{ // state 871
7,201, // ID
29,591, // <empty bracket pair>
30,36, // `[
57,138, // letter
58,593, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q" "s" "w" "y".."z"}
59,593, // "p"
60,593, // "v"
61,593, // "c"
62,593, // "i"
63,593, // "l"
64,593, // "o"
65,593, // "r"
66,593, // "u"
67,593, // "x"
68,593, // "b"
69,593, // "e"
70,593, // "t"
71,630, // letter128
72,795, // {199..218 231..250}
73,795, // {193..198 225..230}
92,131, // "["
  }
,
{ // state 872
MIN_REDUCTION+52, // (default reduction)
  }
,
{ // state 873
0x80000000|823, // match move
0x80000000|614, // no-match move
0x80000000|31, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 874
MIN_REDUCTION+96, // (default reduction)
  }
,
{ // state 875
7,846, // ID
29,591, // <empty bracket pair>
30,36, // `[
57,146, // letter
58,593, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q" "s" "w" "y".."z"}
59,593, // "p"
60,593, // "v"
61,593, // "c"
62,593, // "i"
63,593, // "l"
64,593, // "o"
65,593, // "r"
66,593, // "u"
67,593, // "x"
68,593, // "b"
69,593, // "e"
70,593, // "t"
71,632, // letter128
72,788, // {199..218 231..250}
73,788, // {193..198 225..230}
92,131, // "["
  }
,
{ // state 876
2,947, // ws*
30,MIN_REDUCTION+95, // `[
79,477, // ws
80,7, // " "
81,294, // {10}
92,MIN_REDUCTION+95, // "["
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 877
30,MIN_REDUCTION+97, // `[
92,MIN_REDUCTION+97, // "["
MIN_REDUCTION+97, // (default reduction)
  }
,
{ // state 878
48,256, // `+
83,663, // "+"
MIN_REDUCTION+34, // (default reduction)
  }
,
{ // state 879
MIN_REDUCTION+30, // (default reduction)
  }
,
{ // state 880
MIN_REDUCTION+30, // (default reduction)
  }
,
{ // state 881
30,MIN_REDUCTION+138, // `[
79,24, // ws
80,99, // " "
81,901, // {10}
92,MIN_REDUCTION+138, // "["
MIN_REDUCTION+138, // (default reduction)
  }
,
{ // state 882
30,MIN_REDUCTION+49, // `[
92,MIN_REDUCTION+49, // "["
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 883
MIN_REDUCTION+52, // (default reduction)
  }
,
{ // state 884
30,MIN_REDUCTION+97, // `[
92,MIN_REDUCTION+97, // "["
MIN_REDUCTION+97, // (default reduction)
  }
,
{ // state 885
30,MIN_REDUCTION+129, // `[
92,MIN_REDUCTION+129, // "["
MIN_REDUCTION+129, // (default reduction)
  }
,
{ // state 886
30,MIN_REDUCTION+97, // `[
92,MIN_REDUCTION+97, // "["
MIN_REDUCTION+97, // (default reduction)
  }
,
{ // state 887
79,572, // ws
80,508, // " "
81,786, // {10}
MIN_REDUCTION+76, // (default reduction)
  }
,
{ // state 888
30,MIN_REDUCTION+138, // `[
79,25, // ws
80,101, // " "
81,902, // {10}
92,MIN_REDUCTION+138, // "["
MIN_REDUCTION+138, // (default reduction)
  }
,
{ // state 889
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 890
2,594, // ws*
79,620, // ws
80,922, // " "
81,409, // {10}
MIN_REDUCTION+79, // (default reduction)
  }
,
{ // state 891
2,701, // ws*
30,MIN_REDUCTION+139, // `[
79,396, // ws
80,126, // " "
81,914, // {10}
92,MIN_REDUCTION+139, // "["
MIN_REDUCTION+139, // (default reduction)
  }
,
{ // state 892
0x80000000|1, // match move
0x80000000|68, // no-match move
0x80000000|31, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 893
30,MIN_REDUCTION+97, // `[
92,MIN_REDUCTION+97, // "["
MIN_REDUCTION+97, // (default reduction)
  }
,
{ // state 894
7,292, // ID
17,359, // `(
40,410, // <expr>
43,920, // <expr8>
44,65, // <expr7>
45,63, // <expr6>
46,66, // <expr5>
47,942, // <expr4>
49,498, // <expr3>
51,842, // <expr2>
52,675, // <cast expr>
53,521, // <unary expr>
54,375, // <expr1>
55,667, // `-
56,238, // INTLIT
57,749, // letter
58,593, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q" "s" "w" "y".."z"}
59,593, // "p"
60,593, // "v"
61,593, // "c"
62,593, // "i"
63,593, // "l"
64,593, // "o"
65,593, // "r"
66,593, // "u"
67,593, // "x"
68,593, // "b"
69,593, // "e"
70,593, // "t"
71,828, // letter128
72,503, // {199..218 231..250}
73,503, // {193..198 225..230}
75,617, // {"1".."9"}
76,135, // "0"
77,429, // digit128
78,946, // {176..185}
86,61, // "("
90,671, // "-"
  }
,
{ // state 895
7,280, // ID
17,385, // `(
20,875, // <type>
27,104, // `int
28,790, // `boolean
32,273, // <stmt>
33,670, // <assign>
35,253, // `{
38,637, // <local var decl>
39,504, // `if
40,125, // <expr>
43,880, // <expr8>
44,114, // <expr7>
45,111, // <expr6>
46,118, // <expr5>
47,958, // <expr4>
49,546, // <expr3>
51,831, // <expr2>
52,693, // <cast expr>
53,551, // <unary expr>
54,413, // <expr1>
55,720, // `-
56,215, // INTLIT
57,742, // letter
58,593, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q" "s" "w" "y".."z"}
59,593, // "p"
60,593, // "v"
61,593, // "c"
62,593, // "i"
63,593, // "l"
64,593, // "o"
65,593, // "r"
66,593, // "u"
67,593, // "x"
68,593, // "b"
69,593, // "e"
70,593, // "t"
71,697, // letter128
72,133, // {199..218 231..250}
73,133, // {193..198 225..230}
75,576, // {"1".."9"}
76,162, // "0"
77,284, // digit128
78,936, // {176..185}
82,77, // "#"
86,61, // "("
88,142, // "{"
90,671, // "-"
  }
,
{ // state 896
30,MIN_REDUCTION+138, // `[
79,5, // ws
80,93, // " "
81,892, // {10}
92,MIN_REDUCTION+138, // "["
MIN_REDUCTION+138, // (default reduction)
  }
,
{ // state 897
MIN_REDUCTION+30, // (default reduction)
  }
,
{ // state 898
MIN_REDUCTION+96, // (default reduction)
  }
,
{ // state 899
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 900
30,MIN_REDUCTION+108, // `[
92,MIN_REDUCTION+108, // "["
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 901
0x80000000|1, // match move
0x80000000|73, // no-match move
0x80000000|31, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 902
0x80000000|1, // match move
0x80000000|74, // no-match move
0x80000000|31, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 903
MIN_REDUCTION+9, // (default reduction)
  }
,
{ // state 904
30,MIN_REDUCTION+108, // `[
92,MIN_REDUCTION+108, // "["
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 905
0x80000000|835, // match move
0x80000000|489, // no-match move
0x80000000|31, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 906
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 907
MIN_REDUCTION+19, // (default reduction)
  }
,
{ // state 908
0x80000000|179, // match move
0x80000000|533, // no-match move
0x80000000|31, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 909
30,MIN_REDUCTION+129, // `[
92,MIN_REDUCTION+129, // "["
MIN_REDUCTION+129, // (default reduction)
  }
,
{ // state 910
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 911
MIN_REDUCTION+128, // (default reduction)
  }
,
{ // state 912
MIN_REDUCTION+128, // (default reduction)
  }
,
{ // state 913
MIN_REDUCTION+128, // (default reduction)
  }
,
{ // state 914
0x80000000|1, // match move
0x80000000|90, // no-match move
0x80000000|31, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 915
79,71, // ws
80,716, // " "
81,618, // {10}
MIN_REDUCTION+70, // (default reduction)
  }
,
{ // state 916
MIN_REDUCTION+11, // (default reduction)
  }
,
{ // state 917
30,MIN_REDUCTION+129, // `[
92,MIN_REDUCTION+129, // "["
MIN_REDUCTION+129, // (default reduction)
  }
,
{ // state 918
30,MIN_REDUCTION+136, // `[
79,629, // ws
80,7, // " "
81,294, // {10}
92,MIN_REDUCTION+136, // "["
MIN_REDUCTION+136, // (default reduction)
  }
,
{ // state 919
MIN_REDUCTION+121, // (default reduction)
  }
,
{ // state 920
MIN_REDUCTION+30, // (default reduction)
  }
,
{ // state 921
30,MIN_REDUCTION+108, // `[
92,MIN_REDUCTION+108, // "["
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 922
MIN_REDUCTION+52, // (default reduction)
  }
,
{ // state 923
30,MIN_REDUCTION+129, // `[
92,MIN_REDUCTION+129, // "["
MIN_REDUCTION+129, // (default reduction)
  }
,
{ // state 924
MIN_REDUCTION+124, // (default reduction)
  }
,
{ // state 925
2,59, // ws*
79,324, // ws
80,251, // " "
81,164, // {10}
MIN_REDUCTION+137, // (default reduction)
  }
,
{ // state 926
MIN_REDUCTION+52, // (default reduction)
  }
,
{ // state 927
0x80000000|240, // match move
0x80000000|963, // no-match move
0x80000000|31, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 928
MIN_REDUCTION+129, // (default reduction)
  }
,
{ // state 929
2,170, // ws*
79,496, // ws
80,863, // " "
81,226, // {10}
MIN_REDUCTION+63, // (default reduction)
  }
,
{ // state 930
0x80000000|241, // match move
0x80000000|962, // no-match move
0x80000000|31, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 931
0x80000000|540, // match move
0x80000000|218, // no-match move
0x80000000|31, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 932
2,405, // ws*
79,853, // ws
80,510, // " "
81,281, // {10}
MIN_REDUCTION+75, // (default reduction)
  }
,
{ // state 933
MIN_REDUCTION+133, // (default reduction)
  }
,
{ // state 934
MIN_REDUCTION+96, // (default reduction)
  }
,
{ // state 935
MIN_REDUCTION+125, // (default reduction)
  }
,
{ // state 936
0x80000000|540, // match move
0x80000000|229, // no-match move
0x80000000|31, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 937
0x80000000|540, // match move
0x80000000|227, // no-match move
0x80000000|31, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 938
2,802, // ws*
79,496, // ws
80,863, // " "
81,226, // {10}
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 939
7,761, // ID
57,171, // letter
58,593, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q" "s" "w" "y".."z"}
59,593, // "p"
60,593, // "v"
61,593, // "c"
62,593, // "i"
63,593, // "l"
64,593, // "o"
65,593, // "r"
66,593, // "u"
67,593, // "x"
68,593, // "b"
69,593, // "e"
70,593, // "t"
71,643, // letter128
72,776, // {199..218 231..250}
73,776, // {193..198 225..230}
  }
,
{ // state 940
2,676, // ws*
30,MIN_REDUCTION+139, // `[
79,64, // ws
80,93, // " "
81,892, // {10}
92,MIN_REDUCTION+139, // "["
MIN_REDUCTION+139, // (default reduction)
  }
,
{ // state 941
79,43, // ws
80,926, // " "
81,619, // {10}
MIN_REDUCTION+60, // (default reduction)
  }
,
{ // state 942
48,262, // `+
83,663, // "+"
MIN_REDUCTION+34, // (default reduction)
  }
,
{ // state 943
30,MIN_REDUCTION+108, // `[
92,MIN_REDUCTION+108, // "["
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 944
30,MIN_REDUCTION+51, // `[
92,MIN_REDUCTION+51, // "["
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 945
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 946
0x80000000|540, // match move
0x80000000|773, // no-match move
0x80000000|31, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 947
0x80000000|352, // match move
0x80000000|655, // no-match move
0x80000000|31, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 948
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 949
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 950
MIN_REDUCTION+13, // (default reduction)
  }
,
{ // state 951
MIN_REDUCTION+13, // (default reduction)
  }
,
{ // state 952
7,292, // ID
17,359, // `(
40,390, // <expr>
43,920, // <expr8>
44,65, // <expr7>
45,63, // <expr6>
46,66, // <expr5>
47,942, // <expr4>
49,498, // <expr3>
51,842, // <expr2>
52,675, // <cast expr>
53,521, // <unary expr>
54,375, // <expr1>
55,667, // `-
56,238, // INTLIT
57,749, // letter
58,593, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q" "s" "w" "y".."z"}
59,593, // "p"
60,593, // "v"
61,593, // "c"
62,593, // "i"
63,593, // "l"
64,593, // "o"
65,593, // "r"
66,593, // "u"
67,593, // "x"
68,593, // "b"
69,593, // "e"
70,593, // "t"
71,828, // letter128
72,503, // {199..218 231..250}
73,503, // {193..198 225..230}
75,617, // {"1".."9"}
76,135, // "0"
77,429, // digit128
78,946, // {176..185}
86,61, // "("
90,671, // "-"
  }
,
{ // state 953
MIN_REDUCTION+1, // (default reduction)
  }
,
{ // state 954
7,292, // ID
17,359, // `(
40,387, // <expr>
43,920, // <expr8>
44,65, // <expr7>
45,63, // <expr6>
46,66, // <expr5>
47,942, // <expr4>
49,498, // <expr3>
51,842, // <expr2>
52,675, // <cast expr>
53,521, // <unary expr>
54,375, // <expr1>
55,667, // `-
56,238, // INTLIT
57,749, // letter
58,593, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q" "s" "w" "y".."z"}
59,593, // "p"
60,593, // "v"
61,593, // "c"
62,593, // "i"
63,593, // "l"
64,593, // "o"
65,593, // "r"
66,593, // "u"
67,593, // "x"
68,593, // "b"
69,593, // "e"
70,593, // "t"
71,828, // letter128
72,503, // {199..218 231..250}
73,503, // {193..198 225..230}
75,617, // {"1".."9"}
76,135, // "0"
77,429, // digit128
78,946, // {176..185}
86,61, // "("
90,671, // "-"
  }
,
{ // state 955
2,60, // ws*
79,496, // ws
80,863, // " "
81,226, // {10}
MIN_REDUCTION+55, // (default reduction)
  }
,
{ // state 956
48,246, // `+
83,663, // "+"
MIN_REDUCTION+34, // (default reduction)
  }
,
{ // state 957
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 958
48,248, // `+
83,663, // "+"
MIN_REDUCTION+34, // (default reduction)
  }
,
{ // state 959
0x80000000|231, // match move
0x80000000|940, // no-match move
0x80000000|31, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 960
7,292, // ID
17,359, // `(
40,382, // <expr>
43,920, // <expr8>
44,65, // <expr7>
45,63, // <expr6>
46,66, // <expr5>
47,942, // <expr4>
49,498, // <expr3>
51,842, // <expr2>
52,675, // <cast expr>
53,521, // <unary expr>
54,375, // <expr1>
55,667, // `-
56,238, // INTLIT
57,749, // letter
58,593, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q" "s" "w" "y".."z"}
59,593, // "p"
60,593, // "v"
61,593, // "c"
62,593, // "i"
63,593, // "l"
64,593, // "o"
65,593, // "r"
66,593, // "u"
67,593, // "x"
68,593, // "b"
69,593, // "e"
70,593, // "t"
71,828, // letter128
72,503, // {199..218 231..250}
73,503, // {193..198 225..230}
75,617, // {"1".."9"}
76,135, // "0"
77,429, // digit128
78,946, // {176..185}
86,61, // "("
90,671, // "-"
  }
,
{ // state 961
79,370, // ws
80,50, // " "
81,183, // {10}
MIN_REDUCTION+80, // (default reduction)
  }
,
{ // state 962
2,664, // ws*
30,MIN_REDUCTION+139, // `[
79,86, // ws
80,101, // " "
81,902, // {10}
92,MIN_REDUCTION+139, // "["
MIN_REDUCTION+139, // (default reduction)
  }
,
{ // state 963
2,661, // ws*
30,MIN_REDUCTION+139, // `[
79,84, // ws
80,99, // " "
81,901, // {10}
92,MIN_REDUCTION+139, // "["
MIN_REDUCTION+139, // (default reduction)
  }
,
{ // state 964
0x80000000|1, // match move
0x80000000|188, // no-match move
0x80000000|31, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 965
57,478, // letter
58,48, // {"A".."Z" "a" "d" "f".."h" "j".."k" "m".."n" "q" "s" "w" "y".."z"}
59,48, // "p"
60,48, // "v"
61,48, // "c"
62,48, // "i"
63,48, // "l"
64,48, // "o"
65,48, // "r"
66,48, // "u"
67,48, // "x"
68,48, // "b"
69,48, // "e"
70,48, // "t"
71,301, // letter128
72,622, // {199..218 231..250}
73,622, // {193..198 225..230}
74,195, // digit
75,174, // {"1".."9"}
76,174, // "0"
77,287, // digit128
78,662, // {176..185}
96,724, // idChar*
97,451, // $$3
102,935, // idChar
103,910, // "_"
104,732, // idChar128
105,743, // {223}
  }
,
{ // state 966
31,355, // `]
93,424, // "]"
  }
,
};
}
public MJGrammarParseTable(MJGrammar actionObj) {
  actionObject = actionObj;
  parseTable = new int[967][];
  int doneSoFar = 0;
  doneSoFar += new Initter1().doInit(doneSoFar);
  doneSoFar += new Initter2().doInit(doneSoFar);
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
// <stmt> ::= `if `( <expr> `) <stmt>
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
(43<<16)+1,
// <expr7> ::= <expr6>
(44<<16)+1,
// <expr6> ::= <expr5>
(45<<16)+1,
// <expr5> ::= <expr4>
(46<<16)+1,
// <expr4> ::= <expr4> `+ <expr3>
(47<<16)+3,
// <expr4> ::= <expr3>
(47<<16)+1,
// <expr3> ::= <expr3> `* <expr2>
(49<<16)+3,
// <expr3> ::= <expr2>
(49<<16)+1,
// <expr2> ::= <cast expr>
(51<<16)+1,
// <expr2> ::= <unary expr>
(51<<16)+1,
// <cast expr> ::= `( <type> `) <cast expr>
(52<<16)+4,
// <cast expr> ::= `( <type> `) <expr1>
(52<<16)+4,
// <unary expr> ::= `- <unary expr>
(53<<16)+2,
// <unary expr> ::= <expr1>
(53<<16)+1,
// <expr1> ::= ID
(54<<16)+1,
// <expr1> ::= <expr1> !<empty bracket pair> `[ <expr> `]
(54<<16)+4,
// <expr1> ::= INTLIT
(54<<16)+1,
// letter ::= {"A".."Z" "a".."z"}
(57<<16)+1,
// letter128 ::= {193..218 225..250}
(71<<16)+1,
// digit ::= {"0".."9"}
(74<<16)+1,
// digit128 ::= {176..185}
(77<<16)+1,
// ws ::= " "
(79<<16)+1,
// ws ::= {10}
(79<<16)+1,
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
// `if ::= "#" "+" ws*
(39<<16)+3,
// `if ::= "#" "+"
(39<<16)+2,
// `return ::= "#" "r" "e" ws*
(84<<16)+4,
// `return ::= "#" "r" "e"
(84<<16)+3,
// `public ::= "#" "p" "u" ws*
(15<<16)+4,
// `public ::= "#" "p" "u"
(15<<16)+3,
// `* ::= "*" ws*
(50<<16)+2,
// `* ::= "*"
(50<<16)+1,
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
(55<<16)+2,
// `- ::= "-"
(55<<16)+1,
// `+ ::= "+" ws*
(48<<16)+2,
// `+ ::= "+"
(48<<16)+1,
// `= ::= "=" ws*
(42<<16)+2,
// `= ::= "="
(42<<16)+1,
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
(56<<16)+3,
// INTLIT ::= {"1".."9"} $$4
(56<<16)+2,
// INTLIT ::= digit128 ws*
(56<<16)+2,
// INTLIT ::= digit128
(56<<16)+1,
// INTLIT ::= "0" hexDigit* $$5
(56<<16)+3,
// INTLIT ::= "0" $$5
(56<<16)+2,
// idChar ::= letter
(102<<16)+1,
// idChar ::= digit
(102<<16)+1,
// idChar ::= "_"
(102<<16)+1,
// idChar128 ::= letter128
(104<<16)+1,
// idChar128 ::= digit128
(104<<16)+1,
// idChar128 ::= {223}
(104<<16)+1,
// hexDigit ::= {"0".."9" "A".."Z" "a".."z"}
(106<<16)+1,
// hexDigit128 ::= {176..185 193..198 225..230}
(107<<16)+1,
// digit* ::= digit* digit
(98<<16)+2,
// digit* ::= digit
(98<<16)+1,
// <extra param>* ::= <extra param>* <extra param>
(26<<16)+2,
// <extra param>* ::= <extra param>
(26<<16)+1,
// <decl in class>* ::= <decl in class>* <decl in class>
(108<<16)+2,
// <decl in class>* ::= <decl in class>
(108<<16)+1,
// <paramList>? ::= <paramList>
(18<<16)+1,
// <extends ID>? ::= <extends ID>
(10<<16)+1,
// hexDigit* ::= hexDigit* hexDigit
(100<<16)+2,
// hexDigit* ::= hexDigit
(100<<16)+1,
// <stmt>* ::= <stmt>* <stmt>
(36<<16)+2,
// <stmt>* ::= <stmt>
(36<<16)+1,
// idChar* ::= idChar* idChar
(96<<16)+2,
// idChar* ::= idChar
(96<<16)+1,
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
(97<<16)+2,
// $$3 ::= idChar128
(97<<16)+1,
// $$4 ::= digit128 ws*
(99<<16)+2,
// $$4 ::= digit128
(99<<16)+1,
// $$5 ::= hexDigit128 ws*
(101<<16)+2,
// $$5 ::= hexDigit128
(101<<16)+1,
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
81, // 10
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
80, // " "
-1, // "!"
-1, // '"'
82, // "#"
-1, // "$"
-1, // "%"
-1, // "&"
-1, // "'"
86, // "("
87, // ")"
85, // "*"
83, // "+"
94, // ","
90, // "-"
-1, // "."
-1, // "/"
76, // "0"
75, // "1"
75, // "2"
75, // "3"
75, // "4"
75, // "5"
75, // "6"
75, // "7"
75, // "8"
75, // "9"
-1, // ":"
95, // ";"
-1, // "<"
91, // "="
-1, // ">"
-1, // "?"
-1, // "@"
58, // "A"
58, // "B"
58, // "C"
58, // "D"
58, // "E"
58, // "F"
58, // "G"
58, // "H"
58, // "I"
58, // "J"
58, // "K"
58, // "L"
58, // "M"
58, // "N"
58, // "O"
58, // "P"
58, // "Q"
58, // "R"
58, // "S"
58, // "T"
58, // "U"
58, // "V"
58, // "W"
58, // "X"
58, // "Y"
58, // "Z"
92, // "["
-1, // "\"
93, // "]"
-1, // "^"
103, // "_"
-1, // "`"
58, // "a"
68, // "b"
61, // "c"
58, // "d"
69, // "e"
58, // "f"
58, // "g"
58, // "h"
62, // "i"
58, // "j"
58, // "k"
63, // "l"
58, // "m"
58, // "n"
64, // "o"
59, // "p"
58, // "q"
65, // "r"
58, // "s"
70, // "t"
66, // "u"
60, // "v"
58, // "w"
67, // "x"
58, // "y"
58, // "z"
88, // "{"
-1, // "|"
89, // "}"
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
78, // 176
78, // 177
78, // 178
78, // 179
78, // 180
78, // 181
78, // 182
78, // 183
78, // 184
78, // 185
-1, // 186
-1, // 187
-1, // 188
-1, // 189
-1, // 190
-1, // 191
-1, // 192
73, // 193
73, // 194
73, // 195
73, // 196
73, // 197
73, // 198
72, // 199
72, // 200
72, // 201
72, // 202
72, // 203
72, // 204
72, // 205
72, // 206
72, // 207
72, // 208
72, // 209
72, // 210
72, // 211
72, // 212
72, // 213
72, // 214
72, // 215
72, // 216
72, // 217
72, // 218
-1, // 219
-1, // 220
-1, // 221
-1, // 222
105, // 223
-1, // 224
73, // 225
73, // 226
73, // 227
73, // 228
73, // 229
73, // 230
72, // 231
72, // 232
72, // 233
72, // 234
72, // 235
72, // 236
72, // 237
72, // 238
72, // 239
72, // 240
72, // 241
72, // 242
72, // 243
72, // 244
72, // 245
72, // 246
72, // 247
72, // 248
72, // 249
72, // 250
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
"digit* ::= digit* digit", // 112
"digit* ::= digit* digit", // 113
"<extra param>* ::= <extra param>* <extra param>", // 114
"<extra param>* ::= <extra param>* <extra param>", // 115
"<decl in class>* ::= <decl in class>* <decl in class>", // 116
"<decl in class>* ::= <decl in class>* <decl in class>", // 117
"<paramList>? ::= <paramList>", // 118
"<extends ID>? ::= <extends ID>", // 119
"hexDigit* ::= hexDigit* hexDigit", // 120
"hexDigit* ::= hexDigit* hexDigit", // 121
"<stmt>* ::= <stmt>* <stmt>", // 122
"<stmt>* ::= <stmt>* <stmt>", // 123
"idChar* ::= idChar* idChar", // 124
"idChar* ::= idChar* idChar", // 125
"<class decl>+ ::= <class decl>", // 126
"<class decl>+ ::= <class decl>+ <class decl>", // 127
"ws* ::= ws* ws", // 128
"ws* ::= ws* ws", // 129
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
    { // 26: <stmt> ::= [#] `if `( <expr> `) <stmt> [#] @newIf(int,Exp,Stmt,int)=>Stmt
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
    { // 27: <assign> ::= <expr> [#] `= <expr> @assign(Exp,int,Exp)=>Stmt
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((14<<5)|0x5)/*methodCall:14*/,
    },
    { // 28: <field decl> ::= <type> [#] ID `; @fieldDecl(Type,int,String)=>Decl
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((15<<5)|0x5)/*methodCall:15*/,
    },
    { // 29: <local var decl> ::= <type> [#] ID `= <expr> @localVarDecl(Type,int,String,Exp)=>Stmt
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((16<<5)|0x5)/*methodCall:16*/,
    },
    { // 30: <expr> ::= <expr8> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 31: <expr8> ::= <expr7> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 32: <expr7> ::= <expr6> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 33: <expr6> ::= <expr5> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 34: <expr5> ::= <expr4> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 35: <expr4> ::= <expr4> [#] `+ <expr3> @newPlus(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((17<<5)|0x5)/*methodCall:17*/,
    },
    { // 36: <expr4> ::= <expr3> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 37: <expr3> ::= <expr3> [#] `* <expr2> @newTimes(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((18<<5)|0x5)/*methodCall:18*/,
    },
    { // 38: <expr3> ::= <expr2> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 39: <expr2> ::= <cast expr> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 40: <expr2> ::= <unary expr> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 41: <cast expr> ::= [#] `( <type> `) <cast expr> @newCast(int,Type,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((19<<5)|0x5)/*methodCall:19*/,
    },
    { // 42: <cast expr> ::= [#] `( <type> `) <expr1> @newCast(int,Type,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((19<<5)|0x5)/*methodCall:19*/,
    },
    { // 43: <unary expr> ::= [#] `- <unary expr> @newUnaryMinus(int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((20<<5)|0x5)/*methodCall:20*/,
    },
    { // 44: <unary expr> ::= <expr1> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 45: <expr1> ::= [#] ID @newIDExp(int,String)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((21<<5)|0x5)/*methodCall:21*/,
    },
    { // 46: <expr1> ::= <expr1> !<empty bracket pair> [#] `[ <expr> `] @newArrayLookup(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((22<<5)|0x5)/*methodCall:22*/,
    },
    { // 47: <expr1> ::= [#] INTLIT @newIntLit(int,int)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((23<<5)|0x5)/*methodCall:23*/,
    },
    { // 48: letter ::= {"A".."Z" "a".."z"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 49: letter128 ::= {193..218 225..250} @sub128(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((24<<5)|0x5)/*methodCall:24*/,
    },
    { // 50: digit ::= {"0".."9"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 51: digit128 ::= {176..185} @sub128(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((24<<5)|0x5)/*methodCall:24*/,
    },
    { // 52: ws ::= " " @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 53: ws ::= {10} [registerNewline] @void
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 54: `boolean ::= "#" "b" "o" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 55: `boolean ::= "#" "b" "o" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 56: `class ::= "#" "c" "l" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 57: `class ::= "#" "c" "l" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 58: `extends ::= "#" "e" "x" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 59: `extends ::= "#" "e" "x" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 60: `void ::= "#" "v" "o" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 61: `void ::= "#" "v" "o" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 62: `int ::= "#" "i" "t" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 63: `int ::= "#" "i" "t" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 64: `if ::= "#" "+" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 65: `if ::= "#" "+" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 66: `return ::= "#" "r" "e" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 67: `return ::= "#" "r" "e" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 68: `public ::= "#" "p" "u" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 69: `public ::= "#" "p" "u" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 70: `* ::= "*" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 71: `* ::= "*" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 72: `( ::= "(" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 73: `( ::= "(" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 74: `) ::= ")" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 75: `) ::= ")" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 76: `{ ::= "{" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 77: `{ ::= "{" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 78: `} ::= "}" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 79: `} ::= "}" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 80: `- ::= "-" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 81: `- ::= "-" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 82: `+ ::= "+" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 83: `+ ::= "+" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 84: `= ::= "=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 85: `= ::= "=" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 86: `[ ::= "[" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 87: `[ ::= "[" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 88: `] ::= "]" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 89: `] ::= "]" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 90: `, ::= "," ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 91: `, ::= "," [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 92: `; ::= ";" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 93: `; ::= ";" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 94: ID ::= letter128 ws* @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x4)/*stringConcat:1*/,
    },
    { // 95: ID ::= letter128 [ws*] @text
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x4)/*stringConcat:1*/,
    },
    { // 96: ID ::= letter idChar* $$3 @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x4)/*stringConcat:3*/,
    },
    { // 97: ID ::= letter [idChar*] $$3 @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x4)/*stringConcat:3*/,
    },
    { // 98: INTLIT ::= {"1".."9"} digit* $$4 @convertToInt(char,List<Character>,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((25<<5)|0x5)/*methodCall:25*/,
    },
    { // 99: INTLIT ::= {"1".."9"} [digit*] $$4 @convertToInt(char,List<Character>,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((25<<5)|0x5)/*methodCall:25*/,
    },
    { // 100: INTLIT ::= digit128 ws* @convertToInt(char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((26<<5)|0x5)/*methodCall:26*/,
    },
    { // 101: INTLIT ::= digit128 [ws*] @convertToInt(char)=>int
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((26<<5)|0x5)/*methodCall:26*/,
    },
    { // 102: INTLIT ::= "0" hexDigit* $$5 @convert16ToInt(char,List<Character>,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((27<<5)|0x5)/*methodCall:27*/,
    },
    { // 103: INTLIT ::= "0" [hexDigit*] $$5 @convert16ToInt(char,List<Character>,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((27<<5)|0x5)/*methodCall:27*/,
    },
    { // 104: idChar ::= letter @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 105: idChar ::= digit @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 106: idChar ::= "_" @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 107: idChar128 ::= letter128 @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 108: idChar128 ::= digit128 @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 109: idChar128 ::= {223} @underscore(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((28<<5)|0x5)/*methodCall:28*/,
    },
    { // 110: hexDigit ::= {"0".."9" "A".."Z" "a".."z"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 111: hexDigit128 ::= {176..185 193..198 225..230} @sub128(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((24<<5)|0x5)/*methodCall:24*/,
    },
    { // 112: digit* ::= digit* digit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 113: digit* ::= [digit*] digit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 114: <extra param>* ::= <extra param>* <extra param> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 115: <extra param>* ::= [<extra param>*] <extra param> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 116: <decl in class>* ::= <decl in class>* <decl in class> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 117: <decl in class>* ::= [<decl in class>*] <decl in class> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 118: <paramList>? ::= <paramList> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 119: <extends ID>? ::= <extends ID> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 120: hexDigit* ::= hexDigit* hexDigit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 121: hexDigit* ::= [hexDigit*] hexDigit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 122: <stmt>* ::= <stmt>* <stmt> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 123: <stmt>* ::= [<stmt>*] <stmt> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 124: idChar* ::= idChar* idChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 125: idChar* ::= [idChar*] idChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 126: <class decl>+ ::= <class decl> @singleList
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xa)/*singleList:1*/,
    },
    { // 127: <class decl>+ ::= <class decl>+ <class decl> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 128: ws* ::= ws* ws @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 129: ws* ::= [ws*] ws @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
    },
    { // 130: $$0 ::= `{ <decl in class>* `} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 131: $$0 ::= `{ [<decl in class>*] `} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 132: $$1 ::= `) `{ <stmt>* `} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 133: $$1 ::= `) `{ [<stmt>*] `} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 134: $$2 ::= `) `{ <stmt>* `return <expr> `; `} @pass
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
    { // 135: $$2 ::= `) `{ [<stmt>*] `return <expr> `; `} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 136: $$3 ::= idChar128 ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 137: $$3 ::= idChar128 [ws*] @pass
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 138: $$4 ::= digit128 ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 139: $$4 ::= digit128 [ws*] @pass
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 140: $$5 ::= hexDigit128 ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 141: $$5 ::= hexDigit128 [ws*] @pass
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
      ((29<<5)|0x5)/*methodCall:29*/,
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
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Stmt result = actionObject.assign(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 15: {
      Type parm0 = (Type)si.popPb();
      int parm1 = (Integer)si.popPb();
      String parm2 = (String)si.popPb();
      Decl result = actionObject.fieldDecl(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 16: {
      Type parm0 = (Type)si.popPb();
      int parm1 = (Integer)si.popPb();
      String parm2 = (String)si.popPb();
      Exp parm3 = (Exp)si.popPb();
      Stmt result = actionObject.localVarDecl(parm0,parm1,parm2,parm3);
      si.pushPb(result);
    }
    break;
    case 17: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newPlus(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 18: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newTimes(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 19: {
      int parm0 = (Integer)si.popPb();
      Type parm1 = (Type)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newCast(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 20: {
      int parm0 = (Integer)si.popPb();
      Exp parm1 = (Exp)si.popPb();
      Exp result = actionObject.newUnaryMinus(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 21: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      Exp result = actionObject.newIDExp(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 22: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newArrayLookup(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 23: {
      int parm0 = (Integer)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp result = actionObject.newIntLit(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 24: {
      char parm0 = (Character)si.popPb();
      char result = actionObject.sub128(parm0);
      si.pushPb(result);
    }
    break;
    case 25: {
      char parm0 = (Character)si.popPb();
      List<Character> parm1 = (List<Character>)si.popPb();
      char parm2 = (Character)si.popPb();
      int result = actionObject.convertToInt(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 26: {
      char parm0 = (Character)si.popPb();
      int result = actionObject.convertToInt(parm0);
      si.pushPb(result);
    }
    break;
    case 27: {
      char parm0 = (Character)si.popPb();
      List<Character> parm1 = (List<Character>)si.popPb();
      char parm2 = (Character)si.popPb();
      int result = actionObject.convert16ToInt(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 28: {
      char parm0 = (Character)si.popPb();
      char result = actionObject.underscore(parm0);
      si.pushPb(result);
    }
    break;
    case 29: {
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
