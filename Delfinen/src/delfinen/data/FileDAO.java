package delfinen.data;

import delfinen.logic.Result;
import delfinen.logic.CasualSwimmer;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Niklas
 */
public class FileDAO implements DataAccessor {

    private String swimmersPath = "swimmers.txt";
    private String resultsPath = "results.txt";
    private ArrayList<CasualSwimmer> swimmers;
    private ArrayList<Result> results;
    private ArrayList<CasualSwimmer> swimmersInput;

// CasualSwimmer handling
    @Override
    public void printSwimmer(CasualSwimmer swimmer) {
        ObjectOutputStream out = null;
        swimmers = new ArrayList<>();
        swimmers = (ArrayList<CasualSwimmer>) loadSwimmersFromFile();
        try {
            swimmers.add(swimmer);
            out = new ObjectOutputStream(new FileOutputStream(swimmersPath));
            out.writeObject(swimmers);
            out.flush();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void printList(List<CasualSwimmer> swim) {
        ObjectOutputStream out = null;
        try {
            out = new ObjectOutputStream(new FileOutputStream(swimmersPath));
            out.writeObject(swim);
            out.flush();
        } catch (IOException ex) {
            Logger.getLogger(FileDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public CasualSwimmer getSwimmer(int id) {
        swimmersInput = loadSwimmersFromFile();
        for (CasualSwimmer swimmer : swimmersInput) {
            if (swimmer.getId() == id) {
                return swimmer;
            }
        }
        return null;
    }

    @Override
    public List<CasualSwimmer> getNotPaid() {
        List<CasualSwimmer> notPaid = new ArrayList<>();
        swimmersInput = loadSwimmersFromFile();
        for (CasualSwimmer swimmer : swimmersInput) {
            if (swimmer.isPaid() == false) {
                notPaid.add(swimmer);
            }
        }
        return notPaid;
    }

    @Override
    public ArrayList<CasualSwimmer> loadSwimmersFromFile() {
        ObjectInputStream in = null;
        swimmers = new ArrayList<>();
        try {
            in = new ObjectInputStream(new FileInputStream(swimmersPath));
            swimmers = (ArrayList<CasualSwimmer>) in.readObject();
        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        return swimmers;
    }

// Result handling
    @Override
    public void saveResult(Result result) {
        ObjectOutputStream out = null;
        results = new ArrayList<>();
        results = loadResults();
        try {
            results.add(result);
            out = new ObjectOutputStream(new FileOutputStream(resultsPath));
            out.writeObject(results);
            out.flush();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public ArrayList<Result> loadResults() {
        ObjectInputStream in = null;
        ArrayList<Result> temp = new ArrayList<>();
        try {
            in = new ObjectInputStream(new FileInputStream(resultsPath));
            temp = (ArrayList<Result>) in.readObject();
        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        return temp;
    }
}
