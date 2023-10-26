package gameplay;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

import Entities.*;
import Entities.Wieldables.*;
//import Entities.Valuables.*;
//import Entities.Openables.*;
//import Entities.Food.*;
import Entities.Monsters.*;
import gamemap_grammar.*;
import org.antlr.v4.runtime.CharStreams;
import org.stringtemplate.v4.debug.EvalExprEvent;
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
                GameMapVisitor gmv = new GameMapVisitor();

                String node = gmv.visit(tree);
                String node2 = gmv.rightNode;
                System.out.println(node);
                String[] roomAttribs = gmv.roomAttribs;
                System.out.println(roomAttribs);

                if(node2 != null) {
                    rooms = addConnections(node, node2, rooms);
                }else {
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


        World world = new World(rooms);

        return null;
    }

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
        if (nodeDupe = false) {
            leftRoom = new Room(node, new Inventory(), new ArrayList<Room>(), new ArrayList<Monster>());
        } else {
            leftRoom = rooms.get(nodeNum);
            rooms.remove(nodeNum);
        }
        if (node2Dupe = false) {
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

    public static ArrayList<Room> addAttributes(String node, String[] roomAttribs, ArrayList<Room> rooms) {
        int nodeNum = 0;
        for(int i = 0; i < rooms.size(); i++){
            if(rooms.get(i).getDesc().equals(node)){
                nodeNum = i;
            }
        }

        Room room = rooms.get(nodeNum);
        rooms.remove(nodeNum);

        //add pickups to room inventories
        for (int i = 0; i < roomAttribs.length; i++) {
            String attribute = roomAttribs[i];
            switch (attribute) {
                case "zombie":
                    ArrayList<Monster> newMonsters = room.getMonstersInRoom();
                    newMonsters.add(new Zombie());
                    room.setMonstersInRoom(newMonsters);
                case "axe":
            }
        }

        return rooms;
    }
}