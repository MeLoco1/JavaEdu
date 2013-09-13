import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: loco
 * Date: 9/12/13
 * Time: 9:37 PM
 * To change this template use File | Settings | File Templates.
 */
public class WorkWithFile {

    private String readFile(String path) {
        String result = "";

        try (BufferedReader inputStream = new BufferedReader(new FileReader(path))) {

            String line;
            while ((line = inputStream.readLine()) != null) {
                result += line;
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return result;
    }

    public void fileStatistics(String path) {
        String file = null;
        file = readFile(path);
        file = file.replaceAll(" ", "");
        calculateAndPrintStats(file);

    }

    private void calculateAndPrintStats(String string) {
        System.out.println(string);

        for (int i = 0; i < string.length(); i++) {
            if ('.' == string.charAt(i)) {
            }
        }

        while (string.length() != 0) {
            char symbol = string.charAt(0);
            System.out.println(Character.toString(symbol));
            int counter = 0;
            for (int i = 0; i < string.length(); i++) {
                if (symbol == string.charAt(i)) {
                    counter++;
                }
            }

            string = string.replace(symbol, ' ');
            string = string.replaceAll(" ", "");
            System.out.println(String.valueOf(symbol) + " - " + counter);
        }


    }

}
