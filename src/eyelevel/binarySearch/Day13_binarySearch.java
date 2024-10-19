package eyelevel.binarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Day13_binarySearch {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        int[] path = new int[M + 1];

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= M; i++) {
            path[i] = Integer.parseInt(st.nextToken());
        }
        int left = 0;
        int right = N;

        while (left <= right) {
            int mid = (left + right) / 2;
        }

    }
}
