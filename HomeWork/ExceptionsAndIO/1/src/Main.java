public class Main {

    public static void main(String[] args) {
        String path = "/home/loco/JavaEdu/HomeWork/ExceptionsAndIO/1/book.txt";
        WorkWithFile workWithFile = new WorkWithFile();
        workWithFile.fileStatistics(path);
        workWithFile.FileWordsStats(path);
    }
}
