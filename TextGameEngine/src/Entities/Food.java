package Entities;

import Entities.Consumable;

/**
 * Entities.Entities.Food.Entities.Entities.Food class - Jack Klug
 * class that represents food items
 */

abstract class Food extends Consumable {
    private int hp;

    public Food(String desc, int hp){
        super(desc);
        this.hp = hp;
    }

    public int getHp() {
        return this.hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
}
