

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
    private void processExploreUserInput(){
        enum ExploreCommands {door, pickup, exit, describe, admire, eat, stats, wield, open, help;}
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Command(Explore Mode): ");
        String input = scanner.nextLine();
        PlayerCommandLexer lexer = new PlayerCommandLexer(CharStreams.fromString(input));
        PlayerCommandParser parser = new PlayerCommandParser(new CommonTokenStream(lexer));
        Token token = lexer.nextToken();



        switch (this.

    }

    private void processBattleUserInput(){

    }
    //--------------------------------------------------------
}
