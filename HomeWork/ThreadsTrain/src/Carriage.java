/**
 * Created with IntelliJ IDEA.
 * User: Loco
 * Date: 24.09.13
 * Time: 22:58
 * To change this template use File | Settings | File Templates.
 */
public class Carriage {
    private int number;
    private int timeToUnload;

    public Carriage(int number, int timeToUnload) {
        this.number = number;
        this.timeToUnload = timeToUnload;
    }

    public int getNumber() {
        return number;
    }

    public int getTimeToUnload() {
        return timeToUnload;
    }
}
