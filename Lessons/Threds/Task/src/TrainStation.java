import java.util.List;

public class TrainStation {
    private static TrainStation instance;
    private String trainStationName;
    private boolean isTrainUnloading = false;

    public synchronized void unload(List<Carriage> carriageList) throws InterruptedException {

        if (isTrainUnloading) {
            Log.addToLog(Thread.currentThread().getName() + " is waiting");
            wait();
        }

        isTrainUnloading = true;

        Log.addToLog("There are " + carriageList.size() + " carriages");

        for (Carriage carriage : carriageList) {
            try {
                Thread.sleep(carriage.getTimeToUnload());
                wait(1000);
            } catch (InterruptedException e) {
                Log.addToLog("Carriage " + carriage + "hasn't been unloaded");
                e.printStackTrace();
            }
            Log.addToLog("Carriage " + carriage + " unloaded successfully");
            Log.saveLog();
        }

        isTrainUnloading = false;
        notifyAll();
    }

    private TrainStation() {
    }

    public static TrainStation getInstance() {
        if (instance != null) return instance;

        synchronized (TrainStation.class) {
            if (instance == null)
                instance = new TrainStation();
        }

        return instance;
    }


    @Override
    public String toString() {
        return "TrainStation{" +
                "trainStationName='" + trainStationName + '\'' +
                '}';
    }

    public String getTrainStationName() {
        return trainStationName;
    }

    public void setTrainStationName(String trainStationName) {
        this.trainStationName = trainStationName;
    }
}
