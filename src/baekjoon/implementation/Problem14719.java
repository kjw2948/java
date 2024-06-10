package baekjoon.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem14719 {
    static int result = 0;
    static int[] map;
    static int leftWall;
    static int rightWall;
    static int W;
    static int H;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        H = Integer.parseInt(st.nextToken());
        W = Integer.parseInt(st.nextToken());
        map = new int[W];
        st = new StringTokenizer(br.readLine());

        if (st.countTokens() <= 2) {
            System.out.println(0);
            return;
        }
        for (int i = 0; i < W; i++) {
            map[i] = Integer.parseInt(st.nextToken());
        }

        leftWall = 0;
        rightWall = 1;


        while (rightWall < W) {
            setNext();  // 물이 고일 수 있는 벽 찾기 : 시작벽 높이 > 바로 옆에 벽 높이
            if (rightWall >= W-1) {
                break;
            }
            for (int i = rightWall+1; i < W; i++) {
                if (map[rightWall] < map[i] && map[leftWall] <= map[i]) {
                    water(leftWall, i);
                    leftWall = i;
                    rightWall = i+1;
                    setNext();
                } else if (map[rightWall] < map[i] && map[leftWall] > map[i]) {
                    water(leftWall, i);
                    rightWall = i;
                }
            }
        }
        System.out.println(result);
    }

    private static void water(int left, int right) {
        int num = Math.min(map[left], map[right]);
        for (int i = left+1; i < right; i++) {
            result += num - map[i];
            map[i] = num;
        }
    }

    private static void setNext() {
        while (rightWall < W && map[leftWall] <= map[rightWall]) {
            leftWall = rightWall;
            rightWall ++;
            if (rightWall == W) {
                rightWall --;
                break;
            }
        }
    }
}
