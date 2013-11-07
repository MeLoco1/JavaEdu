package five;

import myio.FileReadWrite;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


/**
 * Created with IntelliJ IDEA.
 * User: loco
 * Date: 11/6/13
 * Time: 11:29 PM
 * To change this template use File | Settings | File Templates.
 */
public class Five {
    private static String filePath = "/home/loco/JavaEdu/HomeWork/CollectionsInDepth/file_small";
    private static ArrayList<String> strings;

    static {
        try {
            strings = (ArrayList<String>) FileReadWrite.readFile(filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<String> getUniqueStrings(List<String> strings) {
        Set<String> result = new HashSet<String>();
        result.addAll(strings);
        return new ArrayList<String>(result);
    }
}
