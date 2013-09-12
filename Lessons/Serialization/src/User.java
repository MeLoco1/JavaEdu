import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: loco
 * Date: 9/11/13
 * Time: 9:12 PM
 * To change this template use File | Settings | File Templates.
 */
public class User implements Serializable {
    private int age;
    private String name;
    private transient int salary; // при сериализации не сохраняет значение поля


    public User(int age, String name, int salary) {
        this.age = age;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
