package mylibrary.graph;

import java.util.Scanner;

// 깊이 우선 탐색 -> stack을 이용하여 구현
// 1. 인접 행렬 -> 행렬로 정점들 사이의 관계를 표현하는 것
// 2. 인접 리스트 -> 연결되어 있는 정점의 입력번호를 나타냄
public class DfsArray {
    static int edge;
    static int vertex;
    static boolean[] visit;
    static int[][] map;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        edge = sc.nextInt();
        vertex = sc.nextInt();
        map = new int[vertex + 1][vertex + 1];
        visit = new boolean[vertex + 1];

        for (int i = 0; i < edge; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            map[start][end] = 1;
            map[end][start] = 1;
        }

        dfs(1); // 루트 노드
    }
    public static void dfs(int start) {
        visit[start] = true;
        System.out.print(start + " ");

        for (int i = 1; i <= vertex; i++) {
            if(visit[i]==false && map[start][i] == 1){
                dfs(i);
            }
        }
    }
}
