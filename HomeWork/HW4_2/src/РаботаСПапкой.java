import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: loco
 * Date: 7/24/13
 * Time: 8:34 PM
 * To change this template use File | Settings | File Templates.
 */
public class РаботаСПапкой {
    private File папка;
    private File[] файлы;

    public File getПапка() {
        return папка;
    }

    public РаботаСПапкой(String путь) throws IOException {
        //путь = "/home/loco/JavaEdu/HomeWork/HW4_2/Lyrics";
        папка = new File(путь);
        if (папка.exists()) {
            System.out.println("Да, работает");
        } else {
            throw new IOException("Нет такой папки");
        }
        файлы = папка.listFiles();
    }

    public void отсортироватьФайлыПоИмени() {
        for (int и = 0; и < файлы.length; и++) {
            for (int йо = и + 1; йо < файлы.length; йо++) {
                if (файлы[и].getName().length() < файлы[йо].getName().length()) {
                    File временный = файлы[и];
                    файлы[и] = файлы[йо];
                    файлы[йо] = временный;
                }
            }
        }
        System.out.println("Файлы в папке отсортированы:");
    }

    public void слитьФайлы(String имяФайла) throws IOException {
        File новыйФайл = new File(папка + "/" + имяФайла);
        FileWriter писатьВФайл = new FileWriter(новыйФайл);
        for (File линия : файлы) {
            Scanner сканер = new Scanner(линия);
            while (сканер.hasNextLine()) {
                писатьВФайл.append(сканер.nextLine());
                писатьВФайл.append(System.getProperty("line.separator"));
            }
            писатьВФайл.append("--------------");
            писатьВФайл.append(System.getProperty("line.separator"));
        }
        писатьВФайл.flush();
        писатьВФайл.close();
        System.out.println("Файл " + имяФайла + " создан");
    }
}
