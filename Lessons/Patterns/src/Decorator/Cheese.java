package Decorator;

/**
 * Created with IntelliJ IDEA.
 * User: loco
 * Date: 11/3/13
 * Time: 2:59 PM
 * To change this template use File | Settings | File Templates.
 */
public class Cheese extends FoodDecorator {

    protected Cheese(Food food, int price, String type) {
        super(food);
        setPrice(price + food.getPrice());
        setType(" with " + type);
    }
}
