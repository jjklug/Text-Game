// Generated from C:/Users/jackk/OneDrive/College/Fall Semester 2023/COMP711/Text-Game/TextGameEngine/src/PlayerCommand.g4 by ANTLR 4.13.1
package playercommand_grammar;
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
		OPEN=9, HELP=10, ATTACK=11, ID=12, INT=13, NEWLINE=14, WS=15, ANY=16;
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
			"WIELD", "OPEN", "HELP", "ATTACK", "ID", "INT", "NEWLINE", "WS", "ANY"
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
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
	 
		public CommandContext() { }
		public void copyFrom(CommandContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExitContext extends CommandContext {
		public TerminalNode EXIT() { return getToken(PlayerCommandParser.EXIT, 0); }
		public TerminalNode EOF() { return getToken(PlayerCommandParser.EOF, 0); }
		public TerminalNode NEWLINE() { return getToken(PlayerCommandParser.NEWLINE, 0); }
		public ExitContext(CommandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayerCommandListener ) ((PlayerCommandListener)listener).enterExit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayerCommandListener ) ((PlayerCommandListener)listener).exitExit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayerCommandVisitor ) return ((PlayerCommandVisitor<? extends T>)visitor).visitExit(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LookAtStatsContext extends CommandContext {
		public TerminalNode STATS() { return getToken(PlayerCommandParser.STATS, 0); }
		public TerminalNode EOF() { return getToken(PlayerCommandParser.EOF, 0); }
		public TerminalNode NEWLINE() { return getToken(PlayerCommandParser.NEWLINE, 0); }
		public LookAtStatsContext(CommandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayerCommandListener ) ((PlayerCommandListener)listener).enterLookAtStats(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayerCommandListener ) ((PlayerCommandListener)listener).exitLookAtStats(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayerCommandVisitor ) return ((PlayerCommandVisitor<? extends T>)visitor).visitLookAtStats(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DoorCommandContext extends CommandContext {
		public TerminalNode DOOR() { return getToken(PlayerCommandParser.DOOR, 0); }
		public TerminalNode INT() { return getToken(PlayerCommandParser.INT, 0); }
		public TerminalNode EOF() { return getToken(PlayerCommandParser.EOF, 0); }
		public TerminalNode NEWLINE() { return getToken(PlayerCommandParser.NEWLINE, 0); }
		public DoorCommandContext(CommandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayerCommandListener ) ((PlayerCommandListener)listener).enterDoorCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayerCommandListener ) ((PlayerCommandListener)listener).exitDoorCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayerCommandVisitor ) return ((PlayerCommandVisitor<? extends T>)visitor).visitDoorCommand(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AdmireValuableContext extends CommandContext {
		public TerminalNode ADMIRE() { return getToken(PlayerCommandParser.ADMIRE, 0); }
		public TerminalNode ID() { return getToken(PlayerCommandParser.ID, 0); }
		public TerminalNode EOF() { return getToken(PlayerCommandParser.EOF, 0); }
		public TerminalNode NEWLINE() { return getToken(PlayerCommandParser.NEWLINE, 0); }
		public AdmireValuableContext(CommandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayerCommandListener ) ((PlayerCommandListener)listener).enterAdmireValuable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayerCommandListener ) ((PlayerCommandListener)listener).exitAdmireValuable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayerCommandVisitor ) return ((PlayerCommandVisitor<? extends T>)visitor).visitAdmireValuable(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WieldWeaponContext extends CommandContext {
		public TerminalNode WIELD() { return getToken(PlayerCommandParser.WIELD, 0); }
		public TerminalNode ID() { return getToken(PlayerCommandParser.ID, 0); }
		public TerminalNode EOF() { return getToken(PlayerCommandParser.EOF, 0); }
		public TerminalNode NEWLINE() { return getToken(PlayerCommandParser.NEWLINE, 0); }
		public WieldWeaponContext(CommandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayerCommandListener ) ((PlayerCommandListener)listener).enterWieldWeapon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayerCommandListener ) ((PlayerCommandListener)listener).exitWieldWeapon(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayerCommandVisitor ) return ((PlayerCommandVisitor<? extends T>)visitor).visitWieldWeapon(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PickupContext extends CommandContext {
		public TerminalNode PICKUP() { return getToken(PlayerCommandParser.PICKUP, 0); }
		public TerminalNode ID() { return getToken(PlayerCommandParser.ID, 0); }
		public TerminalNode EOF() { return getToken(PlayerCommandParser.EOF, 0); }
		public TerminalNode NEWLINE() { return getToken(PlayerCommandParser.NEWLINE, 0); }
		public PickupContext(CommandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayerCommandListener ) ((PlayerCommandListener)listener).enterPickup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayerCommandListener ) ((PlayerCommandListener)listener).exitPickup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayerCommandVisitor ) return ((PlayerCommandVisitor<? extends T>)visitor).visitPickup(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EatFoodContext extends CommandContext {
		public TerminalNode EAT() { return getToken(PlayerCommandParser.EAT, 0); }
		public TerminalNode ID() { return getToken(PlayerCommandParser.ID, 0); }
		public TerminalNode EOF() { return getToken(PlayerCommandParser.EOF, 0); }
		public TerminalNode NEWLINE() { return getToken(PlayerCommandParser.NEWLINE, 0); }
		public EatFoodContext(CommandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayerCommandListener ) ((PlayerCommandListener)listener).enterEatFood(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayerCommandListener ) ((PlayerCommandListener)listener).exitEatFood(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayerCommandVisitor ) return ((PlayerCommandVisitor<? extends T>)visitor).visitEatFood(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AttackMonsterContext extends CommandContext {
		public TerminalNode ATTACK() { return getToken(PlayerCommandParser.ATTACK, 0); }
		public TerminalNode EOF() { return getToken(PlayerCommandParser.EOF, 0); }
		public TerminalNode NEWLINE() { return getToken(PlayerCommandParser.NEWLINE, 0); }
		public AttackMonsterContext(CommandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayerCommandListener ) ((PlayerCommandListener)listener).enterAttackMonster(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayerCommandListener ) ((PlayerCommandListener)listener).exitAttackMonster(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayerCommandVisitor ) return ((PlayerCommandVisitor<? extends T>)visitor).visitAttackMonster(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DisplayHelpContext extends CommandContext {
		public TerminalNode HELP() { return getToken(PlayerCommandParser.HELP, 0); }
		public TerminalNode EOF() { return getToken(PlayerCommandParser.EOF, 0); }
		public TerminalNode NEWLINE() { return getToken(PlayerCommandParser.NEWLINE, 0); }
		public DisplayHelpContext(CommandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayerCommandListener ) ((PlayerCommandListener)listener).enterDisplayHelp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayerCommandListener ) ((PlayerCommandListener)listener).exitDisplayHelp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayerCommandVisitor ) return ((PlayerCommandVisitor<? extends T>)visitor).visitDisplayHelp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DescribeContext extends CommandContext {
		public TerminalNode DESCRIBE() { return getToken(PlayerCommandParser.DESCRIBE, 0); }
		public TerminalNode EOF() { return getToken(PlayerCommandParser.EOF, 0); }
		public TerminalNode NEWLINE() { return getToken(PlayerCommandParser.NEWLINE, 0); }
		public DescribeContext(CommandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayerCommandListener ) ((PlayerCommandListener)listener).enterDescribe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayerCommandListener ) ((PlayerCommandListener)listener).exitDescribe(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayerCommandVisitor ) return ((PlayerCommandVisitor<? extends T>)visitor).visitDescribe(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OpenChestContext extends CommandContext {
		public TerminalNode OPEN() { return getToken(PlayerCommandParser.OPEN, 0); }
		public TerminalNode ID() { return getToken(PlayerCommandParser.ID, 0); }
		public TerminalNode EOF() { return getToken(PlayerCommandParser.EOF, 0); }
		public TerminalNode NEWLINE() { return getToken(PlayerCommandParser.NEWLINE, 0); }
		public OpenChestContext(CommandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayerCommandListener ) ((PlayerCommandListener)listener).enterOpenChest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayerCommandListener ) ((PlayerCommandListener)listener).exitOpenChest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayerCommandVisitor ) return ((PlayerCommandVisitor<? extends T>)visitor).visitOpenChest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_command);
		int _la;
		try {
			setState(70);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOOR:
				_localctx = new DoorCommandContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(9);
				match(DOOR);
				setState(10);
				match(INT);
				setState(12);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(11);
					match(NEWLINE);
					}
				}

				setState(14);
				match(EOF);
				}
				break;
			case PICKUP:
				_localctx = new PickupContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(15);
				match(PICKUP);
				setState(16);
				match(ID);
				setState(18);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(17);
					match(NEWLINE);
					}
				}

				setState(20);
				match(EOF);
				}
				break;
			case EXIT:
				_localctx = new ExitContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(21);
				match(EXIT);
				setState(23);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(22);
					match(NEWLINE);
					}
				}

				setState(25);
				match(EOF);
				}
				break;
			case DESCRIBE:
				_localctx = new DescribeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(26);
				match(DESCRIBE);
				setState(28);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(27);
					match(NEWLINE);
					}
				}

				setState(30);
				match(EOF);
				}
				break;
			case ADMIRE:
				_localctx = new AdmireValuableContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(31);
				match(ADMIRE);
				setState(32);
				match(ID);
				setState(34);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(33);
					match(NEWLINE);
					}
				}

				setState(36);
				match(EOF);
				}
				break;
			case EAT:
				_localctx = new EatFoodContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(37);
				match(EAT);
				setState(38);
				match(ID);
				setState(40);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(39);
					match(NEWLINE);
					}
				}

				setState(42);
				match(EOF);
				}
				break;
			case STATS:
				_localctx = new LookAtStatsContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(43);
				match(STATS);
				setState(45);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(44);
					match(NEWLINE);
					}
				}

				setState(47);
				match(EOF);
				}
				break;
			case WIELD:
				_localctx = new WieldWeaponContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(48);
				match(WIELD);
				setState(49);
				match(ID);
				setState(51);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(50);
					match(NEWLINE);
					}
				}

				setState(53);
				match(EOF);
				}
				break;
			case OPEN:
				_localctx = new OpenChestContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(54);
				match(OPEN);
				setState(55);
				match(ID);
				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(56);
					match(NEWLINE);
					}
				}

				setState(59);
				match(EOF);
				}
				break;
			case HELP:
				_localctx = new DisplayHelpContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(60);
				match(HELP);
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(61);
					match(NEWLINE);
					}
				}

				setState(64);
				match(EOF);
				}
				break;
			case ATTACK:
				_localctx = new AttackMonsterContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(65);
				match(ATTACK);
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(66);
					match(NEWLINE);
					}
				}

				setState(69);
				match(EOF);
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
		"\u0004\u0001\u0010I\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0001"+
		"\u0000\u0004\u0000\u0006\b\u0000\u000b\u0000\f\u0000\u0007\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u0001\r\b\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u0001\u0013\b\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u0001\u0018\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u0001\u001d\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u0001#\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u0001)\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		".\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"4\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		":\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001?\b\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0003\u0001D\b\u0001\u0001\u0001\u0003"+
		"\u0001G\b\u0001\u0001\u0001\u0000\u0000\u0002\u0000\u0002\u0000\u0000"+
		"\\\u0000\u0005\u0001\u0000\u0000\u0000\u0002F\u0001\u0000\u0000\u0000"+
		"\u0004\u0006\u0003\u0002\u0001\u0000\u0005\u0004\u0001\u0000\u0000\u0000"+
		"\u0006\u0007\u0001\u0000\u0000\u0000\u0007\u0005\u0001\u0000\u0000\u0000"+
		"\u0007\b\u0001\u0000\u0000\u0000\b\u0001\u0001\u0000\u0000\u0000\t\n\u0005"+
		"\u0001\u0000\u0000\n\f\u0005\r\u0000\u0000\u000b\r\u0005\u000e\u0000\u0000"+
		"\f\u000b\u0001\u0000\u0000\u0000\f\r\u0001\u0000\u0000\u0000\r\u000e\u0001"+
		"\u0000\u0000\u0000\u000eG\u0005\u0000\u0000\u0001\u000f\u0010\u0005\u0002"+
		"\u0000\u0000\u0010\u0012\u0005\f\u0000\u0000\u0011\u0013\u0005\u000e\u0000"+
		"\u0000\u0012\u0011\u0001\u0000\u0000\u0000\u0012\u0013\u0001\u0000\u0000"+
		"\u0000\u0013\u0014\u0001\u0000\u0000\u0000\u0014G\u0005\u0000\u0000\u0001"+
		"\u0015\u0017\u0005\u0003\u0000\u0000\u0016\u0018\u0005\u000e\u0000\u0000"+
		"\u0017\u0016\u0001\u0000\u0000\u0000\u0017\u0018\u0001\u0000\u0000\u0000"+
		"\u0018\u0019\u0001\u0000\u0000\u0000\u0019G\u0005\u0000\u0000\u0001\u001a"+
		"\u001c\u0005\u0004\u0000\u0000\u001b\u001d\u0005\u000e\u0000\u0000\u001c"+
		"\u001b\u0001\u0000\u0000\u0000\u001c\u001d\u0001\u0000\u0000\u0000\u001d"+
		"\u001e\u0001\u0000\u0000\u0000\u001eG\u0005\u0000\u0000\u0001\u001f \u0005"+
		"\u0005\u0000\u0000 \"\u0005\f\u0000\u0000!#\u0005\u000e\u0000\u0000\""+
		"!\u0001\u0000\u0000\u0000\"#\u0001\u0000\u0000\u0000#$\u0001\u0000\u0000"+
		"\u0000$G\u0005\u0000\u0000\u0001%&\u0005\u0006\u0000\u0000&(\u0005\f\u0000"+
		"\u0000\')\u0005\u000e\u0000\u0000(\'\u0001\u0000\u0000\u0000()\u0001\u0000"+
		"\u0000\u0000)*\u0001\u0000\u0000\u0000*G\u0005\u0000\u0000\u0001+-\u0005"+
		"\u0007\u0000\u0000,.\u0005\u000e\u0000\u0000-,\u0001\u0000\u0000\u0000"+
		"-.\u0001\u0000\u0000\u0000./\u0001\u0000\u0000\u0000/G\u0005\u0000\u0000"+
		"\u000101\u0005\b\u0000\u000013\u0005\f\u0000\u000024\u0005\u000e\u0000"+
		"\u000032\u0001\u0000\u0000\u000034\u0001\u0000\u0000\u000045\u0001\u0000"+
		"\u0000\u00005G\u0005\u0000\u0000\u000167\u0005\t\u0000\u000079\u0005\f"+
		"\u0000\u00008:\u0005\u000e\u0000\u000098\u0001\u0000\u0000\u00009:\u0001"+
		"\u0000\u0000\u0000:;\u0001\u0000\u0000\u0000;G\u0005\u0000\u0000\u0001"+
		"<>\u0005\n\u0000\u0000=?\u0005\u000e\u0000\u0000>=\u0001\u0000\u0000\u0000"+
		">?\u0001\u0000\u0000\u0000?@\u0001\u0000\u0000\u0000@G\u0005\u0000\u0000"+
		"\u0001AC\u0005\u000b\u0000\u0000BD\u0005\u000e\u0000\u0000CB\u0001\u0000"+
		"\u0000\u0000CD\u0001\u0000\u0000\u0000DE\u0001\u0000\u0000\u0000EG\u0005"+
		"\u0000\u0000\u0001F\t\u0001\u0000\u0000\u0000F\u000f\u0001\u0000\u0000"+
		"\u0000F\u0015\u0001\u0000\u0000\u0000F\u001a\u0001\u0000\u0000\u0000F"+
		"\u001f\u0001\u0000\u0000\u0000F%\u0001\u0000\u0000\u0000F+\u0001\u0000"+
		"\u0000\u0000F0\u0001\u0000\u0000\u0000F6\u0001\u0000\u0000\u0000F<\u0001"+
		"\u0000\u0000\u0000FA\u0001\u0000\u0000\u0000G\u0003\u0001\u0000\u0000"+
		"\u0000\r\u0007\f\u0012\u0017\u001c\"(-39>CF";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}