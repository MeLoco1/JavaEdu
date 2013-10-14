import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: loco
 * Date: 10/10/13
 * Time: 11:27 PM
 * To change this template use File | Settings | File Templates.
 */
public class Parser {
    public List<String> parse(List<String> file) {
        ArrayList<String> result = new ArrayList<String>();
        if (file == null) {
            System.out.println("File is empty");
            return null;
        }
        for (String line : file) {
            result.add(line);
        }
        return result;
    }
}
