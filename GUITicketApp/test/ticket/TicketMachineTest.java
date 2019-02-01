package ticket;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author tm
 */
public class TicketMachineTest {

    public TicketMachineTest() {
    }

    @Test
    public void testPayOneHourRedZoneCash() {
        TicketMachine machine = new TicketMachine();
        double price = machine.calculatePrice(60, Zone.RED, Payment.CASH);
        assertEquals(36, price, 0);
    }

    @Test
    public void testPayTwoHoursRedZoneCash() {
        TicketMachine machine = new TicketMachine();
        double price = machine.calculatePrice(120, Zone.RED, Payment.CASH);
        assertEquals(72, price, 0);
    }

    @Test
    public void testPayHalfHourGreenZoneCash() {
        TicketMachine machine = new TicketMachine();
        double price = machine.calculatePrice(30, Zone.GREEN, Payment.CASH);
        assertEquals(9.5, price, 0);
    }

    @Test
    public void testPayOneHourGreenZoneCash() {
        TicketMachine machine = new TicketMachine();
        double price = machine.calculatePrice(60, Zone.GREEN, Payment.CASH);
        assertEquals(19, price, 0);
    }

    @Test
    public void testPayOneHourBlueZoneCredit() {
        TicketMachine machine = new TicketMachine();
        double price = machine.calculatePrice(60, Zone.BLUE, Payment.CARD);
        assertEquals(12.5, price, 0);
    }
    
    @Test
    public void testPayOneHalfHourYellowZoneCredit() {
        TicketMachine machine = new TicketMachine();
        double price = machine.calculatePrice(90, Zone.YELLOW, Payment.CARD);
        assertEquals(14, price, 0);
    }
}
