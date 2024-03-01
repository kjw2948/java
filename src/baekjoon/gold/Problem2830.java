package baekjoon.gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Problem2830 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        long answer = 0;
        int idx = 0;
        int N = Integer.parseInt(bf.readLine());
        int[] saveOne = new int[20]; // 1갯수 저장
        ArrayList<Integer> list = new ArrayList();
        for (int i = 0; i < N; i++) {
            list.add(Integer.parseInt(bf.readLine()));
        }
        // 1갯수 저장
        while(true) {
            int sum = 0;
            for (int i=0; i<list.size(); i++) {
                if (list.get(i) % 2 == 1) {
                    saveOne[idx] ++;
                }
                sum += list.get(i);
                list.set(i, list.get(i) / 2);
            }
            if(sum==0){
                break;
            }
            idx++;
        }
        for (int i = 0; i < 20; i++) {
            answer += (long) saveOne[i]*(N-saveOne[i])<<i;
        }
        System.out.println(answer);
    }
}
