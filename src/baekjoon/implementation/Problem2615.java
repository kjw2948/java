package baekjoon.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem2615 {
    static int[][] map = new int[19][19];
    static boolean[][] visited = new boolean[19][19];
    static int count = 1;
    static int[][] pos = {{0, 1}, {1, 1}, {1, 0}, {1, -1}};
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        for (int i = 0; i < 19; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 19; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        String result = "";
        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19; j++) {
                if (map[i][j] != 0) {
                    sb.append(i+1).append(" ").append(j+1);
                    for (int k = 0; k < pos.length; k++) {
                        int cur_x = i + pos[k][0];
                        int cur_y = j + pos[k][1];
                        if ( cur_x >= 0 && cur_x < 19 && cur_y >= 0 && cur_y < 19 && map[i][j] == map[cur_x][cur_y]) {
                            ohmok(i,j,pos[k][0], pos[k][1]);
                        }
                        if (count == 5) {
                            System.out.println(1);
                            System.out.println(sb.toString());
                            return;
                        }
                        count = 1;
                    }
                    sb = new StringBuilder();
                }
            }
        }
        System.out.println("0 0");
    }

    private static void ohmok(int x, int y, int dx, int dy) {
        if (x+dx>=19 || y+dy >= 19 || x+dx < 0 || y+dy < 0) {
            return;
        }

        if (map[x][y] == map[x + dx][y + dy]) {
            count++;
            ohmok(x + dx, y + dy, dx, dy);
        }
    }
}
