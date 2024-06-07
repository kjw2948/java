package collection.set;


import java.util.Arrays;
import java.util.LinkedList;
import java.util.Objects;

public class MyHashSetV3 {
    private final int DEFAULT_INITIAL_CAPACITY = 10;
    private LinkedList<Object>[] buckets;
    private int size = 0;
    private int capacity = DEFAULT_INITIAL_CAPACITY;

    public MyHashSetV3() {
        initBuckets();
    }

    public MyHashSetV3(int capacity) {
        this.capacity = capacity;
        buckets = new LinkedList[capacity];
        initBuckets();
    }
    private void initBuckets() {
        for (int i = 0; i < capacity; i++) {
            buckets[i] = new LinkedList();
        }
    }

    // add
    public boolean add(Object obj) {
        int index = getHashIndex(obj);
        if (capacity == size) {
            increaseCapacity();
        }
        LinkedList<Object> bucket = buckets[index];
        if (bucket.contains(obj)) {
            return false;
        }
        bucket.add(obj);
        size ++;
        return true;
    }

    public void increaseCapacity() {
        if (size == capacity) {
            capacity *= 2;
            LinkedList<Object>[] bucketsClone = new LinkedList[capacity];
            for (int i = 0; i < size; i++) {
                bucketsClone[i] = new LinkedList<>();
                for (int j = 0; j < buckets[i].size(); j++) {
                    bucketsClone[i].add(buckets[i].get(j));
                }
            }
            for (int i = size; i < capacity; i++) {
                bucketsClone[i] = new LinkedList<>();
            }
            buckets = bucketsClone;
        }

    }

    public int getHashIndex(Object value) {
        return Math.abs(value.hashCode()) % capacity;
    }
    public boolean contains(Object searchValue) {
        int index = getHashIndex(searchValue);
        LinkedList<Object> bucket = buckets[index];
        return bucket.contains(searchValue);
    }

    // remove
    public boolean remove(Object removeValue) {
        int index = getHashIndex(removeValue);
        LinkedList<Object> bucket = buckets[index];
        boolean result = bucket.remove(removeValue);
        if (result) {
            size --;
            return true;
        }else{
            return false;
        }
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "MyHashSetV3{" +
                "buckets=" + Arrays.toString(buckets) +
                ", size=" + size +
                ", capapcity=" + capacity +
                '}';
    }
}
