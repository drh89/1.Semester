/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testafobjekter;

/**
 *
 * @author Dennis
 */
public class Hund {
    
    
    private String name;
    private int age;
    
    
    //constructor
    
    public Hund(String name, int age){
        
        this.name = name;
        this.age = age;
        
    }
    
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    
    public boolean equals(Hund hund){
        return hund.getName().equals(this.name) && hund.getAge() == age;
        
        
    }
    public String toString(){
        return name + " er " + age + " år gammel";
        
    }
    
    
    
    
    
}
