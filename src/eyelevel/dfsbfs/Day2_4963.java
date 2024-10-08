package eyelevel.dfsbfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Day2_4963 {
    static int[][] map;
    static boolean[][] visit;
    static int[][] pos = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
    static int island;
    static StringBuilder sb;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        StringTokenizer st;

        while (true) {
            island = 0;
            st = new StringTokenizer(br.readLine());

            int w = Integer.parseInt(st.nextToken());
            int h = Integer.parseInt(st.nextToken());

            if(w==0 && h==0) break;
            map = new int[h][w];
            visit = new boolean[h][w];

            for (int i = 0; i < h; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < w; j++) {
                    map[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            bfs(0, 0);
        }
        System.out.println(sb.toString());
    }

    static void bfs(int h, int w) {
        visit[h][w] = true;
        int count = 0;
        if (map[h][w] == 0) {
            return;
        }


        for (int i = 0; i < 4; i++) {
            int dh = h + pos[i][0];
            int dw = w + pos[i][1];

            if (dh >= 0 && dw >= 0 && dh < visit.length && dw < visit[0].length && !visit[dh][dw] && map[dh][dw] == 1) {
                bfs(dh, dw);
                visit[dh][dw] = false;
                count ++;
            }
        }
        if (count == 0) {
            island ++;
            sb.append(island);
        }
    }

}
