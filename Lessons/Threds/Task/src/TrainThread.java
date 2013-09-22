import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: loco
 * Date: 9/22/13
 * Time: 11:23 AM
 * To change this template use File | Settings | File Templates.
 */
public class TrainThread extends Thread {
    private String trainName;
    private List<Carriage> carriagelist;
    private int number;
    private TrainStation trainStation;

    @Override
    public void run() {
        if (trainStation != null) try {
            trainStation.unload(carriagelist);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        else
            Log.addToLog("There is no train station defined");
    }

    @Override
    public String toString() {
        return new StringBuilder()
                .append("TrainThread{")
                .append("trainName='")
                .append(trainName)
                .append('\'')
                .append(", carriagelist=")
                .append(carriagelist)
                .append(", number=")
                .append(number)
                .append('}').toString();
    }

    public TrainThread(String name, String trainName, List<Carriage> carriagelist, int number) {
        super(name);
        this.trainName = trainName;
        this.carriagelist = carriagelist;
        this.number = number;
    }

    public String getTrainName() {
        return trainName;
    }

    public void setTrainName(String trainName) {
        this.trainName = trainName;
    }

    public List<Carriage> getCarriagelist() {
        return carriagelist;
    }

    public void setCarriagelist(List<Carriage> carriagelist) {
        this.carriagelist = carriagelist;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public TrainStation getTrainStation() {
        return trainStation;
    }

    public void setTrainStation(TrainStation trainStation) {
        this.trainStation = trainStation;
    }
}
