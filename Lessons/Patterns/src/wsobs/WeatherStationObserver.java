package wsobs;

import ws.MyObservable;
import ws.WeatherStation;


/**
 * Created with IntelliJ IDEA.
 * User: loco
 * Date: 11/3/13
 * Time: 1:12 PM
 * To change this template use File | Settings | File Templates.
 */
public class WeatherStationObserver implements MyObserver {

    @Override
    public void update(MyObservable myObservable) {
        System.out.println("I got new state");
        myObservable = (WeatherStation) myObservable;
        //myObservable.
    }
}
