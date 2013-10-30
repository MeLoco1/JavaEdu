package myio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SystemIn {
    public static void main(String[] args) {
        char c;

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            do {
                c = (char) br.read();
                System.out.println("You wrote: " + c);
            } while (c != 'q');

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
