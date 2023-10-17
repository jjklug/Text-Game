// Generated from C:/Users/jackk/OneDrive/College/Fall Semester 2023/COMP711/Text-Game/TextGameEngine/src/PlayerCommand.g4 by ANTLR 4.13.1
package playercommand_grammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PlayerCommandParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PlayerCommandVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PlayerCommandParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(PlayerCommandParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code doorCommand}
	 * labeled alternative in {@link PlayerCommandParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoorCommand(PlayerCommandParser.DoorCommandContext ctx);
	/**
	 * Visit a parse tree produced by the {@code pickup}
	 * labeled alternative in {@link PlayerCommandParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPickup(PlayerCommandParser.PickupContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exit}
	 * labeled alternative in {@link PlayerCommandParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExit(PlayerCommandParser.ExitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code describe}
	 * labeled alternative in {@link PlayerCommandParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescribe(PlayerCommandParser.DescribeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code admireValuable}
	 * labeled alternative in {@link PlayerCommandParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdmireValuable(PlayerCommandParser.AdmireValuableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code eatFood}
	 * labeled alternative in {@link PlayerCommandParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEatFood(PlayerCommandParser.EatFoodContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lookAtStats}
	 * labeled alternative in {@link PlayerCommandParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLookAtStats(PlayerCommandParser.LookAtStatsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code wieldWeapon}
	 * labeled alternative in {@link PlayerCommandParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWieldWeapon(PlayerCommandParser.WieldWeaponContext ctx);
	/**
	 * Visit a parse tree produced by the {@code openChest}
	 * labeled alternative in {@link PlayerCommandParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpenChest(PlayerCommandParser.OpenChestContext ctx);
	/**
	 * Visit a parse tree produced by the {@code displayHelp}
	 * labeled alternative in {@link PlayerCommandParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDisplayHelp(PlayerCommandParser.DisplayHelpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code attackMonster}
	 * labeled alternative in {@link PlayerCommandParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttackMonster(PlayerCommandParser.AttackMonsterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code newLine}
	 * labeled alternative in {@link PlayerCommandParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewLine(PlayerCommandParser.NewLineContext ctx);
}