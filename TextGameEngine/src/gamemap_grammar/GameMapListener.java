// Generated from /Users/kjohnson/Archive/Teaching/2023-Teaching/COMP711/Assessments/Software Project/TextGameEngine/TextGameEngine/src/GameMap.g4 by ANTLR 4.12.0
package gamemap_grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GameMapParser}.
 */
public interface GameMapListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GameMapParser#gamemap}.
	 * @param ctx the parse tree
	 */
	void enterGamemap(GameMapParser.GamemapContext ctx);
	/**
	 * Exit a parse tree produced by {@link GameMapParser#gamemap}.
	 * @param ctx the parse tree
	 */
	void exitGamemap(GameMapParser.GamemapContext ctx);
}