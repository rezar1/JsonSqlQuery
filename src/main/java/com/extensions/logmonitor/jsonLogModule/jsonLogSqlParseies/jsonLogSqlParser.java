// Generated from jsonLogSql.g4 by ANTLR 4.5
package com.extensions.logmonitor.jsonLogModule.jsonLogSqlParseies;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class jsonLogSqlParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, LCASE=2, LOWER=3, LTRIM=4, RTRIM=5, CONCAT=6, SUBSTR=7, TO_CHAR=8, 
		TRIM=9, UCASE=10, REGEX_GROUP=11, RANDOM=12, UPPER=13, LENGTH=14, REVERSE=15, 
		TRUE=16, FALSE=17, ALL=18, NOT=19, LIKE=20, IF=21, EXISTS=22, ASC=23, 
		DESC=24, ORDER=25, GROUP=26, BY=27, HAVING=28, WHERE=29, FROM=30, AS=31, 
		SELECT=32, DISTINCT=33, IS=34, NULL=35, CAST=36, ADD=37, BETWEEN=38, RLIKE=39, 
		REGEXP=40, LIMIT=41, IN=42, DAY=43, HOUR=44, MINUTE=45, MONTH=46, SECOND=47, 
		YEAR=48, AVG=49, COUNT=50, MAX=51, MIN=52, SUM=53, DIVIDE=54, MOD=55, 
		OR=56, AND=57, XOR=58, EQ=59, NOT_EQ=60, LET=61, GET=62, SET_VAR=63, SHIFT_LEFT=64, 
		SHIFT_RIGHT=65, SEMI=66, COLON=67, DOT=68, COMMA=69, ASTERISK=70, RPAREN=71, 
		LPAREN=72, RBRACK=73, LBRACK=74, PLUS=75, MINUS=76, NEGATION=77, VERTBAR=78, 
		BITAND=79, POWER_OP=80, GTH=81, LTH=82, Double_Quote=83, INTEGER_NUM=84, 
		VARCHAR_NUM=85, BINARY_NUM=86, HEX_DIGIT=87, BIT_NUM=88, REAL_NUMBER=89, 
		TEXT_STRING=90, ID=91, LINE_COMMENT=92, BLOCKCOMMENT=93, WHITE_SPACE=94, 
		SL_COMMENT=95, Regex_Escaped_Unicode=96;
	public static final int
		RULE_keyword = 0, RULE_delimited_statement = 1, RULE_relational_op = 2, 
		RULE_interval_unit = 3, RULE_string_literal = 4, RULE_number_literal = 5, 
		RULE_hex_literal = 6, RULE_boolean_literal = 7, RULE_bit_literal = 8, 
		RULE_literal_value = 9, RULE_functionList = 10, RULE_time_functions = 11, 
		RULE_group_functions = 12, RULE_char_functions = 13, RULE_math_functions = 14, 
		RULE_table_name = 15, RULE_column_name = 16, RULE_alias = 17, RULE_any_name = 18, 
		RULE_any_name_exclude_keyword = 19, RULE_expression = 20, RULE_exp_factor1 = 21, 
		RULE_exp_factor2 = 22, RULE_predicate = 23, RULE_simple_expr = 24, RULE_function_call = 25, 
		RULE_column_spec = 26, RULE_array_column_spec = 27, RULE_expression_list = 28, 
		RULE_table_references = 29, RULE_select_statement = 30, RULE_select_expression = 31, 
		RULE_where_clause = 32, RULE_groupby_clause = 33, RULE_groupby_item = 34, 
		RULE_having_clause = 35, RULE_orderby_clause = 36, RULE_orderby_item = 37, 
		RULE_limit_clause = 38, RULE_offset = 39, RULE_row_count = 40, RULE_select_list = 41, 
		RULE_displayed_column = 42, RULE_length = 43, RULE_varchar_length = 44, 
		RULE_binary_length = 45;
	public static final String[] ruleNames = {
		"keyword", "delimited_statement", "relational_op", "interval_unit", "string_literal", 
		"number_literal", "hex_literal", "boolean_literal", "bit_literal", "literal_value", 
		"functionList", "time_functions", "group_functions", "char_functions", 
		"math_functions", "table_name", "column_name", "alias", "any_name", "any_name_exclude_keyword", 
		"expression", "exp_factor1", "exp_factor2", "predicate", "simple_expr", 
		"function_call", "column_spec", "array_column_spec", "expression_list", 
		"table_references", "select_statement", "select_expression", "where_clause", 
		"groupby_clause", "groupby_item", "having_clause", "orderby_clause", "orderby_item", 
		"limit_clause", "offset", "row_count", "select_list", "displayed_column", 
		"length", "varchar_length", "binary_length"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'#'", null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "'<='", "'>='", "':='", "'<<'", "'>>'", "';'", "':'", "'.'", "','", 
		"'*'", "')'", "'('", "']'", "'['", "'+'", "'-'", "'~'", "'|'", "'&'", 
		"'^'", "'>'", "'<'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "LCASE", "LOWER", "LTRIM", "RTRIM", "CONCAT", "SUBSTR", "TO_CHAR", 
		"TRIM", "UCASE", "REGEX_GROUP", "RANDOM", "UPPER", "LENGTH", "REVERSE", 
		"TRUE", "FALSE", "ALL", "NOT", "LIKE", "IF", "EXISTS", "ASC", "DESC", 
		"ORDER", "GROUP", "BY", "HAVING", "WHERE", "FROM", "AS", "SELECT", "DISTINCT", 
		"IS", "NULL", "CAST", "ADD", "BETWEEN", "RLIKE", "REGEXP", "LIMIT", "IN", 
		"DAY", "HOUR", "MINUTE", "MONTH", "SECOND", "YEAR", "AVG", "COUNT", "MAX", 
		"MIN", "SUM", "DIVIDE", "MOD", "OR", "AND", "XOR", "EQ", "NOT_EQ", "LET", 
		"GET", "SET_VAR", "SHIFT_LEFT", "SHIFT_RIGHT", "SEMI", "COLON", "DOT", 
		"COMMA", "ASTERISK", "RPAREN", "LPAREN", "RBRACK", "LBRACK", "PLUS", "MINUS", 
		"NEGATION", "VERTBAR", "BITAND", "POWER_OP", "GTH", "LTH", "Double_Quote", 
		"INTEGER_NUM", "VARCHAR_NUM", "BINARY_NUM", "HEX_DIGIT", "BIT_NUM", "REAL_NUMBER", 
		"TEXT_STRING", "ID", "LINE_COMMENT", "BLOCKCOMMENT", "WHITE_SPACE", "SL_COMMENT", 
		"Regex_Escaped_Unicode"
	};
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
	public String getGrammarFileName() { return "jsonLogSql.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public jsonLogSqlParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class KeywordContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(jsonLogSqlParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(jsonLogSqlParser.FALSE, 0); }
		public TerminalNode ALL() { return getToken(jsonLogSqlParser.ALL, 0); }
		public TerminalNode NOT() { return getToken(jsonLogSqlParser.NOT, 0); }
		public TerminalNode LIKE() { return getToken(jsonLogSqlParser.LIKE, 0); }
		public TerminalNode IF() { return getToken(jsonLogSqlParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(jsonLogSqlParser.EXISTS, 0); }
		public TerminalNode ASC() { return getToken(jsonLogSqlParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(jsonLogSqlParser.DESC, 0); }
		public TerminalNode ORDER() { return getToken(jsonLogSqlParser.ORDER, 0); }
		public TerminalNode GROUP() { return getToken(jsonLogSqlParser.GROUP, 0); }
		public TerminalNode BY() { return getToken(jsonLogSqlParser.BY, 0); }
		public TerminalNode HAVING() { return getToken(jsonLogSqlParser.HAVING, 0); }
		public TerminalNode WHERE() { return getToken(jsonLogSqlParser.WHERE, 0); }
		public TerminalNode FROM() { return getToken(jsonLogSqlParser.FROM, 0); }
		public TerminalNode AS() { return getToken(jsonLogSqlParser.AS, 0); }
		public TerminalNode SELECT() { return getToken(jsonLogSqlParser.SELECT, 0); }
		public TerminalNode DISTINCT() { return getToken(jsonLogSqlParser.DISTINCT, 0); }
		public TerminalNode IS() { return getToken(jsonLogSqlParser.IS, 0); }
		public TerminalNode NULL() { return getToken(jsonLogSqlParser.NULL, 0); }
		public TerminalNode ADD() { return getToken(jsonLogSqlParser.ADD, 0); }
		public TerminalNode BETWEEN() { return getToken(jsonLogSqlParser.BETWEEN, 0); }
		public TerminalNode AVG() { return getToken(jsonLogSqlParser.AVG, 0); }
		public TerminalNode COUNT() { return getToken(jsonLogSqlParser.COUNT, 0); }
		public TerminalNode MAX() { return getToken(jsonLogSqlParser.MAX, 0); }
		public TerminalNode MIN() { return getToken(jsonLogSqlParser.MIN, 0); }
		public TerminalNode SUM() { return getToken(jsonLogSqlParser.SUM, 0); }
		public TerminalNode DIVIDE() { return getToken(jsonLogSqlParser.DIVIDE, 0); }
		public TerminalNode MOD() { return getToken(jsonLogSqlParser.MOD, 0); }
		public TerminalNode OR() { return getToken(jsonLogSqlParser.OR, 0); }
		public TerminalNode AND() { return getToken(jsonLogSqlParser.AND, 0); }
		public TerminalNode XOR() { return getToken(jsonLogSqlParser.XOR, 0); }
		public TerminalNode EQ() { return getToken(jsonLogSqlParser.EQ, 0); }
		public TerminalNode NOT_EQ() { return getToken(jsonLogSqlParser.NOT_EQ, 0); }
		public TerminalNode LET() { return getToken(jsonLogSqlParser.LET, 0); }
		public TerminalNode GET() { return getToken(jsonLogSqlParser.GET, 0); }
		public TerminalNode SET_VAR() { return getToken(jsonLogSqlParser.SET_VAR, 0); }
		public TerminalNode SHIFT_LEFT() { return getToken(jsonLogSqlParser.SHIFT_LEFT, 0); }
		public TerminalNode SHIFT_RIGHT() { return getToken(jsonLogSqlParser.SHIFT_RIGHT, 0); }
		public TerminalNode LCASE() { return getToken(jsonLogSqlParser.LCASE, 0); }
		public TerminalNode LOWER() { return getToken(jsonLogSqlParser.LOWER, 0); }
		public TerminalNode TO_CHAR() { return getToken(jsonLogSqlParser.TO_CHAR, 0); }
		public TerminalNode LTRIM() { return getToken(jsonLogSqlParser.LTRIM, 0); }
		public TerminalNode RTRIM() { return getToken(jsonLogSqlParser.RTRIM, 0); }
		public TerminalNode CONCAT() { return getToken(jsonLogSqlParser.CONCAT, 0); }
		public TerminalNode SUBSTR() { return getToken(jsonLogSqlParser.SUBSTR, 0); }
		public TerminalNode TRIM() { return getToken(jsonLogSqlParser.TRIM, 0); }
		public TerminalNode UCASE() { return getToken(jsonLogSqlParser.UCASE, 0); }
		public TerminalNode UPPER() { return getToken(jsonLogSqlParser.UPPER, 0); }
		public TerminalNode LENGTH() { return getToken(jsonLogSqlParser.LENGTH, 0); }
		public TerminalNode REVERSE() { return getToken(jsonLogSqlParser.REVERSE, 0); }
		public TerminalNode REGEX_GROUP() { return getToken(jsonLogSqlParser.REGEX_GROUP, 0); }
		public KeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jsonLogSqlListener ) ((jsonLogSqlListener)listener).enterKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jsonLogSqlListener ) ((jsonLogSqlListener)listener).exitKeyword(this);
		}
	}

	public final KeywordContext keyword() throws RecognitionException {
		KeywordContext _localctx = new KeywordContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			_la = _input.LA(1);
			if ( !(((((_la - 2)) & ~0x3f) == 0 && ((1L << (_la - 2)) & ((1L << (LCASE - 2)) | (1L << (LOWER - 2)) | (1L << (LTRIM - 2)) | (1L << (RTRIM - 2)) | (1L << (CONCAT - 2)) | (1L << (SUBSTR - 2)) | (1L << (TO_CHAR - 2)) | (1L << (TRIM - 2)) | (1L << (UCASE - 2)) | (1L << (REGEX_GROUP - 2)) | (1L << (UPPER - 2)) | (1L << (LENGTH - 2)) | (1L << (REVERSE - 2)) | (1L << (TRUE - 2)) | (1L << (FALSE - 2)) | (1L << (ALL - 2)) | (1L << (NOT - 2)) | (1L << (LIKE - 2)) | (1L << (IF - 2)) | (1L << (EXISTS - 2)) | (1L << (ASC - 2)) | (1L << (DESC - 2)) | (1L << (ORDER - 2)) | (1L << (GROUP - 2)) | (1L << (BY - 2)) | (1L << (HAVING - 2)) | (1L << (WHERE - 2)) | (1L << (FROM - 2)) | (1L << (AS - 2)) | (1L << (SELECT - 2)) | (1L << (DISTINCT - 2)) | (1L << (IS - 2)) | (1L << (NULL - 2)) | (1L << (ADD - 2)) | (1L << (BETWEEN - 2)) | (1L << (AVG - 2)) | (1L << (COUNT - 2)) | (1L << (MAX - 2)) | (1L << (MIN - 2)) | (1L << (SUM - 2)) | (1L << (DIVIDE - 2)) | (1L << (MOD - 2)) | (1L << (OR - 2)) | (1L << (AND - 2)) | (1L << (XOR - 2)) | (1L << (EQ - 2)) | (1L << (NOT_EQ - 2)) | (1L << (LET - 2)) | (1L << (GET - 2)) | (1L << (SET_VAR - 2)) | (1L << (SHIFT_LEFT - 2)) | (1L << (SHIFT_RIGHT - 2)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class Delimited_statementContext extends ParserRuleContext {
		public TerminalNode Regex_Escaped_Unicode() { return getToken(jsonLogSqlParser.Regex_Escaped_Unicode, 0); }
		public Delimited_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delimited_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jsonLogSqlListener ) ((jsonLogSqlListener)listener).enterDelimited_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jsonLogSqlListener ) ((jsonLogSqlListener)listener).exitDelimited_statement(this);
		}
	}

	public final Delimited_statementContext delimited_statement() throws RecognitionException {
		Delimited_statementContext _localctx = new Delimited_statementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_delimited_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(Regex_Escaped_Unicode);
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

	public static class Relational_opContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(jsonLogSqlParser.EQ, 0); }
		public TerminalNode LTH() { return getToken(jsonLogSqlParser.LTH, 0); }
		public TerminalNode GTH() { return getToken(jsonLogSqlParser.GTH, 0); }
		public TerminalNode NOT_EQ() { return getToken(jsonLogSqlParser.NOT_EQ, 0); }
		public TerminalNode LET() { return getToken(jsonLogSqlParser.LET, 0); }
		public TerminalNode GET() { return getToken(jsonLogSqlParser.GET, 0); }
		public Relational_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relational_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jsonLogSqlListener ) ((jsonLogSqlListener)listener).enterRelational_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jsonLogSqlListener ) ((jsonLogSqlListener)listener).exitRelational_op(this);
		}
	}

	public final Relational_opContext relational_op() throws RecognitionException {
		Relational_opContext _localctx = new Relational_opContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_relational_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			_la = _input.LA(1);
			if ( !(((((_la - 59)) & ~0x3f) == 0 && ((1L << (_la - 59)) & ((1L << (EQ - 59)) | (1L << (NOT_EQ - 59)) | (1L << (LET - 59)) | (1L << (GET - 59)) | (1L << (GTH - 59)) | (1L << (LTH - 59)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class Interval_unitContext extends ParserRuleContext {
		public TerminalNode SECOND() { return getToken(jsonLogSqlParser.SECOND, 0); }
		public TerminalNode MINUTE() { return getToken(jsonLogSqlParser.MINUTE, 0); }
		public TerminalNode HOUR() { return getToken(jsonLogSqlParser.HOUR, 0); }
		public TerminalNode DAY() { return getToken(jsonLogSqlParser.DAY, 0); }
		public TerminalNode MONTH() { return getToken(jsonLogSqlParser.MONTH, 0); }
		public TerminalNode YEAR() { return getToken(jsonLogSqlParser.YEAR, 0); }
		public Interval_unitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interval_unit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jsonLogSqlListener ) ((jsonLogSqlListener)listener).enterInterval_unit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jsonLogSqlListener ) ((jsonLogSqlListener)listener).exitInterval_unit(this);
		}
	}

	public final Interval_unitContext interval_unit() throws RecognitionException {
		Interval_unitContext _localctx = new Interval_unitContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_interval_unit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DAY) | (1L << HOUR) | (1L << MINUTE) | (1L << MONTH) | (1L << SECOND) | (1L << YEAR))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class String_literalContext extends ParserRuleContext {
		public TerminalNode TEXT_STRING() { return getToken(jsonLogSqlParser.TEXT_STRING, 0); }
		public String_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jsonLogSqlListener ) ((jsonLogSqlListener)listener).enterString_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jsonLogSqlListener ) ((jsonLogSqlListener)listener).exitString_literal(this);
		}
	}

	public final String_literalContext string_literal() throws RecognitionException {
		String_literalContext _localctx = new String_literalContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_string_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(TEXT_STRING);
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

	public static class Number_literalContext extends ParserRuleContext {
		public TerminalNode INTEGER_NUM() { return getToken(jsonLogSqlParser.INTEGER_NUM, 0); }
		public TerminalNode REAL_NUMBER() { return getToken(jsonLogSqlParser.REAL_NUMBER, 0); }
		public TerminalNode PLUS() { return getToken(jsonLogSqlParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(jsonLogSqlParser.MINUS, 0); }
		public Number_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jsonLogSqlListener ) ((jsonLogSqlListener)listener).enterNumber_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jsonLogSqlListener ) ((jsonLogSqlListener)listener).exitNumber_literal(this);
		}
	}

	public final Number_literalContext number_literal() throws RecognitionException {
		Number_literalContext _localctx = new Number_literalContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_number_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(102);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(105);
			_la = _input.LA(1);
			if ( !(_la==INTEGER_NUM || _la==REAL_NUMBER) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class Hex_literalContext extends ParserRuleContext {
		public TerminalNode HEX_DIGIT() { return getToken(jsonLogSqlParser.HEX_DIGIT, 0); }
		public Hex_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hex_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jsonLogSqlListener ) ((jsonLogSqlListener)listener).enterHex_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jsonLogSqlListener ) ((jsonLogSqlListener)listener).exitHex_literal(this);
		}
	}

	public final Hex_literalContext hex_literal() throws RecognitionException {
		Hex_literalContext _localctx = new Hex_literalContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_hex_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(HEX_DIGIT);
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

	public static class Boolean_literalContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(jsonLogSqlParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(jsonLogSqlParser.FALSE, 0); }
		public Boolean_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jsonLogSqlListener ) ((jsonLogSqlListener)listener).enterBoolean_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jsonLogSqlListener ) ((jsonLogSqlListener)listener).exitBoolean_literal(this);
		}
	}

	public final Boolean_literalContext boolean_literal() throws RecognitionException {
		Boolean_literalContext _localctx = new Boolean_literalContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_boolean_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class Bit_literalContext extends ParserRuleContext {
		public TerminalNode BIT_NUM() { return getToken(jsonLogSqlParser.BIT_NUM, 0); }
		public Bit_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bit_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jsonLogSqlListener ) ((jsonLogSqlListener)listener).enterBit_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jsonLogSqlListener ) ((jsonLogSqlListener)listener).exitBit_literal(this);
		}
	}

	public final Bit_literalContext bit_literal() throws RecognitionException {
		Bit_literalContext _localctx = new Bit_literalContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_bit_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(BIT_NUM);
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

	public static class Literal_valueContext extends ParserRuleContext {
		public String_literalContext string_literal() {
			return getRuleContext(String_literalContext.class,0);
		}
		public Number_literalContext number_literal() {
			return getRuleContext(Number_literalContext.class,0);
		}
		public Hex_literalContext hex_literal() {
			return getRuleContext(Hex_literalContext.class,0);
		}
		public Boolean_literalContext boolean_literal() {
			return getRuleContext(Boolean_literalContext.class,0);
		}
		public Bit_literalContext bit_literal() {
			return getRuleContext(Bit_literalContext.class,0);
		}
		public TerminalNode NULL() { return getToken(jsonLogSqlParser.NULL, 0); }
		public Literal_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jsonLogSqlListener ) ((jsonLogSqlListener)listener).enterLiteral_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jsonLogSqlListener ) ((jsonLogSqlListener)listener).exitLiteral_value(this);
		}
	}

	public final Literal_valueContext literal_value() throws RecognitionException {
		Literal_valueContext _localctx = new Literal_valueContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_literal_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			switch (_input.LA(1)) {
			case TEXT_STRING:
				{
				setState(113);
				string_literal();
				}
				break;
			case PLUS:
			case MINUS:
			case INTEGER_NUM:
			case REAL_NUMBER:
				{
				setState(114);
				number_literal();
				}
				break;
			case HEX_DIGIT:
				{
				setState(115);
				hex_literal();
				}
				break;
			case TRUE:
			case FALSE:
				{
				setState(116);
				boolean_literal();
				}
				break;
			case BIT_NUM:
				{
				setState(117);
				bit_literal();
				}
				break;
			case NULL:
				{
				setState(118);
				match(NULL);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class FunctionListContext extends ParserRuleContext {
		public Time_functionsContext time_functions() {
			return getRuleContext(Time_functionsContext.class,0);
		}
		public Char_functionsContext char_functions() {
			return getRuleContext(Char_functionsContext.class,0);
		}
		public Math_functionsContext math_functions() {
			return getRuleContext(Math_functionsContext.class,0);
		}
		public FunctionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jsonLogSqlListener ) ((jsonLogSqlListener)listener).enterFunctionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jsonLogSqlListener ) ((jsonLogSqlListener)listener).exitFunctionList(this);
		}
	}

	public final FunctionListContext functionList() throws RecognitionException {
		FunctionListContext _localctx = new FunctionListContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_functionList);
		try {
			setState(124);
			switch (_input.LA(1)) {
			case DAY:
			case HOUR:
			case MINUTE:
			case MONTH:
			case SECOND:
			case YEAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(121);
				time_functions();
				}
				break;
			case LCASE:
			case LOWER:
			case LTRIM:
			case RTRIM:
			case CONCAT:
			case SUBSTR:
			case TO_CHAR:
			case TRIM:
			case UCASE:
			case REGEX_GROUP:
			case UPPER:
			case LENGTH:
			case REVERSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(122);
				char_functions();
				}
				break;
			case RANDOM:
				enterOuterAlt(_localctx, 3);
				{
				setState(123);
				math_functions();
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

	public static class Time_functionsContext extends ParserRuleContext {
		public TerminalNode DAY() { return getToken(jsonLogSqlParser.DAY, 0); }
		public TerminalNode HOUR() { return getToken(jsonLogSqlParser.HOUR, 0); }
		public TerminalNode MINUTE() { return getToken(jsonLogSqlParser.MINUTE, 0); }
		public TerminalNode MONTH() { return getToken(jsonLogSqlParser.MONTH, 0); }
		public TerminalNode SECOND() { return getToken(jsonLogSqlParser.SECOND, 0); }
		public TerminalNode YEAR() { return getToken(jsonLogSqlParser.YEAR, 0); }
		public Time_functionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_time_functions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jsonLogSqlListener ) ((jsonLogSqlListener)listener).enterTime_functions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jsonLogSqlListener ) ((jsonLogSqlListener)listener).exitTime_functions(this);
		}
	}

	public final Time_functionsContext time_functions() throws RecognitionException {
		Time_functionsContext _localctx = new Time_functionsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_time_functions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DAY) | (1L << HOUR) | (1L << MINUTE) | (1L << MONTH) | (1L << SECOND) | (1L << YEAR))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class Group_functionsContext extends ParserRuleContext {
		public TerminalNode AVG() { return getToken(jsonLogSqlParser.AVG, 0); }
		public TerminalNode COUNT() { return getToken(jsonLogSqlParser.COUNT, 0); }
		public TerminalNode MAX() { return getToken(jsonLogSqlParser.MAX, 0); }
		public TerminalNode MIN() { return getToken(jsonLogSqlParser.MIN, 0); }
		public TerminalNode SUM() { return getToken(jsonLogSqlParser.SUM, 0); }
		public Group_functionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_group_functions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jsonLogSqlListener ) ((jsonLogSqlListener)listener).enterGroup_functions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jsonLogSqlListener ) ((jsonLogSqlListener)listener).exitGroup_functions(this);
		}
	}

	public final Group_functionsContext group_functions() throws RecognitionException {
		Group_functionsContext _localctx = new Group_functionsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_group_functions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AVG) | (1L << COUNT) | (1L << MAX) | (1L << MIN) | (1L << SUM))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class Char_functionsContext extends ParserRuleContext {
		public TerminalNode LCASE() { return getToken(jsonLogSqlParser.LCASE, 0); }
		public TerminalNode LOWER() { return getToken(jsonLogSqlParser.LOWER, 0); }
		public TerminalNode LTRIM() { return getToken(jsonLogSqlParser.LTRIM, 0); }
		public TerminalNode RTRIM() { return getToken(jsonLogSqlParser.RTRIM, 0); }
		public TerminalNode CONCAT() { return getToken(jsonLogSqlParser.CONCAT, 0); }
		public TerminalNode SUBSTR() { return getToken(jsonLogSqlParser.SUBSTR, 0); }
		public TerminalNode TRIM() { return getToken(jsonLogSqlParser.TRIM, 0); }
		public TerminalNode UCASE() { return getToken(jsonLogSqlParser.UCASE, 0); }
		public TerminalNode UPPER() { return getToken(jsonLogSqlParser.UPPER, 0); }
		public TerminalNode TO_CHAR() { return getToken(jsonLogSqlParser.TO_CHAR, 0); }
		public TerminalNode LENGTH() { return getToken(jsonLogSqlParser.LENGTH, 0); }
		public TerminalNode REVERSE() { return getToken(jsonLogSqlParser.REVERSE, 0); }
		public TerminalNode REGEX_GROUP() { return getToken(jsonLogSqlParser.REGEX_GROUP, 0); }
		public Char_functionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_char_functions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jsonLogSqlListener ) ((jsonLogSqlListener)listener).enterChar_functions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jsonLogSqlListener ) ((jsonLogSqlListener)listener).exitChar_functions(this);
		}
	}

	public final Char_functionsContext char_functions() throws RecognitionException {
		Char_functionsContext _localctx = new Char_functionsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_char_functions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LCASE) | (1L << LOWER) | (1L << LTRIM) | (1L << RTRIM) | (1L << CONCAT) | (1L << SUBSTR) | (1L << TO_CHAR) | (1L << TRIM) | (1L << UCASE) | (1L << REGEX_GROUP) | (1L << UPPER) | (1L << LENGTH) | (1L << REVERSE))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class Math_functionsContext extends ParserRuleContext {
		public TerminalNode RANDOM() { return getToken(jsonLogSqlParser.RANDOM, 0); }
		public Math_functionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_math_functions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jsonLogSqlListener ) ((jsonLogSqlListener)listener).enterMath_functions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jsonLogSqlListener ) ((jsonLogSqlListener)listener).exitMath_functions(this);
		}
	}

	public final Math_functionsContext math_functions() throws RecognitionException {
		Math_functionsContext _localctx = new Math_functionsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_math_functions);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(RANDOM);
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

	public static class Table_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jsonLogSqlListener ) ((jsonLogSqlListener)listener).enterTable_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jsonLogSqlListener ) ((jsonLogSqlListener)listener).exitTable_name(this);
		}
	}

	public final Table_nameContext table_name() throws RecognitionException {
		Table_nameContext _localctx = new Table_nameContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			any_name();
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

	public static class Column_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Column_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jsonLogSqlListener ) ((jsonLogSqlListener)listener).enterColumn_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jsonLogSqlListener ) ((jsonLogSqlListener)listener).exitColumn_name(this);
		}
	}

	public final Column_nameContext column_name() throws RecognitionException {
		Column_nameContext _localctx = new Column_nameContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			any_name();
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

	public static class AliasContext extends ParserRuleContext {
		public Any_name_exclude_keywordContext any_name_exclude_keyword() {
			return getRuleContext(Any_name_exclude_keywordContext.class,0);
		}
		public TerminalNode AS() { return getToken(jsonLogSqlParser.AS, 0); }
		public AliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jsonLogSqlListener ) ((jsonLogSqlListener)listener).enterAlias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jsonLogSqlListener ) ((jsonLogSqlListener)listener).exitAlias(this);
		}
	}

	public final AliasContext alias() throws RecognitionException {
		AliasContext _localctx = new AliasContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_alias);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(138);
				match(AS);
				}
			}

			setState(141);
			any_name_exclude_keyword();
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

	public static class Any_nameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(jsonLogSqlParser.ID, 0); }
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public String_literalContext string_literal() {
			return getRuleContext(String_literalContext.class,0);
		}
		public Any_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_any_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jsonLogSqlListener ) ((jsonLogSqlListener)listener).enterAny_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jsonLogSqlListener ) ((jsonLogSqlListener)listener).exitAny_name(this);
		}
	}

	public final Any_nameContext any_name() throws RecognitionException {
		Any_nameContext _localctx = new Any_nameContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_any_name);
		try {
			setState(146);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(143);
				match(ID);
				}
				break;
			case LCASE:
			case LOWER:
			case LTRIM:
			case RTRIM:
			case CONCAT:
			case SUBSTR:
			case TO_CHAR:
			case TRIM:
			case UCASE:
			case REGEX_GROUP:
			case UPPER:
			case LENGTH:
			case REVERSE:
			case TRUE:
			case FALSE:
			case ALL:
			case NOT:
			case LIKE:
			case IF:
			case EXISTS:
			case ASC:
			case DESC:
			case ORDER:
			case GROUP:
			case BY:
			case HAVING:
			case WHERE:
			case FROM:
			case AS:
			case SELECT:
			case DISTINCT:
			case IS:
			case NULL:
			case ADD:
			case BETWEEN:
			case AVG:
			case COUNT:
			case MAX:
			case MIN:
			case SUM:
			case DIVIDE:
			case MOD:
			case OR:
			case AND:
			case XOR:
			case EQ:
			case NOT_EQ:
			case LET:
			case GET:
			case SET_VAR:
			case SHIFT_LEFT:
			case SHIFT_RIGHT:
				enterOuterAlt(_localctx, 2);
				{
				setState(144);
				keyword();
				}
				break;
			case TEXT_STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(145);
				string_literal();
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

	public static class Any_name_exclude_keywordContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(jsonLogSqlParser.ID, 0); }
		public String_literalContext string_literal() {
			return getRuleContext(String_literalContext.class,0);
		}
		public Any_name_exclude_keywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_any_name_exclude_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jsonLogSqlListener ) ((jsonLogSqlListener)listener).enterAny_name_exclude_keyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jsonLogSqlListener ) ((jsonLogSqlListener)listener).exitAny_name_exclude_keyword(this);
		}
	}

	public final Any_name_exclude_keywordContext any_name_exclude_keyword() throws RecognitionException {
		Any_name_exclude_keywordContext _localctx = new Any_name_exclude_keywordContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_any_name_exclude_keyword);
		try {
			setState(150);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(148);
				match(ID);
				}
				break;
			case TEXT_STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(149);
				string_literal();
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

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WhereOrContext extends ExpressionContext {
		public List<Exp_factor1Context> exp_factor1() {
			return getRuleContexts(Exp_factor1Context.class);
		}
		public Exp_factor1Context exp_factor1(int i) {
			return getRuleContext(Exp_factor1Context.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(jsonLogSqlParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(jsonLogSqlParser.OR, i);
		}
		public WhereOrContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jsonLogSqlListener ) ((jsonLogSqlListener)listener).enterWhereOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jsonLogSqlListener ) ((jsonLogSqlListener)listener).exitWhereOr(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_expression);
		int _la;
		try {
			_localctx = new WhereOrContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			exp_factor1();
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(153);
				match(OR);
				setState(154);
				exp_factor1();
				}
				}
				setState(159);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class Exp_factor1Context extends ParserRuleContext {
		public Exp_factor1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_factor1; }
	 
		public Exp_factor1Context() { }
		public void copyFrom(Exp_factor1Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WhereXORContext extends Exp_factor1Context {
		public List<Exp_factor2Context> exp_factor2() {
			return getRuleContexts(Exp_factor2Context.class);
		}
		public Exp_factor2Context exp_factor2(int i) {
			return getRuleContext(Exp_factor2Context.class,i);
		}
		public List<TerminalNode> XOR() { return getTokens(jsonLogSqlParser.XOR); }
		public TerminalNode XOR(int i) {
			return getToken(jsonLogSqlParser.XOR, i);
		}
		public WhereXORContext(Exp_factor1Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jsonLogSqlListener ) ((jsonLogSqlListener)listener).enterWhereXOR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jsonLogSqlListener ) ((jsonLogSqlListener)listener).exitWhereXOR(this);
		}
	}

	public final Exp_factor1Context exp_factor1() throws RecognitionException {
		Exp_factor1Context _localctx = new Exp_factor1Context(_ctx, getState());
		enterRule(_localctx, 42, RULE_exp_factor1);
		int _la;
		try {
			_localctx = new WhereXORContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			exp_factor2();
			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==XOR) {
				{
				{
				setState(161);
				match(XOR);
				setState(162);
				exp_factor2();
				}
				}
				setState(167);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class Exp_factor2Context extends ParserRuleContext {
		public Exp_factor2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_factor2; }
	 
		public Exp_factor2Context() { }
		public void copyFrom(Exp_factor2Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WhereAndContext extends Exp_factor2Context {
		public List<PredicateContext> predicate() {
			return getRuleContexts(PredicateContext.class);
		}
		public PredicateContext predicate(int i) {
			return getRuleContext(PredicateContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(jsonLogSqlParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(jsonLogSqlParser.AND, i);
		}
		public WhereAndContext(Exp_factor2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jsonLogSqlListener ) ((jsonLogSqlListener)listener).enterWhereAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jsonLogSqlListener ) ((jsonLogSqlListener)listener).exitWhereAnd(this);
		}
	}

	public final Exp_factor2Context exp_factor2() throws RecognitionException {
		Exp_factor2Context _localctx = new Exp_factor2Context(_ctx, getState());
		enterRule(_localctx, 44, RULE_exp_factor2);
		int _la;
		try {
			_localctx = new WhereAndContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			predicate();
			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(169);
				match(AND);
				setState(170);
				predicate();
				}
				}
				setState(175);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class PredicateContext extends ParserRuleContext {
		public PredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicate; }
	 
		public PredicateContext() { }
		public void copyFrom(PredicateContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CondGtContext extends PredicateContext {
		public List<Simple_exprContext> simple_expr() {
			return getRuleContexts(Simple_exprContext.class);
		}
		public Simple_exprContext simple_expr(int i) {
			return getRuleContext(Simple_exprContext.class,i);
		}
		public TerminalNode GTH() { return getToken(jsonLogSqlParser.GTH, 0); }
		public CondGtContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jsonLogSqlListener ) ((jsonLogSqlListener)listener).enterCondGt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jsonLogSqlListener ) ((jsonLogSqlListener)listener).exitCondGt(this);
		}
	}
	public static class CondEqContext extends PredicateContext {
		public List<Simple_exprContext> simple_expr() {
			return getRuleContexts(Simple_exprContext.class);
		}
		public Simple_exprContext simple_expr(int i) {
			return getRuleContext(Simple_exprContext.class,i);
		}
		public TerminalNode EQ() { return getToken(jsonLogSqlParser.EQ, 0); }
		public CondEqContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jsonLogSqlListener ) ((jsonLogSqlListener)listener).enterCondEq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jsonLogSqlListener ) ((jsonLogSqlListener)listener).exitCondEq(this);
		}
	}
	public static class CondLikeOrNotContext extends PredicateContext {
		public List<Simple_exprContext> simple_expr() {
			return getRuleContexts(Simple_exprContext.class);
		}
		public Simple_exprContext simple_expr(int i) {
			return getRuleContext(Simple_exprContext.class,i);
		}
		public TerminalNode LIKE() { return getToken(jsonLogSqlParser.LIKE, 0); }
		public TerminalNode NOT() { return getToken(jsonLogSqlParser.NOT, 0); }
		public CondLikeOrNotContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jsonLogSqlListener ) ((jsonLogSqlListener)listener).enterCondLikeOrNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jsonLogSqlListener ) ((jsonLogSqlListener)listener).exitCondLikeOrNot(this);
		}
	}
	public static class CondSubCondsContext extends PredicateContext {
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public CondSubCondsContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jsonLogSqlListener ) ((jsonLogSqlListener)listener).enterCondSubConds(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jsonLogSqlListener ) ((jsonLogSqlListener)listener).exitCondSubConds(this);
		}
	}
	public static class CondLtContext extends PredicateContext {
		public List<Simple_exprContext> simple_expr() {
			return getRuleContexts(Simple_exprContext.class);
		}
		public Simple_exprContext simple_expr(int i) {
			return getRuleContext(Simple_exprContext.class,i);
		}
		public TerminalNode LTH() { return getToken(jsonLogSqlParser.LTH, 0); }
		public CondLtContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jsonLogSqlListener ) ((jsonLogSqlListener)listener).enterCondLt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jsonLogSqlListener ) ((jsonLogSqlListener)listener).exitCondLt(this);
		}
	}
	public static class CondLetContext extends PredicateContext {
		public List<Simple_exprContext> simple_expr() {
			return getRuleContexts(Simple_exprContext.class);
		}
		public Simple_exprContext simple_expr(int i) {
			return getRuleContext(Simple_exprContext.class,i);
		}
		public TerminalNode LET() { return getToken(jsonLogSqlParser.LET, 0); }
		public CondLetContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jsonLogSqlListener ) ((jsonLogSqlListener)listener).enterCondLet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jsonLogSqlListener ) ((jsonLogSqlListener)listener).exitCondLet(this);
		}
	}
	public static class CondNotEqContext extends PredicateContext {
		public List<Simple_exprContext> simple_expr() {
			return getRuleContexts(Simple_exprContext.class);
		}
		public Simple_exprContext simple_expr(int i) {
			return getRuleContext(Simple_exprContext.class,i);
		}
		public TerminalNode NOT_EQ() { return getToken(jsonLogSqlParser.NOT_EQ, 0); }
		public CondNotEqContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jsonLogSqlListener ) ((jsonLogSqlListener)listener).enterCondNotEq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jsonLogSqlListener ) ((jsonLogSqlListener)listener).exitCondNotEq(this);
		}
	}
	public static class CondInOrNotContext extends PredicateContext {
		public Simple_exprContext simple_expr() {
			return getRuleContext(Simple_exprContext.class,0);
		}
		public TerminalNode IN() { return getToken(jsonLogSqlParser.IN, 0); }
		public TerminalNode LPAREN() { return getToken(jsonLogSqlParser.LPAREN, 0); }
		public List<Literal_valueContext> literal_value() {
			return getRuleContexts(Literal_valueContext.class);
		}
		public Literal_valueContext literal_value(int i) {
			return getRuleContext(Literal_valueContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(jsonLogSqlParser.RPAREN, 0); }
		public TerminalNode NOT() { return getToken(jsonLogSqlParser.NOT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(jsonLogSqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(jsonLogSqlParser.COMMA, i);
		}
		public CondInOrNotContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jsonLogSqlListener ) ((jsonLogSqlListener)listener).enterCondInOrNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jsonLogSqlListener ) ((jsonLogSqlListener)listener).exitCondInOrNot(this);
		}
	}
	public static class CondGetContext extends PredicateContext {
		public List<Simple_exprContext> simple_expr() {
			return getRuleContexts(Simple_exprContext.class);
		}
		public Simple_exprContext simple_expr(int i) {
			return getRuleContext(Simple_exprContext.class,i);
		}
		public TerminalNode GET() { return getToken(jsonLogSqlParser.GET, 0); }
		public CondGetContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jsonLogSqlListener ) ((jsonLogSqlListener)listener).enterCondGet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jsonLogSqlListener ) ((jsonLogSqlListener)listener).exitCondGet(this);
		}
	}
	public static class CondRegexpOrNotContext extends PredicateContext {
		public List<Simple_exprContext> simple_expr() {
			return getRuleContexts(Simple_exprContext.class);
		}
		public Simple_exprContext simple_expr(int i) {
			return getRuleContext(Simple_exprContext.class,i);
		}
		public TerminalNode REGEXP() { return getToken(jsonLogSqlParser.REGEXP, 0); }
		public TerminalNode NOT() { return getToken(jsonLogSqlParser.NOT, 0); }
		public CondRegexpOrNotContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jsonLogSqlListener ) ((jsonLogSqlListener)listener).enterCondRegexpOrNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jsonLogSqlListener ) ((jsonLogSqlListener)listener).exitCondRegexpOrNot(this);
		}
	}
	public static class CondIsTFNOrNotContext extends PredicateContext {
		public Simple_exprContext simple_expr() {
			return getRuleContext(Simple_exprContext.class,0);
		}
		public TerminalNode IS() { return getToken(jsonLogSqlParser.IS, 0); }
		public Boolean_literalContext boolean_literal() {
			return getRuleContext(Boolean_literalContext.class,0);
		}
		public TerminalNode NULL() { return getToken(jsonLogSqlParser.NULL, 0); }
		public TerminalNode NOT() { return getToken(jsonLogSqlParser.NOT, 0); }
		public CondIsTFNOrNotContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jsonLogSqlListener ) ((jsonLogSqlListener)listener).enterCondIsTFNOrNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jsonLogSqlListener ) ((jsonLogSqlListener)listener).exitCondIsTFNOrNot(this);
		}
	}
	public static class CondBetweenOrNotContext extends PredicateContext {
		public Simple_exprContext simple_expr() {
			return getRuleContext(Simple_exprContext.class,0);
		}
		public TerminalNode BETWEEN() { return getToken(jsonLogSqlParser.BETWEEN, 0); }
		public List<Literal_valueContext> literal_value() {
			return getRuleContexts(Literal_valueContext.class);
		}
		public Literal_valueContext literal_value(int i) {
			return getRuleContext(Literal_valueContext.class,i);
		}
		public TerminalNode AND() { return getToken(jsonLogSqlParser.AND, 0); }
		public TerminalNode NOT() { return getToken(jsonLogSqlParser.NOT, 0); }
		public CondBetweenOrNotContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jsonLogSqlListener ) ((jsonLogSqlListener)listener).enterCondBetweenOrNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jsonLogSqlListener ) ((jsonLogSqlListener)listener).exitCondBetweenOrNot(this);
		}
	}

	public final PredicateContext predicate() throws RecognitionException {
		PredicateContext _localctx = new PredicateContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_predicate);
		int _la;
		try {
			setState(249);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				_localctx = new CondEqContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(176);
				simple_expr();
				setState(177);
				match(EQ);
				setState(178);
				simple_expr();
				}
				}
				break;
			case 2:
				_localctx = new CondNotEqContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(180);
				simple_expr();
				setState(181);
				match(NOT_EQ);
				setState(182);
				simple_expr();
				}
				}
				break;
			case 3:
				_localctx = new CondLtContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(184);
				simple_expr();
				setState(185);
				match(LTH);
				setState(186);
				simple_expr();
				}
				}
				break;
			case 4:
				_localctx = new CondGtContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(188);
				simple_expr();
				setState(189);
				match(GTH);
				setState(190);
				simple_expr();
				}
				}
				break;
			case 5:
				_localctx = new CondLetContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(192);
				simple_expr();
				setState(193);
				match(LET);
				setState(194);
				simple_expr();
				}
				}
				break;
			case 6:
				_localctx = new CondGetContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				{
				setState(196);
				simple_expr();
				setState(197);
				match(GET);
				setState(198);
				simple_expr();
				}
				}
				break;
			case 7:
				_localctx = new CondInOrNotContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				{
				setState(200);
				simple_expr();
				setState(202);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(201);
					match(NOT);
					}
				}

				setState(204);
				match(IN);
				setState(205);
				match(LPAREN);
				setState(206);
				literal_value();
				setState(211);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(207);
					match(COMMA);
					setState(208);
					literal_value();
					}
					}
					setState(213);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(214);
				match(RPAREN);
				}
				}
				break;
			case 8:
				_localctx = new CondBetweenOrNotContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				{
				setState(216);
				simple_expr();
				setState(218);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(217);
					match(NOT);
					}
				}

				setState(220);
				match(BETWEEN);
				setState(221);
				literal_value();
				setState(222);
				match(AND);
				setState(223);
				literal_value();
				}
				}
				break;
			case 9:
				_localctx = new CondLikeOrNotContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				{
				setState(225);
				simple_expr();
				setState(227);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(226);
					match(NOT);
					}
				}

				setState(229);
				match(LIKE);
				setState(230);
				simple_expr();
				}
				}
				break;
			case 10:
				_localctx = new CondRegexpOrNotContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				{
				setState(232);
				simple_expr();
				setState(234);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(233);
					match(NOT);
					}
				}

				setState(236);
				match(REGEXP);
				setState(237);
				simple_expr();
				}
				}
				break;
			case 11:
				_localctx = new CondIsTFNOrNotContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				{
				setState(239);
				simple_expr();
				{
				setState(240);
				match(IS);
				setState(242);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(241);
					match(NOT);
					}
				}

				setState(246);
				switch (_input.LA(1)) {
				case TRUE:
				case FALSE:
					{
					setState(244);
					boolean_literal();
					}
					break;
				case NULL:
					{
					setState(245);
					match(NULL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				}
				break;
			case 12:
				_localctx = new CondSubCondsContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				{
				setState(248);
				expression_list();
				}
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

	public static class Simple_exprContext extends ParserRuleContext {
		public Literal_valueContext literal_value() {
			return getRuleContext(Literal_valueContext.class,0);
		}
		public Column_specContext column_spec() {
			return getRuleContext(Column_specContext.class,0);
		}
		public Array_column_specContext array_column_spec() {
			return getRuleContext(Array_column_specContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public Simple_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jsonLogSqlListener ) ((jsonLogSqlListener)listener).enterSimple_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jsonLogSqlListener ) ((jsonLogSqlListener)listener).exitSimple_expr(this);
		}
	}

	public final Simple_exprContext simple_expr() throws RecognitionException {
		Simple_exprContext _localctx = new Simple_exprContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_simple_expr);
		try {
			setState(256);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(251);
				literal_value();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(252);
				column_spec();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(253);
				array_column_spec();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(254);
				function_call();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(255);
				expression_list();
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

	public static class Function_callContext extends ParserRuleContext {
		public FunctionListContext functionList() {
			return getRuleContext(FunctionListContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(jsonLogSqlParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(jsonLogSqlParser.RPAREN, 0); }
		public List<Simple_exprContext> simple_expr() {
			return getRuleContexts(Simple_exprContext.class);
		}
		public Simple_exprContext simple_expr(int i) {
			return getRuleContext(Simple_exprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(jsonLogSqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(jsonLogSqlParser.COMMA, i);
		}
		public Group_functionsContext group_functions() {
			return getRuleContext(Group_functionsContext.class,0);
		}
		public TerminalNode ASTERISK() { return getToken(jsonLogSqlParser.ASTERISK, 0); }
		public TerminalNode ALL() { return getToken(jsonLogSqlParser.ALL, 0); }
		public TerminalNode DISTINCT() { return getToken(jsonLogSqlParser.DISTINCT, 0); }
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jsonLogSqlListener ) ((jsonLogSqlListener)listener).enterFunction_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jsonLogSqlListener ) ((jsonLogSqlListener)listener).exitFunction_call(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_function_call);
		int _la;
		try {
			setState(284);
			switch (_input.LA(1)) {
			case LCASE:
			case LOWER:
			case LTRIM:
			case RTRIM:
			case CONCAT:
			case SUBSTR:
			case TO_CHAR:
			case TRIM:
			case UCASE:
			case REGEX_GROUP:
			case RANDOM:
			case UPPER:
			case LENGTH:
			case REVERSE:
			case DAY:
			case HOUR:
			case MINUTE:
			case MONTH:
			case SECOND:
			case YEAR:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(258);
				functionList();
				setState(271);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(259);
					match(LPAREN);
					setState(268);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LCASE) | (1L << LOWER) | (1L << LTRIM) | (1L << RTRIM) | (1L << CONCAT) | (1L << SUBSTR) | (1L << TO_CHAR) | (1L << TRIM) | (1L << UCASE) | (1L << REGEX_GROUP) | (1L << RANDOM) | (1L << UPPER) | (1L << LENGTH) | (1L << REVERSE) | (1L << TRUE) | (1L << FALSE) | (1L << ALL) | (1L << NOT) | (1L << LIKE) | (1L << IF) | (1L << EXISTS) | (1L << ASC) | (1L << DESC) | (1L << ORDER) | (1L << GROUP) | (1L << BY) | (1L << HAVING) | (1L << WHERE) | (1L << FROM) | (1L << AS) | (1L << SELECT) | (1L << DISTINCT) | (1L << IS) | (1L << NULL) | (1L << ADD) | (1L << BETWEEN) | (1L << DAY) | (1L << HOUR) | (1L << MINUTE) | (1L << MONTH) | (1L << SECOND) | (1L << YEAR) | (1L << AVG) | (1L << COUNT) | (1L << MAX) | (1L << MIN) | (1L << SUM) | (1L << DIVIDE) | (1L << MOD) | (1L << OR) | (1L << AND) | (1L << XOR) | (1L << EQ) | (1L << NOT_EQ) | (1L << LET) | (1L << GET) | (1L << SET_VAR))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (SHIFT_LEFT - 64)) | (1L << (SHIFT_RIGHT - 64)) | (1L << (LPAREN - 64)) | (1L << (PLUS - 64)) | (1L << (MINUS - 64)) | (1L << (INTEGER_NUM - 64)) | (1L << (HEX_DIGIT - 64)) | (1L << (BIT_NUM - 64)) | (1L << (REAL_NUMBER - 64)) | (1L << (TEXT_STRING - 64)) | (1L << (ID - 64)))) != 0)) {
						{
						setState(260);
						simple_expr();
						setState(265);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
							{
							setState(261);
							match(COMMA);
							setState(262);
							simple_expr();
							}
							}
							setState(267);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
					}

					setState(270);
					match(RPAREN);
					}
				}

				}
				}
				break;
			case AVG:
			case COUNT:
			case MAX:
			case MIN:
			case SUM:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(273);
				group_functions();
				setState(274);
				match(LPAREN);
				setState(276);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(275);
					_la = _input.LA(1);
					if ( !(((((_la - 18)) & ~0x3f) == 0 && ((1L << (_la - 18)) & ((1L << (ALL - 18)) | (1L << (DISTINCT - 18)) | (1L << (ASTERISK - 18)))) != 0)) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
					break;
				}
				setState(280);
				switch (_input.LA(1)) {
				case LCASE:
				case LOWER:
				case LTRIM:
				case RTRIM:
				case CONCAT:
				case SUBSTR:
				case TO_CHAR:
				case TRIM:
				case UCASE:
				case REGEX_GROUP:
				case RANDOM:
				case UPPER:
				case LENGTH:
				case REVERSE:
				case TRUE:
				case FALSE:
				case ALL:
				case NOT:
				case LIKE:
				case IF:
				case EXISTS:
				case ASC:
				case DESC:
				case ORDER:
				case GROUP:
				case BY:
				case HAVING:
				case WHERE:
				case FROM:
				case AS:
				case SELECT:
				case DISTINCT:
				case IS:
				case NULL:
				case ADD:
				case BETWEEN:
				case DAY:
				case HOUR:
				case MINUTE:
				case MONTH:
				case SECOND:
				case YEAR:
				case AVG:
				case COUNT:
				case MAX:
				case MIN:
				case SUM:
				case DIVIDE:
				case MOD:
				case OR:
				case AND:
				case XOR:
				case EQ:
				case NOT_EQ:
				case LET:
				case GET:
				case SET_VAR:
				case SHIFT_LEFT:
				case SHIFT_RIGHT:
				case LPAREN:
				case PLUS:
				case MINUS:
				case INTEGER_NUM:
				case HEX_DIGIT:
				case BIT_NUM:
				case REAL_NUMBER:
				case TEXT_STRING:
				case ID:
					{
					setState(278);
					simple_expr();
					}
					break;
				case ASTERISK:
					{
					setState(279);
					match(ASTERISK);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(282);
				match(RPAREN);
				}
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

	public static class Column_specContext extends ParserRuleContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public List<Table_nameContext> table_name() {
			return getRuleContexts(Table_nameContext.class);
		}
		public Table_nameContext table_name(int i) {
			return getRuleContext(Table_nameContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(jsonLogSqlParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(jsonLogSqlParser.DOT, i);
		}
		public Column_specContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_spec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jsonLogSqlListener ) ((jsonLogSqlListener)listener).enterColumn_spec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jsonLogSqlListener ) ((jsonLogSqlListener)listener).exitColumn_spec(this);
		}
	}

	public final Column_specContext column_spec() throws RecognitionException {
		Column_specContext _localctx = new Column_specContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_column_spec);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(286);
					table_name();
					setState(287);
					match(DOT);
					}
					} 
				}
				setState(293);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			}
			{
			setState(294);
			column_name();
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

	public static class Array_column_specContext extends ParserRuleContext {
		public Column_specContext column_spec() {
			return getRuleContext(Column_specContext.class,0);
		}
		public List<Table_nameContext> table_name() {
			return getRuleContexts(Table_nameContext.class);
		}
		public Table_nameContext table_name(int i) {
			return getRuleContext(Table_nameContext.class,i);
		}
		public Array_column_specContext array_column_spec() {
			return getRuleContext(Array_column_specContext.class,0);
		}
		public List<TerminalNode> INTEGER_NUM() { return getTokens(jsonLogSqlParser.INTEGER_NUM); }
		public TerminalNode INTEGER_NUM(int i) {
			return getToken(jsonLogSqlParser.INTEGER_NUM, i);
		}
		public List<TerminalNode> DOT() { return getTokens(jsonLogSqlParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(jsonLogSqlParser.DOT, i);
		}
		public Array_column_specContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_column_spec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jsonLogSqlListener ) ((jsonLogSqlListener)listener).enterArray_column_spec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jsonLogSqlListener ) ((jsonLogSqlListener)listener).exitArray_column_spec(this);
		}
	}

	public final Array_column_specContext array_column_spec() throws RecognitionException {
		Array_column_specContext _localctx = new Array_column_specContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_array_column_spec);
		int _la;
		try {
			int _alt;
			setState(312);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(296);
				column_spec();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(305); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(297);
						table_name();
						{
						{
						setState(298);
						match(LBRACK);
						setState(299);
						_la = _input.LA(1);
						if ( !(_la==T__0 || _la==ASTERISK || _la==INTEGER_NUM) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(300);
						match(RBRACK);
						}
						setState(303);
						switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
						case 1:
							{
							setState(302);
							match(DOT);
							}
							break;
						}
						}
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(307); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(310);
				switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
				case 1:
					{
					setState(309);
					array_column_spec();
					}
					break;
				}
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

	public static class Expression_listContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(jsonLogSqlParser.LPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(jsonLogSqlParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(jsonLogSqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(jsonLogSqlParser.COMMA, i);
		}
		public Expression_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jsonLogSqlListener ) ((jsonLogSqlListener)listener).enterExpression_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jsonLogSqlListener ) ((jsonLogSqlListener)listener).exitExpression_list(this);
		}
	}

	public final Expression_listContext expression_list() throws RecognitionException {
		Expression_listContext _localctx = new Expression_listContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_expression_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			match(LPAREN);
			setState(315);
			expression();
			setState(320);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(316);
				match(COMMA);
				setState(317);
				expression();
				}
				}
				setState(322);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(323);
			match(RPAREN);
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

	public static class Table_referencesContext extends ParserRuleContext {
		public List<Table_nameContext> table_name() {
			return getRuleContexts(Table_nameContext.class);
		}
		public Table_nameContext table_name(int i) {
			return getRuleContext(Table_nameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(jsonLogSqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(jsonLogSqlParser.COMMA, i);
		}
		public Table_referencesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_references; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jsonLogSqlListener ) ((jsonLogSqlListener)listener).enterTable_references(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jsonLogSqlListener ) ((jsonLogSqlListener)listener).exitTable_references(this);
		}
	}

	public final Table_referencesContext table_references() throws RecognitionException {
		Table_referencesContext _localctx = new Table_referencesContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_table_references);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			table_name();
			setState(330);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(326);
				match(COMMA);
				setState(327);
				table_name();
				}
				}
				setState(332);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class Select_statementContext extends ParserRuleContext {
		public List<Select_expressionContext> select_expression() {
			return getRuleContexts(Select_expressionContext.class);
		}
		public Select_expressionContext select_expression(int i) {
			return getRuleContext(Select_expressionContext.class,i);
		}
		public List<TerminalNode> ALL() { return getTokens(jsonLogSqlParser.ALL); }
		public TerminalNode ALL(int i) {
			return getToken(jsonLogSqlParser.ALL, i);
		}
		public List<TerminalNode> DISTINCT() { return getTokens(jsonLogSqlParser.DISTINCT); }
		public TerminalNode DISTINCT(int i) {
			return getToken(jsonLogSqlParser.DISTINCT, i);
		}
		public Select_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jsonLogSqlListener ) ((jsonLogSqlListener)listener).enterSelect_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jsonLogSqlListener ) ((jsonLogSqlListener)listener).exitSelect_statement(this);
		}
	}

	public final Select_statementContext select_statement() throws RecognitionException {
		Select_statementContext _localctx = new Select_statementContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_select_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			select_expression();
			setState(340);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALL) | (1L << SELECT) | (1L << DISTINCT))) != 0)) {
				{
				{
				setState(335);
				_la = _input.LA(1);
				if (_la==ALL || _la==DISTINCT) {
					{
					setState(334);
					_la = _input.LA(1);
					if ( !(_la==ALL || _la==DISTINCT) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
				}

				setState(337);
				select_expression();
				}
				}
				setState(342);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class Select_expressionContext extends ParserRuleContext {
		public Select_listContext select_list() {
			return getRuleContext(Select_listContext.class,0);
		}
		public TerminalNode FROM() { return getToken(jsonLogSqlParser.FROM, 0); }
		public Table_referencesContext table_references() {
			return getRuleContext(Table_referencesContext.class,0);
		}
		public Orderby_clauseContext orderby_clause() {
			return getRuleContext(Orderby_clauseContext.class,0);
		}
		public Limit_clauseContext limit_clause() {
			return getRuleContext(Limit_clauseContext.class,0);
		}
		public Where_clauseContext where_clause() {
			return getRuleContext(Where_clauseContext.class,0);
		}
		public Groupby_clauseContext groupby_clause() {
			return getRuleContext(Groupby_clauseContext.class,0);
		}
		public Select_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jsonLogSqlListener ) ((jsonLogSqlListener)listener).enterSelect_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jsonLogSqlListener ) ((jsonLogSqlListener)listener).exitSelect_expression(this);
		}
	}

	public final Select_expressionContext select_expression() throws RecognitionException {
		Select_expressionContext _localctx = new Select_expressionContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_select_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			select_list();
			setState(352);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(344);
				match(FROM);
				setState(345);
				table_references();
				setState(347);
				_la = _input.LA(1);
				if (_la==WHERE) {
					{
					setState(346);
					where_clause();
					}
				}

				setState(350);
				_la = _input.LA(1);
				if (_la==GROUP) {
					{
					setState(349);
					groupby_clause();
					}
				}

				}
			}

			setState(355);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(354);
				orderby_clause();
				}
			}

			setState(358);
			_la = _input.LA(1);
			if (_la==LIMIT) {
				{
				setState(357);
				limit_clause();
				}
			}

			setState(361);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(360);
				match(SEMI);
				}
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

	public static class Where_clauseContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(jsonLogSqlParser.WHERE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Where_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_where_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jsonLogSqlListener ) ((jsonLogSqlListener)listener).enterWhere_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jsonLogSqlListener ) ((jsonLogSqlListener)listener).exitWhere_clause(this);
		}
	}

	public final Where_clauseContext where_clause() throws RecognitionException {
		Where_clauseContext _localctx = new Where_clauseContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_where_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			match(WHERE);
			setState(364);
			expression();
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

	public static class Groupby_clauseContext extends ParserRuleContext {
		public TerminalNode GROUP() { return getToken(jsonLogSqlParser.GROUP, 0); }
		public TerminalNode BY() { return getToken(jsonLogSqlParser.BY, 0); }
		public List<Groupby_itemContext> groupby_item() {
			return getRuleContexts(Groupby_itemContext.class);
		}
		public Groupby_itemContext groupby_item(int i) {
			return getRuleContext(Groupby_itemContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(jsonLogSqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(jsonLogSqlParser.COMMA, i);
		}
		public Having_clauseContext having_clause() {
			return getRuleContext(Having_clauseContext.class,0);
		}
		public Groupby_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupby_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jsonLogSqlListener ) ((jsonLogSqlListener)listener).enterGroupby_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jsonLogSqlListener ) ((jsonLogSqlListener)listener).exitGroupby_clause(this);
		}
	}

	public final Groupby_clauseContext groupby_clause() throws RecognitionException {
		Groupby_clauseContext _localctx = new Groupby_clauseContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_groupby_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			match(GROUP);
			setState(367);
			match(BY);
			setState(368);
			groupby_item();
			setState(373);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(369);
				match(COMMA);
				setState(370);
				groupby_item();
				}
				}
				setState(375);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(377);
			_la = _input.LA(1);
			if (_la==HAVING) {
				{
				setState(376);
				having_clause();
				}
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

	public static class Groupby_itemContext extends ParserRuleContext {
		public Column_specContext column_spec() {
			return getRuleContext(Column_specContext.class,0);
		}
		public TerminalNode INTEGER_NUM() { return getToken(jsonLogSqlParser.INTEGER_NUM, 0); }
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public Groupby_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupby_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jsonLogSqlListener ) ((jsonLogSqlListener)listener).enterGroupby_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jsonLogSqlListener ) ((jsonLogSqlListener)listener).exitGroupby_item(this);
		}
	}

	public final Groupby_itemContext groupby_item() throws RecognitionException {
		Groupby_itemContext _localctx = new Groupby_itemContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_groupby_item);
		try {
			setState(382);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(379);
				column_spec();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(380);
				match(INTEGER_NUM);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(381);
				function_call();
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

	public static class Having_clauseContext extends ParserRuleContext {
		public TerminalNode HAVING() { return getToken(jsonLogSqlParser.HAVING, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Having_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_having_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jsonLogSqlListener ) ((jsonLogSqlListener)listener).enterHaving_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jsonLogSqlListener ) ((jsonLogSqlListener)listener).exitHaving_clause(this);
		}
	}

	public final Having_clauseContext having_clause() throws RecognitionException {
		Having_clauseContext _localctx = new Having_clauseContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_having_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(384);
			match(HAVING);
			setState(385);
			expression();
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

	public static class Orderby_clauseContext extends ParserRuleContext {
		public Orderby_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderby_clause; }
	 
		public Orderby_clauseContext() { }
		public void copyFrom(Orderby_clauseContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class OrderByContext extends Orderby_clauseContext {
		public TerminalNode ORDER() { return getToken(jsonLogSqlParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(jsonLogSqlParser.BY, 0); }
		public List<Orderby_itemContext> orderby_item() {
			return getRuleContexts(Orderby_itemContext.class);
		}
		public Orderby_itemContext orderby_item(int i) {
			return getRuleContext(Orderby_itemContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(jsonLogSqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(jsonLogSqlParser.COMMA, i);
		}
		public OrderByContext(Orderby_clauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jsonLogSqlListener ) ((jsonLogSqlListener)listener).enterOrderBy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jsonLogSqlListener ) ((jsonLogSqlListener)listener).exitOrderBy(this);
		}
	}

	public final Orderby_clauseContext orderby_clause() throws RecognitionException {
		Orderby_clauseContext _localctx = new Orderby_clauseContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_orderby_clause);
		int _la;
		try {
			_localctx = new OrderByContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(387);
			match(ORDER);
			setState(388);
			match(BY);
			setState(389);
			orderby_item();
			setState(394);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(390);
				match(COMMA);
				setState(391);
				orderby_item();
				}
				}
				setState(396);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class Orderby_itemContext extends ParserRuleContext {
		public Groupby_itemContext groupby_item() {
			return getRuleContext(Groupby_itemContext.class,0);
		}
		public TerminalNode ASC() { return getToken(jsonLogSqlParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(jsonLogSqlParser.DESC, 0); }
		public Orderby_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderby_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jsonLogSqlListener ) ((jsonLogSqlListener)listener).enterOrderby_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jsonLogSqlListener ) ((jsonLogSqlListener)listener).exitOrderby_item(this);
		}
	}

	public final Orderby_itemContext orderby_item() throws RecognitionException {
		Orderby_itemContext _localctx = new Orderby_itemContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_orderby_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
			groupby_item();
			setState(399);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(398);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
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

	public static class Limit_clauseContext extends ParserRuleContext {
		public Limit_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limit_clause; }
	 
		public Limit_clauseContext() { }
		public void copyFrom(Limit_clauseContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LimitContext extends Limit_clauseContext {
		public TerminalNode LIMIT() { return getToken(jsonLogSqlParser.LIMIT, 0); }
		public Row_countContext row_count() {
			return getRuleContext(Row_countContext.class,0);
		}
		public OffsetContext offset() {
			return getRuleContext(OffsetContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(jsonLogSqlParser.COMMA, 0); }
		public LimitContext(Limit_clauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jsonLogSqlListener ) ((jsonLogSqlListener)listener).enterLimit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jsonLogSqlListener ) ((jsonLogSqlListener)listener).exitLimit(this);
		}
	}

	public final Limit_clauseContext limit_clause() throws RecognitionException {
		Limit_clauseContext _localctx = new Limit_clauseContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_limit_clause);
		try {
			_localctx = new LimitContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(401);
			match(LIMIT);
			{
			setState(405);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(402);
				offset();
				setState(403);
				match(COMMA);
				}
				break;
			}
			setState(407);
			row_count();
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

	public static class OffsetContext extends ParserRuleContext {
		public TerminalNode INTEGER_NUM() { return getToken(jsonLogSqlParser.INTEGER_NUM, 0); }
		public OffsetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_offset; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jsonLogSqlListener ) ((jsonLogSqlListener)listener).enterOffset(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jsonLogSqlListener ) ((jsonLogSqlListener)listener).exitOffset(this);
		}
	}

	public final OffsetContext offset() throws RecognitionException {
		OffsetContext _localctx = new OffsetContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_offset);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(409);
			match(INTEGER_NUM);
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

	public static class Row_countContext extends ParserRuleContext {
		public TerminalNode INTEGER_NUM() { return getToken(jsonLogSqlParser.INTEGER_NUM, 0); }
		public Row_countContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_row_count; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jsonLogSqlListener ) ((jsonLogSqlListener)listener).enterRow_count(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jsonLogSqlListener ) ((jsonLogSqlListener)listener).exitRow_count(this);
		}
	}

	public final Row_countContext row_count() throws RecognitionException {
		Row_countContext _localctx = new Row_countContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_row_count);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(411);
			match(INTEGER_NUM);
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

	public static class Select_listContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(jsonLogSqlParser.SELECT, 0); }
		public List<Displayed_columnContext> displayed_column() {
			return getRuleContexts(Displayed_columnContext.class);
		}
		public Displayed_columnContext displayed_column(int i) {
			return getRuleContext(Displayed_columnContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(jsonLogSqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(jsonLogSqlParser.COMMA, i);
		}
		public TerminalNode ALL() { return getToken(jsonLogSqlParser.ALL, 0); }
		public TerminalNode DISTINCT() { return getToken(jsonLogSqlParser.DISTINCT, 0); }
		public Select_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jsonLogSqlListener ) ((jsonLogSqlListener)listener).enterSelect_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jsonLogSqlListener ) ((jsonLogSqlListener)listener).exitSelect_list(this);
		}
	}

	public final Select_listContext select_list() throws RecognitionException {
		Select_listContext _localctx = new Select_listContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_select_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(413);
			match(SELECT);
			setState(415);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				{
				setState(414);
				_la = _input.LA(1);
				if ( !(_la==ALL || _la==DISTINCT) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			}
			setState(417);
			displayed_column();
			setState(422);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(418);
				match(COMMA);
				setState(419);
				displayed_column();
				}
				}
				setState(424);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class Displayed_columnContext extends ParserRuleContext {
		public Displayed_columnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_displayed_column; }
	 
		public Displayed_columnContext() { }
		public void copyFrom(Displayed_columnContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SelectAllContext extends Displayed_columnContext {
		public TerminalNode ASTERISK() { return getToken(jsonLogSqlParser.ASTERISK, 0); }
		public SelectAllContext(Displayed_columnContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jsonLogSqlListener ) ((jsonLogSqlListener)listener).enterSelectAll(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jsonLogSqlListener ) ((jsonLogSqlListener)listener).exitSelectAll(this);
		}
	}
	public static class SelectFunContext extends Displayed_columnContext {
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public AliasContext alias() {
			return getRuleContext(AliasContext.class,0);
		}
		public SelectFunContext(Displayed_columnContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jsonLogSqlListener ) ((jsonLogSqlListener)listener).enterSelectFun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jsonLogSqlListener ) ((jsonLogSqlListener)listener).exitSelectFun(this);
		}
	}
	public static class SelectTableColumnContext extends Displayed_columnContext {
		public Array_column_specContext array_column_spec() {
			return getRuleContext(Array_column_specContext.class,0);
		}
		public AliasContext alias() {
			return getRuleContext(AliasContext.class,0);
		}
		public SelectTableColumnContext(Displayed_columnContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jsonLogSqlListener ) ((jsonLogSqlListener)listener).enterSelectTableColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jsonLogSqlListener ) ((jsonLogSqlListener)listener).exitSelectTableColumn(this);
		}
	}
	public static class SelectTableDotAllContext extends Displayed_columnContext {
		public Array_column_specContext array_column_spec() {
			return getRuleContext(Array_column_specContext.class,0);
		}
		public TerminalNode DOT() { return getToken(jsonLogSqlParser.DOT, 0); }
		public TerminalNode ASTERISK() { return getToken(jsonLogSqlParser.ASTERISK, 0); }
		public SelectTableDotAllContext(Displayed_columnContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jsonLogSqlListener ) ((jsonLogSqlListener)listener).enterSelectTableDotAll(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jsonLogSqlListener ) ((jsonLogSqlListener)listener).exitSelectTableDotAll(this);
		}
	}

	public final Displayed_columnContext displayed_column() throws RecognitionException {
		Displayed_columnContext _localctx = new Displayed_columnContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_displayed_column);
		int _la;
		try {
			setState(438);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				_localctx = new SelectAllContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(425);
				match(ASTERISK);
				}
				break;
			case 2:
				_localctx = new SelectTableDotAllContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(426);
				array_column_spec();
				setState(427);
				match(DOT);
				setState(428);
				match(ASTERISK);
				}
				break;
			case 3:
				_localctx = new SelectTableColumnContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(430);
				array_column_spec();
				setState(432);
				_la = _input.LA(1);
				if (((((_la - 31)) & ~0x3f) == 0 && ((1L << (_la - 31)) & ((1L << (AS - 31)) | (1L << (TEXT_STRING - 31)) | (1L << (ID - 31)))) != 0)) {
					{
					setState(431);
					alias();
					}
				}

				}
				}
				break;
			case 4:
				_localctx = new SelectFunContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(434);
				function_call();
				setState(436);
				_la = _input.LA(1);
				if (((((_la - 31)) & ~0x3f) == 0 && ((1L << (_la - 31)) & ((1L << (AS - 31)) | (1L << (TEXT_STRING - 31)) | (1L << (ID - 31)))) != 0)) {
					{
					setState(435);
					alias();
					}
				}

				}
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

	public static class LengthContext extends ParserRuleContext {
		public TerminalNode INTEGER_NUM() { return getToken(jsonLogSqlParser.INTEGER_NUM, 0); }
		public LengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_length; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jsonLogSqlListener ) ((jsonLogSqlListener)listener).enterLength(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jsonLogSqlListener ) ((jsonLogSqlListener)listener).exitLength(this);
		}
	}

	public final LengthContext length() throws RecognitionException {
		LengthContext _localctx = new LengthContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_length);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(440);
			match(INTEGER_NUM);
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

	public static class Varchar_lengthContext extends ParserRuleContext {
		public TerminalNode INTEGER_NUM() { return getToken(jsonLogSqlParser.INTEGER_NUM, 0); }
		public Varchar_lengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varchar_length; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jsonLogSqlListener ) ((jsonLogSqlListener)listener).enterVarchar_length(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jsonLogSqlListener ) ((jsonLogSqlListener)listener).exitVarchar_length(this);
		}
	}

	public final Varchar_lengthContext varchar_length() throws RecognitionException {
		Varchar_lengthContext _localctx = new Varchar_lengthContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_varchar_length);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(442);
			match(INTEGER_NUM);
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

	public static class Binary_lengthContext extends ParserRuleContext {
		public TerminalNode INTEGER_NUM() { return getToken(jsonLogSqlParser.INTEGER_NUM, 0); }
		public Binary_lengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binary_length; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jsonLogSqlListener ) ((jsonLogSqlListener)listener).enterBinary_length(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jsonLogSqlListener ) ((jsonLogSqlListener)listener).exitBinary_length(this);
		}
	}

	public final Binary_lengthContext binary_length() throws RecognitionException {
		Binary_lengthContext _localctx = new Binary_lengthContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_binary_length);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(444);
			match(INTEGER_NUM);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3b\u01c1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\5\7"+
		"j\n\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\5"+
		"\13z\n\13\3\f\3\f\3\f\5\f\177\n\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20"+
		"\3\21\3\21\3\22\3\22\3\23\5\23\u008e\n\23\3\23\3\23\3\24\3\24\3\24\5\24"+
		"\u0095\n\24\3\25\3\25\5\25\u0099\n\25\3\26\3\26\3\26\7\26\u009e\n\26\f"+
		"\26\16\26\u00a1\13\26\3\27\3\27\3\27\7\27\u00a6\n\27\f\27\16\27\u00a9"+
		"\13\27\3\30\3\30\3\30\7\30\u00ae\n\30\f\30\16\30\u00b1\13\30\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u00cd\n\31\3\31"+
		"\3\31\3\31\3\31\3\31\7\31\u00d4\n\31\f\31\16\31\u00d7\13\31\3\31\3\31"+
		"\3\31\3\31\5\31\u00dd\n\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u00e6"+
		"\n\31\3\31\3\31\3\31\3\31\3\31\5\31\u00ed\n\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\5\31\u00f5\n\31\3\31\3\31\5\31\u00f9\n\31\3\31\5\31\u00fc\n\31\3"+
		"\32\3\32\3\32\3\32\3\32\5\32\u0103\n\32\3\33\3\33\3\33\3\33\3\33\7\33"+
		"\u010a\n\33\f\33\16\33\u010d\13\33\5\33\u010f\n\33\3\33\5\33\u0112\n\33"+
		"\3\33\3\33\3\33\5\33\u0117\n\33\3\33\3\33\5\33\u011b\n\33\3\33\3\33\5"+
		"\33\u011f\n\33\3\34\3\34\3\34\7\34\u0124\n\34\f\34\16\34\u0127\13\34\3"+
		"\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u0132\n\35\6\35\u0134"+
		"\n\35\r\35\16\35\u0135\3\35\5\35\u0139\n\35\5\35\u013b\n\35\3\36\3\36"+
		"\3\36\3\36\7\36\u0141\n\36\f\36\16\36\u0144\13\36\3\36\3\36\3\37\3\37"+
		"\3\37\7\37\u014b\n\37\f\37\16\37\u014e\13\37\3 \3 \5 \u0152\n \3 \7 \u0155"+
		"\n \f \16 \u0158\13 \3!\3!\3!\3!\5!\u015e\n!\3!\5!\u0161\n!\5!\u0163\n"+
		"!\3!\5!\u0166\n!\3!\5!\u0169\n!\3!\5!\u016c\n!\3\"\3\"\3\"\3#\3#\3#\3"+
		"#\3#\7#\u0176\n#\f#\16#\u0179\13#\3#\5#\u017c\n#\3$\3$\3$\5$\u0181\n$"+
		"\3%\3%\3%\3&\3&\3&\3&\3&\7&\u018b\n&\f&\16&\u018e\13&\3\'\3\'\5\'\u0192"+
		"\n\'\3(\3(\3(\3(\5(\u0198\n(\3(\3(\3)\3)\3*\3*\3+\3+\5+\u01a2\n+\3+\3"+
		"+\3+\7+\u01a7\n+\f+\16+\u01aa\13+\3,\3,\3,\3,\3,\3,\3,\5,\u01b3\n,\3,"+
		"\3,\5,\u01b7\n,\5,\u01b9\n,\3-\3-\3.\3.\3/\3/\3/\2\2\60\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\\2\16"+
		"\6\2\4\r\17%\'(\63C\4\2=@ST\3\2-\62\3\2MN\4\2VV[[\3\2\22\23\3\2\63\67"+
		"\4\2\4\r\17\21\5\2\24\24##HH\5\2\3\3HHVV\4\2\24\24##\3\2\31\32\u01da\2"+
		"^\3\2\2\2\4`\3\2\2\2\6b\3\2\2\2\bd\3\2\2\2\nf\3\2\2\2\fi\3\2\2\2\16m\3"+
		"\2\2\2\20o\3\2\2\2\22q\3\2\2\2\24y\3\2\2\2\26~\3\2\2\2\30\u0080\3\2\2"+
		"\2\32\u0082\3\2\2\2\34\u0084\3\2\2\2\36\u0086\3\2\2\2 \u0088\3\2\2\2\""+
		"\u008a\3\2\2\2$\u008d\3\2\2\2&\u0094\3\2\2\2(\u0098\3\2\2\2*\u009a\3\2"+
		"\2\2,\u00a2\3\2\2\2.\u00aa\3\2\2\2\60\u00fb\3\2\2\2\62\u0102\3\2\2\2\64"+
		"\u011e\3\2\2\2\66\u0125\3\2\2\28\u013a\3\2\2\2:\u013c\3\2\2\2<\u0147\3"+
		"\2\2\2>\u014f\3\2\2\2@\u0159\3\2\2\2B\u016d\3\2\2\2D\u0170\3\2\2\2F\u0180"+
		"\3\2\2\2H\u0182\3\2\2\2J\u0185\3\2\2\2L\u018f\3\2\2\2N\u0193\3\2\2\2P"+
		"\u019b\3\2\2\2R\u019d\3\2\2\2T\u019f\3\2\2\2V\u01b8\3\2\2\2X\u01ba\3\2"+
		"\2\2Z\u01bc\3\2\2\2\\\u01be\3\2\2\2^_\t\2\2\2_\3\3\2\2\2`a\7b\2\2a\5\3"+
		"\2\2\2bc\t\3\2\2c\7\3\2\2\2de\t\4\2\2e\t\3\2\2\2fg\7\\\2\2g\13\3\2\2\2"+
		"hj\t\5\2\2ih\3\2\2\2ij\3\2\2\2jk\3\2\2\2kl\t\6\2\2l\r\3\2\2\2mn\7Y\2\2"+
		"n\17\3\2\2\2op\t\7\2\2p\21\3\2\2\2qr\7Z\2\2r\23\3\2\2\2sz\5\n\6\2tz\5"+
		"\f\7\2uz\5\16\b\2vz\5\20\t\2wz\5\22\n\2xz\7%\2\2ys\3\2\2\2yt\3\2\2\2y"+
		"u\3\2\2\2yv\3\2\2\2yw\3\2\2\2yx\3\2\2\2z\25\3\2\2\2{\177\5\30\r\2|\177"+
		"\5\34\17\2}\177\5\36\20\2~{\3\2\2\2~|\3\2\2\2~}\3\2\2\2\177\27\3\2\2\2"+
		"\u0080\u0081\t\4\2\2\u0081\31\3\2\2\2\u0082\u0083\t\b\2\2\u0083\33\3\2"+
		"\2\2\u0084\u0085\t\t\2\2\u0085\35\3\2\2\2\u0086\u0087\7\16\2\2\u0087\37"+
		"\3\2\2\2\u0088\u0089\5&\24\2\u0089!\3\2\2\2\u008a\u008b\5&\24\2\u008b"+
		"#\3\2\2\2\u008c\u008e\7!\2\2\u008d\u008c\3\2\2\2\u008d\u008e\3\2\2\2\u008e"+
		"\u008f\3\2\2\2\u008f\u0090\5(\25\2\u0090%\3\2\2\2\u0091\u0095\7]\2\2\u0092"+
		"\u0095\5\2\2\2\u0093\u0095\5\n\6\2\u0094\u0091\3\2\2\2\u0094\u0092\3\2"+
		"\2\2\u0094\u0093\3\2\2\2\u0095\'\3\2\2\2\u0096\u0099\7]\2\2\u0097\u0099"+
		"\5\n\6\2\u0098\u0096\3\2\2\2\u0098\u0097\3\2\2\2\u0099)\3\2\2\2\u009a"+
		"\u009f\5,\27\2\u009b\u009c\7:\2\2\u009c\u009e\5,\27\2\u009d\u009b\3\2"+
		"\2\2\u009e\u00a1\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0"+
		"+\3\2\2\2\u00a1\u009f\3\2\2\2\u00a2\u00a7\5.\30\2\u00a3\u00a4\7<\2\2\u00a4"+
		"\u00a6\5.\30\2\u00a5\u00a3\3\2\2\2\u00a6\u00a9\3\2\2\2\u00a7\u00a5\3\2"+
		"\2\2\u00a7\u00a8\3\2\2\2\u00a8-\3\2\2\2\u00a9\u00a7\3\2\2\2\u00aa\u00af"+
		"\5\60\31\2\u00ab\u00ac\7;\2\2\u00ac\u00ae\5\60\31\2\u00ad\u00ab\3\2\2"+
		"\2\u00ae\u00b1\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0/"+
		"\3\2\2\2\u00b1\u00af\3\2\2\2\u00b2\u00b3\5\62\32\2\u00b3\u00b4\7=\2\2"+
		"\u00b4\u00b5\5\62\32\2\u00b5\u00fc\3\2\2\2\u00b6\u00b7\5\62\32\2\u00b7"+
		"\u00b8\7>\2\2\u00b8\u00b9\5\62\32\2\u00b9\u00fc\3\2\2\2\u00ba\u00bb\5"+
		"\62\32\2\u00bb\u00bc\7T\2\2\u00bc\u00bd\5\62\32\2\u00bd\u00fc\3\2\2\2"+
		"\u00be\u00bf\5\62\32\2\u00bf\u00c0\7S\2\2\u00c0\u00c1\5\62\32\2\u00c1"+
		"\u00fc\3\2\2\2\u00c2\u00c3\5\62\32\2\u00c3\u00c4\7?\2\2\u00c4\u00c5\5"+
		"\62\32\2\u00c5\u00fc\3\2\2\2\u00c6\u00c7\5\62\32\2\u00c7\u00c8\7@\2\2"+
		"\u00c8\u00c9\5\62\32\2\u00c9\u00fc\3\2\2\2\u00ca\u00cc\5\62\32\2\u00cb"+
		"\u00cd\7\25\2\2\u00cc\u00cb\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00ce\3"+
		"\2\2\2\u00ce\u00cf\7,\2\2\u00cf\u00d0\7J\2\2\u00d0\u00d5\5\24\13\2\u00d1"+
		"\u00d2\7G\2\2\u00d2\u00d4\5\24\13\2\u00d3\u00d1\3\2\2\2\u00d4\u00d7\3"+
		"\2\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d8\3\2\2\2\u00d7"+
		"\u00d5\3\2\2\2\u00d8\u00d9\7I\2\2\u00d9\u00fc\3\2\2\2\u00da\u00dc\5\62"+
		"\32\2\u00db\u00dd\7\25\2\2\u00dc\u00db\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd"+
		"\u00de\3\2\2\2\u00de\u00df\7(\2\2\u00df\u00e0\5\24\13\2\u00e0\u00e1\7"+
		";\2\2\u00e1\u00e2\5\24\13\2\u00e2\u00fc\3\2\2\2\u00e3\u00e5\5\62\32\2"+
		"\u00e4\u00e6\7\25\2\2\u00e5\u00e4\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e7"+
		"\3\2\2\2\u00e7\u00e8\7\26\2\2\u00e8\u00e9\5\62\32\2\u00e9\u00fc\3\2\2"+
		"\2\u00ea\u00ec\5\62\32\2\u00eb\u00ed\7\25\2\2\u00ec\u00eb\3\2\2\2\u00ec"+
		"\u00ed\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00ef\7*\2\2\u00ef\u00f0\5\62"+
		"\32\2\u00f0\u00fc\3\2\2\2\u00f1\u00f2\5\62\32\2\u00f2\u00f4\7$\2\2\u00f3"+
		"\u00f5\7\25\2\2\u00f4\u00f3\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f8\3"+
		"\2\2\2\u00f6\u00f9\5\20\t\2\u00f7\u00f9\7%\2\2\u00f8\u00f6\3\2\2\2\u00f8"+
		"\u00f7\3\2\2\2\u00f9\u00fc\3\2\2\2\u00fa\u00fc\5:\36\2\u00fb\u00b2\3\2"+
		"\2\2\u00fb\u00b6\3\2\2\2\u00fb\u00ba\3\2\2\2\u00fb\u00be\3\2\2\2\u00fb"+
		"\u00c2\3\2\2\2\u00fb\u00c6\3\2\2\2\u00fb\u00ca\3\2\2\2\u00fb\u00da\3\2"+
		"\2\2\u00fb\u00e3\3\2\2\2\u00fb\u00ea\3\2\2\2\u00fb\u00f1\3\2\2\2\u00fb"+
		"\u00fa\3\2\2\2\u00fc\61\3\2\2\2\u00fd\u0103\5\24\13\2\u00fe\u0103\5\66"+
		"\34\2\u00ff\u0103\58\35\2\u0100\u0103\5\64\33\2\u0101\u0103\5:\36\2\u0102"+
		"\u00fd\3\2\2\2\u0102\u00fe\3\2\2\2\u0102\u00ff\3\2\2\2\u0102\u0100\3\2"+
		"\2\2\u0102\u0101\3\2\2\2\u0103\63\3\2\2\2\u0104\u0111\5\26\f\2\u0105\u010e"+
		"\7J\2\2\u0106\u010b\5\62\32\2\u0107\u0108\7G\2\2\u0108\u010a\5\62\32\2"+
		"\u0109\u0107\3\2\2\2\u010a\u010d\3\2\2\2\u010b\u0109\3\2\2\2\u010b\u010c"+
		"\3\2\2\2\u010c\u010f\3\2\2\2\u010d\u010b\3\2\2\2\u010e\u0106\3\2\2\2\u010e"+
		"\u010f\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0112\7I\2\2\u0111\u0105\3\2"+
		"\2\2\u0111\u0112\3\2\2\2\u0112\u011f\3\2\2\2\u0113\u0114\5\32\16\2\u0114"+
		"\u0116\7J\2\2\u0115\u0117\t\n\2\2\u0116\u0115\3\2\2\2\u0116\u0117\3\2"+
		"\2\2\u0117\u011a\3\2\2\2\u0118\u011b\5\62\32\2\u0119\u011b\7H\2\2\u011a"+
		"\u0118\3\2\2\2\u011a\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011d\7I"+
		"\2\2\u011d\u011f\3\2\2\2\u011e\u0104\3\2\2\2\u011e\u0113\3\2\2\2\u011f"+
		"\65\3\2\2\2\u0120\u0121\5 \21\2\u0121\u0122\7F\2\2\u0122\u0124\3\2\2\2"+
		"\u0123\u0120\3\2\2\2\u0124\u0127\3\2\2\2\u0125\u0123\3\2\2\2\u0125\u0126"+
		"\3\2\2\2\u0126\u0128\3\2\2\2\u0127\u0125\3\2\2\2\u0128\u0129\5\"\22\2"+
		"\u0129\67\3\2\2\2\u012a\u013b\5\66\34\2\u012b\u012c\5 \21\2\u012c\u012d"+
		"\7L\2\2\u012d\u012e\t\13\2\2\u012e\u012f\7K\2\2\u012f\u0131\3\2\2\2\u0130"+
		"\u0132\7F\2\2\u0131\u0130\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0134\3\2"+
		"\2\2\u0133\u012b\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0133\3\2\2\2\u0135"+
		"\u0136\3\2\2\2\u0136\u0138\3\2\2\2\u0137\u0139\58\35\2\u0138\u0137\3\2"+
		"\2\2\u0138\u0139\3\2\2\2\u0139\u013b\3\2\2\2\u013a\u012a\3\2\2\2\u013a"+
		"\u0133\3\2\2\2\u013b9\3\2\2\2\u013c\u013d\7J\2\2\u013d\u0142\5*\26\2\u013e"+
		"\u013f\7G\2\2\u013f\u0141\5*\26\2\u0140\u013e\3\2\2\2\u0141\u0144\3\2"+
		"\2\2\u0142\u0140\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u0145\3\2\2\2\u0144"+
		"\u0142\3\2\2\2\u0145\u0146\7I\2\2\u0146;\3\2\2\2\u0147\u014c\5 \21\2\u0148"+
		"\u0149\7G\2\2\u0149\u014b\5 \21\2\u014a\u0148\3\2\2\2\u014b\u014e\3\2"+
		"\2\2\u014c\u014a\3\2\2\2\u014c\u014d\3\2\2\2\u014d=\3\2\2\2\u014e\u014c"+
		"\3\2\2\2\u014f\u0156\5@!\2\u0150\u0152\t\f\2\2\u0151\u0150\3\2\2\2\u0151"+
		"\u0152\3\2\2\2\u0152\u0153\3\2\2\2\u0153\u0155\5@!\2\u0154\u0151\3\2\2"+
		"\2\u0155\u0158\3\2\2\2\u0156\u0154\3\2\2\2\u0156\u0157\3\2\2\2\u0157?"+
		"\3\2\2\2\u0158\u0156\3\2\2\2\u0159\u0162\5T+\2\u015a\u015b\7 \2\2\u015b"+
		"\u015d\5<\37\2\u015c\u015e\5B\"\2\u015d\u015c\3\2\2\2\u015d\u015e\3\2"+
		"\2\2\u015e\u0160\3\2\2\2\u015f\u0161\5D#\2\u0160\u015f\3\2\2\2\u0160\u0161"+
		"\3\2\2\2\u0161\u0163\3\2\2\2\u0162\u015a\3\2\2\2\u0162\u0163\3\2\2\2\u0163"+
		"\u0165\3\2\2\2\u0164\u0166\5J&\2\u0165\u0164\3\2\2\2\u0165\u0166\3\2\2"+
		"\2\u0166\u0168\3\2\2\2\u0167\u0169\5N(\2\u0168\u0167\3\2\2\2\u0168\u0169"+
		"\3\2\2\2\u0169\u016b\3\2\2\2\u016a\u016c\7D\2\2\u016b\u016a\3\2\2\2\u016b"+
		"\u016c\3\2\2\2\u016cA\3\2\2\2\u016d\u016e\7\37\2\2\u016e\u016f\5*\26\2"+
		"\u016fC\3\2\2\2\u0170\u0171\7\34\2\2\u0171\u0172\7\35\2\2\u0172\u0177"+
		"\5F$\2\u0173\u0174\7G\2\2\u0174\u0176\5F$\2\u0175\u0173\3\2\2\2\u0176"+
		"\u0179\3\2\2\2\u0177\u0175\3\2\2\2\u0177\u0178\3\2\2\2\u0178\u017b\3\2"+
		"\2\2\u0179\u0177\3\2\2\2\u017a\u017c\5H%\2\u017b\u017a\3\2\2\2\u017b\u017c"+
		"\3\2\2\2\u017cE\3\2\2\2\u017d\u0181\5\66\34\2\u017e\u0181\7V\2\2\u017f"+
		"\u0181\5\64\33\2\u0180\u017d\3\2\2\2\u0180\u017e\3\2\2\2\u0180\u017f\3"+
		"\2\2\2\u0181G\3\2\2\2\u0182\u0183\7\36\2\2\u0183\u0184\5*\26\2\u0184I"+
		"\3\2\2\2\u0185\u0186\7\33\2\2\u0186\u0187\7\35\2\2\u0187\u018c\5L\'\2"+
		"\u0188\u0189\7G\2\2\u0189\u018b\5L\'\2\u018a\u0188\3\2\2\2\u018b\u018e"+
		"\3\2\2\2\u018c\u018a\3\2\2\2\u018c\u018d\3\2\2\2\u018dK\3\2\2\2\u018e"+
		"\u018c\3\2\2\2\u018f\u0191\5F$\2\u0190\u0192\t\r\2\2\u0191\u0190\3\2\2"+
		"\2\u0191\u0192\3\2\2\2\u0192M\3\2\2\2\u0193\u0197\7+\2\2\u0194\u0195\5"+
		"P)\2\u0195\u0196\7G\2\2\u0196\u0198\3\2\2\2\u0197\u0194\3\2\2\2\u0197"+
		"\u0198\3\2\2\2\u0198\u0199\3\2\2\2\u0199\u019a\5R*\2\u019aO\3\2\2\2\u019b"+
		"\u019c\7V\2\2\u019cQ\3\2\2\2\u019d\u019e\7V\2\2\u019eS\3\2\2\2\u019f\u01a1"+
		"\7\"\2\2\u01a0\u01a2\t\f\2\2\u01a1\u01a0\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2"+
		"\u01a3\3\2\2\2\u01a3\u01a8\5V,\2\u01a4\u01a5\7G\2\2\u01a5\u01a7\5V,\2"+
		"\u01a6\u01a4\3\2\2\2\u01a7\u01aa\3\2\2\2\u01a8\u01a6\3\2\2\2\u01a8\u01a9"+
		"\3\2\2\2\u01a9U\3\2\2\2\u01aa\u01a8\3\2\2\2\u01ab\u01b9\7H\2\2\u01ac\u01ad"+
		"\58\35\2\u01ad\u01ae\7F\2\2\u01ae\u01af\7H\2\2\u01af\u01b9\3\2\2\2\u01b0"+
		"\u01b2\58\35\2\u01b1\u01b3\5$\23\2\u01b2\u01b1\3\2\2\2\u01b2\u01b3\3\2"+
		"\2\2\u01b3\u01b9\3\2\2\2\u01b4\u01b6\5\64\33\2\u01b5\u01b7\5$\23\2\u01b6"+
		"\u01b5\3\2\2\2\u01b6\u01b7\3\2\2\2\u01b7\u01b9\3\2\2\2\u01b8\u01ab\3\2"+
		"\2\2\u01b8\u01ac\3\2\2\2\u01b8\u01b0\3\2\2\2\u01b8\u01b4\3\2\2\2\u01b9"+
		"W\3\2\2\2\u01ba\u01bb\7V\2\2\u01bbY\3\2\2\2\u01bc\u01bd\7V\2\2\u01bd["+
		"\3\2\2\2\u01be\u01bf\7V\2\2\u01bf]\3\2\2\2\64iy~\u008d\u0094\u0098\u009f"+
		"\u00a7\u00af\u00cc\u00d5\u00dc\u00e5\u00ec\u00f4\u00f8\u00fb\u0102\u010b"+
		"\u010e\u0111\u0116\u011a\u011e\u0125\u0131\u0135\u0138\u013a\u0142\u014c"+
		"\u0151\u0156\u015d\u0160\u0162\u0165\u0168\u016b\u0177\u017b\u0180\u018c"+
		"\u0191\u0197\u01a1\u01a8\u01b2\u01b6\u01b8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}