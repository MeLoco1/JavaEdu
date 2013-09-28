import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class Main {

    public static void main(String[] args) {
        /**
         * Аннотация - в языке Java специальная форма МЕТАДАННЫХ, которая может быть добавлена в исходный код.
         * Аннотации - это метаданные. Даныне о данных.
         *
         *
         * Задача.
         * Написать метод viewObject(Object obj), который в консоль выводит инфу об объекте.
         * Выводить только те поля, которые указал разработчик.
         *
         */

        SimpleClass testClass = new SimpleClass("Name", 23, 999);
        viewObject(testClass);
    }

    private static void viewObject(Object object) {
        Field[] fields = object.getClass().getDeclaredFields();

        for (int i = 0; i < fields.length; i++) {
            Visible a = fields[i].getAnnotation(Visible.class);
            if (a != null)
                System.out.println(fields[i].getName() + " show by " + a.description());

        }
    }


}
