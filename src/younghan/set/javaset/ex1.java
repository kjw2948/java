package younghan.set.javaset;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class ex1 {
    public static void main(String[] args) {
        Integer[] inputArr = {30, 20, 10, 10, 20};

        Set<Integer> result = new LinkedHashSet<>(Arrays.asList(inputArr));
        System.out.println(result.toString());
    }
}
