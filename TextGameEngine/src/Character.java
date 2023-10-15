/**
 * Character class - Jack Klug
 * represents the entities that will include playable characters and monsters
 * these characters have a health value and are able to do damage as well as take it
 */

abstract class Character extends Entity{
    private int hp;

    public Character(int hp){
        super(desc);
        if(hp >= 0){
            this.hp = hp;
        }
        else{
            this.hp = 0;
        }
    }

    protected abstract int dealAttackDamage();

    public abstract int defendAttack(Character enemy);
}
