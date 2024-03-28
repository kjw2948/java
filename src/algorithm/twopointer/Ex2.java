package algorithm.twopointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Ex2 {
    public static int[] solution(int[] num1, int[] num2) {
        HashSet<Integer> answer = new HashSet<>();
        HashSet<Integer> result = new HashSet<>();
        for (int i = 0; i < num1.length; i++) {
            result.add(num1[i]);
        }
        for (int i = 0; i < num2.length; i++) {
            if (result.contains(num2[i])) {
                answer.add(num2[i]);
            }
        }
        return answer.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        int[] num1 = {4,9,5,1,7,4,9};
        int[] num2 = {9,4,9,8,4,7,1};
        System.out.println(Arrays.toString(solution(num1, num2)));
    }
}
