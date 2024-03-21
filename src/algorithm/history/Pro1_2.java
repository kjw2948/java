package algorithm.history;

import java.util.ArrayList;
import java.util.HashMap;

public class Pro1_2 {
    public static void main(String[] args) {
        int n = 5;
        int max = 0;
        int answer = 0;
        int[][] arr = {{2, 10}, {1, 20}, {3, 30}, {2, 40}, {2, 60}};
        int[] dp = new int[arr.length + 1];
        for (int i = arr.length-1; i > 0; i--) {
            if (i + arr[i][0] > 5) {
                dp[i + 1] = 0;
            } else {
                if (max < arr[i][1]) {
                    dp[i + 1] = arr[i][1];
                    max = arr[i][1];
                } else {
                    dp[i + 1] = max;
                }
            }
        }
    }
}
