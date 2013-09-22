/**
 * Created with IntelliJ IDEA.
 * User: loco
 * Date: 9/21/13
 * Time: 11:31 AM
 * To change this template use File | Settings | File Templates.
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println(this.getName());
        System.out.println("started new thread myThread");
        for (int i = 0; i < 20; i++) {
            System.out.println("myThread is running " + i);
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
