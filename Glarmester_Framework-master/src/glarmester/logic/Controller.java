package glarmester.logic;

import java.util.List;

public interface Controller {
    
    /**
     * Retrieves a list of the names of the available frame. Not the Frame, just the name.
     * @return A list of frame names.
     */
    public List<String> getFrameNames();
    
    /**
     * Retrieves the calculated total price of a window.
     * @param height_cm The height of the window
     * @param width_cm The width of the window
     * @param frameName The name of a specific type of frame
     * @return The price of the entire window (frame + glass)
     */
    public double getTotalPrice(int height_cm, int width_cm, String frameName);
}
