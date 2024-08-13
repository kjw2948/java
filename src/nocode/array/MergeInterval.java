package nocode.array;

import java.util.ArrayList;
import java.util.Arrays;

//leet 56
public class MergeInterval {
    public static void main(String[] args) {
        int[][] nums = {{1, 5}, {3, 7}, {10, 15}, {8, 16},{4,11}};
        mergeInterval(nums);
    }

    public static void mergeInterval(int[][] nums) {
        Arrays.sort(nums, (a,b) -> Integer.compare(a[0], b[0]));
        ArrayList<int[]> list = new ArrayList<>();
        int start = nums[0][0];
        int end = nums[0][1];

        for (int i = 1; i < nums.length; i++) {
            if (end < nums[i][0]) {
                list.add(new int[]{start, end});
                start = nums[i][0];
                end = nums[i][1];
            } else {
                end = nums[i][1];
            }
            if (i == nums.length - 1) {
                list.add(new int[]{start, end});
            }
        }
        for (int[] ints : list) {
            System.out.println(Arrays.toString(ints));
        }
    }
}
