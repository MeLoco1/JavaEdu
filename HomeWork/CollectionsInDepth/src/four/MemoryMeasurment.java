package four;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * User: loco
 * Date: 10/31/13
 * Time: 11:48 PM
 * To change this template use File | Settings | File Templates.
 */
public class MemoryMeasurment {
    public static void main(String[] args) {
        long start;
        long end;
        Random random = new Random();
        {
            List<String> testArray = new ArrayList<String>();
            for (int i = 0; i < 400000; i++) {
                testArray.add(Integer.toString(random.nextInt()));
            }
            testArray.add("word");
            start = System.currentTimeMillis();
            Boolean finding = testArray.contains("word");
            end = System.currentTimeMillis();
            System.out.println("Time to find the word in ArrayList in 0 cell = " + (end - start));
            System.out.println("Memory: " + (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()));
            /**
             * result = 8-10
             */
        }

        {
            List<String> testArray = new ArrayList<String>();
            for (int i = 0; i < 400000; i++) {
                testArray.add(Integer.toString(random.nextInt()));
            }
            testArray.add(200000, "word");
            start = System.currentTimeMillis();
            Boolean finding = testArray.contains("word");
            end = System.currentTimeMillis();
            System.out.println("Time to find the word in ArrayList in 200 000 cell = " + (end - start));
            System.out.println("Memory: " + (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()));
            /**
             *  result = 4-5
             */
        }

        {
            List<String> testArray = new ArrayList<String>();
            for (int i = 0; i < 400000; i++) {
                testArray.add(Integer.toString(random.nextInt()));
            }
            testArray.add(399999, "word");
            start = System.currentTimeMillis();
            Boolean finding = testArray.contains("word");
            end = System.currentTimeMillis();
            System.out.println("Time to find the word in ArrayList in 399 999 cell = " + (end - start));
            System.out.println("Memory: " + (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()));

            /**
             *  result = 6
             */

            /**
             * It perform search from the beginning but it seems it used red-black tree.
             */
        }

        {
            List<String> testLinkedList = new LinkedList<String>();
            for (int i = 0; i < 400000; i++) {
                testLinkedList.add(Integer.toString(random.nextInt()));
            }
            testLinkedList.add("word");
            start = System.currentTimeMillis();
            Boolean finding = testLinkedList.contains("word");
            end = System.currentTimeMillis();
            System.out.println("Time to find the word in LinkedList in 0 cell = " + (end - start));
            System.out.println("Memory: " + (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()));
            /**
             * result = 20
             */
        }

        {
            List<String> testLinkedList = new LinkedList<String>();
            for (int i = 0; i < 400000; i++) {
                testLinkedList.add(Integer.toString(random.nextInt()));
            }
            testLinkedList.add(200000, "word");
            start = System.currentTimeMillis();
            Boolean finding = testLinkedList.contains("word");
            end = System.currentTimeMillis();
            System.out.println("Time to find the word in LinkedList in 200 000 cell = " + (end - start));
            System.out.println("Memory: " + (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()));
            /**
             * result = 30
             */
        }

        {
            List<String> testLinkedList = new LinkedList<String>();
            for (int i = 0; i < 400000; i++) {
                testLinkedList.add(Integer.toString(random.nextInt()));
            }
            testLinkedList.add(400000 - 1, "word");
            start = System.currentTimeMillis();
            Boolean finding = testLinkedList.contains("word");
            end = System.currentTimeMillis();
            System.out.println("Time to find the word in LinkedList in 399 999 cell = " + (end - start));
            System.out.println("Memory: " + (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()));
            /**
             * result = 17
             */
        }

        /**
         * More memory, more time
         */
    }
}


