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
        Deque<Character> stack = new ArrayDeque<>();
        Deque<Integer> result = new ArrayDeque<>();

        char[] inputArray = br.readLine().toCharArray();
        int index = 0;
        char check = ' ';
        while (index<inputArray.length) {
            char input = inputArray[index++];
            switch (input){
                case '(', '[' :
                    stack.add(input);
                    break;
                case ')':
                    if(check=='('){
                        
                    }
            }
        }
        System.out.println(result.poll());
    }
}
