import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created with IntelliJ IDEA.
 * User: loco
 * Date: 9/13/13
 * Time: 11:00 PM
 * To change this template use File | Settings | File Templates.
 */
public class GUI {
    public static String menu() {

        String result = null;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("------Enter the file name------");
            result = br.readLine();
            if (!result.matches(".*\\.txt"))
                throw new WrongFileName("Wrong file name");

        } catch (IOException e) {
            e.printStackTrace();
        } catch (WrongFileName wrongFileName) {
            wrongFileName.getMessage();
            wrongFileName.printStackTrace();
            System.exit(0);
        }

        return result;
    }


}
