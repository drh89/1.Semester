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
public class PreSaleTicket extends Ticket{
    private int price = 120;
    private int daysBeforeEvent;
    
    public PreSaleTicket(int ticketID, int daysBeforeEvent){
        super(ticketID);
        
        this.daysBeforeEvent = daysBeforeEvent;
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
    
}
