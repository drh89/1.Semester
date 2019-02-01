package ticket;

public class TicketMachine {

    private static final double ADM_FEE = 0.5;
    private static final int MINUTES_PER_HOUR = 60;
    
    public double calculatePrice(int period, Zone zone, Payment payment) {
       double price = 0;

        switch (zone) {
            case RED:
                price = calculatePrice(period, 36);                
                break;
            case GREEN:
                price = calculatePrice(period, 19);
                break;
            case BLUE:
                price = calculatePrice(period, 12);
                break;
            case YELLOW:
                price = calculatePrice(period, 9);
                break;
        }
        if (payment == Payment.CARD) {
            price += ADM_FEE;
        }

        return price;
    }

    private double calculatePrice(int period, int hrsPrice) {
        double price = (double) period / MINUTES_PER_HOUR * hrsPrice;
        return price;
    }   
}

/*enum Zone {
    RED, GREEN, BLUE, YELLOW
}

enum Payment {
    CARD, CASH
}*/
