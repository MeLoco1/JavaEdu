package call;

import java.util.concurrent.Callable;

/**
 * Created with IntelliJ IDEA.
 * User: root
 * Date: 12/1/13
 * Time: 5:26 PM
 * Example with Callable
 */
public class Call implements Callable<String> {
    @Override
    public String call() throws Exception {
        return "I'm new process " + this.toString();  //This is like "run()" in Runnable. Returns
    }
}

