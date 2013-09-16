import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: Loco
 * Date: 16.09.13
 * Time: 22:59
 * To change this template use File | Settings | File Templates.
 */
public class Client implements Serializable {
    private ArrayList<Car> cars;
    private String name;

    public ArrayList<Car> getCars() {
        return cars;
    }

    public String getName() {
        return name;
    }

    public Client(ArrayList<Car> cars, String name) {
        this.cars = cars;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Client{" +
                "cars=" + cars +
                ", name='" + name + '\'' +
                '}';
    }
}
