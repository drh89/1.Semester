package fc_knoldesparkerne;

import java.sql.Time;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author RODA
 */
public class Controller {
    private int jun = 450;
    private int yng = 550;
    private int sen = 650;

    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.test();
    }

    public void test() {
        Team kvinder = new Team("Kvinder");
        Team drengeU17 = new Team("Drenge U17");
        ArrayList<Team> teams = new ArrayList<>();

        ArrayList<Player> drengeU17Players = new ArrayList<>();
        drengeU17Players.add(0, new Player("Dennis", 2000));    // represents u19 player.
        drengeU17Players.add(1, new Player("Brian", 2003));
        drengeU17Players.add(2, new Player("Hans", 2002));
        drengeU17Players.add(3, new Player("Jørgen", 2002));
        drengeU17Players.add(4, new Player("Henrik", 2003));
        drengeU17Players.add(5, new Player("Poul", 2002));

        for (Player player : drengeU17Players) {                // adds players to team player array.
            drengeU17.add(player);
        }
        for (Player player : drengeU17.getPlayers()) {
            if (player.equals(drengeU17.getPlayer(4))) {        // doesnt register payment for Henrik.
                continue;
            }

            for (int year = 2015; year < 2019; year++) {        // register payment for years 2015-2018. 
                player.registerPayment(year);

            }

        }

        ArrayList<Player> kvindePlayers = new ArrayList<>();
        kvindePlayers.add(0, new Player("Trine", 1988));
        kvindePlayers.add(1, new Player("Lone", 1990));
        kvindePlayers.add(2, new Player("Henriette", 1991));
        kvindePlayers.add(3, new Player("Maria", 1992));
        kvindePlayers.add(4, new Player("Liv", 1990));
        kvindePlayers.add(5, new Player("Dina", 1995));

        for (Player player : kvindePlayers) {             // adds players to team player array.
            kvinder.add(player);
        }

        kvinder.setCoach(kvinder.getPlayer(0));             // sets coach for kvinder.
        drengeU17.setCoach(kvinder.getPlayer(1));           // sets coach for drengeu17.
        
        
        teams.add(drengeU17);                               // adds teams to team array
        teams.add(kvinder);

        for (Player player : kvinder.getPlayers()) {
            if (player.equals(kvinder.getPlayer(5))) {      // doesnt register payment for Dina.
                continue;
            }
            if (player.equals(kvinder.getPlayer(4))) {      // doesnt register payment for Liv.
                continue;
            }
            for (int year = 2015; year < 2019; year++) {
                player.registerPayment(year);               // register payment for years 2015-2018.

            }

        }

        // getPlayers()
//        for (Player player : getPlayers(kvinder)) {                                       // returns full roster for the team.
//            System.out.println(player.getName());
//            
//        }


        // getPlayer()
//        System.out.println(getPlayer(kvinder, "lone").getName());                         // returns Lone.  


        // getCoach() 
//        System.out.println(getCoach(teams, "drenge U17").getName());                      // returns Lone since she is assigned as trainer for the team.


        // notPaid()
//        for (Player player : notPaid(kvinder, 2018)) {                                    // returns Liv & Dina, since they are the ones who have not payed. (Line 65 - 70)
//              System.out.println(player.getName());
//            
//        }


        // isCoach()
//        System.out.println(isCoach(teams, kvinder.getPlayer(0)));                         // returns true, because she is assigned as coach. (line 59)
//        System.out.println(isCoach(teams, kvinder.getPlayer(1)));                         // returns true, because she is assigned as coach. (line 60)
//        System.out.println(isCoach(teams, kvinder.getPlayer(3)));                         // returns false, because she is not assigned as coach. (line 59) 


        // getPaymentPerAge()
//        System.out.println(getPaymentPerAge(19));                                         // returns 650.
//        System.out.println(getPaymentPerAge(18));                                         // returns 550.
//        System.out.println(getPaymentPerAge(16));                                         // returns 450.


        // calculatePayment()     
//        System.out.println(calculatePayment(kvinder.getPlayer(4), teams, 2018));          // returns 650 because she is senior player.
//        System.out.println(calculatePayment(drengeU17.getPlayer(0), teams, 2018));        // returns 550 because he is u19 player.
//        System.out.println(calculatePayment(drengeU17.getPlayer(1), teams, 2018));        // returns 450 because he is a junior player.
//        System.out.println(calculatePayment(kvinder.getPlayer(0), teams, 2018));          // returns 0 because she is coach.


        // getExpecetedRevenue()
//        System.out.println(getExpectedRevenue(kvinder, 2018));                            // 2 players have not payed. returns 2600.
//        System.out.println(getExpectedRevenue(drengeU17, 2018));                          // 1 player has not payes. returns 2250.


        // missingRevenue()
//        System.out.println(missingRevenue(teams, 2017));                                  // 2 senior players have not paid and 1 junior player has not payed. should return 1750.
    }

    public ArrayList<Player> getPlayers(Team team) {

        return team.getPlayers();
    }

    public Player getPlayer(Team team, String playername) {
        for (Player player : team.getPlayers()) {

            if (player.getName().equalsIgnoreCase(playername)) {

                return player;
            }

        }

        return null;

    }

    public Player getCoach(ArrayList<Team> teams, String teamname) {
        for (Team team : teams) {

            if (team.getName().equalsIgnoreCase(teamname)) {

                return team.getCoach();
            }

        }

        return null;
    }

    public ArrayList<Player> notPaid(Team team, int year) {
        ArrayList<Player> notPaid = new ArrayList<>();

        for (Player player : team.getPlayers()) {
            if (!player.getYearsPaid().contains(year)) {

                notPaid.add(player);

            }

        }

        return notPaid;
    }

    public boolean isCoach(ArrayList<Team> teams, Player player) {
        for (Team team : teams) {
            for (int i = 0; i < team.getPlayers().size(); i++) {
                if (player.equals(team.getCoach())) {
                    return true;
                }
            }

        }
        return false;
    }

    public int getPaymentPerAge(int age) {
        if (age < 17) {
            return jun;
        }
        if (age >= 17 && age < 19) {
            return yng;
        }
        return sen;
    }

    public int calculatePayment(Player player, ArrayList<Team> teams, int year) {
       

        for (Team team : teams) {

            if (team.getPlayers().contains(player)) {
                if (player.equals(team.getCoach())) {
                    return 0;
                }
                if ((year - player.getBirthYear()) < 17) {
                    return jun;
                }
                if ((year - player.getBirthYear()) >= 17 && (year - player.getBirthYear()) < 19) {
                    return yng;
                }

            }

        }

        return sen;
    }

    public int getExpectedRevenue(Team team, int year) {
        int count = 0;
        int age = year - team.getPlayer(team.getPlayers().size() - 1).getBirthYear();
        int payment = 0;
        

        if (age < 17) {
            payment = jun;
        }
        if (age >= 17 && age < 19) {
            payment = yng;
        }
        if (age > 19) {
            payment = sen;
        }

        for (Player player : team.getPlayers()) {
            if (player.getYearsPaid().contains(year)) {
                count++;

            }

        }
        return count * payment;

    }

    public int missingRevenue(ArrayList<Team> teams, int year) {
        int miss = 0;
        
        for (Team team : teams) {
            int age = year - team.getPlayer(team.getPlayers().size() - 1).getBirthYear();
            for (Player player : team.getPlayers()) {
                if (!player.getYearsPaid().contains(year)) {
                    if (age < 17) {
                        miss += jun;
                    }
                    if (age >= 17 && age < 19) {
                        miss += yng;
                    }
                    if (age > 19) {
                        miss += sen;
                    }
                }

            }

        }
        return miss;
    }

}
