public class Main {

    public static void main(String[] args) {
        Counter firstCounter = new Counter();
        Counter secondCounter = new Counter();
        firstCounter.start();
        secondCounter.start();

        try {
            firstCounter.join();
            secondCounter.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        /**
         * Interrupt всего лишь просит остановить поток. Жестко остановить можно тремя способами:
         * stop() - но он устарел
         * return - не красиво
         * System.exit
         *
         * или сделать свой обработчик
         */
    }
}
