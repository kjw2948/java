package codingtest.secondCoTe;

import java.util.Deque;
import java.util.LinkedList;

public class Solution4 {
    public static int solution(int delay, int capacity, int[] times) {
        int answer = 0;
        Deque<Integer> queue = new LinkedList<>();
        int sum = 0;
        for (int i = 0; i < times.length; i++) {
            sum += times[i];
            while(sum>=delay){
                sum -= delay;
                queue.poll();
            }

            if(queue.size()<capacity){
                queue.add(i);
                continue;
            }
            queue.poll();
            answer++;
        }
        return answer;
    }
    public static void main(String[] args) {
        int[] times = {3, 2, 0, 0, 2, 3, 0, 0, 2, 2, 5};
        int delay = 5;
        int capacity = 5;
        System.out.println(solution(delay, capacity, times));
    }
}
