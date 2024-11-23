package eyelevel.dfsbfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Day1_1326 {
    static int[] visit;
    static int[] arr;
    static int a, b, N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        arr = new int[N + 1];
        visit = new int[N + 1];


        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            visit[i] = -1;
        }

        st = new StringTokenizer(br.readLine());
        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());
        visit[a] ++;

        if (a == b) {
            System.out.println(0);
        } else {
            System.out.println(bfs());
        }
    }
    static int bfs() {
        Queue<int[]> queue = new ArrayDeque<>();  // (인덱스, 반복해서 저장되는 값)
        queue.add(new int[]{a, visit[a]}); // 현재위치, 이동횟수
        int next = 0;


        while (!queue.isEmpty()) {
            int[] nums = queue.poll();
            int cur = nums[0];
            int move = nums[1];

            // 역방향
            next = cur - arr[cur];
            while (true) {
                if (next <= 0 || visit[next] != -1) {
                    break;
                }
                if (visit[next] == -1) {
                    visit[next] = move + 1;
                    queue.add(new int[]{next, visit[next]});
                    next -= arr[cur];
                }
                if (next == b) {
                    return move + 1;
                }
            }
            // 순방향
            next = cur + arr[cur];
            while (true) {
                if (next > N) {
                    break;
                }
                if (visit[next] != -1) {
                    continue;
                }

                if (visit[next] == -1) {
                    visit[next] = move + 1;
                    queue.add(new int[]{next, visit[next]});
                    next += arr[cur];
                }
                if (next == b) {
                    return move+1;
                }
            }
        }
        return visit[b];
    }
}


