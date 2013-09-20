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


    private List<String> prepareCollection(String string) {
        System.out.println("---------------");
        string = string.replaceAll("\\.", " ");
        string = string.replaceAll("\\?", " ");
        string = string.replaceAll("\\-", " ");
        string = string.replaceAll(":", " ");
        string = string.replaceAll("!", " ");
        string = string.replaceAll(",", " ");

        List<String> result = Arrays.asList(string.split(" "));
        return result;
    }

    private int gui() {
        char c = 0;

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            boolean correct = false;
            while (!correct) {
                System.out.println("------Choice how you wanna sort the file");
                System.out.println(" 1 - Alphabet order");
                System.out.println(" 2 - Alphabet order descending");
                System.out.println(" 3 - By word length");
                System.out.println(" 3 - By word length descending");
                System.out.println(" q - Quit");
                System.out.println(" ------------------ ");

                c = (char) br.read();
                if ((c == '1') || (c == '2') || (c == '3') || (c == '4') || (c == 'q')) {
                    System.out.println("Your choice is: " + c);
                    correct = true;
                } else System.out.println("Wrong choice");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return Character.getNumericValue(c);
    }
}
