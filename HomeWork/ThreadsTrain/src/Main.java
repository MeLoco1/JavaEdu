import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        TrainStation trainStation = new TrainStation("South Park");
        List<Path> paths = new ArrayList<Path>();
        paths.add(new Path(1));
      //  paths.add(new Path(2));
        trainStation.setPaths(paths);

        List<Carriage> carriages1 = new ArrayList<Carriage>();
        carriages1.add(new Carriage(1, 3000));
        carriages1.add(new Carriage(2, 3000));
        carriages1.add(new Carriage(3, 3000));
        carriages1.add(new Carriage(4, 3000));
        Train train1 = new Train("Arrow", carriages1);

        List<Carriage> carriages2 = new ArrayList<Carriage>();
        carriages2.add(new Carriage(1, 2000));
        carriages2.add(new Carriage(2, 2000));
        carriages2.add(new Carriage(3, 2000));
        carriages2.add(new Carriage(4, 2000));
        carriages2.add(new Carriage(5, 2000));
        Train train2 = new Train("Force", carriages2);

        train1.setTrainStation(trainStation);
        train2.setTrainStation(trainStation);

        train1.start();
        train2.start();


       // train1.join();
       // train2.join();



    }
}
