package five;

import myio.FileReadWrite;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static five.Five.getUniqueStrings;

/**
 * Created with IntelliJ IDEA.
 * User: loco
 * Date: 11/6/13
 * Time: 10:42 PM
 * To change this template use File | Settings | File Templates.
 */
public class TestFive {
    private static String filePath = "/home/loco/JavaEdu/HomeWork/CollectionsInDepth/file_small";

    @Test
    public void testGetUnique() throws IOException {
        List<String> inputFileStrings = FileReadWrite.readFile(filePath);
        List<String> uniqueStrings = getUniqueStrings(inputFileStrings);

        int k = 0;
        for (int i = 0; i < inputFileStrings.size(); i++) {
            for (int j = i + 1; j < inputFileStrings.size(); j++) {
                if (inputFileStrings.get(i).equals(inputFileStrings.get(j))) {
                    inputFileStrings.set(j, "mfdd");
                    k++;
                }
            }
        }

        for (int i = 0; i < inputFileStrings.size(); i++) {
            inputFileStrings.remove("mfdd");
        }

        ArrayList<Integer> counts = new ArrayList<Integer>(inputFileStrings.size());
        for (int i = 0; i < inputFileStrings.size(); i++) {
            counts.add(0);
            for (String line : uniqueStrings) {
                if (inputFileStrings.get(i).equals(line)) {
                    counts.set(i, counts.get(i) + 1);
                }
            }
        }

        for (Integer count : counts) {
            if (count > 1) {
                System.out.println("fuck");
            }
        }
    }
}
