package eyelevel.blind;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Day20_11060 {
    static int[] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        dp = new int[N+1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        int result = Integer.MAX_VALUE;

        if (N == 1) {
            System.out.println(0);
            return;
        }
        for (int i = 1; i <= N; i++) {
            int num = Integer.parseInt(st.nextToken());
            if(i!=1 && dp[i] == 0) break;

            if (i + num >= N) {
                result = Math.min(result, dp[i]+1);
                continue;
            }
            for (int j = i+1; j <= i+num && j<=N ; j++) {
                if (dp[j] == 0) {
                    dp[j] = dp[i] + 1;
                } else {
                    dp[j] = Math.min(dp[j], dp[i] + 1);
                }
            }
        }
        if (result == Integer.MAX_VALUE) {
            System.out.println(-1);
        }else {
            System.out.println(result);
        }
    }
}
