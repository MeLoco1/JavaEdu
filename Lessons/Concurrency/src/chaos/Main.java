package chaos;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: loco
 * Date: 9/29/13
 * Time: 11:01 AM
 * To change this template use File | Settings | File Templates.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Start");

        List<Thread> pool = new ArrayList<Thread>();
        pool.add(new MyFileReaderThread());
        pool.add(new ListReader());
        pool.add(new ListReader());
        pool.add(new ListReader());
        pool.add(new Remover());
        pool.add(new Remover());
        pool.add(new Remover());

        for (Thread item : pool) {
            item.start();
        }

        try {
            for (Thread item : pool) {
                item.join();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Finish");
    }
}
