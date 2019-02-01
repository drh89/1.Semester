/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creatingfiles;

import java.io.Serializable;

/**
 *
 * @author Dennis
 */
public class Animals implements Serializable {
    
    private String animalName;
    private String groupName;
    
    public Animals(String animalName, String animalGroup){
        this.animalName = animalName;
        this.groupName = animalGroup;
    }

    /**
     * @return the animalName
     */
    public String getAnimalName() {
        return animalName;
    }

    /**
     * @param animalName the animalName to set
     */
    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    /**
     * @return the groupName
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * @param groupName the groupName to set
     */
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
    @Override
    public String toString(){
        return groupName + " of " + animalName;
                
    }
}
