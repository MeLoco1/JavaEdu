import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: Loco
 * Date: 16.09.13
 * Time: 20:38
 * To change this template use File | Settings | File Templates.
 */
public class GUI {
    public static int menu() {
        int choice = 0;
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("-------------------------");
            System.out.println("1 - Buy new car");
            System.out.println("2 - Report on sold cars");
            System.out.println("-------------------------");

            choice = Character.getNumericValue(bufferedReader.read());
            System.out.println("Your choice is " + choice);

            if (!((choice == 1) || (choice == 2))) throw new NumberFormatException();
            if (choice == 1) {
                newCarMenu(bufferedReader, choice);
            } else report();


        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.out.println("Don't try to trick me out");
            e.printStackTrace();
            System.exit(0);
        }
        return choice;
    }

    private static void newCarMenu(BufferedReader bufferedReader, int choice) throws IOException, NumberFormatException {
        choice = Character.getNumericValue(bufferedReader.read());  // Enter
        System.out.println("Enter your name");
        String name = bufferedReader.readLine();

        if (!name.matches("[A-Za-z]*")) throw new NumberFormatException();

        ArrayList<Car> cars = new ArrayList<Car>();
        boolean exit = false;
        while (!exit) {
            System.out.println("What car do you want to buy?");
            System.out.println("1 - Kosmich");
            System.out.println("2 - Honda");
            System.out.println("3 - Bugatti");
            System.out.println("4 - Porche");
            System.out.println("5 - Cadillac");

            choice = Character.getNumericValue(bufferedReader.read());
            if (!((choice >= 1) && (choice <= 5))) throw new NumberFormatException();

            switch (choice) {
                case 1:
                    cars.add(new Car("Kosmich", "Red", 10000, "26-02-1984", (int) ((Math.random() - 0.5) * 10000)));
                    break;
                case 2:
                    cars.add(new Car("Honda", "Black", 20000, "26-01-1994", (int) ((Math.random() - 0.5) * 10000)));
                    break;
                case 3:
                    cars.add(new Car("Bugatti", "Yellow", 200000, "22-11-2004", (int) ((Math.random() - 0.5) * 10000)));
                    break;
                case 4:
                    cars.add(new Car("Porche", "Green", 600000, "12-07-2012", (int) ((Math.random() - 0.5) * 10000)));
                    break;
                case 5:
                    cars.add(new Car("Cadillac", "White", 54345, "01-01-1967", (int) ((Math.random() - 0.5) * 10000)));
                    break;
            }

            choice = Character.getNumericValue(bufferedReader.read()); //Enter
            System.out.println("Do you want more? (y/n)");

            String input = bufferedReader.readLine();
            if (!input.matches("[y|n]")) throw new NumberFormatException();
            if (input.equals("n"))
                exit = true;
        }

        Client client = new Client(cars, name);
        SaveLoadCars.save(client);
    }

    private static void report() {
        System.out.println("============== Report ============");
        ArrayList<Client> clients = new ArrayList<>();
        SaveLoadCars.load(clients);
        for (Client client : clients) {
            System.out.println("Name: " + client.getName());
            for (Car item : client.getCars()) {
                System.out.println("Car: " + item.getName() + ", price: " +item.getPrice());
            }
        }
    }
}
