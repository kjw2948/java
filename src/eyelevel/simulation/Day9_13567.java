package eyelevel.simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Day9_13567 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[][] pos = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int x = 0;
        int y = 0;
        int index = 0;
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());


        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String behavior = st.nextToken();
            int num = Integer.parseInt(st.nextToken());

            if (behavior.equals("TURN")) {
                if (num == 0) {
                    index = (index + 1) % 4;
                } else {
                    index = (index + 3) % 4;
                }
            } else {
                if (index % 2 == 0) {
                    int move_y = y + num * pos[index][1];
                    if (move_y >= 0 && move_y < M) {
                        y = move_y;
                    } else {
                        System.out.println(-1);
                        return;
                    }
                } else {
                    int move_x = x + num * pos[index][0];
                    if (move_x >= 0 && move_x < M) {
                        x = move_x;
                    } else {
                        System.out.println(-1);
                        return;
                    }
                }
            }
        }
        System.out.println(y +" " + x);
    }
}
