import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

// Прочитать из файла ссылки на мп3 и вывести в файл битые ссылки


public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        File readfile = new File("/home/loco/JavaEdu/HomeWork/ReadFile/loco.m3u"); // Ctrl + P - list of possible arguments
        Scanner scan = new Scanner(readfile);
        String rightpath = "#Downloads";

        while (scan.hasNext()) {
            String line = scan.nextLine(); // nextLine - вся линия, next - следующее слово
            if (line.contains(rightpath)) {
                System.out.println(line);
            }
        }
        /*String lstr = "";
        while (scan.hasNext()) {
            String[] str_arr = scan.nextLine().split(" ");
            for (int i = 0; i < str_arr.length; i++) {
                if (str_arr[i].length() > lstr.length()) {
                    lstr = str_arr[i];
                }
            }
        }*/
    }
}
