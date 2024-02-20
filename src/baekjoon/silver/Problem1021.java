package baekjoon.silver;

import java.util.LinkedList;
import java.util.Scanner;

public class Problem1021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int front = 0;
        int result = 0;
        LinkedList queue = new LinkedList();
        int[] arr = new int[M];
        for (int i = 0; i < M; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < N; i++) {
            queue.add(i + 1);
        }
        for (int i = 0; i < M; i++) {
            int idx = queue.indexOf(arr[i]);
            if ((idx + queue.size() - front) % queue.size() <= queue.size() - (idx + queue.size() - front) % queue.size()) {
                result += (idx + queue.size() - front) % queue.size();
                queue.remove(idx);
                front = idx;
            }
            else{
                result +=  queue.size() - (idx + queue.size() - front) % queue.size();
                queue.remove(idx);
                front = idx;
            }
        }
        System.out.println(result);
    }
}
