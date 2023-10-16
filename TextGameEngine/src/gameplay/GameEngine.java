package gameplay;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import playercommand_grammar.PlayerCommandLexer;
import playercommand_grammar.PlayerCommandParser;

import java.util.Scanner;

public class GameEngine
{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Command(Explore Mode): ");
        String input = scanner.nextLine();
        PlayerCommandLexer lexer = new PlayerCommandLexer(CharStreams.fromString(input));
        PlayerCommandParser parser = new PlayerCommandParser(new CommonTokenStream(lexer));
        ParseTree tree = parser.prog();
        //Token token = lexer.nextToken();

        //read the World object instance from a text file or literal
        //World world = ReadWorldDataFile.basicWorld();

        //Player playerOne = new Player("Sir Kendric",100,50);
        //world.play(playerOne);
    }

}
