package gameplay;

import gamemap_grammar.*;

public class GameMapVisitor extends GameMapBaseVisitor<String> {
    String[] roomAttribs;
    String rightNode;
    public String visitLeftEdge(GameMapParser.LeftEdgeContext ctx){
         rightNode = visit(ctx.edgeRHS());
        return ctx.ID().getText();
    }

    public String visitRightEdge(GameMapParser.RightEdgeContext ctx){
        return ctx.ID().getText();
    }

    public String visitNodePickups(GameMapParser.NodePickupsContext ctx){
        for (int i = 0; i < ctx.ID().size()-1; i++){
            roomAttribs[i] = ctx.ID(i+1).getText();
        }
        return ctx.ID(0).getText();
    }
}
