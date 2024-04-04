package codingtest.thirdCoTe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class Solution2 {
    static ArrayList<Integer> list = new ArrayList<>();
    public static int solution(int[] numbers, int target, int num, int count) {
        Set<Integer> set = Arrays.stream(numbers).boxed().collect(Collectors.toSet());
        return 0;
    }


    public static void main(String[] args) {
        int min = Integer.MAX_VALUE;
        int[] numbers = {1, 2, 4};
        int target = 12;
        int result = 0;
        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];
            result = solution(numbers, target, num , 1);
            if(result<min && result!=0){
                min = result;
            }
        }
        System.out.println(result);
    }
}
