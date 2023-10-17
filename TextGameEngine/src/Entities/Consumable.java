package Entities;

import Entities.Pickup;

/**
 * Entities.Consumable class - Jack Klug
 * consumable class that represents entities which will be able to be usd by the player to change their status
 */
public abstract class Consumable extends Pickup {
    private boolean isConsumed;
    public Consumable(String desc){
        super(desc);
        this.consumed = false;
    }


    public boolean getIsConsumed() {
        return this.isConsumed;
    }

    public void setIsConsumed(boolean isConsumed) {
        this.isConsumed = isConsumed;
    }
}