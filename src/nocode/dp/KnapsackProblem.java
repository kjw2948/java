package nocode.dp;

public class KnapsackProblem {
    static int[] value = {0, 30, 20, 40, 10};
    static int[] weight = {0,1, 2, 3, 4};
    static int limit = 5;
    public static int knapsack(int n, int w, int total) {
        if (limit <= w) {
            return total;
        }
        return Math.max(knapsack(n - 1, w, total), knapsack(n - 1, w - weight[n], total + value[n]));
    }
    public static void main(String[] args) {
        System.out.println(knapsack(4, 5, 0));

    }
}
