package thrd;

/**
 * Created with IntelliJ IDEA.
 * User: root
 * Date: 12/1/13
 * Time: 3:18 PM
 * It is example of interruption. Alos Thread is created using interface Runnable
 */
public class Interrupt {
    public static void main(String[] args) {
        Thread myThread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Interrupt");
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    System.out.println("Thread has been terminated");
                    e.printStackTrace();
                }
            }
        });
        myThread.start();
        myThread.interrupt();
        System.out.println(myThread.isAlive());
    }
}
