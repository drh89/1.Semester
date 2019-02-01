package teamwork;

import java.util.ArrayList;

public class Team {
    
    private int id;
    private String name;
    private ArrayList<User> members;
    
    public Team(int teamId, String teamName){
        this.id = teamId;
        this.name = teamName;
        members = new ArrayList<>();
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the members
     */
    public ArrayList<User> getMembers() {
        return members;
    }

    /**
     * @param members the members to set
     */
    public void setMembers(ArrayList<User> members) {
        this.members = members;
    }
    
    
    
}