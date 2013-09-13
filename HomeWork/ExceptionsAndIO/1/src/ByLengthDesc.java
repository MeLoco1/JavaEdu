import java.util.Comparator;

/**
 * Created with IntelliJ IDEA.
 * User: loco
 * Date: 9/13/13
 * Time: 9:52 PM
 * To change this template use File | Settings | File Templates.
 */
public class ByLengthDesc implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        if (o1.length() < o2.length()) {
            return 1;
        } else if (o1.length() > o2.length()) {
            return -1;
        }
        return o1.compareTo(o2);
    }
}
