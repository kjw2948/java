package eyelevel.dfsbfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Day7_27737 {
    static boolean[][] visit;
    static int[][] arr;
    static int n,m,k;
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        arr = new int[n][n];
        visit = new boolean[n][n];

        for(int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }



        int cnt=0;
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                if(arr[i][j]==0 && !visit[i][j]) {
                    int region = dfs(i,j);
                    cnt+=(region+k-1)/k;
                }

            }
        }
        if(cnt==0) {
            System.out.println("IMPOSSIBLE");
        }
        else {
            if(cnt<=m) {
                System.out.println("POSSIBLE");
                System.out.println(m-cnt);
            }
            else {
                System.out.println("IMPOSSIBLE");
            }
        }


    }


    private static int dfs(int x, int y) {

        visit[x][y] = true;
        int size = 1;


        for(int i=0; i<4; i++) {
            int nx = x+dx[i];
            int ny = y+dy[i];

            if (nx >= 0 && ny >= 0 && nx < n && ny < n && arr[nx][ny] == 0 && !visit[nx][ny]) {
                size += dfs(nx,ny);
            }


        }
        return size;
    }
}

