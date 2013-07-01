public class Main {

    public static void main(String[] args) {
        int var = 0;
        var = 3;

        // Два сопсоба создания массивов
        // 1 Необходимо присвоить все значения
        int[] arr = {1, 2, 3};
        // 2  Заполнено несколько значений, остальные = 0
        int[] array = new int[40];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 4;

        float[] array3 = new float[5];

        // Индекс - номер ячейки в массиве. Нумерация начинается с 0
        // Значение ячейки - то то располагается в ячейке.
        // Изменить размер массива в процессе выполнения программы нельзя. Размер массива фиксированный

        int a = array[0];
        System.out.println(array[2]);
        array[2] = a;
        System.out.println(array[2]);

        //Можно вытащить размер массива
        a = array.length;
        System.out.println(a);

        //Цикл For (счетчик; условия выхода; шаг счетчика)

        //    Задача 1  Задать массив и вывести его содержимое в консоль.
        System.out.println("Задача 1:");
        {
            int[] arra = {43, 92, 12, 8, 0, 1, 432, -6, 72, -45};
            for (int i = 0; i < arra.length; i++) {
                System.out.print(arra[i] + " ");
            }
        }

        //    Задача 2. Вывести содержимое массива в противополодном направлении.
        System.out.println();
        System.out.println("Задача 2:");
        {
            int[] arra = {43, 92, 12, 8, 0, 1, 432, -6, 72, -45};
            for (int i = arra.length - 1; i >= 0; i--) {
                System.out.print(arra[i] + " ");
            }
        }

        //    Задача 3. Найти сумму элементов.
        System.out.println();
        System.out.println("Задача 3:");
        {
            int[] arra = {43, 92, 12, 8, 0, 1, 432, -6, 72, -45};
            int sum = 0;
            for (int i = 0; i < arra.length; i++) {
                sum = sum + arra[i];
            }
            System.out.println("Sum is " + sum);

        }

        //    Завдача 4. Найти min and max.
        System.out.println();
        System.out.println("Задача 4:");
        {
            int[] arra = {43, 92, 12, 8, 0, 1, 432, -6, 72, -45};
            int min = arra[1];
            int max = min;
            for (int i = 0; i < arra.length; i++) {
                if (arra[i] < min) {
                    min = arra[i];
                }
                ;
                if (arra[i] > max) {
                    max = arra[i];
                }
                ;
            }
            System.out.println("MIN = " + min + ", MAX = " + max);
        }
        //    Завдача 5. Найти min and max и поменять местами.
        System.out.println();
        System.out.println("Задача 5:");
        {
            int[] arra = {43, 92, 12, 8, 0, 1, 432, -6, 72, -45};
            int min = arra[1];
            int max = min;
            int min_index = 0;
            int max_index = 0;
            for (int i = 0; i < arra.length; i++) {
                if (arra[i] < min) {
                    min = arra[i];
                    min_index = i;
                }
                ;
                if (arra[i] > max) {
                    max = arra[i];
                    max_index = i;
                }
                ;
            }
            arra[min_index] = max;
            arra[max_index] = min;
            for (int i = 0; i < arra.length; i++) {
                System.out.print(arra[i] + " ");
            }
        }

        //    Завдача 6. Сортировка одномерного массива.
        System.out.println();
        System.out.println("Задача 6:");
        {
            int[] arra = {43, 92, 12, 8, 0, 1, 432, -6, 72, -45};

            for (int i = 0; i < arra.length; i++) {
                for (int j = i + 1; j < arra.length; j++) {
                    if (arra[j] < arra[i]) {
                        int buf = arra[i];
                        arra[i] = arra[j];
                        arra[j] = buf;
                    }
                }
            }
            for (int i = 0; i < arra.length; i++) {
                System.out.print(arra[i] + " ");
            }
        }

        // Сортировка пузырьком
        System.out.println();
        System.out.println("Сортировка пузырьком:");
        {
            int[] arra = {43, 92, 12, 8, 0, 1, 432, -6, 72, -45};
            for (int j = 0; j < arra.length; j++) {
                for (int i = j + 1; i < arra.length; i++) {
                    if (arra[i] < arra[j]) {
                        int buf = arra[i];
                        arra[i] = arra[j];
                        arra[j] = buf;
                    }
                }
            }
            for (int i = 0; i < arra.length; i++) {
                System.out.print(arra[i] + " ");
            }
        }
        // Д.З.: Какие существуют арифметические и логические операции, цикл for и другие циклы


    }
}
