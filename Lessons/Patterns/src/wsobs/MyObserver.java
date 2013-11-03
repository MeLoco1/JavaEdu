package wsobs;

import ws.MyObservable;

/**
 * Created with IntelliJ IDEA.
 * User: loco
 * Date: 11/3/13
 * Time: 12:54 PM
 * To change this template use File | Settings | File Templates.
 */
public interface MyObserver {
    public void update(MyObservable myObservable);

}
