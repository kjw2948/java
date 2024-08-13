package nocode.array;
//leet 162
public class FindPeak {
    public static void main(String[] args) {

    }

    public static int peakElement(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int pivot = (left + right) / 2;
            int nextNum = nums[pivot + 1];

            if (nextNum > nums[pivot]) {
                left = pivot + 1;
            } else {
                right = pivot;
            }
        }
        return left;
    }
}
