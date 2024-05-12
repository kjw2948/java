package baekjoon.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Problem2504 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Deque<String> stack = new ArrayDeque<>();
        Deque<Integer> result = new ArrayDeque<>();

        while (st.hasMoreTokens()) {
            String input = st.nextToken();
            switch (input) {
                case "(" :
                    stack.add(input);
                    break;
                case ")":
                    String output = stack.poll();
                    if (output.equals("(")) {
                        stack.poll();

                    }

            }
        }
    }
}
