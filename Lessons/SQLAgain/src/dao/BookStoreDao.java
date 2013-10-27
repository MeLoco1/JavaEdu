package dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import store.Document;

/**
 * Created with IntelliJ IDEA.
 * User: loco
 * Date: 10/27/13
 * Time: 1:24 PM
 * To change this template use File | Settings | File Templates.
 */
public class BookStoreDao implements Dao {
    private String url = "jdbc:postgresql://localhost:5432/MyDB";
    private Connection conn = null;
    private Statement statement = null;

    public List<Document> getDocs(ResultSet set) throws Exception {
        if (set == null) throw new Exception("Set doesn't exist");
        List<Document> docs = new ArrayList<Document>();
        while (set.next()) {
            String serie = set.getString("series");
            int number = set.getInt("number");
            docs.add(new Document(number, serie));
        }
        return docs;
    }

    @Override
    public void connect() throws Exception {
        Class.forName("org.postgresql.Driver");
        conn = DriverManager.getConnection(url, DaoProperties.getLogin(), DaoProperties.getPassword());
        System.out.println("Database connection established");
        statement = conn.createStatement();
    }

    @Override
    public ResultSet executeSelect(String query) throws SQLException {
        if (query != null) {
            return statement.executeQuery(query);
        } else return null;
    }

    @Override
    public boolean executeUpdate(String updateQuery) {
        try {
            statement.executeUpdate(updateQuery);
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
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
}
