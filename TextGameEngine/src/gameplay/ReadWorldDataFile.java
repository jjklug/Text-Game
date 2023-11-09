package gameplay;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

import Entities.*;
import Entities.Valuables.*;
import Entities.Openers.*;
import Entities.Foods.*;
import Entities.Monsters.*;
import Entities.Wieldables.*;
import gamemap_grammar.*;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class ReadWorldDataFile {

    /**
     * Static method to read a text file containing
     * a basic World to be played by the Game Engine
     */
    public static World basicWorld(String filename) {
        GameMapLexer lexer = null;
        ArrayList<Room> rooms = new ArrayList<Room>();
        //read a basic map from a text file and
        //use antlr to parse and construct a World object.

        try {
            //setup scanner and file io
            Scanner reader = new Scanner(new File(filename));

            //read thru lines
            while (reader.hasNextLine()) {
                String line = reader.nextLine();

                lexer = new GameMapLexer(CharStreams.fromString(line));
                GameMapParser parser = new GameMapParser(new CommonTokenStream(lexer));
                ParseTree tree = parser.prog();
                MapVisitor mv = new MapVisitor();

                //runs visitor and collects all the parsed data from that line in the file
                mv.visit(tree);
                String node = mv.leftNode;
                String node2 = mv.rightNode;

                //test print statements
                System.out.println(node);
                System.out.println(node2);
                ArrayList<String> roomAttribs = mv.roomAttribs;
                //System.out.println(roomAttribs);


                //if the line is a connection statement then add the missing connections
                if(node2 != null) {
                    rooms = addConnections(node, node2, rooms);
                }else {     //if the line is an attribute statement then add the attributes to that room
                    rooms = addAttributes(node, roomAttribs, rooms);
                }
                node2 = null;
            }
            reader.close();
        }
        //catch and print the errors that may occur
        catch (FileNotFoundException e) {
            System.out.println("File not Found!");
            e.printStackTrace();
        }

        System.out.println(rooms);
        //create the world with all of the rooms
        World world = new World(rooms);

        return world;
    }

    /**
     * add all connections for room
     * @param node  left side node for input statements
     * @param node2 right side node that the connection is being made to
     * @param rooms list of previous rooms for comparison
     * @return new list of rooms with the added connection from that line
     */
    public static ArrayList<Room> addConnections(String node, String node2, ArrayList<Room> rooms) {
        //checker for duplicates before we create new rooms to the map
        boolean nodeDupe = false;
        Room leftRoom;
        Room rightRoom;
        int nodeNum = 0;
        int node2Num = 0;
        boolean node2Dupe = false;

        //dupe checking and setting up for adding to rooms and attributes
        for (int i = 0; i < rooms.size(); i++) {
            if (rooms.get(i).getDesc().equals(node)) {
                nodeDupe = true;
                nodeNum = i;
            }
        }

        //if no dupes create a whole new room for it
        if(nodeDupe == false) {
            leftRoom = new Room(node, new Inventory(), new ArrayList<Room>(), new ArrayList<Monster>());
        }else{  //otherwise remove the old room because it will be altered with new connections
            leftRoom = rooms.get(nodeNum);
            rooms.remove(nodeNum);
        }

        for (int i = 0; i < rooms.size(); i++) {
            if (rooms.get(i).getDesc().equals(node2)) {
                node2Dupe = true;
                node2Num = i;
            }
        }
        //same thing with right side node
        if (node2Dupe == false) {
            rightRoom = new Room(node2, new Inventory(), new ArrayList<Room>(), new ArrayList<Monster>());
        } else {
            rightRoom = rooms.get(node2Num);
            rooms.remove(node2Num);
        }


        //adds new connections to their respective rooms
        ArrayList<Room> newConnectingList = leftRoom.getConnectingRooms();
        if (!leftRoom.getConnectingRooms().contains(rightRoom)) {
            newConnectingList.add(rightRoom);
            leftRoom.setConnectingRooms(newConnectingList);
        }
        newConnectingList = rightRoom.getConnectingRooms();
        if (!rightRoom.getConnectingRooms().contains(leftRoom)) {
            newConnectingList.add(leftRoom);
            rightRoom.setConnectingRooms(newConnectingList);
        }


        rooms.add(rightRoom);
        rooms.add(leftRoom);


        return rooms;
    }

    /**
     * method that adds attributes to the room's inventories including monsters, pickups and start/finish
     * @param node  left node that the lists is being defined for
     * @param roomAttribs list of attributes for the room
     * @param rooms previous list of rooms that will be changed
     * @return new changed rooms list
     */
    public static ArrayList<Room> addAttributes(String node, ArrayList<String> roomAttribs, ArrayList<Room> rooms) {
        int nodeNum = 0;
        //get current room in rooms list and remove it
        for(int i = 0; i < rooms.size(); i++){
            if(rooms.get(i).getDesc().equals(node)){
                nodeNum = i;
            }
        }
        Room room = rooms.get(nodeNum);
        rooms.remove(nodeNum);

        //should successfully initialize the room map with all the attributes to the inventories
        for (int i = 0; i < roomAttribs.size(); i++) {
            String attribute = roomAttribs.get(i);
            ArrayList<Monster> newMonsters = room.getMonstersInRoom();
            Inventory newPickups = room.getPickupsInRoom();
            switch (attribute) {
                case "zombie":
                    newMonsters.add(new Zombie());
                    break;
                case "dragon":
                    newMonsters.add(new Dragon());
                    break;
                case "ogre":
                    newMonsters.add(new Ogre());
                    break;
                case "axe":
                    newPickups.add(new Axe());
                    break;
                case "sword":
                    newPickups.add(new Sword());
                    break;
                case "moneybag":
                    newPickups.add(new MoneyBag());
                    break;
                case "ring":
                    newPickups.add(new Ring());
                    break;
                case "chalice":
                    newPickups.add(new Chalice());
                    break;
                case "coin":
                    newPickups.add(new Coin());
                    break;
                case "goldbars":
                    newPickups.add(new GoldBars());
                    break;
                case "jewel":
                    newPickups.add(new Jewel());
                    break;
                case "mobile":
                    newPickups.add(new Mobile());
                    break;
                case "mead":
                    newPickups.add(new Mead());
                    break;
                case "roastboar":
                    newPickups.add(new RoastBoar());
                    break;
                case "bread":
                    newPickups.add(new Bread());
                    break;
                case "key":
                    newPickups.add(new Key());
                    break;
                case "lockpick":
                    newPickups.add(new LockPick());
                    break;
                case "start":
                    room.setIsFirst(true);
                    break;
                case "finish":
                    room.setIsFinal(true);
                    break;
            }
            room.setPickupsInRoom(newPickups);
            room.setMonstersInRoom(newMonsters);
        }
        rooms.add(room);
        return rooms;
    }
}