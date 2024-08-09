package nocode.array;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6, 7, 15, 20, 25, 40, 57, 80};
        System.out.println(search(nums, 80));
    }

    static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;

        while (left <= right) {
            int pivot = (left + right) / 2;
            if (nums[pivot] == target) {
                return pivot;
            }
            if (nums[pivot] < target) {
                left = pivot + 1;
            } else {
                right = pivot - 1;
            }
        }
        return -1;
    }
}
