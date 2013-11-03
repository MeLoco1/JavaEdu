package ws;

import wsobs.MyObserver;

/**
 * Created with IntelliJ IDEA.
 * User: loco
 * Date: 11/3/13
 * Time: 12:49 PM
 * To change this template use File | Settings | File Templates.
 */
public interface MyObservable {
    void setChanged();

    void clearChanged();

    public void addObserver(MyObserver observer);

    public void removeObserver(MyObserver observer);

    public void notifyObservers();

    public boolean notifyObserver(MyObserver observer);
}
