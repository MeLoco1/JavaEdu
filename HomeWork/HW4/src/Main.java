import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<Product>();
        products.add(new Book(1, "Java", "Me", "Book", 100, 799));
        products.add(new Book(6542345, "Python", "Me", "Book", 234, 1200));
        products.add(new Laptop(432, "Dell", "Kate", "PC", 450, "AMD", "Samsung 500 GB", "8 GB"));
        products.add(new Book(65345, "C#", "Kate", "Book", 45, 1000));
        products.add(new Tv(643, "Березка", "Me", "TV", 1000, 51));
        products.add(new Book(2345, "Scala", "Me", "Book", 150, 1300));

        Shop shop = new Shop("MyShop", products);
        System.out.println(shop.getMostExpensive().getPrice());
        for (Product line : shop.getProductsInRange(20, 400)) {
            System.out.println("ID = " + line.getId() + ", Name = " + line.getName());
        }
        System.out.println("---------------");

        System.out.println(shop.getSum());

        System.out.println("---------------");
        shop.deleteBooks();
        for (Product line : shop.getProducts()) {
            System.out.println("ID = " + line.getId() + ", Name = " + line.getName());
        }
        System.out.println(shop.getSum());
    }
}
