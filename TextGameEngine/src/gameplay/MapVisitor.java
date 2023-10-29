package gameplay;
import java.util.ArrayList;
import gamemap_grammar.*;

public class MapVisitor extends GameMapBaseVisitor<String> {
    ArrayList<String> roomAttribs = new ArrayList<>();
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
            roomAttribs.add(ctx.ID(i+1).getText());
        }

        leftNode = ctx.ID(0).getText();
        return ctx.ID(0).getText();
    }
}
