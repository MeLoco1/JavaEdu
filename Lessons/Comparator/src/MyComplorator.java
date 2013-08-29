import java.util.Comparator;

/**
 * Created with IntelliJ IDEA.
 * User: loco
 * Date: 8/17/13
 * Time: 1:20 PM
 * To change this template use File | Settings | File Templates.
 */
public class MyComplorator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        if (o1.getAge() > o2.getAge()) {
            return 1;
        } else if (o1.getAge() < o2.getAge()) {
            return -1;
        }
        return 0;
    }
}
