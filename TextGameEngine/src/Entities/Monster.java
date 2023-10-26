package Entities;

/*
  Entities.Monster class - Jack Klug
  This class is used to represent the monsters that will appear throughout the game
  They will be able to attack the user and the user must defend against them
 */
import Entities.Character;

public class Monster extends Character {
    private int prob;
    private int damage;

    public Monster(String desc, int hp, int prob, int damage){
        super(desc, hp);
        this.prob = prob;
        this.damage = damage;
    }

    public int getDamage(){
        return damage;
    }

    public void setDamage(int damage){
        this.damage = damage;
    }

    public int getProb(){
        return prob;
    }

    public void setProb(int prob){
        this.prob = prob;
    }

    /**
     * method that is called by enemy when attacking that figures out how much damage the attack will do to the enemy
     * @return the random value plus the damage the monster does
     */
    public int dealAttackDamage(){
        int r = super.getRandom(0,10);
        return damage + r;
    }

    /**
     * Method that defends the monster from an attack, changes the hp of the monster
     * @param enemy is the character that the monster is fighting
     * @return d which is the amt of damage that the monster took
     */
    public int defendAttack(Character enemy){
        int d = enemy.dealAttackDamage();
        int hp = super.getHp();
        hp -= d;
        return d;
    }

    /**
     * determines if monster appears or not
     * @return T/F that says whether monster appears
     */
    public boolean appear(){
        if(super.getHp() == 0){
            return false;
        }
        else{
            int num = super.getRandom(0,101);
            return prob <= num;
        }
    }


}