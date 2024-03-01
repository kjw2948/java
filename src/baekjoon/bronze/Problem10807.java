package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Hashtable;

public class Problem10807 {
    public static int solution(int[] arr, int target) {
        Hashtable<Integer, Integer> ht = new Hashtable<>();
        for (int i = 0; i < arr.length; i++) {
            if(target == arr[i]){
                ht.put(i, target);
            }
        }
        return ht.size();
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        //int num = Integer.parseInt(bf.readLine());
        int[] arr = {1, 4, 1, 2, 4, 2, 4, 2, 3, 4, 4};
        int target = Integer.parseInt(bf.readLine());
        System.out.println(solution(arr, target));
    }
}
