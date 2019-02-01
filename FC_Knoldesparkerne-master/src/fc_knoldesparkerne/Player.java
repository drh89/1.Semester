package fc_knoldesparkerne;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author RODA
 */
public class Player {
    private String name;
    private int birthYear;
    private ArrayList<Integer> yearsPaid;

    public Player(String name, int birthYear){
        this.name = name;
        this.birthYear = birthYear;
        yearsPaid = new ArrayList();
    }
    
    public String getName(){
        return name;
    }
    
    public int getBirthYear(){
        return birthYear;
    }
    
    public ArrayList<Integer> getYearsPaid(){
        return yearsPaid;
    }
    
    public void registerPayment(Integer year){
        if(yearsPaid.contains(year)){
            return;
        }
        yearsPaid.add(year);
    }
    
    public boolean revokePayment(Integer year){
        return yearsPaid.remove(year);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Player other = (Player) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }
    
    
}
