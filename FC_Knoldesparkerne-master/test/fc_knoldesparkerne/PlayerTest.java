package fc_knoldesparkerne;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author RODA
 */
public class PlayerTest {
    private Player p;
    
    @Before
    public void setUp() {
        p = new Player("Mini Messi", 2008);
    }

    @Test
    public void testPayment() {
        assertTrue(p.getYearsPaid().isEmpty());
        
        p.registerPayment(2016);
        p.registerPayment(2017);
        assertEquals(2, p.getYearsPaid().size());
        assertEquals(new Integer(2016), p.getYearsPaid().get(0));
        
        p.revokePayment(2016);
        assertEquals(1, p.getYearsPaid().size());
        assertEquals(new Integer(2017), p.getYearsPaid().get(0));
        
        boolean res = p.revokePayment(2016);
        assertFalse(res);
        
        p.revokePayment(2017);
        assertTrue(p.getYearsPaid().isEmpty());
    }    
    
    @Test
    public void testEquals() {
        Player p2 = new Player("Mini Messi", 2008);
        assertEquals(p2, p);
    }
}
