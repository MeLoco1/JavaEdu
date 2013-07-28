import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: loco
 * Date: 7/27/13
 * Time: 11:55 AM
 * To change this template use File | Settings | File Templates.
 */
public class ShapeContainer {
    private ArrayList<Shape> shapes;

    public ArrayList<Shape> getShapes() {
        return shapes;
    }

    public void setShapes(ArrayList<Shape> shapes) {
        this.shapes = shapes;
    }

    public ShapeContainer(ArrayList<Shape> shapes) {

        this.shapes = shapes;
    }

    public long getId() {
        long result = 1;
        if (shapes == null) {
            result = 0;
        }

        for (Shape line : shapes) {
            if (line.getId() >= result) {
                result++;
            }
        }
        return result;
    }

    public Shape getShapeWithMaxSquare() {
        if (shapes == null) {
            System.out.println("There are no shapes");
            return null;
        }

        Shape result = shapes.get(0);
        for (int i = 1; i < shapes.size(); i++) {
            if (shapes.get(i).getSquare() > shapes.get(i).getSquare()) {
                result = shapes.get(i);
            }
        }
        return result;
    }

    public int getSumPerimeter() {
        int result = 0;
        for (Shape line : shapes) {
            result += line.getPerimeter();
        }
        return result;
    }

    public void removeKvadrats() {
        for (int i = 0; i < shapes.size(); i++) {
            if (shapes.get(i) instanceof Kvadrat) {
                shapes.remove(i--);
            }
        }
    }

    public void report() {
        System.out.println("My shapes:");
        System.out.println("-------------");
        for (Shape line : shapes) {
            //BigDecimal value = new BigDecimal(line.getPerimeter());
            //System.out.println(line.getId() + ", " + line.getName() + ", perimeter = " + value.round(new MathContext(4)) + ", Square = " + Math.round(line.getSquare()));

            // Форматированнй вывод
            System.out.println(line.getId() + ", " + line.getName() + ", perimeter = " + line.getPerimeter() + ", Square = " + Math.round(line.getSquare()));
            System.out.format("%10.3f%n", line.getPerimeter()); //%n позволяет добавить перевод строки
            ////10 заков всего, 3 после запятой
        }
    }
}

