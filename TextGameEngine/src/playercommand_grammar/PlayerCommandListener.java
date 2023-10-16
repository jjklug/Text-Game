// Generated from C:/Users/jackk/OneDrive/College/Fall Semester 2023/COMP711/Text-Game/TextGameEngine/src/PlayerCommand.g4 by ANTLR 4.13.1
package playercommand_grammar;
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
	 * Enter a parse tree produced by the {@code doorCommand}
	 * labeled alternative in {@link PlayerCommandParser#command}.
	 * @param ctx the parse tree
	 */
	void enterDoorCommand(PlayerCommandParser.DoorCommandContext ctx);
	/**
	 * Exit a parse tree produced by the {@code doorCommand}
	 * labeled alternative in {@link PlayerCommandParser#command}.
	 * @param ctx the parse tree
	 */
	void exitDoorCommand(PlayerCommandParser.DoorCommandContext ctx);
	/**
	 * Enter a parse tree produced by the {@code pickup}
	 * labeled alternative in {@link PlayerCommandParser#command}.
	 * @param ctx the parse tree
	 */
	void enterPickup(PlayerCommandParser.PickupContext ctx);
	/**
	 * Exit a parse tree produced by the {@code pickup}
	 * labeled alternative in {@link PlayerCommandParser#command}.
	 * @param ctx the parse tree
	 */
	void exitPickup(PlayerCommandParser.PickupContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exit}
	 * labeled alternative in {@link PlayerCommandParser#command}.
	 * @param ctx the parse tree
	 */
	void enterExit(PlayerCommandParser.ExitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exit}
	 * labeled alternative in {@link PlayerCommandParser#command}.
	 * @param ctx the parse tree
	 */
	void exitExit(PlayerCommandParser.ExitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code describe}
	 * labeled alternative in {@link PlayerCommandParser#command}.
	 * @param ctx the parse tree
	 */
	void enterDescribe(PlayerCommandParser.DescribeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code describe}
	 * labeled alternative in {@link PlayerCommandParser#command}.
	 * @param ctx the parse tree
	 */
	void exitDescribe(PlayerCommandParser.DescribeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code admireValuable}
	 * labeled alternative in {@link PlayerCommandParser#command}.
	 * @param ctx the parse tree
	 */
	void enterAdmireValuable(PlayerCommandParser.AdmireValuableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code admireValuable}
	 * labeled alternative in {@link PlayerCommandParser#command}.
	 * @param ctx the parse tree
	 */
	void exitAdmireValuable(PlayerCommandParser.AdmireValuableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code eatFood}
	 * labeled alternative in {@link PlayerCommandParser#command}.
	 * @param ctx the parse tree
	 */
	void enterEatFood(PlayerCommandParser.EatFoodContext ctx);
	/**
	 * Exit a parse tree produced by the {@code eatFood}
	 * labeled alternative in {@link PlayerCommandParser#command}.
	 * @param ctx the parse tree
	 */
	void exitEatFood(PlayerCommandParser.EatFoodContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lookAtStats}
	 * labeled alternative in {@link PlayerCommandParser#command}.
	 * @param ctx the parse tree
	 */
	void enterLookAtStats(PlayerCommandParser.LookAtStatsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lookAtStats}
	 * labeled alternative in {@link PlayerCommandParser#command}.
	 * @param ctx the parse tree
	 */
	void exitLookAtStats(PlayerCommandParser.LookAtStatsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code wieldWeapon}
	 * labeled alternative in {@link PlayerCommandParser#command}.
	 * @param ctx the parse tree
	 */
	void enterWieldWeapon(PlayerCommandParser.WieldWeaponContext ctx);
	/**
	 * Exit a parse tree produced by the {@code wieldWeapon}
	 * labeled alternative in {@link PlayerCommandParser#command}.
	 * @param ctx the parse tree
	 */
	void exitWieldWeapon(PlayerCommandParser.WieldWeaponContext ctx);
	/**
	 * Enter a parse tree produced by the {@code openChest}
	 * labeled alternative in {@link PlayerCommandParser#command}.
	 * @param ctx the parse tree
	 */
	void enterOpenChest(PlayerCommandParser.OpenChestContext ctx);
	/**
	 * Exit a parse tree produced by the {@code openChest}
	 * labeled alternative in {@link PlayerCommandParser#command}.
	 * @param ctx the parse tree
	 */
	void exitOpenChest(PlayerCommandParser.OpenChestContext ctx);
	/**
	 * Enter a parse tree produced by the {@code displayHelp}
	 * labeled alternative in {@link PlayerCommandParser#command}.
	 * @param ctx the parse tree
	 */
	void enterDisplayHelp(PlayerCommandParser.DisplayHelpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code displayHelp}
	 * labeled alternative in {@link PlayerCommandParser#command}.
	 * @param ctx the parse tree
	 */
	void exitDisplayHelp(PlayerCommandParser.DisplayHelpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code attackMonster}
	 * labeled alternative in {@link PlayerCommandParser#command}.
	 * @param ctx the parse tree
	 */
	void enterAttackMonster(PlayerCommandParser.AttackMonsterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code attackMonster}
	 * labeled alternative in {@link PlayerCommandParser#command}.
	 * @param ctx the parse tree
	 */
	void exitAttackMonster(PlayerCommandParser.AttackMonsterContext ctx);
}