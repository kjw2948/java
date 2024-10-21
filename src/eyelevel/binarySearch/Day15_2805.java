package eyelevel.binarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Day15_2805 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int check = 0;

        int[] tree = new int[N + 1];
        int min = 0;
        int max = Integer.MIN_VALUE;
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            tree[i] = Integer.parseInt(st.nextToken());
            max = Math.max(max, tree[i]);
        }
        if (min == max) {
            if (M % N == 0) {
                System.out.println(max - M / N);
            } else {
                System.out.println(max - M/N - 1);
            }
            return;
        }

        while (min < max) {
            int mid = min + (max - min) / 2;
            long result = 0;
            for (int i = 1; i <= N; i++) {
                if (tree[i] >= mid) {
                    result += tree[i] - mid;
                }
            }
            if (result == M) {
                check = mid;
                break;
            } else if (result < M) {
                max = mid;
            } else {
                check = mid;
                min = mid+1;
            }
        }
        System.out.println(check);
    }
}
