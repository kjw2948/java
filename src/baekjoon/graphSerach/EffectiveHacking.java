package baekjoon.graphSerach;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class EffectiveHacking {
    static boolean[] visit;
    static ArrayList<Integer>[] list;
    static int[] cntArr;
    static int max;
    public static void bfs(int idx) {
        Queue<Integer> queue = new ArrayDeque<>();
        visit[idx] = true;
        queue.add(idx);
        while (!queue.isEmpty()) {
            int a = queue.poll();
            for (Integer i : list[a]) {
                if(visit[i]) continue;
                queue.add(i);
                visit[i] = true;
                cntArr[i] ++;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        list = new ArrayList[N+1];
        cntArr = new int[N + 1];
        for (int i = 0; i < N+1; i++) {
            list[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            list[A].add(B);
        }
        for (int i = 1; i <= N; i++) {
            visit = new boolean[N+1];
            bfs(i);
        }

        for (int i=1; i<N+1; i++) {
            if (max<cntArr[i]) max = cntArr[i];
        }

        // 최댓값인 컴퓨터 출력
        for (int i=1; i<N+1; i++) if (max == cntArr[i]) System.out.print(i+" ");
    }

}
