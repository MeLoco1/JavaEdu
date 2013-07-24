/**
 * Created with IntelliJ IDEA.
 * User: loco
 * Date: 7/23/13
 * Time: 10:43 PM
 * To change this template use File | Settings | File Templates.
 */
public class Tv extends Product {
    private int diagonal;

    public int getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(int diagonal) {
        this.diagonal = diagonal;
    }

    public Tv(int id, String name, String owner, String type, int price, int diagonal) {

        super(id, name, owner, type, price);
        this.diagonal = diagonal;
    }
}
