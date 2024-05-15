package baekjoon.bfsdfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Problem2667 {
    static boolean[][] visited;
    static int[][] arr;
    static int[][] pos = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
    static int count = 1;
    static ArrayList<Integer> result = new ArrayList<>();
    public static void dfs(int x, int y) {
        visited[x][y] = true;

        for (int i = 0; i < 4; i++) {
            int cur_x = x + pos[i][0];
            int cur_y = y + pos[i][1];
            if (cur_x >= 0 && cur_y >= 0 && cur_x < arr.length && cur_y < arr.length
                    && arr[cur_x][cur_y] == 1 && !visited[cur_x][cur_y]) {
                dfs(cur_x, cur_y);
                count ++;
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        arr = new int[N][N];
        visited = new boolean[N][N];


        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            for (int j = 0; j < N; j++) {
                arr[i][j] = s.charAt(j) - '0';
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if(arr[i][j] == 1 && !visited[i][j]){
                    dfs(i, j);
                    result.add(count);
                    count = 1;
                }
            }
        }
        Collections.sort(result);
        int length = result.size();
        System.out.println(length);
        for (int i = 0; i < length; i++) {
            System.out.println(result.get(i));
        }
    }
}
