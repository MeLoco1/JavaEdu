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
                if (str_arr[i] != "") {     // Спросить почему не equals!
                    System.out.println("\"" + str_arr[i] + "\"" + " = " + statistic_arr[i]);
                }
            }
        }
        // Сделать задачу 2 другим способом
        {
            System.out.println(" Задача 2, способ 2:");
            String str = "Нужно Нужно просто просто просто разбить разбить это предложение на слова слова слова Нужно";
            String[] str_arr = str.split(" ");
            String[] tempstr_arr = new String[str_arr.length];
            tempstr_arr[0] = str_arr[0];
            int index = 1;

            for (int i = 1; i < str_arr.length; i++) {
                boolean isneededword = true;
                for (int j = 0; j < tempstr_arr.length; j++) {
                    if (str_arr[i].equals(tempstr_arr[j])) {
                        isneededword = false;
                        break;
                    }
                }
                if (isneededword) {
                    tempstr_arr[index] = str_arr[i];
                    index++;
                }
            }
            for (int i = 0; i < index; i++) {
                int sum = 0;
                for (int j = 0; j < str_arr.length; j++) {
                    if (tempstr_arr[i].equals(str_arr[j])) {
                        sum++;
                    }
                }
                System.out.println("\"" + tempstr_arr[i] + "\" = " + sum);
            }
        }
        // Задача 3. Сортировка двумерного массива
        {
            System.out.println(" Задача 3:");
            int[][] arr = new int[4][5];
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    arr[i][j] = (int) ((Math.random() - 0.5) * 1000);
                    System.out.print(arr[i][j] + ", ");
                }
                System.out.println();
            }

            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    for (int k = 0; k < arr.length; k++) {
                        for (int l = 0; l < arr[k].length; l++) {
                            if (arr[k][l] > arr[i][j]) {
                                int buf = arr[i][j];
                                arr[i][j] = arr[k][l];
                                arr[k][l] = buf;
                            }
                        }
                    }
                }
            }

            System.out.println();
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.print(arr[i][j] + ", ");
                }
                System.out.println();
            }
        }
    }
}

