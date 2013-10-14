package Overloading;

import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: loco
 * Date: 10/12/13
 * Time: 12:56 PM
 * To change this template use File | Settings | File Templates.
 */
public class Pony {

    public String igogo() {
        return "igogo";
    }

    public String igogo(int a) {
        return String.valueOf(a);
    }

    private String igogo(int a, char c) {
        return "igogog a c";
    }

    private String igogo(char c, int a) {
        return "igogog c a";
    }

    private Object igogo(String a) {
        return null;
    }

    public final static Object igogo(int a, int b) throws Exception {
        return "igogog with exception";
    }

    public static Object igogo(int a, int b, int c) throws IOException {
        return "igogog with IOexception";
    }
    // Сигнатура - igogo(int a, int b)

    Object go() throws Exception {
        return "go object";
    }



    public static void main(String[] args) {
        Pony pony = new Pony();
        System.out.println(pony.igogo());
    }

}
