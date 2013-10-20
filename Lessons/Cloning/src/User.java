import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: loco
 * Date: 10/19/13
 * Time: 10:44 AM
 * To change this template use File | Settings | File Templates.
 */
public class User implements Cloneable, Serializable {
    private String name;
    private int age;
    private Date date;
    private Tablet[] tablets;

    @Override
    public User clone() throws CloneNotSupportedException {
        User clone = (User) super.clone();
        clone.setDate((Date) this.getDate().clone());
        clone.setTablets(new Tablet[this.tablets.length]);
        int i = 0;
        for (Tablet tablet : this.tablets) {
            clone.getTablets()[i++] = tablet.clone();
        }
        return clone;
    }

    public User(String name, int age, Date date) {
        this.name = name;
        this.age = age;
        this.date = date;
    }

    /**
     * Второй вариант копирования - клонирующий конструктор.
     * Это когда в класс добавляется ещё один конструктор
     *
     * @param user
     */

    public User(User user) {
        this.name = user.getName();
        this.age = user.getAge();
        this.date = new Date(user.getDate().getTime());
        Tablet[] clone = new Tablet[user.getTablets().length];
        int i = 0;
        for (Tablet tablet : user.getTablets()) {
            clone[i++] = new Tablet(tablet.getTabletName(), tablet.getPrice());
        }
        this.tablets = clone;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", date=" + date +
                ", tablets=" + (tablets == null ? null : Arrays.asList(tablets)) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;

        User user = (User) o;

        if (age != user.age) return false;
        if (date != null ? !date.equals(user.date) : user.date != null) return false;
        if (name != null ? !name.equals(user.name) : user.name != null) return false;
        if (!Arrays.equals(tablets, user.tablets)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + (tablets != null ? Arrays.hashCode(tablets) : 0);
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Tablet[] getTablets() {
        return tablets;
    }

    public void setTablets(Tablet[] tablets) {
        this.tablets = tablets;
    }
}
