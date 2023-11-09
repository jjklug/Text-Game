package gameplay;


import Entities.Character;
import Entities.*;
import Entities.Foods.Mead;
import Entities.Openables.WarChest;
import Entities.Valuables.Chalice;
import Entities.Wieldables.FistsOfFury;

public class Player extends Character
{
    private String name;

    private int confidence;

    private Wieldable weapon;

    private Inventory inventory;

    public Player(String name,int hp, int confidence)
    {
        super("Player", hp);
        this.name = name;
        this.confidence = confidence;
        this.inventory = new Inventory();
        this.inventory.add(new FistsOfFury());
        this.weapon = new FistsOfFury();

        //temp
        this.inventory.add(new Chalice());
        this.inventory.add(new Mead());
        this.inventory.add(new WarChest());
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

    public Inventory getInventory(){ return this.inventory; };

    public void setInventory(Inventory inventory){
        this.inventory = inventory;
    }

    public Wieldable getWeapon(){
        return this.weapon;
    }
    public void setWeapon(Wieldable weapon){
        this.weapon = weapon;
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
        int hp = super.getHp();
        hp -= d;
        confidence = confidence - d/2;
        return d;
    }
}
