package eyelevel.dfsbfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Day2_4963 {
    static int[][] map;
    static boolean[][] visit;
    static int[][] pos = {{0, 1}, {0, -1}, {1, 0}, {-1, 0},{1,1},{1,-1},{-1,1},{-1,-1}}; // 상하좌우 대각을 나타내는 배열
    static int island;
    static StringBuilder sb;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        StringTokenizer st;

        while (true) {
            island = 0;
            // #1 Input 받기
            st = new StringTokenizer(br.readLine());
            int w = Integer.parseInt(st.nextToken());
            int h = Integer.parseInt(st.nextToken());

            if(w==0 && h==0) break; // 종료조건
            map = new int[h][w];
            visit = new boolean[h][w];

            for (int i = 0; i < h; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < w; j++) {
                    map[i][j] = Integer.parseInt(st.nextToken());
                }
            }


            // 2. 모든 위치를 순회하면서 조건에 맞으면 bfs 진행
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    if (map[i][j] == 1 && !visit[i][j]) {
                        bfs(i, j);
                        island++;
                    }
                }
            }
            sb.append(island).append("\n");
        }
        System.out.println(sb.toString());
    }

    // 3.bfs 진행
    static void bfs(int h, int w) {
        // 방문한곳은 체크
        visit[h][w] = true;

        // 한 점에 대해서 상하좌우 대각선 확인하여 방문한적 없는 땅이면 다시 bfs 반복
        for (int i = 0; i < pos.length; i++) {
            int dh = h + pos[i][0];
            int dw = w + pos[i][1];

            if (dh >= 0 && dw >= 0 && dh < visit.length && dw < visit[0].length && !visit[dh][dw] && map[dh][dw] == 1) {
                bfs(dh, dw);
            }
        }
    }
}
