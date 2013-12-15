public class Main {

    public static void main(String[] args) {
        Object sync = new Object();
        Data data = new Data();
        Thread t = new Thread(new WaitingThread(sync, data));
        t.start();
        try {
            System.out.println("main:: Sleeping");
            Thread.sleep(500);    // main спит 0.5 с
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        synchronized (sync) {
            System.out.println("main:: setting value to 1");
            data.value = 1;
            System.out.println("main:: notifying thread");
            sync.notify();
            System.out.println("main:: thread notified");
        }
    }

    static class Data {
        public int value = 0;
    }

}

