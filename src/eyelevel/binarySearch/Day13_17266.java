package eyelevel.binarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Day13_17266 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        int[] light = new int[M+1]; // 가로등 위치가 저장된
        for (int i = 1; i <= M; i++) {
            light[i] = Integer.parseInt(st.nextToken());
        }
        int check = Math.max(light[1], N - light[M]);
        if (M == 1) {
            System.out.println(check);
            return;
        }
        int height = 0;
        for (int i = 1; i <= M; i++) {
            height = Math.max((light[i] - light[i - 1] + 1) / 2, height);
        }

        if (height <= check) {
            System.out.println(check);
        } else {
            System.out.println(height);
        }
    }
}
