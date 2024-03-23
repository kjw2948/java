package programmers.kakao;

import java.util.Deque;
import java.util.LinkedList;

// 점수 , 보너스 , 옵션 순의 문자열   S D T  , *(이전 점수, 지금 점수 2배) # (점수 빼기) 중첩 가능
public class Dart {
    public static int solution(String dartResult) {
        Deque<Integer> score = new LinkedList<>();
        boolean checkDigit = false;
        char[] dart = dartResult.toCharArray();
        int answer = 0;
        for (int i = 0; i < dart.length; i++) {
            if(Character.isDigit(dart[i])){
                if(checkDigit){
                    int num = score.pollLast()*10 + Character.getNumericValue(dart[i]);
                    score.addLast(num);
                    continue;
                }
                score.addLast(Character.getNumericValue(dart[i]));
                checkDigit = true;
            } else if (dart[i]=='S') {
                checkDigit = false;
            } else if (dart[i] == 'D') {
                int num = score.pollLast();
                score.addLast(num * num);
                checkDigit = false;
            } else if (dart[i] == 'T') {
                int num = score.pollLast();
                score.addLast(num * num * num);
                checkDigit = false;
            } else if (dart[i] == '*') {
                int num = score.pollLast() * 2;
                if (score.isEmpty()) {
                    score.addLast(num);
                    checkDigit = false;
                    continue;
                }
                int num2 = score.pollLast() * 2;
                score.addLast(num2);
                score.addLast(num);
                checkDigit = false;
            } else {
                int num = score.pollLast() * (-1);
                score.addLast(num);
                checkDigit = false;
            }
        }
        while (!score.isEmpty()) {
            answer += score.poll();
        }

        return answer;
    }

    public static void main(String[] args) {
        String dart = "10S*10S*10S*";
        System.out.println(solution(dart));
    }
}
