package baekjoon.recursive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem18511 {
    static int max = 0;
    static int[] K;
    static int N;
    static int len;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        String a = Integer.toString(N);
        len = a.length();
        int start = a.charAt(0) - '0'; // 시작 숫자

        int size = Integer.parseInt(st.nextToken());
        K = new int[size];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < size; i++) {
            K[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < size; i++) {
                bigNumber(1, 0, K[i]);

        }
        System.out.println(max);
    }

    private static void bigNumber(int length, int cur, int num) {
        cur = cur*10 + num;
        if(cur <= N) {
            max = Math.max(cur, max);
        }
        if (length == len) {
            return;
        }


        for (int i = 0; i < K.length; i++) {
            bigNumber(length+1, cur, K[i]);
        }

    }
}
