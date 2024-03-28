package algorithm.twopointer;

import java.util.ArrayList;
import java.util.Arrays;

public class TwoPointer {
    public static int[] twoPointer(int[] arr, int target){
        ArrayList<Integer> answer = new ArrayList<>();
        int start = 0;
        int end = 0;
        int sum = 0;
        while(true){
            if(sum<target){
                sum += arr[start];
                answer.add(arr[start++]);
            } else if (sum == target) {
                break;
            }else{
                sum -= arr[end++];
                answer.remove(0);
            }
        }
        return answer.stream().mapToInt(i->i).toArray();
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 3, 7, 2, 4, 3, 2};
        int target = 10;
        System.out.println(Arrays.toString(twoPointer(arr, target)));
    }
}
