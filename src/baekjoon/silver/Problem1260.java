package baekjoon.silver;

import java.util.*;

public class Problem1260 {
    static ArrayList<Integer>[] graph;
    static boolean[] dfs_visit;
    static boolean[] bfs_visit;
    static Queue<Integer> queue;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int start = sc.nextInt();
        graph = new ArrayList[n + 1];
        queue = new LinkedList<>();
        dfs_visit = new boolean[n+1];
        bfs_visit = new boolean[n+1];

        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph[a].add(b);
            graph[b].add(a);
        }
        for (int i = 1; i <= n; i++) {
            Collections.sort(graph[i]);
        }
        dfs(start);
        System.out.println("");
        bfs(start);
    }

    static void dfs(int start) {
        dfs_visit[start] = true;
        System.out.print(start + " ");
        for (Integer integer : graph[start]) {
            if (!dfs_visit[integer]) {
                dfs(integer);
            }
        }
    }
    static void bfs(int start) {
        bfs_visit[start] = true;
        queue.add(start);
        while (!queue.isEmpty()) {
            int c = queue.poll();
            System.out.print(c +" ");
            for (Integer integer : graph[c]) {
                if (!bfs_visit[integer]) {
                    bfs_visit[integer] = true;
                    queue.add(integer);
                }
            }
        }
    }
}
