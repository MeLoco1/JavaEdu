import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: Loco
 * Date: 03.10.13
 * Time: 23:08
 * To change this template use File | Settings | File Templates.
 */
public class DataMapper {
    private long id = 0;
    private String path;
    private ArrayList<String> fileToSave = new ArrayList<>();

    public DataMapper(String path) {
        this.path = path;
    }

    public void saveMetadata(Object object) {
        //fileToSave.add(ids);
        Class classMetadata = object.getClass();
        String folder = classMetadata.getName();
        fileToSave.add(folder);
        System.out.println(folder + " " + fileToSave.get(0));


        if (!isFolderExist(folder)) {
            System.out.println("Creating folder " + folder);
            File outputFolder = new File(path + "\\" + folder);
            outputFolder.mkdir();
            System.out.println("Folder " + outputFolder.getName() + " created");
        }

        System.out.println("------ Writing fields ------");
        Field[] fields = classMetadata.getDeclaredFields();


            fileToSave.add("[Fields]");
            for (int i = 0; i < fields.length; i++) {
                System.out.println(fields[i].getName());
                fileToSave.add(fields[i].getModifiers() + " " + fields[i].getType() + " " + fields[i].getName());
            }

//            System.out.println("Writing constructors");
//            outputStream.println("[Constructors]");
//            Constructor[] constructors = classMetadata.getConstructors();
//            for (int i = 0; i < constructors.length; i++) {
//                System.out.println("Constructor " + i);
//                outputStream.println(i + ":");
//                Class[] paramTypes = constructors[i].getParameterTypes();
//                for (Class paramType : paramTypes) {
//                    outputStream.println(paramType.toString());
//                }
//            }

            System.out.println("------- Writing methods -------");
            fileToSave.add("[Methods]");
            Method[] methods = classMetadata.getMethods();
            for (int i = 0; i < methods.length; i++) {
                if ((methods[i].getName().contains("get")) || (methods[i].getName().contains("set"))) {
                    System.out.println(methods[i].getName());

                }

            }

//            for (Method method : methods) {
//                System.out.println("Имя: " + method.getName());
//                System.out.println("Возвращаемый тип: " + method.getReturnType().getName());
//
//                Class[] paramTypes = method.getParameterTypes();
//                System.out.print("Типы параметров: ");
//                for (Class paramType : paramTypes) {
//                    System.out.print(" " + paramType.getName());
//                }
//                System.out.println();
//            }
        try (PrintWriter outputStream = new PrintWriter(new FileWriter(path + "\\" + folder + "\\metadata"))) {
            for (String line : fileToSave) {
                outputStream.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void save(Object object) {
        String id = String.valueOf(id);
    }


    public boolean isFolderExist(String name) {
        File db = new File(path);
        File[] folders = db.listFiles();
        for (int i = 0; i < folders.length; i++) {
            if (folders[i].getName().equals(name)) return true;
        }
        return false;
    }

}
