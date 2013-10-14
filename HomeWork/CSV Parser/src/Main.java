import org.postgresql.util.PSQLException;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        System.out.println("Start");
        ArrayList<String> fileLines = null;
        try {
            fileLines = (ArrayList<String>) FileReadWrite.readFile("/home/loco/Downloads/DB/Homework data.csv");

//            fileLines = (ArrayList<String>) FileReadWrite.readFile(args[0]);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("CSV-file has been read");

        Parser parser = new Parser();
        ArrayList<String> file = (ArrayList<String>) parser.parse(fileLines);

        Class.forName("org.postgresql.Driver");
        Connection connection = null;
        connection = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/MyDB", "postgres", "1");

        System.out.println("Connection has been created");
        for (String fileLine : file) {
            fileLine = fileLine.replaceAll(";", "; ");
            System.out.println(fileLine);
            String[] string = fileLine.split(";");
            if (string.length != 8) {
                System.out.println("Wrong CSV-file structure on line " + fileLine.indexOf(fileLine));
                System.exit(0);
            }
            PreparedStatement insert = connection.prepareStatement("INSERT INTO import_table (name, series, " +
                    "doc_number, street_address, house_number_address, street_property, house_number_property, share ) " +
                    "VALUES (?, ?, ?, ?, ?, ?, ?, ?);");

            try {
                insert.setString(1, string[0].trim());
                insert.setString(2, string[1].trim());
                insert.setInt(3, Integer.parseInt(string[2].trim()));
                insert.setString(4, string[3].trim());
                insert.setInt(5, Integer.parseInt(string[4].trim()));
                insert.setString(6, string[5].trim());
                if (string[6].trim().equals("")) {
                    insert.setInt(7, 0);
                } else
                    insert.setInt(7, Integer.parseInt(string[6].trim()));

                if (string[7].trim().equals("")) {
                    insert.setFloat(8, 0);
                } else
                    insert.setFloat(8, Float.parseFloat(string[7].trim()));

                insert.executeUpdate();
                System.out.println("Row inserted");
            } catch (PSQLException e) {
                System.out.println("Wrong CSV-file structure on line " + fileLine.indexOf(fileLine) + 1);
                e.printStackTrace();
                System.exit(1);
            } catch (NumberFormatException e) {
                System.out.println("Wrong CSV-file structure on line " + fileLine.indexOf(fileLine) + 1);
                e.printStackTrace();
                System.exit(1);
            }
        }

        System.out.println("Done");
        connection.close();
    }
}
