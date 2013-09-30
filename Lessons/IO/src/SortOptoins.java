import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created with IntelliJ IDEA.
 * User: loco
 * Date: 9/11/13
 * Time: 8:19 PM
 * To change this template use File | Settings | File Templates.
 */
public class SortOptoins {
    public static void main(String[] args) throws IOException {
        char c = 0;

        System.out.println("Press 1 for ASC, 2 for DESC or 'Q' to quit");
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            c = (char) br.read();
        } catch (IOException e) {
            e.printStackTrace();
        }


        FileReadWrite.readFile("Path to the file");
        if (c == '1') {
            FileReadWrite.setFileLines(Sort.sortAsc(FileReadWrite.getFileLines()));
        } else if (c == '2') {
            FileReadWrite.setFileLines(Sort.sortDesc(FileReadWrite.getFileLines()));
        } else System.out.println("Wrong choice");
        FileReadWrite.writeFile("/home/loco/JavaEdu/Lessons/IO/output", FileReadWrite.getFileLines());
    }
}
