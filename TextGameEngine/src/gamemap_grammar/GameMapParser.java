// Generated from C:/Users/jackk/OneDrive/College/Fall Semester 2023/COMP711/Text-Game/TextGameEngine/src/GameMap.g4 by ANTLR 4.13.1
package gamemap_grammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class GameMapParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, CON=4, NUMBER=5, STRING=6, ID=7, NEWLINE=8, WS=9, 
		ANY=10;
	public static final int
		RULE_prog = 0, RULE_map = 1, RULE_state_list = 2, RULE_stat = 3, RULE_edge_stmt = 4, 
		RULE_edgeRHS = 5, RULE_edgeop = 6, RULE_attr_stmt = 7, RULE_attr_list = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "map", "state_list", "stat", "edge_stmt", "edgeRHS", "edgeop", 
			"attr_stmt", "attr_list"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'='", "','", "'-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "CON", "NUMBER", "STRING", "ID", "NEWLINE", "WS", 
			"ANY"
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
	public String getGrammarFileName() { return "GameMap.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GameMapParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public List<MapContext> map() {
			return getRuleContexts(MapContext.class);
		}
		public MapContext map(int i) {
			return getRuleContext(MapContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GameMapListener ) ((GameMapListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GameMapListener ) ((GameMapListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GameMapVisitor ) return ((GameMapVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(19); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(18);
				map();
				}
				}
				setState(21); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID || _la==NEWLINE );
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
	public static class MapContext extends ParserRuleContext {
		public MapContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_map; }
	 
		public MapContext() { }
		public void copyFrom(MapContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GameMapContext extends MapContext {
		public State_listContext state_list() {
			return getRuleContext(State_listContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(GameMapParser.NEWLINE, 0); }
		public GameMapContext(MapContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GameMapListener ) ((GameMapListener)listener).enterGameMap(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GameMapListener ) ((GameMapListener)listener).exitGameMap(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GameMapVisitor ) return ((GameMapVisitor<? extends T>)visitor).visitGameMap(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MapContext map() throws RecognitionException {
		MapContext _localctx = new MapContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_map);
		try {
			_localctx = new GameMapContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(23);
			state_list();
			setState(24);
			match(NEWLINE);
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
	public static class State_listContext extends ParserRuleContext {
		public State_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_state_list; }
	 
		public State_listContext() { }
		public void copyFrom(State_listContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StatesContext extends State_listContext {
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public StatesContext(State_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GameMapListener ) ((GameMapListener)listener).enterStates(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GameMapListener ) ((GameMapListener)listener).exitStates(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GameMapVisitor ) return ((GameMapVisitor<? extends T>)visitor).visitStates(this);
			else return visitor.visitChildren(this);
		}
	}

	public final State_listContext state_list() throws RecognitionException {
		State_listContext _localctx = new State_listContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_state_list);
		int _la;
		try {
			_localctx = new StatesContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(26);
				stat();
				setState(28);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(27);
					match(T__0);
					}
				}

				}
				}
				setState(34);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatContext extends ParserRuleContext {
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
	 
		public StatContext() { }
		public void copyFrom(StatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EdgesContext extends StatContext {
		public Edge_stmtContext edge_stmt() {
			return getRuleContext(Edge_stmtContext.class,0);
		}
		public EdgesContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GameMapListener ) ((GameMapListener)listener).enterEdges(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GameMapListener ) ((GameMapListener)listener).exitEdges(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GameMapVisitor ) return ((GameMapVisitor<? extends T>)visitor).visitEdges(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AttributesContext extends StatContext {
		public Attr_stmtContext attr_stmt() {
			return getRuleContext(Attr_stmtContext.class,0);
		}
		public AttributesContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GameMapListener ) ((GameMapListener)listener).enterAttributes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GameMapListener ) ((GameMapListener)listener).exitAttributes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GameMapVisitor ) return ((GameMapVisitor<? extends T>)visitor).visitAttributes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_stat);
		try {
			setState(37);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new EdgesContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(35);
				edge_stmt();
				}
				break;
			case 2:
				_localctx = new AttributesContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(36);
				attr_stmt();
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
	public static class Edge_stmtContext extends ParserRuleContext {
		public Edge_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_edge_stmt; }
	 
		public Edge_stmtContext() { }
		public void copyFrom(Edge_stmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LeftEdgeContext extends Edge_stmtContext {
		public TerminalNode ID() { return getToken(GameMapParser.ID, 0); }
		public EdgeRHSContext edgeRHS() {
			return getRuleContext(EdgeRHSContext.class,0);
		}
		public LeftEdgeContext(Edge_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GameMapListener ) ((GameMapListener)listener).enterLeftEdge(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GameMapListener ) ((GameMapListener)listener).exitLeftEdge(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GameMapVisitor ) return ((GameMapVisitor<? extends T>)visitor).visitLeftEdge(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Edge_stmtContext edge_stmt() throws RecognitionException {
		Edge_stmtContext _localctx = new Edge_stmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_edge_stmt);
		int _la;
		try {
			_localctx = new LeftEdgeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(39);
			match(ID);
			}
			setState(41);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CON) {
				{
				setState(40);
				edgeRHS();
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

	@SuppressWarnings("CheckReturnValue")
	public static class EdgeRHSContext extends ParserRuleContext {
		public EdgeRHSContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_edgeRHS; }
	 
		public EdgeRHSContext() { }
		public void copyFrom(EdgeRHSContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RightEdgeContext extends EdgeRHSContext {
		public EdgeopContext edgeop() {
			return getRuleContext(EdgeopContext.class,0);
		}
		public TerminalNode ID() { return getToken(GameMapParser.ID, 0); }
		public RightEdgeContext(EdgeRHSContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GameMapListener ) ((GameMapListener)listener).enterRightEdge(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GameMapListener ) ((GameMapListener)listener).exitRightEdge(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GameMapVisitor ) return ((GameMapVisitor<? extends T>)visitor).visitRightEdge(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EdgeRHSContext edgeRHS() throws RecognitionException {
		EdgeRHSContext _localctx = new EdgeRHSContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_edgeRHS);
		try {
			_localctx = new RightEdgeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(43);
			edgeop();
			{
			setState(44);
			match(ID);
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

	@SuppressWarnings("CheckReturnValue")
	public static class EdgeopContext extends ParserRuleContext {
		public TerminalNode CON() { return getToken(GameMapParser.CON, 0); }
		public EdgeopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_edgeop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GameMapListener ) ((GameMapListener)listener).enterEdgeop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GameMapListener ) ((GameMapListener)listener).exitEdgeop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GameMapVisitor ) return ((GameMapVisitor<? extends T>)visitor).visitEdgeop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EdgeopContext edgeop() throws RecognitionException {
		EdgeopContext _localctx = new EdgeopContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_edgeop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(CON);
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
	public static class Attr_stmtContext extends ParserRuleContext {
		public Attr_listContext attr_list() {
			return getRuleContext(Attr_listContext.class,0);
		}
		public Attr_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attr_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GameMapListener ) ((GameMapListener)listener).enterAttr_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GameMapListener ) ((GameMapListener)listener).exitAttr_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GameMapVisitor ) return ((GameMapVisitor<? extends T>)visitor).visitAttr_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Attr_stmtContext attr_stmt() throws RecognitionException {
		Attr_stmtContext _localctx = new Attr_stmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_attr_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			attr_list();
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
	public static class Attr_listContext extends ParserRuleContext {
		public Attr_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attr_list; }
	 
		public Attr_listContext() { }
		public void copyFrom(Attr_listContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NodePickupsContext extends Attr_listContext {
		public List<TerminalNode> ID() { return getTokens(GameMapParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GameMapParser.ID, i);
		}
		public NodePickupsContext(Attr_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GameMapListener ) ((GameMapListener)listener).enterNodePickups(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GameMapListener ) ((GameMapListener)listener).exitNodePickups(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GameMapVisitor ) return ((GameMapVisitor<? extends T>)visitor).visitNodePickups(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Attr_listContext attr_list() throws RecognitionException {
		Attr_listContext _localctx = new Attr_listContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_attr_list);
		int _la;
		try {
			int _alt;
			_localctx = new NodePickupsContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(58); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(50);
					match(ID);
					setState(53);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__1) {
						{
						setState(51);
						match(T__1);
						setState(52);
						match(ID);
						}
					}

					setState(56);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__2) {
						{
						setState(55);
						match(T__2);
						}
					}

					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(60); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
		"\u0004\u0001\n?\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0001\u0000\u0004\u0000\u0014\b\u0000\u000b\u0000\f\u0000\u0015"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0003\u0002"+
		"\u001d\b\u0002\u0005\u0002\u001f\b\u0002\n\u0002\f\u0002\"\t\u0002\u0001"+
		"\u0003\u0001\u0003\u0003\u0003&\b\u0003\u0001\u0004\u0001\u0004\u0003"+
		"\u0004*\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0003\b6\b\b\u0001"+
		"\b\u0003\b9\b\b\u0004\b;\b\b\u000b\b\f\b<\u0001\b\u0000\u0000\t\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0000\u0000=\u0000\u0013\u0001\u0000"+
		"\u0000\u0000\u0002\u0017\u0001\u0000\u0000\u0000\u0004 \u0001\u0000\u0000"+
		"\u0000\u0006%\u0001\u0000\u0000\u0000\b\'\u0001\u0000\u0000\u0000\n+\u0001"+
		"\u0000\u0000\u0000\f.\u0001\u0000\u0000\u0000\u000e0\u0001\u0000\u0000"+
		"\u0000\u0010:\u0001\u0000\u0000\u0000\u0012\u0014\u0003\u0002\u0001\u0000"+
		"\u0013\u0012\u0001\u0000\u0000\u0000\u0014\u0015\u0001\u0000\u0000\u0000"+
		"\u0015\u0013\u0001\u0000\u0000\u0000\u0015\u0016\u0001\u0000\u0000\u0000"+
		"\u0016\u0001\u0001\u0000\u0000\u0000\u0017\u0018\u0003\u0004\u0002\u0000"+
		"\u0018\u0019\u0005\b\u0000\u0000\u0019\u0003\u0001\u0000\u0000\u0000\u001a"+
		"\u001c\u0003\u0006\u0003\u0000\u001b\u001d\u0005\u0001\u0000\u0000\u001c"+
		"\u001b\u0001\u0000\u0000\u0000\u001c\u001d\u0001\u0000\u0000\u0000\u001d"+
		"\u001f\u0001\u0000\u0000\u0000\u001e\u001a\u0001\u0000\u0000\u0000\u001f"+
		"\"\u0001\u0000\u0000\u0000 \u001e\u0001\u0000\u0000\u0000 !\u0001\u0000"+
		"\u0000\u0000!\u0005\u0001\u0000\u0000\u0000\" \u0001\u0000\u0000\u0000"+
		"#&\u0003\b\u0004\u0000$&\u0003\u000e\u0007\u0000%#\u0001\u0000\u0000\u0000"+
		"%$\u0001\u0000\u0000\u0000&\u0007\u0001\u0000\u0000\u0000\')\u0005\u0007"+
		"\u0000\u0000(*\u0003\n\u0005\u0000)(\u0001\u0000\u0000\u0000)*\u0001\u0000"+
		"\u0000\u0000*\t\u0001\u0000\u0000\u0000+,\u0003\f\u0006\u0000,-\u0005"+
		"\u0007\u0000\u0000-\u000b\u0001\u0000\u0000\u0000./\u0005\u0004\u0000"+
		"\u0000/\r\u0001\u0000\u0000\u000001\u0003\u0010\b\u00001\u000f\u0001\u0000"+
		"\u0000\u000025\u0005\u0007\u0000\u000034\u0005\u0002\u0000\u000046\u0005"+
		"\u0007\u0000\u000053\u0001\u0000\u0000\u000056\u0001\u0000\u0000\u0000"+
		"68\u0001\u0000\u0000\u000079\u0005\u0003\u0000\u000087\u0001\u0000\u0000"+
		"\u000089\u0001\u0000\u0000\u00009;\u0001\u0000\u0000\u0000:2\u0001\u0000"+
		"\u0000\u0000;<\u0001\u0000\u0000\u0000<:\u0001\u0000\u0000\u0000<=\u0001"+
		"\u0000\u0000\u0000=\u0011\u0001\u0000\u0000\u0000\b\u0015\u001c %)58<";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}