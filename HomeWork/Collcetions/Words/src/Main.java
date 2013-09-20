import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        String path = "/home/loco/JavaEdu/HomeWork/ExceptionsAndIO/1/book.txt";

        // Слова правильно, а буквы задом наперед
        {
            List<String> fileLinesDesc;
            List<String> fileLinesAsc;
            fileLinesAsc = WorkWithFile.readFile(path);

            fileLinesDesc = WorkWithText.revertWords(fileLinesAsc);
            fileLinesDesc = WorkWithText.revertLetters(fileLinesAsc);
            for (String item : fileLinesDesc) {
                System.out.println(item);
            }




        }




    }
}
