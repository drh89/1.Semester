/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package delfinen.logic;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Niklas
 */
public class SwimmerTest {

    private CasualSwimmer swimmer;

    public SwimmerTest() {

        swimmer = new CasualSwimmer(10, "Hans", Status.PASSIVE, "Junior", true);
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

    /**
     * Test of calculatePrice method, of class CasualSwimmer.
     */
    @org.junit.Test
    public void testCalculatePrice() {
        System.out.println("calculatePrice");
        int age = 20;
        Status status = Status.PASSIVE;
        CasualSwimmer instance = swimmer;
        int expResult = 500;
        int result = instance.calculatePrice(age, status);
        assertEquals(expResult, result);

    }

}
