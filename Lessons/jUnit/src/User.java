/**
 * Created with IntelliJ IDEA.
 * User: loco
 * Date: 10/24/13
 * Time: 7:26 PM
 * To change this template use File | Settings | File Templates.
 */
public class User implements Comparable<User> {
    private String name;
    private int age;

    @Override
    public int compareTo(User o) {
        return this.age - o.age;
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;

        User user = (User) o;

        if (age != user.age) return false;
        if (name != null ? !name.equals(user.name) : user.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }
}
