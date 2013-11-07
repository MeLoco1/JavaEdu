package AbsFactoryExample;

/**
 * Created with IntelliJ IDEA.
 * User: loco
 * Date: 11/7/13
 * Time: 8:50 PM
 * To change this template use File | Settings | File Templates.
 */
public interface Factory {
    Formatable getFormater(String type);

    Registrable getRegistrable(String type);
}
