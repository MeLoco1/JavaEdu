import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: loco
 * Date: 9/4/13
 * Time: 9:58 PM
 * To change this template use File | Settings | File Templates.
 */
public class Calculation {
    private static float calculateDistance(Dot dotFrom, Dot dotTo) {
        return (float) Math.sqrt(Math.pow((dotTo.getX() - dotFrom.getX()), 2) + Math.pow((dotTo.getY() - dotFrom.getY()), 2));
    }

    public static ArrayList<Dot> getTwoNearestDots(ArrayList<Dot> dots) {
        ArrayList<Dot> result = new ArrayList<Dot>();

        // Add two elements - two nearest dots
        result.add(null);
        result.add(null);

        float minDistance = calculateDistance(dots.get(0), dots.get(1));

        for (int i = 0; i < dots.size(); i++) {
            for (int j = 1; j < dots.size(); j++) {
                float currentDistance = calculateDistance(dots.get(i), dots.get(j));
                if ((minDistance > currentDistance) && (currentDistance != 0)) {
                    minDistance = currentDistance;
                    result.set(0, dots.get(i));
                    result.set(1, dots.get(j));
                }
            }
        }
        return result;
    }
}
