package baekjoon.bronze;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//계수정렬
public class Problem10989 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        int[] arr = new int[N];
        int[] result = new int[N];
        int[] num_arr = new int[10001];
        // step1. arr배열에 나타난 값의 개수 세기
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(bf.readLine());
            num_arr[arr[i]]++;
        }
        // step2. num_arr 배열 누적합으로 바꾸기
        for (int i = 1; i < num_arr.length; i++) {
            num_arr[i] += num_arr[i - 1];
        }
        // step3. result 구하기
        for (int i = arr.length-1; i >= 0; i--) {
            int index = --num_arr[arr[i]];
            result[index] = arr[i];
        }

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}

