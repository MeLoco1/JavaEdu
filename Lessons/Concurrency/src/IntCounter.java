import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public class IntCounter implements Callable<Integer> {      //  Поток, который возвращает значение
    @Override
    public Integer call() throws Exception {
        int c = new Random().nextInt(10);
        for (int i = 0; i < c; i++) {
            System.out.println(Thread.currentThread().getName() + " counted to " + i);
            TimeUnit.SECONDS.sleep(1);
        }
        return c;

    }
}
