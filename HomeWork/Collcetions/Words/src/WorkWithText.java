import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: loco
 * Date: 9/20/13
 * Time: 8:30 PM
 * To change this template use File | Settings | File Templates.
 */
public class WorkWithText {
    public static List<String> revertWords(List<String> fileLines) {
        List<String> result = new ArrayList<>();

        String line;
        for (String item : fileLines) {

            String[] words = item.split(" ");
            line = "";
            for (int i = words.length - 1; i >= 0; i--) {
                line += " " + words[i];
            }
            result.add(0, line);
        }
        return result;
    }

    public static List<String> revertLetters(List<String> fileLines) {
        List<String> result = new ArrayList<>();

        for (String item : fileLines) {
            String line = "";
            String[] words = item.split(" ");
            for (int i = 0; i < words.length; i++) {

                line += " " + new StringBuffer(words[i]).reverse().toString();
            }
            result.add(line);
        }
        return result;
    }
}
