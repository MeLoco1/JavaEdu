public class Main {

    public static void main(String[] args) {
        String path = "/home/loco/JavaEdu/HomeWork/ExceptionsAndIO/1/book.txt";

        for (String item : WorkWithFile.readFile(path)) {
            System.out.println(item);
        }
    }
}
