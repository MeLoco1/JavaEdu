import java.io.File;
import java.io.FileNotFoundException;

/**
 * Created with IntelliJ IDEA.
 * User: loco
 * Date: 7/28/13
 * Time: 1:50 PM
 * To change this template use File | Settings | File Templates.
 */
public class FormaterDiagonal extends Formater {

    protected FormaterDiagonal() {
    }

    @Override
    public void executeFormatting(File file) throws FileNotFoundException {
        super.setScanner(file);
        System.out.println("Диагональный вывод");
        int indent = 0;
        while (super.getScanner().hasNext()) {
            String line = super.getScanner().next();
            StringBuilder blanks = new StringBuilder();
            for (int i = 0; i < indent; i++) {
                blanks.append(" ");
            }
            System.out.println(blanks.toString() + line);
            indent += line.length();
        }
        System.out.println("----------------");
        super.getScanner().close();
    }
}
