package Entities;

/**
 * Entities.Openable class - Jack Klug
 * class that defines all entities in a room that will need to be opened before seeing or getting what is inside them
 */

class Openable extends Pickup {
    private boolean locked;
    private Pickup contents;

    public Openable(String desc, boolean locked, Pickup contents){
        super(desc);
        this.locked = locked;
        this.contents = contents;


    }

}