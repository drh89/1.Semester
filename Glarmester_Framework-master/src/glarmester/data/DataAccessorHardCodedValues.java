package glarmester.data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author RODA
 */
public class DataAccessorHardCodedValues implements DataAccessor {
    private ArrayList<Frame> frames;
    private double glassPrice;
    
    public DataAccessorHardCodedValues(){
        frames = new ArrayList<>();
        frames.addAll(Arrays.asList(new Frame[] {
            new Frame("Plain", 100),
            new Frame("Ornate", 200),
            new Frame("Lavish", 350)
        }));
        glassPrice = 300;
    }

    @Override
    public List<Frame> getFrames() throws DataException {
        return frames;
    }

    @Override
    public Frame getFrame(String name) throws DataException {
        if(name == null) throw new DataException("Name can't be null!");
        switch(name.toLowerCase()){
            case "plain": return frames.get(0);
            case "ornate": return frames.get(1);
            case "lavish": return frames.get(2);
            default: throw new DataException("Name not found!");
        }
    }

    @Override
    public double getGlassPrice() throws DataException {
        return glassPrice;
    }
}
