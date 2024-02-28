package baekjoon.gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Problem2830 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int answer = 0;
        int count = 0;
        int N = Integer.parseInt(bf.readLine());
        ArrayList list = new ArrayList();
        for (int i = 0; i < N; i++) {
            list.add(Integer.toBinaryString(Integer.parseInt(bf.readLine())));
        }

    }
}
