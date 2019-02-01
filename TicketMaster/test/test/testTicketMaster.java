/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import ticketmaster.InvalidParkingTimeException;
import ticketmaster.TicketMaster;
import static ticketmaster.TicketMaster.PaymentType.CARD;
import static ticketmaster.TicketMaster.PaymentType.CASH;
import static ticketmaster.TicketMaster.Zone.BLUE;
import static ticketmaster.TicketMaster.Zone.GREEN;
import static ticketmaster.TicketMaster.Zone.RED;
import static ticketmaster.TicketMaster.Zone.YELLOW;

/**
 *
 * @author Dennis
 */
public class testTicketMaster {

    TicketMaster tm = new TicketMaster();

    public testTicketMaster() {
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
    public void testPaymentOneHourRedZone() throws InvalidParkingTimeException {

        System.out.println("testPaymentOneHourRedZone");

        double price = tm.calculatePrice(60, RED, CASH);
        assertEquals(36, price, 0);

    }

    @Test
    public void testPaymentOneAndAHalfHourRedZone() throws InvalidParkingTimeException {

        System.out.println("testPaymentOneAndAHalfHourRedZone");

        double price = tm.calculatePrice(90, RED, CASH);
        assertEquals(54, price, 0);

    }

    @Test
    public void testPaymentMethod() throws InvalidParkingTimeException {

        System.out.println("testPaymentMethod");

        double price = tm.calculatePrice(60, RED, CARD);
        assertEquals(36.5, price, 0);

    }

    @Test
    public void testPaymentOneHourGreenZone() throws InvalidParkingTimeException {

        System.out.println("testPaymentOneHourGreenZone");

        double price = tm.calculatePrice(60, GREEN, CASH);
        assertEquals(19, price, 0);

    }

    @Test
    public void testPaymentOneHourBlueZone() throws InvalidParkingTimeException {

        System.out.println("testPaymentOneHourBlueZone");

        double price = tm.calculatePrice(60, BLUE, CASH);
        assertEquals(12, price, 0);

    }

    @Test
    public void testPaymentOneHourYellowZone() throws InvalidParkingTimeException {

        System.out.println("testPaymentOneHourYellowZone");

        double price = tm.calculatePrice(60, YELLOW, CASH);
        assertEquals(9, price, 0);

    }

    @Test
    public void testPaymentTwoAndAHalfHourBlueZoneWithCard() throws InvalidParkingTimeException {

        System.out.println("testPaymentTwoAndAHalfHourBlueZoneWithCard");

        double price = tm.calculatePrice(150, BLUE, CARD);
        assertEquals(30.5, price, 0);
//         assertNotEquals(30.5, price, 0);

    }
}
