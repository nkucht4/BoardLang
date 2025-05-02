# Generated from C:/Users/kucht/Documents/Studia/Rok2/S4/Kompilatory/Projekt/BoardLang/antlr/p_BoardLang.g4 by ANTLR 4.13.2
from antlr4 import *
import json

if "." in __name__:
    from .p_BoardLang import p_BoardLang
else:
    from p_BoardLang import p_BoardLang

# This class defines a complete generic visitor for a parse tree produced by p_BoardLang.

class p_BoardLangVisitor(ParseTreeVisitor):
    def __init__(self):
        self.memory = {}
        self.filename = 'app/TileMap.json'
        self.tilemap = { 'size': (0, 0),
                         'map': []}

    # Visit a parse tree produced by p_BoardLang#program.
    def visitProgram(self, ctx:p_BoardLang.ProgramContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by p_BoardLang#board_size_definition.
    def visitBoard_size_definition(self, ctx:p_BoardLang.Board_size_definitionContext):
        width = self.visit(ctx.id_and_int(0))
        height = self.visit(ctx.id_and_int(1))
        if width < 0 or height < 0:
            raise ValueError('Negative numbers not allowed inside board_size definition')
        self.tilemap['size'] = (width, height)
        with open(self.filename, 'w') as f:
            json.dump(self.tilemap, f)
        self.tilemap['map'] = [[0 for _ in range(width)] for _ in range(height)]
        return True


    # Visit a parse tree produced by p_BoardLang#out_instructions.
    def visitOut_instructions(self, ctx:p_BoardLang.Out_instructionsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by p_BoardLang#instructions.
    def visitInstructions(self, ctx:p_BoardLang.InstructionsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by p_BoardLang#function_def.
    def visitFunction_def(self, ctx:p_BoardLang.Function_defContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by p_BoardLang#function_declaration_args.
    def visitFunction_declaration_args(self, ctx:p_BoardLang.Function_declaration_argsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by p_BoardLang#function_instr.
    def visitFunction_instr(self, ctx:p_BoardLang.Function_instrContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by p_BoardLang#function_call.
    def visitFunction_call(self, ctx:p_BoardLang.Function_callContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by p_BoardLang#declaration.
    def visitDeclaration(self, ctx:p_BoardLang.DeclarationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by p_BoardLang#declaration_with_assign.
    def visitDeclaration_with_assign(self, ctx:p_BoardLang.Declaration_with_assignContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by p_BoardLang#tile_decl_w_ass.
    def visitTile_decl_w_ass(self, ctx:p_BoardLang.Tile_decl_w_assContext):
        id = ctx.ID().getText()
        if id in self.memory.keys():
            raise NameError("Identifier already exists and cannot be overwritten")
        color = self.visit(ctx.tt_arg())
        self.memory[id] = {"type": "TileType", "value": color}
        return True


    # Visit a parse tree produced by p_BoardLang#tt_arg.
    def visitTt_arg(self, ctx:p_BoardLang.Tt_argContext):
        if ctx.COLOUR_V():
            return self.hex_to_rgb(ctx.COLOUR_V().getText())
        if ctx.STRING_V():
            return ctx.STRING_V().getText()


    # Visit a parse tree produced by p_BoardLang#assignment.
    def visitAssignment(self, ctx:p_BoardLang.AssignmentContext):
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


    # Visit a parse tree produced by p_BoardLang#board_instr.
    def visitBoard_instr(self, ctx:p_BoardLang.Board_instrContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by p_BoardLang#draw_instr.
    def visitDraw_instr(self, ctx:p_BoardLang.Draw_instrContext):
        x, y = self.visit(ctx.draw_args())
        tilename = ctx.ID().getText()
        if tilename not in self.memory.keys():
            raise KeyError(f'No such identifier as {tilename}')
        elif self.memory[tilename]['type'] != 'TileType':
            raise TypeError('Expected TileType')
        else:
            color = self.memory[tilename]['value']
            self.tilemap['map'][x][y] = color
            with open(self.filename, 'w') as f:
                json.dump(self.tilemap, f)
        return x, y


    # Visit a parse tree produced by p_BoardLang#draw_args.
    def visitDraw_args(self, ctx:p_BoardLang.Draw_argsContext):
        if ctx.HERE_T():
            raise NotImplementedError
        else:
            x = self.visit(ctx.id_and_int()[0])
            y = self.visit(ctx.id_and_int()[1])
            return x, y


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
        if ctx.INT_V():
            return int(ctx.INT_V().getText())

        if ctx.ID():
            id_text = ctx.ID().getText()
            if id_text not in self.memory:
                raise KeyError(f'No such identifier as {id_text} defined')

            id_type = self.memory[ctx.ID().get_Text()]['type']
            if id_type == 'INT':
                return int(self.memory[ctx.ID().get_Text()])
            else:
                raise TypeError(f'Expected INT, got {id_type}')
        else:
            print(ctx.INT_V().get_Text())

        raise ValueError("Expected int value")


    # Visit a parse tree produced by p_BoardLang#inside_loop.
    def visitInside_loop(self, ctx:p_BoardLang.Inside_loopContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by p_BoardLang#as_long_as_loop.
    def visitAs_long_as_loop(self, ctx:p_BoardLang.As_long_as_loopContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by p_BoardLang#args_list.
    def visitArgs_list(self, ctx:p_BoardLang.Args_listContext):
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

    def hex_to_rgb(self, hex: str):
        r = int(hex[1:3], 16)
        g = int(hex[3:5], 16)
        b = int(hex[5:], 16)
        return tuple((r, g, b))



del p_BoardLang