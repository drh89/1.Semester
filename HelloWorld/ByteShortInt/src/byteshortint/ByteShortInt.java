/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byteshortint;

/**
 *
 * @author Dennis
 */
public class ByteShortInt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // int has a width of 32
        int myMinValue = -2_147_483_648;
        int myMaxValue = 2_147_483_647;
        int myTotal = (myMinValue/2);
        System.out.println("myTotal = " +myTotal);
        
        // byte has a width of 8
        byte myByteValue = 127;
        byte myNewByteValue = (byte) (myByteValue/2); //Casting
        System.out.println("myNewByteValue = " + myNewByteValue);
        
        
        // short has a width of 16
        short myShortValue = 32767;
        
        // long has a width of 64
        long myLongValue = 100L;
        
    }  
    
}
