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
    private Dot leftBorder;
    private Dot rightBorder;
    private float area;

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

        buildPolygon();
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

    private float calcY(Dot dot) {
        float result;
        float tg = (float) (rightBorder.getY() - leftBorder.getY()) / (float) (rightBorder.getX() - leftBorder.getX());
        result = tg * ((float) dot.getX() - leftBorder.getX()) + (float) leftBorder.getY();
        return result;
    }

    private boolean isDotOnLine(Dot dot) {
        if (dot.getY() == calcY(dot)) return true;
        return false;
    }

    private ArrayList<Dot> sortByX(ArrayList<Dot> dots) {
        int min = 0;
        for (int i = 0; i < dots.size(); i++) {
            for (int j = i + 1; j < dots.size(); j++) {
                if (dots.get(j).getX() < dots.get(i).getX()) {
                    Dot buf = dots.get(j);
                    dots.set(j, dots.get(i));
                    dots.set(i, buf);
                }
            }
        }
        return dots;
    }

    private ArrayList<Dot> sortByXDesc(ArrayList<Dot> dots) {
        int max = 0;
        for (int i = 0; i < dots.size(); i++) {
            for (int j = i + 1; j < dots.size(); j++) {
                if (dots.get(j).getX() > dots.get(i).getX()) {
                    Dot buf = dots.get(j);
                    dots.set(j, dots.get(i));
                    dots.set(i, buf);
                }
            }
        }
        return dots;
    }

    public void buildPolygon() {
        ArrayList<Dot> upperLines = new ArrayList<Dot>();
        upperLines.add(leftBorder);
        ArrayList<Dot> downLines = new ArrayList<Dot>();
        downLines.add(rightBorder);

        dots.remove(leftBorder);
        dots.remove(rightBorder);

        for (int i = 0; i < dots.size(); i++) {
            Dot currentDot = dots.get(i);
            if (isDotOnLine(currentDot)) {  // Dots on the line between the left and right
                upperLines.add(currentDot);
                dots.remove(i);
            } else if (calcY(currentDot) < currentDot.getY()) {
                upperLines.add(currentDot);
            } else {
                downLines.add(currentDot);
            }
        }

        upperLines = sortByX(upperLines);
        downLines = sortByXDesc(downLines);


        dots.removeAll(dots);
        dots.addAll(0, upperLines);
        dots.addAll(dots.size(), downLines);

        downLines = sortByX(downLines);
        System.out.println("---upper---");
        for (Dot item : upperLines) {
            System.out.println(item.getX() + "," + item.getY());
        }

        System.out.println("----down------------");
        for (Dot item : downLines) {
            System.out.println(item.getX() + "," + item.getY());
        }

        int i = 0;
        int j = 1;

        while (true) {
            Dot a = upperLines.get(i);
            if (upperLines.get(i + 1).getX() > upperLines.get(j).getX()) {

            }
        }

    }

    public float getPerimeter() {
        return this.typesOfPolygon.get(checkTypeOfFigure()).getPerimeter();
    }

    public float getArea() {
        return this.typesOfPolygon.get(checkTypeOfFigure()).getArea();
    }

    private class Triangle implements AreaAndPerimeter {
        float a = Calculation.calculateDistance(dots.get(0), dots.get(1));
        float b = Calculation.calculateDistance(dots.get(1), dots.get(2));
        float c = Calculation.calculateDistance(dots.get(2), dots.get(0));

        @Override
        public float getPerimeter() {
            return (a + b + c) / 2;
        }

        @Override
        public float getArea() {
            float p = getPerimeter();
            return (float) Math.sqrt(p * (p - a) * (p - b) * (p - c));
        }
    }

    private class Polygon implements AreaAndPerimeter {

        @Override
        public float getPerimeter() {
            float result = 0f;
            for (int i = 0; i < dots.size(); i++) {

                ArrayList<Dot> twoDots = new ArrayList<Dot>();
                if (i < (dots.size() - 1)) {
                    result += Calculation.calculateDistance(dots.get(i), dots.get(i + 1));
                } else {
                    result += Calculation.calculateDistance(dots.get(i), dots.get(0));
                }
            }
            return result;
        }

        @Override
        public float getArea() {
            return area;
        }
    }
}
