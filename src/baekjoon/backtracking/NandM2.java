package baekjoon.backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NandM2 {
    static boolean[] visit;
    static int[] arr;
    public static void solution(int N, int M, int depth) {
        if(depth==M){
            for (int i = 0; i < M; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println("");
            return;
        }
        for (int i = 0; i < N; i++) {
            if(visit[i]==false && depth == 0){
                visit[i] = true;
                arr[depth] = i+1;
                solution(N, M, depth+1);
                visit[i] = false;
            } else if(visit[i] == false && arr[depth-1]<i+1){
                visit[i] = true;
                arr[depth] = i+1;
                solution(N,M,depth+1);
                visit[i] = false;
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        visit = new boolean[N];
        arr = new int[M];
        solution(N,M,0);
    }
}
