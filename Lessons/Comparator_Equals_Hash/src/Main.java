import java.util.HashSet;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        NavigableSet<User> navigableSet = new TreeSet<User>();
        navigableSet.add(new User("Vasya", 20, 2300));
        navigableSet.add(new User("Kolya", 23, 1300));
        navigableSet.add(new User("Me", 12, 3200));
        navigableSet.add(new User("Kate", 25, 6500));
        navigableSet.add(new User("Lo", 17, 8200));

        System.out.println("My Set is:");
        for (User user : navigableSet) {
            System.out.println(user);
        }

        User us = new User("Lomi", 40, 5000);
        System.out.println();
        System.out.println(navigableSet.ceiling(us));
        System.out.println(navigableSet.floor(us));

        NavigableSet<User> invertedNavSet = navigableSet.descendingSet();
        System.out.println();
        System.out.println("Descending Set:");
        for (User user : invertedNavSet) {
            System.out.println(user);
        }

        for (User user : navigableSet) {
            user.setName("Doe");
        }

        System.out.println();
        System.out.println("Descending Set after name change:");
        for (User user : invertedNavSet) {
            System.out.println(user);
        }

        Set<User> mySet = new HashSet<User>();
        mySet.add(new User("Vasya", 20, 2300));
        mySet.add(new User("Kolya", 23, 1300));
        mySet.add(new User("Me", 12, 3200));
        mySet.add(new User("Kate", 25, 6500));
        mySet.add(new User("Kate", 25, 6500));
        mySet.add(new User("Kate", 25, 6500));
        mySet.add(new User("Lo", 17, 8200));

        System.out.println();
        System.out.println("My Set is:");
        for (User user : mySet) {
            System.out.println(user);
        }

        NavigableSet<User> navigableSetBySalary = new TreeSet<User>(new UserBySalaryComparator());
        navigableSetBySalary.addAll(navigableSet);
        System.out.println();
        System.out.println("Set sorted by salary");
        for (User user : navigableSetBySalary) {
            System.out.println(user);
        }
        System.out.println("Change");
        for (User user : navigableSet) {
            user.setName("John");
        }
        for (User user : navigableSetBySalary) {
            System.out.println(user);
        }

    }
}
