
/**
 * Created with IntelliJ IDEA.
 * User: loco
 * Date: 9/21/13
 * Time: 1:48 PM
 * To change this template use File | Settings | File Templates.
 */
public class ValueTest {
    public static volatile Integer value = 0;
    public static volatile Integer counter = 0;
    static ValueTest valueTest = new ValueTest();

    public synchronized void test() throws InterruptedException {
        if (counter == 0) this.wait();
        System.out.println("Thread is not waiting anymore");
        this.notifyAll();
    }

    public static void main(String[] args) {
        MySingleton mySingletonng;
        Incrementor inc1 = new Incrementor();
        inc1.setName("first");
        Incrementor inc2 = new Incrementor();
        inc2.setName("second");
        inc1.start();
        counter++;
        inc2.start();
        try {
            inc1.join();
            inc2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Result = " + counter);
    }
}
