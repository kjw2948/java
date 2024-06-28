package baekjoon.dp.nocode;

public class MinSumPath {
    public static void main(String[] args) {
        int[][] cost = {{1, 3, 1, 2}, {3, 4, 5, 2}, {3, 4, 5, 6}, {1, 5, 6, 2}};
        int[][] result = new int[cost.length][cost[0].length];

        for (int i = 0; i < cost.length; i++) {
            for (int j = 0; j < cost[i].length; j++) {
                if (i == 0 ) {
                    if (j == 0) {
                        result[i][j] = cost[i][j];
                    }else {
                        result[i][j] = result[i][j-1] + cost[i][j];
                    }
                } else if (j == 0) {
                    result[i][j] = result[i-1][j] + cost[i][j];
                } else {
                    result[i][j] = Math.min(result[i][j - 1] + cost[i][j], result[i - 1][j] + cost[i][j]);
                }
            }
        }
        System.out.println(result[cost.length-1][cost[0].length-1]);
    }
}
