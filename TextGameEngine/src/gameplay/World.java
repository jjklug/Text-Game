

package gameplay;

import org.antlr.v4.runtime.Token;
import playercommand_grammar.*;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.Scanner;
import java.io.*;

public class World {
    public enum PlayMode {battle, explore;}

    Player player;
    PlayMode mode;


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

        while(!valid) {
            commandIndex = -1;
            while (commandIndex >= 11 || commandIndex <= -1) {
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

            if(commandIndex == 2 || commandIndex == 5 || commandIndex == 6 || commandIndex == 8 || commandIndex == 9) {
                valid = (commandDirectionIndex == 12);
            } else if(commandIndex == 1){
                valid = (commandDirectionIndex == 13);
            } else{
                valid = true;
            }
        }

            switch (command){
                case "door":

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

        while(!valid) {
            commandIndex = -1;
            while (commandIndex >= 11 || commandIndex <= -1) {
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

            if(commandIndex == 2 || commandIndex == 5 || commandIndex == 6 || commandIndex == 8 || commandIndex == 9) {
                valid = (commandDirectionIndex == 12);
            } else if(commandIndex == 1){
                valid = (commandDirectionIndex == 13);
            } else{
                valid = true;
            }
        }
    }
    //--------------------------------------------------------
}
