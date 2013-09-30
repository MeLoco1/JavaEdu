package tiresrv;

/**
 * Created with IntelliJ IDEA.
 * User: loco
 * Date: 9/29/13
 * Time: 12:23 PM
 * To change this template use File | Settings | File Templates.
 */
public class CarThread extends Thread {
    @Override
    public void run() {
        System.out.println(" new car arrived");
        TireServiceton.changeTires(this);
    }
}
