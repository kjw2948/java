package younghan.collectionutil;

import java.util.*;

public class MutableMain {
    public static void main(String[] args) {
        //불변 리스트 생성
        List<Integer> list = List.of(1, 2, 3, 4);
        Set<Integer> set = Set.of(1, 2, 3);

        //가변 리스트
        ArrayList<Integer> mutableList = new ArrayList<>(list);
        mutableList.add(10);
        ArrayList<Integer> arrList = new ArrayList<>(new HashSet<>(set));
        System.out.println(arrList);

        //다시 불변 리스트로
        List<Integer> unmutable = Collections.unmodifiableList(mutableList);

    }
}
