/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package person1;

/**
 *
 * @author Dennis
 */
public class Dog {
    
    private String name;
    private int age;
    Person person;
    
    //constructor
    
    public Dog(String name, int age, Person person){
        this.name = name;
        this.age = age;
        this.person = person;
        
    }
    //constructor
    public Dog(String name, int age){
        this.name = name;
        this.age = age;
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
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }
    
    public Person getPerson(){
        return person;
    }
    public void setPerson(Person person){
        this.person = person;
    }

    @Override
   public String toString(){
       return "Hunden hedder " + name + " den er " + age + " år gammel " + " ejerens informationer ";
       
   }
    
    
    
}
