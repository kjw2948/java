package nocode.array;

import java.util.Arrays;

//leet 75
public class SortColors {
    static int[] nums;
    public static void main(String[] args) {
        nums = new int[]{1, 0, 2, 2, 0, 1, 2, 1, 0};
        sortColors(nums);
    }

    public static void sortColors(int[] nums) {
        int zero = 0;
        int one = 0;
        int two = nums.length - 1;

        while (one <= two) {
            if (nums[one] == 0) {
                nums[zero] = 0;
                nums[one] = 1;
                one ++;
                zero ++;
            } else if (nums[one] == 2) {
                nums[two] = 2;
                nums[one] = 1;
                two --;
            }else{
                one ++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void swap(int num1, int num2) {

    }
}
