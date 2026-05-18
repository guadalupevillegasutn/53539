// Generated from c:/Users/guada/ssl-antlr-calculator/analizador/Juego.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JuegoParser}.
 */
public interface JuegoListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JuegoParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(JuegoParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuegoParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(JuegoParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuegoParser#juego}.
	 * @param ctx the parse tree
	 */
	void enterJuego(JuegoParser.JuegoContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuegoParser#juego}.
	 * @param ctx the parse tree
	 */
	void exitJuego(JuegoParser.JuegoContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuegoParser#escenas}.
	 * @param ctx the parse tree
	 */
	void enterEscenas(JuegoParser.EscenasContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuegoParser#escenas}.
	 * @param ctx the parse tree
	 */
	void exitEscenas(JuegoParser.EscenasContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuegoParser#escena}.
	 * @param ctx the parse tree
	 */
	void enterEscena(JuegoParser.EscenaContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuegoParser#escena}.
	 * @param ctx the parse tree
	 */
	void exitEscena(JuegoParser.EscenaContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuegoParser#acciones}.
	 * @param ctx the parse tree
	 */
	void enterAcciones(JuegoParser.AccionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuegoParser#acciones}.
	 * @param ctx the parse tree
	 */
	void exitAcciones(JuegoParser.AccionesContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuegoParser#imprimir}.
	 * @param ctx the parse tree
	 */
	void enterImprimir(JuegoParser.ImprimirContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuegoParser#imprimir}.
	 * @param ctx the parse tree
	 */
	void exitImprimir(JuegoParser.ImprimirContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuegoParser#leer}.
	 * @param ctx the parse tree
	 */
	void enterLeer(JuegoParser.LeerContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuegoParser#leer}.
	 * @param ctx the parse tree
	 */
	void exitLeer(JuegoParser.LeerContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuegoParser#condicion}.
	 * @param ctx the parse tree
	 */
	void enterCondicion(JuegoParser.CondicionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuegoParser#condicion}.
	 * @param ctx the parse tree
	 */
	void exitCondicion(JuegoParser.CondicionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuegoParser#comparacion}.
	 * @param ctx the parse tree
	 */
	void enterComparacion(JuegoParser.ComparacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuegoParser#comparacion}.
	 * @param ctx the parse tree
	 */
	void exitComparacion(JuegoParser.ComparacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuegoParser#saltarAct}.
	 * @param ctx the parse tree
	 */
	void enterSaltarAct(JuegoParser.SaltarActContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuegoParser#saltarAct}.
	 * @param ctx the parse tree
	 */
	void exitSaltarAct(JuegoParser.SaltarActContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuegoParser#nombre}.
	 * @param ctx the parse tree
	 */
	void enterNombre(JuegoParser.NombreContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuegoParser#nombre}.
	 * @param ctx the parse tree
	 */
	void exitNombre(JuegoParser.NombreContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuegoParser#valor}.
	 * @param ctx the parse tree
	 */
	void enterValor(JuegoParser.ValorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuegoParser#valor}.
	 * @param ctx the parse tree
	 */
	void exitValor(JuegoParser.ValorContext ctx);
}