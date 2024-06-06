package collection.set;

import java.util.Arrays;

public class MyHashSetV1 {
    private final int CAPACITY = 10;
    private int[] inputArray = new int[CAPACITY];

    public boolean add(int value) {
        if (contains(value)) {
            return false;
        }
        int index = hashIndex(value);
        inputArray[index] = value;
        return true;
    }

    public int hashIndex(int value) {
        return value % CAPACITY;
    }

    public boolean contains(int value) {
        int index = hashIndex(value);
        if (inputArray[index] == 0) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "MyHashSetV1{" +
                ", inputArray=" + Arrays.toString(inputArray) +
                "CAPACITY=" + CAPACITY +
                '}';
    }
}
