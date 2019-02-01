package delfinen.logic;

/**
 *
 * @author Niklas
 */
public class CompetitionResult extends Result {

    private String competition;

    public CompetitionResult(int id, Discipline discipline, double time, double date, String competition) {
        super(id, discipline, time, date, competition);
    }

    @Override
    public String toString() {
        return super.toString() + competition;
    }
}
