import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        /**
         * В текстовом файле хранятся пары координат X и Y.  Необходимо найти пару, расстояние между которой минимальное
         */

        File file = new File("/home/loco/JavaEdu/HomeWork/Shapes/Dots");
        ArrayList<Dot> dots = WorkWithFile.readFile(file);
        ArrayList<Dot> nearestDots;
        nearestDots = Calculation.getTwoNearestDots(dots);
        System.out.println("First:");
        System.out.println("X = " + nearestDots.get(0).getX() + ", Y = " + nearestDots.get(0).getY());
        System.out.println("Second:");
        System.out.println("X = " + nearestDots.get(1).getX() + ", Y = " + nearestDots.get(1).getY());

        Shape shape = new Shape(dots);
        shape.buildPolygon();
        System.out.println(shape.calcY(new Dot(4, 5)));
    }
}
