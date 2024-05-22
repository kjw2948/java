package baekjoon.backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class OperationInsert {
    static int N;
    static int[] arr;
    static int[] operation = new int[4];
    static int min = Integer.MAX_VALUE;
    static int max = Integer.MIN_VALUE;
    public static void dfs(int result, int index){
        if (index == N) {
            if (result > max) {
                max = result;
            }
            if (result < min) {
                min = result;
            }
            return;
        }

        for (int i = 0; i < 4; i++) {
            if (operation[i] > 0) {
                operation[i] --;
                switch (i){
                    case 0 :
                        dfs(result + arr[index], index + 1);
                        break;
                    case 1:
                        dfs(result - arr[index], index + 1);
                        break;
                    case 2:
                        dfs(result * arr[index], index + 1);
                        break;
                    case 3:
                        dfs(result / arr[index], index + 1);
                        break;
                }
                operation[i] ++;
            }
        }
    }
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        N = Integer.parseInt(br.readLine());
        arr = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 4; i++) {
            operation[i] = Integer.parseInt(st.nextToken());
        }
        dfs(arr[0], 1);
        System.out.println(max);
        System.out.println(min);
    }
}
