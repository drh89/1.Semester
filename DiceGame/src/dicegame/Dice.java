/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dicegame;

import java.util.Random;

/**
 *
 * @author Dennis
 */
public class Dice {

    private Random random = new Random();
    private int value;
    private int max = 6;   //max eyes on dice
    
    //constructor

    public Dice(int max) {
        this.value = value;

    }

    /**
     * @return the value
     */
    public int getValue() {
        return value;
    }

    public void throwDice() {

        value = (random.nextInt(max) + 1); //Defines value as a random number between 0-5 (max is 6) and therefore we add with min (min is 1)

    }

}
