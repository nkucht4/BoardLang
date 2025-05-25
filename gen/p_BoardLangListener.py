# Generated from C:/Users/DELL/PycharmProjects/BoardLang/antlr/p_BoardLang.g4 by ANTLR 4.13.2
from antlr4 import *
if "." in __name__:
    from .p_BoardLang import p_BoardLang
else:
    from p_BoardLang import p_BoardLang

# This class defines a complete listener for a parse tree produced by p_BoardLang.
class p_BoardLangListener(ParseTreeListener):

    # Enter a parse tree produced by p_BoardLang#program.
    def enterProgram(self, ctx:p_BoardLang.ProgramContext):
        pass

    # Exit a parse tree produced by p_BoardLang#program.
    def exitProgram(self, ctx:p_BoardLang.ProgramContext):
        pass


    # Enter a parse tree produced by p_BoardLang#board_size_definition.
    def enterBoard_size_definition(self, ctx:p_BoardLang.Board_size_definitionContext):
        pass

    # Exit a parse tree produced by p_BoardLang#board_size_definition.
    def exitBoard_size_definition(self, ctx:p_BoardLang.Board_size_definitionContext):
        pass


    # Enter a parse tree produced by p_BoardLang#out_instructions.
    def enterOut_instructions(self, ctx:p_BoardLang.Out_instructionsContext):
        pass

    # Exit a parse tree produced by p_BoardLang#out_instructions.
    def exitOut_instructions(self, ctx:p_BoardLang.Out_instructionsContext):
        pass


    # Enter a parse tree produced by p_BoardLang#instructions.
    def enterInstructions(self, ctx:p_BoardLang.InstructionsContext):
        pass

    # Exit a parse tree produced by p_BoardLang#instructions.
    def exitInstructions(self, ctx:p_BoardLang.InstructionsContext):
        pass


    # Enter a parse tree produced by p_BoardLang#function_def.
    def enterFunction_def(self, ctx:p_BoardLang.Function_defContext):
        pass

    # Exit a parse tree produced by p_BoardLang#function_def.
    def exitFunction_def(self, ctx:p_BoardLang.Function_defContext):
        pass


    # Enter a parse tree produced by p_BoardLang#function_declaration_args.
    def enterFunction_declaration_args(self, ctx:p_BoardLang.Function_declaration_argsContext):
        pass

    # Exit a parse tree produced by p_BoardLang#function_declaration_args.
    def exitFunction_declaration_args(self, ctx:p_BoardLang.Function_declaration_argsContext):
        pass


    # Enter a parse tree produced by p_BoardLang#function_instr.
    def enterFunction_instr(self, ctx:p_BoardLang.Function_instrContext):
        pass

    # Exit a parse tree produced by p_BoardLang#function_instr.
    def exitFunction_instr(self, ctx:p_BoardLang.Function_instrContext):
        pass


    # Enter a parse tree produced by p_BoardLang#return_expr.
    def enterReturn_expr(self, ctx:p_BoardLang.Return_exprContext):
        pass

    # Exit a parse tree produced by p_BoardLang#return_expr.
    def exitReturn_expr(self, ctx:p_BoardLang.Return_exprContext):
        pass


    # Enter a parse tree produced by p_BoardLang#function_call.
    def enterFunction_call(self, ctx:p_BoardLang.Function_callContext):
        pass

    # Exit a parse tree produced by p_BoardLang#function_call.
    def exitFunction_call(self, ctx:p_BoardLang.Function_callContext):
        pass


    # Enter a parse tree produced by p_BoardLang#declaration.
    def enterDeclaration(self, ctx:p_BoardLang.DeclarationContext):
        pass

    # Exit a parse tree produced by p_BoardLang#declaration.
    def exitDeclaration(self, ctx:p_BoardLang.DeclarationContext):
        pass


    # Enter a parse tree produced by p_BoardLang#declaration_with_assign.
    def enterDeclaration_with_assign(self, ctx:p_BoardLang.Declaration_with_assignContext):
        pass

    # Exit a parse tree produced by p_BoardLang#declaration_with_assign.
    def exitDeclaration_with_assign(self, ctx:p_BoardLang.Declaration_with_assignContext):
        pass


    # Enter a parse tree produced by p_BoardLang#tile_decl_w_ass.
    def enterTile_decl_w_ass(self, ctx:p_BoardLang.Tile_decl_w_assContext):
        pass

    # Exit a parse tree produced by p_BoardLang#tile_decl_w_ass.
    def exitTile_decl_w_ass(self, ctx:p_BoardLang.Tile_decl_w_assContext):
        pass


    # Enter a parse tree produced by p_BoardLang#assignment.
    def enterAssignment(self, ctx:p_BoardLang.AssignmentContext):
        pass

    # Exit a parse tree produced by p_BoardLang#assignment.
    def exitAssignment(self, ctx:p_BoardLang.AssignmentContext):
        pass


    # Enter a parse tree produced by p_BoardLang#tt_arg.
    def enterTt_arg(self, ctx:p_BoardLang.Tt_argContext):
        pass

    # Exit a parse tree produced by p_BoardLang#tt_arg.
    def exitTt_arg(self, ctx:p_BoardLang.Tt_argContext):
        pass


    # Enter a parse tree produced by p_BoardLang#expr.
    def enterExpr(self, ctx:p_BoardLang.ExprContext):
        pass

    # Exit a parse tree produced by p_BoardLang#expr.
    def exitExpr(self, ctx:p_BoardLang.ExprContext):
        pass


    # Enter a parse tree produced by p_BoardLang#bool_expr.
    def enterBool_expr(self, ctx:p_BoardLang.Bool_exprContext):
        pass

    # Exit a parse tree produced by p_BoardLang#bool_expr.
    def exitBool_expr(self, ctx:p_BoardLang.Bool_exprContext):
        pass


    # Enter a parse tree produced by p_BoardLang#math_expr.
    def enterMath_expr(self, ctx:p_BoardLang.Math_exprContext):
        pass

    # Exit a parse tree produced by p_BoardLang#math_expr.
    def exitMath_expr(self, ctx:p_BoardLang.Math_exprContext):
        pass


    # Enter a parse tree produced by p_BoardLang#board_instr.
    def enterBoard_instr(self, ctx:p_BoardLang.Board_instrContext):
        pass

    # Exit a parse tree produced by p_BoardLang#board_instr.
    def exitBoard_instr(self, ctx:p_BoardLang.Board_instrContext):
        pass


    # Enter a parse tree produced by p_BoardLang#draw_instr.
    def enterDraw_instr(self, ctx:p_BoardLang.Draw_instrContext):
        pass

    # Exit a parse tree produced by p_BoardLang#draw_instr.
    def exitDraw_instr(self, ctx:p_BoardLang.Draw_instrContext):
        pass


    # Enter a parse tree produced by p_BoardLang#draw_args.
    def enterDraw_args(self, ctx:p_BoardLang.Draw_argsContext):
        pass

    # Exit a parse tree produced by p_BoardLang#draw_args.
    def exitDraw_args(self, ctx:p_BoardLang.Draw_argsContext):
        pass


    # Enter a parse tree produced by p_BoardLang#setpos_instr.
    def enterSetpos_instr(self, ctx:p_BoardLang.Setpos_instrContext):
        pass

    # Exit a parse tree produced by p_BoardLang#setpos_instr.
    def exitSetpos_instr(self, ctx:p_BoardLang.Setpos_instrContext):
        pass


    # Enter a parse tree produced by p_BoardLang#if_instr.
    def enterIf_instr(self, ctx:p_BoardLang.If_instrContext):
        pass

    # Exit a parse tree produced by p_BoardLang#if_instr.
    def exitIf_instr(self, ctx:p_BoardLang.If_instrContext):
        pass


    # Enter a parse tree produced by p_BoardLang#if_inside_loop_statement.
    def enterIf_inside_loop_statement(self, ctx:p_BoardLang.If_inside_loop_statementContext):
        pass

    # Exit a parse tree produced by p_BoardLang#if_inside_loop_statement.
    def exitIf_inside_loop_statement(self, ctx:p_BoardLang.If_inside_loop_statementContext):
        pass


    # Enter a parse tree produced by p_BoardLang#for_loop.
    def enterFor_loop(self, ctx:p_BoardLang.For_loopContext):
        pass

    # Exit a parse tree produced by p_BoardLang#for_loop.
    def exitFor_loop(self, ctx:p_BoardLang.For_loopContext):
        pass


    # Enter a parse tree produced by p_BoardLang#as_long_as_loop.
    def enterAs_long_as_loop(self, ctx:p_BoardLang.As_long_as_loopContext):
        pass

    # Exit a parse tree produced by p_BoardLang#as_long_as_loop.
    def exitAs_long_as_loop(self, ctx:p_BoardLang.As_long_as_loopContext):
        pass


    # Enter a parse tree produced by p_BoardLang#inside_loop.
    def enterInside_loop(self, ctx:p_BoardLang.Inside_loopContext):
        pass

    # Exit a parse tree produced by p_BoardLang#inside_loop.
    def exitInside_loop(self, ctx:p_BoardLang.Inside_loopContext):
        pass


    # Enter a parse tree produced by p_BoardLang#break_instruction.
    def enterBreak_instruction(self, ctx:p_BoardLang.Break_instructionContext):
        pass

    # Exit a parse tree produced by p_BoardLang#break_instruction.
    def exitBreak_instruction(self, ctx:p_BoardLang.Break_instructionContext):
        pass


    # Enter a parse tree produced by p_BoardLang#if_inside_functions_statement.
    def enterIf_inside_functions_statement(self, ctx:p_BoardLang.If_inside_functions_statementContext):
        pass

    # Exit a parse tree produced by p_BoardLang#if_inside_functions_statement.
    def exitIf_inside_functions_statement(self, ctx:p_BoardLang.If_inside_functions_statementContext):
        pass


    # Enter a parse tree produced by p_BoardLang#for_loop_inside_function.
    def enterFor_loop_inside_function(self, ctx:p_BoardLang.For_loop_inside_functionContext):
        pass

    # Exit a parse tree produced by p_BoardLang#for_loop_inside_function.
    def exitFor_loop_inside_function(self, ctx:p_BoardLang.For_loop_inside_functionContext):
        pass


    # Enter a parse tree produced by p_BoardLang#as_long_as_loop_inside_function.
    def enterAs_long_as_loop_inside_function(self, ctx:p_BoardLang.As_long_as_loop_inside_functionContext):
        pass

    # Exit a parse tree produced by p_BoardLang#as_long_as_loop_inside_function.
    def exitAs_long_as_loop_inside_function(self, ctx:p_BoardLang.As_long_as_loop_inside_functionContext):
        pass


    # Enter a parse tree produced by p_BoardLang#instr_inside_loop_inside_fun.
    def enterInstr_inside_loop_inside_fun(self, ctx:p_BoardLang.Instr_inside_loop_inside_funContext):
        pass

    # Exit a parse tree produced by p_BoardLang#instr_inside_loop_inside_fun.
    def exitInstr_inside_loop_inside_fun(self, ctx:p_BoardLang.Instr_inside_loop_inside_funContext):
        pass


    # Enter a parse tree produced by p_BoardLang#if_inside_loop_inside_fun_statement.
    def enterIf_inside_loop_inside_fun_statement(self, ctx:p_BoardLang.If_inside_loop_inside_fun_statementContext):
        pass

    # Exit a parse tree produced by p_BoardLang#if_inside_loop_inside_fun_statement.
    def exitIf_inside_loop_inside_fun_statement(self, ctx:p_BoardLang.If_inside_loop_inside_fun_statementContext):
        pass


    # Enter a parse tree produced by p_BoardLang#args_list.
    def enterArgs_list(self, ctx:p_BoardLang.Args_listContext):
        pass

    # Exit a parse tree produced by p_BoardLang#args_list.
    def exitArgs_list(self, ctx:p_BoardLang.Args_listContext):
        pass


    # Enter a parse tree produced by p_BoardLang#literal.
    def enterLiteral(self, ctx:p_BoardLang.LiteralContext):
        pass

    # Exit a parse tree produced by p_BoardLang#literal.
    def exitLiteral(self, ctx:p_BoardLang.LiteralContext):
        pass


    # Enter a parse tree produced by p_BoardLang#var_types.
    def enterVar_types(self, ctx:p_BoardLang.Var_typesContext):
        pass

    # Exit a parse tree produced by p_BoardLang#var_types.
    def exitVar_types(self, ctx:p_BoardLang.Var_typesContext):
        pass


    # Enter a parse tree produced by p_BoardLang#rel_operator.
    def enterRel_operator(self, ctx:p_BoardLang.Rel_operatorContext):
        pass

    # Exit a parse tree produced by p_BoardLang#rel_operator.
    def exitRel_operator(self, ctx:p_BoardLang.Rel_operatorContext):
        pass


    # Enter a parse tree produced by p_BoardLang#math_operator.
    def enterMath_operator(self, ctx:p_BoardLang.Math_operatorContext):
        pass

    # Exit a parse tree produced by p_BoardLang#math_operator.
    def exitMath_operator(self, ctx:p_BoardLang.Math_operatorContext):
        pass



del p_BoardLang