/**
 * Created with IntelliJ IDEA.
 * User: loco
 * Date: 7/27/13
 * Time: 12:00 PM
 * To change this template use File | Settings | File Templates.
 */
public class Triangle extends Shape {

private int rebro;

    public Triangle(long id, int rebro) {
        super(id);
        this.rebro = rebro;
    }

    @Override
    public String getName() {
        return "Triangle";
    }

    public float getPerimeter() {
        return 3 * rebro;
    }

    public float getSquare() {
        return (float) (Math.sqrt(3) * rebro * rebro / 4);
    }

}
