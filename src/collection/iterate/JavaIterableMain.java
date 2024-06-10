package collection.iterate;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class JavaIterableMain {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Object object = new Object();
        object.hashCode();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        printAll(list.iterator());

        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        printAll(set.iterator());
    }

    private static void printAll(Iterator<Integer> iterator) {
        System.out.println("iterator.getClass() = " + iterator.getClass());
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
