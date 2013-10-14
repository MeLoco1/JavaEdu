package Overloading;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created with IntelliJ IDEA.
 * User: loco
 * Date: 10/12/13
 * Time: 1:24 PM
 * To change this template use File | Settings | File Templates.
 */
public class LittlePony extends Pony {

    /**
     * @Override private String igogo(int a) {           // Нельзя мужать модификатор
     * return "little pony";
     * }
     */

    protected Queue go() throws IOException, RuntimeException {           // Exception с сужением вниз
        return new LinkedList();
    }

    protected Queue go(int a, String[] arr) {
        return new LinkedList();
    }

    /**
     * Нельзя перегрузить
     * потому что String... = String[]


     protected Queue go(int a, String... a) {
     return new LinkedList();
     }
     */

    public final Object igogo(String a) {
        return "igogog";
    }

    static void ponyRun() {
        System.out.println("Run little pony");
    }

}
