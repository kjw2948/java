package baekjoon.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem14891 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int[][] arr = new int[4][8];



        for (int i = 0; i < 4; i++) {
            String str = br.readLine();
            for (int j = 0; j < 8; j++) {
                arr[i][j] = Integer.parseInt(str.substring(j, j + 1));
            }
        }
        int K = Integer.parseInt(br.readLine());
        int idx = 0;

        for (int i = 0; i < K; i++) {
            int[] rotateArr = new int[4];
            st = new StringTokenizer(br.readLine());
            int gear = Integer.parseInt(st.nextToken()); // 톱니바퀴 번호
            int rotate = Integer.parseInt(st.nextToken()); // 회전 방향 1: 시계 -1 : 반시계
            int count = 0;





            for (int j = gear-1 ; j != gear-1 || count !=4 ; ) {
                if (j == 0) {

                } else if (j == 1) {

                } else if (j == 2) {

                } else {

                }


                j++;
                j %= 4;
                count ++;
            }
            for (int j = 0; j < 4; j++) {
                System.out.println("rotateArr[j] = " + rotateArr[j]);
            }
        }

    }
}
