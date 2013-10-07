import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * User: Loco
 * Date: 03.10.13
 * Time: 22:27
 * To change this template use File | Settings | File Templates.
 */
public class User extends BaseClass {
    private String surName = "Red";
    private int age;
    public int salary;
    public static String nationality = "UA";

    public User(String name, int age) {
        super(name);
        this.age = age;
    }

    public User(String name, String surName, int age) {
        super(name);
        this.age = age;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
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
}
