import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        File file = new File("/home/loco/JavaEdu/HomeWork/HW3_Console/Cons");
        Scanner scanConsole = new Scanner(System.in);
        ArrayList<String> lines = new ArrayList<String>();


        //while (!scanConsole.nextLine().equals("save")) {
        while (true) {
            String s = scanConsole.nextLine();
            if (s.equals("save")) {
                FileIO.save(file, lines);
                scanConsole.close();
                break;
            }
            if (s.equals("load")) {
                ArrayList<String> strings = FileIO.load(file);
                System.out.println("The info has been loaded");
                for (String line : strings) {
                    System.out.println(line);
                }
                break;
            }
            lines.add(s);
        }
    }
}
