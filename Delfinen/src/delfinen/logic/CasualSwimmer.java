package delfinen.logic;

import java.io.Serializable;

/**
 *
 * @author Dennis
 */
public class CasualSwimmer implements Serializable {

    protected static int idCounter = 0;
    protected int id;
    protected int age;
    protected int contigent;
    protected String name;
    protected Status status;
    protected String team;
    protected boolean paid;

    public CasualSwimmer(int age, String name, Status status, String team, boolean paid) {
        this.age = age;
        this.name = name;
        this.status = status;
        this.team = team;
        this.paid = paid;
        this.contigent = calculatePrice(age, status);
        
    }

    public boolean isPaid() {
        return paid;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Enum getStatus() {
        return this.status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        String paidString = "";
        if(paid)paidString = "Yes";
        if(!paid)paidString = "No";
        return id + " " + age + " " + name + " " + status + " " + team + " " + paidString + " " + contigent;
    }

    public String getTeam() {
        return this.team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public final int calculatePrice(int age, Status status ) {
        if (status == Status.PASSIVE) {
            return 500;
        }
        if (age < 18) {
            return 1000;
        }
        if (age >= 60) {
            return 1200;
        } else {
            return 1600;
        }

    }

}
