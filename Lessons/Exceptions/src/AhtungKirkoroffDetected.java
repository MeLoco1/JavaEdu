/**
 * Created with IntelliJ IDEA.
 * User: loco
 * Date: 9/7/13
 * Time: 1:34 PM
 * To change this template use File | Settings | File Templates.
 */
public class AhtungKirkoroffDetected extends Exception {
    private String message;

    public AhtungKirkoroffDetected(String message) {
        super();
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
