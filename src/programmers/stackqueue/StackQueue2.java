package programmers.stackqueue;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class StackQueue2 {
    public static ArrayList<Integer> solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> answer = new ArrayList<>();
        Deque<Integer> result = new LinkedList<>();
        for (int i = 0; i < progresses.length; i++) {
            int day = 0;
            while(progresses[i]<100){
                progresses[i] += speeds[i];
                day ++;
            }
            result.addLast(day);
        }
        while(!result.isEmpty()){
            int publish = result.pollFirst();
            int count = 1;
            while(!result.isEmpty() && result.peekFirst()<=publish){
                result.pollFirst();
                count ++;
            }
            answer.add(count);
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] progresses = {95, 90, 99, 99, 80, 99};
        int[] speeds = {1, 1, 1, 1, 1, 1};
        System.out.println(solution(progresses, speeds));
    }
}
