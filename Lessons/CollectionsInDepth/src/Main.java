import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Integer> list = new LinkedList<Integer>();
        Random random = new Random();
        long start;
        long end;
        for (int i = 0; i < 1000000; i++) {
            start = System.currentTimeMillis();
            list.add(random.nextInt());
            list.add(random.nextInt());
            list.add(random.nextInt());
            list.add(random.nextInt());
            list.add(random.nextInt());
            list.add(random.nextInt());
            list.add(random.nextInt());
            list.add(random.nextInt());
            list.add(random.nextInt());
            list.add(random.nextInt());

            end = System.currentTimeMillis();
            //System.out.println("time " + (end - start) + " size " + list.size());
        }
        System.out.println("end");
    }
}
