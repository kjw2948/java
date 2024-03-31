package algorithm.divideandconcur;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex2 {
    public static int solution(int[][] arr) {
        int[][] arr2 = new int[arr.length][arr[0].length];
        int answer = 0;
        int x = 0;
        int y = 0;
        if (checkArray(arr, 0 , 0)) {
            for (int i = 0; i < arr.length; i++) {
                arr2[0][i] = arr[0][i];
                answer += arr2[0][i];
                x = i;
                y = x + arr.length / 2;
                checkArray(arr, x, y);
            }
        }
        int sum = 0;
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                sum += arr2[i][j];
            }
        }
        return sum;
    }

    public static boolean checkArray(int[][] arr, int x, int y) {
        int n = arr[x][y];
        for (int i = x; i < x+arr.length/2; i++) {
            for (int j = y; j < y+arr.length/2; j++) {
                if (arr[i][j] != n) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int K = Integer.parseInt(st.nextToken());
        int[][] arr = new int[K][K];
        for (int i = 0; i < K; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < K; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        System.out.println(solution(arr));
    }
}
