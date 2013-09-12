import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;

public class SystemIn {
    public static void main(String[] args) {
        char c;
        String name = null;
        int age = 0;
        int salary = 0;

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("PLease enter the name: ");
            name = (String) br.readLine();

            System.out.println("Please enter the age");
            age = Integer.parseInt(br.readLine());

            System.out.println("Please enter the salary");
            salary = Integer.parseInt(br.readLine());

        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.out.println("Don't try to trick me out");
            e.printStackTrace();
            System.exit(0);
        }

        User user = new User(age, name, salary);
        ArrayList<User> users = new ArrayList<>();
        users.add(user);
        SaveLoadUser.Save(users);
        SaveLoadUser.Load(users);


    }
}
