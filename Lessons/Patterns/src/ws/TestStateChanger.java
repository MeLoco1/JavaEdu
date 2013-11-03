package ws;

import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * User: loco
 * Date: 11/3/13
 * Time: 1:26 PM
 * To change this template use File | Settings | File Templates.
 */
public class TestStateChanger extends Thread {
    static Random random = new Random();
    WeatherStation station;

    public TestStateChanger(WeatherStation station) {
        this.station = station;
    }

    public void changeTemp() {
        station.setTemperature(random.nextFloat());
    }

    public void changePressure() {
        station.setPressure(random.nextFloat());
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {

            changePressure();
            try {
                Thread.sleep(1000);
                changeTemp();
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
