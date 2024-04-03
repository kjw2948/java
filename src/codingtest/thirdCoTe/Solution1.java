package codingtest.thirdCoTe;

import java.util.HashMap;

public class Solution1 {
    public static int solution(int N, int[][] trust) {
        int[] a = new int[N+1];
        int[] b = new int[N+1];
        for (int i = 0; i < trust.length; i++) {
            a[trust[i][0]]++;
            b[trust[i][1]]++;
        }
        for (int i = 1; i <= N; i++) {
            if(a[i]==0 && b[i]==N-1){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[][] arr = {{1, 2}, {1, 4}, {1, 3}, {2, 1}, {4, 3}, {2,3}};
        int[][] arr1 ={{1,3},{2,3}};

        System.out.println(solution(3, arr1));

    }
}
