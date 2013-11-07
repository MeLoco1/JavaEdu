package AbsFactoryExample;

/**
 * Created with IntelliJ IDEA.
 * User: loco
 * Date: 11/7/13
 * Time: 8:52 PM
 * To change this template use File | Settings | File Templates.
 */
public class AsterixFormatter implements Formatable{

    @Override
    public String formatString(String inputLine) {
        return ("*" + inputLine + "*");
    }
}
