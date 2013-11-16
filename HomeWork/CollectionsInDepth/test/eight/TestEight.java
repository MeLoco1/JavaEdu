package eight;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: loco
 * Date: 11/13/13
 * Time: 10:13 PM
 * To change this template use File | Settings | File Templates.
 */
public class TestEight {
    private ConcurrentQueue concurrentQueue = new ConcurrentQueue();

    @Test
    public void testWrite() {
        concurrentQueue.pushToQueue("1");
        concurrentQueue.pushToQueue("2");
        concurrentQueue.pushToQueue("3");
        concurrentQueue.pushToQueue("4");
        concurrentQueue.pushToQueue("5");
        concurrentQueue.pushToQueue("6");
        concurrentQueue.pushToQueue("7");
        concurrentQueue.pushToQueue("8");
        concurrentQueue.pushToQueue("9");
        concurrentQueue.pushToQueue("10");
        concurrentQueue.pushToQueue("11");
        System.out.println(concurrentQueue.popFromQueue());
        System.out.println(concurrentQueue.popFromQueue());
        concurrentQueue.pushToQueue("12");
        Assert.assertEquals(concurrentQueue.popFromQueue().equals("3"));
    }

    @Test
    public void testRead() {
        int sum = 0;
        for (int i = 0; i < 9; i++) {
            sum += Integer.parseInt(concurrentQueue.popFromQueue());
        }
        Assert.assertEquals(sum, 75);
    }
}
