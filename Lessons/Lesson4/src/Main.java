import sun.swing.BakedArrayList;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        //OOP
        // Массив не позволяет добавить новый в середину массива. Невозможно удалить
        //ArrayList and LinkedList - тркутуры данных
        {
            String[] str_arr = new String[10];
            ArrayList<String> strings = new ArrayList<String>();  // <Strings> - тип
            //ArrayList<String> strings = new ArrayList<String>(90);
            // Размер для ArrayList не имеет значение
            System.out.println(str_arr.length);
            System.out.println(strings.size());
            strings.add("A");
            System.out.println(strings.size());
            strings.add("B");
            strings.add("C");
            System.out.println(strings.get(0));
            strings.remove(0);
            System.out.println(strings);

            ArrayList<String> strings1 = new ArrayList<String>();
            strings1.add("A");
            strings1.add("B");
            //strings: B, C;   strings1 = A, B
            strings.removeAll(strings1);
            System.out.println(strings);
            strings.set(0, "X");
            strings.add("Z");
            strings.add(1, "Y");
            System.out.println(strings);
            strings.clear();
            System.out.println(strings.size());

            // ArrayList не работает с примитивами
            ArrayList<Integer> integers = new ArrayList<Integer>();
            ArrayList<ArrayList<String>> list = new ArrayList<ArrayList<String>>();
            list.add(strings);
        }
        // Alt + Enter - подключение нужных пакетов

        // Задача 1. Организовать ArrayList пользователей.

        ArrayList<Worker> users = new ArrayList<Worker>();
        users.add(new Worker("Vasya", "Monstr", 2000.00f, 1985));
        users.add(new Worker("Lena", "Zver", 1500.00f, 1987));
        users.add(new Worker("Anton", "Ya", 3000.00f, 1984));

        // Задача 2. Вывести имена пользователей в АЛ
        for (int i = 0; i < users.size(); i++) {
            Worker user = users.get(i);
            System.out.println("Фамилия: " + user.surname + " Имя: " + user.name + " Год рождения: " + user.birth_year + " ЗП = " + user.zp);
        }

        // Задача 3. НАйти пользователя с макс ЗП и мин ЗП и поменять местами
        System.out.println("Задача 3");
        users.add(new Worker("Katya", "Moya", 2800.00f, 1986));
        {
            Worker user_min = users.get(0);
            Worker user_max = user_min;
            int min = 0;
            int max = 0;

            for (int i = 0; i < users.size(); i++) {
                Worker user = users.get(i);
                if (user.zp < user_min.zp) {
                    user_min = user;
                    min = i;
                }
                if (user.zp > user_max.zp) {
                    user_max = user;
                    max = i;
                }
            }

            users.set(min, user_max);
            users.set(max, user_min);
            for (int i = 0; i < users.size(); i++) {
                Worker user = users.get(i);
                System.out.println("Фамилия: " + user.surname + " Имя: " + user.name + " Год рождения: " + user.birth_year + " ЗП = " + user.zp);
            }
        }

        // Задача 4. Отсортировать юзеров по возрастанию ЗП
        System.out.println("---------------------------");
        System.out.println("Задача 4");
        {
            for (int i = 0; i < users.size(); i++) {
                for (int j = i; j < users.size(); j++) {
                    Worker user_i = users.get(i);
                    Worker user_j = users.get(j);
                    if (user_j.zp < user_i.zp) {
                        users.set(i, user_j);
                        users.set(j, user_i);
                    }
                }
            }
            for (int i = 0; i < users.size(); i++) {
                Worker user = users.get(i);
                System.out.println("Фамилия: " + user.surname + " Имя: " + user.name + " Год рождения: " + user.birth_year + " ЗП = " + user.zp);
            }
        }
        // Задача 5. Найти сумму юзеров компании. Сравнить эти компании и вывести компанию с макс ЗП
        System.out.println("---------------------------");
        System.out.println("Задача 5");
        {
            ArrayList<Company> companies = new ArrayList<Company>();
            companies.add(new Company());
            {
                ArrayList<Employee> employees = new ArrayList<Employee>();

                employees.add(new Employee("Me", 2000, 1984));
                employees.add(new Employee("Dima", 1700, 1988));
                employees.add(new Employee("Andrey", 2500, 1987));


                companies.get(0).name = "Simcorp";
                companies.get(0).employees = employees;
            }

            companies.add(new Company());
            {
                ArrayList<Employee> employees = new ArrayList<Employee>();

                employees.add(new Employee("Kate", 1800, 1987));
                employees.add(new Employee("Max", 3500, 1978));

                companies.get(1).name = "Softheme";
                companies.get(1).employees = employees;
            }

            companies.add(new Company());
            {
                ArrayList<Employee> employees = new ArrayList<Employee>();

                employees.add(new Employee("Roma",1500, 1976));
                employees.add(new Employee("Yarik", 2300, 1983));
                employees.add(new Employee("Sasha", 2500, 1983));

                companies.get(2).name = "Parus";
                companies.get(2).employees = employees;
            }
            int min_sum = 0;
            int index = 0;
            for (int i = 0; i < companies.size(); i++) {
                int sum = 0;
                for (int j = 0; j < companies.get(i).employees.size(); j++) {
                    sum = sum + companies.get(i).employees.get(j).zp;
                }
                if (min_sum < sum) {
                    min_sum = sum;
                    index = i;
                }
            }
            System.out.println("Max ЗП = " + min_sum + ", Компания: " + companies.get(index).name);
        }
        // Объект состоит из других объектов - агрегация и композиция
        // Д.з.: В чем разница между ними, почитать
    }
}
