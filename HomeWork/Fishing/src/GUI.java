import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created with IntelliJ IDEA.
 * User: Loco
 * Date: 23.09.13
 * Time: 23:03
 * To change this template use File | Settings | File Templates.
 */
public class GUI {
    public static void menu() {
        int choice = 0;
        try {
            try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {

                System.out.println("-------------------------");
                System.out.println("1 - New game");
                System.out.println("2 - Rating");
                System.out.println("3 - Exit");
                System.out.println("-------------------------");

                choice = Character.getNumericValue(bufferedReader.read());
                System.out.println("Your choice is " + choice);

                if ((choice < 1) || (choice > 3)) throw new NumberFormatException();

                switch (choice) {
                    case 1:
                        newGame(bufferedReader);
                        break;
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (NumberFormatException e) {
            System.out.println("Don't try to trick me out");
            e.printStackTrace();
            System.exit(0);
        }
    }


    private static void newGame(BufferedReader bufferedReader) throws IOException {
        Character.getNumericValue(bufferedReader.read());  // Enter
        System.out.println("------------ New Game -------------");
        System.out.println(" Please enter your name: ");

        String name = bufferedReader.readLine();

        if (!name.matches("[A-Za-z]*")) throw new NumberFormatException();

        User user;
        if (User.checkName(name)) {
            user = WorkWithFile.load(name);
            System.out.println("Password: ");
            String password = bufferedReader.readLine();
            if (!password.equals(user.getPassword())) {
                System.out.println("Wrong password, bye-bye");
                System.exit(0);
            }
        } else {
            boolean correct = false;
            String password = null;
            String verifyPassword;
            while (!correct) {
                System.out.println("Enter the password");
                password = bufferedReader.readLine();
                System.out.println("repeat your password");
                verifyPassword = bufferedReader.readLine();
                if (!password.equals(verifyPassword)) {
                    System.out.println("You entered different passwords");
                } else {
                    correct = true;
                }
            }
            user = new User(name, password);
            WorkWithFile.save(user);
        }

        statistics(user);
        String choice = menu(bufferedReader, "catch ot exit?", "catch", "exit");

        if (choice.equals("catch")) {
            Fishing fishing = new Fishing();
            fishing.catchFish(bufferedReader);
        }

    }

    private static void statistics(User user) {
        System.out.println("Hello, " + user.getName());
        System.out.println("---------- Your statistic ----------");
        System.out.println("IDE = " + user.getIde());
        System.out.println("PIKE = " + user.getPike());
        System.out.println("CATFISH = " + user.getCatfish());
        System.out.println("------------------------------------");
    }


    public static String menu(BufferedReader bufferedReader, String text, String option1, String option2) throws IOException {
        String choice = null;
        boolean correct = false;
        while (!correct) {
            System.out.println(text);
            choice = bufferedReader.readLine();
            if (choice.matches(option1) || choice.matches(option2)) {
                correct = true;
            } else System.out.println("Wrong");
        }
        return choice;
    }
}
