import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: loco
 * Date: 7/23/13
 * Time: 10:46 PM
 * To change this template use File | Settings | File Templates.
 */
public class Shop {
    private String name;
    ArrayList<Product> products;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public Shop(String name, ArrayList<Product> products) {

        this.name = name;
        this.products = products;
    }

    public Product getMostExpensive() {
        Product result = products.get(1);
        for (int i = 1; i < products.size(); i++) {
            if (result.getPrice() < products.get(i).getPrice()) {
                result = products.get(i);
            }
        }
        return result;
    }

    public void deleteBooks() {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i) instanceof Book) {
                products.remove(i--);
            }
        }
    }

    public ArrayList<Product> getProductsInRange (int priceFrom, int priceTo) {
        ArrayList<Product> result = new ArrayList<Product>();
        for (int i = 0; i < products.size(); i++) {
            if ((products.get(i).getPrice() >= priceFrom) && (products.get(i).getPrice() <= priceTo)) {
                result.add(products.get(i));
            }
        }
        return result;
    }

    public int getSum() {
        int result = 0;
        for (Product line : products) {
            result += line.getPrice();
        }
        return result;
    }
}
