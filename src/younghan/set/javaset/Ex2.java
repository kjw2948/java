package younghan.set.javaset;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Ex2 {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(List.of(1, 2, 3, 4, 5));
        Set<Integer> set2 = new HashSet<>(List.of(3, 4, 5, 6, 7));

        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);
        System.out.println("합집합 : "+ union.toString());

        Set<Integer> interSection = new HashSet<>(set1);
        interSection.retainAll(set2);
        System.out.println("교집합 : " + interSection.toString());


    }
}
