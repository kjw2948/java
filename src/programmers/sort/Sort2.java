package programmers.sort;

import java.util.ArrayList;
import java.util.Arrays;

public class Sort2 {
    public static String solution(int[] numbers) {
        String answer = "";
        ArrayList<Integer> list = new ArrayList<>();
        int max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]<10){

            }else if(numbers[i]<100){

            } else if (numbers[i] < 1000) {

            } else {

            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] numbers = {6, 10, 5};
        System.out.println(solution(numbers));
    }
}
