import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: loco
 * Date: 7/28/13
 * Time: 1:01 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class Formater {
    private Scanner scanner;

    protected Formater(){
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(File file) throws FileNotFoundException {
        this.scanner = new Scanner(file);
    }

    public abstract void executeFormatting(File file) throws FileNotFoundException;

}
