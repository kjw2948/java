package baekjoon.implementation;

import java.io.*;

public class Problem16719 {
    static StringBuilder sb= new StringBuilder();
    static String word;
    static boolean [] appear;
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        word = br.readLine();

        appear = new boolean[word.length()];
        zoac(0, word.length() - 1);
        System.out.println(sb);


    }
    public static void zoac(int left, int right) {
        if (left > right) {
            return;
        }

        int idx = left;
        for (int i = left; i <= right; i++) {
            if (word.charAt(idx) > word.charAt(i)) {
                idx = i;
            }
        }
        appear[idx] = true;

        for (int i = 0; i < word.length(); i++) {
            if (appear[i]) {
                sb.append(word.charAt(i));
            }
        }
        sb.append("\n");
        zoac(idx + 1, right);
        zoac(left, idx - 1);
    }
}