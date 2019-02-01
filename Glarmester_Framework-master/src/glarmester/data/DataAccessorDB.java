/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glarmester.data;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dennis
 */
public class DataAccessorDB implements DataAccessor {

    private DBConnector con;

    public DataAccessorDB() throws SQLException {
        con = new DBConnector();
    }

    public static void main(String[] args) throws DataException, SQLException {
        DataAccessorDB db = new DataAccessorDB();
        System.out.println(db.getGlassPrice());
    }

    @Override
    public List<Frame> getFrames() throws DataException {
        ArrayList<Frame> frames = new ArrayList<>();
        try {

            String query = "SELECT * FROM frames;";
            Connection connection = con.getConnection();
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {

                String frameName = rs.getNString("frame_name");
                int framePrice = rs.getInt("frame_price");

                Frame frame = new Frame(frameName, framePrice);
                frames.add(frame);

            }

        } catch (SQLException ex) {
            ex.getMessage();
        }

        return frames;

    }

    @Override
    public Frame getFrame(String name) throws DataException {

        Frame finalFrame = new Frame("", 0);

        try {

            String query = "SELECT * FROM frames WHERE frame_name = '" + name + "';";
            Connection connection = con.getConnection();
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                String frameName = rs.getString("frame_name");
                double framePrice = rs.getInt("frame_price");

                Frame frame = new Frame(frameName, framePrice);
                finalFrame = frame;

            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return finalFrame;
    }

    @Override
    public double getGlassPrice() throws DataException {
        double price = 0;

        try {

            String query = "SELECT * FROM glass";
            Connection connection = con.getConnection();
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                price = rs.getInt("glass_price");
            }

        } catch (SQLException ex) {
            ex.getMessage();
        }
        return price;

    }

}
