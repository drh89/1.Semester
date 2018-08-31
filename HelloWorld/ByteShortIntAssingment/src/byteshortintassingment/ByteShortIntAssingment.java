/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byteshortintassingment;

/**
 *
 * @author Dennis
 */
public class ByteShortIntAssingment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        byte myByte = 10;
        
        short myShort = 20;
        
        int myInt = 50;
        
        
        long myNewLong = 50_000L + 10L * (myByte + myShort + myInt);
                 System.out.println("Facit = " + myNewLong);
                 
        short myNewShort = (short)(1000 + 10 * (myByte + myShort + myInt));
        System.out.println("Facit = " + myNewShort);
     
       
    }
    
}
