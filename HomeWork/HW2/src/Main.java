import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<Employee>();
        employees.add(new Employee("Vasya", "Monstr", 24, 1900, "male"));
        employees.add(new Employee("Vasya", "Monstr", 24, 1900, "male"));
        employees.add(new Employee("Vasya", "Monstr", 24, 1900, "male"));
        employees.add(new Employee("Petya", "supaMonstr", 34, 3900, "male"));
        employees.add(new Employee("Lena", "Zver", 23, 1500, "female"));
        employees.add(new Employee("Lena", "Zver", 23, 1500, "female"));
        employees.add(new Employee("Anton", "Ya", 28, 2000, "male"));
        employees.add(new Employee("Dima", "xz", 26, 2200, "male"));
        employees.add(new Employee("Dima", "xz", 26, 2200, "male"));
        employees.add(new Employee("Nadia", "Kekuh", 30, 2700, "female"));
        employees.add(new Employee("Ola", "Bludova", 40, 3000, "female"));
        employees.add(new Employee("Ola", "Bludova", 40, 3000, "female"));
        employees.add(new Employee("Andrey", "kolesnik", 26, 3000, "male"));
        employees.add(new Employee("Roma", "Dukach", 36, 2400, "male"));
        employees.add(new Employee("Nastia", "Vdovana", 12, 1000, "female"));
        employees.add(new Employee("Nastia", "Vdovana", 12, 1000, "female"));
        employees.add(new Employee("Tanya", "lanavaba", 8, 31000, "female"));
        employees.add(new Employee("Vasya", "Monstr", 24, 1900, "male"));
        employees.add(new Employee("Ola", "Bludova", 40, 3000, "female"));


        Company company = new Company("MyCompany", "somewhere");
        company.employees = employees;

        System.out.println("Невесты по возрасту");
        {
            int min = -1;
            int index = 0;

            while (min == -1) {
                if (employees.get(index).sex.equals("female")) {
                    min = index;
                } else {
                    index++;
                }
            }

            for (int i = min; i < employees.size(); i++) {
                if (employees.get(i).sex.equals("female")) {
                    for (int j = i; j < employees.size(); j++) {
                        if (employees.get(i).sex.equals("female")) {
                            if (employees.get(j).age < employees.get(i).age & employees.get(j).sex.equals("female")) {
                                Employee buf = employees.get(j);
                                employees.set(j, employees.get(i));
                                employees.set(i, buf);
                            }
                        }
                    }
                }
            }

            for (Employee line : employees) {
                if (line.sex.equals("female")) {
                    System.out.println(line.name + " " + line.age);
                }
            }
        }
        System.out.println("Принцы на белых мерседесах");
        {
            int min = -1;
            int index = 0;

            while (min == -1) {
                if (employees.get(index).sex.equals("male")) {
                    min = index;
                } else {
                    index++;
                }
            }

            for (int i = min; i < employees.size(); i++) {
                if (employees.get(i).sex.equals("male")) {
                    for (int j = i; j < employees.size(); j++) {
                        if (employees.get(i).sex.equals("male")) {
                            if (employees.get(j).zp < employees.get(i).zp & employees.get(j).sex.equals("male")) {
                                Employee buf = employees.get(j);
                                employees.set(j, employees.get(i));
                                employees.set(i, buf);
                            }
                        }
                    }
                }
            }

            for (Employee line : employees) {
                if (line.sex.equals("male")) {
                    System.out.println(line.name + " " + line.zp);
                }
            }
        }

        System.out.println("Сотрудники по префиксу: ");
        {
            //Scanner scanner = new Scanner(System.in);
            //String str = scanner.next();
            //System.out.print("Префикс: " + str);
            String prefix = "A";
            for (Employee line : employees) {
                if (line.name.startsWith(prefix)) {
                    System.out.println(line.name);
                }
            }
        }
        System.out.println("Длина фамилии совпадает с префиксом");
        {
            int prefix = 2;
            for (Employee line : employees) {
                if (line.surname.length() == prefix) {
                    System.out.println(line.surname);
                }
            }
        }
        System.out.println("Стастистика по именам");
        {
            ArrayList<Statistic> statistic = new ArrayList<Statistic>();
            statistic.add(new Statistic(0, employees.get(0)));
            for (Employee line : employees) {
                boolean isNameIn = false;
                for (Statistic statline : statistic) {
                    if (statline.employee.name.equals(line.name)) {
                        isNameIn = true;
                        break;
                    }
                }
                if (!isNameIn) {
                    statistic.add(new Statistic(0, line));
                }
            }

            for (Statistic statline : statistic) {
                for (Employee line : employees) {
                    if (statline.employee.name.equals(line.name)) {
                        statline.amount++;
                    }
                }
            }

            for (Statistic line : statistic) {
                System.out.println(line.employee.name + " - " + line.amount);
            }
        }
        System.out.println("Всех женщин - домой, а нам их деньги");
        {
            for (int i = 0; i < employees.size(); i++) {
                if (employees.get(i).sex.equals("female")) {
                    //System.out.println(employees.get(i).name);
                    employees.remove(i--);
                } else {
                    employees.get(i).zp *= 2;
                }
            }
            for (Employee line : employees) {
                System.out.println(line.name + " - " + line.zp);
            }
        }
    }
}