import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: loco
 * Date: 9/12/13
 * Time: 9:37 PM
 * To change this template use File | Settings | File Templates.
 */
public class WorkWithFile {

    public static List<String> readFile(String path) {
        List<String> result = new ArrayList<>();

        try (BufferedReader inputStream = new BufferedReader(new FileReader(path))) {

            String line;
            while ((line = inputStream.readLine()) != null)
                result.add(line);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return result;
    }

    public static void writeFile(List<String> fileLines) {

        PrintWriter outputStream = null;
        try {
            outputStream = new PrintWriter(new FileWriter("/home/loco/JavaEdu/HomeWork/Collcetions/Words/2"));
            for (String line : fileLines) {
                outputStream.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (outputStream != null) {
                outputStream.close();
            }
        }
    }
}
