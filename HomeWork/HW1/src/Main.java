public class Main {

    public static void main(String[] args) {
        // Задача из урока. Поменять значения числовых переменных местами, не используябуферную переменную
        {
            int a = (int) ((Math.random() - 0.5) * 1000);
            int b = (int) ((Math.random() - 0.5) * 1000);
            System.out.println("a = " + a + ", b = " + b);
            b = a - b;
            a = a - b;
            b = a + b;
            System.out.println("a = " + a + ", b = " + b);
        }
    }
}
