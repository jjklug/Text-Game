package gameplay;


import Entities.Character;
import Entities.*;

public class Player extends Character
{
    private String name;

    private int confidence;

    private Wieldable weapon;

    private Inventory inventory;

    public Player(String name,int hp, int confidence)
    {
        super(hp);
        super.setDesc("Player");
        this.name = name;
        this.hp = hp;
        this.confidence = confidence;
    }

    public String getName(){
        return name;
    }

    public void setName(String n){
        this.name = n;
    }

    public int getConfidence(){
        return confidence;
    }

    public void setConfidence(int c) {
        this.confidence = c;
    }

    /**
     * Uses the confidence and the weapons power level to determine the amt of damage that will be dealt
     * @return damage that will be dealt to enemy
     */
    public int dealAttackDamage(){
        int h = weapon.hit();
        return h + ((h*confidence)/100);
    }

    /**
     * takes the damage for the player from an enemy attack
     * also decreases confidence by half the damage value
     * @param enemy what enemy they are fighting
     * @return damage they took from the fight
     */
    public int defendAttack(Character enemy){
        int d = enemy.dealAttackDamage();
        hp -= d;
        confidence = confidence - d/2;
        return d;
    }
}
