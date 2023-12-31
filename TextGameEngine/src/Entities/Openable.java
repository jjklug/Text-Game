package Entities;

/**
 * Entities.Openable class - Jack Klug
 * class that defines all entities in a room that will need to be opened before seeing or getting what is inside them
 */

public abstract class Openable extends Pickup {
    private boolean locked;
    private Pickup contents;

    public Openable(String desc, boolean locked, Pickup contents){
        super(desc);
        this.locked = locked;
        this.contents = contents;
    }

    public abstract void unlockWith(Opener pickup);

    public boolean getLocked() {
        return this.locked;
    }

    public void setLocked(boolean locked) {
        this.locked = locked;
    }

    public Pickup getContents() {
        return this.contents;
    }

    public void setContents(Pickup contents) {
        this.contents = contents;
    }
}