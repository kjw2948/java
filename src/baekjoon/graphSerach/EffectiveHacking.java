package baekjoon.graphSerach;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class EffectiveHacking {
    static boolean[] visited;
    static ArrayList<Integer>[] listArr;
    static int[] cntArr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        listArr = new ArrayList[N+1];
        for (int i = 0; i < listArr.length; i++) {
            listArr[i] = new ArrayList<>();
        }

        cntArr = new int[N + 1];
        visited = new boolean[N + 1];

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            listArr[a].add(b);
        }


    }
    public static void bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        visited[start] = true;

        while (!queue.isEmpty()) {
            int n = queue.poll();
            for (int i : listArr[n]) {
                if(!visited[i]){
                    queue.add(i);
                    visited[i] = true;
                    cntArr[i] ++;
                }
            }
        }
    }
}
