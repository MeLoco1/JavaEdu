import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Integer> list = new LinkedList<Integer>();
        Random random = new Random();
        long start;
        long end;
        /**
//        for (int i = 0; i < 1000000; i++) {
//            start = System.currentTimeMillis();
//            list.add(random.nextInt());
//            list.add(random.nextInt());
//            list.add(random.nextInt());
//            list.add(random.nextInt());
//            list.add(random.nextInt());
//            list.add(random.nextInt());
//            list.add(random.nextInt());
//            list.add(random.nextInt());
//            list.add(random.nextInt());
//            list.add(random.nextInt());
//
//            end = System.currentTimeMillis();
//            //System.out.println("time " + (end - start) + " size " + list.size());
//        }
        */
         // Перехэширование произойдет при добавлении 501-го элемента
         // Collection<User> users = new HashSet<User>(1000, 0.5f);
         Collection<User> users = new HashSet<User>();
         for (int i = 0; i < 50000; i++) {
         start = System.currentTimeMillis();
         for (int j = 0; j < 100; j++) {
         users.add(new User("Vasia", random.nextInt()));
         }
         end = System.currentTimeMillis();
         System.out.println("Collection size " + users.size() + " time to add 10 users: " + (end - start));
         }

         for (int i = 0; i < 10; i++) {
         User u = new User("Vasia", random.nextInt());
         start = System.currentTimeMillis();
         for (int j = 0; j < 1000; j++) {
         users.contains(u);
         }
         end = System.currentTimeMillis();
         System.out.println("Time to find user " + (end - start));
         }



        Queue<Integer> numbers = new ArrayDeque<Integer>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }
        for (Integer number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
        System.out.println(numbers.poll());
        System.out.println(numbers.poll());
        System.out.println(numbers.poll());

        for (Integer number : numbers) {
            System.out.print(number + " ");
        }

        System.out.println("end");
    }
}
