package Data;

import Data.Mapable;

/**
 * Created with IntelliJ IDEA.
 * Data.User: Loco
 * Date: 06.10.13
 * Time: 16:27
 * To change this template use File | Settings | File Templates.
 */
public class Ship implements Mapable {
    private String name;

    public Ship(String name) {
        this.name = name;
    }

    public Ship() {
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Ship)) return false;

        Ship ship = (Ship) o;

        if (name != null ? !name.equals(ship.name) : ship.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }

    @Override
    public long getId() {
        return hashCode();
    }
}



