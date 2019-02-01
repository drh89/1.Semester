package opgave1;

import org.junit.Test;
import static org.junit.Assert.*;

public class LeapYearTest {

    @Test
    // opgave 1a
    public void testThat2016IsLeapYear() {
        //Arrange
        LeapYear leap = new LeapYear();
        int testYear = 2016;
        //boolean expectedResult = true;

        //Act
        boolean actualResult = leap.isLeapYear(testYear);

        //Assert 
        assertTrue(actualResult);
    }

    @Test
    // opgave 1a
    public void testThat2015IsNotLeapYear() {
        //Arrange
        LeapYear leap = new LeapYear();
        int testYear = 2015;
        //boolean expectedResult = true;

        //Act
        boolean actualResult = leap.isLeapYear(testYear);

        //Assert 
        assertFalse(actualResult);
    }

    @Test
    // opgave 1a
    public void testThat2000IsLeapYear() {
        //Arrange
        LeapYear leap = new LeapYear();
        int testYear = 2000;     

        //Act
        boolean actualResult = leap.isLeapYear(testYear);

        //Assert 
        assertTrue(actualResult);
    }

    @Test
    // opgave 1a
    public void testThat2004IsLeapYear() {
        //Arrange
        LeapYear leap = new LeapYear();
        int testYear = 2004;
        //boolean expectedResult = true;

        //Act
        boolean actualResult = leap.isLeapYear(testYear);

        //Assert 
        assertTrue(actualResult);
    }

    @Test
    // opgave 1a
    public void testThat1921IsNotLeapYear() {
        //Arrange
        LeapYear leap = new LeapYear();
        int testYear = 1921;
        //boolean expectedResult = true;

        //Act
        boolean actualResult = leap.isLeapYear(testYear);

        //Assert 
        assertFalse(actualResult);
    }

    @Test
    // opgave 1b
    public void testNumberOfLeapYearsFrom1900To2020() {

        //Arrange
        LeapYear leap = new LeapYear();
        int startYear = 1900;
        int endYear = 2020;
        int expectedLeapYears = 30;

        //Act
        int actualLeapYears = leap.numberOfLeapYears(startYear, endYear);

        //Assert 
        assertEquals(expectedLeapYears, actualLeapYears);
    }
    
    @Test
    // opgave 1b
    public void testNumberOfLeapYearsFrom2000To2000() {

        //Arrange
        LeapYear leap = new LeapYear();
        int startYear = 2000;
        int endYear = 2000;
        int expectedLeapYears = 1;

        //Act
        int actualLeapYears = leap.numberOfLeapYears(startYear, endYear);

        //Assert 
        assertEquals(expectedLeapYears, actualLeapYears);
    }
    
    @Test
    // opgave 1b
    public void testNumberOfLeapYearsFrom2001To2001() {

        //Arrange
        LeapYear leap = new LeapYear();
        int startYear = 2001;
        int endYear = 2001;
        int expectedLeapYears = 0;

        //Act
        int actualLeapYears = leap.numberOfLeapYears(startYear, endYear);

        //Assert 
        assertEquals(expectedLeapYears, actualLeapYears);
    }
    
    @Test
    // opgave 1b
    public void testNumberOfLeapYearsInValidRange() {

        //Arrange
        LeapYear leap = new LeapYear();
        int startYear = 2001;
        int endYear = 2000;
        int expectedLeapYears = -1;

        //Act
        int actualLeapYears = leap.numberOfLeapYears(startYear, endYear);

        //Assert 
        assertEquals(expectedLeapYears, actualLeapYears);
    }
}
