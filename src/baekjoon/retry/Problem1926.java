package baekjoon.retry;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Problem1926 {
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};
    public static void bfs(HashMap coord, int[][] board, int[][]visit) {
        for (int i = 0; i < 4; i++) {
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, Integer> coord = new HashMap<>();
        int row = Integer.parseInt(sc.next());
        int col = Integer.parseInt(sc.next());
        int[][] board = {{1, 1, 0, 1, 1}, {0, 1, 1, 0, 0},{0, 0, 0, 0, 0},{1, 0, 1, 1, 1},{0, 0, 1, 1, 1},{0, 0, 1, 1, 1}};
        int[][] visit = new int[row][col];
        
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (board[i][j] == 1) {
                    visit[i][j]=1;
                    coord.put(i, j);
                }
            }
        }

    }
}
