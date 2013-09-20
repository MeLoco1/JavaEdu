import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        //String[] st = {"ewew", " tytu"};
        //System.out.println(st.length);
        MyArrayList<String> test = new MyArrayList<String>();
        test.add("1");
        test.add("2");
        test.add("3");
        test.remove(2);
        test.trimToSize();


    }
}
