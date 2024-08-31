package programmers.dfsbfs;

import java.util.Arrays;

public class Network {
    static boolean[] visit;
    public static int solution(int n, int[][] computers) {
        visit = new boolean[n];
        int answer = 0;
        return answer;
    }

    public static void dfs(int n) {

    }

    public static void main(String[] args) {
        int n = 3;
        int[][] computers = {{1, 1, 0}, {1, 1, 0}, {0, 0, 1}};
        System.out.println(solution(n, computers));

    }

}
