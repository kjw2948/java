package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Problem11725 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bf.readLine());
        ArrayList<Integer>[] adj = new ArrayList[num+1];
        for (int i = 1; i < adj.length; i++) {
            adj[i] = new ArrayList<>();
        }
        int[] parent = new int[num + 1];
        StringTokenizer st;
        boolean[] visit = new boolean[num + 1];
        for (int i = 1; i < num; i++) {
            st = new StringTokenizer(bf.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            adj[a].add(b);
            adj[b].add(a);
        }
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        visit[1] = true;
        while (!queue.isEmpty()) {
            int cur = queue.poll();
            for (int i : adj[cur]) {
                if(visit[i]){
                    continue;
                }
                visit[i] = true;
                queue.add(i);
                parent[i] = cur;
            }
        }
        for (int i = 2; i <= num; i++) {
            System.out.println(parent[i]);
        }
    }
}
