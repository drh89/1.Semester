/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package person1;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

/**
 *
 * @author Dennis
 */
public class Person {

    private String frontName;
    private String lastName;
    private String email;
    private int phoneNumber;
    //final datatypes cannot be changed ( - set)
    private final String CPR;
    //static can only be called by other static instances.
    private static int countPersons = 0;

    Dog dog;

    //constructor
    public Person(String frontName, String lastName, String email, int phoneNumber, final String CPR) {

        this.frontName = frontName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.CPR = CPR;
        countPersons ++;

    }

    //constructor
    public Person(String frontName, String lastName, String email, int phoneNumber, Dog dog, final String CPR) {

        this.frontName = frontName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.dog = dog;
        this.CPR = CPR;
        countPersons++;

    }
    public String getFrontName() {
        return frontName;
    }

    public void setFrontName(String frontName) {
        this.frontName = frontName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog() {
        this.dog = dog;
    }

    public String getCPR() {
        return CPR;
    }
    public int getCountPersons(){
        return countPersons;
    }
    
    //Overrides toString method
    @Override
    public String toString() {

        return "Navn: " + frontName + " " + lastName + " Email: " + email + " telefonnummer " + phoneNumber + " Cpr-nr: " + CPR + " Alder: " + getAge()
                + " der er " + countPersons + " personer ";

    }
    
    //if two objects have the same CPR it returns true.
    public boolean equals(Person person) {
    return person.getCPR().equals(this.CPR);
    }
    
    //Calculates age by returning the difference of the birthyear and the current year
    public int getAge() {

        int year = Integer.parseInt(CPR.substring(4, 8));
        int month = Integer.parseInt(CPR.substring(2, 4));
        int day = Integer.parseInt(CPR.substring(0, 2));

        LocalDate birthDate = LocalDate.of(year, Month.of(month), day);
        System.out.println(birthDate);
        LocalDate dateToday = LocalDate.now();
        System.out.println(dateToday);
        Period diff = Period.between(birthDate, dateToday);

        return diff.getYears();

    }
   

}
