import java.io.*;

public class Main {

    public static void main(String[] args) {
        User user1 = new User(20, "Koo", 1000);
        User user2 = new User(24, "Pavlo", 100500);

        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("/home/loco/JavaEdu/Lessons/Serialization/serialization"))) {
            outputStream.writeObject(user1);
            outputStream.writeObject(user2);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        User us1 = null;
        User us2 = null;

        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("/home/loco/JavaEdu/Lessons/Serialization/serialization"))) {
            us1 = (User) objectInputStream.readObject();
            us2 = (User) objectInputStream.readObject();
        } catch (FileNotFoundException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (IOException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (ClassNotFoundException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        System.out.println(us1.toString());
        System.out.println(us2.toString());
    }
}

/**
 * Считать возраст, имя и ЗП из консоли и сериалиовать
  */
