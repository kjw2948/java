package algorithm.sort;

import java.util.Arrays;

/*
합병정렬 : 배열을 계속 분할해서 길이가 1이 되도록 만들고, 인접한 부분끼리 정렬하면서 합병하는 방식
복잡도 : O(nlogn) -> 트리구조
분할 후 합병을 위한 n개의 추가 메모리가 필요함
 */
public class MergeSort {
    public static void mergeSort(int[] arr, int[] tmp, int left, int right) {
        if(left<right){
            int mid = (left + right) / 2;
            mergeSort(arr, tmp, left, mid);
            mergeSort(arr, tmp, mid+1, right);
            merge(arr, tmp, left, right, mid);
        }
    }

    public static void merge(int[] arr, int[] tmp, int left, int right, int mid) {
        int p = left;
        int q = mid + 1;
        int index = p;

        while(p <= mid || q <=right){
            if (p <= mid && q <= right) {
                if (arr[p] <= arr[q]) {
                    tmp[index++] = arr[p++];
                }else{
                    tmp[index++] = arr[q++];
                }
            } else if (p <= mid && q > right) {
                tmp[index++] = arr[p++];
            } else{
                tmp[index++] = arr[q++];
            }
        }

        for (int i = left; i <= right; i++) {
            arr[i] = tmp[i];
        }
    }
    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 7, 1, 4, 6};
        int[] tmp = new int[arr.length];
        mergeSort(arr, tmp, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
