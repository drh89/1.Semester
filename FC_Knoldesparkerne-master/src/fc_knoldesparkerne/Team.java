package fc_knoldesparkerne;

import java.awt.Point;
import java.util.ArrayList;

/**
 *
 * @author RODA
 */
public class Team {
    private String name;
    private ArrayList<Player> players;
    private Player coach;

    public Team(String name){
        this.name = name;
        players = new ArrayList();
    }
    
    public String getName(){
        return name;
    }

    public ArrayList<Player> getPlayers() {
        
        return players;

    }
    public Player getPlayer(int i){
        return players.get(i);
    }
    
    public Player getCoach(){
        return coach;
    }
    
    public void setCoach(Player coach){
        this.coach = coach;
    }
    
    public void add(Player player){
        if(players.contains(player)){
            return;
        }
        players.add(player);
    }
    
    public boolean remove(Player player){
        return players.remove(player);
    }
}
