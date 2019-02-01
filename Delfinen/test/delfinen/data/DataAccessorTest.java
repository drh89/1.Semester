/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package delfinen.data;

import delfinen.logic.CompetitionSwimmer;
import delfinen.logic.Status;
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
public class DataAccessorTest {
    private DataAccessor data;
    
    public DataAccessorTest() {
        data = new FileDAO();
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
    public void testGetSwimmer(){
        System.out.println("getSwimmer");
        
//        CompetitionSwimmer expected = new CompetitionSwimmer(12, "Erik", Status.PASSIVE,"Senior", Boolean.TRUE );
//        expected.setId(3);
//        
//        CompetitionSwimmer actual = (CompetitionSwimmer) data.getSwimmer(3);
//        assertEquals(expected, actual);
       int expectedAge = 24;
       String expectedName = "Hans";
       String status = "active";
       Enum expectedStatus = Status.valueOf(status.toUpperCase());
       String expectedTeam = "Senior";
       
       int actualAge = data.getSwimmer(3).getAge();
       String actualName = data.getSwimmer(3).getName();
       Enum actualStatus = data.getSwimmer(3).getStatus();
       String actualTeam = data.getSwimmer(3).getTeam();
       
        assertEquals(expectedAge, actualAge);
        assertEquals(expectedName, actualName);
        assertEquals(expectedStatus, actualStatus);
        assertEquals(expectedTeam, actualTeam);
    }
    
    @Test
    public void testLoadSwimmerFromFile(){
        System.out.println("loadSwimmersFromFile");
        assertNotNull(data.loadSwimmersFromFile());
        
        int expected = 3;
        int actual = data.loadSwimmersFromFile().size();
        
        assertEquals(expected, actual);
        
        
    }
    

   
}