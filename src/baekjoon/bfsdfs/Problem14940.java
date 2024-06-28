package baekjoon.bfsdfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Problem14940 {
    static int N, M;
    static int[][] map, distance;
    static int[][] pos = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
    static Deque<Point> queue = new LinkedList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        map = new int[N][M];
        distance = new int[N][M];


        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                distance[i][j] = -1;
                if (map[i][j] == 2) {
                    queue.add(new Point(i, j));
                    distance[i][j] = 0;
                }
                if (map[i][j] == 0) {
                    distance[i][j] = 0;
                }
            }
        }
        while (!queue.isEmpty()) {
            Point point = queue.pollFirst();

            for (int i = 0; i < 4; i++) {
                int dx = point.x + pos[i][0];
                int dy = point.y + pos[i][1];

                if (dx < 0 || dy < 0 || dx >= N || dy >= M) {
                    continue;
                }
                if (map[dx][dy] == 0 || distance[dx][dy] != -1) {
                    continue;
                }

                queue.add(new Point(dx, dy));
                distance[dx][dy] = distance[point.x][point.y] + 1;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (map[i][j] == 1 && distance[i][j] == -1) {
                    sb.append(-1).append(" ");
                } else {
                    sb.append(distance[i][j]).append(" ");
                }
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }

    static class Point {
        int x;
        int y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
