package baekjoon.backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem1062 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int K = Integer.parseInt(br.readLine());
        int[] alphabet = new int[26];
        alphabet['a' - 97] ++; //0
        alphabet['n' - 97] ++; // 13
        alphabet['t' - 97] ++; // 19
        alphabet['i' - 97] ++; // 8
        alphabet['c' - 97] ++; // 2

        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            s = s.substring(4, s.length() - 4);

            for (int j = 0; j < s.length(); j++) {
                
            }
        }
    }
}
