/**
 * Food class - Jack Klug
 * class that represents food items
 */

abstract class Food extends Consumable{
    private int hp;

    public Food(int hp){
        this.hp = hp;
    }
}
