/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trigonometri;

import java.util.Scanner;

/**
 *
 * @author Dennis
 */
public class Trigonometri {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Trigonometri tri = new Trigonometri();
        tri.getHeight(46.0, 20.0);
        
    }
    
    
    
public void getHeight(double angleBDegrees, double lengthA){
    double angleCDegrees = 90.0;
    double radiansC = Math.toRadians(angleCDegrees);
    double angleADegrees = 180.0 - angleCDegrees - angleBDegrees;
    double radiansA = Math.toRadians(angleADegrees);
    double radianB = Math.toRadians(angleBDegrees);
    
    
    
    double sinValueA = Math.sin(radiansA);  
    double sinValueB = Math.sin(radianB); 
    double sinValueC = Math.sin(radiansC);
    
    System.out.println("højden er = " + (lengthA / sinValueA) * sinValueB);
    
    
    
    
    
}
    
}
