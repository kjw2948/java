package baekjoon.dp.nocode;

public class claim {
    static int[] memo;
    static int[] cost = {1, 2, 4, 6, 2,4,6,1};
    public static void main(String[] args) {
        int N = cost.length;
        memo = new int[N+1];
        for (int i = 2; i <= N; i++) {
            memo[i] = Math.min(memo[i-1] + cost[i-1], memo[i-2] + cost[i-2]);
            System.out.println("memo = " + memo[i]);
        }
        System.out.println(memo[N]);
    } // 0 | 0 0 1 2 5 7

}
