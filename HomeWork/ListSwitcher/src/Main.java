import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList<String> lines = new LinkedList<String>();
        //      lines.isEmpty();
        //      lines.contains("");
        //lines.add("smth");
        System.out.println("index = " + lines.listIterator().nextIndex());


        MyLinkedList<String> myStrings = new MyLinkedList<String>();
        System.out.println(myStrings.isEmpty());
        myStrings.add("1");
        myStrings.add("2");
        myStrings.add("3");
        myStrings.add("4");


        myStrings.listIterator().hasPrevious();
        myStrings.iterator().next();
        System.out.println("Next? " + myStrings.iterator().hasNext());
        System.out.println("Prev? " + myStrings.listIterator().hasPrevious());
        myStrings.iterator().next();
        System.out.println("Next? " + myStrings.iterator().hasNext());
        System.out.println("Prev? " + myStrings.listIterator().hasPrevious());
        myStrings.iterator().next();
        System.out.println("Next? " + myStrings.iterator().hasNext());
        System.out.println("Prev? " + myStrings.listIterator().hasPrevious());
        myStrings.iterator().next();
        System.out.println("Next? " + myStrings.iterator().hasNext());
        System.out.println("Prev? " + myStrings.listIterator().hasPrevious());

        System.out.println("-------------------");
        System.out.println("Test previous");
        System.out.println("Next? " + myStrings.iterator().hasNext());
        System.out.println("Prev? " + myStrings.listIterator().hasPrevious());
        myStrings.listIterator().previous();
        System.out.println("Next? " + myStrings.iterator().hasNext());
        System.out.println("Prev? " + myStrings.listIterator().hasPrevious());
        myStrings.listIterator().previous();
        System.out.println("Next? " + myStrings.iterator().hasNext());
        System.out.println("Prev? " + myStrings.listIterator().hasPrevious());
        myStrings.listIterator().previous();
        System.out.println("Next? " + myStrings.iterator().hasNext());
        System.out.println("Prev? " + myStrings.listIterator().hasPrevious());





/*

        for (int i = 0; i < myStrings.size(); i++) {
            System.out.println( i + " = " + myStrings.get(i) + " has next? " + myStrings.iterator().hasNext());
        }
        System.out.println("---------------");
        System.out.println("2 , index = " + myStrings.indexOf("2"));
        System.out.println("4 , index = " + myStrings.indexOf("4"));
        System.out.println("1 , index = " + myStrings.indexOf("1"));

        myStrings.iterator().remove();

        for (int i = 0; i < myStrings.size(); i++) {
            System.out.println(", i = " + i + ", data = " + myStrings.get(i) + " has next? " + myStrings.iterator().hasNext());
        }


*/

    }
}
