package myio;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: loco
 * Date: 9/11/13
 * Time: 8:13 PM
 * To change this template use File | Settings | File Templates.
 */

public class Sort {
    public static ArrayList<String> sortAsc(ArrayList<String> lines) {
        for (int i = 0; i < lines.size(); i++) {
            for (int j = i + 1; j < lines.size(); j++) {
                if (lines.get(j).length() < lines.get(i).length()) {
                    String buf = lines.get(i);
                    lines.set(i, lines.get(j));
                    lines.set(j, buf);
                }
            }
        }
        return lines;
    }

    public static ArrayList<String> sortDesc(ArrayList<String> lines) {
        for (int i = 0; i < lines.size(); i++) {
            for (int j = i + 1; j < lines.size(); j++) {
                if (lines.get(j).length() > lines.get(i).length()) {
                    String buf = lines.get(i);
                    lines.set(i, lines.get(j));
                    lines.set(j, buf);
                }
            }
        }
        return lines;
    }

}
