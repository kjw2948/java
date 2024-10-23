package eyelevel.blind;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Day17_25418_BFS {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        // DP를 위한 배열
        int[] memo = new int[K+1];
        // 시작값은 1로 시작
        memo[A] = 1;

        for (int i = A; i <= K; i++) {
            if (memo[i] != 0) {
                continue;
            }
            // i가 홀수인 경우
            if (i % 2 == 1 || i< 2*A) {
                memo[i] = memo[i-1] + 1;
            } else {
                // i가 짝수인 경우
                memo[i] = Math.min(memo[i - 1], memo[i / 2]) + 1;
            }
        }
        System.out.println(memo[K]-1);

    }
}
