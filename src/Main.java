import java.util.*;
import java.util.stream.IntStream;

public class Main {
    public static int solution(int balls, int share) {
        if (share == 0 || balls == share)
            return 1;
        else
            return solution(balls-1, share - 1) + solution(balls - 1, share);
    }
    public static void main(String[] args) {
        int age = 23;
        int[] emergency = {3, 17, 6};
        System.out.println(solution(5,3));
    }
}
