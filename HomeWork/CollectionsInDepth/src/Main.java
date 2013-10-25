import first.Cypher;

public class Main {

    public static void main(String[] args) {
//        List<String> file = new ArrayList<String>();
//        Random random = new Random();
//        for (int i = 0; i < 1000000; i++) {
//            file.add(random.nextInt() + " ");
//        }
//        FileReadWrite.writeFile("/home/loco/JavaEdu/HomeWork/CollectionsInDepth/file", file);

        /**
         * 1.  Написать программу которая будет считывать данные из файла в строковом виде,
         * шифровать их (например добавляя к каждому char +1 но лучше похитрее)
         * и сохранять данные в зашифрованном строковом представлении в другой файл.
         * (тоесть символами а не только целыми числами).  Какую здесь лучше использовать коллекцию и почему?
         */

        {
            System.out.println("Example of XOR-cypher of words");
            String word = "-6438468732";
            String key = "key";
            System.out.println(word);
            String cryptedWord = Cypher.encode(word, key);
            System.out.println(cryptedWord);

            String decodedWord = Cypher.decode(cryptedWord, key);
            System.out.println(decodedWord);
        }
    }
}
