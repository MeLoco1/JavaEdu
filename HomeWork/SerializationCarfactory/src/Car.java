import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: Loco
 * Date: 16.09.13
 * Time: 19:44
 * To change this template use File | Settings | File Templates.
 */
public class Car implements Serializable {
    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public int getNumber() {
        return number;
    }

    private String name;
    private String color;
    private int price;
    private String releaseDate;
    private int number;

    public Car(String name, String color, int price, String releaseDate, int number) {
        this.name = name;
        this.color = color;
        this.price = price;
        this.releaseDate = releaseDate;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", releaseDate='" + releaseDate + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}
