package main;

import Data.Car;
import Data.User;
import Data.Ship;
import dao.Dao;

import java.sql.ResultSet;

public class Main {

    public static void main(String[] args) {
        /**
         * Написать main.DataMapper. Он мапит бины из Java в файл.      Это описывается в М. Фаулер "Архитектура КПП".
         * Объектно-реляционное отображение.
         * Bean состоит из полей класса, гетеров и сетеров. Предназначен для сохранения в файл или БД.
         * Bean соответсвует таблице, а экземпляр - строке таблицы.
         *
         * В датамаппере есть saveObject, loadObject, updateObject, deleteObject
         *
         * Создать аннотацию Entity(fileName = ""), в которой помечать те классы, объекты которых будем сохранять.
         * Нужно знать
         * ID - long
         *
         */

//        Car car1 = new Car();
//        Car car2 = new Car();
//        car2.setFactory("factory");
//
//        User user1 = new User("Me", 25);
//        User user2 = new User("Me", "Loco", 29);
        User user3 = new User("Me", "Kate", 26);
        user3.salary = 2000;
//
//        Ship ship1 = new Ship("Titanic");
//        Ship ship2 = new Ship("Britanic");
//
//        main.DataMapper dataMapper = new main.DataMapper("d:\\Google Диск\\Java\\JavaEdu\\Lessons\\RefAnnoTask\\DB\\");
//        dataMapper.save(ship1);
//        dataMapper.save(ship2);
//        dataMapper.save(user1);
//        dataMapper.save(user2);
//        dataMapper.save(user3);
//        dataMapper.save(car1);
//        dataMapper.save(car2);
//        Data.User loadedUser = (Data.User) dataMapper.load("Data.User", "152956529");
//        Data.Car.Ship loadedShip = (Data.Car.Ship) dataMapper.load("Data.Car.Ship", "1273757730");
//
//        System.out.println("-------------");
//        System.out.println(loadedShip.getName());
//        System.out.println(loadedUser.getId());
//        System.out.println(loadedUser.getName());
//        System.out.println(loadedUser.getSurName());

//        dataMapper.remove("Data.User", "152954623");
        Dao dao = new Dao();
        try {
            dao.connect();
            ResultSet set = dao.executeSelect("SELECT * FROM Ships");
            while (set.next()) {
                System.out.println(set.getString(2));
            }

        //    dao.insertShip(new Ship("Desna"));
        //    dao.insertUser(user3);
        } catch (Exception e) {
            e.printStackTrace();
        }
        dao.disconnect();
    }
}
