package immutable;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: loco
 * Date: 10/12/13
 * Time: 11:34 AM
 * To change this template use File | Settings | File Templates.
 */
public final class MyImmutable {
    private final int age;
    private final String name;
    private final Date birthday;

    public MyImmutable(int age, String name, Date birthday) {
        this.age = age;
        this.name = name;
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "immutable.MyImmutable{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", birthday=" + birthday +
                '}';
    }

    public int getAge() {
        return age;
    }

    @Override
    public int hashCode() {
        return super.hashCode();    //To change body of overridden methods use File | Settings | File Templates.
    }

    public String getName() {
        return name;
    }

    public Date getBirthday() {
        return new Date(birthday.getTime());
    }

    public long getDate() {
        return birthday.getTime();   // Возможен такой вариант, но не стоит
    }


}
