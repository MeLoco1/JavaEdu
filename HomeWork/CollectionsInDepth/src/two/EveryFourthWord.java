package two;

import myio.FileReadWrite;

import java.io.IOException;
import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * User: loco
 * Date: 10/31/13
 * Time: 9:43 PM
 * To change this template use File | Settings | File Templates.
 */
public class EveryFourthWord {
    public Deque<String> readWords(String path) {
        List<String> fileLines = new ArrayList<String>();
        try {
            fileLines = FileReadWrite.readFile(path);
        } catch (IOException e) {
            System.out.println(path + "  doesn't exits");
            e.printStackTrace();
        }

        Deque<String> result = new ArrayDeque<String>();
        for (int i = 0; i < fileLines.size(); i += 4) {
            result.offerFirst(fileLines.get(i));
        }
        return result;
    }
}
