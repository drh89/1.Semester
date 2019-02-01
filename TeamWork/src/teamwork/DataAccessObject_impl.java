package teamwork;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class DataAccessObject_impl {

    private DBConnector connector;

    public DataAccessObject_impl(DBConnector connector) throws SQLException {
        connector = null;
    }

    public ArrayList<User> getTeamMembers(int team_id) throws SQLException {
        ArrayList<User> users = new ArrayList();
        connector = new DBConnector();
        
        String query = "SELECT u.user_id, u.username, u.password, u.admin "
                + "FROM `user` u INNER JOIN team_member tm ON "
                + "u.user_id = tm.user_id "
                + "WHERE team_id = " + team_id + ";";
        
        Connection connection = connector.getConnection();
        Statement stmt = connection.createStatement();
        ResultSet rs = stmt.executeQuery(query);
        while (rs.next()) {
            int userId = rs.getInt("user_id");
            String userName = rs.getNString("username");
            String password = rs.getNString("password");
            int admin = rs.getInt("admin");

            User user = new User(userId, userName, password, admin);
            users.add(user);
        }

        return users;

    }

    public ArrayList<Team> getTeams() throws SQLException {
        ArrayList<Team> teams = new ArrayList();
        connector = new DBConnector();
        
        String query = "SELECT * FROM team";
        
        Connection connection = connector.getConnection();
        Statement stmt = connection.createStatement();
        ResultSet rs = stmt.executeQuery(query);
        while (rs.next()) {
            int teamId = rs.getInt("team_id");
            String teamName = rs.getNString("teamname");

            Team team = new Team(teamId, teamName);
            teams.add(team);
        }
        for (int i = 0; i < teams.size() - 1; i++) {
            for (User user : getTeamMembers(i + 1)) {
                teams.get(i).getMembers().add(user);
            }
        }
        return teams;
    }

    public Team getTeam(int id) throws SQLException {
        Team finalTeam = null;
        for (Team team : getTeams()) {
            if (team.getId() == id) {
                finalTeam = team;
            }
        }

        return finalTeam;
    }

    public Team getTeam(String teamname) throws SQLException {
        Team finalTeam = null;
        for (Team team : getTeams()) {
            if (team.getName().equalsIgnoreCase(teamname)) {
                finalTeam = team;
            }
        }
        return finalTeam;
    }

    public ArrayList<User> getUsers() throws SQLException {
        ArrayList<User> users = new ArrayList();
        for (Team team : getTeams()) {
            for (User user : team.getMembers()) {
                users.add(user);
            }
        }
        return users;
    }

    public User getUser(int id) throws SQLException {
        User finalUser = null;
        for (User user : getUsers()) {
            if (user.getId() == id) {
                finalUser = user;
            }
        }
        return finalUser;
    }

    public User getUser(String username) throws SQLException {
        User finalUser = null;
        for (User user : getUsers()) {
            if (user.getUserName().equalsIgnoreCase(username)) {
                finalUser = user;
            }
        }
        return finalUser;
    }

}
