package programmers.dfsbfs;

import java.util.ArrayList;
import java.util.Collections;

public class Shortcut {
    static int row;
    static int col;
    static int[][] visit;
    static int[][] pos = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    static ArrayList<Integer> result = new ArrayList<>();
    public static int solution(int[][] maps) {
        int answer = 0;
        row = maps.length;
        col = maps[0].length;
        visit = new int[row][col];
        dfs(0, 0, maps, 0);
        Collections.sort(result);
        if(result.isEmpty()){
            return -1;
        }
        return result.get(0);
    }

    public static void dfs(int x, int y, int[][] maps, int move) {
        visit[x][y] = ++move;


        for (int i = 0; i < pos.length; i++) {
            int nx = x + pos[i][0];
            int ny = y + pos[i][1];

            if (nx >= 0 && nx < row && ny >= 0 && ny < col && visit[nx][ny] == 0 && maps[nx][ny] == 1) {
                dfs(nx, ny, maps, move);
                visit[nx][ny] = 0;
            }
            if (x == row - 1 && y == col - 1) {
                result.add(visit[x][y]);
            }
        }
    }

    public static void main(String[] args) {
        int[][] maps = {{1, 0, 1, 1, 1}, {1, 0, 1, 0, 1}, {1, 0, 1, 1, 1}, {1, 1, 1, 0, 1}, {0, 0, 0, 0, 1}};
        int a = solution(maps);
        System.out.println(a);
    }
}
