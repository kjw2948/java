package baekjoon.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Problem1158 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            list.add(i);
        }

        String answer = "<";
        int index = -1+K;
        while (list.size()!=1) {
            String a = Integer.toString(list.get(index));
            list.remove(index);

            index += K-1;
            index %= --N;
            answer += a + ", ";
        }
        String a = Integer.toString(list.getFirst());
        answer += a + ">";

        System.out.println(answer);
    }
}
