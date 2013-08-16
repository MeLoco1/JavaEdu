import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: loco
 * Date: 8/16/13
 * Time: 9:18 PM
 * To change this template use File | Settings | File Templates.
 */
public class OpenFile {
    private Scanner scanner;
    private ArrayList<String> lines = new ArrayList<String>();

    public OpenFile(File file) throws FileNotFoundException {
        this.scanner = new Scanner(file);
        while (scanner.hasNext()) {
            lines.add(scanner.nextLine());
        }
        System.out.println("There are " + Options.LINES_PER_PAGE + " lines per page");
        System.out.println("-----------------");
    }

    public void showFile(int page) {

        int pageEnd = Options.LINES_PER_PAGE * page;
        if (isLastPage(page)) {
            pageEnd = lines.size();
        }

        for (int i = Options.LINES_PER_PAGE * (page - 1); i < pageEnd; i++) {
            System.out.println(i + " " + lines.get(i));
        }

    }

    public boolean isEndFile(int page) {
        boolean result = false;
        if (Options.LINES_PER_PAGE * (page - 1) > lines.size()) {
            result = true;
        }
        return result;
    }

    private boolean isLastPage(int page) {
        boolean result = false;
        if (Options.LINES_PER_PAGE * page > lines.size()) {
            result = true;
        }
        return result;
    }

    public void finilize() {
        scanner.close();
    }
}
