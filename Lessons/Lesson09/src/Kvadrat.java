/**
 * Created with IntelliJ IDEA.
 * User: loco
 * Date: 7/27/13
 * Time: 12:16 PM
 * To change this template use File | Settings | File Templates.
 */
public class Kvadrat extends Shape{
    private int storona;

    public Kvadrat(long id, int storona) {
        super(id);
        this.storona = storona;
    }

    @Override
    public String getName() {
        return "Quadrate";  //To change body of implemented methods use File | Settings | File Templates.
    }

    public float getPerimeter() {
        return storona * 4;
    }

    public float getSquare() {
        return storona * storona;
    }

}
