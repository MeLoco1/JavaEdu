import java.sql.*;

public class Main {

    // JDBC driver name and database URL
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/test";

    //  Database credentials
    static final String USER = "root";
    static final String PASS = "";

    public static void main(String[] args) {
        /**
         * Как подключиться к серверу
         *
         */

        Connection conn = null;
        Statement stmt = null;

        try {
            //STEP 2: Register JDBC driver
            Class.forName(JDBC_DRIVER);

            //STEP 3: Open a connection
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

//            // Insert Data
//            System.out.println("Inserting Data...");
//            PreparedStatement insertEmployees = conn.prepareStatement("INSERT INTO test.Employees VALUES (?, ?, ?, ?);");
//            insertEmployees.setInt(1, 2);
//            insertEmployees.setString(2, "Vasya");
//            insertEmployees.setString(3, "Pupkin");
//            insertEmployees.setInt(4, 34);
//            insertEmployees.executeUpdate();

            // Insert Goods
            PreparedStatement insertGood = conn.prepareStatement("INSERT INTO test.Goods VALUES (?, ?, ?, ?);");
            Good good1 = new Good(0, "Laptop", "Me", 1500);
            Good good2 = new Good(1, "PC", "Me", 1000);
            Good good3 = new Good(2, "Guitar", "Me", 1700);
            Good good4 = new Good(3, "Car", "Me", 34000);
            Good good5 = new Good(4, "Bike", "Me", 10500);
//            good1.insertGood(insertGood);
//            good2.insertGood(insertGood);
//            good3.insertGood(insertGood);
//            good4.insertGood(insertGood);
//            good5.insertGood(insertGood);

            ApplicationServer appSrv = new ApplicationServer();
            appSrv.getGoodsInPriceRange(conn, 2000, 20000);

            //STEP 4: Execute a query
            System.out.println("Creating statement...");
            stmt = conn.createStatement();
            String sql;
            sql = "SELECT id, first, last, age FROM Employees";
            ResultSet rs = stmt.executeQuery(sql);

            //STEP 5: Extract data from result set

            while (rs.next()) {
                //Retrieve by column name
                int id = rs.getInt("id");
                int age = rs.getInt("age");
                String first = rs.getString("first");
                String last = rs.getString("last");

                //Display values
                System.out.print("ID: " + id);
                System.out.print(", Age: " + age);
                System.out.print(", First: " + first);
                System.out.println(", Last: " + last);
            }

            //STEP 6: Clean-up environment
            rs.close();
            stmt.close();
            conn.close();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}


/**
 *  Есть бесконечная ЖД.
 *  Есть точка на ЖД. Единственная остановка.
 *  Слева и справа от остановки находится по одному паровозику.
 *  Оба паровозика двигаются слева на право.
 *  Есть три команды:
 *  move - паровозик совершает 1 шаг.
 *  goto - есть параметр - строчка кода куда перейти.
 *  ifstop - есть параметр - любая из 3 команд. Аргумент выполняется только на остановке. Уходит два такта времени
 *
 *  Написать одну программу. Установить ее на оба локомотива.
 *
 *  0 move
 *  1 ifstop(3)
 *  2 goto(0)
 *  3 move
 *  4 goto(3)
 */
