package collection.list;


import java.util.Arrays;

public class MyArrayList<E> {
    private static final int DEFAULT_CAPACITY = 5;
    private Object[] elementData;
    private int size = 0;

    public MyArrayList() {
        elementData = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayList(int intitalCapacity) {
        elementData = new Object[intitalCapacity];
    }

    // add
    public void add(E o) {
        if (size == elementData.length) {
            grow();
        }
        elementData[size++] = o;
    }

    public void add(int index, E o) {
        if (size == elementData.length) {
            grow();
        }
        shiftRightFrom(index);
        size++;
        elementData[index] = o;
    }

    private void shiftRightFrom(int index) {
        for (int i = size; i > index; i--) {
            elementData[i] = elementData[i - 1];
        }
    }

    private void grow() {
        int oldCapacity = elementData.length;
        int newCapacity = oldCapacity * 2;

        elementData = Arrays.copyOf(elementData, newCapacity);
    }

    // remove
    @SuppressWarnings("unchecked")
    public E remove(int index) {
        Object oldValue = elementData[index];
        shiftLeftFrom(index);
        elementData[--size] = null;
        return (E) oldValue;
    }

    private void shiftLeftFrom(int index) {
        for (int i = index; i < size-1; i++) {
            elementData[i] = elementData[i + 1];
        }
    }

    // get
    @SuppressWarnings("unchecked")
    public E get(int index) {
        return (E) elementData[index];
    }

    // set
    @SuppressWarnings("unchecked")
    public E set(int index, E o) {
        Object oldValue = elementData[index];
        elementData[index] = o;

        return (E) oldValue;
    }

    // indexOf
    public int indexOf(E o) {
        for (int i = 0; i < size; i++) {
            if (elementData[i].equals(o)) {
                return i;
            }
        }
        return -1;
    }

    //toString
    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(elementData, size)) + " size = " + size
                + ", capacity = " + elementData.length;
    }
    
}
