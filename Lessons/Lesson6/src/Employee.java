/**
 * Created with IntelliJ IDEA.
 * User: loco
 * Date: 7/14/13
 * Time: 11:16 AM
 * To change this template use File | Settings | File Templates.
 */
public class Employee {
    private String name;
    private String surname;
    private int age;
    private int salary;

    public Employee(String name, String surname, int age, int salary) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
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

    public String getName() {

        return name;
    }

    public void increseSalary() {
        salary *= 2;
    }
}
