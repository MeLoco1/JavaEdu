package AbsFactoryExample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created with IntelliJ IDEA.
 * User: loco
 * Date: 11/7/13
 * Time: 7:43 PM
 * To change this template use File | Settings | File Templates.
 */
public class Server {
    public static void main(String[] args) {
        String query;


        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            Options options = new Options();
            System.out.println("-------------------------");
            System.out.println("     Enter the query:    ");
            System.out.println("-------------------------");

            query = bufferedReader.readLine();

            System.out.println("Format type: ");
            String formatType = bufferedReader.readLine();

            System.out.println("Register type: ");
            String registerType = bufferedReader.readLine();

            String result = options.getFormater(formatType).formatString(query);
            System.out.println(options.getRegistrable(registerType).applyRgister(result));


        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
