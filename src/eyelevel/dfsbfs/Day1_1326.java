package eyelevel.dfsbfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Day1_1326 {
    static boolean[] visit;
    static int[] arr;
    static int a, b, N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        arr = new int[N + 1];
        visit = new boolean[N + 1];


        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());


        if (a == b) {
            System.out.println(0);
        } else {
            System.out.println(bfs());
        }


    }

    private static int bfs() {
        Queue<int[]> q = new ArrayDeque<>();
        q.add(new int[]{a, 0});

        visit[a] = true;

        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int num = arr[cur[0]];
            int next = cur[0];

            // 순방향
            while (true) {
                next += num;
                if (next > N) break;
                if (visit[next]) continue;
                visit[next] = true;

                if (next == b) {
                    return cur[1] + 1;
                }

                q.add(new int[]{next, cur[1] + 1});
            }

            next = cur[0];
            // 역방향
            while (true) {
                next -= num;
                if (next < 1) break;
                if (visit[next]) continue;
                visit[next] = true;

                if (next == b) {
                    return cur[1] + 1;
                }

                q.add(new int[]{next, cur[1] + 1});
            }

        }
        return -1;

    }
}
    /*
    static boolean[] visit;
    static int[] bridge;
    static int a, b, N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        bridge = new int[N+1];
        visit = new boolean[N+1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            bridge[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());

        if (a == b) {
            System.out.println(0);
        }
        if (a < b) {
            System.out.println(bfs());
        }
        if (a > b) {
            System.out.println(negativeBfs());
        }

    }

    private static int bfs() {
        Queue<int[]> q = new ArrayDeque<>();
        q.add(new int[] {a,0});
        //시작 지점 방문 처리
        visit[a] = true;

        while(!q.isEmpty()) {
            int[] cur = q.poll();
            int num = bridge[cur[0]]; //현재 징검다리에서 점프할 수 있는 거리
            int next = cur[0]; //현재 위치

            // 순방향
            while(true) {
                next+=num; //점프거리 더해서 다음 위치 계산
                if(next > N) break; //배열 범위 벗어나면 종료
                if(visit[next]) continue;
                visit[next] = true;

                if(next == b) {
                    return cur[1] + 1;
                }

                q.add(new int[] {next, cur[1]+1});
            }

            next = cur[0];
            // 역방향
            while(true) {
                next-=num; //점프거리 더해서 다음 위치 계산
                if(next < 1) break; //배열 범위 벗어나면 종료
                if(visit[next]) continue;
                visit[next] = true;

                if(next == b) {
                    return cur[1] + 1;
                }

                q.add(new int[] {next, cur[1]+1});
            }

        }
        return -1;

    }
    static int negativeBfs () {
            Queue<int[]> q = new ArrayDeque<>();
            q.add(new int[]{a, 0});
            //시작 지점 방문 처리
            visit[a] = true;

            while (!q.isEmpty()) {
                int[] cur = q.poll();
                int num = bridge[cur[0]]; //현재 징검다리에서 점프할 수 있는 거리
                int next = cur[0]; //현재 위치

                while (true) {
                    next-=num; //점프거리 더해서 다음 위치 계산
                    if(next < 1) break; //배열 범위 벗어나면 종료
                    if(visit[next]) continue;
                    visit[next] = true;

                    if(next == b) {
                        return cur[1] + 1;
                    }

                    q.add(new int[] {next, cur[1]+1});
                }
            }

            return -1;
        }

     */
