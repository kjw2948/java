package eyelevel.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Day8_2096 {
    static int[][] maxMap, minMap;
    static int N, min, max;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        maxMap = new int[N][N];
        minMap = new int[N][N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                maxMap[i][j] = Integer.parseInt(st.nextToken());
                minMap[i][j] = maxMap[i][j];
            }
        }

        for (int i = 0; i < N; i++) {
            min = Integer.min(min, minMap[0][i]);
            max = Integer.max(max, maxMap[0][i]);
        }
        // 1~N번째 라인을 돌면서 각 점마다 최대 / 최소값을 저장

        for (int i = 1; i < N; i++) {
            dp(i);
        }


    }

    static void dp(int n) {

    }

    static void check(int x, int y1, int y2) {

    }
}
