package gameplay;

import Entities.*;

import java.util.ArrayList;

/**
 * gameplay.Room Class - Jack Klug
 * This class is used to represent the rooms that will make up the layout of the game
 *
 */

public class Room extends Entity {
    private boolean isFinal;

    private ArrayList<Room> connectingRooms;

    private Inventory pickupsInRoom;

    private ArrayList<Monster> monstersInRoom;

    public Room(){
        super(null);
        pickupsInRoom = null;
        connectingRooms = null;
        monstersInRoom = null;
    }

    public Room(String description,Inventory pickupsInRoom,
                ArrayList<Room> connectingRooms, ArrayList<Monster> monstersInRoom){
        super(description);
        this.pickupsInRoom = pickupsInRoom;
        this.connectingRooms = connectingRooms;
        this.monstersInRoom = monstersInRoom;
    }


    public boolean getIsFinal() {
        return isFinal;
    }

    public void setIsFinal(boolean isFinal) {
        this.isFinal = isFinal;
    }

    public ArrayList<Room> getConnectingRooms() {
        return connectingRooms;
    }

    public void setConnectingRooms(ArrayList<Room> connectingRooms) {
        this.connectingRooms = connectingRooms;
    }

    public Inventory getPickupsInRoom() {
        return pickupsInRoom;
    }

    public void setPickupsInRoom(Inventory pickupsInRoom) {
        this.pickupsInRoom = pickupsInRoom;
    }

    public ArrayList<Monster> getMonstersInRoom() {
        return this.monstersInRoom;
    }

    public void setMonstersInRoom(ArrayList<Monster> monstersInRoom) {
        this.monstersInRoom = monstersInRoom;
    }

}