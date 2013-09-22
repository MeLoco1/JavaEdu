import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: loco
 * Date: 9/22/13
 * Time: 1:24 PM
 * To change this template use File | Settings | File Templates.
 */
public class Log {
    private static List<String> logMessages = Collections.synchronizedList(new ArrayList<String>());

    public static void addToLog(String message) {
        System.out.println(message);
        logMessages.add(message);
    }

    public static void saveLog() {
        FileReadWrite.writeFile("/home/loco/JavaEdu/Lessons/Threds/Task/Log", logMessages);
        logMessages.clear();
    }
}








