/**
 * Created with IntelliJ IDEA.
 * User: loco
 * Date: 7/23/13
 * Time: 10:35 PM
 * To change this template use File | Settings | File Templates.
 */
public class Product {
    private int id;
    private String name;
    private String owner;
    private String type;
    private int price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Product(int id, String name, String owner, String type, int price) {

        this.id = id;
        this.name = name;
        this.owner = owner;
        this.type = type;
        this.price = price;
    }
}
