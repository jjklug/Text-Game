package Entities;

import java.util.Random;

/**
 * Entities.Entity class - Jack Klug
 * Class that builds the baseline framework for any item that will be used in the game
 * super generic that provides each entity with the most basic of attributes and functions
 */
public abstract class Entity {
    private String id;

    private String desc;

    public Entity(String desc){
        this.id = this.getClass().getSimpleName();

        this.desc = desc;
    }

    public String getDesc(){
        return desc;
    }

    public String getId(){
        return id.toLowerCase();
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    protected int getRandom(int x, int y){
        return new Random().nextInt(y-x) + x;
    }

    public boolean compareID(String newId){
        return newId.equals(this.id);
    }

    @Override
    public String toString(){
        return id;
    }
}