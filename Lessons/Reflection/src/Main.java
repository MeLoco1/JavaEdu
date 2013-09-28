import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) {
        /**
         * Нужно написать метод viewObject(Object obj)
         * В консоль выводит
         * Имя класса
         * Поле0 = значение
         * Поле1 = значение
         * Поле2 = значение
         */

        User user = new User("Me", 29);
        viewObject(user);

        /**
         *        Виртуальная машина условно состоит из объектов и классов
         */

        User.class.getDeclaredFields();

    }

    public static void viewObject(Object object) {
        //System.out.println(object.getDataFromObject());

        System.out.println(object.getClass());  // Это рефлексия
        Class c = object.getClass();
        Field[] fields = c.getDeclaredFields();
        for (int i = 0; i < fields.length; i++) {
            System.out.println(fields[i].getName());
        }

        /**
         * Рефлексифность - это способность получить ссылку к объекту класса
         *
         * Экземпляр класса - это состояние класса
         * Объект класса - это описание класса.
         *
         */

        System.out.println("Methods:");
        Method[] methods = object.getClass().getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            System.out.println(methods[i].getName());
        }

        try {
            System.out.println("-------------");
            System.out.println(methods[0].invoke(object));
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }



    }
}
