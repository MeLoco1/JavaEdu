package thrd;

/**
 * Created with IntelliJ IDEA.
 * User: root
 * Date: 12/1/13
 * Time: 4:07 PM
 */
public class InsufficientFundsException extends Throwable {
    @Override
    public String getMessage() {
        System.out.println("There is no money on the account");
        return super.getMessage();
    }
}
