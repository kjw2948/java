package collection.iterate;

import java.util.Iterator;

public class ArrayClass implements Iterable<Integer> {
    private Integer[] array;

    public ArrayClass(Integer[] array) {
        this.array = array;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new ArrayIterator(array);
    }
}
