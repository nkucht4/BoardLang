// Generated from C:/Users/kucht/Documents/Studia/Rok2/S4/Kompilatory/Projekt/BoardLang/antlr/p_BoardLang.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link p_BoardLang}.
 */
public interface p_BoardLangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link p_BoardLang#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(p_BoardLang.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link p_BoardLang#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(p_BoardLang.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link p_BoardLang#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(p_BoardLang.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link p_BoardLang#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(p_BoardLang.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link p_BoardLang#var_types}.
	 * @param ctx the parse tree
	 */
	void enterVar_types(p_BoardLang.Var_typesContext ctx);
	/**
	 * Exit a parse tree produced by {@link p_BoardLang#var_types}.
	 * @param ctx the parse tree
	 */
	void exitVar_types(p_BoardLang.Var_typesContext ctx);
	/**
	 * Enter a parse tree produced by {@link p_BoardLang#rel_operator}.
	 * @param ctx the parse tree
	 */
	void enterRel_operator(p_BoardLang.Rel_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link p_BoardLang#rel_operator}.
	 * @param ctx the parse tree
	 */
	void exitRel_operator(p_BoardLang.Rel_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link p_BoardLang#math_operator}.
	 * @param ctx the parse tree
	 */
	void enterMath_operator(p_BoardLang.Math_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link p_BoardLang#math_operator}.
	 * @param ctx the parse tree
	 */
	void exitMath_operator(p_BoardLang.Math_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link p_BoardLang#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(p_BoardLang.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link p_BoardLang#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(p_BoardLang.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link p_BoardLang#bool_expr}.
	 * @param ctx the parse tree
	 */
	void enterBool_expr(p_BoardLang.Bool_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link p_BoardLang#bool_expr}.
	 * @param ctx the parse tree
	 */
	void exitBool_expr(p_BoardLang.Bool_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link p_BoardLang#math_expr}.
	 * @param ctx the parse tree
	 */
	void enterMath_expr(p_BoardLang.Math_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link p_BoardLang#math_expr}.
	 * @param ctx the parse tree
	 */
	void exitMath_expr(p_BoardLang.Math_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link p_BoardLang#out_instructions}.
	 * @param ctx the parse tree
	 */
	void enterOut_instructions(p_BoardLang.Out_instructionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link p_BoardLang#out_instructions}.
	 * @param ctx the parse tree
	 */
	void exitOut_instructions(p_BoardLang.Out_instructionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link p_BoardLang#instructions}.
	 * @param ctx the parse tree
	 */
	void enterInstructions(p_BoardLang.InstructionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link p_BoardLang#instructions}.
	 * @param ctx the parse tree
	 */
	void exitInstructions(p_BoardLang.InstructionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link p_BoardLang#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(p_BoardLang.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link p_BoardLang#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(p_BoardLang.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link p_BoardLang#declaration_with_assign}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration_with_assign(p_BoardLang.Declaration_with_assignContext ctx);
	/**
	 * Exit a parse tree produced by {@link p_BoardLang#declaration_with_assign}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration_with_assign(p_BoardLang.Declaration_with_assignContext ctx);
	/**
	 * Enter a parse tree produced by {@link p_BoardLang#tile_decl_w_ass}.
	 * @param ctx the parse tree
	 */
	void enterTile_decl_w_ass(p_BoardLang.Tile_decl_w_assContext ctx);
	/**
	 * Exit a parse tree produced by {@link p_BoardLang#tile_decl_w_ass}.
	 * @param ctx the parse tree
	 */
	void exitTile_decl_w_ass(p_BoardLang.Tile_decl_w_assContext ctx);
	/**
	 * Enter a parse tree produced by {@link p_BoardLang#tt_arg}.
	 * @param ctx the parse tree
	 */
	void enterTt_arg(p_BoardLang.Tt_argContext ctx);
	/**
	 * Exit a parse tree produced by {@link p_BoardLang#tt_arg}.
	 * @param ctx the parse tree
	 */
	void exitTt_arg(p_BoardLang.Tt_argContext ctx);
	/**
	 * Enter a parse tree produced by {@link p_BoardLang#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(p_BoardLang.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link p_BoardLang#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(p_BoardLang.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link p_BoardLang#args_list}.
	 * @param ctx the parse tree
	 */
	void enterArgs_list(p_BoardLang.Args_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link p_BoardLang#args_list}.
	 * @param ctx the parse tree
	 */
	void exitArgs_list(p_BoardLang.Args_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link p_BoardLang#board_size_definition}.
	 * @param ctx the parse tree
	 */
	void enterBoard_size_definition(p_BoardLang.Board_size_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link p_BoardLang#board_size_definition}.
	 * @param ctx the parse tree
	 */
	void exitBoard_size_definition(p_BoardLang.Board_size_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link p_BoardLang#board_instr}.
	 * @param ctx the parse tree
	 */
	void enterBoard_instr(p_BoardLang.Board_instrContext ctx);
	/**
	 * Exit a parse tree produced by {@link p_BoardLang#board_instr}.
	 * @param ctx the parse tree
	 */
	void exitBoard_instr(p_BoardLang.Board_instrContext ctx);
	/**
	 * Enter a parse tree produced by {@link p_BoardLang#draw_instr}.
	 * @param ctx the parse tree
	 */
	void enterDraw_instr(p_BoardLang.Draw_instrContext ctx);
	/**
	 * Exit a parse tree produced by {@link p_BoardLang#draw_instr}.
	 * @param ctx the parse tree
	 */
	void exitDraw_instr(p_BoardLang.Draw_instrContext ctx);
	/**
	 * Enter a parse tree produced by {@link p_BoardLang#draw_args}.
	 * @param ctx the parse tree
	 */
	void enterDraw_args(p_BoardLang.Draw_argsContext ctx);
	/**
	 * Exit a parse tree produced by {@link p_BoardLang#draw_args}.
	 * @param ctx the parse tree
	 */
	void exitDraw_args(p_BoardLang.Draw_argsContext ctx);
	/**
	 * Enter a parse tree produced by {@link p_BoardLang#setpos_instr}.
	 * @param ctx the parse tree
	 */
	void enterSetpos_instr(p_BoardLang.Setpos_instrContext ctx);
	/**
	 * Exit a parse tree produced by {@link p_BoardLang#setpos_instr}.
	 * @param ctx the parse tree
	 */
	void exitSetpos_instr(p_BoardLang.Setpos_instrContext ctx);
	/**
	 * Enter a parse tree produced by {@link p_BoardLang#if_instr}.
	 * @param ctx the parse tree
	 */
	void enterIf_instr(p_BoardLang.If_instrContext ctx);
	/**
	 * Exit a parse tree produced by {@link p_BoardLang#if_instr}.
	 * @param ctx the parse tree
	 */
	void exitIf_instr(p_BoardLang.If_instrContext ctx);
	/**
	 * Enter a parse tree produced by {@link p_BoardLang#if_then_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_then_statement(p_BoardLang.If_then_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link p_BoardLang#if_then_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_then_statement(p_BoardLang.If_then_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link p_BoardLang#if_then_otherwise_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_then_otherwise_statement(p_BoardLang.If_then_otherwise_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link p_BoardLang#if_then_otherwise_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_then_otherwise_statement(p_BoardLang.If_then_otherwise_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link p_BoardLang#otherif_statement}.
	 * @param ctx the parse tree
	 */
	void enterOtherif_statement(p_BoardLang.Otherif_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link p_BoardLang#otherif_statement}.
	 * @param ctx the parse tree
	 */
	void exitOtherif_statement(p_BoardLang.Otherif_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link p_BoardLang#if_inside_loop_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_inside_loop_statement(p_BoardLang.If_inside_loop_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link p_BoardLang#if_inside_loop_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_inside_loop_statement(p_BoardLang.If_inside_loop_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link p_BoardLang#for_loop}.
	 * @param ctx the parse tree
	 */
	void enterFor_loop(p_BoardLang.For_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link p_BoardLang#for_loop}.
	 * @param ctx the parse tree
	 */
	void exitFor_loop(p_BoardLang.For_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link p_BoardLang#id_and_int}.
	 * @param ctx the parse tree
	 */
	void enterId_and_int(p_BoardLang.Id_and_intContext ctx);
	/**
	 * Exit a parse tree produced by {@link p_BoardLang#id_and_int}.
	 * @param ctx the parse tree
	 */
	void exitId_and_int(p_BoardLang.Id_and_intContext ctx);
	/**
	 * Enter a parse tree produced by {@link p_BoardLang#inside_loop}.
	 * @param ctx the parse tree
	 */
	void enterInside_loop(p_BoardLang.Inside_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link p_BoardLang#inside_loop}.
	 * @param ctx the parse tree
	 */
	void exitInside_loop(p_BoardLang.Inside_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link p_BoardLang#as_long_as_loop}.
	 * @param ctx the parse tree
	 */
	void enterAs_long_as_loop(p_BoardLang.As_long_as_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link p_BoardLang#as_long_as_loop}.
	 * @param ctx the parse tree
	 */
	void exitAs_long_as_loop(p_BoardLang.As_long_as_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link p_BoardLang#function_def}.
	 * @param ctx the parse tree
	 */
	void enterFunction_def(p_BoardLang.Function_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link p_BoardLang#function_def}.
	 * @param ctx the parse tree
	 */
	void exitFunction_def(p_BoardLang.Function_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link p_BoardLang#function_declaration_args}.
	 * @param ctx the parse tree
	 */
	void enterFunction_declaration_args(p_BoardLang.Function_declaration_argsContext ctx);
	/**
	 * Exit a parse tree produced by {@link p_BoardLang#function_declaration_args}.
	 * @param ctx the parse tree
	 */
	void exitFunction_declaration_args(p_BoardLang.Function_declaration_argsContext ctx);
	/**
	 * Enter a parse tree produced by {@link p_BoardLang#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call(p_BoardLang.Function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link p_BoardLang#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call(p_BoardLang.Function_callContext ctx);
}