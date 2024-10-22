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
        int result = 0;

        int[] tree = new int[N + 1];
        int left = 0;
        int right = Integer.MIN_VALUE;
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            tree[i] = Integer.parseInt(st.nextToken());
            right = Math.max(right, tree[i]);
        }

        while (left < right) {
            int mid = left + (right - left) / 2; // 이분탐색을 위한 중간값
            long height = 0; // 자른 나무의 길이
            for (int i = 1; i <= N; i++) {
                if (tree[i] >= mid) {
                    //N개의 나무를 탐색하면서 자르려는 높이 이하면 차이를 result 누적해서 더해준다
                    height += tree[i] - mid;
                }
            }
            if (height == M) {
                // 나무길이 합이 M과 같으면
                result = mid;
                break;
            } else if (height < M) {
                right = mid;
            } else {
                result = mid;
                left = mid+1;
            }
        }
        System.out.println(result);
    }
}
