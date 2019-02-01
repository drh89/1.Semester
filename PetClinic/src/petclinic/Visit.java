/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petclinic;

import java.time.LocalDate;

/**
 *
 * @author Dennis
 */
public class Visit {
    
    private LocalDate dateOfVisit;
    private String description;
    
    public Visit(){
    
    }
    
    public Visit(LocalDate dateOfVisit, String description){
        this.dateOfVisit = LocalDate.now();
        this.description = description;
        
    }

    /**
     * @return the dateOfVisit
     */
    public LocalDate getDateOfVisit() {
        return dateOfVisit;
    }

    /**
     * @param dateOfVisit the dateOfVisit to set
     */
    public void setDateOfVisit(LocalDate dateOfVisit) {
        this.dateOfVisit = dateOfVisit;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    @Override
    public String toString(){
        return getDateOfVisit() + " ~~ "  + getDescription();
    }
    
}
