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
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int[] piano = new int[N];
        int sum = 0;
        for (int i = 0; i < N-1; i++) {
            if(arr[i]>arr[i+1]){
                piano[i]++;
                sum ++;
            }
        }
        int Q = Integer.parseInt(br.readLine());
        int[] answer = new int[Q];
        for (int i = 0; i < Q; i++) {
            int count = 0;
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            if(y-x<N/2){
                for (int j = x-1; j < y-1; j++) {
                    count += piano[j];
                }
            }else{
                for (int j = 1; j < x; j++) {
                    count += piano[j-1];
                }
                for (int j = y; j < N; j++) {
                    count += piano[j-1];
                }
                count = sum - count;
            }
            answer[i] = count;
        }
        for (int i = 0; i < answer.length; i++) {
            System.out.println(answer[i]);
        }
    }
}
