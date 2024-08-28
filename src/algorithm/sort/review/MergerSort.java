package algorithm.sort.review;

import java.util.Arrays;

public class MergerSort {
    static int[] arr = {4, 2, 3, 6, 8, 7, 5, 1};
    public static void main(String[] args) {

    }

    public static void mergeSort(int[] arr, int[] result, int left, int right) {
        int[] tmp = new int[arr.length];
        int mid = (left + right) / 2;
        if (left < right) {
            mergeSort(arr,tmp,left, mid);
            mergeSort(arr,tmp,mid+1, right);
            merge(arr, tmp,left, mid, right);
        }
    }

    public static void merge(int[] arr, int[] tmp, int left, int mid,  int right) {
        for (int i = left; i <= right; i++) {
            tmp[i] = arr[i];
        }
        int n1 = left;
        int n2 = mid+1;
        int index = left;

        while (n1 <= mid && n2 <= right) {
            if (tmp[n1] > tmp[n2]) {
                arr[index] = tmp[n2];
                n2++;
            } else {
                arr[index] = tmp[n1];
                n1++;
            }
            index ++;
        }

        for (int i = 0; i <= mid - n1; i++) {
            arr[index + i] = tmp[n1 + i];
        }

    }
}
