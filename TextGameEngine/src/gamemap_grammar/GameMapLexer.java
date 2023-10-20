// Generated from C:/Users/jackk/OneDrive/College/Fall Semester 2023/COMP711/Text-Game/TextGameEngine/src/GameMap.g4 by ANTLR 4.13.1
package gamemap_grammar;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class GameMapLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, CON=4, NUMBER=5, STRING=6, ID=7, NEWLINE=8, WS=9, 
		ANY=10;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "CON", "NUMBER", "DIGIT", "STRING", "ID", "LETTER", 
			"NEWLINE", "WS", "ANY"
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


	public GameMapLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "GameMap.g4"; }

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
		"\u0004\u0000\n_\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0003\u0004#\b\u0004"+
		"\u0001\u0004\u0001\u0004\u0004\u0004\'\b\u0004\u000b\u0004\f\u0004(\u0001"+
		"\u0004\u0004\u0004,\b\u0004\u000b\u0004\f\u0004-\u0001\u0004\u0001\u0004"+
		"\u0005\u00042\b\u0004\n\u0004\f\u00045\t\u0004\u0003\u00047\b\u0004\u0003"+
		"\u00049\b\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0005\u0006A\b\u0006\n\u0006\f\u0006D\t\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007K\b"+
		"\u0007\n\u0007\f\u0007N\t\u0007\u0001\b\u0001\b\u0001\t\u0003\tS\b\t\u0001"+
		"\t\u0001\t\u0001\n\u0004\nX\b\n\u000b\n\f\nY\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001B\u0000\f\u0001\u0001\u0003\u0002\u0005\u0003\u0007"+
		"\u0004\t\u0005\u000b\u0000\r\u0006\u000f\u0007\u0011\u0000\u0013\b\u0015"+
		"\t\u0017\n\u0001\u0000\u0003\u0001\u000009\u0004\u0000AZ__az\u0080\u00ff"+
		"\u0002\u0000\t\t  h\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001"+
		"\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001"+
		"\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000"+
		"\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000"+
		"\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000"+
		"\u0000\u0000\u0001\u0019\u0001\u0000\u0000\u0000\u0003\u001b\u0001\u0000"+
		"\u0000\u0000\u0005\u001d\u0001\u0000\u0000\u0000\u0007\u001f\u0001\u0000"+
		"\u0000\u0000\t\"\u0001\u0000\u0000\u0000\u000b:\u0001\u0000\u0000\u0000"+
		"\r<\u0001\u0000\u0000\u0000\u000fG\u0001\u0000\u0000\u0000\u0011O\u0001"+
		"\u0000\u0000\u0000\u0013R\u0001\u0000\u0000\u0000\u0015W\u0001\u0000\u0000"+
		"\u0000\u0017]\u0001\u0000\u0000\u0000\u0019\u001a\u0005;\u0000\u0000\u001a"+
		"\u0002\u0001\u0000\u0000\u0000\u001b\u001c\u0005=\u0000\u0000\u001c\u0004"+
		"\u0001\u0000\u0000\u0000\u001d\u001e\u0005,\u0000\u0000\u001e\u0006\u0001"+
		"\u0000\u0000\u0000\u001f \u0005-\u0000\u0000 \b\u0001\u0000\u0000\u0000"+
		"!#\u0005-\u0000\u0000\"!\u0001\u0000\u0000\u0000\"#\u0001\u0000\u0000"+
		"\u0000#8\u0001\u0000\u0000\u0000$&\u0005.\u0000\u0000%\'\u0003\u000b\u0005"+
		"\u0000&%\u0001\u0000\u0000\u0000\'(\u0001\u0000\u0000\u0000(&\u0001\u0000"+
		"\u0000\u0000()\u0001\u0000\u0000\u0000)9\u0001\u0000\u0000\u0000*,\u0003"+
		"\u000b\u0005\u0000+*\u0001\u0000\u0000\u0000,-\u0001\u0000\u0000\u0000"+
		"-+\u0001\u0000\u0000\u0000-.\u0001\u0000\u0000\u0000.6\u0001\u0000\u0000"+
		"\u0000/3\u0005.\u0000\u000002\u0003\u000b\u0005\u000010\u0001\u0000\u0000"+
		"\u000025\u0001\u0000\u0000\u000031\u0001\u0000\u0000\u000034\u0001\u0000"+
		"\u0000\u000047\u0001\u0000\u0000\u000053\u0001\u0000\u0000\u00006/\u0001"+
		"\u0000\u0000\u000067\u0001\u0000\u0000\u000079\u0001\u0000\u0000\u0000"+
		"8$\u0001\u0000\u0000\u00008+\u0001\u0000\u0000\u00009\n\u0001\u0000\u0000"+
		"\u0000:;\u0007\u0000\u0000\u0000;\f\u0001\u0000\u0000\u0000<B\u0005\""+
		"\u0000\u0000=>\u0005\\\u0000\u0000>A\u0005\"\u0000\u0000?A\t\u0000\u0000"+
		"\u0000@=\u0001\u0000\u0000\u0000@?\u0001\u0000\u0000\u0000AD\u0001\u0000"+
		"\u0000\u0000BC\u0001\u0000\u0000\u0000B@\u0001\u0000\u0000\u0000CE\u0001"+
		"\u0000\u0000\u0000DB\u0001\u0000\u0000\u0000EF\u0005\"\u0000\u0000F\u000e"+
		"\u0001\u0000\u0000\u0000GL\u0003\u0011\b\u0000HK\u0003\u0011\b\u0000I"+
		"K\u0003\u000b\u0005\u0000JH\u0001\u0000\u0000\u0000JI\u0001\u0000\u0000"+
		"\u0000KN\u0001\u0000\u0000\u0000LJ\u0001\u0000\u0000\u0000LM\u0001\u0000"+
		"\u0000\u0000M\u0010\u0001\u0000\u0000\u0000NL\u0001\u0000\u0000\u0000"+
		"OP\u0007\u0001\u0000\u0000P\u0012\u0001\u0000\u0000\u0000QS\u0005\r\u0000"+
		"\u0000RQ\u0001\u0000\u0000\u0000RS\u0001\u0000\u0000\u0000ST\u0001\u0000"+
		"\u0000\u0000TU\u0005\n\u0000\u0000U\u0014\u0001\u0000\u0000\u0000VX\u0007"+
		"\u0002\u0000\u0000WV\u0001\u0000\u0000\u0000XY\u0001\u0000\u0000\u0000"+
		"YW\u0001\u0000\u0000\u0000YZ\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000"+
		"\u0000[\\\u0006\n\u0000\u0000\\\u0016\u0001\u0000\u0000\u0000]^\t\u0000"+
		"\u0000\u0000^\u0018\u0001\u0000\u0000\u0000\r\u0000\"(-368@BJLRY\u0001"+
		"\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}