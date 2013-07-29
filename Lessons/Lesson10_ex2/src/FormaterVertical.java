import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: loco
 * Date: 7/28/13
 * Time: 1:03 PM
 * To change this template use File | Settings | File Templates.
 */
public class FormaterVertical extends Formater {


    protected FormaterVertical() {
    }

    @Override
    public void executeFormatting(File file) throws FileNotFoundException {
        super.setScanner(file);
        System.out.println("Вертикальный вывод");
        while (super.getScanner().hasNext()) {
            System.out.println(super.getScanner().next());
        }
        System.out.println("----------------");
        super.getScanner().close();
    }
}
