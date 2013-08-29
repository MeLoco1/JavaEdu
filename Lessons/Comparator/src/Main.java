import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<Employee>();
        employees.add(new Employee("Me", 29, 10000));
        employees.add(new Employee("Kate", 26, 1000));
        employees.add(new Employee("Vasya", 35, 3000));

        System.out.println("Sort by age");

        Collections.sort(employees, new MyComplorator());
        for (Employee item : employees) {
            System.out.println(item.getName());
        }

        System.out.println("Sort by salary");

        Collections.sort(employees, new Comparator<Employee>() {
            public int compare(Employee o1, Employee o2) {
                if (o1.getSalary() > o2.getSalary()) {
                    return 1;
                } else if (o1.getSalary() < o2.getSalary()) {
                    return -1;
                }
                return 0;
            }
        });

        for (Employee item : employees) {
            System.out.println(item.getName());
        }
    }
}
