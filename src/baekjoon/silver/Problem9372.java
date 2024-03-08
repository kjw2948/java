package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Problem9372 {
    public static int bfs(ArrayList<Integer>[] airplane, boolean[] visit) {
        Queue<Integer> queue = new LinkedList<>();
        int answer = 0;
        queue.add(airplane[1].get(0));
        visit[airplane[1].get(0)] = true;
        while (!queue.isEmpty()) {
            int cur = queue.poll();
            for (int i : airplane[cur]) {
                if(visit[i]){
                    continue;
                }
                queue.add(i);
                visit[i] = true;
                answer ++;
            }
        }
        return answer;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(bf.readLine());
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(bf.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            ArrayList<Integer>[] airplane = new ArrayList[N + 1];
            for (int j = 1; j <= N; j++) {
                airplane[j] = new ArrayList<>();
            }
            boolean[] visit = new boolean[N + 1];
            int answer = 0;
            for (int j = 0; j < M; j++) {
                st = new StringTokenizer(bf.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                airplane[a].add(b);
                airplane[b].add(a);
            }
            System.out.println(bfs(airplane, visit));
        }
    }
}
