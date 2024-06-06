package baekjoon.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Problem5212 {
    static char[][] arr;
    static char[][] cloneArr;
    static int[][] pos = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
    static int row;
    static int col;
    static int count = 0;
    static int min_row;
    static int min_col;
    static int max_row;
    static int max_col;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        row = Integer.parseInt(st.nextToken());
        col = Integer.parseInt(st.nextToken());

        arr = new char[row][col];

        for (int i = 0; i < row; i++) {
            String str = br.readLine();
            for (int j = 0; j < col; j++) {
                arr[i][j] = str.charAt(j);
            }
        }
        cloneArr = new char[row][col];

        for (int i = 0; i < row; i++) {
            cloneArr[i] = Arrays.copyOf(arr[i], arr[i].length);
        }

        min_row = Integer.MAX_VALUE;
        min_col = Integer.MAX_VALUE;
        max_row = Integer.MIN_VALUE;
        max_col = Integer.MIN_VALUE;



        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (arr[i][j] == 'X') {
                    checkSea(i, j);
                    count = 0;
                }
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (cloneArr[i][j] == 'X') {
                    min_row = Math.min(min_row, i);
                    max_row = Math.max(max_row, i);
                    min_col = Math.min(min_col, j);
                    max_col = Math.max(max_col, j);
                }
            }
        }

        char[][] result = new char[max_row - min_row + 1][max_col - min_col + 1];
        for (int i = min_row; i <= max_row ; i++) {
            for (int j = min_col; j <= max_col; j++) {
                result[i - min_row][j - min_col] = cloneArr[i][j];
            }
        }

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j]);
            }
            System.out.println();
        }

    }

    public static void checkSea(int x, int y) {
        for (int i = 0; i < 4; i++) {
            int cur_x = x + pos[i][0];
            int cur_y = y + pos[i][1];
            if (cur_x >= 0 && cur_y >= 0 && cur_x < row && cur_y < col && arr[cur_x][cur_y] == '.') {
                count ++;
            }
            else if (cur_x < 0 || cur_y < 0|| cur_x >= row || cur_y >= col) {
                count ++;
            }
        }
        if (count >= 3) {
            cloneArr[x][y] = '.';
        }
    }
}
