/**
 * Created with IntelliJ IDEA.
 * User: loco
 * Date: 7/13/13
 * Time: 11:54 AM
 * To change this template use File | Settings | File Templates.
 */
public class Student {
    public String name;

    public int[] marks; //массив оценок

    // Реализовать: поменять местами самую большую и самую маленькую оценку.
    public void changeMaxMin() { // void говорит о том что метод не возвращает ничего в качестве результата
        System.out.println("поменять местами самую большую и самую маленькую оценку");
        System.out.println("Оценки после изменения:");
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + ", ");
        }
        int iMax = 0;
        int iMin = 0;
        for (int i = 1; i < marks.length; i++) {
            if (marks[i] > marks[iMax]) {           // Метод внутри класса имеет доступ ко всем полям класса.
                iMax = i;
            }
            if (marks[i] < marks[iMin]) {
                iMin = i;
            }
        }
        int buf = marks[iMax];
        marks[iMax] = marks[iMin];
        marks[iMin] = buf;

        System.out.println("Оценки после изменения:");
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + ", ");
        }
    }

    // Найти средний бал.
    public double findAvarageMark() {
        int sum = 0;
        for (int line : marks) {
            sum += line;
        }
        return sum / marks.length;
    }

    // Задаются 2 числа: a and b. Написать операцию, которая возвращает количество оценок от a до b.
    public int findAmount(int a, int b) { // сигнатура метода
        int result = 0;
        for (int i = 0; i < marks.length; i++) {
            if (a <= marks[i] && marks[i] <= b) {
                result++;
            }
        }
        return result;
    }
}
