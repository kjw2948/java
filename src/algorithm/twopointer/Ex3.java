package algorithm.twopointer;

import java.util.ArrayList;
import java.util.Arrays;

public class Ex3 {
    public static ArrayList<ArrayList<Integer>>  solution(int[] nums) {
        ArrayList<ArrayList<Integer>> answer = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();
        int p1 = 1;
        int p2 = nums.length-1;
        Arrays.sort(nums); //[-4,-1,-1,0,1,2]
        int sum = nums[0] + nums[p1] + nums[p2];
        for (int i = 0; i < nums.length-2; i++) {
            p1 = i+1;
            p2 = nums.length-1;
            sum = nums[i] + nums[p1] + nums[p2];
            while(p1<p2){
                if(sum<0){
                    sum -= nums[p1++];
                    sum += nums[p1];
                }else if(sum==0){
                    result.add(nums[i]);
                    result.add(nums[p1]);
                    result.add(nums[p2]);
                    answer.add(result);
                    result = new ArrayList<>();
                    break;
                }else{
                    sum -= nums[p2--];
                    sum += nums[p2];
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] nums = {1,-7,6,3,5,2}; // [[-1,0,1],[-1,2,-1]]
        System.out.println(solution(nums));
    }
}
