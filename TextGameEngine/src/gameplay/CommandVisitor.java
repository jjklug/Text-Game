package gameplay;
import playercommand_grammar.*;

public class CommandVisitor extends PlayerCommandBaseVisitor<String>{
    String commandArg;

    @Override
    public String visitDoorCommand(PlayerCommandParser.DoorCommandContext ctx){
        commandArg = ctx.INT().getText();
        return ctx.DOOR().getText();
    }

    @Override
    public String visitPickup(PlayerCommandParser.PickupContext ctx){
        commandArg = ctx.ID().getText();
        return ctx.PICKUP().getText();
    }

    @Override
    public String visitExit(PlayerCommandParser.ExitContext ctx){
        return ctx.EXIT().getText();
    }

    @Override
    public String visitDescribe(PlayerCommandParser.DescribeContext ctx){

        return ctx.DESCRIBE().getText();
    }

    @Override
    public String visitAdmireValuable(PlayerCommandParser.AdmireValuableContext ctx){
        commandArg = ctx.ID().getText();
        return ctx.ADMIRE().getText();
    }

    @Override
    public String visitEatFood(PlayerCommandParser.EatFoodContext ctx){
        commandArg = ctx.ID().getText();
        return ctx.EAT().getText();
    }

    @Override
    public String visitLookAtStats(PlayerCommandParser.LookAtStatsContext ctx){
        return ctx.STATS().getText();
    }

    @Override
    public String visitWieldWeapon(PlayerCommandParser.WieldWeaponContext ctx){
        commandArg = ctx.ID().getText();
        return ctx.WIELD().getText();
    }

    @Override
    public String visitOpenChest(PlayerCommandParser.OpenChestContext ctx){
        commandArg = ctx.ID().getText();
        return ctx.OPEN().getText();
    }

    @Override
    public String visitDisplayHelp(PlayerCommandParser.DisplayHelpContext ctx){
        return ctx.HELP().getText();
    }

    @Override
    public String visitAttackMonster(PlayerCommandParser.AttackMonsterContext ctx){
        return ctx.ATTACK().getText();
    }
}
