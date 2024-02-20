package algorithm.sort;

import java.util.Arrays;

/* 버블정렬 : 인접한 데이터를 비교하며 자리 바꾸는 방식
   시간 복잡도 : O(n^2)
 */
public class BubbleSort {
    public static void swap(int x, int y){
        int temp = x;
        x = y;
        y = temp;
    }
    public static void main(String[] args) {
        int[] arr = {5, 3, 1, 7, 6};
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i; j++) {
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        Arrays.stream(arr).forEach(System.out::println);
    }
}
