package first;

import junit.framework.Assert;
import org.junit.Test;
import myio.FileReadWrite;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Created with IntelliJ IDEA.
 * User: loco
 * Date: 10/25/13
 * Time: 9:35 PM
 * To change this template use File | Settings | File Templates.
 */
public class CypherTest {
    @Test
    public void testEncodeDecode() throws Exception {
        List<String> inputClear = FileReadWrite.readFile("/home/loco/JavaEdu/HomeWork/CollectionsInDepth/file_small");
        System.out.println("File has been read");
        Map<String, String> cryptedFile = new HashMap<String, String>();
        for (int i = 0; i < inputClear.size(); i++) {
            cryptedFile.put(inputClear.get(i), Cypher.encode(inputClear.get(i), "crypt"));
        }

        boolean correct = true;
        for (int i = 0; i < inputClear.size(); i++) {
            Assert.assertTrue(!(Cypher.decode(cryptedFile.get(inputClear.get(i)), "crypt") == inputClear.get(i)));
        }

    }


    @Test
    public void testEncodeDecodeCollection() throws Exception {
        List<String> inputClear = FileReadWrite.readFile("/home/loco/JavaEdu/HomeWork/CollectionsInDepth/file_small");
        Map<String, String> cryptedMap = Cypher.encodeCollection(inputClear, "crypt");
        List<String> decodedCollection = Cypher.decodeCollection(cryptedMap, "crypt");
        for (int i = 0; i < inputClear.size(); i++) {
            {
                Assert.assertEquals(inputClear.get(i), decodedCollection.get(i));
            }
        }
    }
}