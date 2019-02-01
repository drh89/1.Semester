package delfinen.data;

import delfinen.logic.Result;
import delfinen.logic.CasualSwimmer;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Niklas
 */
public interface DataAccessor {

    public void printSwimmer(CasualSwimmer swimmer);

    public CasualSwimmer getSwimmer(int id);

    public void printList(List<CasualSwimmer> swim);

    public List<CasualSwimmer> loadSwimmersFromFile();

    public void saveResult(Result result);

    public ArrayList<Result> loadResults();
    
    public List<CasualSwimmer> getNotPaid();

}
