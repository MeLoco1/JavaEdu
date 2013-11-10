package main;

import Data.Mapable;

import java.io.*;
import java.lang.reflect.Field;
import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * Data.User: Loco
 * Date: 03.10.13
 * Time: 23:08
 * To change this template use File | Settings | File Templates.
 */
public class DataMapper {
    private long id;
    private String path;

    public DataMapper(String path) {
        this.path = path;
    }

    public void save(Mapable object) {
        ArrayList<String> fileToSave = new ArrayList<>();
        Class classMetadata = object.getClass();
        String folder = classMetadata.getName();
        try {
            Field id = object.getClass().getDeclaredField("id");
            id.setAccessible(true);
            id.set(object, this.id + object.getId());
            this.id++;
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            fileToSave.add("id=" + this.id + object.getId());
            this.id++;
        }

        if (!isFolderExist(folder)) {
            System.out.println("Creating folder " + folder);
            File outputFolder = new File(path + "\\" + folder);
            outputFolder.mkdir();
            System.out.println("Folder " + outputFolder.getName() + " created");
        }

        System.out.println("------ Writing fields ------");
        Field[] fields = classMetadata.getDeclaredFields();

        for (int i = 0; i < fields.length; i++) {
            Field field = fields[i];

            field.setAccessible(true);
            String statement = null;

            try {
                statement = field.getName() + "=" + field.get(object);
            } catch (IllegalAccessException e) {
                id--;
                e.printStackTrace();
            }
            System.out.println(statement);
            fileToSave.add(statement);
        }

        try (PrintWriter outputStream = new PrintWriter(new FileWriter(path + "\\" + folder + "\\data", true))) {
            outputStream.println("{");
            for (String line : fileToSave) {
                outputStream.println(line);
            }
            outputStream.println("}");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Object load(String objectType, String id) {
        System.out.println("Loading class " + objectType);
        Object result = null;

        if (!isFolderExist(objectType)) {
            System.out.println("There are no saved objects of " + objectType);
            return null;
        }
        Class classToLoad = null;

        ArrayList<String[]> fieldValues = null;

        try {
            fieldValues = getClassFromFile(objectType, id);
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (String[] line : fieldValues) {
            System.out.println(line[0] + "=" + line[1]);
        }

        if (fieldValues == null) {
            System.out.println("No object with id " + id);
            return null;
        }

        try {
            classToLoad = Class.forName(objectType);
            result = classToLoad.newInstance();
            System.out.println("new object of " + classToLoad.getName() + " created");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        try {
            Field idField = classToLoad.getField(id);
            idField.set(result, Long.parseLong(id));

        } catch (NoSuchFieldException e) {
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }


        for (int i = 0; i < fieldValues.size(); i++) {
            String[] lines = fieldValues.get(i);
            try {
                Field currentField = classToLoad.getDeclaredField(lines[0]);
                currentField.setAccessible(true);
                setField(currentField, lines[1], result);
            } catch (NoSuchFieldException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Object loaded");

        return result;
    }

    private boolean isFolderExist(String name) {
        File db = new File(path);
        File[] folders = db.listFiles();
        for (int i = 0; i < folders.length; i++) {
            if (folders[i].getName().equals(name)) return true;
        }
        return false;
    }

    private ArrayList<String[]> getClassFromFile(String objectType, String id) throws IOException {
        ArrayList<String[]> result = new ArrayList<String[]>();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path + "\\" + objectType + "\\data"))) {

            String l;
            while ((l = bufferedReader.readLine()) != null) {
                if (l.startsWith("id")) {
                    String[] string = l.split("=");
                    l = string[1];
                    if (l.equals(id)) {
                        System.out.println("Object with id " + id + " found");
                        String line;
                        while (!((line = bufferedReader.readLine()).equals("}"))) {
                            result.add(line.split("="));
                        }
                        break;
                    }
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return result;
    }

    private void setField(Field field, String value, Object object) {
        System.out.println("Set field " + field.getName() + " = " + value);
        try {
            switch (field.getType().getName()) {
                case "java.lang.String":
                    field.set(object, value);
                    break;
                case "int":
                    field.setInt(object, Integer.parseInt(value));
                    break;
                case "boolean":
                    field.setBoolean(object, Boolean.parseBoolean(value));
                    break;
                case "char":
                    field.setChar(object, value.charAt(0));
                    break;
                case "byte":
                    field.setByte(object, Byte.parseByte(value));
                    break;
                case "short":
                    field.setShort(object, Short.parseShort(value));
                    break;
                case "long":
                    field.setLong(object, Long.parseLong(value));
                    break;
                case "float":
                    field.setFloat(object, Float.parseFloat(value));
                    break;
                case "double":
                    field.setDouble(object, Double.parseDouble(value));
                    break;
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

    }

    public void remove(String objectType, String id) {
        System.out.println("Removing object " + objectType + " with id " + id);
        if (!isFolderExist(objectType)) {
            System.out.println("There are no saved objects of " + objectType);
            return;
        }

        ArrayList<String> wholeFile = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path + "\\" + objectType + "\\data"))) {
            String l;
            while ((l = bufferedReader.readLine()) != null) {
                wholeFile.add(l);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        int counter = 1;
        int lineNumber = 0;
        for (int i = 0; i < wholeFile.size(); i++) {
            if (wholeFile.get(i).equals("id=" + id)) {
                lineNumber = i - 1;
                counter++;
                while (!(wholeFile.get(i).equals("}"))) {
                    counter++;
                    i++;
                }
                counter++;
            }
        }
        System.out.println(lineNumber + ", " + counter);
        for (int i = 0; i < counter; i++) {
            wholeFile.remove(lineNumber);
        }

        for (String line : wholeFile) System.out.println(line);
        try (PrintWriter outputStream = new PrintWriter(new FileWriter(path + "\\" + objectType + "\\data"))) {
            for (String line : wholeFile) {
                outputStream.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
