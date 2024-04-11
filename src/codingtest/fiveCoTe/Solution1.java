package codingtest.fiveCoTe;

import java.util.Arrays;

public class Solution1 {
    public static boolean solution(String s, String t) {
        boolean answer = true;
        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return answer;
    }

    public static void main(String[] args) {

    }
}
