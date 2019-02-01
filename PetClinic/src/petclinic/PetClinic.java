/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petclinic;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Dennis
 */
public class PetClinic {
   private Scanner scanner = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PetClinic petClinic = new PetClinic();
        petClinic.test();
    }
    
        public void test(){
        
                
                
        Visit visit = new Visit(LocalDate.now(), "1. besøg");
        Visit visit2 = new Visit(LocalDate.now().plusDays(1), "Follow up");
        Person owner1 = new Person("Jens", "Hansen", "234 Pet Street", "12345678");
        Person owner2 = new Person();
        Pet pet1 = new Pet("Django", PetType.DOG, "2016-01-24", owner1);
//        Pet pet2 = new Pet("", null, "1999-02-12", owner2);
        Pet pet3 = new Pet();
        
        
        ArrayList<Person> owners = new ArrayList();
        owners.add(owner1);
        owners.add(owner2);
        
        
//        System.out.println("Hello, and welcome");
        System.out.println("What is your first name?");
        owner2.setFirstName(scanner.nextLine());
//        
//        System.out.println("How are you " + owner2.getFirstName() + "? ");
//        System.out.println("Can I have your last name please?");
//        owner2.setLastName(scanner.nextLine());
//        
        System.out.println("Very well");
        System.out.println("Next, i need your adress");
        owner2.setAdress(scanner.nextLine());
            System.out.println(owner2.getAdress());
//        System.out.println("and for last, I need your phonenumber");
//        owner2.setPhone(scanner.nextLine());
//        
//        
//        System.out.println("So, what kind of pet do you bring with you today?");
//        pet3.setPetType(PetType.valueOf(scanner.nextLine().toUpperCase()));
//        System.out.println(pet3.getPetType());
//        
//        System.out.println("What is the pets name?");
//        pet3.setName(scanner.nextLine());
//        System.out.println(pet3.getName());
        
            System.out.println("write owners adress");
            if(isPetOwner(owners, pet3, owner2)){
                pet3.setOwner(owner2);
            } 
            if(!isPetOwner(owners, pet3, owner2)){
                System.out.println("Fejl, den indtastede adresse findes ikke i databasen");
            }
            System.out.println(pet3.getOwner().getFirstName());
        
        
        //        System.out.println("What kind of pet is it?");
//        pet3.setPetType(PetType.valueOf(scanner.nextLine().toUpperCase()));
//        System.out.println(pet3.getPetType());
//        System.out.println("Whem is your pets birthdate YYYY-MM-DD");
//        pet3.setBirthday(LocalDate.parse(scanner.nextLine()));
//        System.out.println(pet3.getBirthday());
        
        
        
        
//        pet2.setPetType(PetType.valueOf(scanner.nextLine().toUpperCase()));
//        System.out.println(pet2.getPetType());
//        
//        System.out.println("When is your pets birthdate YYYY-MM-DD");
//        pet2.setBirthday(LocalDate.parse(scanner.nextLine()));
//        
//        System.out.println(pet2.getBirthday());
        
        
        
        
//        pet1.addVisit(visit);
//        pet1.addVisit(visit2);
////        System.out.println(visit);
////        System.out.println(pet1.getVisits().toString());
//        System.out.println(pet1.numberOFVisits(pet1));

    }
public boolean isPetOwner(ArrayList<Person> owners, Pet pet, Person p){
    
    
        if(p.getAdress().equals(scanner.nextLine())){
            
            return true;
        }
        
    
   return false;
}
}
