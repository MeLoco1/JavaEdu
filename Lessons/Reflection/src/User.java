/**
 * Created with IntelliJ IDEA.
 * User: loco
 * Date: 9/28/13
 * Time: 10:46 AM
 * To change this template use File | Settings | File Templates.
 */
public class User implements GetDataFromObject {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String getDataFromObject() {
        return new StringBuilder().append("User {")
                .append("name = ")
                .append(name)
                .append("\n")
                .append("age = ")
                .append(name)
                .append("}").toString();
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
}
