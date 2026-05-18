// Generated from c:/Users/guada/ssl-antlr-calculator/analizador/Juego.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class JuegoLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		JUEGO=1, ESCENA=2, MOSTRAR=3, LEER=4, SI=5, SALTAR=6, IGUAL=7, LLAVE_A=8, 
		LLAVE_C=9, PC=10, ID=11, INT=12, TEXTO=13, WS=14;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"JUEGO", "ESCENA", "MOSTRAR", "LEER", "SI", "SALTAR", "IGUAL", "LLAVE_A", 
			"LLAVE_C", "PC", "ID", "INT", "TEXTO", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'juego'", "'escena'", "'mostrar'", "'leer'", "'si'", "'saltar'", 
			"'=='", "'{'", "'}'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "JUEGO", "ESCENA", "MOSTRAR", "LEER", "SI", "SALTAR", "IGUAL", 
			"LLAVE_A", "LLAVE_C", "PC", "ID", "INT", "TEXTO", "WS"
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


	public JuegoLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Juego.g4"; }

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
		"\u0004\u0000\u000ef\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n"+
		"\u0001\n\u0005\nM\b\n\n\n\f\nP\t\n\u0001\u000b\u0004\u000bS\b\u000b\u000b"+
		"\u000b\f\u000bT\u0001\f\u0001\f\u0005\fY\b\f\n\f\f\f\\\t\f\u0001\f\u0001"+
		"\f\u0001\r\u0004\ra\b\r\u000b\r\f\rb\u0001\r\u0001\r\u0000\u0000\u000e"+
		"\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r"+
		"\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e"+
		"\u0001\u0000\u0005\u000e\u0000AZaz\u00c1\u00c1\u00c9\u00c9\u00cd\u00cd"+
		"\u00d1\u00d1\u00d3\u00d3\u00da\u00da\u00e1\u00e1\u00e9\u00e9\u00ed\u00ed"+
		"\u00f1\u00f1\u00f3\u00f3\u00fa\u00fa\u0010\u000009AZ__az\u00c1\u00c1\u00c9"+
		"\u00c9\u00cd\u00cd\u00d1\u00d1\u00d3\u00d3\u00da\u00da\u00e1\u00e1\u00e9"+
		"\u00e9\u00ed\u00ed\u00f1\u00f1\u00f3\u00f3\u00fa\u00fa\u0001\u000009\u0003"+
		"\u0000\n\n\r\r\"\"\u0003\u0000\t\n\r\r  i\u0000\u0001\u0001\u0000\u0000"+
		"\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000"+
		"\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000"+
		"\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000"+
		"\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000"+
		"\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000"+
		"\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000"+
		"\u001b\u0001\u0000\u0000\u0000\u0001\u001d\u0001\u0000\u0000\u0000\u0003"+
		"#\u0001\u0000\u0000\u0000\u0005*\u0001\u0000\u0000\u0000\u00072\u0001"+
		"\u0000\u0000\u0000\t7\u0001\u0000\u0000\u0000\u000b:\u0001\u0000\u0000"+
		"\u0000\rA\u0001\u0000\u0000\u0000\u000fD\u0001\u0000\u0000\u0000\u0011"+
		"F\u0001\u0000\u0000\u0000\u0013H\u0001\u0000\u0000\u0000\u0015J\u0001"+
		"\u0000\u0000\u0000\u0017R\u0001\u0000\u0000\u0000\u0019V\u0001\u0000\u0000"+
		"\u0000\u001b`\u0001\u0000\u0000\u0000\u001d\u001e\u0005j\u0000\u0000\u001e"+
		"\u001f\u0005u\u0000\u0000\u001f \u0005e\u0000\u0000 !\u0005g\u0000\u0000"+
		"!\"\u0005o\u0000\u0000\"\u0002\u0001\u0000\u0000\u0000#$\u0005e\u0000"+
		"\u0000$%\u0005s\u0000\u0000%&\u0005c\u0000\u0000&\'\u0005e\u0000\u0000"+
		"\'(\u0005n\u0000\u0000()\u0005a\u0000\u0000)\u0004\u0001\u0000\u0000\u0000"+
		"*+\u0005m\u0000\u0000+,\u0005o\u0000\u0000,-\u0005s\u0000\u0000-.\u0005"+
		"t\u0000\u0000./\u0005r\u0000\u0000/0\u0005a\u0000\u000001\u0005r\u0000"+
		"\u00001\u0006\u0001\u0000\u0000\u000023\u0005l\u0000\u000034\u0005e\u0000"+
		"\u000045\u0005e\u0000\u000056\u0005r\u0000\u00006\b\u0001\u0000\u0000"+
		"\u000078\u0005s\u0000\u000089\u0005i\u0000\u00009\n\u0001\u0000\u0000"+
		"\u0000:;\u0005s\u0000\u0000;<\u0005a\u0000\u0000<=\u0005l\u0000\u0000"+
		"=>\u0005t\u0000\u0000>?\u0005a\u0000\u0000?@\u0005r\u0000\u0000@\f\u0001"+
		"\u0000\u0000\u0000AB\u0005=\u0000\u0000BC\u0005=\u0000\u0000C\u000e\u0001"+
		"\u0000\u0000\u0000DE\u0005{\u0000\u0000E\u0010\u0001\u0000\u0000\u0000"+
		"FG\u0005}\u0000\u0000G\u0012\u0001\u0000\u0000\u0000HI\u0005;\u0000\u0000"+
		"I\u0014\u0001\u0000\u0000\u0000JN\u0007\u0000\u0000\u0000KM\u0007\u0001"+
		"\u0000\u0000LK\u0001\u0000\u0000\u0000MP\u0001\u0000\u0000\u0000NL\u0001"+
		"\u0000\u0000\u0000NO\u0001\u0000\u0000\u0000O\u0016\u0001\u0000\u0000"+
		"\u0000PN\u0001\u0000\u0000\u0000QS\u0007\u0002\u0000\u0000RQ\u0001\u0000"+
		"\u0000\u0000ST\u0001\u0000\u0000\u0000TR\u0001\u0000\u0000\u0000TU\u0001"+
		"\u0000\u0000\u0000U\u0018\u0001\u0000\u0000\u0000VZ\u0005\"\u0000\u0000"+
		"WY\b\u0003\u0000\u0000XW\u0001\u0000\u0000\u0000Y\\\u0001\u0000\u0000"+
		"\u0000ZX\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000\u0000[]\u0001\u0000"+
		"\u0000\u0000\\Z\u0001\u0000\u0000\u0000]^\u0005\"\u0000\u0000^\u001a\u0001"+
		"\u0000\u0000\u0000_a\u0007\u0004\u0000\u0000`_\u0001\u0000\u0000\u0000"+
		"ab\u0001\u0000\u0000\u0000b`\u0001\u0000\u0000\u0000bc\u0001\u0000\u0000"+
		"\u0000cd\u0001\u0000\u0000\u0000de\u0006\r\u0000\u0000e\u001c\u0001\u0000"+
		"\u0000\u0000\u0005\u0000NTZb\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}