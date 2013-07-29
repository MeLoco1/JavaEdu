import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: loco
 * Date: 7/28/13
 * Time: 12:13 PM
 * To change this template use File | Settings | File Templates.
 */
public class Factory extends Company {
    protected Factory(String name, ArrayList<Employee> employees) {
        super(name, employees);
    }

    @Override
    public void report() {
        System.out.println("Общая зарплата по фабрике " + super.getName());
        int sum = 0;
        for (Employee item : super.getEmployees()) {
            sum += item.getSalary();
        }
        System.out.println(sum);
        System.out.println("-------------------");
    }
}
