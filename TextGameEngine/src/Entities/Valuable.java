package Entities;

/**
 * Entities.Food.Valuables.Valuable class - Jack Klug
 * consumable item that has a certain value
 */

public abstract class Valuable extends Consumable {
    private int value;

    public Valuable(String desc, int value){
        super(desc);
        this.value = value;
    }

}