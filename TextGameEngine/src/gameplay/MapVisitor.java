package gameplay;

import gamemap_grammar.*;

public class MapVisitor extends GameMapBaseVisitor<String> {
    String[] roomAttribs;
    String rightNode;
    String leftNode;

    @Override
    public String visitLeftEdge(GameMapParser.LeftEdgeContext ctx){
        rightNode = visit(ctx.edgeRHS());
        leftNode =  ctx.ID().getText();
        return ctx.ID().getText();
    }

    @Override
    public String visitRightEdge(GameMapParser.RightEdgeContext ctx){
        return ctx.ID().getText();
    }

    @Override
    public String visitNodePickups(GameMapParser.NodePickupsContext ctx){
        for (int i = 0; i < ctx.ID().size()-1; i++){
            roomAttribs[i] = ctx.ID(i+1).getText();
        }
        return ctx.ID(0).getText();
    }
}
