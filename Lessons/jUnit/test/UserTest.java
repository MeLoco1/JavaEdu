import org.junit.Assert;
import org.junit.Test;

public class UserTest {
    @Test
    public void testCompareTo() {
        User u1 = new User("Ivan", 22);
        User u2 = new User("Sasha", 24);
        if (u1.compareTo(u2) < 0) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
        }

        Assert.assertTrue("Compare users error", u1.compareTo(u2) > 0);
    }
}
