import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: loco
 * Date: 7/8/13
 * Time: 9:55 PM
 * To change this template use File | Settings | File Templates.
 */
public class Company {
    public String name;
    public String address;
    public ArrayList<Employee> employees;

    public Company(String name, String address) {
        this.name = name;
        this.address = address;
    }
}
