package gameplay;

import java.io.*;
import java.util.Scanner;

import gameplay.World;

public class ReadWorldDataFile
{

/**
 * Static method to read a text file containing
 * a basic World to be played by the Game Engine
 *
 * */
    public static World basicWorld()
    {
        //read a basic map from a text file and
        //use antlr to parse and construct a World object.

        try {
            //setup scanner and file io
            File mapFile = new File("map1.txt");
            Scanner reader = new Scanner(mapFile);

            //read thru lines
            while(reader.hasNextLine()){
                String line = reader.nextLine();

            }
        }
        //catch and print the errors that may occur
        catch(FileNotFoundException e){
            System.out.println("File not Found!");
            e.printStackTrace();
        }

        return null;
    }


}
