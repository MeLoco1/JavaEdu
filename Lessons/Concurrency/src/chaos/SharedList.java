package chaos;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: loco
 * Date: 9/29/13
 * Time: 11:07 AM
 * To change this template use File | Settings | File Templates.
 */
public class SharedList {
    private static volatile List<String> list = new CopyOnWriteArrayList<String>();

    public static List<String> getList() {
        return list;
    }
}
