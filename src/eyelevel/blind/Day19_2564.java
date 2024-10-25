package eyelevel.blind;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Day19_2564 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());


        // X 가로 [][!]  , Y 세로 [!][]
        int X = Integer.parseInt(st.nextToken());
        int Y = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(br.readLine());
        int[][] map = new int[N+1][3]; // X Y 저장

        int result = 0;
        // 1 : 북  2 : 남  3: 서  4: 동
        for (int i = 0; i <= N; i++) {
            st = new StringTokenizer(br.readLine());
            int pos1 = Integer.parseInt(st.nextToken());
            int pos2 = Integer.parseInt(st.nextToken());
            map[i][2] = pos1;

            if (pos1 == 1) {
                map[i][0] = pos2;
            } else if (pos1 == 2) {
                map[i][0] = pos2;
                map[i][1] = Y;
            } else if (pos1 == 3) {
                map[i][1] = pos2;
            } else {
                map[i][1] = pos2;
                map[i][0] = X;
            }
        }
        int dk_x = map[N][0];
        int dk_y = map[N][1];
        int dk_dir = map[N][2];


        for (int i = 0; i < N; i++) {
            int x = map[i][0];
            int y = map[i][1];
            int dir = map[i][2];

        // 1. 같은 방위에 존재
            if (dir == dk_dir) {
                result += (Math.abs(dk_x - x) + Math.abs(dk_y - y));
            }
        //  다른 방위에 존재
            // 마주보는 곳에 위치하는 경우
            // 2. 북쪽 남쪽
            else if (dir + dk_dir == 3) {
                result += Math.min(x + dk_x, 2 * X - x - dk_x) + Y;
            }
            // 3.동쪽 서쪽
            else if( dir + dk_dir == 7) {
                result += Math.min(y + dk_y, 2 * Y - y - dk_y) + X;
            }
            // 측면에 위치
            // 4. 북서
            else if (dir * dk_dir == 3) {
                result += dk_x + x + dk_y + y;
            }
            // 5.북동
            else if (dir * dk_dir == 4){
                result += 2*X - dk_x - x + dk_y + y;
            }
            // 남서
            else if (dir * dk_dir == 6){
                result += 2*Y - dk_y - y + dk_x + x; // 10 - 5 - 2 + 3 + 0 = 6
            }
            // 남동
            else if (dir * dk_dir == 8){
                result += 2 * X - dk_x - x + 2 * Y - dk_y - y;
            }
        }
        System.out.println(result);
    }
}



        /*
           1
        3     4
           2

        #1
        1, 1
        2, 2
        3, 3
        4, 4

       #2
       1, 2
       3, 4


        1, 3 : 3
        1, 4 : 4
        2, 3 : 6
        2, 4 : 8
         */