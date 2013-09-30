package tiresrv;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created with IntelliJ IDEA.
 * User: loco
 * Date: 9/29/13
 * Time: 12:19 PM
 * To change this template use File | Settings | File Templates.
 */
public class TireServiceton {
    private static TireServiceton tireServiceton = new TireServiceton();
    private static volatile Deque<CarThread> carThreadDeque = new LinkedList<CarThread>();
    private static volatile int tireServiceLoad = 0;

    public synchronized static TireServiceton getTireServiceton() {
        return tireServiceton;
    }

    private TireServiceton() {
    }

    public static void changeTires(CarThread car) {
        ++tireServiceLoad;
        if (tireServiceLoad <= 3) {
            System.out.println("Меняем колеса");
            try {
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else {
            carThreadDeque.add(car);
        }
        --tireServiceLoad;
        checkQueue();
    }

    public static void checkQueue() {
        Iterator<CarThread> iterator = carThreadDeque.iterator();
        while (iterator.hasNext()) {
            if (!iterator.next().isAlive())
                iterator.next().start();
            iterator.remove();
        }
    }
}
