import java.io.*;
import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: loco
 * Date: 9/11/13
 * Time: 9:55 PM
 * To change this template use File | Settings | File Templates.
 */
public class SaveLoadUser {
    public static void Save(ArrayList<User> users) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("/home/loco/JavaEdu/Lessons/Serialization/serializationIssue"))) {
            for (User item : users)
                outputStream.writeObject(item);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void Load(ArrayList<User> users) {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("/home/loco/JavaEdu/Lessons/Serialization/serializationIssue"))) {
            users.add((User) objectInputStream.readObject());
            users.add((User) objectInputStream.readObject());

        } catch (FileNotFoundException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (EOFException e) {
            System.out.println(users.size());
            for (User item : users) {
                System.out.println(item.toString());
            }
        } catch (IOException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (ClassNotFoundException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }

    }

}
