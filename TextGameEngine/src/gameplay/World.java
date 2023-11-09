/**
 * world class which represents the virtual world we will be exploring
 * processes input from player and controls everything that goes on in the world
 */

package gameplay;

import java.util.Random;
import Entities.*;
import Entities.Valuables.*;
import org.antlr.v4.runtime.Token;
import playercommand_grammar.*;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import java.io.*;

public class World {
    public enum PlayMode {battle, explore;}

    Player player;
    PlayMode mode;

    //Graph gameMap = new Graph(null, null);
    ArrayList<Room> map;

    Room currRoom;

    Room prevRoom;

    Monster currMonster;


    public World(ArrayList<Room> map){
        this.map = map;
        this.mode = PlayMode.explore;
        //finds first room and sets curr room to that room
        for(int i = 0; i < map.size(); i++){
            //test prints
            //System.out.println(map.get(i).getPickupsInRoom());
            //System.out.println(map.get(i).getMonstersInRoom());
            if (map.get(i).getIsFirst() == true){
                this.currRoom = map.get(i);
            }
        }
    }



    //--------------------------------------------------------

    /**
     * the method that will say what happens when a user enters a room
     *
     */
    public void onEnterRoom()
    {
        System.out.println("You have entered a new room!");
        int prob;
        for(int i = 0; i < currRoom.getMonstersInRoom().size(); i++){
            prob = currRoom.getMonstersInRoom().get(i).getProb();
            if(new Random().nextInt(100) < prob){
                mode = PlayMode.battle;
                currMonster = currRoom.getMonstersInRoom().get(i);
                System.out.println("A " + currMonster.getId() + " is attacking you!\nPrepare for battle!");
            }
        }
    }
    //--------------------------------------------------------
    public void play(Player player)
    {
        this.player = player;
        System.out.println("Welcome player " + player.getName() + " to this dungeon explorer game!");
        System.out.println("You will be tasked with finding your way through a maze of rooms and get to the end without dying\n" +
                "You will have to fight monsters and collect items along the way to help you on your journey!\n" +
                "Good luck adventurer!");


        this.onEnterRoom();

        boolean gameInProgress = true;
        while (gameInProgress) {
            switch (this.mode) {
                case explore:
                    processExploreUserInput();
                    break;
                case battle:
                    gameInProgress = processBattleUserInput();
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
        String commandDirection = null;
        Token token = null;
        int commandIndex;
        String input = "";
        int commandDirectionIndex = 0;
        boolean valid = false;
        PlayerCommandLexer lexer = null;
        Scanner scanner = new Scanner(System.in);

        //validates using token indices and lexer rules to make sure it is a proper command
        while(!valid) {
            commandIndex = -1;
            while (commandIndex >= 11 || commandIndex <= -1) {
                System.out.println("Enter Command(Explore Mode): ");
                input = scanner.nextLine();
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
        PlayerCommandLexer lexer2 = new PlayerCommandLexer(CharStreams.fromString(input));
        PlayerCommandParser parser = new PlayerCommandParser(new CommonTokenStream(lexer2));
        ParseTree tree = parser.prog();
        //uses visitor
        CommandVisitor commVisit = new CommandVisitor();
        command = commVisit.visit(tree);
        //gets command
        String commandArg = commVisit.commandArg;

        //goes through all possible commands and decides which it is
        switch (command){
            case "door":
                int commandArgDoor = Integer.parseInt(commandArg);
                door(commandArgDoor);
                break;
            case "pickup":
                pickup(commandArg);
                break;
            case "exit":
                exit();
                break;
            case "describe":
                describe();
                break;
            case "admire":
                admire(commandArg);
                break;
            case "eat":
                eat(commandArg);
                break;
            case "stats":
                stats();
                break;
            case "wield":
                wield(commandArg);
                break;
            case "open":
                open(commandArg);
                break;
            case "help":
                helpExplore();
                break;
        }
    }

    /**
     * door method that allows users to open and go in the next rooms
     * @param doorNum the int that represents the chosen room the user will go in next
     */
    private void door(int doorNum){
        System.out.println("You open the door to the next room...\nWhat will you find??");
        prevRoom = currRoom;
        currRoom = currRoom.getConnectingRooms().get(doorNum-1);    //returns a new room from the lit of connecting rooms
        onEnterRoom();
    }

    /**
     * pickup method that allows users to pickup things in current room
     * @param pickup string that is what the user typed in to pickup
     */
    private void pickup(String pickup){
        //setup for inventory changes
        Inventory invRoom = currRoom.getPickupsInRoom();
        Inventory invPlayer = player.getInventory();
        Pickup p = invRoom.select(pickup);
        if(p != null){
            //adds to player inv
            invPlayer.add(p);
            invRoom.remove(p);
            System.out.println("You have picked up " + pickup + " and added it to your inventory.");
            player.setInventory(invPlayer); //sets player inv to the new inv
            currRoom.setPickupsInRoom(invRoom);
        }else{
            //if pickup entered is not in room inventory
            System.out.println("You cannot pick up " + pickup + " because it is not in the room.");
        }

    }

    /**
     * exit method that prints the options for exits to the current room
     */
    private void exit(){
        System.out.println("\n You begin to search for a way out of this room...\nThe exits are labelled: ");
        for(int i = 0; i < currRoom.getConnectingRooms().size(); i++){
            if(i != currRoom.getConnectingRooms().size()-1){
                if(prevRoom != null && prevRoom == currRoom.getConnectingRooms().get(i)){
                    System.out.print("Door " + (i+1) + "(previous room), ");
                }else {
                    System.out.print("Door " + (i + 1) + ", ");
                }
            }else{
                if(prevRoom != null && prevRoom == currRoom.getConnectingRooms().get(i)){
                    System.out.print("Door " + (i+1) + "(previous room).\n");
                }else {
                    System.out.print("Door " + (i + 1) + ".\n");
                }
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

    /**
     * method that allows user to admire his loot to gain confidence points back
     * @param valuable string that the user enters in that will be an admirable valuable
     */
    private void admire(String valuable){
        //sets up new inventory
        Inventory inv = player.getInventory();
        Pickup pickup = inv.select(valuable);
        inv.remove(pickup);
        if(pickup != null && pickup instanceof Valuable && ((Valuable) pickup).getIsConsumed() == false){
            ((Valuable) pickup).setIsConsumed(true);    //changes var so the valuable cannot be consumed again
            player.setConfidence(player.getConfidence()+ ((Valuable) pickup).getValue());   //changes player confidence to new level
            System.out.println("You have admired your " + valuable + " to gain " + ((Valuable) pickup).getValue() + " Confidence points.");
            System.out.println("You now have a total of " + player.getConfidence() + " confidence points.");
            //set the players inv to the new one with the pickup that is set to already consumed
            inv.add(pickup);
            player.setInventory(inv);
        } else{
            //if the pickup is not a valuable or already admired or not in inventory
            System.out.println("You cannot admire " + valuable + "!");
            System.out.println("It might not be in your inventory or it could be already admired.");
        }
    }

    /**
     * This method will be used to allow the user to feed themselves in the game and regain health
     * @param food string that is the argument entered in by the user that will be the food that is trying to be eaten
     */
    private void eat(String food){
        //sets up new inventory
        Inventory inv = player.getInventory();
        Pickup p = inv.select(food);
        if(p != null && p instanceof Food ){
            Food f = ((Food) p);
            player.setHp(player.getHp() + f.getHp());  //sets new hp to food value + existing hp
            System.out.println("You have eaten your " + food + " to gain " + f.getHp() + " health points.");
            System.out.println("You now have a total of " + player.getHp() + " health points.");
            //new inventory without the used food becomes the player's new inventory
            inv.remove(p);
            player.setInventory(inv);
        } else{
            //if the pickup is not food or not in inventory
            System.out.println("You cannot eat " + food + "!");
            System.out.println("It might not be in your inventory.");
        }
    }

    /**
     * prints out current player stats including health, confidence, and inventory
     */
    private void stats(){
        System.out.println(player.getName() + "'s stats:");
        System.out.println("Health points: " + player.getHp());
        System.out.println("Confidence points: " + player.getConfidence());
        if(player.getInventory() != null){
            System.out.println("Inventory: " + player.getInventory());
        }else{
            System.out.println("Inventory: empty");
        }
    }

    /**
     * method to change the current weapon you are wielding while in explore mode
     * @param weapon string to represent the name of the weapon the user wants to wield
     */
    private void wield(String weapon){
        Inventory inv = player.getInventory();
        Pickup p = inv.select(weapon);
        if(p != null && p instanceof Wieldable){
            System.out.println("You were wielding your " + player.getWeapon() + ".");
            player.setWeapon((Wieldable) p);
            System.out.println("You are now wielding your " + weapon + "!");
        } else{
            //either the pickup is not a weapon or it is not in your inventory
            System.out.println("You cannot wield " + weapon + "!\n You also may not have it in your inventory.");
        }
    }

    private void open(String chest){
        //inv setup
        Inventory inv = player.getInventory();
        Pickup p = inv.select(chest);
        //make sure it has a lockpick or key to open the chest
        Pickup lockpick = inv.select("lockpick");
        Pickup key = inv.select("key");
        if(p != null && p instanceof Openable && (lockpick != null || key != null)){
            System.out.println("You opened a " + chest + " and it had a " + ((Openable) p).getContents() + " inside of it!");
            //adds chest contents and removes chest
            inv.add(((Openable) p).getContents());
            inv.remove(p);
            if(lockpick == null) {
                inv.remove(key);
                System.out.println("It used up a key to open the chest.");
            }else{
                inv.remove(lockpick);
                System.out.println("It used up a lockpick to open the chest.");
            }
            player.setInventory(inv);   //sets new inv
        }else{
            //if user input is wrong
            System.out.println("You cannot open a " + chest + ".\n You also may not have it in your inventory.");
        }
    }

    /**
     * displays all commands for the explore mode
     */
    private void helpExplore(){
        System.out.println("List of possible commands in Explore mode(all case sensitive): ");
        System.out.println("door n - Opens door labeled n and enter the room");
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("pickup item - Pick up an item in room and add to inventory");
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("exit - Search room to find exit");
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("describe - Describes the room, list pickups on the floor and number of doors\n" +
                "available");
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("admire valuable - Admire a valuable pickup in the inventory to increase confidence.\n" +
                "The valuable may only be used once to increase confidence, but is\n" +
                "not removed from the player’s inventory");
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("eat food - Eats a food pickup in the inventory to increase health points. Once\n" +
                "eaten, the food is removed from the player’s inventory");
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("stats - Display player health and confidence points and inventory");
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("wield weapon - Player wields weapon from inventory for battle");
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("open chest - Opens a treasure or war chest in the inventory. The contents of the\n" +
                "chest is placed in the player’s inventory and the chest removed");
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("help - Displays commands in this mode");
        System.out.println("--------------------------------------------------------------------------------");
    }

    /**
     * processes user input for battle mode
     */
    private boolean processBattleUserInput(){

        //initial variables
        String command = "";
        String commandDirection = null;
        Token token;
        int commandIndex;
        String input = "";
        int commandDirectionIndex = 0;
        boolean valid = false;
        PlayerCommandLexer lexer = null;
        Scanner scanner = new Scanner(System.in);

        //validates using token indices and lexer rules to make sure it is a proper command
        while(!valid) {
            commandIndex = -1;
            while (commandIndex >= 12 || commandIndex <= -1) {
                System.out.println("Enter Command(Battle Mode): ");
                input = scanner.nextLine();
                lexer = new PlayerCommandLexer(CharStreams.fromString(input));
                token = lexer.nextToken();
                command = token.getText();
                commandIndex = token.getType();
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
        PlayerCommandLexer lexer2 = new PlayerCommandLexer(CharStreams.fromString(input));
        PlayerCommandParser parser = new PlayerCommandParser(new CommonTokenStream(lexer2));
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
                wield(commandArg);
                break;
            case "help":
                helpBattle();
                break;
            case "attack":
                boolean x =  attack();
                return x;
        }
        return true;
    }
    //--------------------------------------------------------
    //methods that correspond to proper battle mode commands
    /**
     * displays battle mode commands
     */
    private void helpBattle(){
        System.out.println("List of possible commands in Explore mode(all case sensitive): ");
        System.out.println("attack - Attacks the monster in the room using the wielded weapon");
        System.out.println("wield weapon - Player wields weapon from inventory for battle");
        System.out.println("help - Displays commands in this mode");
    }

    /**
     * attack method that will simulate the user attacking a monster
     */
    private boolean attack() {
        ArrayList<Monster> m = currRoom.getMonstersInRoom();
        //attacks monster
        System.out.println("You have attacked the monster dealing " + currMonster.defendAttack(player) + " damage.");
        if(currMonster.getHp() > 0){
            System.out.println("The " + currMonster.getId() + " has " + currMonster.getHp() + " health points left.");
            System.out.println("The monster then attacked back and dealt " + player.defendAttack(currMonster) + " damage.");
            if(player.getHp() > 0){
                System.out.println("This leaves you with " + player.getHp() + " health points left.");
                System.out.println("What will you do next?");
            }else{
                //user dies
                System.out.println("You have died.");
                System.out.println("Game Over!");
                return false;
            }
        }else{
            System.out.println("You have killed the " + currMonster.getId() + "!");
            //record
            m.remove(currMonster);
            currRoom.setMonstersInRoom(m);
            mode = PlayMode.explore;
        }
        return true;
    }




    //other methods
//    private String searchAttributes(Room room, String attr){
//        for(int i = 0; i <= room.getpic)
//    }

}
