import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: loco
 * Date: 7/21/13
 * Time: 12:02 PM
 * To change this template use File | Settings | File Templates.
 */
public class Manager extends Employee{
    public ArrayList<String> getDepartments() {
        return departments;
    }

    public void setDepartments(ArrayList<String> departments) {
        this.departments = departments;
    }

    private ArrayList<String> departments;

    public Manager(String name, String surname, int age, int salary, ArrayList<String> departments) {
        super(name, surname, age, salary);
        this.departments = departments;
    }
}
