package nocode.array;

// leetcode 283
public class MoveZeros {
    public static void main(String[] args) {

    }

    // 0 5 0 1 1 3    --> 5 1 1 3 0 0   5 0 0 1 1 3 
    static int[] moveZero(int[] nums) {
        int zero = 0;
        int non = 0;

        for (int i = 1; i < nums.length-1; i++) {
            int temp = nums[i];
            if (nums[i] != 0) {
                if(nums[zero]!=0){
                    continue;
                }
                nums[i] = nums[zero];
                nums[zero] = temp;
            } else {

            }
        }
    }
}
