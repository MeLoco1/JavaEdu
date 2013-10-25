import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: loco
 * Date: 10/24/13
 * Time: 8:55 PM
 * To change this template use File | Settings | File Templates.
 */
public class ObjectMapperTest {
    @Test
    public void testSave() throws Exception {
        User u0 = null;
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.save(u0);

        //open file, file is empty
    }
}
