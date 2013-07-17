package train;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: loco
 * Date: 7/16/13
 * Time: 10:56 PM
 * To change this template use File | Settings | File Templates.
 */
public class Train {
    private int number;
    private String name;
    private ArrayList<Carriage> carriages;

    public int getNumber() {
        return number;
    }

    public void setNumber(byte number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Carriage> getCarriages() {
        return carriages;
    }

    public void setCarriages(ArrayList<Carriage> carriages) {
        this.carriages = carriages;
    }

    public Train(int number, String name) {

        this.number = number;
        this.name = name;
        carriages = new ArrayList<Carriage>();
    }

    public void addCarriage() {
        carriages.add(new Carriage(this.carriages.size() + 1, Options.PLACENUMBER));
    }
}
