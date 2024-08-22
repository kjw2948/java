package younghan.collectionutil;

import younghan.compare.IdComparator;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class CollectionUtils {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        Integer max = Collections.max(list);
        Integer min = Collections.min(list);

        System.out.println("list = " + list);
        Collections.shuffle(list);
        System.out.println("shuffle list = " + list);
        Collections.sort(list);
        Collections.reverse(list);
        System.out.println("reverse list = " + list);
        Collections.sort(list, new IntegerComparator());
        System.out.println("sort list = " + list);

    }
}
