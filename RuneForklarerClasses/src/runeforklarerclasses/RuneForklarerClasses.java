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
public class RuneForklarerClasses {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Car car = new Car("Ferrari",4,2);
        System.out.println(car.getName());
        System.out.println(car.getWheels());
        System.out.println(car.getEngineSize());
        System.out.println(car.speed(200));
 
        car.setName("Opel");
        System.out.println(car.getName());
        car.setWheels(3);
        System.out.println(car.getWheels());
        car.setEngineSize(1);
        System.out.println(car.getEngineSize());
        
        System.out.println(car.speed(100));
    }
    
}
