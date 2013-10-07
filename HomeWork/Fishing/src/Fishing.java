import java.io.BufferedReader;
import java.io.IOException;
import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * User: Loco
 * Date: 01.10.13
 * Time: 23:53
 * To change this template use File | Settings | File Templates.
 */
public class Fishing {
    public void catchFish(BufferedReader bufferedReader) {
        try {
            System.out.println("Ready!!!!!!!!!!!!!!");
            Thread.sleep(((new Random().nextInt(7)) + 3) *1000);
            System.out.println("It's biting!!!");


            String resultOfFishing = GUI.menu(bufferedReader, "JERK it or let it GO?", "jerk", "go");


        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //
    }
}
