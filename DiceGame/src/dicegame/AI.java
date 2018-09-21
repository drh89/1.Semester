/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dicegame;

/**
 *
 * @author Dennis
 */
public class AI {
    
    private String name;
    private int turnPoints;
    private int bank;
    
    
    public AI(String name, int bank, int turnPoints){
        this.name = name;
        this.bank = bank;
        this.turnPoints = turnPoints;
        
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the turnPoints
     */
    public int getTurnPoints() {
        return turnPoints;
    }

    /**
     * @param turnPoints the turnPoints to set
     */
    public void setTurnPoints(int turnPoints) {
        this.turnPoints = turnPoints;
    }

    /**
     * @return the bank
     */
    public int getBank() {
        return bank;
    }

    /**
     * @param bank the bank to set
     */
    public void setBank(int bank) {
        this.bank = bank;
    }
    
    
    
}
