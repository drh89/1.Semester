/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petclinic;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Dennis
 */
public class Pet {
    private int id;
    private String name;
    private LocalDate  birthday; 
    private ArrayList<Visit> visits;
    private Person owner;
    
   
    private PetType petType;
    
    
    public Pet(){
        
    }
    
    
    public Pet(String name, PetType petType, String birthday, Person owner){
        
        this.name = name;        
        this.birthday = LocalDate.parse(birthday);
        this.owner = owner;
        this.petType = petType;
        visits = new ArrayList();
        
        
    
}

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
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
     * @return the birthday
     */
    public LocalDate getBirthday() {
        return birthday;
    }

    /**
     * @param birthday the birthday to set
     */
    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    /**
     * @return the visits
     */
    public ArrayList<Visit> getVisits() {
        return visits;
    }

    /**
     * @param visits the visits to set
     */
    public void setVisits(ArrayList<Visit> visits) {
        this.visits = visits;
    }

    /**
     * @return the owner
     */
    public Person getOwner() {
        return owner;
    }

    /**
     * @param owner the owner to set
     */
    public void setOwner(Person owner) {
        this.owner = owner;
    }

    /**
     * @return the petType
     */
    public PetType getPetType() {
        return petType;
    }

    /**
     * @param petType the petType to set
     */
    public void setPetType(PetType petType) {
        this.petType = petType;
    }
    public void addVisit(Visit visit){
        visits.add(visit);
    }
    public int numberOFVisits(Pet pet){
        int count = 0;
        
        count = pet.getVisits().size();
        return count;
    }
}
