
public class Main {

    public static void main(String[] args) {
        String[] str = new String[2];
        str[0] = "test";
        if (str[0].equals("test") && str[0] == "test") {

            System.out.println("It's working");
        } else {
            System.out.println("It's not working");
        }

        String str2 = "test";
        String str3 = "test";
        if (str2 == str3) {

            System.out.println("It's working too");
        } else {
            System.out.println("It's not working");
        }

        // Заполнение двумерного массива
        int[][] arr = {
                {1, 1, 1, 1},
                {2, 2, 2, 2},
                {3, 3, 3, 3}
        };
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }


        // Shift + F6 - rename the variable
    }
}

