import java.util.Date;
import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * User: loco
 * Date: 10/13/13
 * Time: 11:23 AM
 * To change this template use File | Settings | File Templates.
 */
public class User implements Comparable<User> {
    private String name;
    private int age;
    private int salary;
    private Date date;

    public User(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public int compareTo(User o) {
        if (this.age < o.getAge()) return -1;
        if (this.age > o.getAge()) return 1;
        return 0;
    }

    @Override
    public String toString() {
        return new StringBuilder("User{").
                append("name='").
                append(name).
                append('\'').
                append(", age=").
                append(age).
                append(", salary=").
                append(salary).
                append('}').
                toString();
    }

//    public boolean equals(Object o) {
//        if (o == null) return false;
//        if (this == o) return true;
//        if (!(o instanceof User)) return false;
//        if (!(o.getClass().getName().equals(this.getClass().getName()))) return false;
//        User user = (User) o;
//        if (user.getAge() != age) return false;
//        if ((name != null) && (user.getName() != null)) {
//
//        }
//        return true;
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;

        User user = (User) o;

        if (age != user.age) return false;
        if (salary != user.salary) return false;
        if (date != null ? !date.equals(user.date) : user.date != null) return false;
        if (name != null ? !name.equals(user.name) : user.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        result = 31 * result + salary;
        result = 31 * result + (date != null ? date.hashCode() : 0);
        return result;
    }

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


}
