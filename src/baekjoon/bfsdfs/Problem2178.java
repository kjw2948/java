package baekjoon.bfsdfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Problem2178 {
    static int[][] map;
    static int[][] pos = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
    static int[][] path;
    static Deque<Point> queue = new LinkedList<>();
    static int N, M;

    static class Point {
        int x, y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new int[N][M];
        path = new int[N][M];

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            for (int j = 0; j < str.length(); j++) {
                map[i][j] = str.charAt(j) - '0';
                path[i][j] = -1;
            }
        }

        queue.add(new Point(0,0));
        path[0][0] = 0;
        bfs();
        System.out.println(path[N-1][M-1] + 1);
    }

    static void bfs() {
        while(!queue.isEmpty()) {
            Point point = queue.pollFirst();
            for (int i = 0; i < pos.length; i++) {
                int cur_x = point.x + pos[i][0];
                int cur_y = point.y + pos[i][1];

                if (cur_x < 0 || cur_x >= N || cur_y < 0 || cur_y >= M) {
                    continue;
                }
                if (path[cur_x][cur_y] != -1 || map[cur_x][cur_y] == 0) {
                    continue;
                }

                queue.add(new Point(cur_x, cur_y));
                path[cur_x][cur_y] = path[point.x][point.y] + 1;

                if (cur_x == N - 1 && cur_y == M - 1) {
                    return;
                }
            }
        }
    }
}
