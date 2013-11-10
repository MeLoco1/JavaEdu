package Data;

/**
 * Created with IntelliJ IDEA.
 * Data.User: Loco
 * Date: 03.10.13
 * Time: 22:27
 * To change this template use File | Settings | File Templates.
 */
public class User implements Mapable {
    private long id;

    private String name;

    @Saveable(setter = "getSurname")
    private String surName = "Red";

    @Saveable(setter = "getAge")
    private int age;

    @Saveable(setter = "getSalary")
    public int salary;

    @Saveable(setter = "getNationality")
    public static String nationality = "UA";

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public User(String name, String surName, int age) {
        this.name = name;
        this.age = age;
    }

    public User() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;

        User user = (User) o;

        if (age != user.age) return false;
        if (id != user.id) return false;
        if (salary != user.salary) return false;
        if (name != null ? !name.equals(user.name) : user.name != null) return false;
        if (surName != null ? !surName.equals(user.surName) : user.surName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (surName != null ? surName.hashCode() : 0);
        result = 31 * result + age;
        result = 31 * result + salary;
        return result;
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

    public static String getNationality() {
        return nationality;
    }

    public static void setNationality(String nationality) {
        User.nationality = nationality;
    }

    public long getId() {
        return hashCode();
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
