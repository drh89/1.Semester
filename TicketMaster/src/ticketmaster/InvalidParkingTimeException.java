/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticketmaster;

/**
 *
 * @author Dennis
 */
public class InvalidParkingTimeException extends Exception {
    
    public InvalidParkingTimeException(){
        System.out.println("Parkeringstiden skal kunne deles med 30 min.");
    }
    
}
