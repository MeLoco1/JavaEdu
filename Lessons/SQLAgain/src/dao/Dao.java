package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created with IntelliJ IDEA.
 * User: loco
 * Date: 10/27/13
 * Time: 1:20 PM
 * To change this template use File | Settings | File Templates.
 */
public interface Dao {
    public void connect() throws Exception;

    public ResultSet executeSelect(String query) throws Exception;

    public boolean executeUpdate(String executeQuery);

    public boolean disconnect() throws SQLException;


}
