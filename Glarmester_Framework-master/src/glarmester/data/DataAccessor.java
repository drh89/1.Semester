package glarmester.data;

import java.util.List;

/**
 *
 * @author RODA
 */
public interface DataAccessor {

    /**
     * Retrieves a list of Frames from the Data layer.
     * @return A list of Frame objects
     * @throws DataException
     */
    public List<Frame> getFrames() throws DataException;
    
    /**
     * Retrieves a specific Frame identified by its name
     * @param name The name of the Frame
     * @return The specified Frame
     * @throws DataException 
     */
    public Frame getFrame(String name) throws DataException;
    
    /**
     * Retrieves the m^2 price of glass
     * @return The price
     * @throws DataException 
     */
    public double getGlassPrice() throws DataException;
}
