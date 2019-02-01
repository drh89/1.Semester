/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import calc.MyCalculator;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Dennis
 */
public class MyCalculatorTest {
    MyCalculator calc = new MyCalculator();
    
    
    public MyCalculatorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void testAdd(){
        System.out.println("add");
        double num1 = 3;
        double num2 = 3;
        double result = calc.add(num1, num2);
        assertTrue(result == 6);
        
    }
    @Test
    public void testMinus(){
        System.out.println("minus");
        double num1 = 3;
        double num2 = 3;
        double result = calc.minus(num1, num2);
        assertTrue(result == 0);
        
    }
    @Test
    public void testDivide(){
        System.out.println("divide");
        double num1 = 3;
        double num2 = 3;
        double result = calc.divide(num1, num2);
        assertTrue(result == 1);
        assertFalse(num1 == 0 || num2 == 0);
    }
    @Test
    public void testMultiply(){
        System.out.println("multiply");
        double num1 = 3;
        double num2 = 3;
        double result = calc.multiply(num1, num2);
        assertTrue(result == 9);
        
    }
}
