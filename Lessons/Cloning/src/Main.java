import java.io.*;
import java.util.Date;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {
        /**
         * Клонирование - это процесс, при котором мы получаем независимую копию объекта.
         * Копия означает что клонированный объект эквивалентен оригиналу.
         * При изменении одного из них состояние другого не меняется.
         *
         * Контракт для клонирования:
         * 1) x == x.clone();
         * 2) x.equals(x.clone());  --> true
         * 3) x.getClass == x.clone().getClass();
         *
         * Поверхностное клонирование.
         * Глубокое копирование.
         *
         * Родительская реализация метода clone в классе Object является справедливой и соответсвует
         * требованиям контракта процесса клонирования для классов, состояние которых
         * описывается полями простых типов и/или представлена immutable объектами.
         * (это те, состояние которых нельзя поменять без создания нового экземпляра
         * и представлены в Java классами-обертками простых типов, String, BigInteger, BigDecimal)
         *
         * Для клонирования имлементируем Clonable, переопределяем Clone, расширяем модификатор до
         * public. В переопредленной Clone обязательно вызвать super.clone().
         *
         * Копирующий конструктор гарантированно выделяет память под новый объект. Меньше вероятность
         * ошибки. Минус - громоздкая реализация конструктора по месту.
         *
         *
         * Третий способ - сериализация и десериализация.
         *
         */



        //User original = new User("Paul", 30, new Date());
        SmilyUser original = new SmilyUser("Paul", 30, new Date(), new Date());


        Tablet[] tablets = new Tablet[2];
        tablets[0] = new Tablet("Nexus7", 100);
        tablets[1] = new Tablet("TF200", 200);
        original.setTablets(tablets);

        SmilyUser clone = (SmilyUser) original.clone();

        // User clone = new User(original.getName(),original.getAge());

        //User clone = original.clone();
        //User clone = new User(original);

        /**
         * Третий способ - сериализация и десериализация.
         * Ресурсоемкий.
         */

//        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
//        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
//        //objectOutputStream.writeObject(original);
//        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
//        ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
//        //User clone = (User) objectInputStream.readObject();


        System.out.println("original " + original);
        System.out.println("clone " + clone);

        System.out.println("equals " + original.equals(clone));
        System.out.println("links " + (original == clone));
        System.out.println("classes " + (original.getClass() == clone.getClass()));
        System.out.println("ages " + (original.getAge() == clone.getAge()));
        System.out.println("names " + (original.getName() == clone.getName()));
        System.out.println("dates " + (original.getDate() == clone.getDate()));
        System.out.println("tablets arrays " + (original.getTablets() == clone.getTablets()));
        System.out.println();

        System.out.println("Change state of original");
        original.setAge(25);
        original.setName("Vasya");
        System.out.println("original " + original);
        System.out.println("clone " + clone);

        System.out.println("Change state of clone");
        clone.setAge(23);
        clone.setName("Doe");

        clone.getDate().setTime(0);
        clone.getTablets()[0] = new Tablet("iPad", 5000);
        clone.getTablets()[1].setTabletName("abc");
        clone.getSecondDate().setTime(100000);
        System.out.println("original " + original);
        System.out.println("clone " + clone);
    }
}
