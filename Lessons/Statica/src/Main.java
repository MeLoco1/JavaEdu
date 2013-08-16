public class Main {

    public static void main(String[] args) {
        /**
         * Статический метод - это метод, который принадлежит классу, а не объекту.
         */
        Object ob = new Object();
        System.out.println(ob.toString());

        Employee.create();

        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        System.out.println(Employee.a);
        employee1.a = 2;
        System.out.println(Employee.a);
        employee2.a = 3;
        System.out.println(employee1.a);
    }
}
