/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caveescape;

/**
 *
 * @author Dennis
 */
public class Player {
    
    private int health;
    private int attack;
    private int luck;
    private Weapon weapon;
    private Object[] inventory;
    
    public Player(int health, int attack, int luck, Weapon weapon){
        this.health = health;
        this.attack = attack;
        this.luck = luck;
        this.weapon = weapon;
        inventory = new Object[20];
    }
    
    

    /**
     * @return the health
     */
    public int getHealth() {
        return health;
    }

    /**
     * @param health the health to set
     */
    public void setHealth(int health) {
        this.health = health;
    }

    /**
     * @return the attack
     */
    public int getAttack() {
        return attack;
    }

    /**
     * @param attack the attack to set
     */
    public void setAttack(int attack) {
        this.attack = attack;
    }

    /**
     * @return the luck
     */
    public int getLuck() {
        return luck;
    }

    /**
     * @param luck the luck to set
     */
    public void setLuck(int luck) {
        this.luck = luck;
    }

    /**
     * @return the weapon
     */
    public Weapon getWeapon() {
        return weapon;
    }

    /**
     * @param weapon the weapon to set
     */
    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    /**
     * @return the inventory
     */
    public Object[] getInventory() {
        return inventory;
    }

    /**
     * @param inventory the inventory to set
     */
    public void setInventory(Object[] inventory) {
        this.inventory = inventory;
    }
    
}
