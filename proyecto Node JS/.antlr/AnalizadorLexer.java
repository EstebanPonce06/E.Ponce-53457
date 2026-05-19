// Generated from c:/Users/HP/Desktop/MATERIAS DE SEGUNDO AÑO/PRIMER SEMESTRE/Sintaxis y semantica de los lenguajes/UNIDAD 4/Analizador/Analizador.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class AnalizadorLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		REPETIR=1, HASTA=2, IMPRIMIR=3, SALIR=4, VERDADERO=5, FALSO=6, LPAREN=7, 
		RPAREN=8, LLAVE_A=9, LLAVE_C=10, PUNTO_COMA=11, CADENA=12, CARACTER=13, 
		LETRA=14, DIGITO=15, SIMBOLO=16, WS=17;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"REPETIR", "HASTA", "IMPRIMIR", "SALIR", "VERDADERO", "FALSO", "LPAREN", 
			"RPAREN", "LLAVE_A", "LLAVE_C", "PUNTO_COMA", "CADENA", "CARACTER", "LETRA", 
			"DIGITO", "SIMBOLO", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'repetir'", "'hasta'", "'imprimir'", "'salir'", "'verdadero'", 
			"'falso'", "'('", "')'", "'{'", "'}'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "REPETIR", "HASTA", "IMPRIMIR", "SALIR", "VERDADERO", "FALSO", 
			"LPAREN", "RPAREN", "LLAVE_A", "LLAVE_C", "PUNTO_COMA", "CADENA", "CARACTER", 
			"LETRA", "DIGITO", "SIMBOLO", "WS"
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


	public AnalizadorLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Analizador.g4"; }

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
		"\u0004\u0000\u0011v\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b"+
		"\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0005"+
		"\u000b^\b\u000b\n\u000b\f\u000ba\t\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\f\u0001\f\u0001\f\u0003\fh\b\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u0010\u0004\u0010q\b\u0010\u000b\u0010"+
		"\f\u0010r\u0001\u0010\u0001\u0010\u0000\u0000\u0011\u0001\u0001\u0003"+
		"\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011"+
		"\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010"+
		"!\u0011\u0001\u0000\u0004\u0002\u0000AZaz\u0001\u000009\u0005\u0000!!"+
		",,..:;??\u0003\u0000\t\n\r\r  z\u0000\u0001\u0001\u0000\u0000\u0000\u0000"+
		"\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000"+
		"\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b"+
		"\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001"+
		"\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001"+
		"\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001"+
		"\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001"+
		"\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001"+
		"\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0001#\u0001\u0000\u0000"+
		"\u0000\u0003+\u0001\u0000\u0000\u0000\u00051\u0001\u0000\u0000\u0000\u0007"+
		":\u0001\u0000\u0000\u0000\t@\u0001\u0000\u0000\u0000\u000bJ\u0001\u0000"+
		"\u0000\u0000\rP\u0001\u0000\u0000\u0000\u000fR\u0001\u0000\u0000\u0000"+
		"\u0011T\u0001\u0000\u0000\u0000\u0013V\u0001\u0000\u0000\u0000\u0015X"+
		"\u0001\u0000\u0000\u0000\u0017Z\u0001\u0000\u0000\u0000\u0019g\u0001\u0000"+
		"\u0000\u0000\u001bi\u0001\u0000\u0000\u0000\u001dk\u0001\u0000\u0000\u0000"+
		"\u001fm\u0001\u0000\u0000\u0000!p\u0001\u0000\u0000\u0000#$\u0005r\u0000"+
		"\u0000$%\u0005e\u0000\u0000%&\u0005p\u0000\u0000&\'\u0005e\u0000\u0000"+
		"\'(\u0005t\u0000\u0000()\u0005i\u0000\u0000)*\u0005r\u0000\u0000*\u0002"+
		"\u0001\u0000\u0000\u0000+,\u0005h\u0000\u0000,-\u0005a\u0000\u0000-.\u0005"+
		"s\u0000\u0000./\u0005t\u0000\u0000/0\u0005a\u0000\u00000\u0004\u0001\u0000"+
		"\u0000\u000012\u0005i\u0000\u000023\u0005m\u0000\u000034\u0005p\u0000"+
		"\u000045\u0005r\u0000\u000056\u0005i\u0000\u000067\u0005m\u0000\u0000"+
		"78\u0005i\u0000\u000089\u0005r\u0000\u00009\u0006\u0001\u0000\u0000\u0000"+
		":;\u0005s\u0000\u0000;<\u0005a\u0000\u0000<=\u0005l\u0000\u0000=>\u0005"+
		"i\u0000\u0000>?\u0005r\u0000\u0000?\b\u0001\u0000\u0000\u0000@A\u0005"+
		"v\u0000\u0000AB\u0005e\u0000\u0000BC\u0005r\u0000\u0000CD\u0005d\u0000"+
		"\u0000DE\u0005a\u0000\u0000EF\u0005d\u0000\u0000FG\u0005e\u0000\u0000"+
		"GH\u0005r\u0000\u0000HI\u0005o\u0000\u0000I\n\u0001\u0000\u0000\u0000"+
		"JK\u0005f\u0000\u0000KL\u0005a\u0000\u0000LM\u0005l\u0000\u0000MN\u0005"+
		"s\u0000\u0000NO\u0005o\u0000\u0000O\f\u0001\u0000\u0000\u0000PQ\u0005"+
		"(\u0000\u0000Q\u000e\u0001\u0000\u0000\u0000RS\u0005)\u0000\u0000S\u0010"+
		"\u0001\u0000\u0000\u0000TU\u0005{\u0000\u0000U\u0012\u0001\u0000\u0000"+
		"\u0000VW\u0005}\u0000\u0000W\u0014\u0001\u0000\u0000\u0000XY\u0005;\u0000"+
		"\u0000Y\u0016\u0001\u0000\u0000\u0000Z_\u0005\"\u0000\u0000[^\u0003\u0019"+
		"\f\u0000\\^\u0005 \u0000\u0000][\u0001\u0000\u0000\u0000]\\\u0001\u0000"+
		"\u0000\u0000^a\u0001\u0000\u0000\u0000_]\u0001\u0000\u0000\u0000_`\u0001"+
		"\u0000\u0000\u0000`b\u0001\u0000\u0000\u0000a_\u0001\u0000\u0000\u0000"+
		"bc\u0005\"\u0000\u0000c\u0018\u0001\u0000\u0000\u0000dh\u0003\u001b\r"+
		"\u0000eh\u0003\u001d\u000e\u0000fh\u0003\u001f\u000f\u0000gd\u0001\u0000"+
		"\u0000\u0000ge\u0001\u0000\u0000\u0000gf\u0001\u0000\u0000\u0000h\u001a"+
		"\u0001\u0000\u0000\u0000ij\u0007\u0000\u0000\u0000j\u001c\u0001\u0000"+
		"\u0000\u0000kl\u0007\u0001\u0000\u0000l\u001e\u0001\u0000\u0000\u0000"+
		"mn\u0007\u0002\u0000\u0000n \u0001\u0000\u0000\u0000oq\u0007\u0003\u0000"+
		"\u0000po\u0001\u0000\u0000\u0000qr\u0001\u0000\u0000\u0000rp\u0001\u0000"+
		"\u0000\u0000rs\u0001\u0000\u0000\u0000st\u0001\u0000\u0000\u0000tu\u0006"+
		"\u0010\u0000\u0000u\"\u0001\u0000\u0000\u0000\u0005\u0000]_gr\u0001\u0006"+
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