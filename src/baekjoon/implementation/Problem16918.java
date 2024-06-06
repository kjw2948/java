package baekjoon.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem16918 {
    static char[][] map;
    static int[][] time;
    static int[][] pos = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
    static int row;
    static int col;
    static int count = 2; // 몇초 지났는지 check


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        row = Integer.parseInt(st.nextToken());
        col = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        map = new char[row][col];
        time = new int[row][col];

        for (int i = 0; i < row; i++) {
            String str = br.readLine();
            for (int j = 0; j < str.length(); j++) {
                map[i][j] = str.charAt(j);
                if (map[i][j] == 'O') {
                    time[i][j] = 2;
                }
            }
        }

        for (int i = count; i <= N; i++) {
            if (i % 2 == 0) {
                fill();
            } else {
                bomb();
            }
            timeIsRunning();
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(map[i][j]);
            }
            System.out.println();
        }
    }
    public static void timeIsRunning() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (map[i][j] == 'O') {
                    time[i][j] ++;
                }
            }
        }
    }
    public static void fill() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (map[i][j] == '.') {
                    map[i][j] = 'O';
                }
            }
        }
    }
    public static void bomb() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (time[i][j] == 3) {
                    map[i][j] = '.';
                    time[i][j] = 0;
                    for (int k = 0; k < 4; k++) {
                        int cur_x = i + pos[k][0];
                        int cur_y = j + pos[k][1];
                        if (cur_x >= 0 && cur_y >= 0 && cur_x < row && cur_y < col) {
                            if(time[cur_x][cur_y]!=3) {
                                map[cur_x][cur_y] = '.';
                                time[cur_x][cur_y] = 0;
                            }
                        }
                    }
                }
            }
        }
    }
}
