package call;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Created with IntelliJ IDEA.
 * User: root
 * Date: 12/1/13
 * Time: 5:38 PM
 * Callable using
 */
public class CallTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService ex = Executors.newCachedThreadPool();
        Future<String> s1 = ex.submit(new Call());
        Future<String> s2 = ex.submit(new Call());

        System.out.println(s1.get());
        System.out.println(s2.get());
        ex.shutdown();
    }

}
