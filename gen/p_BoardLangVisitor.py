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
        self.memory_stack = []
        self.filename = 'app/TileMap.json'
        self.tilemap = { 'size': (0, 0),
                         'map': []}

    # Visit a parse tree produced by p_BoardLang#program.
    def visitProgram(self, ctx:p_BoardLang.ProgramContext):
        self.memory_stack.append({})
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
        id = ctx.ID().getText().strip()
        if id in self.memory_stack[-1].keys():
            raise NameError('Identifier already exists in current scope and cannot be overwritten')

        if not bool(ctx.LEFT_SQUARE_PAR()):
            self.memory_stack[-1][id] = {"type": ctx.var_types().getText(), "value": None}
        else:
            i = int(ctx.INT_V().getText().strip())
            self.memory_stack[-1][id] = {"type": ctx.var_types().getText(), "value": [None]*i}
        return True


    # Visit a parse tree produced by p_BoardLang#declaration_with_assign.
    def visitDeclaration_with_assign(self, ctx:p_BoardLang.Declaration_with_assignContext):
        id = ctx.ID().getText().strip()
        if id in self.memory_stack[-1].keys():
            raise NameError('Identifier already exists in current scope and cannot be overwritten')
        ctx.var_types()
        if not ctx.LEFT_SQUARE_PAR():
            self.memory_stack[-1][id] = {"type": ctx.var_types().getText(), "value": None}
            if ctx.var_types().BOOL_T():
                val = ctx.expr()
                if not (val.bool_expr() or val.getText() in ('TRUE', 'FALSE')):
                    raise NameError('Wrong value type: should be boolean')
                self.memory_stack[-1][id] = {"type": ctx.var_types().getText(), "value": bool(val.getText())} # dodaj bool expr
            elif ctx.var_types().INT_T():
                val = ctx.expr()
                if not val.math_expr():
                    raise NameError('Wrong value type: should be math expression')
                self.memory_stack[-1][id] = {"type": ctx.var_types().getText(), "value": self.visit(val.math_expr())}
            elif ctx.var_types().STRING_T():
                if not self.is_good_type('STRING', ctx.expr().math_expr().literal()):
                    raise NameError('Not a string')
                self.memory_stack[-1][id] = {"type": ctx.var_types().getText(), "value": self.visit(ctx.expr())}
            elif ctx.var_types().CHAR_T():
                if not self.is_good_type('CHAR', ctx.expr().math_expr().literal()):
                    raise NameError('Not a char')
                self.memory_stack[-1][id] = {"type": ctx.var_types().getText(),
                                             "value": self.visit(ctx.expr())}
            elif ctx.var_types().COLOUR_T():
                self.memory_stack[-1][id] = {"type": ctx.var_types().getText(),
                                             "value": self.hex_to_rgb(ctx.expr().getText())}

        else:
            i = int(ctx.INT_V().getText().strip())
            ar = self.visitArgs_listwithver(ctx.var_types().getText(), ctx.args_list())
            if len(ar) != i:
                raise KeyError("Wrong length of array")
            self.memory_stack[-1][id] = {"type": ctx.var_types().getText(),
                                         "value": ar}
        return True

    # Visit a parse tree produced by p_BoardLang#tile_decl_w_ass.
    def visitTile_decl_w_ass(self, ctx:p_BoardLang.Tile_decl_w_assContext):
        id = ctx.ID().getText()
        if id in self.memory_stack[-1].keys():
            raise NameError("Identifier already exists and cannot be overwritten")
        color = self.visit(ctx.tt_arg())
        self.memory_stack[-1][id] = {"type": "TileType", "value": color}
        return True


    # Visit a parse tree produced by p_BoardLang#tt_arg.
    def visitTt_arg(self, ctx:p_BoardLang.Tt_argContext):
        if ctx.COLOUR_V():
            return self.hex_to_rgb(ctx.COLOUR_V().getText())
        if ctx.STRING_V():
            return ctx.STRING_V().getText()


    # Visit a parse tree produced by p_BoardLang#assignment.
    def visitAssignment(self, ctx:p_BoardLang.AssignmentContext):
        id = ctx.ID().getText()
        if id not in self.memory_stack[-1].keys():
            raise NameError("Identifier does not exists")
        if ctx.LEFT_SQUARE_PAR():
            # if self.memory_stack[-1][id]["type"] != "ARRAY":
            #    raise NameError("This is not an array")
            try:
                len(self.memory_stack[-1][id]["value"])
            except:
                raise NameError("This is not an array")
            i = int(ctx.DIGIT().getText())
            if len(self.memory_stack[-1][id]["value"]) < i + 1:
                raise NameError("Array is too short")
            if not self.is_good_type(self.memory_stack[-1][id]["type"], ctx.expr().math_expr().literal()):
                raise NameError("Wrong type")
            self.memory_stack[-1][id]["value"][i] = self.visit(ctx.expr())
        else:
            if not self.is_good_type(self.memory_stack[-1][id]["type"], ctx.expr().math_expr().literal()):
                raise NameError("Wrong type")
            self.memory_stack[-1][id]["value"] = self.visit(ctx.expr())
        return True


    # Visit a parse tree produced by p_BoardLang#expr.
    def visitExpr(self, ctx:p_BoardLang.ExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by p_BoardLang#bool_expr.
    def visitBool_expr(self, ctx:p_BoardLang.Bool_exprContext):
        # if ctx.BOOL_V():
        #    return True/false
        return false


    # Visit a parse tree produced by p_BoardLang#math_expr.
    def visitMath_expr(self, ctx:p_BoardLang.Math_exprContext):
        if ctx.literal():
            return self.visit(ctx.literal())
        elif ctx.ID():
            return self.memory_stack[-1][ctx.ID().getText().strip()]['value']
        elif ctx.function_call():
            return self.visit(ctx.function_call())
        elif ctx.LEFT_PAR():
            return self.visit(ctx.math_expr())
        elif ctx.math_operator():
            x1 = self.visit(ctx.math_expr(0))
            x2 = self.visit(ctx.math_expr(1))
            x = self.visit(ctx.math_operator())
            if not isinstance(x1, int) or not isinstance(x2, int):
                raise NameError("Invalid expression: not an int")
            if x == "+":
                return x1 + x2
            elif x == "-":
                return x1 + x2
            elif x == "/":
                return int(x1 / x2)
            elif x == "%":
                return x1 % x2
            elif x == "*":
                return x1 * x2
        return True


    # Visit a parse tree produced by p_BoardLang#board_instr.
    def visitBoard_instr(self, ctx:p_BoardLang.Board_instrContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by p_BoardLang#draw_instr.
    def visitDraw_instr(self, ctx:p_BoardLang.Draw_instrContext):
        x, y = self.visit(ctx.draw_args())
        tilename = ctx.ID().getText()
        if tilename not in self.memory.keys():
            raise KeyError(f'No such identifier as {tilename}')
        elif self.memory_stack[-1][tilename]['type'] != 'TileType':
            raise TypeError('Expected TileType')
        else:
            color = self.memory_stack[-1][tilename]['value']
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
            if not self.if_in_scope(id_text):
                raise KeyError(f'No such identifier as {id_text} defined')

            id_type = self.memory_stack[-1][ctx.ID().get_Text()]['type']
            if id_type == 'INT':
                return int(self.memory_stack[-1][ctx.ID().get_Text()])
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
        if ctx.ID():
            id = ctx.ID().getText()
            if id not in self.memory_stack[-1].keys():
                raise NameError(f'No such identifier as {id}')
            return [self.memory_stack[-1][id]['value']]
        elif ctx.literal():
            return [self.visit(ctx.literal())]
        elif ctx.COMA():
            return self.visit(ctx.args_list(0)) + self.visit(ctx.args_list(1))


    # Visit a parse tree produced by p_BoardLang#literal.
    def visitLiteral(self, ctx:p_BoardLang.LiteralContext):
        if ctx.INT_V():
            return int(ctx.INT_V().getText())
        elif ctx.STRING_V():
            return ctx.STRING_V().getText().strip("\"")
        elif ctx.BOOL_V():
            return bool(ctx.BOOL_V().getText())
        elif ctx.CHAR_V():
            return ctx.CHAR_V().getText().strip("\'")
        elif ctx.COLOUR_V():
            return self.hex_to_rgb(ctx.COLOUR_V().getText())


    # Visit a parse tree produced by p_BoardLang#var_types.
    def visitVar_types(self, ctx:p_BoardLang.Var_typesContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by p_BoardLang#rel_operator.
    def visitRel_operator(self, ctx:p_BoardLang.Rel_operatorContext):
        return ctx.getText()


    # Visit a parse tree produced by p_BoardLang#math_operator.
    def visitMath_operator(self, ctx:p_BoardLang.Math_operatorContext):
        return ctx.getText()

    def hex_to_rgb(self, hex: str):
        r = int(hex[1:3], 16)
        g = int(hex[3:5], 16)
        b = int(hex[5:], 16)
        return tuple((r, g, b))

    def if_in_scope(self, z: str):
        for scope in reversed(self.memory_stack):
            if z in scope.keys():
                return True
        return False

    def get_type(self, z: str):
        for scope in reversed(self.memory_stack):
            if z in scope.keys():
                return scope[z]['type']
    def is_good_type(self, type: str, ctx: p_BoardLang.literal):
        if type == 'INT':
            if ctx.INT_V():
                return True
            return False
        if type == 'STRING':
            if ctx.STRING_V():
                return True
            return False
        if type == 'CHAR':
            if ctx.CHAR_V():
                return True
            return False
        if type == 'BOOL':
            if ctx.BOOL_V():
                return True
            return False
        if type == 'COLOUR':
            if ctx.COLOUR_V():
                return True
            return False

    def visitArgs_listwithver(self, type: str, ctx: p_BoardLang.Args_listContext):
        if ctx.ID():
            id = ctx.ID().getText()
            if id not in self.memory_stack[-1].keys():
                raise NameError(f'No such identifier as {id}')
            if type != self.memory_stack[-1][id]['type']:
                raise NameError('Wrong type in array')
            return [self.memory_stack[-1][id]['value']]
        elif ctx.literal():
            if not self.is_good_type(type, ctx.literal()):
                raise NameError('Wrong type in array')
            return [self.visit(ctx.literal())]
        elif ctx.COMA():
            return self.visitArgs_listwithver(type, ctx.args_list(0)) + self.visitArgs_listwithver(type, ctx.args_list(1))






del p_BoardLang