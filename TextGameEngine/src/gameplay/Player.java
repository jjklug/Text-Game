package gameplay;

public class Player
{
    private String name;

    private int health;

    private int confidence;

    private Wieldable weapon;

    private Inventory inventory;

    public Player(String name,int health,int confidence)
    {
        this.name = name;
        this.health = health;
        this.confidence = confidence;
    }

    /**
     * Uses the confidence and the weapons power level to determine the amt of damage that will be dealth
     * @return damage that will be dealt to enemy
     */
    protected int dealAttackDamage(){
        int h = weapon.hit();
        int d = h + ((h*confidence)/100);
        return d;
    }

    /**
     * takes the damage for the player from an enemy attack
     * also decreases confidence by half the damage value
     * @param enemy what enemy they are fighting
     * @return damage they took from the fight
     */
    public int defendAttack(Character enemy){
        d = enemy.dealAttackDamage();
        health -= d;
        confidence = confidence - d/2;
        return d;
    }
}
