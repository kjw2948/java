import java.util.*;

public class Main {
    public int solution(int[] numbers) {
        int answer = 0;
        Arrays.sort(numbers);
        int num = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            num++;
            if (num != numbers[i]) {
                answer = numbers[i-1]+1;
                break;
            }

        }
        return answer;
    }
    public static void main(String[] args) {
    }
}
