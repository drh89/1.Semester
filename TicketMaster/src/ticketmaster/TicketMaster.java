/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticketmaster;

/**
 *
 * @author Dennis
 */
public class TicketMaster {

    private final int MINUTES_PER_HOUR = 60;

    public TicketMaster(){
        
    }

    public enum Zone {
        RED, GREEN, BLUE, YELLOW;

    }

    public enum PaymentType {
        CARD, CASH;
    }

    public double calculatePrice(int period, Zone zone, PaymentType paymentType) {
        int hourPrice = 0;
        double payMethodPrice = 0;
       

//        if (period % 30 != 0) {
//            throw new InvalidParkingTimeException();
//        }

        if (zone == Zone.RED) {
            hourPrice += 36;
        }
        if (zone == Zone.GREEN) {
            hourPrice += 19;
        }
        if (zone == Zone.BLUE) {
            hourPrice += 12;
        }
        if (zone == Zone.YELLOW) {
            hourPrice += 9;
        }
        if (paymentType == PaymentType.CARD) {
            payMethodPrice += 0.5;
        }

        double price =  ((double) period / MINUTES_PER_HOUR) * hourPrice + payMethodPrice;
        return price;

    }

}
