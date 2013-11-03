package Decorator;

/**
 * Created with IntelliJ IDEA.
 * User: loco
 * Date: 11/3/13
 * Time: 2:54 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class FoodDecorator extends Food {
    Food food;

    protected FoodDecorator(Food food) {
        this.food = food;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(food)
                .append(getType())
                .append(" price is ")
                .append(getPrice());
        sb.append('}');
        return sb.toString();
    }
}
