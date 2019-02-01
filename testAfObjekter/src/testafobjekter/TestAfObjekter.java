/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testafobjekter;

/**
 *
 * @author Dennis
 */
public class TestAfObjekter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Hund hund = new Hund("King", 7);
        System.out.println(hund.getName());
        System.out.println(hund.getAge());
        
        
        
        
        Hund hund1 = new Hund("King", 7);
        
        System.out.println(hund.equals(hund1));
            
        System.out.println(hund);
        
    }
    
}
