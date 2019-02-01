/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testController;

import glarmester.data.DataAccessor;
import glarmester.data.DataAccessorDB;
import glarmester.data.DataAccessorFile;
import glarmester.data.DataAccessorHardCodedValues;
import glarmester.logic.Controller;
import glarmester.logic.ControllerImpl;

import glarmester.logic.PriceCalculator;
import java.sql.SQLException;
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
public class ControllerTest {

    ControllerImpl c;

    // Test controller with any DataAccessor
    public ControllerTest() throws SQLException {
        DataAccessor data = new DataAccessorDB();
//        DataAccessor data = new DataAccessorHardCodedValues();

        PriceCalculator logic = new PriceCalculator();

        c = new ControllerImpl(data, logic);

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
    public void testGetFrameNames() {

        assertNotNull(c.getFrameNames());

        String expectedName = "Plain";
        String actualName = c.getFrameNames().get(0);
        assertEquals(expectedName, actualName);
//        assertNotEquals(expectedName, actualName);

        expectedName = "Ornate";
        actualName = c.getFrameNames().get(1);
        assertEquals(expectedName, actualName);
//        assertNotEquals(expectedName, actualName);

        expectedName = "Lavish";
        actualName = c.getFrameNames().get(2);
        assertEquals(expectedName, actualName);
//        assertNotEquals(expectedName, actualName);

    }

    @Test
    public void testGetTotalPrice() {

        double expectedPrice = 2000;
        double actualPrice = c.getTotalPrice(200, 200, "Plain");
        assertEquals(expectedPrice, actualPrice, 0);
//        assertNotEquals(expectedPrice, actualPrice);

        expectedPrice = 12375;
        actualPrice = c.getTotalPrice(450, 450, "Lavish");
        assertEquals(expectedPrice, actualPrice, 0);
//        assertNotEquals(expectedPrice, actualPrice);

    }

}
