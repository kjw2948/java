package programmers.stackqueue;


import java.util.Deque;
import java.util.LinkedList;

public class StackQueue1 {
    public static int[] solution(int []arr) {
        Deque<Integer> deque = new LinkedList<>();
        for (int i = 0; i < arr.length; i++) {
            if (deque.isEmpty()) {
                deque.addFirst(arr[i]);
            } else {
                if (deque.peekLast() != arr[i]) {
                    deque.addLast(arr[i]);
                }
            }
        }
        int[] answer = new int[deque.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = deque.pollFirst();
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 3, 3, 3, 3, 0, 0, 1};
        int[] answer = solution(arr);
        for (int i = 0; i < answer.length; i++) {
            System.out.print(answer[i]+ " ");
        }
    }
}
