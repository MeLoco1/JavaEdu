import java.util.Iterator;

/**
 * Created with IntelliJ IDEA.
 * User: loco
 * Date: 9/20/13
 * Time: 9:22 PM
 * To change this template use File | Settings | File Templates.
 */
public class MyArrayList<E> {
    private Object[] array;
    private int size = 0;

    public MyArrayList() {
        this(10);
    }

    public MyArrayList(int initialSize) {
        if (initialSize <= 0)
            throw new IllegalArgumentException("Illegal Capacity: " +
                    initialSize);
        this.array = new Object[initialSize];
    }

    public void add(E e) {
        checkFreeSpace();
        this.array[size++] = e;
    }

    public void add(int index, E e) {
        checkFreeSpace(index);
        this.array[index] = e;
        size = index + 1;
    }


    private void checkFreeSpace() {
        if (size == this.array.length)
            addSpace(1);
    }

    private void checkFreeSpace(int index) {
        if (this.array.length <= index) {
            addSpace(index);
        }
    }


    private void addSpace(int capacity) {
        if (capacity == 1) {
            capacity = this.array.length;
        }
        int newSize = (capacity * 3 / 2 + 1);

        Object[] newArray = new Object[newSize];
        for (int i = 0; i < this.array.length; i++) {
            newArray[i] = this.array[i];
        }

        this.array = newArray;
    }

    public int getSize() {
        return size;
    }

    private void checkIndexOutOfBounds(int index) {
        if (index >= size) throw new IndexOutOfBoundsException();
    }

    @SuppressWarnings("unchecked")
    public E get(int index) {
        checkIndexOutOfBounds(index);
        return (E) this.array[index];
    }

    public void remove(int index) {
        checkIndexOutOfBounds(index);
        this.array[index] = null;
        if (size == index + 1) {
            size--;
        }
    }

    public void clear() {
        this.array = new Object[10];
        this.size = 0;

    }

    public void set(int index, E e) {
        checkIndexOutOfBounds(index);
        this.array[index] = e;
    }

    public void trimToSize() {
        Object[] newArray = new Object[size];
        if (size < this.array.length) {
            for (int i = 0; i < newArray.length; i++) {
                newArray[i] = this.array[i];
            }

            this.array = newArray;
        }
    }

    public Iterator<E> iterator() {
        return new Iterator<E>() {
            private int marker = 0;

            @Override
            @SuppressWarnings("unchecked")
            public boolean hasNext() {
                if (marker < size - 1) return true;
                else
                    return false;
            }

            @Override
            @SuppressWarnings("unchecked")
            public E next() {
                return (E) MyArrayList.this.array[marker++];

            }

            @Override
            @SuppressWarnings("unchecked")
            public void remove() {

                for (int i = marker + 1; i < size; i++) {
                    MyArrayList.this.array[i - 1] = MyArrayList.this.array[i];
                    size--;
                }

            }
        };
    }
}
