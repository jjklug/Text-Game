package gameplay;

import Entities.*;

/**
 * gameplay.Room Class - Jack Klug
 * This class is used to represent the rooms that will make up the layout of the game
 *
 */

public class Room extends Entity {
    private boolean isFinal;

    private Room[] connectingRooms;

    private Inventory pickupsInRoom;

    private Monster[] monstersInRoom;

    public Room(){
        super(null);
        pickupsInRoom = null;
        connectingRooms = null;
        monstersInRoom = null;
    }

    public Room(String description,Inventory pickupsInRoom,
                Room[] connectingRooms){
        super(description);
        this.pickupsInRoom = pickupsInRoom;
        this.connectingRooms = connectingRooms;
        monstersInRoom = null;
    }


    public boolean getIsFinal() {
        return isFinal;
    }

    public void setIsFinal(boolean isFinal) {
        this.isFinal = isFinal;
    }

    public Room[] getConnectingRooms() {
        return connectingRooms;
    }

    public void setConnectingRooms(Room[] connectingRooms) {
        this.connectingRooms = connectingRooms;
    }

    public Inventory getPickupsInRoom() {
        return pickupsInRoom;
    }

    public void setPickupsInRoom(Inventory pickupsInRoom) {
        this.pickupsInRoom = pickupsInRoom;
    }

    public Monster[] getMonstersInRoom() {
        return this.monstersInRoom;
    }

    public void setMonstersInRoom(Monster[] monstersInRoom) {
        this.monstersInRoom = monstersInRoom;
    }
}