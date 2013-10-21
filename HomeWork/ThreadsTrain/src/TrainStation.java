import java.util.List;
import java.util.concurrent.Semaphore;

/**
 * Created with IntelliJ IDEA.
 * User: Loco
 * Date: 24.09.13
 * Time: 23:06
 * To change this template use File | Settings | File Templates.
 */
public class TrainStation {
    private String name;
    private List<Path> paths;
    public final static Semaphore availblePaths = new Semaphore(10);

    public TrainStation(String name) {
        this.name = name;
    }

    public List<Path> getPaths() {
        return paths;
    }

    public void setPaths(List<Path> paths) {
        this.paths = paths;
    }



    private  int freePaths() {
        try {
            for (Path item : paths) {
                if (!item.isOccupied()) {
                    item.setOccupied(true);
                    return item.getNumber();
                }
            }
        } catch (NullPointerException e) {
            System.out.println("There are no paths");
            System.exit(0);
        }
        return -1;
    }

    public synchronized int getFreePath(String trainName) throws InterruptedException {
        int result = freePaths();
        if (result == -1) {
            System.out.println("There are no free paths to unload train " + trainName + ", waiting...");
            Thread.sleep(Options.WAIT_TIME);
            result = getFreePath(trainName);
        }
        return result;
    }
public void unload(Train train) {
    try {
        availblePaths.acquire();
        System.out.println(" Train " + Thread.currentThread().getName() + " is unloading on " + availblePaths.availablePermits() );
        train.unload();
        availblePaths.release();
    } catch (InterruptedException e) {
        e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
    }

}
}
