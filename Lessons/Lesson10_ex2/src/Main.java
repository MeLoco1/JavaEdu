import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        /**
         *  Задача 2.
         *  Есть текстовый файл с текстом. Написать форматер.
         *  На вход подается опция: {0, 1, 2, 3}
         *  0 - все слова выводятся по вертикали
         *  1 - по горизонтали
         *  2 - по диагонали
         *
         *  Стилей форматирования может быть много.
         *
         */

        File file = new File("/home/loco/JavaEdu/HomeWork/HW");

        FormaterOptions formaterOptions = new FormaterOptions(new ArrayList<Formater>());
        formaterOptions.getFormaters().add(new FormaterVertical());
        formaterOptions.getFormaters().add(new FormaterHorizontal());
        formaterOptions.getFormaters().add(new FormaterDiagonal());

        formaterOptions.getFormaters().get(new Gui(formaterOptions).getOption()).executeFormatting(file);

        //  Полиморфизм - способность объекта принимать ссылки на разне объекты.



    }
}
