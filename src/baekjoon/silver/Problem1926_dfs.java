package baekjoon.silver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Problem1926_dfs {
    static int count = 0;
    static int row,col;
    static boolean[][] visit;
    static int[][] board;
    static int[][] pos = {{0, -1}, {0, 1}, {1, 0}, {-1, 0}};
    public static void dfs(int x, int y) {
        visit[x][y] = true;
        count++;

        for (int i = 0; i < pos.length; i++) {
            int nx = x + pos[i][0];
            int ny = y + pos[i][1];

            if (nx >= 0 && nx < row && ny >= 0 && ny < col && board[nx][ny] == 1 && !visit[nx][ny]) {
                dfs(nx, ny);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        row = Integer.parseInt(sc.next());
        col = Integer.parseInt(sc.next());
        board = new int[row][col];
        visit = new boolean[row][col];
        boolean zero = true;
        List<Integer> answer = new ArrayList<>();

        // 보드 작성
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                board[i][j] = sc.nextInt();
                if (board[i][j] == 1) {
                    zero = false;
                }
            }
        }

        if (zero == true) {
            System.out.println("0");
            System.out.println("0");
            return;
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                count = 0;
                if (!visit[i][j] && board[i][j] == 1) {
                    dfs(i, j);
                    answer.add(count);
                }
            }
        }
        Collections.sort(answer);
        System.out.println(answer.size());
        System.out.println(answer.get(answer.size()-1));
    }
}
