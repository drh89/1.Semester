package glarmester.logic;

import glarmester.data.DataAccessor;
import glarmester.data.DataException;
import glarmester.data.Frame;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author RODA
 */
public class ControllerImpl implements Controller {
    public static final boolean DEBUG = true;
//    private DataAccessor data = new DataAccessorFile();
    private DataAccessor data;
    private PriceCalculator logic;

    public ControllerImpl(DataAccessor data, PriceCalculator logic) {
        this.data = data;
        this.logic = logic;
    }
    
    @Override
    public List<String> getFrameNames() {
        try {
            List<Frame> frames = data.getFrames();
            ArrayList<String> frameNames = new ArrayList<String>();
            for(Frame frame : frames){
                frameNames.add(frame.getName());
            }
            return frameNames;
        } catch (DataException ex) {
            ex.printStackTrace();
        }
        return new ArrayList<>();
    }

    @Override
    public double getTotalPrice(int height_cm, int width_cm, String frameName) {
        try {
            double height_m = height_cm / 100.0;
            double width_m = width_cm / 100.0;
            double framePrice = data.getFrame(frameName).getPrice();
            double glassPrice = data.getGlassPrice();
            PriceCalculator calc = new PriceCalculator();
            double totalPrice = calc.calculatePrice(height_m, width_m, framePrice, glassPrice);
            return totalPrice;
        } catch (DataException | CalculatorException ex) {
            throw new IllegalArgumentException(ex);
        }
    }
}
