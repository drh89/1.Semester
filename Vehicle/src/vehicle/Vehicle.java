
package vehicle;

import java.util.ArrayList;
import java.util.Collections;


public class Vehicle implements Comparable<Vehicle> {

    
    private int weight;
    private String registrationNumber;
    
    public Vehicle(int weight, String registrationNumber){
        this.weight = weight;
        this.registrationNumber = registrationNumber;
    }
    
    public static void main(String[] args) {
        ArrayList<Vehicle> vehicles = new ArrayList();
        
//        Vehicle vehicle1 = new Vehicle (11000, "SD1232");
//        Vehicle vehicle2 = new Vehicle (22000, "SD1231");
//        Vehicle vehicle3 = new Vehicle (3000, "SD1239");
//        Vehicle vehicle4 = new Vehicle (4000, "SD1238");
//        Vehicle vehicle5 = new Vehicle (5000, "WD1237");
//        Vehicle vehicle6 = new Vehicle (6000, "AD1236");
//        Vehicle vehicle7 = new Vehicle (5000, "AD1235");
//        Vehicle vehicle8 = new Vehicle (8000, "AD1234");
        
        for (int i = 1; i <= 10; i++) {
            
            vehicles.add(new Vehicle (i * 1000, "AD" + i));
            
        }
        Collections.shuffle(vehicles);        
        System.out.println(vehicles.get(0).printList(vehicles));
        
        Collections.sort(vehicles);
        System.out.println(vehicles.get(0).printList(vehicles));
        
        
        
        
        
        
        
    }

    /**
     * @return the weight
     */
    public int getWeight() {
        return weight;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(int weight) {
        this.weight = weight;
    }

    /**
     * @return the registrationNumber
     */
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    /**
     * @param registrationNumber the registrationNumber to set
     */
    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }
    
    @Override
    public String toString(){
        return weight + " " + registrationNumber + "\n";
    }


    @Override
    public int compareTo(Vehicle other) {
        
        return this.weight - other.weight;
    }
    public String printList(ArrayList<Vehicle> vehicles){
       String formattedString = vehicles.toString()
               .replace("[", "").replace("]", "")
               .replace(", ", "");
       
       return formattedString;
        
    }
    
}
