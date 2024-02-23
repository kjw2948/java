package baekjoon.silver;
import java.io.*;
public class Problem2751 {
    static int[] sorted = new int[1000000];
    static int[] merge(int[] arr, int left, int mid, int right) {
        int p = left; // 왼쪽 배열의 시작 index
        int q = mid + 1; // 오른쪽 배열의 시작 index
        int idx = p; // merge 결과 배열의 index

        while (p <= mid && q <= right) {
            if (arr[p] <= arr[q]) {
                sorted[idx++] = arr[p++];
            } else {
                sorted[idx++] = arr[q++];
            }
        }

        if (p > mid) {
            for (int i = q; i <= right; i++) {
                sorted[idx++] = arr[i];
            }
        } else {
            for (int i = p; i <= mid; i++) {
                sorted[idx++] = arr[i];
            }
        }

        // 원래 배열에 복사
        for (int i = left; i <= right; i++) {
            arr[i] = sorted[i];
        }

        return arr;

    }

    static int[] mergeSort(int[] arr, int left, int right) {
        int mid;
        if (arr.length == 1) {
            return arr;
        }

        if (left < right) {
            mid = (left + right) / 2;
            arr = mergeSort(arr, left, mid);
            arr = mergeSort(arr, mid + 1, right);
            arr = merge(arr, left, mid, right);
        }

        return arr;
    }
    public static void main(String[] args) throws NumberFormatException,IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        // merge sort
        mergeSort(arr, 0, N - 1);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < arr.length; i++) {
            bw.write(Integer.toString(arr[i]) + "\n");

        }
        bw.close();
    }
}
