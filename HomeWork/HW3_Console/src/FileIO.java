import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: loco
 * Date: 7/19/13
 * Time: 8:55 PM
 * To change this template use File | Settings | File Templates.
 */
public class FileIO {
    static public void save(File file, ArrayList<String> strings) throws IOException {
        FileWriter filewriter = new FileWriter(file, true);
        for (String line : strings) {
            filewriter.append(line);
            filewriter.append(System.getProperty("line.separator"));
        }
        filewriter.flush();
        filewriter.close();
    }

    static public ArrayList<String> load(File file) throws FileNotFoundException {
        ArrayList<String> result = new ArrayList<String>();
        Scanner scan = new Scanner(file);
        while (scan.hasNextLine()) {
            result.add(scan.nextLine());
        }
        return result;
    }
}
