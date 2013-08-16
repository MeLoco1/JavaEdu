import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException, InterruptedException {
	    File file = new File("/home/loco/JavaEdu/HomeWork/HW4_2/out/production/HW4_2/Общий");
        Scanner scanner = new Scanner(file);
        while (scanner.hasNext()) {
            System.out.println(scanner.next());
            Thread.sleep(1000 * Options.DELAY);
        }
    }
}
