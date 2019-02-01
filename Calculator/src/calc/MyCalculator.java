/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calc;

import javax.swing.JTextField;



/**
 *
 * @author Dennis
 */
public class MyCalculator {
    public static void main(String[] args) {
        MyCalculator calc = new MyCalculator();
        System.out.println(calc.divide(0, 2));
        
    }
    
    public double add(double num1, double num2){
        return num1 + num2;
    }

    public double minus(double num1, double num2){
        return num1 - num2;
    }
    public double divide(double num1, double num2){
        return num1 / num2;
    }
    public double multiply(double num1, double num2){
        return num1 * num2;
    }

  
}
