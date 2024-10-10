package eyelevel.dfsbfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day4_10026 {
    static boolean[][] visit;
    static boolean[][] rgVisit;
    static char[][] map;
    static char[][] rgMap;
    static int[][] pos = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
    static int N, rgb, rg, region, rgRegion;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        visit = new boolean[N][N];
        rgVisit = new boolean[N][N];
        map = new char[N][N];
        rgMap = new char[N][N];


        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            for (int j = 0; j < s.length(); j++) {
                char c = s.charAt(j);
                map[i][j] = c;
                rgMap[i][j] = c;
                if (c == 'G') {
                    rgMap[i][j] = 'R';
                }
            }
        }

        if (N == 1) {
            System.out.println(1+" "+1);
        }

        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if (!visit[i][j]) {
                    rgb += (dfs(i, j) + 1) / region;
                    region = 0;
                }
                /*
                if (!rgVisit[i][j]) {
                    rg += (rgDfs(i, j) + 1) / rgRegion;
                    rgRegion = 0;
                }

                 */
            }
        }
        System.out.println(rgb +" " +rg);
    }

    static int dfs(int x, int y) {
        visit[x][y] = true;
        region ++;

        for (int i = 0; i < pos.length; i++) {
            int dx = x + pos[i][0];
            int dy = y + pos[i][1];

            if (dx >= 0 && dx < N && dy >= 0 && dy < N && !visit[dx][dy] && map[x][y] == map[dx][dy]) {
                dfs(dx, dy);
            }
        }
        return region;
    }

    static int rgDfs(int x, int y) {
        rgVisit[x][y] = true;
        rgRegion ++;

        for (int i = 0; i < pos.length; i++) {
            int dx = x + pos[i][0];
            int dy = y + pos[i][1];

            if (dx >= 0 && dx < N && dy >= 0 && dy < N && !rgVisit[dx][dy] && rgMap[x][y] == rgMap[dx][dy]) {
                rgDfs(dx, dy);
            }
        }
        return rgRegion;
    }
}
