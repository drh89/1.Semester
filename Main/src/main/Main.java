/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Dennis
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String myString = "This is a string";
        System.out.println("myString is equal to " + myString);
        myString = myString + ", and this is more";
              System.out.println("myString is equal to " + myString);
              myString = myString + " \u00A9 2018";
              System.out.println(myString);
              
        String numberString = "250.55";
        numberString = numberString + " 49.95";
        System.out.println("The result is " + numberString);
        
        
        //String converts int to string
        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("lastString is equal to " + lastString);

    }
    
}
