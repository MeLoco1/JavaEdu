import java.io.Console;

/**
 * Created with IntelliJ IDEA.
 * User: loco
 * Date: 8/16/13
 * Time: 10:09 PM
 * To change this template use File | Settings | File Templates.
 */
public class Gui {
    public Gui(OpenFile file) {
        Console console = System.console();
        int page = 1;

        while (true) {
            if ((file.isEndFile(page)) || (page <= 0)) {
                break;
            }

            System.out.println("Page " + page);

            file.showFile(page);

            String in = console.readLine();
            if (in.equals("")) {
                page++;
            } else {
                page--;
            }
        }
    }
}
