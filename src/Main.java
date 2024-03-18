import java.util.*;
import java.util.stream.IntStream;

public class Main {
    public static int solution(int[] dot) {
        if (dot[0] > 0 && dot[1] > 0) {
            return 1;
        } else if (dot[0] < 0 && dot[1] > 0) {
            return 2;
        } else if (dot[0] < 0 && dot[1] < 0) {
            return 3;
        } else {
            return 4;
        }
    }
    public static void main(String[] args) {
        int age = 23;
        int[] emergency = {3, 17};
        System.out.println(solution(emergency));
    }
}
