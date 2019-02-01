package delfinen.logic;

import java.io.Serializable;

/**
 *
 * @author Niklas
 */
public class Result implements Serializable {

    protected int swimmerId;
    protected Discipline discipline;
    protected double time;
    protected double date;
    protected String competition;

    public Result(int swimmerId, Discipline discipline, double time, double date, String competition) {
        this.swimmerId = swimmerId;
        this.discipline = discipline;
        this.time = time;
        this.date = date;
        this.competition = competition;
    }

    public Discipline getDiscipline() {
        return discipline;
    }

    public void setDiscipline(Discipline discipline) {
        this.discipline = discipline;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public double getDate() {
        return date;
    }

    public void setDate(double date) {
        this.date = date;
    }

    public String toString() {
        return "SwimmerID:" + swimmerId + ", time:" + time + ", date:" + date;
    }

}
