package baekjoon.bfsdfs;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Problem13023 {
    static int N, M;
    static boolean[] visited;
    static int result = 0;
    static ArrayList<Integer>[] students;

    public static void dfs(int start, int count) {
        if(count == 5){
            result = 1;
            return;
        }
        if (students[start].isEmpty()) {
            return;
        }
        visited[start] = true;
        for (int student : students[start]) {
            if (!visited[student]) {
                dfs(student, count+1);
            }
        }
        visited[start] = false;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        students = new ArrayList[N];
        visited = new boolean[N];
        if (M < 4) {
            System.out.println(0);
            return;
        }
        for (int i = 0; i < N; i++) {
            students[i] = new ArrayList<>();
        }
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            students[a].add(b);
            students[b].add(a);
        }
        for (int i = 0; i < N; i++) {
            if(result==1){
                System.out.println(1);
                return;
            }else{
                dfs(i, 1);
            }
        }
        System.out.println(0);
    }
}








/*

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Problem13023 {
    static int N, M;
    static boolean[] visited;
    static int result = 0;
    static ArrayList<Integer>[] students;

    public static void dfs(int start, int count) {
        if (students[start].isEmpty()) {
            return;
        }
        visited[start] = true;
        for (int student : students[start]) {
            if (!visited[student]) {
                dfs(student, count+1);
                if (count == 5) {
                    result = 1;
                    return;
                }
            }
        }
        visited[start] = false;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        students = new ArrayList[N];
        visited = new boolean[N];
        if (M < 4) {
            System.out.println(0);
            return;
        }
        for (int i = 0; i < N; i++) {
            students[i] = new ArrayList<>();
        }
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            students[a].add(b);
            students[b].add(a);
        }
        for (int i = 0; i < N; i++) {
            if(result==1){
                System.out.println(1);
                return;
            }else{
                dfs(i, 1);
            }
        }
        System.out.println(0);
    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Problem13023 {
    static int N, M;
    static boolean[] visited;
    static int result = 0;
    static ArrayList<Integer>[] students;

    public static void dfs(int start) {
        if(result == 4){
            return;
        }
        if (students[start].isEmpty()) {
            return;
        }
        visited[start] = true;
        for (int student : students[start]) {
            if (!visited[student]) {
                result ++;
                dfs(student);
                result --;
            }
        }
        visited[start] = false;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        students = new ArrayList[N];
        visited = new boolean[N];
        if (M < 4) {
            System.out.println(0);
            return;
        }
        for (int i = 0; i < N; i++) {
            students[i] = new ArrayList<>();
        }
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            students[a].add(b);
            students[b].add(a);
        }
        for (int i = 0; i < N; i++) {
            if(result==4){
                System.out.println(1);
                return;
            }else{
                dfs(i);
            }
        }
        System.out.println(0);
    }
}

 */

