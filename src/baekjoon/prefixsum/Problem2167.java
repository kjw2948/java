package baekjoon.prefixsum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem2167 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][] arr = new int[N][M];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int K = Integer.parseInt(br.readLine());
        int[] answer = new int[K];
        for (int i = 0; i < K; i++) {
            int sum = 0;
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            if(x1==x2){
                for (int j = y1; j <= y2; j++) {
                    sum += arr[x1-1][j-1];
                }
            } else{
                for (int j = x1; j <= x2; j++) {
                    for (int k = y1; k <= y2; k++) {
                        sum += arr[j-1][k-1];
                    }
                }
            }
            answer[i] = sum;
        }
        for (int i = 0; i < K; i++) {
            System.out.println(answer[i]);
        }
    }
}
