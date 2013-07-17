import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: loco
 * Date: 7/14/13
 * Time: 12:59 PM
 * To change this template use File | Settings | File Templates.
 */
public class Company {
    private String name;
    private ArrayList<Employee> employees;

    public String getName() {
        return name;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public Company(String name, ArrayList<Employee> employees) {
        this.name = name;
        this.employees = employees;

    }

    public void changeMaxMin () {
        int iMin = 0;
        int iMax = 0;

        for (int i = 1; i < employees.size(); i++) {
            if (employees.get(iMin).getSalary() > employees.get(i).getSalary()) {
                iMin = i;
            }
            if (employees.get(iMax).getSalary() < employees.get(i).getSalary()) {
                iMax = i;
            }
        }

        int buf = employees.get(iMax).getSalary();
        employees.get(iMax).setSalary(employees.get(iMin).getSalary());
        employees.get(iMin).setSalary(buf);
    }

    public void report () {
        System.out.println("Salary report");
        int sum = 0;
        for (int i = 0; i < employees.size(); i++) {
            for (int j = i + 1; j < employees.size(); j++) {
                if (employees.get(j).getSalary() > employees.get(i).getSalary()) {
                    Employee buf = employees.get(i);
                    employees.set(i, employees.get(j));
                    employees.set(j, buf);
                }
            }
            sum += employees.get(i).getSalary();
            System.out.println(employees.get(i).getName() + " = " + employees.get(i).getSalary());
        }
        System.out.println("------------------------");
        System.out.println("SUM = " + sum);
    }
}
