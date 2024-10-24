package eyelevel.blind;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Day18_13702 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int left = 0, right = 0, result = 0;
        int[] alcohol = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine());
            alcohol[i] = Integer.parseInt(st.nextToken());
            right = Math.max(right, alcohol[i]);
        }

        while (left <= right) {
            int mid = right + (left - right) / 2;
            int cup = 0;

            for (int i = 1; i <= N ; i++) {
                cup += alcohol[i] / mid;
            }

            if (cup > K) {
                left = mid + 1;
            } else if (cup < K) {
                right = mid-1;
            } else {
                result = Math.max(result, mid);
                left = mid + 1;
            }
        }
        System.out.println(result);

    }
}
