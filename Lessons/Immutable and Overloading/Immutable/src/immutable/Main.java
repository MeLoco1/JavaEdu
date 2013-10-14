package immutable;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        /**
         * Immutable - считается класс, для которого верно утвеждение что для изменения состояния объекта этого класса требуется создание нового экземпляра класса в нужном состоянии.
         Обвертки всех примитивов и String. BigDecimal, BigInteger
         Т.е. только объекты.

         */

        MyImmutable myImmutable = new MyImmutable(23, "Mark", new Date());
        System.out.println(myImmutable);
        myImmutable = new MyImmutable(21, "Me", new Date());
        System.out.println(myImmutable);
        String name = myImmutable.getName();
        name = "aaaa";
        int a = myImmutable.getAge();
        a = 15;
        Date date = myImmutable.getBirthday();
        date.setTime(1000);
        System.out.println(myImmutable);

    }
}
