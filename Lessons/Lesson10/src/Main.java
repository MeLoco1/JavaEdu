import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        /** Задача 1.
         *  Есть класс город. В нем есть разные предприятия: банк, магазин, фабрика.
         *  Выделяем класс предприятие, которых много в городе. Есть имена, сотрудники.
         *  Особенность: каждая компания генерирует отчет. Но отчеты у всех разные.
         *  Банк - выводится список сотрудников по возрастанию ЗП.
         *  Магазин - такой же, но по убыванию.
         *  Фабрика - сумма всех ЗП и все.
         *
         *  Вывести все отчеты.
         *
         */

        ArrayList<Employee> bankEmployees = new ArrayList<Employee>();
        bankEmployees.add(new Employee("Me", "Loco", 29, 4500, "Proger"));
        bankEmployees.add(new Employee("Kate", "Loco", 26, 2500, "Front-end proger"));
        bankEmployees.add(new Employee("Vasya", "Loco", 34, 1500, "Дворник"));
        bankEmployees.add(new Employee("Tania", "xz", 22, 2400, "book-keeper"));
        bankEmployees.add(new Employee("Ivan", "Ivanov", 56, 3500, "Head"));
        Bank myBank = new Bank("Bank Crasher", bankEmployees);

        ArrayList<Employee> shopEmployees = new ArrayList<Employee>();
        shopEmployees.add(new Employee("Tonia", "Spel", 53, 2365, "Designer"));
        shopEmployees.add(new Employee("Kate", "Minina", 23, 1800, "Trader"));
        shopEmployees.add(new Employee("Vasya", "Pupkin", 34, 2500, "Manager"));
        Shop myShop = new Shop("My Shop", shopEmployees);

        ArrayList<Employee> factoryEmployees = new ArrayList<Employee>();
        factoryEmployees.add(new Employee("Dima", "Bin", 33, 3200, "Proger"));
        factoryEmployees.add(new Employee("Senia", "Sen", 34, 2200, "Kran"));
        factoryEmployees.add(new Employee("Kolya", "Piv", 33, 1500, "Bezdel"));
        Factory myFactory = new Factory("My Factory", factoryEmployees);

        City myCity = new City("New paradise", new ArrayList<Company>());
        myCity.getCompanies().add(myBank);
        myCity.getCompanies().add(myFactory);
        myCity.getCompanies().add(myShop);

        for (Company item : myCity.getCompanies()) {
            item.report();
        }


    }
}
