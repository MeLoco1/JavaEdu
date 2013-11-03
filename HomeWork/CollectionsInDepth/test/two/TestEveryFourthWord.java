package two;

import org.junit.Test;
import junit.framework.Assert;
import myio.FileReadWrite;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * User: loco
 * Date: 10/31/13
 * Time: 9:45 PM
 * To change this template use File | Settings | File Templates.
 */
public class TestEveryFourthWord {
    @Test
    public void testReadWords() throws Exception {
        ArrayDeque<String> result = new ArrayDeque<String>();
        ArrayList<String> fileLines = (ArrayList<String>) FileReadWrite.readFile("/home/loco/JavaEdu/HomeWork/CollectionsInDepth/file_small");

        EveryFourthWord efw = new EveryFourthWord();
        Deque<String> test = efw.readWords("/home/loco/JavaEdu/HomeWork/CollectionsInDepth/file_small");
        List<String> toCompare = new LinkedList<String>();
        int counter = 0;
        for (int i = fileLines.size() - 1; i >= 0; i--) {
            if (++counter == 4) {
                toCompare.add(fileLines.get(i));
                counter = 0;
            }
        }
            Assert.assertEquals(test.toString(), toCompare.toString());
    }

}
