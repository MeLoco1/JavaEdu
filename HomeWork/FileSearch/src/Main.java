import java.io.File;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        String fileToFind = GUI.menu();
        System.out.println(fileToFind);
        ArrayList<String> findings = search(new File("/home/loco/JavaEdu"), fileToFind);
        for (String item : findings)
            System.out.println(item);
    }

    private static ArrayList<String> search(File folder, String fileToFind) {
        ArrayList<String> result = new ArrayList<>();
        File[] files = folder.listFiles();
       // System.out.println(folder.getAbsolutePath());
        //String error = null;
        try {
        for (int i = 0; i < files.length; i++) {
            if (files[i].isDirectory()) {
                result.addAll(search(files[i], fileToFind));
            } else if (files[i].getName().equals(fileToFind)) {
                result.add(files[i].getAbsolutePath());
            }
        }
        } catch (NullPointerException e) {
            System.out.println(folder.getAbsolutePath() + " : Permissions denied");
        }
        return result;
    }
}
