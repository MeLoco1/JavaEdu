package Decorator;

/**
 * Created with IntelliJ IDEA.
 * User: loco
 * Date: 11/3/13
 * Time: 2:36 PM
 * To change this template use File | Settings | File Templates.
 */
public class DecoratorPattern {
    /**
     * несет идею добавления новых свойств к декорируемому объекту и новое поведение.
     */

    public static void main(String[] args) {
        Food kebab = new Kebab();
        kebab.setPrice(10);
        kebab.setType("kebab");
        System.out.println(kebab);
        FoodDecorator cheese = new Cheese(kebab, 5, "chesse");
        System.out.println(cheese);
        FoodDecorator cheese2 = new Cheese(cheese, 5, "chesse");
        System.out.println(cheese2);
        FoodDecorator cheese3 = new Cheese(cheese2, 5, "chesse");
        System.out.println(cheese3);
    }

}
