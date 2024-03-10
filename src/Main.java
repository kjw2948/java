import java.util.*;

public class Main {
    public static String solution(int[] arr) {
        String answer = "YES";
        if(arr.length==1){
            return "YES";
        }
        int cur = 1;
        for (int i = 1; i < arr.length/2; i++) {
            int left = 2 * i;
            int right = 2 * i + 1;
            if(arr[i]>arr[left] || arr[i]>arr[right]){
                return "NO";
            }
            if((right+1)==arr.length){
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String sentence = "a";
        String word = "a";
        int[] nums = {0,1,2,4,14,47,48,42};
        int n = 5;
        System.out.println(solution(nums));
    }
}