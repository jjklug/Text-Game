// Generated from C:/Users/jackk/OneDrive/College/Fall Semester 2023/COMP711/Text-Game/TextGameEngine/src/PlayerCommand.g4 by ANTLR 4.13.1
package playercommand_grammar;
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
		OPEN=9, HELP=10, ATTACK=11, ID=12, INT=13, NEWLINE=14, WS=15, ANY=16;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"DOOR", "PICKUP", "EXIT", "DESCRIBE", "ADMIRE", "EAT", "STATS", "WIELD", 
			"OPEN", "HELP", "ATTACK", "ID", "INT", "NEWLINE", "WS", "ANY"
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
		"\u0004\u0000\u0010{\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0004\u000be\b\u000b\u000b\u000b"+
		"\f\u000bf\u0001\f\u0004\fj\b\f\u000b\f\f\fk\u0001\r\u0003\ro\b\r\u0001"+
		"\r\u0001\r\u0001\u000e\u0004\u000et\b\u000e\u000b\u000e\f\u000eu\u0001"+
		"\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0000\u0000\u0010\u0001\u0001"+
		"\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f"+
		"\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f"+
		"\u001f\u0010\u0001\u0000\u0003\u0002\u0000AZaz\u0001\u000009\u0002\u0000"+
		"\t\t  ~\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000"+
		"\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000"+
		"\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000"+
		"\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000"+
		"\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000"+
		"\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000"+
		"\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000"+
		"\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0001"+
		"!\u0001\u0000\u0000\u0000\u0003&\u0001\u0000\u0000\u0000\u0005-\u0001"+
		"\u0000\u0000\u0000\u00072\u0001\u0000\u0000\u0000\t;\u0001\u0000\u0000"+
		"\u0000\u000bB\u0001\u0000\u0000\u0000\rF\u0001\u0000\u0000\u0000\u000f"+
		"L\u0001\u0000\u0000\u0000\u0011R\u0001\u0000\u0000\u0000\u0013W\u0001"+
		"\u0000\u0000\u0000\u0015\\\u0001\u0000\u0000\u0000\u0017d\u0001\u0000"+
		"\u0000\u0000\u0019i\u0001\u0000\u0000\u0000\u001bn\u0001\u0000\u0000\u0000"+
		"\u001ds\u0001\u0000\u0000\u0000\u001fy\u0001\u0000\u0000\u0000!\"\u0005"+
		"d\u0000\u0000\"#\u0005o\u0000\u0000#$\u0005o\u0000\u0000$%\u0005r\u0000"+
		"\u0000%\u0002\u0001\u0000\u0000\u0000&\'\u0005p\u0000\u0000\'(\u0005i"+
		"\u0000\u0000()\u0005c\u0000\u0000)*\u0005k\u0000\u0000*+\u0005u\u0000"+
		"\u0000+,\u0005p\u0000\u0000,\u0004\u0001\u0000\u0000\u0000-.\u0005e\u0000"+
		"\u0000./\u0005x\u0000\u0000/0\u0005i\u0000\u000001\u0005t\u0000\u0000"+
		"1\u0006\u0001\u0000\u0000\u000023\u0005d\u0000\u000034\u0005e\u0000\u0000"+
		"45\u0005s\u0000\u000056\u0005c\u0000\u000067\u0005r\u0000\u000078\u0005"+
		"i\u0000\u000089\u0005b\u0000\u00009:\u0005e\u0000\u0000:\b\u0001\u0000"+
		"\u0000\u0000;<\u0005a\u0000\u0000<=\u0005d\u0000\u0000=>\u0005m\u0000"+
		"\u0000>?\u0005i\u0000\u0000?@\u0005r\u0000\u0000@A\u0005e\u0000\u0000"+
		"A\n\u0001\u0000\u0000\u0000BC\u0005e\u0000\u0000CD\u0005a\u0000\u0000"+
		"DE\u0005t\u0000\u0000E\f\u0001\u0000\u0000\u0000FG\u0005s\u0000\u0000"+
		"GH\u0005t\u0000\u0000HI\u0005a\u0000\u0000IJ\u0005t\u0000\u0000JK\u0005"+
		"s\u0000\u0000K\u000e\u0001\u0000\u0000\u0000LM\u0005w\u0000\u0000MN\u0005"+
		"i\u0000\u0000NO\u0005e\u0000\u0000OP\u0005l\u0000\u0000PQ\u0005d\u0000"+
		"\u0000Q\u0010\u0001\u0000\u0000\u0000RS\u0005o\u0000\u0000ST\u0005p\u0000"+
		"\u0000TU\u0005e\u0000\u0000UV\u0005n\u0000\u0000V\u0012\u0001\u0000\u0000"+
		"\u0000WX\u0005h\u0000\u0000XY\u0005e\u0000\u0000YZ\u0005l\u0000\u0000"+
		"Z[\u0005p\u0000\u0000[\u0014\u0001\u0000\u0000\u0000\\]\u0005a\u0000\u0000"+
		"]^\u0005t\u0000\u0000^_\u0005t\u0000\u0000_`\u0005a\u0000\u0000`a\u0005"+
		"c\u0000\u0000ab\u0005k\u0000\u0000b\u0016\u0001\u0000\u0000\u0000ce\u0007"+
		"\u0000\u0000\u0000dc\u0001\u0000\u0000\u0000ef\u0001\u0000\u0000\u0000"+
		"fd\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000g\u0018\u0001\u0000"+
		"\u0000\u0000hj\u0007\u0001\u0000\u0000ih\u0001\u0000\u0000\u0000jk\u0001"+
		"\u0000\u0000\u0000ki\u0001\u0000\u0000\u0000kl\u0001\u0000\u0000\u0000"+
		"l\u001a\u0001\u0000\u0000\u0000mo\u0005\r\u0000\u0000nm\u0001\u0000\u0000"+
		"\u0000no\u0001\u0000\u0000\u0000op\u0001\u0000\u0000\u0000pq\u0005\n\u0000"+
		"\u0000q\u001c\u0001\u0000\u0000\u0000rt\u0007\u0002\u0000\u0000sr\u0001"+
		"\u0000\u0000\u0000tu\u0001\u0000\u0000\u0000us\u0001\u0000\u0000\u0000"+
		"uv\u0001\u0000\u0000\u0000vw\u0001\u0000\u0000\u0000wx\u0006\u000e\u0000"+
		"\u0000x\u001e\u0001\u0000\u0000\u0000yz\t\u0000\u0000\u0000z \u0001\u0000"+
		"\u0000\u0000\u0005\u0000fknu\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}