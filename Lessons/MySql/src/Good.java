import java.sql.*;

/**
 * Created with IntelliJ IDEA.
 * User: loco
 * Date: 8/11/13
 * Time: 1:30 PM
 * To change this template use File | Settings | File Templates.
 */
public class Good {
    private int id;
    private String name;
    private String producer;
    private int price;

    public Good(int id, String name, String producer, int price) {
        this.id = id;
        this.name = name;
        this.producer = producer;
        this.price = price;
    }

    public void insertGood(PreparedStatement insertGood) throws SQLException {
        insertGood.setInt(1, id);
        insertGood.setString(2, name);
        insertGood.setString(3, producer);
        insertGood.setInt(4, price);
        insertGood.executeUpdate();
    }


    /**
     * Заполнить таблицу 5 значениями и вывести на экран товары в интервале цен.
     */
}
