import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException, ParseException {
        File file = new File("/home/loco/JavaEdu/HomeWork/HW3/Cars");
        Factory factory = new Factory("Дружба");
//           factory.newCar("Me", "Red", "Sport", "099-90", 10000, file);
//           factory.newCar("Kate", "Blue", "Sport", "899-13", 20000, file);
//           factory.newCar("Vasya", "Gold", "Home", "747-94", 100000, file);
//           factory.newCar("Tanya", "Black", "Family", "061-02", 8000, file);
//           factory.newCar("Me", "White", "Sport", "931-50", 15000, file);
//           factory.newCar("Me", "Black", "Cool", "199-91", 20000, file);
//           factory.newCar("Kate", "Red", "Family", "239-19", 30000, file);
//           factory.newCar("Yura", "Red", "BatMobile", "432-34", 24000, file);
//           factory.newCar("Vasya", "Red", "Beach", "121-12", 29000, file);

        ArrayList<Car> cars = factory.load(file);
        System.out.println(factory.carsFromPeriod(cars, "21.06.2013", "23.12.2013"));
        System.out.println(factory.mostExpensive(cars));
        ArrayList<Car> carsOfTheSameColour = factory.carsByColour(cars, "White");
        for (Car line : carsOfTheSameColour) {
            System.out.println(line.getColour());
        }
    }
}
