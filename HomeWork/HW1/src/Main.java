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
        // Задача 2. Найти самое длинное слово в строке
        {
            System.out.println("Задача 2");
            String str = "Нужно найти самое длиннооооееее слово в этом предложении";

            String[] str_arr = str.split(" ");
            String temp_str = str_arr[0];
            for (int i = 0; i < str_arr.length; i++) {
                if (str_arr[i].length() > temp_str.length()) {
                    temp_str = str_arr[i];
                }
            }
            System.out.println(temp_str);
        }
    }
}
