package programmers.sort;

import java.util.Arrays;

//merge ,
public class Sort1 {
    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for (int i = 0; i < commands.length; i++) {
            int num = commands[i][0]-1;
            int[] result = new int[commands[i][1] - commands[i][0] + 1];
            for (int j = 0; j < result.length; j++) {
                result[j] = array[num++];
            }
            Arrays.sort(result);
            answer[i] = result[commands[i][2]-1];
        }
        return answer;
    }
    public static void main(String[] args) {
        int[] arr = {1, 5, 2, 6, 3, 7, 4};
        int[][] commnads = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        int[] answer = solution(arr, commnads);
        for (int i = 0; i < answer.length; i++) {
            System.out.print(answer[i]+" ");
        }
    }
}
