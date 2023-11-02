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

    Room currRoom;
    public World(ArrayList<Room> map){
        this.map = map;
        //finds first room and sets curr room to that room
        for(int i = 0; i < map.size(); i++){
            System.out.println(map.get(i).getPickupsInRoom());
            System.out.println(map.get(i).getMonstersInRoom());
            if (map.get(i).getIsFirst() == true){
                this.currRoom = map.get(i);
            }
        }
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
                //door(commandArgDoor);
            case "pickup":
                //pickup(commandArg);
            case "exit":
                exit();
            case "describe":

            case "admire":

            case "eat":

            case "stats":

            case "wield":

            case "open":

            case "help":

        }
    }

//    private void door(int doorNum){
//
//    }
//

    /**
     * exit method that prints the options for exits to the current room
     */
    private void exit(){
        System.out.println("\n You begin to search for a way out of this room...\nThe exits are labelled: ");
        for(int i = 0; i < currRoom.getConnectingRooms().size(); i++){
            if(i != currRoom.getConnectingRooms().size()-1){
                System.out.print("Door " + i+1 + ",");
            }else{
                System.out.print("Door " + i+1 + ".");
            }

        }
        System.out.println("Which will you choose?????");
        System.out.println("Enter door with the number afterwards to choose.");
    }

    /**
     * describe method gives a brief description of the room, lists pickups, and says how many doors there are
     */
    private void describe(){
        System.out.println("You are in a large scary room!\nAround you you see: " + currRoom.getPickupsInRoom());
        System.out.println("You also see " + currRoom.getConnectingRooms().size() + " doors that could be exits.");
    }

//    private void admire(String valuable){
//
//    }

//    private void eat(String food){
//
//    }

    /**
     * prints out current player stats including health, confidence, and inventory
     */
    private void stats(){
        System.out.println(player.getName() + "'s stats:");
        System.out.println("Health points: " + player.getHp());
        System.out.println("Confidence points: " + player.getConfidence());
        System.out.println("Inventory: " + player.getInventory());
    }

//    private void wieldExplore(String weapon){
//
//    }
//
//    private void open(String chest){
//
//    }

    /**
     * displays all commands for the explore mode
     */
    private void helpExplore(){
        System.out.println("List of possible commands in Explore mode(all case sensitive): ");
        System.out.println("door n - Opens door labeled n and enter the room");
        System.out.println("pickup item - Pick up an item in room and add to inventory");
        System.out.println("exit - Search room to find exit");
        System.out.println("describe - Describes the room, list pickups on the floor and number of doors\n" +
                "available");
        System.out.println("admire valuable - Admire a valuable pickup in the inventory to increase confidence.\n" +
                "The valuable may only be used once to increase confidence, but is\n" +
                "not removed from the player’s inventory");
        System.out.println("eat food - Eats a food pickup in the inventory to increase health points. Once\n" +
                "eaten, the food is removed from the player’s inventory");
        System.out.println("stats - Display player health and confidence points and inventory");
        System.out.println("wield weapon - Player wields weapon from inventory for battle");
        System.out.println("open chest - Opens a treasure or war chest in the inventory. The contents of the\n" +
                "chest is placed in the player’s inventory and the chest removed");
        System.out.println("help - Displays commands in this mode");
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
    //methods that correspond to proper battle mode commands
    private void wieldBattle(String weapon){

    }

    /**
     * displays battle mode commands
     */
    private void helpBattle(){
        System.out.println("List of possible commands in Explore mode(all case sensitive): ");
        System.out.println("attack - Attacks the monster in the room using the wielded weapon");
        System.out.println("wield weapon - Player wields weapon from inventory for battle");
        System.out.println("help - Displays commands in this mode");
    }
    private void attack(){

    }




    //other methods
//    private String searchAttributes(Room room, String attr){
//        for(int i = 0; i <= room.getpic)
//    }

}
