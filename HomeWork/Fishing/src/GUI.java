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
                    case 1: newGame(bufferedReader); break;
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

        User.checkName(name);

    }

}
