/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package terning;

/**
 *
 * @author Dennis
 */
public class Person {
    
    
    private String frontName;
    private String lastName;
    private int age;
    
    
    //constructor
    
    public Person(String frontName, String lastName, int age){
        
        this.frontName = frontName;
        this.lastName = lastName;
        this.age = age;        
        
    }
    
    public String getfrontName(){
        return frontName;
    }
    
    
}
