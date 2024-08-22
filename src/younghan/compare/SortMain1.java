package younghan.compare;

import java.util.Arrays;
import java.util.Comparator;

public class SortMain1 {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 7, 3, 4, 5};
        System.out.println(Arrays.toString(arr));

        System.out.println("기본 정렬 후 ");
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr, new AscComparator());
        System.out.println(Arrays.toString(arr));
    }


    static class DescComparator implements Comparator<Integer> {

        @Override
        public int compare(Integer o1, Integer o2) {
            System.out.println("o1 = "+o1 + " o2 = "+ o2);
            return (o1 < o2) ? -1 : (o1.equals(o2)) ? 0 : 1;
        }
    }

    static class AscComparator implements Comparator<Integer> {

        @Override
        public int compare(Integer o1, Integer o2) {
            System.out.println("o1 = "+o1 + " o2 = "+ o2);
            return (o1 < o2) ? 1 : (o1.equals(o2)) ? 0 : -1;
        }
    }
}
