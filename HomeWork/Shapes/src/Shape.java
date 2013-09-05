import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: loco
 * Date: 9/4/13
 * Time: 10:48 PM
 * To change this template use File | Settings | File Templates.
 */
public class Shape {
    ArrayList<Dot> dots;
    ArrayList<AreaAndPerimeter> typesOfPolygon;
    Dot leftBorder;
    Dot rightBorder;

    public ArrayList<Dot> getDots() {
        return dots;
    }

    public void setDots(ArrayList<Dot> dots) {
        this.dots = dots;
    }

    public Shape(ArrayList<Dot> dots) {

        this.dots = dots;

        this.typesOfPolygon = new ArrayList<AreaAndPerimeter>();
        this.typesOfPolygon.add(new Triangle());
        this.typesOfPolygon.add(new Polygon());

        leftBorder = findPolygonBorders().get(0);
        rightBorder = findPolygonBorders().get(1);
    }

    private ArrayList<Dot> findPolygonBorders() {  //Result is left border and right border
        ArrayList<Dot> result = new ArrayList<Dot>();

        // Initialize borders
        result.add(dots.get(0));
        result.add(dots.get(0));

        int minX = dots.get(0).getX();
        int maxX = dots.get(0).getX();
        for (int i = 1; i < dots.size(); i++) {

            int currentX = dots.get(i).getX();

            if (minX > currentX) {
                minX = currentX;
                result.set(0, dots.get(i));
            }
            if (maxX < currentX) {
                maxX = currentX;
                result.set(1, dots.get(i));
            }
        }
        return result;
    }

    private int checkTypeOfFigure() {
        if (dots.size() < 3) throw new UnsupportedOperationException();
        if (dots.size() == 3) {
            return 0;
        } else return 1;
    }

    public float calcY(Dot dot) {
        float result;
        float tg = (float) (rightBorder.getY() - leftBorder.getY()) / (float) (rightBorder.getX() - leftBorder.getX());
        result = tg * ((float) dot.getX() - leftBorder.getX()) + (float) leftBorder.getY();
        return result;
    }

    private boolean isDotOnLine() {
        //to do;
        return false;
    }

    public void buildPolygon() {
        ArrayList<Dot> upperLines = new ArrayList<Dot>();
        upperLines.add(leftBorder);
        ArrayList<Dot> downLines = new ArrayList<Dot>();
        downLines.add(rightBorder);
    }

    public int getPerimeter() {
        return this.typesOfPolygon.get(checkTypeOfFigure()).getPerimeter();
    }

    public float getArea() {
        return this.typesOfPolygon.get(checkTypeOfFigure()).getArea();
    }

    private class Triangle implements AreaAndPerimeter {

        @Override
        public int getPerimeter() {

            return 0;
        }

        @Override
        public float getArea() {
            return 0;  //To change body of implemented methods use File | Settings | File Templates.
        }
    }      // to do

    private class Polygon implements AreaAndPerimeter {

        @Override
        public int getPerimeter() {
            return 0;  //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public float getArea() {
            return 0;  //To change body of implemented methods use File | Settings | File Templates.
        }
    }       // to do
}
