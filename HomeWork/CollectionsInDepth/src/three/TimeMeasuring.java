package three;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * User: loco
 * Date: 10/31/13
 * Time: 10:51 PM
 * To change this template use File | Settings | File Templates.
 */
public class TimeMeasuring {
    public static void main(String[] args) {
        Random random = new Random();
        long start;
        long end;

        //List<String> testArrayFixedRandomAccess = new ArrayList<String>(4000000);

        /**
         * Arraylist
         * Add to the end.
         * The fastest
         *

         for (int i = 0; i < 400000; i++) {
         start = System.currentTimeMillis();
         //testArrayFixedRandomAccess.add((int)(Math.random()*1000000), Integer.toString(random.nextInt()));
         testArrayFixedRandomAccess.add(Integer.toString(random.nextInt()));
         testArrayFixedRandomAccess.add(Integer.toString(random.nextInt()));
         testArrayFixedRandomAccess.add(Integer.toString(random.nextInt()));
         testArrayFixedRandomAccess.add(Integer.toString(random.nextInt()));
         testArrayFixedRandomAccess.add(Integer.toString(random.nextInt()));
         testArrayFixedRandomAccess.add(Integer.toString(random.nextInt()));
         testArrayFixedRandomAccess.add(Integer.toString(random.nextInt()));
         testArrayFixedRandomAccess.add(Integer.toString(random.nextInt()));
         testArrayFixedRandomAccess.add(Integer.toString(random.nextInt()));
         testArrayFixedRandomAccess.add(Integer.toString(random.nextInt()));
         end = System.currentTimeMillis();
         System.out.println("Time to add random int as String to " + i + " in ArrayList = " + (end - start));
         }
         */


        /**
         * Arraylist
         * Add to the beginning.
         * This one is slow, because array is copied on every iteration.
         * It is fast in the beginning but it becomes slower while growing.
         *
         * Works faster without initial capacity

         for (int i = 0; i < 400000; i++) {
         start = System.currentTimeMillis();
         //testArrayFixedRandomAccess.add((int)(Math.random()*1000000), Integer.toString(random.nextInt()));
         testArrayFixedRandomAccess.add(0, Integer.toString(random.nextInt()));
         testArrayFixedRandomAccess.add(0, Integer.toString(random.nextInt()));
         testArrayFixedRandomAccess.add(0, Integer.toString(random.nextInt()));
         testArrayFixedRandomAccess.add(0, Integer.toString(random.nextInt()));
         testArrayFixedRandomAccess.add(0, Integer.toString(random.nextInt()));
         testArrayFixedRandomAccess.add(0, Integer.toString(random.nextInt()));
         testArrayFixedRandomAccess.add(0, Integer.toString(random.nextInt()));
         testArrayFixedRandomAccess.add(0, Integer.toString(random.nextInt()));
         testArrayFixedRandomAccess.add(0, Integer.toString(random.nextInt()));
         testArrayFixedRandomAccess.add(0, Integer.toString(random.nextInt()));
         end = System.currentTimeMillis();
         System.out.println("Time to add int as String to " + i + " in ArrayList = " + (end - start));
         }
         */

        /**
         * Arraylist
         * Add to the middle.
         * A little bit faster, but it still slow
         * No significant changes with capacity

         for (int i = 0; i < 400000; i++) {
         start = System.currentTimeMillis();
         testArrayFixedRandomAccess.add(((int)(i/2)), Integer.toString(random.nextInt()));
         testArrayFixedRandomAccess.add(((int)(i/2)), Integer.toString(random.nextInt()));
         testArrayFixedRandomAccess.add(((int)(i/2)), Integer.toString(random.nextInt()));
         testArrayFixedRandomAccess.add(((int)(i/2)), Integer.toString(random.nextInt()));
         testArrayFixedRandomAccess.add(((int)(i/2)), Integer.toString(random.nextInt()));
         testArrayFixedRandomAccess.add(((int)(i/2)), Integer.toString(random.nextInt()));
         testArrayFixedRandomAccess.add(((int)(i/2)), Integer.toString(random.nextInt()));
         testArrayFixedRandomAccess.add(((int)(i/2)), Integer.toString(random.nextInt()));
         testArrayFixedRandomAccess.add(((int)(i/2)), Integer.toString(random.nextInt()));
         testArrayFixedRandomAccess.add(((int)(i/2)), Integer.toString(random.nextInt()));

         end = System.currentTimeMillis();
         System.out.println("Time to add int as String to " + i + " in ArrayList = " + (end - start));
         }

         */

        List<String> testLinkedList = new LinkedList<String>();
        /**
         * LinkedList
         * Very fast adding to both sides of the collection

         for (int i = 0; i < 300000; i++) {
         start = System.currentTimeMillis();
         testLinkedList.add(0, Integer.toString(random.nextInt()));
         testLinkedList.add(0, Integer.toString(random.nextInt()));
         testLinkedList.add(0, Integer.toString(random.nextInt()));
         testLinkedList.add(0, Integer.toString(random.nextInt()));
         testLinkedList.add(0, Integer.toString(random.nextInt()));
         testLinkedList.add(0, Integer.toString(random.nextInt()));
         testLinkedList.add(0, Integer.toString(random.nextInt()));
         testLinkedList.add(0, Integer.toString(random.nextInt()));
         testLinkedList.add(0, Integer.toString(random.nextInt()));
         testLinkedList.add(0, Integer.toString(random.nextInt()));

         end = System.currentTimeMillis();
         System.out.println("Time to add int as String to " + i + " in LinkedList = " + (end - start));
         }
         */

        /**
         * LinkedList
         * To the middle. It is the slowest I have ever seen
         */
        for (int i = 0; i < 300000; i++) {
            start = System.currentTimeMillis();
            testLinkedList.add((int)(i/2), Integer.toString(random.nextInt()));
            testLinkedList.add((int)(i/2), Integer.toString(random.nextInt()));
            testLinkedList.add((int)(i/2), Integer.toString(random.nextInt()));
            testLinkedList.add((int)(i/2), Integer.toString(random.nextInt()));
            testLinkedList.add((int)(i/2), Integer.toString(random.nextInt()));
            testLinkedList.add((int)(i/2), Integer.toString(random.nextInt()));
            testLinkedList.add((int)(i/2), Integer.toString(random.nextInt()));
            testLinkedList.add((int)(i/2), Integer.toString(random.nextInt()));
            testLinkedList.add((int)(i/2), Integer.toString(random.nextInt()));
            testLinkedList.add((int)(i/2), Integer.toString(random.nextInt()));


            end = System.currentTimeMillis();
            System.out.println("Time to add int as String to " + i + " in LinkedList = " + (end - start));
        }






    }
}
