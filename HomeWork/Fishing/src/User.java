import java.io.File;
import java.io.Serializable;

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

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", ide=" + ide +
                ", pike=" + pike +
                ", catfish=" + catfish +
                '}';
    }

    public static boolean checkName(String userName) {
        File[] files = new File("d:\\Google Диск\\Java\\JavaEdu\\HomeWork\\Fishing\\profiles\\").listFiles();
        for (File item : files)
            if (userName.equals(item.getName())) return true;
        return false;
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

    public User(String name) {

        this.name = name;
    }
}
