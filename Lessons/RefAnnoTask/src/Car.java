/**
 * Created with IntelliJ IDEA.
 * User: Loco
 * Date: 03.10.13
 * Time: 22:39
 * To change this template use File | Settings | File Templates.
 */
public class Car implements Mapable {
    private long id;

    private static String factory;

    public static String getFactory() {
        return factory;
    }

    public void setFactory(String factory) {
        Car.factory = factory;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;

        Car car = (Car) o;

        if (id != car.id) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return (int) (id ^ (id >>> 32));
    }

    @Override
    public long getId() {
        return hashCode();
    }
}


