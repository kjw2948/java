package baekjoon.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Problem15686 {
    static int[][] map;
    static List<String> house = new ArrayList<>();
    static List<String> chicken = new ArrayList<>();
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        map = new int[N][N];

        int M = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                if (map[i][j] == 1) {
                    house.add(Integer.toString(i) + " " +Integer.toString(j));
                }
                if (map[i][j] == 2) {
                    chicken.add(Integer.toString(i) + " " +Integer.toString(j));
                }
            }
        }




    }
}
