package chaos;

import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 * Created with IntelliJ IDEA.
 * User: loco
 * Date: 9/29/13
 * Time: 11:18 AM
 * To change this template use File | Settings | File Templates.
 */
public class ListReader extends Thread {

    @Override
    public void run() {
        int i = 2 + new Random().nextInt(3);
        System.out.println("Reading will start in " + i + " seconds");
        try {
            TimeUnit.SECONDS.sleep(i);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (String line : SharedList.getList()) {
            System.out.println(line);
            try {
                TimeUnit.MILLISECONDS.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
