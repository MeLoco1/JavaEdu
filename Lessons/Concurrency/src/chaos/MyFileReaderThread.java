package chaos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 * Created with IntelliJ IDEA.
 * User: loco
 * Date: 9/29/13
 * Time: 11:01 AM
 * To change this template use File | Settings | File Templates.
 */
public class MyFileReaderThread extends Thread {

    @Override
    public void run() {
        File file = new File("/home/loco/JavaEdu/HomeWork/HW");
        try {
            Scanner scan = new Scanner(file);
            while (scan.hasNextLine()) {

                SharedList.getList().add(scan.nextLine());

                try {
                    System.out.println("File is reading... " + SharedList.getList().size() + " streams");
                    TimeUnit.MILLISECONDS.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("File read complete");
    }
}
