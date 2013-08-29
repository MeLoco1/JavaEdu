import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: loco
 * Date: 8/17/13
 * Time: 11:28 AM
 * To change this template use File | Settings | File Templates.
 */
public class Company {
    private Collection<Employee> employees;

    public Collection<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(Collection<Employee> employees) {
        this.employees = employees;
    }
}
