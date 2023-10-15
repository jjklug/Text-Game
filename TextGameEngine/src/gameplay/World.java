
package gameplay;

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

    //--------------------------------------------------------
}
