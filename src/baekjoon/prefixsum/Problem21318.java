package baekjoon.prefixsum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem21318 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int[] arr = new int[N+1];
        for (int i = 1; i < N+1; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int[] piano = new int[N+1];
        for (int i = 1; i < N; i++) {
            if(arr[i]>arr[i+1]){
                piano[i] = piano[i-1] + 1;
            }else{
                piano[i] = piano[i - 1];
            }
        }
        piano[N] = piano[N - 1];
        int Q = Integer.parseInt(br.readLine());
        int[] answer = new int[Q];
        for (int i = 0; i < Q; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            answer[i] = piano[y-1] - piano[x-1];
        }
        for (int i = 0; i < answer.length; i++) {
            System.out.println(answer[i]);
        }
    }
}
