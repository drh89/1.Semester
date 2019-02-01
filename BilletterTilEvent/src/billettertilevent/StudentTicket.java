/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package billettertilevent;

/**
 *
 * @author Dennis
 */
public class StudentTicket extends Ticket{
    private int price = 80;
    private int daysBeforeEvent;
    private int studyID;
    
    public StudentTicket(int ticketID, int daysBeforeEvent, int studyID){
        super(ticketID);      
        this.daysBeforeEvent = daysBeforeEvent;
        this.studyID = studyID;
    }

    /**
     * @return the price
     */
    public int getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(int price) {
        this.price = price;
    }

    /**
     * @return the daysBeforeEvent
     */
    public int getDaysBeforeEvent() {
        return daysBeforeEvent;
    }

    /**
     * @param daysBeforeEvent the daysBeforeEvent to set
     */
    public void setDaysBeforeEvent(int daysBeforeEvent) {
        this.daysBeforeEvent = daysBeforeEvent;
    }

    /**
     * @return the studyID
     */
    public int getStudyID() {
        return studyID;
    }

    /**
     * @param studyID the studyID to set
     */
    public void setStudyID(int studyID) {
        this.studyID = studyID;
    }
    
}
