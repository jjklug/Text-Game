package Entities;



/**
 * Entities.Character class - Jack Klug
 * represents the entities that will include playable characters and monsters
 * these characters have a health value and are able to do damage as well as take it
 */

public abstract class Character extends Entity {
    private int hp;

    public Character(int hp){
        super("Character");
        this.hp = Math.max(hp,0);
    }

    public int getHp(){
        return hp;
    }

    public void setHp(int hp){
        this.hp = hp;
    }

    public abstract int dealAttackDamage();

    public abstract int defendAttack(Character enemy);
}
