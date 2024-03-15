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
        int capacitySum = Arrays.stream(capacity).sum();

        long studentClass = 1;
        if (capacitySum == N) {
            int studentLeft = N;
            for (int cap : capacity) {
                studentClass = nChooseK(studentLeft, cap);
                studentLeft -= cap;
            }
        } else {
            studentClass = 0;
            long capacityMult = Arrays.stream(capacity).asLongStream().
                    reduce(1, (x, y) -> x * (y + 1));
            indexLoop :
            for (int i = 0; i < capacityMult; i++) {
                int[] caps = new int[M];
                long denominator = capacityMult;
                long numerator = i;
                int currentSum = 0;

                for (int j = 0; j < M; j++) {
                    
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] capacity = {3, 3, 4};
        System.out.println(solution(10, 3, 4, capacity));
    }
}
