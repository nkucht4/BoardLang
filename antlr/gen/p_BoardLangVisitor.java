// Generated from C:/Users/kucht/Documents/Studia/Rok2/S4/Kompilatory/Projekt/BoardLang/antlr/p_BoardLang.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link p_BoardLang}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface p_BoardLangVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link p_BoardLang#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(p_BoardLang.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link p_BoardLang#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(p_BoardLang.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link p_BoardLang#var_types}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_types(p_BoardLang.Var_typesContext ctx);
	/**
	 * Visit a parse tree produced by {@link p_BoardLang#rel_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRel_operator(p_BoardLang.Rel_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link p_BoardLang#math_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMath_operator(p_BoardLang.Math_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link p_BoardLang#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(p_BoardLang.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link p_BoardLang#bool_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_expr(p_BoardLang.Bool_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link p_BoardLang#math_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMath_expr(p_BoardLang.Math_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link p_BoardLang#out_instructions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOut_instructions(p_BoardLang.Out_instructionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link p_BoardLang#instructions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstructions(p_BoardLang.InstructionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link p_BoardLang#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(p_BoardLang.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link p_BoardLang#declaration_with_assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration_with_assign(p_BoardLang.Declaration_with_assignContext ctx);
	/**
	 * Visit a parse tree produced by {@link p_BoardLang#tile_decl_w_ass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTile_decl_w_ass(p_BoardLang.Tile_decl_w_assContext ctx);
	/**
	 * Visit a parse tree produced by {@link p_BoardLang#tt_arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTt_arg(p_BoardLang.Tt_argContext ctx);
	/**
	 * Visit a parse tree produced by {@link p_BoardLang#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(p_BoardLang.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link p_BoardLang#args_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs_list(p_BoardLang.Args_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link p_BoardLang#board_size_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoard_size_definition(p_BoardLang.Board_size_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link p_BoardLang#board_instr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoard_instr(p_BoardLang.Board_instrContext ctx);
	/**
	 * Visit a parse tree produced by {@link p_BoardLang#draw_instr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDraw_instr(p_BoardLang.Draw_instrContext ctx);
	/**
	 * Visit a parse tree produced by {@link p_BoardLang#draw_args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDraw_args(p_BoardLang.Draw_argsContext ctx);
	/**
	 * Visit a parse tree produced by {@link p_BoardLang#setpos_instr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetpos_instr(p_BoardLang.Setpos_instrContext ctx);
	/**
	 * Visit a parse tree produced by {@link p_BoardLang#if_instr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_instr(p_BoardLang.If_instrContext ctx);
	/**
	 * Visit a parse tree produced by {@link p_BoardLang#if_then_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_then_statement(p_BoardLang.If_then_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link p_BoardLang#if_then_otherwise_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_then_otherwise_statement(p_BoardLang.If_then_otherwise_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link p_BoardLang#otherif_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOtherif_statement(p_BoardLang.Otherif_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link p_BoardLang#if_inside_loop_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_inside_loop_statement(p_BoardLang.If_inside_loop_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link p_BoardLang#for_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_loop(p_BoardLang.For_loopContext ctx);
	/**
	 * Visit a parse tree produced by {@link p_BoardLang#id_and_int}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId_and_int(p_BoardLang.Id_and_intContext ctx);
	/**
	 * Visit a parse tree produced by {@link p_BoardLang#inside_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInside_loop(p_BoardLang.Inside_loopContext ctx);
	/**
	 * Visit a parse tree produced by {@link p_BoardLang#as_long_as_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAs_long_as_loop(p_BoardLang.As_long_as_loopContext ctx);
	/**
	 * Visit a parse tree produced by {@link p_BoardLang#function_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_def(p_BoardLang.Function_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link p_BoardLang#function_declaration_args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_declaration_args(p_BoardLang.Function_declaration_argsContext ctx);
	/**
	 * Visit a parse tree produced by {@link p_BoardLang#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call(p_BoardLang.Function_callContext ctx);
}