import sun.org.mozilla.javascript.internal.regexp.RegExpImpl;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: loco
 * Date: 9/7/13
 * Time: 12:51 PM
 * To change this template use File | Settings | File Templates.
 */
public class ExceptionExample {
    public static void main(String[] args) {
        /**
         * Нужно считать из файла строки имен.
         *
         * Доделать
         */

        File file = new File("/home/loco/JavaEdu/Lessons/Exceptions/Names");

        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
            readFile(scanner);
        } catch (FileNotFoundException e) {
            System.out.println("There is no file " + file.getAbsolutePath());
            e.printStackTrace();
        } catch (AhtungKirkoroffDetected e) {
            System.out.println("-----------");
            System.out.println("Kirkoroff has been there, but it's not a problem");
            System.out.println("Philip has been handled successfully");
            System.out.println(e.getMessage());
            System.out.println(e.getStackTrace());
        }
        finally {
            if (null != scanner) {
                scanner.close();
                System.out.println("scanner is closed");
            }
        }
        System.out.println("End of program");
    }

    public static void readFile(Scanner scanner) throws FileNotFoundException, AhtungKirkoroffDetected {
        if (scanner != null) {
            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                line = line.replaceAll("[0-9]", "");
                if (line.equals("Kirkoroff")) throw new AhtungKirkoroffDetected("ALARM!!!");
                    System.out.println(line);
            }
        } else throw new FileNotFoundException("scanner is null");
    }
}

