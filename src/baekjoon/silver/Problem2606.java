package baekjoon.silver;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem2606 {
    static ArrayList<Integer>[] graph;
    static boolean[] infection;
    static int answer = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //정점 갯수
        int m = sc.nextInt(); //간선 갯수
        graph = new ArrayList[n + 1];
        infection = new boolean[n + 1];
        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<Integer>();
        }

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph[a].add(b);
            graph[b].add(a);
        }
        dfs(1);
        System.out.println(answer);
    }
    public static void dfs(int start) {
        infection[start] = true;
        for (int i = 0; i < graph[start].size(); i++) {
            if(!infection[graph[start].get(i)]) {
                answer++;
                dfs(graph[start].get(i));
            }
        }
    }
}
// ㅁ