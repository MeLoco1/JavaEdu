import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {

    public static void main(String[] args) {
        IntCounter counter = new IntCounter();
        ExecutorService executorService = Executors.newCachedThreadPool();
        Future<Integer> counterResult = executorService.submit(counter);
        System.out.println("main thread is running");
        try {
            Integer i = counterResult.get();          // Ждет, пока не закончится поток counter
            System.out.println(counterResult.isDone());
            System.out.println("counter result is " + i);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {

            e.printStackTrace();
        }
        executorService.shutdown();
        System.out.println("main finish");
    }
}
