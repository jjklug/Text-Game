/**
 * Valuable class - Jack Klug
 * consumable item that has a certain value
 */

package consumable;

abstract class Valuable extends Consumable{
    private int value;

    public Valuable(int value){
        this.value = value;
    }

}