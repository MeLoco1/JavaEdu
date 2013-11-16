package six;

import myio.FileReadWrite;

import java.io.IOException;
import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * User: loco
 * Date: 11/13/13
 * Time: 8:35 PM
 * To change this template use File | Settings | File Templates.
 */
public class six {
    private static String filePath = "/home/loco/JavaEdu/HomeWork/CollectionsInDepth/file_small";

    public static void main(String[] args) throws IOException {
        List<String> inputFileStrings = FileReadWrite.readFile(filePath);
        NavigableSet<Integer> integerSet = new TreeSet<Integer>();

        for (String fileString : inputFileStrings) {
            integerSet.add(Integer.parseInt(fileString.trim()));
        }

        System.out.println("My Set:");
        for (Integer integer : integerSet) {
            System.out.println(integer);
        }
        System.out.println();

        System.out.println("My inverted Set: ");
        NavigableSet<Integer> invertedSet = integerSet.descendingSet();

        for (Integer integer : invertedSet) {
            System.out.println(integer);
        }

        System.out.println();
        long start;
        long end;
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            int rand = random.nextInt();
            start = System.currentTimeMillis();
            boolean isIncluded = integerSet.contains(rand);
            end = System.currentTimeMillis();
            System.out.println(rand + " is included? " + isIncluded + ". In time: " + (end - start));
            System.out.println("ceiling " + integerSet.ceiling(rand));
            System.out.println("floor " + integerSet.floor(rand));
        }
    }
}
