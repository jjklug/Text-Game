// Generated from /Users/kjohnson/Archive/Teaching/2023-Teaching/COMP711/Assessments/Software Project/TextGameEngine/TextGameEngine/src/GameMap.g4 by ANTLR 4.12.0
package gamemap_grammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GameMapParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GameMapVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GameMapParser#gamemap}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGamemap(GameMapParser.GamemapContext ctx);
}