import java.io.*;

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

    public static void save(User user) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("d:\\Google Диск\\Java\\JavaEdu\\HomeWork\\Fishing\\profiles\\" + user.getName()))) {
            outputStream.writeObject(user);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
