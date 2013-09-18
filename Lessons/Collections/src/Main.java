import java.util.*;

public class Main {

    public static void main(String[] args) {
        /**
         * ArrayList увеличивается на 3/2 размера + 1. Например 10 элементов +1 элемент.
         * И ArrayList увеличится до 16
         */

        List<Integer> array = new ArrayList<Integer>();
        int a = 10;
        Integer integer = new Integer(15);

        array.add(integer);
        array.add(543);
        array.add(123);
        array.add(-975);
        array.add(234);
        array.add(3);
        array.add(a); //Auto-boxing

//        for (int i = 0; i < array.size(); i++) {
//            System.out.println(array.get(i));
//        }
//        for (Integer item : array) {
//            System.out.println(item);
//        }

//        System.out.println("Collection");
        ListIterator<Integer> iterator = array.listIterator(array.size());
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }

//        System.out.println("Collection");
//        while (iterator.hasPrevious()) {
//            System.out.println(iterator.previous());
//        }

        array.add(2, 8);
        for (Integer item : array) {
            System.out.println(item);
        }

        ArrayList<Integer> tmp = (ArrayList<Integer>)array;
        tmp.trimToSize();

        System.out.println("------------------------------");

        /**
         * Множество Set
         * Контракт между equals и HashCode звучит так: если хеш-коды эквивалентны, то и объекты эквивалентны
         * Если объекты эквивалентны, то хешкоды не обязательно эквивалентны
         */

        Iphone iphone1 = new Iphone();
        iphone1.setPrice(550);
        Iphone iphone2 = new Iphone();
        iphone2.setPrice(500);
        System.out.println(iphone1.equals(new User()));

        System.out.println("------------Users-----------");
        User user1 = new User();
        user1.setName("name");
        user1.setAge(20);
        List<Iphone> iphones = new ArrayList<Iphone>();
        iphones.add(iphone1);
        user1.setIphones(iphones);

        User user2 = new User();
        user2.setName("name");
        user2.setAge(20);
        List<Iphone> iphones2 = new ArrayList<Iphone>();
        iphones2.add(iphone1);
        user2.setIphones(iphones2);

        System.out.println(user1.equals(user2));

        System.out.println("-------------HashSet------------");
        Set<Iphone> iphoneSet = new HashSet<Iphone>();
        iphoneSet.add(iphone1);
        iphoneSet.add(iphone2);
        System.out.println(iphoneSet.size());
        System.out.println(iphoneSet.isEmpty());

        for (Iphone item : iphoneSet) {
            System.out.println(item);
        }
        /**
         * Map = ассоциативный массив, который хранит в себе ассоциации ключ - значение, ключи уникальны
         */

        System.out.println("--------- HashMap ---------");
        Map<Integer, Iphone> iphoneMap = new HashMap<Integer, Iphone>();
        iphoneMap.put(1, iphone1);
        iphoneMap.put(2, iphone2);
        Iphone loosedIphone = iphoneMap.put(1, iphone2);
        System.out.println(loosedIphone);

        System.out.println("----iphoneMap.keySet()----");
        for (Integer item : iphoneMap.keySet()) {
            System.out.println(iphoneMap.get(item));
        }

        System.out.println("---iphoneMap.values()----");
        for (Iphone item : iphoneMap.values()) {
            System.out.println(item);
        }

        System.out.println("---EntrySet----");
        for (Map.Entry<Integer, Iphone> item : iphoneMap.entrySet()) {
            System.out.println("Key = " + item.getKey() + " value = " + item.getValue());
        }

        System.out.println();
        System.out.println("------------------ TreeSet ----------------");

        /**
         * Красно-черное дерево
         */

        SortedSet<Integer> sortedSet = new TreeSet<Integer>();
        sortedSet.add(66);
        sortedSet.add(666);
        sortedSet.add(626);
        sortedSet.add(345);

        for (Integer item : sortedSet) {
            System.out.println(item);
        }

        SortedSet<Iphone> iphoneSortedSet = new TreeSet<Iphone>();
        Iphone iphone3 = new Iphone();
        iphone3.setPrice(670);
        iphoneSortedSet.add(iphone1);
        iphoneSortedSet.add(iphone2);
        iphoneSortedSet.add(iphone3);

        for (Iphone item : iphoneSortedSet) {
            System.out.println(item);
        }
    }
}
