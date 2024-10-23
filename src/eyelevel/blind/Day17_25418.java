package eyelevel.blind;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Day17_25418 {
    static int A,K;
    static int min = Integer.MAX_VALUE;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        A = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        dfs(A, K, 0);
        System.out.println(min);
    }

    static void dfs(int n, int target, int result) {
        if (n == target) {
            min = Math.min(result, min);
            return;
        }
        if (n > target) {
            return;
        }
        dfs(n * 2, target, result + 1);
        dfs(n + 1, target, result + 1);
    }
}
