/**
 * world class which represents the virtual world we will be exploring
 * processes input from player and controls everything that goes on in the world
 */

package gameplay;

import org.antlr.v4.runtime.Token;
import playercommand_grammar.*;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class World {
    public enum PlayMode {battle, explore;}

    Player player;
    PlayMode mode;

    //Graph gameMap = new Graph(null, null);
    ArrayList<Room> map;
    public World(ArrayList<Room> map){
        this.map = map;
    }



    //--------------------------------------------------------
    public void onEnterRoom()
    {

    }
    //--------------------------------------------------------
    public void play(Player player)
    {
        this.player = player;
        System.out.println("Welcome player " + player);

        System.out.println(player);
        this.onEnterRoom();

        boolean gameInProgress = true;
        while (gameInProgress) {
            switch (this.mode) {
                case explore:
                    //processExploreUserInput();
                    break;
                case battle:
                    //processBattleUserInput();
                    break;
            }

        }
    }
    //--------------------------------------------------------
    /**
     * processes user input during explore mode
     */
    public void processExploreUserInput(){

        //initial variables
        String command = "";
        String commandDirection;
        Token token;
        int commandIndex;
        int commandDirectionIndex = 0;
        boolean valid = false;
        PlayerCommandLexer lexer = null;
        Scanner scanner = new Scanner(System.in);

        //validates using token indices and lexer rules to make sure it is a proper command
        while(!valid) {
            commandIndex = -1;
            while (commandIndex >= 11 || commandIndex <= -1) {
                System.out.println("Enter Command(Explore Mode): ");
                String input = scanner.nextLine();
                lexer = new PlayerCommandLexer(CharStreams.fromString(input));
                token = lexer.nextToken();
                command = token.getText();
                commandIndex = token.getType();
            }

            token = lexer.nextToken();
            commandDirection = token.getText();
            commandDirectionIndex = token.getType();

            if(commandIndex == 2 || commandIndex == 5 || commandIndex == 6 || commandIndex == 8 || commandIndex == 9) {
                valid = (commandDirectionIndex == 12);
            } else if(commandIndex == 1){
                valid = (commandDirectionIndex == 13);
            } else{
                valid = true;
            }
        }

        //creates parser and parses
        PlayerCommandParser parser = new PlayerCommandParser(new CommonTokenStream(lexer));
        ParseTree tree = parser.prog();
        //uses visitor
        CommandVisitor commVisit = new CommandVisitor();
        command = commVisit.visit(tree);
        //gets command
        String commandArg = commVisit.commandArg;

        //goes through all possible commands and decides which it is

        //important
        //make individual methods for each of these cases or commands
        //
        switch (command){
            case "door":
                int commandArgDoor = Integer.parseInt(commandArg);
            case "pickup":

            case "exit":

            case "describe":

            case "admire":

            case "eat":

            case "stats":

            case "wield":

            case "open":

            case "help":

        }
    }

    /**
     * processes user input for battle mode
     */
    private void processBattleUserInput(){

        //initial variables
        String command = "";
        String commandDirection;
        Token token;
        int commandIndex;
        int commandDirectionIndex = 0;
        boolean valid = false;
        PlayerCommandLexer lexer = null;
        Scanner scanner = new Scanner(System.in);

        //validates using lexer indices to check if it is a valid rule
        while(!valid) {
            commandIndex = -1;
            while ((commandIndex != 8 && commandIndex != 10 && commandIndex != 11)) {
                System.out.println("Enter Command(Explore Mode): ");
                String input = scanner.nextLine();
                lexer = new PlayerCommandLexer(CharStreams.fromString(input));
                token = lexer.nextToken();
                command = token.getText();
                commandIndex = token.getType();
                System.out.println(command + " " + commandIndex);
            }

            token = lexer.nextToken();
            commandDirection = token.getText();
            commandDirectionIndex = token.getType();

            if(commandIndex == 8) {
                valid = (commandDirectionIndex == 12);
            } else{
                valid = true;
            }
        }

        //creates parser and parses
        PlayerCommandParser parser = new PlayerCommandParser(new CommonTokenStream(lexer));
        ParseTree tree = parser.prog();
        //uses visitor
        CommandVisitor commVisit = new CommandVisitor();
        command = commVisit.visit(tree);
        //gets command
        String commandArg = commVisit.commandArg;

        //goes through all possible commands and decides which it is

        //important
        //make individual methods for each of these cases or commands
        //
        switch (command){
            case "wield":

            case "help":

            case "attack":

        }
    }
    //--------------------------------------------------------
    //methods that correspond to proper commands


}
