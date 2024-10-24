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
            // N개의 막걸리 양을 담는 배열
            alcohol[i] = Integer.parseInt(st.nextToken());
            // 분배가능한 막걸리 값으로 가능한 것은 주어진 막걸리중의 최대값임
            right = Math.max(right, alcohol[i]);
        }

        while (left <= right) {
            int mid = right + (left - right) / 2;
            int cup = 0; // mid만큼 막걸리를 담을 수 있는 컵의 개수

            for (int i = 1; i <= N ; i++) {
                // 전체 막걸리를 순회하면서 남은건 버리기 때문에 몫만 cup에 저장해준다.
                cup += alcohol[i] / mid;
            }

            if (cup >= K) {
                // cup 개수 >= 사람수 라는것은 더 많은 막걸리를 담을 수 있다는 뜻
                result = mid;
                // result에 해당 막걸리양을 담아두고 더 큰값이 가능한지 확인한다.
                left = mid + 1;
            } else{
                right = mid-1;
            }
        }
        System.out.println(result);

    }
}
