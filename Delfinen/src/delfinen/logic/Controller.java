package delfinen.logic;

import delfinen.data.DataAccessor;
import delfinen.data.FileDAO;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Niklas
 */
public class Controller {

    private FileDAO datas = new FileDAO();
    private DataAccessor data;
    CompetitionSwimmer compSwimmer;
    CasualSwimmer casualSwimmer;

    public Controller(DataAccessor data) {
        this.data = data;

    }

    public CompetitionSwimmer newCompSwimmer(int age, String name, Status status, String team, boolean paid) {
        compSwimmer = new CompetitionSwimmer(age, name, status, team, paid);

        return compSwimmer;
    }

    public void newCasualSwimmer(int age, String name, Status status, String team, boolean paid) {
        casualSwimmer = new CasualSwimmer(age, name, status, team, paid);
        printSwimmerToFile(casualSwimmer);

    }

    public void addDisciplines(ArrayList<Discipline> disciplineList, CompetitionSwimmer swimmer) {
        for (Discipline discipline : disciplineList) {
            swimmer.addDiscplines(discipline);

        }
        printSwimmerToFile(compSwimmer);
    }

    public void editSwimmer(int id, int age, String name, Status status, String team, boolean paid) {
        ArrayList<CasualSwimmer> swimmers = (ArrayList<CasualSwimmer>) data.loadSwimmersFromFile();
        for (CasualSwimmer swimmer : swimmers) {
            if (swimmer.getId() == id) {
                swimmer.setAge(age);
                swimmer.setName(name);
                swimmer.setStatus(status);
                swimmer.setTeam(team);
                swimmer.setPaid(paid);
            }
        }

        data.printList(swimmers);
    }

    public void printSwimmerToFile(CasualSwimmer swimmer) {
        if (data.loadSwimmersFromFile().isEmpty()) {
            swimmer.setId(1);
        }
        if (!data.loadSwimmersFromFile().isEmpty()) {
            int i = data.loadSwimmersFromFile().size() - 1;
            int j = data.loadSwimmersFromFile().get(i).getId();
            swimmer.setId(j + 1);
        }
        data.printSwimmer(swimmer);
    }

    public List<CasualSwimmer> swimmersFromFile() {
        return data.loadSwimmersFromFile();
    }

    public String getAllSwimmers() {
        return data.loadSwimmersFromFile().toString().replace("[", "").replace("]", "").replace(", ", "\n");
    }

    public String swimmersNotPaid() {
        return data.getNotPaid().toString().replace("[", "").replace("]", "").replace(", ", "\n");
    }

      public void removeSwimmer(int id) {
        ArrayList<CasualSwimmer> swimmers = (ArrayList<CasualSwimmer>) data.loadSwimmersFromFile();

        for (int i = 0; i < swimmers.size(); i++) {
            if (swimmers.get(i).getId() == id) {
                swimmers.remove(i);
            }
        }
        data.printList(swimmers);
    }

      
    public void newResult(int id, Discipline discipline, double time, double date, String competition) {
        Result trainResult = new Result(id, discipline, time, date, competition);

        data.saveResult(trainResult);
    }

    public void addResult(int id, Discipline discipline, Double result) {
        List<CasualSwimmer> list;
        list = data.loadSwimmersFromFile();
        for (CasualSwimmer swimmer : list) {
            if (swimmer.getId() == id) {
                double currentResult = ((CompetitionSwimmer) swimmer).getResult(discipline);
                int i = Double.compare(currentResult, result);
                if (i > 0) {
                    ((CompetitionSwimmer) swimmer).addResult(discipline, result);
                    data.printList(list);

                }
            }
        }
    }

    public String getTop5(Discipline discipline) {
        int t;
        ArrayList<Result> temp = new ArrayList<>();
        ArrayList<Result> results = new ArrayList<Result>();
        temp = data.loadResults();
        for(Result result : temp) {
            if(result.getDiscipline() == discipline) {
                results.add(result);
            }
        }
        results.sort(Comparator.comparingDouble(Result::getTime));
        t = results.size();
        return discipline.name() + "\n" + results.subList(0, t).toString().replace("[", "").replace("]", "").replace(", ", "\n");     
    }
}
