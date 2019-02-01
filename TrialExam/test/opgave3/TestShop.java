package opgave3;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestShop {

    private ShopInterface shop = new Shop();

    @Test
    public void testCreateValidCustomer() {
        //Act
        Customer c = shop.makeCustomer("Tiiine", "tm@cphbusiness.dk");

        //Assert
        assertNotNull(c);
        assertEquals("Tiiine", c.getName());
        assertEquals("tm@cphbusiness.dk", c.getEmail());
    }

    @Test
    public void testCreateInValidCustomer() {
        //Act
        Customer c = shop.makeCustomer("", "");

        //Assert
        assertNull(c);
    }

    @Test
    public void testCreateInvalidSale() {
        //Act 
        Sale s = shop.makeSale("", 0, -1);

        //Assert
        assertNull(s);
    }

    @Test
    public void testCreateSaleWithQtyOfOne() {
        //Act
        Sale s = shop.makeSale("Milk", 10.5, 1);

        //Assert
        assertEquals("Milk", s.getDescription());
        assertEquals(10.5, s.getTotal(), 0);
    }

    @Test
    public void testCreateSaleWithQtyOfTwo() {
        //Act
        Sale s = shop.makeSale("Milk", 10.5, 2);

        //Assert
        assertEquals("Milk", s.getDescription());
        assertEquals(21, s.getTotal(), 0);
    }

    @Test
    public void testCreateSaleWithPriceWithoutDecimal() {
        //Act
        Sale s = shop.makeSale("Milk", 10, 2);

        //Assert
        assertEquals("Milk", s.getDescription());
        assertEquals(20, s.getTotal(), 0);
    }

    @Test
    public void testCreateSaleWithBigPrice() {
        //Act
        Sale s = shop.makeSale("Milk", 10, 200000000);

        //Assert
        assertEquals("Milk", s.getDescription());
        assertEquals(2000000000, s.getTotal(), 0);
    }

    @Test
    public void testAddCustomerToSale() {
        //Arrange
        Sale s = shop.makeSale("Coffee", 30, 1);
        Customer c = shop.makeCustomer("Tiiine", "tm@cphbusiness.dk");

        //Act
        boolean result = shop.addCustomerToSale(s, c);

        //Assert
        assertTrue(result);
        assertEquals("Tiiine", s.getCustomer().getName());
    }

    @Test
    public void testAddCustomerToSaleTwice() {
        //Arrange
        Sale s = shop.makeSale("Coffee", 30, 1);
        Customer c = shop.makeCustomer("Tiiine", "tm@cphbusiness.dk");
        Customer c2 = shop.makeCustomer("Roonnie", "roda@cphbusiness.dk");

        //Act
        boolean result = shop.addCustomerToSale(s, c);

        //Assert
        assertTrue(result);        
        assertEquals("Tiiine", s.getCustomer().getName());

        //Act: try to add another customer to same sale       
        result = shop.addCustomerToSale(s, c2);
        assertFalse(result);        
        assertEquals("Tiiine", s.getCustomer().getName());
    }

    @Test
    public void testgetTotal() {
        //Arrange
        Sale s = shop.makeSale("Coffee", 30, 1);
        Customer c = shop.makeCustomer("Tiiine", "tm@cphbusiness.dk");
        Customer c2 = shop.makeCustomer("Roonnie", "roda@cphbusiness.dk");

        //Act
        boolean result = shop.addCustomerToSale(s, c);

        //Assert
        assertTrue(result);

        //Act: try to add another customer to same sale   
        result = shop.addCustomerToSale(s, c2);
        assertFalse(result);
    }

    @Test
    public void getTotal() {
        //Arrange
        Sale s = shop.makeSale("Coffee", 30, 1);
        double expectedResult = 30;

        //Act
        double result = shop.getSaleTotal(s);

        //Assert
        assertEquals(expectedResult, result, 0);
    }

    @Test
    public void getTotalWithDecimal() {
        //Arrange
        Sale s = shop.makeSale("Coffee", 30.95, 2);
        double expectedResult = 61.9;

        //Act
        double result = shop.getSaleTotal(s);

        //Assert
        assertEquals(expectedResult, result, 0);
    }

    @Test
    public void testgetFullSale() {
        //Arrange
        Sale s = shop.makeSale("Coffee", 30, 1);
        Customer c = shop.makeCustomer("Tiiine", "tm@cphbusiness.dk");
        shop.addCustomerToSale(s, c);
        String expectedResult = "Coffee 1 30.0 Tiiine tm@cphbusiness.dk";
        
        //Act
        String result = shop.getFullSale(s);
        assertEquals(expectedResult, result);

    }
}
