package nocode.array;

import java.util.Arrays;

// leetcode 283
public class MoveZeros {
    public static void main(String[] args) {
        int[] nums = {1, 0, 1, 0, 2, 2};
        nums = moveZero(nums);
        System.out.println(Arrays.toString(nums));
    }
    // 1 0 1 0 2 2
    static int[] moveZero(int[] nums) {
        int wIdx = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[wIdx] = nums[i];
                wIdx++;
            }
        }
        for (int i = wIdx; i < nums.length; i++) {
            nums[i] = 0;
        }
        return nums;
    }
}
