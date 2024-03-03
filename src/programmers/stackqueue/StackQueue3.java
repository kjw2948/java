package programmers.stackqueue;

import java.util.Deque;
import java.util.LinkedList;

public class StackQueue3 {
    static boolean solution(String s) {
        Deque<Character> result = new LinkedList<>();
        char[] charArr = s.toCharArray();
        for (int i = 0; i < charArr.length; i++) {
            if (charArr[i] == '(') {
                result.addLast(charArr[i]);
            } else{
                if(result.isEmpty()){
                    return false;
                }
                result.pollLast();
            }
        }
        if(result.isEmpty()){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        String s = ")()(";
        System.out.println(solution(s));
    }
}
