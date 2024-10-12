package eyelevel.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Day6_14430 {
    static int N,M, mineral;
    static int[][] map;
    static int[][] pos = {{0, 1}, {1, 0}}; // 오른쪽 아래
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        map = new int[N][M];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        mineral = map[0][0] * 1000;
        map[0][0] += 50;
        for (int i = 1; i < N; i++) {
            if (map[i][0] == 0) {
                map[i][0] = map[i - 1][0];
            }
            if (map[i][0] == 1) {
                map[i][0] = map[i - 1][0] + 1000;
            }
        }

        for (int i = 1; i < M; i++) {
            if (map[0][i] == 0) {
                map[0][i] = map[0][i-1];
            }
            if (map[0][i] == 1) {
                map[0][i] = map[0][i-1] + 1000;
            }
        }


        for (int i = 1; i < N; i++) {
            for (int j = 1; j < M; j++) {
                if (map[i][j] % 10 != 5) {
                    dp(i, j);
                }
            }
        }

        System.out.println(mineral / 1000);

    }

    static void dp(int x, int y) {
        int max = Integer.max(map[x- 1][y], map[x][y - 1]);

        if (map[x][y] == 1) map[x][y] = max + 1000;
        if (map[x][y] == 0) map[x][y] = max;

        mineral = Integer.max(map[x][y], mineral);

    }
}


/*
3 4
0 1 1 0
1 1 0 0
0 1 0 0
   0 1000 2000 2000
1000 2000 2000 2000
1000 3000 2000 2000

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.printf("%4d ", map[i][j]);
            }
            System.out.println();
        }
 */