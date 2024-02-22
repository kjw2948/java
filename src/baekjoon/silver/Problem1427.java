package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Problem1427 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        List<Integer> list = new ArrayList<>();
        int N = Integer.parseInt(bf.readLine());
        int[] count = new int[10];

        while(N>0){
            list.add(N%10);
            count[N%10]++;
            N/=10;
        }
        int[] result = new int[list.size()];
        for (int i = count.length-1; i >= 0; i--) {
            while(count[i]>0){
                sb.append(i);
                count[i]--;
            }
        }
        System.out.println(sb);
    }
}
