package fc_knoldesparkerne;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author RODA
 */
public class TeamTest {
    private Team team;
    
    @Before
    public void setUp() {
        team = new Team("Team Dog");
    }

    @Test
    public void testCoach() {
        assertNull(team.getCoach());
        
        Player rex = new Player("Rex", 2010);
        team.setCoach(rex);
        
        assertNotNull(team.getCoach());
        
        team.setCoach(null);
        assertNull(team.getCoach());
    }

    @Test
    public void testPlayers() {
        assertTrue(team.getPlayers().isEmpty());
        
        Player rollo = new Player("Rollo", 2010);
        Player king = new Player("King", 2010);
        Player cujo = new Player("Cujo", 2010);
        Player lassie = new Player("Lassie", 2010);
        team.add(rollo);
        team.add(king);
        team.add(cujo);
        team.add(lassie);
        
        assertFalse(team.getPlayers().isEmpty());
        assertEquals(4, team.getPlayers().size());
        
        team.remove(rollo);
        team.remove(king);
        assertEquals(2, team.getPlayers().size());
        
        team.remove(cujo);
        team.remove(lassie);
        assertTrue(team.getPlayers().isEmpty());
    }
}
