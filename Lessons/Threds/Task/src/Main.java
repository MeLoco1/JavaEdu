import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        /**
         * Поезда приезжают на вокзал. Но есть только одна коллея, нужно все разгрузить
         *
         */

        TrainStation trainStation = TrainStation.getInstance();
        trainStation.setTrainStationName("South Park");

        List<Carriage> carriages1 = new ArrayList<Carriage>();
        carriages1.add(new Carriage(1, 3000));
        carriages1.add(new Carriage(2, 3000));
        carriages1.add(new Carriage(3, 3000));
        carriages1.add(new Carriage(4, 3000));
        TrainThread train1 = new TrainThread("First train thread", "Arrow", carriages1, 1);

        List<Carriage> carriages2 = new ArrayList<Carriage>();
        carriages2.add(new Carriage(1, 2000));
        carriages2.add(new Carriage(2, 2000));
        carriages2.add(new Carriage(3, 2000));
        carriages2.add(new Carriage(4, 2000));
        TrainThread train2 = new TrainThread("Second train thread", "Force", carriages2, 2);

        train1.setTrainStation(trainStation);
        train2.setTrainStation(trainStation);

        System.out.println(trainStation.getTrainStationName());

        train1.start();
        train2.start();

        train1.join();
        train2.join();


    }
}
