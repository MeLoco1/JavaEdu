import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: loco
 * Date: 7/21/13
 * Time: 12:04 PM
 * To change this template use File | Settings | File Templates.
 */
public class Sadmin extends Employee{
    private ArrayList<String> servers;

    public ArrayList<String> getServers() {
        return servers;
    }

    public void setServers(ArrayList<String> servers) {
        this.servers = servers;
    }

    public Sadmin(String name, String surname, int age, int salary) {
        super(name, surname, age, salary);
    }
}
