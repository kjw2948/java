package codingtest.firestCoTe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution5 {
    public static int combination(int n, int r) {
        if (r == 0 || r == n)
            return 1;
        else
            return combination(n - 1, r - 1) + combination(n - 1, r);
    }
    public static int permutation(int n, int r) {
        if (n == r || r == 0)
            return 1;
        else
            return n * permutation(n - 1, r - 1);
    }
    public static long solution(int N, int M, int K, int[] capacity) {
        Arrays.sort(capacity); // 용량이 큰 교실부터 배치하기 위해 정렬
        int classrooms = capacity.length;
        long answer = 1;

        for (int i = classrooms - 1; i >= 0; i--) {
            if (N <= 0) // 모든 학생이 배정되었으면 종료
                break;
            // 현재 교실에 배정 가능한 학생 수 계산
            int availableSeats = capacity[i];
            int r =  Math.min(availableSeats, N);
            answer *= combination(N, r);

            // 남은 학생 수 갱신
            N -= availableSeats;
        }
        int director = permutation(K,M);
        answer *= director;
        return answer;
    }

    public static void main(String[] args) {
        int[] capacity = {3, 3, 4};
        System.out.println(solution(10, 3, 4, capacity));
    }
}
