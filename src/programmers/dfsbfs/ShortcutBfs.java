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
        visit = new boolean[row][col];
        ArrayList<Integer> result = bfs(row, col, maps);
        if (result.isEmpty()) {
            return -1;
        }
        result.sort(null);
        System.out.println(result.toString());
        return result.get(0);
    }
    public static ArrayList<Integer> bfs(int row, int col, int[][] maps) {
        Deque<int[]> queue = new ArrayDeque<>();
        ArrayList<Integer> result = new ArrayList<>();
        queue.add(new int[] {0,0,1}); // x y 이동횟수
        visit[0][0] = true;
        while (!queue.isEmpty()) {
            int[] arr = queue.poll();
            if (arr[0] == row-1 && arr[1] == col-1) {
                result.add(arr[2]);
            }
            for (int i = 0; i < 4; i++) {
                int nx = arr[0] + pos[i][0];
                int ny = arr[1] + pos[i][1];
                if (nx >= 0 && ny >= 0 && nx < row && ny < col && !visit[nx][ny] && maps[nx][ny] != 0) {
                    visit[nx][ny] = true;
                    queue.add(new int[]{nx, ny, arr[2]+1});
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[][] maps = new int[][]{{1, 0, 1, 1, 1}, {1, 0, 1, 0, 1}, {1, 0, 1, 1, 1}, {1, 1, 1, 0, 1}, {0, 0, 0, 0, 1}};
        //int[][] maps = {{1, 0, 0}, {1, 0, 0}, {1, 1, 1}};
        System.out.println(solution(maps));
    }
}
