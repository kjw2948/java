package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Problem1920 {
    public static int[] tmp;
    public static int binarySearch(int[] arr, int target, int left, int right) {
        if(left > right){
            return -1;
        }
        int mid = left + (right - left) / 2;
        if(arr[mid]==target){
            return mid;
        } else if (arr[mid] > target) {
            return binarySearch(arr, target, left, mid-1);
        } else {
            return binarySearch(arr, target, mid+1, right);
        }
    }
    public static void mergeSort(int[] arr,int[] tmp, int left, int right){
        if(left<right){
            int mid = (left + right) / 2;
            mergeSort(arr, tmp,left, mid);
            mergeSort(arr,tmp, mid+1, right);
            merge(arr, tmp, left, right, mid);
        }
    }
    public static void merge(int[] arr, int[] tmp, int left, int right, int mid) {
        int p = left;
        int q = mid + 1;
        int idx = p;

        while(p <= mid && q <= right){
            if (arr[p] <= arr[q]) {
                tmp[idx++] = arr[p++];
            }else{
                tmp[idx++] = arr[q++];
            }
        }
        if (p > mid) {
            for (int i = q; i <= right; i++) {
                tmp[idx++] = arr[i];
            }
        } else{
            for (int i = p; i <= mid ; i++) {
                tmp[idx++] = arr[i];
            }
        }
        for (int i = left; i <= right; i++) {
            arr[i] = tmp[i];
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(bf.readLine());
        }

        int M = Integer.parseInt(bf.readLine());
        int[] B = new int[M];
        for (int i = 0; i < M; i++) {
            B[i] = Integer.parseInt(bf.readLine());
        }


        int[] tmpA = new int[N];
        mergeSort(A, tmpA,0, A.length-1);

        int[] tmpB = new int[M];
        mergeSort(B, tmpB,0, B.length-1);

        for (int i = 0; i < M; i++) {
            int check = binarySearch(A, B[i], 0, A.length-1);
            /*
            if(check!=-1){
                System.out.println(1);
            }else{
                System.out.println(0);
            }
            */
            System.out.println(check);
        }

    }
}
