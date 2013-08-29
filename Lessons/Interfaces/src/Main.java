import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

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

        ArrayList<Employee> employees = new ArrayList<Employee>();
        Company company = new Company();
        company.setEmployees(employees); //Только ArrayList. C другой структурой памяти нельзя использовать.

        /**
         * В LinkedList нет произвольного доступа. Чтобы добраться до элемента - нужно перебирать
         * все элементы.
         * Обычным циклом с LinkedList работать нельзя.
         * Для работы с LinkedList нужно использовать Iterator.
         */

        LinkedList<Employee> employeesLinked = new LinkedList<Employee>();
        company.setEmployees(employeesLinked);

        HashSet<Employee> employeeHashSet= new HashSet<Employee>();
        company.setEmployees(employeeHashSet);

        /**
         * Class Company гибок в том смысле что может работать с различными структурами данных
         */


    }
}
