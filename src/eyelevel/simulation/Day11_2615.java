package eyelevel.simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Day11_2615 {
    static int[][] board = new int[21][21];
    static int[][][] memo = new int[21][21][4];
    static int[][] pos = {{1, 0}, {0, 1}, {1, -1}, {1, 1}};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        board = new int[21][21];

        for (int i = 1; i <= 19; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= 19 ; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 1; i <= 19; i++) {
            for (int j = 1; j <=19 ; j++) {
                if (board[i][j] != 0) {
                    for (int k = 0; k < 4; k++) {
                        if (memo[i][j][k] == 0 && findFive(i, j, k) == 5) {
                            System.out.println(board[i][j]);
                            if (k == 2) {
                                System.out.println((i + 4) + " " + (j - 4));
                            }
                            else{
                                System.out.println(i +" " + j);
                            }
                            return;
                        }
                    }
                }
            }
        }
        System.out.println(0);
    }
    static int findFive(int x, int y, int d) {
        memo[x][y][d] = 1;
        int num = board[x][y];
        int dx = x + pos[d][0];
        int dy = y + pos[d][1];
        int count = 1;

        while (num == board[dx][dy]) {
            count ++;
            memo[dx][dy][d] = 1;
            dx += pos[d][0];
            dy += pos[d][1];
        }
        return count;
    }
}
