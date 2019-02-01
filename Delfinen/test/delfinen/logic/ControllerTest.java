/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package delfinen.logic;

import delfinen.data.FileDAO;
import java.util.List;
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
public class ControllerTest {

    private Controller c;
    private CasualSwimmer swimmer;
    private FileDAO dao;

    public ControllerTest() {

        dao = new FileDAO();
        c = new Controller(dao);
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
     * Test of newCompSwimmer method, of class Controller.
     */
    @Test
    public void testNewCompSwimmer() {
        System.out.println("newCompSwimmer");
        int age = 12;
        String name = "Pede";
        Status status = Status.ACTIVE;
        String team = "Senior";
        boolean paid = true;
        Controller instance = c;
        instance.newCompSwimmer(age, name, status, team, paid);

    }

    /**
     * Test of newCasualSwimmer method, of class Controller.
     */
    @Test
    public void testNewCasualSwimmer() {
        System.out.println("newCasualSwimmer");
        int age = 21;
        String name = "Jes";
        Status status = Status.ACTIVE;
        String team = "Senior";
        boolean paid = false;
        Controller instance = c;
        instance.newCasualSwimmer(age, name, status, team, paid);

    }

    /**
     * Test of editSwimmer method, of class Controller.
     */
    @Test
    public void testEditSwimmer() {
        System.out.println("editSwimmer");
        int id = 2;
        int age = 98;
        String name = "Birthe";
        Status status = Status.PASSIVE;
        String team = "Senior";
        boolean paid = false;
        Controller instance = c;
        instance.editSwimmer(id, age, name, status, team, paid);

    }

    /**
     * Test of printSwimmerToFile method, of class Controller.
     */
    @Test
    public void testPrintSwimmerToFile() {
        System.out.println("printSwimmerToFile");
        CasualSwimmer swimmer = new CasualSwimmer(10, "Hans", Status.PASSIVE, "Junior", true);
        Controller instance = c;
        instance.printSwimmerToFile(swimmer);

    }

    /**
     * Test of swimmersFromFile method, of class Controller.
     */
    @Test
    public void testSwimmersFromFile() {
        System.out.println("swimmersFromFile");
        Controller instance = c;
        List<CasualSwimmer> expResult = dao.loadSwimmersFromFile();
        List<CasualSwimmer> result = instance.swimmersFromFile();
        assertEquals(expResult, result);

    }

    /**
     * Test of getAllSwimmers method, of class Controller.
     */
    @Test
    public void testGetAllSwimmers() {
        System.out.println("getAllSwimmers");
        Controller instance = c;
        String expResult = dao.loadSwimmersFromFile().toString().replace("[", "").replace("]", "").replace(", ", "\n");
        String result = instance.getAllSwimmers();
        assertEquals(expResult, result);

    }

    /**
     * Test of newCompResult method, of class Controller.
     */
    @Test
    public void testNewResult() {
        System.out.println("newCompResult");
        int id = 2;
        Discipline discipline = Discipline.CRAWL;
        double time = 13.14;
        double date = 10.11;
        String competition = "DM";
        Controller instance = c;
        instance.newResult(id, discipline, time, date, competition);

    }

    

    /**
     * Test of getTop5 method, of class Controller.
     */
    @Test
    public void testGetTop5() {
        System.out.println("getTop5");
        Discipline discipline = Discipline.CRAWL;
        Controller instance = c;
        instance.getTop5(discipline);

    }
}
