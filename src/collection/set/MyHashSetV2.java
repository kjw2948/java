package collection.set;

import java.util.Arrays;
import java.util.LinkedList;

public class MyHashSetV2 {
    private final int DEFAULT_FINAL_CAPACITY = 10;
    private int CAPACITY = DEFAULT_FINAL_CAPACITY;
    private int size = 0;

    private LinkedList<Integer>[] buckets;

    public MyHashSetV2() {
        buckets = new LinkedList[CAPACITY];
        for (int i = 0; i < CAPACITY; i++) {
            buckets[i] = new LinkedList<>();
        }
    }
    public MyHashSetV2(int capacity) {
        buckets = new LinkedList[CAPACITY];
        CAPACITY = capacity;
        for (int i = 0; i < CAPACITY; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    public boolean add(int value) {
        int index = getHashIndex(value);
        LinkedList<Integer> bucket = buckets[index];
        if (bucket.contains(value)) {
            return false;
        }
        bucket.add(value);
        size ++;
        return true;
    }

    public boolean contains(int searchValue) {
        int index = getHashIndex(searchValue);
        LinkedList<Integer> bucket = buckets[index];
        return bucket.contains(searchValue);
    }

    private int getHashIndex(int value) {
        return value % CAPACITY;
    }

    public boolean remove(int value) {
        int index = getHashIndex(value);
        LinkedList<Integer> bucket = buckets[index];
        boolean result = bucket.remove(Integer.valueOf(value));
        if (result) {
            size --;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "MyHashSetV2{" +
                "CAPACITY=" + CAPACITY +
                ", buckets=" + Arrays.toString(buckets) +
                '}';
    }
}
