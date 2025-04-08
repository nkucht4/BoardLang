// Generated from C:/Users/kucht/Documents/Studia/Rok2/S4/Kompilatory/Projekt/BoardLang/antlr/p_BoardLang.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class p_BoardLang extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IF_T=1, OTHERIF_T=2, OTHERWISE_T=3, AS_T=4, LONG_T=5, FOR_T=6, FUNCTION_T=7, 
		RETURN_T=8, DRAW_T=9, HERE_T=10, RESET_T=11, SETPOS=12, BOARDSIZE_T=13, 
		BREAK=14, CONTINUE=15, CONST=16, TT=17, INT_T=18, BOOL_T=19, CHAR_T=20, 
		STRING_T=21, COLOUR_T=22, ARRAY_T=23, PLUS=24, MINUS=25, DIVIDE=26, MOD=27, 
		MULTIPLY=28, LEFT_PAR=29, RIGHT_PAR=30, LEFT_SQUARE_PAR=31, RIGHT_SQUARE_PAR=32, 
		LEFT_CLAMP_PAR=33, RIGHT_CLAMP_PAR=34, GT=35, LT=36, EQ=37, CHECK_EQ=38, 
		NOT_EQ=39, GTOREQ=40, LTOREQ=41, OR_T=42, AND_T=43, NOT_T=44, PLUSPLUS=45, 
		MINUSMINUS=46, COLON=47, QUOT_SINGLE=48, QUOT_DOUBLE=49, COMA=50, END_M=51, 
		INT_V=52, BOOL_V=53, STRING_V=54, CHAR_V=55, COLOUR_V=56, ID=57, WS=58, 
		COMMENT=59, NOT=60, COLOR_V=61, DIGIT=62;
	public static final int
		RULE_program = 0, RULE_literal = 1, RULE_var_types = 2, RULE_rel_operator = 3, 
		RULE_math_operator = 4, RULE_expr = 5, RULE_bool_expr = 6, RULE_math_expr = 7, 
		RULE_out_instructions = 8, RULE_instructions = 9, RULE_declaration = 10, 
		RULE_declaration_with_assign = 11, RULE_tile_decl_w_ass = 12, RULE_tt_arg = 13, 
		RULE_assignment = 14, RULE_args_list = 15, RULE_board_size_definition = 16, 
		RULE_board_instr = 17, RULE_draw_instr = 18, RULE_draw_args = 19, RULE_setpos_instr = 20, 
		RULE_if_instr = 21, RULE_if_then_statement = 22, RULE_if_then_otherwise_statement = 23, 
		RULE_otherif_statement = 24, RULE_if_inside_loop_statement = 25, RULE_for_loop = 26, 
		RULE_id_and_int = 27, RULE_inside_loop = 28, RULE_as_long_as_loop = 29, 
		RULE_function_def = 30, RULE_function_declaration_args = 31, RULE_function_call = 32;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "literal", "var_types", "rel_operator", "math_operator", "expr", 
			"bool_expr", "math_expr", "out_instructions", "instructions", "declaration", 
			"declaration_with_assign", "tile_decl_w_ass", "tt_arg", "assignment", 
			"args_list", "board_size_definition", "board_instr", "draw_instr", "draw_args", 
			"setpos_instr", "if_instr", "if_then_statement", "if_then_otherwise_statement", 
			"otherif_statement", "if_inside_loop_statement", "for_loop", "id_and_int", 
			"inside_loop", "as_long_as_loop", "function_def", "function_declaration_args", 
			"function_call"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'if'", "'otherif'", "'otherwise'", "'as'", "'long'", "'for'", 
			"'FUNCTION'", "'return'", "'draw'", "'here'", "'reset'", "'setpos'", 
			"'board_size'", "'break'", "'continue'", "'CONST'", "'TileType'", "'INT'", 
			"'BOOL'", "'CHAR'", "'STRING'", "'COLOUR'", "'ARRAY'", "'+'", "'-'", 
			"'/'", "'%'", "'*'", "'('", "')'", "'['", "']'", "'{'", "'}'", "'>'", 
			"'<'", "'='", "'=='", "'!='", "'>='", "'<='", "'OR'", "'AND'", "'NOT'", 
			"'++'", "'--'", "':'", "'''", "'\\u00E2\\u20AC\\u015B'", "','", "'$'", 
			null, null, null, null, null, null, null, "'#'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IF_T", "OTHERIF_T", "OTHERWISE_T", "AS_T", "LONG_T", "FOR_T", 
			"FUNCTION_T", "RETURN_T", "DRAW_T", "HERE_T", "RESET_T", "SETPOS", "BOARDSIZE_T", 
			"BREAK", "CONTINUE", "CONST", "TT", "INT_T", "BOOL_T", "CHAR_T", "STRING_T", 
			"COLOUR_T", "ARRAY_T", "PLUS", "MINUS", "DIVIDE", "MOD", "MULTIPLY", 
			"LEFT_PAR", "RIGHT_PAR", "LEFT_SQUARE_PAR", "RIGHT_SQUARE_PAR", "LEFT_CLAMP_PAR", 
			"RIGHT_CLAMP_PAR", "GT", "LT", "EQ", "CHECK_EQ", "NOT_EQ", "GTOREQ", 
			"LTOREQ", "OR_T", "AND_T", "NOT_T", "PLUSPLUS", "MINUSMINUS", "COLON", 
			"QUOT_SINGLE", "QUOT_DOUBLE", "COMA", "END_M", "INT_V", "BOOL_V", "STRING_V", 
			"CHAR_V", "COLOUR_V", "ID", "WS", "COMMENT", "NOT", "COLOR_V", "DIGIT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "p_BoardLang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public p_BoardLang(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public Board_size_definitionContext board_size_definition() {
			return getRuleContext(Board_size_definitionContext.class,0);
		}
		public List<Out_instructionsContext> out_instructions() {
			return getRuleContexts(Out_instructionsContext.class);
		}
		public Out_instructionsContext out_instructions(int i) {
			return getRuleContext(Out_instructionsContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof p_BoardLangListener ) ((p_BoardLangListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof p_BoardLangListener ) ((p_BoardLangListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof p_BoardLangVisitor ) return ((p_BoardLangVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			board_size_definition();
			setState(68); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(67);
				out_instructions();
				}
				}
				setState(70); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 144115188084185810L) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode INT_V() { return getToken(p_BoardLang.INT_V, 0); }
		public TerminalNode BOOL_V() { return getToken(p_BoardLang.BOOL_V, 0); }
		public TerminalNode STRING_V() { return getToken(p_BoardLang.STRING_V, 0); }
		public TerminalNode CHAR_V() { return getToken(p_BoardLang.CHAR_V, 0); }
		public TerminalNode COLOUR_V() { return getToken(p_BoardLang.COLOUR_V, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof p_BoardLangListener ) ((p_BoardLangListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof p_BoardLangListener ) ((p_BoardLangListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof p_BoardLangVisitor ) return ((p_BoardLangVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 139611588448485376L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Var_typesContext extends ParserRuleContext {
		public TerminalNode INT_T() { return getToken(p_BoardLang.INT_T, 0); }
		public TerminalNode BOOL_T() { return getToken(p_BoardLang.BOOL_T, 0); }
		public TerminalNode CHAR_T() { return getToken(p_BoardLang.CHAR_T, 0); }
		public TerminalNode STRING_T() { return getToken(p_BoardLang.STRING_T, 0); }
		public TerminalNode COLOUR_T() { return getToken(p_BoardLang.COLOUR_T, 0); }
		public Var_typesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_types; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof p_BoardLangListener ) ((p_BoardLangListener)listener).enterVar_types(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof p_BoardLangListener ) ((p_BoardLangListener)listener).exitVar_types(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof p_BoardLangVisitor ) return ((p_BoardLangVisitor<? extends T>)visitor).visitVar_types(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_typesContext var_types() throws RecognitionException {
		Var_typesContext _localctx = new Var_typesContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_var_types);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 8126464L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Rel_operatorContext extends ParserRuleContext {
		public TerminalNode CHECK_EQ() { return getToken(p_BoardLang.CHECK_EQ, 0); }
		public TerminalNode NOT_EQ() { return getToken(p_BoardLang.NOT_EQ, 0); }
		public TerminalNode GTOREQ() { return getToken(p_BoardLang.GTOREQ, 0); }
		public TerminalNode LTOREQ() { return getToken(p_BoardLang.LTOREQ, 0); }
		public Rel_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rel_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof p_BoardLangListener ) ((p_BoardLangListener)listener).enterRel_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof p_BoardLangListener ) ((p_BoardLangListener)listener).exitRel_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof p_BoardLangVisitor ) return ((p_BoardLangVisitor<? extends T>)visitor).visitRel_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Rel_operatorContext rel_operator() throws RecognitionException {
		Rel_operatorContext _localctx = new Rel_operatorContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_rel_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 4123168604160L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Math_operatorContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(p_BoardLang.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(p_BoardLang.MINUS, 0); }
		public TerminalNode DIVIDE() { return getToken(p_BoardLang.DIVIDE, 0); }
		public TerminalNode MOD() { return getToken(p_BoardLang.MOD, 0); }
		public TerminalNode MULTIPLY() { return getToken(p_BoardLang.MULTIPLY, 0); }
		public Math_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_math_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof p_BoardLangListener ) ((p_BoardLangListener)listener).enterMath_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof p_BoardLangListener ) ((p_BoardLangListener)listener).exitMath_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof p_BoardLangVisitor ) return ((p_BoardLangVisitor<? extends T>)visitor).visitMath_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Math_operatorContext math_operator() throws RecognitionException {
		Math_operatorContext _localctx = new Math_operatorContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_math_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 520093696L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public Math_exprContext math_expr() {
			return getRuleContext(Math_exprContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof p_BoardLangListener ) ((p_BoardLangListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof p_BoardLangListener ) ((p_BoardLangListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof p_BoardLangVisitor ) return ((p_BoardLangVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_expr);
		try {
			setState(82);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(80);
				bool_expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(81);
				math_expr(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Bool_exprContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(p_BoardLang.NOT, 0); }
		public List<Bool_exprContext> bool_expr() {
			return getRuleContexts(Bool_exprContext.class);
		}
		public Bool_exprContext bool_expr(int i) {
			return getRuleContext(Bool_exprContext.class,i);
		}
		public List<Math_exprContext> math_expr() {
			return getRuleContexts(Math_exprContext.class);
		}
		public Math_exprContext math_expr(int i) {
			return getRuleContext(Math_exprContext.class,i);
		}
		public Rel_operatorContext rel_operator() {
			return getRuleContext(Rel_operatorContext.class,0);
		}
		public TerminalNode LEFT_PAR() { return getToken(p_BoardLang.LEFT_PAR, 0); }
		public TerminalNode RIGHT_PAR() { return getToken(p_BoardLang.RIGHT_PAR, 0); }
		public TerminalNode AND_T() { return getToken(p_BoardLang.AND_T, 0); }
		public TerminalNode OR_T() { return getToken(p_BoardLang.OR_T, 0); }
		public Bool_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof p_BoardLangListener ) ((p_BoardLangListener)listener).enterBool_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof p_BoardLangListener ) ((p_BoardLangListener)listener).exitBool_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof p_BoardLangVisitor ) return ((p_BoardLangVisitor<? extends T>)visitor).visitBool_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_exprContext bool_expr() throws RecognitionException {
		return bool_expr(0);
	}

	private Bool_exprContext bool_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Bool_exprContext _localctx = new Bool_exprContext(_ctx, _parentState);
		Bool_exprContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_bool_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(85);
				match(NOT);
				setState(86);
				bool_expr(3);
				}
				break;
			case 2:
				{
				setState(87);
				math_expr(0);
				setState(88);
				rel_operator();
				setState(89);
				math_expr(0);
				}
				break;
			case 3:
				{
				setState(91);
				match(LEFT_PAR);
				setState(92);
				bool_expr(0);
				setState(93);
				match(RIGHT_PAR);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(105);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(103);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new Bool_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bool_expr);
						setState(97);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(98);
						match(AND_T);
						setState(99);
						bool_expr(6);
						}
						break;
					case 2:
						{
						_localctx = new Bool_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bool_expr);
						setState(100);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(101);
						match(OR_T);
						setState(102);
						bool_expr(5);
						}
						break;
					}
					} 
				}
				setState(107);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Math_exprContext extends ParserRuleContext {
		public TerminalNode LEFT_PAR() { return getToken(p_BoardLang.LEFT_PAR, 0); }
		public List<Math_exprContext> math_expr() {
			return getRuleContexts(Math_exprContext.class);
		}
		public Math_exprContext math_expr(int i) {
			return getRuleContext(Math_exprContext.class,i);
		}
		public TerminalNode RIGHT_PAR() { return getToken(p_BoardLang.RIGHT_PAR, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode ID() { return getToken(p_BoardLang.ID, 0); }
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public Math_operatorContext math_operator() {
			return getRuleContext(Math_operatorContext.class,0);
		}
		public Math_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_math_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof p_BoardLangListener ) ((p_BoardLangListener)listener).enterMath_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof p_BoardLangListener ) ((p_BoardLangListener)listener).exitMath_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof p_BoardLangVisitor ) return ((p_BoardLangVisitor<? extends T>)visitor).visitMath_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Math_exprContext math_expr() throws RecognitionException {
		return math_expr(0);
	}

	private Math_exprContext math_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Math_exprContext _localctx = new Math_exprContext(_ctx, _parentState);
		Math_exprContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_math_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(109);
				match(LEFT_PAR);
				setState(110);
				math_expr(0);
				setState(111);
				match(RIGHT_PAR);
				}
				break;
			case 2:
				{
				setState(113);
				literal();
				}
				break;
			case 3:
				{
				setState(114);
				match(ID);
				}
				break;
			case 4:
				{
				setState(115);
				function_call();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(124);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Math_exprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_math_expr);
					setState(118);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(119);
					math_operator();
					setState(120);
					math_expr(5);
					}
					} 
				}
				setState(126);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Out_instructionsContext extends ParserRuleContext {
		public InstructionsContext instructions() {
			return getRuleContext(InstructionsContext.class,0);
		}
		public Function_defContext function_def() {
			return getRuleContext(Function_defContext.class,0);
		}
		public Out_instructionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_out_instructions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof p_BoardLangListener ) ((p_BoardLangListener)listener).enterOut_instructions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof p_BoardLangListener ) ((p_BoardLangListener)listener).exitOut_instructions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof p_BoardLangVisitor ) return ((p_BoardLangVisitor<? extends T>)visitor).visitOut_instructions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Out_instructionsContext out_instructions() throws RecognitionException {
		Out_instructionsContext _localctx = new Out_instructionsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_out_instructions);
		try {
			setState(129);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF_T:
			case AS_T:
			case FOR_T:
			case DRAW_T:
			case RESET_T:
			case SETPOS:
			case CONST:
			case TT:
			case INT_T:
			case BOOL_T:
			case CHAR_T:
			case STRING_T:
			case COLOUR_T:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(127);
				instructions(0);
				}
				break;
			case FUNCTION_T:
				enterOuterAlt(_localctx, 2);
				{
				setState(128);
				function_def();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InstructionsContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public TerminalNode END_M() { return getToken(p_BoardLang.END_M, 0); }
		public Declaration_with_assignContext declaration_with_assign() {
			return getRuleContext(Declaration_with_assignContext.class,0);
		}
		public Tile_decl_w_assContext tile_decl_w_ass() {
			return getRuleContext(Tile_decl_w_assContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public Board_instrContext board_instr() {
			return getRuleContext(Board_instrContext.class,0);
		}
		public If_instrContext if_instr() {
			return getRuleContext(If_instrContext.class,0);
		}
		public For_loopContext for_loop() {
			return getRuleContext(For_loopContext.class,0);
		}
		public As_long_as_loopContext as_long_as_loop() {
			return getRuleContext(As_long_as_loopContext.class,0);
		}
		public List<InstructionsContext> instructions() {
			return getRuleContexts(InstructionsContext.class);
		}
		public InstructionsContext instructions(int i) {
			return getRuleContext(InstructionsContext.class,i);
		}
		public InstructionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instructions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof p_BoardLangListener ) ((p_BoardLangListener)listener).enterInstructions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof p_BoardLangListener ) ((p_BoardLangListener)listener).exitInstructions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof p_BoardLangVisitor ) return ((p_BoardLangVisitor<? extends T>)visitor).visitInstructions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstructionsContext instructions() throws RecognitionException {
		return instructions(0);
	}

	private InstructionsContext instructions(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		InstructionsContext _localctx = new InstructionsContext(_ctx, _parentState);
		InstructionsContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_instructions, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(132);
				declaration();
				setState(133);
				match(END_M);
				}
				break;
			case 2:
				{
				setState(135);
				declaration_with_assign();
				setState(136);
				match(END_M);
				}
				break;
			case 3:
				{
				setState(138);
				tile_decl_w_ass();
				setState(139);
				match(END_M);
				}
				break;
			case 4:
				{
				setState(141);
				assignment();
				setState(142);
				match(END_M);
				}
				break;
			case 5:
				{
				setState(144);
				function_call();
				setState(145);
				match(END_M);
				}
				break;
			case 6:
				{
				setState(147);
				board_instr();
				setState(148);
				match(END_M);
				}
				break;
			case 7:
				{
				setState(150);
				if_instr();
				}
				break;
			case 8:
				{
				setState(151);
				for_loop();
				}
				break;
			case 9:
				{
				setState(152);
				as_long_as_loop();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(159);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InstructionsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_instructions);
					setState(155);
					if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
					setState(156);
					instructions(11);
					}
					} 
				}
				setState(161);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationContext extends ParserRuleContext {
		public Var_typesContext var_types() {
			return getRuleContext(Var_typesContext.class,0);
		}
		public TerminalNode ID() { return getToken(p_BoardLang.ID, 0); }
		public TerminalNode CONST() { return getToken(p_BoardLang.CONST, 0); }
		public TerminalNode LEFT_SQUARE_PAR() { return getToken(p_BoardLang.LEFT_SQUARE_PAR, 0); }
		public TerminalNode INT_V() { return getToken(p_BoardLang.INT_V, 0); }
		public TerminalNode RIGHT_SQUARE_PAR() { return getToken(p_BoardLang.RIGHT_SQUARE_PAR, 0); }
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof p_BoardLangListener ) ((p_BoardLangListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof p_BoardLangListener ) ((p_BoardLangListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof p_BoardLangVisitor ) return ((p_BoardLangVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONST) {
				{
				setState(162);
				match(CONST);
				}
			}

			setState(165);
			var_types();
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LEFT_SQUARE_PAR) {
				{
				setState(166);
				match(LEFT_SQUARE_PAR);
				setState(167);
				match(INT_V);
				setState(168);
				match(RIGHT_SQUARE_PAR);
				}
			}

			setState(171);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Declaration_with_assignContext extends ParserRuleContext {
		public Var_typesContext var_types() {
			return getRuleContext(Var_typesContext.class,0);
		}
		public TerminalNode ID() { return getToken(p_BoardLang.ID, 0); }
		public TerminalNode EQ() { return getToken(p_BoardLang.EQ, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CONST() { return getToken(p_BoardLang.CONST, 0); }
		public TerminalNode LEFT_SQUARE_PAR() { return getToken(p_BoardLang.LEFT_SQUARE_PAR, 0); }
		public TerminalNode INT_V() { return getToken(p_BoardLang.INT_V, 0); }
		public TerminalNode RIGHT_SQUARE_PAR() { return getToken(p_BoardLang.RIGHT_SQUARE_PAR, 0); }
		public Args_listContext args_list() {
			return getRuleContext(Args_listContext.class,0);
		}
		public Declaration_with_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration_with_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof p_BoardLangListener ) ((p_BoardLangListener)listener).enterDeclaration_with_assign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof p_BoardLangListener ) ((p_BoardLangListener)listener).exitDeclaration_with_assign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof p_BoardLangVisitor ) return ((p_BoardLangVisitor<? extends T>)visitor).visitDeclaration_with_assign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declaration_with_assignContext declaration_with_assign() throws RecognitionException {
		Declaration_with_assignContext _localctx = new Declaration_with_assignContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_declaration_with_assign);
		int _la;
		try {
			setState(192);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(174);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CONST) {
					{
					setState(173);
					match(CONST);
					}
				}

				setState(176);
				var_types();
				setState(177);
				match(ID);
				setState(178);
				match(EQ);
				setState(179);
				expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(182);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CONST) {
					{
					setState(181);
					match(CONST);
					}
				}

				setState(184);
				var_types();
				setState(185);
				match(LEFT_SQUARE_PAR);
				setState(186);
				match(INT_V);
				setState(187);
				match(RIGHT_SQUARE_PAR);
				setState(188);
				match(ID);
				setState(189);
				match(EQ);
				setState(190);
				args_list(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Tile_decl_w_assContext extends ParserRuleContext {
		public List<TerminalNode> TT() { return getTokens(p_BoardLang.TT); }
		public TerminalNode TT(int i) {
			return getToken(p_BoardLang.TT, i);
		}
		public TerminalNode ID() { return getToken(p_BoardLang.ID, 0); }
		public TerminalNode EQ() { return getToken(p_BoardLang.EQ, 0); }
		public TerminalNode LEFT_PAR() { return getToken(p_BoardLang.LEFT_PAR, 0); }
		public Tt_argContext tt_arg() {
			return getRuleContext(Tt_argContext.class,0);
		}
		public TerminalNode RIGHT_PAR() { return getToken(p_BoardLang.RIGHT_PAR, 0); }
		public TerminalNode CONST() { return getToken(p_BoardLang.CONST, 0); }
		public Tile_decl_w_assContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tile_decl_w_ass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof p_BoardLangListener ) ((p_BoardLangListener)listener).enterTile_decl_w_ass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof p_BoardLangListener ) ((p_BoardLangListener)listener).exitTile_decl_w_ass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof p_BoardLangVisitor ) return ((p_BoardLangVisitor<? extends T>)visitor).visitTile_decl_w_ass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tile_decl_w_assContext tile_decl_w_ass() throws RecognitionException {
		Tile_decl_w_assContext _localctx = new Tile_decl_w_assContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_tile_decl_w_ass);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONST) {
				{
				setState(194);
				match(CONST);
				}
			}

			setState(197);
			match(TT);
			setState(198);
			match(ID);
			setState(199);
			match(EQ);
			setState(200);
			match(TT);
			setState(201);
			match(LEFT_PAR);
			setState(202);
			tt_arg();
			setState(203);
			match(RIGHT_PAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Tt_argContext extends ParserRuleContext {
		public TerminalNode COLOR_V() { return getToken(p_BoardLang.COLOR_V, 0); }
		public TerminalNode STRING_V() { return getToken(p_BoardLang.STRING_V, 0); }
		public Tt_argContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tt_arg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof p_BoardLangListener ) ((p_BoardLangListener)listener).enterTt_arg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof p_BoardLangListener ) ((p_BoardLangListener)listener).exitTt_arg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof p_BoardLangVisitor ) return ((p_BoardLangVisitor<? extends T>)visitor).visitTt_arg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tt_argContext tt_arg() throws RecognitionException {
		Tt_argContext _localctx = new Tt_argContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_tt_arg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			_la = _input.LA(1);
			if ( !(_la==STRING_V || _la==COLOR_V) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(p_BoardLang.ID, 0); }
		public TerminalNode EQ() { return getToken(p_BoardLang.EQ, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode LEFT_SQUARE_PAR() { return getToken(p_BoardLang.LEFT_SQUARE_PAR, 0); }
		public TerminalNode DIGIT() { return getToken(p_BoardLang.DIGIT, 0); }
		public TerminalNode RIGHT_SQUARE_PAR() { return getToken(p_BoardLang.RIGHT_SQUARE_PAR, 0); }
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof p_BoardLangListener ) ((p_BoardLangListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof p_BoardLangListener ) ((p_BoardLangListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof p_BoardLangVisitor ) return ((p_BoardLangVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_assignment);
		try {
			setState(216);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(207);
				match(ID);
				setState(208);
				match(EQ);
				setState(209);
				expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(210);
				match(ID);
				setState(211);
				match(LEFT_SQUARE_PAR);
				setState(212);
				match(DIGIT);
				setState(213);
				match(RIGHT_SQUARE_PAR);
				setState(214);
				match(EQ);
				setState(215);
				expr();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Args_listContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(p_BoardLang.ID, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public List<Args_listContext> args_list() {
			return getRuleContexts(Args_listContext.class);
		}
		public Args_listContext args_list(int i) {
			return getRuleContext(Args_listContext.class,i);
		}
		public TerminalNode COMA() { return getToken(p_BoardLang.COMA, 0); }
		public Args_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof p_BoardLangListener ) ((p_BoardLangListener)listener).enterArgs_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof p_BoardLangListener ) ((p_BoardLangListener)listener).exitArgs_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof p_BoardLangVisitor ) return ((p_BoardLangVisitor<? extends T>)visitor).visitArgs_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Args_listContext args_list() throws RecognitionException {
		return args_list(0);
	}

	private Args_listContext args_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Args_listContext _localctx = new Args_listContext(_ctx, _parentState);
		Args_listContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_args_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(219);
				match(ID);
				}
				break;
			case INT_V:
			case BOOL_V:
			case STRING_V:
			case CHAR_V:
			case COLOUR_V:
				{
				setState(220);
				literal();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(228);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Args_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_args_list);
					setState(223);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(224);
					match(COMA);
					setState(225);
					args_list(2);
					}
					} 
				}
				setState(230);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Board_size_definitionContext extends ParserRuleContext {
		public TerminalNode BOARDSIZE_T() { return getToken(p_BoardLang.BOARDSIZE_T, 0); }
		public TerminalNode LEFT_SQUARE_PAR() { return getToken(p_BoardLang.LEFT_SQUARE_PAR, 0); }
		public List<Id_and_intContext> id_and_int() {
			return getRuleContexts(Id_and_intContext.class);
		}
		public Id_and_intContext id_and_int(int i) {
			return getRuleContext(Id_and_intContext.class,i);
		}
		public TerminalNode COLON() { return getToken(p_BoardLang.COLON, 0); }
		public TerminalNode RIGHT_SQUARE_PAR() { return getToken(p_BoardLang.RIGHT_SQUARE_PAR, 0); }
		public Board_size_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_board_size_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof p_BoardLangListener ) ((p_BoardLangListener)listener).enterBoard_size_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof p_BoardLangListener ) ((p_BoardLangListener)listener).exitBoard_size_definition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof p_BoardLangVisitor ) return ((p_BoardLangVisitor<? extends T>)visitor).visitBoard_size_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Board_size_definitionContext board_size_definition() throws RecognitionException {
		Board_size_definitionContext _localctx = new Board_size_definitionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_board_size_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			match(BOARDSIZE_T);
			setState(232);
			match(LEFT_SQUARE_PAR);
			setState(233);
			id_and_int();
			setState(234);
			match(COLON);
			setState(235);
			id_and_int();
			setState(236);
			match(RIGHT_SQUARE_PAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Board_instrContext extends ParserRuleContext {
		public Draw_instrContext draw_instr() {
			return getRuleContext(Draw_instrContext.class,0);
		}
		public TerminalNode RESET_T() { return getToken(p_BoardLang.RESET_T, 0); }
		public Setpos_instrContext setpos_instr() {
			return getRuleContext(Setpos_instrContext.class,0);
		}
		public Board_instrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_board_instr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof p_BoardLangListener ) ((p_BoardLangListener)listener).enterBoard_instr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof p_BoardLangListener ) ((p_BoardLangListener)listener).exitBoard_instr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof p_BoardLangVisitor ) return ((p_BoardLangVisitor<? extends T>)visitor).visitBoard_instr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Board_instrContext board_instr() throws RecognitionException {
		Board_instrContext _localctx = new Board_instrContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_board_instr);
		try {
			setState(241);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DRAW_T:
				enterOuterAlt(_localctx, 1);
				{
				setState(238);
				draw_instr();
				}
				break;
			case RESET_T:
				enterOuterAlt(_localctx, 2);
				{
				setState(239);
				match(RESET_T);
				}
				break;
			case SETPOS:
				enterOuterAlt(_localctx, 3);
				{
				setState(240);
				setpos_instr();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Draw_instrContext extends ParserRuleContext {
		public TerminalNode DRAW_T() { return getToken(p_BoardLang.DRAW_T, 0); }
		public TerminalNode LEFT_SQUARE_PAR() { return getToken(p_BoardLang.LEFT_SQUARE_PAR, 0); }
		public Draw_argsContext draw_args() {
			return getRuleContext(Draw_argsContext.class,0);
		}
		public TerminalNode RIGHT_SQUARE_PAR() { return getToken(p_BoardLang.RIGHT_SQUARE_PAR, 0); }
		public TerminalNode ID() { return getToken(p_BoardLang.ID, 0); }
		public Draw_instrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_draw_instr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof p_BoardLangListener ) ((p_BoardLangListener)listener).enterDraw_instr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof p_BoardLangListener ) ((p_BoardLangListener)listener).exitDraw_instr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof p_BoardLangVisitor ) return ((p_BoardLangVisitor<? extends T>)visitor).visitDraw_instr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Draw_instrContext draw_instr() throws RecognitionException {
		Draw_instrContext _localctx = new Draw_instrContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_draw_instr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			match(DRAW_T);
			setState(244);
			match(LEFT_SQUARE_PAR);
			setState(245);
			draw_args();
			setState(246);
			match(RIGHT_SQUARE_PAR);
			setState(247);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Draw_argsContext extends ParserRuleContext {
		public TerminalNode HERE_T() { return getToken(p_BoardLang.HERE_T, 0); }
		public List<Id_and_intContext> id_and_int() {
			return getRuleContexts(Id_and_intContext.class);
		}
		public Id_and_intContext id_and_int(int i) {
			return getRuleContext(Id_and_intContext.class,i);
		}
		public TerminalNode COLON() { return getToken(p_BoardLang.COLON, 0); }
		public Draw_argsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_draw_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof p_BoardLangListener ) ((p_BoardLangListener)listener).enterDraw_args(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof p_BoardLangListener ) ((p_BoardLangListener)listener).exitDraw_args(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof p_BoardLangVisitor ) return ((p_BoardLangVisitor<? extends T>)visitor).visitDraw_args(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Draw_argsContext draw_args() throws RecognitionException {
		Draw_argsContext _localctx = new Draw_argsContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_draw_args);
		try {
			setState(254);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HERE_T:
				enterOuterAlt(_localctx, 1);
				{
				setState(249);
				match(HERE_T);
				}
				break;
			case INT_V:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(250);
				id_and_int();
				setState(251);
				match(COLON);
				setState(252);
				id_and_int();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Setpos_instrContext extends ParserRuleContext {
		public TerminalNode SETPOS() { return getToken(p_BoardLang.SETPOS, 0); }
		public TerminalNode LEFT_SQUARE_PAR() { return getToken(p_BoardLang.LEFT_SQUARE_PAR, 0); }
		public List<Id_and_intContext> id_and_int() {
			return getRuleContexts(Id_and_intContext.class);
		}
		public Id_and_intContext id_and_int(int i) {
			return getRuleContext(Id_and_intContext.class,i);
		}
		public TerminalNode COLON() { return getToken(p_BoardLang.COLON, 0); }
		public TerminalNode RIGHT_SQUARE_PAR() { return getToken(p_BoardLang.RIGHT_SQUARE_PAR, 0); }
		public Setpos_instrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setpos_instr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof p_BoardLangListener ) ((p_BoardLangListener)listener).enterSetpos_instr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof p_BoardLangListener ) ((p_BoardLangListener)listener).exitSetpos_instr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof p_BoardLangVisitor ) return ((p_BoardLangVisitor<? extends T>)visitor).visitSetpos_instr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Setpos_instrContext setpos_instr() throws RecognitionException {
		Setpos_instrContext _localctx = new Setpos_instrContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_setpos_instr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			match(SETPOS);
			setState(257);
			match(LEFT_SQUARE_PAR);
			setState(258);
			id_and_int();
			setState(259);
			match(COLON);
			setState(260);
			id_and_int();
			setState(261);
			match(RIGHT_SQUARE_PAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class If_instrContext extends ParserRuleContext {
		public If_then_statementContext if_then_statement() {
			return getRuleContext(If_then_statementContext.class,0);
		}
		public If_then_otherwise_statementContext if_then_otherwise_statement() {
			return getRuleContext(If_then_otherwise_statementContext.class,0);
		}
		public If_instrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_instr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof p_BoardLangListener ) ((p_BoardLangListener)listener).enterIf_instr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof p_BoardLangListener ) ((p_BoardLangListener)listener).exitIf_instr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof p_BoardLangVisitor ) return ((p_BoardLangVisitor<? extends T>)visitor).visitIf_instr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_instrContext if_instr() throws RecognitionException {
		If_instrContext _localctx = new If_instrContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_if_instr);
		try {
			setState(265);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(263);
				if_then_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(264);
				if_then_otherwise_statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class If_then_statementContext extends ParserRuleContext {
		public TerminalNode IF_T() { return getToken(p_BoardLang.IF_T, 0); }
		public TerminalNode LEFT_PAR() { return getToken(p_BoardLang.LEFT_PAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RIGHT_PAR() { return getToken(p_BoardLang.RIGHT_PAR, 0); }
		public TerminalNode LEFT_CLAMP_PAR() { return getToken(p_BoardLang.LEFT_CLAMP_PAR, 0); }
		public InstructionsContext instructions() {
			return getRuleContext(InstructionsContext.class,0);
		}
		public TerminalNode RIGHT_CLAMP_PAR() { return getToken(p_BoardLang.RIGHT_CLAMP_PAR, 0); }
		public If_then_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_then_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof p_BoardLangListener ) ((p_BoardLangListener)listener).enterIf_then_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof p_BoardLangListener ) ((p_BoardLangListener)listener).exitIf_then_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof p_BoardLangVisitor ) return ((p_BoardLangVisitor<? extends T>)visitor).visitIf_then_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_then_statementContext if_then_statement() throws RecognitionException {
		If_then_statementContext _localctx = new If_then_statementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_if_then_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			match(IF_T);
			setState(268);
			match(LEFT_PAR);
			setState(269);
			expr();
			setState(270);
			match(RIGHT_PAR);
			setState(271);
			match(LEFT_CLAMP_PAR);
			setState(272);
			instructions(0);
			setState(273);
			match(RIGHT_CLAMP_PAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class If_then_otherwise_statementContext extends ParserRuleContext {
		public TerminalNode IF_T() { return getToken(p_BoardLang.IF_T, 0); }
		public TerminalNode LEFT_PAR() { return getToken(p_BoardLang.LEFT_PAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RIGHT_PAR() { return getToken(p_BoardLang.RIGHT_PAR, 0); }
		public List<TerminalNode> LEFT_CLAMP_PAR() { return getTokens(p_BoardLang.LEFT_CLAMP_PAR); }
		public TerminalNode LEFT_CLAMP_PAR(int i) {
			return getToken(p_BoardLang.LEFT_CLAMP_PAR, i);
		}
		public List<InstructionsContext> instructions() {
			return getRuleContexts(InstructionsContext.class);
		}
		public InstructionsContext instructions(int i) {
			return getRuleContext(InstructionsContext.class,i);
		}
		public List<TerminalNode> RIGHT_CLAMP_PAR() { return getTokens(p_BoardLang.RIGHT_CLAMP_PAR); }
		public TerminalNode RIGHT_CLAMP_PAR(int i) {
			return getToken(p_BoardLang.RIGHT_CLAMP_PAR, i);
		}
		public Otherif_statementContext otherif_statement() {
			return getRuleContext(Otherif_statementContext.class,0);
		}
		public TerminalNode OTHERWISE_T() { return getToken(p_BoardLang.OTHERWISE_T, 0); }
		public If_then_otherwise_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_then_otherwise_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof p_BoardLangListener ) ((p_BoardLangListener)listener).enterIf_then_otherwise_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof p_BoardLangListener ) ((p_BoardLangListener)listener).exitIf_then_otherwise_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof p_BoardLangVisitor ) return ((p_BoardLangVisitor<? extends T>)visitor).visitIf_then_otherwise_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_then_otherwise_statementContext if_then_otherwise_statement() throws RecognitionException {
		If_then_otherwise_statementContext _localctx = new If_then_otherwise_statementContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_if_then_otherwise_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			match(IF_T);
			setState(276);
			match(LEFT_PAR);
			setState(277);
			expr();
			setState(278);
			match(RIGHT_PAR);
			setState(279);
			match(LEFT_CLAMP_PAR);
			setState(280);
			instructions(0);
			setState(281);
			match(RIGHT_CLAMP_PAR);
			setState(283);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(282);
				otherif_statement(0);
				}
				break;
			}
			setState(290);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(285);
				match(OTHERWISE_T);
				setState(286);
				match(LEFT_CLAMP_PAR);
				setState(287);
				instructions(0);
				setState(288);
				match(RIGHT_CLAMP_PAR);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Otherif_statementContext extends ParserRuleContext {
		public TerminalNode OTHERIF_T() { return getToken(p_BoardLang.OTHERIF_T, 0); }
		public TerminalNode LEFT_PAR() { return getToken(p_BoardLang.LEFT_PAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RIGHT_PAR() { return getToken(p_BoardLang.RIGHT_PAR, 0); }
		public TerminalNode LEFT_CLAMP_PAR() { return getToken(p_BoardLang.LEFT_CLAMP_PAR, 0); }
		public InstructionsContext instructions() {
			return getRuleContext(InstructionsContext.class,0);
		}
		public TerminalNode RIGHT_CLAMP_PAR() { return getToken(p_BoardLang.RIGHT_CLAMP_PAR, 0); }
		public List<Otherif_statementContext> otherif_statement() {
			return getRuleContexts(Otherif_statementContext.class);
		}
		public Otherif_statementContext otherif_statement(int i) {
			return getRuleContext(Otherif_statementContext.class,i);
		}
		public Otherif_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_otherif_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof p_BoardLangListener ) ((p_BoardLangListener)listener).enterOtherif_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof p_BoardLangListener ) ((p_BoardLangListener)listener).exitOtherif_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof p_BoardLangVisitor ) return ((p_BoardLangVisitor<? extends T>)visitor).visitOtherif_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Otherif_statementContext otherif_statement() throws RecognitionException {
		return otherif_statement(0);
	}

	private Otherif_statementContext otherif_statement(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Otherif_statementContext _localctx = new Otherif_statementContext(_ctx, _parentState);
		Otherif_statementContext _prevctx = _localctx;
		int _startState = 48;
		enterRecursionRule(_localctx, 48, RULE_otherif_statement, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(293);
			match(OTHERIF_T);
			setState(294);
			match(LEFT_PAR);
			setState(295);
			expr();
			setState(296);
			match(RIGHT_PAR);
			setState(297);
			match(LEFT_CLAMP_PAR);
			setState(298);
			instructions(0);
			setState(299);
			match(RIGHT_CLAMP_PAR);
			}
			_ctx.stop = _input.LT(-1);
			setState(305);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Otherif_statementContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_otherif_statement);
					setState(301);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(302);
					otherif_statement(2);
					}
					} 
				}
				setState(307);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class If_inside_loop_statementContext extends ParserRuleContext {
		public TerminalNode IF_T() { return getToken(p_BoardLang.IF_T, 0); }
		public List<TerminalNode> LEFT_PAR() { return getTokens(p_BoardLang.LEFT_PAR); }
		public TerminalNode LEFT_PAR(int i) {
			return getToken(p_BoardLang.LEFT_PAR, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> RIGHT_PAR() { return getTokens(p_BoardLang.RIGHT_PAR); }
		public TerminalNode RIGHT_PAR(int i) {
			return getToken(p_BoardLang.RIGHT_PAR, i);
		}
		public List<TerminalNode> LEFT_CLAMP_PAR() { return getTokens(p_BoardLang.LEFT_CLAMP_PAR); }
		public TerminalNode LEFT_CLAMP_PAR(int i) {
			return getToken(p_BoardLang.LEFT_CLAMP_PAR, i);
		}
		public List<TerminalNode> RIGHT_CLAMP_PAR() { return getTokens(p_BoardLang.RIGHT_CLAMP_PAR); }
		public TerminalNode RIGHT_CLAMP_PAR(int i) {
			return getToken(p_BoardLang.RIGHT_CLAMP_PAR, i);
		}
		public List<InstructionsContext> instructions() {
			return getRuleContexts(InstructionsContext.class);
		}
		public InstructionsContext instructions(int i) {
			return getRuleContext(InstructionsContext.class,i);
		}
		public List<TerminalNode> BREAK() { return getTokens(p_BoardLang.BREAK); }
		public TerminalNode BREAK(int i) {
			return getToken(p_BoardLang.BREAK, i);
		}
		public List<TerminalNode> CONTINUE() { return getTokens(p_BoardLang.CONTINUE); }
		public TerminalNode CONTINUE(int i) {
			return getToken(p_BoardLang.CONTINUE, i);
		}
		public List<TerminalNode> OTHERIF_T() { return getTokens(p_BoardLang.OTHERIF_T); }
		public TerminalNode OTHERIF_T(int i) {
			return getToken(p_BoardLang.OTHERIF_T, i);
		}
		public TerminalNode OTHERWISE_T() { return getToken(p_BoardLang.OTHERWISE_T, 0); }
		public If_inside_loop_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_inside_loop_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof p_BoardLangListener ) ((p_BoardLangListener)listener).enterIf_inside_loop_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof p_BoardLangListener ) ((p_BoardLangListener)listener).exitIf_inside_loop_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof p_BoardLangVisitor ) return ((p_BoardLangVisitor<? extends T>)visitor).visitIf_inside_loop_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_inside_loop_statementContext if_inside_loop_statement() throws RecognitionException {
		If_inside_loop_statementContext _localctx = new If_inside_loop_statementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_if_inside_loop_statement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			match(IF_T);
			setState(309);
			match(LEFT_PAR);
			setState(310);
			expr();
			setState(311);
			match(RIGHT_PAR);
			setState(312);
			match(LEFT_CLAMP_PAR);
			setState(316);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF_T:
			case AS_T:
			case FOR_T:
			case DRAW_T:
			case RESET_T:
			case SETPOS:
			case CONST:
			case TT:
			case INT_T:
			case BOOL_T:
			case CHAR_T:
			case STRING_T:
			case COLOUR_T:
			case ID:
				{
				setState(313);
				instructions(0);
				}
				break;
			case BREAK:
				{
				setState(314);
				match(BREAK);
				}
				break;
			case CONTINUE:
				{
				setState(315);
				match(CONTINUE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(318);
			match(RIGHT_CLAMP_PAR);
			setState(333);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(319);
					match(OTHERIF_T);
					setState(320);
					match(LEFT_PAR);
					setState(321);
					expr();
					setState(322);
					match(RIGHT_PAR);
					setState(323);
					match(LEFT_CLAMP_PAR);
					setState(327);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case IF_T:
					case AS_T:
					case FOR_T:
					case DRAW_T:
					case RESET_T:
					case SETPOS:
					case CONST:
					case TT:
					case INT_T:
					case BOOL_T:
					case CHAR_T:
					case STRING_T:
					case COLOUR_T:
					case ID:
						{
						setState(324);
						instructions(0);
						}
						break;
					case BREAK:
						{
						setState(325);
						match(BREAK);
						}
						break;
					case CONTINUE:
						{
						setState(326);
						match(CONTINUE);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(329);
					match(RIGHT_CLAMP_PAR);
					}
					} 
				}
				setState(335);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			}
			setState(344);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(336);
				match(OTHERWISE_T);
				setState(337);
				match(LEFT_CLAMP_PAR);
				setState(341);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IF_T:
				case AS_T:
				case FOR_T:
				case DRAW_T:
				case RESET_T:
				case SETPOS:
				case CONST:
				case TT:
				case INT_T:
				case BOOL_T:
				case CHAR_T:
				case STRING_T:
				case COLOUR_T:
				case ID:
					{
					setState(338);
					instructions(0);
					}
					break;
				case BREAK:
					{
					setState(339);
					match(BREAK);
					}
					break;
				case CONTINUE:
					{
					setState(340);
					match(CONTINUE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(343);
				match(RIGHT_CLAMP_PAR);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class For_loopContext extends ParserRuleContext {
		public TerminalNode FOR_T() { return getToken(p_BoardLang.FOR_T, 0); }
		public TerminalNode LEFT_PAR() { return getToken(p_BoardLang.LEFT_PAR, 0); }
		public List<Id_and_intContext> id_and_int() {
			return getRuleContexts(Id_and_intContext.class);
		}
		public Id_and_intContext id_and_int(int i) {
			return getRuleContext(Id_and_intContext.class,i);
		}
		public List<TerminalNode> COLON() { return getTokens(p_BoardLang.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(p_BoardLang.COLON, i);
		}
		public TerminalNode RIGHT_PAR() { return getToken(p_BoardLang.RIGHT_PAR, 0); }
		public TerminalNode LEFT_CLAMP_PAR() { return getToken(p_BoardLang.LEFT_CLAMP_PAR, 0); }
		public Inside_loopContext inside_loop() {
			return getRuleContext(Inside_loopContext.class,0);
		}
		public TerminalNode RIGHT_CLAMP_PAR() { return getToken(p_BoardLang.RIGHT_CLAMP_PAR, 0); }
		public For_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof p_BoardLangListener ) ((p_BoardLangListener)listener).enterFor_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof p_BoardLangListener ) ((p_BoardLangListener)listener).exitFor_loop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof p_BoardLangVisitor ) return ((p_BoardLangVisitor<? extends T>)visitor).visitFor_loop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_loopContext for_loop() throws RecognitionException {
		For_loopContext _localctx = new For_loopContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_for_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			match(FOR_T);
			setState(347);
			match(LEFT_PAR);
			setState(348);
			id_and_int();
			setState(349);
			match(COLON);
			setState(350);
			id_and_int();
			setState(351);
			match(COLON);
			setState(352);
			id_and_int();
			setState(353);
			match(RIGHT_PAR);
			setState(354);
			match(LEFT_CLAMP_PAR);
			setState(355);
			inside_loop(0);
			setState(356);
			match(RIGHT_CLAMP_PAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Id_and_intContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(p_BoardLang.ID, 0); }
		public TerminalNode INT_V() { return getToken(p_BoardLang.INT_V, 0); }
		public Id_and_intContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id_and_int; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof p_BoardLangListener ) ((p_BoardLangListener)listener).enterId_and_int(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof p_BoardLangListener ) ((p_BoardLangListener)listener).exitId_and_int(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof p_BoardLangVisitor ) return ((p_BoardLangVisitor<? extends T>)visitor).visitId_and_int(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Id_and_intContext id_and_int() throws RecognitionException {
		Id_and_intContext _localctx = new Id_and_intContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_id_and_int);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
			_la = _input.LA(1);
			if ( !(_la==INT_V || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Inside_loopContext extends ParserRuleContext {
		public InstructionsContext instructions() {
			return getRuleContext(InstructionsContext.class,0);
		}
		public If_inside_loop_statementContext if_inside_loop_statement() {
			return getRuleContext(If_inside_loop_statementContext.class,0);
		}
		public List<Inside_loopContext> inside_loop() {
			return getRuleContexts(Inside_loopContext.class);
		}
		public Inside_loopContext inside_loop(int i) {
			return getRuleContext(Inside_loopContext.class,i);
		}
		public Inside_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inside_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof p_BoardLangListener ) ((p_BoardLangListener)listener).enterInside_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof p_BoardLangListener ) ((p_BoardLangListener)listener).exitInside_loop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof p_BoardLangVisitor ) return ((p_BoardLangVisitor<? extends T>)visitor).visitInside_loop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Inside_loopContext inside_loop() throws RecognitionException {
		return inside_loop(0);
	}

	private Inside_loopContext inside_loop(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Inside_loopContext _localctx = new Inside_loopContext(_ctx, _parentState);
		Inside_loopContext _prevctx = _localctx;
		int _startState = 56;
		enterRecursionRule(_localctx, 56, RULE_inside_loop, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(361);
				instructions(0);
				}
				break;
			case 2:
				{
				setState(362);
				if_inside_loop_statement();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(369);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Inside_loopContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_inside_loop);
					setState(365);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(366);
					inside_loop(2);
					}
					} 
				}
				setState(371);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class As_long_as_loopContext extends ParserRuleContext {
		public List<TerminalNode> AS_T() { return getTokens(p_BoardLang.AS_T); }
		public TerminalNode AS_T(int i) {
			return getToken(p_BoardLang.AS_T, i);
		}
		public TerminalNode LONG_T() { return getToken(p_BoardLang.LONG_T, 0); }
		public TerminalNode LEFT_PAR() { return getToken(p_BoardLang.LEFT_PAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RIGHT_PAR() { return getToken(p_BoardLang.RIGHT_PAR, 0); }
		public TerminalNode LEFT_CLAMP_PAR() { return getToken(p_BoardLang.LEFT_CLAMP_PAR, 0); }
		public InstructionsContext instructions() {
			return getRuleContext(InstructionsContext.class,0);
		}
		public TerminalNode RIGHT_CLAMP_PAR() { return getToken(p_BoardLang.RIGHT_CLAMP_PAR, 0); }
		public As_long_as_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_as_long_as_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof p_BoardLangListener ) ((p_BoardLangListener)listener).enterAs_long_as_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof p_BoardLangListener ) ((p_BoardLangListener)listener).exitAs_long_as_loop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof p_BoardLangVisitor ) return ((p_BoardLangVisitor<? extends T>)visitor).visitAs_long_as_loop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final As_long_as_loopContext as_long_as_loop() throws RecognitionException {
		As_long_as_loopContext _localctx = new As_long_as_loopContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_as_long_as_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(372);
			match(AS_T);
			setState(373);
			match(LONG_T);
			setState(374);
			match(AS_T);
			setState(375);
			match(LEFT_PAR);
			setState(376);
			expr();
			setState(377);
			match(RIGHT_PAR);
			setState(378);
			match(LEFT_CLAMP_PAR);
			setState(379);
			instructions(0);
			setState(380);
			match(RIGHT_CLAMP_PAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Function_defContext extends ParserRuleContext {
		public TerminalNode FUNCTION_T() { return getToken(p_BoardLang.FUNCTION_T, 0); }
		public TerminalNode ID() { return getToken(p_BoardLang.ID, 0); }
		public TerminalNode LEFT_PAR() { return getToken(p_BoardLang.LEFT_PAR, 0); }
		public Function_declaration_argsContext function_declaration_args() {
			return getRuleContext(Function_declaration_argsContext.class,0);
		}
		public TerminalNode RIGHT_PAR() { return getToken(p_BoardLang.RIGHT_PAR, 0); }
		public TerminalNode LEFT_CLAMP_PAR() { return getToken(p_BoardLang.LEFT_CLAMP_PAR, 0); }
		public InstructionsContext instructions() {
			return getRuleContext(InstructionsContext.class,0);
		}
		public TerminalNode RIGHT_CLAMP_PAR() { return getToken(p_BoardLang.RIGHT_CLAMP_PAR, 0); }
		public Function_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof p_BoardLangListener ) ((p_BoardLangListener)listener).enterFunction_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof p_BoardLangListener ) ((p_BoardLangListener)listener).exitFunction_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof p_BoardLangVisitor ) return ((p_BoardLangVisitor<? extends T>)visitor).visitFunction_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_defContext function_def() throws RecognitionException {
		Function_defContext _localctx = new Function_defContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_function_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
			match(FUNCTION_T);
			setState(383);
			match(ID);
			setState(384);
			match(LEFT_PAR);
			setState(385);
			function_declaration_args(0);
			setState(386);
			match(RIGHT_PAR);
			setState(387);
			match(LEFT_CLAMP_PAR);
			setState(388);
			instructions(0);
			setState(389);
			match(RIGHT_CLAMP_PAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Function_declaration_argsContext extends ParserRuleContext {
		public Var_typesContext var_types() {
			return getRuleContext(Var_typesContext.class,0);
		}
		public TerminalNode ID() { return getToken(p_BoardLang.ID, 0); }
		public List<Function_declaration_argsContext> function_declaration_args() {
			return getRuleContexts(Function_declaration_argsContext.class);
		}
		public Function_declaration_argsContext function_declaration_args(int i) {
			return getRuleContext(Function_declaration_argsContext.class,i);
		}
		public TerminalNode COMA() { return getToken(p_BoardLang.COMA, 0); }
		public Function_declaration_argsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_declaration_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof p_BoardLangListener ) ((p_BoardLangListener)listener).enterFunction_declaration_args(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof p_BoardLangListener ) ((p_BoardLangListener)listener).exitFunction_declaration_args(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof p_BoardLangVisitor ) return ((p_BoardLangVisitor<? extends T>)visitor).visitFunction_declaration_args(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_declaration_argsContext function_declaration_args() throws RecognitionException {
		return function_declaration_args(0);
	}

	private Function_declaration_argsContext function_declaration_args(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Function_declaration_argsContext _localctx = new Function_declaration_argsContext(_ctx, _parentState);
		Function_declaration_argsContext _prevctx = _localctx;
		int _startState = 62;
		enterRecursionRule(_localctx, 62, RULE_function_declaration_args, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(392);
			var_types();
			setState(393);
			match(ID);
			}
			_ctx.stop = _input.LT(-1);
			setState(400);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Function_declaration_argsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_function_declaration_args);
					setState(395);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(396);
					match(COMA);
					setState(397);
					function_declaration_args(2);
					}
					} 
				}
				setState(402);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Function_callContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(p_BoardLang.ID, 0); }
		public TerminalNode LEFT_PAR() { return getToken(p_BoardLang.LEFT_PAR, 0); }
		public Args_listContext args_list() {
			return getRuleContext(Args_listContext.class,0);
		}
		public TerminalNode RIGHT_PAR() { return getToken(p_BoardLang.RIGHT_PAR, 0); }
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof p_BoardLangListener ) ((p_BoardLangListener)listener).enterFunction_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof p_BoardLangListener ) ((p_BoardLangListener)listener).exitFunction_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof p_BoardLangVisitor ) return ((p_BoardLangVisitor<? extends T>)visitor).visitFunction_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_function_call);
		try {
			setState(411);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(403);
				match(ID);
				setState(404);
				match(LEFT_PAR);
				setState(405);
				args_list(0);
				setState(406);
				match(RIGHT_PAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(408);
				match(ID);
				setState(409);
				match(LEFT_PAR);
				setState(410);
				match(RIGHT_PAR);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 6:
			return bool_expr_sempred((Bool_exprContext)_localctx, predIndex);
		case 7:
			return math_expr_sempred((Math_exprContext)_localctx, predIndex);
		case 9:
			return instructions_sempred((InstructionsContext)_localctx, predIndex);
		case 15:
			return args_list_sempred((Args_listContext)_localctx, predIndex);
		case 24:
			return otherif_statement_sempred((Otherif_statementContext)_localctx, predIndex);
		case 28:
			return inside_loop_sempred((Inside_loopContext)_localctx, predIndex);
		case 31:
			return function_declaration_args_sempred((Function_declaration_argsContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean bool_expr_sempred(Bool_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean math_expr_sempred(Math_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean instructions_sempred(InstructionsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 10);
		}
		return true;
	}
	private boolean args_list_sempred(Args_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean otherif_statement_sempred(Otherif_statementContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean inside_loop_sempred(Inside_loopContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean function_declaration_args_sempred(Function_declaration_argsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001>\u019e\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0001\u0000\u0001\u0000\u0004\u0000"+
		"E\b\u0000\u000b\u0000\f\u0000F\u0001\u0001\u0001\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001"+
		"\u0005\u0003\u0005S\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0003\u0006`\b\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006h\b\u0006\n\u0006"+
		"\f\u0006k\t\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007u\b\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007{\b\u0007\n\u0007"+
		"\f\u0007~\t\u0007\u0001\b\u0001\b\u0003\b\u0082\b\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0003\t\u009a\b\t\u0001\t\u0001\t\u0005\t\u009e\b\t\n\t\f\t"+
		"\u00a1\t\t\u0001\n\u0003\n\u00a4\b\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003"+
		"\n\u00aa\b\n\u0001\n\u0001\n\u0001\u000b\u0003\u000b\u00af\b\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003"+
		"\u000b\u00b7\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00c1\b\u000b\u0001"+
		"\f\u0003\f\u00c4\b\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e"+
		"\u00d9\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00de\b"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u00e3\b\u000f\n"+
		"\u000f\f\u000f\u00e6\t\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0003\u0011\u00f2\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0003\u0013\u00ff\b\u0013\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001"+
		"\u0015\u0003\u0015\u010a\b\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0003\u0017\u011c\b\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0003\u0017\u0123\b\u0017\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0005\u0018\u0130\b\u0018\n\u0018\f\u0018"+
		"\u0133\t\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u013d\b\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0003\u0019\u0148\b\u0019\u0001\u0019\u0001\u0019"+
		"\u0005\u0019\u014c\b\u0019\n\u0019\f\u0019\u014f\t\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u0156\b\u0019\u0001"+
		"\u0019\u0003\u0019\u0159\b\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0003\u001c\u016c\b\u001c\u0001\u001c\u0001\u001c\u0005"+
		"\u001c\u0170\b\u001c\n\u001c\f\u001c\u0173\t\u001c\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0005\u001f\u018f\b\u001f\n\u001f\f\u001f\u0192\t\u001f\u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0003 \u019c\b \u0001 \u0000"+
		"\u0007\f\u000e\u0012\u001e08>!\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@\u0000\u0006"+
		"\u0001\u000048\u0001\u0000\u0012\u0016\u0001\u0000&)\u0001\u0000\u0018"+
		"\u001c\u0002\u000066==\u0002\u00004499\u01ac\u0000B\u0001\u0000\u0000"+
		"\u0000\u0002H\u0001\u0000\u0000\u0000\u0004J\u0001\u0000\u0000\u0000\u0006"+
		"L\u0001\u0000\u0000\u0000\bN\u0001\u0000\u0000\u0000\nR\u0001\u0000\u0000"+
		"\u0000\f_\u0001\u0000\u0000\u0000\u000et\u0001\u0000\u0000\u0000\u0010"+
		"\u0081\u0001\u0000\u0000\u0000\u0012\u0099\u0001\u0000\u0000\u0000\u0014"+
		"\u00a3\u0001\u0000\u0000\u0000\u0016\u00c0\u0001\u0000\u0000\u0000\u0018"+
		"\u00c3\u0001\u0000\u0000\u0000\u001a\u00cd\u0001\u0000\u0000\u0000\u001c"+
		"\u00d8\u0001\u0000\u0000\u0000\u001e\u00dd\u0001\u0000\u0000\u0000 \u00e7"+
		"\u0001\u0000\u0000\u0000\"\u00f1\u0001\u0000\u0000\u0000$\u00f3\u0001"+
		"\u0000\u0000\u0000&\u00fe\u0001\u0000\u0000\u0000(\u0100\u0001\u0000\u0000"+
		"\u0000*\u0109\u0001\u0000\u0000\u0000,\u010b\u0001\u0000\u0000\u0000."+
		"\u0113\u0001\u0000\u0000\u00000\u0124\u0001\u0000\u0000\u00002\u0134\u0001"+
		"\u0000\u0000\u00004\u015a\u0001\u0000\u0000\u00006\u0166\u0001\u0000\u0000"+
		"\u00008\u016b\u0001\u0000\u0000\u0000:\u0174\u0001\u0000\u0000\u0000<"+
		"\u017e\u0001\u0000\u0000\u0000>\u0187\u0001\u0000\u0000\u0000@\u019b\u0001"+
		"\u0000\u0000\u0000BD\u0003 \u0010\u0000CE\u0003\u0010\b\u0000DC\u0001"+
		"\u0000\u0000\u0000EF\u0001\u0000\u0000\u0000FD\u0001\u0000\u0000\u0000"+
		"FG\u0001\u0000\u0000\u0000G\u0001\u0001\u0000\u0000\u0000HI\u0007\u0000"+
		"\u0000\u0000I\u0003\u0001\u0000\u0000\u0000JK\u0007\u0001\u0000\u0000"+
		"K\u0005\u0001\u0000\u0000\u0000LM\u0007\u0002\u0000\u0000M\u0007\u0001"+
		"\u0000\u0000\u0000NO\u0007\u0003\u0000\u0000O\t\u0001\u0000\u0000\u0000"+
		"PS\u0003\f\u0006\u0000QS\u0003\u000e\u0007\u0000RP\u0001\u0000\u0000\u0000"+
		"RQ\u0001\u0000\u0000\u0000S\u000b\u0001\u0000\u0000\u0000TU\u0006\u0006"+
		"\uffff\uffff\u0000UV\u0005<\u0000\u0000V`\u0003\f\u0006\u0003WX\u0003"+
		"\u000e\u0007\u0000XY\u0003\u0006\u0003\u0000YZ\u0003\u000e\u0007\u0000"+
		"Z`\u0001\u0000\u0000\u0000[\\\u0005\u001d\u0000\u0000\\]\u0003\f\u0006"+
		"\u0000]^\u0005\u001e\u0000\u0000^`\u0001\u0000\u0000\u0000_T\u0001\u0000"+
		"\u0000\u0000_W\u0001\u0000\u0000\u0000_[\u0001\u0000\u0000\u0000`i\u0001"+
		"\u0000\u0000\u0000ab\n\u0005\u0000\u0000bc\u0005+\u0000\u0000ch\u0003"+
		"\f\u0006\u0006de\n\u0004\u0000\u0000ef\u0005*\u0000\u0000fh\u0003\f\u0006"+
		"\u0005ga\u0001\u0000\u0000\u0000gd\u0001\u0000\u0000\u0000hk\u0001\u0000"+
		"\u0000\u0000ig\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000j\r\u0001"+
		"\u0000\u0000\u0000ki\u0001\u0000\u0000\u0000lm\u0006\u0007\uffff\uffff"+
		"\u0000mn\u0005\u001d\u0000\u0000no\u0003\u000e\u0007\u0000op\u0005\u001e"+
		"\u0000\u0000pu\u0001\u0000\u0000\u0000qu\u0003\u0002\u0001\u0000ru\u0005"+
		"9\u0000\u0000su\u0003@ \u0000tl\u0001\u0000\u0000\u0000tq\u0001\u0000"+
		"\u0000\u0000tr\u0001\u0000\u0000\u0000ts\u0001\u0000\u0000\u0000u|\u0001"+
		"\u0000\u0000\u0000vw\n\u0004\u0000\u0000wx\u0003\b\u0004\u0000xy\u0003"+
		"\u000e\u0007\u0005y{\u0001\u0000\u0000\u0000zv\u0001\u0000\u0000\u0000"+
		"{~\u0001\u0000\u0000\u0000|z\u0001\u0000\u0000\u0000|}\u0001\u0000\u0000"+
		"\u0000}\u000f\u0001\u0000\u0000\u0000~|\u0001\u0000\u0000\u0000\u007f"+
		"\u0082\u0003\u0012\t\u0000\u0080\u0082\u0003<\u001e\u0000\u0081\u007f"+
		"\u0001\u0000\u0000\u0000\u0081\u0080\u0001\u0000\u0000\u0000\u0082\u0011"+
		"\u0001\u0000\u0000\u0000\u0083\u0084\u0006\t\uffff\uffff\u0000\u0084\u0085"+
		"\u0003\u0014\n\u0000\u0085\u0086\u00053\u0000\u0000\u0086\u009a\u0001"+
		"\u0000\u0000\u0000\u0087\u0088\u0003\u0016\u000b\u0000\u0088\u0089\u0005"+
		"3\u0000\u0000\u0089\u009a\u0001\u0000\u0000\u0000\u008a\u008b\u0003\u0018"+
		"\f\u0000\u008b\u008c\u00053\u0000\u0000\u008c\u009a\u0001\u0000\u0000"+
		"\u0000\u008d\u008e\u0003\u001c\u000e\u0000\u008e\u008f\u00053\u0000\u0000"+
		"\u008f\u009a\u0001\u0000\u0000\u0000\u0090\u0091\u0003@ \u0000\u0091\u0092"+
		"\u00053\u0000\u0000\u0092\u009a\u0001\u0000\u0000\u0000\u0093\u0094\u0003"+
		"\"\u0011\u0000\u0094\u0095\u00053\u0000\u0000\u0095\u009a\u0001\u0000"+
		"\u0000\u0000\u0096\u009a\u0003*\u0015\u0000\u0097\u009a\u00034\u001a\u0000"+
		"\u0098\u009a\u0003:\u001d\u0000\u0099\u0083\u0001\u0000\u0000\u0000\u0099"+
		"\u0087\u0001\u0000\u0000\u0000\u0099\u008a\u0001\u0000\u0000\u0000\u0099"+
		"\u008d\u0001\u0000\u0000\u0000\u0099\u0090\u0001\u0000\u0000\u0000\u0099"+
		"\u0093\u0001\u0000\u0000\u0000\u0099\u0096\u0001\u0000\u0000\u0000\u0099"+
		"\u0097\u0001\u0000\u0000\u0000\u0099\u0098\u0001\u0000\u0000\u0000\u009a"+
		"\u009f\u0001\u0000\u0000\u0000\u009b\u009c\n\n\u0000\u0000\u009c\u009e"+
		"\u0003\u0012\t\u000b\u009d\u009b\u0001\u0000\u0000\u0000\u009e\u00a1\u0001"+
		"\u0000\u0000\u0000\u009f\u009d\u0001\u0000\u0000\u0000\u009f\u00a0\u0001"+
		"\u0000\u0000\u0000\u00a0\u0013\u0001\u0000\u0000\u0000\u00a1\u009f\u0001"+
		"\u0000\u0000\u0000\u00a2\u00a4\u0005\u0010\u0000\u0000\u00a3\u00a2\u0001"+
		"\u0000\u0000\u0000\u00a3\u00a4\u0001\u0000\u0000\u0000\u00a4\u00a5\u0001"+
		"\u0000\u0000\u0000\u00a5\u00a9\u0003\u0004\u0002\u0000\u00a6\u00a7\u0005"+
		"\u001f\u0000\u0000\u00a7\u00a8\u00054\u0000\u0000\u00a8\u00aa\u0005 \u0000"+
		"\u0000\u00a9\u00a6\u0001\u0000\u0000\u0000\u00a9\u00aa\u0001\u0000\u0000"+
		"\u0000\u00aa\u00ab\u0001\u0000\u0000\u0000\u00ab\u00ac\u00059\u0000\u0000"+
		"\u00ac\u0015\u0001\u0000\u0000\u0000\u00ad\u00af\u0005\u0010\u0000\u0000"+
		"\u00ae\u00ad\u0001\u0000\u0000\u0000\u00ae\u00af\u0001\u0000\u0000\u0000"+
		"\u00af\u00b0\u0001\u0000\u0000\u0000\u00b0\u00b1\u0003\u0004\u0002\u0000"+
		"\u00b1\u00b2\u00059\u0000\u0000\u00b2\u00b3\u0005%\u0000\u0000\u00b3\u00b4"+
		"\u0003\n\u0005\u0000\u00b4\u00c1\u0001\u0000\u0000\u0000\u00b5\u00b7\u0005"+
		"\u0010\u0000\u0000\u00b6\u00b5\u0001\u0000\u0000\u0000\u00b6\u00b7\u0001"+
		"\u0000\u0000\u0000\u00b7\u00b8\u0001\u0000\u0000\u0000\u00b8\u00b9\u0003"+
		"\u0004\u0002\u0000\u00b9\u00ba\u0005\u001f\u0000\u0000\u00ba\u00bb\u0005"+
		"4\u0000\u0000\u00bb\u00bc\u0005 \u0000\u0000\u00bc\u00bd\u00059\u0000"+
		"\u0000\u00bd\u00be\u0005%\u0000\u0000\u00be\u00bf\u0003\u001e\u000f\u0000"+
		"\u00bf\u00c1\u0001\u0000\u0000\u0000\u00c0\u00ae\u0001\u0000\u0000\u0000"+
		"\u00c0\u00b6\u0001\u0000\u0000\u0000\u00c1\u0017\u0001\u0000\u0000\u0000"+
		"\u00c2\u00c4\u0005\u0010\u0000\u0000\u00c3\u00c2\u0001\u0000\u0000\u0000"+
		"\u00c3\u00c4\u0001\u0000\u0000\u0000\u00c4\u00c5\u0001\u0000\u0000\u0000"+
		"\u00c5\u00c6\u0005\u0011\u0000\u0000\u00c6\u00c7\u00059\u0000\u0000\u00c7"+
		"\u00c8\u0005%\u0000\u0000\u00c8\u00c9\u0005\u0011\u0000\u0000\u00c9\u00ca"+
		"\u0005\u001d\u0000\u0000\u00ca\u00cb\u0003\u001a\r\u0000\u00cb\u00cc\u0005"+
		"\u001e\u0000\u0000\u00cc\u0019\u0001\u0000\u0000\u0000\u00cd\u00ce\u0007"+
		"\u0004\u0000\u0000\u00ce\u001b\u0001\u0000\u0000\u0000\u00cf\u00d0\u0005"+
		"9\u0000\u0000\u00d0\u00d1\u0005%\u0000\u0000\u00d1\u00d9\u0003\n\u0005"+
		"\u0000\u00d2\u00d3\u00059\u0000\u0000\u00d3\u00d4\u0005\u001f\u0000\u0000"+
		"\u00d4\u00d5\u0005>\u0000\u0000\u00d5\u00d6\u0005 \u0000\u0000\u00d6\u00d7"+
		"\u0005%\u0000\u0000\u00d7\u00d9\u0003\n\u0005\u0000\u00d8\u00cf\u0001"+
		"\u0000\u0000\u0000\u00d8\u00d2\u0001\u0000\u0000\u0000\u00d9\u001d\u0001"+
		"\u0000\u0000\u0000\u00da\u00db\u0006\u000f\uffff\uffff\u0000\u00db\u00de"+
		"\u00059\u0000\u0000\u00dc\u00de\u0003\u0002\u0001\u0000\u00dd\u00da\u0001"+
		"\u0000\u0000\u0000\u00dd\u00dc\u0001\u0000\u0000\u0000\u00de\u00e4\u0001"+
		"\u0000\u0000\u0000\u00df\u00e0\n\u0001\u0000\u0000\u00e0\u00e1\u00052"+
		"\u0000\u0000\u00e1\u00e3\u0003\u001e\u000f\u0002\u00e2\u00df\u0001\u0000"+
		"\u0000\u0000\u00e3\u00e6\u0001\u0000\u0000\u0000\u00e4\u00e2\u0001\u0000"+
		"\u0000\u0000\u00e4\u00e5\u0001\u0000\u0000\u0000\u00e5\u001f\u0001\u0000"+
		"\u0000\u0000\u00e6\u00e4\u0001\u0000\u0000\u0000\u00e7\u00e8\u0005\r\u0000"+
		"\u0000\u00e8\u00e9\u0005\u001f\u0000\u0000\u00e9\u00ea\u00036\u001b\u0000"+
		"\u00ea\u00eb\u0005/\u0000\u0000\u00eb\u00ec\u00036\u001b\u0000\u00ec\u00ed"+
		"\u0005 \u0000\u0000\u00ed!\u0001\u0000\u0000\u0000\u00ee\u00f2\u0003$"+
		"\u0012\u0000\u00ef\u00f2\u0005\u000b\u0000\u0000\u00f0\u00f2\u0003(\u0014"+
		"\u0000\u00f1\u00ee\u0001\u0000\u0000\u0000\u00f1\u00ef\u0001\u0000\u0000"+
		"\u0000\u00f1\u00f0\u0001\u0000\u0000\u0000\u00f2#\u0001\u0000\u0000\u0000"+
		"\u00f3\u00f4\u0005\t\u0000\u0000\u00f4\u00f5\u0005\u001f\u0000\u0000\u00f5"+
		"\u00f6\u0003&\u0013\u0000\u00f6\u00f7\u0005 \u0000\u0000\u00f7\u00f8\u0005"+
		"9\u0000\u0000\u00f8%\u0001\u0000\u0000\u0000\u00f9\u00ff\u0005\n\u0000"+
		"\u0000\u00fa\u00fb\u00036\u001b\u0000\u00fb\u00fc\u0005/\u0000\u0000\u00fc"+
		"\u00fd\u00036\u001b\u0000\u00fd\u00ff\u0001\u0000\u0000\u0000\u00fe\u00f9"+
		"\u0001\u0000\u0000\u0000\u00fe\u00fa\u0001\u0000\u0000\u0000\u00ff\'\u0001"+
		"\u0000\u0000\u0000\u0100\u0101\u0005\f\u0000\u0000\u0101\u0102\u0005\u001f"+
		"\u0000\u0000\u0102\u0103\u00036\u001b\u0000\u0103\u0104\u0005/\u0000\u0000"+
		"\u0104\u0105\u00036\u001b\u0000\u0105\u0106\u0005 \u0000\u0000\u0106)"+
		"\u0001\u0000\u0000\u0000\u0107\u010a\u0003,\u0016\u0000\u0108\u010a\u0003"+
		".\u0017\u0000\u0109\u0107\u0001\u0000\u0000\u0000\u0109\u0108\u0001\u0000"+
		"\u0000\u0000\u010a+\u0001\u0000\u0000\u0000\u010b\u010c\u0005\u0001\u0000"+
		"\u0000\u010c\u010d\u0005\u001d\u0000\u0000\u010d\u010e\u0003\n\u0005\u0000"+
		"\u010e\u010f\u0005\u001e\u0000\u0000\u010f\u0110\u0005!\u0000\u0000\u0110"+
		"\u0111\u0003\u0012\t\u0000\u0111\u0112\u0005\"\u0000\u0000\u0112-\u0001"+
		"\u0000\u0000\u0000\u0113\u0114\u0005\u0001\u0000\u0000\u0114\u0115\u0005"+
		"\u001d\u0000\u0000\u0115\u0116\u0003\n\u0005\u0000\u0116\u0117\u0005\u001e"+
		"\u0000\u0000\u0117\u0118\u0005!\u0000\u0000\u0118\u0119\u0003\u0012\t"+
		"\u0000\u0119\u011b\u0005\"\u0000\u0000\u011a\u011c\u00030\u0018\u0000"+
		"\u011b\u011a\u0001\u0000\u0000\u0000\u011b\u011c\u0001\u0000\u0000\u0000"+
		"\u011c\u0122\u0001\u0000\u0000\u0000\u011d\u011e\u0005\u0003\u0000\u0000"+
		"\u011e\u011f\u0005!\u0000\u0000\u011f\u0120\u0003\u0012\t\u0000\u0120"+
		"\u0121\u0005\"\u0000\u0000\u0121\u0123\u0001\u0000\u0000\u0000\u0122\u011d"+
		"\u0001\u0000\u0000\u0000\u0122\u0123\u0001\u0000\u0000\u0000\u0123/\u0001"+
		"\u0000\u0000\u0000\u0124\u0125\u0006\u0018\uffff\uffff\u0000\u0125\u0126"+
		"\u0005\u0002\u0000\u0000\u0126\u0127\u0005\u001d\u0000\u0000\u0127\u0128"+
		"\u0003\n\u0005\u0000\u0128\u0129\u0005\u001e\u0000\u0000\u0129\u012a\u0005"+
		"!\u0000\u0000\u012a\u012b\u0003\u0012\t\u0000\u012b\u012c\u0005\"\u0000"+
		"\u0000\u012c\u0131\u0001\u0000\u0000\u0000\u012d\u012e\n\u0001\u0000\u0000"+
		"\u012e\u0130\u00030\u0018\u0002\u012f\u012d\u0001\u0000\u0000\u0000\u0130"+
		"\u0133\u0001\u0000\u0000\u0000\u0131\u012f\u0001\u0000\u0000\u0000\u0131"+
		"\u0132\u0001\u0000\u0000\u0000\u01321\u0001\u0000\u0000\u0000\u0133\u0131"+
		"\u0001\u0000\u0000\u0000\u0134\u0135\u0005\u0001\u0000\u0000\u0135\u0136"+
		"\u0005\u001d\u0000\u0000\u0136\u0137\u0003\n\u0005\u0000\u0137\u0138\u0005"+
		"\u001e\u0000\u0000\u0138\u013c\u0005!\u0000\u0000\u0139\u013d\u0003\u0012"+
		"\t\u0000\u013a\u013d\u0005\u000e\u0000\u0000\u013b\u013d\u0005\u000f\u0000"+
		"\u0000\u013c\u0139\u0001\u0000\u0000\u0000\u013c\u013a\u0001\u0000\u0000"+
		"\u0000\u013c\u013b\u0001\u0000\u0000\u0000\u013d\u013e\u0001\u0000\u0000"+
		"\u0000\u013e\u014d\u0005\"\u0000\u0000\u013f\u0140\u0005\u0002\u0000\u0000"+
		"\u0140\u0141\u0005\u001d\u0000\u0000\u0141\u0142\u0003\n\u0005\u0000\u0142"+
		"\u0143\u0005\u001e\u0000\u0000\u0143\u0147\u0005!\u0000\u0000\u0144\u0148"+
		"\u0003\u0012\t\u0000\u0145\u0148\u0005\u000e\u0000\u0000\u0146\u0148\u0005"+
		"\u000f\u0000\u0000\u0147\u0144\u0001\u0000\u0000\u0000\u0147\u0145\u0001"+
		"\u0000\u0000\u0000\u0147\u0146\u0001\u0000\u0000\u0000\u0148\u0149\u0001"+
		"\u0000\u0000\u0000\u0149\u014a\u0005\"\u0000\u0000\u014a\u014c\u0001\u0000"+
		"\u0000\u0000\u014b\u013f\u0001\u0000\u0000\u0000\u014c\u014f\u0001\u0000"+
		"\u0000\u0000\u014d\u014b\u0001\u0000\u0000\u0000\u014d\u014e\u0001\u0000"+
		"\u0000\u0000\u014e\u0158\u0001\u0000\u0000\u0000\u014f\u014d\u0001\u0000"+
		"\u0000\u0000\u0150\u0151\u0005\u0003\u0000\u0000\u0151\u0155\u0005!\u0000"+
		"\u0000\u0152\u0156\u0003\u0012\t\u0000\u0153\u0156\u0005\u000e\u0000\u0000"+
		"\u0154\u0156\u0005\u000f\u0000\u0000\u0155\u0152\u0001\u0000\u0000\u0000"+
		"\u0155\u0153\u0001\u0000\u0000\u0000\u0155\u0154\u0001\u0000\u0000\u0000"+
		"\u0156\u0157\u0001\u0000\u0000\u0000\u0157\u0159\u0005\"\u0000\u0000\u0158"+
		"\u0150\u0001\u0000\u0000\u0000\u0158\u0159\u0001\u0000\u0000\u0000\u0159"+
		"3\u0001\u0000\u0000\u0000\u015a\u015b\u0005\u0006\u0000\u0000\u015b\u015c"+
		"\u0005\u001d\u0000\u0000\u015c\u015d\u00036\u001b\u0000\u015d\u015e\u0005"+
		"/\u0000\u0000\u015e\u015f\u00036\u001b\u0000\u015f\u0160\u0005/\u0000"+
		"\u0000\u0160\u0161\u00036\u001b\u0000\u0161\u0162\u0005\u001e\u0000\u0000"+
		"\u0162\u0163\u0005!\u0000\u0000\u0163\u0164\u00038\u001c\u0000\u0164\u0165"+
		"\u0005\"\u0000\u0000\u01655\u0001\u0000\u0000\u0000\u0166\u0167\u0007"+
		"\u0005\u0000\u0000\u01677\u0001\u0000\u0000\u0000\u0168\u0169\u0006\u001c"+
		"\uffff\uffff\u0000\u0169\u016c\u0003\u0012\t\u0000\u016a\u016c\u00032"+
		"\u0019\u0000\u016b\u0168\u0001\u0000\u0000\u0000\u016b\u016a\u0001\u0000"+
		"\u0000\u0000\u016c\u0171\u0001\u0000\u0000\u0000\u016d\u016e\n\u0001\u0000"+
		"\u0000\u016e\u0170\u00038\u001c\u0002\u016f\u016d\u0001\u0000\u0000\u0000"+
		"\u0170\u0173\u0001\u0000\u0000\u0000\u0171\u016f\u0001\u0000\u0000\u0000"+
		"\u0171\u0172\u0001\u0000\u0000\u0000\u01729\u0001\u0000\u0000\u0000\u0173"+
		"\u0171\u0001\u0000\u0000\u0000\u0174\u0175\u0005\u0004\u0000\u0000\u0175"+
		"\u0176\u0005\u0005\u0000\u0000\u0176\u0177\u0005\u0004\u0000\u0000\u0177"+
		"\u0178\u0005\u001d\u0000\u0000\u0178\u0179\u0003\n\u0005\u0000\u0179\u017a"+
		"\u0005\u001e\u0000\u0000\u017a\u017b\u0005!\u0000\u0000\u017b\u017c\u0003"+
		"\u0012\t\u0000\u017c\u017d\u0005\"\u0000\u0000\u017d;\u0001\u0000\u0000"+
		"\u0000\u017e\u017f\u0005\u0007\u0000\u0000\u017f\u0180\u00059\u0000\u0000"+
		"\u0180\u0181\u0005\u001d\u0000\u0000\u0181\u0182\u0003>\u001f\u0000\u0182"+
		"\u0183\u0005\u001e\u0000\u0000\u0183\u0184\u0005!\u0000\u0000\u0184\u0185"+
		"\u0003\u0012\t\u0000\u0185\u0186\u0005\"\u0000\u0000\u0186=\u0001\u0000"+
		"\u0000\u0000\u0187\u0188\u0006\u001f\uffff\uffff\u0000\u0188\u0189\u0003"+
		"\u0004\u0002\u0000\u0189\u018a\u00059\u0000\u0000\u018a\u0190\u0001\u0000"+
		"\u0000\u0000\u018b\u018c\n\u0001\u0000\u0000\u018c\u018d\u00052\u0000"+
		"\u0000\u018d\u018f\u0003>\u001f\u0002\u018e\u018b\u0001\u0000\u0000\u0000"+
		"\u018f\u0192\u0001\u0000\u0000\u0000\u0190\u018e\u0001\u0000\u0000\u0000"+
		"\u0190\u0191\u0001\u0000\u0000\u0000\u0191?\u0001\u0000\u0000\u0000\u0192"+
		"\u0190\u0001\u0000\u0000\u0000\u0193\u0194\u00059\u0000\u0000\u0194\u0195"+
		"\u0005\u001d\u0000\u0000\u0195\u0196\u0003\u001e\u000f\u0000\u0196\u0197"+
		"\u0005\u001e\u0000\u0000\u0197\u019c\u0001\u0000\u0000\u0000\u0198\u0199"+
		"\u00059\u0000\u0000\u0199\u019a\u0005\u001d\u0000\u0000\u019a\u019c\u0005"+
		"\u001e\u0000\u0000\u019b\u0193\u0001\u0000\u0000\u0000\u019b\u0198\u0001"+
		"\u0000\u0000\u0000\u019cA\u0001\u0000\u0000\u0000\"FR_git|\u0081\u0099"+
		"\u009f\u00a3\u00a9\u00ae\u00b6\u00c0\u00c3\u00d8\u00dd\u00e4\u00f1\u00fe"+
		"\u0109\u011b\u0122\u0131\u013c\u0147\u014d\u0155\u0158\u016b\u0171\u0190"+
		"\u019b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}