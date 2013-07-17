package train;

/**
 * Created with IntelliJ IDEA.
 * User: loco
 * Date: 7/14/13
 * Time: 1:50 PM
 * To change this template use File | Settings | File Templates.
 */
public class Passenger {
    private String name;
    private String surname;
    private int placeNumber;

    public Passenger(String name, String surname, int placeNumber) {
        this.name = name;
        this.surname = surname;
        this.placeNumber = placeNumber;
    }

    public int getPlaceNumber() {
        return placeNumber;
    }

    public void setPlaceNumber(int placeNumber) {
        this.placeNumber = placeNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
