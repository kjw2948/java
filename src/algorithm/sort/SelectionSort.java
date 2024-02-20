package algorithm.sort;

import java.util.Arrays;

/*
선택정렬 : 최소 또는 최대 값을 찾아서 가장 앞 도는 가장 뒤부터 정렬하는 방식
복잡도 : O(n^2)
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5, 3, 7, 1, 6};
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        Arrays.stream(arr).forEach(System.out::println);
    }
}
