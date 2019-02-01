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
public abstract class Ticket {

    private int price;
    private int ticketID;
    private int daysBeforeEvent;

    public Ticket(int ticketID) {
        
        this.ticketID = ticketID;
       
    }

    



    /**
     * @return the ticketID
     */
    public int getTicketID() {
        return ticketID;
    }

    /**
     * @param ticketID the ticketID to set
     */
    public void setTicketID(int ticketID) {
        this.ticketID = ticketID;
    }


    public abstract int ticketPrice();

    @Override
    public abstract String toString();

    public abstract void createTicket();

}
