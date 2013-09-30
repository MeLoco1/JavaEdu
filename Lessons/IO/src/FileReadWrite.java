import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: loco
 * Date: 9/11/13
 * Time: 8:06 PM
 * To change this template use File | Settings | File Templates.
 */
public class FileReadWrite {
    private static ArrayList<String> fileLines = new ArrayList<String>();

    public static void setFileLines(ArrayList<String> fileLines) {
        FileReadWrite.fileLines = fileLines;
    }

    public static ArrayList<String> getFileLines() {

        return fileLines;
    }

    public static List<String> readFile(String path) throws IOException {

        ArrayList<String> result = new ArrayList<>();
        BufferedReader inputStream = null;
        try {
           // inputStream = new BufferedReader(new FileReader("/home/loco/JavaEdu/Lessons/IO/Input"));
            inputStream = new BufferedReader(new FileReader(path));

            String l;
            while ((l = inputStream.readLine()) != null) {
                result.add(l);
            }
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
        }
        return result;
    }

    public static void writeFile(String path, List<String> strings) {


        try (PrintWriter outputStream = new PrintWriter(new FileWriter(path, true))) {

            for (String line : strings) {
                outputStream.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
