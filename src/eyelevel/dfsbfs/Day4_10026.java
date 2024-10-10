package eyelevel.dfsbfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day4_10026 {
    static boolean[][] visit;
    static char[][] map;
    static int[][] pos = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
    static int N, rgb, rg, region;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        visit = new boolean[N][N];
        map = new char[N][N];


        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            for (int j = 0; j < s.length(); j++) {
                map[i][j] = s.charAt(j);
            }
        }

        if (N == 1) {
            System.out.println(1+" "+1);
        }

        // 정상
        int result = 0;
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if (!visit[i][j]) {
                    dfs(i, j);
                    result++;
                }
            }
        }
        rgb = result;
        result = 0;
        visit = new boolean[N][N];

        //비정상
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if (map[i][j] == 'G') {
                    map[i][j] = 'R';
                }
            }
        }

        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if (!visit[i][j]) {
                    dfs(i, j);
                    result++;
                }
            }
        }

        rg = result;
        System.out.println(rgb +" " +rg);
    }

    static void dfs(int x, int y) {
        visit[x][y] = true;

        for (int i = 0; i < pos.length; i++) {
            int dx = x + pos[i][0];
            int dy = y + pos[i][1];

            if (dx >= 0 && dx < N && dy >= 0 && dy < N && !visit[dx][dy] && map[x][y] == map[dx][dy]) {
                dfs(dx, dy);
            }
        }
    }
}
