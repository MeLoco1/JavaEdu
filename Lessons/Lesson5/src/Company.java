import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: loco
 * Date: 7/13/13
 * Time: 1:48 PM
 * To change this template use File | Settings | File Templates.
 */
public class Company {
    public String name;
    public String address;
    public ArrayList<Employee> employees;

    public Company(String name, String address, ArrayList<Employee> employees) {
        this.name = name;
        this.address = address;
        this.employees = employees;
    }

    public void changeMaxMin() {
        int iMax = 0;
        int iMin = 0;
        for (int i = 1; i < employees.size(); i++) {
            if (employees.get(i).salary < employees.get(iMin).salary) {
                iMin = i;
            }
            if (employees.get(i).salary > employees.get(iMax).salary) {
                iMax = i;
            }
        }

        int buf = employees.get(iMax).salary;
        employees.get(iMax).salary = employees.get(iMin).salary;
        employees.get(iMin).salary = buf;

    }

    public void deleteEmployeeBySalaryRange(int a, int b) {
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).salary >= a && employees.get(i).salary <= b) {
                employees.remove(i--);
            }
        }
    }

    public void report() {
        System.out.println("Salary report");
        int sum = 0;
        for (int i = 0; i < employees.size(); i++) {
            for (int j = i + 1; j < employees.size(); j++) {
                if (employees.get(j).salary > employees.get(i).salary) {
                    Employee buf = employees.get(i);
                    employees.set(i, employees.get(j));
                    employees.set(j, buf);
                }
            }
            sum += employees.get(i).salary;
            System.out.println(employees.get(i).name + " = " + employees.get(i).salary);
        }
        System.out.println("------------------------");
        System.out.println("SUM = " + sum);
    }
}