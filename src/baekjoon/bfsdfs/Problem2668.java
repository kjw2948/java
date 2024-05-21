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
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        arr = new int[N+1];
        visited = new boolean[N + 1];
        for (int i = 1 ; i < N+1; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        for (int i = 1; i < N+1; i++) {
            visited[i] = true;
            if (arr[i] == i) {
                result.add(i);
            } else{
                int a = arr[i];
                if (arr[a] == i && !visited[a]) {
                    visited[a] = true;
                    result.add(i);
                    result.add(arr[i]);
                }
            }
        }
        Collections.sort(result);
        System.out.println(result.size());
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
    }
}
