package baekjoon.bfsdfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Problem1068 {

    static ArrayList<Integer>[] tree;
    static int delete;
    static int count;
    public static void dfs(int start) {
        for (int i = 0; i < tree[start].size(); i++) {
            int cur = tree[start].get(i);
            if (cur != delete && tree[cur].isEmpty()) {
                count ++;
            }else if(cur != delete && !tree[cur].isEmpty()){
                dfs(cur);
            }
            else if(cur == delete && tree[start].size() == 1){
                count ++;
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int parent = 0;
        count = 0;
        tree = new ArrayList[N];
        for (int i = 0; i < N; i++) {
            tree[i] = new ArrayList<>();
        }
        StringTokenizer st = new StringTokenizer(br.readLine());
        int num = 0;
        while (st.hasMoreTokens()) {
            int index = Integer.parseInt(st.nextToken());
            if (index == -1) {
                parent = num;
                num ++;
            }else{
                tree[index].add(num++);
            }
        }
        delete = Integer.parseInt(br.readLine());
        tree[delete].clear();
        if(delete == parent){
            System.out.println(0);
            return;
        }
        dfs(parent);
        System.out.println(count);
    }
}
