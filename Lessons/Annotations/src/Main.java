import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;

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

        {
            /**
             * маленький пример с Ineger'ами
             */
            Integer a = 127; // Integer a = Integer.valueOf(127);
            Integer b = 127; // Integer b = Integer.valueOf(127);
            System.out.println(a == b);

            Integer c = 128;
            Integer d = 128;
            System.out.println(c == d);

        }

        /**
         * Передача по ссылке или по значению.
         * Примтивы передаются по значению.
         *
         *
         */

        System.out.println(" Передача по ссылке или по значению ");
        ArrayList<String> list = new ArrayList<String>();
        System.out.println(list.size());
        test(list);
        System.out.println(list.size());
    }

    public static void test(ArrayList<String> list) {

        list.add("String");
        list = null;
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
