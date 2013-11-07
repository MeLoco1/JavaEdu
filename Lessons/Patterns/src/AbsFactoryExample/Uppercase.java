package AbsFactoryExample;

/**
 * Created with IntelliJ IDEA.
 * User: loco
 * Date: 11/7/13
 * Time: 8:54 PM
 * To change this template use File | Settings | File Templates.
 */
public class Uppercase implements Registrable {
    @Override
    public String applyRgister(String inputLine) {
        return inputLine.toUpperCase();
    }
}
