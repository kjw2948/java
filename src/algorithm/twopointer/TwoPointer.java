package algorithm.twopointer;

import java.util.Arrays;

public class TwoPointer {
    public static int[] twoPointer(int[] arr, int target){
        int[] result = {-1, -1};
        int p1 = 0;
        int p2 = 0;
        int sum = 0;
        while(true){
            if(sum > target){
                sum -= arr[p1++];
            } else if (p2 == arr.length) {
                break;
            } else{
                sum += arr[p2++];
            }
            if(sum == target){
                result[0] = p1;
                result[1] = p2-1;
                break;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 3, 7, 2, 4, 3, 2};
        int target = 9;
        System.out.println(Arrays.toString(twoPointer(arr, target)));
    }
}
