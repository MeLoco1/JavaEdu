import java.util.Collections;
import java.util.List;

public class Main {

    public static class Inner {
        String s = "I'm Inner class";

        public Inner(String s) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() { // Это anonymous class
            public void run() {
                while (true) {
                    System.out.println("Class without name");
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        t1.start();
    }
}
