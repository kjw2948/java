package algorithm.divideandconcur;

public class Ex1 {
    public static int getMax(int[] arr, int left, int right) {
        int m = (left + right) / 2;
        if (left == right) {
            return arr[left];
        }
        left = getMax(arr, left, m);
        right = getMax(arr, m+1, right);
        return left > right ? left : right;
    }
    public static void main(String[] args) {
        int[] arr = {3, 5, 10, 50, 25, 30, 1, 5};
        System.out.println(getMax(arr, arr[0], arr[arr.length-1]));
    }
}

