import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Loco
 * Date: 24.09.13
 * Time: 23:00
 * To change this template use File | Settings | File Templates.
 */
public class Train extends Thread {
    private String name;
    private List<Carriage> carriages;
    private TrainStation trainStation;

    @Override
    public void run() {
        try {
            int pathNumber = trainStation.getFreePath(name);
            System.out.println(name + " on " + pathNumber);
            trainStation.getPaths().get(pathNumber - 1).unload(this);
            if (name == "Arrow") Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void unload() {


        System.out.println("Unloading train " + name);
        for (Carriage carriage : carriages) {
            try {
                Thread.sleep(carriage.getTimeToUnload());
                System.out.println(name + ", Carriage " + carriage.getNumber() + " has been unloaded");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Train " + name + " has been unloaded");
    }


    public Train(String name, List<Carriage> carriages) {
        super(name);
        this.carriages = carriages;
        this.name = name;
    }

    public void setTrainStation(TrainStation trainStation) {
        this.trainStation = trainStation;
    }
}
