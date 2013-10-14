import java.util.Comparator;

/**
 * Created with IntelliJ IDEA.
 * User: loco
 * Date: 10/13/13
 * Time: 1:53 PM
 * To change this template use File | Settings | File Templates.
 */
public class UserBySalaryComparator implements Comparator<User> {
    @Override
    public int compare(User o1, User o2) {
        if (o1.getSalary() < o2.getSalary()) return -1;
        if (o1.getSalary() > o2.getSalary()) return 1;
        return 0;
    }

}
