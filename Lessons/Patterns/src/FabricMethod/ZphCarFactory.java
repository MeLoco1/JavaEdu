package FabricMethod;

/**
 * Created with IntelliJ IDEA.
 * User: loco
 * Date: 11/3/13
 * Time: 2:12 PM
 * To change this template use File | Settings | File Templates.
 */
public class ZphCarFactory extends CarFactory{

    @Override
    protected Car rawCar() {
        Car car = new Sedan();
        car.setBodyType("Universal");
        return car;
    }
}
