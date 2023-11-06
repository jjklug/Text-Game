package gameplay;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import playercommand_grammar.PlayerCommandLexer;
import playercommand_grammar.PlayerCommandParser;
import gamemap_grammar.*;

import java.sql.SQLOutput;
import java.util.Scanner;

public class GameEngine
{

    public static void main(String[] args) {

        //read the World object instance from a text file or literal
        World world = ReadWorldDataFile.basicWorld("map.txt");

        Player playerOne = new Player("Sir Kendric",100,50);
        //world.play(playerOne);
    }

}
