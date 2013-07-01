import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // Задача 1: есть строка String str = “слова разделенные пробелом”;
        //Разбить строку на слова и вывести их в консоль.
        //        Str.split(“ “); - вернет массив строк
        {
            System.out.println(" Задача 1:");
            String str = "Нужно просто разбить это предложение на слова и вывести в консоль.";
            String[] strarr = str.split(" ");
            for (int i = 0; i < strarr.length; i++) {
                System.out.println(strarr[i]);
            }
        }

        // Задача 2: сделать статистику по словам в предложении
        {
            System.out.println(" Задача 2:");
            String str = "Нужно Нужно просто просто просто разбить разбить это предложение на слова слова слова Нужно";
            String[] str_arr = str.split(" ");
            int[] statistic_arr = new int[str_arr.length];

            for (int i = 0; i < str_arr.length; i++) {
                for (int j = 0; j < str_arr.length; j++) {
                    if (str_arr[i].equals(str_arr[j])) {
                        statistic_arr[i]++;
                        if (statistic_arr[i] > 1) {
                            str_arr[j] = "";
                        }
                    }
                }
            }
            for (int i = 0; i < str_arr.length; i++) {
                if (str_arr[i] != "") {
                    System.out.println("\"" + str_arr[i] + "\"" + " = " + statistic_arr[i]);
                }
            }
        }
        // Сделать задачу 2 другим способом
        // Задача 3. Сортировка двумерного массива
        {
            System.out.println(" Задача 3:");
            int[][] arr = new int[4][5];
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    arr[i][j] = (int)(Math.random() * 1000);
                }
            }


        }
    }
}
