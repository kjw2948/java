package younghan.collectionutil;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class OfMain {
    public static void main(String[] args) {

        // 불변 컬렉션 간단히 생성하기 --> of 사용
        List<Integer> list = List.of(1, 2, 3, 4);
        Set<Integer> set = Set.of(1, 2, 3);
        Map<Integer, String> map = Map.of(1, "one", 2, "two");

        // of 사용한 애들은 불변상태임!!! ---> 값을 변경할 수 없음
    }
}
