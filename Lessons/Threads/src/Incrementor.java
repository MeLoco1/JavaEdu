/**
 * Created with IntelliJ IDEA.
 * User: loco
 * Date: 9/21/13
 * Time: 1:49 PM
 * To change this template use File | Settings | File Templates.
 */
public class Incrementor extends Thread {

    @Override
    public void run() {
        /*for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            ValueTest.value++;
            System.out.println("Thread Incrementor " + this.getName() + " changed value = " + ValueTest.value);
        }*/

        try {

            ValueTest.valueTest.test();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
