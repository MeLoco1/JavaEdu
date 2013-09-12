import java.io.*;
import java.util.ArrayList;

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

    public static void readFile() throws IOException {

        BufferedReader inputStream = null;
        try {
            inputStream = new BufferedReader(new FileReader("/home/loco/JavaEdu/Lessons/IO/Input"));
            String l;
            while ((l = inputStream.readLine()) != null) {
                fileLines.add(l);
            }
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
        }
    }

    public static void writeFile() throws IOException {

        PrintWriter outputStream = null;
        outputStream = new PrintWriter(new FileWriter("/home/loco/JavaEdu/Lessons/IO/outputbuffer"));

        try {
            for (String line : fileLines) {
                outputStream.println(line);
            }
        } finally {
            if (outputStream != null) {
                outputStream.close();
            }
        }
    }

}
