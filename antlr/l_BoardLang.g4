lexer grammar l_BoardLang;

// Slowa kluczowe

IF_T: 'if';
OTHERIF_T: 'otherif';
OTHERWISE_T: 'otherwise';
AS_T: 'as';
LONG_T: 'long';
FOR_T: 'for';
FUNCTION_T: 'FUNCTION';
RETURN_T: 'return';
DRAW_T: 'draw';
HERE_T: 'here';
RESET_T: 'reset';
SETPOS: 'setpos';
BOARDSIZE_T: 'board_size';
BREAK: 'break';
CONTINUE: 'continue';

CONST: 'CONST';
TT: 'TileType';
INT_T: 'INT';
BOOL_T: 'BOOL';
CHAR_T: 'CHAR';
STRING_T: 'STRING';
COLOUR_T: 'COLOUR';
ARRAY_T: 'ARRAY';

//Opearatory
PLUS: '+';
MINUS: '-';
DIVIDE: '/';
MOD: '%';
MULTIPLY: '*';
LEFT_PAR: '(';
RIGHT_PAR: ')';
LEFT_SQUARE_PAR: '[';
RIGHT_SQUARE_PAR: ']';
LEFT_CLAMP_PAR: '{';
RIGHT_CLAMP_PAR: '}';
GT: '>';
LT: '<';
EQ: '=';
CHECK_EQ: '==';
NOT_EQ: '!=';
GTOREQ: '>=';
LTOREQ: '<=';
OR_T: 'OR';
AND_T: 'AND';
NOT_T: 'NOT';
PLUSPLUS: '++';
MINUSMINUS: '--';
COLON: ':';
QUOT_SINGLE: '\'';
QUOT_DOUBLE: '“';
COMA: ',';
END_M: '$';

// Literaly i identyfikatory

INT_V : DIGIT+ ;
fragment DIGIT : [0-9] ;
BOOL_V: 'TRUE' | 'FALSE';
STRING_V: (CHAR_V)*;
CHAR_V: [0-9a-zA-Z ] ;
COLOUR_V:'#'([0-9A-F]){6};
ID: [A-Za-z_]([A-Za-z0-9_\-])*;

//Komentarze
WS: [ \t\r\n]+ -> skip;
COMMENT: '#';