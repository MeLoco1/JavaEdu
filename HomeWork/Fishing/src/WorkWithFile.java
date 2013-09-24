import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * Created with IntelliJ IDEA.
 * User: Loco
 * Date: 23.09.13
 * Time: 23:49
 * To change this template use File | Settings | File Templates.
 */
public class WorkWithFile {
    public static User load(String fileName) {
        User result = null;
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("d:\\Google Диск\\Java\\JavaEdu\\HomeWork\\Fishing\\profiles\\" + fileName))) {
            result = (User) objectInputStream.readObject();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return result;
    }
}
