/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

/**
 *
 * @author Dennis
 */
public class Hello {
    public static void main(String[] args){
    
        System.out.println("Hello, Dennis!");
        
        int myFirstNumber = (10 + 5) + (2 * 10);
        int mySecondNumber = 12;
        int myThirdNumber = myFirstNumber * 2;
        
        int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;
        
        int myFinal = 1000 - myTotal;
        
        System.out.println(myFinal);
                
    }
}