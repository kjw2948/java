package baekjoon.recursive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem12919 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String t = br.readLine();
        int result = dfs(s, t);
        System.out.println(result);
    }

    private static int dfs(String s, String t) {
        if (s.length() == t.length()) {
            if (s.equals(t)) {
                return 1;
            } else {
                return 0;
            }
        }
        int num = 0;
        if (t.charAt(0) == 'B') {
            StringBuilder sb = new StringBuilder(t.substring(1));
            String string = sb.reverse().toString();
            num += dfs(s, string);
        }
        if (t.charAt(t.length() - 1) == 'A') {
            num += dfs(s, t.substring(0, t.length()-1));
        }

        return num > 0 ? 1 : 0;
    }

}
