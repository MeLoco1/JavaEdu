/**
 * Created with IntelliJ IDEA.
 * User: loco
 * Date: 7/27/13
 * Time: 12:18 PM
 * To change this template use File | Settings | File Templates.
 */
public class Circle extends Shape {
    private int radius;

    public Circle(long id, int storona) {
        super(id);
        this.radius = storona;
    }

    @Override
    public String getName() {
        return "Circle";
    }

    @Override
    public float getPerimeter() {
        return (float) (2 * Math.PI * radius);
    }

    @Override
    public float getSquare() {
        return (float) (Math.PI * radius * radius);
    }
}
