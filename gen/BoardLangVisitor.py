# Generated from C:/Users/kucht/Documents/Studia/Rok2/S4/Kompilatory/Projekt/BoardLang/antlr/p_BoardLang.g4 by ANTLR 4.13.2
from antlr4 import *
import json


if "." in __name__:
    from .p_BoardLang import p_BoardLang
    from .p_BoardLangVisitor import p_BoardLangVisitor
else:
    from p_BoardLang import p_BoardLang
    from p_BoardLangVisitor import p_BoardLangVisitor


class BreakException(Exception):
    pass


class FunctionReturn(Exception):
    def __init__(self, val):
        self.value = val


class Function:
    def __init__(self, arg_list, return_type, body):
        self.arg_list = arg_list
        self.return_type = return_type
        self.body = body


# This class defines a complete generic visitor for a parse tree produced by p_BoardLang.
class BoardLangVisitor(p_BoardLangVisitor):
    def __init__(self):
        self.memory = {}
        self.memory_stack = []
        self.filename = 'TileMap.json'
        self.tilemap = {'size': (0, 0),
                        'map': []}


    # Visit a parse tree produced by p_BoardLang#program.
    def visitProgram(self, ctx: p_BoardLang.ProgramContext):
        self.memory_stack.append({'here': {'type': 'HERE',
                                           'value': (0, 0)}})
        return self.visitChildren(ctx)


    # Visit a parse tree produced by p_BoardLang#board_size_definition.
    def visitBoard_size_definition(self, ctx: p_BoardLang.Board_size_definitionContext):
        width = self.visit(ctx.math_expr(0))
        height = self.visit(ctx.math_expr(1))
        if width < 0 or height < 0:
            raise ValueError('Negative numbers not allowed inside board_size definition')
        self.tilemap['size'] = (width, height)
        self.tilemap['map'] = [[0 for _ in range(height)] for _ in range(width)]
        self.tilemap['images'] = {}
        with open(self.filename, 'w') as f:
            json.dump(self.tilemap, f)
        return True


    # Visit a parse tree produced by p_BoardLang#out_instructions.
    def visitOut_instructions(self, ctx: p_BoardLang.Out_instructionsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by p_BoardLang#instructions.
    def visitInstructions(self, ctx: p_BoardLang.InstructionsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by p_BoardLang#function_def.
    def visitFunction_def(self, ctx: p_BoardLang.Function_defContext):
        name = ctx.ID().getText().strip()

        if name in self.memory_stack[-1].keys():
            raise NameError("Identifier already exists in current scope and cannot be overwritten")

        if ctx.function_declaration_args():
            args = self.visit(ctx.function_declaration_args())
        else:
            args = {}
        if ctx.var_types():
            return_type = self.visit(ctx.var_types())
        else:
            return_type = 'VOID'
        body = ctx.function_instr()
        fun = Function(args, return_type, body)
        self.memory_stack[-1][name] = {'type': 'FUNCTION',
                                        'value': fun}
        return True


    # Visit a parse tree produced by p_BoardLang#function_declaration_args.
    def visitFunction_declaration_args(self, ctx:p_BoardLang.Function_declaration_argsContext):
        if ctx.ID():
            return [(ctx.ID().getText().strip(), ctx.var_types().getText())]
        else:
            return self.visit(ctx.function_declaration_args(0)) + self.visit(ctx.function_declaration_args(1))


    # Visit a parse tree produced by p_BoardLang#function_instr.
    def visitFunction_instr(self, ctx:p_BoardLang.Function_instrContext):
        return self.visitChildren(ctx)

    # Visit a parse tree produced by p_BoardLang#return_expr.
    def visitReturn_expr(self, ctx: p_BoardLang.Return_exprContext):
        value = self.visit(ctx.expr())
        raise FunctionReturn(value)

    # Visit a parse tree produced by p_BoardLang#function_call.
    def visitFunction_call(self, ctx: p_BoardLang.Function_callContext):
        name = ctx.ID().getText().strip()
        if self.get_type(name) != 'FUNCTION':
            raise TypeError(f'{name} is not a callable function')
        fun = self.get_value(name)
        if not ctx.args_list():
            try:
                self.functionBody(fun.body)
            except FunctionReturn as r:
                return r.value
        else:
            args = self.visit(ctx.args_list())
            fun_args = fun.arg_list
            if len(args) != len(fun_args):
                raise NameError("Wrong number of arguments")
            scope_this = {}
            for i in range(0, len(args)):
                if self.is_good_type(fun_args[i][1], args[i]):
                    raise NameError(f"Wrong type of argument: {fun_args[i][0]}")
                s = self.get_from_literal_or_id(args[i])
                scope_this.update({fun_args[i][0]: {'value': s, 'type': fun_args[i][1]}})
            try:
                self.functionBody(fun.body, scope_this)
            except FunctionReturn as r:
                return r.value

    def get_from_literal_or_id(self, ctx_lit: p_BoardLang.literal = None, ctx_id: p_BoardLang.ID = None):
        if ctx_id is not None:
            return self.get_value(ctx_id.getText())
        if ctx_lit is not None:
            return self.visit(ctx_lit)

    def functionBody(self, ctx:p_BoardLang.Function_instrContext, args = None):
        if args is None:
            self.memory_stack.append({})
        else:
            self.memory_stack.append(args)
        return self.visitChildren(ctx)

    # Visit a parse tree produced by p_BoardLang#declaration.
    def visitDeclaration(self, ctx: p_BoardLang.DeclarationContext):
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
        # ctx.expr()
        id = ctx.ID().getText().strip()
        if id in self.memory_stack[-1].keys():
            raise NameError('Identifier already exists in current scope and cannot be overwritten')
        if not ctx.LEFT_SQUARE_PAR():
            if ctx.var_types().BOOL_T():
                handler = self.handle_bool
            elif ctx.var_types().INT_T():
                handler = self.handle_int
            elif ctx.var_types().STRING_T():
                handler = self.handle_string
            elif ctx.var_types().CHAR_T():
                handler = self.handle_char
            elif ctx.var_types().COLOUR_T():
                handler = self.handle_colour
            else:
                raise NameError('Unsupported type')

            val = handler(ctx.expr())
            self.memory_stack[-1][id] = {"type": ctx.var_types().getText(), "value": val}
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
            raise NameError("Identifier already exists in this scope and cannot be overwritten")
        color = self.visit(ctx.tt_arg())
        print(color)
        if isinstance(color, str):
            self.tilemap['images'][id] = color
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
        if not self.if_in_scope(id):
            raise NameError("Identifier does not exists")
        type = self.get_type(id)
        if type == "BOOL":
            handler = self.handle_bool
        elif type == "INT":
            handler = self.handle_int
        elif type == "STRING":
            handler = self.handle_string
        elif type == "CHAR":
            handler = self.handle_char
        elif type == "COLOUR":
            handler = self.handle_colour
        else:
            raise NameError('Unsupported type')

        val = handler(ctx.expr())
        if ctx.LEFT_SQUARE_PAR():
            try:
                self.get_value(id)
            except:
                raise NameError("This is not an array")
            i = int(ctx.INT_V().getText())
            if len(self.get_value(id)) < i + 1:
                raise NameError("Array is too short")

            for j in self.memory_stack:
                if id in j.keys():
                    j[id]["value"][i] = val
                    break
        else:
            for j in self.memory_stack:
                if id in j.keys():
                    j[id]["value"] = val

        return True


    # Visit a parse tree produced by p_BoardLang#expr.
    def visitExpr(self, ctx:p_BoardLang.ExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by p_BoardLang#bool_expr.
    def visitBool_expr(self, ctx:p_BoardLang.Bool_exprContext):
        if ctx.BOOL_V():
            if ctx.BOOL_V().getText() == 'TRUE':
                return True
            else:
                return False
        if ctx.ID():
            id = ctx.ID().getText()
            if not self.if_in_scope(id):
                raise NameError(f"The variable: {id} does not exists")
            if self.get_type(id) != "BOOL":
                raise NameError(f"The type of variable: {id} is not BOOL")
            return self.get_value(id)
        if ctx.function_call():
            return self.visit(ctx.function_call())
        if ctx.LEFT_PAR():
            return self.visit(ctx.bool_expr(0))
        if ctx.math_expr():
            me1 = self.visit(ctx.math_expr(0))
            me2 = self.visit(ctx.math_expr(1))
            op = ctx.rel_operator()
            if op.CHECK_EQ():
                return me1 == me2
            if op.NOT_EQ():
                return me1 != me2
            if op.GTOREQ():
                return me1 >= me2
            if op.LTOREQ():
                return me1 <= me2
            if op.GT():
                return me1 > me2
            if op.LT():
                return me1 < me2
        if ctx.NOT_T():
            return not self.visit(ctx.bool_expr(0))
        if ctx.OR_T():
            return self.visit(ctx.bool_expr(0)) or self.visit(ctx.bool_expr(1))
        if ctx.AND_T():
            return self.visit(ctx.bool_expr(0)) and self.visit(ctx.bool_expr(1))


    # Visit a parse tree produced by p_BoardLang#math_expr.
    def visitMath_expr(self, ctx:p_BoardLang.Math_exprContext):
        if ctx.literal():
            return self.visit(ctx.literal())
        elif ctx.ID():
            return self.get_value(ctx.ID().getText().strip())
        elif ctx.function_call():
            return self.visit(ctx.function_call())
        elif ctx.LEFT_PAR():
            return self.visit(ctx.math_expr(0))
        elif ctx.math_operator():
            x1 = self.visit(ctx.math_expr(0))
            x2 = self.visit(ctx.math_expr(1))
            x = self.visit(ctx.math_operator())
            if not isinstance(x1, int) or not isinstance(x2, int):
                raise NameError("Invalid expression: not an int")
            if x == "+":
                return x1 + x2
            elif x == "-":
                return x1 - x2
            elif x == "/":
                return int(x1 / x2)
            elif x == "%":
                return x1 % x2
            elif x == "*":
                return x1 * x2
        return True


    # Visit a parse tree produced by p_BoardLang#board_instr.
    def visitBoard_instr(self, ctx:p_BoardLang.Board_instrContext):
        if ctx.RESET_T():
            self.memory_stack[0]['here']['value'] = (0,0)
        return self.visitChildren(ctx)


    # Visit a parse tree produced by p_BoardLang#draw_instr.
    def visitDraw_instr(self, ctx:p_BoardLang.Draw_instrContext):
        x, y = self.visit(ctx.draw_args())
        tilename = ctx.ID().getText()
        tile = self.get_value(tilename)
        if isinstance(tile, str):
            tile = tilename
        if self.get_type(tilename) != 'TileType':
            raise TypeError('Expected TileType')
        else:
            self.tilemap['map'][x][y] = tile
            with open(self.filename, 'w') as f:
                json.dump(self.tilemap, f)
        return x, y


    # Visit a parse tree produced by p_BoardLang#draw_args.
    def visitDraw_args(self, ctx:p_BoardLang.Draw_argsContext):
        if ctx.HERE_T():
            x,y = self.memory_stack[0]['here']['value']
        else:
            x = self.visit(ctx.math_expr()[0])
            y = self.visit(ctx.math_expr()[1])
        return x, y


    # Visit a parse tree produced by p_BoardLang#setpos_instr.
    def visitSetpos_instr(self, ctx:p_BoardLang.Setpos_instrContext):
        x = self.visit(ctx.math_expr(0))
        y = self.visit(ctx.math_expr(1))
        self.memory_stack[0]['here']['value']=(x,y)
        return x, y


    # Visit a parse tree produced by p_BoardLang#if_instr.
    def visitIf_instr(self, ctx:p_BoardLang.If_instrContext):
        if self.visit(ctx.expr(0)):
            self.memory_stack.append({})
            self.visit(ctx.instructions(0))
            self.memory_stack.pop()
            return
        otherifs = len(ctx.OTHERIF_T())
        if otherifs > 0:
            for i in range(0, otherifs):
                if self.visit(ctx.expr(i+1)):
                    self.memory_stack.append({})
                    self.visit(ctx.instructions(i+1))
                    self.memory_stack.pop()
                    return

        if ctx.OTHERWISE_T():
            self.memory_stack.append({})
            self.visit(ctx.instructions(-1))
            self.memory_stack.pop()
            return

    # Visit a parse tree produced by p_BoardLang#if_inside_loop_statement.
    def visitIf_inside_loop_statement(self, ctx:p_BoardLang.If_inside_loop_statementContext):
        if self.visit(ctx.expr(0)):
            self.memory_stack.append({})
            self.visit(ctx.inside_loop(0))
            self.memory_stack.pop()
            return
        otherifs = len(ctx.OTHERIF_T())
        if otherifs > 0:
            for i in range(0, otherifs):
                if self.visit(ctx.expr(i + 1)):
                    self.memory_stack.append({})
                    self.visit(ctx.inside_loop(i + 1))
                    self.memory_stack.pop()
                    return

        if ctx.OTHERWISE_T():
            self.memory_stack.append({})
            self.visit(ctx.inside_loop(-1))
            self.memory_stack.pop()
            return


    # Visit a parse tree produced by p_BoardLang#for_loop.
    def visitFor_loop(self, ctx:p_BoardLang.For_loopContext):
        start = self.visit(ctx.math_expr(0))
        end = self.visit(ctx.math_expr(1))
        step = self.visit(ctx.math_expr(2))
        id = ctx.ID().getText().strip()

        self.memory_stack.append({})
        self.memory_stack[-1][id] = {"type": 'INT',
                                     "value": start}

        for i in range(start, end, step):
            self.memory_stack.append({})
            self.memory_stack[-2][id]['value'] = i
            try:
                self.visit(ctx.inside_loop())
            except BreakException:
                break
            self.memory_stack.pop()
        self.memory_stack.pop()
        return True

    # Visit a parse tree produced by p_BoardLang#inside_loop.
    def visitInside_loop(self, ctx:p_BoardLang.Inside_loopContext):
        return self.visitChildren(ctx)

    def visitBreak_instruction(self, ctx:p_BoardLang.Break_instructionContext):
        raise BreakException()

    # Visit a parse tree produced by p_BoardLang#if_inside_functions_statement.
    def visitIf_inside_functions_statement(self, ctx: p_BoardLang.If_inside_functions_statementContext):
        return self.visitChildren(ctx)

    # Visit a parse tree produced by p_BoardLang#for_loop_inside_function.
    def visitFor_loop_inside_function(self, ctx: p_BoardLang.For_loop_inside_functionContext):
        start = self.visit(ctx.math_expr(0))
        end = self.visit(ctx.math_expr(1))
        step = self.visit(ctx.math_expr(2))
        id = ctx.ID().getText().strip()

        self.memory_stack.append({})
        self.memory_stack[-1][id] = {"type": 'INT',
                                     "value": start}

        for i in range(start, end, step):
            self.memory_stack.append({})
            self.memory_stack[-2][id]['value'] = i
            try:
                self.visit(ctx.instr_inside_loop_inside_fun())
            except BreakException:
                break
            self.memory_stack.pop()
        self.memory_stack.pop()
        return True

        # Visit a parse tree produced by p_BoardLang#as_long_as_loop_inside_function.
    def visitAs_long_as_loop_inside_function(self, ctx: p_BoardLang.As_long_as_loop_inside_functionContext):
        condition = self.visit(ctx.expr())
        self.memory_stack.append({})

        while condition:
            self.memory_stack.append({})
            try:
                self.visit(ctx.instr_inside_loop_inside_fun())
            except BreakException:
                break
            self.memory_stack.pop()
            condition = self.visit(ctx.expr())

        self.memory_stack.pop()
        return True

    # Visit a parse tree produced by p_BoardLang#instr_inside_loop_inside_fun.
    def visitInstr_inside_loop_inside_fun(self, ctx: p_BoardLang.Instr_inside_loop_inside_funContext):
        return self.visitChildren(ctx)

        # Visit a parse tree produced by p_BoardLang#if_inside_loop_inside_fun_statement.
    def visitIf_inside_loop_inside_fun_statement(self, ctx: p_BoardLang.If_inside_loop_inside_fun_statementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by p_BoardLang#as_long_as_loop.
    def visitAs_long_as_loop(self, ctx:p_BoardLang.As_long_as_loopContext):
        condition = self.visit(ctx.expr())
        self.memory_stack.append({})

        while condition:
            self.memory_stack.append({})
            try:
                self.visit(ctx.inside_loop())
            except BreakException:
                break
            self.memory_stack.pop()
            condition = self.visit(ctx.expr())

        self.memory_stack.pop()
        return True


    # Visit a parse tree produced by p_BoardLang#args_list.
    def visitArgs_list(self, ctx:p_BoardLang.Args_listContext):
        if ctx.ID():
            id = ctx.ID().getText()
            if not self.if_in_scope(id):
                raise NameError(f'No such identifier as {id}')
            return [ctx.ID()]
        elif ctx.literal():
            return [ctx.literal()]
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
    def get_value(self, z: str):
        for scope in reversed(self.memory_stack):
            if z in scope.keys():
                return scope[z]['value']
        raise NameError(f'No such identifier as {z}')
    def is_good_type(self, type: str, ctx_lit: p_BoardLang.literal = None, ctx_id: p_BoardLang.ID = None): # sprawdź, czy na pewno dobrze (do:  KALINY)
        if ctx_id is not None:
            return self.get_type(ctx_id.getText()) == type
        if type == 'INT':
            if ctx_lit.INT_V():
                return True
            return False
        if type == 'STRING':
            if ctx_lit.STRING_V():
                return True
            return False
        if type == 'CHAR':
            if ctx_lit.CHAR_V():
                return True
            return False
        if type == 'BOOL':
            if ctx_lit.BOOL_V():
                return True
            return False
        if type == 'COLOUR':
            if ctx_lit.COLOUR_V():
                return True
            return False

    def visitArgs_listwithver(self, type: str, ctx: p_BoardLang.Args_listContext):
        if ctx.ID():
            id = ctx.ID().getText()
            if not self.if_in_scope(id):
                raise NameError(f'No such identifier as {id}')
            if type != self.get_type(id):
                raise NameError('Wrong type in array')
            return [self.get_value(id)]
        elif ctx.literal():
            if not self.is_good_type(type, ctx.literal()):
                raise NameError('Wrong type in array')
            return [self.visit(ctx.literal())]
        elif ctx.COMA():
            return self.visitArgs_listwithver(type, ctx.args_list(0)) + self.visitArgs_listwithver(type, ctx.args_list(1))

    def handle_bool(self, ctx:p_BoardLang.ExprContext):
        if ctx.bool_expr():
            return self.visit(ctx.bool_expr())
        if ctx.math_expr():
            if ctx.math_expr().ID():
                if self.get_type(ctx.math_expr().ID().getText()) != "BOOL":
                    raise NameError('Wrong value type: should be boolean')
                return self.get_value(ctx.math_expr().ID().getText())
            elif ctx.math_expr().function_call():
                if self.get_type(ctx.math_expr().function_call().ID().getText()) != 'FUNCTION':
                    raise NameError('That is not a function')
                if self.get_value(ctx.math_expr().function_call().ID().getText()).return_type != "BOOL":
                    raise NameError(
                        f'Function returns {self.get_value(ctx.math_expr().function_call().ID().getText()).return_type} instead of BOOL')
                return self.visit(ctx.math_expr().function_call())
            else:
                raise NameError('Wrong value type: should be boolean')

    def handle_int(self, ctx:p_BoardLang.ExprContext):
        if ctx.math_expr():
            return self.visit(ctx.math_expr())
        if ctx.bool_expr():
            if ctx.bool_expr().ID():
                if self.get_type(ctx.bool_expr().ID().getText()) != "INT":
                    raise NameError('Wrong value type: should be math expression')
                return self.get_value(ctx.bool_expr().ID().getText())
            elif ctx.bool_expr().function_call():
                if self.get_type(ctx.bool_expr().function_call().ID().getText()) != 'FUNCTION':
                    raise NameError('That is not a function')
                if self.get_value(ctx.bool_expr().function_call().ID().getText()).return_type != "INT":
                    raise NameError(
                        f'Function returns {self.get_value(ctx.bool_expr().function_call().ID().getText()).return_type} instead of INT')
                return self.visit(ctx.bool_expr().function_call())
            else:
                raise NameError('Wrong value type: should be math expression')

    def handle_string(self, ctx:p_BoardLang.ExprContext):
        if ctx.math_expr():
            c = ctx.math_expr()
        elif ctx.bool_expr():
            c = ctx.bool_expr()
        if c.ID():
            if not self.is_good_type('STRING', ctx_id=c.ID()):
                raise NameError('Not a string')
            st = self.get_value(c.ID().getText())
        elif c.literal():
            if not self.is_good_type('STRING', c.literal()):
                raise NameError('Not a string')
            st = self.visit(c.literal())
        elif c.function_call():
            if self.get_type(c.function_call().ID().getText()) != 'FUNCTION':
                raise NameError('That is not a function')
            if self.get_value(c.function_call().ID().getText()).return_type != "STRING":
                raise NameError(f'Function returns {self.get_value(c.function_call().ID().getText()).return_type} instead of STRING')
            st = self.visit(c.function_call())
        else:
            raise NameError('Not a string')
        return st

    def handle_char(self, ctx: p_BoardLang.ExprContext):
        if ctx.math_expr():
            c = ctx.math_expr()
        elif ctx.bool_expr():
            c = ctx.bool_expr()
        if c.ID():
            if not self.is_good_type('CHAR', ctx_id=c.ID()):
                raise NameError('Not a char')
            st = self.get_value(c.ID().getText())
        elif c.literal():
            if not self.is_good_type('CHAR', c.literal()):
                raise NameError('Not a char')
            st = self.visit(c.literal())
        elif c.function_call():
            if self.get_type(c.function_call().ID().getText()) != 'FUNCTION':
                raise NameError('That is not a function')
            if self.get_value(c.function_call().ID().getText()).return_type != "CHAR":
                raise NameError(f'Function returns {self.get_value(c.function_call().ID().getText()).return_type} instead of CHAR')
            st = self.visit(c.function_call())
        else:
            raise NameError('Not a char')
        return st

    def handle_colour(self, ctx: p_BoardLang.ExprContext): # oki, trzeba to przedyskutować, zrobiłam by działało
        if ctx.math_expr():
            c = ctx.math_expr()
        elif ctx.bool_expr():
            c = ctx.bool_expr()
        if c.ID():
            if not self.is_good_type('COLOUR', ctx_id=c.ID()):
                raise NameError('Not a colour')
            st = self.get_value(c.ID().getText())
        elif c.literal():
            if not self.is_good_type('COLOUR', c.literal()):
                raise NameError('Not a colour')
            st = self.hex_to_rgb(c.literal().getText())
        elif c.function_call():
            if self.get_type(c.function_call().ID().getText()) != 'FUNCTION':
                raise NameError('That is not a function')
            if self.get_value(c.function_call().ID().getText()).return_type != "COLOUR":
                raise NameError(f'Function returns {self.get_value(c.function_call().ID().getText()).return_type} instead of COLOUR')
            st = self.visit(c.function_call())
        else:
            raise NameError('Not a colour')
        return st


del p_BoardLang