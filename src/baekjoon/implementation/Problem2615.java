package baekjoon.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem2615 {
    static int[][] map = new int[19][19];
    static boolean[][] visited = new boolean[19][19];
    static int count = 0;
    static int[][] pos = {{0, -1}, {0, 1}, {1, -1}, {-1, -1}};
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
                    result = i + " " + j;
                    ohmok(i, j, map[i][j]);
                }
            }
            
        }
    }

    private static void ohmok(int x, int y, int num) {
        visited[x][y] = true;

    }
}
