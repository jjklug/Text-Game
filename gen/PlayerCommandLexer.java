// Generated from C:/Users/jackk/OneDrive/College/Fall Semester 2023/COMP711/Text-Game/TextGameEngine/src/PlayerCommand.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class PlayerCommandLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DOOR=1, PICKUP=2, EXIT=3, DESCRIBE=4, ADMIRE=5, EAT=6, STATS=7, WIELD=8, 
		OPEN=9, HELP=10, ATTACK=11, ID=12, INT=13, NEWLINE=14, WS=15;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"DOOR", "PICKUP", "EXIT", "DESCRIBE", "ADMIRE", "EAT", "STATS", "WIELD", 
			"OPEN", "HELP", "ATTACK", "ID", "INT", "NEWLINE", "WS"
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


	public PlayerCommandLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "PlayerCommand.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u000fw\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\u000b\u0004\u000bc\b\u000b\u000b\u000b\f\u000bd\u0001\f\u0004"+
		"\fh\b\f\u000b\f\f\fi\u0001\r\u0003\rm\b\r\u0001\r\u0001\r\u0001\u000e"+
		"\u0004\u000er\b\u000e\u000b\u000e\f\u000es\u0001\u000e\u0001\u000e\u0000"+
		"\u0000\u000f\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b"+
		"\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b"+
		"\u000e\u001d\u000f\u0001\u0000\u0003\u0002\u0000AZaz\u0001\u000009\u0002"+
		"\u0000\t\t  z\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000"+
		"\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000"+
		"\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000"+
		"\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000"+
		"\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000"+
		"\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000"+
		"\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000"+
		"\u0000\u001d\u0001\u0000\u0000\u0000\u0001\u001f\u0001\u0000\u0000\u0000"+
		"\u0003$\u0001\u0000\u0000\u0000\u0005+\u0001\u0000\u0000\u0000\u00070"+
		"\u0001\u0000\u0000\u0000\t9\u0001\u0000\u0000\u0000\u000b@\u0001\u0000"+
		"\u0000\u0000\rD\u0001\u0000\u0000\u0000\u000fJ\u0001\u0000\u0000\u0000"+
		"\u0011P\u0001\u0000\u0000\u0000\u0013U\u0001\u0000\u0000\u0000\u0015Z"+
		"\u0001\u0000\u0000\u0000\u0017b\u0001\u0000\u0000\u0000\u0019g\u0001\u0000"+
		"\u0000\u0000\u001bl\u0001\u0000\u0000\u0000\u001dq\u0001\u0000\u0000\u0000"+
		"\u001f \u0005d\u0000\u0000 !\u0005o\u0000\u0000!\"\u0005o\u0000\u0000"+
		"\"#\u0005r\u0000\u0000#\u0002\u0001\u0000\u0000\u0000$%\u0005p\u0000\u0000"+
		"%&\u0005i\u0000\u0000&\'\u0005c\u0000\u0000\'(\u0005k\u0000\u0000()\u0005"+
		"u\u0000\u0000)*\u0005p\u0000\u0000*\u0004\u0001\u0000\u0000\u0000+,\u0005"+
		"e\u0000\u0000,-\u0005x\u0000\u0000-.\u0005i\u0000\u0000./\u0005t\u0000"+
		"\u0000/\u0006\u0001\u0000\u0000\u000001\u0005d\u0000\u000012\u0005e\u0000"+
		"\u000023\u0005s\u0000\u000034\u0005c\u0000\u000045\u0005r\u0000\u0000"+
		"56\u0005i\u0000\u000067\u0005b\u0000\u000078\u0005e\u0000\u00008\b\u0001"+
		"\u0000\u0000\u00009:\u0005a\u0000\u0000:;\u0005d\u0000\u0000;<\u0005m"+
		"\u0000\u0000<=\u0005i\u0000\u0000=>\u0005r\u0000\u0000>?\u0005e\u0000"+
		"\u0000?\n\u0001\u0000\u0000\u0000@A\u0005e\u0000\u0000AB\u0005a\u0000"+
		"\u0000BC\u0005t\u0000\u0000C\f\u0001\u0000\u0000\u0000DE\u0005s\u0000"+
		"\u0000EF\u0005t\u0000\u0000FG\u0005a\u0000\u0000GH\u0005t\u0000\u0000"+
		"HI\u0005s\u0000\u0000I\u000e\u0001\u0000\u0000\u0000JK\u0005w\u0000\u0000"+
		"KL\u0005i\u0000\u0000LM\u0005e\u0000\u0000MN\u0005l\u0000\u0000NO\u0005"+
		"d\u0000\u0000O\u0010\u0001\u0000\u0000\u0000PQ\u0005o\u0000\u0000QR\u0005"+
		"p\u0000\u0000RS\u0005e\u0000\u0000ST\u0005n\u0000\u0000T\u0012\u0001\u0000"+
		"\u0000\u0000UV\u0005h\u0000\u0000VW\u0005e\u0000\u0000WX\u0005l\u0000"+
		"\u0000XY\u0005p\u0000\u0000Y\u0014\u0001\u0000\u0000\u0000Z[\u0005a\u0000"+
		"\u0000[\\\u0005t\u0000\u0000\\]\u0005t\u0000\u0000]^\u0005a\u0000\u0000"+
		"^_\u0005c\u0000\u0000_`\u0005k\u0000\u0000`\u0016\u0001\u0000\u0000\u0000"+
		"ac\u0007\u0000\u0000\u0000ba\u0001\u0000\u0000\u0000cd\u0001\u0000\u0000"+
		"\u0000db\u0001\u0000\u0000\u0000de\u0001\u0000\u0000\u0000e\u0018\u0001"+
		"\u0000\u0000\u0000fh\u0007\u0001\u0000\u0000gf\u0001\u0000\u0000\u0000"+
		"hi\u0001\u0000\u0000\u0000ig\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000"+
		"\u0000j\u001a\u0001\u0000\u0000\u0000km\u0005\r\u0000\u0000lk\u0001\u0000"+
		"\u0000\u0000lm\u0001\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000no\u0005"+
		"\n\u0000\u0000o\u001c\u0001\u0000\u0000\u0000pr\u0007\u0002\u0000\u0000"+
		"qp\u0001\u0000\u0000\u0000rs\u0001\u0000\u0000\u0000sq\u0001\u0000\u0000"+
		"\u0000st\u0001\u0000\u0000\u0000tu\u0001\u0000\u0000\u0000uv\u0006\u000e"+
		"\u0000\u0000v\u001e\u0001\u0000\u0000\u0000\u0005\u0000dils\u0001\u0006"+
		"\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}