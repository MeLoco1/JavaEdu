package tiresrv;

import java.util.Random;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/**
 * Created with IntelliJ IDEA.
 * User: loco
 * Date: 9/29/13
 * Time: 12:49 PM
 * To change this template use File | Settings | File Templates.
 */
public class SemaforTry implements Runnable {
    final static Semaphore available = new Semaphore(3);

    @Override
    public void run() {
        try {
            available.acquire();
            System.out.println(" I'm in " + Thread.currentThread().getName());
            TimeUnit.SECONDS.sleep(new Random().nextInt(3));
            available.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
