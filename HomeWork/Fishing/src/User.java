import java.io.File;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * User: Loco
 * Date: 23.09.13
 * Time: 23:11
 * To change this template use File | Settings | File Templates.
 */
public class User implements Serializable {
    private String name;
    private int ide;
    private int pike;
    private int catfish;
    private byte[] password;

    public String getPassword() {
        try {
            return new String(password, "UTF-16");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String toString() {
        return new StringBuilder("User{")
                .append("name='")
                .append(name)
                .append('\'')
                .append(", ide=")
                .append(ide)
                .append(", pike=")
                .append(pike)
                .append(", catfish=")
                .append(catfish)
                .append(", password=")
                .append(Arrays.toString(password))
                .append('}').toString();
    }

    public static boolean checkName(String userName) {
        File[] files = new File("d:\\Google Диск\\Java\\JavaEdu\\HomeWork\\Fishing\\profiles\\").listFiles();
        for (File item : files)
            if (userName.equals(item.getName())) return true;
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;

        User user = (User) o;

        if (catfish != user.catfish) return false;
        if (ide != user.ide) return false;
        if (pike != user.pike) return false;
        if (!name.equals(user.name)) return false;
        if (!password.equals(user.password)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + ide;
        result = 31 * result + pike;
        result = 31 * result + catfish;
        result = 31 * result + password.hashCode();
        return result;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIde() {
        return ide;
    }

    public void setIde(int ide) {
        this.ide = ide;
    }

    public int getPike() {
        return pike;
    }

    public void setPike(int pike) {
        this.pike = pike;
    }

    public int getCatfish() {
        return catfish;
    }

    public void setCatfish(int catfish) {
        this.catfish = catfish;
    }

    public User(String name, String password) {

        this.name = name;
        byte[] bytes = new byte[0];
        try {
            bytes = password.getBytes("UTF-16");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        this.password = bytes;
    }
}
