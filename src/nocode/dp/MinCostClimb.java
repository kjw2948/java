package nocode.dp;
//leet 746
public class MinCostClimb {
    static int[] cost;
    static int[] memo;
    public static int climb(int n) {
        if (n == 1 || n == 2) {
            return memo[n] = cost[n-1];
        }
        if (memo[n] != 0) {
            return memo[n];
        }
        return memo[n] = Math.min(climb(n-1) + cost[n-1], climb(n-2) + cost[n - 2]);
    }
    public static void main(String[] args) {
        int n = 3;
        memo = new int[n+1];
        cost = new int[]{10, 15, 20};
        climb(n);
        System.out.println(memo[n]);
    }
}
