package baekjoon.dp.nocode;

public class Fibo {
    static int[] memo;

    public static void main(String[] args) {
        int N = 45;
        memo = new int[N+1];

        memo[1] = 1;
        memo[2] = 1;
        System.out.println(fibo(N));
        System.out.println(fibo_naive(N));
    }

    static int fibo(int N) {
        if (memo[N] != 0) {
            return memo[N];
        }
        memo[N] = fibo(N - 1) + fibo(N - 2);
        return memo[N];
    }

    static int fibo_naive(int N) {
        if(N==0){
            return 0;
        }
        if (N == 1) {
            return 1;
        }
        return fibo_naive(N - 1) + fibo_naive(N - 2);
    }
}
