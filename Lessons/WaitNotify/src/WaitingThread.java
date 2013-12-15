/**
 * Created with IntelliJ IDEA.
 * User: loco
 * Date: 12/15/13
 * Time: 2:12 PM
 * The example how methods wait, notify works. This is the class Thread
 */
public class WaitingThread implements Runnable {
    private Object sync;
    private Main.Data data;

    public WaitingThread(Object sync, Main.Data data) {
        this.sync = sync;
        this.data = data;
    }

    @Override
    public void run() {
        System.out.println("own:: Thread started");
        synchronized (sync) {
            if (data.value == 0) {
                try {
                    System.out.println("own:: Waiting");
                    sync.wait();
                    System.out.println("own:: Running again");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("own:: data.value = " + data.value);
        }
    }
}
