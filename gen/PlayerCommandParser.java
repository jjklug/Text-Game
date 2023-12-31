// Generated from C:/Users/jackk/OneDrive/College/Fall Semester 2023/COMP711/Text-Game/TextGameEngine/src/PlayerCommand.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class PlayerCommandParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DOOR=1, PICKUP=2, EXIT=3, DESCRIBE=4, ADMIRE=5, EAT=6, STATS=7, WIELD=8, 
		OPEN=9, HELP=10, ATTACK=11, ID=12, INT=13, NEWLINE=14, WS=15;
	public static final int
		RULE_prog = 0, RULE_command = 1;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "command"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'door'", "'pickup'", "'exit'", "'describe'", "'admire'", "'eat'", 
			"'stats'", "'wield'", "'open'", "'help'", "'attack'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "DOOR", "PICKUP", "EXIT", "DESCRIBE", "ADMIRE", "EAT", "STATS", 
			"WIELD", "OPEN", "HELP", "ATTACK", "ID", "INT", "NEWLINE", "WS"
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
	public String getGrammarFileName() { return "PlayerCommand.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PlayerCommandParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayerCommandListener ) ((PlayerCommandListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayerCommandListener ) ((PlayerCommandListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayerCommandVisitor ) return ((PlayerCommandVisitor<? extends T>)visitor).visitProg(this);
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
			setState(5); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(4);
				command();
				}
				}
				setState(7); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 4094L) != 0) );
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
	public static class CommandContext extends ParserRuleContext {
		public TerminalNode DOOR() { return getToken(PlayerCommandParser.DOOR, 0); }
		public TerminalNode ID() { return getToken(PlayerCommandParser.ID, 0); }
		public TerminalNode PICKUP() { return getToken(PlayerCommandParser.PICKUP, 0); }
		public TerminalNode EXIT() { return getToken(PlayerCommandParser.EXIT, 0); }
		public TerminalNode DESCRIBE() { return getToken(PlayerCommandParser.DESCRIBE, 0); }
		public TerminalNode ADMIRE() { return getToken(PlayerCommandParser.ADMIRE, 0); }
		public TerminalNode EAT() { return getToken(PlayerCommandParser.EAT, 0); }
		public TerminalNode STATS() { return getToken(PlayerCommandParser.STATS, 0); }
		public TerminalNode WIELD() { return getToken(PlayerCommandParser.WIELD, 0); }
		public TerminalNode OPEN() { return getToken(PlayerCommandParser.OPEN, 0); }
		public TerminalNode HELP() { return getToken(PlayerCommandParser.HELP, 0); }
		public TerminalNode ATTACK() { return getToken(PlayerCommandParser.ATTACK, 0); }
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayerCommandListener ) ((PlayerCommandListener)listener).enterCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayerCommandListener ) ((PlayerCommandListener)listener).exitCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayerCommandVisitor ) return ((PlayerCommandVisitor<? extends T>)visitor).visitCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_command);
		try {
			setState(26);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(9);
				match(DOOR);
				setState(10);
				match(ID);
				}
				break;
			case PICKUP:
				enterOuterAlt(_localctx, 2);
				{
				setState(11);
				match(PICKUP);
				setState(12);
				match(ID);
				}
				break;
			case EXIT:
				enterOuterAlt(_localctx, 3);
				{
				setState(13);
				match(EXIT);
				}
				break;
			case DESCRIBE:
				enterOuterAlt(_localctx, 4);
				{
				setState(14);
				match(DESCRIBE);
				}
				break;
			case ADMIRE:
				enterOuterAlt(_localctx, 5);
				{
				setState(15);
				match(ADMIRE);
				setState(16);
				match(ID);
				}
				break;
			case EAT:
				enterOuterAlt(_localctx, 6);
				{
				setState(17);
				match(EAT);
				setState(18);
				match(ID);
				}
				break;
			case STATS:
				enterOuterAlt(_localctx, 7);
				{
				setState(19);
				match(STATS);
				}
				break;
			case WIELD:
				enterOuterAlt(_localctx, 8);
				{
				setState(20);
				match(WIELD);
				setState(21);
				match(ID);
				}
				break;
			case OPEN:
				enterOuterAlt(_localctx, 9);
				{
				setState(22);
				match(OPEN);
				setState(23);
				match(ID);
				}
				break;
			case HELP:
				enterOuterAlt(_localctx, 10);
				{
				setState(24);
				match(HELP);
				}
				break;
			case ATTACK:
				enterOuterAlt(_localctx, 11);
				{
				setState(25);
				match(ATTACK);
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

	public static final String _serializedATN =
		"\u0004\u0001\u000f\u001d\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0001\u0000\u0004\u0000\u0006\b\u0000\u000b\u0000\f\u0000\u0007\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u001b"+
		"\b\u0001\u0001\u0001\u0000\u0000\u0002\u0000\u0002\u0000\u0000%\u0000"+
		"\u0005\u0001\u0000\u0000\u0000\u0002\u001a\u0001\u0000\u0000\u0000\u0004"+
		"\u0006\u0003\u0002\u0001\u0000\u0005\u0004\u0001\u0000\u0000\u0000\u0006"+
		"\u0007\u0001\u0000\u0000\u0000\u0007\u0005\u0001\u0000\u0000\u0000\u0007"+
		"\b\u0001\u0000\u0000\u0000\b\u0001\u0001\u0000\u0000\u0000\t\n\u0005\u0001"+
		"\u0000\u0000\n\u001b\u0005\f\u0000\u0000\u000b\f\u0005\u0002\u0000\u0000"+
		"\f\u001b\u0005\f\u0000\u0000\r\u001b\u0005\u0003\u0000\u0000\u000e\u001b"+
		"\u0005\u0004\u0000\u0000\u000f\u0010\u0005\u0005\u0000\u0000\u0010\u001b"+
		"\u0005\f\u0000\u0000\u0011\u0012\u0005\u0006\u0000\u0000\u0012\u001b\u0005"+
		"\f\u0000\u0000\u0013\u001b\u0005\u0007\u0000\u0000\u0014\u0015\u0005\b"+
		"\u0000\u0000\u0015\u001b\u0005\f\u0000\u0000\u0016\u0017\u0005\t\u0000"+
		"\u0000\u0017\u001b\u0005\f\u0000\u0000\u0018\u001b\u0005\n\u0000\u0000"+
		"\u0019\u001b\u0005\u000b\u0000\u0000\u001a\t\u0001\u0000\u0000\u0000\u001a"+
		"\u000b\u0001\u0000\u0000\u0000\u001a\r\u0001\u0000\u0000\u0000\u001a\u000e"+
		"\u0001\u0000\u0000\u0000\u001a\u000f\u0001\u0000\u0000\u0000\u001a\u0011"+
		"\u0001\u0000\u0000\u0000\u001a\u0013\u0001\u0000\u0000\u0000\u001a\u0014"+
		"\u0001\u0000\u0000\u0000\u001a\u0016\u0001\u0000\u0000\u0000\u001a\u0018"+
		"\u0001\u0000\u0000\u0000\u001a\u0019\u0001\u0000\u0000\u0000\u001b\u0003"+
		"\u0001\u0000\u0000\u0000\u0002\u0007\u001a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}