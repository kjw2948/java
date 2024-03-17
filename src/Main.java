import java.util.*;
import java.util.stream.IntStream;

public class Main {
    public static int solution(int hp) {
        int answer = 0;
        int[] ant = {5, 3, 1};
        for (int i = 0; i < ant.length; i++) {
            answer += hp / ant[i];
            hp %= ant[i];
        }
        return answer;
    }
    public static void main(String[] args) {
        int age = 23;
        int[] emergency = {3, 17, 6};
        System.out.println(solution(23));
    }
}
