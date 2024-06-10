package baekjoon.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem14719 {
    static int result = 0;
    static int[] map;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int H = Integer.parseInt(st.nextToken());
        int W = Integer.parseInt(st.nextToken());
        map = new int[W];
        st = new StringTokenizer(br.readLine());

        if (st.countTokens() <= 2) {
            System.out.println(0);
            return;
        }
        for (int i = 0; i < W; i++) {
            map[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 1; i < W-1; i++) {
            int leftWall = 0;
            int rightWall = 0;

            for (int j = 0; j < i; j++) {
                leftWall = Math.max(leftWall, map[j]);
            }

            for (int j = i+1; j < W; j++) {
                rightWall = Math.max(rightWall, map[j]);
            }

            if (map[i] <leftWall && map[i] < rightWall) {
                result += Math.min(leftWall, rightWall) - map[i];
            }
        }
        System.out.println(result);
    }
}
