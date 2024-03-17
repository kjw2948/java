import java.util.*;
import java.util.stream.IntStream;

public class Main {
    public static int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                answer++;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        int age = 23;
        int[] emergency = {3, 17, 6};
        System.out.println(solution(20));
    }
}
