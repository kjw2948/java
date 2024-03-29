package baekjoon.twopointer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 실버5
public class Problem11728 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int[] arr1 = new int[a];
        int[] arr2 = new int[b];
        st  = new StringTokenizer(br.readLine());
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = Integer.parseInt(st.nextToken());
        }
        int p1 = 0;
        int p2 = 0;
        while (true) {
            if(p1!=arr1.length && p2!=arr2.length) {
                if (arr1[p1] > arr2[p2]) {
                    sb.append(arr2[p2++] +" ");
                } else if (arr1[p1] == arr2[p2]) {
                    sb.append(arr1[p1++]+" ");
                    sb.append(arr2[p2++]+" ");
                } else {
                    sb.append(arr1[p1++]+" ");
                }
            } else if(p1==arr1.length){
                for (; p2 < arr2.length; p2++) {
                    sb.append(arr2[p2]+" ");
                }
                break;
            }else{
                for (; p1 < arr1.length; p1++) {
                    sb.append(arr1[p1]+" ");
                }
                break;
            }
        }
        System.out.println(sb);
    }
}
