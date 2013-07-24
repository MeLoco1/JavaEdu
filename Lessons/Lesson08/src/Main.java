import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        /**  Наследование
         *  Расширение - это когда класс включает в себя поведения и состояния суперкласса.
         *  К тому же еще добавлят или расширяет свои состояния или поведения.
         *  Понятия: Расширяет и наследует являются синонимы.
         *  Суперкласс - ролитель.
         */

        Proger p1 = new Proger("Me", "Loco", 29, 4000);
        {
            ArrayList<String> langs = new ArrayList<String>();
            langs.add("Java");
            langs.add("Python");
            langs.add("Scala");
            p1.setLangs(langs);
        }
        Employee e1 = new Employee("Kate", "Rodina", 26, 3500);
        Employee p2 = new Employee("Ivan", "Ivanoff", 29, 3000);
        Proger p3 = new Proger("Tonia", "Vasina", 23, 1500);
        {
            ArrayList<String> langs = new ArrayList<String>();
            langs.add("C#");
            langs.add("JavaSctipt");
            langs.add("CSS");
            langs.add("HTML");
            p3.setLangs(langs);
        }

        Manager m1;
        {
            ArrayList<String> departments = new ArrayList<String>();
            departments.add("Techical Operation");
            departments.add("Test Tools");
            m1 = new Manager("Vasya", "Vasin", 35, 4000, departments);
        }

        Manager m2;
        {
            ArrayList<String> departments = new ArrayList<String>();
            departments.add("Test Tools UA");
            departments.add("Performance Measurment");
            m2 = new Manager("Dron", "Osev", 50, 4500, departments);
        }

        Sadmin a1 = new Sadmin("Yegor", "Yegorov", 30, 2000);
        {
            ArrayList<String> servers = new ArrayList<String>();
            servers.add("UA01DB001");
            servers.add("UA01DB002");
            a1.setServers(servers);
        }

        Sadmin a2 = new Sadmin("Danil", "Hansen", 33, 5000);
        {
            ArrayList<String> servers = new ArrayList<String>();
            servers.add("UA01Dtest1");
            servers.add("UA01Dtest2");
            servers.add("UA01Dtest3");
            a2.setServers(servers);
        }

        ArrayList<Employee> employees = new ArrayList<Employee>();
        employees.add(e1);
        employees.add(p1);
        employees.add(p2);
        employees.add(p3);
        employees.add(m1);
        employees.add(m2);
        employees.add(a1);
        employees.add(a2);

        ArrayList<String> departments = new ArrayList<String>();
        departments.add("dep1");
        departments.add("de2");
        departments.add("dep3");

        //   Как достучаться через объект типа родителя к полям наследника. Пример с конструктором
        Employee ee = new Manager("dfd", "dsds", 2000, 34, departments);
        if (ee instanceof Manager) {
            System.out.println("true");
            Manager p = (Manager) ee;    //  Преведение
            for (String line : ((Manager) ee).getDepartments()) {
                System.out.println(line);
            }
        }

        // В ArrayList типа родителя можно добалять как элементы суперкласса, так и всех наследников.

        Employee e = employees.get(1);

        // То же с переменными. Если мы создаем объект суперкласса, то ему можно присваивать и ссылки на наследников
        for (Employee line : employees) {
            if (line instanceof Proger) {           // Если объект - Proger
                System.out.println(line.getName());
            }
        }

        {   //   Типо метод
            int salaryMaxIndex = 0;
            int salaryMax = 0;
            for (int i = 0; i < employees.size(); i++) {
                if (employees.get(i).getSalary() > salaryMax) {
                    salaryMaxIndex = i;
                    salaryMax = employees.get(i).getSalary();
                }
            }
            System.out.println(employees.get(salaryMaxIndex).getName() + " " + employees.get(salaryMaxIndex).getSurname() + " " + salaryMax);
        }

        /** Если на объект потеряны все сильные ссылки, то этот объект становится кандидатом на удаление сборщиком мусора
         *  Сильные ссылки.
         *  Кандидаты.
         */
        System.gc();   //   А вот и сборщик мусора




        //  Удалить

    }
}
