package nocode.array;

//leet code 724  ---> sliding
public class FindPivot {
    public static void main(String[] args) {
        int[] nums = {1, 8, 2, 9, 2, 3, 17};
        System.out.println(pivotIndex(nums));
    }

    public static int pivotIndex(int[] nums) {
        int sum = 0;
        int left = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            sum -= nums[i];
            if (left == sum) {
                return i;
            }
            left += nums[i];
        }
        return -1;
    }
}
