package dao;

import Data.Car;
import Data.Ship;
import Data.User;

import java.sql.*;

/**
 * Created with IntelliJ IDEA.
 * User: loco
 * Date: 11/8/13
 * Time: 11:19 PM
 * To change this template use File | Settings | File Templates.
 */
public class Dao {
    private String url = "jdbc:postgresql://localhost:5432/MyDB";
    private Connection conn = null;
    private Statement statement = null;

    public void connect() throws Exception {
        Class.forName("org.postgresql.Driver");
        conn = DriverManager.getConnection(url, DaoProperties.getLogin(), DaoProperties.getPassword());
        System.out.println("Database connection established");
        statement = conn.createStatement();
    }

    public boolean disconnect() {
        try {
            if (conn != null) {
                conn.close();
                System.out.println("Database connection closed");
            }
            if (statement != null) {
                statement.close();
                System.out.println("Statement closed");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public ResultSet executeSelect(String query) throws SQLException {
        if (query != null) {
            return statement.executeQuery(query);
        } else return null;
    }

    public void insertCar(Car car) throws SQLException {
        PreparedStatement insert = conn.prepareStatement("INSERT INTO cars (name) " +
                "VALUES (?);");
        insert.setString(1, car.getName());
        insert.execute();
        System.out.println("Car " + car.getName() + " inserted");
    }

    public void insertShip(Ship ship) throws SQLException {
        PreparedStatement insert = conn.prepareStatement("INSERT INTO ships (name) " +
                "VALUES (?);");
        insert.setString(1, ship.getName());
        insert.execute();
        System.out.println("Ship " + ship.getName() + " inserted");
    }

    public void insertUser(User user) throws SQLException {
        PreparedStatement insert = conn.prepareStatement("INSERT INTO users (name, surname, age, salary, nationality) " +
                "VALUES (?,?,?,?,?);");
        insert.setString(1, user.getName());
        insert.setString(2, user.getSurName());
        insert.setInt(3, user.getAge());
        insert.setInt(4, user.getSalary());
        insert.setString(5, "UA");
        insert.execute();
        System.out.println("User " + user + " inserted");
    }
}
