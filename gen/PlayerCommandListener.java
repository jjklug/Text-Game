// Generated from C:/Users/jackk/OneDrive/College/Fall Semester 2023/COMP711/Text-Game/TextGameEngine/src/PlayerCommand.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PlayerCommandParser}.
 */
public interface PlayerCommandListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PlayerCommandParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(PlayerCommandParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayerCommandParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(PlayerCommandParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayerCommandParser#command}.
	 * @param ctx the parse tree
	 */
	void enterCommand(PlayerCommandParser.CommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayerCommandParser#command}.
	 * @param ctx the parse tree
	 */
	void exitCommand(PlayerCommandParser.CommandContext ctx);
}