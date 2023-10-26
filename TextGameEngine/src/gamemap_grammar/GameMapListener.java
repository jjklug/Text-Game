// Generated from C:/Users/jackk/OneDrive/College/Fall Semester 2023/COMP711/Text-Game/TextGameEngine/src/GameMap.g4 by ANTLR 4.13.1
package gamemap_grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GameMapParser}.
 */
public interface GameMapListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GameMapParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(GameMapParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link GameMapParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(GameMapParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code gameMap}
	 * labeled alternative in {@link GameMapParser#map}.
	 * @param ctx the parse tree
	 */
	void enterGameMap(GameMapParser.GameMapContext ctx);
	/**
	 * Exit a parse tree produced by the {@code gameMap}
	 * labeled alternative in {@link GameMapParser#map}.
	 * @param ctx the parse tree
	 */
	void exitGameMap(GameMapParser.GameMapContext ctx);
	/**
	 * Enter a parse tree produced by the {@code states}
	 * labeled alternative in {@link GameMapParser#state_list}.
	 * @param ctx the parse tree
	 */
	void enterStates(GameMapParser.StatesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code states}
	 * labeled alternative in {@link GameMapParser#state_list}.
	 * @param ctx the parse tree
	 */
	void exitStates(GameMapParser.StatesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code edges}
	 * labeled alternative in {@link GameMapParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterEdges(GameMapParser.EdgesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code edges}
	 * labeled alternative in {@link GameMapParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitEdges(GameMapParser.EdgesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code attributes}
	 * labeled alternative in {@link GameMapParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterAttributes(GameMapParser.AttributesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code attributes}
	 * labeled alternative in {@link GameMapParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitAttributes(GameMapParser.AttributesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code leftEdge}
	 * labeled alternative in {@link GameMapParser#edge_stmt}.
	 * @param ctx the parse tree
	 */
	void enterLeftEdge(GameMapParser.LeftEdgeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code leftEdge}
	 * labeled alternative in {@link GameMapParser#edge_stmt}.
	 * @param ctx the parse tree
	 */
	void exitLeftEdge(GameMapParser.LeftEdgeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rightEdge}
	 * labeled alternative in {@link GameMapParser#edgeRHS}.
	 * @param ctx the parse tree
	 */
	void enterRightEdge(GameMapParser.RightEdgeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rightEdge}
	 * labeled alternative in {@link GameMapParser#edgeRHS}.
	 * @param ctx the parse tree
	 */
	void exitRightEdge(GameMapParser.RightEdgeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GameMapParser#edgeop}.
	 * @param ctx the parse tree
	 */
	void enterEdgeop(GameMapParser.EdgeopContext ctx);
	/**
	 * Exit a parse tree produced by {@link GameMapParser#edgeop}.
	 * @param ctx the parse tree
	 */
	void exitEdgeop(GameMapParser.EdgeopContext ctx);
	/**
	 * Enter a parse tree produced by {@link GameMapParser#attr_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAttr_stmt(GameMapParser.Attr_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GameMapParser#attr_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAttr_stmt(GameMapParser.Attr_stmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nodePickups}
	 * labeled alternative in {@link GameMapParser#attr_list}.
	 * @param ctx the parse tree
	 */
	void enterNodePickups(GameMapParser.NodePickupsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nodePickups}
	 * labeled alternative in {@link GameMapParser#attr_list}.
	 * @param ctx the parse tree
	 */
	void exitNodePickups(GameMapParser.NodePickupsContext ctx);
}