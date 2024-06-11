package collection.iterate;

import java.util.Iterator;

public class ArrayIterator implements Iterator<Integer> {

    private Integer[] arr;
    private int cur = 0;

    public ArrayIterator(Integer[] arr) {
        this.arr = arr;
    }
    @Override
    public boolean hasNext() {
        return cur < arr.length;
    }

    @Override
    public Integer next() {
        if (hasNext()) {
            return arr[cur++];
        }
        return null;
    }
}
