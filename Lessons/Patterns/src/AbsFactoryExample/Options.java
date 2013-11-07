package AbsFactoryExample;

/**
 * Created with IntelliJ IDEA.
 * User: loco
 * Date: 11/7/13
 * Time: 8:56 PM
 * To change this template use File | Settings | File Templates.
 */
public class Options implements Factory {


    @Override
    public Formatable getFormater(String type) {
        try {
            Class formater = Class.forName("AbsFactoryExample.AsterixFormatter");
            Object obj = formater.newInstance();
            return (Formatable) Class.forName("AbsFactoryExample." + type).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Registrable getRegistrable(String type) {
        try {
            Class register = Class.forName("AbsFactoryExample.Uppercase");
            Object obj = register.newInstance();
            return (Registrable) Class.forName("AbsFactoryExample." + type).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
