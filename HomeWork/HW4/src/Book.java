/**
 * Created with IntelliJ IDEA.
 * User: loco
 * Date: 7/23/13
 * Time: 10:41 PM
 * To change this template use File | Settings | File Templates.
 */
public class Book extends Product {
    private int pages;

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public Book(int id, String name, String owner, String type, int price, int pages) {

        super(id, name, owner, type, price);
        this.pages = pages;
    }
}
