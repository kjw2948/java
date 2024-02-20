package algorithm.sort;

import java.lang.reflect.Array;
import java.util.Arrays;

/* 삽입정렬 : 앞의 데이터를 정렬 해가면서 삽입 위치를 찾아 정렬하는 방식
   복잡도 : O(n^2)
 */
public class InsertSort {
    public static void main(String[] args) {
        int[] arr = {5, 3, 7, 1, 6};
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0 ; j--) {
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j - 1] = temp;
                }else {
                    break;
                }
            }
        }
        Arrays.stream(arr).forEach(System.out::println);
    }
}
