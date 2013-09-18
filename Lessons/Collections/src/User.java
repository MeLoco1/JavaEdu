import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: loco
 * Date: 9/17/13
 * Time: 9:01 PM
 * To change this template use File | Settings | File Templates.
 */
public class User {
    private String name;
    private int age;
    private List<Iphone> iphones;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;

        User user = (User) o;

        if (age != user.age) return false;
        if (iphones != null ? !iphones.equals(user.iphones) : user.iphones != null) return false;
        if (name != null ? !name.equals(user.name) : user.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        result = 31 * result + (iphones != null ? iphones.hashCode() : 0);
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

    public List<Iphone> getIphones() {
        return iphones;
    }

    public void setIphones(List<Iphone> iphones) {
        this.iphones = iphones;
    }
}
