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

        System.out.println("----------");
        Shape shape = new Shape(dots);

    }
}
