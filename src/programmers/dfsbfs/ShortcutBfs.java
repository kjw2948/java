package programmers.dfsbfs;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class ShortcutBfs {
    static boolean[][] visit;
    static int[][] pos = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
    static int row;
    static int col;
    static ArrayList<Integer> result = new ArrayList<>();
    public static int solution(int[][] maps){
        row = maps.length;
        col = maps[0].length;
        return 0;
    }
    public static void bfs(int row, int col) {
        Deque<int[]> queue = new ArrayDeque<>();
        queue.add(new int[] {row,col});
        visit[row][col] = true;
        while (!queue.isEmpty()) {
            int[] arr = queue.poll();
            for (int i = 0; i < 4; i++) {
                int nx = arr[0] + pos[i][0];
                int ny = arr[1] + pos[i][1];

            }

        }

    }
    public static void main(String[] args) {

    }
}
