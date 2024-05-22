package baekjoon.backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Problem1174 {
    static int[] nums = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
    static ArrayList<Long> list = new ArrayList<>();
    public static void dfs(long num, int idx) {
        if (!list.contains(num)) {
            list.add(num);
        }

        if (idx >= 10) {
            return;
        }

        dfs(num * 10 + nums[idx], idx + 1);
        dfs(num , idx + 1);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        dfs(0, 0);
        Collections.sort(list);

        if (N-1 > list.size()) {
            System.out.println(-1);
        } else {
            System.out.println(list.get(N-1));
        }

    }
}
