import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

class Softeer {
    static boolean[][] visited;
    static int[][] arr;
    static int[][] pos = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
    static int count = 0;
    static int N;
    static boolean check;
    static ArrayList<Integer> result = new ArrayList<>();

    public static void dfs(int x, int y) {
        visited[x][y] = true;
        count ++;
        for (int i = 0; i < 4; i++) {
            int cur_x = x + pos[i][0];
            int cur_y = y + pos[i][1];

            if (cur_x >= 0 && cur_y >= 0 && cur_x < N && cur_y < N && !visited[cur_x][cur_y] && arr[cur_x][cur_y] == 1) {
                dfs(cur_x, cur_y);
            }
        }
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        N = Integer.parseInt(br.readLine());
        arr = new int[N][N];
        visited = new boolean[N][N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (!visited[i][j] && arr[i][j] == 1) {
                    dfs(i, j);
                    if (count >= 1) {
                        result.add(count);
                        count = 0;
                    }
                }
            }
        }
        Collections.sort(result);
        System.out.println(result.size());
        for (int i = 0; i < result.size(); i++) {
            if (i == result.size() - 1) {
                System.out.print(result.get(i));
            }else{
                System.out.print(result.get(i) + " ");
            }
        }
    }
}
