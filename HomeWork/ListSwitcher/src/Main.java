import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        MyLinkedList<String> myStrings = new MyLinkedList<String>();
        System.out.println(myStrings.isEmpty());
        //System.out.println("5 , index = " + myStrings.indexOf("5"));
        myStrings.add("1");
        myStrings.add("2");
        myStrings.add("3");
        myStrings.add("4");
        myStrings.add("2");


//
//        System.out.println("---------------------");
//        myStrings.listIterator().hasPrevious();
//        myStrings.iterator().next();
//        System.out.println("Next? " + myStrings.iterator().hasNext());
//        System.out.println("Prev? " + myStrings.listIterator().hasPrevious());
//        myStrings.iterator().next();
//        System.out.println("Next? " + myStrings.iterator().hasNext());
//        System.out.println("Prev? " + myStrings.listIterator().hasPrevious());
//        myStrings.iterator().next();
//        System.out.println("Next? " + myStrings.iterator().hasNext());
//        System.out.println("Prev? " + myStrings.listIterator().hasPrevious());
//        myStrings.iterator().next();
//        System.out.println("Next? " + myStrings.iterator().hasNext());
//        System.out.println("Prev? " + myStrings.listIterator().hasPrevious());
//
//        System.out.println("-------------------");
//        System.out.println("Test previous");
//        System.out.println("Next? " + myStrings.iterator().hasNext());
//        System.out.println("Prev? " + myStrings.listIterator().hasPrevious());
//        myStrings.listIterator().previous();
//        System.out.println("Next? " + myStrings.iterator().hasNext());
//        System.out.println("Prev? " + myStrings.listIterator().hasPrevious());
//        myStrings.listIterator().previous();
//        System.out.println("Next? " + myStrings.iterator().hasNext());
//        System.out.println("Prev? " + myStrings.listIterator().hasPrevious());
//        myStrings.listIterator().previous();
//        System.out.println("Next? " + myStrings.iterator().hasNext());
//        System.out.println("Prev? " + myStrings.listIterator().hasPrevious());

//        System.out.println("---------------");
//        System.out.println("Test nextIndex");
//        for (String item : myStrings) {
//            System.out.println("prev = " + myStrings.listIterator().previousIndex() + ", next = " + myStrings.listIterator().nextIndex());
//        }
//
//        System.out.println(myStrings.listIterator().nextIndex());
//        System.out.println(myStrings.listIterator().previousIndex());
//        myStrings.listIterator().previous();
//        System.out.println(myStrings.listIterator().previousIndex());
//        myStrings.listIterator().previous();
//        System.out.println(myStrings.listIterator().previousIndex());
//        myStrings.listIterator().previous();
//        System.out.println(myStrings.listIterator().previousIndex());
//        myStrings.listIterator().previous();
//        System.out.println(myStrings.listIterator().previousIndex());
//        myStrings.listIterator().previous();
//        System.out.println(myStrings.listIterator().previousIndex());


//        System.out.println("------Test index of---------");
//        System.out.println("2 , index = " + myStrings.indexOf("2"));
//        System.out.println("4 , index = " + myStrings.indexOf("4"));
//        System.out.println("1 , index = " + myStrings.indexOf("1"));
//        System.out.println("5 , index = " + myStrings.indexOf("5"));

        /*
        System.out.println("------Test remove ---------");
        myStrings.iterator().next();
        System.out.println(myStrings.listIterator().nextIndex());
        myStrings.iterator().remove();
        myStrings.iterator().next();
        myStrings.iterator().next();
        myStrings.iterator().next();
        myStrings.listIterator().previous();
        myStrings.iterator().remove();

        myStrings.iterator().next();
        myStrings.iterator().next();
        myStrings.listIterator().previous();
        myStrings.iterator().remove();
        myStrings.iterator().remove();
        myStrings.iterator().next();
        System.out.println("----result----");
        for (int i = 0; i < myStrings.size(); i++) {
            System.out.println(myStrings.get(i));
        }
    */
        LinkedList<String> strings = new LinkedList<String>();
        strings.add("tew");
        strings.equals(strings);


        System.out.println("------ Test toArray --------");
        /*
        Object[] str =  myStrings.toArray();
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        };


        String[] strs = myStrings.toArray(new String[3]);
        for (int i = 0; i < strs.length; i++) {
            System.out.println(strs[i]);
        };
        */

        //System.out.println(myStrings.lastIndexOf("2"));

        List<String> newlist = myStrings.subList(1, 4);
        for (String line : newlist) {
            System.out.println(line);
        }

    }
}
