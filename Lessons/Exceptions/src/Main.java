public class Main {

    public static void main(String[] args) {
        /**
         *  2 основных типа: Error and Exception.
         *  Exceptopns делятся на 2 типа
         *  Для всех ошибок, наследуемых от RuntimeException нужно менять логику, использовать if.
         */

        String[] strings = new String[3];

        try {
            Object o = null;
            o.toString();
            for (int i = 0; i < 4; i++) {
                System.out.println(strings[i]);
                if (i == 2) {
                    int a = 10 / 0;
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Wrong index, with message: " + e.getMessage());
            System.out.println("StackTrace: ");
            for (int i = 0; i < e.getStackTrace().length; i++) {
                System.out.print(e.getStackTrace()[i] + " at ");
            }
        } catch (ArithmeticException e) {
            System.out.println();
            System.out.println("Arithmetic error " + e.getMessage());
        } catch (Exception e) {
            System.out.println(" Wide catch");
        }
        finally {
            /**
             * Блок выполняется всегда, кроме:
             * 1) Выключили питание
             * 2) В try, catch - бесконечный цикл
             * 3) System.exit();
             */

            System.out.println("Finally");
        }

        System.out.println();
        System.out.println("The report has been built");

    }
}
