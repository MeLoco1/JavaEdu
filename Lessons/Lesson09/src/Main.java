import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {



        /*  ДЗ
          * vk.com/itcentrebaza
          * формотированный вывод
          * Виды сортировки
          *
          * Переделать report в задаче ниже в case
          * */


        /*  Есть различные геометрически фигуры, которые будут распологаться в контейнере фигур.
        *   Равносторонний треугольник, задается стороной.
        *   Квадрат, задается стороной
        *   Круг, задается радиусом
        *   Все фигуры обладют периметром и площадью.
        *   Есть ID фигуры, long
        *
        *   Операции контейнера:
        *   1) Находит геометрическую фигуру с макс площадью.
        *   2) Находит суммарный периметр всех фигур
        *   3) Удаляет все квадраты из контейнера
        * */

        ArrayList<Shape> shapes = new ArrayList<Shape>();
        ShapeContainer shapeContainer = new ShapeContainer(shapes);
        shapeContainer.getShapes().add(new Kvadrat(shapeContainer.getId(), 32));
        shapeContainer.getShapes().add(new Kvadrat(shapeContainer.getId(), 32));
        shapeContainer.getShapes().add(new Kvadrat(shapeContainer.getId(), 32));
        shapeContainer.getShapes().add(new Triangle(shapeContainer.getId(), 1));
        shapeContainer.getShapes().add(new Triangle(shapeContainer.getId(), 953));
        shapeContainer.getShapes().add(new Circle(shapeContainer.getId(), 234));
        shapeContainer.getShapes().add(new Triangle(shapeContainer.getId(), 21));
        shapeContainer.getShapes().add(new Triangle(shapeContainer.getId(), 487));
        shapeContainer.getShapes().add(new Circle(shapeContainer.getId(), 149));
        shapeContainer.getShapes().add(new Triangle(shapeContainer.getId(), 2));
        shapeContainer.getShapes().add(new Kvadrat(shapeContainer.getId(), 34352));
        shapeContainer.getShapes().add(new Kvadrat(shapeContainer.getId(), 75432));
        shapeContainer.report();
        System.out.println("-----------------");
        shapeContainer.removeKvadrats();
        shapeContainer.report();
        System.out.println("--------------------");
        double x1 = 5.7664576;
        double x2 = 8.74365764576;
        double result = x1/x2;
        BigDecimal test = new BigDecimal(result);
        MathContext round = new MathContext(4);
        System.out.println(test.round(round));



        /*
         *  Ссылки на абстрактный класс можно создавать, но объекты абстрактного класса - нет.
         *  В абстрактном классе абстрактные метода не обязаетльны.
         *  Можно от неабстрактного класса наслдеовать абстрактный класс
         *
         *  Почитать тему Абстрактный класс.
          * */

    }
}
