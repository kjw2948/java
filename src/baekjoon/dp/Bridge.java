package baekjoon.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bridge {
    public static int solution(int N, int M) {
        int result = 1;
        int n = 1;
        for (int i = M; i > M-N; i--) {
            result = result*i/n;
            n ++;
        }
        return result;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            sb.append(Integer.toString(solution(N,M)) + " ");
        }
        String[] str = sb.toString().split(" ");
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }
    }
}
