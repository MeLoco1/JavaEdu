public class Main {

    public static void main(String[] args) {
        /**
         * Способность ссылки ссылаться на объекты различных типов - это полиморфизм.
         *
         *       Interfaces
         *
         *     В ней нет состояний, любое описанное поведение является абстрактным.
         *     Объект из интерфейса создать нельзя.
         */

        IEmployee employee = new Employee();
        employee.report();

    }
}
