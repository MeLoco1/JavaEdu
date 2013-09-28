/**
 * Created with IntelliJ IDEA.
 * User: loco
 * Date: 9/28/13
 * Time: 12:41 PM
 * To change this template use File | Settings | File Templates.
 */
public class SimpleClass {
    private String name;
    private int value;

    @Visible(description = "ololo")
    private int nonShowed;

    public SimpleClass(String name, int value, int nonShowed) {
        this.name = name;
        this.value = value;
        this.nonShowed = nonShowed;
    }
}
