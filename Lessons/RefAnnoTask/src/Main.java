public class Main {

    public static void main(String[] args) {
        /**
         * Написать DataMapper. Он мапит бины из Java в файл.      Это описывается в М. Фаулер "Архитектура КПП".
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

        Car car1 = new Car();
        Car car2 = new Car();
        car2.setFactory("factory");

        User user1 = new User("Me", 25);
        User user2 = new User("Me", "Loco", 29);
        User user3 = new User("Me", "Kate", 26);
        user3.salary = 2000;

        DataMapper dataMapper = new DataMapper("d:\\Google Диск\\Java\\JavaEdu\\Lessons\\RefAnnoTask\\DB\\");
        dataMapper.saveMetadata(user1);
        dataMapper.save(user1);



    }
}
