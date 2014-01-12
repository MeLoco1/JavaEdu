import java.awt.*;
import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

public class Main {

    public static void main(String[] args) {
        SoftReference<Rectangle> rect = new SoftReference<Rectangle>(new Rectangle());
        // Это мягка я ссылка

        WeakReference<Rectangle> rectWeak = new WeakReference<Rectangle>(new Rectangle());
        // Это слабая ссылка.

        PhantomReference<Rectangle> phantomReference = new PhantomReference<Rectangle>(new Rectangle(), new ReferenceQueue<Rectangle>());
        // Это фантомная ссылка



    }
}
