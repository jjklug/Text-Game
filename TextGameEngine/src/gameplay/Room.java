/**
 * Room Class - Jack Klug
 * This class is used to represent the rooms that will make up the layout of the game
 *
 */

package gameplay;

class Room{
    private boolean isFinal;

    private Room[] connectingRooms;

    private Inventory pickupsInRoom;

    public Room(){
        description = null;
        pickupsInRoom = null;
        connectingRooms = null;
    }

    public Room(String description,Inventory pickupsInRoom,
                Room[] connectingRooms){
        this.description = description;
        this.pickupsInRoom = pickupsInRoom;

    }
}