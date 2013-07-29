import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: loco
 * Date: 7/28/13
 * Time: 12:00 PM
 * To change this template use File | Settings | File Templates.
 */
public class Bank extends Company {

    protected Bank(String name, ArrayList<Employee> employees) {
        super(name, employees);
    }

    @Override
    public void report() {
        System.out.println("Отчет по банку " + super.getName());
        ArrayList<Employee> sortedEmployees = super.getEmployees();
        for (int i = 0; i < sortedEmployees.size(); i++) {
            for (int j = i + 1; j < sortedEmployees.size(); j++) {
                if (sortedEmployees.get(j).getSalary() < sortedEmployees.get(i).getSalary()) {
                    Employee buf = super.getEmployees().get(i);
                    sortedEmployees.set(i, sortedEmployees.get(j));
                    sortedEmployees.set(j, buf);
                }
            }
        }

        for (Employee item : sortedEmployees) {
            System.out.println(item.getName() + " " + item.getSurname() + ", " + item.getJob() + ", " + item.getSalary());
        }
        System.out.println("---------------------");
    }
}
