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
public class Person1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        //Dog dog1 = new Dog("Django", 3);
        
        Person person = new Person("Dennis", "Hansen", "person@test.dk", 11111111,"24011989-9999" );
        Person person2 = new Person("Cathrine", "Dall", "person2@test.dk", 22222222, "24011989-9999");
        Person person3 = new Person("Jens", "Jensen", "person3@test.dk", 33333333, "23121989-8888");
        
        
        System.out.println(person);
        System.out.println(person2);
        System.out.println(person3);
        System.out.println(person2.equals(person3));
        System.out.println(person.equals(person2));
        
        
        
        
        
               
//        Person person2 = new Person("Jens", "Jensen", "person2@test.dk", 22222222);
//        
//        Person person3 = new Person("Anders", "Andersen", "person3@test.dk", 33333333);
//        
//        System.out.println(person);
//        System.out.println(person2);
//        System.out.println(person3);
//        System.out.println(person2.equals(person3));
//        
//        Dog dog = new Dog("King", 3, person2);
//        System.out.println(dog);
//        System.out.println(person);
        
        
        
        
    }
   
}
