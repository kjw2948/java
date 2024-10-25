package eyelevel.blind;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Day19_2564_line {
    static int[] map;

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());

        // Map의 크기
        int X = Integer.parseInt(st.nextToken());
        int Y = Integer.parseInt(st.nextToken());

        // 상점의 개수
        int shop = Integer.parseInt(br.readLine());
        // 동근이 정보
        int dk = 0;
        int result = 0;

        // 상점의 정보를 담을 배열
        map = new int [shop];

        for(int i = 0; i < shop + 1; i++) {
            st = new StringTokenizer(br.readLine());

            int dir = Integer.parseInt(st.nextToken());
            int loc = Integer.parseInt(st.nextToken());

            // 직선상에서 길이
            int tmp = 0;

            switch(dir) {
                case 1:
                    //북
                    tmp = loc;
                    break;
                case 2:
                    //남
                    tmp = X + Y + X - loc;
                    break;
                case 3:
                    //서
                    tmp = X + Y + X + Y - loc;
                    break;
                case 4:
                    //동
                    tmp = X + loc;
                    break;
            }

            if(i < shop) {
                map[i] = tmp;
            } else {
                // 마지막 동근이의 길이 담음
                dk = tmp;
            }
        }

        for (int i = 0; i < shop; i++) {
            // 시계방향 , 반시계방향 중 어느쪽이 작은지 구하기
            int path1 = Math.abs(dk - map[i]);
            int path2 = 2 * X + 2 * Y - path1;
            result += Math.min(path1, path2);
        }

        System.out.println(result);
    }
}
