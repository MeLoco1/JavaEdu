import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        РаботаСПапкой работа = new РаботаСПапкой(args[0]);
        работа.отсортироватьФайлыПоИмени();
        работа.слитьФайлы("Общий");
    }
}
