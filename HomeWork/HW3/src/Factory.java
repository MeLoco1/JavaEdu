import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: loco
 * Date: 7/17/13
 * Time: 9:55 PM
 * To change this template use File | Settings | File Templates.
 */
public class Factory {
    private String name;

    public Factory(String name) {
        this.name = name;
    }

    public void newCar(String owner, String colour, String type, String number, int price, File file) throws IOException {
        ArrayList<String> types = new ArrayList<String>();
        types.add(type);
        Car newCar = new Car(types, owner, number, colour, this.name, price, new java.util.Date().toString());

        FileWriter fileWriter = new FileWriter(file, true);
        fileWriter.append(newCar.getName() + ";" + newCar.getOwner() + ";" + newCar.getNumber() + ";" + newCar.getColour() + ";" + newCar.getFactoryName() + ";" + newCar.isReady() + ";" + newCar.getDescription() + ";" + newCar.getPrice() + ";" + newCar.getDate() + ";");
        for (String line : types) {
            fileWriter.append(line + ";");
        }
        fileWriter.append(System.getProperty("line.separator"));
        fileWriter.flush();
        fileWriter.close();
    }

    public ArrayList<Car> load(File file) throws FileNotFoundException {
        Scanner scan = new Scanner(file);
        ArrayList<Car> result = new ArrayList<Car>();
        while (scan.hasNext()) {
            String[] line = scan.nextLine().split(";");

            ArrayList<String> types = new ArrayList<String>();
            for (int i = 9; i < line.length; i++) {
                types.add(line[i]);
            }

            result.add(new Car(types, line[1], line[2], line[3], line[4], Integer.parseInt(line[7]), line[8]));
        }
        return result;
    }

    public int carsFromPeriod(ArrayList<Car> cars, String periodBegin, String periodEnd) throws ParseException {
        int result = 0;
        DateFormat df = new SimpleDateFormat("dd.MM.yyyy");
        Date dPeriodBegin = df.parse(periodBegin);
        Date dPeriodEnd = df.parse(periodEnd);
        df = new SimpleDateFormat("EEE MMM dd kk:mm:ss z yyyy", Locale.ENGLISH);

        for (int i = 0; i < cars.size(); i++) {
            Date date = df.parse(cars.get(i).getDate());
            if ((dPeriodBegin.getTime() <= date.getTime()) && (date.getTime() <= dPeriodEnd.getTime())) {
                result++;
            }
        }
        return result;
    }

    public int mostExpensive(ArrayList<Car> cars) {
        int result = 0;
        for (Car line : cars) {
            if (result < line.getPrice()) {
                result = line.getPrice();
            }
        }
        return result;
    }

    public ArrayList<Car> carsByColour(ArrayList<Car> cars, String colour) {
        ArrayList<Car> result = new ArrayList<Car>();
        for (Car line : cars) {
            if (colour.equals(line.getColour())) {
                result.add(line);
            }
        }
        return result;
    }
}
