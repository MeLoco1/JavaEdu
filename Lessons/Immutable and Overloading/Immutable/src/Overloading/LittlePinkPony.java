package Overloading;

import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created with IntelliJ IDEA.
 * User: loco
 * Date: 10/12/13
 * Time: 1:25 PM
 * To change this template use File | Settings | File Templates.
 */
public class LittlePinkPony extends LittlePony {

    @Override
    public String igogo(int a) {
        return "little pink pony igogo";
    }

    /**
     * Нельзя.
     * Тип возвращаемого значение может быть ниже по иерархии наследования при наследовании.
     *
    public Collection go() {
        return new LinkedList();
    }
    */

    /**
     Can't override from final

    public Object igogo(String a) {
        return "igogog"
    }
     */

    public Queue go() throws RuntimeException, FileNotFoundException {
        return new LinkedList();
    }

    static void ponyRun() {
        System.out.println("Run pink little pony");
    }
}
