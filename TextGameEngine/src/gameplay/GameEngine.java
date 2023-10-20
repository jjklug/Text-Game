package gameplay;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import playercommand_grammar.PlayerCommandLexer;
import playercommand_grammar.PlayerCommandParser;

import java.sql.SQLOutput;
import java.util.Scanner;

public class GameEngine
{

    public static void main(String[] args) {
//        String command = "";
//        String input = "";
//        String commandDirection;
//        Token token;
//        int commandIndex;
//        int commandDirectionIndex = 0;
//        boolean valid = false;
//        PlayerCommandLexer lexer = null;
//        Scanner scanner = new Scanner(System.in);
//
//        //validates using token indices and lexer rules to make sure it is a proper command
//        while(!valid) {
//            commandIndex = -1;
//            while (commandIndex >= 11 || commandIndex <= -1) {
//                System.out.println("Enter Command(Explore Mode): ");
//                input = scanner.nextLine();
//                lexer = new PlayerCommandLexer(CharStreams.fromString(input));
//                token = lexer.nextToken();
//                command = token.getText();
//                commandIndex = token.getType();
//            }
//
//            token = lexer.nextToken();
//            commandDirection = token.getText();
//            commandDirectionIndex = token.getType();
//
//            if(commandIndex == 2 || commandIndex == 5 || commandIndex == 6 || commandIndex == 8 || commandIndex == 9) {
//                valid = (commandDirectionIndex == 12);
//            } else if(commandIndex == 1){
//                valid = (commandDirectionIndex == 13);
//            } else{
//                valid = true;
//            }
//        }
//
//        lexer = new PlayerCommandLexer(CharStreams.fromString(input));
//        PlayerCommandParser parser = new PlayerCommandParser(new CommonTokenStream(lexer));
//        ParseTree tree = parser.prog();
//
//        CommandVisitor cV = new CommandVisitor();
//        command = cV.visit(tree);
//        String commandArg = cV.commandArg;
//        System.out.println(commandArg);



        //read the World object instance from a text file or literal
        World world = ReadWorldDataFile.basicWorld("map.txt");

        //Player playerOne = new Player("Sir Kendric",100,50);
        //world.play(playerOne);
    }

}
