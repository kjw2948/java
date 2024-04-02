package baekjoon.backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class OperationInsert {
    static int[] count = new int[4];
    static int[] arr;
    static int[] operation = new int[4];
    static int min = Integer.MIN_VALUE;
    static int max = Integer.MAX_VALUE;
    public static void solution(int N, int depth, int num){
        if(depth==N){
            if(num>max){
                max = num;
            }
            if(num<min){
                min = num;
            }
            return;
        }

        for (int i = 1; i < N; i++) {
            for (int j = 0; j < 4; j++) {
                if(count[j]<operation[j]){
                    count[j]++;
                    if(j==0){
                        num += arr[i];
                    }else if(j==1){
                        num -= arr[i];
                    }else if(j==2){
                        num *= arr[i];
                    }else{
                        num /= arr[i];
                    }

                }
            }
        }
    }
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        arr = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 4; i++) {
            operation[i] = Integer.parseInt(st.nextToken());
        }
    }
}
