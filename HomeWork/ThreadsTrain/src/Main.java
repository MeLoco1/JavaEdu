import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        TrainStation trainStation = new TrainStation("South Park");
        List<Path> paths = new ArrayList<Path>();
        List<Train> trains = new ArrayList<Train>();
        List<String> file = null;


        try {
            file = FileReadWrite.readFile("d:\\Google Диск\\Java\\JavaEdu\\HomeWork\\ThreadsTrain\\src\\Conf");
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (file == null) {
            System.out.println("The configuration hasn't been loaded");
            throw new NullPointerException();
        }

        int pathsNumber = 0;
        for (int i = 0; i < file.size(); i++) {
            String fileLine = file.get(i);
            try {
                if (fileLine.contains("Paths")) {
                    String[] confLine = fileLine.split("=");
                    pathsNumber = Integer.parseInt(confLine[1]);
                }

                List<Carriage> carriages = new ArrayList<Carriage>();
                if (fileLine.contains("Train")) {
                    String[] train = fileLine.split(",");
                    for (int j = 0; j < Integer.parseInt(train[1]); j++) {
                        carriages.add(new Carriage(j, Integer.parseInt(train[2])));
                    }
                    trains.add(new Train(train[0], carriages));

                }

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Wrong configuration file");
                e.printStackTrace();
            } catch (NumberFormatException e) {
                System.out.println("Wrong configuration file");
                e.printStackTrace();
            }
        }

        for (int i = 0; i < pathsNumber; i++) {
            paths.add(new Path(i + 1));
        }
        trainStation.setPaths(paths);

        for (Train item : trains) {
            item.setTrainStation(trainStation);
            item.start();

        }
        for (Train item : trains) {
            item.join();
        }

    }
}
