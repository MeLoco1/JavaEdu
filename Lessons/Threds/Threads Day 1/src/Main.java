//import  out.artifacts.Singleton_jar.*;
public class Main {

    public static void main(String[] args) {
        //MySingleton
        Thread mainThread = Thread.currentThread();
        mainThread.setName("My Valentine Thread");
        System.out.println(mainThread.getName());
        System.out.println(mainThread.getPriority());
        System.out.println(mainThread.isAlive());
        System.out.println(mainThread.isDaemon());
        System.gc();
        System.out.println(Runtime.getRuntime().freeMemory() / 1024 / 1024);
        System.out.println(Runtime.getRuntime().maxMemory() / 1024 / 1024);
        System.out.println(Runtime.getRuntime().totalMemory() / 1024 / 1024);
        System.out.println(mainThread.getState());
        /**
         * Есть 4 типа ссылок
         * Сильная - как mainThread.
         * Слабая - удаляются объекты, если есть угроза нехватаки памяти
         * Мягкаая - удалаяются когда есть время у gc()
         * Фантомная - ???
         */

        System.out.println("stacktrace");
        for (StackTraceElement item : mainThread.getStackTrace()) {
            System.out.println(item.toString());
        }

        System.out.println("------- MyThread -------");
        MyThread myThread = new MyThread();


        myThread.start();
        MyThread myThread1 = new MyThread();
        myThread1.start();

        MyThreadRunnable myThreadRunnable = new MyThreadRunnable();
        Thread myThreadForRunnable = new Thread(myThreadRunnable);
        myThreadForRunnable.start();

        TestThread testThread = new TestThread();
        testThread.start();

        System.out.println("main thread");
        for (int i = 0; i < 10; i++) {
            System.out.println("main is running " + i);
            if (i == 4) mainThread.setPriority(1);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("main thread interrupted");
                e.printStackTrace();
            }
        }
        if (myThread.isAlive()) {
            try {
                System.out.println("Waiting forinterruption of MyThread");
                myThread.join(5000);
                System.out.println("The threads have been joined");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("main thread finished");
    }
}
