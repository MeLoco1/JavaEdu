package ws;

import ws.MyObservable;
import wsobs.MyObserver;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created with IntelliJ IDEA.
 * User: loco
 * Date: 11/3/13
 * Time: 12:41 PM
 * To change this template use File | Settings | File Templates.
 */
public class WeatherStation implements MyObservable {
    private float temperature;
    private float pressure;
    private Collection<MyObserver> observers;
    private boolean isStateChanged;

    public WeatherStation() {
        this.observers = new ArrayList<MyObserver>();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("WeatherStation");
        sb.append("{temperature=").append(temperature);
        sb.append(", pressure=").append(pressure);
        sb.append('}');
        return sb.toString();
    }

    public float getTemperature() {
        return temperature;
    }

    void setTemperature(float temperature) {
        this.temperature = temperature;
        setChanged();
    }

    public float getPressure() {
        return pressure;
    }

    void setPressure(float pressure) {
        this.pressure = pressure;
        setChanged();
    }

    @Override
    public void setChanged() {
        isStateChanged = true;
        System.out.println("State changed to " + toString());
    }

    @Override
    public void clearChanged() {
        isStateChanged = false;

    }

    @Override
    public void addObserver(MyObserver observer) {
        if (observer != null) {
            observers.add(observer);
        }
    }

    @Override
    public void removeObserver(MyObserver observer) {
        if (observer != null) {
            observers.remove(observer);
        }
    }

    @Override
    public void notifyObservers() {
        for (MyObserver observer : observers) {
            observer.update(this);
        }
        clearChanged();
    }

    @Override
    public boolean notifyObserver(MyObserver observer) {
        if ((observer != null) && (observers.contains(observer))) {
            observer.update(this);
            return true;
        }
        return false;
    }
}
