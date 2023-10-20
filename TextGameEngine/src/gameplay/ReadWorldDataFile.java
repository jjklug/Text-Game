package gameplay;

import java.io.*;
import java.util.Scanner;

import Entities.Monster;
import gamemap_grammar.GameMapLexer;
import gamemap_grammar.GameMapParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class ReadWorldDataFile
{

/**
 * Static method to read a text file containing
 * a basic World to be played by the Game Engine
 *
 * */
    public static World basicWorld(String filename)
    {
        GameMapLexer lexer = null;
        Room[] rooms = null;
        //read a basic map from a text file and
        //use antlr to parse and construct a World object.

        try {
            //setup scanner and file io
            Scanner reader = new Scanner(new File(filename));

            //read thru lines
            while(reader.hasNextLine()){
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

                //checker for duplicates before we create new rooms to the map
                for(int i = 0; i < rooms.length; i++){
                    if(!rooms[i].getDesc().equals(node)){
                        Room newRoom = new Room(node, new Inventory(), new Room[], new Monster[]);
                    }
                    if(!rooms[i].getDesc().equals(node2)){
                        Room newRoom = new Room(node2, new Inventory(), new Room[], new Monster[]);
                    }
                }

                //
            }
            reader.close();
        }
        //catch and print the errors that may occur
        catch(FileNotFoundException e){
            System.out.println("File not Found!");
            e.printStackTrace();
        }
        

        World world = new World(rooms);

        return null;
    }


}
