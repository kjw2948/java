package baekjoon.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bridge {
    static int[][] arr = new int[30][30];
    public static int solution(int N, int M) {
        if(arr[N][M]>0){
            return arr[N][M];
        }
        if (N >= 1 && M >= 1 && N<=M) {
            arr[N][M] = solution(N, M - 1) + solution(N - 1, M - 1);
        }
        return arr[N][M];
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for (int i = 0; i < 30; i++) {
            arr[0][i] = 1;
            arr[1][i] = i;
        }
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
