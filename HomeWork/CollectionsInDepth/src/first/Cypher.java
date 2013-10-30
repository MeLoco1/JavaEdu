package first;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Cypher {
    public static String encode(String pText, String pKey) {
        byte[] txt = pText.getBytes();
        byte[] key = pKey.getBytes();
        byte[] res = new byte[pText.length()];

        for (int i = 0; i < txt.length; i++) {
            res[i] = (byte) (txt[i] ^ key[i % key.length]);
        }

        String result = new String();
        for (int i = 0; i < pText.length(); i++)
            result += ((char) (pText.charAt(i) ^ pKey.charAt(i % pKey.length())));

        return result;
    }

    public static String decode(String pText, String pKey) {
        return encode(pText, pKey);
    }


    public static Map<String, String> encodeCollection(List<String> file, String key) {
        HashMap<String, String> result = new HashMap<String, String>(file.size());
        for (int i = 0; i < file.size(); i++) {
            result.put(Integer.toString(i), Cypher.encode(file.get(i), key + i));
        }
        return result;
    }


    public static List<String> decodeCollection(Map<String, String> collection, String key) {
        List<String> result = new ArrayList<String>(collection.size());
        for (int i = 0; i < collection.size(); i++) {
            result.add(i, Cypher.decode(collection.get(Integer.toString(i)), key + i));
        }
        return result;
    }

}
