/**
 * Wieldable abstract class - Jack Klug
 * Class that represents all items that can be wielded as a weapon
 */
abstract class Wieldable extends Pickup{
    private int low;
    private int high;

    public Wieldable(int low, int high){
        this.low = low;
        this.high = high;
    }

    public int hit(){
        int damage = this.getRandom(low, high);
        while(damage >= low && damage <= high){
            damage = this.getRandom(low, high);
        }
        return damage;
    }
}