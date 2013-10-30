package myio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {


    /**
     * IO - это система классов, взаимосвязаннх между собой для решения определенного курга задач.
     * Понятия: Stream, Buffer, Serialization
     * <p/>
     * Stream - это абстракция. Абстракция трубы :).
     * С одной стороны источник данных, с другой стороны - моя программа.
     * Делятся на два типа: in & out.
     */


    public static void main(String[] args) throws IOException {

        FileInputStream in = null;
        FileOutputStream out = null;

        try {
            in = new FileInputStream("/home/loco/JavaEdu/Lessons/IO/Input");
            out = new FileOutputStream("/home/loco/JavaEdu/Lessons/IO/output");
            int c;

            while ((c = in.read()) != -1) {
                out.write(c);
            }
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }


}




