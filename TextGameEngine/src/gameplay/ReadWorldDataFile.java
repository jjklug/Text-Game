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
                System.out.println(node);
                System.out.println(node2);
                ArrayList<String> roomAttribs = mv.roomAttribs;
                System.out.println(roomAttribs);

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
            if (rooms.get(i).getDesc().equals(node2)) {
                node2Dupe = true;
                node2Num = i;
            }
        }
        //if no dupes create a whole new room for it
        if(nodeDupe == false) {
            leftRoom = new Room(node, new Inventory(), new ArrayList<Room>(), new ArrayList<Monster>());
        }else{  //othrwise remove the old room because it will be altered with new connections
            leftRoom = rooms.get(nodeNum);
            rooms.remove(nodeNum);
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

        //adds the new altered nodes to the rooms list
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

        //add pickups to room inventories

        //
        //important
        //must make cases for each possible item
        //also need to make classes for each pickup type
        for (int i = 0; i < roomAttribs.size(); i++) {
            String attribute = roomAttribs.get(i);
            ArrayList<Monster> newMonsters = new ArrayList<>();
            Inventory newPickups = new Inventory();
            switch (attribute) {
                case "zombie":
                    newMonsters.add(new Zombie());
                case "dragon":
                    newMonsters.add(new Dragon());
                case "ogre":
                    newMonsters.add(new Ogre());
                case "axe":
                    newPickups.add(new Axe());
                case "sword":
                    newPickups.add(new Sword());
                case "moneybag":
                    newPickups.add(new MoneyBag());
                case "ring":
                    newPickups.add(new Ring());
                case "chalice":
                    newPickups.add(new Chalice());
                case "coin":
                    newPickups.add(new Coin());
                case "goldbars":
                    newPickups.add(new GoldBars());
                case "jewel":
                    newPickups.add(new Jewel());
                case "mobile":
                    newPickups.add(new Mobile());
                case "mead":
                    newPickups.add(new Mead());
                case "roastboar":
                    newPickups.add(new RoastBoar());
                case "bread":
                    newPickups.add(new Bread());
                case "key":
                    newPickups.add(new Key());
                case "lockpick":
                    newPickups.add(new LockPick());
                case "start":
                    room.setIsFirst(true);
                case "finish":
                    room.setIsFinal(true);
            }
            room.setPickupsInRoom(newPickups);
            room.setMonstersInRoom(newMonsters);
        }
        rooms.add(room);
        return rooms;
    }
}