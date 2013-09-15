public class Main {

    public static void main(String[] args) {

        // Lesson 6
        {
        int a = 20;
        int b = 20;

        if (a > b) {
         //   System.out.println("a > b");
        }  else if (a < b) {
        //    System.out.println("a < b");
        }  else if (a == 20) {
        //    System.out.println("Bingo!");
        }   else {
        //    System.out.println("a == b");
        }
        }

        // Lesson 7
        {
            int x;

            int[] arr = new int[10];
            arr[0] = 12;
            arr[1] = 6;
            arr[9] = 89;

            x = arr[0];

           // System.out.println(x);
        }

        // Lesson 8
        {
            int[][] arr = new int [3][];
            arr[0] = new int[2];
            arr[1] = new int[10];

            arr[0][0] = 1;
            arr[0][1] = 2;
            arr[1][0] = 3;
            arr[1][1] = 4;

            System.out.println(arr[1][1]);
        }
    }
}
