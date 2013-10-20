import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: loco
 * Date: 10/19/13
 * Time: 1:47 PM
 * To change this template use File | Settings | File Templates.
 */
public class SmilyUser extends User {
    private Date secondDate;

    public SmilyUser(String name, int age, Date date, Date secondDate) {
        super(name, age, date);
        this.secondDate = secondDate;
    }

    @Override
    public SmilyUser clone() throws CloneNotSupportedException {
        SmilyUser clone = (SmilyUser) super.clone();
        this.secondDate = (Date) this.getSecondDate().clone();
        return clone;
    }

    @Override
    public String toString() {
        return "SmilyUser{ extends " + super.toString() +
                "secondDate=" + secondDate +
                '}';
    }

    public Date getSecondDate() {
        return secondDate;
    }

    public void setSecondDate(Date secondDate) {
        this.secondDate = secondDate;
    }
}
