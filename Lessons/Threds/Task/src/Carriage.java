/**
 * Created with IntelliJ IDEA.
 * User: loco
 * Date: 9/22/13
 * Time: 11:27 AM
 * To change this template use File | Settings | File Templates.
 */
public class Carriage {
    private int carriageNumber;
    private int timeToUnload;

    public void waitToUnload() throws InterruptedException {
        this.wait();
    }
    @Override
    public String toString() {
        return new StringBuilder().append("Carriage{")
                .append("carriageNumber=")
                .append(carriageNumber)
                .append(", timeToUnload=")
                .append(timeToUnload)
                .append('}').toString();
    }

    public int getCarriageNumber() {
        return carriageNumber;
    }

    public void setCarriageNumber(int carriageNumber) {
        this.carriageNumber = carriageNumber;
    }

    public int getTimeToUnload() {
        return timeToUnload;
    }

    public void setTimeToUnload(int timeToUnload) {
        this.timeToUnload = timeToUnload;
    }

    public Carriage(int carriageNumber, int timeToUnload) {

        this.carriageNumber = carriageNumber;
        this.timeToUnload = timeToUnload;
    }
}
