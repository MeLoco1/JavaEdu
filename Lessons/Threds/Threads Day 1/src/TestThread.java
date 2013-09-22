/**
 * Created with IntelliJ IDEA.
 * User: loco
 * Date: 9/21/13
 * Time: 1:40 PM
 * To change this template use File | Settings | File Templates.
 */
public class TestThread extends Thread {
    @Override
    public synchronized void start() {
        System.out.println(this.getName());
        System.out.println("started new thread TestThread");
        for (int i = 0; i < 20; i++) {
            System.out.println("TestThread is running " + i);
            if (i == 4) this.setPriority(9);
            //if (i == 5) while (this.isAlive()) this.interrupt();    - not working
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Interrupted");
                e.printStackTrace();
            }
        }
    }
}
