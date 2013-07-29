import java.io.Console;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: loco
 * Date: 7/29/13
 * Time: 4:00 PM
 * To change this template use File | Settings | File Templates.
 */
public class Gui {
    private int option;

    public int getOption() {
        return option;
    }

    public Gui(FormaterOptions formaterOptions) {
        System.out.println("Выберите опцию форматирования: 0 - по вертикали, 1 - по горизонтали, 2 - по диагонали");
        try {
            Console console = System.console();
            if (console == null) throw new IOException();
            String in = console.readLine();
            option = Integer.parseInt(in);
            System.out.println("Ваш выбор = " + option);
            System.out.println(System.getProperty("line.separator"));
            if (option > formaterOptions.getFormaters().size()) throw new IOException();
        } catch (IOException exception) {
            System.out.println("Нет такой опции.");
        }
    }
}
