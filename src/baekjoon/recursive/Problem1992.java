package baekjoon.recursive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem1992 {
    static int[][] arr;
    static StringBuilder sb;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        arr = new int[N][N];
        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            for (int j = 0; j < N; j++) {
                arr[i][j] = str.charAt(j) - '0';
            }
        }
        quadTree(N, 0 , 0);
        System.out.println(sb);
    }

    private static void quadTree(int N, int x, int y) {
        if (isPossible(N, x, y)) {
            sb.append(arr[x][y]);
            return;
        }

        int newSize = N / 2;

        sb.append("(");

        quadTree(newSize, x, y);
        quadTree(newSize, x, y + newSize);
        quadTree(newSize, x + newSize, y);
        quadTree(newSize, x+newSize, y+newSize);

        sb.append(")");
    }

    private static boolean isPossible(int N, int x, int y) {
        for (int i = x; i < x+N; i++) {
            for (int j = y; j < y+N; j++) {
                if (arr[i][j] != arr[x][y]) {
                    return false;
                }
            }
        }
        return true;
    }


}
