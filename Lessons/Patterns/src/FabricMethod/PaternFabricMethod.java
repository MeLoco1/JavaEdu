package FabricMethod;

/**
 * Created with IntelliJ IDEA.
 * User: loco
 * Date: 11/3/13
 * Time: 1:44 PM
 * To change this template use File | Settings | File Templates.
 */
public class PaternFabricMethod {
    /**
     * Задает порядок создания объектов, но позволяет наследнику уточнить какой именно это будет объект
     */
    public static void main(String[] args) {
        CarFactory carFactory = new KievCarFactory();
        Car car = carFactory.createCar();
        System.out.println(car);
        System.out.println();

        CarFactory zph = new ZphCarFactory();
        Car car1 = zph.createCar();
        System.out.println(car1);

    }



}
