/**
 * Created with IntelliJ IDEA.
 * User: Loco
 * Date: 24.09.13
 * Time: 23:07
 * To change this template use File | Settings | File Templates.
 */
public class Path {
    private int number;
    private boolean isOccupied;

    public Path(int number) {

        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public boolean isOccupied() {

        return isOccupied;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }

    public void unload(Train train) throws InterruptedException {
        System.out.println("Path: " + number);
        train.unload();
        isOccupied = false;
    }
}
