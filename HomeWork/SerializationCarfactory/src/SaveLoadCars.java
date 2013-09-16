import java.io.*;
import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: Loco
 * Date: 16.09.13
 * Time: 20:26
 * To change this template use File | Settings | File Templates.
 */
public class SaveLoadCars {
    public static void save(Client client) {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("d:\\Google Диск\\Java\\JavaEdu\\HomeWork\\SerializationCarfactory\\cars"))) {

            objectOutputStream.writeObject(client);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void load(ArrayList<Client> clients) {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("d:\\Google Диск\\Java\\JavaEdu\\HomeWork\\SerializationCarfactory\\cars"))) {
            clients.add((Client) objectInputStream.readObject());
            System.out.println("work");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
