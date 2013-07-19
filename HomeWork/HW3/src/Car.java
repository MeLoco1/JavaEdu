import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: loco
 * Date: 7/17/13
 * Time: 9:41 PM
 * To change this template use File | Settings | File Templates.
 */
public class Car {
    private String name;
    private ArrayList<String> types;
    private String owner;
    private String number;
    private String colour;
    private String factoryName;
    private boolean isReady;
    private String description;
    private int price;
    private String date;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getTypes() {
        return types;
    }

    public void setTypes(ArrayList<String> types) {
        this.types = types;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public boolean isReady() {
        return isReady;
    }

    public void setReady(boolean ready) {
        isReady = ready;
    }

    public String getFactoryName() {
        return factoryName;
    }

    public void setFactoryName(String factoryName) {
        this.factoryName = factoryName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Car(ArrayList<String> types, String owner, String number, String colour, String factoryName, int price, String date) {

        this.name = "Космич";
        this.types = types;
        this.owner = owner;
        this.number = number;
        this.colour = colour;
        this.factoryName = factoryName;
        this.isReady = true;
        this.description = "It is a new car";
        this.price = price;
        this.date = date;
    }

    public void addType(String type) {
        types.add(type);
    }

    public void removeType (String type) {
        for (int i = 0; i < types.size(); i++) {
            if (type == types.get(i)) {
                System.out.println(" Тип = " + type + " удален");
                types.remove(i--);
            }
        }
    }
}
