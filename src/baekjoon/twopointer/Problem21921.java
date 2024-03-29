package baekjoon.twopointer;
// 실버3
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem21921 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        int p1 = 0;
        int count = 1;
        int sum = 0;
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            if(i<K){
                sum += arr[i];
            }
        }
        int max = sum;
        for (int i = K; i < N; i++) {
            sum -= arr[p1++];
            sum += arr[i];
            if(sum>max){
                max = sum;
                count = 1;
            }else if(sum==max){
                count ++;
            }
        }
        if(max==0){
            System.out.println("SAD");
        }else{
            System.out.println(max);
            System.out.println(count);
        }
    }
}
