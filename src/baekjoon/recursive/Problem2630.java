package baekjoon.recursive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem2630 {
    static int[][] arr;
    static int blue = 0;
    static int white = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        arr = new int[N][N];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        paper(N, 0, 0);
        System.out.println(blue);
        System.out.println(white);
    }

    static void paper(int size, int x, int y) {
        if (size == 0) {
            return;
        }
        int num = arr[x][y];
        boolean isSame = true;
        int whiteColor = 0;
        int blueColor = 0;
        int newSize = size /2;
        for (int i = x; i < x+newSize; i++) {
            for (int j = y; j < y+newSize; j++) {
                if (num != arr[i][j]) {
                    isSame = false;
                    whiteColor = 0;
                    blueColor = 0;
                    break;
                }
                if (arr[i][j] == 0) {
                    whiteColor++;
                }
                if (arr[i][j] == 1) {
                    blueColor++;
                }
            }
            if (!isSame) {
                break;
            }
        }
        if (whiteColor != 0) {
            white ++;
        }
        if (blueColor != 0) {
            blue++;
        }
        paper(newSize, x+newSize, y);
        paper(newSize, x, y+newSize);
        paper(newSize, x+newSize, y+newSize);
    }
}
