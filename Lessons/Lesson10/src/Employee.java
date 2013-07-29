/**
 * Created with IntelliJ IDEA.
 * User: loco
 * Date: 7/28/13
 * Time: 11:56 AM
 * To change this template use File | Settings | File Templates.
 */
public class Employee {
    private String name;
    private String surname;
    private int age;
    private int salary;
    private String job;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getJob() {
        return job;
    }

    public int getSalary() {

        return salary;
    }

    public Employee(String name, String surname, int age, int salary, String job) {

        this.name = name;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
        this.job = job;
    }
}
