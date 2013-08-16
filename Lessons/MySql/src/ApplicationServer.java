import java.sql.*;

/**
 * Created with IntelliJ IDEA.
 * User: loco
 * Date: 8/13/13
 * Time: 7:34 PM
 * To change this template use File | Settings | File Templates.
 */
public class ApplicationServer {
    public void getGoodsInPriceRange(Connection connection, int fromPrice, int toPrice) throws SQLException {
        String sql = "SELECT id, name, producer, price FROM test.Goods WHERE price BETWEEN ? AND ?";
        PreparedStatement stmt = connection.prepareStatement(sql);
        stmt.setInt(1, fromPrice);
        stmt.setInt(2, toPrice);
        System.out.println(stmt.toString());
        ResultSet rs = stmt.executeQuery();

        System.out.println("Goods from " + fromPrice + " to " + toPrice);
        while (rs.next()) {
            //Retrieve by column name
            int id = rs.getInt("id");
            String name = rs.getString("name");
            String first = rs.getString("producer");
            String last = rs.getString("price");

            //Display values
            System.out.print("ID: " + id);
            System.out.print(", Name: " + name);
            System.out.print(", Producer: " + first);
            System.out.println(", Price: " + last);
        }

        System.out.println("--------------");
        rs.close();
        stmt.close();


    }
}
