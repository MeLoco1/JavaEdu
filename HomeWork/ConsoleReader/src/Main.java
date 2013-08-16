import java.io.File;
import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("/home/loco/JavaEdu/HomeWork/HW4_2/out/production/HW4_2/Общий");
        OpenFile fileForRead = new OpenFile(file);
        Gui gui = new Gui(fileForRead);
        fileForRead.finilize();
    }
}
