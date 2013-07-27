/**
 * Created with IntelliJ IDEA.
 * User: loco
 * Date: 7/27/13
 * Time: 11:49 AM
 * To change this template use File | Settings | File Templates.
 */
abstract public class Shape {
    private long id;


    public Shape(long id) {
        this.id = id;
    }

    abstract public String getName();

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {

        return id;
    }

    abstract public float getPerimeter();

    abstract public float getSquare();

}
