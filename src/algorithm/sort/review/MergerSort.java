package algorithm.sort.review;

import java.util.Arrays;

public class MergerSort {
    static int[] arr = {4, 2, 3, 6, 8, 7, 5, 1};
    static int[] result = new int[arr.length];
    public static void main(String[] args) {
        mergeSort(arr, 0, arr.length);
    }

    public static void merge(int[] arr, int left, int right) {
        int mid = (left + right) / 2;
        if (right - left > 1) {
            merge(Arrays.copyOfRange(arr, left, mid),left, mid);
            merge(Arrays.copyOfRange(arr, mid, right),mid, right);
        }
        mergeSort(arr, left, right);
    }

    public static void mergeSort(int[] arr, int left, int right) {

    }
}
