package teamwork;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBConnector {

    private Connection connection = null;

    //Constants
    private static final String IP = "localhost";
    private static final String PORT = "3306";
    public static final String DATABASE = "teamwork";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "lorteleo11";

    public DBConnector() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            String url = "jdbc:mysql://" + IP + ":" + PORT + "/" + DATABASE;
            Properties props = new Properties();
            props.put("user", USERNAME);
            props.put("password", PASSWORD);
            props.put("allowMultiQueries", true);
            props.put("useUnicode", true);
            props.put("useJDBCCompliantTimezoneShift", true);
            props.put("useLegacyDatetimeCode", false);
            props.put("serverTimezone", "CET");
            this.connection = (Connection) DriverManager.getConnection(url, props);
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
            ex.printStackTrace();
            throw new SQLException(ex.getMessage());
        }
    }

    public Connection getConnection() {
        return this.connection;
    }
}
