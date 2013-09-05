import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: loco
 * Date: 9/3/13
 * Time: 11:46 PM
 * To change this template use File | Settings | File Templates.
 */
public class WorkWithFile {


    public static ArrayList<Dot> readFile(File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        ArrayList<Dot> dots = new ArrayList<Dot>();

        while (scanner.hasNext()) {
            String[] line = scanner.nextLine().split(",");
            dots.add(new Dot(Integer.parseInt(line[0]), Integer.parseInt(line[1])));
        }
        return dots;
    }
}



