/**
 * Created with IntelliJ IDEA.
 * User: loco
 * Date: 8/17/13
 * Time: 1:19 PM
 * To change this template use File | Settings | File Templates.
 */
public class Employee {
    private String name;
    private int age;
    private int salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Employee(String name, int age, int salary) {

        this.name = name;
        this.age = age;
        this.salary = salary;
    }
}
