import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: loco
 * Date: 10/19/13
 * Time: 12:35 PM
 * To change this template use File | Settings | File Templates.
 */
public class Tablet implements Cloneable, Serializable {
    private String tabletName;
    private int price;

    @Override
    public Tablet clone() throws CloneNotSupportedException {
        return (Tablet) super.clone();
    }

    public Tablet(String tabletName, int price) {
        this.tabletName = tabletName;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tablet)) return false;

        Tablet tablet = (Tablet) o;

        if (price != tablet.price) return false;
        if (tabletName != null ? !tabletName.equals(tablet.tabletName) : tablet.tabletName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = tabletName != null ? tabletName.hashCode() : 0;
        result = 31 * result + price;
        return result;
    }

    public String getTabletName() {
        return tabletName;
    }

    public void setTabletName(String tabletName) {
        this.tabletName = tabletName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Tablet{" +
                "tabletName='" + tabletName + '\'' +
                ", price=" + price +
                '}';
    }
}
