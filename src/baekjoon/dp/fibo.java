package baekjoon.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class fibo {
    public static long fibo(int n, long[] fibo_arr) {
        if(n<=1){
            return fibo_arr[n];
        }
        for (int i = 2; i <= n; i++) {
            if(fibo_arr[i]==0){
                fibo_arr[i] = fibo_arr[i - 1] + fibo_arr[i - 2];
            }
        }
        return fibo_arr[n];
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        long[] fibo_arr = new long[N+1];
        fibo_arr[0] = 0;
        fibo_arr[1] = 1;
        for (int i = 0; i < N+1; i++) {
            System.out.println(i +"번째 피보나치 수열 : " + fibo(i,fibo_arr));
        }
    }
}
