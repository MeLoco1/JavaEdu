import junit.framework.Assert;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: loco
 * Date: 10/24/13
 * Time: 8:33 PM
 * To change this template use File | Settings | File Templates.
 */
public class CalculatorTest {
    @Test
    public void testSum() throws Exception {
        Calculator calculator = new Calculator();
        int result = calculator.sum(3, 4);
        Assert.assertEquals(result, 7);
    }

    // Сначала пишем тест, а потом сами метода
    @Test
    public void testSort() throws Exception {
        int[] arr0 = {5, 7, 2, 3};
        int[] res0 = {2, 3, 5, 7};

        int[] arr1 = {5, -7, -2, 0};
        int[] res1 = {-7, -2, 0, 5};

        Calculator calculator = new Calculator();
        calculator.sort(arr0);
        Assert.assertEquals(res0, arr0);

        calculator.sort(arr1);
        Assert.assertEquals(res1, arr1);

    }
}
