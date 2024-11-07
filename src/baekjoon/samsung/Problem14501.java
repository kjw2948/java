package baekjoon.samsung;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem14501 {
    static int[] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        dp = new int[N + 1];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int day = Integer.parseInt(st.nextToken());
            int cost = Integer.parseInt(st.nextToken());

            if (i + day <= N) {
                dp[i + day] = Math.max(dp[i + day], dp[i] + cost);
            }
            dp[i + 1] = Math.max(dp[i], dp[i + 1]);

        }
        System.out.println(dp[N]);
    }
}
/*
1   2   3   4   5   6   7   8   9   10
0
 */