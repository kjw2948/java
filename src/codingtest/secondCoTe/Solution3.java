package codingtest.secondCoTe;

import java.util.*;

public class Solution3 {
    public static String solution(String code) {
        String answer = "";
        String str = "";
        Deque<String> queue = new LinkedList<>();
        Deque<Integer> numberQueue = new LinkedList<>();
        for (int i = 0; i < code.length(); i++) {
            if (Character.isDigit(code.charAt(i))) {
                numberQueue.add(code.charAt(i) - '0');
            } else if(code.charAt(i)=='}'){
                while (!queue.peekLast().equals("{")) {
                    str = queue.pollLast() + str;
                }
                queue.pollLast(); // "{" 날리기
                int n = numberQueue.pollLast();
                for (int j = 0; j < n; j++) {
                    answer += str;
                }
                queue.add(answer);
                str = "";
                answer = "";
            } else{
                queue.add(Character.toString(code.charAt(i)));
            }
        }
        while(!queue.isEmpty()){
            answer += queue.pollFirst();
        }
        return answer;
    }
    public static void main(String[] args) {
        String code = "f2{a3{bc}}z";
        System.out.println(solution(code));
    }
}
