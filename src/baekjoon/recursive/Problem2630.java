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

        System.out.println(white);
        System.out.println(blue);
    }

    static void paper(int size, int x, int y) {
        if (size == 0) {
            return;
        }
        int num = arr[x][y];
        boolean isPaper = true;
        int blueColor = 0;
        int whiteColor = 0;
        for (int i = x; i < x+size; i++) {
            for (int j = y; j < y+size; j++) {
                if (num != arr[i][j]) {
                    isPaper = false;
                    blueColor = 0;
                    whiteColor = 0;
                    break;
                }
                if (arr[i][j] == 1) {
                    blueColor ++;
                }
                if (arr[i][j] == 0) {
                    whiteColor ++;
                }
            }
            if (!isPaper) {
                break;
            }
        }
        if (blueColor != 0) {
            blue ++;
        }
        if (whiteColor != 0) {
            white ++;
        }
        int newSize = size/2;

        if(!isPaper) {
            paper(newSize, x, y);
            paper(newSize, x + newSize, y);
            paper(newSize, x, y + newSize);
            paper(newSize, x + newSize, y + newSize);
        }
    }
}
