package first;

import org.junit.Test;

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
        for(int i = 0; i < pText.length(); i++)
            result+=((char)(pText.charAt(i) ^ pKey.charAt(i % pKey.length())));

        return result;
    }

    public static String decode(String pText, String pKey) {
        return encode(pText, pKey);
    }


    public static Map<String, String> encodeList(List<String> file) {
        return null;
    }


    public static List<String> decodeFile(List<String> file) {
        return null;
    }

}
