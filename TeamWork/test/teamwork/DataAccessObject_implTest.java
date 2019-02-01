package teamwork;

import java.sql.SQLException;
import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;

public class DataAccessObject_implTest {
    private static DBConnector connector;
    private DataAccessObject_impl dao;
    

    // Setup
    @BeforeClass
    public static void setUpClass() {
        try {
            connector = new DBConnector();
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("Setup fail!");
            fail();
        }
    }

    @Before
    public void setUp() throws SQLException {
        dao = new DataAccessObject_impl(connector);
    }

    // Test teams
    @Test
    public void testGetTeamMembers() throws SQLException {
        // Positive test
        User user;

        ArrayList<User> teamMembers = dao.getTeamMembers(1);
        assertNotNull(teamMembers);
        assertFalse(teamMembers.isEmpty());
        assertEquals(teamMembers.size(), 3);

        user = teamMembers.get(0);
        assertEquals(user.getId(), 2);
        assertEquals(user.getUserName(), "Mickey Mouse");
        assertEquals(user.getPassword(), "5678");
        assertEquals(user.isAdmin(), true);

        user = teamMembers.get(1);
        assertEquals(user.getId(), 3);
        assertEquals(user.getUserName(), "Fedtmule");
        assertEquals(user.getPassword(), "1234");
        assertEquals(user.isAdmin(), false);

        user = teamMembers.get(2);
        assertEquals(user.getId(), 7);
        assertEquals(user.getUserName(), "Pluto");
        assertEquals(user.getPassword(), "1234");
        assertEquals(user.isAdmin(), false);
    }

    @Test
    public void testGetTeamMembersInValidTeamID() throws SQLException {
        // Negative test
        ArrayList<User> teamMembers = dao.getTeamMembers(99);
        assertNotNull(teamMembers);
        assertTrue(teamMembers.isEmpty());
    }

    @Test
    public void testGetAllTeams() throws SQLException {
        ArrayList<Team> teams = dao.getTeams();
        assertNotNull(teams);
        assertFalse(teams.isEmpty());
        Team team = teams.get(0);
        assertEquals(team.getName(), "A");
        assertEquals(team.getMembers().size(), 3);
        
    }

    @Test
    public void testGetTeamByID() throws SQLException {
        // positive test
        Team team = dao.getTeam(1);
        assertNotNull(team);
        assertEquals(team.getName(), "A");
        assertEquals(team.getMembers().size(), 3);
    }

    @Test
    public void testGetTeamByInvalidID() throws SQLException {
        // Negative test
        Team team = dao.getTeam(99);
        assertNull(team);
    }

    @Test
    public void testGetTeamByTeamName() throws SQLException {
        // positive test
        Team team = dao.getTeam("A");
        assertNotNull(team);
        assertEquals(team.getId(), 1);
        assertEquals(team.getMembers().size(), 3);
    }

    @Test
    public void testGetTeamByInvalidTeamName() throws SQLException {
        // negative test
        Team team = dao.getTeam("Not a team name!");
        assertNull(team);
    }

    // Test users
    @Test
    public void testGetAllUsers() throws SQLException {
        ArrayList<User> l = dao.getUsers();
        assertEquals(8, l.size());
    }

    @Test
    public void testGetUserByID() throws SQLException {
        User user = dao.getUser(2);
        assertEquals("Mickey Mouse", user.getUserName());
        assertEquals("5678", user.getPassword());
    }

    @Test
    public void testGetUserByName() throws SQLException {
        User user = dao.getUser("Fedtmule");
        assertEquals(3, user.getId());
        assertEquals("1234", user.getPassword());
    }

}
