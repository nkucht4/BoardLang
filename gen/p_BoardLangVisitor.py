from antlr4 import *
if "." in __name__:
    from .p_BoardLang import p_BoardLang
else:
    from p_BoardLang import p_BoardLang

# This class defines a complete generic visitor for a parse tree produced by p_BoardLang.

class p_BoardLangVisitor(ParseTreeVisitor):
    def __init__(self):
        super().__init__()
        self.memory = {}

    # Visit a parse tree produced by p_BoardLang#program.
    def visitProgram(self, ctx:p_BoardLang.ProgramContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by p_BoardLang#literal.
    def visitLiteral(self, ctx:p_BoardLang.LiteralContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by p_BoardLang#var_types.
    def visitVar_types(self, ctx:p_BoardLang.Var_typesContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by p_BoardLang#rel_operator.
    def visitRel_operator(self, ctx:p_BoardLang.Rel_operatorContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by p_BoardLang#math_operator.
    def visitMath_operator(self, ctx:p_BoardLang.Math_operatorContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by p_BoardLang#expr.
    def visitExpr(self, ctx:p_BoardLang.ExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by p_BoardLang#bool_expr.
    def visitBool_expr(self, ctx:p_BoardLang.Bool_exprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by p_BoardLang#math_expr.
    def visitMath_expr(self, ctx:p_BoardLang.Math_exprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by p_BoardLang#out_instructions.
    def visitOut_instructions(self, ctx:p_BoardLang.Out_instructionsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by p_BoardLang#instructions.
    def visitInstructions(self, ctx:p_BoardLang.InstructionsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by p_BoardLang#declaration.
    def visitDeclaration(self, ctx:p_BoardLang.DeclarationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by p_BoardLang#declaration_with_assign.
    def visitDeclaration_with_assign(self, ctx:p_BoardLang.Declaration_with_assignContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by p_BoardLang#tile_decl_w_ass.
    def visitTile_decl_w_ass(self, ctx:p_BoardLang.Tile_decl_w_assContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by p_BoardLang#tt_arg.
    def visitTt_arg(self, ctx:p_BoardLang.Tt_argContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by p_BoardLang#assignment.
    def visitAssignment(self, ctx:p_BoardLang.AssignmentContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by p_BoardLang#args_list.
    def visitArgs_list(self, ctx:p_BoardLang.Args_listContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by p_BoardLang#board_size_definition.
    def visitBoard_size_definition(self, ctx:p_BoardLang.Board_size_definitionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by p_BoardLang#board_instr.
    def visitBoard_instr(self, ctx:p_BoardLang.Board_instrContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by p_BoardLang#draw_instr.
    def visitDraw_instr(self, ctx:p_BoardLang.Draw_instrContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by p_BoardLang#draw_args.
    def visitDraw_args(self, ctx:p_BoardLang.Draw_argsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by p_BoardLang#setpos_instr.
    def visitSetpos_instr(self, ctx:p_BoardLang.Setpos_instrContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by p_BoardLang#if_instr.
    def visitIf_instr(self, ctx:p_BoardLang.If_instrContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by p_BoardLang#if_then_statement.
    def visitIf_then_statement(self, ctx:p_BoardLang.If_then_statementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by p_BoardLang#if_then_otherwise_statement.
    def visitIf_then_otherwise_statement(self, ctx:p_BoardLang.If_then_otherwise_statementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by p_BoardLang#otherif_statement.
    def visitOtherif_statement(self, ctx:p_BoardLang.Otherif_statementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by p_BoardLang#if_inside_loop_statement.
    def visitIf_inside_loop_statement(self, ctx:p_BoardLang.If_inside_loop_statementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by p_BoardLang#for_loop.
    def visitFor_loop(self, ctx:p_BoardLang.For_loopContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by p_BoardLang#id_and_int.
    def visitId_and_int(self, ctx:p_BoardLang.Id_and_intContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by p_BoardLang#inside_loop.
    def visitInside_loop(self, ctx:p_BoardLang.Inside_loopContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by p_BoardLang#as_long_as_loop.
    def visitAs_long_as_loop(self, ctx:p_BoardLang.As_long_as_loopContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by p_BoardLang#function_def.
    def visitFunction_def(self, ctx:p_BoardLang.Function_defContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by p_BoardLang#function_declaration_args.
    def visitFunction_declaration_args(self, ctx:p_BoardLang.Function_declaration_argsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by p_BoardLang#function_call.
    def visitFunction_call(self, ctx:p_BoardLang.Function_callContext):
        return self.visitChildren(ctx)



del p_BoardLang