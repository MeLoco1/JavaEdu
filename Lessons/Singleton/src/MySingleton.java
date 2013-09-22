/**
 * Created with IntelliJ IDEA.
 * User: loco
 * Date: 9/21/13
 * Time: 12:18 PM
 * To change this template use File | Settings | File Templates.
 */
public class MySingleton {
    private int value;
    private static MySingleton instance = new MySingleton();

    private MySingleton() {
    }

    public static MySingleton getInstance() {
        if (instance != null) return instance;

        synchronized (instance) {
            if (instance == null)
                instance = new MySingleton();
        }

        return instance;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
