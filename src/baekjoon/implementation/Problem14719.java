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
    static int max;
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
        leftWall = map[0] > map[1] ? 0 : 1;
        rightWall = leftWall == 0 ? 2 : 3;
        max = rightWall;
        if (W == 3 && rightWall == 3) {
            System.out.println(0);
            return;
        }

        // left보다 right가 값이 크거나 같아지는경우 && 남은게 전부 left > right인 경우 -> 그중에서 최대값
        while (rightWall < W) {
            for (int i = rightWall; i < W; i++) {
                if (map[leftWall] <= map[i]) {
                    water(leftWall, i);
                    leftWall = i;
                    rightWall = i+1;
                    max = rightWall;
                    break;
                }else{
                    if(map[rightWall] <= map[i]){
                        water(leftWall, i);
                        leftWall = i;
                        rightWall = i+1;
                    }
                }
            }
        }
        System.out.println(result);

    }

    private static void water(int left, int right) {
        int num = Math.min(map[left], map[right]);
        for (int i = left+1; i < right; i++) {
            result += (num - map[i]);
        }
    }
}
