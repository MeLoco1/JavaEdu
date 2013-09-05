/**
 * Created with IntelliJ IDEA.
 * User: loco
 * Date: 9/4/13
 * Time: 12:00 AM
 * To change this template use File | Settings | File Templates.
 */
public class Dot {
    int x;
    int y;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Dot(int x, int y) {

        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Dot dot = (Dot) o;

        if (x != dot.x) return false;
        if (y != dot.y) return false;

        return true;
    }
}
