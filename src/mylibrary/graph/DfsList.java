package mylibrary.graph;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DfsList {

    static boolean[] visit;
    static ArrayList<Integer> dfsList = new ArrayList<>();
    static ArrayList<Integer>[] arrayLists;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vertex = sc.nextInt();
        int edge = sc.nextInt();
        int start = sc.nextInt();
        arrayLists = new ArrayList[vertex + 1];
        visit = new boolean[vertex + 1];

        for (int i = 0; i < arrayLists.length; i++) {
            arrayLists[i] = new ArrayList<>();
        }

        for (int i = 0; i < edge; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            arrayLists[x].add(y);
            arrayLists[y].add(x);
        }

        for(int i = 1; i<vertex+1; i++){
            Collections.sort(arrayLists[i]);
        }
        dfs(start);
    }
    static void dfs(int start) {
        if(visit[start]){
            return ;
        }
        visit[start] = true;
        dfsList.add(start);
        for (Integer cost : arrayLists[start]) {
            if(visit[cost]==false){
                dfs(cost);
            }
        }
    }
}
