package baekjoon.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Problem16719 {
    static List<Integer>[] arr; //
    static Map<Integer, Character> map = new HashMap<>(); // 입력 문자열에서 위치, 해당 위치의 값

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();


        //bac => 1 0 2 // 1 0 2 // a b c
        for (int i = 0; i < str.length(); i++) {
            char a = str.charAt(i);
            int idx = a - 'a'; // 알파벳 인덱스

            map.put(i, a);
        }
    }
}
