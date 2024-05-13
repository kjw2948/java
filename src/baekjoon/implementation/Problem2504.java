package baekjoon.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Problem2504 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Deque<Character> stack = new ArrayDeque<>();

        int result = 0 ;
        int value = 1;

        char[] inputArray = br.readLine().toCharArray();
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] == '(') {
                stack.add(inputArray[i]);
                value *= 2;
            } else if (inputArray[i] == '[') {
                stack.add(inputArray[i]);
                value *= 3;
            } else if (inputArray[i] == ')') {
                if (stack.isEmpty() || stack.peekLast() != '(') {
                    System.out.println(0);
                    return;
                }
                if (inputArray[i - 1] == '(') {
                    result += value;
                }
                stack.pollLast();
                value /= 2;
            } else if (inputArray[i] == ']') {
                if (stack.isEmpty() || stack.peekLast() != '[') {
                    System.out.println(0);
                    return;
                }
                if (inputArray[i - 1] == '[') {
                    result += value;
                }
                stack.pollLast();
                value /= 3;
            }
        }


        if (!stack.isEmpty()) {
            System.out.println(0);
            return;
        }
        System.out.println(result);
    }
}
