import glarmester.data.DataAccessor;
import glarmester.data.DataAccessorDB;
import glarmester.data.DataAccessorFile;
import glarmester.data.DataAccessorHardCodedValues;
import glarmester.data.DataException;
import glarmester.data.Frame;
import java.sql.SQLException;
import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.*;

/**
 * Tests any inserted DataAccessor
 * @author RODA
 */
public class DataAccessorTest {
    private DataAccessor da;
   
    
    public DataAccessorTest() throws SQLException {
//        da = new DataAccessorFile();
        da = new DataAccessorDB();
//        da = new DataAccessorHardCodedValues();
    }
    

   
    
    @Test
    public void testGetFrames(){
        try {
            assertNotNull(da.getFrames());
            
            int expected = 3;
            int actual = da.getFrames().size();
            Assert.assertEquals(expected, actual);
        } catch (DataException ex) {
            fail(ex.getMessage());
        }
    }
    
    @Test
    public void testGetFrame(){
        try {
            assertNotNull(da.getFrame("plain"));
            
            Frame expectedFrame = new Frame("Plain", 100);
            Frame actualFrame = da.getFrame("plain");
            assertEquals(expectedFrame, actualFrame);
            
            String expectedName = "Plain";
            String actualName = da.getFrame("plain").getName();
            assertEquals(expectedName, actualName);
            
            double expectedPrice = 100.0;
            double actualPrice = da.getFrame("plain").getPrice();
            assertEquals(expectedPrice, actualPrice, 0.005);
        } catch (DataException ex) {
            fail(ex.getMessage());
        }
    }
    
    @Test
    public void negativTestGetFrame(){
        try {
            da.getFrame("NapoleonBonaparte");
            fail("Expected Exception - Bad name!");
        } catch (DataException ex) {
            // Expected
        }
        
        try {
            da.getFrame("");
            fail("Expected Exception - Empty name!");
        } catch (DataException ex) {
            // Expected
        }
        
        try {
            da.getFrame(null);
            fail("Expected Exception - Name is null!");
        } catch (DataException ex) {
            // Expected
        }
    }
    
    @Test
    public void testGetGlassPrice(){
        try {
            double expectedPrice = 300.0;
            double actualPrice = da.getGlassPrice();
            assertEquals(expectedPrice, actualPrice, 0.005);
        } catch (DataException ex) {
            fail(ex.getMessage());
        }
    }

}
