package dao;

import java.sql.Connection;
import java.sql.Statement;

/**
 * Created with IntelliJ IDEA.
 * User: loco
 * Date: 10/27/13
 * Time: 1:26 PM
 * To change this template use File | Settings | File Templates.
 */
public class DaoProperties {
    private static String login = "postgres";
    private static String password = "1";


    public static String getLogin() {
        return login;
    }

    public static String getPassword() {
        return password;
    }
}
