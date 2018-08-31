/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runeforklarerclasses;

/**
 *
 * @author Dennis
 */
public class Car {
    
    
    private String name;
    private int wheels;
    private int engineSize;

    //Constructor
    public Car(String name,int wheels,int engineSize) {
        
        this.name = name;
        this.wheels = wheels;
        this.engineSize = engineSize;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the wheels
     */
    public int getWheels() {
        return wheels;
    }
    // set wheels
    public void setWheels(int wheels){
        this.wheels = wheels;
    }

    /**
     * @return the engineSize
     */
    public int getEngineSize() {
        return engineSize;
    }

    /**
     * @param engineSize the engineSize to set
     */
    public void setEngineSize(int engineSize) {
        this.engineSize = engineSize;
    }
    
    // speed method
    public int speed(int speed){
        
        int newSpeed = speed * engineSize;
        return newSpeed;
    }
    
    
    
    
}
