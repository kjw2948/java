package baekjoon.dp.nocode;

public class MinCoinChange {
    public static void main(String[] args) {
        int[] coins = {1, 2, 3, 13, 14, 15, 23, 24, 29};
        int target = 300;

        int[] memo = new int[target+1]; // 1~11
        // m6 m7 m9   -> m4 m3 m1  // m5 m4 m2 // m7 m6 m4

        for (int i = 0; i < coins.length ; i++) {
            memo[coins[i]] = 1;
        }

        for (int i = 1; i < memo.length; i++) {
            int count = 0;
            for (int coin : coins) {
                int num = i - coin;
                if (num < 0 || memo[num] < 0) {
                    count ++;
                    continue;
                }
                if (memo[i] == 0) {
                    memo[i] = memo[num] + 1;
                }else{
                    memo[i] = Math.min(memo[i], memo[num] + 1);
                }
            }
            if(count == coins.length){
                memo[i] = -1;
            }
        }
        System.out.println(memo[memo.length-1]);
    }
}
