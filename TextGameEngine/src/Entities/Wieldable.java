package Entities;

/**
 * Entities.Wieldable abstract class - Jack Klug
 * Class that represents all items that can be wielded as a weapon
 */


public abstract class Wieldable extends Pickup {
    private int low;
    private int high;

    public Wieldable(String desc, int low, int high){
        super(desc);
        this.low = low;
        this.high = high;
    }

    public int hit(){
        int damage = this.getRandom(low, high);
        return damage;
    }
}