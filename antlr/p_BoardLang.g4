parser grammar p_BoardLang;

options {
    tokenVocab = l_BoardLang;
}

program: board_size_definition (out_instructions)+;

literal: INT_V | BOOL_V | STRING_V | CHAR_V | COLOUR_V;

var_types: INT_T | BOOL_T | CHAR_T | STRING_T | COLOUR_T;

rel_operator: CHECK_EQ | NOT_EQ | GTOREQ | LTOREQ;
math_operator: PLUS | MINUS | DIVIDE | MOD | MULTIPLY;

//Expressions
expr: bool_expr | math_expr;
bool_expr: bool_expr AND_T bool_expr | bool_expr OR_T bool_expr | NOT bool_expr | math_expr rel_operator math_expr | LEFT_PAR bool_expr RIGHT_PAR;
math_expr: LEFT_PAR math_expr RIGHT_PAR | math_expr math_operator math_expr | literal | ID | function_call;

//Instructions

out_instructions: instructions | function_def;
instructions: instructions instructions | declaration END_M | declaration_with_assign END_M | tile_decl_w_ass END_M | assignment END_M | function_call END_M | board_instr END_M | if_instr | for_loop | as_long_as_loop;

// Declaration and definition

declaration: CONST? var_types (LEFT_SQUARE_PAR INT_V RIGHT_SQUARE_PAR)? ID;

declaration_with_assign: CONST? var_types ID 	EQ expr |  CONST? var_types LEFT_SQUARE_PAR INT_V RIGHT_SQUARE_PAR ID EQ args_list;
tile_decl_w_ass: CONST? TT ID EQ TT LEFT_PAR tt_arg RIGHT_PAR;
tt_arg: COLOR_V | STRING_V;

assignment: ID EQ expr | ID LEFT_SQUARE_PAR
 DIGIT RIGHT_SQUARE_PAR
 EQ expr;

// Help
args_list: ID | literal | args_list COMA args_list;

//Board instructions

board_size_definition: BOARDSIZE_T LEFT_SQUARE_PAR id_and_int COLON id_and_int RIGHT_SQUARE_PAR;

board_instr: draw_instr | RESET_T | setpos_instr;

draw_instr: DRAW_T LEFT_SQUARE_PAR draw_args RIGHT_SQUARE_PAR ID;
draw_args: HERE_T | id_and_int COLON id_and_int;

setpos_instr: SETPOS LEFT_SQUARE_PAR id_and_int COLON id_and_int RIGHT_SQUARE_PAR;

// Conditionals

if_instr: if_then_statement | if_then_otherwise_statement;

if_then_statement: IF_T LEFT_PAR expr RIGHT_PAR LEFT_CLAMP_PAR instructions RIGHT_CLAMP_PAR;

if_then_otherwise_statement:  IF_T LEFT_PAR expr RIGHT_PAR LEFT_CLAMP_PAR instructions RIGHT_CLAMP_PAR (otherif_statement)? (OTHERWISE_T LEFT_CLAMP_PAR instructions RIGHT_CLAMP_PAR)?;

otherif_statement: OTHERIF_T LEFT_PAR expr RIGHT_PAR LEFT_CLAMP_PAR instructions RIGHT_CLAMP_PAR | otherif_statement otherif_statement ; // pomocnicza do if

if_inside_loop_statement: IF_T LEFT_PAR expr RIGHT_PAR LEFT_CLAMP_PAR (instructions | BREAK | CONTINUE) RIGHT_CLAMP_PAR
(OTHERIF_T LEFT_PAR expr RIGHT_PAR LEFT_CLAMP_PAR (instructions | BREAK | CONTINUE) RIGHT_CLAMP_PAR)*(OTHERWISE_T LEFT_CLAMP_PAR (instructions | BREAK | CONTINUE) RIGHT_CLAMP_PAR)?;
//Loops

for_loop: FOR_T LEFT_PAR id_and_int COLON id_and_int COLON id_and_int RIGHT_PAR LEFT_CLAMP_PAR inside_loop RIGHT_CLAMP_PAR;
id_and_int: ID | INT_V;
inside_loop: instructions | if_inside_loop_statement | inside_loop inside_loop;

as_long_as_loop: AS_T LONG_T AS_T LEFT_PAR expr RIGHT_PAR LEFT_CLAMP_PAR instructions RIGHT_CLAMP_PAR;

//Functions

function_def: FUNCTION_T ID LEFT_PAR function_declaration_args RIGHT_PAR LEFT_CLAMP_PAR instructions
RIGHT_CLAMP_PAR;
function_declaration_args: var_types ID | function_declaration_args COMA function_declaration_args;

function_call: ID LEFT_PAR args_list RIGHT_PAR | ID LEFT_PAR RIGHT_PAR;

