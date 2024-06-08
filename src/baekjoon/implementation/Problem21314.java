package baekjoon.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class Problem21314 {
    static Deque<Character> dequeMax;
    static Deque<Character> dequeMin;
    static String max = "";
    static String min = "";
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String mk = br.readLine();

        char[] mkArray = mk.toCharArray();
        dequeMax = new LinkedList<>();
        dequeMin = new LinkedList<>();
        // max : k 나오면 지금까지 나온거에 K까지 합쳐서 계산
        // min : k 나오면 지금까지 나온 M들만 계산 후 K는 단독

        for (int i = 0; i < mkArray.length; i++) {
            char letter = mkArray[i];
            if (letter == 'M') {
                dequeMax.addLast(letter);
                dequeMin.addLast(letter);
                if (i == mkArray.length - 1) {
                    lastM();
                }
            } else {
                calMax();
                calMin();
            }
        }
        System.out.println(max);
        System.out.println(min);
    }

    private static void lastM() {
        String str = "1";
        max += "1";
        dequeMax.pop();
        while (!dequeMax.isEmpty()) {
            str += "0";
            max += "1";
            dequeMax.pop();
        }
        min += str;
    }

    private static void calMax() {
        String str = "";
        while (!dequeMax.isEmpty()) {
            dequeMax.pop();
            str += "0";
        }
        str = "5" + str;
        max += str;
    }

    private static void calMin() {
        String str = "1";
        if (dequeMin.isEmpty()) {
            min += "5";
            return;
        }
        dequeMin.pop();
        while (!dequeMin.isEmpty()) {
            dequeMin.pop();
            str += "0";
        }
        str += "5";
        min += str;
    }
}
