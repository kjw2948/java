import java.util.*;
import java.util.stream.IntStream;

public class Main {
    public static int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];

        for (int i = 0; i < emergency.length; i++) {
            for (int j = 0; j < emergency.length; j++) {
                if (emergency[i] < emergency[j]) {
                    answer[i]++;
                }
            }

            answer[i]++;
        }

        return answer;
    }
    public static void main(String[] args) {
        int age = 23;
        int[] emergency = {3, 17, 6};
        int[] answer = solution(emergency);
        for (int i = 0; i < answer.length; i++) {
            System.out.print(answer[i]);
        }
    }
}
