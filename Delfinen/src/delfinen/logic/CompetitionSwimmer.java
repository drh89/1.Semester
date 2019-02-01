package delfinen.logic;

import delfinen.logic.Discipline;
import delfinen.logic.CasualSwimmer;
import java.util.HashMap;

/**
 *
 * @author Niklas
 */
public class CompetitionSwimmer extends CasualSwimmer {

    private HashMap<Discipline, Double> results;

    public CompetitionSwimmer(int age, String name, Status status, String team, boolean paid) {
        super(age, name, status, team, paid);
        results = new HashMap<>();
        this.contigent = calculatePrice(age, status);

    }

    public HashMap<Discipline, Double> getDiscplines() {
        return results;
    }

    public void addDiscplines(Discipline discipline) {
        results.put(discipline, 50.00);
    }
    
    public void addResult(Discipline discipline, Double result) {
        results.put(discipline, result);
    }
    
    public double getResult(Discipline discipline) {
        return results.get(discipline);
    }

    @Override
    public String toString() {
        return super.toString() + " " + results.toString();
    }
}
