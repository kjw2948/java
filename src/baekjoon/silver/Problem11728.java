package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 투포인터
public class Problem11728 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr1 = new int[N];
        int[] arr2 = new int[M];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr1[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            arr2[i] = Integer.parseInt(st.nextToken());
        }
        int p1 = 0, p2 = 0;
        while(true){
            if (arr1[p1] > arr2[p2]) {
                sb.append(arr2[p2++]).append(" ");
            } else if (arr1[p1] < arr2[p2]) {
                sb.append(arr1[p1++]).append(" ");
            } else{
                sb.append(arr1[p1++]).append(" ");
                sb.append(arr2[p2++]).append(" ");
            }

            if(p1==N){
                for (int i = p2; i < M; i++) {
                    sb.append(arr2[i]).append(" ");
                }
                break;
            }
            if (p2 == M) {
                for (int i = p1; i < N; i++) {
                    sb.append(arr1[i]).append(" ");
                }
                break;
            }
        }
        System.out.println(sb);
    }
}
