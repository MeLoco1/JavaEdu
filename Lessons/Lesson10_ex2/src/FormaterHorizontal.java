import java.io.File;
import java.io.FileNotFoundException;

/**
 * Created with IntelliJ IDEA.
 * User: loco
 * Date: 7/28/13
 * Time: 1:47 PM
 * To change this template use File | Settings | File Templates.
 */
public class FormaterHorizontal extends Formater {


    protected FormaterHorizontal() {
    }

    @Override
    public void executeFormatting(File file) throws FileNotFoundException {
        super.setScanner(file);
        System.out.println("Горизонтальный вывод");
        while (super.getScanner().hasNext()) {
            System.out.print(super.getScanner().next() + " ");
        }
        System.out.println("----------------");
        super.getScanner().close();
    }
}
