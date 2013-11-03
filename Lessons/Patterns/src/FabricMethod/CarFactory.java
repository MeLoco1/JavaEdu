package FabricMethod;

/**
 * Created with IntelliJ IDEA.
 * User: loco
 * Date: 11/3/13
 * Time: 2:02 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class CarFactory {
    private Car car;

    public Car createCar() {
        car = rawCar();
        car.setWheelType("Steel wheels");
        car.setPaintType("Metallic");
        return car;
    }

    protected abstract Car rawCar();
}
