// Generated from C:/Users/jackk/OneDrive/College/Fall Semester 2023/COMP711/Text-Game/TextGameEngine/src/GameMap.g4 by ANTLR 4.13.1
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
	 * Visit a parse tree produced by {@link GameMapParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(GameMapParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code gameMap}
	 * labeled alternative in {@link GameMapParser#map}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGameMap(GameMapParser.GameMapContext ctx);
	/**
	 * Visit a parse tree produced by the {@code states}
	 * labeled alternative in {@link GameMapParser#state_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStates(GameMapParser.StatesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code edges}
	 * labeled alternative in {@link GameMapParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEdges(GameMapParser.EdgesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code attributes}
	 * labeled alternative in {@link GameMapParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributes(GameMapParser.AttributesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code leftEdge}
	 * labeled alternative in {@link GameMapParser#edge_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeftEdge(GameMapParser.LeftEdgeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rightEdge}
	 * labeled alternative in {@link GameMapParser#edgeRHS}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRightEdge(GameMapParser.RightEdgeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GameMapParser#edgeop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEdgeop(GameMapParser.EdgeopContext ctx);
	/**
	 * Visit a parse tree produced by {@link GameMapParser#attr_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttr_stmt(GameMapParser.Attr_stmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nodePickups}
	 * labeled alternative in {@link GameMapParser#attr_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNodePickups(GameMapParser.NodePickupsContext ctx);
}