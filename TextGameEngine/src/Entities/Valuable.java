package Entities;

/**
 * Entities.Food.Valuables.Valuable class - Jack Klug
 * consumable item that has a certain value
 */

public abstract class Valuable extends Consumable {
    private int value;

    private boolean canBeUsed;

    public Valuable(String desc, int value){
        super(desc);
        this.value = value;
        this.canBeUsed = true;
    }

    public int getValue() {
        return this.value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public boolean getCanBeUsed() {
        return canBeUsed;
    }

    public void setCanBeUsed(boolean canBeUsed) {
        this.canBeUsed = canBeUsed;
    }
}