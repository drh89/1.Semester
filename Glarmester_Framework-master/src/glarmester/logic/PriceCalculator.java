package glarmester.logic;

/**
 *
 * @author RODA
 */
public class PriceCalculator {

    /**
     * Calculate total price
     * @param height The height in m
     * @param width The width in m
     * @param framePrice The price of 1 m of frame
     * @param glassprice The price of 1 m^2 of glass;
     * @return The total price
     */
    public double calculatePrice(double height, double width, double framePrice, double glassprice) throws CalculatorException {
        if(Double.isNaN(height)     || height <= 0)     throw new CalculatorException("Bad value for height!");
        if(Double.isNaN(width)      || width <= 0)      throw new CalculatorException("Bad value for width!");
        if(Double.isNaN(framePrice) || framePrice <= 0) throw new CalculatorException("Bad value for framePrice!");
        if(Double.isNaN(glassprice) || glassprice <= 0) throw new CalculatorException("Bad value for glassprice!");
        
        double glassPrice = height * width * glassprice;
        double totalFramePrice = ((2 * height) + (2 * width)) * framePrice;
        double totalPrice = glassPrice + totalFramePrice;
        return totalPrice;
    }
}
