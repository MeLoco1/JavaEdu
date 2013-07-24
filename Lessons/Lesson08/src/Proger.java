import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: loco
 * Date: 7/21/13
 * Time: 11:34 AM
 * To change this template use File | Settings | File Templates.
 */
public class Proger extends Employee {
    private ArrayList<String> langs;

    public Proger(String name, String surname, int age, int salary) {
        super(name, surname, age, salary);
    }

    public ArrayList<String> getLangs() {
        return langs;
    }

    public void setLangs(ArrayList<String> langs) {
        this.langs = langs;
    }
}
