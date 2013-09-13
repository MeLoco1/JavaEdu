import java.io.*;
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
        String file = readFile(path);
        file = file.replaceAll(" ", "");
        calculateAndPrintStats(file);

    }

    private void calculateAndPrintStats(String string) {

        while (string.length() != 0) {
            char symbol = string.charAt(0);
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

    public void FileWordsStats(String path) {

        List<String> listFileString = prepareCollection(readFile(path));

        switch (gui()) {
            case 1:
                Collections.sort(listFileString);
                break;
            case 2:
                Collections.sort(listFileString, Collections.reverseOrder());
                break;
            case 3:
                Collections.sort(listFileString, new ByLengthAsc());
                break;
            case 4:
                Collections.sort(listFileString, new ByLengthDesc());
                break;
        }
        for (String item : listFileString)
            System.out.println(item);
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
