package eyelevel.dfsbfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day5_9095 {
    static int N;
    static int[] arr;
    static int[] input;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        int max = 0;
        input = new int[N];



        for (int i = 0; i < N; i++) {
            input[i] = Integer.parseInt(br.readLine());
            max = Integer.max(input[i], max);
        }
        arr = new int[max + 1];

        for (int i = 0; i < input.length; i++) {
            System.out.println(dp(input[i]));
        }

    }
     // 4 : 1+3  1+1
    static int dp(int N) {

        if (N == 1 || N == 0) {
            return arr[N] = 1; // 1
        }
        if (N == 2) {
            return arr[2] = 2; // 1+1 , 2
        }
        if (N == 3) {
            return arr[3] = 4; // 1+1+1 , 1+2 , 2+1 , 3
        }
        if (arr[N] == 0) {
            return arr[N] = dp(N - 1) + dp(N - 2) + dp(N - 3);
        } else {
            return arr[N];
        }
    }
}
