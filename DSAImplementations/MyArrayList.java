import java.util.Arrays;

public class MyArrayList {
    private int capacity = 10;
    private Object a[] = new Object[capacity];
    int size = 0;

    private boolean validIndex(int index) {
        if (index < 0 || index > size - 1) {
            return false;
        }
        return true;
    }

    private Object[] arrayFull() {
        if (size == capacity) {
            capacity += capacity >> 1;
            Object[] newArr = new Object[capacity];
            for (int i = 0; i < size; i++) {
                newArr[i] = a[i];
            }
            a = newArr;
        }
        return a;
    }

    void add(Object e) {
        if (size == capacity) {
            arrayFull();
        }
        a[size++] = e;
    }

    void add(Object e, int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
        if (size == capacity) {
            arrayFull();
        }
        
        
        for (int i = size; i > index; i--) {
            a[i] = a[i - 1];
        }
        a[index] = e;
        size++;
    }

    Object get(int index) {
        if (!validIndex(index)) {
            throw new IndexOutOfBoundsException();
        }
        return a[index];
    }

    // New set method
    Object set(int index, Object e) {
        if (!validIndex(index)) {
            throw new IndexOutOfBoundsException();
        }
        Object oldVal = a[index];
        a[index] = e;
        return oldVal;
    }

    // New remove method
    Object remove(int index) {
        if (!validIndex(index)) {
            throw new IndexOutOfBoundsException();
        }
        Object oldVal = a[index];
        
        
        for (int i = index; i < size - 1; i++) {
            a[i] = a[i + 1];
        }
        a[size - 1] = null;
        size--;
        return oldVal;
    }

    // New isEmpty method
    boolean isEmpty() {
        return size == 0;
    }

    int size() {
        return size;
    }

    @Override
    public String toString() {
        if (size == 0) return "[]";
        StringBuilder s = new StringBuilder("[ ");
        for (int i = 0; i < size; i++) {
            s.append(a[i]);
            if (i < size - 1) s.append(",");
        }
        return s.append(" ]").toString();
    }

    void print() {
        System.out.println(Arrays.toString(a));
    }
}