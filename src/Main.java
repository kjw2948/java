import java.util.*;
import java.util.stream.IntStream;

public class Main {
    public static int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length / n][n];
        for (int i = 0; i < num_list.length; i++) {
            answer[i / n][i % n] = num_list[i];
        }
        return answer;
    }
    public static void main(String[] args) {
        int age = 23;
        int[] num_list = {1, 2, 3, 4, 5, 6, 7, 8};
        int[][] answer = solution(num_list, 2);
        for (int i = 0; i < answer.length; i++) {
            for (int j = 0; j < answer[i].length; j++) {
                System.out.print(answer[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
