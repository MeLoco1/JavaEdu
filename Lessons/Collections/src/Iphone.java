/**
 * Created with IntelliJ IDEA.
 * User: loco
 * Date: 9/17/13
 * Time: 9:02 PM
 * To change this template use File | Settings | File Templates.
 */
public class Iphone implements Comparable<Iphone> {
    private int price;

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Iphone{" +
                "price=" + price +
                '}';
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (!(o instanceof Iphone)) return false;

        Iphone iphone = (Iphone) o;

        if (price != iphone.price) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return price;
    }

    @Override
    public int compareTo(Iphone o) {
        return o.getPrice() - this.getPrice();// - o.getPrice();
    }
}
