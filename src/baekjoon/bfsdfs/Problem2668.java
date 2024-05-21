package baekjoon.bfsdfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Problem2668 {
    static ArrayList<Integer> result = new ArrayList<>();
    static boolean[] visited;
    static int[] arr;
    static int target;
    static ArrayList<Integer> subResult = new ArrayList<>();

    public static void dfs(int start) {
        int a = arr[start];
        if (a == target) {
            result.add(target);
        }
        if (!visited[a]) {
            visited[a] = true;
            dfs(a);
            visited[a] = false;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        arr = new int[N+1];
        visited = new boolean[N + 1];
        for (int i = 1 ; i < N+1; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        for (int i = 1; i < N+1; i++) {
            if(!visited[i]){
                visited[i] = true;
                target = i;
                dfs(i);
                visited[i] = false;
            }

        }
        Collections.sort(result);
        System.out.println(result.size());
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
    }
}
