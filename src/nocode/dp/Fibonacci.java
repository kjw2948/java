package nocode.dp;

public class Fibonacci {
    static Long[] memo;
    public static Long fibo(int n) {
        if (n == 0 || n == 1) {
            memo[n] = 1L;
            return 1L;
        }
        if (memo[n] == null) {
            return memo[n] = fibo(n - 1) + fibo(n - 2);
        }
        return memo[n];
    }

    public static void main(String[] args) {
        int n = 100;
        memo = new Long[n];
        System.out.println(fibo( n-1));
    }
}
